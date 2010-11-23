//+======================================================================
// $Source: /cvsroot/tango-cs/tango/tools/pogo/classes2www/TangoDsRepository.java,v $
//
// Project:   Tango
//
// Description:  java source code for the TangoDsRepository class definition .
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
// $Log: TangoDsRepository.java,v $
//
//-======================================================================

package org.tango.pogo.classes2www;


/** 
 *	This class is able to manage tango-ds repository.
 *
 * @author  verdier
 */

import fr.esrf.Tango.DevFailed;


public class TangoDsRepository extends Repository
{
	private static final String	cvs_path = "tango-ds/cvsroot";
	//===============================================================
	//===============================================================
	public TangoDsRepository(String backup_home, boolean check_svn) throws DevFailed
	{
		super(backup_home + "/" + cvs_path);
		name = "tango-ds";
		url  = "http://tango-ds.cvs.sourceforge.net/viewvc/tango-ds/";
		home = ".";
		default_family = "";
		families = new FamilyList(cvs_path);
		this.check_svn = check_svn;
	}
	//===============================================================
	//===============================================================
	public void parseCvsModule()
	{
		String[]	lines = Utils.string2array(str_module, "\n");
		Family		family = null;
		boolean		libraries = false;
		for (String	line : lines)
		{
			line = line.trim();
			//	Check if family name
			if (line.startsWith("###"))
			{
				String[]	tmp = Utils.string2array(line);
				String	f_name = tmp[1];
				//	If more than one word
				for (int i=2 ; i<tmp.length ; i++)
					f_name += "_" + tmp[i];
				libraries = f_name.equals("Libraries");
				if (!libraries)
				{
					family = new Family(f_name);
					families.add(family);
				}
			}
			else
			if (!libraries)
				if (! line.startsWith("#")	//	Not a comment
					&& family!=null)
				{
					String[]	tmp = Utils.string2array(line);
					Module	module = new Module(tmp[0], tmp[1], this, family, CVS);
					family.add(module);
				}
		}
	}
	//===============================================================
	//===============================================================
}
