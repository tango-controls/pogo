//+======================================================================
//
// Project:   Tango
//
// Description:  java source code for the PogoEditor class definition .
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

package org.tango.pogo.pogo_gui.tools;


/**
 *	This class is able to check if shellEditor is available and start it.
 *
 * @author verdier
 */

import fr.esrf.tango.pogo.pogoDsl.*;
import org.tango.pogo.pogo_gui.PogoConst;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;


public class PogoEditor {
    private static PogoEditor instance = null;
    private static String shellEditor = null;
    private static final String[] exeFiles = {
            "nedit-client",
            "nedit-nc",
        };

    //===============================================================
    //===============================================================
    public static PogoEditor getInstance() {
        if (instance == null)
            instance = new PogoEditor();
        return instance;
    }

    //===============================================================
    //===============================================================
    private PogoEditor() {
        //	Check only under Ux like
        String os = System.getProperty("os.name");
        System.out.println("Running under " + os);
        if (os.toLowerCase().startsWith("shellEditor")) {
            shellEditor = null;
        }
        else {
            shellEditor = System.getenv("EDITOR");
            if (shellEditor !=null) {
                if (shellEditor.startsWith("nedit")) {
                    //  Try to find nedit client executable
                    String path = System.getenv("PATH");
                    StringTokenizer stk = new StringTokenizer(path, ":");
                    List<String> lines = new ArrayList<>();
                    while (stk.hasMoreTokens())
                        lines.add(stk.nextToken());

                    //	Check exe files in order from $PATH
                    for (String exeFile : exeFiles)
                        if ((shellEditor = getEditorExeFile(exeFile, lines)) != null)
                            break;
                    if (shellEditor != null)
                        System.out.println("using " + shellEditor + " editor");
                    else
                        System.out.println("no shellEditor available.");

                }
                else
                if (shellEditor.equals("gedit") || shellEditor.equals("geany") ) {
                    System.out.println("using " + shellEditor + " editor");
                }
                else
                    shellEditor = null;
            }
            if (shellEditor==null)
                System.out.println("will Launch default desktop editor....");
        }
    }
    //===============================================================
    /**
     * Search if exe file to edit exeit in path (lines)
     *
     * @param exeFile executable file to edit
     * @param lines   list of path from $PATH
     * @return the executable file (with path) to edit found if any (null otherwise)
     */
    //===============================================================
    private String getEditorExeFile(String exeFile, List<String> lines) {
        for (String line : lines) {
            String filename = line + "/" + exeFile;
            if (new File(filename).exists())
                return filename;
        }
        return null;    //	Not found
    }
    //===============================================================
    //===============================================================
    /*
    public boolean isAvailable() {
        return shellEditor != null;
    }
    */
    //===============================================================
    /**
     * Returns the line number where signature has been found
     *
     * @param filename  file name to search
     * @param signature specified signature to be found
     * @return the line number where signature has been found
     */
    //===============================================================
    private int getLineNumber(String filename, String signature) {
        String code = "";
        try {
            code = ParserTool.readFile(filename);
        } catch (Exception e) {
            PogoException.popup(new JFrame(), e);
        }

        int start = 0;
        int end;
        int idx;
        for (idx = 0; (end = code.indexOf('\n', start)) > 0; idx++) {
            String line = code.substring(start, end);
            if (line.contains(signature))
                return idx + 1;
            start = end + 1;
        }
        System.out.println(signature + " not found !");
        return -1; //   NOT Found
    }

    //===============================================================
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})    //  Used only to know that it is for property
    private int getLineNumber(String filename, String className, int lang, Property prop, boolean is_dev) {
        String signature = null;
        switch (lang) {
            case PogoConst.Cpp:
                signature = "void " + className;
                if (!is_dev)
                    signature += "Class";
                signature += "::get_";
                if (is_dev)
                    signature += "device";
                else
                    signature += "class";
                signature += "_property(";
                //signature = prop.getName();
                break;
            case PogoConst.Java:
                signature = "@" + ((is_dev)? "Device" : "Class") +
                        "Property(name=\"" + prop.getName() + "\"";
                break;
            case PogoConst.Python:
                signature = "\'" + prop.getName() + "\':";
                break;
        }
        if (signature == null)
            return -1;
        return getLineNumber(filename, signature);
    }

    //===============================================================
    //===============================================================
    private int getLineNumber(String filename, String className, int lang, Command cmd) {
        String signature = null;
        switch (lang) {
            case PogoConst.Cpp:
                signature = className + "::" + cmd.getExecMethod() + "(";
                break;
            case PogoConst.Java:
                signature = "* Execute command \"" + cmd.getName() + "\"";
                break;
            case PogoConst.Python:
                signature = "def " + cmd.getName() + "(self):" ;
                break;
       }
        if (signature == null)
            return -1;
        return getLineNumber(filename, signature);
    }

    //===============================================================
    //===============================================================
    private int getLineNumber(String filename, String className, int lang, Attribute attribute) {
        String signature = null;
        switch (lang) {
            case PogoConst.Cpp:
                signature = className + "::read_" + attribute.getName() + "(Tango::Attribute &attr)";
                break;
            case PogoConst.Java:
                if (Utils.isTrue(attribute.getIsDynamic()))
                    signature = "public AttributeValue getValue() throws DevFailed {";
                else
                    signature = "@Attribute(name=\"" + attribute.getName() + "\"" ;
                break;
            case PogoConst.Python:
                signature = "def read_" + attribute.getName() + "(self, attr):" ;
                break;
        }
        if (signature == null)
            return -1;
        return getLineNumber(filename, signature);
    }

    //===============================================================
    //===============================================================
    private int getLineNumber(String filename, String className, int lang, Pipe pipe) {
        String signature = null;
        switch (lang) {
            case PogoConst.Cpp:
                signature = className + "::read_" + pipe.getName() + "(Tango::Pipe &pipe)";
                break;
            case PogoConst.Java:
                signature = "@Pipe(name=\"" + pipe.getName() + "\"" ;
                break;
            case PogoConst.Python:
                signature = "def read_" + pipe.getName() + "(self, pipe):" ;
                break;
        }
        if (signature == null)
            return -1;
        return getLineNumber(filename, signature);
    }

    //===============================================================
    //===============================================================
    private int getLineNumber(String filename, String className, int lang) {
        String signature = null;
        switch (lang) {
            case PogoConst.Cpp:
                signature = "namespace " + className + "_ns";
                break;
            case PogoConst.Java:
                signature = "public class " + className + " {";
                break;
            case PogoConst.Python:
                signature = "class " + className + " {";
                break;
        }
        if (signature == null)
            return -1;
        return getLineNumber(filename, signature);
    }
    //===============================================================
    /**
     * Edit code for specified property
     *
     * @param data   class definition (0-class name, 1-path, 3 language)
     * @param prop   specified property
     * @param is_dev is a device property if true, otherwise is a class property
     * @throws PogoException if read file failed.
     */
    //===============================================================
    public void editFile(String[] data, Property prop, boolean is_dev) throws PogoException {
        String className = data[0];
        String path = data[1];
        int lang = Utils.getLanguage(data[2]);
        String filename = null;

        switch (lang) {
            case PogoConst.Cpp:
                if (is_dev)
                    filename = path + "/" + className + ".cpp";
                else
                    filename = path + "/" + className + "Class.cpp";
                break;
            case PogoConst.Java:
                filename = path + "/org/tango/" +
                        className.toLowerCase() + "/" + className + ".java";
                break;
            case PogoConst.Python:
                filename = path + "/" + className + ".py";
                break;
        }
        if (filename != null) {
            int linenum = getLineNumber(filename, className, lang, prop, is_dev);
            startEditor(filename, linenum);
        }
    }
    //===============================================================
    /**
     * Edit code for specified attribute
     *
     * @param data      class definition (0-class name, 1-path, 3 language)
     * @param attribute specified attribute
     * @throws PogoException if read file failed.
     */
    //===============================================================
    public void editFile(String[] data, Attribute attribute) throws PogoException {
        String className = data[0];
        String path = data[1];
        int lang = Utils.getLanguage(data[2]);
        String filename = null;

        switch (lang) {
            case PogoConst.Cpp:
                filename = path + "/" + className + ".cpp";
                break;
            case PogoConst.Java:
                filename = path + "/org/tango/" + className.toLowerCase() + "/";
                if (Utils.isTrue(attribute.getIsDynamic()))
                    filename += attribute.getName();
                else
                    filename += className;
                filename += ".java";
                break;
            case PogoConst.Python:
                filename = path + "/" + className + ".py";
                break;
        }
        if (filename != null) {
            int lineNumber = getLineNumber(filename, className, lang, attribute);
            startEditor(filename, lineNumber);
        }
    }
    //===============================================================
    /**
     * Edit code for specified attribute
     *
     * @param data      class definition (0-class name, 1-path, 3 language)
     * @param pipe specified attribute
     * @throws PogoException if read file failed.
     */
    //===============================================================
    public void editFile(String[] data, Pipe pipe) throws PogoException {
        String className = data[0];
        String path = data[1];
        int lang = Utils.getLanguage(data[2]);
        String filename = null;

        switch (lang) {
            case PogoConst.Cpp:
                filename = path + "/" + className + ".cpp";
                break;
            case PogoConst.Java:
                filename = path + "/org/tango/" + className.toLowerCase() + "/" + className;
                filename += ".java";
                break;
            case PogoConst.Python:
                filename = path + "/" + className + ".py";
                break;
        }
        if (filename != null) {
            int lineNumber = getLineNumber(filename, className, lang, pipe);
            startEditor(filename, lineNumber);
        }
    }
    //===============================================================
    /**
     * Edit code for specified command
     *
     * @param data class definition (0-class name, 1-path, 3 language)
     * @param cmd  specified command
     * @throws PogoException if read file failed.
     */
    //===============================================================
    public void editFile(String[] data, Command cmd)  throws PogoException {
        String className = data[0];
        String path = data[1];
        int lang = Utils.getLanguage(data[2]);
        String filename = null;

        switch (lang) {
            case PogoConst.Cpp:
                filename = path + "/" + className + ".cpp";
                break;
            case PogoConst.Java:
                filename = path + "/org/tango/" + className.toLowerCase() + "/" +
                        className + ".java";
                break;
            case PogoConst.Python:
                filename = path + "/" + className + ".py";
                break;
        }
        if (filename != null) {
            int linenum = getLineNumber(filename, className, lang, cmd);
            startEditor(filename, linenum);
        }
    }
    //===============================================================
    /**
     * Edit code for specified state
     *
     * @param data  class definition (0-class name, 1-path, 3 language)
     * @param state specified state
     * @throws PogoException if read file failed.
     */
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})    //  Used only to know that it is for state
    public void editFile(String[] data, State state)  throws PogoException {
        String className = data[0];
        String path = data[1];
        int lang = Utils.getLanguage(data[2]);
        String filename = null;

        switch (lang) {
            case PogoConst.Cpp:
                filename = path + "/" + className + "StateMachine.cpp";
                break;
            case PogoConst.Java:
                filename = path + "/org/tango/" + className.toLowerCase() + "/" +
                            className + ".java";
                break;
            case PogoConst.Python:
                filename = path + "/" + className + ".py";
                break;
        }
        if (filename != null) {
            int linenum = getLineNumber(filename, className, lang);
            startEditor(filename, linenum);
        }
    }

    //===============================================================
    //===============================================================
    private void startEditor(String filename, int lineNumber) throws PogoException {

        if (shellEditor == null) {
            launchDesktopEditor(filename);
        }
        else
        if (lineNumber >= 0) {
            String shell_cmd;
            if (shellEditor.startsWith("nedit"))
                shell_cmd = shellEditor + " -noask -line " + lineNumber + " " + filename;
            else
                shell_cmd = shellEditor + " +" + lineNumber + " " + filename;
            try {
                Utils.executeShellCmdAndReturn(shell_cmd);
            }
            catch (IOException e) {
                throw new PogoException(e.toString());
            }
        }
    }
    //===============================================================
    //===============================================================


    //===============================================================
    //===============================================================
    private void launchDesktopEditor(String fileName) throws PogoException {
        // Verify if class Desktop is supported :
        if (Desktop.isDesktopSupported()) {
            // get desktop instance
            Desktop desktop = Desktop.getDesktop();
            // Verify if browse feature is supported
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                try {
                    // launch associated application
                    desktop.open(new File(fileName));
                } catch (Exception e) {
                    PogoException.popup(new JFrame(), e);
                }
            }
            else
                throw new PogoException("Desktop.Action.EDIT not supported");
        }
        else
            throw new PogoException("Desktop  not supported");
    }
    //===============================================================
    //===============================================================


    /*
     //===============================================================
     //===============================================================
     public static void main (String[] args)
     {
         String	dir = "/segfs/tango/tools/pogo/test/cpp/test_oaw-1/Holec";
         try
         {
             PogoEditor	shellEditor = PogoEditor.getInstance();
             if (shellEditor.isAvailable())
                 shellEditor.editFile(dir, "Holec", PogoConst.SCALAR_ATTRIBUTES, "Current");
         }
         catch(Exception e)
         {
             System.err.println(e);
         }
     }
     */
}
