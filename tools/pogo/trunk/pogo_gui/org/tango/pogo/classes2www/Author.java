//+======================================================================
// $Source: /cvsroot/tango-cs/tango/tools/pogo/classes2www/Authors.java,v $
//
// Project:   Tango
//
// Description:  java source code for the Authors class definition .
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
// $Revision: 1.2 $
//
// $Log: Authors.java,v $
//
//-======================================================================

package org.tango.pogo.classes2www;

import java.util.Vector;

class	Author extends Vector<String>
{
	String	name;
	//==========================================
	//==========================================
	Author(String name)
	{
		this.name = name;
	}
	//==========================================
	//==========================================
	public String toString()
	{
		StringBuffer	sb =  new StringBuffer(name + "\t" + size() + ":\n");
		for (Object o : this)
			sb.append('\t').append(o).append('\n');
		return sb.toString();
	}
	//==========================================
	//==========================================
}
