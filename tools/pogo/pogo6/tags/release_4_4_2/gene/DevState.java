//+======================================================================
// $Source$
//
// Project:   Pogo
//
// Description:	Difining the Tango device's states for Pogo
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

//-======================================================================
/**
 * This class defines a state for server code.
 * This class describe the device state.
 * These <b>DevState</b> class are located in a <b>java.util.Vector</b>
 * known as <b>DevStateTable</b> class.
 *
 * @see <a href=TangoDevStates.html> Tango Device States</a>
 *
 * @author	$Author$
 * @version	$Revision$
 */
//-======================================================================
public class DevState implements PogoDefs
{
/**
 *	The numeric code of this state.
 */
	public	int		code;
/**
 *	The name of this state.
 */
	public	String	name;
/**
 *	The description of this state.
 */
	public	String	description;

//======================================================================
/**
 * Constructs a newly allocated DevState object from all its creation 
 * parameters.
 *
 * @param 	num			The numeric code of the state.
 * @param 	desc		The state's description.
 *
 */
//============================================================================
	public DevState(int num, String desc)
	{
		code = num;
		name = 	TangoStatesArray[code];
		if (desc!=null)
			description = desc;
	}
//======================================================================
/**
 * Constructs a newly allocated DevState object from all its creation 
 * parameters.
 *
 * @param 	sName		The name of the state.
 * @param 	desc		The state's description.
 *
 */
//======================================================================
	public DevState(String sName, String desc)
	{
		//	if Cpp namespace not present (from java) add it
		//------------------------------------------------------
		int	start;
		String	java_begin = "DevState.";
		if ((start=sName.indexOf(java_begin))>=0)
		{
			start += java_begin.length();
			sName = new String("Tango::" + sName.substring(start));
		}
		//	Search index in State array
		//------------------------------------------------------
		for (int i=0 ; i<TangoStatesArray.length ; i++)
			if (TangoStatesArray[i].equals(sName))
				code = i;
		name = 	TangoStatesArray[code];
		if (desc!=null)
			description = desc;
	}
//======================================================================
/**
 * Build a name from tango name for java (used for is_allowed method).
 */
//======================================================================
	public String javaName()
	{
		int	start = name.indexOf("Tango::");
		if (start<0)
			start=0 ;
		else
			start = "Tango::".length();
		return new String("DevState." + name.substring(start));
	}
//======================================================================
/**
 * Make state as a String.
 *
 * @return A <i>java.lang.String</i> containing state's name.
 */
//======================================================================
	public String toString()
	{
		return (name);
	}
//======================================================================
/**
 * Make state as a String with its descrition.
 *
 * @return A <i>java.lang.String</i> containing state's name and its dewxciption.
 */
//======================================================================
	public String toCompleteString()
	{
		return (name+"("+code+"):\n" + description);
	}
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
