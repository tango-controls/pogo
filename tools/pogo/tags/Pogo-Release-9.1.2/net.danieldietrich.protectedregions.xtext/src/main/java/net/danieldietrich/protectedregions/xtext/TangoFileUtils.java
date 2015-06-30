//+======================================================================
// :  $
//
// Project:   Tango
//
// Description:  java source code for Tango manager tool..
//
// : pascal_verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,
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
// :  $
//
//-======================================================================


package net.danieldietrich.protectedregions.xtext;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.StringTokenizer;


/**
 * This class is a set of tools for file management
 *
 * @author verdier
 */

public class TangoFileUtils {

    //===============================================================
    /**
     * Open a file and return text read.
     *
     * @return the file content read.
     */
    //===============================================================
    public static String readFile(URI uri) {
        String str = "";
        File file = new File(uri.getPath());
        System.out.println(uri + " exists " + file.exists());
        try {
            FileInputStream inputStream = new FileInputStream(uri.getPath());
            int nb = inputStream.available();
            byte[] inBytes = new byte[nb];
            nb = inputStream.read(inBytes);
            inputStream.close();

            if (nb > 0)
                str = takeOffWindowsChar(inBytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return str;
    }
    //===============================================================
    /**
     * Take off Cr eventually added by Windows editor.
     *
     * @param inBytes specified string to be modified.
     * @return the modified string.
     */
    //===============================================================
    private static String takeOffWindowsChar(byte[] inBytes) {
        //	Take off Cr (0x0d) eventually added by Windows editor
        int nb = 0;
        for (byte b : inBytes)
            if (b != 0xd)
                nb++;
        byte[] outBytes = new byte[nb];
        for (int i=0, j=0; i<inBytes.length ; i++)
            if (inBytes[i] != 0xd)
                outBytes[j++] = inBytes[i];
        return new String(outBytes);
    }
    //===============================================================
    /**
     * Write specified file with specified code
     * @param uri     file uri
     * @param code    code to be written
     */
    //===============================================================
    public static void writeFile(URI uri, String code) {
    	try {
            //  Create folders
            String fileName = uri.toString();
            if (fileName.startsWith("file:"))
            	fileName = fileName.substring("file:".length());
            buildFolder(fileName);
            
            //  Convert code if necessary
            String os = System.getProperty("os.name");
            if (os.toLowerCase().startsWith("windows"))
            	code = setWindowsFileFormat(code);

            //  And write code to file
            FileOutputStream outputStream = new FileOutputStream(fileName);
	        outputStream.write(code.getBytes());
	        outputStream.close();
		} catch (IOException e) {
            throw new RuntimeException(e.getMessage());
		}
    }
    //===============================================================
    //===============================================================
    public static String setWindowsFileFormat(String code) {
        //	Convert default Unix format to Windows format
    	ArrayList<Byte> list = new ArrayList<Byte>();
    	byte[]	inBytes = code.getBytes();
    	for (int i=0 ; i<inBytes.length ; i++ ) {
    		list.add(inBytes[i]);
    		if (inBytes[i]==0xd)
    			if (i<inBytes.length-1 && inBytes[i+1]!=0xa)
    				list.add((byte)0xa);
    	}
    	byte[] outBytes = new byte[list.size()];
    	for (int i=0 ; i<list.size(); i++)
    		outBytes[i] = list.get(i);
        return new String(outBytes);
    }
    //===============================================================
    //===============================================================
    private static void buildFolder(String fileName) {
        StringTokenizer stk = new StringTokenizer(fileName,"/");
        String path = "";
        if (fileName.startsWith("/"))	path += '/';

        path += stk.nextToken();
        int nbTokens = stk.countTokens();
        for (int i=1 ; i<nbTokens  ; i++) {
            path += "/" + stk.nextToken();
            File file = new File(path);
            if (!file.exists()) {
                //System.out.println("Create " + path);
                if (!file.mkdir())
                    throw new RuntimeException("Cannot create " + path);
            }
        }
    }
    //===============================================================
    //===============================================================
}
