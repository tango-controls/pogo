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
// Copyright 1995 by European Synchrotron Radiation Facility, Grenoble, France
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
 *	Device server class description.
 */
	public String			class_desc;
/**
 *	Device server output files path.
 */
	public String			output_files;
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
 *	Device server output language.
 */
	public int				language;
/**
 *	Device server input language.
 */
	public int				in_language;
/**
 *	Author Name.
 */
	public String			author;
/**
 *	Revision number as String.
 */
	public String			revision;
	
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
	public PogoClass(String className,	String classDesc,
										Vector classPropVect,
										Vector devPropVect,
										Vector cmdVect,
										Vector attrVect,
										Vector statesVector)
					throws PogoException
	{
		class_name = new String(className);
		if (classDesc!=null)
			class_desc = new String(classDesc);
		output_files = new String(".");
		author       = new String("");
		revision     = new String("");

		class_properties = new PropertyTable(classPropVect);
		dev_properties   = new PropertyTable(devPropVect);
		commands   = new CmdTable(cmdVect);
		attributes = new AttribTable(attrVect);
		states     = new DevStateTable(statesVector);

		//	Set a deafault output language
		//--------------------------------------------------
		language = javaLang;
		in_language = javaLang;

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
		int	ext_idx = filename.length()-1;
		while (ext_idx>0 && filename.charAt(ext_idx)!='.')
			ext_idx--;

		if (ext_idx==0)
			throw new PogoException(filename + ": Not Available File's Name !");

		String	ext = filename.substring(ext_idx);
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
		initializePogoFromSrcFile(filename, ext);
	}
//=======================================================================
/**
 *	Initialize Pogo struct From source File
 *
 *	@param	filename	Input file name to initialize object.
 *	@param	ext			Input file extention. Depends on input language.
 *
 *	@throws	PogoException	If a synthax error occured on input file.
 *	@throws	FileNotFoundException
 *	@throws	IOException
 *	@throws	PogoException
 */
//=======================================================================
	private void initializePogoFromSrcFile(String filename, String ext)
							throws	FileNotFoundException,
									SecurityException,
									IOException,
									PogoException
	{
		//	Set the pogo properties from input args
		//--------------------------------------------------
		PogoString	pogo_fname = new PogoString(filename);
		class_name = pogo_fname.extractClassFromPath();
		String server_class = pogo_fname.buildServerClassFromPath();
		String server_class_h = pogo_fname.buildServerClassHFromPath();

		if (ext.equals(PogoDefs.javaExtention))
		{
			language    = javaLang;
			in_language = javaLang;
		}
		else
		if (ext.equals(PogoDefs.cppExtention))
		{
			language    = cppLang;
			in_language = cppLang;
		}
		else
			throw new PogoException("File's extention unknown !");

		output_files = new String(".");
		commands = new CmdTable(server_class);

		String serverDescriptionFile = pogo_fname.buildDescClassFromPath(in_language);
		commands.getDescriptions(serverDescriptionFile, server_class, in_language);

		states = new DevStateTable(serverDescriptionFile, language);
		attributes = new AttribTable(server_class, language);

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
		String	classDescriptionFile = (language==javaLang)?
										server_class : server_class_h;
			
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
		FileInputStream	fid;
		byte[]	inStr;
		fid = new FileInputStream(filename);
		int nb = fid.available();
		inStr  = new byte[nb];
		fid.read(inStr);
		PogoString pgs = new PogoString(inStr);
		fid.close();

		//	Search if comand's method exists
		//------------------------------------------
		for (int i=0 ; i<commands.size() ; i++)
		{
			Cmd		cmd = commands.cmdIdx(i);
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
		FileInputStream	fid;
		byte[]	inStr;
		fid = new FileInputStream(filename);
		int nb = fid.available();
		inStr  = new byte[nb];
		fid.read(inStr);
		String str = new String(inStr);
		fid.close();
		
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
		FileInputStream	fid;
		byte[]	inStr;
		fid = new FileInputStream(filename);
		int nb = fid.available();
		inStr  = new byte[nb];
		fid.read(inStr);
		String str = new String(inStr);
		fid.close();
		
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
 *	@param	name	String to set as revision
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
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
