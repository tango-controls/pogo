//+======================================================================
//
// Project:   Tango
//
// Description:	java source code for utilities
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

package org.tango.pogo.pogo_gui.packaging;

import fr.esrf.tango.pogo.pogoDsl.ClassDescription;
import org.tango.pogo.pogo_gui.tools.ParserTool;
import org.tango.pogo.pogo_gui.tools.PogoException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class PackUtils {
    //private static String templatesPath = null;
    private static PackUtils instance = null;
    //===============================================================
    //===============================================================
    private PackUtils() {

    }
    //===============================================================
    //===============================================================
    public static PackUtils getInstance() {
        if (instance==null)
            instance = new PackUtils();
        return instance;
    }
    //===============================================================
    //===============================================================
    public boolean fileExistsInPackage(String fileName) {
        java.net.URL url = getClass().getResource("/packaging/" + fileName);
        return  (url != null);
    }
    //===============================================================
    //===============================================================
    public String readFileFromPackage(String fileName) throws PogoException {
        String str = "";
        try {
            java.net.URL url = getClass().getResource(fileName);
            if (url == null) {
                throw new PogoException("URL for packaging file (" + fileName + ") is null !");
            }
            InputStream is = url.openStream();
            int size = is.available();
            byte[]  bytes = new byte[size];
            size = is.read(bytes);
            if (size>0)
                str = ParserTool.takeOffWindowsChar(bytes);
        }
        catch (PogoException e) {
            throw e;
        }
        catch (Exception e) {
            throw new PogoException(e.toString());
        }
        return str;
    }
    //===============================================================
    /**
     * Returns the list of file found in specified path with specified extension (.cpp)
     * @param path      specified path
     * @param extension Specified extension
     * @return the list of file found in specified path with specified extension
     * @throws PogoException if path cannot be read
     */
    //===============================================================
    public static List<String> getFileList(String path, String extension) throws PogoException {
        List<String>   fileList = new ArrayList<>();
        try {
            File inDir = new File(path);
            String[] fileNames = inDir.list();
            //	Check file names
            if (fileNames==null)
                return fileList;

            //	Check for each file name
            for (String name : fileNames) {
                if (name.endsWith(extension)) {
                    String filename = path + "/" + name;
                    File f = new File(filename);
                    if (f.isFile()) {
                        fileList.add(name);
                    }
                }
            }
        } catch (Exception e) {
                throw new PogoException(e.toString());
        }

        return fileList;
    }
    //===============================================================
    /**
     *	Execute a shell command and throw exception if command failed.
     *
     *	@param command	shell command to be executed.
     */
    //===============================================================
    public static String executeShellCommand(String command) throws PogoException {
        StringBuilder   sb = new StringBuilder();
        try {
            Process process = Runtime.getRuntime().exec(command);

            // get command output stream and
            // put a buffered reader input stream on it.
            InputStream inputStream = process.getInputStream();
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(inputStream));

            // read output lines from command
            String str;
            while ((str = br.readLine()) != null) {
                //System.out.println(str);
                sb.append(str).append("\n");
            }

            // wait for end of command
            process.waitFor();

            // check its exit value
            int retVal;
            if ((retVal = process.exitValue()) != 0) {
                //	An error occurs try to read it
                InputStream errorStream = process.getErrorStream();
                br = new BufferedReader(new InputStreamReader(errorStream));
                while ((str = br.readLine()) != null) {
                    sb.append(str).append("\n");
                }
                throw new PogoException("The shell command\n"
                        + command + "\nreturns : " + retVal + " !\n\n" + sb);
            }
        }
        catch (Exception e) {
            throw new PogoException("Failed to execute: " + command + "\n" + e);
        }
        //PackUtils..println(sb);
        return sb.toString();
    }
    //===============================================================
    /**
     * Check if PACKAGING_HOME variable to know where template files are.
     * @return true if PACKAGING_HOME has been set.
     */
    //===============================================================
    public static boolean isAvailable() {
        //noinspection RedundantIfStatement
        if (org.tango.pogo.pogo_gui.tools.Utils.osIsUnix()) {
            return true;
            /*
            String s = System.getenv("Packaging");
            return (s!=null && s.equals("true"));
            */
        }
        else
            return false;
    }
    //===============================================================
    /**
     * Build next line string to add file in a Makefile
     * @param str Header line
     * @return line string to add file in a Makefile
     */
    //===============================================================
    public static String buildNextLine(final String str) {
        StringBuilder  indent = new StringBuilder();
        for (int i=0 ; i<str.length() ; i++)
            indent.append(" ");
        return  " \\\\\n" + indent;
    }
    //===============================================================
    /**
     * Build specified directories in spacified path
     * @param directories   Specified directories
     * @param path          Specified path
     * @throws PogoException if a least one directory creation failed.
     */
    //===============================================================
    public static void buildDirectories(final String[] directories, final String path) throws PogoException {
        //  create out path if not exists
        for (String directory : directories) {
            String    dirName = path +"/"+directory;
            File dir = new File(dirName);
            if (!dir.exists()) {
                if (!dir.mkdir())
                    throw new PogoException("Directory \'" + dirName + "\' cannot be created");
                PackUtils.println(path + " created.");
            }
        }
    }
    //===============================================================
    //===============================================================
    public static String buildConfigureList(List<String> list) {
        String  str = " ";
        for (String item : list) {
            str += item + " ";
        }
        return str;
    }
    //===============================================================
    //===============================================================
    private static String replace(String code, String src, String target) {
        int end;
        int start;
        while ((start=code.indexOf(src))>0) {
            end = start + src.length();
            code = code.substring(0, start) + target + code.substring(end);
        }
        return code;
    }
    //===============================================================
    //===============================================================
    public static String buildConfigureDefine(String s) {
        s = s.toUpperCase();
        s = replace(s, "/", "_");
        s = replace(s, ".", "_");
        return s;
    }
    //===============================================================
    //===============================================================
    public static String buildMailAddress(ClassDescription description) {
        return description.getIdentification().getAuthor() +
                "@" + description.getIdentification().getEmailDomain();
    }
    //===============================================================
    //===============================================================
    static boolean authorFileExists(String path) {
        return new File(path+Packaging.PackageDir+"AUTHORS").exists();
    }
    //===============================================================
    //===============================================================
    public static void println(String str) {
        String env = System.getenv("DEBUG");
        if (env!=null && env.equals("true")) {
            System.out.println(str);
        }
    }
    //===============================================================
    //===============================================================
}
