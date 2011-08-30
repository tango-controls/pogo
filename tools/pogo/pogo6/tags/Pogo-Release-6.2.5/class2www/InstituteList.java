//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the InstituteList class definition .
//
// $Author$
//
// Copyright (C) :      2004,2005,2006,2007,2008
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
// Revision 1.2  2008/11/10 15:28:34  pascal_verdier
// *** empty log message ***
//
// Revision 1.1  2008/11/10 15:21:46  pascal_verdier
// *** empty log message ***
//
//-======================================================================

package pogo.class2www;

import pogo.gene.PogoUtil;

import java.util.Vector;

/**
 *	This class is a vector of Sites (Esrf, soleil, ....)
 * 	to manage author list.
 */

public class InstituteList extends Vector
{
	//========================================================
	/**
	 *	A little class defining an institute with
	 * a vector of authors.
	 */
	//========================================================
	public class Institute extends Vector
	{
		/**
		 * Institute name.
		 */
		public String	name;
		/**
		 * Intitute control group address
		 */
		public String	address = null;
		//====================================================
		public Institute(String name, String address)
		{
			this.name    = name;
			if (address.length()>0)
				this.address = address;
		}
		//====================================================
		public String toFullString()
		{
			StringBuffer	sb = new StringBuffer(name);
			sb.append(':');
			if (address!=null)
				sb.append('\t').append(address);
			sb.append('\n');
			for (Object o : this)
				sb.append(o).append('\n');
			return sb.toString();
		}
		//====================================================
		public String toString()
		{
			String	str = name;
			if (address!=null)
				return ": " + address;
			return str;
		}
		//====================================================
	}
	//========================================================
	//========================================================
	public InstituteList(String backup_home)
	{
		try
		{
			String	filename = backup_home + "/log/authors.add";
			String[]	code = PogoUtil.string2array(PogoUtil.readFile(filename), "\n");
			parseInstitutes(code);
			parseAuthors(code);
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
	}
	//========================================================
	//========================================================
	public Institute getInstituteByAuthor(String name)
	{
		for (Object o : this)
		{
			Institute	in = (Institute) o;
			for (Object o2 : in)
			{
				String	author = (String) o2;
				if (author.equals(name))
					return in;
			}
		}
		return null;
	}
	//========================================================
	//========================================================
	public Institute getInstituteByName(String name)
	{
		for (Object o : this)
		{
			Institute	in = (Institute) o;
			if (in.name.equals(name))
				return in;
		}
		return null;
	}
	//========================================================
	//========================================================
	private void parseAuthors(String[] code)
	{
		for (Object o : this)
		{
			Institute	in = (Institute) o;
			String	in_name = in.name + ":";
			boolean	found = false;
			for (String line : code)
			{
				if (line.startsWith(in_name))
					found = true;
				else
				if (line.indexOf(':')>0)
					found = false;
				else
				if (found && line.trim().length()>0)
					in.add(line.trim());
			}
		}
	}
	//========================================================
	//========================================================
	private void parseInstitutes(String[] code)
	{
		int	pos;
		for (String	line : code)
			if ((pos=line.indexOf(':'))>0)
			{
				String	name = line.substring(0, pos);
				String	add  = line.substring(pos+1).trim();
				add(new Institute(name, add));
			}
	}
	//========================================================
	//========================================================
	public String toString()
	{
		StringBuffer	sb = new StringBuffer();
		for (Object o : this)
			sb.append(((Institute)o).toFullString()).append('\n');
		return sb.toString();
	}
	//========================================================
	//========================================================
	public static void main(String[] args)
	{
		String backup_home = System.getProperty("_BACKUP_HOME_");
		if (backup_home==null)
		{
			System.out.println("_BACKUP_HOME_ has not been set");
			return;
		}
		InstituteList	il = new InstituteList(backup_home);
		//System.out.println(il);

		String[]	authors = { "verdier", "meyer", "jensmeyer", "joe", "pascal_verdier"};
		for (String author : authors)
		{
			Institute	in = il.getInstituteByAuthor(author);
			System.out.println(author + ":	" + in);
		}
	}
}
