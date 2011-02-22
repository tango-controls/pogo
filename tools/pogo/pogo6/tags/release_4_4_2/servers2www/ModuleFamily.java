//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the ScanRepository class definition .
//
// $Author$
//
// $Revision$
//
// $Log$
// Revision 1.2  2004/10/29 10:52:34  pascal_verdier
// Tango-ds compatibility added.
//
// Revision 1.1  2004/10/25 14:01:54  pascal_verdier
// Servers are now sorted in sections.
//
//
//
// Copyright 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.servers2www;


/** 
 *	This class is able to scan the CVS reppository to extract TANGO servers for one family.
 *
 * @author  verdier
 * @Revision 
 */
 
import fr.esrf.Tango.*;
import fr.esrf.TangoDs.*;
import fr.esrf.TangoApi.*;
import pogo.gene.*;

import java.io.*;
import java.util.*;



public class  ModuleFamily extends Vector implements PogoDefs
{
	String	name;
	String	repository;
	
	public ModuleFamily(String name, String repository)
	{	
		super();
		this.name       = name;
		this.repository = repository;
	}
	//===============================================================
	//===============================================================
	void sort()
	{
		MyCompare	comp = new MyCompare();
		Collections.sort(this, comp);
	}
	//===============================================================
	//===============================================================
	String serverAt(int idx)
	{
		return (String)elementAt(idx);
	}
	//===============================================================
	//===============================================================
	String fileName()
	{
		//	Take off special char from name
		int		end;
		String	str;
		if ((end=name.indexOf(" "))>0)
			str = name.substring(0, end);
		else
		if ((end=name.indexOf("/"))>0)
			str = name.substring(0, end);
		else
			str = name;

		String	rep = repository;
		if ((end=repository.indexOf("("))>0)
		{
			rep = repository.substring(end+1, repository.indexOf(")"));
			//	Replace '-'  by '_'
			//if ((end=repository.indexOf("-"))>0)
			//	repository = repository.substring(0, end) + "_" +
			//					repository.substring(end+1);
		}
		else
		if ((end=name.indexOf(" "))>0)
			str = name.substring(0, end);

			

		return rep+ "_" + str;
	}
	//===============================================================
	//===============================================================
	public String toString()
	{
		String	s = name + ":	" + size() + " TANGO servers found:\n";
		for (int i=0 ; i<size() ; i++)
			s += (String)elementAt(i) + "\n";
		return s;
	}
	//===============================================================
	//===============================================================




	//======================================================
	/**
	 *	MyCompare class to sort collection
	 */
	//======================================================
	class  MyCompare implements Comparator
	{
		public int compare(Object o1, Object o2)
		{
			String	s1 = ((String)o1).toLowerCase();
			String	s2 = ((String)o2).toLowerCase();
			return s1.compareTo(s2);
		}
	}
}
