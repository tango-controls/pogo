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
// Revision 3.20  2007/08/07 13:06:37  pascal_verdier
// Generate Makefile and Windows Project management added.
//
// Revision 3.19  2006/12/18 08:21:12  pascal_verdier
// Do not generate Makefiie (or .dps) if abstract.
//
// Revision 3.18  2006/09/13 07:13:23  pascal_verdier
// Bug project file when using abstract classes under win32 fixed.
//
// Revision 3.17  2006/06/26 09:22:47  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.16  2006/03/16 08:56:36  pascal_verdier
// Add a VCC project file generation.
//
// Revision 3.15  2005/12/07 12:18:10  pascal_verdier
// Tag command added in Makefile.
//
// Revision 3.14  2005/11/24 08:29:49  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.13  2005/08/09 14:56:46  pascal_verdier
// remove  tg->server_cleanup() call added previously.
//
// Revision 3.12  2005/08/08 12:30:15  pascal_verdier
// Check ic method tg->server_cleanup() call is in main.cpp, else add it.
//
// Revision 3.11  2005/06/14 08:44:25  pascal_verdier
// SuperClass is replaced by AbstractClass.
//
// Revision 3.10  2005/04/05 06:26:06  pascal_verdier
// Bug on new namespace syntax fixed.
//
// Revision 3.9  2005/03/29 15:02:27  pascal_verdier
// Bug on change class name fixed.
//
// Revision 3.8  2005/03/02 10:27:10  pascal_verdier
// Managing Super Classes and inherited classes.
//
// Revision 3.7  2005/02/23 16:04:50  pascal_verdier
// Bug in change class name fixed (pre-compiler).
//
// Revision 3.6  2005/01/24 08:42:05  pascal_verdier
// Modifying previous files if class name has changed.
//
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


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *	This class generates Cpp source file.
 *
 * @author	$Author$
 * @version	$Revision$
 */
public class PogoGeneCpp extends PogoGene implements PogoDefs
{
    static private final String vc_proj_dir = "vcproj";
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
	private void insertAbstractClassPathVc8(String filename)
                    throws	FileNotFoundException,
                            SecurityException,
                            IOException
    {
        String  templ = "TemplateAbstractPath";
        String  abs_path;
        if (pogo.inherited_from.equals(tangoDeviceImpl))
        {
            templ = "&quot;" + templ + "&quot;";
            abs_path = "";
        }
        else
            abs_path = pogo.inheritedClassPath();

        PogoString	code = new PogoString(PogoUtil.readFile(filename));
        while (code.indexOf(templ)>0)
            code.replace(templ, abs_path);
        PogoUtil.writeFile(filename, code.str);
    }
    //=======================================================================
    /**
     *	Build basic project files for VC8
     */
    //=======================================================================
        private void buildVc8ProjectFiles(String templ_dir, int item)
        {
            String[]  proj_filenames = {
                    "/Class_dll.vcproj",
                    "/Class_lib.vcproj",
                    "/Server_shared.vcproj",
                    "/Server_static.vcproj",
            };

            //  Build proj dir if does not exist
            String  path = pogo.projectFiles.getPath() + "/" + vc_proj_dir;
            File	f = new File(path);
            if (!f.exists())
                f.mkdir();

            try
            {
                for (int i=0 ; i<proj_filenames.length ; i++)
                {
                    if (mustGenerate(path + proj_filenames[i]) || item==GENE_WIN_PROJ)
                    {
                        replacePatternFile(templ_dir + proj_filenames[i], path + proj_filenames[i],
                                    templateClass, pogo.class_name);
                        strTrace += path + proj_filenames[i] + "     Generated\n";
                        insertAbstractClassPathVc8(path + proj_filenames[i]);
                    }
                }

                String  sln_file = path + "/" + pogo.class_name+".sln";
                if (mustGenerate(sln_file) || item==GENE_WIN_PROJ)
                {
                    copyFile(templ_dir + templateFile + ".sln",
                            sln_file, false);
                    strTrace += path + "/" + pogo.class_name +".sln     Generated\n";
                }
            }
            catch(Exception e)
            {
                strTrace += "!!!    VC8 Project Files  CANNOT be Created !!!\n       " + e + "\n";
            }
        }
    //=======================================================================
    //=======================================================================
	private void insertAbstractClassPath(String filename)
                    throws	FileNotFoundException,
                            SecurityException,
                            IOException,
                            PogoException
	{
		PogoString	code = new PogoString(PogoUtil.readFile(filename));

		//	Check if already done
		if (code.str.indexOf("SUPER_HOME")<0)
		{
            if (PogoUtil.osIsUnix())
            {
                //	Add definition in Makefile
                int	pos = code.str.indexOf("INCLUDE_DIRS");
                if (pos<0)
                    throw new PogoException(filename + " Syntax error");
                code.insert(pos, "SUPER_HOME   =  " + pogo.inheritedClassPath() + "\n");

                //	Add compiler instruction for headers
                pos = code.str.indexOf("\\", pos);
                code.insert(pos, " -I$(SUPER_HOME) ");
            }
            else
            {
                //  Insert super directory in DSP file
                String  target = "/I \".\" ";
                int	pos = code.str.indexOf(target);
                if (pos<0)
                    throw new PogoException(filename + " Syntax error");
                code.insert(pos, "/I \"" + pogo.inheritedClassPath() + ".h\" ");

                pos = code.str.indexOf("SOURCE=" + pogo.class_name + ".h");
                if (pos<0)
                    throw new PogoException(filename + " Syntax error");
                String  new_code =  "SOURCE="+pogo.inheritedClassName() + ".h\n" +
                                    "# End Source File\n"+
                                    "# Begin Source File\n\n";
                code.insert(pos, new_code);
            }
            PogoUtil.writeFile(filename, code.str);
        }
	}
//=======================================================================
/**
 *	Add CVS tag option in existing makefile
 *
 *	@param filename	Makefile's name (with path).
 */
//=======================================================================
	private void patchCvsTagToMakefile(String filename)
						throws	FileNotFoundException,
								SecurityException,
								IOException
	{
		if (pogo.is_abstractclass)
			return;
		PogoString	code = new PogoString(PogoUtil.readFile(filename));

		//	Check if already exists
		String	new_obj = "show_tag:";
		if (code.str.indexOf(new_obj)>0)
			return;

		//	If it is an old template -> do nothing
		String	template = PogoUtil.readFile(pogo.templates_dir + "/cpp/Makefile");
		int		start = template.indexOf("RELEASE");
		if (start<0)
			return;

		//	Get the part to be added
		String	release = template.substring(start, template.indexOf("\n", start)+1);
		start =  template.indexOf("tag:");
		for (int i=0 ; i<4 ; i++)
			start =  template.lastIndexOf('\n', start-1);
		String	tagCmd = template.substring(start);

		//	Change class definition place
		start = code.str.indexOf("CLASS");
		String	classdef = null;
		try {
			classdef = code.str.substring(start, code.str.indexOf("\n", start+1));
		}catch(Exception e){ /* Nothing to do */}

		//	Search position to insert
		start = 0;
		while ((start=code.str.indexOf('\n', start))>0)
			if (code.str.charAt(start+1)!='#')
				break;
            else
                start++;

		int position = start + 2;
		code.insert(position, release+"\n");
		if (classdef!=null)
		{
			code.remove(classdef);
			code.insert(position, classdef+"\n");
		}
		code.str += tagCmd;

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
		if (pogo.is_abstractclass)
			return;
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
 *	Name space has changed (class_name --> class_name_ns)
 *	Special case for ClassFactory
 */
//=======================================================================
	private void updateNamespaceInClFac(String filename)
								throws	FileNotFoundException,
										SecurityException,
										IOException
	{
		PogoString	code = new PogoString(PogoUtil.readFile(filename));
		String		old_ns = pogo.class_name  + "::" + pogo.class_name + "Class::init";
		String		new_ns = pogo.namespace() + "::" + pogo.class_name + "Class::init";
		if (code.str.indexOf(old_ns)>0)
		{
			//	Replace by new one
			code.replace(old_ns, new_ns);
			PogoUtil.writeFile(filename, code.str);
		}
	}
//=======================================================================
/**
 *	Build a basic project file for VC6
 */
//=======================================================================
	private void BuildWinDspFile(String template, String filename)
	{
        try
        {
            String  code = PogoUtil.readFile(template);

            int idx;
            //  Replace by Class name
            while ((idx=code.indexOf(templateClass))>0)
            {
                code = code.substring(0, idx) + pogo.class_name +
                        code.substring(idx+templateClass.length());
            }

            //  Add super class path if any
            if (pogo.inherited_from!=null)
            {
                String  s = "/I \".\"";
                idx = code.indexOf(s);
                code = code.substring(0, idx) +
                        " /I \"" + pogo.inheritedClassPath() + "\" " +
                        code.substring(idx);
            }
            //  if not windows, force it to windows format
            if (PogoUtil.osIsUnix())
                code = PogoUtil.setWindowsFileFormat(code);
            PogoUtil.writeFile(filename, code);
            strTrace += filename + "     Generated\n";
        }
        catch(Exception e)
        {
            strTrace += "!!!    " + filename + "  CANNOT be Created !!!\n       " + e + "\n";
        }
    }
//=======================================================================
/**
 *	Name space has changed (class_name --> class_name_ns)
 */
//=======================================================================
	private void updateNamespace(String filename)
								throws	FileNotFoundException,
										SecurityException,
										IOException
	{
		PogoString	code = new PogoString(PogoUtil.readFile(filename));
		String		old_ns = "namespace " + pogo.class_name  + "\n{\n";
		String		new_ns = "namespace " + pogo.namespace() + "\n{\n";
		boolean		modified = false;

		if (code.str.indexOf(old_ns)>0)
		{
			//	Replace by new one
			code.replace(old_ns, new_ns);
			modified =true;
		}

		//	Added for another syntax
		old_ns = "namespace " + pogo.class_name  + " {\n";
		new_ns = "namespace " + pogo.namespace() + " {\n";
		if (code.str.indexOf(old_ns)>0)
		{
			//	Replace by new one
			code.replace(old_ns, new_ns);
			modified =true;
		}
		if (modified)
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
	public void generate(int item) throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		String	makefile      = pogo.projectFiles.getPath() + "/Makefile";
		String	WinDsp        = pogo.projectFiles.getPath() + "/" + pogo.class_name + ".dsp";
		String	main          = pogo.projectFiles.getPath() + "/main.cpp";
		String	cfactory      = pogo.projectFiles.getPath() + "/ClassFactory.cpp";
		String	server        = pogo.projectFiles.getPath() + "/" + pogo.class_name + ".cpp";
		String	server_h      = pogo.projectFiles.getPath() + "/" + pogo.class_name + ".h";
		String	serverclass   = pogo.projectFiles.getPath() + "/" + pogo.class_name + "Class.cpp";
		String	serverclass_h = pogo.projectFiles.getPath() + "/" + pogo.class_name + "Class.h";
		String	allowedfile   = pogo.projectFiles.getAllowed();
        String	vc8_templ_dir = pogo.templates_dir + "/cpp/vc8_project/";

		strTrace = "C++ source code generation:\n\n";

		//	Generate Makefile
		//------------------------------
        if (!pogo.is_abstractclass)
        {
            if (!PogoUtil.osIsUnix() || item==GENE_WIN_PROJ)
            {
                 if (mustGenerate(WinDsp) || item==GENE_WIN_PROJ)
                 {
				 	//	Check if vc8 template exists
					if (already_exists(vc8_templ_dir))
					{
                        //  Create directory with files for VC8 project
                        buildVc8ProjectFiles(vc8_templ_dir, item);
                    }
					else
                    if (mustGenerate(WinDsp) || item==GENE_WIN_PROJ)
                    {
                        //  Try to ceate a basic Vc6 project file
                    	this.BuildWinDspFile(pogo.templates_dir + "/cpp/DevServ.dsp", WinDsp);
                    }
                 }
            }
            if (PogoUtil.osIsUnix() || item==GENE_MAKEFILE)
            {
                if (item==GENE_MAKEFILE || mustGenerate(makefile))
                {
                    System.out.println("Generating " + makefile + " for C++....");
                    replacePatternFile(
                        pogo.templates_dir + "/cpp/Makefile",
                        makefile,
                        templateClass, pogo.class_name);
                    strTrace += makefile + " for C++     generated\n";
                }
                else
                {
                    addObjectToMakefile(makefile);
                    patchCvsTagToMakefile(makefile);
                }
            }
            if (pogo.inherited_from!=null)
                if (!pogo.inherited_from.equals(tangoDeviceImpl))
                    if (!PogoUtil.osIsUnix())
                    {
                        if (!already_exists(vc8_templ_dir))
                            insertAbstractClassPath(WinDsp);
                    }
                    else
                        insertAbstractClassPath(makefile);
        }
        if(item==GENE_MAKEFILE || item==GENE_WIN_PROJ)
            return;

        //	Just copy main.cpp from template
		//----------------------------------
		if (!pogo.is_abstractclass && mustGenerate(main))
		{
			System.out.println("Generating " + main + "....");
			copyFile(pogo.templates_dir + "/cpp/main.cpp", main);
            strTrace += main + "     Created\n";
		}

		//	Generate ClassFactory.cpp
		//------------------------------
		if (!pogo.is_abstractclass && mustGenerate(cfactory))
		{
			System.out.println("Generating " + cfactory + "....");
			replacePatternFile(
				pogo.templates_dir + "/cpp/ClassFactory.cpp",
				cfactory,
				templateClass, pogo.class_name);
            strTrace += cfactory + "      Created\n";
		}
		//	Generate server Class
		//------------------------------
		CppServerClass	sc = new CppServerClass(pogo);
		sc.generateHeader(serverclass_h);
		strTrace += serverclass_h + "      Generated\n";
		sc.generateSource(serverclass);
		strTrace += serverclass + "      Generated\n";

		//	Generate server
		//------------------------------
		CppServer	serv = new CppServer(pogo);
		serv.generateHeader(server_h);
		strTrace += server_h + "      Generated\n";
		if (!pogo.is_abstractclass)
		{
			serv.generateSource(server);
			strTrace += server + "       Generated\n";
		}

		//	Build the MachineState file
		//-------------------------------------
		CppStateMachine	allowed = new CppStateMachine(pogo);
		allowed.generateSource(
			pogo.templates_dir + "/cpp/MachineState.cpp", allowedfile);
		strTrace += allowedfile + "       Generated\n";

		//	Check for namespace (compatibility with old version)
		updateNamespace(serverclass_h);
		updateNamespace(serverclass);
		updateNamespace(server_h);
		if (!pogo.is_abstractclass)
		{
			updateNamespace(server);
			updateNamespace(allowedfile);
			updateNamespaceInClFac(cfactory);
		}
	}
//=======================================================================
//=======================================================================
	private void changeClassName(String old_file, String new_file, String old_name, String new_name)
								throws 	FileNotFoundException,
										SecurityException,
										IOException
    {
		replacePatternFile(old_file, new_file, old_name, new_name);
		if (!new_file.equals(old_file))
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
		String	makefile      = pogo.projectFiles.getPath() + "/Makefile";
		String	main          = pogo.projectFiles.getPath() + "/main.cpp";
		String	cfactory      = pogo.projectFiles.getPath() + "/ClassFactory.cpp";
		String	server        = pogo.projectFiles.getPath() + "/" + pogo.class_name + ".cpp";
		String	server_h      = pogo.projectFiles.getPath() + "/" + pogo.class_name + ".h";
		String	serverclass   = pogo.projectFiles.getPath() + "/" + pogo.class_name + "Class.cpp";
		String	serverclass_h = pogo.projectFiles.getPath() + "/" + pogo.class_name + "Class.h";
		String	state_machine = pogo.projectFiles.getPath() + "/" + pogo.class_name + "StateMachine.cpp";

		//	Build existing files list
		String	old_server        = pogo.projectFiles.getPath() + "/" + old_classname + ".cpp";
		String	old_server_h      = pogo.projectFiles.getPath() + "/" + old_classname + ".h";
		String	old_serverclass   = pogo.projectFiles.getPath() + "/" + old_classname + "Class.cpp";
		String	old_serverclass_h = pogo.projectFiles.getPath() + "/" + old_classname + "Class.h";
		String	old_state_machine = pogo.projectFiles.getPath() + "/" + old_classname + "StateMachine.cpp";

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
		{
			changeClassName(old_server_h, server_h, old_classname, pogo.class_name);
			changeClassName(server_h, server_h,
								old_classname.toUpperCase(),
								pogo.class_name.toUpperCase());
		}
		if (already_exists(old_serverclass))
			changeClassName(old_serverclass, serverclass, old_classname, pogo.class_name);

		if (already_exists(old_serverclass_h))
		{
			changeClassName(old_serverclass_h, serverclass_h, old_classname, pogo.class_name);
			changeClassName(serverclass_h, serverclass_h,
								old_classname.toUpperCase(),
								pogo.class_name.toUpperCase());
		}

		if (already_exists(old_state_machine))
			changeClassName(old_state_machine, state_machine, old_classname, pogo.class_name);

		//	Update ProjectFiles object for next modifications
		pogo.projectFiles.updateOriginalFields();
	}
    //=======================================================================
    //=======================================================================
    static public boolean makefileExists(PogoClass server)
    {
        return already_exists(server.projectFiles.getPath() + "/Makefile");
    }
    //=======================================================================
    //=======================================================================
    static public boolean windowsProjectExists(PogoClass server)
    {
        return already_exists(server.projectFiles.getPath() + "/" + vc_proj_dir);
    }
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
