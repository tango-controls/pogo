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
// Revision 3.7  2005/02/02 08:05:35  pascal_verdier
// Bug with confusion between Spectrum attribute and class called Spectrum fixed.
//
// Revision 3.6  2004/11/22 11:07:46  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.5  2004/09/24 11:21:24  pascal_verdier
// Spectrum and Image attributes are now writable.
//
// Revision 3.4  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.3  2004/09/02 06:41:34  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
//
// Revision 3.2  2004/08/26 07:09:23  pascal_verdier
// Attributes are now generated as class.
//
// Revision 3.1  2003/09/10 08:11:30  pascal_verdier
// Minor bugs fixed.
// HTML doc generated with more details.
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
//
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;


import java.util.*;
import java.io.*;
import fr.esrf.Tango.*;
import fr.esrf.TangoDs.*;


//-======================================================================
/**
 * This class defines an attribute for device server code.
 *
 * @author	$Author$
 * @version	$Revision$
 */
//-======================================================================

public class Attrib implements PogoDefs
{
	/**
	 *	Attribute's name.
	 */
	 public String	name;
	/**
	 *	Attribute Type.
	 */
	 public int	attrType;
	/**
	 *	Attribute data dataType.
	 */
	 public TangoTypes	dataType;
	/**
	 *	Read/Write type.
	 */
	 public int	rwType;
	/**
	 *	Associated attribute if Read/Write type is READ_WITH_WRITE.
	 */
	 public String assAttr;
	/**
	 *	Maximum X legh data size.
	 */
	 public int xSize;
	/**
	 *	Maximum Y legh data size.
	 */
	 public int ySize;
	/**
	 *	</i>DevState </i> list which for the command is NOT allowed.
	 */
	public DevStateTable	notAllowedFor;
	/**
	 *	Display level (OPERATOR or EXPERT)
	 */
	public DispLevel	disp_level = DispLevel.OPERATOR;
	/**
	 *	polled period (not polled if 0)
	 */
	public int	polled_period = 0;
	/**
	 *	Attribute (Scalar) memorized or not.
	 */
	public boolean	memorized = false;
	/**
	 *	Attribute default properties
	 */
	 public String[]	properties;

	/**
	 *	Method names to set attribute default properties.
	 */
	 private String[]	def_prop_method = {
		"set_label",
		"set_unit",
		"set_standard_unit",
		"set_display_unit",
		"set_format",
		"set_max_value",
		"set_min_value",
		"set_max_alarm",
		"set_min_alarm",
		"set_description"
	};
	
	private String	set_def_prop_method	 = "set_default_properties";
//======================================================================
/**
 *	Constructor for attribute.
 *
 *	@param	name		Attribute's name.
 *	@param	readcode	Code read from header file (only for device impl 3 and above)
 */
//======================================================================
	public Attrib(String name, String readcode)
				throws	PogoException
	{
		this.name = name;
		PogoString	code = new PogoString(readcode);
		//	Get the class definition in header code
		int	start = code.indexOf("class " + name + "Attr:");
		if (start<0)
		{
			start = code.indexOf("class " + name + "Attrib:");
			if (start<0)
				throw new PogoException("Attribute class not defined in header file !");
		}
		start = code.inMethod(start);
		int	end = code.outMethod(start);
		PogoString	class_def = new PogoString(code.substring(start, end));
		
		//	Analyse Attribute constructor
		end = class_def.indexOf(") {}");
		start = class_def.lastIndexOf("(", end) + 1;
		PogoString	constructor = new PogoString(class_def.substring(start, end));
		String[]	params = constructor.getFields();

		//	Get constructor signature
		end = start;
		start = class_def.lastIndexOf("public:", end) + "public:".length();
		String		constr_signature =class_def.substring(start, end).trim();
		//	Serach attribute type
		if (constr_signature.indexOf(":ImageAttr")>0)
			attrType = ATTR_IMAGE;
		else
		if (constr_signature.indexOf(":SpectrumAttr")>0)
			attrType = ATTR_SPECTRUM;
		else
			attrType = ATTR_SCALAR;

		//	Get Attribute data type
		//---------------------------------
		int	idx = 1;	//	first param to be used
		dataType = new TangoTypes(params[idx++]);

		/***
		for (int i=0 ; i<params.length ; i++)
			System.out.println("	" + params[i]);
		System.out.println("data type: " + dataType);
		System.out.println("constr_signature = " + constr_signature);
		System.out.println("attrType = " + attrType);
		System.out.println();
		/****/


		//	Read/Write type
		rwType=ATTR_READ;
		for (int i=0 ; i<AttrRWtypeArray.length ; i++)
		{
			String	target = PogoDefs.cppNameSpace+AttrRWtypeArray[i];
			if (params[idx].equals(target))
				rwType = i;
		}
		idx++;
		//	Other params depends on attribute type
		switch(attrType)
		{
		case ATTR_SCALAR:
			if (rwType==ATTR_READ_WITH_WRITE)
				assAttr =params[idx++];
			break;
		case ATTR_SPECTRUM:
			xSize = (new Integer(params[idx++])).intValue();
			break;
		case ATTR_IMAGE:
			xSize = (new Integer(params[idx++])).intValue();
			ySize = (new Integer(params[idx++])).intValue();
			break;
		}
		properties    = new String[PogoDefs.AttrPropDescription+1];
		notAllowedFor = new DevStateTable();
	}

//======================================================================
/**
 *	Attribute Constructor for SCALAR type.
 *
 *	@param	name		Attribute's name.
 *	@param	attrType	Attribut's type.
 *	@param	dataType	Attribute's dataType.
 *	@param	rwType		Read/Write type.
 *	@param	assAttr		Associated attribute (only if writable==READ_WITH_WRITE)
 */
//======================================================================
 	public Attrib(String name, int attrType, String dataType, int rwType, String assAttr)
	{
		this(name, attrType, dataType, 1, 1);
		this.rwType   = rwType;
		this.assAttr  = assAttr;
	}
//======================================================================
/**
 *	Attribute Constructor for SPECTRUM type.
 *
 *	@param	name		Attribute's name.
 *	@param	attrType	Attribut's type.
 *	@param	dataType	Attribute's dataType.
 *	@param	rwType		Read/Write type.
 *	@param	xSize		maximum X length size.
 */
//======================================================================
 	public Attrib(String name, int attrType, String dataType, int rwType, int xSize)
	{
		this(name, attrType, dataType, rwType, xSize, 1);
	}
//======================================================================
/**
 *	Attribute Constructor for IMAGE type.
 *
 *	@param	name		Attribute's name.
 *	@param	attrType	Attribut's type.
 *	@param	dataType	Attribute's dataType.
 *	@param	rwType		Read/Write type.
 *	@param	xSize		maximum X length size.
 *	@param	ySize		maximum Y length size.
 */
//======================================================================
 	public Attrib(String name, int attrType, String dataType, int rwType, int xSize, int ySize)
	{
		this.name     = name;
		this.attrType = attrType;
		this.dataType = new TangoTypes(dataType, "");
		this.rwType   = rwType;
		this.xSize    = xSize;
		this.ySize    = ySize;
		this.assAttr  = "";
		properties    = new String[PogoDefs.AttrPropDescription+1];
		notAllowedFor = new DevStateTable();
	}
//======================================================================
/**
 *	Set the dataType field.
 *
 *	@param	dataType	Tango dataType name.
 */
//======================================================================
	public void setDataType(String dataType)
	{
		this.dataType = new TangoTypes(dataType, "");
	}
//======================================================================
/**
 *	Set the dataType field.
 *
 *	@param	dataType	Language dataType name.
 *	@param	lang	Language used.
 */
//======================================================================
	public void setDataType(String dataType, int lang)
	{
		this.dataType = new TangoTypes(dataType);
	}
//======================================================================
/**
 *	reaturn the writable state.
 */
//======================================================================
	public boolean getWritable()
	{
		//return (attrType==ATTR_SCALAR && rwType!=ATTR_READ &&
		//			rwType!=ATTR_READ_WITH_WRITE);
		return (rwType!=ATTR_READ && rwType!=ATTR_READ_WITH_WRITE);
	}
//======================================================================
/**
 *	Built C++ member data line for ClassName.h file.
 *
 *	@return String line.
 */
//======================================================================
	public String cppMemberData()
	{
		StringBuffer	sb = new StringBuffer();
		
		//	read part
		if (rwType!=ATTR_WRITE)
			sb.append("\t\t" + dataType.cpp + "\t*attr_" + name + "_read;\n");
		//	Write part
		if (getWritable())
			sb.append("\t\t" + dataType.cpp + "	attr_" + name + "_write;\n");
		return sb.toString();
	}
//======================================================================
/**
 *	Built java member data line for ClassName.java file.
 *
 *	@return String line.
 */
//======================================================================
	public String javaMemberData()
	{
		StringBuffer	sb = new StringBuffer();
		
		//	Read part
		if (rwType!=ATTR_WRITE)
		{
			sb.append("\tprotected " + dataType.java + "[]\tattr_" + name + "_read " + "= new " + dataType.java);
			switch (attrType)
			{
			case ATTR_SCALAR:
				sb.append("[1];\n");
				break;
			case ATTR_SPECTRUM:
				sb.append("[" + xSize + "];\n");
				break;
			case ATTR_IMAGE:
				sb.append("[" + (xSize*ySize) + "];\n");
				break;
			}
		}
		//	Write part
		if (attrType==ATTR_SCALAR && rwType!=ATTR_READ &&
					rwType!=ATTR_READ_WITH_WRITE)
			sb.append("\tprotected " + dataType.java + "	attr_" + name + "_write;\n");
		return sb.toString();
	}
//======================================================================
/**
 *	Generate code for attribute constructor in attribute_factory method.
 */
//======================================================================
	public String buildCodeForAttributeConstructor(int lang)
	{
		if (lang==cppLang)
		{
				//	Has been mofified for Device_3Impl
			return "\t" + name + "Attrib	*" + getLowerName() +
						 " = new " + name + "Attrib();\n";
					
		}
		else
		{
		String[]	att_type = { "Attr", "SpectrumAttr", "ImageAttr"};
		String		namespace = (lang==javaLang)? "" : cppNameSpace;
		String		tab = (lang==javaLang)? "\t" : "";
		String		pointer = (lang==javaLang)? "":"*";
		String		argtype = (lang==javaLang)? 
								dataType.java_code_str : dataType.cpp_code_str;
		//	Create the pointer object
		//----------------------------------
		StringBuffer	sb = new StringBuffer("\t" + tab + namespace);
		sb.append(att_type[attrType] + "\t" + pointer + getLowerName() +" = \n");

		//	Add constructor call
		sb.append(tab + "\t\t" + "new " + namespace + att_type[attrType] + "(");

		//	add parameters (depends on type)
		sb.append(	"\"" + name + "\", " + argtype + ", ");
		switch(attrType)
		{
		case ATTR_SCALAR:
			if (lang==javaLang)
				namespace = "AttrWriteType.";
			sb.append(namespace + AttrRWtypeArray[rwType]);

			if (rwType==ATTR_READ_WITH_WRITE)
				sb.append(", \"" + assAttr +"\"");
			break;

		case ATTR_SPECTRUM:
			sb.append(xSize);
			break;

		case ATTR_IMAGE:
			sb.append(xSize + ", " + ySize);
			break;
		}
		sb.append(");\n");
		return sb.toString();
		}
	}

//======================================================================
/**
 *	Generate code for default properties in attribute_factory method.
 */
//======================================================================
	public String buitCodeForDefaultProperties(int lang)
	{
		String			tab = (lang==javaLang)? "\t" : "";
		//	Search if at leas one property has been set
		//---------------------------------------------------------
		boolean	has_been_set = false;
		for (int i=0 ; i<properties.length ; i++)
			if (properties[i]!=null && properties[i].length()>0)
				has_been_set = true;

		StringBuffer	sb = new StringBuffer("");
		String			pointer = (lang==javaLang)? ".":"->";
		if (has_been_set)
		{
			String	namespace = (lang==javaLang)? "" : cppNameSpace;
			sb.append(tab + "\t" + 	namespace + "UserDefaultAttrProp	" +
								getLowerName() + "_prop");

			//	if java, add a constructor call
			if (lang==javaLang)
				sb.append(" = new UserDefaultAttrProp()");
			sb.append(";\n");

			//	for each property write code if value not null
			for (int i=0 ; i<def_prop_method.length ; i++)
				if (properties[i]!=null && properties[i].length()>0)
				{
					sb.append(tab + "\t" + getLowerName() + "_prop."+
						def_prop_method[i] + "(\"" + properties[i] + "\");\n");
				}

			//	and code to set these properties

			sb.append(tab + "\t" + 	getLowerName() + pointer + 
									set_def_prop_method + "(" +
									getLowerName() + "_prop);\n");
		}
		
		//	Add polling period and display level
		if (polled_period>0)
			sb.append(tab + "\t" + 	getLowerName() + pointer + 
								"set_polling_period(" + polled_period + ");\n");
		if (disp_level==DispLevel.EXPERT)
		{
			String	namespace = (lang==javaLang)? "DispLevel.":"Tango::";
			sb.append(tab + "\t" + 	getLowerName() + pointer +
								"set_disp_level(" + namespace + "EXPERT);\n");
		}
		if (memorized)
			sb.append(tab + "\t" + 	getLowerName() + pointer + "set_memorized();\n");

		return sb.toString();
	}
//======================================================================
/**
 *	Get the default properties value for block code.
 */
//======================================================================
	public void getDefaultProperties(PogoString pgs, int lang)
	{
		String		prop_def = new String(getLowerName() + "_prop.");
		int			start = 0;
		int			end   = 0;
		String		method;
		PogoString	block;

		//	Search start definition
		String	pattern = "//	Attribute : ";
		if ((start=pgs.str.indexOf(pattern + name))<0)
			return;
		//	search end of definition
		if ((end=pgs.str.indexOf(pattern, start+1))>0)
			block = new PogoString(pgs.str.substring(start, end));
		else
			block = new PogoString(pgs.str.substring(start));

		//	Search for each property
		end = 0;
		while ((start=block.str.indexOf(prop_def, end))>0)
		{
			end = block.nextCr(start);
			
			//	Search property name
			int start1 = start + prop_def.length();
			int	end1   = block.str.indexOf("(", start1);
			method = block.str.substring(start1, end1);
			
			//	Search propety value
			start1 = block.str.indexOf("\"", end1)+1;
			end1   = block.str.indexOf("\"", start1);
			String	value = block.str.substring(start1 , end1);

			//	Compeare method's name and fill properties array
			//------------------------------------------------------
			for (int i=0 ; i<def_prop_method.length ; i++)
				if (method.equals(def_prop_method[i]))
					properties[i] = value;
		}
//		for (int i=0 ; i<properties.length ; i++)
//			System.out.println(i + ":	" + properties[i]);

		//	Search for polled period.
		String	code = block.str;
		String	pointer = (lang==javaLang)? ".":"->";
		method = getLowerName() + pointer + "set_polling_period(";
		if ((start=code.indexOf(method))>0)
		{
			start += method.length();
			polled_period = Integer.parseInt(code.substring(start,
											code.indexOf(")", start)));
		}

		//	Search for display level
		method = getLowerName() + pointer + "set_disp_level(";
		if ((start=code.indexOf(method))>0)
		{
			start += method.length();
			String	strlevel = code.substring(start, code.indexOf(")", start));
			if (strlevel.indexOf("EXPERT")>0)
				disp_level = DispLevel.EXPERT;
			else
				disp_level = DispLevel.OPERATOR;
		}

		//	Search for memorized
		method = getLowerName() + pointer + "set_memorized();";
		if ((start=code.indexOf(method))>0)
			memorized = true;

		//System.out.println(name + " - " + polled_period + "ms");
		//System.out.println("	" + ((disp_level==DispLevel.EXPERT)? "EXPERT" : "OPERATOR"));
	}
//======================================================================
//======================================================================
	String getDescription()
	{
		return properties[def_prop_method.length - 1];
	}
//======================================================================
//======================================================================
	String getDescriptionLine()
	{
		String desc = properties[def_prop_method.length - 1];
		if (desc==null) return desc;
		if (desc.length()==0) return desc;

		//	Replace '\n' char by space
		PogoString line = new PogoString(desc);
		while (line.str.indexOf("\\n")>=0)
			line.replace("\\n", " ");
		return line.str;
	}
//======================================================================
//======================================================================
	String buildCppClassesDefs(String template, String class_name)
	{
		//	Set attribute name
		PogoString	pgs = new PogoString(template);
		while (pgs.indexOf("ATTRIBUTE")>0)
			pgs.replace("ATTRIBUTE", name);
		while (pgs.indexOf("CLASS")>0)
			pgs.replace("CLASS", class_name);

		//	Set Attribute inheritance class
		String	src = ":Attr";
		String	inherite_class = src;
		if (attrType==ATTR_SPECTRUM)
			inherite_class = ":SpectrumAttr";
		else
		if (attrType==ATTR_IMAGE)
			inherite_class = ":ImageAttr";

		pgs.replace(src, inherite_class);	//	Class declaration
		pgs.replace(src, inherite_class);	//	calling constructor

		//	set data type
		pgs.replace("DATA_TYPE", dataType.cpp_code_str);

		//	set read/write type
		pgs.replace("RW_TYPE", "Tango::" + AttrRWtypeArray[rwType]);

		//	Add optionnal params

		//	Add associated attr if any
		if (attrType==ATTR_SCALAR && rwType==ATTR_READ_WITH_WRITE)
		{
			//	Get end of constructor line
			int	start = pgs.indexOf(") {}");
			String	add_param = ", \""+ assAttr + "\"";
			pgs.insert(start, add_param);
		}
		//	Add x size if any
		if (attrType==ATTR_SPECTRUM || attrType==ATTR_IMAGE)
		{
			//	Get end of constructor line
			int	start = pgs.indexOf(") {}");
			String	add_param = ", "+ xSize;
			pgs.insert(start, add_param);
		}
		//	Add y size if any
		if (attrType==ATTR_IMAGE)
		{
			//	Get end of constructor line
			int	start = pgs.indexOf(") {}");
			String	add_param = ", "+ ySize;
			pgs.insert(start, add_param);
		}
		
		
		//	If not writable -> remove write method
		if (getWritable()==false)
		{
			int	 start = pgs.indexOf("	virtual void write");
			int	 end   = pgs.indexOf("	virtual bool is_allowed");

			pgs.remove(pgs.substring(start, end));			
		}
		return pgs.str;
	}
//======================================================================
/**
 *	Read attribute exec method (Device_3impl and above).
 */
//======================================================================
	String readSignatureMethod(String class_name)
	{
		return signature(readAttSigTemplate, class_name, "read_" + name, false);
	}
//======================================================================
/**
 *	Write attribute exec method (Device_3impl and above).
 */
//======================================================================
	String writeSignatureMethod(String class_name)
	{
		return signature(writeAttSigTemplate, class_name, "write_" + name, false);
	}
//======================================================================
/**
 *	is_allowed method for attribut (Device_3impl and above).
 */
//======================================================================
	String allowedSignatureMethod(String class_name)
	{
		return signature(allowedAttSigTemplate,
						class_name, "is_" + name + "_allowed", false);
	}
//======================================================================
/**
 *	Read attribute exec method (Device_3impl and above).
 */
//======================================================================
	String readFullSignatureMethod(String class_name)
	{
		return signature(readAttSigTemplate, class_name, "read_" + name, true);
	}
//======================================================================
/**
 *	Write attribute exec method (Device_3impl and above).
 */
//======================================================================
	String writeFullSignatureMethod(String class_name)
	{
		return signature(writeAttSigTemplate, class_name, "write_" + name, true);
	}
//======================================================================
/**
 *	is_allowed method for attribut (Device_3impl and above).
 */
//======================================================================
	String allowedFullSignatureMethod(String class_name)
	{
		return signature(allowedAttSigTemplate,
						class_name, "is_" + name + "_allowed", true);
	}
//======================================================================
//======================================================================
	private String signature(String template, String cl_name, String method, boolean full)
	{
		PogoString	pgs = new PogoString(template);
		pgs.replace("ATTRIBUTE", name);
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
	String getDevImpl2ReadAttr(PogoString code, String classname)
	{
		String	pattern = "void " + classname + 
							"::read_attr(Tango::Attribute &attr)";
		int	start, end;
		if ((start=code.str.indexOf(pattern))<0)
			return "";
		start = code.inMethod(start);
		end   = code.outMethod(start);
		PogoString	method = new PogoString(code.str.substring(start, end));

		//	Search if block
		pattern = "if (attr_name == \"" + name + "\")";
		if ((start=method.str.indexOf(pattern))<0)
			return "";
		start = method.inMethod(start);
		end   = method.outMethod(start);
		start = method.nextCr(start);
		end   = method.previousCr(end-2);

		PogoString	block = new PogoString(method.str.substring(start, end));
		block.indent(-1);
		return block.str;
	}
//======================================================================
//======================================================================
	String getDevImpl2WriteAttr(PogoString code, String classname)
	{
		String	pattern = "void " + classname + 
							"::write_attr_hardware(vector<long> &attr_list)";
		int	start, end;
		if ((start=code.str.indexOf(pattern))<0)
		{
			System.out.println(pattern + " Not found !");
			return "";
		}
		start = code.inMethod(start);
		end   = code.outMethod(start);
		PogoString	method = new PogoString(code.str.substring(start, end));

		//	Search if block
		pattern = "if (attr_name == \"" + name + "\")";
		if ((start=method.str.indexOf(pattern))<0)
		{
			System.out.println(pattern + " Not found !");
			return "";
		}
		start = method.inMethod(start);
		end   = method.outMethod(start);
		start = method.nextCr(start);
		end   = method.previousCr(end-2);

		PogoString	block = new PogoString(method.str.substring(start, end));
		block.indent(-2);

		//	Attribute att is now attr
		while (block.str.indexOf("att.")>0)
			block.replace("att.", "attr.");
		return block.str;
	}
//======================================================================
//======================================================================
	String allowedCore()
	{
		return notAllowedFor.allowedCore();
	}
//======================================================================
//======================================================================
	public void setMemorized(boolean val)
	{
		System.out.println(name + " -> " + val);
		memorized = val;
	}
//======================================================================
//======================================================================
	public boolean getMemorized()
	{
		return memorized;
	}
//======================================================================
//======================================================================
	public String getLowerName()
	{
		PogoString	pgs = new PogoString(name);
		return pgs.toLowerString();
	}
//======================================================================
//======================================================================
	public String toString()
	{
		return name;
	}	
}
