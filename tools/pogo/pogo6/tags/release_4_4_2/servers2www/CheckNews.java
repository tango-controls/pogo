//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the CheckNews class definition .
//
// $Author$
//
// $Revision$
//
// $Log$
// Revision 1.2  2005/09/06 06:16:29  pascal_verdier
// Minor Changes.
//
// Revision 1.1  2005/06/14 08:53:06  pascal_verdier
// If new class(es) found in repositories, send an email to tango mailing list.
//
//
// Copyleft 2005 by European Synchrotron Radiation Facility, Grenoble, France
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
import pogo.gene.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;



public class  CheckNews
{
	private String	old_list;
	private String	new_list;
	private	static final String	title = "New Tango Device Server Classes";
	
	private String	mail_tmp_file;

	//===============================================================
	//===============================================================
	public CheckNews(String[] filenames) throws Exception
	{
		old_list = PogoUtil.readFile(filenames[0]);
		new_list = PogoUtil.readFile(filenames[1]);
		mail_tmp_file = filenames[2];
	}
	//===============================================================
	//===============================================================
	public void checkData() throws Exception
	{
		Vector	v = new Vector();
		//	for Each item, check if already exists
		StringTokenizer new_stk = new StringTokenizer(new_list, "\n");
		while (new_stk.hasMoreTokens())
		{
			String classname = new_stk.nextToken();
			StringTokenizer old_stk = new StringTokenizer(old_list, "\n");
			boolean	found = false;
			while (!found && old_stk.hasMoreTokens())
				found = classname.equals(old_stk.nextToken());
			
			if (!found)
			{
				//	Take of slash
				int	pos = classname.indexOf("/");
				if (pos>0)
					classname = classname.substring(0, pos);
				v.add(classname);
			}
		}
		System.out.println(v.size() + " new classes found !");

		//	If no new classes --> Stop
		if (v.size()==0)
			return;

		//	Get classes to get description
		Vector	classes = getNewPogoClasses(v);
		//	If no new classes --> Stop
		if (classes.size()>0)
			buildMailFile(classes);
	}
	//===============================================================
	//===============================================================
	private void buildMailFile(Vector classes)
					throws Exception
	{
		//	Get template
		String	templ_dir = System.getProperty("TEMPL_HOME");
		String	code = PogoUtil.readFile(templ_dir+"/html/header.html");
		int		position = code.indexOf("</Body>");

		//	Build title
		String	new_code = code.substring(0, position);
		new_code += "<Center><h1><u>";
		new_code += "TANGO Device Servers News<br>\n";
		new_code += "</u></h1></Center><Br>";
		
		new_code += "\n<Br><Br><HR WIDTH=\"100%\"></H5>\n<Br><Br>\n<b>" + classes.size();
		if  (classes.size()>1)
			new_code += " new classes have ";
		else
			new_code += " new class has ";
		new_code += "been found during tango-cs, tango-ds and ESRF CVS repositories scan.\n</b>";
		new_code += "\n\n<Br><Br><Br>\n";

		//	And add each new class
		for (int i=0 ; i<classes.size() ; i++)
		{
			PogoClass	_class = (PogoClass)classes.elementAt(i);
			String	tmp_lnk = PogoDefs.WWWdeviceServers + _class.class_name + "/doc_html/";
			new_code += "<b>" + _class.class_name + " :</b> " + _class.title + "\n";
			new_code += "<ul>\n";
			new_code += "\t<a HREF=\"" + tmp_lnk + "\">" + tmp_lnk + " </a><Br>\n";
			new_code += "\t" + _class.class_desc + "\n";
			new_code += "</ul>\n";
			new_code += "\n<Br><HR WIDTH=\"100%\"></H5>\n<Br><Br>\n\n";
		}
		new_code += "\n<Br><Br>";
		new_code += "This is an automatic generated mail ("+ new Date() + ").<Br>\n";
		new_code += "All device servers user's guide at <a HREF=\"" +
						PogoDefs.WWWdeviceServers + "\"> " + PogoDefs.WWWdeviceServers + "</a>\n<Br>\n";

		new_code += code.substring(position);
		
		PogoUtil.writeFile(mail_tmp_file, new_code);
	}
	//===============================================================
	//===============================================================
	private String getFileName(String classname)
	{
		String	filename = classname + ".h";
		File
		file = new File(classname + "/" + classname + ".h");
		if (file.exists())
			return file.toString();
		else
		{
			file = new File(classname + "/src/" + classname + ".h");
			if (file.exists())
			{
				 file.toString();
			}
			else
			{
				file = new File(classname + "/" + classname + ".java");
				if (file.exists())
					filename = file.toString();
			}
		}
		return filename;
	}
	//===============================================================
	//===============================================================
	private Vector getNewPogoClasses(Vector classnames)
					throws Exception
	{
		String	cmd;
		Vector	classes = new Vector();
		for (int i=0 ; i<classnames.size() ; i++)
		{
			String	classname = (String)classnames.elementAt(i);

			//	Untar fir
			cmd = "tar -xzf " + classname + "/" + classname + ".tar.gz";
			System.out.println(cmd);
			PogoUtil.executeShellCmd(cmd);

			PogoUtil.executeShellCmd("ls -l");

			//	Read file to load class
			PogoClass	_class = null;
			try {
				_class = new PogoClass(getFileName(classname));
			}
			catch (Exception e) {
					System.out.println(e);
			}

			//	If OK Add to vector
			if (_class!=null)
				classes.add(_class);

			//	Remove files
			File	f = new File(classname);
			String[]	files = f.list();
			for (int j=0 ; j<files.length ; j++)
			{
				//	Check if not a directory (doc_html)
				File	f1 = new File(classname+"/"+files[j]);
				if (f1.isFile())
				{
					//	Check if not tar file.
					if (files[j].indexOf("tar.gz")<0)
						f1.delete();
				}
			}
		}
		return classes;
	}
	//===============================================================
	//===============================================================
	public static void main (String[] args)
	{
		CheckNews	client = null;

		if (args.length<3)
		{
			System.out.println("Old_file_names  new_file_names  mail_file_name ?");
			System.exit(0);
		}

		try
		{
			client = new CheckNews(args);
			client.checkData();
			System.exit(0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
	}
}
