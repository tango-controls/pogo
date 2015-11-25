//+======================================================================
//
// Project:   Tango
//
// Description:	java source code to parse generated code
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
 *	This class is able parse generated code.
 *
 * @author verdier
 */

import java.util.StringTokenizer;


public class PogoParser {
    private String fileCode;
    private String filename;

    static final String start_protected = "PROTECTED REGION ID(";
    static final String start_protected_enabled = "ENABLED START";
    static final String end_protected = "PROTECTED REGION END";

    //===============================================================
    //===============================================================
    public PogoParser(String filename) throws PogoException {
        this.filename = filename;
        fileCode = ParserTool.readFile(filename);
    }

    //===============================================================
    //===============================================================
    public void write() throws PogoException {
        ParserTool.writeFile(filename, fileCode);
    }

    //===============================================================
    //===============================================================
    public boolean codeExists(String code) {
        return fileCode.contains(code);
    }
    /*
 	//===============================================================
	//===============================================================
	public static String removeLineCode(String code, String str)
	{
        if (code==null || code.length()==0)
           return code;
		//	Search zone begining
		int	start = code.indexOf(str);
		if (start<0)
			return code;
		start = code.lastIndexOf('\n', start) + 1;

		//	Search protected zone ending
		int	end   = code.indexOf('\n', start);
		if (end<0)
			return code;
		end++;
		return code.substring(0, start) + code.substring(end);
	}
 	//===============================================================
	//===============================================================
	public void removeLineCode(String str, int idx)
	{
		//	Search zone begining
		int	start = fileCode.indexOf(str, idx);
		if (start<0)
			return;
		start = fileCode.lastIndexOf('\n', start) + 1;

		//	Search protected zone ending
		int	end   = fileCode.indexOf('\n', start);
		if (end<0)
			return;
		end++;
		fileCode =  fileCode.substring(0, start) + fileCode.substring(end);
	}
 	//===============================================================
	//===============================================================
	*/


    //===============================================================
    /*
      *	Insert methods for new model
      */
    //===============================================================
    //===============================================================
    /*
     *	Insert code in a protected area
     */
    //===============================================================
    public void insertInProtectedZone(String className, String method, String code) {
        //  Default one is for C++
        insertInProtectedZone(className,method, code, "::");
    }
    //===============================================================
    public void insertInProtectedZone(String className, String method, String code, String separator) {
        if (code == null || code.length() == 0)
            return;    //	Nothing to insert.

        String this_protected = start_protected;
        if (className != null && className.length() > 0)
            this_protected += className + separator;
        this_protected += method + ") " + start_protected_enabled;

        int[] indexes = indexesOfProtectedZone(this_protected);
        if (indexes != null) {
            fileCode =  fileCode.substring(0, indexes[1]).trim() + '\n' +
                        code + '\n' +
                        fileCode.substring(indexes[1]);
        } else
            System.err.println(this_protected + " not found");
    }

    //===============================================================
    public void replaceInProtectedZone(String className, String method, String code, String separator) {
        if (code == null || code.length() == 0)
            return;    //	Nothing to insert.

        StringBuilder thisProtected = new StringBuilder(start_protected);
        if (className != null && className.length() > 0)
            thisProtected.append(className).append(separator);
        thisProtected.append(method).append(") ").append(start_protected_enabled);

        int[] indexes = indexesOfProtectedZone(thisProtected.toString());
        if (indexes != null) {
            fileCode =  fileCode.substring(0, indexes[0]).trim() + '\n' +
                        code +
                        fileCode.substring(indexes[1]);
        } else
            System.err.println(thisProtected + " not found");
    }

    //===============================================================
    /*
      *	Insert code in a protected area
      */
    //===============================================================
    public void insertInProtectedZoneAtEnd(String classname, String method, String code) {
        if (code == null || code.length() == 0)
            return;    //	Nothing to insert.

        String this_protected = start_protected +
                classname + "::" + method + ") " + start_protected_enabled;

        //	Get protected area edges
        int[] indexes = indexesOfProtectedZone(this_protected);
        if (indexes != null) {
            //	Get position to insert
            int pos = indexes[1];
            if (pos > 0) {
                fileCode =  fileCode.substring(0, pos) + '\n' +
                            code + '\n' +
                            fileCode.substring(indexes[1]);
            }
        } else
            System.err.println(this_protected + " not found");
    }

    //===============================================================
    /*
     *	Remove code in a protected area
     */
    //===============================================================
    public void removeProtectedZone(String classname, String method) {
        String this_protected = start_protected +
                classname + "::" + method + ") " + start_protected_enabled;

        //	Get protected area edges
        int[] indexes = indexesOfProtectedZone(this_protected);
        if (indexes != null) {
            fileCode = fileCode.substring(0, indexes[0]) + fileCode.substring(indexes[1]);
        } else
            System.err.println(this_protected + " not found");
    }

    //===============================================================
    /*
     *	Remove code in a protected area
     */
    //===============================================================
    public void removeProtectedZoneAtEnd(String classname, String method, String start_rem) {
        String this_protected = start_protected +
                classname + "::" + method + ") " + start_protected_enabled;

        //	Get protected area edges
        int[] indexes = indexesOfProtectedZone(this_protected);
        if (indexes != null) {
            //	Get position to start remove
            int pos = fileCode.indexOf(start_rem, indexes[0]);
            if (pos > 0) {
                fileCode = fileCode.substring(0, pos) + fileCode.substring(indexes[1]);
            }
        } else
            System.err.println(this_protected + " not found");
    }

    //===============================================================
    //===============================================================
    public void insertIncludeFiles(String code) {
        //	Insert at first occuence
        int start = fileCode.indexOf("#include");
        int end = fileCode.indexOf(end_protected, start);
        end = fileCode.lastIndexOf('\n', end);
        fileCode = fileCode.substring(0, start) + code + fileCode.substring(end);
    }

    //===============================================================
    //===============================================================
    public void insertAdditionalMethodPrototypes(String classname, String code) {
        insertInProtectedZone(classname, "Additional Method prototypes", code);
    }

    //===============================================================
    //===============================================================
    public void insertAdditionalClasses(String classname, String code) {
        insertInProtectedZone(classname, "Additional Classes Definitions", code);
    }

    //===============================================================
    //===============================================================
    public void insertAdditionalClassDefs(String classname, String code) {
        insertInProtectedZone(classname, "Additional Class Declarations", code);
    }

    //===============================================================
    //===============================================================
    public void addObjFiles(String objFiles) throws PogoException {
        //	Check if already done
        if (fileCode.indexOf(objFiles) > 0)
            return;
        //	Get position to insert
        int start = fileCode.indexOf("SHLIB_OBJS =");
        if (start < 0)
            return;
        start = fileCode.substring(0, start).trim().length();    //	end of previous word
        //	Insert
        fileCode = fileCode.substring(0, start) + objFiles +
                fileCode.substring(start);
        write();
    }
    //===============================================================
    //===============================================================


    //===============================================================
    //===============================================================
    private int[] indexesOfProtectedZone(String this_protected) {
        //	Search protected zone begining
        int start = fileCode.indexOf(this_protected);
        if (start < 0) {
            System.err.println(this_protected + " not found !");
            return null;
        }
        start = fileCode.indexOf('\n', start) + 1;

        //	Search protected zone ending
        int end = fileCode.indexOf(end_protected, start);
        if (end < 0) {
            System.err.println("No end of protected zone for " + this_protected + " not found !");
            return null;
        }
        end = fileCode.lastIndexOf('\n', end);

        return new int[]{start, end};
    }

    //===============================================================
    //===============================================================
    public String getProtectedCode(String key) {
        String this_protected = start_protected + key + ") " + start_protected_enabled;

        int[] indexes = indexesOfProtectedZone(this_protected);
        if (indexes == null)
            return "";
        /*
        String code = fileCode.substring(indexes[0], indexes[1]);
        //	Remove empty lines
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(code, "\n");
        while (st.hasMoreTokens()) {
            String line = st.nextToken();
            if (line.length() > 0)
                sb.append(line);
            if (st.hasMoreTokens())    //	Not last one
                sb.append("\n");
        }
        return sb.toString();
        */
        return fileCode.substring(indexes[0], indexes[1]);
    }
    //===============================================================
    //===============================================================


    //===============================================================
    //	Deleted objects code management.
    //===============================================================

    //===============================================================
    /**
     * Get deleted object code and comment it before return.
     *
     * @param comment kind of comments used
     * @return deleted object code and comment it before return.
     */
    //===============================================================
    public String getDeletedObjectsCode(String comment) {
        int start = fileCode.lastIndexOf(comment);

        //	Check if method exists
        if (start > 0) {
            if (comment.startsWith("def ")) { //  Python method does not have header
                start = fileCode.lastIndexOf("\n", start);
            }
            else {  //  Get the header
                start = fileCode.lastIndexOf("/**", start);
                int start2 = fileCode.lastIndexOf("//-----", start);
                if (start2>=0)
                    start = start2;
            }
            int end = fileCode.indexOf(end_protected, start);
            end = fileCode.indexOf("}", end);
            end = fileCode.indexOf("\n", end) + 1;
            return commentCode(fileCode.substring(start, end));
        } else {
            System.out.println(comment + "	NOT FOUND !!!");
            return null;
        }
    }

    //===============================================================
    //===============================================================
    private String commentCode(String code) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(code, "\n");
        while (st.hasMoreTokens()) {
            String line = st.nextToken();
            if (!line.contains(start_protected) &&
                    !line.contains(end_protected))
                sb.append("// ").append(line).append("\n");
        }
        return sb.toString();
    }

    //===============================================================
    //===============================================================
    public void insertDeletedObjectsCode(String code) {
        int pos = fileCode.lastIndexOf(end_protected);
        pos = fileCode.lastIndexOf("\n", pos);
        fileCode = fileCode.substring(0, pos) + code +
                fileCode.substring(pos);
    }


    //===============================================================
    //===============================================================
    public String toString() {
        return fileCode;
    }
    //===============================================================
    //===============================================================
}
