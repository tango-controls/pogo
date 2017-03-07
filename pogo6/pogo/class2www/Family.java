//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Family class definition .
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

import pogo.gene.PogoUtil;

import java.io.IOException;
import java.util.Date;
import java.util.Vector;


public class  Family extends Vector
{
	public String	name;
	//===============================================================
	//===============================================================
	public Family(String name)
	{
		//	Set first char to upper and else to lower
		//name = name.toUpperCase();
		//name = name.substring(0,1) + name.substring(1).toLowerCase();
		this.name = name;
	}
	//===============================================================
	//===============================================================
	public Module getModule(int i)
	{
		return (Module)get(i);
	}
	//===============================================================
	//===============================================================
	public Module getModule(String name)
	{
		for (Object o: this)
		if (((Module)o).name.equals(name))
			return (Module)o;
		return null;
	}
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
		for (Object o : this)
		{
			Module	module  = (Module) o;
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
		for (Object o : this)
			sb.append("\t").append(o).append("\n");
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
		for (Object o : this)
		{
			Module	module = (Module) o;
			str = module.getTableLine();
			sb.append(str);
		}
		str = buildTableFooter();
		sb.append(str);
		sb.append(footer);

		//	And write file
		try
		{
			PogoUtil.writeFile(repos.name + "/" +
					name + "/" + IHtmlTemplates.html_index, sb.toString());
		}
		catch(IOException e)
		{
			System.err.println(e);
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
		line = PogoUtil.strReplace(line, "$LINK", link);
		line = PogoUtil.strReplace(line, "$TEXT", name);
		return line;
	}
	//===============================================================
	//===============================================================
	private String buildTableHeader(String repos_name)
	{
		String	str = IHtmlTemplates.table_header;
		str = PogoUtil.strReplace(str, "$NUMBER", Integer.toString(nbClasses()));
		str = PogoUtil.strReplace(str, "$FAMILY", name);
		str = PogoUtil.strReplace(str, "$REPOSITORY", repos_name);
		return str;
	}
	//===============================================================
	//===============================================================
	private String buildTableFooter()
	{
		String	str = IHtmlTemplates.table_footer;
		str = PogoUtil.strReplace(str, "$DATE", new Date().toString());
		return str;
	}
	//===============================================================
	//===============================================================
}
