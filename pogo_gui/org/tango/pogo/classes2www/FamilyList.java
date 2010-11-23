//+======================================================================
// $Source: /cvsroot/tango-cs/tango/tools/pogo/classes2www/FamilyList.java,v $
//
// Project:   Tango
//
// Description:  java source code for the FamilyList class definition .
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
// $Revision: 1.1 $
//
// $Log: FamilyList.java,v $
//
//-======================================================================

package org.tango.pogo.classes2www;


/** 
 *	This class is able to manage a list of Family object
 *
 * @author  verdier
 */

import java.util.Vector;



public class  FamilyList extends Vector<Family>
{
	public String	name;
	//===============================================================
	//===============================================================
	public FamilyList(String name)
	{
		this.name = name;
	}
	//===============================================================
	//===============================================================
	public Family getFamily(String name)
	{
		for (Family family: this)
		if (family.name.toLowerCase().equals(name.toLowerCase()))
			return family;
		return null;
	}
	//===============================================================
	//===============================================================
	public String getSummary()
	{
		StringBuffer	sb = new StringBuffer(name);
		sb.append(":\n");
		sb.append("\t").append(size()).append("  families");
		int	nb = 0;
		for (Family family :this)
			nb += family.nbClasses();
		sb.append("\t").append(nb).append("  servers");
		return sb.toString();
	}

	//===============================================================
	//===============================================================
	public String toString()
	{
		StringBuffer	sb = new StringBuffer();
		for (Family family :this)
			sb.append(family).append("\n");
		return sb.toString();
	}
	//===============================================================
	//===============================================================

}
