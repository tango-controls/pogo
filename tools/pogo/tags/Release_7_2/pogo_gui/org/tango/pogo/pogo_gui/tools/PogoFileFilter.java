//+======================================================================
//
// Project:   Tango
//
// Description:  Basic Dialog Class to define s file filter
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

import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.util.Vector;


/*
 * @(#)PogoFileFilter.java	1.8 98/08/26
 *
 * copyleft 1998 by Sun Microsystems, Inc.,
 * 901 San Antonio Road, Palo Alto, California, 94303, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Sun Microsystems, Inc. ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with Sun.
 */


/**
 * A convenience implementation of FileFilter that filters out
 * all files except for those type extensions that it knows about.
 *
 * Extensions are of the type ".foo", which is typically found on
 * Windows and Unix boxes, but not on Macinthosh. Case is ignored.
 *
 * Example - create a new filter that filerts out all files
 * but gif and jpg image files:
 *
 *     JFileChooser chooser = new JFileChooser();
 *     PogoFileFilter filter = new PogoFileFilter(
 *                   new String{"gif", "jpg"}, "JPEG & GIF Images")
 *     chooser.addChoosableFileFilter(filter);
 *     chooser.showOpenDialog(this);
 *
 * @version 1.8 08/26/98
 * @author Jeff Dinkins
 */
public class PogoFileFilter extends FileFilter {

    private Vector<String> filters = new Vector<String>();
    private String description = null;
    private String fullDescription = null;
    private boolean useExtensionsInDescription = true;

    /**
     * Creates a file filter. If no filters are added, then all
     * files are accepted.
     *
     * @see #addExtension
     */
    public PogoFileFilter() {

    }

    /**
     * Creates a file filter that accepts the given file type.
     * Example: new PogoFileFilter("jpg", "JPEG Image Images");
     *
     * Note that the "." before the extension is not needed. If
     * provided, it will be ignored.
     *
     * @param extension     extension to filter
     * @param description   filter description
     *
     * @see #addExtension
     */
    public PogoFileFilter(String extension, String description) {
		this();
		if(extension!=null)
			addExtension(extension);
		if(description!=null)
			setDescription(description);
    }

    /**
     * Creates a file filter from the given string array and description.
     * Example: new PogoFileFilter(String {"gif", "jpg"}, "Gif and JPG Images");
     *
     * Note that the "." before the extension is not needed and will be ignored.
     *
     * @param filters       extensions
     * @param description   filter description
     * @see #addExtension
     */
    public PogoFileFilter(String[] filters, String description) {
		this();
        //System.out.println("new PogoFilter for " + description);
        for (String filter : filters) {
            // add filters one by one
            addExtension(filter);
        }
 		if(description!=null) setDescription(description);
    }

    /**
     * Return true if this file should be shown in the directory pane,
     * false if it shouldn't.
     *
     * Files that begin with "." are ignored.
     *
     * @see #getExtension
     * @see FileFilter
     */
    public boolean accept(File f) {
		if(f != null)
		{
		    if(f.isDirectory()) {
                return true;
            }
		    String	extension   = getExtension(f);
			if(extension != null) {
                for (String filter : filters) {
                    if (filter.equals(extension)) {
                        //	Check if Tango class definition (DeviceImpl)
                        //noinspection SimplifiableIfStatement
                        if (getDescription().toLowerCase().startsWith("pogo-6")) {
                            return isDeviceImplClass(f.toString());
                        }
                        else
                        if (getDescription().toLowerCase().startsWith("additional")) {
                            boolean generated = isPogoGeneratedFile(f .toString());
                            //System.out.println(f + ":   " + generated);
                            return (! generated);
                        }
                        if (getDescription().toLowerCase().startsWith("multi classes")) {
                            return isMultiClassXmi(f.toString());
                        }
                        else {
                            //	else default one (the xmi Tango class file)
                            return !isMultiClassXmi(f.toString());
                        }
                    }
                }
			}
		}
		return false;
    }

    /**
     * Return the extension portion of the file's name .
     *
     * @see #getExtension
     * @see FileFilter#accept
     * @param f file to br checked
     * @return return file extention
     */
    static public String getExtension(File f) {
		if(f != null) {
		    String filename = f.getName();
			return getExtension(filename);
		}
		return null;
    }
    /**
     * Return the extension portion of the file's name .
     *
     * @see #getExtension
     * @see FileFilter#accept
     * @param filename file to br checked
     * @return return file extention
     */
    static public String getExtension(String filename) {
		if(filename != null) {
	    	int i = filename.lastIndexOf('.');
	    	if(i>0 && i<filename.length()-1)
				return filename.substring(i+1).toLowerCase();
		}
		return null;
    }

    /**
     * Adds a filetype "dot" extension to filter against.
     *
     * For example: the following code will create a filter that filters
     * out all files except those that end in ".jpg" and ".tif":
     *
     *   PogoFileFilter filter = new PogoFileFilter();
     *   filter.addExtension("jpg");
     *   filter.addExtension("tif");
     * @param extension extention to be added.
     *
     * Note that the "." before the extension is not needed and will be ignored.
     */
    public void addExtension(String extension) {
       //noinspection unchecked
        filters.add(extension.toLowerCase());
		fullDescription = null;
	}


    /**
     * Returns the human readable description of this filter. For
     * example: "JPEG and GIF Image Files (*.jpg, *.gif)"
     *
     * @see FileFilter#getDescription
     */
    public String getDescription() {
		if(fullDescription == null) {
			if(description == null || isExtensionListInDescription()) {
				fullDescription = description==null ? "" : description + "  (";
				// build the description from the extension list
				//Enumeration extensions = filters.keys();
                for (int i=0 ; i<filters.size() ; i++) {
                    fullDescription += "*." + filters.get(i);
                    if(i<filters.size()-1)
                        fullDescription += ", ";
                }
				fullDescription += ")";
			}
			else
				fullDescription = description;
		}
		return fullDescription;
    }

    /**
     * Sets the human readable description of this filter. For
     * example: filter.setDescription("Gif and JPG Images");
     *
     * @param description description to be added
     */
    public void setDescription(String description) {
		this.description = description;
		fullDescription = null;
    }

    /**
     * Determines whether the extension list (.jpg, .gif, etc) should
     * show up in the human readable description.
     *
     * Only relevent if a description was provided in the constructor
     * or using setDescription();
     *
     * @param b set it if true.
     */
    public void setExtensionListInDescription(boolean b) {
		useExtensionsInDescription = b;
		fullDescription = null;
    }

    /**
     * Returns whether the extension list (.jpg, .gif, etc) should
     * show up in the human readable description.
     *
     * Only relevent if a description was provided in the constructor
     * or using setDescription();
     *
     * @return whether the extension list (.jpg, .gif, etc) should
     * show up in the human readable description.
     */
    public boolean isExtensionListInDescription() {
		return useExtensionsInDescription;
    }




    //===============================================================
    //===============================================================
    private boolean isPogoGeneratedFile(String fileName)
    {
        String code;
        try {
             code = ParserTool.readFile(fileName);
        }
        catch (DevFailed e) {
            return false;
        }
        return (code.indexOf("PROTECTED REGION ID")>=0);
    }
    //===============================================================
    //===============================================================
    private boolean isMultiClassXmi(String filename)
    {
        return (filename.endsWith(".multi.xmi"));
        /*
        try {
            String readCode = ParserTool.readFile(filename);
            int pos = readCode.indexOf("<multiClasses");
            return (pos>0);
        }
        catch (Exception e) { /* Noting to do }
        return false;
        */
    }
    //===============================================================
    //===============================================================
    public static final String[]	cpp_target  = {
                                    "Inherited from class ",
                                    ": public Tango::Device_4Impl",
                                    ": public Tango::Device_3Impl",
                                    ": public Tango::Device_2Impl",
                                    ": public Tango::DeviceImpl"
                                    };
    public static final String[]	java_target  = {
                                    " extends DeviceImpl",	// implements TangoConst"
                                    };
    public static final String[]	py_target  = {
                                    "(PyTango.Device_4Impl):",
                                    "(PyTango.Device_3Impl):"
                                    };
    //===============================================================
    /**
     *	Return true if a Tango device impl class and generated by Pogo-6
     *
     *	@param filename file's name to be checked.
     * @return true if specified file is a TANGO code source file generated by Pogo-6.
     */
    //===============================================================
    public static boolean isDeviceImplClass(String filename)
    {
        try  {
            //	Read file content.
            String readcode = ParserTool.readFile(filename);
            //System.out.println(filename);

			//	Check if new POGO generated code (oAW)
			if (readcode.startsWith("/*----- PROTECTED REGION ID")){
                return false;
            }
            //	Check if cpp device impl
			for (String aCpp_target : cpp_target){
				if (readcode.indexOf(aCpp_target) > 0){
					return true;
                }
            }
            //	Check if java device impl
			for (String aJava_target : java_target){
				if (readcode.indexOf(aJava_target) > 0){
					return true;
                }
            }
            //	Check if python device impl
			for (String aPy_target : py_target) {
				if (readcode.indexOf(aPy_target) > 0){
					return true;
                }
            }
        }
        catch (Exception e) { /* Noting to do */}
        return false;
    }
}
