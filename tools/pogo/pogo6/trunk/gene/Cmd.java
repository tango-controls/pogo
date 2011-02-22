//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:	java source code to build Command for server code.
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.17  2009/02/18 15:02:15  pascal_verdier
// Tango 7 (IDL 4) compatibility implementation.
//
// Revision 3.16  2008/05/05 14:25:34  pascal_verdier
// Pb on State and Status overriding methods fixed.
//
// Revision 3.14  2008/03/14 15:21:20  pascal_verdier
// Pb between CONST_DEV_STRING and DEV_STRING in command factory fixed.
//
// Revision 3.13  2006/11/24 14:28:18  pascal_verdier
// Implements first Python gurus remarks.
//
// Revision 3.12  2006/11/06 15:40:30  pascal_verdier
// Put property methods in Util class.
//
// Revision 3.11  2006/11/02 11:41:00  pascal_verdier
// Python code generation added.
//
// Revision 3.10  2006/09/14 07:04:14  pascal_verdier
// *** empty log message ***
//
// Revision 3.9  2006/06/26 09:22:47  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.8  2005/11/24 08:29:16  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.7  2005/06/17 08:51:24  pascal_verdier
// Minor changes.
//
// Revision 3.6  2005/01/28 12:43:53  pascal_verdier
// Bug with spaces/tab fixed.
//
// Revision 3.5  2004/11/22 11:07:46  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.4  2004/10/21 06:58:47  pascal_verdier
// Default value management added for properties.
// And minor changes
//
// Revision 3.3  2004/09/07 12:00:51  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.2  2004/08/26 07:13:06  pascal_verdier
// Attributes are now generated as class.
//
// Revision 3.1  2003/09/10 08:11:30  pascal_verdier
// Minor bugs fixed.
// HTML doc generated with more details.
//
// Revision 3.0  2003/04/29 10:39:50  pascal_verdier
// TANGO 3.0 compatibility
// little bugs fixed.
//
// Revision 1.33  2003/01/16 14:32:36  verdier
// Tango classe files detected for open JFileChooser.
//
// Revision 1.32  2002/10/03 13:53:47  verdier
// Pogo has been used without known bug.
// Put class description as class property.
//
// Revision 1.31  2002/04/25 12:05:08  verdier
// IDL 2 implemented for c++ servers
//
// Revision 1.30  2002/02/06 15:20:20  verdier
// Java code generation updated.
//
// Revision 1.26  2001/12/18 10:12:22  verdier
// Attribute user default property code added.
//
// Revision 1.25  2001/11/09 09:46:13  verdier
// Many bugs fixed.
//
// Revision 1.24  2001/04/04 12:21:27  verdier
// Property management added for cpp.
//
// Revision 1.23  2000/10/24 06:20:13  verdier
// The compatibility with TANGO2 has been tested on DatabaseDs.
//
// Revision 1.22  2000/10/02 05:52:20  verdier
// Attribute code generated is now compatible with Tango 2.
//
// Revision 1.21  2000/09/22 08:54:31  verdier
// DevState & DevStatus are virtual.
// First tests with Tango2
// Taco import utility added.
//
// Revision 1.20  2000/07/07 13:29:17  verdier
// Utilities added after first users.
//
// Revision 1.18  2000/06/20 07:01:38  verdier
// Right button double click management added for :
// editing src code, creating item, editing class....
// Little bugs fixed on generation/re-read src code.
//
// Revision 1.17  2000/05/12 07:35:41  verdier
// Attributes management added for java generation.
//
// Revision 1.16  2000/04/26 06:06:52  verdier
// The save/restore file (.pogo) does not exist anymore.
// DevStates and DevStates allowed management is now available for java.
//
// Revision 1.15  2000/04/18 08:13:48  verdier
// Management of DevStates to allow command added.
//
// Revision 1.14  2000/04/12 09:24:10  verdier
// Methods to manage attributes are now generated
// Only if at leat one attribute exists.
//
// Revision 1.13  2000/04/11 09:34:13  verdier
// Attributes Management Added.
//
// Revision 1.12  2000/03/29 13:14:00  verdier
// Doc generation added.
//
// Revision 1.11  2000/03/21 12:52:37  verdier
// Command and class description from cpp source file.
// States (name and description) from cpp source file.
//
// Revision 1.10  2000/03/03 09:45:56  verdier
// States Management has been added (for .pogo files).
//
// Revision 1.8  2000/01/12  10:23:28  verdier
// Set as description the methods where the arguments have been modified.
//
// Revision 1.7  1999/12/29 10:30:35  verdier
// The data members are not owerwritten during re-generation.
//
// Revision 1.6  1999/12/28  13:30:10  verdier
// After Regeneration of DataBase device server OK.
//
// Revision 1.5  1999/12/22  13:30:21  verdier
// C++ file first generation compiled
//
// Revision 1.4  1999/12/20  13:00:05  verdier
// Argin and Argout's description added for java.
//
// Revision 1.3  1999/12/09  15:30:59  verdier
// Java code generation for first tango version.
//
// Revision 1.1  1999/12/06  08:40:46  verdier
// Initial revision
//
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;


import fr.esrf.Tango.DispLevel;
import fr.esrf.TangoDs.TangoConst;

import java.util.StringTokenizer;
import java.util.Vector;

//-======================================================================
/**
 * This class defines a command for server code.
 * This class describe the command sent by a client to be executed by the server.
 * These <b>Cmd</b> class are located in a <b>java.util.Vector</b>
 * known as <b>CmdTable</b> class.
 *
 * @author	$Author$
 * @version	$Revision$
 */
//-======================================================================

public class Cmd implements TangoConst, PogoDefs
{
	/**
	 *	The command's name itself
	 */ 
	public	String	name;
	/**
	 *	The command's description
	 */ 
	public	String	description;
	/**
	 *	The method's name where the command is realy executed.
	 */ 
	public	String	exec_method;
	/**
	 *	The command's class name
	 */ 
	public	String	cmd_class;
	/**
	 *	The command's argument in (type, description....)
	 */ 
	public	TangoTypes	argin;
	/**
	 *	The command's argument out (type, description....)
	 */ 
	public	TangoTypes	argout;
	/**
	 *	Display level (OPERATOR or EXPERT)
	 */
	public DispLevel	level = DispLevel.OPERATOR;
	/**
	 *	</i>DevState </i> list which for the command is NOT allowed.
	 */
	public DevStateTable	notAllowedFor;
	/**
	 *	use a virtual command's method or not.
	 */
	public boolean	virtual_method;
	/**
	 *	 Virtual method must be overrided or not.
	 */
	public int	override_method;
	/**
	 *	polled period (not polled if 0)
	 */
	public int	polled_period;
	/**
	 *	polling command template
	 */
	private String[]	poll_template = {
			//	Java
		"			if (cmd.get_name().equals(\"CMD_NAME\"))\n" +
		"				cmd.set_polling_period(",
			//	C++
		"		if (command_list[i]->get_name()==\"CMD_NAME\")\n" +
		"			command_list[i]->set_polling_period("

		};

//============================================================================
/**
 *	Initialize object. Called from constructors
 */
//============================================================================
	private void cmdFactory(String name, String cc, String in_type, String out_type,
							String in_desc, String out_desc,
							String desc)
	{
		this.name   = name;
		cmd_class   = cc;
		exec_method = buildExecCmdMethodName();
		argin       = new TangoTypes(in_type,  in_desc);
 		argout      = new TangoTypes(out_type, out_desc);
		notAllowedFor = new DevStateTable();
		if (desc!=null)
			description = desc;
		virtual_method = false;
		override_method = NOT_OVERRIDE;
	}
//============================================================================
//============================================================================
    public Cmd(Cmd cmd)
	{
		cmdFactory(cmd.name, cmd.cmd_class,
					cmd.argin.cpp_code_str, cmd.argin.cpp_code_str, 
					cmd.argout.description, cmd.argout.description,
					cmd.description);
		this.polled_period = cmd.polled_period;
		this.level = cmd.level;
	}
//============================================================================
/**
 * Constructs a newly allocated Cmd object from all its creation parameters.
 *
 * @param 	name		The command's name.
 * @param	cc			The command's class name
 * @param	in_type 	The command's tango argument in.
 * @param	out_type 	The command's tango argument out.
 * @param	in_desc 	The command's argument in description.
 * @param	out_desc 	The command's argument out description.
 * @param 	desc		The command's description.
 *
 */
//============================================================================
    public Cmd(String name, String cc, String in_type, String out_type,
							String in_desc, String out_desc,
							String desc)
	{
		cmdFactory( name, cc, in_type, out_type, in_desc, out_desc, desc);
	}
//============================================================================
/**
 * Constructs a newly allocated Cmd object from all its creation parameters.
 *
 * @param 	name		The command's name.
 * @param	cc			The command's class name
 * @param	in_type 	The command's tango argument in.
 * @param	out_type 	The command's tango argument out.
 * @param	in_desc 	The command's argument in description.
 * @param	out_desc 	The command's argument out description.
 * @param 	desc		The command's description.
 * @param 	level		The command's display level
 *
 */
//============================================================================
    public Cmd(String name, String cc, String in_type, String out_type,
							String in_desc, String out_desc,
							String desc, DispLevel level)
	{
		cmdFactory( name, cc, in_type, out_type, in_desc, out_desc, desc)		;
		this.level = level;
	}
	
//============================================================================
/**
 *	Constructs a newly allocated Cmd object from all its creation parameters.
 *
 *	@param 	cmdLine			Command line from source file.
 */
//============================================================================
	public Cmd(String cmdLine)
	{
		String[]	fields = new PogoString(cmdLine).getFields();
		
		//System.out.println("\n" + cmdLine);
		//for (int i=0 ; i<fields.length ; i++)
		//    System.out.println(i + " : " + fields[i]);

        //  A special case for CONST_DEV_STRING
        String  s = "Tango::CONST_DEV_STRING";
        int idx = fields[4].indexOf(s);
        if (idx>0)
        {
            fields[3] = s;
            int start = fields[4].indexOf('\"', idx);
            if (start<0)
                start = idx + s.length();
            fields[4] = fields[4].substring(start+1).trim();
        }

        cmdFactory(fields[1], fields[0], fields[2],
					fields[3], fields[4], fields[5], "");

		if (fields.length>=7)
		{
			if (fields[6].indexOf("EXPERT")>0)
				level = DispLevel.EXPERT;
		}
	}
//============================================================================
/**
 *	Set the Description field.
 *
 * @param	str		New description text.
 */
//============================================================================
	public void setDescription(String str)
	{
		description = str;
	}
//============================================================================
/**
 * Build the execute method's name from command's name
 *
 * @return The method's name built.
 */
//============================================================================
	private String buildExecCmdMethodName()
	{
		//	Special case for State and Status cmd
		if (name.equals("State"))
			return "dev_state";
		if (name.equals("Status"))
			return "dev_status";

		//	Else replace upper case by '_' char and lowcase
		//---------------------------------------------------
		String  str = "";
		for (int i=0 ; i<name.length() ; i++)
		{
			if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')//	if upperr case
			{
				if (i>0)
					//	Check if previous char is not a n upper case too
					if (name.charAt(i-1)<'A' || name.charAt(i-1)>'Z')
						str += '_';

				//	Set it to lower case
				//---------------------------
				str += (char)(name.charAt(i) + ('a'-'A'));
			}
			else
				str += name.charAt(i);
		}
		return str;
	}
//============================================================================
/**
 * Get the pooled_period value in source code if exists
 *
 * @param cmd_factory source code of command factory
 */
//============================================================================
	public void setPolledPerriod(String cmd_factory, int lang)
	{
		PogoString	pgs = new PogoString(poll_template[lang]);
		pgs.replace("CMD_NAME", name);
		//	Search if command is polled
		int	start;
		if ((start=cmd_factory.indexOf(pgs.str))>0)
		{
			// extract value part and parse int
			start += pgs.str.length();
			int end = cmd_factory.indexOf(")", start);
			try {
				polled_period = Integer.parseInt(cmd_factory.substring(start, end));
		} catch(NumberFormatException e) {
				polled_period = 0;
			}
		}
		// System.out.println(command + "  -  " + polled_period + " ms");
	}
//============================================================================
/**
 * Check if in line the exec method is exactly the ecec method's name.
 *
 * @param line	program line to be analysed.
 * @return true if the exec method is in line.
 */
//============================================================================
	public boolean isExecMethod(String line)
	{
		//	if ';' char not a signature !
		if (line.indexOf(';')>=0)
			return false;

		StringTokenizer st = new StringTokenizer(line);
		String			s;
		int	start, end;
		while (st.countTokens()>0)
		{
			s = st.nextToken();
			if ((start=s.indexOf("::"))>0)
				s = s.substring(start+ "::".length());
			if ((end=s.indexOf("("))>0)
				s = s.substring(0, end);
			if (s.equals(exec_method))
				return true;
		}
		return false;
	}

//============================================================================
/**
 * build cmd constructor signature for backward comaptibility 
 *	(if number of params has been modified)
 *
 * @param	code		source code to be modified
 * @return	the source code to be inserted .
 */
//============================================================================
	public String constructorSignature(String code)
	{
		//	change to command name if template
		PogoString	pgs = new PogoString(code);
		String	defaultname = "DevTemplateCmd::DevTemplateCmd";
		String	name = cmd_class +"::"+ cmd_class;
		while(pgs.str.indexOf(defaultname)>=0)
			pgs.replace(defaultname, name);
		
		int	start, end ;
		//	keep only signature
		start = pgs.str.indexOf(name);		//	first is comment
		start = pgs.str.indexOf(name, start+1);
		end   = pgs.str.indexOf("{", start);
		code  = pgs.str.substring(start, end);

		return code;
	}
//============================================================================
/**
 * Add polling to the command factory.
 *
 * @param	lang		The output language (Cpp or Java).
 * @return	the source code to be inserted to add the command in object list.
 */
//============================================================================
	public String AddCmdPollingLine(int lang)
	{
		PogoString	pgs = new PogoString(poll_template[lang]);
		pgs.replace("CMD_NAME", name);
		if (polled_period>0)
		{
			pgs.str += polled_period + ");\n";
			return pgs.str;
		}
		else
			return "";
	}
//============================================================================
//============================================================================
    private String addPyCmdFactoryLine()
    {
        String  tab = "\t\t";
        String  str = tab + "\'" + name + "\':\n" +
                      tab + "\t[["  + argin.pyType() + ", \"" + argin.description + "\"],\n"+
                      tab + "\t[" + argout.pyType() + ", \"" + argout.description + "\"]";

        if (level==DispLevel.EXPERT || polled_period>0)
        {
            str += ",\n" + tab + "\t{\n";
            if (level==DispLevel.EXPERT)
                str += tab + tab + "\'Display level\':PyTango.DispLevel.EXPERT,\n ";
            if (polled_period>0)
                str += tab + tab + "\'Polling period\':" + polled_period + ",\n ";
            str += tab + "\t} ";
        }
        str += "],\n";

        return str;
    }
//============================================================================
/**
 * Add command constructor to the command factory.
 *
 * @param	lang		The output language (Cpp or Java).
 * @return	the source code to be inserted to add the command in object list.
 */
//============================================================================
	public String AddCmdFactoryLine(int lang)
	{
        if (lang==pyLang)
            return addPyCmdFactoryLine();

        String	add_list_str = (lang==javaLang)? javaAddCommands : cppAddCommands;
        String	tab0 = (lang==javaLang)? "\t\t" : "\t";
        String	tab = (lang==javaLang)? "\t\t\t" : "\t\t";

        String  str = tab0 + add_list_str + "(new " +
                    cmd_class + "(\"" + name + "\",\n" + tab;

        if (lang==javaLang)
            str += argin.java_code_str;
        else
            str += argin.cpp_code_str;

        str += ", ";
        if (lang==javaLang)
            str += argout.java_code_str;
        else
		{
        	//  Const only to compile (corba transfert is string)
        	if (argout.code==PogoDefs.Tango_CONST_DEV_STRING)
				str += "Tango::DEV_STRING";
			else
	            str += argout.cpp_code_str;
		}
        str += ",";

        //  Add it as comment
        if (argout.code==PogoDefs.Tango_CONST_DEV_STRING)
            str += "    //  Tango::CONST_DEV_STRING";

         str += "\n" + tab;
        if (argin.description==null)
            str += "\"\",\n" + tab;
        else
            str += "\"" + argin.description + "\",\n" + tab;

        if (argout.description==null)
            str += "\"\"));\n";
        else
            str += "\"" + argout.description + "\"";

        //	Add display level
        String	namespace = (lang==javaLang)? "DispLevel.":"Tango::";
        str += ",\n" + tab + namespace;
        if (level==DispLevel.EXPERT)
            str += "EXPERT));\n";
        else
            str += "OPERATOR));\n";
        return str;
	}

//============================================================================
/**
 * Check if the exec command method's arguments have been modified.
 *
 * @param line		Source program line.
 * @param lang		Language to be generated (Cpp or Java)
 * @return true		if the parameters have changed.
 */
//============================================================================
	public boolean execMethodArgsChanged(String line, int lang)
	{
		StringTokenizer st = new StringTokenizer(line);
		String			s  = st.nextToken();
		String			argout;
		String			argin;

		//System.out.println(line);
		if (lang==PogoDefs.javaLang)
		{
			//	if java Get second element (skip public)
			//---------------------------------------------
			argout  = st.nextToken();
		}
		else
			argout = s;

		int	start, end;
		start = line.indexOf("(")+1;
		if ((end=line.indexOf(")"))<0)
			end = line.length();
		String	s1 = line.substring(start, end);
		StringTokenizer st1 = new StringTokenizer(s1);
		if (st1.countTokens()>0)
		{
			argin = st1.nextToken();
			if (argin.equals("const"))
				argin = st1.nextToken();
		}
		else
			argin = "void";

		switch(lang)
		{
		case PogoDefs.javaLang:
            return !this.argin.java.equals(argin) ||
                    !this.argout.java.equals(argout);

		case PogoDefs.cppLang:
            if (!this.argin.cpp.equals(argin))
                System.out.println("ARGIN CHANGED " +argin + " - " + this.argin.cpp);

            if (!this.argout.cpp.equals(argout))
                System.out.println("ARGOUT CHANGED " +argout + " - " + this.argout.cpp);

            return !this.argin.cpp.equals(argin) ||
                    !this.argout.cpp.equals(argout);
		}
		return false;
	}

//============================================================================
/**
 * Build the execute method block in Cmd files.
 * This block is used to call the method where
 * the command is really executed on device.
 *
 * @param class_name	The class'name of object treated.	
 * @return Java source code to be insterted.
 */
//============================================================================
	public String buildJavaExecuteMethodBlock(String class_name)
	{
		String	str = "";
		String	indent = "\t\t";

		//	Argin declaration and initialisation
		//----------------------------------------------
		if (argin.code!=Tango_DEV_VOID)
		{
			str += indent + argin.java+
				" argin = "+argin.javaExtract()+"(in_any);\n";
		}

		//	Calling the method
		//----------------------------------------------
		if (!argout.java.equals("void"))
			str += indent + "return insert(";
		else
			str += indent;

		str += "((" + class_name + ")(device))." + exec_method + "(";

		//	Void argin special case
		//-----------------------------
		if (!argin.java.equals("void"))
			str += "argin";
			
		//	Void argout special case
		//-----------------------------
		if (!argout.java.equals("void"))
			str += "));\n";
		else
			str += ");\n" + indent + "return insert();\n";
			
		str += "	}\n";
		return str;
	}
	
//============================================================================
/**
 * Build the description for method where the command
 * is really executed on the device.
 *
 * @return Java source code to be insterted.
 */
//============================================================================
	public String buildJavaExecCmdMethodComments()
	{	
		String  str = "\n" +
		               commentSeparator +
		               "/**\n" +
		               " *	Execute command \""+ name +"\" on device.\n";
		if (description!=null && description.length()>0)
			str += " *	" + new PogoString(description).setComments()+"\n";
		str += " *\n";
		if (!argin.java.equals("void"))
			str += " * @param	argin	"+ argin.description + "\n";

		if (!argout.java.equals("void"))
			str += " * @return	"+ argout.description + "\n";

        return str + " */\n" + commentSeparator;
	}
//============================================================================
//============================================================================
    public String pyUpdateDescription(String str)
    {
        PogoString  code = new PogoString(str);
        String  target = "Description:";
        int     idx = code.str.indexOf(target) + target.length();

        //  Remove old one if exists
        int end = code.indexOf("#---------------", idx);
        code.str = code.substring(0, idx) + "\n" +
                code.substring(end);

        //  Add new description
        code.insert(idx++, " ");
        StringTokenizer stk = new StringTokenizer(description, "\n");
        while(stk.hasMoreTokens())
        {
            String  line = stk.nextToken() + "\n#                ";
            code.insert(idx, line);
            idx += line.length();
        }

        //  Add argin and argout type and description
        if (argin.code!=Tango_DEV_VOID)
        {
            String  py_argin = argin.pyType().substring(argin.pyType().lastIndexOf(".")+1);
            String  line = "\n#\targin:  " + py_argin + "\t" + argin.description;
            code.insert(idx, line);
            idx += line.length();
        }
        if (argout.code!=Tango_DEV_VOID)
        {
            String  py_argout = argout.pyType().substring(argout.pyType().lastIndexOf(".")+1);
            String  line = "\n#\targout: " + py_argout + "\t" + argout.description;
            code.insert(idx, line);
            idx += line.length();
        }
        return code.str;
    }
//============================================================================
/**
 * Build the  method where the command is really
 * executed on the device.
 *
 * @return python source code to be insterted.
 */
//============================================================================
    public String buildPyExecMethod(String template)
    {
        PogoString  code = new PogoString(template);
        //  Replace cmd template by cmd name
        String  target = "TemplCmd";
        while (code.indexOf(target)>0)
            code.replace(target, name);

        //  Add description
        code.str = pyUpdateDescription(code.str);

        //  Change signature for argin is void
        if (argin.code==Tango_DEV_VOID)
        {
            target = "def " + exec_method + "(self";
            int start = code.indexOf(target);
			if (start<0)
			{
            	target = "def " + name + "(self";
				start = code.indexOf(target);
			}
            int end   = code.indexOf("\n", start);
            if (start>=0 && end>=0)
            {
                code.replace(code.substring(start, end),
                            buildPyExecCmdMethodSignature());
                //  And remove argin trace
                target = "print \"[" + name + "::execute]";
                start = code.indexOf(target);
                if (start>0)
                {
                    start += target.length();
                    end    = code.indexOf("\n", start);
                    code.str = code.str.substring(0, start) + "\"" +
                               code.str.substring(end);
                }
            }
        }
        //  Remove return val if void
        if (argout.code==Tango_DEV_VOID)
        {
            int start = code.indexOf("return argout");
            start = code.lastIndexOf("\n", start)+1;
            int end   = code.indexOf("\n", start);
            code.remove(code.substring(start, end));
            if (start>=0 && end>=0)
            {
                //  And remove argout trace
                target = "print \"[" + name + "::execute]";
                start = code.indexOf(target);
                start = code.indexOf(target, start+1);
                if (start>0)
                {
                    start += target.length();
                    end    = code.indexOf("\n", start);
                    code.str = code.str.substring(0, start) + "\"" +
                               code.str.substring(end);
                }
            }
        }
        //  Manage a special case for State and Status
        if (name.equals("State"))
        {
            code.replace("::State", "::dev_state");
            int idx = code.indexOf("Add your own code here");
            idx = code.str.lastIndexOf("\n", idx)+1;
            code.insert(idx, "\t\targout = self.get_state()\n");
			idx =  code.indexOf("return argout");
 			idx = code.str.lastIndexOf("\n", idx)+1;
            code.insert(idx, "\t\tself.set_state(argout)\n");
        }
        else
        if (name.equals("Status"))
        {
            code.replace("::Status", "::dev_status");
            int idx = code.indexOf("Add your own code here");
            idx = code.str.lastIndexOf("\n", idx)+1;
            code.insert(idx, "\t\tself.the_status = self.get_status()\n");
			idx =  code.indexOf("return argout");
 			idx = code.str.lastIndexOf("\n", idx)+1;
            code.insert(idx, "\t\tself.set_status(self.the_status)\n");
			idx =  code.indexOf("return argout");
			idx =  code.indexOf("argout", idx);
			code.str = code.substring(0, idx) + "self.the_status" +
					code.substring(idx+"argout".length());
       }

        code.str += "\n\n";
        return code.str;
    }
//============================================================================
/**
 * Build the signature for method where the command is really
 * executed on the device.
 *
 * @return python source signature.
 */
//============================================================================
	public String buildPyExecCmdMethodSignature()
	{
        String  str =  "def " + exec_method + "(self";
        if (argin.code!=Tango_DEV_VOID)
            str += ", argin";
        str += "):";
        return str;
    }
//============================================================================
/**
 * Build the  method where the command is really
 * executed on the device.
 *
 * @return Java source code to be insterted.
 */
//============================================================================
	public String buildJavaExecCmdMethodSignature(int out)
	{
		String  str = "public " + argout.java + " ";
		if (out==SERVER)
			str += exec_method;
		else
		{
			//	For client proxy (The command itself)
			str += name;
		}
		str +=  "(";

		//	Add Argin only if not void
		//----------------------------------------------
		if (argin.code!=Tango_DEV_VOID)
			str += argin.java + " argin";

		//	End of line
		//----------------------------------------------
		str += ") throws DevFailed";

		return str;
	}
//============================================================================
/**
 * Build the  method where the command is really
 * executed on the device.
 *
 * @return Java source code to be insterted.
 */
//============================================================================
	public String buildJavaExecCmdMethod()
	{
		String  str = buildJavaExecCmdMethodSignature(SERVER)+"\n	{\n";
		
		//	Argout parameter declaration (Construction ?)
		//--------------------------------------------------
		if (argout.code!=Tango_DEV_VOID)
		{
			str += "		" + argout.java + "	argout = ";
			//	2 special cases for State and Status cmd method
			//--------------------------------------------------------
			if (name.equals("State"))
				str += " super.dev_state();\n\n";
			else
			if (name.equals("Status"))
				str += " super.dev_status();\n\n";
			else
			if (argout.is_array && !argout.need_2constr)
			{
				str += "new " + argout.java;
                int pos = str.length()-1;
                str = str.substring(0, pos) + "5" + str.substring(pos);
				str += ";\n\n";
			}
			else
			if (argout.need_constr)
				str += "new " + argout.java + "();\n\n";
			else
				str += " (" + argout.java + ")0;\n\n";
		}
		//	Add Trace
		//-----------------------
		str += "\t\tget_logger().info(\"Entering "+
											exec_method + "()\");\n";
		str += "\n\t\t// ---Add your Own code to control device here ---\n\n";

		str += "\t\tget_logger().info(\"Exiting "+
											exec_method + "()\");\n";

		//	Return argout (?)
		//-----------------------
		if (argout.code!=Tango_DEV_VOID)
			str += "		return argout;\n";
		str += "	}\n";

		return str;
	}
//============================================================================
/**
 * Build the method for client proxy command.
 *
 * @return Java source code to be insterted.
 */
//============================================================================
	public String buildJavaProxyMethod()
	{
		String  str= "";
		
		str += "\n	{\n";
		//	Special case for state and status beacause direct command
		//	(They are not command_inout).
		if (name.equals("State"))
			str += "		return state();\n";
		else
		if (name.equals("Status"))
			str += "		return status();\n";
		else
		{
			//	insert argin in Device Data and send command
			if (argin.code!=Tango_DEV_VOID)
			{
				str += "		data_in.insert(argin);\n";
				str += "		data_out = command_inout(\"" + name + "\", data_in);\n";
			}
			else
				str += "		data_out = command_inout(\"" + name + "\");\n";

			//	Extract argout and return it if exists
			if (argout.code!=Tango_DEV_VOID)
				str += "		return data_out." + argout.extract_method() + "();\n";
		}
		str += "	}\n";
		return str;
	}

	
	//========================================================================
	//
	//				C++ Generation Methods
	//
	//========================================================================
	
//============================================================================
/**
 * Build the C++ prototye for method where the command
 * is really executed on the device without comments (without tab char).
 *
 * @return C++ source code to be insterted.
 */
//============================================================================
	public String buildCppCmdProtypesLineNoTab()
	{
		PogoString	pgs = new PogoString(buildCppCmdProtypesLine());
		while (pgs.str.indexOf('\t')>=0)
			pgs.replace("\t", " ");
		return pgs.str;
	}
//============================================================================
/**
 * Build the C++ prototye for method where the command
 * is really executed on the device without comments.
 *
 * @return C++ source code to be insterted.
 */
//============================================================================
	public String buildCppCmdProtypesLine()
	{
		String  str = "";
		if (virtual_method)
            str += "virtual ";
		str += argout.cpp + "	";
		if (argout.code!=Tango_DEV_STRING)
    		if (argout.need_constr ||argout.is_array)
	    		str += "*";	//	Add pointer on method

		str += exec_method + "(" ;
		if (argin.code!=Tango_DEV_VOID)
		{
			if (argin.is_array)
				str += "const ";
			str += argin.cpp;
			if ((argin.need_constr || argin.is_array)
				&& argin.code!=Tango_DEV_STRING)
				str += " *";
		}
		str += ");\n";
		return str;
	}
//============================================================================
/**
 * Build the C++ prototye for method where the command
 * is really executed on the device with associated comments.
 *
 * @return C++ source code to be insterted.
 */
//============================================================================
	public String buildCppCmdProtypes()
	{
		//	Generate the method prototype header comment
		//------------------------------------------------
		String  str = "/**\n * ";
		
		if (description!=null)
			str += new PogoString(description).setComments();
		if (argin.code!=Tango_DEV_VOID)
		{
			str += "\n *	@param	argin	";
			if (argin.description!=null)
				str += new PogoString(argin.description).setComments();
		}
		if (argout.code!=Tango_DEV_VOID)
		{
			str += "\n *	@return	";
			if (argout.description!=null)
				str += new PogoString(argout.description).setComments();
		}
		str +=  "\n *	@exception DevFailed" +
		        "\n */\n";//	End of description

		//	Generate the method prototype
		//------------------------------------
		str += "\t";
		str += buildCppCmdProtypesLine();
		return str;
	}
//============================================================================
/**
 * Build the C++ definition for class where the command
 * is really executed on the device.
 *
 * @param str	The template file read.
 * @param class_name	The class writen name.
 * @return C++ source code to be insterted.
 */
//============================================================================
	public String buildCppClassesDefs(String str, String class_name)
	{
		PogoString pgs = new PogoString(str);
		while (pgs.str.indexOf(templateCmd)>=0)
			pgs.replace(templateCmd, cmd_class);
		while (pgs.str.indexOf("CLASS")>=0)
			pgs.replace("CLASS", class_name);
		while (pgs.str.indexOf("COMMAND")>=0)
			pgs.replace("COMMAND", name);
		pgs.append("\n\n");
		return pgs.str;
	}
//============================================================================
/**
 *	Replace template cmd by the real cmdClass in a template string
 */
//============================================================================
	public String setCmdClass(String str)
	{
		PogoString pgs = new PogoString(str);
		while (pgs.str.indexOf(templateCmd)>=0)
			pgs.replace(templateCmd, cmd_class);
		pgs.append("\n\n");
		return pgs.str;
	}
//============================================================================
/**
 * Build the C++ definition for class where the command
 * is really executed on the device.
 *
 * @param str	The template file read.
 * @param class_name	The class'name of object treated.	
 * @return C++ source code to be insterted.
 * @exception	PogoException Thrown if a synthax error is detected in input file.
 */
//============================================================================
	public String buildCppCmdClassBlock(String str, String class_name) throws PogoException
	{
		int	end;
		
		if ((end=str.indexOf("extract"))<0)
			throw new PogoException("Input File Syntax error 1!");

		//	Replace class name in trace
		PogoString	pgs = new PogoString(str);
		while (pgs.str.indexOf(templateCmd)>=0)
			pgs.replace(templateCmd, cmd_class);

		while (str.charAt(end)!='\n')
			end--;
		end++;

		//	Extract argin from corba only if NOT void
        str = str.substring(0, end);
        if (argin.code!=Tango_DEV_VOID)
		{
			str += "\t";
			if (argin.is_array)
				str += "const ";
			str += argin.cpp + "\t";
			if ((argin.need_constr || argin.is_array)
				&& argin.code!=Tango_DEV_STRING)
				str += "*";
			str += "argin;\n";
			str += "\textract(in_any, argin);\n\n";
		}
		str += "\t";

		//	Return insert result to corba only if NOT void
		//-------------------------------------------------
		if (argout.code!=Tango_DEV_VOID)
			str += "return insert";
		str += "((static_cast<" + class_name + " *>(device))->" +
					exec_method + "(";
		if (argin.code!=Tango_DEV_VOID)
			str += "argin";
		str += "));\n";

		//	If void -> return dummy corba data
		//----------------------------------------
		if (argout.code==Tango_DEV_VOID)
			str += "\treturn new CORBA::Any();\n";

		str += "}\n";

		return str;
	}
//============================================================================
/**
 * Build the  method where the command is really executed on the device.
 *
 * @param class_name	The class'name of object treated.	
 * @return C++ source code to be insterted.
 */
//============================================================================
	public String buildCppExecCmdMethodComments(String class_name)
	{
		String	str =
		    "//+------------------------------------------------------------------\n" +
		    "/**\n" +
		    " *	method:	" + class_name + "::" + exec_method + "\n" +
		    " *\n" +
		    " *\tdescription:	method to execute \"" + name + "\"\n";
		if (description!=null && description.length()>0)
			str += " *\t" + new PogoString(description).setComments()+"\n";
		str += " *\n";
		if (argin.code!=Tango_DEV_VOID)
			str += " * @param	argin	"+ argin.description + "\n";

		if (argout.code!=Tango_DEV_VOID)
			str += " * @return	"+ argout.description + "\n";
		
		str +=  " *\n" +
                " */\n"+
		        "//+------------------------------------------------------------------\n";

		return str;
	}
//============================================================================
/**
 * Update the  method where the command is really executed on the device,
 * because they could have been changed.
 *
 * @param codeStr		The source code where the header must be replaced.
 * @param class_name	The class'name of object treated.	
 */
//============================================================================
	public void updateCppExecCmdMethodComments(PogoString codeStr, String class_name)
												throws PogoException
	{
		boolean	methodExists = false;

		//	Search the starting method
		//-------------------------------
		int startMethod;
		int endLine=0;
		String	line = buildCppExecCmdMethodSignature(class_name);
		//	Take Of "argin" could have change it's name.
		System.out.println(line);
		int	sl = line.indexOf("(");
		int	el = line.indexOf(" ", sl);
		if (el<0)	el = sl+1 ;
		line = line.substring(0, el);
		while ((startMethod=codeStr.str.indexOf(line, endLine))>=0)
		{
			startMethod = codeStr.previousCr(startMethod);
			endLine     = codeStr.nextCr(startMethod);
			if (startMethod> endLine)
			{
				System.out.println("\n1:\n" + startMethod + " - " +endLine);
				System.out.println(line+ "\n\n" );
			}
			
			String s = codeStr.str.substring(startMethod, endLine);
			if (s.indexOf("//")<0 &&		//	Not a comment
				s.indexOf("\"")<0 &&		//	not a trace
				s.indexOf("<<")<0 )		//	not a C++ trace
			{
				methodExists = true;
				break;
			}
		}

		String newHeader = buildCppExecCmdMethodComments(class_name);
		if (methodExists)
		{
			//	Then, search previous end of method to replace/add header
			//-------------------------------------------------------------
			int	startHeader = startMethod;
			while (startHeader>0 && codeStr.str.charAt(startHeader)!='}')
				startHeader--;
			if ((startHeader=codeStr.str.indexOf("//", startHeader))<0)
				startHeader = startMethod;

			String oldHeader = codeStr.str.substring(startHeader, startMethod);
			codeStr.replace(startHeader, oldHeader, newHeader);
		}
		else
			codeStr.append(newHeader);
	}
//============================================================================
/**
 * Build the declaration line for the method where the command
 *	is really executed on the device.
 *
 * @param class_name	The class'name of object treated.	
 * @return C++ source code line to be insterted.
 */
//============================================================================
	public String buildCppExecCmdMethodSignature(String class_name)
	{
		String  str = argout.cpp + " ";

		if (argout.code!=Tango_DEV_STRING)
    		if (argout.is_array)
    			str += "*";	//	Add Pointer on method
		str += class_name+ "::" + exec_method + "(";

		if (argin.code!=Tango_DEV_VOID)
		{
			if (argin.is_array)
				str += "const ";
			str += argin.cpp + " ";
			if ((argin.need_constr || argin.is_array)
					&& argin.code != Tango_DEV_STRING)
				str += "*";
			str += "argin";
		}
		str += ")";
		return str;
	}

//============================================================================
/**
 * Build the  method where the command is really executed on the device.
 *
 * @param class_name	The class'name of object treated.	
 * @return C++ source code to be insterted.
 */
//============================================================================
	public String buildCppExecCmdMethod(String class_name)
	{
		String  str = buildCppExecCmdMethodSignature(class_name)+"\n{\n";

		//	Define the argout
		//------------------------------
		if (argout.code!=Tango_DEV_VOID)
		{
			//	If argout needs constructor,
			//	add a comment about static argout usage
			if (argout.need_constr || argout.is_array)
			{
				str +=
                    "\t//	POGO has generated a method core with argout allocation.\n" +
				    "\t//	If you would like to use a static reference without copying,\n" +
				    "\t//	See \"TANGO Device Server Programmer's Manual\"\n" +
				    "\t//		(chapter : Writing a TANGO DS / Exchanging data)\n" +
				    "\t//------------------------------------------------------------\n";
			}
			str += "\t" + argout.cpp + "\t";
			if (argout.code!=Tango_DEV_STRING &&
				argout.need_constr || argout.is_array)
				str += "*";
			str += "argout ";

			//	Special cases for State, Status cmd DevString
			//--------------------------------------------------------
			if (name.equals("State"))
				str += "= DeviceImpl::dev_state()";
			else
			if (name.equals("Status"))
				str += "= DeviceImpl::dev_status()";
			else
			if (argout.need_constr)
			{
				str += " = new ";
				if (argout.code == Tango_DEV_STRING)
					str += "char[6];\n\tstrcpy(argout, \"dummy\")";
				else
					str +=  argout.cpp + "()";
			}
			str += ";\n";
			if (argout.code == PogoDefs.Tango_CONST_DEV_STRING && 
				!name.equals("Status"))
				str += "\targout = \"Hello World\";\n";

			//	Allocate sequence.
			//----------------------------
			if (!argout.need_2constr)
			{
				//	Generate argout constructor
				if (argout.is_array)
				{
					if (argout.code==Tango_DEVVAR_STRINGARRAY)
					{
						str +=  "\targout->length(1);\n" +
						        "\t(*argout)[0] = " +
						        "CORBA::string_dup(\"dummy\");\n";
					}
					else
					{	//	Float and Double array
						str += "\targout->length(1);\n";
						str += "\t(*argout)[0] = 0";
						if (argout.code==Tango_DEVVAR_FLOATARRAY || 
							argout.code==Tango_DEVVAR_DOUBLEARRAY)
							str += ".0";
						str += ";\n";
					}
				}
			}
			else
			{
				//	Alloaction depends on arout type
				//----------------------------------------------
				if (argout.code==Tango_DEVVAR_DOUBLESTRINGARRAY)
				{
					str +=  "\targout->dvalue.length(1);\n" +
					        "\targout->dvalue[0] = 0.0;\n";
				}
				else
				{
					str +=  "\targout->lvalue.length(1);\n"+
					        "\targout->lvalue[0] = 0;\n";
				}
				str +=  "\targout->svalue.length(1);\n" +
                        "\targout->svalue[0] = CORBA::string_dup(\"dummy\");\n";
			}
			
		}
		
		//	Add Trace
		//-----------------------------------
		str +=  "	DEBUG_STREAM << \"" + class_name +
				"::" + exec_method + "(): entering... !\" << endl;\n"+
                "\n	//	Add your own code to control device here\n\n";
		//	Return agout if exists
		//-----------------------------------
		if (argout.code!=Tango_DEV_VOID)
		{
			//	Special case for overriden methods
			if (name.equals("State"))
				str += "	set_state(argout);\n";
			else
			if (name.equals("Status"))
				str += "	set_status(argout);\n";

			str += "	return argout;\n";
		}
		str += "}\n";

		return str;
	}
//============================================================================
/**
 * Get the execute method description from String
 *
 * @param str	Source code read where the description will be find.
 */
//============================================================================
	public void getExecMethodDescription(String str, int lang)
	{
        //  If Python, do it else where
        if (lang==pyLang)
            return;

        int start, end;
		boolean		isComments = true;
		PogoString	pgs = new PogoString(str);
        //	Search Execute method
		//----------------------------------------------
		for (end=0 ; end>=0 && isComments ; end++)
		{
			String	target;
			if (lang==javaLang)
				target = buildJavaExecCmdMethodSignature(SERVER);
			else
                // lang==cppLang
				target = buildCppCmdProtypesLine();

            //	remove ';' for virtual methods
			int	idx = target.indexOf(';');
			if (idx>0)
				target = target.substring(0, idx);
			//System.out.println("Prototye -->  "+target);
			if ((end=pgs.str.indexOf(target, end))<0)
			{
				//	Try with a '\t' separator
				target = argout.cpp + "\t" + exec_method + "(";
				if ((end=pgs.str.indexOf(target, end))<0)
				{
					System.out.println(exec_method + " method Not found !");
					return;
				}
			}
			start = pgs.previousCr(end);
			if (pgs.str.substring(start, end).indexOf("//")<0)
				isComments = false;
		}
		if (end<0)
		{
			System.out.println(exec_method + " Not found !");
			return;
		}
		start = end = pgs.previousCr(end);

		//	Get the comments part only
		//--------------------------------------------
		switch(lang)
		{
		case cppLang:
			while (start>0 && pgs.str.charAt(start)!=';' && pgs.str.charAt(start)!='{')
				start--;
			start++;
			break;
		case javaLang:
			while (start>0 && pgs.str.charAt(start)!='}')
				start--;
			start++;
			//	Take Off additionnal comments
			//----------------------------------------
			int	start1;
			if ((start1=pgs.str.indexOf("Execute command", start))>=0)
				start = pgs.nextCr(start1);
			end = pgs.str.indexOf("*/", start);
			break;
		}
		//	Extract comments tags
		//--------------------------------
		PogoString	comments = new PogoString(pgs.str.substring(start, end));
		description = comments.getDescription().trim();
	}
//===============================================================
//===============================================================
    String pyUpdateAllowedStates(String method, String signature)
    {
        return this.notAllowedFor.pyUpdateAllowedStateMethod(method, signature);
    }

//============================================================================
/**
 *	Set DevStateTable list for the Not Allowed states list .
 *
 *	@param	str	The DevStateTable will be taken from this source code String.
 */
//============================================================================
	public void setNotAllowedFor(String str, int lang)
	{
		if (notAllowedFor==null)
			notAllowedFor = new DevStateTable();
		else
			notAllowedFor.clear();

		PogoString	pgs = new PogoString(str);
		String		pattern;

		if (lang==javaLang)
			pattern = "public boolean is_allowed(DeviceImpl device, Any data_in)";
		else
        if (lang==cppLang)
            pattern = cmd_class + "::is_allowed";
        else
        {
            this.notAllowedFor.setPyNotAllowedFor(str, name);
            return;
        }
        //	Get Method Block
		//--------------------------------
		int	start, end;
		if ((start=pgs.str.indexOf(pattern))<0)
		{
			System.out.println("WARNING: " + pattern + " Not Found !" + 
				"\nLang = " + lang);
			return;
		}
		start = pgs.inMethod(start);
		end   = pgs.outMethod(start+1);
		
		//	Get Test Block
		//--------------------------------
		PogoString	method = new PogoString(pgs.str.substring(start, end));
		if ((start=method.inTest(0))<0)
			return ;
		if ((end=method.outTest(start))<0)
			return ;

		//	Get DevState block
		//--------------------------------
		StringTokenizer stk = new StringTokenizer(method.str.substring(start+1, end-1));
		while(stk.hasMoreTokens())
		{
			String s = stk.nextToken();
			//	Analize token to find states name
			//----------------------------------------
			switch(lang)
			{
			case cppLang:
				if (s.indexOf("Tango::")==0)
					notAllowedFor.addElement(new DevState(s, ""));
				break;
			case javaLang:
				if (s.indexOf("DevState.")==0)
					notAllowedFor.addElement(new DevState(s, ""));
				break;
			}
		}
	}
//============================================================================
/**
 *	Set DevStateTable list for the Not Allowed states list .
 *
 *	@param	stTable	List to replace the existance one.
 */
//============================================================================
	public void setNotAllowedFor(DevStateTable stTable)
	{
		if (notAllowedFor==null)
			notAllowedFor = new DevStateTable();
		else
			notAllowedFor.clear();
		for (int i=0 ; i<stTable.size() ; i++)
			notAllowedFor.addElement(stTable.elementAt(i));
	}
//============================================================================
/**
 *	Add a new DevState to the Not Allowed states list.
 *
 *	@param	state Object to be aded in the list.
 */
//============================================================================
	public void addNotAllowedFor(DevState state)
	{
		notAllowedFor.addElement(state);
	}
//============================================================================
/**
 *	Remove a DevState in the Not Allowed states list.
 *
 *	@param	state Object to be removed in the list.
 */
//============================================================================
	public void removeNotAllowedFor(DevState state)
	{
		notAllowedFor.remove(state);
	}
//============================================================================
/**
 *	Build or modify the class_name::is_allowed() method using
 *	<i>notAllowedFor </i> DevStateTable.
 *
 *	@param	method	Existing method from template or source file.
 *	@return	the new method generated.
 *	@throws	PogoException	If a synthax error occured.
 */
//============================================================================
	public String buildIsAllowedMethod(PogoString method, int lang) throws PogoException
	{
		int	start, end ;

		//	Get The non automatic code.
		//------------------------------------------
		if ((start=method.str.indexOf(endGeneTag))<0)
			throw new PogoException("\"" + endGeneTag + "\" Not Found !");
		if ((end=method.str.indexOf(startGeneTag))<0)
			throw new PogoException("\"" + startGeneTag + "\" Not Found !");
		start = method.previousCr(start);
		end   = method.nextCr(end)+1;

		String nonAuto = method.str.substring(start, end);

		if (notAllowedFor==null || notAllowedFor.size()==0)
		{
			//	First case: the command is always allowed
			//------------------------------------------------
			String  str = "{\n"+ nonAuto + "\t\treturn true;\n";
			if (lang==javaLang)
				str += "\t";
			str += "}\n";
			return str;
		}
		else
		{
			//	generate the test on device state
			//------------------------------------------------
			String head = "{\n\t";
			if (lang==javaLang)
				head += "\t";
			head += "if (";
		
			for (int i=0 ; i<notAllowedFor.size() ; i++)
			{
				DevState	state = (DevState) notAllowedFor.elementAt(i);
				if (lang==javaLang)
					head += "device.get_state() == " + state.javaName();
				else
					head += "device->get_state() == " + state.name;

				//	Check if it is the last one
				//--------------------------------------
				if (i < (notAllowedFor.size()-1))
				{
					head += "  ||\n\t\t";
					if (lang==javaLang)
						head += "\t";
				}
			}
			if (lang==javaLang)
				head += ")\n\t\t{\n";
			else
				head += ")\n\t{\n";

			StringBuffer foot = new StringBuffer("");
			if (lang==javaLang)
				foot.append("\t");
			foot.append("		return false;\n");
			if (lang==javaLang)
				foot.append("\t");
			foot.append("	}\n");
			if (lang==javaLang)
				foot.append("\t");
			foot.append("	return true;\n");
			if (lang==javaLang)
				foot.append("\t");
			foot.append("}\n");

			return head + nonAuto + foot.toString();
		}
	}

//======================================================================
/**
 *	is_allowed method for command (Device_3impl and above).
 */
//======================================================================
	String allowedSignatureMethod(String class_name)
	{
		return signature(allowedCmdSigTemplate,
						class_name, "is_" + name + "_allowed", false);
	}
//======================================================================
/**
 *	is_allowed method for command (Device_3impl and above).
 */
//======================================================================
	String allowedFullSignatureMethod(String class_name)
	{
		return signature(allowedCmdSigTemplate,
						class_name, "is_" + name + "_allowed", true);
	}
//======================================================================
//======================================================================
	private String signature(String template, String cl_name, String method, boolean full)
	{
		PogoString	pgs = new PogoString(template);
		pgs.replace("COMMAND", name);
		pgs.replace("METHOD", method);

		if (cl_name==null)
			pgs.replace("CLASS::", "");		//	Prototype in .h
		else
		{
			pgs.replace("CLASS", cl_name);
			if (full)
			{
				//	if full signature -> modify separator and comments
				//	Get description
				String	target = " *\t";
				int	start = pgs.indexOf(target, "/**".length());
				start += target.length();
				int end = pgs.nextCr(start);
				String	desc = pgs.substring(start, end);

				//	build method separator
				PogoString	separator = new PogoString(cppMethodSeparatorTemplate);
				separator.replace("CLASS", cl_name);
				separator.replace("METHOD", method);
				separator.replace("DESCRIPTION", desc);

				//	Replace comments by separator
				target = " */\n\tvirtual ";
				end = pgs.indexOf(target);
				String	comments = pgs.substring(0, end+target.length());
				pgs.replace(comments, separator.str);		
			}
		}
		if (!full)
		{
			//	Take off description comments
			String	target = " */\n\tvirtual ";
			int	start = pgs.indexOf(target);
			start += target.length();
			return pgs.substring(start);
		}
		return pgs.str;
	}
//======================================================================
//======================================================================
	String allowedCore()
	{
		return notAllowedFor.allowedCore();
	}
//============================================================================
//============================================================================
    void parsePyProperties(String code) throws PogoException
    {
        //  Parse for PY special things view as properties !!!!
        String  target = "polling period";
        int idx;
        if ((idx=code.toLowerCase().indexOf(target))>0)
        {
            //  Property found -> parse value
            idx = code.indexOf(":", idx) + 1;
            int end = code.indexOf(",", idx);
            if (end<0)  //  Last one ?
                end = code.indexOf("}", idx);
            if (end<0)
                throw new PogoException("Syntax Error in attr_list (" + target + ")");
            String  strval = code.substring(idx, end).trim();
            try {
                this.polled_period = Integer.parseInt(strval);
            }
            catch (NumberFormatException e){
                throw new PogoException("Syntax Error in attr_list (" + target + " = " + strval + ")");
            }
        }
        target = "display level";
        if ((idx=code.toLowerCase().indexOf(target))>0)
        {
            //  Property found -> parse value
            idx = code.indexOf(":", idx) + 1;
            int end = code.indexOf(",", idx);
            if (end<0)  //  Last one ?
                end = code.indexOf("}", idx);
            if (end<0)
                throw new PogoException("Syntax Error in attr_list (" + target + ")");
            String  strval = code.substring(idx, end).trim();
            if (strval.equals("PyTango.DispLevel.EXPERT"))
                level = DispLevel.EXPERT;
            else
                level = DispLevel.OPERATOR;
        }
    }
//============================================================================
//============================================================================
    void parsePyDescription(String code)
    {
        //  Search description location
        String  target = name + " command:\n";
        int start = code.indexOf(target);
        if (start<0)    return;
        int end = code.indexOf("#------------", start);
        if (end<0)      return;

        target = "Description:";
        start = code.indexOf(target, start);
        if (start<0)    return;
        start += target.length();
        String  s = code.substring(start, end);

        //  Check if argout or argin description exists
        end = -1;
        int idx = s.indexOf("argin:");
        if (idx>0)
            end = s.lastIndexOf("#", idx);
        else
        {
            idx = code.indexOf("argout:");
            if (idx>0)
                end = s.lastIndexOf("#", idx);
        }
        if (end>0)
           s = s.substring(0, end);

        //  Remove '#' chars
        Vector  v = new Vector();
        start = 0;
        while((end=s.indexOf("#", start))>0)
        {
            v.add(s.substring(start, end).trim() + "\n");
            start = end + 1;
        }
        v.add(s.substring(start).trim());
        description = "";
        for (Object obj : v)
            description += obj;
    }
//============================================================================
/**
 * Make command as a String 
 *
 * @return Command's name.
 */
//============================================================================
	public String toString()
	{
		return name;
	}
}
