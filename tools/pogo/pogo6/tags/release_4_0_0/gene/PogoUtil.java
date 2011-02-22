//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Pogo class definition .
//
// $Author$
//
// $Revision$
// $Log$
// Revision 3.7  2004/11/22 11:07:46  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.6  2004/11/09 08:26:37  pascal_verdier
// Device3_Impl for TACO file.
//
// Revision 3.5  2004/11/03 10:43:34  pascal_verdier
// Help on What's new added.
//
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================


package pogo.gene;
 


/** 
 *	This class group many info and methods used By Pogo.
 *
 * @author  verdier
 * @Revision 
 */


import java.util.*;
import java.io.*;
import fr.esrf.Tango.*;
import fr.esrf.TangoDs.*;
import fr.esrf.TangoApi.*;

public class PogoUtil implements PogoDefs {

	private	static PogoUtil	instance = null;

	private PogoUtil()
	{
	}

	//===============================================================
	//===============================================================
	public static PogoUtil getInstance()
	{
		if (instance==null)
			instance = new PogoUtil();
		return instance;
	}

	//===============================================================
	//===============================================================
	private static final String[]	cpp_target  = {
									": public Tango::Device_3Impl",
									": public Tango::Device_2Impl",
									": public Tango::DeviceImpl"
									};
	private static final String[]	java_target  = {
									" extends DeviceImpl implements TangoConst"
									};
	private static final String	cpp_header = "class ";
	private static final String	java_header = "class ";
	//===============================================================
	/**
	 *	Return true if a Tango device impl class
	 *	
	 *	@param filename file's name to be checked.
	 */
	//===============================================================
	public static boolean isDeviceImplClass(String filename)
	{
		try
		{
			//	Read file content.
			String readcode = readFile(filename);;
			int	idx;
			//	Check if cpp device impl
			for (int i=0 ; i<cpp_target.length ; i++)
			{
				if ((idx=readcode.indexOf(cpp_target[i]))>0)
				{
					//System.out.println("Found in " + filename);
					return true;
				}
			}
			//	Check if java device impl
			for (int i=0 ; i<java_target.length ; i++)
			{
				if ((idx=readcode.indexOf(java_target[i]))>0)
				{
					//System.out.println("Found in " + filename);
					return true;
				}
			}
		}
		catch (Exception e) {}
		return false;
	}
	//===============================================================
	/**
	 *	Check if a Super class definition.
	 *	If true the method read_attr_hardware is a true virtual method.
	 */
	//===============================================================
	public static boolean checkIfSuperclass(String filename)
	{
		try
		{
			String readcode = readFile(filename);
			int	start = readcode.indexOf(
				"virtual void read_attr_hardware(vector<long> &attr_list)");
			if (start<0)
				return false;
			int end = readcode.indexOf("\n", start);
			return (readcode.substring(start, end).indexOf("NULL")>0);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	//===============================================================
	//===============================================================
	public static int deviceImplRevisionNumber(String filename)
	{
		try
		{
			String readcode = readFile(filename);
			
			//	Check if a Taco file --> TANGO not created Impl max
			String	ext = filename.substring(filename.lastIndexOf("."));
			if (ext.equals(".c"))
				return cpp_target.length;

			int	idx;
			//	Check if cpp device impl
			for (int i=0 ; i<cpp_target.length ; i++)
			{
				if ((idx=readcode.indexOf(cpp_target[i]))>0)
					return cpp_target.length-i;
			}
		}
		catch (Exception e) {
			//System.out.println(e);
			e.printStackTrace();

		}
		return -1;
	}
	//===============================================================
	//===============================================================
	static public String[]	getTangoFilesList(String dirname)
	{
		String[]	ext = { ".java", ".h" };
		String[]	list = getFilesList(dirname, ext);
		Vector 		v = new Vector();

		for (int i=0 ; i<list.length ; i++)
			if (isDeviceImplClass(list[i]))
				v.add(list[i]);
		 
		//	Convert to String array
		list = new String[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			list[i] = (String)v.elementAt(i);
		return list;
	}
	//===============================================================
	//===============================================================
	static public String[]	getCvsTangoFilesList(String dirname)
	{
		String[]	ext = { ".java,v", ".h,v" };
		String[]	list = getFilesList(dirname, ext);
		Vector 		v = new Vector();		
		for (int i=0 ; i<list.length ; i++)
			if (isDeviceImplClass(list[i]))
				v.add(list[i]);
		 
		//	Convert to String array
		list = new String[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			list[i] = (String)v.elementAt(i);
		return list;
	}
	//===============================================================
	//===============================================================
	static public String[] getFilesList(String dirname, String[] ext)
	{
		File	d = new File(dirname);
		String[]	filenames = d.list();
		Vector 		v = new Vector();

		if (filenames==null)
			return new String[0];
		for (int i=0 ; i<filenames.length ; i++)
		{
			//	Keep only file
			String	filename = dirname + "/" + filenames[i];
			File f = new File(filename);
			if (f.isFile() == false)
				continue;

			//	do filter
			for (int n=0 ; n<ext.length ; n++)
			{
				int start_ext = filename.length() - ext[n].length();
				if (filename.substring(start_ext).equals(ext[n]))
					v.add(filename);
			}
		}
		//	Convert to String array
		String[]	list = new String[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			list[i] = (String)v.elementAt(i);
		return list;
	}
	
	//===============================================================
	/**
	 *	Open a file and return text read.
	 */
	//===============================================================
	public static String readFile(String filename)
					throws	FileNotFoundException, 
							SecurityException,
							IOException
	{
		FileInputStream	fid = new FileInputStream(filename);
		int nb = fid.available();
		byte[]	inStr  = new byte[nb];
		fid.read(inStr);
		//	Use PogoString to be sure that no Windows char after.
		PogoString pgs = new PogoString(inStr);
		fid.close();
		return pgs.str;
	}
	//===============================================================
	/**
	 *	Open a file and return text read
	 *	after "src" has been replaced by "target'
	 */
	//===============================================================
	public static String readFile(String filename, String src, String target)
					throws	FileNotFoundException, 
							SecurityException,
							IOException
	{
		PogoString	pgs = new PogoString(readFile(filename));
		while (pgs.indexOf(src)>=0)
			pgs.replace(src, target);
		return pgs.str;
	}
	//===============================================================
	//===============================================================
	public static void writeFile(String filename, String str)
					throws	FileNotFoundException, 
							SecurityException,
							IOException
	{
		FileOutputStream	fidout = new FileOutputStream(filename);
		fidout.write(str.getBytes());
		fidout.close();
	}
	//===============================================================
	//===============================================================
	public static String replaceAll(String str, String src, String target)
	{
		PogoString pgs = new PogoString(str);
		while (pgs.str.indexOf(src)>=0)
			pgs.replace(src, target);
		return pgs.str;
	}
	//===============================================================
	//===============================================================
	public static String enteringTrace(String methodname)
	{
		//	if cpp -> start only at class name of method name.
		int	i;
		if ((i=methodname.indexOf("::"))>0)
		{
			while(i>0 && methodname.charAt(i)!=' ')
				i--;
			if (methodname.charAt(i)==' ')
				i++;
			methodname = methodname.substring(i);
		}
	
		String	line =
		 	"	DEBUG_STREAM << \"" + methodname + " entering... \"<< endl;\n";
		return line;
	}

	//===============================================================
	//===============================================================
	public static String checkCmdAttrName(	String name,
											Vector existingCmd,
											Vector existingAttr,
											int editingIdx)
		throws PogoException
	{
		//	Check if command name is empty
		if (name.length()<=0)
			throw new PogoException("Name field must be filled in !");

		//	Take off space char if exist
		//--------------------------------------
		StringTokenizer stk = new StringTokenizer(name);
		StringBuffer	sb = new StringBuffer();
		while (stk.hasMoreTokens())
		{
			String word = stk.nextToken();
			//	Set first char as upper case
			word = new String(word.substring(0,1).toUpperCase() +
												word.substring(1));
			sb.append(word);
		}
		name = sb.toString();

		// check if char used are OK (No Space, or # $ % @ & ...)
		for (int i=0 ; i<name.length() ; i++)
		{
			char	c = name.charAt(i);
			if (c<'0' || (c>'9' && c<'A') || (c>'Z' && c<'a') || c>'z')
				throw new PogoException("Syntax error in name !\n"+
										"Do not use '" + c + "' char.");
		}

		// check if command name already exist
		for (int i=0 ; i<existingCmd.size() ; i++)
		{
			if (i!=editingIdx)
			{
				Cmd	cmd = (Cmd) existingCmd.elementAt(i) ;
				if (name.toLowerCase().equals(cmd.name.toLowerCase()))
					throw new PogoException(name + " already exists as command !");
			}
		}
		// check if command name already exist as attribute
		for (int i=0 ; i<existingAttr.size() ; i++)
		{
			if (i!=editingIdx)
			{
				Attrib	attr = (Attrib) existingAttr.elementAt(i) ;
				if (name.toLowerCase().equals(attr.name.toLowerCase()))
					throw new PogoException(name + " already exists as attribute !");
			}
		}

		return name;
	}
	//===============================================================
	//===============================================================
	public static String checkCmdAttrName(String name)
		throws PogoException
	{
		//	Check if command name is empty
		if (name.length()<=0)
			throw new PogoException("Name field must be filled in !");

		//	Take off space char if exist
		//--------------------------------------
		StringTokenizer stk = new StringTokenizer(name);
		StringBuffer	sb = new StringBuffer();
		while (stk.hasMoreTokens())
		{
			String word = stk.nextToken();
			//	Set first char as upper case
			word = new String(word.substring(0,1).toUpperCase() +
												word.substring(1));
			sb.append(word);
		}
		name = sb.toString();

		// check if char used are OK (No Space, or # $ % @ & ...)
		for (int i=0 ; i<name.length() ; i++)
		{
			char	c = name.charAt(i);
			if (c<'0' || (c>'9' && c<'A') || (c>'Z' && c<'a') || c>'z')
				throw new PogoException("Syntax error in name !\n"+
										"Do not use '" + c + "' char.");
		}
		return name;
	}
//===========================================================
/**
 *	Read an help message in a file and return it.
 *
 *	@param	itemStr	Help item.
 *	@return	the text read in file.
 */
//===========================================================
	static public String getHelpMessage(String itemStr)
	{
		//	Get the template directory from property
		//--------------------------------------------------
		String templates_dir;
		if ((templates_dir=System.getProperty("TEMPL_HOME"))==null)
			return "No Template Property (TEMPL_HOME) Fixed !";

		try
		{
			String	filename = templates_dir + "/txt/";
			if (itemStr.equals("What's New ?"))
				filename += "WhatIsNew";
			else
			 	filename += itemStr;
			filename += ".txt";
			//	Open and read file
			//----------------------------------------
			FileInputStream		fidin = new FileInputStream(filename);
			int nb = fidin.available();
			byte[]	inStr  = new byte[nb];
			fidin.read(inStr);
			String str = new String(inStr);
			fidin.close();
			return str;
		}
		catch(FileNotFoundException e){	return e.toString(); }
		catch(IOException e){	return e.toString(); }
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
			throw new PogoException(
				"the shell command\n" + cmd + "\nreturns : " + retVal + " !\n\n"+
				sb.toString());
		}
		//System.out.println(sb);
		return sb.toString();
	}
	//===============================================================
	//===============================================================
	static public boolean osIsUnix()
	{
		try
		{
			String	os = PogoUtil.executeShellCmd("uname");
			//	Take Off Cr if exists
			int	end;
			if ((end=os.indexOf("\n"))>0)
				os = os.substring(0, end);
			//System.out.println("Running under " + os);
			return (os.equals("Linux") || os.equals("SunOS") || os.equals("HP-UX"));
		}
		catch(Exception e)
		{
			//System.out.println(e);
			return false;
		}
	}

	//===============================================================
	//===============================================================
	static PogoString removeLogMessages(String code)
	{
		return removeLogMessages(new PogoString(code));
	}
	//===============================================================
	//===============================================================
	static private void removeLogInfo(PogoString pgs)
	{
		//	Remove all log info (Author, Revision, ....)
		int	start = 0;
		Vector	v = new Vector();
		while ((start=pgs.str.indexOf("$", start))>0)
		{
			int		endline  = pgs.nextCr(start);
			String	line = pgs.substring(start, endline);
			start = line.indexOf(":");
			start++;
			int		end  = line.indexOf("$", start);
			String	info = line.substring(start, end).trim();
			start = endline+1;
			//System.out.println(info);
			v.add(info);
		}
		for (int i=0 ; i<v.size() ; i++)
			pgs.remove((String)v.elementAt(i));
	}
	//===============================================================
	//===============================================================
	static PogoString removeLogMessages(PogoString code)
	{
		//	Get the header
		//-------------------------------

		//	First time if C++, search namespace
		int	start = 0;
		int end = -1;
		while ((start=code.str.indexOf("namespace ", start+1))>0)
		{
			start = code.previousCr(start);
			end = code.nextCr(start+1);
			String	line = code.substring(start, end);
			System.out.println(line);
			if (line.indexOf("//")<0  && line.indexOf("using ")<0)
				break;
			else
				start = end;
		}

		if (end<0)
		{
			//	Check for java file
			end = code.str.indexOf("public class");
			if (end<0)
			{
				//	Check for Makefile
				end = code.str.indexOf("This file is generated by POGO");
				if (end<0)
					return code;
			}
		}

		String		header = code.substring(0, end);
		PogoString	new_header = new PogoString(header);
		//System.out.println(new_header);

		end = code.str.indexOf("copyleft");
		end = code.previousCr(end);
		end -=2;
		end = code.previousCr(end);

		//	Remove log messages
		start = code.str.indexOf("// $Log: ");
		if (start<0)
		{
			//	Check if makefile
			start = code.str.indexOf("# $Log: ");
			if (start<0)
				return code;
		}
		start = code.nextCr(start+1);
		start++;
		String	log_part = new_header.substring(start, end);
		new_header.remove(log_part);

		removeLogInfo(new_header);
		code.replace(header, new_header.str);

		return code;
	}
	//===============================================================
	//===============================================================
	static void buildReleaseNoteHtml(String title)
	{
		String	header =
"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 3.2//EN\">\n"+
"<HTML>\n"+
"<HEAD>\n"+
"<Title> Release Note </Title>\n"+
"</HEAD>\n"+
"<BODY TEXT=\"#000000\" BGCOLOR=\"#FFFFFF\" "+
"LINK=\"#0000FF\" VLINK=\"#7F00FF\" ALINK=\"#FF0000\">\n"+
"<P><!-------TITLE------></P>\n\n";

		//	Append title to header
		header = "<Center><h2>" + title + "</h2></Center><Br>\n";

		try
		{
			//	Relace Header by html header.
			String	filename = "ReleaseNote";
			PogoString	code = new PogoString(readFile(filename));
			int	end = code.str.indexOf("#-===========================", 10);
			if (end<0)
				throw new PogoException("End of header not found !");
			end = code.str.indexOf("\n", end) + 1;
			code.replace(code.str.substring(0, end), header);

			//	Add html break line for at each \n
			String	breakLine = "<Br>";
			int		start = code.str.indexOf("<P><!-------TITLE------></P>");
			start = code.str.indexOf("\n", start) + 2;
			int	idx = start;
			while ((idx=code.str.indexOf("\n", idx))>0)
			{
				code.insert(idx, breakLine);
				idx = code.str.indexOf("\n", idx) + 1;
			}

			//	Add bold char
			String	startBold = "<li><b>";
			String	stopBold  = "</b>";
			idx = start;
			while ((idx=code.str.indexOf(":", idx))>0)
			{
				idx++;	//	after ":"
				code.insert(idx, stopBold);
				code.insert(code.str.lastIndexOf("\n", idx)+1, startBold);
				idx = code.str.indexOf("\n", idx) + 1;
			}
			code.str += "</Body>\n</Html>\n";
			writeFile(filename + ".html", code.str);
		}
		catch(PogoException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//===============================================================
	//===============================================================
	public static void main(java.lang.String[] args)
	{
		if (args.length>1)
			if (args[0].equals("ReleaseNote"))
			{
				PogoUtil.buildReleaseNoteHtml(args[1]);
				System.exit(0);
			}
		
	
	
	
		//String	filename = "/segfs/tango/cppserver/admin/starter/Makefile";
		String	filename = "../test/java/PowerSupply/PowerSupply.java";
		//String	filename = "/segfs/tango/cppserver/admin/starter/Starter.cpp";
		/*
		System.out.println("DeviceImplClass : " +
				pogo.gene.PogoUtil.isDeviceImplClass(filename));
		System.out.println("Version number : " +
				pogo.gene.PogoUtil.deviceImplRevisionNumber(filename));
		*/
		try {
			PogoString	code = new PogoString(
				pogo.gene.PogoUtil.readFile(filename));
			code =  pogo.gene.PogoUtil.removeLogMessages(code);
			//System.out.println(code.substring(0, code.indexOf("ifdef")));
			//System.out.println(code.substring(0, code.indexOf("namespace Starter")));
			System.out.println(code.substring(0, code.indexOf("public class")));
		}
		catch (Exception e) {
			//System.out.println(e);
			e.printStackTrace();

		}
	}
	//===============================================================
	//===============================================================
}
