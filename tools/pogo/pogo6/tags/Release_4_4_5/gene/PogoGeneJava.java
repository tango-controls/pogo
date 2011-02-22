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
// Revision 3.3  2004/11/22 15:29:31  pascal_verdier
// Javadoc tags correction.
//
// Revision 3.2  2004/09/07 12:00:50  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.1  2004/08/26 07:19:30  pascal_verdier
// Attributes are now generated as class.
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
//
// copyleft 1999 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;

import fr.esrf.TangoDs.TangoConst;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *	This class generates Java source file.
 */
public class PogoGeneJava extends PogoGene implements PogoDefs, TangoConst
{
//=======================================================================
/**
 *	Constructor for Pogo Class Java files generation.
 *
 *	@param	pogo	Pogo Class definition used for generation.
 */
//=======================================================================
	public PogoGeneJava(PogoClass pogo)
	{
		super(pogo);
	}
//=======================================================================
/**
 *	Add in the out File, in the methods, a block
 *	to call the method where command is really executed.
 *
 *	@param	cmd		Command Object Treated
 *	@param	pgs		source code read.
 *	@throws	IOException
 *	@throws	PogoException	If a synthax error occured on input file.
 */
//=======================================================================
	protected String AddExecuteMethod(Cmd cmd, PogoString pgs)
						throws	PogoException
	{
		int		start, end;
		String	oldMethod, newMethod;

		//	Get class description
		//-------------------------------
		if ((start=pgs.str.indexOf(classDescRes))<0)
			throw new PogoException(
				"Template Syntax error !\nClass Description\n Not found !");
		//start = pgs.nextCr(start);
		end = pgs.str.indexOf("*/", start);		
		oldMethod = pgs.str.substring(start, end);

		//	Write class (command) description as description
		//------------------------------------------------------
		StringBuffer	sb = new StringBuffer(classDescRes + "\n *	");
		if (cmd.description!=null)
			sb.append(new PogoString(cmd.description).setComments());
		sb.append("\n");
		pgs.replace(oldMethod, sb.toString());

		//	Get constructors  and write them.
		//-----------------------------------------
		String	target = "public Any execute(DeviceImpl device,Any in_any)";
		if ((start=pgs.str.indexOf(target))<0)
			throw new PogoException(new String("Template Syntax error !\n"+
												target + "\n Not Found !"));
		start = pgs.inMethod(start);
		int	tmp = start;
		if ((start=pgs.str.indexOf("println", start))<0)
			start = tmp;

		//	Get the trace line
		//-----------------------------
		start = pgs.nextCr(start)+1;
		end   = pgs.outMethod(start);
		oldMethod = pgs.str.substring(start, end);
		newMethod = cmd.buildJavaExecuteMethodBlock(pogo.class_name);
		pgs.replace(start, oldMethod, newMethod);

		//	search for is_allowed method
		//-------------------------------------
		target = "public boolean is_allowed(DeviceImpl device, Any data_in)";
		if ((start=pgs.str.indexOf(target))<0)
			throw new PogoException(new String("Template Syntax error !\n"+
												target + "\n Not Found !"));
		start = pgs.inMethod(start);
		end = pgs.outMethod(start);

		//	Build the new one
		//------------------------------
		oldMethod = pgs.str.substring(start, end);
		newMethod = cmd.buildIsAllowedMethod(new PogoString(oldMethod), javaLang);

		pgs.replace(oldMethod, newMethod);

		return pgs.str;
	}

//=======================================================================
/**
 *	Build/modify the command classes files.
 *
 */
//=======================================================================
	protected void generateCommandClasses()
						throws	IOException, PogoException
	{
		String template = new String(pogo.templates_dir + "/java/" +
									PogoDefs.templateFile + "Cmd.java");
		//	Don't forget to skip virtual status Cmds.
		//--------------------------------------------
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdAt(i);
			if (cmd.virtual_method==false)
			{
				String	servercmd = new String(pogo.projectFiles.getPath() + "/" + cmd.cmd_class + ".java");
				PogoString	pgs;
				if (mustGenerate(servercmd))
				{
					System.out.println("Generating " + servercmd + "....");
					//	Open and read template file
					//----------------------------------------
					FileInputStream		fidin = new FileInputStream(template);
					int nb = fidin.available();
					byte[]	inStr  = new byte[nb];
					fidin.read(inStr);
					pgs = new PogoString(inStr);
					fidin.close();
					pgs = PogoUtil.removeLogMessages(pgs);

					//	Replace tags
					while (pgs.str.indexOf(PogoDefs.templateClass)>=0)
						pgs.replace(PogoDefs.templateClass, pogo.class_name);
					while (pgs.str.indexOf(PogoDefs.templateClassCmd)>=0)
						pgs.replace(PogoDefs.templateClassCmd, cmd.cmd_class);

					sbTrace.append(servercmd + "        Created\n");
				}
				else
				{
					//	Open and read esisting file
					//----------------------------------------
					FileInputStream		fidin = new FileInputStream(servercmd);
					int nb = fidin.available();
					byte[]	inStr  = new byte[nb];
					fidin.read(inStr);
					pgs = new PogoString(inStr);
					fidin.close();
					sbTrace.append(servercmd + "        Modified\n");
				}
				String	newcode = AddExecuteMethod(cmd, pgs);
				//	Open Output file
				//----------------------------------------
				FileOutputStream	fidout = new FileOutputStream(servercmd);
				fidout.write(newcode.getBytes());
				fidout.close();
			}
		}
	}
//=======================================================================
/**
 *	In the makefile, the only class to be compiled,
 *	is by default the device server class.
 *	This method add the DevServerClass class and one class for each command.
 *
 *	@param	pgs	input code
 * @return the modified code.
 */
//=======================================================================
	protected String addClassToMakefile(PogoString pgs)
						throws	PogoException
	{
		//	Just verify if file ok
		//----------------------------------------
		String	tag = "CL_LIST =	$(CLASS).class";
		if (pgs.str.indexOf(tag)<0)
			throw new PogoException("Makefile Syntax error !");
				
		//	Write all files'name to be compiled
		//----------------------------------------
		StringBuffer fileslist = new StringBuffer(tag);
		fileslist.append("\\\n		$(CLASS)Class.class");
		//	Don't forget to skip virtual status Cmds.
		//--------------------------------------------
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdAt(i);
			if (cmd.virtual_method==false)
				fileslist.append("	\\\n		" + cmd.cmd_class + ".class");
		}
		fileslist.append("\n");
		pgs.replace(tag, fileslist.toString());

		return pgs.str;
	}
//=======================================================================
/**
 *	Generate the Makefile for java.
 */
//=======================================================================
	protected void generateMakefile(String filename)
						throws	IOException, PogoException
	{
		System.out.println("Generating " + filename + "....");

		//	Open and read template file
		//----------------------------------------
		String template = pogo.templates_dir + "/java/Makefile";
		FileInputStream		fidin = new FileInputStream(template);
		int nb = fidin.available();
		byte[]	inStr  = new byte[nb];
		fidin.read(inStr);
		PogoString pgs = new PogoString(inStr);
		fidin.close();
		pgs = PogoUtil.removeLogMessages(pgs);

		while (pgs.str.indexOf(PogoDefs.templateClass)>=0)
			pgs.replace(PogoDefs.templateClass, pogo.class_name);
		String	newcode = addClassToMakefile(pgs);
		

		//	Write the new file
		FileOutputStream	fidout = new FileOutputStream(filename);
		fidout.write(newcode.getBytes());
		fidout.close();
	}
//=======================================================================
/**
 *	Generate java source for tango device Server from Pogo Class definition.
 *
 *	@throws FileNotFoundException
 *	@throws SecurityException
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file.
 */
//=======================================================================
	public void generate() throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		String	makefile = new String(pogo.projectFiles.getPath() + "/Makefile");
		String	server   = new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + ".java");
		String	serverclass = new String(pogo.projectFiles.getPath() + "/" + pogo.class_name + "Class.java");

		sbTrace = new StringBuffer("Java source code generation:\n\n");

		//	Generate Makefile
		//------------------------------
		if (mustGenerate(makefile))
		{
			generateMakefile(makefile);
			sbTrace.append(makefile + "        Created\n");
		}

		//	Generate Commands.java
		//--------------------------------
		generateCommandClasses();

		//	Generate DevServ.java
		//------------------------------
		JavaServer		serv = new JavaServer(pogo);
		serv.generateSource(server);
		sbTrace.append(server + "        Writen\n");

		//	Generate DevServClass.java
		//------------------------------
		JavaServerClass		sc = new JavaServerClass(pogo);
		sc.generateSource(serverclass);
		sbTrace.append(serverclass + "        Writen\n");

/*
		//	Buit the read me file
		//--------------------------------
		buildReadMeFile(new String(pogo.templates_dir + "/java/README"),
						new String(pogo.projectFiles.getPath() + "/" + "README"));
*/
	}
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
