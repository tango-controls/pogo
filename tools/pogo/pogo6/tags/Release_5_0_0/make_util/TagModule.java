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
// Revision 1.5  2006/09/19 13:23:34  pascal_verdier
// .
//
// Revision 1.4  2006/01/30 12:18:26  pascal_verdier
// Check last tag from history file.
//
// Revision 1.3  2005/12/09 13:55:45  pascal_verdier
// Change tag syntax
//
// Revision 1.2  2005/12/07 13:25:56  pascal_verdier
// *** empty log message ***
//
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

	public  String	modulname = null;
	private String	cvsroot   = null;
	static  String	separator = "-";
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
	public void setTag(String release) throws Exception
	{
		System.out.println("setting tag " + release + " for module " + modulname);

		checkTags(release);
		patchSourceFile(release);
		executeShellCmd("cvs rtag " + release + "  " + modulname);
	}
	//===============================================================
	//===============================================================
	private void setCVSentries() throws Exception
	{
		try
		{
			cvsroot   = pogo.gene.PogoUtil.readFile("CVS/Root").trim();
			modulname = getModuleName();
			if (modulname==null)
			{
				//	Get it from Repository(file).
				modulname = pogo.gene.PogoUtil.readFile("CVS/Repository").trim();
				int	start;
				if ((start=modulname.lastIndexOf("/"))>=0)
					modulname = modulname.substring(start+1);
			}
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
	private String getModuleName()
	{
		try
		{
			String	str = null;
			try
			{
				//	Check it in CVS/Entries.Log if exists
				str = pogo.gene.PogoUtil.readFile("CVS/Entries.Log").trim();
			}
			catch(Exception e1)
			{
				//	Check it in CVS/Entries if exists
				str = pogo.gene.PogoUtil.readFile("CVS/Entries").trim();
			}

			String	target = "D/";
			int	start = str.indexOf(target);
			if (start<0)
				return null;	//	Not found
				
			//	Check if another
			int	end = start;
			while ((end=str.indexOf(target, end+1))>0)
				start = end;
			start += target.length();

			end = str.indexOf("/", start);
			if (end<0)
				return null;
			return str.substring(start, end);
		}
		catch(Exception e)
		{
			return null;
		}
	}
	//===============================================================
	//===============================================================
	public String printLastTag() throws Exception
	{
		Tag[]	tags = getLastTag();
		for (int i=0 ; i<tags.length ; i++)
			if (tags[i].filename.startsWith(".")==false)
				return tags[i].tag;
        return "No  tag found";
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
			if (filename.indexOf("CVS")<0)
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
	private void updateSourceFile(String release) throws Exception
	{
		executeShellCmd("cvs co -r " + release + "  " + modulname);
		
		//	copy new file
		String	classname = release.substring(0, release.indexOf(separator));
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
	private void patchSourceFile(String release) throws Exception
	{
		String	classname = release.substring(0, release.indexOf(separator));
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
							release + " " + code.substring(end);

		FileOutputStream	fidout = new FileOutputStream(filename);
		fidout.write(new_code.getBytes());
		fidout.close();
		
		//	Commit with modif
		/*
		String cmd =
			"cvs commit  -m \"\"  " + filename;
		executeShellCmd(cmd);
		*/
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
	public static final int	LastMode	    = 2;
	public static void displaySyntax(String message, String[] args)
	{
		System.out.println();
		System.out.print("TagModule ");
		for (int i=0 ; i < args.length ; i++)
			System.out.print(args[i] + " ");
		System.out.println("\n\n*********    "+ message + "    *******\n");
		System.out.println("TagModule -d [Module's name]");
		System.out.println("	to display last tag");
		System.out.println("                or");
		System.out.println("TagModule <tag release>");
		System.out.println("	to tag a module (tag must looks like ClassName:Release_1_2)");
		System.out.println("                or");
		System.out.println("TagModule -last [Module's name]  [File's name]");
		System.out.println("	display the last Tag found in file.");
		System.out.println();
		System.exit(1);
	}
	//===============================================================
	//===============================================================
	public static void main (String[] args)
	{
		TagModule	client = null;
		String		release   = "";
		int			mode = -1;
		String		modulname = null;
		String		filename  = null;

		switch (args.length)
		{
		case 1:
			if (args[0].equals("-d"))
				mode = DisplayMode;
			else
			{
				mode = WriteMode;
				release   = args[0];
				if (release.indexOf(TagModule.separator+"Release_")<=0)
					TagModule.displaySyntax("Release Syntax Error !", args);
			}
			break;
		case 2:
			if (args[0].equals("-d"))
			{
				mode = DisplayMode;
				modulname = args[1];
			}
			else
			if (args[0].equals("-last"))
			{
				mode = LastMode;
				modulname = args[1];
			}
			else
				TagModule.displaySyntax("Arguments Number Incorrect !", args);
			break;

		case 3:
			if (args[0].equals("-last"))
			{
				mode = LastMode;
				modulname = args[1];
				filename  = args[2];
			}
			else
				TagModule.displaySyntax("Arguments Number Incorrect !", args);
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
				String  tag = client.printLastTag();
                System.out.println("Last tag of " + client.modulname + " is " + tag);
				break;
			case WriteMode:
				client.checkTags(release);
				client.setTag(release);
				break;
			case LastMode:
				String lt = client.printTags();//filename);
				System.out.println(lt);
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
	private static final int	T      = 0;
	private static final int	DATE   = 1;
	private static final int	TIME   = 2;
	private static final int	ADD    = 3;
	private static final int	USER   = 4;
	private static final int	MODULE = 5;
	private static final int	TAGNAME= 6;
	public String printTags() throws Exception
	{
		String	cmd = "cvs history -T -a";
		System.out.println(cmd);
	
		String	result = executeShellCmd(cmd);
		StringTokenizer stk = new StringTokenizer(result, "\n");
		while (stk.hasMoreTokens())
		{
			String	line = stk.nextToken();
			StringTokenizer stk2 = new StringTokenizer(line);
			Vector	v = new Vector();
			while (stk2.hasMoreTokens())
				v.add(stk2.nextToken());

			if (v.size()>TAGNAME)
			{
				String[]	param = new String[TAGNAME+1];
				for (int i=0 ; i<v.size() && i<7 ; i++)
					param[i] = (String)v.get(i);


				if (param[MODULE].equals(modulname))
				{
					//	Remove edges
					param[TAGNAME] = param[TAGNAME].substring(1,
										param[TAGNAME].indexOf(":A]"));

					System.out.println(param[USER] + " tagged " +
						modulname + " on " + param[DATE] + " " + 
						param[TIME] + " as " + param[TAGNAME]);
				}
			}
		}
		
		return "";
	}
	//===============================================================
	//===============================================================
	public String getLastTag(String filename) throws Exception
	{
		String	tagTag = "|A|";
		String	code = pogo.gene.PogoUtil.readFile(filename);
		Vector	v = new Vector();
		StringTokenizer stk = new StringTokenizer(code, "\n");
		while (stk.hasMoreTokens())
		{
			String	line = stk.nextToken();
			if (line.startsWith("T"))	//	It is a tag
			{
				//	Get each field
				Vector	v2 = new Vector();
				StringTokenizer stk2 = new StringTokenizer(line, "|");
				while (stk2.hasMoreTokens())
					v2.add(stk2.nextToken());

				String	field_3 = (String)v2.get(3);
				String	field_5 = (String)v2.get(5);
				if (field_3.equals("A"))
					if (field_5.equals(modulname))
						v.add(v2.get(4));
			}
		}
		
		if (v.size()==0)
			return "No Tag.";
		else
			return (String) v.get(v.size()-1);
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
