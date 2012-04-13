//+======================================================================
//
// Project:   Tango
//
// Description:  java source code for the PogoEditor class definition .
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

package org.tango.pogo.pogo_gui.tools;


/**
 *	This class is able tocheck if editor is available and start it.
 *
 * @author verdier
 */

import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.Property;
import fr.esrf.tango.pogo.pogoDsl.State;
import fr.esrf.tangoatk.widget.util.ErrorPane;
import org.tango.pogo.pogo_gui.PogoConst;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class PogoEditor {
    private static PogoEditor instance = null;
    private static String editor = null;
    private static final String[] exeFiles = {
            "nedit-client",
            "nedit-nc",
            "nc",
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
        if (!os.toLowerCase().startsWith("windows")) {
            String path = System.getenv("PATH");
            StringTokenizer stk = new StringTokenizer(path, ":");
            ArrayList<String> lines = new ArrayList<String>();
            while (stk.hasMoreTokens())
                lines.add(stk.nextToken());

            //	Check exe files in order from $PATH
            for (String exeFile : exeFiles)
                if ((editor = getEditorExeFile(exeFile, lines)) != null)
                    break;

            if (editor != null)
                System.out.println("using " + editor + " editor");
            else
                System.out.println("no editor available.");
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
    private String getEditorExeFile(String exeFile, ArrayList<String> lines) {
        for (String line : lines) {
            String filename = line + "/" + exeFile;
            if (new File(filename).exists())
                return filename;
        }
        return null;    //	Not found
    }

    //===============================================================
    //===============================================================
    public boolean isAvailable() {
        return editor != null;
    }
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
            ErrorPane.showErrorMessage(new JFrame(), null, e);
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
    private int getLineNumber(String filename, String classname, int lang, Property prop, boolean is_dev) {
        String signature = null;
        switch (lang) {
            case PogoConst.Cpp:
                signature = "void " + classname;
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
        }
        if (signature == null)
            return -1;
        return getLineNumber(filename, signature);
    }

    //===============================================================
    //===============================================================
    private int getLineNumber(String filename, String classname, int lang, Command cmd) {
        String signature = null;
        switch (lang) {
            case PogoConst.Cpp:
                signature = classname + "::" + cmd.getExecMethod() + "(";
                break;
        }
        if (signature == null)
            return -1;
        return getLineNumber(filename, signature);
    }

    //===============================================================
    //===============================================================
    private int getLineNumber(String filename, String classname, int lang, Attribute attribute) {
        String signature = null;
        switch (lang) {
            case PogoConst.Cpp:
                signature = classname + "::read_" + attribute.getName() + "(Tango::Attribute &attr)";
                break;
        }
        if (signature == null)
            return -1;
        return getLineNumber(filename, signature);
    }

    //===============================================================
    //===============================================================
    private int getLineNumber(String filename, String classname, int lang) {
        String signature = null;
        switch (lang) {
            case PogoConst.Cpp:
                signature = "namespace " + classname + "_ns";
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
     * @throws IOException if read file failed.
     */
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})    //  Used only to know that it is for property
    public void editFile(String[] data, Property prop, boolean is_dev)
            throws IOException {
        if (editor == null) {
            System.err.println("no editor available.");
            return;
        }
        String classname = data[0];
        String path = data[1];
        int lang = Utils.getLanguage(data[2]);
        String filename = null;

        switch (lang) {
            case PogoConst.Cpp:
                if (is_dev)
                    filename = path + "/" + classname + ".cpp";
                else
                    filename = path + "/" + classname + "Class.cpp";
                break;
        }
        if (filename != null) {
            int linenum = getLineNumber(filename, classname, lang, prop, is_dev);
            startEditor(filename, linenum);
        }
    }
    //===============================================================

    /**
     * Edit code for specified attribute
     *
     * @param data      class definition (0-class name, 1-path, 3 language)
     * @param attribute specified attribute
     * @throws IOException if read file failed.
     */
    //===============================================================
    public void editFile(String[] data, Attribute attribute)
            throws IOException {
        if (editor == null) {
            System.err.println("no editor available.");
            return;
        }
        String classname = data[0];
        String path = data[1];
        int lang = Utils.getLanguage(data[2]);
        String filename = null;

        switch (lang) {
            case PogoConst.Cpp:
                filename = path + "/" + classname + ".cpp";
                break;
        }
        if (filename != null) {
            int linenum = getLineNumber(filename, classname, lang, attribute);
            startEditor(filename, linenum);
        }
    }
    //===============================================================

    /**
     * Edit code for specified command
     *
     * @param data class definition (0-class name, 1-path, 3 language)
     * @param cmd  specified command
     * @throws IOException if read file failed.
     */
    //===============================================================
    public void editFile(String[] data, Command cmd)
            throws IOException {
        if (editor == null) {
            System.err.println("no editor available.");
            return;
        }

        String classname = data[0];
        String path = data[1];
        int lang = Utils.getLanguage(data[2]);
        String filename = null;

        switch (lang) {
            case PogoConst.Cpp:
                filename = path + "/" + classname + ".cpp";
                break;
        }
        if (filename != null) {
            int linenum = getLineNumber(filename, classname, lang, cmd);
            startEditor(filename, linenum);
        }
    }
    //===============================================================

    /**
     * Edit code for specified state
     *
     * @param data  class definition (0-class name, 1-path, 3 language)
     * @param state specified state
     * @throws IOException if read file failed.
     */
    //===============================================================
    @SuppressWarnings({"UnusedDeclaration"})    //  Used only to know that it is for state
    public void editFile(String[] data, State state)
            throws IOException {
        if (editor == null) {
            System.err.println("no editor available.");
            return;
        }

        String classname = data[0];
        String path = data[1];
        int lang = Utils.getLanguage(data[2]);
        String filename = null;

        switch (lang) {
            case PogoConst.Cpp:
                filename = path + "/" + classname + "StateMachine.cpp";
                break;
        }
        if (filename != null) {
            int linenum = getLineNumber(filename, classname, lang);
            startEditor(filename, linenum);
        }
    }

    //===============================================================
    //===============================================================
    private void startEditor(String filename, int linenum) throws IOException {
        if (linenum >= 0) {
            String shell_cmd = editor + " -noask -line " + linenum + " " + filename;
            Utils.executeShellCmdAndReturn(shell_cmd);
        }
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
             PogoEditor	editor = PogoEditor.getInstance();
             if (editor.isAvailable())
                 editor.editFile(dir, "Holec", PogoConst.SCALAR_ATTRIBUTE, "Current");
         }
         catch(Exception e)
         {
             System.err.println(e);
         }
     }
     */
}
