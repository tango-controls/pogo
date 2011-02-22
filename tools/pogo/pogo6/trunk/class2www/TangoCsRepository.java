//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the TangoCsRepository class definition .
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
// Revision 1.1  2008/11/10 15:21:46  pascal_verdier
// *** empty log message ***
//
//-======================================================================

package pogo.class2www;


/** 
 *	This class is able to
 *
 * @author  verdier
 */

import fr.esrf.Tango.DevFailed;
import pogo.gene.PogoUtil;


public class TangoCsRepository extends Repository
{
	private static final String	cvs_path = "tango-cs/cvsroot";
	//===============================================================
	//===============================================================
	public TangoCsRepository(String backup_home, boolean check_svn) throws DevFailed
	{
		super(backup_home + "/" + cvs_path);
		name = "tango-cs";
		url  = "http://tango-cs.cvs.sourceforge.net/viewvc/tango-cs/";
		home = ".";
		default_family = "System";
		families = new FamilyList(cvs_path);
		this.check_svn = check_svn;
	}
	//===============================================================
	//===============================================================
	public void parseCvsModule()
	{
		String[]	lines = PogoUtil.string2array(str_module, "\n");
		Family		family;
		for (int i=0 ;i<lines.length ; i++)
		{
			String	line = lines[i].trim();
			//	Check Module name
			if (line.startsWith("#M"))
			{
				String[]	tmp = PogoUtil.string2array(line);
				String		module_name = tmp[1];
				//	Check family name
				String		f_name;
				if (tmp.length>2 && tmp[2].indexOf(':')>0)
					f_name = tmp[2].substring(0, tmp[2].indexOf(':'));
				else
					f_name = "Miscellaneous";

				tmp = PogoUtil.string2array(lines[i+1]);
				String	path = tmp[1];
				//	Check if server
				if (path.indexOf("server/")>0)	//	cppserver, jserver,....
				{
					//	Check if already exists
					family = families.getFamily(f_name);
					if (family==null)
					{
						family = new Family(f_name);
						families.add(family);
					}
					Module	module = new Module(module_name, path, this, family, CVS);
					family.add(module);
				}
			}
		}
	}
	//===============================================================
	//===============================================================
}
