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
// Revision 1.8  2006/01/30 12:16:41  pascal_verdier
// Check out the last tag if any.
//
// Revision 1.7  2005/12/20 12:07:08  pascal_verdier
// If StateMachine file not found, add warning message in log file.
//
// Revision 1.6  2005/12/07 12:19:00  pascal_verdier
// Tag command added in Makefile.
//
// Revision 1.5  2005/10/12 13:49:43  pascal_verdier
// Fix a bug in adding pdf or doc file download.
//
// Revision 1.4  2004/11/12 08:04:08  pascal_verdier
// Download of doc and pdf documents added.
//
// Revision 1.3  2004/10/29 10:52:34  pascal_verdier
// Tango-ds compatibility added.
//
// Revision 1.2  2004/10/25 14:01:54  pascal_verdier
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
 *	This class is able to scan the CVS reppository to extract TANGO servers.
 *
 * @author  verdier
 */
 
import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoApi.ApiUtil;
import fr.esrf.TangoApi.DbDatum;
import fr.esrf.TangoDs.Except;
import pogo.gene.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;


public class  ScanRepository implements PogoDefs
{
	private boolean test = false;
	private String	cvsroot;
	public  Vector	modules;
	public  Vector	servers;
	public  String	name;
	//===============================================================
	/**
	 *	Build object, Scan CVS repository module files and sort it.
	 *
	 *	@param cvsroot the CVSROOT to check modules. 
	 */
	//===============================================================
	public ScanRepository(String cvsroot, String repository) throws Exception
	{
		System.out.println("ScanRepository(" + cvsroot + ", " + repository+")");
		this.cvsroot = cvsroot;
		servers = new Vector();
		modules = new Vector();		

		//	Special case for Tango-ds repository (another stuff)
		if (cvsroot.indexOf("tango-ds")>=0)
		{
			scanTangoDsModuleFile(repository);
		}
		else
		{
			String[]	mod_names = ScanRepository.getModuleFamilies();
			for (int i=0 ; i<mod_names.length ; i++)
				servers.add(new ModuleFamily(mod_names[i], repository));
			servers.add(new ModuleFamily("Miscellaneous", repository));

			System.out.println("Scanning " + cvsroot);

			//	Scan CVSROOT and store tango modules in vector
			scanModuleFile();

		}
		//	Sort results
		for (int s=0 ; s<servers.size() ; s++)
		{
			ModuleFamily	family = (ModuleFamily)servers.elementAt(s);
			family.sort();
		}
		System.out.println(this);
	}
	//===============================================================
	/**
	 *	Scan tango-ds repository (another truct than ESRF ones).
	 */
	//===============================================================
	private void scanTangoDsModuleFile(String repository) throws Exception
	{
		PogoString	code =
			new PogoString(PogoUtil.readFile(cvsroot+"/CVSROOT/modules"));
		String[]	lines = code.string2array("\n");
		for (int i=0 ; i<lines.length ; i++)
		{
			if (lines[i].indexOf("#")!=0)	//	Not a comment
			{
				if (lines[i-1].indexOf("#")==0) //Take previous comment as family
				{
					String	name = lines[i-1].substring(1).trim();
					name = name.substring(0,1).toUpperCase() +
							name.substring(1).toLowerCase();
					ModuleFamily	family = new ModuleFamily(name, repository);
					servers.add(family);
				}
				//	Put server in current family
				StringTokenizer st = new StringTokenizer(lines[i]);
				String	module = st.nextToken();
				String	path   = st.nextToken();
				ModuleFamily	family = (ModuleFamily)servers.lastElement();
				family.add(module);
				//	Add in modules list
				modules.add(module);
			}
		}
	}
	//===============================================================
	/**
	 *	Scan CVS module file.
	 */
	//===============================================================
	private void scanModuleFile() throws Exception
	{
		PogoString	code =
			new PogoString(PogoUtil.readFile(cvsroot+"/CVSROOT/modules"));
		String[]	lines = code.string2array("\n");

		for (int i=0 ; i<lines.length ; i++)
		{
			if (lines[i].indexOf("#")!=0)	//	Not a comment
			{
				StringTokenizer st = new StringTokenizer(lines[i]);
				if (st.countTokens()>=2)
				{
					String	module = st.nextToken();
					String	path   = st.nextToken();

					//	Check if a server
					if (path.indexOf("cppserver") >= 0 ||
						path.indexOf("jserver") >= 0 )
					{
						//	Search server key word
						boolean	found = false;
						for (int s=0 ; s<servers.size()-1 && !found ; s++)
						{
							ModuleFamily	family = (ModuleFamily)servers.elementAt(s);
							String	name = family.name + ":";
							if (lines[i-1].indexOf(name)>0)
							{
								family.add(module);
								found = true;
							}
						}
						//	If no key word found -> Misc server(last one)
						if (!found)
						{
							ModuleFamily	family =
								(ModuleFamily)servers.lastElement();
							family.add(module);
						}
						//	Add in modules list
						modules.add(module);
					}
				}
			}
		}
		
	}
	//===============================================================
	//===============================================================
	static public String[] getModuleFamilies() throws DevFailed
	{
		DbDatum	data = ApiUtil.get_db_obj().get_property("Pogo", "ModuleFamilies");
		String[]	mod_names = data.extractStringArray();
		//for (int n=0 ; n<mod_names.length ; n++)
		//	System.out.println(mod_names[n]);
		return mod_names;
	}
	//===============================================================
	//===============================================================
	private int nb_modules()
	{
		return modules.size();
	}
	//===============================================================
	/**
	 *	Copy files from include and src dir to 
	 *	module name directory.
	 */
	//===============================================================
	private void tangoDsToEsrfStruct()
	{
		String	cmd;
		for (int i=0 ; i<nb_modules() ; i++)
		{
			//	Get module name
			String	module = (String)modules.elementAt(i);

			//	Check it out
			cmd = "mv " + module + "/include/* " + module;
			System.out.println("----->  " + cmd);
			try
			{
				PogoGene.copyDirectory(module + "/include", module);
			} catch(Exception e) {}

			cmd = "mv " + module + "/src/* " + module;
			System.out.println("----->  " + cmd);
			try
			{
				PogoGene.copyDirectory(module + "/src", module);
			} catch(Exception e) {}

			cmd = "mv " + module + "/doc/doc_html/* " + module;
			System.out.println("----->  " + cmd);
			try
			{
				String	targetdir = module + "/doc_html";
				File	f = new File(targetdir);
				if (f.exists()==false)
					f.mkdir();

				PogoGene.copyDirectory(module + "/CVS", targetdir);
				PogoGene.copyDirectory(module + "/doc", targetdir);
				PogoGene.copyDirectory(module + "/doc/doc_html", targetdir);

				//PogoGeneDoc.checkDocFile(targetdir);
			} catch(Exception e) {}
		}
	}
	//===============================================================
	/**
	 *	Check out the CVS modules.
	 */
	//===============================================================
	public int cvsCheckOutModules() throws Exception
	{
		if (test)	return nb_modules();
		//	For each project
		for (int i=0 ; i<nb_modules() ; i++)
		{
			//	Get module name
			String	module = (String)modules.elementAt(i);
			
			//	Try to get last tag
			String	noTag = "No Tag.";
			String	tag = noTag;
			try {
				String	hitofile = cvsroot + "/CVSROOT/history";
				tag = new pogo.make_util.TagModule(module).getLastTag(hitofile);
			}
			catch(Exception e) {
				e.printStackTrace();
			}

			//	Check it out
			String	cmd = "cvs -Q -d " + cvsroot + "  co ";
			if (tag.equals(noTag)==false)
				cmd += " -r " + tag + "  ";
			cmd += module;

			System.out.println(cmd);
			System.out.println("Checking out :  "+ module);
			executeShellCmd(cmd);
		}
		
		//	Check if tango-ds repository (another struct)
		if (cvsroot.indexOf("tango-ds")>=0)
		{
			tangoDsToEsrfStruct();
		}
		return nb_modules();
	}
	//===============================================================
	/**
	 *	Release the CVS modules.
	 */
	//===============================================================
	public void cvsReleaseModules() throws Exception
	{
		if (test)	return;
		for (int i=0 ; i<nb_modules() ; i++)
		{
			String	cmd = "cvs -Q -d " + cvsroot +" release -d " + (String)modules.elementAt(i);
			System.out.println(cmd);
			executeShellCmd(cmd);
		}
	}
	//===============================================================
	/**
	 *	Execute a shell command and throw exception if command failed.
	 *
	 *	@param cmd	shell command to be executed.
	 */
	//===============================================================
	public static void executeShellCmd(String cmd) throws Exception
	{
		Process proc = Runtime.getRuntime().exec(cmd);

		// get command's output stream and
		// put a buffered reader input stream on it.
		//-------------------------------------------
		InputStream istr = proc.getInputStream();
		BufferedReader br =
                new BufferedReader(new InputStreamReader(istr));
		StringBuffer	sb =new StringBuffer("");

		// read output lines from command
		//-------------------------------------------
		String str;
		while ((str = br.readLine()) != null)
		{
			System.out.println(str);
			sb.append(str+"\n");
		}

		// wait for end of command
		//---------------------------------------
		proc.waitFor();

		// check its exit value
		//------------------------
		int retVal;
		if ((retVal=proc.exitValue()) != 0)
		{
			//	An error occured try to read it
			InputStream errstr = proc.getErrorStream();
			br = new BufferedReader(new InputStreamReader(errstr));
			while ((str = br.readLine()) != null)
			{
				System.out.println(str);
				sb.append(str+"\n");
			}
			throw new PogoException(
				"the shell command\n" + cmd + "\nreturns : " + retVal + " !\n\n"+
				sb.toString());
		}
		System.out.println(sb);
	}
	
	//===============================================================
	//===============================================================
	public String toString()
	{
		int		cnt = 0;
		String	s = "";
		for (int i=0 ; i<servers.size() ; i++)
		{
			ModuleFamily	family	= (ModuleFamily)servers.elementAt(i);
			s += family.toString() + "\n";
			cnt += family.size();
		}
		s += "\n	" + cnt + " Tango device servers\n";
		return s;
	}
	//===============================================================
	//===============================================================
	public static void main (String args[])
	{
		String	cvsroot = System.getProperty("CVSROOT");
		try
		{
			if (cvsroot!=null)
			{
				long	t0 = System.currentTimeMillis();

				new ScanRepository(cvsroot, "ESRF");

				//client.cvsCheckOutModules();
				//client.buildHtmlPage();
				//client.cvsReleaseModules();

				long	t1 = System.currentTimeMillis();
				System.out.println("elapsed time : " + (t1-t0) + " ms");
			}
			else
				throw new PogoException("CVSROOT Not set !");
		}
		catch(Exception e)
		{
			Except.print_exception(e);
		}
	}
}
