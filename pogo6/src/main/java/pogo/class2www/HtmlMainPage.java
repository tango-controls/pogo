//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the HtmlMainPage class definition .
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

import pogo.gene.PogoUtil;

import java.io.IOException;
import java.util.Vector;


/**
 *	This class is able to
 *
 * @author  verdier
 */

public class  HtmlMainPage
{
	public Repositories	repositories;
	private	String		title;
	private String[]	repos_names;
	private String[]	link_to;

	//===============================================================
	//===============================================================
	public HtmlMainPage(String title, Repositories repositories, String[] repos_names, String[] link_to)
	{
		this.repositories = repositories;
		this.repos_names  = repos_names;
		this.link_to      = link_to;
		this.title        = title;
		if (title==null)
			this.title = "Repository";
	}
	//===============================================================
	//===============================================================
	public void generate()
	{
		generateIndex();
		generateList();
		generateFamilyPages();
		generateAlphabetical();
	}
	//===============================================================
	//===============================================================
	private void generateFamilyPages()
	{
		//	read header and footer
		String	header = Utils.readTemplateFile("header.html");
		String	footer = Utils.readTemplateFile("footer.html");
		if (header==null)
			return;
		for (String	name : repos_names)
		{
			//	Add repository name
			Repository	repository = repositories.getRepository(name);
			for (Object o2 : repository.families)
			{
				Family	family = (Family) o2;
				family.generateHtmlPage(header, footer, repository);
			}
		}
	}
	//===============================================================
	//===============================================================
	private void generateList()
	{
		//	Put header and add title
		StringBuffer	sb = new StringBuffer(IHtmlTemplates.head_list);
		sb.append("<Font Size=+1><b> &nbsp;&nbsp;").append(title).append("</b></Font> \n");
		if (repos_names.length>1)
		{
			int	nb = 0;
			for (String name: repos_names)
				nb += repositories.getRepository(name).nbClasses();
			sb.append(" <Br><Font Size=-1> &nbsp;&nbsp;").append(nb).append(" Classes</Font><Br>\n");
		}
		for (String name : repos_names)
		{
			sb.append("<Br><Br>\n");
			//	Add repository name
			Repository	repository = repositories.getRepository(name);
			sb.append("<b> ").append(repository.name).append(":</b><Br>\n");
			sb.append("<Font Size=-1> ").append(repository.nbClasses()).append(" Classes</Font>\n");

			//	And family names
			sb.append("<Font Size=-1> \n");
			for (Object o2 : repository.families)
				sb.append(((Family) o2).getListLine(repository));
			sb.append("</Font> \n");
		}

		sb.append("<Br><Br>").append(getBottomList());

		try
		{
			String	path = repositories.getRepository(repos_names[0]).home;
			PogoUtil.writeFile(path + "/" + IHtmlTemplates.html_list, sb.toString());
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
	//===============================================================
	//===============================================================
	private String getBottomList()
	{
		StringBuffer	sb = new StringBuffer(IHtmlTemplates.head_list);
		String	str = IHtmlTemplates.bottom;
		sb.append(str);

		//	Is there links to insert ?
		for (String s : link_to)
		{
			//	Buid item
			String item = IHtmlTemplates.bottom_item;
			Repository	rep = repositories.getRepository(s);
			String	link = rep.home + "/" + IHtmlTemplates.html_index;
			item = PogoUtil.strReplace(item, "$LINK", link);
			item = PogoUtil.strReplace(item, "$TEXT", rep.name + " Classes");

			sb.append(item);
		}
		return sb.toString();
	}
	//===============================================================
	//===============================================================
	private void generateIndex()
	{
		StringBuffer	sb = new StringBuffer(IHtmlTemplates.head_list);
		String	str = IHtmlTemplates.index;
		Repository	repository = repositories.getRepository(repos_names[0]);
		String	path = "";
		if (repository.home.equals("."))
			path = repository.name + "/";
		path += repository.default_family;
		str = PogoUtil.strReplace(str, "$PATH", path );
		sb.append(str);
		try
		{
			PogoUtil.writeFile(repository.home + "/" + IHtmlTemplates.html_index, sb.toString());
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
	//===============================================================
	//===============================================================
	private void generateAlphabetical()
	{
		//	Build a vector with all modules and sort by name
		Vector	modules = new Vector();
		for (String rep_name : repos_names)
		{
			Repository	repository = repositories.getRepository(rep_name);
			for (Object o : repository.families)
			{
				Family family = (Family) o;
				for (int i=0 ; i<family.size() ; i++)
				{
					Module	module = family.getModule(i);
					if (module.server!=null)
						modules.add(module);
				}
			}
		}
		modules = Utils.getInstance().sort(modules);

		//	Read header and start to build page
		String	header = Utils.readTemplateFile("header.html");
		StringBuffer	sb = new StringBuffer(header);
		sb.append("<Center><h1><u>Tango Device Server Classes List</u></h1></Center><Br /><Br />\n");
		sb.append("<Br /><Br /><HR WIDTH=\"100%\" />\n");
		sb.append("<Center>\n");
		sb.append("Class Index :<Br />\n");

		//	Build alphabetic list
		char	previous_start = ' ';
		for (Object o : modules)
		{
			Module	module = (Module) o;
			if (module.server!=null)
			{
				char	new_start = module.server.class_name.toUpperCase().charAt(0);
				if (new_start!=previous_start)
				{
					String	ch = "" + new_start;
					sb.append("<a href=\"#").append(ch).append("\"> ").append(ch).append(" </a>\n");
					previous_start = new_start;
				}
			}
		}
		sb.append("</Center>");

		previous_start = 'A';
		sb.append("<A Name=\"").append(previous_start).append("\" />");
		for (Object o : modules)
		{
			Module	module = (Module) o;
			if (module.server!=null)
			{
				char	new_start = module.server.class_name.toUpperCase().charAt(0);
				//	Check if first letterhas changed
				if (new_start!=previous_start)
				{
					sb.append("<A Name=\"").append(new_start).append("\" />");
					previous_start = new_start;
				}
				sb.append(module.getSummary());
			}
		}
		String	footer = Utils.readTemplateFile("footer.html");
		sb.append(footer);


		try
		{
			Repository	repository = repositories.getRepository(repos_names[0]);
			PogoUtil.writeFile(repository.home + "/" + IHtmlTemplates.html_alpha, sb.toString());
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
	//===============================================================
	//===============================================================
}
