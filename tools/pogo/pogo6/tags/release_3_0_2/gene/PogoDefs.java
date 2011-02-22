//+======================================================================
// $Source$
//
// Project:   Tango Device Server
//
// Description:	java source code for the Pogo definitions .
//
// $Author$
//
// $Version$
//
// $Log$
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
// Revision 1.1  1999/12/07  16:03:58  verdier
// Initial revision
//
//
// Copyright 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================


package pogo.gene;


/**
 *	Many definitions for Pogo package.
 *
 * @author	$Author$
 * @version	$Revision$
 */
public interface PogoDefs 
{
	public int	errDetected	=	-1;
	//	Language definitions
	//----------------------------------------
	public int	pogoLang	=	0;
	public int	javaLang	=	1;
	public int	cppLang		=	2;

	//	File type definitions
	//----------------------------------------
	public int	dataFile	=	0;
	public int	javaFile	=	1;
	public int	cppFile		=	2;
	public int	readFile	=	0;
	public int	writeFile	=	1;


	//	Extention file definitions
	//----------------------------------------
	public String	dataExtention 	= new String(".pogo");
	public String	javaExtention 	= new String(".java");
	public String	cppExtention 	= new String(".cpp");
	public String	cppDefExtention = new String(".h");
	public String	cppNameSpace	= new String("Tango::");

	//	Key Word definitions
	//----------------------------------------
	public String	mainSignature	= "	public static void main(String[] argv)";
	public String	classDescRes 	= new String("Class Description:");
	public String	statesDescRes 	= new String("Device States Description:");
	public String	projectTitleRes = new String("project :");
	public String	authorRes       = new String("Author:");
	public String	revisionRes     = new String("Revision:");
	public String	pageTitleRes    = new String("Page Title");
	public String	outputFiles 	= new String("OutputFiles:");
	public String	languageRes 	= new String("Language:");
	public String	dataStartStates	= new String("Device States:\n");
	public String	dataStartCmd 	= new String("Commands And Parameters:\n");
	public String	dataCommands 	= new String("addElement");
	public String	javaAddCommands = new String("command_list.addElement");
	public String	cppAddCommands 	= new String("command_list.push_back");
	public String	NEW_STR			= new String("new ");
	public String	startGeneTag 	= new String("Re-Start of Generated Code");
	public String	endGeneTag 		= new String("End of Generated Code");
	public String	javaAddAttrib   = new String("att_list.addElement");
	public String	cppAddAttrib    = new String("att_list.push_back");
	public String 	startPropStr	=
				"	//--------- Start of properties data members ----------";
	public String	endPropStr	=
				"	//--------- End of properties data members ----------";
	public String 	startAttrStr	=
				"	//--------- Start of attributes data members ----------";
	public String	endAttrStr	=
				"	//--------- End of attributes data members ----------";
	public String 	startStateStr	=
				"//--------- Start of States Description ----------";
	public String 	endStateStr	=
				"//--------- End of States Description ----------";



	public String	commentSeparator =
				"//=========================================================\n";


	//	Templates definitions
	//----------------------------------------
	public String	templateFile		= new String("DevServ");
	public String	templateClass		= new String("TemplateDevServ");
	public String	templateClassCmd	= new String("TemplateClassCmd");
	public String	templateCmd			= new String("DevTemplateCmd");
	public String	templateExecuteCmd	= new String("TemplateExecuteCmd");
	public String	templateBlock		= new String("TemplateBlock");


	public final int	classProperty	= 0;
	public final int	devProperty		= 1;

	public final int	STATE		= 0;
	public final int	STATUS		= 1;
	public final int	NOT_OVERRIDE		= 0;
	public final int	OVERRIDE			= 1;
	public final int	ALREADY_OVERRIDED	= 2;


	public final int	Tango_TYPE_UNKNOWN	= -1;
	public final int	Tango_CONST_DEV_STRING	= -2;

	final int	SERVER       = 0;
	final int	CLIENT_PROXY = 1;
	

	public final int	Tango_ON		= 0;
	public final int	Tango_OFF		= 1;
	public final int	Tango_CLOSE		= 2;
	public final int	Tango_OPEN		= 3;
	public final int	Tango_INSERT	= 4;
	public final int	Tango_EXTRACT	= 5;
	public final int	Tango_MOVING	= 6;
	public final int	Tango_STANDBY	= 7;
	public final int	Tango_FAULT		= 8;
	public final int	Tango_WARMUP	= 9;
	public final int	Tango_RUNNING	= 10;
	public final int	Tango_ALARM		= 11;
	public final int	Tango_DISABLE	= 12;
	public final int	Tango_UNKNOWN	= 13;



	public static String[]	TangoStatesArray = {
			"Tango::ON",
			"Tango::OFF",
			"Tango::CLOSE",
			"Tango::OPEN",
			"Tango::INSERT",
			"Tango::EXTRACT",
			"Tango::MOVING",
			"Tango::STANDBY",
			"Tango::FAULT",
			"Tango::INIT",
			"Tango::RUNNING",
			"Tango::ALARM",
			"Tango::DISABLE",
			"Tango::UNKNOWN"
	};



	//	Attribute definitions
	//----------------------------
	public static String[]	AttrTypeArray = {
			"SCALAR",
			"SPECTRUM",
			"IMAGE"
		};
	public final int	ATTR_SCALAR    = 0;
	public final int	ATTR_SPECTRUM  = 1;
	public final int	ATTR_IMAGE     = 2;

	public static String[]	AttrDataArray = {
			"Tango::DEV_SHORT",
			"Tango::DEV_LONG",
			"Tango::DEV_DOUBLE",
			"Tango::DEV_STRING"
		};

	public static String[]	AttrRWtypeArray = {
			"READ",
			"WRITE",
			"READ_WRITE",
			"READ_WITH_WRITE"
		};
	public final int	ATTR_READ            = 0;
	public final int	ATTR_WRITE           = 1;
	public final int	ATTR_READ_WRITE      = 2;
	public final int	ATTR_READ_WITH_WRITE = 3;


	public final int	AttrPropLabel		= 0;
	public final int	AttrPropUnit		= 1;
	public final int	AttrPropStdUnit		= 2;
	public final int	AttrPropDispUnit	= 3;
	public final int	AttrPropFormat		= 4;
	public final int	AttrPropMaxValue	= 5;
	public final int	AttrPropMinValue	= 6;
	public final int	AttrPropMaxAlarm	= 7;
	public final int	AttrPropMinAlarm	= 8;
	public final int	AttrPropDescription	= 9;




	final String	readAttrProto1		= new String(
	"/**\n *	Built attributes list.\n */\n	void command_factory();\n");

	final String	readAttrProto2		= new String(
	"/**\n"+
	" *	Hardware acquisition for attributes.\n"+
	" */\n"+
	"	virtual void read_attr_hardware(vector<long> &attr_list);\n");

	final String	readAttrProto3		= new String(
	"/**\n"+
	" *	Extract real attribute values from hardware acquisition result.\n"+
	" */\n"+
	"	virtual void read_attr(Tango::Attribute &attr);\n");

	final String	writeAttrProto		= new String(
	"/**\n"+
	" *	Write attribute values to hardware.\n"+
	" */\n"+
	"	virtual void write_attr_hardware(vector<long> &attr_list);\n");

	/**
	 *	Description for Init command.
	 */
	final String	init_desc = 
			"This commands re-initialise a device" +
			" keeping the same network connection.<Br>\n" +
 			"After an Init command executed on a device," +
			" it is not necessary for client to re-connect to the device.<Br>\n"+
 			"This command first calls the device <i> delete_device() </i>" +
			"method and then execute its <i> init_device()</i>" +
			" method.<Br>\n" +
			"For C++ device server, all the memory allocated in the " +
			"<i> nit_device() </i> method must be freed in the " +
			"<i> delete_device() </i> method.<Br>\n" +
			"The language device desctructor automatically calls the " +
			"<i> delete_device() </i> method.";

	/**
	 *	Description for State command.
	 */
	final String	state_desc = 
		"This command gets the device state (stored in its <i>device_state</i>"+
		" data member) and returns it to the caller.";
	/**
	 *	Description for Status command.
	 */
	final String	status_desc = 
		"This command gets the device status (stored in its <i>device_status</i>"+
		" data member) and returns it to the caller.";
}



//-----------------------------------------------------------------------------
/* end of $Source$ */
