//+======================================================================
// $Source: /cvsroot/tango-cs/tango/tools/pogo/classes2www/InstituteList.java,v $
//
// Project:   Tango
//
// Description:  java source code for the InstituteList class definition .
//
// $Author: pascal_verdier $
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
// $Revision: 1.3 $
//
// $Log: InstituteList.java,v $
//
//-======================================================================

package org.tango.pogo.classes2www;

import org.tango.pogo.pogo_gui.tools.ParserTool;

import java.util.Vector;

/**
 *	This class is a vector of Sites (Esrf, soleil, ....)
 * 	to manage author list.
 */

public class InstituteList extends Vector<Institute>
{
	//========================================================
	//========================================================
	public InstituteList(String backup_home)
	{
		try {
			String	filename = backup_home + "/log/authors.add";
			String[]	code = Utils.string2array(ParserTool.readFile(filename), "\n");
			parseInstitutes(code);
			parseAuthors(code);
		}
		catch (Exception e) {
			System.err.println(e);
		}
	}
	//========================================================
	//========================================================
	public Institute getInstituteByAuthor(String name)
	{
		for (Institute institute : this) {
			for (String author : institute) {
				if (author.equals(name))
					return institute;
			}
		}
		return null;
	}
	//========================================================
	//========================================================
	private void parseAuthors(String[] code)
	{
		for (Institute institute : this)
		{
			String	in_name = institute.name + ":";
			boolean	found = false;
			for (String line : code) {
				if (line.startsWith(in_name))
					found = true;
				else
				if (line.indexOf(':')>0)
					found = false;
				else
				if (found && line.trim().length()>0)
					institute.add(line.trim());
			}
		}
	}
	//========================================================
	//========================================================
	private void parseInstitutes(String[] code)
	{
		int	pos;
		for (String	line : code)
			if ((pos=line.indexOf(':'))>0) {
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
}
