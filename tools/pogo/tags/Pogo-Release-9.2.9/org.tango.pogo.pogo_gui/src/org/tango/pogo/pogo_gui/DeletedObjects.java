//+======================================================================
//
// Project:   Tango
//
// Description:	java source code to manage deleted object.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013,2014
//						European Synchrotron Radiation Facility
//                      BP 220, Grenoble 38043
//                      FRANCE
//
// This file is part of Tango.
//
// Tango is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// Tango is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
// $Revision: $
// $Date:  $
//
// $HeadURL: $
//
//-======================================================================

package org.tango.pogo.pogo_gui;


/**
 *	This class is able to manage a vector of deleted objects
 *
 * @author verdier
 */

import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.Pipe;
import org.tango.pogo.pogo_gui.tools.PogoException;
import org.tango.pogo.pogo_gui.tools.PogoParser;

import java.util.ArrayList;
import java.util.List;


public class DeletedObjects  {

    //===============================================================
    //===============================================================
    private class OneDeleted {
        private Object old_;
        private String code = null;
        private String writeCode = null;

        private OneDeleted(Object old_) {
            this.old_ = old_;
        }

        //===========================================================
        public String toString() {
            if (old_ instanceof Command)
                return ((Command) old_).getName();
            else if (old_ instanceof Attribute)
                return ((Attribute) old_).getName();
            else
                return old_.toString();
        }
    }
    private List<OneDeleted>  deletedList = new ArrayList<>();
    //===============================================================
    //===============================================================
    public DeletedObjects() {
    }

    //===============================================================
    //===============================================================
    public boolean add(Object old_) {
        return deletedList.add(new OneDeleted(old_));
    }
    //===============================================================
    /**
     * parse code for all deleted objects
     * @param filename  file to read code.
     * @throws PogoException in case of read file fails.
     */
    //===============================================================
    void readCode(String filename) throws PogoException {
        int lang = PogoConst.Cpp;
        if (filename.endsWith(".py")) {
            lang = PogoConst.Python;
        }
        else
        if (filename.endsWith(".java")) {
            lang = PogoConst.Java;
        }
        try {
            PogoParser parser = new PogoParser(filename);
            for (OneDeleted renamed : deletedList) {
                if (renamed.old_ instanceof Command) {
                    Command cmd = (Command) renamed.old_;
                    switch (lang) {
                        case PogoConst.Cpp:
                            String comment = "Command " + cmd.getName() + " related ";
                            renamed.code = parser.getDeletedObjectsCode(comment);
                            break;
                        case PogoConst.Java:
                            comment = "Execute command \"" + cmd.getName();
                            renamed.code = parser.getDeletedObjectsCode(comment);
                            break;
                        default:
                        //case PogoConst.Python:
                            //  Do nothing (Cannot parse the end of method.
                            break;
                    }
                } else if (renamed.old_ instanceof Attribute) {
                    Attribute att = (Attribute) renamed.old_;
                        switch (lang) {
                            case PogoConst.Cpp:
                                String comment = "Read attribute " + att.getName() + " related ";
                                renamed.code = parser.getDeletedObjectsCode(comment);
                                comment = "Write attribute " + att.getName() + " related ";
                                renamed.writeCode = parser.getDeletedObjectsCode(comment);
                                break;
                            case PogoConst.Java:
                                 comment = "Read attribute " + att.getName();
                                renamed.code = parser.getDeletedObjectsCode(comment);
                                comment = "Write attribute " + att.getName();
                                renamed.writeCode = parser.getDeletedObjectsCode(comment);
                                break;
                            default:
                            //case PogoConst.Python:
                                //  Do nothing (Cannot parse the end of method.
                                break;
                        }
                } else if (renamed.old_ instanceof Pipe) {
                    Pipe pipe = (Pipe) renamed.old_;
                        switch (lang) {
                            case PogoConst.Cpp:
                                String comment = "Read pipe " + pipe.getName() + " related ";
                                renamed.code = parser.getDeletedObjectsCode(comment);
                                comment = "Write pipe " + pipe.getName() + " related ";
                                renamed.writeCode = parser.getDeletedObjectsCode(comment);
                                break;
                            case PogoConst.Java:
                                 comment = "Read pipe " + pipe.getName();
                                renamed.code = parser.getDeletedObjectsCode(comment);
                                comment = "Write pipe " + pipe.getName();
                                renamed.writeCode = parser.getDeletedObjectsCode(comment);
                                break;
                            default:
                            //case PogoConst.Python:
                                //  Do nothing (Cannot parse the end of method.
                                break;
                        }
                }
            }
        } catch (PogoException e) {
            if (!e.toString().contains("FileNotFoundException"))
                throw e;
        }
    }
    //===============================================================
    /**
     * Insert parsed code for all deleted objects
     * @param filename specified file
     * @throws PogoException in case of write file fails
     */
    //===============================================================
    void insertCode(String filename) throws PogoException {
        StringBuilder sb = new StringBuilder();
        for (OneDeleted deleted : deletedList) {
            //	Check if there is something to insert
            if (deleted.code != null &&
                    deleted.code.trim().length() > 0)
                sb.append(deleted.code).append("\n");
            if (deleted.writeCode != null &&
                    deleted.writeCode.trim().length() > 0)
                sb.append(deleted.writeCode).append("\n");
        }
        if (sb.length() > 0) {
            PogoParser parser = new PogoParser(filename);
            parser.insertDeletedObjectsCode(sb.toString());
            parser.write();
        }
        deletedList.clear();
    }
    //===============================================================
    //===============================================================
    public int size() {
        return deletedList.size();
    }
    //===============================================================
    //===============================================================
    public void clear() {
        deletedList.clear();
    }
    //===============================================================
    //===============================================================
}
