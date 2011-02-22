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
// Revision 3.4  2006/09/22 13:03:22  pascal_verdier
// Bug in code generation directory fixed.
// Edit Abstract class if any added.
//
// Revision 3.3  2005/03/02 10:27:12  pascal_verdier
// Managing Super Classes and inherited classes.
//
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
	public String	inherited_class=null;
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
        if (inherited_from==null)
            inherited_class = "Device_2Impl";
        else
        {
            int idx = inherited_from.lastIndexOf('/');
            if(idx<0)
                inherited_class = inherited_from;
            else
                inherited_class = inherited_from.substring(idx+1);
        }
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
