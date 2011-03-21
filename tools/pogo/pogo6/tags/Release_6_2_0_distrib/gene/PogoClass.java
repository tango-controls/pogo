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
// Revision 3.24  2010/02/19 12:39:39  pascal_verdier
// Bug in reload abstract class fixed.
//
// Revision 3.23  2009/12/01 06:54:59  pascal_verdier
// DeviceID management added.
//
// Revision 3.22  2009/02/18 15:02:15  pascal_verdier
// Tango 7 (IDL 4) compatibility implementation.
//
// Revision 3.21  2006/11/09 14:09:51  pascal_verdier
// CVS tags management modified.
//
// Revision 3.20  2006/11/02 11:41:01  pascal_verdier
// Python code generation added.
//
// Revision 3.19  2006/09/19 13:20:52  pascal_verdier
// Allow boolean attribute for java servers.
// Bug in command factory for abstract class generation fixed.
// Bug in changing class name fixed.
// Abstarct classes sorted.
//
// Revision 3.18  2006/07/18 06:22:12  pascal_verdier
// logString method call added.
//
// Revision 3.17  2006/06/26 09:22:47  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.16  2006/01/30 11:02:10  pascal_verdier
// Revision and cvsroot are taken from CVS files if exists.
// Doc in pdf generated if linux.
//
// Revision 3.15  2005/12/21 16:00:17  pascal_verdier
// A litle bug fixed when getting description.
//
// Revision 3.14  2005/12/20 11:17:17  pascal_verdier
// If StateMachine file not found, display warning message
// and generate a new one at next code generation.
//
// Revision 3.13  2005/11/24 08:29:16  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.12  2005/09/07 08:19:19  pascal_verdier
// Property Default value managed and set for wizard usage.
//
// Revision 3.11  2005/06/14 08:44:25  pascal_verdier
// SuperClass is replaced by AbstractClass.
//
// Revision 3.10  2005/05/19 13:08:48  pascal_verdier
// Bug in case of not any command defined fixed.
//
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

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
    public int			language;
/**
 *	Author Name.
 */
    public String		author;
/**
 *	Revision number as String.
 */
    public String		revision;
/**
 *	CVS repository name if known.
 */
    public String		cvs_repository = null;
/**
 *	DeviceImpl version
 */
    public int			deviceImpl;
/**
 *	files to defined project.
 */
    public ProjectFiles	projectFiles;
/**
 *	True if this class is super class.
 */
    public boolean		is_abstractclass = false;
/**
 *	An exception occured during class loading but it is just a Warning
 */
     public Exception	except = null;
/**
 *	Device Class identification.
 */
	public DeviceID		device_id;

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
        class_name = className;
        this.inherited_from = inherited_from;
        if (classDesc!=null)
            class_desc = classDesc;
        author       = "";
        revision     = "";

        class_properties = new PropertyTable(classPropVect, classProperty);
        dev_properties   = new PropertyTable(devPropVect, devProperty);
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
        if (language==javaLang)
            deviceImpl = javaDeviceImpl;
        else
        if (language==pyLang)
            deviceImpl = pyDeviceImpl;

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

        class_properties = new PropertyTable(classProperty);
        dev_properties   = new PropertyTable(devProperty);
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
        if (language==javaLang)
            deviceImpl = javaDeviceImpl;
        else
        if (language==pyLang)
            deviceImpl = pyDeviceImpl;

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
    public PogoClass(String filename) throws FileNotFoundException,
                                        IOException,
                                        PogoException
    {
		//	First time, check if it is not a oAW Pogo model
		String	code = "";
		try
		{
			code = PogoUtil.readFile(filename);
		}
		catch(Exception e) { /* do nothing */ }
		if (code.startsWith("/*PROTECTED REGION ID("))
			throw new PogoException("This a too recent Pogo model (using oAW model) !");

        projectFiles = new ProjectFiles(filename);
        //System.out.println(projectFiles);

        //	Default initialization
        //-------------------------------
        author   = "";
        revision = "";

        //	Get the template directory from property
        //--------------------------------------------------
        if ((templates_dir=System.getProperty("TEMPL_HOME"))==null)
            throw new PogoException("No Template Property (TEMPL_HOME) Fixed !");

        //	Get Other info from files
        //--------------------------------------------------
        initializePogoFromSrcFiles();

		//	Load identification
 		String	id_filename = DeviceID.getFilename(filename);
		if (new File(id_filename).exists())
		{
			device_id = new DeviceID(PogoUtil.readFile(id_filename));
			//	Get author on TangoClassID.txt if exists
			author = device_id.getAuthorFromContact();
		}
		else
			device_id = new DeviceID();
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
            if (deviceImpl<3)
                PogoUtil.logString(class_name + "	inherits from Device " +
                        deviceImpl + "Impl class");
        }
        else
        if (language==pyLang)
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
                inherited_from = PogoUtil.getInstance().getInheritance(class_name, serverDescriptionFile);
                is_abstractclass  = PogoUtil.checkIfSuperclass(serverDescriptionFile, commands);
                System.out.println("This class is " +
                            ((is_abstractclass)? "" : "NOT" )+ " a super class");
                System.out.println("Server inherits " + inherited_from  + " class");
            }
            System.out.println("Server is a Device_" +  deviceImpl + "Impl object");
        }
        else
            inherited_from = tangoDeviceImpl;

        if (language==cppLang && deviceImpl>=3)
            commands.setAllowedState(class_name, projectFiles.getAllowed(), is_abstractclass);

        //	Get States
        states = new DevStateTable(serverDescriptionFile, language);

        //	Get Attributes and set state to allow attributes
        attributes = new AttribTable(projectFiles, language);
        if (language==cppLang && deviceImpl>=3)
            attributes.setAllowedState(class_name, projectFiles.getAllowed(), is_abstractclass);

        //	Get the project title
        //------------------------------------
        getTheProjectTitle(serverDescriptionFile);

        //	Get the Class description
        //------------------------------------
        if (language==pyLang)
           class_desc = parsePyClassDescription(serverDescriptionFile);
        else
            getTheClassDescription(serverDescriptionFile);

        //	get if dev_state and/or dev_status are overrided
        //--------------------------------------------------
        getIfOverrided(serverDescriptionFile);

        //	get properties for class and device
        class_properties = new PropertyTable(classDescriptionFile, classProperty, language);
        class_properties.readDefaultValues(projectFiles.getServerClass(), language);
        dev_properties   = new PropertyTable(serverDescriptionFile, devProperty, language);
        dev_properties.readDefaultValues(projectFiles.getServerClass(), language);

        //	Check if an exception occured
        if (commands.except!=null)
        {
            this.except = commands.except;
            commands.except = null;
        }
        if (attributes.except!=null)
        {
            this.except = attributes.except;
            attributes.except = null;
        }
    }
//=======================================================================
//=======================================================================
    private String parsePyClassDescription(String filename)
    {
        String  code;
        try {
            code = PogoUtil.readFile(filename);
        }
        catch (Exception e){
            return "";
        }

        //  Search description location
        String  target = class_name + " Class Description:";
        int start = code.indexOf(target);
        if (start<0)    return "";
        int end = code.indexOf("#==========", start);
        if (end<0)      return "";
        start += target.length() + 1;
        String  s = code.substring(start, end);

        //  Get each line
        String  description = "";
        StringTokenizer stk = new StringTokenizer(s, "\n");
        while (stk.hasMoreTokens())
            description += stk.nextToken().substring(1).trim() + "\n";
        return description.trim();
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
            if (cmd.virtual_method)
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
            System.out.println("WARNING: '"+projectTitleRes+ "' Not Found in " +filename);
		else
        {
       		start += projectTitleRes.length();
        	end    = str.indexOf("\n", start);
        	title  = str.substring(start, end).trim();
        }

		//	Check author on CVS if exists
		String	tmp = PogoUtil.getCvsInfo(filename, "author:");
		if (tmp.length()>0)
			author = tmp;
		else
		{
			//	Check author on svn if exists
			tmp = PogoUtil.getSvnInfo(filename, "Last Changed Author:");
			if (tmp.length()>0)
				author = tmp;
			else
			{
				//	If not found, check from header
        		if ((start=str.indexOf(authorRes))>0)
				{
	        		start += authorRes.length();
    	    		end    = str.indexOf("$", start);
        			author = str.substring(start, end).trim();
					end = author.indexOf('\n');
					if (end>0)
						author = author.substring(0, end);
				}
			}
		}

       //	Get file revision
        //-------------------------
        if ((start=str.indexOf(revisionRes))>0)
		{
	        start += revisionRes.length();
        	end    = str.indexOf("$", start);
        	revision = str.substring(start, end).trim();
		}
        //	Try to get revision from TagName tag has been done
		revision = PogoUtil.getCvsInfo(filename, "symbolic names:");
        if (language==cppLang)
            cvs_repository = PogoUtil.getCvsRepository(projectFiles.getPath());
    }
//=======================================================================
/**
 *	Extract class desription From File
 *
 *	@param	filename	Input file name to initialize object.
 *
 *	@throws	FileNotFoundException
 *	@throws	IOException
 *	@throws	SecurityException
 */
//=======================================================================
    private void getTheClassDescription(String filename)
                            throws	FileNotFoundException,
                                    SecurityException,
                                    IOException
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
        class_desc = comments.getDescription().trim();
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
        revision = vers;
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
        author = name;
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
        title = projTitle;
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
    "<b><Font size=-1 COLOR=\"#0000FF\"> CLASS </b></Font>";
//	"<b><a href=CLASS/CLASS.tar.gz> CLASS </a></b>";
    /**
     *	Template for HTML Servers list language.
     */
    private String	template_lang =
    "<Center><Font size=-1 COLOR=\"#0000FF\"><b> LANG </b></Font></Center>";
    /**
     *	Template for HTML Servers list description.
     */
    private String	template_desc =
    "<b><Font size=-1><a href=CLASS/doc_html/index.html> DESCRIPTION </a></Font></b>";
    /**
     *	Max length for  HTML Servers list description.
     */
    private static final int	max_desc      = 300;


//=======================================================================
/**
 *	Build Html line fo a servers table.
 */
//=======================================================================
    public String[] buildServersListHtmlLine(String repository, String family)
    {
        //	Get template and add class name
        PogoString	html_class = new PogoString(template_class);
		
		//	Build a link on sourceforge if any on class name
		String		target = class_name;
		String		cs = "\"http://tango-cs.cvs.sourceforge.net/tango-cs/tango/cppserver/\"";
		String		ds = "\"http://tango-ds.cvs.sourceforge.net/tango-ds/\"";
		if (repository.equals("SourceForge(Tango-cs)"))
			target = "<a href=" + cs + " target=new> " + class_name + " </a>";
		else
		if (repository.equals("SourceForge(Tango-ds)"))
			target = "<a href=" + ds + " target=new> " + class_name + " </a>";

        while (html_class.indexOf("CLASS")>=0)
            html_class.replace("CLASS", target);


        //	Get template and add language=.
        PogoString	html_lang = new PogoString(template_lang);
		String	strlang = "?";
		if (language==cppLang)
			strlang = "C++";
		else
		if (language==javaLang)
			strlang = "Java";
		else
		if (language==pyLang)
			strlang = "Python";
		
        while (html_lang.indexOf("LANG")>=0)
            html_lang.replace("LANG", strlang);

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
        desc = new PogoString(desc).removeHtmlTags();
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
    String buildPyDescription()
    {
        String  code = "#   " + class_name + " Class Description:\n#\n";

        StringTokenizer stk = new StringTokenizer(this.class_desc, "\n");
        while (stk.hasMoreTokens())
            code += "#         " + stk.nextToken() + "\n";
        return code;
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
