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
// Revision 3.5  2004/12/15 15:57:20  pascal_verdier
// Add StateMachine in Makefile if does not already done.
//
// Revision 3.4  2004/11/22 11:07:46  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.3  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.2  2004/09/02 06:41:34  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
//
// Revision 3.1  2004/08/26 07:19:30  pascal_verdier
// Attributes are now generated as class.
//
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
//
// copyleft 1999 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;

import java.io.*;
import java.util.*;
import fr.esrf.Tango.*;
import fr.esrf.TangoDs.*;


/**
 *	This class generates Cpp source file.
 *
 * @author	$Author$
 * @version	$Revision$
 */
public class PogoGeneCpp extends PogoGene implements PogoDefs, TangoConst
{
//=======================================================================
/**
 *	Constructor for Pogo Class Cpp files generation.
 *
 *	@param	pogo	Pogo Class definition used for generation.
 */
//=======================================================================
	public PogoGeneCpp(PogoClass pogo)
	{
		super(pogo);
	}
//=======================================================================
//=======================================================================
	private void buildSuperClassMakefile(String filename)
								throws	FileNotFoundException,
										SecurityException,
										IOException
	{
		PogoString	code = new PogoString(PogoUtil.readFile(filename));
		//	remove build classes
		code.remove("main.o	\\\n" +
		            "		ClassFactory.o	\\\n		");

		code.remove("	\\\n		$(CLASS)StateMachine.o	\\\n" +
		            "		$(CLASS).o");

		//	remove libraries
		int	start;
		while((start=code.str.indexOf("LFLAGS ="))>0)
			code.remove(code.str.substring(start, code.str.indexOf("endif", start)));

		//	remove classes to libtangoclasses
		code.remove("	ar ruv $(TARGET_LIB) $(CLASS).o\n");
		code.remove("	ar ruv $(TARGET_LIB) $(CLASS)StateMachine.o\n");

		//	Change action for all
		start = code.str.indexOf("all:") + "all:".length();
		int	end = code.str.indexOf("\n", start);
		code.replace(code.str.substring(start, end), "	$(SVC_OBJS)");
		code.remove("$(CLASS):	$(SVC_OBJS)\n"+
					"	$(CC) $(SVC_OBJS) -o $(CLASS) $(LFLAGS)\n");
		
		//	remove install
		code.remove("#-----------------------------------------\n" +
		            "#	 Install binary file\n"                    +
		            "#-----------------------------------------\n" +
		            "install:\n"                                   +
		            "	cp $(CLASS) $(TANGO_HOME)/bin/$(BIN_DIR)\n");

		PogoUtil.writeFile(filename, code.str);
	}
//=======================================================================
/**
 *	Add Object (StateMachine) to makefile if old one.
 *
 *	@param filename	Makefile's name (with path).
 */
//=======================================================================
	private void addObjectToMakefile(String filename)
						throws	FileNotFoundException,
								SecurityException,
								IOException
	{
		PogoString	code = new PogoString(PogoUtil.readFile(filename));

		//	Check if already exists
		String	new_obj = "$(CLASS)StateMachine.o";
		if (code.str.indexOf(new_obj)>0)
			return;
		int	position = code.str.indexOf("$(CLASS).o");
		int	start = code.str.lastIndexOf("\n", position);
		new_obj += " \\" + code.str.substring(start, position);
		code.insert(position, new_obj);
		PogoUtil.writeFile(filename, code.str);
	}
//=======================================================================
/**
 *	Generate C++ source for tango device Server
 *	from Pogo Class definition
 *
 *	@throws FileNotFoundException
 *	@throws SecurityException
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	public void generate() throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		String	makefile      = new String(pogo.projectFiles.getPath() + "/Makefile");
		String	main          = new String(pogo.projectFiles.getPath() + "/main.cpp");
		String	cfactory      = new String(pogo.projectFiles.getPath() + "/ClassFactory.cpp");
		String	server        = new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + ".cpp");
		String	server_h      = new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + ".h");
		String	serverclass   = new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + "Class.cpp");
		String	serverclass_h = new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + "Class.h");

		sbTrace = new StringBuffer("C++ source code generation:\n\n");

		//	Generate Makefile
		//------------------------------
		if (mustGenerate(makefile))
		{
			System.out.println("Generating " + makefile + " for C++....");
			replacePatternFile(
				new String(pogo.templates_dir + "/cpp/Makefile"),
				makefile,
				templateClass, pogo.class_name);
			sbTrace.append(makefile + " for C++     Created\n");
			if (pogo.is_superclass)
				buildSuperClassMakefile(makefile);
		}
		else
			addObjectToMakefile(makefile);

		//	Just copy main.cpp from template
		//----------------------------------
		if (pogo.is_superclass==false && mustGenerate(main))
		{
			System.out.println("Generating " + main + "....");
			copyFile(new String(pogo.templates_dir + "/cpp/main.cpp"), main);
			sbTrace.append(main + "     Created\n");
		}

		//	Generate ClassFactory.cpp
		//------------------------------
		if (pogo.is_superclass==false && mustGenerate(cfactory))
		{
			System.out.println("Generating " + cfactory + "....");
			replacePatternFile(
				new String(pogo.templates_dir + "/cpp/ClassFactory.cpp"),
				cfactory,
				templateClass, pogo.class_name);
			sbTrace.append(cfactory + "      Created\n");
		}
		//	Generate server Class
		//------------------------------
		CppServerClass	sc = new CppServerClass(pogo);
		sc.generateHeader(serverclass_h);
		sbTrace.append(serverclass_h + "      written\n");
		sc.generateSource(serverclass);
		sbTrace.append(serverclass + "      Written\n");

		//	Generate server
		//------------------------------
		CppServer	serv = new CppServer(pogo);
		serv.generateHeader(server_h);
		sbTrace.append(server_h + "      written\n");
		if (pogo.is_superclass==false)
		{
			serv.generateSource(server);
			sbTrace.append(server + "       written\n");
		}

		//	Build the MachineState file
		//-------------------------------------
		if (pogo.is_superclass==false)
		{
			CppStateMachine	allowed = new CppStateMachine(pogo);
			String	allowedfile  = pogo.projectFiles.getAllowed();
			allowed.generateSource(
				pogo.templates_dir + "/cpp/MachineState.cpp", allowedfile);
			sbTrace.append(allowedfile + "       written\n");
		}
	}
//=======================================================================
//=======================================================================
	private void changeClassName(String old_file, String new_file, String old_name, String new_name)
								throws 	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		replacePatternFile(old_file, new_file, old_name, new_name);
		new File(old_file).delete();
	}
//=======================================================================
/**
 *	Modify class name in all files.
 */
//=======================================================================
	public void changeClassName() throws 	FileNotFoundException,
											SecurityException,
											IOException,
											PogoException
	{
		String old_classname = pogo.projectFiles.getOriginalClassName();

		//	Build new files list
		String	makefile      = new String(pogo.projectFiles.getPath() + "/Makefile");
		String	main          = new String(pogo.projectFiles.getPath() + "/main.cpp");
		String	cfactory      = new String(pogo.projectFiles.getPath() + "/ClassFactory.cpp");
		String	server        = new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + ".cpp");
		String	server_h      = new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + ".h");
		String	serverclass   = new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + "Class.cpp");
		String	serverclass_h = new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + "Class.h");
		String	state_machine = new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + "StateMachine.cpp");

		//	Build existing files list
		String	old_server        = new String(pogo.projectFiles.getPath() + "/" + old_classname + ".cpp");
		String	old_server_h      = new String(pogo.projectFiles.getPath() + "/" + old_classname + ".h");
		String	old_serverclass   = new String(pogo.projectFiles.getPath() + "/" + old_classname + "Class.cpp");
		String	old_serverclass_h = new String(pogo.projectFiles.getPath() + "/" + old_classname + "Class.h");
		String	old_state_machine = new String(pogo.projectFiles.getPath() + "/" + old_classname + "StateMachine.cpp");

		//	And check if exist
		if (already_exists(makefile))
			replacePatternFile(makefile, makefile, old_classname, pogo.class_name);

		if (already_exists(main))
			replacePatternFile(main, main, old_classname, pogo.class_name);

		if (already_exists(cfactory))
			replacePatternFile(cfactory, cfactory, old_classname, pogo.class_name);

		if (already_exists(old_server))
			changeClassName(old_server, server, old_classname, pogo.class_name);

		if (already_exists(old_server_h))
			changeClassName(old_server_h, server_h, old_classname, pogo.class_name);

		if (already_exists(old_serverclass))
			changeClassName(old_serverclass, serverclass, old_classname, pogo.class_name);

		if (already_exists(old_serverclass_h))
			changeClassName(old_serverclass_h, serverclass_h, old_classname, pogo.class_name);

		if (already_exists(old_state_machine))
			changeClassName(old_state_machine, state_machine, old_classname, pogo.class_name);

		//	Update ProjectFiles object for next modifications
		pogo.projectFiles.updateOriginalFields();
	}
//=======================================================================
//=======================================================================
		
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
