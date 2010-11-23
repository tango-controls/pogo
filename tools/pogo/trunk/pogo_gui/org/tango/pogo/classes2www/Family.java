//+======================================================================
// $Source: /cvsroot/tango-cs/tango/tools/pogo/classes2www/Family.java,v $
//
// Project:   Tango
//
// Description:  java source code for the Family class definition .
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
// $Log: Family.java,v $
//
//-======================================================================

package org.tango.pogo.classes2www;


/** 
 *	This class is able to define a family of classes.
 *
 * @author  verdier
 */

import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;
import org.tango.pogo.pogo_gui.tools.ParserTool;

import java.util.Date;
import java.util.Vector;


public class  Family extends Vector<Module>
{
	public String	name;
	//===============================================================
	//===============================================================
	public Family(String name)
	{
		this.name = name;
	}
	//===============================================================
	//===============================================================
	public Module getModule(int i)
	{
		return get(i);
	}
    /*
	//===============================================================
	//===============================================================
	public Module getModule(String name)
	{
		for (Module module: this)
		if (module.name.equals(name))
			return module;
		return null;
	}
	*/
	//===============================================================
	//===============================================================
	public void sort()
	{
		Utils.getInstance().sort(this);
	}
	//===============================================================
	//===============================================================
	public int nbClasses()
	{
		int	nb = 0;
		for (Module module : this) {
			if (module.server!=null)
				nb++;
		}
		return nb;
	}
	//===============================================================
	//===============================================================
	public String toString()
	{
		StringBuffer	sb = new StringBuffer(name);
		sb.append("\n");
		for (Module module : this)
			sb.append("\t").append(module).append("\n");
		return sb.toString();
	}
	//===============================================================
	//===============================================================




	//===============================================================
	/*
	 *	HTML code management
	 */
	//===============================================================
	public void generateHtmlPage(String header, String footer, Repository repos)
	{
		//	Build page
		StringBuffer	sb = new StringBuffer(header);
		sb.append(IHtmlTemplates.warning);
		String	str = buildTableHeader(repos.name);
		sb.append(str);
		for (Module module : this)
		{
			str = module.getTableLine();
			sb.append(str);
		}
		str = buildTableFooter();
		sb.append(str);
		sb.append(footer);

		//	And write file
		try
		{
			ParserTool.writeFile(repos.name + "/" +
					name + "/" + IHtmlTemplates.html_index, sb.toString());
		}
		catch(DevFailed e)
		{
			Except.print_exception(e);
		}
	}
	//===============================================================
	//===============================================================
	public String getListLine(Repository repository)
	{
		String	link = "";
		if (repository.home.equals("."))
			link = repository.name + "/";
		link += name + "/" + IHtmlTemplates.html_index;

		String	line = IHtmlTemplates.list_line;
		line = Utils.strReplace(line, "$LINK", link);
		line = Utils.strReplace(line, "$TEXT", name);
		return line;
	}
	//===============================================================
	//===============================================================
	private String buildTableHeader(String repos_name)
	{
		String	str = IHtmlTemplates.table_header;
		str = Utils.strReplace(str, "$NUMBER", Integer.toString(nbClasses()));
		str = Utils.strReplace(str, "$FAMILY", name);
		str = Utils.strReplace(str, "$REPOSITORY", repos_name);
		return str;
	}
	//===============================================================
	//===============================================================
	private String buildTableFooter()
	{
		String	str = IHtmlTemplates.table_footer;
		str = Utils.strReplace(str, "$DATE", new Date().toString());
		return str;
	}
	//===============================================================
	//===============================================================
}
