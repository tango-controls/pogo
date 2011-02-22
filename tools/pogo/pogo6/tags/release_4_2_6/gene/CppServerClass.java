//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:	java source code for the Pogo class definition .
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.16  2005/05/19 13:08:48  pascal_verdier
// Bug in case of not any command defined fixed.
//
// Revision 3.15  2005/03/02 10:27:10  pascal_verdier
// Managing Super Classes and inherited classes.
//
// Revision 3.14  2005/01/17 15:42:22  pascal_verdier
// Bug on double cotes in class description fixed.
//
// Revision 3.13  2004/12/08 10:06:37  pascal_verdier
// Backward compatibility bug fixed.
//
// Revision 3.12  2004/11/30 10:20:37  pascal_verdier
// *** empty log message ***
//
// Revision 3.11  2004/11/30 10:19:17  pascal_verdier
// Bug on CommandeNameCmd::execute trace bug fixed.
//
// Revision 3.10  2004/11/29 09:45:51  pascal_verdier
// Backward compatibility bug fixed.
//
// Revision 3.9  2004/11/23 13:47:10  pascal_verdier
// Class descrition property is now written as string array.
//
// Revision 3.8  2004/11/22 15:29:31  pascal_verdier
// Javadoc tags correction.
//
// Revision 3.7  2004/11/22 11:07:46  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.6  2004/11/08 10:28:27  pascal_verdier
// User can add own code at end of ServerClass.cpp.
//
// Revision 3.5  2004/10/29 14:21:55  pascal_verdier
// if device property not found in database, it takes class property value if exists.
//
// Revision 3.4  2004/10/21 06:58:48  pascal_verdier
// Default value management added for properties.
// And minor changes
//
// Revision 3.3  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.2  2004/09/02 06:41:34  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
//
// Revision 3.1  2004/08/26 07:13:06  pascal_verdier
// Attributes are now generated as class.
//
// Revision 3.0  2003/04/29 10:39:49  pascal_verdier
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
//
// copyleft 1999 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;

import java.io.*;
import java.util.*;
import fr.esrf.Tango.*;
import fr.esrf.TangoDs.*;


/**
 *	This class generates Cpp source file for ServerClass files.
 *
 * @author	$Author$
 * @version	$Revision$
 */
public class CppServerClass extends PogoGene implements PogoDefs, TangoConst
{
	private String			serverclass;
	private	String			classname;
	private PropertyTable	properties;
	private boolean			is_abstractclass;

	//================================================================
	/**
	 *	Constructor
	 */
	//================================================================
	public CppServerClass(PogoClass pogo)
	{
		super(pogo);
		serverclass   =
			new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + "Class.cpp");
		properties = pogo.class_properties;
		this.classname     = pogo.class_name;
		this.is_abstractclass = pogo.is_abstractclass;
	}


//=========================================================================
//	Header file generation
//=========================================================================

	//================================================================
	//================================================================
	
	//================================================================
	/**
	 *	Add to the code, the definition of the class
	 *	where the commands are really executed.
	 *
	 *	@param	code			the code to be modified
	 *	@return the modified code.
	 */
	//================================================================
	protected String addCmdClassDefs(PogoString code) throws PogoException
	{
		int		start, end;
		String	target;
		//	Get Attribute title
		//------------------------------
		target = "Define classes for attributes";
		if ((start=code.str.indexOf(target))<0)
			throw new PogoException("Input File Syntax error !\n\""+
							target + "\" Not Found !");
		end   = code.indexOf("\n", start);
		end   = code.indexOf("\n", end+1);
		start = code.lastIndexOf("\n", start);
		start = code.lastIndexOf("\n", start-1);
		String	attr_title = code.substring(start, end);
		
		//	Search template block for attribute
		//----------------------------------------
		start = end;
		end = code.inMethod(start);
		end = code.outMethod(end);
		String	attr_block = code.substring(start, end);
		code = new PogoString(code.str.substring(end));
		
		//	Get command title
		//------------------------------
		target = "Define classes for commands";
		if ((start=code.str.indexOf(target))<0)
			throw new PogoException("Input File Syntax error !\n\""+
							target + "\" Not Found !");
		end   = code.indexOf("\n", start);
		end   = code.indexOf("\n", end+1);
		start = code.lastIndexOf("\n", start);
		start = code.lastIndexOf("\n", start-1);
		String	cmd_title = code.substring(start, end);
		
		//	Search template block
		//----------------------------------------
		start = end;
		end = code.inMethod(start);
		end = code.outMethod(end);
		String	cmd_block = code.substring(start, end);
		code = new PogoString(code.str.substring(end));

		//	Write Class Definitions for commands
		//	Don't forget to skip virtual status Cmds.
		//--------------------------------------------
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdAt(i);
			if (cmd.virtual_method==false)
				code.insert(0, cmd.buildCppClassesDefs(cmd_block, pogo.class_name));
		}
		code.insert(0,cmd_title);
 
		//	Write Class Definitions for attributes
		//--------------------------------------------
		for (int i=0 ; i<pogo.attributes.size() ; i++)
		{
			Attrib		attr = pogo.attributes.attributeAt(i);
			code.insert(0, attr.buildCppClassesDefs(attr_block, pogo.class_name));
			//code.insert(0, cmd_block);
		}
		code.insert(0,attr_title);

		//	Prototype for attribute_factory if any attributes
		//-----------------------------------------------------------
		if (pogo.attributes.size()>0)
		{
			if (code.str.indexOf("attribute_factory")<0)
			{
				if ((start=code.str.indexOf("command_factory"))>0)
				{
					start = code.nextCr(start) + 1;
					code.insert(start, "\tvoid attribute_factory(vector<Tango::Attr *> &);\n");
				}
			}
		}

		//	Add the property variables declaration if any
		//----------------------------------------------------
		if (properties.size()>0)
		{
			//	Build the string to be inserted for properties declaration
			//-------------------------------------------------------------
			StringBuffer	sb = new StringBuffer("//	properties member data\n");
			for (int i=0 ; i<properties.size() ; i++)
			{
				Property	property = properties.propertyAt(i);
				sb.append(property.buildDefinition(cppLang));
			}

			//	Get the position to insert for properties declaration
			//----------------------------------------------------------
			if ((start=code.str.indexOf(": public Tango::DeviceClass"))<0)
				throw new PogoException("Input File Syntax error !");

			if ((start=code.str.indexOf("public:", start))<0)
				throw new PogoException("Input File Syntax error !");
			start = code.nextCr(start)+1;

			code.insert(start, sb.toString());
			
			//	Get the position to insert for prototype
			//-----------------------------------------------
			if ((start=code.str.indexOf("command_factory", start))<0)
				throw new PogoException("Input File Syntax error !");
			start = code.nextCr(start)+1;
			code.insert(start, "\tvoid get_class_property();\n");
		}
		return code.toString();
	}
	//================================================================
	/**
	 *	Convert the C++ Server.h file, to a AbstractClass.h file
	 */
	//================================================================
	private PogoString toAbstractClassHeader(PogoString code)
	{
		int	start = code.str.indexOf("add your own data members here");
		start = code.str.indexOf("public:\n", start) + "public:\n".length();
		start = code.str.indexOf("\n", start) + 1;
		int	end = code.str.indexOf("protected:", start);
		code.remove(code.str.substring(start, end));

		code.remove("	Tango::DbData	cl_prop;");
		code.remove("	void write_class_property();\n");
		code.remove("	static " + classname + "Class *_instance;\n");
		code.remove("	void device_factory(const Tango::DevVarStringArray *);\n");

		return code;
	}
	
	//================================================================
	/**
	 *	Generate the C++ ServerClass.h file.
	 */
	//================================================================
	public void generateHeader(String serverclass_h)throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		System.out.println("Generating " + serverclass_h + "....");
		String	head_of_file = null;
		String	data_members = "";

		//	Check file if already exist
		//-----------------------------------
		if (already_exists(serverclass_h))
		{
			//	Open and read file
			//----------------------------------------
			PogoString pgs = new PogoString(PogoUtil.readFile(serverclass_h));

			//	Get the head of file 
			//--------------------------
			int	start, end;
			String	namespace = "namespace " + pogo.namespace();
			end = pgs.str.indexOf(namespace);
			if(end<0)
				end = pgs.str.indexOf("namespace " + pogo.class_name);
			if (end<0)
				throw new PogoException("Syntax error in reading "+
					serverclass_h +
					"\n " + namespace + " Not Found !");
			end = pgs.inMethod(end);
			end = pgs.nextCr(end);
			head_of_file = pgs.str.substring(0, end);
			
			//	verify that include server.h exist (does not before impl 3)
			String	include_server_h = "#include <" + pogo.class_name + ".h>";
			if (head_of_file.indexOf(include_server_h)<0)
			{
				start = head_of_file.indexOf("<tango.h>");
				start = head_of_file.indexOf("\n", start) + 1;
				String s1 = head_of_file.substring(0, start);
				String s2 = head_of_file.substring(start);
				head_of_file = s1 + include_server_h + "\n" + s2;
			}

			//	Get the data members part
			//-----------------------------
			if ((start=pgs.str.indexOf("//	add your own data members here"))>0)
			{
				end = pgs.str.indexOf("public:", start);
				data_members = pgs.str.substring(start, end);
			}
		}
		
		//	Read Template file
		//----------------------------
		String templname = new String(pogo.templates_dir + "/cpp/" +
											templateFile + "Class.h");
		PogoString templcode = new PogoString(PogoUtil.readFile(templname));
		templcode = PogoUtil.removeLogMessages(templcode);

		//	Replace template pattern
		//---------------------------------------
		while (templcode.str.indexOf(templateClass.toUpperCase())>=0)
			templcode.replace(templateClass.toUpperCase(), pogo.class_name.toUpperCase());
		//	Replace template pattern
		//---------------------------------------
		while (templcode.str.indexOf(templateClass)>=0)
			templcode.replace(templateClass, pogo.class_name);

		//	if file does not exist get head in the template
		//-----------------------------------------------------------
		int	start;
		if ((start=templcode.str.indexOf("namespace "))<0)
			throw new PogoException("Syntax error in reading "+serverclass_h);
		start = templcode.inMethod(start);
		start = templcode.nextCr(start);

		if (head_of_file==null)
			head_of_file = templcode.str.substring(0, start);
		templcode = new PogoString(templcode.str.substring(start));

		//	Add prototypes
		//---------------------------------------
		PogoString new_code = new PogoString(addCmdClassDefs(templcode));

		//	Replace programmer's data members if exist
		//------------------------------------------------
		if (data_members.length()>0)
		{
			//	Get the data members part
			//-----------------------------
			if ((start=new_code.str.indexOf("//	add your own data members here"))>0)
			{
				int end = new_code.str.indexOf("public:", start);
				String tmp = new_code.str.substring(start, end);
				new_code.replace(tmp, data_members);
			}
		}

		//	Manage if super calass
		if (is_abstractclass)
		{
			new_code = toAbstractClassHeader(new_code);
		}

		//	And write file
		//----------------------------------------
		FileOutputStream	fidout = new FileOutputStream(serverclass_h);
		fidout.write(head_of_file.getBytes());
		fidout.write(new_code.str.getBytes());
		fidout.close();
	}
	






//=========================================================================
/*	Source file generation
//=========================================================================

	//================================================================
	/**
	 *	Generate the C++ ServerClass.cpp file.
	 */
	//================================================================
	public void generateSource(String serverclass) throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		System.out.println("Generating " + serverclass + "....");

		//	Read Template file
		//	and Replace template pattern
		//----------------------------
		String templname = new String(pogo.templates_dir + "/cpp/" +
											templateFile + "Class.cpp");
		PogoString templcode = new PogoString(
				PogoUtil.readFile(templname,templateClass, pogo.class_name));
		templcode = PogoUtil.removeLogMessages(templcode);

		String	classes = "";
		String	factories = "";
		String	get_property;
		String	put_property = "";
		String	class_constructor=null;
		String	user_code = "";
		PogoString	code = null;
		if (already_exists(serverclass))
		{
			//	Read existing file
			//----------------------------
			code = new PogoString(PogoUtil.readFile(serverclass));
			classes = updateCmdClass(code, templcode);
			classes = correctOldTrace(classes);

			//	Get the class constructor and 
			//	the get_property method if exist
			//------------------------------------------
			class_constructor = getClassConstructor(code);
			get_property      = getGetPropertyMethod(code);
			user_code         = getUserCode(code);
		}
		else
		{
			classes = createCmdClass(templcode);
			get_property = getGetPropertyMethod(null);
		}

		//	Update class allowed methods
		//-------------------------------------
		System.out.println("generating for deviceImpl = " + pogo.deviceImpl);
		if (pogo.deviceImpl<3)
			classes = updateIsAllowedMethods(classes);

		//	Build factories
		//-------------------------------------
		factories = buildFactories(templcode, code);
		if (class_constructor!=null)
		{
			//	replace constructor by the saved one.
			PogoString	tmp = new PogoString(factories);
			String	s = getClassConstructor(tmp);
			tmp.replace(s, class_constructor);
			factories = tmp.str;
		}
		//	Add set default property method
		//-----------------------------------------
		//factories = addPutDefaultPropertyCall(factories);
		//	Manage Class property method
		//-------------------------------------
		if (is_abstractclass==false)
		{
			get_property = updatePropertyMethod(get_property);
			if (get_property.length()>0)
			{
				//	if method exists add a call in class constructor
				//-----------------------------------------------------
				factories = addPutGetPropertyCall(factories, "get");
			}

			factories = addPutGetPropertyCall(factories, "write");
			put_property = buildPutPropertyMethod();
		}
		if (is_abstractclass)
			factories = toAbstractClass(factories);

		//	And write file
		//----------------------------------------
		FileOutputStream	fidout = new FileOutputStream(serverclass);
		fidout.write(classes.getBytes());
		fidout.write(factories.getBytes());
		if (is_abstractclass==false)
		{
			fidout.write(get_property.getBytes());
			fidout.write(put_property.getBytes());
		}
		fidout.write(user_code.getBytes());
		fidout.write(new String("\n}	// namespace\n").getBytes());
		fidout.close();
	}
	//================================================================
	/**
	 *	Convert the C++ ServerClas.cpp file, to a AbstractClass.cpp file
	 */
	//================================================================
	private String toAbstractClass(String str) throws PogoException
	{
		PogoString	code = new PogoString(str);
		
		//	Remove instance pointer init
		String	init_ptr = classname + "Class *" + classname + "Class::_instance";

		int	end;
		if ((end=code.str.indexOf(init_ptr))>0)
		{
			end = code.str.indexOf("//", end);
			code.remove(code.str.substring(0, end));
		}

		//	Remove destructor, init() and instance() methods
		int	start;
		String	constr = classname + "Class::" +
					classname + "Class(string &s):DeviceClass(s)";
		if ((start=code.str.indexOf(constr))<0)
			throw new PogoException(constr + "\nNot found in source file");
		start = code.inMethod(start);
		start = code.outMethod(start);

		String	cmd_fact = "void " + classname + "Class::command_factory()";
		if ((end=code.str.indexOf(cmd_fact, start))>0)
		{
			end = code.str.lastIndexOf("//+--------------", end);
			code.remove(code.str.substring(start, end));   
		}
		//	Remove device_factory() and get_class_property(string) methods
		if ((start=code.str.indexOf(cmd_fact, start))>0)
		{
			start = code.inMethod(start);
			start = code.outMethod(start);
			String	attr_fact = "void " + classname +
				"Class::attribute_factory(vector<Tango::Attr *> &att_list)";
			if ((end=code.str.indexOf(attr_fact, start))>0)
			{
				end = code.str.lastIndexOf("//+--------------", end);
				code.remove(code.str.substring(start, end));   
			}
			
		}
		return code.str;
	}
//=======================================================================
/**
 *	Get user code part at the end of file
 *
 *	@param	code		existing code read..
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String getUserCode(PogoString code)
	{
		String	signature = "void " + classname + "Class::write_class_property()";
		int	start = code.str.indexOf(signature);
		if (start<0)
			return "";

		start = code.inMethod(start);
		start = code.outMethod(start);

		int	end = code.str.indexOf("}	// namespace");
		if (end<0)
			return "";

		end =  code.str.lastIndexOf('\n', end);
		return code.str.substring(start, end);
	}
//=======================================================================
/**
 *	Add a call to get_class_property or put_class_property in class constructor
 *
 *	@param	readcode		existing code read..
 *	@param	putget			get or put action.
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String addPutGetPropertyCall(String readcode, String putget) throws PogoException
	{
		String	method_call = new String(putget + "_class_property();");
		//	Get existing code
		//--------------------------
		String	s = getClassConstructor(new PogoString(readcode));
		PogoString	method_core = new PogoString(s);

		//	If call exists, do nothing
		//----------------------------------
		if (s.indexOf(method_call)>0)
			return readcode;

		//	Get position to insert
		int	start;
		if ((start=method_core.str.indexOf("cout"))<0)
			return readcode;
		start = method_core.nextCr(start)+1;
		method_core.insert(start, new String("\t" + method_call + "\n"));
		
		PogoString newcode = new PogoString(readcode);
		newcode.replace(s, method_core.str);
		return newcode.str;
	}
//=======================================================================
/**
 *	Add a call to put_default_property in class constructor
 *
 *	@param	readcode		existing code read..
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String addPutDefaultPropertyCall(String readcode) throws PogoException
	{
		String	method_call = "put_default_property();";
		//	Get existing code
		//--------------------------
		String	s = getClassConstructor(new PogoString(readcode));
		PogoString	method_core = new PogoString(s);
		System.out.println("Serching put_default_property()  !!!!!!!!");

		//	If call exists, do nothing
		//----------------------------------
		if (s.indexOf(method_call)>0)
		{
			System.out.println("put_default_property() already exists !!!!!!!!");
			return readcode;
		}

		//	Get position to insert
		int	start;
		if ((start=method_core.str.indexOf("cout"))<0)
			return readcode;
		start = method_core.nextCr(start)+1;
		method_core.insert(start, new String("\t" + method_call + "\n"));
		
		PogoString newcode = new PogoString(readcode);
		newcode.replace(s, method_core.str);
		return newcode.str;
	}
//=======================================================================
/**
 *	Create the class methods where the commands are really executed.
 *
 *	@param	readcode		existing code read..
 *	@param	templcode		template code used to generate file.
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String updateCmdClass(PogoString readcode, PogoString templcode)
						throws PogoException
	{
		//	get 3 methods template block for each cmd
		//-----------------------------------------------
		int		start, end;
		if ((start=templcode.str.indexOf(templateBlock))<0)
			throw new PogoException("Input File Syntax error 1!");
		int	b=0;
		
		//	Not used any more
		//String	construct_templ = getCmdBlockFromTemplate(templcode.str, b++);
		String	exec_templ      = getCmdBlockFromTemplate(templcode.str, b++);

		end = start;
		for (int i=0 ; i<b ; i++)
			end = templcode.str.indexOf(templateBlock, end+1);
		end = templcode.nextCr(end)+1;

		//	Get the beginig of the file to keep previous modif.
		//---------------------------------------------------------
		if ((end=readcode.str.indexOf("Initialize pointer for singleton pattern"))<0)
		{
			if (is_abstractclass==false)
				throw new PogoException("singleton not found in source file");
			String	constr = classname + "Class::" +
						classname + "Class(string &s):DeviceClass(s)";
			if ((end=readcode.str.indexOf(constr))<0)
				throw new PogoException(constr + "\nNot found in source file");
			//	search begening of comments
			end = readcode.str.lastIndexOf("//+---------", end);
		}
		else
			//	search begening of comments
			for (int i=0 ; i<3 ; i++, end--)
				end = readcode.str.lastIndexOf("//", end);

		PogoString	pgs = new PogoString(readcode.str.substring(0, end));
		//	Don't forget to skip virtual status Cmds.
		//--------------------------------------------
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdAt(i);

			if (cmd.virtual_method==false)
			{
				//	built the full name of method to be search
				//------------------------------------------------
				String	method = new String(cmd.cmd_class +
									"::execute(Tango::DeviceImpl ");
				//System.out.println("Checking for " + method);
				int start_meth;
				//	if does not exist create full class
				if ((start_meth=pgs.str.indexOf(method))<0)
				{
					System.out.println("	-> creating...");
					pgs.str = insertNewCmdClass(cmd, pgs, templcode.str);
				}
				else
				{
					//	Replace by a new generated one
					//	(args could have changed)
					int end_meth;
					start_meth = pgs.inMethod(start_meth);
					end_meth   = pgs.outMethod(start_meth+1);
					String oldCore = pgs.str.substring(start_meth, end_meth);

					//	Get the template for core method only
					//--------------------------------------------
					PogoString templ =
						new PogoString(getCmdBlockFromTemplate(templcode.str, 0));
					start_meth = templ.inMethod(0);
					end_meth = templ.outMethod(start_meth+1);

					
					String newCore = cmd.buildCppCmdClassBlock(
									templ.str.substring(start_meth, end_meth),
									pogo.class_name);

					pgs.replace(oldCore, newCore);
				}
			}
		}
		//	Remove classes for commands deleted.if any.
		//---------------------------------------------
		String	code = removeDeletedCmdClasses(pgs);

		return code;
	}
//=======================================================================
/**
 *	Remove classes for commands deleted.if any.
 */
//=======================================================================
	protected String removeDeletedCmdClasses(PogoString code)
	{
		//	Search ::execute method
		String	ret_type = "CORBA::Any *";
		int	start=0;
		while ((start=code.indexOf(ret_type, start))>=0)
		{
			//	Get class name
			int	end = code.indexOf("::execute", start);
			String	class_name = code.substring(start+ret_type.length(), end);

			//	Get signature and check if really excute method
			end = code.indexOf("\n", end);
			String	signature    = code.substring(start, end);
			String	expected_sig =
				ret_type + class_name +
			"::execute(Tango::DeviceImpl *device,const CORBA::Any &in_any)";
			if (signature.equals(expected_sig)==true)
			{
				//	Check if command still exists
				boolean	still_exists = false;
				for (int i=0 ; i<pogo.commands.size() && still_exists==false; i++)
					if (pogo.commands.cmdAt(i).cmd_class.equals(class_name))
						still_exists = true;

				if (still_exists==false)
				{
					System.out.println(class_name + " has been removed !");
					//	get end of delete block
					end = code.inMethod(end);
					end = code.outMethod(end);
					
					//	constructor descrition -> previous class
					int	idx = code.lastIndexOf("}", start);
					if (idx<0)
					{
						//	first class case
						idx = code.lastIndexOf("{", start);
					}
					start = code.indexOf("//", idx);

					//	Remove the class block
					code.remove(code.substring(start, end));
				}
			}
			start = end;
		}
		return code.str;
	}

//=======================================================================
/**
 *	Create the class methods where the commands are really executed.
 *
 *	@param	templcode		template code used to generate file.
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String createCmdClass(PogoString templcode)
						throws PogoException
	{
		int		start, end;
		if ((start=templcode.str.indexOf(templateBlock))<0)
			throw new PogoException("Input File Syntax error 1!");
		String	head = templcode.str.substring(0, start);


		//	get 3 methods template block for each cmd
		//-----------------------------------------------
		int	b=0;
		//String	construct_templ = getCmdBlockFromTemplate(templcode.str, b++);
		String	exec_templ = getCmdBlockFromTemplate(templcode.str, b++);

		end = start;
		for (int i=0 ; i<b ; i++)
			end = templcode.str.indexOf(templateBlock, end+1);
		end = templcode.nextCr(end)+1;

		//	Don't forget to skip virtual status Cmds.
		//--------------------------------------------
		StringBuffer	sb = new StringBuffer();
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdAt(i);
			if (cmd.virtual_method==false)
			{
				//sb.append(cmd.setCmdClass(construct_templ));

				String	s = cmd.setCmdClass(exec_templ);
				sb.append(cmd.buildCppCmdClassBlock(s, pogo.class_name));
			}
		}
		sb.append("\n\n");
		String	exec_methods = new String(sb.toString());
		return new String(head + exec_methods);
	}
	//==============================================================
	/**
	 *	Build the factories to be added in serverClass.cpp.
	 */
	//==============================================================
	protected String buildFactories(PogoString templcode, PogoString old_code) throws PogoException
	{
		//	Get the command factory method to check/modify.
		//---------------------------------------------------
		StringBuffer	sb  = new StringBuffer();
		int	start, end;

		//	Command Factory
		//---------------------------------------------------
		if ((start=templcode.str.indexOf("Initialize pointer for singleton pattern"))<0)
			throw new PogoException("singleton not found in source file");
		start = templcode.previousCr(start); start-=2;
		start = templcode.previousCr(start); start-=2;
		start = templcode.previousCr(start);
		if ((end=templcode.str.indexOf("command_factory"))<0)
			throw new PogoException("command_factory() method not found !");
		end = templcode.inMethod(end);
		sb.append(templcode.str.substring(start, end));
		sb.append(pogo.commands.buildCommandFactoryMethod(cppLang));

		start = templcode.outMethod(end+1);
		start = templcode.nextCr(start);

		//	Get the device factory method
		//---------------------------------------------------
		if ((end=templcode.str.indexOf("device_factory(const Tango::DevVarStringArray *devlist_ptr)"))<0)
			throw new PogoException("device_factory() method not found !");
		end = templcode.inMethod(end);
		end = templcode.outMethod(end+1);
		end = templcode.nextCr(end);
		sb.append(templcode.str.substring(start, end));

		//	generate the attribute factory method.
		//	If any attribute.
		//---------------------------------------------------
		if (pogo.attributes.size()>0)
		{
			sb.append(
				"//+----------------------------------------------------------------------------\n");
			sb.append(
				"//	Method: "+pogo.class_name+"Class::attribute_factory(vector<Tango::Attr *> &att_list)\n");
			sb.append(
				"//-----------------------------------------------------------------------------\n");
			sb.append(
				"void "+ pogo.class_name +"Class::attribute_factory(vector<Tango::Attr *> &att_list)\n");
			sb.append(pogo.attributes.buildFactory(cppLang));
		}
		if (old_code==null)
			return sb.toString();
		//	device factory does not exist if super class !
		if (pogo.is_abstractclass)
			return sb.toString();

		//	else manage user code.	
		PogoString	new_code = new PogoString(sb.toString());

		//	Get code already existing in device_factory() at begining
		if ((start=old_code.str.indexOf("device_factory(const Tango::DevVarStringArray *devlist_ptr)"))<0)
			throw new PogoException("device_factory() method not found !");
		start = old_code.inMethod(start);
		start = old_code.str.indexOf("\n", start) + 1;
		end   = old_code.str.indexOf("	//	Create all devices.(Automatic code generation)", start);

		//	If not found --> old server where user code is not managed.
		if (end<0)
		{
			System.out.println("\"Create all devices.(Automatic code generation)\"  NOT found !");
			return sb.toString();
		}
		String	user_code = old_code.substring(start, end);
		start = new_code.str.indexOf("device_factory(const Tango::DevVarStringArray *devlist_ptr)");
		start = new_code.inMethod(start);
		start = new_code.str.indexOf("\n", start) + 1;
		end   = new_code.str.indexOf("	//	Create all devices.(Automatic code generation)", start);

		//	Replace the default code by user one
		new_code.replace(start, new_code.str.substring(start, end), user_code);

		//	Get code already existing in device_factory() at ending
		if ((start=old_code.str.indexOf("device_factory(const Tango::DevVarStringArray *devlist_ptr)"))<0)
			throw new PogoException("device_factory() method not found !");
		start = old_code.inMethod(start);
		end   = old_code.outMethod(start);
		start = old_code.indexOf("	//	End of Automatic code generation", start);;
		user_code = old_code.substring(start, end);
		start = new_code.str.indexOf("device_factory(const Tango::DevVarStringArray *devlist_ptr)");
		start = new_code.inMethod(start);
		end   = new_code.outMethod(start);
		start = new_code.indexOf("	//	End of Automatic code generation", start);;

		//	Replace the default code by user one
		new_code.replace(start, new_code.str.substring(start, end), user_code);

		return new_code.str;
	}
//=======================================================================
/**
 *	Insert new cmd class in str
 *
 *	@param	cmd		Command concerned.
 *	@param	pgs		String where this class must be inserted.
 *	@return	String where the class has been inserted.
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String insertNewCmdClass(Cmd cmd, PogoString pgs, String templcode)
						throws	PogoException
	{
		//	get 3 methods template block for each cmd
		//-----------------------------------------------
		int	b=0;
		//String	construct_templ = getCmdBlockFromTemplate(templcode,b++);
		String	exec_templ      = getCmdBlockFromTemplate(templcode,b++);

		//	Search place to insert 
		//-----------------------------
		int	idx = pgs.str.indexOf("namespace " + pogo.namespace());
		if (idx<0)
			idx = pgs.str.indexOf("namespace " + pogo.class_name);
		if (idx<0)
			for (int i=0 ; (i=pgs.str.indexOf("#include", i))>=0 ; i++)
				idx = i;
		
		idx = pgs.nextCr(idx) + 2;
			
		String	s = cmd.setCmdClass(exec_templ);
		String	new_cmd = cmd.buildCppCmdClassBlock(s, pogo.class_name);
		
		pgs.insert(idx, new_cmd);
		return pgs.str;
	
	}
//=======================================================================
/**
 *	Search the Cmd template block.
 *
 *	@param	templcode	the source code from template.
 *	@param	num		Block number
 *	@return The Cmd template block
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String getCmdBlockFromTemplate(String templcode, int num)
						throws	PogoException
	{
		int		start=0, end;
		for (int i=0 ; i<=num ; i++)
			if ((start=templcode.indexOf(templateBlock, start+1))<0)
				throw new PogoException("Input File Syntax error 1!" +
										templateBlock + "Not found");

		//	Cut the module in blocks of methods
		//-----------------------------------------------
		start = templcode.indexOf("\n", start);
		end = templcode.indexOf(templateBlock, start) ;

		return templcode.substring(start, end);
	}
//===============================================================
/**
 *	Write the ::is_allowed methods to read code.
 *
 *	@param	readcode	The read source code.
 *	@return the modified code for is_allowed method.
*	@throws	PogoException	If a synthax error occured on input file
 */
//===============================================================
	protected String updateIsAllowedMethods(String readcode)
						throws PogoException
	{
		PogoString	pgs = new PogoString(readcode);

		//	Don't forget to skip virtual status Cmds.
		//--------------------------------------------
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdAt(i);
			if (cmd.virtual_method==false)
			{
				String	pattern = new String("bool "+cmd.cmd_class + "::is_allowed");
				int		start, end, ptr;
				if ((start=pgs.str.indexOf(pattern))<0)
					throw new PogoException("\""+pattern+"\" Not Found in source file !");

				//	Get the method's line
				//--------------------------------
				start = pgs.previousCr(start);
				end   = pgs.nextCr(start)+1;
				String	line = pgs.str.substring(start, end);

				//	Get the method's block
				//--------------------------------
				start = pgs.inMethod(start);
				end   = pgs.outMethod(start);
				String	method = pgs.str.substring(start, end);

				//	Build new method's block
				//---------------------------------
				String	newMethod = cmd.buildIsAllowedMethod(new PogoString(method), cppLang);
			
				//	And replace in PogoString object
				//---------------------------------------
				pgs.replace(new String(line+method), new String(line+newMethod));
			}
		}
		return pgs.str;
	}
//===============================================================
/**
 *	Get the class constructor method core.
 *
 *	@param	readcode	The read source code.
 *	@return the modified code for is_allowed method.
*	@throws	PogoException	If a synthax error occured on input file
 */
//===============================================================
	protected String getClassConstructor(PogoString readcode)
							throws	PogoException
	{
		int start;
		String	constr = classname + "Class::" +
					classname + "Class(string &s):DeviceClass(s)";
		if ((start=readcode.str.indexOf(constr))<0)
		{
			//	Tray another signature
			constr = classname + "Class::" +
					classname + "Class(string &s):Tango::DeviceClass(s)";
			if ((start=readcode.str.indexOf(constr))<0)
				throw new PogoException(constr + "\nNot found in source file");
		}
		//	search begening of comments
		start = readcode.str.lastIndexOf("//+-----", start);

		int	end = start;
		while (readcode.str.charAt(end)!='{')
			end++;
		end = readcode.outMethod(end);
		//	get the following destructor
		end = readcode.inMethod(end+1);
		end = readcode.outMethod(end);

		return readcode.str.substring(start, end);
	}

//===============================================================
/**
 *	Get the get_class_property() method core.
 *
 *	@param	readcode	The read source code.
 *	@return the modified code for is_allowed method.
*	@throws	PogoException	If a synthax error occured on input file
 */
//===============================================================
	protected String getGetPropertyMethod(PogoString readcode)
							throws	FileNotFoundException,
										SecurityException,
										IOException
	{
		String	get_property_signature
			 = new String("void " + pogo.class_name + "Class::get_class_property()");
		int	start, end;
		if (readcode==null ||
			(start=readcode.str.indexOf(get_property_signature))<0)
		{
			//	No input code or method not found
			//		-> Return template
			//----------------------------------------
			String templname = new String(pogo.templates_dir + "/cpp/" +
											"readPropMethodName.cpp");
			PogoString templcode = new PogoString(PogoUtil.readFile(templname));
			templcode = PogoUtil.removeLogMessages(templcode);
			//	Replace template pattern
			//---------------------------------------
			while (templcode.str.indexOf(templateClass)>=0)
				templcode.replace(templateClass, new String(pogo.class_name+"Class"));
			while (templcode.str.indexOf("target")>=0)
				templcode.replace("target", "class");
			return templcode.str;
		}
		//	Get only the methode code
		//---------------------------------------
		end = readcode.inMethod(start);
		end = readcode.outMethod(end+1);
		while (readcode.str.charAt(start)!='}')
			start--;
		start+=2;
		return readcode.str.substring(start, end);
	}

//===============================================================
/**
 *	Write the ::is_allowed methods to read code.
 *
 *	@param	readcode	The read source code.
 *	@return the modified code for is_allowed method.
*	@throws	PogoException	If a synthax error occured on input file
 */
//===============================================================
	protected String updatePropertyMethod(String readcode)
							throws	PogoException
	{
		//	If no property return an empty string
		//-------------------------------------------
		if (properties.size()==0)
			return "";

		PogoString	core = new PogoString(readcode);

		//	Get the start and end of automatic code generation
		//-------------------------------------------------------
		int start, end;
		String	pattern = "Automatic code generation";
		if ((start=core.str.indexOf(pattern))<0)
			throw new PogoException("Input File Syntax error 1!" +
									"\""+ pattern + "\" Not found");
		start = core.nextCr(start)+1;
		start = core.nextCr(start)+1;
		
		end = core.str.indexOf("End of Automatic code generation", start);
		end = core.previousCr(end);

		StringBuffer	sb = new StringBuffer(core.str.substring(0, start));

		//	Insert new code
		//-------------------------
		sb.append(
			"\tif (Tango::Util::instance()->_UseDb==false)\n"+
			"\t\treturn;\n");
		//	Declare DbData and fill it
		//---------------------------------------------
		//sb.append("\tTango::DbData	data;\n");
		for (int i=0 ; i<properties.size() ; i++)
		{
			Property	property = properties.propertyAt(i);
			sb.append("\tcl_prop.push_back(Tango::DbDatum(\""
									+ property.name + "\"));\n");
		}
		sb.append("\n");
		sb.append("\t//	Call database and extract values\n");
		sb.append("\t//--------------------------------------------\n");
		sb.append("\tget_db_class()->get_property(cl_prop);\n");
		sb.append("\tint	i = -1;\n");

		//	Extract properties values
		//---------------------------------
		for (int i=0 ; i<properties.size() ; i++)
		{
			Property	property = properties.propertyAt(i);
			sb.append("\t//	Extract " + property.name + " value\n");
			sb.append("\tif (cl_prop[++i].is_empty()==false)");
			sb.append("\tcl_prop[i]  >>  " + property.getVarName() + ";\n");
			sb.append("\telse\n");
			sb.append("\t	cl_prop[i]  <<  " + property.getVarName() + ";\n");
			if (i<properties.size()-1)
				sb.append("\n");
		}
		sb.append("\n");
		sb.append(core.str.substring(end));

		return sb.toString();
	}
//===============================================================
/**
 *	Write the write_property methode core
 */
//===============================================================
	protected String buildPutPropertyMethod() throws FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		String templname = new String(pogo.templates_dir +
										"/cpp/write_property.cpp");
		PogoString readcode = new PogoString(
				PogoUtil.readFile(templname, templateClass, pogo.class_name));
		readcode = PogoUtil.removeLogMessages(readcode);

		//	Add Project title
		String	tag = "PogoProjectTitle";
		String	pattern = new String("\"" + pogo.title + "\"");
		while (readcode.str.indexOf(tag)>=0)
			readcode.replace(tag, pattern);
		tag = "PogoClassDescription;";
		
		//	Add Class Description
		//	as a string array.
		int	start = 0;
		PogoString	desc = new PogoString(pogo.class_desc);
		desc.manageDoubleCotes();
		String	newcode = "vector<string>	str_desc;\n";
		start = 0;
		int	end;
		while ((end=desc.str.indexOf('\n', start))>=0)
		{
			newcode += "\tstr_desc.push_back(\"";
			newcode	+= desc.str.substring(start, end) + "\");\n";
			start = end + 1;
		}
		newcode += "\tstr_desc.push_back(\"";
		newcode += desc.substring(start) + "\");";

		while (readcode.str.indexOf(tag)>=0)
			readcode.replace(tag, newcode);
		return readcode.str;
	}
	//================================================================
	/**
	 *	For old servers, corect bug in trace message.
	 */
	//================================================================
	private String correctOldTrace(String str)
	{
		PogoString	code = new PogoString(str);
		String	ret_type = "CORBA::Any *";
		int	start;
		while ((start=code.str.indexOf(templateCmd))>0)
		{
			//	Search command name
			start = code.str.lastIndexOf(ret_type, start);
			start += ret_type.length();
			String	cmdname =
				code.str.substring(start, code.str.indexOf("::", start));
			code.replace(templateCmd, cmdname);
		}

		return code.str;
	}
}
