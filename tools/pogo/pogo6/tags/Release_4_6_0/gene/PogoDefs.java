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
// Revision 3.9  2006/06/26 09:22:47  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.8  2005/10/12 13:50:45  pascal_verdier
// Fix a bug in adding pdf or doc file download.
//
// Revision 3.7  2005/04/13 06:54:09  pascal_verdier
// Case fault correction.
//
// Revision 3.6  2005/03/02 10:27:10  pascal_verdier
// Managing Super Classes and inherited classes.
//
// Revision 3.5  2005/01/28 12:43:53  pascal_verdier
// Bug with spaces/tab fixed.
//
// Revision 3.4  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.3  2004/09/02 06:41:34  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
//
// Revision 3.2  2004/08/26 07:19:30  pascal_verdier
// Attributes are now generated as class.
//
// Revision 3.1  2003/09/10 08:11:30  pascal_verdier
// Minor bugs fixed.
// HTML doc generated with more details.
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
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
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
	public final static String	WWWdeviceServers=
			"http://www.esrf.fr/computing/cs/tango/tango_doc/ds_doc/";
	public final static String	tangoDeviceImpl  = "Device_3Impl";
	
	public final static int	CREATING  = 0;
	public final static int	MODIFYING = 1;

	//	Device impl revision used in each language
	public static final int	cppDeviceImpl	=	3;
	public static final int	javaDeviceImpl	=	1;
	//	Language definitions
	//----------------------------------------
	public static final int	javaLang	=	0;
	public static final int	cppLang		=	1;

	//	File type definitions
	//----------------------------------------
	public static final int	dataFile	=	0;
	public static final int	javaFile	=	1;
	public static final int	cppFile		=	2;
	public static final int	readFile	=	0;
	public static final int	writeFile	=	1;


	//	Extention file definitions
	//----------------------------------------
	public static final String	javaExtention 	= ".java";
	public static final String	cppExtention 	= ".cpp";
	public static final String	cppDefExtention = ".h";
	public static final String	cppNameSpace	= "Tango::";

	//	Key Word definitions
	//----------------------------------------
	public static final String	mainSignature	= "public static void main(String[] argv)";
	public static final String	classDescRes 	= "Class Description:";
	public static final String	statesDescRes 	= "Device States Description:";
	public static final String	projectTitleRes = "project :";
	public static final String	authorRes       = "Author:";
	public static final String	revisionRes     = "Revision:";
	public static final String	pageTitleRes    = "Page Title";
	public static final String	outputFiles 	= "OutputFiles:";
	public static final String	languageRes 	= "Language:";
	public static final String	dataStartStates	= "Device States:\n";
	public static final String	dataStartCmd 	= "Commands And Parameters:\n";
	public static final String	dataCommands 	= "addElement";
	public static final String	javaAddCommands = "command_list.addElement";
	public static final String	cppAddCommands 	= "command_list.push_back";
	public static final String	NEW_STR			= "new ";
	public static final String	startGeneTag 	= "Re-Start of Generated Code";
	public static final String	endGeneTag 		= "End of Generated Code";
	public static final String	javaAddAttrib   = "att_list.addElement";
	public static final String	cppAddAttrib    = "att_list.push_back";
	public static final String 	startPropStr	=
				"//--------- Start of properties data members ----------";
	public static final String	endPropStr	=
				"//--------- End of properties data members ----------";
	public static final String 	startAttrStr	=
				"//--------- Start of attributes data members ----------";
	public static final String	endAttrStr	=
				"//--------- End of attributes data members ----------";
	public static final String 	startStateStr	=
				"//--------- Start of States Description ----------";
	public static final String 	endStateStr	=
				"//--------- End of States Description ----------";



	public static final String	commentSeparator =
				"//=========================================================\n";


	//	Templates definitions
	//----------------------------------------
	public String	templateFile		= "DevServ";
	public String	templateClass		= "TemplateDevServ";
	public String	templateClassCmd	= "TemplateClassCmd";
	public String	templateCmd			= "DevTemplateCmd";
	public String	templateExecuteCmd	= "TemplateExecuteCmd";
	public String	templateBlock		= "TemplateBlock";


	public static final int	classProperty	= 0;
	public static final int	devProperty		= 1;

	public static final int	STATE		= 0;
	public static final int	STATUS		= 1;
	public static final int	NOT_OVERRIDE		= 0;
	public static final int	OVERRIDE			= 1;
	public static final int	ALREADY_OVERRIDED	= 2;


	public static final int	Tango_TYPE_UNKNOWN	= -1;
	public static final int	Tango_CONST_DEV_STRING	= -2;

	static final int	SERVER       = 0;
	static final int	CLIENT_PROXY = 1;
	

	public static final int	Tango_ON		= 0;
	public static final int	Tango_OFF		= 1;
	public static final int	Tango_CLOSE		= 2;
	public static final int	Tango_OPEN		= 3;
	public static final int	Tango_INSERT	= 4;
	public static final int	Tango_EXTRACT	= 5;
	public static final int	Tango_MOVING	= 6;
	public static final int	Tango_STANDBY	= 7;
	public static final int	Tango_FAULT		= 8;
	public static final int	Tango_WARMUP	= 9;
	public static final int	Tango_RUNNING	= 10;
	public static final int	Tango_ALARM		= 11;
	public static final int	Tango_DISABLE	= 12;
	public static final int	Tango_UNKNOWN	= 13;


	public final static int	CLASS_ROOT = -1;
	public final static int	PROPERTY = 0;
	public final static int	CLASS_PROPERTIES = 0;
	public final static int	DEV_PROPERTIES   = 1;
	public final static int	COMMANDS         = 2;
	public final static int	ATTRIBUTES       = 3;
	public final static int	STATES           = 4;
	public final static int	STRING_NODE      = 5;


	public static final String[]	TangoStatesArray = {
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
	public static final String[]	AttrTypeArray = {
			"SCALAR",
			"SPECTRUM",
			"IMAGE"
		};
	public static final int	ATTR_SCALAR    = 0;
	public static final int	ATTR_SPECTRUM  = 1;
	public static final int	ATTR_IMAGE     = 2;

	public static final String[]	AttrDataArray = {
			"Tango::DEV_BOOLEAN",
			"Tango::DEV_UCHAR",
			"Tango::DEV_SHORT",
			"Tango::DEV_USHORT",
			"Tango::DEV_LONG",
			"Tango::DEV_FLOAT",
			"Tango::DEV_DOUBLE",
			"Tango::DEV_STRING"
		};

	public static final String[]	AttrRWtypeArray = {
			"READ",
			"WRITE",
			"READ_WRITE",
			"READ_WITH_WRITE"
		};
	public static final int	ATTR_READ            = 0;
	public static final int	ATTR_WRITE           = 1;
	public static final int	ATTR_READ_WRITE      = 2;
	public static final int	ATTR_READ_WITH_WRITE = 3;


	public static final int	AttrPropLabel		= 0;
	public static final int	AttrPropUnit		= 1;
	public static final int	AttrPropStdUnit		= 2;
	public static final int	AttrPropDispUnit	= 3;
	public static final int	AttrPropFormat		= 4;
	public static final int	AttrPropMaxValue	= 5;
	public static final int	AttrPropMinValue	= 6;
	public static final int	AttrPropMaxAlarm	= 7;
	public static final int	AttrPropMinAlarm	= 8;
	public static final int	AttrPropDescription	= 9;



	/**
	 *	Template for method separator.
	 */
	static final String	cppMethodSeparatorTemplate = 
"//+----------------------------------------------------------------------------\n"+
"//\n"+
"// method : 		CLASS::METHOD\n"+
"// \n"+
"// description : 	DESCRIPTION\n"+
"//\n"+
"//-----------------------------------------------------------------------------\n";
	/**
	 *	Template for read attribute method signature
	 */
	static final String	readAttSigTemplate =
		"/**\n"+
		" *	Extract real attribute values for ATTRIBUTE acquisition result.\n"+
		" */\n"+
		"	virtual void CLASS::METHOD(Tango::Attribute &attr)";
	/**
	 *	Template for write attribute method signature
	 */
	static final String	writeAttSigTemplate =
		"/**\n"+
		" *	Write ATTRIBUTE attribute values to hardware.\n"+
		" */\n"+
		"	virtual void CLASS::METHOD(Tango::WAttribute &attr)";

	/**
	 *	Template for alowed attribute method signature
	 */
	static final String	allowedAttSigTemplate =
		"/**\n"+
		" *	Read/Write allowed for ATTRIBUTE attribute.\n"+
		" */\n"+
		"	virtual bool CLASS::METHOD(Tango::AttReqType type)";
	/**
	 *	Template for alowed Command method signature
	 */
	static final String	allowedCmdSigTemplate =
		"/**\n"+
		" *	Execution allowed for COMMAND command.\n"+
		" */\n"+
		"	virtual bool CLASS::METHOD(const CORBA::Any &any)";
	/**
	 *	Template for read attribute hardware method signature
	 */
	static final String	readAttrhardwareTemplate =
		"/**\n"+
		" *	Hardware acquisition for attributes.\n"+
		" */\n"+
		"	virtual void CLASS::read_attr_hardware(vector<long> &attr_list)";



	/**
	 *	Description for Init command.
	 */
	static final String	init_desc = 
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
	static final String	state_desc = 
		"This command gets the device state (stored in its <i>device_state</i>"+
		" data member) and returns it to the caller.";
	/**
	 *	Description for Status command.
	 */
	static final String	status_desc = 
		"This command gets the device status (stored in its <i>device_status</i>"+
		" data member) and returns it to the caller.";

	static final String endNamespace = "\n}	// namespace";
}



//-----------------------------------------------------------------------------
/* end of $Source$ */
