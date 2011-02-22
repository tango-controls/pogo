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
// Revision 3.6  2005/11/24 08:29:16  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.5  2005/01/28 12:43:53  pascal_verdier
// Bug with spaces/tab fixed.
//
// Revision 3.4  2004/11/29 09:49:20  pascal_verdier
// if device property not found in database, it takes class property value if exists in java.
//
// Revision 3.3  2004/11/22 15:29:31  pascal_verdier
// Javadoc tags correction.
//
// Revision 3.2  2004/09/07 12:00:51  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.1  2004/08/26 07:15:18  pascal_verdier
// Attributes are now generated as class.
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
//
// copyleft 1999 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;

import fr.esrf.TangoDs.TangoConst;

import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *	This class generates Cpp source file for ServerClass files.
 *
 * @author	$Author$
 * @version	$Revision$
 */
public class JavaServerClass extends PogoGene implements PogoDefs, TangoConst
{
	private PropertyTable	properties;

	//================================================================
	/**
	 *	Constructor
	 */
	//================================================================
	public JavaServerClass(PogoClass pogo)
	{
		super(pogo);
		properties = pogo.class_properties;
	}



	//================================================================
	/**
	 *	Generate the Java ServerClass.java file.
	 */
	//================================================================
	public void generateSource(String serverclass)
							throws	FileNotFoundException,
									SecurityException,
									IOException,
									PogoException
	{
		System.out.println("Generating " + serverclass + "....");

		//	Read Template file
		//----------------------------
		String templname = pogo.templates_dir + "/java/" +
								templateFile + "Class.java";
		PogoString	templcode = new PogoString(PogoUtil.readFile(templname));
		templcode = PogoUtil.removeLogMessages(templcode);

		//	Replace template pattern
		//---------------------------------------
		while (templcode.str.indexOf(templateClass)>=0)
			templcode.replace(templateClass, pogo.class_name);

		String	factories;
		String	get_property;
		String	put_property;
		String	class_constructor=null;
		if (already_exists(serverclass))
		{
			//	Read existing file
			//----------------------------
			PogoString	code = new PogoString(PogoUtil.readFile(serverclass));
			
			//	Get the class constructor and 
			//	the get_property method if exist
			//------------------------------------------
			class_constructor = getClassConstructor(code);
			get_property      = getGetPropertyMethod(code);
		}
		else
		{
			get_property = getGetPropertyMethod(null);
		}

		//	Build factories
		//-------------------------------------
		factories = buildFactories(templcode);
		if (class_constructor!=null)
		{
			//	replace constructor by the saved one.
			PogoString	tmp = new PogoString(factories);
			String	s = getClassConstructor(tmp);
			tmp.replace(s, class_constructor);
			factories = tmp.str;
		}

		//	Manage properties
		//-------------------------------------
        String  classname = "";
		get_property = properties.updateJavaMethod(get_property, "class", classname);

		//	if method exists add a call in class constructor
		//-----------------------------------------------------
		factories = addPutGetPropertyCall(factories, "get");
		factories = properties.addJavaDataMembers(factories);
		factories = addPutGetPropertyCall(factories, "write");
		put_property = buildPutPropertyMethod();

		//	Check if DbDatum array has been declared (from old verdsion)
		String	newcode = checkForDbDatumArray(factories +
						get_property + "\n" + put_property + "\n}\n");

		//	And write file
		//----------------------------------------
		PogoUtil.writeFile(serverclass, newcode);
	}
//=======================================================================
/**
 * Check if DbDatum array has been declared (from old verdsion)
 *
 *	@param	strcode		existing code.
 */
//=======================================================================
	private String checkForDbDatumArray(String strcode)
							throws	FileNotFoundException,
									SecurityException,
									IOException
	{
		PogoString	code = new PogoString(strcode);
		//	Check if DbDatum array has been declared (from old verdsion)
		String	declare = "	/**\n"+
						"	 *	Class properties array.\n"+
						"	 */\n"+
						"	private DbDatum[]	cl_prop = null;\n\n";
		int	start, end;
		if (code.str.indexOf(declare)<0)
		{
			if ((start=code.str.indexOf(
				"	//--------- Start of properties data members ----------"))>0)
				code.insert(start, declare);
		}
		/**
		 *	Check for get_class_property(String name) method
		 */
		if (code.str.indexOf("public DbDatum get_class_property(String name)")<0)
		{
			//	get from template (only first part)
			String templname = pogo.templates_dir +
							"/java/readPropMethodName.java";
			String	templcode = PogoUtil.readFile(templname);
			end = templcode.indexOf("public void get_target_property() throws DevFailed");
			end = templcode.lastIndexOf("//", end);
			end = templcode.lastIndexOf("//", end-1);
			String	method = templcode.substring(0, end);

			//	Search where insert
			start = code.str.indexOf("public void get_class_property() throws DevFailed");
			start = code.str.lastIndexOf("//", start);
			start = code.str.lastIndexOf("//", start-1);
			code.insert(start, method);
		}

		return code.str;
	}
//=======================================================================
/**
 *	Add a call to get_class_property or put_class_property in class constructor
 *
 *	@param	readcode		existing code read.
 *	@param	putget			get_class_property or put_class_property
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String addPutGetPropertyCall(String readcode, String putget) throws PogoException
	{
		String	method_call = putget + "_class_property();";
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
		if ((start=method_core.str.indexOf("Util.out2.println"))<0)
			return readcode;
		start = method_core.nextCr(start)+1;
		method_core.insert(start, "\t\t" + method_call + "\n");
		
		PogoString newcode = new PogoString(readcode);
		newcode.replace(s, method_core.str);
		return newcode.str;
	}
//==============================================================
/**
 *	Build the factories to be added in serverClass.java.
 */
//==============================================================
	protected String buildFactories(PogoString templcode) throws PogoException
	{
		//	Get the command factory method to check/modify.
		//---------------------------------------------------
		StringBuffer	sb  = new StringBuffer();
		int	start=0, end;

		//	Command Factory
		//---------------------------------------------------
		if ((end=templcode.str.indexOf("command_factory"))<0)
			throw new PogoException("command_factory() method not found !");
		end = templcode.inMethod(end);
		sb.append(templcode.str.substring(start, end));
		sb.append(pogo.commands.buildCommandFactoryMethod(javaLang));

		start = templcode.outMethod(end+1);
		start = templcode.nextCr(start);

		//	Get the device factory method
		//---------------------------------------------------
		if ((end=templcode.str.indexOf("device_factory"))<0)
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
				"\n//=============================================================================\n");
			sb.append(
				"//\n//	Method:	attribute_factory(Vector att_list)\n//\n");
			sb.append(
				"//=============================================================================\n");
			sb.append(
				"	public void attribute_factory(Vector att_list) throws DevFailed\n");
			sb.append(pogo.attributes.buildFactory(javaLang));
		}
		return sb.toString();
	}
//===============================================================
/**
 *	Get code from begining to the class constructor method core.
 *
 *	@param	readcode	The read source code.
 *	@return the modified code for is_allowed method.
*	@throws	PogoException	If a synthax error occured on input file
 */
//===============================================================
	protected String getClassConstructor(PogoString readcode)
							throws	PogoException
	{
		int end;
		String constr_sign = "protected " + pogo.class_name +
							"Class(String name) throws DevFailed";

		if ((end=readcode.str.indexOf(constr_sign))<0)
			throw new PogoException("Input File Syntax error !\n" +
										constr_sign + "\n Not found !");
		end = readcode.inMethod(end+1);
		end = readcode.outMethod(end);

		return readcode.str.substring(0, end);
	}

//===============================================================
/**
 *	Get the get_class_property() method core.
 *
 *	@param	readcode	The read source code.
 *	@return the modified code for is_allowed method.
 */
//===============================================================
	protected String getGetPropertyMethod(PogoString readcode)
							throws	FileNotFoundException,
										SecurityException,
										IOException
	{
		String	get_property_signature = "public void get_class_property()";
		int	start, end;
		if (readcode==null ||
			(start=readcode.str.indexOf(get_property_signature))<0)
		{
		
			//	No input code or method not found
			//		-> Return template
			//----------------------------------------
			String templname = pogo.templates_dir + "/java/" +
									"readPropMethodName.java";
			PogoString templcode = new PogoString(PogoUtil.readFile(templname));
			templcode = PogoUtil.removeLogMessages(templcode);

			//	Replace template pattern
			//---------------------------------------
			while (templcode.str.indexOf(templateClass)>=0)
				templcode.replace(templateClass, pogo.class_name+"Class");
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
 *	Write the write_property methode core
 */
//===============================================================
	protected String buildPutPropertyMethod() throws FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		String templname = pogo.templates_dir +
								"/java/write_property.java";
		PogoString readcode = new PogoString(PogoUtil.readFile(templname));
		readcode = PogoUtil.removeLogMessages(readcode);

		//	Replace template pattern
		//---------------------------------------
		while (readcode.str.indexOf(templateClass)>=0)
			readcode.replace(templateClass, pogo.class_name);
		//	Add Project title
		String	tag = "PogoProjectTitle";
		String	pattern = "\"" + pogo.title + "\"";
		while (readcode.str.indexOf(tag)>=0)
			readcode.replace(tag, pattern);
		tag = "PogoClassDescription";
		
		//	Add Class Description
		//	replace a true "\n' for all Cr
		PogoString	desc = new PogoString(pogo.class_desc);
		pattern = "\\n";
		while (desc.str.indexOf("\n")>=0)
			desc.replace("\n", pattern);

		//	Check description length 
		String	tmp = desc.str;
		if (tmp.length()>255)
			tmp = tmp.substring(0, 255);
		pattern = "\"" + tmp + "\"";
		while (readcode.str.indexOf(tag)>=0)
			readcode.replace(tag, pattern);
		return readcode.str;
	}

}
