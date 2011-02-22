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
// Revision 3.9  2005/03/02 10:27:10  pascal_verdier
// Managing Super Classes and inherited classes.
//
// Revision 3.8  2005/02/24 10:42:26  pascal_verdier
// udateConstructorPrototypes() method added.
//
// Revision 3.7  2004/12/10 13:29:35  pascal_verdier
// Add missing include "ServerClass.h" in Server.cpp when convert Tango-4 to Tango-5 server.
//
// Revision 3.6  2004/11/22 11:07:46  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.5  2004/10/29 14:21:55  pascal_verdier
// if device property not found in database, it takes class property value if exists.
//
// Revision 3.4  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.3  2004/09/02 06:41:34  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
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
 *	This class generates Cpp source file for Server files.
 *
 * @author	$Author$
 * @version	$Revision$
 */
public class CppServer extends PogoGene implements PogoDefs, TangoConst
{
	private String			server;
	private PropertyTable	properties;
	private	static String	readprop_method_name = "get_device_property";
	private	String			readprop_method_signature;
	private	String			init_signature;
	private String			classname;
	private boolean			is_abstractclass = false;
	//================================================================
	/**
	 *	Constructor
	 */
	//================================================================
	public CppServer(PogoClass pogo)
	{
		super(pogo);
		classname = pogo.class_name;
		server =
			new String(pogo.projectFiles.getPath() + "/" + classname + "Class.cpp");
		properties    = pogo.dev_properties;
		is_abstractclass = pogo.is_abstractclass;

		//	Build the init_device and get property method signatures
		//------------------------------------------------------------
		init_signature = new String("void " + classname + "::" + "init_device");

		readprop_method_signature = new String("void " + classname +
										"::" + readprop_method_name + "()");
	}




//=========================================================================
//	Header file generation
//=========================================================================

//=======================================================================
/**
 *	Add the device property data members to header file.
 *
 *	@param	readcode	the read source code
 *	@return the source code updated with the device property data members.
 */
//=======================================================================
	private String addPropertyDataMembers(PogoString readcode) throws PogoException
	{
		int		start, end;
		String	tagStr = "Device properties member data.";
		//	Check if tag alredy exists
		//----------------------------------
		if ((start=readcode.str.indexOf(tagStr))<0)
		{
			if ((start=readcode.str.indexOf("Attributs member data."))<0)
				throw new PogoException("Tags not found in header file");
			start = readcode.inMethod(start)  + 1;
			start = readcode.outMethod(start) + 1;

			StringBuffer	sb = new StringBuffer("/**\n");
			sb.append(" * @name Device properties\n");
			sb.append(" * " + tagStr +"\n */\n");
			sb.append("//@{\n//@}\n\n");
			readcode.insert(start, sb.toString());
		}
		start = readcode.inMethod(start) + 2;
		end   = readcode.str.indexOf("//@}", start);
		String	old = readcode.str.substring(start, end);
		
		//	Declare member data
		//-------------------------------------
		StringBuffer	sb = new StringBuffer("");
		for (int i=0 ; i<properties.size() ; i++)
		{
			Property	property = properties.propertyAt(i);
			sb.append("/**\n");
			sb.append(" *\t" + new PogoString(property.description) .setComments()+ "\n");
			sb.append(" */\n");
			//	Tango::DevString not supported
			//--------------------------------------
			String type = property.type.cpp;
			if (type.equals("Tango::DevString"))
				type = "string";
			sb.append("\t" + type +"\t" +
					 	property.getVarName() + ";\n");
		}
		if (old.length()>0)
			readcode.replace(start, old, sb.toString());
		else
			readcode.insert(start, sb.toString());
		
		//	Add prototype if does not exist
		//---------------------------------------
		if (readcode.str.indexOf(readprop_method_name)<0)
		{
			start = readcode.str.indexOf("Here is the end of the automatic");
			while(readcode.str.charAt(start)!='}')
				start--;
			start = readcode.previousCr(start);
			sb = new StringBuffer("");
			sb.append("/**\n");
			sb.append(" *	Read the device properties from database\n");
			sb.append(" */\n");
			sb.append("\t void " + readprop_method_name + "();\n");

			readcode.insert(start, sb.toString());
		}
		return readcode.toString();
	}

//=======================================================================
/**
 *	Add in the sourtce code, the prototype for the methods
 *	where the commands are really executed.
 *
 *	@param	readcode	read source code.
 *	@throws	PogoException	If a synthax error occured on input file.
 */
//=======================================================================
	protected String addPrototypes(PogoString readcode)
						throws	PogoException
	{
		StringBuffer	newcode = new StringBuffer();

		//	search place to write Class Description
		//----------------------------------------------
		int	start = -1;
		int	end;
		for (int i=1 ; start<0 && i<PogoUtil.cpp_target.length ; i++)
		  start = readcode.str.indexOf(PogoUtil.cpp_target[i]);

		//	If not found, check inheritance
		if (start<0)
			if ((start=readcode.str.indexOf(": public " +
					   pogo.inheritedNamespace() + "::" + pogo.inheritedClassName()))<0)
			{
				System.out.println("Do not found\n" + ": public " +
						pogo.inheritedNamespace() + "::" + pogo.inheritedClassName());
				throw new PogoException("Input File Syntax error !",
								"\"public Tango::Device_3Impl\" NOT FOUND");
			}
		//	get line begining
		//------------------------------------------------
		while (start>0 && readcode.str.charAt(start)!='\n')
			start--;

		//	Check if Class description description alredy exists
		//-----------------------------------------------------
		String	header = setProjectTitle(readcode.str.substring(0, start));
		if ((end=header.indexOf(classDescRes))>0)
		{
			end = header.indexOf(" * ", end) + 3 ;
			newcode.append(header.substring(0, end));
		}
		else
		{
			newcode.append(header);
			newcode.append("\n/**\n * " + classDescRes + "\n * ");
		}

		//	Write class description as description
		//-----------------------------------------------
		if (pogo.class_desc!=null)
			newcode.append(new PogoString(pogo.class_desc).setComments());
		newcode.append("\n */\n");

		//	Add comments about DevState table
		//----------------------------------------
		newcode.append("\n/*\n");
		newcode.append(pogo.states.toStringComments(cppLang));
		newcode.append(" */\n\n");

		//	Search place to write attributes member data
		//--------------------------------------------------
		if ((end=readcode.str.indexOf("//@{"))<0)
			throw new PogoException("Input File Syntax error !",
									"tag:  \"//@{\"   NOT FOUND");

		while(readcode.str.charAt(end)!='\n')
			end++;
		end++;
		newcode.append(readcode.str.substring(start, end));
		for (int i=0 ; i<pogo.attributes.size() ; i++)
		{
			Attrib	attr = pogo.attributes.attributeAt(i);
			newcode.append(attr.cppMemberData());
		}

		//	search place to write protypes
		//----------------------------------------------
		String	start_proto = "/**\n * @name " + pogo.class_name +
								" methods prototypes\n */\n\n//@{\n";
		start = readcode.str.indexOf("//@}", end);
		if ((end=readcode.str.indexOf("always_executed_hook"))<0)
		{
			if (pogo.is_abstractclass)
			{
				if ((end=readcode.str.indexOf(start_proto))<0)
					throw new PogoException("Input File Syntax error !",
							"\"" + start_proto + "\" NOT FOUND");
			}
			else
				throw new PogoException("Input File Syntax error !",
						"\"always_executed_hook\" NOT FOUND");
		}
		newcode.append(readcode.str.substring(start, end));
		
		//	If super class skip destructor
		if (pogo.is_abstractclass==false)
		{
			newcode.append(readcode.str.substring(end, 
							readcode.str.indexOf("\n", end)+1));
			newcode.append("\n//@}\n\n");
		}
		newcode.append(start_proto);

		//	READ/Write prototypes for attributes if any
		//-----------------------------------------------
		if (pogo.attributes.size()>0)
		{
			//	Read_attr_hardware() method
			String sig = pogo.attributes.readHardwareFullSignatureMethod(null);
			newcode.append(sig + ";\n");
		}

		//	read/write for each attribute
		for (int i=0 ; i<pogo.attributes.size() ; i++)
		{
			Attrib attr = pogo.attributes.attributeAt(i);
			newcode.append(attr.readFullSignatureMethod(null) + ";\n");
			if (attr.getWritable())
				newcode.append(attr.writeFullSignatureMethod(null) + ";\n");
		}
		
		//	allowed prototypes for attributes if any
		//-----------------------------------------------
		for (int i=0 ; i<pogo.attributes.size() ; i++)
		{
			Attrib attr = pogo.attributes.attributeAt(i);
			newcode.append(attr.allowedFullSignatureMethod(null) + ";\n");
		}
		//	allowed prototypes for command if any
		//-----------------------------------------------
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd	cmd = pogo.commands.cmdAt(i);
			if (cmd.virtual_method==false)
				newcode.append(cmd.allowedFullSignatureMethod(null) + ";\n");
		}

		//	Write prototypes for commands
		//	Don't forget to skip dummy status Cmds.
		//--------------------------------------------
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdAt(i);
			if (cmd.virtual_method==false ||
				(cmd.virtual_method==true && cmd.override_method!=NOT_OVERRIDE))
				newcode.append(cmd.buildCppCmdProtypes());
		}
		newcode.append("\n//@}\n");

		//	Search the end of comment block to add prototypes
		//----------------------------------------------------------
		start = readcode.str.indexOf("Here is the end of the automatic");
		while (start>0 && readcode.str.charAt(start)!='\n')
			start--;

		if (start<0)
			throw new PogoException("Input File Syntax error !\n\"//@}\" tag NOT FOUND");

		newcode.append(readcode.str.substring(start));

		return newcode.toString();
	}
	//================================================================
	/**
	 *	Convert the C++ Server.h file, to a AbstractClass.h file
	 */
	//================================================================
	private String toAbstractClassHeader(String str)
	{
		//	first time remove destructor
		PogoString	code = new PogoString(str);
		String	start_proto = "/**\n * @name " + pogo.class_name +
								" methods prototypes\n */\n\n//@{\n";
		int	start = code.str.indexOf("/**@name Destructor");
		int	end;
		if (start>0)
		{
			end = code.str.indexOf(start_proto, start);
			if (end<0)
			{
				System.out.println("WARNING: " + start_proto + "  Not Found !!!");
				return str;
			}
			code.remove(code.str.substring(start, end));
		}
		//	Remove get_device_property method
		start = code.str.indexOf("void get_device_property();");
		if (start>0)
		{
			end   = code.str.indexOf("//@}", start);
			start = code.str.lastIndexOf("/**", start);
			code.remove(code.str.substring(start, end));
		}
		
		//	For each prototype, declare as pure virtual or 
		//		return true if is_allowed method
		Vector	old_lines = new Vector();
		Vector	new_lines = new Vector();
		start = code.str.indexOf(start_proto) + start_proto.length();
		start = code.str.indexOf("/**", start);
		end   = code.str.indexOf("//@}", start);
		while (start<end)
		{
			start = code.str.indexOf("*/", start) + "*/".length();
			int	end_line = code.str.indexOf("/**", start);
			if (end_line<0)
				end_line = end;

			String	old_line = code.str.substring(start, end_line).trim();
			String	new_line = new String(old_line);
			if (new_line.startsWith("virtual ")==false)
				new_line = "virtual " + new_line;
			if (new_line.indexOf("_allowed(")<0)
			{
				//	Add = NULL to be pure virtual if not already done
				if (new_line.indexOf("NULL")<0)
				{
					new_line = new_line.substring(0, new_line.length()-1) +
								" = NULL;";
				}
			}
			else
			{
				//	add return true if not already done
				if (new_line.indexOf("return true;")<0)
				{
					new_line = new_line.substring(0, new_line.length()-1) +
								"{ return true; };";
				}
			}
			old_lines.add(old_line);
			new_lines.add(new_line);
			//System.out.println(new_line);
			start = end_line;
		}
		for (int i=0 ; i<old_lines.size() ; i++)
			code.replace((String)old_lines.elementAt(i),
							(String)new_lines.elementAt(i));
		return code.str;
	}
	//================================================================
	/**
	 *	Update constructors from previous versions
	 *	And modify for super class if needed.
	 */
	//================================================================
	private PogoString udateConstructorPrototypes(PogoString readcode)
	{
		String[]	old_constr = {
			pogo.class_name + "(Tango::DeviceClass *,string &)",
			pogo.class_name + "(Tango::DeviceClass *,const char *)",
			pogo.class_name + "(Tango::DeviceClass *,const char *,const char *)"
		};
		
		String[]	new_constr = {
			pogo.class_name + "(Tango::DeviceClass *cl,string &s)",
			pogo.class_name + "(Tango::DeviceClass *cl,const char *s)",
			pogo.class_name + "(Tango::DeviceClass *cl,const char *s,const char *d)"
		};
		//	Update constructors from previous versions
		for (int i=0 ; i<old_constr.length ; i++)
			readcode.replace(old_constr[i], new_constr[i]);

		//	And modify for super class if needed.
		if (pogo.is_abstractclass)
		{
			String[]	sc_ext = {
				":" + tangoDeviceImpl + "(cl,s) {}",
				":" + tangoDeviceImpl + "(cl,s) {}",
				":" + tangoDeviceImpl + "(cl,s,d) {}"
			};
			//	Add call to Device_Impl constructor
			int	pos;
			for (int i=0 ; i<new_constr.length ; i++)
				if ((pos=readcode.str.indexOf(new_constr[i]))>0)
				{
					pos += new_constr[i].length();
					if (readcode.str.substring(pos).trim().charAt(0)==';')
						readcode.insert(pos, sc_ext[i]);
				}
		}
		return readcode;
	}
	//================================================================
	/**
	 *	Generate the C++ Server.h file.
	 */
	//================================================================
	public void generateHeader(String server_h)throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		System.out.println("Generating " + server_h + "....");

		//	Read Template file
		//----------------------------
		boolean	from_template = false;
		String filename;
		if (already_exists(server_h))
			filename = server_h;
		else
		{
			from_template = true;
			filename = pogo.templates_dir +
					"/cpp/" + templateFile + ".h";
		}
		PogoString readcode = new PogoString(
			PogoUtil.readFile(filename, templateClass, pogo.class_name));

		if (from_template)
		{
			//	Replace template pattern
			//---------------------------------------
			readcode = PogoUtil.removeLogMessages(readcode);
			while (readcode.str.indexOf(templateClass.toUpperCase())>=0)
				readcode.replace(templateClass.toUpperCase(), pogo.class_name.toUpperCase());
		}
		else
		{
			//	Check IDL version DeviceImpl -> Device_2Impl
			while (readcode.str.indexOf("DeviceImpl")>=0)
			{
				System.out.println("Replacing DeviceImpl by " + tangoDeviceImpl);
				readcode.replace("DeviceImpl", tangoDeviceImpl);
			}
			while (readcode.str.indexOf("Device_2Impl")>=0)
			{
				System.out.println("Replacing Device_2Impl by " + tangoDeviceImpl);
				readcode.replace("Device_2Impl", tangoDeviceImpl);
			}
		}
		//	Change inheritance if needed
		if (pogo.inherited_from!=null)
			if (pogo.inherited_from.equals(tangoDeviceImpl)==false)
			{
				String	inheritance = ": public " + pogo.inheritedNamespace() +
							"::" + pogo.inheritedClassName() +
							"	//	" + PogoUtil.cpp_target[0] + tangoDeviceImpl;

				readcode.replace( PogoUtil.cpp_target[1], inheritance);

				//	Add include file if not already done
				String	sc_header =  "<" + pogo.inheritedClassName() + ".h>";
				if (readcode.str.indexOf(sc_header)<0)
				{
					int	pos = readcode.str.indexOf("<tango.h>");
					pos = readcode.nextCr(pos) +1;
					readcode.insert(pos, "#include " + sc_header + "\n");
				}
			}

		//	Update constructors from previous versions
		readcode = udateConstructorPrototypes(readcode);

		//	Add prototypes.and property
		//----------------------------------------
		String newcode = addPrototypes(readcode);
		newcode = addPropertyDataMembers(new PogoString(newcode));

		//	Manage if super calass
		if (pogo.is_abstractclass)
		{
			newcode = toAbstractClassHeader(newcode);
		}

		//	Open and write file
		//----------------------------------------
		FileOutputStream	fidout = new FileOutputStream(server_h);
		fidout.write(newcode.getBytes());
		fidout.close();
	}







//=========================================================================
//	Header source generation
//=========================================================================

//=========================================================================
/*	Source file generation
//=========================================================================


	//================================================================
	/**
	 *	Generate the C++ Server.cpp file.
	 */
	//================================================================
	public void generateSource(String server) throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		System.out.println("Generating " + server + "....");

		//	Read Template file
		//----------------------------
		String	filename;
		boolean	src_exist = already_exists(server);
		if (src_exist)
			filename = server;
		else
			filename = new String(pogo.templates_dir + "/cpp/" +
											templateFile + ".cpp");

		PogoString readcode = new PogoString(
			PogoUtil.readFile(filename, templateClass, pogo.class_name));

		//	Replace template pattern
		//---------------------------------------
		if (src_exist)
		{
			//	Check IDL version DeviceImpl -> Device_2Impl
			while (readcode.str.indexOf("DeviceImpl(cl")>=0)
			{
				System.out.println("Replacing DeviceImpl by Device_2Impl");
				readcode.replace("DeviceImpl(cl", "Device_2Impl(cl");
			}
			//	Check IDL version Device_2Impl -> Device_3Impl
			while (readcode.str.indexOf("Device_2Impl(cl")>=0)
			{
				System.out.println("Replacing Device_2Impl by " + tangoDeviceImpl);
				readcode.replace("Device_2Impl(cl", tangoDeviceImpl + "(cl");
			}

			//	Make sure than DevServClass.h is included
			String	target = "<" + pogo.class_name + "Class.h>";
			int start = readcode.str.indexOf("<" + pogo.class_name + ".h>");
			start = readcode.nextCr(start) + 1;
			if (readcode.str.indexOf(target, start)<0)	//	Not found
				readcode.insert(start, "#include " + target + "\n");
		}
		else
			readcode = PogoUtil.removeLogMessages(readcode);

		//	Change inheritance on constructor if needed
		if (pogo.inherited_from!=null)
			if (pogo.inherited_from.equals(tangoDeviceImpl)==false)
			{
				String	inheritance = ":" + pogo.inheritedNamespace() + "::" +
								pogo.inheritedClassName();
				String	target = ":Tango::"+tangoDeviceImpl;
				while (readcode.str.indexOf(target)>0)
					readcode.replace(target, inheritance);
			}

		//	Get header for no modification and no search inside.
		//--------------------------------------------------------
		int	namespace = readcode.indexOf("namespace " + pogo.namespace());
		if (namespace<0)
			namespace = readcode.indexOf("namespace " + pogo.class_name);
		PogoString	header  = new PogoString(readcode.str.substring(0, namespace));
		readcode = new PogoString(readcode.str.substring(namespace));

		//	Add description for commands/method table in header part
		//-------------------------------------------------------------
		int	start = header.indexOf("The folowing table gives the correspondance");
		int	end = header.indexOf("//==========================", start);

		start = header.lastIndexOf("//==========", start);			
		end = header.nextCr(end);
		String	old = header.substring(start, end);
		header.replace(old, pogo.commands.addCommentsTable());

		//	Add the methods where commands are really executed
		//--------------------------------------------------------
		String	newcode = addMethodsToExecuteCmd(readcode.str);
		if (src_exist)
			newcode = checkForExecMethodModif(new PogoString(newcode), cppLang);

		//	Add the methods where attributes are really read/write
		//--------------------------------------------------------
		if (pogo.attributes.size()>0)
			newcode = buildAttributesMethods(new PogoString(newcode));

		if (properties.size()>0)
			newcode = addReadPropMethod(new PogoString(newcode));

		//	Open and write file
		//----------------------------------------
		FileOutputStream	fidout = new FileOutputStream(server);
		fidout.write(header.getBytes());
		fidout.write(newcode.getBytes());
		fidout.close();
	}
//======================================================================
//======================================================================
	private String	cpp_flag_dev_impl_2 = "#ifdef DEV_IMPL_2\n";
	void comment_read_write_attr_methods(PogoString code, String classname)
	{
		//	Comment read method
		String	pattern = "void " + classname + 
							"::read_attr(Tango::Attribute &attr)";
		int	start, end;
		if ((start=code.str.indexOf(pattern))>0)
		{
			end = code.inMethod(start);
			end = code.outMethod(end);

			code.insert(end, "#endif\n");
			code.insert(start, cpp_flag_dev_impl_2);		
		}

		//	Comment write method
		pattern = "void " + classname + 
							"::write_attr_hardware(vector<long> &attr_list)";
		if ((start=code.str.indexOf(pattern))>0)
		{
			end = code.inMethod(start);
			end = code.outMethod(end);

			code.insert(end, "#endif\n");
			code.insert(start, cpp_flag_dev_impl_2);
		}	
	}
//=======================================================================
//=======================================================================
	private String buildAttributesMethods(PogoString code)
	{
		//	Search position to insert
		int	insert_pos = code.indexOf(pogo.class_name + "::always_executed_hook()");
		insert_pos = code.inMethod(insert_pos);
		insert_pos = code.outMethod(insert_pos);

		//	First time check if read_attr_ardware already exists
		//-------------------------------------------------------
		String	signature = 
				pogo.attributes.readHardwareSignatureMethod(pogo.class_name);
		int	start;
		if ((start=code.indexOf(signature))<0)
		{
			//	build and insert method with FULL signature
			String	method = 
				pogo.attributes.readHardwareFullSignatureMethod(pogo.class_name);
			method += "\n{\n" + 
						PogoUtil.enteringTrace(signature) +
						"	//	Add your own code here\n" +
						"}\n\n";
			code.insert(insert_pos, method);
			insert_pos += method.length();
		}
		else
		{
			//	insert just after
			insert_pos = code.inMethod(start);
			insert_pos = code.outMethod(insert_pos);
		}
		

		//	Then Add a method for each attribute to read
		for (int i=0 ; i<pogo.attributes.size() ; i++)
		{
			Attrib	attr = pogo.attributes.attributeAt(i);
			
			//	Check if method already exists
			signature = attr.readSignatureMethod(pogo.class_name);
			if (code.indexOf(signature)<0)
			{
				//	build and insert method with FULL signature
				String	method =
					attr.readFullSignatureMethod(pogo.class_name);
				method += "\n{\n" + 
							PogoUtil.enteringTrace(signature);
				method += attr.getDevImpl2ReadAttr(code, pogo.class_name);
				method += "}\n\n";
				code.insert(insert_pos, method);
				insert_pos += method.length();
			}
			//	Do same thing for writable attributes
			if (attr.getWritable())
			{
				signature = attr.writeSignatureMethod(pogo.class_name);
				if (code.indexOf(signature)<0)
				{
					//	build and insert method with FULL signature
					String	method =
						attr.writeFullSignatureMethod(pogo.class_name);
					method += "\n{\n" + 
								PogoUtil.enteringTrace(signature);
					method += attr.getDevImpl2WriteAttr(code, pogo.class_name);
					method += "}\n\n";
					code.insert(insert_pos, method);
					insert_pos += method.length();
				}
			}
		}
		comment_read_write_attr_methods(code, pogo.class_name);
		return code.str;
	}
//=======================================================================
/**
 *	Add the methods where the commands are really executed.
 *
 *	@param	readcode	read source code.
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String addMethodsToExecuteCmd(String readcode)
						throws PogoException
	{
		StringBuffer	newcode	= new StringBuffer();

		int	start = 0;
		int	end;

		//	Check if 'namespace classname' exists
		//-----------------------------------------------
		boolean	namespace_exist;
		String	namespace = new String("namespace " + pogo.namespace());
		if (readcode.indexOf(namespace)<0 &&
			readcode.indexOf("namespace " + pogo.class_name)<0)
		{
			//	write to the end of file before adding command methodd
			//-------------------------------------------------------------
			newcode.append(readcode.substring(start));
			namespace_exist = false;
		}
		else
		{
			//	Search the last brackett
			//-----------------------------
			end = readcode.length() - 1;
			while (readcode.charAt(end)!='}')
				end--;
			while (readcode.charAt(end)!='\n')
				end--;
			newcode.append(readcode.substring(start, end));
			namespace_exist = true;
		}

		//	Write command execute methods if do not already exist
		//-----------------------------------------------------------
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdAt(i);

			if (cmd.virtual_method==false || cmd.override_method==OVERRIDE)
			{
				String	line = cmd.buildCppExecCmdMethodSignature(pogo.class_name);
				//	Take Of "argin" could have change it's name.
				System.out.println(line);
				int	sl = line.indexOf("(");
				int	el = line.indexOf(" ", sl);
				if (el<0)	el = sl+1 ;
					line = line.substring(0, el);
				//	Check if method does not already exists
				//--------------------------------------------
				if (readcode.indexOf(line)<0)
				{
					newcode.append(new String("\n"));
					newcode.append(cmd.buildCppExecCmdMethodComments(pogo.class_name));
					newcode.append(cmd.buildCppExecCmdMethod(pogo.class_name));
					if (cmd.virtual_method==true)
						cmd.override_method = ALREADY_OVERRIDED;
				}
			}
		}

		//	Add end of namespace if exists
		//---------------------------------------
		if (namespace_exist)
			newcode.append(new String("\n}	//	namespace\n"));

		return newcode.toString();
	}



//=======================================================================
/**
 *	Add the read properties method if does not exist.
 *
 *	@param	readcode	read source code.
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	private String addReadPropMethod(PogoString readcode)
							throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		//	If no properties then do nothing
		//-----------------------------------------
		if (properties.size()==0)
			return readcode.str;

		//	Get the template method
		//----------------------------
		String	templatefile = new String(pogo.templates_dir +
											"/cpp/readPropMethodName.cpp");
		PogoString method = new PogoString(
			PogoUtil.readFile(templatefile, templateClass, pogo.class_name));

		//	Extract method code
		//-----------------------------------------------------------
		while (method.str.indexOf("target")>=0)
			method.replace("target", "device");
		String template_method = new String(method.str);

		//	search it
		//----------------------------
		int	start, end;
		if ((start=readcode.str.indexOf(readprop_method_signature))<0)
		{
			//	 init_device method.
			//--------------------------------------
			if ((start=readcode.str.indexOf(init_signature))<0)
				throw new PogoException("Syntax error in existing Source file",
								new String(init_signature + " not found "));
			start = readcode.inMethod(start);
			start = readcode.outMethod(start) + 1;

			//	If does not already exists -> add tenplate
			//------------------------------------------------
			readcode.insert(start, template_method);
		}
		int start0 = start;

		//	Search the automatic generation part
		//-------------------------------------------
		String	pattern = "Automatic code generation";
		if ((start=readcode.str.indexOf(pattern, start))<=0)
				throw new PogoException("Syntax error in existing Source file",
						"\"" + pattern + "\"  Not Found");
		start = readcode.nextCr(start) + 1;
		start = readcode.nextCr(start) + 1;

		if ((end=readcode.str.indexOf(pattern, start))<0)
				throw new PogoException("Syntax error in existing Source file",
						"\"" + pattern + "\"  Not Found");
		end = readcode.previousCr(end) - 1;

		String	oldCode = readcode.str.substring(start, end);

		//	Prepeare the new readcode
		//-------------------------------
		StringBuffer	sb = new StringBuffer(
			"\tif (Tango::Util::instance()->_UseDb==false)\n"+
			"\t\treturn;\n" +
			"\tTango::DbData	dev_prop;\n");

		//	Declare DbData and fill it
		//---------------------------------------------
		for (int i=0 ; i<properties.size() ; i++)
		{
			Property	property = properties.propertyAt(i);
			sb.append("\tdev_prop.push_back(Tango::DbDatum(\"" + property.name + "\"));\n");
		}

		sb.append("\n");
		sb.append("\t//	Call database and extract values\n");
		sb.append("\t//--------------------------------------------\n");
		sb.append("\tget_db_device()->get_property(dev_prop);\n");
		sb.append("\t" + classname + "Class	*ds_class =\n");
		sb.append("\t\t(static_cast<" + classname + "Class *>(get_device_class()));\n");
		sb.append("\tint	i = -1;\n");

		//	Extract property values
		//---------------------------------
		for (int i=0 ; i<properties.size() ; i++)
		{
			Property	property = properties.propertyAt(i);
			sb.append("\t//	Extract " + property + " value\n");
			sb.append("\tif (dev_prop[++i].is_empty()==false)");
			sb.append("\tdev_prop[i]  >>  " + property.getVarName() + ";\n");
			sb.append("\telse\n");
			sb.append("\t{\n");
			sb.append("\t	//	Try to get value from class property\n");
			sb.append("\t	Tango::DbDatum	cl_prop = ds_class->get_class_property(dev_prop[i].name);\n");
			sb.append("\t	if (cl_prop.is_empty()==false)	cl_prop  >>  " + property.getVarName()  +";\n");
			sb.append("\t}\n\n");
		}
		sb.append("\n");

		//	Insert new Code source
		//-------------------------------------------
		readcode.replace(start, oldCode, sb.toString());

		//	Add method cal
		//------------------------------
		addReadPropMethodCall(readcode);
		return readcode.str;
	}
//=======================================================================
/**
 *	Search init_device method and 
 *	add the read properties method call if does not exist.
 *
 *	@param	readcode	read source code.
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	private void addReadPropMethodCall(PogoString readcode)
						throws PogoException
	{
		//	Extract the init_device method.
		//--------------------------------------
		int	start, end;
		if ((start=readcode.str.indexOf(init_signature))<0)
			throw new PogoException("Syntax error in existing Source file");
		
		start = readcode.inMethod(start);
		end   = readcode.outMethod(start);
		String	meth_core = readcode.str.substring(start, end);
		
		//	Check if method call alredy exists
		//---------------------------------------
		if (meth_core.indexOf(readprop_method_name)>=0)
			return;

		//	Else search the good place to insert.
		//--------------------------------------------
		start = readcode.str.indexOf("Initialise variables to default values", start);
		start = readcode.nextCr(start) + 1;
		start = readcode.nextCr(start) + 1;
		readcode.insert(start, new String("\t"+readprop_method_name+"();\n"));
	}

}
