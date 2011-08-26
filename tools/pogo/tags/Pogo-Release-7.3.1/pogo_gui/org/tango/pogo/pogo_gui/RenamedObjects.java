//+======================================================================
//
// Project:   Tango
//
// Description:	java source code to manage renamed objects.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011
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
// $Revision: $
// $Date:  $
//
// $HeadURL: $
//
//-======================================================================

package org.tango.pogo.pogo_gui;


/** 
 *	This class is able to manage a vector of renamed objects
 *
 * @author  verdier
 */
 
import fr.esrf.Tango.DevFailed;

import java.util.Vector;

import org.tango.pogo.pogo_gui.tools.PogoParser;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Command;




public class  RenamedObjects extends Vector
{
	//===============================================================
	//===============================================================
	private class OneRenamed
	{
		Object	old_;
		Object	new_;
		String	code = null;
		OneRenamed(Object old_, Object new_)
		{
			this.old_ = old_;
			this.new_ = new_;
		}
		//===========================================================
		public String toString()
		{
			if (old_ instanceof Command)
				return ((Command)old_).getName() + " --> " +
						((Command)new_).getName();
			else
			if (old_ instanceof Attribute)
				return ((Attribute)old_).getName() + " --> " +
						((Attribute)new_).getName();
			else
			return old_.toString();
		}
	}
	//===============================================================
	//===============================================================
	public RenamedObjects()
	{
	}
	//===============================================================
	//===============================================================
	public void add(Object old_, Object new_)
	{
		//	Check if already exists (old name is a new name of already renamed)
		for (Object obj : this)
		{
			OneRenamed	renamed = (OneRenamed)obj;
			if (new_ instanceof Command && renamed.new_ instanceof Command)
			{
				Command	cmd1  = (Command)old_;
				Command	cmd2  = (Command)renamed.new_;
				if (cmd1.getName().equals(cmd2.getName()))
				{
					//	Found -> replace
					renamed.new_ = new_;
					return;
				}
			}
			else
			if (new_ instanceof Attribute && renamed.new_ instanceof Attribute)
			{
				Attribute	att1  = (Attribute)old_;
				Attribute	att2  = (Attribute)renamed.new_;
				if (att1.getName().equals(att2.getName()))
				{
					//	Found -> replace
					renamed.new_ = new_;
					return;
				}
			}
		}
		//	Not found --> Add new object
		add(new OneRenamed(old_, new_));
	}
	//===============================================================
	/**
	 *	parse code for all renamed objects
	 */
	//===============================================================
	void readCode(String classname, String filename) throws DevFailed
	{
		try
		{
			PogoParser	parser = new PogoParser(filename);
			for (Object obj : this)
			{
				OneRenamed	renamed = (OneRenamed)obj;
				String	key = classname+"::";
				if (renamed.old_ instanceof Command)
				{
					Command	cmd  = (Command)renamed.old_;
					renamed.code = parser.getProtectedCode(key + cmd.getExecMethod());
				}
				else
				if (renamed.old_ instanceof Attribute)
				{
					Attribute	att  = (Attribute)renamed.old_;
					renamed.code = parser.getProtectedCode(key + "read_"+att.getName());
				}
			}
		}
		catch (DevFailed e)
		{
			if (e.errors[0].desc.indexOf("FileNotFoundException")<0)
				throw e;
		}
	}
	//===============================================================
	/**
	 *	Insert parsed code for all renamed objects
	 */
	//===============================================================
	void insertCode(String classname, String filename) throws DevFailed
	{
		PogoParser	parser = new PogoParser(filename);
		boolean		modified = false;
		for (Object obj : this)
		{
			OneRenamed	renamed = (OneRenamed)obj;
			
			//	Check if there is something to insert
			if (renamed.code!=null &&
				renamed.code.trim().length()>0)
			{
				if (renamed.new_ instanceof Command)
				{
					Command	cmd  = (Command)renamed.new_;
					parser.insertInProtectedZone(classname, 
							cmd.getExecMethod(), renamed.code);
				}
				else
				if (renamed.new_ instanceof Attribute)
				{
					Attribute	att  = (Attribute)renamed.new_;
					parser.insertInProtectedZone(classname, 
							"read_"+att.getName(), renamed.code);
				}
				modified = true;
			}
		}
		if (modified)
			parser.write();
		clear();
	}
	//===============================================================
	//===============================================================
}
