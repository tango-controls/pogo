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
// Revision 3.2  2004/09/07 12:00:50  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.1  2004/08/26 07:12:13  pascal_verdier
// Attributes are now generated as class.
//
//
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================

package pogo.gene;


//===========================================================
/**
 *	This class is able to define a server class.
 *	It contains 4 fileds name, class name for inheritance,
 *	description and project title.
 */
//===========================================================
public class ServerDefinitions 
{
	public String	name;
	public String	inherited_from=null;
	public String	description;
	public String	project_title;
//===========================================================
//===========================================================
	public ServerDefinitions()
	{
		this.name          = "";
		this.description   = "";
		this.project_title = "";
	}
//===========================================================
//===========================================================
	public ServerDefinitions(String name, String inherited_from, String description, String project_title)
	{
		this.name            = name;
		this. inherited_from = inherited_from;
		this.description     = description;
		this.project_title   = project_title;
	}
//===========================================================
//===========================================================
	public String toString()
	{
		return  name;
	}
//===========================================================
//===========================================================
}
