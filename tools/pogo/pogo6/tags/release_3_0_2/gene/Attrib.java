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
// Copyright 1995 by European Synchrotron Radiation Facility, Grenoble, France
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
 *	Display level (OPERATOR or EXPERT)
 */
public DispLevel	disp_level = DispLevel.OPERATOR;
/**
 *	polled period (not polled if 0)
 */
public int	polled_period = 0;
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
//======================================================================
	public String getLowerName()
	{
		PogoString	pgs = new PogoString(name);
		return pgs.toLowerString();
	}
//======================================================================
/**
 *	Constructor for attribute.
 *
 *	@param	name		Attribute's name.
 *	@param	dataType	Attribute's dataType.
 *	@param	rwType		Read/Write type.
 */
//======================================================================
 	public Attrib(String name, String dataType, int rwType)
	{
		this.name     = new String(name);
		this.dataType = new TangoTypes(dataType, "");
		this.rwType   = rwType;
		properties    = new String[PogoDefs.AttrPropDescription+1];
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
		if (attrType==ATTR_SCALAR)
		{
			this.name     = new String(name);
			this.attrType = attrType;
			this.dataType = new TangoTypes(dataType, "");
			this.rwType   = rwType;
			this.assAttr  = new String(assAttr);
			this.xSize    = 1;
			this.ySize    = 1;
			properties    = new String[PogoDefs.AttrPropDescription+1];
		}
		else
			System.out.println("BAD USAGE OF SCALAR ATTRIBUTE CONSTRUCTOR");
	}
//======================================================================
/**
 *	Attribute Constructor for SPECTRUM type.
 *
 *	@param	name		Attribute's name.
 *	@param	attrType	Attribut's type.
 *	@param	dataType	Attribute's dataType.
 *	@param	xSize		maximum X length size.
 */
//======================================================================
 	public Attrib(String name, int attrType, String dataType, int xSize)
	{
		if (attrType==ATTR_SPECTRUM)
		{
			this.name     = new String(name);
			this.attrType = attrType;
			this.dataType = new TangoTypes(dataType, "");
			this.rwType   = ATTR_READ;
			this.xSize    = xSize;
			this.ySize    = 1;
			this.assAttr  = "";
			properties    = new String[PogoDefs.AttrPropDescription+1];
		}
		else
			System.out.println("BAD USAGE OF SPECTRUM ATTRIBUTE CONSTRUCTOR");
	}
//======================================================================
/**
 *	Attribute Constructor for IMAGE type.
 *
 *	@param	name		Attribute's name.
 *	@param	attrType	Attribut's type.
 *	@param	dataType	Attribute's dataType.
 *	@param	xSize		maximum X length size.
 *	@param	ySize		maximum Y length size.
 */
//======================================================================
 	public Attrib(String name, int attrType, String dataType, int xSize, int ySize)
	{
		if (attrType==ATTR_IMAGE)
		{
			this.name     = new String(name);
			this.attrType = attrType;
			this.dataType = new TangoTypes(dataType, "");
			this.rwType   = ATTR_READ;
			this.xSize    = xSize;
			this.ySize    = ySize;
			this.assAttr  = "";
			properties    = new String[PogoDefs.AttrPropDescription+1];
		}
		else
			System.out.println("BAD USAGE OF IMAGE ATTRIBUTE CONSTRUCTOR");
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
		return (attrType==ATTR_SCALAR && rwType!=ATTR_READ &&
					rwType!=ATTR_READ_WITH_WRITE);
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
		if (attrType==ATTR_SCALAR && rwType!=ATTR_READ &&
					rwType!=ATTR_READ_WITH_WRITE)
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
		if (lang!=javaLang)
		{
		if (polled_period>0)
			sb.append(tab + "\t" + 	getLowerName() + pointer + 
								"set_polling_period(" + polled_period + ");\n");
		if (disp_level==DispLevel.EXPERT)
			sb.append(tab + "\t" + 	getLowerName() + pointer +
								"set_disp_level(Tango::EXPERT);\n");
		}
		return sb.toString();
	}
//======================================================================
/**
 *	Get the default properties value for block code.
 */
//======================================================================
	public void getDefaultProperties(PogoString block)
	{
		String	prop_def = new String(getLowerName() + "_prop.");
		int		start = 0;
		int		end   = 0;
		String	method;

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

		//	Search for display level and polled period.
		
		String	code = block.str;
		method = getLowerName() + "->set_polling_period(";
		if ((start=code.indexOf(method))>0)
		{
			start += method.length();
			polled_period = Integer.parseInt(code.substring(start,
											code.indexOf(")", start)));
		}

		method = getLowerName() + "->set_disp_level(";
		if ((start=code.indexOf(method))>0)
		{
			start += method.length();
			String	strlevel = code.substring(start, code.indexOf(")", start));
			if (strlevel.indexOf("EXPERT")>0)
				disp_level = DispLevel.EXPERT;
			else
				disp_level = DispLevel.OPERATOR;
		}

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
	public String toString()
	{
		return name;
	}	
}
