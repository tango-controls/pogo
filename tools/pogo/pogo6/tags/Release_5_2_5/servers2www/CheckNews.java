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
// Revision 1.8  2006/06/26 09:16:26  pascal_verdier
// Remove source on a jar file.
//
// Revision 1.7  2005/12/20 12:07:08  pascal_verdier
// If StateMachine file not found, add warning message in log file.
//
// Revision 1.6  2005/12/07 12:19:00  pascal_verdier
// Tag command added in Makefile.
//
// Revision 1.5  2005/10/21 06:39:27  pascal_verdier
// *** empty log message ***
//
// Revision 1.4  2005/10/19 09:28:08  pascal_verdier
// Full list of device servers added.
//
// Revision 1.3  2005/10/12 13:48:34  pascal_verdier
// Now build a result html file.
//
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
 */
 
import pogo.gene.PogoClass;
import pogo.gene.PogoDefs;
import pogo.gene.PogoUtil;

import java.io.File;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;



public class  CheckNews
{
	private String	old_list;
	private String	new_list;
	private	static final String	title_news = "Tango Device Server Classes";
	private	static final String	title_list = "Tango Device Server Classes List";
	private	static final String	separator  = 
				"\n<Br /><Br /><HR WIDTH=\"100%\" />\n";


	private String	mail_tmp_file;
	/**
	 *	Check difference between old and new classes
	 *		else
	 *	Build device servers full list
	 */
	private boolean	check_news = true;

	//===============================================================
	//===============================================================
	public CheckNews(String[] filenames) throws Exception
	{
		old_list = PogoUtil.readFile(filenames[0]);
		new_list = PogoUtil.readFile(filenames[1]);
		mail_tmp_file = filenames[2];
		check_news    = true;
	}
	//===============================================================
	//===============================================================
	public CheckNews(String infile, String outfile) throws Exception
	{
		new_list = PogoUtil.readFile(infile);
		mail_tmp_file = outfile;
		check_news    = false;
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
			boolean	found = false;
			if (check_news)
			{
				StringTokenizer old_stk = new StringTokenizer(old_list, "\n");
				while (!found && old_stk.hasMoreTokens())
					found = classname.equals(old_stk.nextToken());
			}

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
	private String alphabeticLink(Vector classes)
	{
		char	c = '0';
		String	str = "<Center>\n";
		//str += classes.size() + "  Tango devices servers<Br />\n";
		str += "Class Index :<Br />\n";
		for (int i=0 ; i<classes.size() ; i++)
		{
			PogoClass	_class = (PogoClass)classes.elementAt(i);
			if (_class.class_name.indexOf(c)!=0)
			{
				c = _class.class_name.charAt(0);
				str += "<a href=\"#" + c + "\"> " + c + " </a>\n";
			}
		}
		str += "</Center>\n";
		return str;
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
		if (check_news)
			new_code += title_news;
		else
			new_code += title_list;
		new_code += "</u></h1></Center><Br /><Br />";
		new_code += separator;
		
		//	If check news, add how many have been found
		if (check_news)
		{
			new_code += "<b>" + classes.size();
			if  (classes.size()>1)
				new_code += " new classes have ";
			else
				new_code += " new class has ";
			new_code += "been found during tango-cs, tango-ds and ESRF CVS repositories scan.\n</b>";
		}
		else
		{
			//	else add an index of alphabetic link
			new_code += alphabeticLink(classes);
		}

		//	And add each new class
		char	c = '0';
		for (int i=0 ; i<classes.size() ; i++)
		{
			PogoClass	_class = (PogoClass)classes.elementAt(i);
			//	Test if first char has changed
			if (check_news==false && _class.class_name.indexOf(c)!=0)
			{
				c = _class.class_name.charAt(0);
				new_code += "<A Name=\"" + c + "\" />\n";
			}
			new_code += separator;
			String	tmp_lnk = PogoDefs.WWWdeviceServers + _class.class_name + "/doc_html/";
			//new_code += "<b>" + (i+1) + " : "+ _class.class_name + " :</b> " + _class.title + "\n";
			new_code += "<b>" + _class.class_name + " :</b> " + _class.title + "\n";
			new_code += "<ul>\n";
			new_code += "\t<a HREF=\"" + tmp_lnk + "\">" + tmp_lnk + " </a><Br />\n";
			new_code += "\t" + _class.class_desc + "\n";
			new_code += "</ul>\n";
		}
		new_code += separator;
		new_code += "\n<Br /><Br />";
		
		if (check_news)
		{
			new_code += "This is an automatic generated mail ("+ new Date() + ").<Br />\n";
			new_code += "All device servers user's guide at <a HREF=\"" +
						PogoDefs.WWWdeviceServers + "\"> " + PogoDefs.WWWdeviceServers + "</a>\n<Br />\n";
		}
		else
			new_code += "<Center>Last Update "+ new Date() + ".</Center><Br />\n";
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
				else
				{
					file = new File(classname + "/" + classname + ".py");
					if (file.exists())
						filename = file.toString();
				}
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
		String	warnings = "";
		for (int i=0 ; i<classnames.size() ; i++)
		{
			String	classname = (String)classnames.elementAt(i);

			//	Untar file
			cmd = "tar -xzf " + classname + "/" + classname + ".tar.gz";
			System.out.println(cmd);
			PogoUtil.executeShellCmd(cmd);

			PogoUtil.executeShellCmd("ls -l");

			//	Read file to load class
			PogoClass	_class = null;
			try {
				_class = new PogoClass(getFileName(classname));
				if (_class.except!=null)
					warnings += _class.except.toString() + "\n";
			}
			catch (Exception e) {
				System.out.println(e);
				warnings += "***************** " + classname +" ***************\n" + 
							e.toString() + 
							"\n*******************************************\n";
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
		//	Check if warnings
		if (warnings.length()>0)
			try { PogoUtil.writeFile("/tmp/servers2www.warn", warnings); }
			catch(Exception e){}
		return classes;
	}
	//===============================================================
	//===============================================================
	public static void main (String[] args)
	{
		CheckNews	client = null;

		try
		{
			switch(args.length)
			{
			case 3:
				client = new CheckNews(args);
				client.checkData();
				break;
			case 2:
				client = new CheckNews(args[0], args[1]);
				client.checkData();
				System.out.println("Creating Alphabetic list of device servers");
				break;
			default:
				System.out.println("Old_file_names  new_file_names  mail_file_name ?");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		System.exit(0);
	}
}
