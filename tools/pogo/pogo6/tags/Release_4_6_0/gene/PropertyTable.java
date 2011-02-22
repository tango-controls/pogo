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
// Revision 3.8  2005/11/24 08:29:49  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.7  2005/09/15 12:35:58  pascal_verdier
// Bug fixed on array property management.
//
// Revision 3.6  2005/09/07 08:19:19  pascal_verdier
// Property Default value managed and set for wizard usage.
//
// Revision 3.5  2005/01/28 12:43:53  pascal_verdier
// Bug with spaces/tab fixed.
//
// Revision 3.4  2004/11/29 09:49:20  pascal_verdier
// if device property not found in database, it takes class property value if exists in java.
//
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


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

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
 */
//============================================================================
	public PropertyTable(String filename, int source, int lang)
				throws	FileNotFoundException, SecurityException,
						IOException
	{
		//	Open and read file
		//----------------------------------------
        PogoString  code = new PogoString(PogoUtil.readFile(filename));

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
		String	core = code.str.substring(start, end);

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
			String	type = st.nextToken();
			String	name = st.nextToken();
			//	Check if first char is upcase else set it
			//-------------------------------------------------
			if (name.charAt(0) >='a' || name.charAt(0) >='z')
			{
				char	car = (char)(name.charAt(0)-('a'-'A'));
				name = car + name.substring(1);
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
		//if (size()==0)
		//	return "";

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

		String  str = core.str.substring(0, start);

		//	Insert new code
		//-------------------------
		// Check if database used
		str += "\t\tif (Util._UseDb==false)\n\t\t\treturn;\n";

		//	Declare DbData and fill it
		str += "\t\tString[]	propnames = {\n";
		for (int i=0 ; i<size() ; i++)
		{
			Property	property = propertyAt(i);
			str += "\t\t\t\t\""+ property+ "\"";
			if (i<size()-1)
				str += ",";
			str += "\n";
		}
		str +=  "\t\t\t};\n" +
                "\n" +
                "\t\t//	Call database and extract values\n" +
		        "\t\t//--------------------------------------------\n";
		if (target.equals("device"))
			str += "\t\tDbDatum[]	";
		else
			str += "\t\t";
		
		str += prop_array + " = get_db_" + target + "().get_property(propnames);\n";
		if (target.equals("device"))
			str += "\t\t" + classname + "Class	ds_class = (" +
					classname + "Class)get_device_class();\n";
		
		str += "\t\tint	i = -1;\n";

		//	Extract property values
		//---------------------------------
		for (int i=0 ; i<size() ; i++)
		{
			Property	property = propertyAt(i);
			str +=  "\t\t//	Extract " + property.name + " value\n" +
			        "\t\tif (" + prop_array + "[++i].is_empty()==false)" +
                    "\t\t" + property.getVarName() + " = " + prop_array + "[i]." +
								property.type.extract_java_method() + ";\n" +
			        "\t\telse\n";
			if (target.equals("device"))
			{
				str +=  "\t\t{\n" +
				        "\t\t\t//	Try to get value from class property\n" +
                        "\t\t\tDbDatum	cl_prop = " +
					    	"ds_class.get_class_property(dev_prop[i].name);\n" +
				        "\t\t\tif (cl_prop.is_empty()==false)\t" +
						    property.getVarName() + " = cl_prop." +
						    property.type.extract_java_method() + ";\n" +
				        "\t\t}\n";
			}
			else
				str += "\t\t	" + prop_array + "[i].insert(" +
								property.getVarName() + ");\n";
			if (i<size()-1)
				str += "\n";
		}
		str += "\n";
		str += core.str.substring(end);

		return str;
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
			throw new PogoException("Input File Syntax error !\n" +
										startPropStr + "\n Not found !");
		if ((end=pg.str.indexOf(endPropStr))<0)
			throw new PogoException("Input File Syntax error !\n" +
										endPropStr + "\n Not found !");
		String	prev_declar = pg.str.substring(start, end);
			
		//	Buid the String to be inserted
		String  str = startPropStr + "\n\n";
		for (int i=0 ; i<size() ; i++)
		{
			//	Build description as comments
			Property	property = propertyAt(i);
			str += property.buildDefinition(javaLang);
		}
		str += "\n";
		pg.replace(prev_declar, str);
		return pg.str;
	}
//-======================================================================
/**
 *	Read the default property values from source code.
 */
//-======================================================================
	void readDefaultValues(String filename, int source, int lang)
				throws	FileNotFoundException, SecurityException,
						IOException, PogoException
	{
		//	Not yet supported in java
		if (lang==javaLang)
			return;
	
		//	read file and get the wanted method.
		PogoString	code = new PogoString(PogoUtil.readFile(filename));
		int	start = code.indexOf("::set_default_property()");
		if (start<0)
			return;	//	method does not exist -> do not set default values
		start = code.str.indexOf("{", start);
		int	end = code.outMethod(start);
		PogoString	method = new PogoString(code.str.substring(start, end));

		//	get only class/device part
		String	tag = "//	Set Default Device Properties";
		int		idx = method.indexOf(tag);
		if (end<0)
			throw new PogoException("\"" + tag + "\" Not Found");

		if (source==classProperty)
			method =  new PogoString(method.str.substring(0, idx));
		else
			method =  new PogoString(method.str.substring(idx));

		//	For each property
		for (int i=0 ; i<size() ; i++)
		{
			Property	prop = propertyAt(i);
			//	search this property treatment
			start = method.indexOf("\"" + prop.name + "\"");
			if (start>0)	//	found
			{
				start = method.indexOf("prop_def", start);
				start = method.indexOf("\"", start);
				start++;
				end   = method.nextCr(start);
				end   = method.lastIndexOf("\"", end);
				PogoString	pgs = new PogoString(method.str.substring(start, end));
				while (pgs.str.indexOf("\\n")>0)
					pgs.replace("\\n", "\n");
				prop.default_value = pgs.str;
			}
		}
	}


//-======================================================================
	public String toString()
	{
		String  str = "";
		for (int i=0 ; i<size() ; i++)
		{
			Property prop = (Property)(elementAt(i));
			str += prop.name+ "\t" +
			        prop.type.cpp_code_str+ "\n";
		}
		return str;
	}	
}
