//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the HTMLpage class definition .
//
// $Author$
//
// $Revision$
//
// $Log$
// Revision 1.8  2005/09/06 06:16:29  pascal_verdier
// Minor Changes.
//
// Revision 1.7  2005/03/15 08:55:00  pascal_verdier
// Do not create an empty family.
//
// Revision 1.6  2004/12/09 13:53:28  pascal_verdier
// Server language added.
//
// Revision 1.5  2004/11/12 08:04:08  pascal_verdier
// Download of doc and pdf documents added.
//
// Revision 1.4  2004/11/09 14:38:22  pascal_verdier
// Number of servers in page added.
//
// Revision 1.3  2004/10/29 10:52:34  pascal_verdier
// Tango-ds compatibility added.
//
// Revision 1.2  2004/10/25 14:01:53  pascal_verdier
// Servers are now sorted in sections.
//
// Revision 1.1  2004/09/02 06:46:11  pascal_verdier
// *** empty log message ***
//
//
// Copyright 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.servers2www;


/** 
 *	This class is able to
 *
 * @author  verdier
 * @Revision 
 */
 
import fr.esrf.Tango.*;
import fr.esrf.TangoDs.*;
import pogo.gene.*;

import java.io.*;
import java.util.*;



public class  HTMLpage implements PogoDefs
{
	private static String		servers_dir   = null;
	private static String		templates_dir = null;
	
	private ModuleFamily		family;
	static private String		header = null;

static private final String	head_list =
"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n" +
"<HTML>\n" +
"<HEAD>\n" +
"<Title> Tango Device Server User's Guide </Title>\n" +
"   <META NAME=\"GENERATOR\" CONTENT=\"Mozilla/4.08 [en] (X11; I; HP-UX B.10.20 9000/777) [Netscape]\">\n" +
"   <TITLE> DS User's Guide </TITLE>\n" +
"</HEAD>\n";

static private final String	body =
"<BODY TEXT=\"#000000\" BGCOLOR=\"#FFFFFF\" LINK=\"#0000FF\" VLINK=\"#7F00FF\" ALINK=\"#FF0000\">\n" +
"<!------------------ Contents ----------------------->\n" +
"\n";

static private final String	index =
	"<FRAMESET cols=\"20%,80%\">\n" +
	"<FRAME src=\"ClassList.html\"   name=\"left\">\n" +
	"<FRAME src=\"Tango-cs_Miscellaneous.html\" name=\"right\">\n" +
	"</FRAMESET>\n" +
	"</HTML>\n";

static private final String	warning = 
	"<Center><b>\n" +
	"The source files of following class could be " +
	"downloaded by clicking on it.\n" +
	"<Br>\n" +
	"WARNING:\n" +
	"These source files have been developped for a specific usage\n" +
	"and are not guaranteed for all platforms.\n" +
	"</Center></b>\n" +
	"<Br>\n" +
	"<Br>\n";

	//===============================================================
	//===============================================================

	//===============================================================
	//===============================================================
	public HTMLpage(ModuleFamily family)
	{
		this.family = family;
	}
	//===============================================================
	//===============================================================
	private void storeFiles(PogoClass server) throws Exception
	{
		//	Create Class directory
		servers_dir = server.projectFiles.getHtmlServerslist();
		File	f = new File(servers_dir);
		if (f.exists()==false)
			f.mkdir();
		//	inside tmp dir create one for each module
		String	path = servers_dir + "/" + server.class_name;
		f = new File(path);
		if (f.exists()==false)
			f.mkdir();
		PogoGene.copyDirectory(server.projectFiles.getDocHtml(),
									path + "/doc_html");
	}
	//===============================================================
	//===============================================================
	private String checkForTangoDir(String dirname) throws PogoException
	{
	System.out.println("checkForTangoDir for " + dirname);
		File	d = new File(dirname);
		String[]	filenames = d.list();

		for (int i=0 ; i<filenames.length ; i++)
		{
			//	Check if directory --> Check if Tango DS dir
			String	filename = dirname + "/" + filenames[i];
			//System.out.println(filename);
			File f = new File(filename);
			if (f.isDirectory())
			{
				String[]	files = PogoUtil.getTangoFilesList(filename);
				if (files.length>0)
					return files[0];
				else
				{
					//	Else scan it
					String	ret = checkForTangoDir(filename);
					if (ret!=null && ret.length()>0)
						return ret;
				}
			}
		}
		return null;
	}
	//===============================================================
	//===============================================================
	private String[] createServerItem(String dirname) throws Exception
	{
		//	Get the tango files list
		// if not empty create class and generate doc
		String[]	list = PogoUtil.getTangoFilesList(dirname);
		String		servname;
		if (list.length==0)
			servname = checkForTangoDir(dirname);	// could be a sub-directory
		else
			servname = list[0];

		//	Create PogoClass instance and build html line
		if (servname==null)
			Except.throw_exception("NOT_TANGO",
				"Not a TANGO server", "servers2www/HTMLpage.createServerItem");
		PogoClass	server = new PogoClass(servname);
		String[]	retstr = server.buildServersListHtmlLine();

		//	Update Doc and store it
		PogoGeneDoc	pogo = new PogoGeneDoc(server);
		pogo.generate();
		storeFiles(server);

		//	Build tar files
		buildTarFile(server);

		//	Force the template path if not already done.
		this.templates_dir = server.templates_dir;
		
		return retstr;
	}
	//===============================================================
	//===============================================================
	private void buildTarFile(PogoClass	server)
					throws Exception
	{
		//	Rename directory to put file in another one named as  class.
		if (server.projectFiles.getPath().equals(server.class_name))
		{
			String	dirname = server.projectFiles.getPath().toLowerCase();
			System.out.println("Renaming " + server.projectFiles.getPath() +
					" to " + dirname);
			String cmd = "mv " + server.projectFiles.getPath() + "  " + dirname;
			PogoUtil.executeShellCmd(cmd);
			server.projectFiles.setPath(dirname);
		}
		//	build tmp dir to copy src files
		File	target_dir = new File(server.class_name);
		if (target_dir.exists()==false)
			target_dir.mkdir();
		PogoGene.copyDirectory(server.projectFiles.getPath(), target_dir.toString());

		//	Build the tar file.
		String	tar_file = server.projectFiles.getHtmlServerslist() + "/" +
							server.class_name + "/" +
							server.class_name+ ".tar.gz ";
		String	cmd = "tar -czf " + tar_file + " " + target_dir.toString();
		System.out.println(cmd);
		PogoUtil.executeShellCmd(cmd);
	}
	//===============================================================
	//===============================================================
	private String buildTableLine(String[] line)
	{
		String	retstr =
					"<Tr><Td>" + line[0] + "</Td>\n";		//	add class name
		retstr +=	"<Td>"     + line[1] + "</Td>\n";		//	add language
		retstr +=	"<Td>"     + line[2] + "</Td></Tr>\n\n";//	add Description
		return retstr;
	}
	//===============================================================
	//===============================================================
	private static String readHeaderFile() throws Exception
	{
		//	Open and read file
		//----------------------------------------
		String	str = PogoUtil.readFile(templates_dir + "/html/header.html");
		return  str.substring(0, str.indexOf("</Body>"));
	}

	//===============================================================
	//===============================================================
	private static String writeHtmlPage(String filename, String str, boolean full) throws Exception
	{
		if (full)
		{
			str += "<Center>\nLast Update: ";
			str += new Date().toString() + "\n</Center>\n";
			String	footer = PogoUtil.readFile(templates_dir + "/html/footer.html");
			str += footer;
		}
		String	out_file = servers_dir + "/" + filename;
		FileOutputStream	fidout = new FileOutputStream(out_file);
		fidout.write(str.getBytes());
		fidout.close();
		return new String(out_file + " file has been generated !");
	}
	//===============================================================
	//===============================================================
	public String generateServersList() throws Exception
	{
		//	Read all directories to build items
		//-----------------------------------------
		Vector	servers = new Vector();
		for (int i=0 ; i<family.size() ; i++)
		{
			String[]	item;
			try
			{
				item = createServerItem(family.serverAt(i));
				servers.add(item);
			}
			catch(Exception e) {}
		}
		//	if no servers, return empty String.
		if (servers.size()==0)
		{
			family.clear();
			return "";
		}
		//	Add table header
		String[]	col_titles = { "Class Name", "Lang.", "Description" };
		String		table =
			PogoGeneDoc.buildTableHeader(tableName(), col_titles);
		
		
		//	Build each table line
		Vector	v  = new Vector();
		for (int i=0 ; i<servers.size() ; i++)
		{
			String[]	item = (String[]) servers.elementAt(i);
			table += buildTableLine(item);
		}
		
		//	Add end of table and write file
		table += "</Table>\n<br>\n<br>\n<br>\n";

		if (header==null)
			header = readHeaderFile();
		
		String	page = header + warning + table;

		//	Read page header and write html file
		return writeHtmlPage(family.fileName()+".html", page, true);
	}
	//===============================================================
	//===============================================================
	private String tableName()
	{
		return tableName(family);
	}
	//===============================================================
	//===============================================================
	private static String tableName(ModuleFamily f)
	{
		return "" + f.size() + "  " + f.name + "  Classes  hosted by "    +  f.repository;
	}
	//===============================================================
	//===============================================================
	static public void generateIndexFile(Vector families, int nb_servers) throws Exception
	{
		if (templates_dir==null)
			if ((templates_dir=System.getProperty("TEMPL_HOME"))==null)
				throw new PogoException("No Template Property (TEMPL_HOME) Fixed !");

		//	Write index as frame
		writeHtmlPage("index.html", head_list+index, false);

		//	Build class list for each repository
		String	page  = head_list + body;
		page += "<b><Center><Font size=+1>" +
			 nb_servers + " Tango classes </b></Center></Font><Br>\n";
		String	repos_name = "";
		for (int i=0 ; i<families.size() ; i++)
		{
			ModuleFamily	family =
						(ModuleFamily) families.elementAt(i);

			if (family.size()>0)
			{
				//	Check if repository has changed
				if (family.repository.equals(repos_name)==false)
				{
					page += "\n<Br><Br>\n<b>" + family.repository + ":</b>\n";
					repos_name = family.repository;
				}
				//	Add family name as item in list
				page += "	<li> <a href=" + 
						family.fileName() + ".html TARGET=\"right\">\t" +
						family.name + " </a>\n" ;
			}
		}

		//	add link to soleil site
		//page += addSoleilSite();
		//	add link on how to to
		page += addHowIsGenerated();
		
		writeHtmlPage("ClassList.html", page, false);
	}
	//===============================================================
	//===============================================================
	private static String addSoleilSite()
	{
		String	str = "";
		String	address = System.getProperty("SOLEIL_ADDRESS");
		if (address!=null)
		{
			str += "\n<Br><Br>\n<b><a href=" + address +
				" TARGET=\"right\">\tSOLEIL Specific </a>\n" ;
		}
		return str;
	}
	//===============================================================
	//===============================================================
	static void buildIndex(String[]	items) throws Exception
	{
		if (templates_dir==null)
			if ((templates_dir=System.getProperty("TEMPL_HOME"))==null)
				throw new PogoException("No Template Property (TEMPL_HOME) Fixed !");

		if (servers_dir==null)
			servers_dir = ".";

		writeHtmlPage("index.html", head_list+index, false);
		
		String	page  = head_list + body;
		page += "Hosted by SourceForge:\n";
		for (int i=0 ; i<items.length ; i++)
		{
			if (items[i]!=null)
				page += "	<li> <a href=" +
							items[i] + ".html TARGET=\"right\">\t" +
							items[i]  + " </a>\n" ;
			else
				page += "	<Br>\n";
		}
		//	add link on how to to
		page += addHowIsGenerated();
		
		writeHtmlPage("ClassList.html", page, false);
	}
	//===============================================================
	//===============================================================
	static private String addHowIsGenerated() throws Exception
	{
		//	add link on how to to on Classes list
		String	link = "<Br><Br><Br><Br><Br>\n";
		link += "<Font size=-1><Br>\n";
		link += "<a href=\"HowIsGenerated.html\" target=right>";
		link += " How these pages are generated ?</a><Br>\n";
		link += "(Specific ESRF)<Br>\n";
		link += "</Font>";
		return link;
	}
	//===============================================================
	//===============================================================
	public static void main (String args[])
	{
		String[]	items = { 
							"Beamlines",
							"Input/Output",
							"Measures",
							"Motion",
							"Power Supply",
							"Protocols",
							"TACO Interfaces",
							"Vacuum"
							};
		try
		{
			HTMLpage.buildIndex(items);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
