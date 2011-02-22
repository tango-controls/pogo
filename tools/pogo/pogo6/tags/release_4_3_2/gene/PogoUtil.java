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
// Revision 3.19  2005/05/19 13:08:48  pascal_verdier
// Bug in case of not any command defined fixed.
//
// Revision 3.18  2005/03/29 15:02:27  pascal_verdier
// Bug on change class name fixed.
//
// Revision 3.17  2005/03/08 10:33:49  pascal_verdier
// Bug on remove_log_message() fixed.
//
// Revision 3.16  2005/03/03 09:51:47  pascal_verdier
// Add buildReleaseNoteHtml() call in main() removed by error.
//
// Revision 3.15  2005/03/02 13:59:31  pascal_verdier
// Managing Super Classes and inherited classes.
//
// Revision 3.14  2005/03/02 10:27:12  pascal_verdier
// Managing Super Classes and inherited classes.
//
// Revision 3.13  2005/02/15 10:43:27  pascal_verdier
// Change to header file if cpp file selected in deviceImplRevisionNumber method.
//
// Revision 3.12  2005/01/25 15:45:14  pascal_verdier
// *** empty log message ***
//
// Revision 3.11  2005/01/25 15:31:11  pascal_verdier
// ATTR_SOLEIL param added to do not force upper case at befinig of attribute name.
//
// Revision 3.10  2005/01/17 15:42:22  pascal_verdier
// Bug on double cotes in class description fixed.
//
// Revision 3.9  2004/12/17 14:40:43  pascal_verdier
// Bug fixed on files list.
//
// Revision 3.8  2004/12/08 10:14:33  pascal_verdier
// buildReleaseNoteHtml method added.
//
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
	static final String[]	cpp_target  = {
									"Inherited from class ",
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
			String readcode = readFile(filename);
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
	public static boolean checkIfSuperclass(String filename, CmdTable commands)
	{
		try
		{
			String readcode = readFile(filename);
			int	start = readcode.indexOf(
				"virtual void read_attr_hardware(vector<long> &attr_list)");
			if (start>0)
			{
				//	Attribute are implemented, can check on this method
				int end = readcode.indexOf("\n", start);
				return (readcode.substring(start, end).indexOf("NULL")>0);
			}
			if (commands.size()>2)
			{
				//	Take first command to check
				Cmd	cmd = commands.cmdAt(3);
				String	proto = cmd.buildCppCmdProtypesLine();
				proto = proto.substring(0, proto.length()-2); // Take off ;\n
				start = readcode.indexOf(proto);
				int end = readcode.indexOf("\n", start);
				return (readcode.substring(start, end).indexOf("NULL")>0);
			}
			else
				return false;
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
			//	Check if a Taco file --> TANGO not created Impl max
			String	ext = filename.substring(filename.lastIndexOf("."));
			if (ext.equals(".c"))
				return cpp_target.length;

			//	Change to header file if cpp file selected.
			if (ext.equals(".cpp"))
				filename = filename.substring(0, filename.lastIndexOf(".")) + ".h";
			
			String readcode = readFile(filename);

			int	idx;
			//	Check if cpp device impl
			for (int i=0 ; i<cpp_target.length ; i++)
			{
				if ((idx=readcode.indexOf(cpp_target[i]))>0)
					//	Check if from super class
					if (i==0)
						return cpp_target.length-1;
					else
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
	public static String getInheritance(String classname, String filename)
			throws	PogoException,
					FileNotFoundException, 
					SecurityException,
					IOException
	{
		String readcode = readFile(filename);

		//	check if pure tango DeviceImpl
		if (readcode.indexOf(cpp_target[1])>0)
			return tangoDeviceImpl;

		//	Search class definition
		String target = "class " + classname + ": public ";
		int start = readcode.indexOf(target);
		start += target.length();
		int end   = readcode.indexOf("//", start);
		if (end<0)
			throw new PogoException("Inheritance syntax error");

		//	And take off tango namespace
		String abstractclass = readcode.substring(start, end).trim();
		start = abstractclass.indexOf("::");
		if (start<0)
			throw new PogoException("Inheritance syntax error");
		abstractclass = abstractclass.substring(start+2);

		//	Search the Super class files
		String[]	cl_list = abstractClassList();
		boolean		found = false;
		System.out.println(cl_list.length + " Super Classes available:");
		for (int i=0 ; !found && i<cl_list.length ; i++)
		{
			System.out.println(cl_list[i]);
			//	get the path
			start  = cl_list[i].lastIndexOf("/");
			if (start>0)
			{
				String	_class = cl_list[i].substring(start+1, cl_list[i].lastIndexOf("."));
				found = _class.equals(abstractclass);
				//	Ok keep the full path but not the extention
				if (found)
					abstractclass = cl_list[i].substring(0, cl_list[i].lastIndexOf("."));
			}
		}
		if (!found)
		{
			//	Add Super class path if set
			String	path;
			if ((path=System.getProperty("SUPER_HOME"))!=null)
				abstractclass = path + "/" + abstractclass;
		}
		return abstractclass;
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
				if (start_ext>0)
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
	private static String	attrSoleil = null;
	public static String checkCmdAttrName(	String name,
											Vector existingCmd,
											Vector existingAttr,
											int editingIdx, int family)
		throws PogoException
	{
		//	Check if command name is empty
		if (name.length()<=0)
			throw new PogoException("Name field must be filled in !");

		//	Special Case for SOLEIL (attr without upper case)
		//------------------------------------------------------
		if (attrSoleil==null)
			if ((attrSoleil=System.getProperty("ATTR_SOLEIL"))==null)
				attrSoleil = "false";
			else
				attrSoleil = attrSoleil.toLowerCase();

		//	Take off space char if exist
		//--------------------------------------
		StringTokenizer stk = new StringTokenizer(name);
		StringBuffer	sb = new StringBuffer();
		while (stk.hasMoreTokens())
		{
			String word = stk.nextToken();
			//	Set first char as upper case
			//	Except for Soleil attribute (They do not want upper case!!)
			if (family==pogo.appli.PogoAppliDefs.ATTRIBUTES &&
				attrSoleil.equals("true"))
				word = new String(word.substring(0,1) + word.substring(1));
			else //	others
				word = new String(word.substring(0,1).toUpperCase() +
														word.substring(1));
			sb.append(word);
		}
		name = sb.toString();

		// check if char used are OK (No Space, or # $ % @ & ...)
		for (int i=0 ; i<name.length() ; i++)
		{
			char	c = name.charAt(i);
			if ((c<'0' || (c>'9' && c<'A') || (c>'Z' && c<'a') || c>'z') && c!='_')
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
		int		start = 0;
		int 	end = -1;
		while ((start=code.str.indexOf("namespace ", start+1))>0)
		{
			start = code.previousCr(start);
			end = code.nextCr(start+1);
			String	line = code.substring(start, end);
			if (line.indexOf("//")<0  && line.indexOf("using ")<0)
				break;
			else
				start = end;
		}
		if (start<0)	//	not found
			end = -1;

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
	/**
	 *	Used by : make tangorb doc
	 *	to add release number and notes in  html class doc
	 */
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
	static private boolean test_mode = false;
	static private boolean test_mode_read = false;
	static public boolean is_test_mode()
	{
		if (test_mode_read==false)
		{
			String	test = System.getProperty("POGO_TEST");
			if (test!=null && test.toLowerCase().equals("true"))
				test_mode = true;
			test_mode_read = true;
		}
		return test_mode;
	}
	//===============================================================
	//===============================================================
	static private Vector searchAbstractClassList(String dirname)
	{
		String[]	ext = { ".java", ".h" };
		Vector 		v = new Vector();
		if (dirname==null)
			return v;
		File	d = new File(dirname);
		String[]	filenames = d.list();

		if (filenames==null)
			return v;
		for (int i=0 ; i<filenames.length ; i++)
		{
			//	Recursive if directory
			String	filename = dirname + "/" + filenames[i];
			File f = new File(filename);
			if (f.isDirectory())
			{
				Vector	vd = searchAbstractClassList(f.toString());
				for (int n=0 ; n<vd.size() ; n++)
					v.add(vd.elementAt(n));
			}
			else
			//	do filter
			for (int n=0 ; n<ext.length ; n++)
			{
				int start_ext = filename.length() - ext[n].length();
				if (start_ext>0)
					if (filename.substring(start_ext).equals(ext[n]))
						if (isDeviceImplClass(filename))	//	is Tango class ?
							v.add(filename);
			}
		}
		return v;
	}
	//===============================================================
	//===============================================================
	static public String[] abstractClassList()
	{
		String	super_home = System.getProperty("SUPER_HOME");
		System.out.println("Searching in " + super_home);
		Vector	v = searchAbstractClassList(super_home);
		String[]	cl_list = new String[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			cl_list[i] = (String)v.elementAt(i);
			
		return cl_list;
		//return getTangoFilesList(super_home);
	}
	//===============================================================
	//===============================================================
	public static void main(java.lang.String[] args)
	{
		//	The following part is used by : make tangorb doc
		//	to add release number and notes in  html class doc
		//----------------------------------------------------
		if (args.length>1)
			if (args[0].equals("ReleaseNote"))
			{
				PogoUtil.buildReleaseNoteHtml(args[1]);
				System.exit(0);
			}
		/*****
		PogoUtil	pu	= PogoUtil.getInstance();
		String[]	fl = pu.abstractClassList();
		for (int i=0 ; i<fl.length ; i++)
			System.out.println(fl[i]);
		******/
	}
	//===============================================================
	//===============================================================
}
