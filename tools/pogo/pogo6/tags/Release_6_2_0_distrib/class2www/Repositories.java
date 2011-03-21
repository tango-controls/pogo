//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Repositories class definition .
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

import java.util.Vector;


public class Repositories extends Vector
{
	//=====================================================
	//=====================================================
	public Repositories()
	{
		super();
	}
	//=====================================================
	//=====================================================
	public Repository getRepository(int i)
	{
		return (Repository) get(i);
	}
	//=====================================================
	//=====================================================
	public Repository getRepository(String name)
	{
		for (Object o : this)
		{
			Repository	rep = (Repository) o;
			if (rep.name.toLowerCase().equals(name.toLowerCase()))
				return rep;
		}
		return null;
	}
	//=====================================================
	//=====================================================
}
