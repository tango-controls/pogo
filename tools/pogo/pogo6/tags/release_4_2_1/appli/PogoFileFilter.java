//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Pogo class definition .
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.2  2004/08/26 07:25:35  pascal_verdier
// Attributes are now generated as class.
// Look and field changed.
//
// Revision 3.1  2003/09/10 08:08:02  pascal_verdier
// Minor changes
//
// Revision 3.0  2003/04/29 10:42:13  pascal_verdier
// TANGO 3.0 compatibility
// little bugs fixed.
//
// Revision 1.33  2003/01/16 14:32:36  verdier
// Tango classe files detected for open JFileChooser.
//
// Revision 1.32  2002/10/03 13:54:27  verdier
// Pogo has been used without known bug.
// Put class description as class property.
//
// Revision 1.31  2002/04/25 12:05:08  verdier
// IDL 2 implemented for c++ servers
//
// Revision 1.30  2002/02/06 15:21:23  verdier
// Java code generation updated.
//
// Revision 1.26  2001/12/18 10:13:30  verdier
// Attribute user default property code added.
//
// Revision 1.24  2001/04/04 12:22:58  verdier
// Property management added for cpp.
//
// Revision 1.23  2000/10/24 06:21:22  verdier
// The compatibility with TANGO2 has been tested on DatabaseDs.
//
// Revision 1.22  2000/10/02 05:52:20  verdier
// Attribute code generated is now compatible with Tango 2.
//
// Revision 1.21  2000/09/22 08:54:31  verdier
// DevState & DevStatus are virtual.
// First tests with Tango2
// Taco import utility added.
//
// Revision 1.20  2000/07/07 13:30:10  verdier
// Utilities added after first users.
//
// Revision 1.18  2000/06/20 06:57:35  verdier
// Right button double click management added for :
// editing src code, creating item, editing class....
// Little bugs fixed on generation/re-read src code.
//
// Revision 1.17  2000/05/12 07:37:10  verdier
//  Attributes management added for java generation.
//
// Revision 1.16  2000/04/26 06:04:00  verdier
// The save/restore file (.pogo) does not exist anymore.
// DevStates and DevStates allowed management is now available for java.
//
// Revision 1.15  2000/04/18 08:12:47  verdier
// Management of DevStates to allow command added.
//
// Revision 1.14  2000/04/12 09:25:43  verdier
// Methods to manage attributes are now generated
//  Only if at leat one attribute exists.
//
// Revision 1.13  2000/04/11 09:35:07  verdier
// Attributes management added.
//
// Revision 1.2  2000/03/29 13:11:48  verdier
// Doc generation added.
//
// Revision 1.1  2000/02/28 15:41:38  verdier
// Initial revision
//
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================


package pogo.appli;


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


import java.io.File;
import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.Enumeration;
import javax.swing.*;
import javax.swing.filechooser.*;

import pogo.gene.*;

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

    private static String TYPE_UNKNOWN = "Type Unknown";
    private static String HIDDEN_FILE = "Hidden File";

    private Hashtable filters = null;
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
		this.filters = new Hashtable();
    }

    /**
     * Creates a file filter that accepts files with the given extension.
     * Example: new PogoFileFilter("jpg");
     *
     * @see #addExtension
     */
    public PogoFileFilter(String extension) {
		this(extension,null);
    }

    /**
     * Creates a file filter that accepts the given file type.
     * Example: new PogoFileFilter("jpg", "JPEG Image Images");
     *
     * Note that the "." before the extension is not needed. If
     * provided, it will be ignored.
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
     * Creates a file filter from the given string array.
     * Example: new PogoFileFilter(String {"gif", "jpg"});
     *
     * Note that the "." before the extension is not needed adn
     * will be ignored.
     *
     * @see #addExtension
     */
    public PogoFileFilter(String[] filters) {
		this(filters, null);
    }

    /**
     * Creates a file filter from the given string array and description.
     * Example: new PogoFileFilter(String {"gif", "jpg"}, "Gif and JPG Images");
     *
     * Note that the "." before the extension is not needed and will be ignored.
     *
     * @see #addExtension
     */
    public PogoFileFilter(String[] filters, String description) {
		this();
		for (int i = 0; i < filters.length; i++) {
		    // add filters one by one
			addExtension(filters[i]);
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
     * @see FileFilter#accepts
     */
    public boolean accept(File f) {
		if(f != null)
		{
		    if(f.isDirectory())
				return true;
		    String	extension   = getExtension(f);
			if(extension != null && filters.get(getExtension(f)) != null)
			{
				//	Check if Tango class definition (DeviceImpl)
				String	description = getDescription();
				if (description.indexOf("TANGO Classes")>=0)
				{
						PogoUtil	pu = PogoUtil.getInstance();
						if (pu.isDeviceImplClass(f.toString()))
							return true;
						else
							return false;
				}
				else
			    	//	else default one
					return true;
			}
		}
		return false;
    }

    /**
     * Return the extension portion of the file's name .
     *
     * @see #getExtension
     * @see FileFilter#accept
     */
    static public String getExtension(File f) {
		if(f != null)
		{
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
     */
    static public String getExtension(String filename) {
		if(filename != null)
		{
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
     *
     * Note that the "." before the extension is not needed and will be ignored.
     */
    public void addExtension(String extension) {
		if(filters == null)
	    	filters = new Hashtable(5);

		filters.put(extension.toLowerCase(), this);
		fullDescription = null;
	}


    /**
     * Returns the human readable description of this filter. For
     * example: "JPEG and GIF Image Files (*.jpg, *.gif)"
     *
     * @see setDescription
     * @see setExtensionListInDescription
     * @see isExtensionListInDescription
     * @see FileFilter#getDescription
     */
    public String getDescription() {
		if(fullDescription == null)
		{
			if(description == null || isExtensionListInDescription())
			{
				fullDescription = description==null ? "(" : description + " (";
				// build the description from the extension list
				Enumeration extensions = filters.keys();
				if(extensions != null)
				{
					fullDescription += "." + (String) extensions.nextElement();
					while (extensions.hasMoreElements())
						fullDescription += ", " +
								(String) extensions.nextElement();
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
     * @see setDescription
     * @see setExtensionListInDescription
     * @see isExtensionListInDescription
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
     * @see getDescription
     * @see setDescription
     * @see isExtensionListInDescription
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
     * @see getDescription
     * @see setDescription
     * @see setExtensionListInDescription
     */
    public boolean isExtensionListInDescription() {
		return useExtensionsInDescription;
    }





	//===============================================================
	//===============================================================
	private final String[]	cpp_target  = {
									": public Tango::Device_3Impl",
									": public Tango::Device_2Impl",
									": public Tango::DeviceImpl"
									};
	private final String[]	java_target  = {
									" extends DeviceImpl implements TangoConst"
									};
	private final String	cpp_header = "class ";
	private final String	java_header = "class ";
	//===============================================================
	/**
	 *	Return true if a Tango device impl class
	 *	
	 *	@param filename file's name to be checked.
	 */
	//===============================================================
/*
	boolean isDeviceImplClass(File f)
	{
		String filename = f.toString();
		try
		{
			//	Read file content.
			FileInputStream		fidin = new FileInputStream(filename);
			int nb = fidin.available();
			byte[]	inStr  = new byte[nb];
			fidin.read(inStr);
			String readcode = new String(inStr);
			fidin.close();

			int	idx;
			//	Check if cpp device impl
			for (int i=0 ; i<cpp_target.length ; i++)
			{
				if ((idx=readcode.indexOf(cpp_target[i]))>0)
				{
					//System.out.println("Found in " + filename);
					int start = readcode.lastIndexOf(cpp_header, idx);
					int end   = readcode.indexOf('\n', idx);
					String	line = readcode.substring(start, end);
					start += cpp_header.length();
					String classname = readcode.substring(start, idx);
					return true;
				}
			}
			//	Check if java device impl
			for (int i=0 ; i<java_target.length ; i++)
			{
				if ((idx=readcode.indexOf(java_target[i]))>0)
				{
					//System.out.println("Found in " + filename);
					int start = readcode.lastIndexOf(java_header, idx);
					int end   = readcode.indexOf('\n', idx);
					String	line = readcode.substring(start, end);
					start += java_header.length();
					String classname = readcode.substring(start, idx);
					return true;
				}
			}
		}
		catch (Exception e) {}
		return false;
	}
*/

}
