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
// Revision 3.9  2005/03/08 10:32:56  pascal_verdier
// Bug on State Machine fixed.
//
// Revision 3.8  2005/03/02 10:27:10  pascal_verdier
// Managing Super Classes and inherited classes.
//
// Revision 3.7  2004/12/09 13:55:01  pascal_verdier
// Server language added int HTML Pages.
//
// Revision 3.6  2004/12/08 10:07:42  pascal_verdier
// Unexpected trace removed.
//
// Revision 3.5  2004/11/22 15:29:31  pascal_verdier
// Javadoc tags correction.
//
// Revision 3.4  2004/11/22 11:07:46  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.3  2004/09/07 12:00:50  pascal_verdier
// Remove CVS log messages and info from templates.
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

import java.io.*;
import java.util.*;
import fr.esrf.Tango.*;
import fr.esrf.TangoDs.*;

/**
 *	This is the most important class for pogo project.
 *	This is this class and its fields which define all DS project.
 *	That means that it is used to read, create or generate source file.
 *	Its methods are mainely to initialize PogoGlass object from source file.
 *
 * @author	$Author$
 * @version	$Revision$
 */


public class PogoClass implements PogoDefs
{
/**
 *	Project title.
 *	Mainely used to generate the documentation title.
 */
	public String			title;
/**
 *	Device server class name.
 */
	public String			class_name;
/**
 *	Classname of inheritance. If null, inherite from DeviceImpl.
 */
 	public String			inherited_from = null;
/**
 *	Device server class description.
 */
	public String			class_desc;
/**
 *	Device server template path.
 */
	public String			templates_dir;
/**
 *	Device server class properties vector.
 */
	public PropertyTable	class_properties;
/**
 *	Device server device properties vector.
 */
	public PropertyTable	dev_properties;
/**
 *	Device server commands vector.
 */
	public CmdTable			commands;
/**
 *	Device server attributes vector.
 */
	public AttribTable		attributes;
/**
 *	Device server states vector.
 */
	public DevStateTable	states;
/**
 *	Device server language.
 */
	public int				language;
/**
 *	Author Name.
 */
	public String			author;
/**
 *	Revision number as String.
 */
	public String			revision;
/**
 *	DeviceImpl version
 */
	public int				deviceImpl;
/**
 *	files to defined project.
 */
	public ProjectFiles		projectFiles;
/**
 *	True if this class is super class.
 */
	public boolean			is_superclass = false;


//=======================================================================
/**
 *	Return cpp namespace built from class_name
 */
//=======================================================================
	public String namespace()
	{
		return class_name + "_ns";
	}
//=======================================================================
/**
 *	Return cpp namespace built from class_name
 */
//=======================================================================
	public String inheritedNamespace()
	{
		return inheritedClassName() + "_ns";
	}
//=======================================================================
/**
 *	Return the inhereted class name (without full path)
 */
//=======================================================================
	public String inheritedClassName()
	{
		if (inherited_from==null)
			return tangoDeviceImpl;

		if (inherited_from.equals(tangoDeviceImpl))
			return tangoDeviceImpl;

		int	start = inherited_from.lastIndexOf("/");
		start++;
		int end = inherited_from.lastIndexOf(".");
		String	classname;
		if (end>start)
			classname = inherited_from.substring(start, end);
		else
			classname = inherited_from.substring(start);
		return classname;
	}
//=======================================================================
/**
 *	Return the inhereted class  path
 */
//=======================================================================
	public String inheritedClassPath()
	{
		String	classname = "";
		if (inherited_from==null)
			return classname;

		if (inherited_from.equals(tangoDeviceImpl))
			return classname;

		int end = inherited_from.lastIndexOf("/");
		if (end>0)
			classname = inherited_from.substring(0, end);
		else
			classname = inherited_from;
		return classname;
	}
//=======================================================================
/**
 *	Constructor for Pogo Class definition from main fields in parameters.
 *
 *	@param	className		Device server class name
 *	@param	classDesc		Device server class description.
 *	@param	classPropVect	Class  Properties vector
 *	@param	devPropVect		Device Properties vector
 *	@param	cmdVect			Device server commands vector.
 *	@param	attrVect		Device server attributes vector.
 *	@param	statesVector	Device server states vector.
 *
 *	@throws	PogoException	If a synthax error occured on input file.
 */
//=======================================================================
	public PogoClass(String className,	
					String inherited_from,
					String classDesc,
					Vector classPropVect,					 
					Vector devPropVect,  					 
					Vector cmdVect, 	 					 
					Vector attrVect,	 					 
					Vector statesVector, 					 
					int    language,	 					 
					String path)		 					 
				throws PogoException
	{
		class_name = new String(className);
		this.inherited_from = new String(inherited_from);
		if (classDesc!=null)
			class_desc = new String(classDesc);
		author       = new String("");
		revision     = new String("");

		class_properties = new PropertyTable(classPropVect);
		dev_properties   = new PropertyTable(devPropVect);
		commands   = new CmdTable(cmdVect);
		attributes = new AttribTable(attrVect);
		states     = new DevStateTable(statesVector);
		

		//	Set a deafault output language
		//--------------------------------------------------
		this.language = language;
		projectFiles = new ProjectFiles(path, class_name, language);
		//  ICI 
		//deviceImpl = PogoUtil.deviceImplRevisionNumber(projectFiles.getServer_h());
		if (language==cppLang)
			deviceImpl = cppDeviceImpl;
		else
			deviceImpl = javaDeviceImpl;

		//	Get the template directory from property
		//--------------------------------------------------
		if ((templates_dir=System.getProperty("TEMPL_HOME"))==null)
			throw new PogoException("No Template Property (TEMPL_HOME) Fixed !");
	}
//=======================================================================
/**
 *	Constructor for Pogo Class definition from main fields in parameters.
 *
 *	@param	sd			This server properties (name, desc, title,...).
 *	@param	language	Language used.
 *	@param	path		Path to read file.
 *	@throws	PogoException	If a synthax error occured on input file.
 */
//=======================================================================
	public PogoClass(ServerDefinitions sd, int language, String path)
		throws PogoException
	{
		class_name     = sd.name;
		inherited_from = sd.inherited_from;
		class_desc = sd.description;
		title      = sd.project_title;
		author     = "";
		revision   = "";

		class_properties = new PropertyTable();
		dev_properties   = new PropertyTable();
		commands   = new CmdTable();
		attributes = new AttribTable();
		states     = new DevStateTable();

		//	Set a deafault output language
		//--------------------------------------------------
		this.language = language;
		projectFiles = new ProjectFiles(path, class_name, language);
		//  ICI 
		//deviceImpl = PogoUtil.deviceImplRevisionNumber(projectFiles.getServer_h());
		if (language==cppLang)
			deviceImpl = cppDeviceImpl;
		else
			deviceImpl = javaDeviceImpl;

		//	Get the template directory from property
		//--------------------------------------------------
		if ((templates_dir=System.getProperty("TEMPL_HOME"))==null)
			throw new PogoException("No Template Property (TEMPL_HOME) Fixed !");
	}
//=======================================================================
/**
 *	Constructor for Pogo Class definition from siource file.
 *
 *	@param	filename	Input file name.
 *
 *	@throws	PogoException	If a synthax error occured on input file.
 *	@throws	FileNotFoundException
 *	@throws	IOException
 *	@throws	PogoException
 */
//=======================================================================
	public PogoClass(String filename) throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		projectFiles = new ProjectFiles(filename);
		//System.out.println(projectFiles);

		//	Default initialization
		//-------------------------------
		author   = new String("");
		revision = new String("");

		//	Get the template directory from property
		//--------------------------------------------------
		if ((templates_dir=System.getProperty("TEMPL_HOME"))==null)
			throw new PogoException("No Template Property (TEMPL_HOME) Fixed !");

		//	Get Other info from files
		//--------------------------------------------------
		initializePogoFromSrcFiles();
	}
//=======================================================================
/**
 *	Initialize Pogo struct From source Files
 *
 *	@throws	PogoException	If a synthax error occured on input file.
 *	@throws	FileNotFoundException
 *	@throws	IOException
 *	@throws	PogoException
 */
//=======================================================================
	private void initializePogoFromSrcFiles()
							throws	FileNotFoundException,
									SecurityException,
									IOException,
									PogoException
	{
		//	Set the pogo properties from input args
		//--------------------------------------------------
		class_name   = projectFiles.getClassName();
		language     = projectFiles.getLanguage();

		//	fixe description file for server
		String	serverDescriptionFile;
		if (language==cppLang)
			serverDescriptionFile = projectFiles.getServer_h();
		else
			serverDescriptionFile = projectFiles.getServer();

		//	fixe description file for server
		String	classDescriptionFile;
		if (language==cppLang)
			classDescriptionFile = projectFiles.getServerClass_h();
		else
			classDescriptionFile = projectFiles.getServerClass();

		//	Get the device impl version
		deviceImpl = javaDeviceImpl;
		if (language==cppLang)
		{
			deviceImpl = PogoUtil.deviceImplRevisionNumber(serverDescriptionFile);
			System.out.println("Server inherits from Device_" + 
												deviceImpl + "Impl class");
		}
		
		//	Get commands before test of inheritance
		commands = new CmdTable(projectFiles.getServerClass(), deviceImpl);
		commands.getDescriptions(serverDescriptionFile,
						projectFiles.getServerClass(), language);
		if (language==cppLang)
		{
			if (deviceImpl>=3)
			{
				inherited_from = PogoUtil.getInheritance(class_name, serverDescriptionFile);
				is_superclass  = PogoUtil.checkIfSuperclass(serverDescriptionFile, commands);
				System.out.println("This class is " +	
							((is_superclass)? "" : "NOT" )+ " a super class");
				System.out.println("Server inherits " + inherited_from  + " class");
			}
			System.out.println("Server is a Device_" +  deviceImpl + "Impl object");
		}
		else
			inherited_from = tangoDeviceImpl;

		if (language==cppLang && deviceImpl>=3)
			commands.setAllowedState(class_name, projectFiles.getAllowed(), is_superclass);

		//	Get States
		states = new DevStateTable(serverDescriptionFile, language);

		//	Get Attributes and set state to allow attributes
		attributes = new AttribTable(projectFiles, language);
		if (language==cppLang && deviceImpl>=3)
			attributes.setAllowedState(class_name, projectFiles.getAllowed(), is_superclass);

		//	Get the project title
		//------------------------------------
		getTheProjectTitle(serverDescriptionFile);

		//	Get the Class description
		//------------------------------------
		getTheClassDescription(serverDescriptionFile);

		//	get if dev_state and/or dev_status are overrided
		//--------------------------------------------------
		getIfOverrided(serverDescriptionFile);

		//	get properties for class and device			
		class_properties = new PropertyTable(classDescriptionFile, classProperty, language);
		dev_properties   = new PropertyTable(serverDescriptionFile, devProperty, language);
	}
//=======================================================================
/**
 *	Extract if dev_state and dev_status are overrided From File
 *
 *	@param	filename	Input file name to initialize object.
 *
 *	@throws	FileNotFoundException
 *	@throws	IOException
 *	@throws	SecurityException
 */
//=======================================================================
	private void getIfOverrided(String filename)
							throws	FileNotFoundException,
									SecurityException,
									IOException
	{
		//	Read the description file
		//---------------------------------
		PogoString pgs = new PogoString(PogoUtil.readFile(filename));

		//	Search if comand's method exists
		//------------------------------------------
		for (int i=0 ; i<commands.size() ; i++)
		{
			Cmd		cmd = commands.cmdAt(i);
			if (cmd.virtual_method==true)
			{
				String	cppLine = cmd.buildCppCmdProtypesLine();
				if (pgs.str.indexOf(cppLine)>0)
					cmd.override_method = ALREADY_OVERRIDED;
				else
				{
					cppLine = cmd.buildCppCmdProtypesLineNoTab();
					if (pgs.str.indexOf(cppLine)>0)
						cmd.override_method = ALREADY_OVERRIDED;
					else
					{
						String javaLine = cmd.buildJavaExecCmdMethodSignature(SERVER);
						if (pgs.str.indexOf(javaLine)>0)
							cmd.override_method = ALREADY_OVERRIDED;
					}
				}
			}
			//System.out.println(cmd + ".overrided = " + cmd.override_method);
		}
	}
//=======================================================================
/**
 *	Extract Project Title From File
 *
 *	@param	filename	Input file name to initialize object.
 *
 *	@throws	FileNotFoundException
 *	@throws	IOException
 *	@throws	SecurityException
 */
//=======================================================================
	private void getTheProjectTitle(String filename)
							throws	FileNotFoundException,
									SecurityException,
									IOException
	{
		//	Open File and read it
		//--------------------------------------
		String str = PogoUtil.readFile(filename);
		
		int	start, end;
		
		if ((start=str.indexOf(projectTitleRes))<0)
		{
			System.out.println("WARNING: '"+projectTitleRes+ "' Not Found in " +filename);
			return;			//	No title found
		}
		start += projectTitleRes.length();
		end    = str.indexOf("\n", start);
		title  = new String(str.substring(start, end).trim());
		
		//	Get Athor's name
		//-------------------------
		if ((start=str.indexOf(authorRes))<0)
			return;
		start += authorRes.length();
		end    = str.indexOf("$", start);
		author = new String(str.substring(start, end).trim());

		//	Get revision
		//-------------------------
		if ((start=str.indexOf(revisionRes))<0)
			return;
		start += revisionRes.length();
		end    = str.indexOf("$", start);
		revision = new String(str.substring(start, end).trim());

		//System.out.println(title+"\n"+author+"\n"+revision);
	}
//=======================================================================
/**
 *	Extract class desription From File
 *
 *	@param	filename	Input file name to initialize object.
 *
 *	@throws	PogoException	If a synthax error occured on input file.
 *	@throws	FileNotFoundException
 *	@throws	IOException
 *	@throws	PogoException
 */
//=======================================================================
	private void getTheClassDescription(String filename)
							throws	FileNotFoundException,
									SecurityException,
									IOException,
									PogoException
	{
		//	Open File and read it
		//--------------------------------------
		String str = PogoUtil.readFile(filename);
		
		int	start, end;

		if ((start=str.indexOf(classDescRes))<0)
		{
			class_desc = "";
			return;
		}
		start += classDescRes.length();
		if ((end=str.indexOf("*/", start))<0)
		{
			class_desc = "";
			return;
		}
		PogoString	comments = new PogoString(str.substring(start, end));
		class_desc = comments.getDescription();
	}
//=======================================================================
/**
 *	Set the project revision field.
 *
 *	@param	vers	String to set as revision
 */
//=======================================================================
	public void setRevision(String vers)
	{
		revision = new String(vers);
	}
	
//=======================================================================
/**
 *	Set the project Author field.
 *
 *	@param	name	String to set as author
 */
//=======================================================================
	public void setAuthor(String name)
	{
		author = new String(name);
	}
	
//=======================================================================
/**
 *	Set the project title field.
 *
 *	@param	projTitle	String to set as title
 */
//=======================================================================
	public void setTitle(String projTitle)
	{
		title = new String(projTitle);
	}
//=======================================================================
/**
 *	Add a new Property object to the class Property table class.
 *
 *	@param	prop	Property to be added.
 */
//=======================================================================
	public void addClassProperty(Property prop)
	{
		class_properties.addElement(prop);
	}
//=======================================================================
/**
 *	Add a new Property object to the dev Property table class.
 *
 *	@param	prop	Property to be added.
 */
//=======================================================================
	public void addDevProperty(Property prop)
	{
		dev_properties.addElement(prop);
	}
//=======================================================================
/**
 *	Add a new Cmd object to the CmdTable class.
 *
 *	@param	cmd	New Cmd object to be added.
 */
//=======================================================================
	public void addCommand(Cmd cmd)
	{
		commands.addElement(cmd);
	}
//=======================================================================
/**
 *	Add a new Attrib object to the AttribTable class.
 *
 *	@param	attr	New Attrib object to be added.
 */
//=======================================================================
	public void addAttribute(Attrib attr)
	{
		attributes.addElement(attr);
	}
//=======================================================================
/**
 *	Add a new DesState object to the DevStateTable class.
 *
 *	@param	st	New DevState object to be added.
 */
//=======================================================================
	public void addState(DevState st)
	{
		states.addElement(st);
	}

	/**
	 *	Template for HTML Servers list class.
	 */
	private String	template_class =
	"<b><a href=CLASS/CLASS.tar.gz> CLASS </a></b>";
	/**
	 *	Template for HTML Servers list language.
	 */
	private String	template_lang =
	"<Center><Font size=-1 COLOR=\"#0000FF\"><b> LANG </b></Font></Center>";
	/**
	 *	Template for HTML Servers list description.
	 */
	private String	template_desc =
	"<b><a href=CLASS/doc_html/index.html> DESCRIPTION </a></b>";
	/**
	 *	Max length for  HTML Servers list description.
	 */
	private static final int	max_desc      = 300;
	
	
//=======================================================================
/**
 *	Add a new DesState object to the DevStateTable class.
 */
//=======================================================================
	public String[] buildServersListHtmlLine()
	{
		//	Get template and add class name
		PogoString	html_class = new PogoString(template_class);
		while (html_class.indexOf("CLASS")>=0)
			html_class.replace("CLASS", class_name);

		//	Get template and add language=.
		PogoString	html_lang = new PogoString(template_lang);
		while (html_lang.indexOf("LANG")>=0)
			html_lang.replace("LANG", ((language==cppLang)? "C++" : "Java"));

		//	Get template and add description.
		PogoString	html_desc = new PogoString(template_desc);
		while (html_desc.indexOf("CLASS")>=0)
			html_desc.replace("CLASS", class_name);

		//	Is the description too long ?
		String	desc;
		if (class_desc.length()>max_desc)
			desc = class_desc.substring(0, max_desc) + ".....";
		else
		if (class_desc.length()==0)
			desc = "Tango device server";	//	There is no description
		else
			desc = class_desc;
		html_desc.replace("DESCRIPTION", desc);

		//	store it in return argument
		String[]	retstr = new String[3];
		retstr[0] = html_class.str;
		retstr[1] =	html_lang.str;
		retstr[2] = html_desc.str;
		return retstr;
	}
//=======================================================================
//=======================================================================
	public void setProjectPath(String path)
	{
		projectFiles = new ProjectFiles(path, class_name, language);
	}
//=======================================================================
//=======================================================================
	public String toString()
	{
		String	s = class_name + "\n";
		s += class_desc + "\n";
		
		s += "COMMANDS\n";
		s += commands;
		s += "ATTRIBUTES\n";
		s += attributes;
		s += "STATES\n";
		s += states;
		s += "CLASS PROPERTIES\n";
		s += class_properties;
		s += "Device PROPERTIES\n";
		s += dev_properties;
		return s;
	}
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
