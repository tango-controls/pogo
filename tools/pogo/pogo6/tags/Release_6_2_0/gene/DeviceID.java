//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  Basic Dialog Class to display info
//
// $Author$
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009
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
// $Revision$
//
// $Log$
//
//-======================================================================

package pogo.gene;


/** 
 *	This class is able to define the device identification
 *
 * @author  verdier
 */
 
import fr.esrf.tangoatk.widget.util.ErrorPane;

import javax.swing.JFrame;
import java.io.File;
import java.util.Vector;



public class  DeviceID
{
	public boolean	failed = false;
	public String	classname    = "";
	public String	contact      = "";
	public String	family       = "Miscellaneous";
	public String	site         = "";
	public String	platform     = "";
	public String	bus          = "";
	public String	manufacturer = "none";
	public String	reference    = "";
	
	private static final String	CLASS_NAME   = "Class Name";
	private static final String	CONTACT      = "Contact";
	private static final String	CLASS_FAMILY = "Class Family";
	private static final String	SPECIFIC     = "Specific";
	private static final String	PLATFORM     = "Platform";
	private static final String	BUS          = "Bus";
	private static final String	MANUFACTURER = "Manufacturer";
	private static final String	REFERENCE    = "Reference";
	private static final String	TITLE        = "Device Class Identification:";
	private static final String	filename     = "TangoClassID.txt";

	//===============================================================
	//===============================================================
	public DeviceID()
	{
		failed = true;
	}
	//===============================================================
	//===============================================================
	public DeviceID(String	classname,
					String	contact,
					String	family,
					String	site,
					String	platform,
					String	bus,
					String	manufacturer,
					String	reference)
	{
		this.classname    = classname;
		this.family       = family;
		this.site         = site;
		this.contact      = contact;
		this.platform     = platform;
		this.bus          = bus;
		this.manufacturer = manufacturer;
		this.reference    = reference;
	}
	//===============================================================
	//===============================================================
	public DeviceID(String code)
	{
		String	tmp;
		int	start = code.indexOf(TITLE);
		if (start>0)
		{
			int end = code.indexOf("*/", start);
			if (end>0)
			{
				code         = code.substring(start, end);
				classname    = getValue(code, CLASS_NAME);
				contact      = getValue(code, CONTACT);
				tmp  = getValue(code, CLASS_FAMILY);
				if (tmp.trim().length()>0)
					family   = tmp;
				tmp  = getValue(code, SPECIFIC);
				if (tmp.trim().length()>0)
					site   = tmp;
				platform     = getValue(code, PLATFORM);
				bus          = getValue(code, BUS);
				manufacturer = getValue(code, MANUFACTURER);
				reference    = getValue(code, REFERENCE);
				return;
			}
		}
		failed = true;
		return;
	}
	//===============================================================
	//===============================================================
	private String getValue(String code, String name)
	{
		int	start = code.indexOf(name);
		if (start>0)
		{
			start = code.indexOf(':', start);
			if (start>0)
			{
				start++;
				int	end = code.indexOf('\n', start);
				if (end>0)
					return code.substring(start, end).trim();
				else
					return code.substring(start).trim();
			}
		}
		if (name.equals(SPECIFIC)==false)
			failed = true;
		return "";
	}
	//===============================================================
	//===============================================================
	public String toString()
	{
		StringBuffer	sb = new StringBuffer("/**\n");
		sb.append(" * ").append(TITLE).append("\n");
		sb.append(" * ").append("\n");
		sb.append(" * ").append(CLASS_NAME).append("   :\t").append(classname).append("\n");
		sb.append(" * ").append(CONTACT).append("      :\t").append(contact).append("\n");
		sb.append(" * ").append(CLASS_FAMILY).append(" :\t").append(family).append("\n");
		if (site!=null && site.length()>0)
		sb.append(" * ").append(SPECIFIC).append("     :\t").append(SPECIFIC).append("\n");
		sb.append(" * ").append(PLATFORM).append("     :\t").append(platform).append("\n");
		sb.append(" * ").append(BUS).append("          :\t").append(bus).append("\n");
		sb.append(" * ").append(MANUFACTURER).append(" :\t").append(manufacturer).append("\n");
		sb.append(" * ").append(REFERENCE).append("    :\t").append(reference).append("\n");
		sb.append(" */\n");
		
		return sb.toString();
	}
	//===============================================================
	//===============================================================
	private String getHidenContact()
	{
		int	idx = contact.indexOf('@');
		if (idx<0)
			return "";
		String	name = contact.substring(0, idx);
		String	domain = contact.substring(idx+1);
		return " at " + domain + " - " + name;
	}
	//===============================================================
	//===============================================================
	public String toHtmlString()
	{
		if (failed)
			return null;
		StringBuffer	sb = new StringBuffer("<Br><h2>Class Identification:</h2>\n<ul>\n");
		sb.append("	<li><b>" + CONTACT + "      :</b>\t" + getHidenContact() +"\n");
		sb.append("	<li><b>" + CLASS_FAMILY + " :</b>\t"  + family +"\n");
		if (site!=null && site.length()>0)
		sb.append("	   (" + site + "     " + SPECIFIC +")\n");
		sb.append("	<li><b>" + PLATFORM + "     :</b>\t" + platform + "\n");
		sb.append("	<li><b>" + BUS + "          :</b>\t" + bus + "\n");

		if (manufacturer.length()>0 && manufacturer.equals("none")==false)
		{
			sb.append("	<li><b>" + MANUFACTURER + " :</b>\t" + manufacturer + "\n");
			if (reference.length()>0 && reference.length()>0)
				sb.append("	<li><b>" + REFERENCE + "    :</b>\t" + reference + "\n");
		}
		sb.append("</ul>");
		return sb.toString();
	}
	//===============================================================
	//===============================================================
	public static boolean useRepository(String class_filename)
	{
		int		idx = class_filename.lastIndexOf('/');
		if (idx<0)
			idx = class_filename.lastIndexOf('\\');
		idx++;
		String	dir = class_filename.substring(0, idx);

		if (new File(dir + "CVS").exists())
			return true;
		return new File(dir + ".svn").exists();
	}
	//===============================================================
	//===============================================================
	public static String getFilename(String class_filename)
	{
		int		idx = class_filename.lastIndexOf('/');
		if (idx<0)
			idx = class_filename.lastIndexOf('\\');
		idx++;
		return class_filename.substring(0, idx) + filename;
	}
	//===============================================================
	//===============================================================
}
