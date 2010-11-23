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


import java.util.Vector;
//========================================================
/**
 *	A little class defining an institute with
 * a vector of authors.
 */
//========================================================
public class Institute extends Vector<String>
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
