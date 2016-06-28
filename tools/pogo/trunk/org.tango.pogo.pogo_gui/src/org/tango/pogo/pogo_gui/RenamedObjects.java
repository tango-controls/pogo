//+======================================================================
//
// Project:   Tango
//
// Description:	java source code to manage renamed objects.
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
 *	This class is able to manage a vector of renamed objects
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


public class RenamedObjects {
    //===============================================================
    //===============================================================
    private class OneRenamed {
        Object old_;
        Object new_;
        String code = null;
        String writeCode = null;

        OneRenamed(Object old_, Object new_) {
            this.old_ = old_;
            this.new_ = new_;
        }

        //===========================================================
        public String toString() {
            if (old_ instanceof Command)
                return ((Command) old_).getName() + " --> " +
                        ((Command) new_).getName();
            else if (old_ instanceof Attribute)
                return ((Attribute) old_).getName() + " --> " +
                        ((Attribute) new_).getName();
            else
                return old_.toString();
        }
    }

    private List<OneRenamed>   renamedList = new ArrayList<>();
    //===============================================================
    //===============================================================
    public RenamedObjects() {
    }

    //===============================================================
    //===============================================================
    public void add(Object old_, Object new_) {
        //	Check if already exists (old name is a new name of already renamed)
        for (OneRenamed renamed : renamedList) {
            if (new_ instanceof Command && renamed.new_ instanceof Command) {
                Command cmd1 = (Command) old_;
                Command cmd2 = (Command) renamed.new_;
                if (cmd1.getName().equals(cmd2.getName())) {
                    //	Found -> replace
                    renamed.new_ = new_;
                    return;
                }
            } else if (new_ instanceof Attribute && renamed.new_ instanceof Attribute) {
                Attribute att1 = (Attribute) old_;
                Attribute att2 = (Attribute) renamed.new_;
                if (att1.getName().equals(att2.getName())) {
                    //	Found -> replace
                    renamed.new_ = new_;
                    return;
                }
            } else if (new_ instanceof Pipe && renamed.new_ instanceof Pipe) {
                Pipe pipe1 = (Pipe) old_;
                Pipe pipe2 = (Pipe) renamed.new_;
                if (pipe1.getName().equals(pipe2.getName())) {
                    //	Found -> replace
                    renamed.new_ = new_;
                    return;
                }
            }
        }
        //	Not found --> Add new object
        renamedList.add(new OneRenamed(old_, new_));
    }
    //===============================================================
    /**
     * parse code for all renamed objects
     * @param className  specified class.
     * @param filename  file to read code.
     * @throws PogoException in case of read file fails.
    */
    //===============================================================
    void readCode(String className, String filename) throws PogoException {
        int lang = PogoConst.Cpp;
        String separator = "::";
        if (filename.endsWith(".py")) {
            lang = PogoConst.Python;
            separator = ".";
        }
        else
        if (filename.endsWith(".java")) {
            lang = PogoConst.Java;
            separator = ".";
        }

        try {
            PogoParser parser = new PogoParser(filename);
            for (OneRenamed renamed : renamedList) {
                String key = className + separator;
                if (renamed.old_ instanceof Command) {
                    Command cmd = (Command) renamed.old_;
                    switch (lang) {
                        case PogoConst.Cpp:
                            renamed.code = parser.getProtectedCode(key + cmd.getExecMethod());
                            break;
                        case PogoConst.Python:
                            renamed.code = parser.getProtectedCode(key + cmd.getName());
                            break;
                        case PogoConst.Java:
                            //  First char is lower case
                            String str = cmd.getName().substring(0,1).toLowerCase() +
                                    cmd.getName().substring(1);
                            renamed.code = parser.getProtectedCode(key + str);
                            break;
                    }
                } else
                if (renamed.old_ instanceof Attribute) {
                    Attribute att = (Attribute) renamed.old_;
                    switch (lang) {
                        case PogoConst.Cpp:
                            renamed.code = parser.getProtectedCode(key + "read_" + att.getName());
                            renamed.writeCode = parser.getProtectedCode(key + "write_" + att.getName());
                            break;
                        case PogoConst.Python:
                            renamed.code = parser.getProtectedCode(key + att.getName() + "_read");
                            renamed.writeCode = parser.getProtectedCode(key + att.getName() + "_write");
                            break;
                        case PogoConst.Java:
                            renamed.code = parser.getProtectedCode(key + "get" + att.getName());
                            renamed.writeCode = parser.getProtectedCode(key + "set" + att.getName());
                            break;
                    }
                } else
                if (renamed.old_ instanceof Pipe) {
                    Pipe pipe = (Pipe) renamed.old_;
                    switch (lang) {
                        case PogoConst.Cpp:
                            renamed.code = parser.getProtectedCode(key + "read_" + pipe.getName());
                            renamed.writeCode = parser.getProtectedCode(key + "write_" + pipe.getName());
                            break;
                        case PogoConst.Python:
                            renamed.code = parser.getProtectedCode(key + pipe.getName() + "_read");
                            renamed.writeCode = parser.getProtectedCode(key + pipe.getName() + "_write");
                            break;
                        case PogoConst.Java:
                            renamed.code = parser.getProtectedCode(key + "get" + pipe.getName());
                            renamed.writeCode = parser.getProtectedCode(key + "set" + pipe.getName());
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
     * Insert parsed code for all renamed objects
     * @param className specified class
     * @param filename specified file
     * @throws PogoException in case of write file fails
     */
    //===============================================================
    void insertCode(String className, String filename) throws PogoException {
        int lang = PogoConst.Cpp;
        String separator = "::";
        if (filename.endsWith(".py")) {
            lang = PogoConst.Python;
            separator = ".";
        }
        else
        if (filename.endsWith(".java")) {
            lang = PogoConst.Java;
            separator = ".";
        }

        PogoParser parser = new PogoParser(filename);
        boolean modified = false;
        for (OneRenamed renamed : renamedList) {

            //	Check if there is something to insert
            if (renamed.code != null &&
                    renamed.code.trim().length() > 0) {
                if (renamed.new_ instanceof Command) {
                    Command cmd = (Command) renamed.new_;
                    switch (lang) {
                        case PogoConst.Cpp:
                            parser.replaceInProtectedZone(className,
                                    cmd.getExecMethod(), renamed.code, separator);
                            break;
                        case PogoConst.Python:
                            parser.replaceInProtectedZone(className,
                                    cmd.getName(), renamed.code, separator);
                            break;
                        case PogoConst.Java:
                            //  First char is lower case
                            String str = cmd.getName().substring(0,1).toLowerCase() +
                                        cmd.getName().substring(1);
                            parser.replaceInProtectedZone(className,
                                    str, renamed.code, separator);
                            break;
                    }
                } else if (renamed.new_ instanceof Attribute) {
                    Attribute att = (Attribute) renamed.new_;
                    switch (lang) {
                        case PogoConst.Cpp:
                            parser.replaceInProtectedZone(className,
                                "read_" + att.getName(), renamed.code, separator);
                            if (renamed.writeCode!=null)
                                parser.replaceInProtectedZone(className,
                                    "write_" + att.getName(), renamed.writeCode, separator);
                            break;
                        case PogoConst.Python:
                            parser.replaceInProtectedZone(className,
                                att.getName() + "_read", renamed.code, separator);
                            if (renamed.writeCode!=null)
                                parser.replaceInProtectedZone(className,
                                        att.getName() + "_write", renamed.writeCode, separator);
                            break;
                        case PogoConst.Java:
                            parser.replaceInProtectedZone(className,
                                "get" + att.getName(), renamed.code, separator);
                            if (renamed.writeCode!=null)
                                parser.replaceInProtectedZone(className,
                                        "set" + att.getName(), renamed.writeCode, separator);
                            break;
                    }
                } else if (renamed.new_ instanceof Pipe) {
                    Pipe pipe = (Pipe) renamed.new_;
                    switch (lang) {
                        case PogoConst.Cpp:
                            parser.replaceInProtectedZone(className,
                                "read_" + pipe.getName(), renamed.code, separator);
                            if (renamed.writeCode!=null)
                                parser.replaceInProtectedZone(className,
                                    "write_" + pipe.getName(), renamed.writeCode, separator);
                            break;
                        case PogoConst.Python:
                            parser.replaceInProtectedZone(className,
                                pipe.getName() + "_read", renamed.code, separator);
                            if (renamed.writeCode!=null)
                                parser.replaceInProtectedZone(className,
                                        pipe.getName() + "_write", renamed.writeCode, separator);
                            break;
                        case PogoConst.Java:
                            parser.replaceInProtectedZone(className,
                                "get" + pipe.getName(), renamed.code, separator);
                            if (renamed.writeCode!=null)
                                parser.replaceInProtectedZone(className,
                                        "set" + pipe.getName(), renamed.writeCode, separator);
                            break;
                    }
                }
                modified = true;
            }
        }
        if (modified)
            parser.write();
        renamedList.clear();
    }
    //===============================================================
    //===============================================================
    public int size() {
        return renamedList.size();
    }
    //===============================================================
    //===============================================================
    public void clear() {
        renamedList.clear();
    }
    //===============================================================
    //===============================================================
}
