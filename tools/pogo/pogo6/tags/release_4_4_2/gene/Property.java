//+======================================================================
// $Source$
//
// Project:   Pogo
//
// Description:	Difining a Tango property for Pogo
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.3  2005/09/07 08:19:19  pascal_verdier
// Property Default value managed and set for wizard usage.
//
// Revision 3.2  2004/10/21 06:58:48  pascal_verdier
// Default value management added for properties.
// And minor changes
//
// Revision 3.1  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
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
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;






import java.util.*;

//-======================================================================
/**
 * This class defines a property for server code.
 * This class describe the device property.
 * These <b>Property</b> class are located in a <b>java.util.Vector</b>
 * known as <b>PropTable</b> class.
 * *
 * @author	$Author$
 * @version	$Revision$
 */
//-======================================================================
public class Property implements PogoDefs
{
/**
 *	The name of this property..
 */
	public String	name;
/**
 *	The numeric code of the tango data type..
 */
	public TangoTypes	type;
/**
 *	The description of this property..
 */
	public String	description;
/**
 *	The default value put in database at first startup.
 */
	public String	default_value;

//======================================================================
/**
 * Constructs a newly allocated Property object from all its creation 
 * parameters.
 *
 * @param 	name		The name of the Property.
 * @param 	type_name	The name of the Property.
 * @param 	desc		The Property's description.
 *
 */
//======================================================================
	public Property(String name, String type_name, String desc)
	{
		this.name = new String(name);
		this.type = new TangoTypes(type_name, desc);
		if (desc!=null)
			this.description = desc;
	}
//======================================================================
/**
 * Constructs a newly allocated Property object from all its creation 
 * parameters.
 *
 * @param 	name		The name of the Property.
 * @param 	type_name	The name of the Property.
 * @param 	desc		The Property's description.
 * @param 	def_val		The default value put in database at first startup
 *
 */
//======================================================================
	public Property(String name, String type_name, String desc, String def_val)
	{
		this.name = new String(name);
		this.type = new TangoTypes(type_name);
		if (desc!=null)
			this.description = desc;
		this.default_value = def_val;
	}
//=======================================================================
/**
 *	Build a variable name frome the property name.
 *	It just changes the first char by the lowercase.
 *
 *	@return the variable name built.
 */
//=======================================================================
	public String getVarName()
	{
		StringBuffer	sb = new StringBuffer("");		

		for (int i=0 ; i<name.length() ; i++)
		{
			if (i==0  &&
				name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')//	if upperr case
			{
				//	if First char-> Set it to lower case
				sb.append((char)(name.charAt(i) + ('a'-'A')));
			}
			else
				sb.append(name.charAt(i));
		}
		return sb.toString();
	}
//======================================================================
/**
 * Make property as a String.
 *
 * @return A <i>java.lang.String</i> containing property's name.
 */
//======================================================================
	public String buildDefinition(int lang)
	{
		StringBuffer	sb = new StringBuffer("");
		String			typestr = (lang==cppLang)? type.cpp : type.java;
		String			tab = (lang==cppLang)? "" : "\t";

		//	Tango::DevString not supported
		//--------------------------------------
		if (typestr.equals("Tango::DevString"))
			typestr = "string";

		sb.append(tab + "/**\n" + tab + " *	" + description + "\n" + tab + " */\n");
		sb.append("\t" + typestr + "\t" + getVarName() + ";\n");
		return sb.toString();
	}
//======================================================================
/**
 *	Build code for default value definition
 */
//======================================================================
	String geneDefaultValue(int source)
	{
		String	s1 = (source==classProperty) ? "cl_" : "dev_";
		String	s2 = (source==classProperty) ? "class_" : "dev_";

		//	Replace \n  by a \n displayed char
		PogoString	pgs = new PogoString(description);
		while (pgs.str.indexOf("\n")>0)
			pgs.replace("\n", "\\n");
		
		String	code = "";
		code += "	prop_name = \"" + name + "\";\n";
		code += "	prop_desc = \"" + pgs.str + "\";\n";
		code += "	prop_def  = \"";
		
		if (default_value!=null && default_value.length()>0)
		{
			pgs = new PogoString(default_value);
			while (pgs.str.indexOf("\n")>0)
				pgs.replace("\n", "\\n");
			code += pgs.str;
		}
		code += "\";\n";

		//	Add defaulf value in vector to be put in DbData
		if (default_value!=null && default_value.length()>0)
		{
			code += "	vect_data.clear();\n";
			int	pos = 0;
			String	tmp = new String(default_value);
			while ((pos=tmp.indexOf('\n'))>=0)
			{
				String	line = tmp.substring(0, pos);
				code += "	vect_data.push_back(\"" + line + "\");\n";
				tmp = tmp.substring(pos+1);
			}
				code += "	vect_data.push_back(\"" + tmp + "\");\n";
		}

		code += "	if (prop_def.length()>0)\n";
		code += "	{\n";
		code += "		Tango::DbDatum	data(prop_name);\n";
		code += "		data << vect_data ;\n";
		code += "		" + s1 + "def_prop.push_back(data);\n";
		code += "		add_wiz_" + s2 + "prop(prop_name, prop_desc,  prop_def);\n";
		code += "	}\n";
		code += "	else\n";
		code += "		add_wiz_" + s2 + "prop(prop_name, prop_desc);\n";
		code += "\n";

		return code;
	}
//======================================================================
/**
 * Make property as a String.
 *
 * @return A <i>java.lang.String</i> containing property's name.
 */
//======================================================================
	public String toString()
	{
		return name;
	}
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
