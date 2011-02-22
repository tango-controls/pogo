//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Pogo class definition .
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.8  2006/06/26 09:24:53  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.7  2005/03/30 09:13:32  pascal_verdier
// Command line has been added.
//
// Revision 3.6  2005/03/11 15:04:52  pascal_verdier
// Pathes have been changed.
//
// Revision 3.5  2004/10/21 06:54:47  pascal_verdier
// Check for non double item definitions
// for add, edit and clone item.
//
// Revision 3.4  2004/09/24 11:17:41  pascal_verdier
// Automatic revision number update at jar genaration.
//
// Revision 3.3  2004/09/07 12:02:45  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.2  2004/09/02 06:43:12  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
//
// Revision 3.1  2004/08/26 07:25:35  pascal_verdier
// Attributes are now generated as class.
// Look and field changed.
//
// Revision 3.0  2003/04/29 10:42:14  pascal_verdier
// TANGO 3.0 compatibility
// little bugs fixed.
//
// Revision 1.33  2003/01/16 14:32:36  verdier
// Tango classe files detected for open JFileChooser.
//
// Revision 1.32  2002/10/03 13:54:27  verdier
// Pogo has been used without known bug.
// Put class description as class property.
//
// Revision 1.31  2002/04/25 12:05:08  verdier
// IDL 2 implemented for c++ servers
//
// Revision 1.30  2002/02/06 15:21:23  verdier
// Java code generation updated.
//
// Revision 1.26  2001/12/18 10:13:30  verdier
// Attribute user default property code added.
//
// Revision 1.25  2001/11/09 09:46:57  verdier
// Many bugs fixed.
//
// Revision 1.24  2001/04/04 12:22:58  verdier
// Property management added for cpp.
//
// Revision 1.23  2000/10/24 06:21:22  verdier
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
// Revision 1.20  2000/07/07 13:30:10  verdier
// Utilities added after first users.
//
// Revision 1.18  2000/06/20 06:57:35  verdier
// Right button double click management added for :
// editing src code, creating item, editing class....
// Little bugs fixed on generation/re-read src code.
//
// Revision 1.17  2000/05/12 07:37:10  verdier
//  Attributes management added for java generation.
//
// Revision 1.16  2000/04/26 06:04:00  verdier
// The save/restore file (.pogo) does not exist anymore.
// DevStates and DevStates allowed management is now available for java.
//
// Revision 1.15  2000/04/18 08:12:47  verdier
// Management of DevStates to allow command added.
//
// Revision 1.14  2000/04/12 09:25:43  verdier
// Methods to manage attributes are now generated
//  Only if at leat one attribute exists.
//
// Revision 1.13  2000/04/11 09:35:07  verdier
// Attributes management added.
//
// Revision 1.3  2000/03/29 13:11:48  verdier
// Doc generation added.
//
// Revision 1.2  2000/03/03 09:43:00  verdier
// States management added
//
// Revision 1.1  2000/02/28 15:41:38  verdier
// Initial revision
//
//
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.appli;



public interface PogoAppliDefs 
{
	public final static String	img_path = "/pogo/img/";
	public final static int	BTN1 = 0;
	public final static int	BTN2 = 1;
	public final static int	BTN3 = 2;


	public final static int	TREE_ROOT  = 0;
	public final static int	COLLECTION = 1;
	public final static int	LEAF_ITEM  = 2;

	public final static int	RET_ERROR  = -1;
	public final static int	RET_CANCEL = 0;
	public final static int	RET_OK = 1;
	
	public final static int	OPEN_FILE = 0;
	public final static int	IMPORT_FILE = 1;
	
	public final static int	GENE_SRC = 0;
	public final static int	GENE_DOC = 1;
	public final static int	EXIT_ON_RETURN = 0;
	public final static int	DONT_EXIT_ON_RETURN = 1;

	public final static int	PALETTE_EDIT_CLASS        = 0;
	public final static int	PALETTE_CREATE_CLASS_PROP = 2;
	public final static int	PALETTE_CREATE_DEV_PROP   = 3;
	public final static int	PALETTE_CREATE_CMD        = 4;
	public final static int	PALETTE_CREATE_ATTR       = 5;
	public final static int	PALETTE_CREATE_STATE      = 6;

	public final static int	POLLING_PERIOD_MIN        = 20;	//	ms

	public final static String[]	TangoTypesArray = {
			"Tango::DEV_VOID",
			"Tango::DEV_BOOLEAN",
			"Tango::DEV_SHORT",
			"Tango::DEV_LONG",
			"Tango::DEV_FLOAT",
			"Tango::DEV_DOUBLE",
			"Tango::DEV_USHORT",
			"Tango::DEV_ULONG",
			"Tango::CONST_DEV_STRING",
			"Tango::DEV_STRING",

			"Tango::DEVVAR_CHARARRAY",
			"Tango::DEVVAR_SHORTARRAY",
			"Tango::DEVVAR_LONGARRAY",
			"Tango::DEVVAR_FLOATARRAY",
			"Tango::DEVVAR_DOUBLEARRAY",
			"Tango::DEVVAR_USHORTARRAY",
			"Tango::DEVVAR_ULONGARRAY",
			"Tango::DEVVAR_STRINGARRAY",
			"Tango::DEVVAR_LONGSTRINGARRAY",
			"Tango::DEVVAR_DOUBLESTRINGARRAY",
			"Tango::DEV_STATE"
		};

	public final static String[]	TangoPropertyTypesArray = {
			"Tango::DEV_BOOLEAN",
			"Tango::DEV_SHORT",
			"Tango::DEV_LONG",
			"Tango::DEV_FLOAT",
			"Tango::DEV_DOUBLE",
			"Tango::DEV_USHORT",
			"Tango::DEV_ULONG",
			"string",
			
			"Array of short",
			"Array of long",
			"Array of float",
			"Array of double",
			"Array of string",
		};

	public final static String[] standardCommandNames = {
			"Reset",
			"Off",
			"Warmup",
			"Standby",
			"On",
			"Start",
			"Stop",
			"Open",
			"Close",
			"Local",
			"Remote",
			"Define a Specific Command"
		};

	public static String	specif_cmd =
				standardCommandNames[standardCommandNames.length-1];

	public final static String	helpContents =
		"This help utility is not yet implemented\n\n" +
		"It will come later. Soon, may be....";
	public final static String	helpAbout =
				"                     POGO \n\n"+
				"(Program Obviously used to Generate tango Object)\n"+
				"        TANGO device server code generator.";


	public final static String change_deviceimpl_message =
		"This device server has been generated for an old TANGO release.\n"+
		"\n" +
		"Before any modification of this project, Pogo needs to generate\n" +
		"code for new attribute model.\n" +
		"Your code will be splited from :\n" +
		"          read_attr(Tango::Attribute &attr)\n"+
		"                       and\n" +
		"          write_attr_hardware(vector<long> &attr_list)\n"+
		"to the new methods generated for each attribute.\n" +
		"\n" +
		"Then you will be able to remove these two old methods.";
}
