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
// Copyright 1999 by European Synchrotron Radiation Facility, Grenoble, France
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
	//================================================================
	/**
	 *	Constructor
	 */
	//================================================================
	public CppServer(PogoClass pogo)
	{
		super(pogo);
		server =
			new String(pogo.output_files + "/" + pogo.class_name + "Class.cpp");
		properties = pogo.dev_properties;
		//	Build the init_device and get property method signatures
		//------------------------------------------------------------
		init_signature = new String("void " +
								pogo.class_name + "::" + "init_device");

		readprop_method_signature = new String("void " + pogo.class_name +
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
			Property	property = properties.elementAt(i);
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
		int		start, end;
		if ((start=readcode.str.indexOf("public Tango::Device_2Impl"))<0)
			throw new PogoException("Input File Syntax error !",
								"\"public Tango::Device_2Impl\" NOT FOUND");

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
			Attrib	attr = pogo.attributes.elementAt(i);
			newcode.append(attr.cppMemberData());
		}

		//	search place to write protypes
		//----------------------------------------------
		start = readcode.str.indexOf("//@}", end);
		if ((end=readcode.str.indexOf("always_executed_hook"))<0)
		{
			throw new PogoException("Input File Syntax error !",
					"\"always_executed_hook\" NOT FOUND");
		}
		end = readcode.str.indexOf("\n", end)+1;
		newcode.append(readcode.str.substring(start, end));
		newcode.append("\n//@}\n\n");
		newcode.append("/**\n * @name " + pogo.class_name
								+ " methods prototypes\n */\n\n//@{\n");

		//	Write prototypes for attributes if any
		//----------------------------------------
		if (pogo.attributes.size()>0)
		{
			newcode.append(readAttrProto2);
			newcode.append(readAttrProto3);
			boolean	writable = false;
			for (int i=0 ; i<pogo.attributes.size() ; i++)
			{
				Attrib	attr = pogo.attributes.elementAt(i);
				if (attr.getWritable())
					writable = true;
			}
			if (writable)
				newcode.append(writeAttrProto);
		}

		//	Write prototypes for commands
		//	Don't forget to skip dummy status Cmds.
		//--------------------------------------------
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdIdx(i);
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
	 *	Generate the C++ ServerClass.h file.
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
		String filename;
		if (already_exists(server_h))
			filename = server_h;
		else
			filename = new String(pogo.templates_dir + "/cpp/" +
												templateFile + ".h");
		FileInputStream		fidin = new FileInputStream(filename);
		int nb = fidin.available();
		byte[]	inStr  = new byte[nb];
		fidin.read(inStr);
		PogoString readcode = new PogoString(inStr);
		fidin.close();

		if (already_exists(server_h)==false)
		{
			//	Replace template pattern
			//---------------------------------------
			while (readcode.str.indexOf(templateClass.toUpperCase())>=0)
				readcode.replace(templateClass.toUpperCase(), pogo.class_name.toUpperCase());
			//	Replace template pattern
			//---------------------------------------
			while (readcode.str.indexOf(templateClass)>=0)
				readcode.replace(templateClass, pogo.class_name);
		}
		else
		{
		/*
		*/
			//	Check IDL version DeviceImpl -> Device_2Impl
			while (readcode.str.indexOf("DeviceImpl")>=0)
			{
				System.out.println("Replacing DeviceImpl by Device_2Impl");
				readcode.replace("DeviceImpl", "Device_2Impl");
			}
		}

		//	Add prototypes.and property
		//----------------------------------------
		String newcode = addPrototypes(readcode);
		newcode = addPropertyDataMembers(new PogoString(newcode));

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
		FileInputStream		fidin = new FileInputStream(filename);
		int nb = fidin.available();
		byte[]	inStr  = new byte[nb];
		fidin.read(inStr);
		PogoString readcode = new PogoString(inStr);
		fidin.close();

		//	Replace template pattern
		//---------------------------------------
		if (src_exist==false)
		{
			while (readcode.str.indexOf(templateClass)>=0)
				readcode.replace(templateClass, pogo.class_name);
		}
		else
		{
			//	Check IDL version DeviceImpl -> Device_2Impl
			while (readcode.str.indexOf("DeviceImpl(cl")>=0)
			{
				System.out.println("Replacing DeviceImpl by Device_2Impl");
				readcode.replace("DeviceImpl(cl", "Device_2Impl(cl");
			}
		}

		
		//	Add the methods where commands are really executed
		//--------------------------------------------------------
		String	newcode = addMethodsToExecuteCmd(readcode.str);
		if (src_exist)
			newcode = checkForExecMethodModif(new PogoString(newcode), cppLang);
		if (pogo.attributes.size()>0)
			newcode = buildAttributesMethods(new PogoString(newcode), cppLang);

		if (properties.size()>0)
			newcode = addReadPropMethod(new PogoString(newcode));

		//	Open and write file
		//----------------------------------------
		FileOutputStream	fidout = new FileOutputStream(server);
		fidout.write(newcode.getBytes());
		fidout.close();		
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

		//	Add description for commands/method table
		//----------------------------------------
		int		start = 0, end;
		if ((end=readcode.indexOf("//==========================", start))<0)
				throw new PogoException("Input File Syntax error !");
		while (readcode.charAt(end)!='\n')
			end++;
		end++;
		newcode.append(readcode.substring(start, end));
		newcode.append(addCommentsCmdMethod());

		//	Get starting code 
		if ((start=readcode.indexOf("#include", start))<0)
			throw new PogoException("Input File Syntax error !");
		//	get end of previous comment
		start = readcode.lastIndexOf("//", start);
		start = readcode.indexOf("\n", start) + 1;

		//	Check if 'namespace classname' exists
		//-----------------------------------------------
		boolean	namespace_exist;
		String	namespace = new String("namespace " + pogo.class_name);
		if (readcode.indexOf(namespace)<0)
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
			Cmd		cmd = pogo.commands.cmdIdx(i);

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
				else
					System.out.println("	" + cmd.exec_method +
									"() already exists  --> Do not overwrite");
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
		FileInputStream		fidin = new FileInputStream(templatefile);
		int nb = fidin.available();
		byte[]	inStr  = new byte[nb];
		fidin.read(inStr);
		PogoString method = new PogoString(inStr);
		fidin.close();

		//	Extract method code
		//-----------------------------------------------------------
		while (method.str.indexOf(templateClass)>=0)
			method.replace(templateClass, pogo.class_name);
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
		if ((start=readcode.str.indexOf("Automatic code generation", start))<=0)
				throw new PogoException("Syntax error in existing Source file",
						"\"Automatic readcode generation\"  Not Found");
		start = readcode.nextCr(start) + 1;
		start = readcode.nextCr(start) + 1;

		if ((end=readcode.str.indexOf("Automatic code generation", start))<0)
				throw new PogoException("Syntax error in existing Source file",
						"\"Automatic readcode generation\"  Not Found");
		end = readcode.previousCr(end) - 1;

		String	oldCode = readcode.str.substring(start, end);

		//	Prepeare the new readcode
		//-------------------------------
		StringBuffer	sb = new StringBuffer("\tTango::DbData	data;\n");

		//	Declare DbData and fill it
		//---------------------------------------------
		for (int i=0 ; i<properties.size() ; i++)
		{
			Property	property = properties.elementAt(i);
			sb.append("\tdata.push_back(Tango::DbDatum(\"" + property.name + "\"));\n");
		}

		sb.append("\n");
		sb.append("\t//	Call database and extract values\n");
		sb.append("\t//--------------------------------------------\n");
		sb.append("\tget_db_device()->get_property(data);\n");

		//	Extract property values
		//---------------------------------
		for (int i=0 ; i<properties.size() ; i++)
		{
			Property	property = properties.elementAt(i);
			sb.append("\tif (data[" + i + "].is_empty()==false)");
			sb.append("\tdata[" + i + "]  >>  " +
								property.getVarName() + ";\n");
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
