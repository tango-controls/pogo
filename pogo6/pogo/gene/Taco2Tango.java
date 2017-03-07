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
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

/**
 *	This class get a TACO class file and convert it to a TANGO class.
 *
 * @author	$Author$
 * @version	$Revision$
 */


public class Taco2Tango implements PogoDefs
{
/**
 *	The PogoClass object created from a TACO object.
 */
private PogoClass		server;
/**
 *	The file where a TACO object must be extracted.
 */
private String		filename;



//=======================================================================
/**
 *	Extract class name from a full path string.
 *
 *	@return class name.
 */
//=======================================================================
	private String extractClassFromPath(String str)
	{
		int 	start, end;

		//	Search extention
		//------------------------
		end = str.length()-1;
		while (end>0 && str.charAt(end)!='.')
			end--;
		if (end==0)	//	No extention
			end = str.length()-1;

		//	Search las word
		//-----------------------------
		start = end;
		while (start>0 && str.charAt(start)!='/'&& str.charAt(start)!='\\')
			start--;
		if (str.charAt(start)=='/' || str.charAt(start)=='\\')
			start++;
			
		//System.out.println("Class Name: "+str.substring(start, end));
		return str.substring(start, end);
	}
//=======================================================================
/**
 *	Constructor for extract a PogoClass object for TANGO from a TACO class file.
 *
 *	@param filename	The file where a TACO object must be extracted.
 */
//=======================================================================
	public Taco2Tango(String filename) throws PogoException
	{
		//	Create PogoClass object
		//------------------------------
		this.filename = filename;
		PogoString	pgs = new PogoString(filename);
		server = new PogoClass(extractClassFromPath(filename),
							"From Taco Class",
							null,	//	No heritance
							new Vector(),
							new Vector(),
							new Vector(),
							new Vector(),
							new Vector(),
							cppLang,
						 	pgs.extractPathFromFullPath());

		server.deviceImpl = 3;
		System.out.println("Taco2Tango created");
	}
	
//=======================================================================
/**
 *	Extract a PogoClass object for TANGO from a TACO class file.
 *
 *	@return PogoClass object extracted.
 */
//=======================================================================
	public PogoClass getPogoClass()
						throws	FileNotFoundException,
								SecurityException,
								IOException,
								PogoException
	{
		//	Open File and read it
		//--------------------------------------
		PogoString	pgs = new PogoString(PogoUtil.readFile(filename));

		extractCommands(pgs);
		extractStates(pgs);
		extractProperties(pgs, tacoAddDevProps);
		extractProperties(pgs, tacoAddClassProps);
		server.title    = server.class_name;
		server.language = cppLang;
		server.deviceImpl = 3;
		return server;
	}
	
	
//=======================================================================
/**
 *	Extract a Commands for TANGO from a TACO class file.
 *
 *	@param pgs string read from source file.
 */
//=======================================================================
	private void extractStates(PogoString pgs)
	{
		//	search states
		//----------------------
		for (int i=0 ; i<stateStr.length ; i++)
		{
			if (pgs.str.indexOf(stateStr[i]) > 0)		//	State found 
			{
				//	Search tango corespondance
				//--------------------------------
				String	s1 = stateStr[i].substring("DEV".length());
				for (int j=0 ; j<TangoStatesArray.length ; j++)
				{
					String	s2 = TangoStatesArray[j].substring(
												"Tango::".length());
					if (s1.equals(s2))
					{
						server.states.addElement(
								new DevState(TangoStatesArray[j],""));
						break;
					}
				}
			}
		}	

	}
//=======================================================================
/**
 *	Extract a Commands for TANGO from a TACO class file.
 *
 *	@param pgs string read from source file.
 */
//=======================================================================
	private void extractCommands(PogoString pgs) throws PogoException
	{
		//	Extract the Command structure
		//-------------------------------------------
		int	start;
		if ((start=pgs.str.indexOf(tacoAddCommands))<0)
		{
			throw new PogoException(tacoAddCommands +
											" not found in " + filename);
		}
		start   = pgs.inMethod(start);

		PogoString	cmdStruct =
				new PogoString(pgs.extractMethodCore(start));

		//	Extract each command to build an Pogo Command object
		//-----------------------------------------------------------
		int end = 0;
		while ((start=cmdStruct.inMethod(end))>=0)
		{
			end = cmdStruct.outMethod(start);
			PogoString	line = 
				new PogoString(cmdStruct.str.substring(start, end).trim());
			
			String[]	fields = line.getFields();
			String	tacoCmd    = fields[0];
			String	tacoArgin  = getTangoType(fields[2]);
			String	tacoArgout = getTangoType(fields[3]);
			if (!tacoCmd.equals("DevState")  &&
				!tacoCmd.equals("DevStatus"))
					server.commands.addElement(new Cmd(tacoCmd, 
										tacoCmd+"Cmd",
										tacoArgin, tacoArgout,
										"", "", ""));
		}
	}
//-------------------------------------------------------------------
//-------------------------------------------------------------------
	private void extractProperties(PogoString pgs, String propertyType)
	{
		//	Extract the property structure
		//-------------------------------------------
		int	start;
		if ((start=pgs.str.indexOf(propertyType))<0)
		{
			System.out.println(propertyType + " not found in " + filename);
			return;
		}
		start   = pgs.inMethod(start);

		PogoString	propStruct =
				new PogoString(pgs.extractMethodCore(start));

		//	Extract each command to build an Pogo Command object
		int end = 0;
		while ((start=propStruct.inMethod(end))>=0)
		{
			end = propStruct.outMethod(start);
			PogoString	line = 
				new PogoString(propStruct.str.substring(start, end));
			
			String[]	fields = line.getFields();
			String	propname   = fields[0];
			String	proptype   = getPropTangoType(fields[1]);
			System.out.println(propname + ": " + proptype);
			if (propertyType.equals(tacoAddDevProps))
				server.dev_properties.addElement(new Property(propname, proptype, ""));
			else
			if (propertyType.equals(tacoAddClassProps))
				server.class_properties.addElement(new Property(propname, proptype, ""));
		}
	}
//-------------------------------------------------------------------
//-------------------------------------------------------------------
	private String getPropTangoType(String tacoType)
	{
		if (!tacoType.startsWith("D_VAR_"))
			return getTangoType(tacoType);
		else
		for (int i=0 ; i<typePropStr.length ; i+=2)
			if (typePropStr[i].equals(tacoType))
				return typePropStr[i+1];
		// If not found
		return tacoType;
	}
//-------------------------------------------------------------------
//-------------------------------------------------------------------
	private String getTangoType(String tacoType)
	{
		for (int i=0 ; i<typeStr.length ; i+=2)
			if (typeStr[i].equals(tacoType))
				return typeStr[i+1];
		// If not found
		return tacoType;
	}
//-------------------------------------------------------------------
//-------------------------------------------------------------------

private String	tacoAddCommands   = "DevCommandListEntry";
private String	tacoAddDevProps   = "res_object[]";
private String	tacoAddClassProps = "res_class[]";

static private String[] typeStr = {

	"D_VOID_TYPE",		"Tango::DEV_VOID",
	"D_BOOLEAN_TYPE",	"Tango::DEV_BOOLEAN",
	"D_USHORT_TYPE",	"Tango::DEV_USHORT",
	"D_SHORT_TYPE",		"Tango::DEV_SHORT",
	"D_ULONG_TYPE",		"Tango::DEV_ULONG",
	"D_LONG_TYPE",		"Tango::DEV_LONG",
	"D_FLOAT_TYPE",		"Tango::DEV_FLOAT",
	"D_DOUBLE_TYPE",	"Tango::DEV_DOUBLE",
	"D_STRING_TYPE",	"Tango::DEV_STRING",
	
	"D_VAR_CHARARR",	"Tango::DEVVAR_CHARARRAY",
	"D_VAR_STRINGARR",	"Tango::DEVVAR_STRINGARRAY",
	"D_VAR_USHORTARR", 	"Tango::DEVVAR_USHORTARRAY",
	"D_VAR_SHORTARR",	"Tango::DEVVAR_SHORTARRAY",
	"D_VAR_ULONGARR",	"Tango::DEVVAR_ULONGARRAY",
	"D_VAR_LONGARR",	"Tango::DEVVAR_LONGARRAY",
	"D_VAR_FLOATARR",	"Tango::DEVVAR_FLOATARRAY",
	"D_VAR_DOUBLEARR",	"Tango::DEVVAR_DOUBLEARRAY"
};
static private String[] typePropStr = {
	"D_VAR_STRINGARR",	"vector<string>",
	"D_VAR_SHORTARR",	"vector<short>",
	"D_VAR_LONGARR",	"vector<long>",
	"D_VAR_FLOATARR",	"vector<float>",
	"D_VAR_DOUBLEARR",	"vector<double>"
};

static private String[] stateStr = {
	"DEVUNKNOWN",
	"DEVOFF",
	"DEVON",
	"DEVCLOSE",
	"DEVOPEN",
	"DEVLOW",
	"DEVHIGH",
	"DEVINSERTED",
	"DEVEXTRACTED",
	"DEVMOVING",
	"DEVWARMUP",
	"DEVINIT",
	"DEVSTANDBY",
	"DEVSERVICE",
	"DEVRUN",
	"DEVLOCAL",
	"DEVREMOTE",
	"DEVAUTOMATIC",
	"DEVRAMP",
	"DEVTRIPPED",
	"DEVHV_ENABLE",
	"DEVBEAM_ENABLE",
	"DEVBLOCKED",
	"DEVFAULT",
	"DEVSTARTING",	
	"DEVSTOPPING",
	"DEVSTARTREQUESTED",
	"DEVSTOPREQUESTED",
	"DEVPOSITIVEENDSTOP",
	"DEVNEGATIVEENDSTOP",
	"DEVBAKEREQUESTED",
	"DEVBAKEING",
	"DEVSTOPBAKE",
	"DEVFORCEDOPEN",
	"DEVFORCEDCLOSE",
	"DEVOFFUNAUTHORISED",
	"DEVONNOTREGULAR",
	"DEVRESETTING",
	"DEVFORBIDDEN",
	"DEVOPENING",
	"DEVCLOSING",
	"DEVUNDEFINED",
	"DEVCOUNTING",
	"STOPPED",
	"RUNNING",
	"DEVALARM",
	"DEVDISABLED",
	"DEVSTANDBY_NOT_REACHED",
	"DEVON_NOT_REACHED"
};



//-------------------------------------------------------------------
//-------------------------------------------------------------------
	public static void main(java.lang.String[] args)
	{
		try
		{
			Taco2Tango	t2t = new Taco2Tango("/segfs/tango/tools/pogo/generated/taco/ipc.c");
			t2t.getPogoClass();
		}
		catch(Exception e)
		{
			System.out.println("POGO Startup Failed.");
			System.out.println(e);
		}
	}
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
