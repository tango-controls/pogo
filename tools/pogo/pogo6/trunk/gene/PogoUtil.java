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
// Revision 3.40  2009/10/07 12:41:51  pascal_verdier
// IDL 4 added for Python (PyTango-7)
//
// Revision 3.39  2009/02/18 15:02:15  pascal_verdier
// Tango 7 (IDL 4) compatibility implementation.
//
// Revision 3.38  2008/08/05 07:22:10  pascal_verdier
// getFileList() method added.
//
// Revision 3.37  2008/02/13 15:45:31  pascal_verdier
// Java Class signature changed
//
// Revision 3.36  2007/08/07 13:06:00  pascal_verdier
// Generate Makefile and Windows Project management added.
//
// Revision 3.35  2007/06/14 09:26:54  pascal_verdier
// Python class check added for automatic doc generation.
//
// Revision 3.34  2007/05/23 06:11:01  pascal_verdier
// In cvs tags management check if it has been deleted.
//
// Revision 3.33  2007/04/27 06:03:32  pascal_verdier
// *** empty log message ***
//
// Revision 3.32  2007/04/17 14:04:00  pascal_verdier
// Attributes are now displayed separatly
// (Scalar, Spectrum and image attributes)
//
// Revision 3.31  2006/11/09 14:09:51  pascal_verdier
// CVS tags management modified.
//
// Revision 3.30  2006/11/02 11:41:03  pascal_verdier
// Python code generation added.
//
// Revision 3.29  2006/09/19 13:20:52  pascal_verdier
// Allow boolean attribute for java servers.
// Bug in command factory for abstract class generation fixed.
// Bug in changing class name fixed.
// Abstarct classes sorted.
//
// Revision 3.28  2006/07/18 06:21:29  pascal_verdier
// logString method added.
//
// Revision 3.27  2006/06/26 09:22:47  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.26  2006/03/16 08:56:34  pascal_verdier
// Add a VCC project file generation.
//
// Revision 3.25  2006/01/30 11:02:10  pascal_verdier
// Revision and cvsroot are taken from CVS files if exists.
// Doc in pdf generated if linux.
//
// Revision 3.24  2005/12/07 12:18:10  pascal_verdier
// Tag command added in Makefile.
//
// Revision 3.23  2005/12/02 14:22:46  pascal_verdier
// idem.
//
// Revision 3.22  2005/12/02 14:10:35  pascal_verdier
// ReleaseNote to html modified.
//
// Revision 3.21  2005/11/24 08:29:49  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.20  2005/06/14 08:44:25  pascal_verdier
// SuperClass is replaced by AbstractClass.
//
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
 */


import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

@SuppressWarnings({"NestedTryStatement"})
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
    public static final String[]	cpp_target  = {
                                    "Inherited from class ",
                                    ": public Tango::Device_4Impl",
                                    ": public Tango::Device_3Impl",
                                    ": public Tango::Device_2Impl",
                                    ": public Tango::DeviceImpl"
                                    };
    public static final String[]	java_target  = {
                                    " extends DeviceImpl",	// implements TangoConst"
                                    };
    public static final String[]	py_target  = {
                                    "(PyTango.Device_4Impl):",
                                    "(PyTango.Device_3Impl):"
                                    };
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
			
			//	Check if new POGO generated code (oAW)
			if (readcode.startsWith("/*PROTECTED REGION ID"))
				return false;

            //	Check if cpp device impl
			for (String aCpp_target : cpp_target)
				if (readcode.indexOf(aCpp_target) > 0)
					return true;
            //	Check if java device impl
			for (String aJava_target : java_target)
				if (readcode.indexOf(aJava_target) > 0)
					return true;
            //	Check if python device impl
			for (String aPy_target : py_target)
				if (readcode.indexOf(aPy_target) > 0)
					return true;
        }
        catch (Exception e) { /* Noting to do */}
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
                if (readcode.substring(start, end).indexOf("NULL")>0)
                    return true;
                else
                    return (readcode.substring(start, end).indexOf("0")>0);
            }
            if (commands.size()>2)
            {
                //	Take first command to check
                Cmd	cmd = commands.cmdAt(2);
                String	proto = cmd.buildCppCmdProtypesLine();
                proto = proto.substring(0, proto.length()-2); // Take off ;\n
                start = readcode.indexOf(proto);
                int end = readcode.indexOf("\n", start);
                if (readcode.substring(start, end).indexOf("NULL")>0)
                    return true;
                else
                    return (readcode.substring(start, end).indexOf("0")>0);
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

            //  Python case
            if (ext.equals(pyExtention))
            {
                String readcode = readFile(filename);

                //	Check if device impl
                String  dev_impl = py_target[1];
                for (int i=0 ; i<py_target.length ; i++)
                    if (readcode.indexOf(py_target[i])>=0)
                        dev_impl = py_target[i];

                int end   = dev_impl.indexOf("Impl");
                int start = dev_impl.lastIndexOf("_", end)+1;
                return Integer.parseInt(dev_impl.substring(start, end));
            }


            //	Change to header file if cpp file selected.
            if (ext.equals(".cpp"))
                filename = filename.substring(0, filename.lastIndexOf(".")) + ".h";

            String readcode = readFile(filename);

            //	Check if cpp device impl
            for (int i=0 ; i<cpp_target.length ; i++)
            {
                if (readcode.indexOf(cpp_target[i])>0)
                    //	Check if from super class
                    if (i==0)
                        return cpp_target.length-1;
                    else
                        return cpp_target.length-i;
            }
        }
		catch (NumberFormatException e)
		{
			System.out.println(e);
			return 1;
		}
		catch (Exception e)
		{
			System.out.println(e);
            //e.printStackTrace();

        }
        return -1;
    }
    //===============================================================
    //===============================================================
    public String getInheritance(String classname, String filename)
            throws	PogoException,
                    FileNotFoundException,
                    SecurityException,
                    IOException
    {
        String readcode = readFile(filename);

        //	check if pure tango DeviceImpl
        if (readcode.indexOf(cpp_target[1])>0)
            return tangoDeviceImpl;

        //  Check for previous Tango DeviceImpl
        if (readcode.indexOf(cpp_target[2])>0)
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
	System.out.println("in getTangoFilesList for " + dirname);
        String[]	ext = { ".java", ".h", ".py" };
        String[]	list = getFilesList(dirname, ext);
        Vector 		v = new Vector();
	System.out.println("found  " + list.length + " files");

		for (String file : list)
			if (isDeviceImplClass(file))
				v.add(file);

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
        String[]	ext = { ".java,v", ".h,v" , ".py,v"};
        String[]	list = getFilesList(dirname, ext);
        Vector 		v = new Vector();
		for (String file : list)
			if (isDeviceImplClass(file))
				v.add(file);

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
		for (String name : filenames)
		{
			//	Keep only file
			String filename = dirname + "/" + name;
			File f = new File(filename);
			if (!f.isFile())
				continue;

			//	do filter
			for (String anExt : ext)
			{
				int start_ext = filename.length() - anExt.length();
				if (start_ext > 0)
					if (filename.substring(start_ext).equals(anExt))
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
        nb = fid.read(inStr);
        fid.close();
        //	Use PogoString to be sure that no Windows char after.
        PogoString pgs;
        if (nb>0)
            pgs= new PogoString(inStr);
        else
            pgs = new PogoString("");
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
    private static String checkOsFormat(String code)
    {
        if (!PogoUtil.osIsUnix())
            return setWindowsFileFormat(code);
        else
            return code;
    }

    //===============================================================
    //===============================================================
    public static String setWindowsFileFormat(String code)
    {
        //	Convert default Unix format to Windows format
        byte[]  b = { 0xd, 0xa };
        String	lsp = new String(b); //System.getProperty("line.separator");
        code = code.replaceAll("\n", lsp);
        return code;
    }
    //===============================================================
    //===============================================================
    public static void writeFile(String filename, String str)
                    throws	FileNotFoundException,
                            SecurityException,
                            IOException
    {
        str = checkOsFormat(str);
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

        return "	DEBUG_STREAM << \"" + methodname + " entering... \"<< endl;\n";
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
            if (family==PogoDefs.ATTRIBUTES &&
                attrSoleil.equals("true"))
                word = word.substring(0,1) + word.substring(1);
            else //	others
                word = word.substring(0,1).toUpperCase() + word.substring(1);
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
            if (itemStr.startsWith("What's New"))
                filename += "WhatIsNew";
            else
                 filename += itemStr;
            filename += ".txt";
            //	Open and read file
            //----------------------------------------
            return readFile(filename);
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
    public static String executeShellCmd(String cmd)
			throws IOException, InterruptedException, PogoException
    {
        Process proc = Runtime.getRuntime().exec(cmd);

        // get command's output stream and
        // put a buffered reader input stream on it.
        //-------------------------------------------
        InputStream istr = proc.getInputStream();
        BufferedReader br =
                new BufferedReader(new InputStreamReader(istr));
        String	sb = "";

        // read output lines from command
        //-------------------------------------------
        String str;
        while ((str = br.readLine()) != null)
        {
            //System.out.println(str);
            sb += str+"\n";
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
                sb += str+"\n";
            }
            throw new PogoException(
                "the shell command\n" + cmd + "\nreturns : " + retVal + " !\n\n"+ sb);
        }
        //System.out.println(sb);
        return sb;
    }
    //===============================================================
    //===============================================================
    static public String osName()
    {
        return System.getProperty("os.name");
    }
    //===============================================================
    //===============================================================
    static public boolean osIsUnix()
    {
        String  os = osName();
        return (os.equals("Linux") || os.equals("SunOS") || os.equals("HP-UX"));
    }

    //===============================================================
    //===============================================================
    static public PogoString removeLogMessages(String code)
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
    static public PogoString removeLogMessages(PogoString code)
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
    //===============================================================
    static private boolean test_mode = false;
    static private boolean test_mode_read = false;
    static public boolean is_test_mode()
    {
        if (!test_mode_read)
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
    public String[] getFileList(String dirname, String ext)
    {
        Vector 		v = new Vector();
        if (dirname==null)
            return new String[0];
        File	d = new File(dirname);
        String[]	filenames = d.list();

        if (filenames==null)
            return new String[0];
		for (String name : filenames)
		{
			//	Recursive if directory
			String filename = dirname + "/" + name;
			File f = new File(filename);
			if (!f.isDirectory())
			{
				//	do filter
				int start_ext = filename.length() - ext.length();
				if (start_ext > 0)
					if (filename.substring(start_ext).equals(ext))
						v.add(name);
			}
		}
        MyCompare		compare = new MyCompare();
        Collections.sort(v, compare);
        
		String[]	s = new String[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			s[i] = (String)v.get(i);
		return s;
    }
    //===============================================================
    //===============================================================
    private Vector searchAbstractClassList(String dirname)
    {
        String[]	ext = { ".java", ".h" };
        Vector 		v = new Vector();
        if (dirname==null)
            return v;
        File	d = new File(dirname);
        String[]	filenames = d.list();

        if (filenames==null)
            return v;
		for (String name : filenames)
		{
			//	Recursive if directory
			String filename = dirname + "/" + name;
			File f = new File(filename);
			if (f.isDirectory())
			{
				Vector vd = searchAbstractClassList(f.toString());
				for (int n = 0; n < vd.size(); n++)
					v.add(vd.elementAt(n));
			}
			else
				//	do filter
				for (String anExt : ext)
				{
					int start_ext = filename.length() - anExt.length();
					if (start_ext > 0)
						if (filename.substring(start_ext).equals(anExt))
							if (isDeviceImplClass(filename))	//	is Tango class ?
								v.add(filename);
				}
		}
        MyCompare		compare = new MyCompare();
        Collections.sort(v, compare);
        return v;
    }
    //===============================================================
    //===============================================================
    public String[] abstractClassList()
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
    static public String getCvsRepository(String path)
    {
        try
        {
            String  filename = path + "/CVS/Root";
            String  code = readFile(filename).trim();

            String	repository = "ESRF";
            if (code.lastIndexOf("tango-cs")>0)
                repository = "tango-cs";
            else
            if (code.lastIndexOf("tango-ds")>0)
                repository = "tango-ds";

             if (code.indexOf("sourceforge")>0)
               repository = "sourceforge("+ repository + ")";
            return repository;
        }
        catch(Exception e)
        {
            //e.printStackTrace();
            return null;
        }
    }
     //===============================================================
    //===============================================================
    static public String getTagRevision(String filename, String class_name)
    {
        try
        {
           String	code = readFile(filename);
            //	Check if tagName exists and get it
            int		start = code.indexOf("$Name:");
            if (start<0)	return null;
            start += "$Name:".length();
            int end = code.indexOf("$", start);
            String	line = code.substring(start, end).trim();
            class_name += "-";
            if (line.startsWith(class_name))
                line = line.substring(class_name.length());
            return line;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    //===============================================================
    /**
     *	Replace char non alpha by a '_' char
     */
    //===============================================================
    public static String checkFileName(String filename)
    {
        System.out.println(filename);
        byte[]	chars = new byte[filename.length()];
        for (int i=0 ; i<filename.length() ; i++)
        {
            byte	c = (byte)filename.charAt(i);
            if ((c>='A' && c<='Z') ||
                (c>='a' && c<='z') ||
                (c>='0' && c<='9') || c=='.')
                chars[i] = c;
            else
                chars[i] = '_';
        }
        return new String(chars);
    }
    //===============================================================
    /**
     *	Log if LOG is set
     */
    //===============================================================
    private static final String	logfile = "/tmp/pogo.log";
    public static void logString(String str)
    {
        String	log = System.getProperty("LOG");
        if (log==null)
            return;
        if (!log.equals("true"))
            return;

        //	LOG is set
        try
        {
            String	logstr = "";
            try
            {
                logstr = readFile(logfile);
            }
            catch(Exception e) {/** do nothing */}
            logstr += str + "\n";
            writeFile(logfile, logstr);
        }
        catch(Exception e)
        {
            System.out.println(e + " in writing " + str);
        }
    }




	//===============================================================
	//===============================================================
	public static String pythonUserPart(String method)
	{
		int	start = method.indexOf("End of Generated Code");
		int	end   = method.indexOf("Start of Generated Code");
		if (end<0 || start<0)
			return "";
		start = method.indexOf("\n", start)+1;
		end   = method.lastIndexOf("\n", end)+1;
		return method.substring(start, end);
	}
	//===============================================================
	//===============================================================
	public static String pythonMethod(String str, String signature)
	{
		return pythonMethod(str, signature, 0);
	}
	//===============================================================
	//===============================================================
	public static String pythonMethod(String str, String signature, int idx)
	{
		//	Get method code
		int	start = str.indexOf(signature, idx);
		if (start<0)
			return null;
		int	end = endOfPythonMethod(str, start);
		start = str.lastIndexOf("\n", start);

		//	Get method comments
		boolean found = false;
		while (!found && (start=str.lastIndexOf("\n", start-1))>0)
			found = (str.charAt(start+1)!='#'  ||
					 str.substring(start+1).startsWith("#=============="));
		if (str.substring(start+1).startsWith("#=============="))
			start = str.indexOf("\n", start+1)+1;

		//	Check that is not starting with something else than comments
		String	method = str.substring(start, end).trim();
		while (!method.startsWith(signature) && !method.startsWith("#"))
		{
			start = str.indexOf('\n', start)+1;
			method = str.substring(start, end).trim();
		}
		return str.substring(start, end).trim();
	}
	//===============================================================
	//===============================================================
	public static int endOfPythonMethod(String str, int idx)
	{
		//	Search method start point
		String	def = "def ";

		//	Is it in first line ?
		int	end = str.indexOf("\n", idx);
		int	start = str.indexOf(def, idx);
		if (start<0 || start>end)
			start = str.lastIndexOf(def, idx);	//	else search before

		//	get indentation
		String indentation = str.substring(
					str.lastIndexOf("\n", start)+1, start);
		def = indentation + def;

		//	Search next block start point
		idx = str.indexOf("\n", idx);
		int	next_class  = str.indexOf("\nclass ", idx);
		int	next_main   = str.indexOf("\nif __name__ == '__main__':", idx);
		int	next_method = str.indexOf(def, idx);

		if (next_class<0)	next_class  = str.length()-1;
		if (next_main<0)	next_main   = str.length()-1;
		if (next_method<0)	next_method = str.length()-1;

		end = next_method;
		if (next_class<end)	end = next_class;
		if (next_main<end)	end = next_main;
		end = str.lastIndexOf("\n", end);

		//	Skip comments if any before it
		boolean found = false;
		while (!found && (end=str.lastIndexOf("\n", end-1))>0)
			found = (str.charAt(end+1)!='\n'  && str.charAt(end+1)!='#');

		end = str.indexOf("\n", end+1)+1;
 		return end;
	}
	//===============================================================
	/**
	 *	Returns the list of python methods found
	 */
	//===============================================================
	static String[] getPyMethodList(String code)
	{
		Vector	v = new Vector();
		int start = 0;
		while ((start=code.indexOf("def ", start))>0)
		{
			int	end = start + 4;

			//	Check if def alone
			if (code.charAt(start-1)=='\t' || code.charAt(start-1)==' ')
			{
				//	Check if comment
				int	line_start = code.lastIndexOf("\n", start)+1;
				if (code.charAt(line_start)!='#')
				{
					end = code.indexOf("\n", start);
                    if (end<0)
                        end = code.length()-1;
					//System.out.println(code.substring(start, end));
					v.add(code.substring(start, end));
				}
			}
			start = end;
		}
		String[]	list = new String[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			list[i] = (String)v.get(i);
		return list;
	}
    //===============================================================
    //===============================================================



    //===============================================================
    //===============================================================
    //private static final int	T       = 0;
    //private static final int	DATE    = 1; // NOt used anymore
    //private static final int	TIME    = 2; // NOt used anymore
    //private static final int	ADD     = 3; // NOt used anymore
   // private static final int	USER    = 4; // NOt used anymore
    private static final int	MODULE  = 5;
    private static final int	TAGNAME = 6;
    private static final int	NB_PARAM= TAGNAME+1;
    //===============================================================
	/**
	 *	Execute cvs history to read all tags of the specified cvsroot
	 */
    //===============================================================
    static public Vector getCvsTags(String cvsroot)
			throws IOException, InterruptedException, PogoException
    {
        String	cmd_tags = "cvs  -d " + cvsroot + " history -T -a";
        System.out.println(cmd_tags);
        String	result = executeShellCmd(cmd_tags);
		Vector	retVect = new Vector();
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
                //	Copy to a String array
                String[]	param = new String[NB_PARAM];
                for (int i=0 ; i<v.size() && i<NB_PARAM ; i++)
                    param[i] = (String)v.get(i);
                param[TAGNAME] = getTagName(param[TAGNAME]);

				//	Check if it has not be deleted
				if (param[TAGNAME] !=null)
					retVect.add(param);
            }
        }
		return retVect;
	}
    //===============================================================
	/**
	 *	Execute cvs history to read all tags of the specified cvsroot
	 *	And then sort them to keep only the last one for each module.
	 */
    //===============================================================
    static public Vector getLastCvsTags(String cvsroot)
		throws IOException, InterruptedException, PogoException
	{
		Vector	names   = new Vector();
		Vector	retVect = new Vector();
		Vector	tags = PogoUtil.getCvsTags(cvsroot);
		
		//	Get all module names
		for (Object tag1 : tags)
		{
			String[]	tag = (String[]) tag1;
			//	Search if it already exists
			boolean exists = false;
			for (int j = 0; !exists && j < names.size(); j++)
			{
				String modname = (String) names.get(j);
				exists = (modname.equals(tag[MODULE]));
			}
			if (!exists)
				names.add(tag[MODULE]);
		}
		//	For each module search last tag (decrease for last one)
		for (Object name : names)
		{
			String modname = (String) name;
			//System.out.println(names.get(i));
			boolean found = false;
			for (int j = tags.size() - 1; !found && j >= 0; j--)
			{
				String[]	tag = (String[]) tags.get(j);
				if (modname.equals(tag[MODULE]))
				{
					found = true;
					retVect.add(tag);
				}
			}
		}
		return retVect;
	}
    //===============================================================
	/**
	 *	Search in Vector (returned by getLastCvsTags method)
	 */
    //===============================================================
    static public String getLastCvsTag(Vector tags, String module_name)
	{
		try
		{
			for (Object tag1 : tags)
			{
				String[]	tag = (String[]) tag1;
				if (tag[MODULE].equals(module_name))
					return tag[TAGNAME];
			}
		}
		catch (Exception e)
		{
            System.out.println(e);
		}
		return null;
	}
    //===============================================================
    //===============================================================
    private static String getTagName(String str)
    {
		int	idx = str.indexOf(':');
		if (idx<0)
			return null;
		else
		if (str.substring(idx).equals(":D]"))	//	Tag deleted.
			return null;
		else
	        return str.substring(1, idx);
    }
    //===============================================================
    //===============================================================
    public Vector<String> checkForTangoDir(String dirname)
    {
        String[]	ext = { ".java", ".h", "py" };
        Vector<String>	v = new Vector<String>();
        if (dirname==null)
            return v;
        File	d = new File(dirname);
        String[]	filenames = d.list();

        if (filenames==null)
            return v;
		for (String name : filenames)
		{
			//	Recursive if directory
			String filename = dirname + "/" + name;
			File f = new File(filename);
			if (f.isDirectory())
			{
				Vector<String> vd = checkForTangoDir(f.toString());
				for (int n = 0; n < vd.size(); n++)
					v.add(vd.elementAt(n));
			}
			else
				//	do filter
				for (String anExt : ext)
				{
					int start_ext = filename.length() - anExt.length();
					if (start_ext > 0)
						if (filename.substring(start_ext).equals(anExt))
							if (isDeviceImplClass(filename))	//	is Tango class ?
								v.add(filename);
				}
		}
        MyCompare	compare = new MyCompare();
        Collections.sort(v, compare);
        return v;
    }
    //===============================================================
    //===============================================================
	public static String getSvnInfo(String filename, String tag)
	{
		String	ret_str = "";
		int pos = filename.lastIndexOf('/');
		String	svndir = (pos<0)? "." : filename.substring(0, pos);
		svndir +=  "/.svn";

		if (new File(svndir).exists())
		{
			//System.out.println("Checking " + svndir);
			try
			{
				String	cmd = "svn info " + filename;
				String	info = PogoUtil.executeShellCmd(cmd);
				//System.out.println(info);

				pos = info.indexOf(tag);
				if (pos>=0)
				{
					int start = pos + tag.length();
					int	end   = info.indexOf('\n', start);
					ret_str = info.substring(start, end).trim();
				}
			}
			catch(Exception e) {
				//System.err.println(e);
			}
		}
		return ret_str;
	}
     //===============================================================
    //===============================================================
	public static String getCvsInfo(String filename, String tag)
	{
		String	ret_str = "";
		int pos = filename.lastIndexOf('/');
		String	cvsdir = (pos<0)? "." : filename.substring(0, pos);
		cvsdir +=  "/CVS";

		if (new File(cvsdir).exists())
		{
			//System.out.println("Checking " + cvsdir);
			try
			{
				String	cvsroot = readFile(cvsdir+"/Root").trim();
				if (cvsroot.startsWith("/"))	//	Is a local repository
				{
					String	cmd = "cvs -d " + cvsroot + " log " + filename;
					//String	cmd = "cvs   log " + filename;
					String	info = PogoUtil.executeShellCmd(cmd);
					//System.out.println(cmd);
					//System.out.println(info);

					pos = info.indexOf(tag);
					if (pos>=0)
					{
						int start = pos + tag.length();
						int	end   = info.indexOf(';', start);
						ret_str = info.substring(start, end).trim();

						end = ret_str.indexOf('\n');
						if (end>0)
							ret_str = ret_str.substring(0, end).trim();
						end = ret_str.indexOf(':');
						if (end>0)
							ret_str = ret_str.substring(0, end).trim();

						if (ret_str.startsWith("baseline"))	//	Initial
							ret_str = "";
						//System.out.println(tag + " "+ ret_str);
					}
				}
			}
			catch(Exception e) {
				//System.err.println(e);
			}
		}
		return ret_str;
	}
	//===============================================================
	//===============================================================
	public static String array2string(Vector v)
	{
		String[]	s = new String[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			s[i] = (String)v.get(i);
		return array2string(s);
	}
	//===============================================================
	//===============================================================
	public static String array2string(String str[])
	{
		StringBuffer	sb = new StringBuffer();
		for (String s : str)
			sb.append(s).append('\n');
		return sb.toString();
	}
	//===============================================================
	//===============================================================
	public static String[] string2array(String str)
	{
		return string2array(str, null);
	}
	//===============================================================
	//===============================================================
	public static String[] string2array(String str, String separ)
	{
		return string2array(str, separ, false);
	}
	//===============================================================
	//===============================================================
	public static String[] string2array(String str, String separ, boolean keep_empty)
	{
		Vector	v = new Vector();
		if (!keep_empty)
		{
			StringTokenizer	stk;
			if (separ==null)
				stk = new StringTokenizer(str);
			else
				stk = new StringTokenizer(str, separ);
			//	Check if really empty or not.
			while (stk.hasMoreTokens())
			{
				String	s = stk.nextToken();
				if (s.trim().length()>0)
					v.add(s);
			}
		}
		else
		{
			//	Slower but keep empty lines.
			int	start = 0;
			int	end;
			while ((end=str.indexOf('\n', start))>0)
			{
				v.add(str.substring(start, end));
				start = end+1;
			}
			if (str.substring(start).length()>0)
				v.add(str.substring(start));
		}
		String []	array = new String[v.size()];
		for (int i=0 ; i<v.size() ; i++)
			array[i] = (String)v.get(i);
		return array;
	}
	//===============================================================
	//===============================================================
	public static  String strReplace(String code, String old_str, String new_str)
	{
		int	pos;
		while ((pos=code.indexOf(old_str))>=0)
			code = code.substring(0, pos) + new_str +
					code.substring(pos+old_str.length());
		return code;
	}
   //===============================================================
   //===============================================================
	public static String indentWithSpaceChar(String str)
   {
		String[]	lines = string2array(str, "\n", true);
		String[]	lines_out = new String[lines.length];
		int	idx = 0;
		for (String line : lines)
		{
			String	code = line.trim();
			if (code.length()>0)
			{
				String	indent = line.substring(0, line.indexOf(code));
				indent = strReplace(indent, "\t", "    ");
				lines_out[idx++] = indent + code;
			}
			else
				lines_out[idx++] = line;
		}

		str = array2string(lines_out);

		return str;
   }
   //===============================================================
    //===============================================================
	public Vector sort(Vector v)
	{
        MyCompare	compare = new MyCompare();
        Collections.sort(v, compare);
        return v;
 	}
    //===============================================================
    //===============================================================



    //===============================================================
    //===============================================================
    public static void main(java.lang.String[] args)
    {
		
		try
		{
			//String filename = "/segfs/tango/cppserver/vacuum/gauges/gauges/VacGauge.h";
			//String filename = "/segfs/tango/tmp/pascal/ScanServerV2/src/ScanServer.h";
			//String filename = "/segfs/tango/tmp/pascal/Vrif/Vrif.h";
			//String filename = "/segfs/tango/tools/admin/tinku/Tinku.java";

			String dirname = "/segfs/tango/tmp/class2www/ScanServerV2";
			Vector	filenames = PogoUtil.getInstance().checkForTangoDir(dirname);

			for (Object o : filenames)
			{
				String	filename = (String)o;
				System.out.println(filename);
				/*
				String	s = PogoUtil.getCvsInfo(filename, "author:");
				if (s.length()>0)
				{
					System.out.println(s);
					s = PogoUtil.getCvsInfo(filename, "symbolic names:");
					System.out.println(s);
				}
				else
				{
					s = PogoUtil.getSvnInfo(filename, "Last Changed Author:");
					System.out.println(s);
				}
				*/
			}
			/*

			String	filename = "y:/tango/tools/pogo/test/python/HqpsGlobalState/HqpsGlobalState";
			//String	filename = "y:/tango/tools/pogo/test/python/HqpsGlobalState/Test";
			String	code = PogoUtil.readFile(filename+".py");
			code = PogoUtil.indentWithSpaceChar(code);
			PogoUtil.writeFile(filename+"-2.py", code);
			*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    }

	//===============================================================
	/**
	 *	Check object instance
	 */
	//===============================================================
	public static int instanceOf(Object obj)
	{
		if (obj instanceof ServerDefinitions)
			return CLASS_ROOT;
		else
		if (obj instanceof Property)
			return PROPERTY;
		else
		if (obj instanceof Cmd)
			return COMMANDS;
		else
		if (obj instanceof Attrib)
			return ATTRIBUTES;
		else
		if (obj instanceof DevState)
			return STATES;
		else
		if (obj instanceof String)
			return STRING_NODE;
		else
			return -1;
	}


    //======================================================
    /**
     *	MyCompare class to sort collection
     */
    //======================================================
    class  MyCompare implements Comparator
    {
        public int compare(Object o1, Object o2)
        {
            String	s1 = o1.toString().toLowerCase();
            String	s2 = o2.toString().toLowerCase();
            if (s1==null)
                return 1;
            else
            if (s2==null)
                return -1;
            else
                return s1.compareTo(s2);
        }
    }
}
