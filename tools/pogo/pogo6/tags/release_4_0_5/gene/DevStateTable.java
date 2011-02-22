//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:	java source code for the TimeDs class .
//				This class is a singleton class and implements everything
//				which exists only once for all the Time ds object
//				It inherits from the DeviceClass class.
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.1  2004/08/26 07:13:37  pascal_verdier
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
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;



import java.util.*;
import java.io.*;


//-======================================================================
/**
 * This class is a just a vector containing the <i>DevState</i> objects,
 * for the PogoClass object.
 *
 *	@see <a href="java.util.Vector"> Vector</a>
 *
 * @author	$Author$
 * @version	$Revision$
 */
//-======================================================================


public class DevStateTable extends Vector implements PogoDefs
{

/*
 *	The vector containing the DevState objects, of the PogoClass object.
 */
	//public    Vector	vect = new Vector();

//======================================================================
/**
 * Default constructs for DevStateTable object.
 */
//======================================================================
	public DevStateTable()
	{
		super();
	}
//============================================================================
/**
 * Constructor for State Table from a <i>java.util.Vector</i> class.
 *
 * @param v_in	The input commands vector to be copied.
 */
//============================================================================
	public DevStateTable(Vector v_in)
	{
		super();
		for (int i=0 ; i<v_in.size() ; i++)
			addElement(v_in.elementAt(i));
	}
//============================================================================
/**
 * Constructor for State Table from an input file (.pogo, .cpp or .java).
 *
 * @param filename	Name of the file to read states list and decriptions.
 * @throws FileNotFoundException if occured when reading file.
 * @throws SecurityException if occured when reading file.
 * @throws IOException if occured when reading file.
 * @throws PogoException if a synthax error occured when reading file.
 */
//============================================================================
	public DevStateTable(String filename, int lang)
								throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		super();
		FileInputStream	fid;
		byte[]	inStr;
		int		start, end;

		//	Open and read file
		//----------------------------
		String str = PogoUtil.readFile(filename);
		if ((start=str.indexOf(statesDescRes))<0)
		{
			System.out.println("WARNING: "+ statesDescRes + "Not found !");
			return;	//	No States defined
		}
		start = str.indexOf("\n", start)+1;
		end   = str.indexOf("*/", start);
		
		PogoString	pgs = new PogoString(str.substring(start, end));
		pgs.getDescription();

		//	Get begining of each state definition 
		//----------------------------------------------------------
		String	pattern = (lang==cppLang)? "Tango::" : "DevState.";
		start = end = 0;
		while (end>=0 && (start=pgs.str.indexOf(pattern, end))>=0)
		{
			//	Search State name
			//----------------------------
			end = pgs.str.indexOf(":", start + pattern.length()+1);
			String	name = pgs.str.substring(start, end).trim();
			start = end + 2;
			//	Search State description
			//----------------------------
			String	desc;
			if ((end=pgs.str.indexOf(pattern, start))>0)
				desc = pgs.str.substring(start, end).trim();
			else
				if (start<pgs.str.length())
					desc = pgs.str.substring(start);
				else
					desc = "";

			//	Add state to table
			//------------------------------
			addElement(new DevState(name, desc));
			start = end;
		}
	}
//===============================================================
/**
 *	Return a the state class for an index.
 *
 *	@param	idx	Index of the state.
 *	@return	DevState class of this index.
 */
//===============================================================
	public DevState stateAt(int idx)
	{
		return ((DevState)(elementAt(idx)));
	}
//============================================================================
/**
 * Build a String including state name and descrition.
 *
 * @return A String containing name and description
 *			for the all states in the vector.
 */
//============================================================================
	public String toString()
	{
		StringBuffer	sb = new StringBuffer("");
		for (int i=0 ; i<size() ; i++)
		{
			DevState state = (DevState)(elementAt(i));
			sb.append(state.name+ ":\n");
			sb.append(state.description+ "\n");
		}
		return sb.toString();
	}
//============================================================================
/**
 * Build a String including state name and descrition in comments.
 *
 *	@param	lang	Langage used (Tango:: or DevState. used).
 * @return A String containing name and description
 *			for the all states in the vector. Each line is in comments.
 */
//============================================================================
	public String toStringComments(int lang)
	{
		StringBuffer	sb = new StringBuffer(" *	"+statesDescRes+"\n");
		for (int i=0 ; i<size() ; i++)
		{
			DevState	state = (DevState)(elementAt(i));
			String		name;
			if (lang==cppLang)
				name = state.name;
			else
				name = state.javaName(); 

			PogoString	pgs = new PogoString(" *	" + 
									name + " :\t" + state.description);
			//	Comments all lines
			//--------------------------------------------
			for (int idx=0 ; idx < pgs.str.length() ; idx++)
				if (pgs.str.charAt(idx)=='\n')
					pgs.insert(idx+1, " *			");
			sb.append(pgs+"\n");
		}
		//sb.append("\n");
		return sb.toString();
	}
//============================================================================
/**
 * Build a String to be put inside the is_allowed method.
 */
//============================================================================
	String allowedCore()
	{
		//	if no state --> no code
		if (size()==0)
			return null;

		//	Build it
		String	s = "{\n	if (";
		for (int i=0 ; i<size() ; i++)
		{
			DevState	state = stateAt(i);

			if (i>0)	//	if not the first
				s += "	||\n		";

			s += "get_state() == " + TangoStatesArray[state.code] ;
		}
		
		//	Close test
		s += ")\n	{\n		//	";
		return s;
	}
//============================================================================
/**
 * Constructor for State Table from an input is_allowed method.
 *
 * @param method	code read from pogo file.
 */
//============================================================================
	public DevStateTable(String	method)
	{
		super();
		//	Get only test code
		int	start = method.indexOf("if (");
		//	if no code --> no states
		if (start<0)
			return;
		start += "if (".length();
		int end = method.indexOf(")\n", start);
		String	code = method.substring(start, end);
		//	Search States
		start = 0;
		String	target = "get_state() == ";
		while ((start=code.indexOf(target, start))>=0)
		{
			start += target.length();
			StringTokenizer st = new StringTokenizer(code.substring(start));
			String	str_state = st.nextToken().toString();
			//	Add it in vector
			add(new DevState(str_state, str_state));
		}
	}
//=======================================================================
//=======================================================================
	public static void main(java.lang.String[] args)
	{
	String	code = 
"//=========================================================\n" +
"/**\n" +
" *	Read/Write allowed for Voltage attribute.\n" +
" */\n" +
"//=========================================================\n" +
"bool PowerSupply::is_Voltage_allowed(Tango::AttReqType type)\n" +
"{\n" +
"	if (get_state() == Tango::FAULT	||\n" +
"		get_state() == Tango::ALARM)\n" +
"	{\n" +
"		//	End of Generated Code\n" +
"		\n" +
"			if(All_ok)\n" +
"				do_it();\n" +
"\n" +
"		//	Re-Start of Generated Code\n" +
"		return false;\n" +
"	}\n" +
"	return true\n" +
"}\n";

		try
		{
			DevStateTable	table = new DevStateTable(code);
			System.out.println(table);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
