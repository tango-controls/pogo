//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:	java source cpp for the TimeDs class .
//				This class is a singleton class and implements everything
//				which exists only once for all the Time ds object
//				It inherits from the DeviceClass class.
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.4  2005/06/17 08:51:24  pascal_verdier
// Minor changes.
//
// Revision 3.3  2004/10/21 06:58:48  pascal_verdier
// Default value management added for properties.
// And minor changes
//
// Revision 3.2  2004/09/07 12:00:50  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.1  2004/09/02 06:41:34  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
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
// Set as comments the methods where the arguments have been modified.
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
// Argin and Argout's comments added for java.
//
// Revision 1.3  1999/12/09  15:30:59  verdier
// Java code generation for first tango version.
//
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;


import fr.esrf.TangoDs.TangoConst;



/**
 *	This class determine a corespondance between language type of data.
 */
public class TangoTypes implements TangoConst, PogoDefs
{
/**
 *	Code value.
 */
	public int		code;
/**
 *	C++ Code String.
 */
	public String	cpp_code_str;
/**
 *	Java Code String.
 */
	public String	java_code_str;
/**
 *	C++ type
 */
	public String	cpp;
/**
 *	Java type
 */
	public String	java;
/**
 *	Argument description.
 */
	public String	description;
/**
 *	Type is an array.
 */
	public boolean	is_array;
/**
 *	True if type needs a constructor.
 */
	public boolean	need_constr;
	public boolean	need_2constr;


//==============================================
/**
 *	Constructor for TangoType object
 *
 *	@param	type	Tango type name.
 *	@param	desc	Argument description.
 */
//==============================================	
	public TangoTypes(String type, String desc)
	{
		this(type);
		if (desc!=null)
			description = new String(desc);
	}
//==============================================
/**
 *	Constructor for TangoType object from a
 *	language type.
 *
 *	@param	type	Language type name.
 */
//==============================================
	public TangoTypes(String type)
	{
		//	Check if from java -> then convert to C++ name space
		//---------------------------------------------------------
		if (type.indexOf("Tango_")>=0)
			type = to_cpp_code_str(type);

		//	This method for type from source
		//---------------------------------------------
			if (type.equals("Tango::DevVoid"))
				createType("Tango::DEV_VOID");
			else
			if (type.equals("Tango::DevBoolean") ||
				type.equals("boolean"))
				createType("Tango::DEV_BOOLEAN");
			else
			if (type.equals("Tango::DEV_UCHAR") ||
				type.equals("byte"))
				createType("Tango::DEV_UCHAR");
			else
			if (type.equals("Tango::DevShort") ||
				type.equals("short"))
				createType("Tango::DEV_SHORT");
			else
			if (type.equals("Tango::DevLong") ||
				type.equals("long"))
				createType("Tango::DEV_LONG");
			else
			if (type.equals("Tango::DevUShort"))
				createType("Tango::DEV_USHORT");
			else
			if (type.equals("Tango::DevULong"))
				createType("Tango::DEV_ULONG");
			else
			if (type.equals("Tango::DevFloat") ||
				type.equals("float"))
				createType("Tango::DEV_FLOAT");
			else
			if (type.equals("Tango::DevDouble") ||
				type.equals("double"))
				createType("Tango::DEV_DOUBLE");
			else
			if (type.equals("Tango::DevVarCharArray")||
				type.equals("char[]"))
				createType("Tango::DEVVAR_CHARARRAY");
			else
			if (type.equals("Tango::DevVarShortArray") ||
				type.equals("short[]"))
				createType("Tango::DEVVAR_SHORTARRAY");
			else
			if (type.equals("Tango::DevVarLongArray") ||
				type.equals("long[]"))
				createType("Tango::DEVVAR_LONGARRAY");
			else
			if (type.equals("Tango::DevVarFloatArray") ||
				type.equals("float[]"))
				createType("Tango::DEVVAR_FLOATARRAY");
			else
			if (type.equals("Tango::DevVarDoubleArray") ||
				type.equals("double[]"))
				createType("Tango::DEVVAR_DOUBLEARRAY");
			else
			if (type.equals("Tango::DevVarULongArray"))
				createType("Tango::DEVVAR_ULONGARRAY");
			else
			if (type.equals("Tango::DevVarUShortArray"))
				createType("Tango::DEVVAR_USHORTARRAY");
			else
			if (type.equals("Tango::ConstDevString"))
				createType("Tango::CONST_DEV_STRING");
			else
			if (type.equals("Tango::DevString") ||
				type.equals("string"))
				createType("Tango::DEV_STRING");
			else
			if (type.equals("Tango::DevVarStringArray") ||
				type.equals("string[]"))
				createType("Tango::DEVVAR_STRINGARRAY");
			else
			if (type.equals("Tango::DevVarLongStringArray"))
				createType("Tango::DEVVAR_LONGSTRINGARRAY");
			else
			if (type.equals("Tango::DevVarDoubleStringArray"))
				createType("Tango::DEVVAR_DOUBLESTRINGARRAY");
			else
				createType(type);
				//System.out.println("WARNING: C++ type ("+type+") Unknown !");
	}
	
	
	
//==============================================
/**
 *	Build a TangoType object for input type
 *
 *	@param	type	Tango type name.
 */
//==============================================	
	private void createType(String type)
	{
		//	Simple types
		//-------------------------------
		cpp_code_str = new String(type);
		java_code_str = to_java_code_str();
		if (type.equals("Tango::DEV_VOID"))
		{
			code = Tango_DEV_VOID;
			cpp  = new String("void");
			java = new String("void");
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEV_BOOLEAN"))
		{
			code = Tango_DEV_BOOLEAN;
			cpp  = new String("Tango::DevBoolean");
			java = new String("boolean");
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEV_SHORT"))
		{
			code = Tango_DEV_SHORT;
			cpp  = new String("Tango::DevShort");
			java = new String("short");
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEV_LONG"))
		{
			code = Tango_DEV_LONG;
			cpp  = new String("Tango::DevLong");
			java = new String("int");
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEV_FLOAT"))
		{
			code = Tango_DEV_FLOAT;
			cpp  = new String("Tango::DevFloat");
			java = new String("float");
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEV_DOUBLE"))
		{
			code = Tango_DEV_DOUBLE;
			cpp  = new String("Tango::DevDouble");
			java = new String("double");
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEV_UCHAR"))
		{
			code = Tango_DEV_USHORT;
			cpp  = new String("Tango::DevUChar");
			java = new String("byte");
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEV_USHORT"))
		{
			code = Tango_DEV_USHORT;
			cpp  = new String("Tango::DevUShort");
			java = new String("int");
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEV_ULONG"))
		{
			code = Tango_DEV_ULONG;
			cpp  = new String("Tango::DevULong");
			java = new String("int");
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}

		//	Array types
		//-------------------------------
		else
		if (type.equals("Tango::DEVVAR_CHARARRAY"))
		{
			code = Tango_DEVVAR_CHARARRAY;
			cpp  = new String("Tango::DevVarCharArray");
			java = new String("byte[]");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEVVAR_SHORTARRAY"))
		{
			code = Tango_DEVVAR_SHORTARRAY;
			cpp  = new String("Tango::DevVarShortArray");
			java = new String("short[]");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEVVAR_LONGARRAY"))
		{
			code = Tango_DEVVAR_LONGARRAY;
			cpp  = new String("Tango::DevVarLongArray");
			java = new String("int[]");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEVVAR_FLOATARRAY"))
		{
			code = Tango_DEVVAR_FLOATARRAY;
			cpp  = new String("Tango::DevVarFloatArray");
			java = new String("float[]");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEVVAR_DOUBLEARRAY"))
		{
			code = Tango_DEVVAR_DOUBLEARRAY;
			cpp  = new String("Tango::DevVarDoubleArray");
			java = new String("double[]");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEVVAR_USHORTARRAY"))
		{
			code = Tango_DEVVAR_USHORTARRAY;
			cpp  = new String("Tango::DevVarUShortArray");
			java = new String("short[]");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEVVAR_ULONGARRAY"))
		{
			code = Tango_DEVVAR_ULONGARRAY;
			cpp  = new String("Tango::DevVarULongArray");
			java = new String("int[]");
			is_array = true;
			need_constr = true;
		}
		else
		if (type.equals("Tango::CONST_DEV_STRING"))
		{
			code = PogoDefs.Tango_CONST_DEV_STRING;
			cpp  = new String("Tango::ConstDevString");
			java = new String("String");
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEV_STRING"))
		{
			code = Tango_DEV_STRING;
			cpp  = new String("Tango::DevString");
			java = new String("String");
			is_array = false;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEVVAR_STRINGARRAY"))
		{
			code = Tango_DEVVAR_STRINGARRAY;
			cpp  = new String("Tango::DevVarStringArray");
			java = new String("String[]");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Tango::DEVVAR_LONGSTRINGARRAY"))
		{
			code = Tango_DEVVAR_LONGSTRINGARRAY;
			cpp  = new String("Tango::DevVarLongStringArray");
			java = new String("DevVarLongStringArray");
			is_array = true;
			need_constr = true;
			need_2constr= true;
		}
		else
		if (type.equals("Tango::DEVVAR_DOUBLESTRINGARRAY"))
		{
			code = Tango_DEVVAR_DOUBLESTRINGARRAY;
			cpp  = new String("Tango::DevVarDoubleStringArray");
			java = new String("DevVarDoubleStringArray");
			is_array = true;
			need_constr = true;
			need_2constr= true;
		}
		else
		if (type.equals("Tango::DEV_STATE"))
		{
			code = Tango_DEV_STATE;
			cpp  = new String("Tango::DevState");
			java = new String("DevState");
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}
		else
		//	Type used for property
		//----------------------------------------
		if (type.equals("string") || type.equals("String"))
		{
			code = Tango_DEV_STRING;
			cpp_code_str = new String("string");
			cpp  = new String("string");
			java = new String("String");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Array of short")   || type.equals("vector<short>")
											|| type.equals("short[]"))
		{
			code = Tango_DEVVAR_SHORTARRAY;
			cpp_code_str = new String("Array of short");
			cpp  = new String("vector<short>");
			java = new String("short[]");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Array of long")    || type.equals("vector<long>")
											|| type.equals("long[]"))
		{
			code = Tango_DEVVAR_LONGARRAY;
			cpp_code_str = new String("Array of long");
			cpp  = new String("vector<long>");
			java = new String("long[]");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Array of float")   || type.equals("vector<float>")
											|| type.equals("float[]"))
		{
			code = Tango_DEVVAR_FLOATARRAY;
			cpp_code_str = new String("Array of float");
			cpp  = new String("vector<float>");
			java = new String("float[]");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Array of double")  || type.equals("vector<double>")
											|| type.equals("double[]"))
		{
			code = Tango_DEVVAR_DOUBLEARRAY;
			cpp_code_str = new String("Array of double");
			cpp  = new String("vector<double>");
			java = new String("double[]");
			is_array = true;
			need_constr = true;
			need_2constr= false;
		}
		else
		if (type.equals("Array of string")  || type.equals("vector<string>")
											|| type.equals("String[]"))
		{
			code = Tango_DEVVAR_STRINGARRAY;
			cpp_code_str = new String("Array of string");
			cpp  = new String("vector<string>");
			java = new String("String[]");
			is_array = true;
			need_constr = true;
			need_2constr= true;
		}
		else
		{
			System.out.println("WARNING: Tango type ("+type+") Unknown !");

			code = Tango_TYPE_UNKNOWN;
			cpp  = new String(type);
			java = new String(type);
			is_array = false;
			need_constr = false;
			need_2constr= false;
		}
	}
//==============================================
/**
 *	Set the description field.
 *
 *	@param	str	Description text.
 */
//==============================================	
	public void setDescription(String str)
	{
		description = new String(str);
	}
//==============================================
/**
 *	Extract 'Tango' method depends on data type
 *	used in Command Class(es) in execute method
 */
//==============================================	
	public String javaExtract()
	{
		String	s;
		String	cpp_namespace = "::";

		//	Test if cpp type begining by "Tango::" or not
		int start;
		if ((start=cpp.indexOf(cpp_namespace))>0)
			s = cpp.substring(start + cpp_namespace.length());
		else
			s = cpp;
		
		return new String("extract_" + s);
	}
//==============================================	
	/**
	 *	Replace C++ name space to java name
	 *		"Tango::"  ->  "Tango_"
	 */
//==============================================	
	private String to_java_code_str()
	{
		if (cpp_code_str.indexOf(cppNameSpace)<0)
			return cpp_code_str;

		StringBuffer	sb = new StringBuffer("Tango_");
		int	start = cpp_code_str.indexOf(cppNameSpace) + cppNameSpace.length();
		sb.append(cpp_code_str.substring(start));
		return sb.toString();
	}
//==============================================
	/**
	 *	Replace java name to C++ name space
	 *		"Tango_"  ->  "Tango::"
	 */
//==============================================
	private String to_cpp_code_str(String code_str)
	{
		String	java_begin = "Tango_";
		if (code_str.indexOf(java_begin)<0)
			return code_str;

		StringBuffer	sb = new StringBuffer("Tango::");
		int	start = code_str.indexOf(java_begin) + java_begin.length();
		sb.append(code_str.substring(start));
		return sb.toString();
	}
//==============================================
	/**
	 *	return the extract java method name
	 *	for this type (For device server).
	 */
//==============================================
	public String extract_java_method()
	{
		StringBuffer	sb = new StringBuffer("extract");

		//	Replace first char by uppercase
		String			first = java.substring(0,1).toUpperCase();
		sb.append(first);
		
		//	Get end of java type string
		PogoString	pg = new PogoString(java.substring(1));
		//	And replace array by string
		pg.replace("[]", "Array");

		sb.append(pg.str);
		sb.append("()");
		return sb.toString();
	}
//===============================================================
/**
 *	Extract method for client proxy for DeviceData argout..
 */
//===============================================================
 public String	extract_method()
 {
	StringBuffer	sb = new StringBuffer("extract");
	int	start;
	
	String	target = "DevVar";
	if ((start=cpp.indexOf(target))>0)
		sb.append(cpp.substring(start + target.length()));
	else
	{
		target = "Dev";
		if ((start=cpp.indexOf(target))>0)
			sb.append(cpp.substring(start + target.length()));
	}
	return sb.toString();
 }
//==============================================	
	public String toString()
	{
		StringBuffer	sb = new StringBuffer( cpp_code_str+"	"+ cpp + "	"+java+"\n");
		
		if (is_array)
			sb.append("Is an Array and ");
		else
			sb.append("Is Not an Array and ");
		if (need_constr)
			sb.append("Needs Constructor");
		else
			sb.append("Doesn't Needs Constructor\n");
		return sb.toString();
	}
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
