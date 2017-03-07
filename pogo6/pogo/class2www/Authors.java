//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Authors class definition .
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
import java.util.Comparator;
import java.util.Collections;

public class Authors extends Vector
{
	class	Author extends Vector
	{
		String	name;
		//==========================================
		Author(String name)
		{
			this.name = name;
		}
		//==========================================
		public String toString()
		{
			StringBuffer	sb =  new StringBuffer(name + "\t" + size() + ":\n");
			for (Object o : this)
				sb.append('\t').append(o).append('\n');
			return sb.toString();
		}
		//==========================================

	}
	//==========================================
	//==========================================
	public Authors()
	{
		super();
	}
	//==========================================
	//==========================================
	public void addClass(Module module)
	{
		Author	author = getAuthor(module.server.author);
		if (author==null)
		{
			author = new Author(module.server.author);
			super.add(author);
		}
		author.add(module.server.class_name);
	}
	//==========================================
	//==========================================
	public void addClass(String authname, String classname)
	{
		Author	author = getAuthor(authname);
		if (author==null)
		{
			author = new Author(authname);
			super.add(author);
		}
		author.add(classname);
	}
	//==========================================
	//==========================================
	public int getNbClass(String name)
	{
		Author	author = getAuthor(name);
		if (author==null)
			return 0;
		else
			return author.size();
	}
	//==========================================
	//==========================================
	private Author getAuthor(String name)
	{
		for (Object o : this)
			if (((Author)o).name.equals(name))
				return (Author)o;
		return null;
	}
	//==========================================
	//==========================================
	public String toString()
	{
		MyCompare		compare = new MyCompare();
		Collections.sort(this, compare);

		StringBuffer	sb = new StringBuffer();
		for (Object o : this)
			sb.append(o).append('\n');
		return sb.toString();
	}
	//==========================================
	//==========================================

	//======================================================
	/**
	 *	MyCompare class to sort collection
	 */
	//======================================================
	class  MyCompare implements Comparator
	{
		public int compare(Object o1, Object o2)
		{
			if (o1 instanceof String && o2 instanceof String)
			{
				String	s1 = o1.toString().toLowerCase();
				String	s2 = o2.toString().toLowerCase();
				if (s1==null)
					return 1;
				else
				if (s2==null)
					return -1;
				else
					return s1.compareTo(s2);
			}
			else
			if (o1 instanceof Author && o2 instanceof Author)
			{
				int	s1 = ((Author)o1).size();
				int s2 = ((Author)o2).size();
				return (s1<s2)? 1 : -1;
			}
			else
				return 0;
		}
	}
	//===============================================================
	//===============================================================

}
