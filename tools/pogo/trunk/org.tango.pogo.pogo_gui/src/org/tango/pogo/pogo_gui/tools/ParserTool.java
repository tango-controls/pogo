//+======================================================================
//
// Project:   Tango
//
// Description: java code for parsing utilities.
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


import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;

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
     * @throws PogoException in case of failure during read file.
     */
    //===============================================================
    public static String readFile(String filename) throws PogoException {
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
            throw new PogoException(e.toString());
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
    public static String takeOffWindowsChar(byte[] b_in) {
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
    public static void writeFile(String filename, String code) throws PogoException {
        try {
            String  s = System.getenv("LINUX");
            if (s==null || !s.equals("true"))
                code = checkOsFormat(code);
            FileOutputStream fidout = new FileOutputStream(filename);
            fidout.write(code.getBytes());
            fidout.close();
        } catch (Exception e) {
            throw new PogoException(e.toString());
        }
    }

    //===============================================================
    //===============================================================
    public static void modifyProtectedAreaID(String path, String fileName, String oldID, String newID)
            throws PogoException {
        oldID = "PROTECTED REGION ID(" + oldID + ") ENABLED START";
        newID = "PROTECTED REGION ID(" + newID + ") ENABLED START";

        //  Read file
        String code;
        try {
            code = readFile(path + '/' + fileName);
        } catch (PogoException e) {
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
     * @throws PogoException in case of failure during write file.
     */
    //===============================================================
    public static void convertHTML(String filename) throws PogoException {
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
            throw new PogoException(e.toString());
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
     * @throws PogoException if read x,i failed
     */
    //===============================================================
    public static void removeXmiKey(String key, String fileName) throws PogoException {
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
     * @throws PogoException if read x,i failed
     */
    //===============================================================
    @SuppressWarnings("UnusedDeclaration")
    public static void renameXmiKey(String srcKey, String newKey, String fileName) throws PogoException {
        //  Rea=d file and split lines
        boolean modified = false;
        boolean startingLine = srcKey.startsWith("<");
        if (!startingLine) //	if key does not start the line
        	srcKey = " " + srcKey + "=";
        String code = readFile(fileName);
        StringTokenizer stk = new StringTokenizer(code, "\n");
        ArrayList<String> lines = new ArrayList<String>();
        while (stk.hasMoreTokens()) {
            //  For each line
            String line = stk.nextToken();
            int start;
            //  Check if key exists
            if ((start=line.indexOf(srcKey)) >= 0) {
                System.out.println("--------> replace " + srcKey + " by " + newKey);
                int end = start + srcKey.length();

                //  Rename it
                if (!startingLine) {
                	start++; // For space char at beginning
                	end--;
                }
                line = line.substring(0, start) + newKey + line.substring(end);
                modified = true;
            }
            lines.add(line);
        }

        //  Reconstruct code and save it if modified
        if (modified) {
            StringBuilder sb = new StringBuilder();
            for (String s : lines)
                sb.append(s).append("\n");
            code = sb.toString();
            //  Remove last '\n'
            code = code.substring(0, code.length() - 1);
            writeFile(fileName, code);
        }
    }

    //===============================================================
    //===============================================================
    public static void convertProtectedAreaKey(String srcKey, String newKey, String fileName) throws PogoException {
        //  Rea=d file and split lines (do not use StringTokenizer to do not loose empty lines
        boolean modified = false;
        String code = readFile(fileName);
        ArrayList<String> lines = new ArrayList<String>();
        int startLine = 0;
        int endLine;
        while ((endLine=code.indexOf('\n', startLine))>0) {
            //  For each line
            String line = code.substring(startLine, endLine);
            int start;
            //  check if Protected area
            if (line.contains(" PROTECTED REGION ")) {
                //System.out.println(line);
                //  Check if key exists
                if ((start = line.indexOf(srcKey)) > 0) {
                    int end = start + srcKey.length();

                    //  Replace it
                    line = line.substring(0, start) + newKey + line.substring(end);
                    modified = true;
                }
            }
            lines.add(line);
            startLine = endLine+1;
        }
        lines.add(code.substring(startLine));

        if (modified) {
            //  Reconstruct code and save it if modified
            StringBuilder   sb = new StringBuilder();
            for (String line : lines) {
                sb.append(line).append('\n');
            }
            writeFile(fileName, sb.toString().trim());
            System.out.println("Replaced \""+srcKey + "\"  by  \"" + newKey + "\" \t in "+fileName);
        }
    }
    //===============================================================
    //===============================================================
    public static void convertProtectedAreaKeyForStateMachine(
            ArrayList<String> attributeNames, String fileName, boolean toXtend) throws PogoException {
        //  Rea=d file and split lines (do not use StringTokenizer to do not loose empty lines
        boolean modified = false;
        String code = readFile(fileName);
        ArrayList<String> lines = new ArrayList<String>();
        int startLine = 0;
        int endLine;
        while ((endLine=code.indexOf('\n', startLine))>0) {
            //  For each line
            String line = code.substring(startLine, endLine);
            int start;
            //  check if Protected area
            if (line.contains(" PROTECTED REGION ")) {
                //System.out.println(line);
                
                for (String attributeName : attributeNames) {
                    String  srcKey = "read_"+attributeName+"StateAllowed_READ";
                    String  newKey = attributeName+"StateAllowed";
                    if (!toXtend) {
                        //  Swap keys to go back to old pogo
                        String  tmp = newKey;
                        newKey = srcKey;
                        srcKey = tmp;
                    }

                    //  Check if key exists
                    if ((start = line.indexOf(srcKey)) > 0) {
                        int end = start + srcKey.length();

                        //  Replace it
                        line = line.substring(0, start) + newKey + line.substring(end);
                        modified = true;
                    }
                }
            }
            lines.add(line);
            startLine = endLine+1;
        }
        lines.add(code.substring(startLine));

        if (modified) {
            //  Reconstruct code and save it if modified
            StringBuilder   sb = new StringBuilder();
            for (String line : lines) {
                sb.append(line).append('\n');
            }
            writeFile(fileName, sb.toString().trim());
            System.out.println("Replaced protected region keys in "+fileName);
        }
    }
    //===============================================================
    /**
     * When Pogo templates moved from XPand to XTend,
     * compatibility was not fully supported.
     * This method convert for 8.0 to 8.1  or 8.1 to 8.0
     * @param cls   specified class to convert.
     * @param toXTend   covert to XTend compatibility if true, to XPand otherwise.
     */
    //===============================================================
    void convertForXTendCompatibility(PogoDeviceClass cls, boolean toXTend) {

        try {
            if (toXTend) {

                //  Keys have changed when templates moved
                //      from Xpand   to   Xtend
                String  fileHeader = cls.getDescription().getSourcePath() +
                        "/" + cls.getName();
                //  Int DevClass.cpp
                {
                    String  fileName = fileHeader +"Class.cpp";
                    String  srcKey = cls.getName()+"::Class::";
                    String  newKey = cls.getName()+"Class::";
                    convertProtectedAreaKey(srcKey, newKey, fileName);
                }
                //  In DevClass.h
                {
                    String  fileName = fileHeader + "Class.h";
                    String  srcKey = cls.getName()+"::";
                    String  newKey = cls.getName()+"Class::";
                    convertProtectedAreaKey(srcKey, newKey, fileName);
                }
                //  In DevStateMachine.cpp
                {
                    String  fileName = fileHeader + "StateMachine.cpp";
                    ArrayList<String>   attributeNames = new ArrayList<String>();
                    for (Attribute attribute : cls.getAttributes()) {
                        attributeNames.add(attribute.getName());
                    }
                    convertProtectedAreaKeyForStateMachine(attributeNames, fileName, true);
                }
            }
            else {
                //  Back to XPand compatibility (Pogo 8.0.x)
                new Back2Height(cls);
            }
        }
        catch(PogoException e) {
            System.err.println(e);
        }
    }
     //===============================================================
    //===============================================================
    public static void main(String[] args) {
        try {
            if (args.length >=2) {
                if (args[0].equals("-html"))
                    convertHTML(args[1]);
                else if (args[0].equals("-xmi-clean")) {
                }
            }
            else
                displaySyntax();
        } catch (PogoException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    //===============================================================
    //===============================================================







    //===============================================================
    //===============================================================
    public void startBack2Height(String fileName) {
        try {
            new Back2Height(fileName);
        }
        catch (PogoException e) {
            System.err.println(e);
        }
    }
    //===============================================================
    //  Back from Pogo 8.1.xx to Pogo-0.xx
    //===============================================================
    private class Back2Height {
        private PogoDeviceClass cls = null;
        private String className;
        private String  path = ".";
        private String  xmiFileName;
        //===============================================================
        private Back2Height(PogoDeviceClass cls) throws PogoException {
            className = cls.getName();
            path      = cls.getDescription().getSourcePath();
            xmiFileName = path + "/" + className + ".xmi";
            convert();
        }
         //===============================================================
        private Back2Height(String xmiFileName) throws PogoException {

            this.xmiFileName = xmiFileName;
            //  truncate for path and class names.
            int pos = xmiFileName.lastIndexOf('/');
            if (pos<0)
                pos = xmiFileName.lastIndexOf('\\');
            int end = xmiFileName.lastIndexOf('.');


            if (pos>0) {
                path = xmiFileName.substring(0, pos);
                className = xmiFileName.substring(pos+1, end);
            }
            else
                className = xmiFileName.substring(0, end);
            convert();
        }
        //===============================================================
        private void convert() throws PogoException {
            System.out.println("Path = " + path);
            System.out.println("ClassName = " + className);

            //  Remove new keys(s) in xmi file ans check it
            System.out.println("cleaning " + xmiFileName);
            removeXmiKey("pogoRevision", xmiFileName);
            if (cls==null)
                cls = OAWutils.getInstance().loadDeviceClassModel(xmiFileName, false);

            //  Update DevClass.cpp for protected regions
            String  fileName = path + "/" + className + "Class.cpp";
            manageDevClassCpp(fileName);

            //  Update DevClass.h for protected regions
            fileName = path + "/" + className + "Class.h";
            manageDevClassH(fileName);

            //  Update DevStateMachine.cpp
            fileName = path + '/' + className + "StateMachine.cpp";
            ArrayList<String>   attributeNames = new ArrayList<String>();
            for (Attribute attribute : cls.getAttributes()) {
                attributeNames.add(attribute.getName());
            }
            convertProtectedAreaKeyForStateMachine(attributeNames, fileName, true);
        }
        //===============================================================
        private void manageDevClassCpp(String fileName) throws PogoException {

            System.out.println("cleaning protected regions in " + fileName);
            String  srcKey = className + "Class::";
            String  newKey = className + "::Class::";
            ParserTool.convertProtectedAreaKey(srcKey, newKey, fileName);
        }
        //===============================================================
        private void manageDevClassH(String fileName) throws PogoException {

            System.out.println("cleaning protected regions in " + fileName);
            boolean modified = false;
            String  code = readFile(fileName);
            ArrayList<String> lines = new ArrayList<String>();
            int startLine = 0;
            int endLine;
            int cnt = 0;
            String  srcKey = className+"Class";
            while ((endLine=code.indexOf('\n', startLine))>0) {
                //  For each line
                String line = code.substring(startLine, endLine);
                //  check if Protected area
                if (line.contains(" PROTECTED REGION ")) {
                    //System.out.println(line);
                    cnt++;
                    int start;
                   //  Check if key exists
                    if ((start = line.indexOf(srcKey)) > 0  && cnt>=3) {
                        System.out.println("Replace " + srcKey + " by " + className);

                        int end = start + srcKey.length();

                        //  Replace it
                        line = line.substring(0, start) + className + line.substring(end);
                        modified = true;
                    }
                }
                lines.add(line);
                startLine = endLine+1;
            }
            lines.add(code.substring(startLine));
            if (modified) {
                //  Reconstruct code and save it if modified
                StringBuilder   sb = new StringBuilder();
                for (String line : lines) {
                    sb.append(line).append('\n');
                }
                writeFile(fileName, sb.toString().trim());
                System.out.println("Replaced \""+srcKey + "\"  by  \"" + className + "\" \t in "+fileName);
            }
        }
    }
    //===============================================================
    //===============================================================
}
