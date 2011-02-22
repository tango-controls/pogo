//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the TagModuleclass definition .
//
// $Author$
//
// $Revision$
//
// $Log$
// Revision 1.1  2005/12/07 12:48:13  pascal_verdier
// *** empty log message ***
//
//
// Copyleft 2005 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.make_util;


/**
 *	This class is able to tag or show last tag of a CVS module.
 *
 * @author  verdier
 */


import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;



public class  TagModule
{

	private String	modulname = null;
	private String	cvsroot   = null;
	//===============================================================
	//===============================================================
	public TagModule(String modulname) throws Exception
	{
		if (modulname==null)
			setCVSentries();
		else
			this.modulname = modulname;
	}
	//===============================================================
	//===============================================================
	public void setTag(String release, String classname) throws Exception
	{
		System.out.println("setting tag " + release + " for module " + modulname);

		checkTags(release);
		executeShellCmd("cvs rtag " + release + "  " + modulname);
		patchSourceFile(release, classname);
	}
	//===============================================================
	//===============================================================
	private void setCVSentries() throws Exception
	{
		try
		{
			cvsroot   = pogo.gene.PogoUtil.readFile("CVS/Root").trim();
			modulname = pogo.gene.PogoUtil.readFile("CVS/Repository").trim();
			int	start;
			if ((start=modulname.lastIndexOf("/"))>=0)
				modulname = modulname.substring(start+1);

			System.out.println("cvsroot = " + cvsroot);
			System.out.println("module  = " + modulname);
		}
		catch(FileNotFoundException e)
		{
			throw new FileNotFoundException("CVS (No such file or directory)\n"
						+ "  This is not a CVS directory !");
		}
	}
	//===============================================================
	//===============================================================
	public void printLastTag() throws Exception
	{
		Tag[]	tags = getLastTag();
		for (int i=0 ; i<tags.length ; i++)
			System.out.println(tags[i].filename + "	" + tags[i].tag);
	}
	//===============================================================
	//===============================================================
	public void checkTags(String release) throws Exception
	{
		Tag[]	tags = getLastTag();
		for (int i=0 ; i<tags.length ; i++)
			if (tags[i].tag.equals(release))
				throw new Exception("Tag " + release + " already used");
	}
	//===============================================================
	//===============================================================
	private Tag[] getLastTag() throws Exception
	{
		//	check if exe file exists with same name
		File	exe = new File(modulname);
		File	tmp_exe = new File("."+modulname);
		boolean	exe_exists = false;
		if (exe.exists())
		{
			try {
				exe.renameTo(tmp_exe);
				exe_exists = true;
			}
			catch(Exception e) {}
		}

		//	Check out file in temporary directory
		executeShellCmd("cvs co " + modulname);

		String		dirname = modulname;
		File		d = new File(dirname);
		String[]	filenames = d.list();

		String	cmd = "cvs log -h ";
		for (int i=0 ; i<filenames.length ; i++)
		{
			//	Check if not a directory
			String	filename = dirname + "/" + filenames[i];
//			if (new File(filename).isDirectory()==false)
				cmd += filename + " ";
		}

		String	cvslog = executeShellCmd(cmd);
		executeShellCmd("rm -R " + modulname);
		if (exe_exists)
			tmp_exe.renameTo(exe);
		return parseTags(cvslog);
	}
	//===============================================================
	//===============================================================
	private Tag[] parseTags(String fulltag)
	{
		Vector	v = new Vector();
		String			filename = "";
		StringTokenizer stk = new StringTokenizer(fulltag, "\n");
		while (stk.hasMoreTokens())
		{
			String line = stk.nextToken();

			if (line.startsWith("Working file:"))
				filename = line.substring("Working file:".length()).trim();
			else
			if (line.startsWith("symbolic names:"))
			{
				line = stk.nextToken().trim();
				
				//	Check if already tagged
				if (line.indexOf("keyword substitution")<0)
				{
					//	Get and return tag found
					int	end = line.indexOf(":");
					if (end>0)
					{
						String	tag = line.substring(0, end);
						v.add(new Tag(filename, tag));
					}
				}
			}
		}
		Tag[]	tags = new Tag[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			tags[i] = (Tag)v.get(i);
		return tags;
	}
	//===============================================================
	/**
	 *	Replaced by patchSourceFile() method.
	 */
	//===============================================================
	private void updateSourceFile(String release, String classname) throws Exception
	{
		executeShellCmd("cvs co -r " + release + "  " + modulname);
		
		//	copy new file
		String	filename = classname + "Class.cpp";
		FileInputStream	fid = new FileInputStream(modulname + "/" + filename);
		int nb = fid.available();
		byte[]	inStr  = new byte[nb];
		fid.read(inStr);
		String code = new String(inStr);
		fid.close();

		FileOutputStream	fidout = new FileOutputStream(filename);
		fidout.write(code.getBytes());
		fidout.close();

		executeShellCmd("rm -R " + modulname);
	}
	//===============================================================
	//===============================================================
	private void patchSourceFile(String release, String classname) throws Exception
	{
		String	filename = classname + "Class.cpp";
		
		if (new File(filename).exists()==false)
			return;
		
		FileInputStream	fid = new FileInputStream(filename);
		int nb = fid.available();
		byte[]	inStr  = new byte[nb];
		fid.read(inStr);
		String code = new String(inStr);
		fid.close();
		
		//	Serach tag begining
		int	start = code.indexOf("static const char *TagName");
		if (start<0)
			throw new Exception("\"char *TagName\" not found in " + filename);

		String	tagName = "$Name: ";
		start = code.indexOf(tagName, start);
		if (start<0)
			throw new Exception("\"" + tagName + "\" not found in " + filename);
		start += tagName.length();
		int end = code.indexOf("$", start);
		if (end<start)
			throw new Exception("\"" + tagName + "\" syntax error in " + filename);

		String	new_code = code.substring(0, start) +
				classname + ":" + release + " " + code.substring(end);

		FileOutputStream	fidout = new FileOutputStream(filename);
		fidout.write(new_code.getBytes());
		fidout.close();
	}



	//===============================================================
	/**
	 *	Execute a shell command and throw exception if command failed.
	 *
	 *	@param cmd	shell command to be executed.
	 */
	//===============================================================
	public static String executeShellCmd(String cmd) throws Exception
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
			//System.out.println(str);
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
			throw new Exception(
				"the shell command\n" + cmd + "\nreturns : " + retVal
				+ " !\n\n"+ sb.toString());
		}
		return sb.toString();
	}



	//===============================================================
	//===============================================================
	public static final int	DisplayMode	= 0;
	public static final int	WriteMode	= 1;
	public static void displaySyntax(String message, String[] args)
	{
		System.out.println();
		System.out.print("TahModule ");
		for (int i=0 ; i < args.length ; i++)
			System.out.print(args[i] + " ");
		System.out.println("\n\n*********    "+ message + "    *******\n");
		System.out.println("TagModule -d [Module's name]");
		System.out.println("	to display last tag");
		System.out.println("                or");
		System.out.println("TagModule <tag release> <class name>");
		System.out.println("	to tag a module (tag must looks like Release_1_2)");
		System.out.println();
		System.exit(1);
	}
	//===============================================================
	//===============================================================
	public static void main (String[] args)
	{
		TagModule	client = null;
		String		release   = "";
		String		classname = "";
		int			mode = -1;
		String		modulname = null;
		
		switch (args.length)
		{
		case 1:
			if (args[0].equals("-d"))
				mode = DisplayMode;
			break;
		case 2:
			if (args[0].equals("-d"))
			{
				mode = DisplayMode;
				modulname = args[1];
			}
			else
			{
				mode = WriteMode;
				release   = args[0];
				classname = args[1];
				if (release.startsWith("Release_")==false)
					TagModule.displaySyntax("Release Syntax Error !", args);
			}
			break;
		default :
			TagModule.displaySyntax("Arguments Number Incorrect !", args);
		}
        try
		{

			client = new TagModule(modulname);
			switch(mode)
			{
			case DisplayMode:
				client.printLastTag();
				break;
			case WriteMode:
				client.checkTags(release);
				client.setTag(release, classname);
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println("********************************************************************");
			System.out.println("\t" + e );
			System.out.println("********************************************************************");
			e.printStackTrace();
			System.exit(1);
		}
		System.exit(0);
	}






	//===============================================================
	//===============================================================
	class Tag {
		String	filename;
		String	tag;
		Tag(String filename, String tag)
		{
			this.filename = filename;
			this.tag      = tag;
		}
	}
}
