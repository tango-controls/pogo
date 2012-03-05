//+======================================================================
//
// Project:   Tango
//
// Description:	java source code to manage deleted object.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011
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

import fr.esrf.Tango.DevFailed;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Command;
import org.tango.pogo.pogo_gui.tools.PogoParser;

import java.util.ArrayList;


public class DeletedObjects extends ArrayList<Object> {

    //===============================================================
    //===============================================================
    private class OneDeleted {
        private Object old_;
        private String code = null;

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

    //===============================================================
    //===============================================================
    public DeletedObjects() {
    }

    //===============================================================
    //===============================================================
    public boolean add(Object old_) {
        return super.add(new OneDeleted(old_));
    }
    //===============================================================
    /**
     * parse code for all deleted objects
     * @param filename  file to read code.
     * @throws DevFailed in case of read file fails.
     */
    //===============================================================
    void readCode(String filename) throws DevFailed {
        try {
            PogoParser parser = new PogoParser(filename);
            for (Object obj : this) {
                OneDeleted renamed = (OneDeleted) obj;
                if (renamed.old_ instanceof Command) {
                    Command cmd = (Command) renamed.old_;
                    String comment = "Execute the " + cmd.getName() + " command";
                    renamed.code = parser.getDeletedObjectsCode(comment);
                } else if (renamed.old_ instanceof Attribute) {
                    Attribute att = (Attribute) renamed.old_;
                    String comment = "Read " + att.getName() + " attribute";
                    renamed.code = parser.getDeletedObjectsCode(comment);
                }
            }
        } catch (DevFailed e) {
            if (!e.errors[0].desc.contains("FileNotFoundException"))
                throw e;
        }
    }
    //===============================================================
    /**
     * Insert parsed code for all deleted objects
     * @param filename specified file
     * @throws DevFailed in case of write file fails
     */
    //===============================================================
    void insertCode(String filename) throws DevFailed {
        StringBuilder sb = new StringBuilder();
        for (Object obj : this) {
            OneDeleted renamed = (OneDeleted) obj;

            //	Check if there is something to insert
            if (renamed.code != null &&
                    renamed.code.trim().length() > 0)
                sb.append(renamed.code).append("\n");
        }
        if (sb.length() > 0) {
            PogoParser parser = new PogoParser(filename);
            parser.insertDeletedObjectsCode(sb.toString());
            parser.write();
        }
        clear();
    }
    //===============================================================
    //===============================================================
}
