//+======================================================================
//
// Project:   Tango
//
// Description: java code for parsing utilities.
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


import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class ParserTool {
    //===============================================================

    /**
     * Open a file and return text read.
     *
     * @param filename file to be read.
     * @return the file content read.
     * @throws fr.esrf.Tango.DevFailed in case of failure during read file.
     */
    //===============================================================
    public static String readFile(String filename) throws DevFailed {
        String str = "";
        try {
            FileInputStream fid = new FileInputStream(filename);
            int nb = fid.available();
            byte[] inStr = new byte[nb];
            nb = fid.read(inStr);
            fid.close();

            if (nb > 0)
                str = takeOffWindowsChar(inStr);
        } catch (Exception e) {
            Except.throw_exception("READ_FAILED",
                    e.toString(), "ParserTool.readFile()");
        }
        return str;
    }
    //===============================================================

    /**
     * Take off Cr eventually added by Windows editor.
     *
     * @param b_in specified byte array to be modified.
     * @return the modified byte array as String.
     */
    //===============================================================
    private static String takeOffWindowsChar(byte[] b_in) {
        //	Take off Cr (0x0d) eventually added by Windows editor
        int nb = 0;
        for (byte b : b_in)
            if (b != 13)
                nb++;
        byte[] b_out = new byte[nb];
        for (int i = 0, j = 0; i < b_in.length; i++)
            if (b_in[i] != 13)
                b_out[j++] = b_in[i];
        return new String(b_out);
    }

    //===============================================================
    //===============================================================
    private static String checkOsFormat(String code) {
        if (!Utils.osIsUnix())
            return setWindowsFileFormat(code);
        else
            return code;
    }

    //===============================================================
    //===============================================================
    public static String setWindowsFileFormat(String code) {
        //	Convert default Unix format to Windows format
        byte[] b = {0xd, 0xa};
        String lsp = new String(b); //System.getProperty("line.separator");
        code = code.replaceAll("\n", lsp);
        return code;
    }

    //===============================================================
    //===============================================================
    public static void writeFile(String filename, String code) throws DevFailed {
        try {
            code = checkOsFormat(code);
            FileOutputStream fidout = new FileOutputStream(filename);
            fidout.write(code.getBytes());
            fidout.close();
        } catch (Exception e) {
            Except.throw_exception("WRITE_FAILED",
                    e.toString(), "ParserTool.readFile()");
        }
    }

    //===============================================================
    //===============================================================
    public static void modifyProtectedAreaID(String path, String fileName, String oldID, String newID)
            throws DevFailed {
        oldID = "PROTECTED REGION ID(" + oldID + ") ENABLED START";
        newID = "PROTECTED REGION ID(" + newID + ") ENABLED START";

        //  Read file
        String code;
        try {
            code = readFile(path + '/' + fileName);
        } catch (DevFailed e) {
            //  If failed -> do nothing
            return;
        }
        //  Check if old ID exists
        int start = code.indexOf(oldID);
        if (start < 0)
            return; //  Do nothing
        int end = start + oldID.length();

        //  Else replace
        String newCode = code.substring(0, start) + newID + code.substring(end);

        //  And Re Write file
        writeFile(path + '/' + fileName, newCode);
    }
    //===============================================================

    /**
     * Convert html file to java String
     *
     * @param filename HTML specified file name
     * @throws fr.esrf.Tango.DevFailed in case of failure during write file.
     */
    //===============================================================
    public static void convertHTML(String filename) throws DevFailed {
        try {
            String code = readFile(filename);
            StringBuffer sb = new StringBuffer();
            int start = 0;
            int end;

            //	Add '\\' before each '\"'
            while ((end = code.indexOf("\"", start + 1)) > 0) {
                sb.append(code.substring(start, end)).append("\\");
                start = end;
            }
            sb.append(code.substring(start));
            code = sb.toString();

            //	Replace each '\n' by "\\n\" + \n\""
            sb = new StringBuffer("\"");
            start = 0;
            while ((end = code.indexOf("\n", start)) > 0) {
                sb.append(code.substring(start, end)).append("\\n\" + \n\"");
                start = end + 1;
            }
            sb.append(code.substring(start)).append("\\n\"");
            code = sb.toString();
            System.out.println(code);
        } catch (Exception e) {
            Except.throw_exception("READ_FAILED",
                    e.toString(), "ParserTool.readFile()");
        }
    }

    //===============================================================
    //===============================================================
    public static void displaySyntax() {
        System.out.println("ParserTool <option> <filename>");
        System.out.println("    option: -html  convert html file to java String");
        System.exit(0);
    }


    //===============================================================
    /*
     *  XMI Compatibility tools (When a key is removed or renamed).
     */
    //===============================================================
    //===============================================================

    /**
     * Remove key in xmi file for compatibility.
     *
     * @param key      the key name to be removed
     * @param fileName the xmi file where key must be removed
     * @throws DevFailed if read x,i failed
     */
    //===============================================================
    public static void removeXmiKey(String key, String fileName) throws DevFailed {
        //  Rea=d file and split lines
        boolean modified = false;
        key = " " + key + "=\"";
        String code = readFile(fileName);
        StringTokenizer stk = new StringTokenizer(code, "\n");
        ArrayList<String> v = new ArrayList<String>();
        while (stk.hasMoreTokens()) {
            //  For each line
            String line = stk.nextToken();
            int start;
            //  Check if key exists
            if ((start = line.indexOf(key)) > 0) {
                int end = line.indexOf("\"", start + key.length());
                if (end < 0) {
                    System.err.println("XMI syntax error !!!");
                    return;
                }
                //  Remove it
                line = line.substring(0, start) + line.substring(end + 1);
                modified = true;
            }
            v.add(line);
        }

        //  Reconstruct code and save it if modified
        if (modified) {
            StringBuilder sb = new StringBuilder();
            for (String s : v)
                sb.append(s).append("\n");
            code = sb.toString();
            //  Remove last '\n'
            code = code.substring(0, code.length() - 1);
            writeFile(fileName, code);
        }
    }
    //===============================================================
    /**
     * Rename key in xmi file for compatibility.
     *
     * @param srcKey   the old key name to be renamed
     * @param newKey   the new key name
     * @param fileName the xmi file where key must be removed
     * @throws DevFailed if read x,i failed
     */
    //===============================================================
    @SuppressWarnings("UnusedDeclaration")
    public static void renameXmiKey(String srcKey, String newKey, String fileName) throws DevFailed {
        //  Rea=d file and split lines
        boolean modified = false;
        srcKey = " " + srcKey + "=";
        String code = readFile(fileName);
        StringTokenizer stk = new StringTokenizer(code, "\n");
        ArrayList<String> v = new ArrayList<String>();
        while (stk.hasMoreTokens()) {
            //  For each line
            String line = stk.nextToken();
            int start;
            //  Check if key exists
            if ((start = line.indexOf(srcKey)) > 0) {
                int end = start + srcKey.length();
                if (end < 0) {
                    System.err.println("XMI syntax error !!!");
                    return;
                }
                //  Rename it
                start++; // For space char at beginning
                end--;
                line = line.substring(0, start) + newKey + line.substring(end);
                modified = true;
            }
            v.add(line);
        }

        //  Reconstruct code and save it if modified
        if (modified) {
            StringBuilder sb = new StringBuilder();
            for (String s : v)
                sb.append(s).append("\n");
            code = sb.toString();
            //  Remove last '\n'
            code = code.substring(0, code.length() - 1);
            writeFile(fileName, code);
        }
    }

    //===============================================================
    //===============================================================
    public static void main(String[] args) {
        if (args.length < 2)
            displaySyntax();
        try {
            if (args[0].equals("-html"))
                convertHTML(args[1]);
            else if (args[0].equals("-xmi-clean")) {
                //removeXmiKey("htmlInheritance", args[1]);
                //removeXmiKey("concreteHere", args[1]);
                //renameXmiKey("concreteHere", "MyNewKeyWordAndBlaBlaBla", args[1]);
            }
        } catch (DevFailed e) {
            Except.print_exception_stack(e);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    //===============================================================
    //===============================================================
}
