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
// Revision 3.3  2004/10/21 06:58:48  pascal_verdier
// Default value management added for properties.
// And minor changes
//
// Revision 3.2  2004/09/07 12:00:50  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.1  2004/08/26 07:19:30  pascal_verdier
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
import java.io.*;


//-======================================================================
/**
 * This class is a just a vector containing the <i>Property</i> objects,
 * for the PogoClass object.
 *
 * @author	$Author$
 * @version	$Revision$
 */
//-======================================================================

public class PropertyTable extends Vector implements PogoDefs
{

//============================================================================
/**
 * Constructor for Property Table from a <i>java.util.Vector</i> class.
 */
//============================================================================
	public PropertyTable()
	{
	}

//============================================================================
/**
 * Constructor for Property Table from a <i>java.util.Vector</i> class.
 *
 * @param v_in	The input commands vector to be copied.
 */
//============================================================================
	public PropertyTable(Vector v_in)
	{
		for (int i=0 ; i<v_in.size() ; i++)
			addElement(v_in.elementAt(i));
	}
//============================================================================
/**
 * Constructor for Property Table from source files.
 *
 *	@param filename		Pogo object class name file.
 *	@param source		property source (class or device)
 *	@throws FileNotFoundException
 *	@throws SecurityException
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//============================================================================
	public PropertyTable(String filename, int source, int lang)
				throws	FileNotFoundException, SecurityException,
						IOException, PogoException
	{
		String[]	srcStr = { "Class", "Device" };
		//	Open and read file
		//----------------------------------------
		FileInputStream		fidin = new FileInputStream(filename);
		int nb = fidin.available();
		byte[]	inStr  = new byte[nb];
		fidin.read(inStr);
		PogoString code = new PogoString(inStr);
		fidin.close();

		//	Extract the property data members part
		//--------------------------------------------------
		int	start, end;
		String	startstr = (lang==javaLang)?
							startPropStr : "properties member data";
		if ((start=code.str.indexOf(startstr))<0)
		{
			System.out.println("No property found in "+ filename);
			//System.out.println(startstr + " Not found in "+ filename);
			return;
		}
		//	check the diffence between class and device definitions
		//------------------------------------------------------------
		if (source==classProperty)
		{
			String	endstr = (lang==javaLang)?
								endPropStr : "//	Method prototypes";
			start = code.nextCr(start)+1;
			end = code.str.indexOf(endstr, start);
			end = code.previousCr(end)-1;
		}
		else
		{
			String	endstr = (lang==javaLang)? endPropStr : "//@}";
			if (lang==javaLang)
			{
				//	For java get the comments begining.to end tag
				start = code.str.indexOf("/**", start);
				end   = code.str.indexOf(endPropStr, start);
			}
			else
			{
				//	For Cpp get block begining and ending
				start = code.inMethod(start)+2;
				end   = code.str.indexOf("//@}", start);
			}
		}
		//	Check coherency
		if (start>end || start<0 || end<0)
		{
			System.out.println("No property found in "+ filename);
			return;
		}
		String	core = new String(code.str.substring(start, end));

		//	Extract each description, type and name
		//----------------------------------------------------
		start = end = 0;
		while((end=core.indexOf("*/", end))>0)
		{
			end +=3;	//	 next line
			PogoString	pgs = new PogoString(core.substring(start, end));
			String		desc = pgs.getDescription();

			start = end;
			end   = core.indexOf(";", start);
			StringTokenizer st = new StringTokenizer(core.substring(start, end));
			String	type = st.nextToken().toString();
			String	name = st.nextToken().toString();
			//	Check if first char is upcase else set it
			//-------------------------------------------------
			if (name.charAt(0) >='a' || name.charAt(0) >='z')
			{
				char	car = (char)(name.charAt(0)-('a'-'A'));
				name = new String(car + name.substring(1));
			}
			addElement(new Property(name, type, desc));
		}
	}
//===============================================================
/**
 *	Return a the Property class for an index.
 *
 *	@param	idx	Index of the state.
 *	@return	Property class of this index.
 */
//===============================================================
	public Property propertyAt(int idx)
	{
		return ((Property)(elementAt(idx)));
	}

//===============================================================
/**
 *	Write the get property methods to read code.
 *
 *	@param	readcode	The read source code
 *	@param	target		device or class.
 *	@param	classname	the class name used for get_device_property.
 *	@return the modified code forget propert  method.
*	@throws	PogoException	If a synthax error occured on input file
 */
//===============================================================
	protected String updateJavaMethod(String readcode, String target, String classname)
							throws	PogoException
	{
		//	If no property return an empty string
		//-------------------------------------------
		if (size()==0)
			return "";

		PogoString	core = new PogoString(readcode);
		String		cl_array = "cl_prop";
		String		prop_array = (target.equals("device"))? "dev_prop": cl_array;

		//	Get the start and end of automatic code generation
		//-------------------------------------------------------
		int start, end;
		if ((start=core.str.indexOf("Automatic code generation"))<0)
			throw new PogoException("Input File Syntax error 1!" +
									"'Automatic code generation' Not found");
		start = core.nextCr(start)+1;
		start = core.nextCr(start)+1;
		
		end = core.str.indexOf("End of Automatic code generation", start);
		end = core.previousCr(end);

		StringBuffer	sb = new StringBuffer(core.str.substring(0, start));

		//	Insert new code
		//-------------------------
		// Check if database used
		sb.append("\t\tif (Util._UseDb==false)\n\t\t\treturn;\n");

		//	Declare DbData and fill it
		sb.append("\t\tString[]	propnames = {\n");
		for (int i=0 ; i<size() ; i++)
		{
			Property	property = propertyAt(i);
			sb.append("\t\t\t\t\""+ property+ "\"");
			if (i<size()-1)
				sb.append(",");
			sb.append("\n");
		}
		sb.append("\t\t\t};\n");
		sb.append("\n");
		sb.append("\t\t//	Call database and extract values\n");
		sb.append("\t\t//--------------------------------------------\n");
		if (target.equals("device"))
			sb.append("\t\tDbDatum[]	");
		else
			sb.append("\t\t");
		
		sb.append(prop_array + " = get_db_" + target + "().get_property(propnames);\n");
		if (target.equals("device"))
			sb.append("\t\t" + classname + "Class	ds_class = (" +
					classname + "Class)get_device_class();\n");
		
		sb.append("\t\tint	i = -1;\n");

		//	Extract property values
		//---------------------------------
		for (int i=0 ; i<size() ; i++)
		{
			Property	property = propertyAt(i);
			sb.append("\t\t//	Extract " + property.name + " value\n");
			sb.append("\t\tif (" + prop_array + "[++i].is_empty()==false)");
			sb.append("\t\t" + property.getVarName() + " = " + prop_array + "[i]." +
								property.type.extract_java_method() + ";\n");
			sb.append("\t\telse\n");
			if (target.equals("device"))
			{
				sb.append("\t\t{\n");
				sb.append("\t\t\t//	Try to get value from class property\n");
				sb.append("\t\t\tDbDatum	cl_prop = " +
						"ds_class.get_class_property(dev_prop[i].name);\n");
				sb.append("\t\t\tif (cl_prop.is_empty()==false)\t" +
						property.getVarName() + " = cl_prop." +
						property.type.extract_java_method() + ";\n");
								
				sb.append("\t\t}\n");
			}
			else
				sb.append("\t\t	" + prop_array + "[i].insert(" +
								property.getVarName() + ");\n");
			if (i<size()-1)
				sb.append("\n");
		}
		sb.append("\n");
		sb.append(core.str.substring(end));

		return sb.toString();
	}
//===============================================================
/**
 *	Write the Property fields declaration.
 *
 *	@param	readcode	The read source code.
 *	@return the modified code.
*	@throws	PogoException	If a synthax error occured on input file
 */
//===============================================================
	protected String addJavaDataMembers(String readcode)
							throws	PogoException
	{
		PogoString	pg = new PogoString(readcode);
		//	Get previous declaration
		int	start, end;
		if ((start=pg.str.indexOf(startPropStr))<0)
			throw new PogoException(new String("Input File Syntax error !\n" +
												startPropStr +
												"\n Not found !"));
		if ((end=pg.str.indexOf(endPropStr))<0)
			throw new PogoException(new String("Input File Syntax error !\n" +
												endPropStr +
												"\n Not found !"));
		String	prev_declar = pg.str.substring(start, end);
			
		//	Buid the String to be inserted
		StringBuffer	sb = new StringBuffer(startPropStr);
		sb.append("\n\n");
		for (int i=0 ; i<size() ; i++)
		{
			//	Build description as comments
			Property	property = propertyAt(i);
			sb.append(property.buildDefinition(javaLang));
		}
		sb.append("\n");
		pg.replace(prev_declar, sb.toString());
		return pg.str;
	}



//-======================================================================
	public String toString()
	{
		StringBuffer	sb = new StringBuffer("");
		for (int i=0 ; i<size() ; i++)
		{
			Property prop = (Property)(elementAt(i));
			sb.append(prop.name+ "\t");
			sb.append(prop.type.cpp_code_str+ "\n");
		}
		return sb.toString();
	}	
}
