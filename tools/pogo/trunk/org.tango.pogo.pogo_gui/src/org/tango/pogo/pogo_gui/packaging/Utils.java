//+======================================================================
//
// Project:   Tango
//
// Description:	java source code for utilities
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013
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

import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;

import java.io.*;
import java.util.ArrayList;


public class Utils {
    private static String templatesPath = null;
    //===============================================================
    /**
     * Returns the list of file found in specified path with specified extension (.cpp)
     * @param path      specified path
     * @param extension Specified extension
     * @return the list of file found in specified path with specified extension
     * @throws DevFailed if path cannot be read
     */
    //===============================================================
    public static ArrayList<String> getFileList(String path, String extension) throws DevFailed {
        ArrayList<String>   fileList = new ArrayList<String>();
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
                Except.throw_exception("GetFileListFailed",
                        e.toString(),
                        "Packaging.getFileList()");
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
    public static String executeShellCommand(String command) throws DevFailed {
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
                    System.out.println(str);
                    sb.append(str).append("\n");
                }
                Except.throw_exception("ExecutionFailed",
                        "The shell command\n" + command + "\nreturns : " + retVal + " !\n\n" + sb,
                        "Packaging.executeShellCommand()");
            }
        }
        catch (Exception e) {
            Except.throw_exception("ExecutionFailed",
                    "Failed to execute: " + command + "\n" + e,
                    "Packaging.executeShellCommand()");
        }
        //System.out.println(sb);
        return sb.toString();
    }
    //===============================================================
    /**
     * Check if PACKAGING_HOME variable to know where template files are.
     * @return true if PACKAGING_HOME has been set.
     */
    //===============================================================
    public static boolean isAvailable() {
        if (templatesPath ==null) {
            templatesPath = System.getenv("PACKAGING_HOME");
            if (templatesPath ==null)
                templatesPath = System.getProperty("PACKAGING_HOME");
        }
        return (templatesPath !=null);
    }
    //===============================================================
    //===============================================================
    static String getTemplatesPath() throws DevFailed{
        if (templatesPath==null)
            if (!isAvailable())
                Except.throw_exception("NoInitialized",
                        "PACKAGING_HOME is not set",
                        "Utils.getTemplatesPath()");
        return templatesPath;
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
     * Copy specified source file to target file
     * @param srcFile    Specified source file
     * @param targetFile Specified target file
     * @throws DevFailed if read source file or write target file failed.
     */
    //===============================================================
    public static void copyFile(final String srcFile, final String targetFile) throws DevFailed {
        try {
            //  Read source file
            FileInputStream inputStream = new FileInputStream(srcFile);
            int nb = inputStream.available();
            byte[] bytes = new byte[nb];
            nb = inputStream.read(bytes);
            inputStream.close();
            if (nb == 0)
                bytes = new byte[0];

            //  Write target file
            FileOutputStream outputStream = new FileOutputStream(targetFile);
            outputStream.write(bytes);
            outputStream.close();
            if (!new File(targetFile).setExecutable(true))
                System.err.println("Cannot set " + targetFile + " as executable !");
            //System.out.println(srcFile + " ---> " + targetFile + "   done");

        } catch (Exception e) {
            Except.throw_exception("READ_FAILED",
                    e.toString(), "Packaging.copyFile()");
        }

    }
    //===============================================================
    /**
     * Build specified directories in spacified path
     * @param directories   Specified directories
     * @param path          Specified path
     * @throws DevFailed    if a least one directory creation failed.
     */
    //===============================================================
    public static void buildDirectories(final String[] directories, final String path) throws DevFailed {
        //  create out path if not exists
        for (String directory : directories) {
            String    dirName = path +"/"+directory;
            File dir = new File(dirName);
            if (!dir.exists()) {
                if (!dir.mkdir())
                    Except.throw_exception("CannotCreate",
                            "Directory \'" + dirName + "\' cannot be created",
                            "Packaging.buildDirectories()");
                System.out.println(path + " created.");
            }
        }
    }
    //===============================================================
    //===============================================================
}
