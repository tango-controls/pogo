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
// Revision 3.3  2005/11/24 08:28:45  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.2  2004/09/07 12:02:44  pascal_verdier
// Remove CVS log messages and info from templates.
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
//
// copyleft 1999 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.appli;

import pogo.gene.*;

import java.io.*;


/**
 *	This class start an external editor to
 *	view/edit Pogo file source code.
 */
public class EditPogoCode extends Thread implements PogoDefs
{
/**
 *	Pogo Class to be used for generation.
 */
private PogoClass	pogo;
private String		srcFilename;
private String		editor;
private int			lineNum;
//=======================================================================
/**
 *	Constructors for EditPogoCode use.
 *
 *	@param	pogo	Pogo Class definition used for editing.
 */
//=======================================================================
	public EditPogoCode(PogoClass pogo)
	{
		this.pogo = pogo;
		
		if (pogo.language == cppLang)
			srcFilename = new String(pogo.projectFiles.getPath() + "/" +
									pogo.class_name + cppExtention);
		else
			srcFilename = new String(pogo.projectFiles.getPath() + "/" +
									pogo.class_name + javaExtention);
		//	get the prefered editor
		//----------------------------------
		String	nedit = "nc -noask";
		if ((editor=System.getProperty("EDITOR"))==null)
			editor = nedit;
		else
		if (editor.length()==0)
			editor = nedit;
		else
		if (editor.equals("nedit"))
			editor = nedit;
		else
		if (editor.equals("vi"))
			editor = "xterm -e vi";
		//	else get editor as defined.
	}
	
	
//=======================================================================
/**
 *	Serch the target string into source code 
 *	and count the neumeber of lines.
 *
 *	@param	target	the string to search.
 *	@return the line nuber where target has been found.
 */
//=======================================================================
	private int searchLineNumber(String target) throws	FileNotFoundException,
														IOException,
														PogoException
	{
		//	Open and read file
		//----------------------------------------
		String	srcCode = PogoUtil.readFile(srcFilename);
		//	Search it
		//----------------
		int	end;
		if ((end=srcCode.indexOf(target))<0)
			throw new PogoException(target+"\nMethod not found");
		int line = 0;
		for (int i=0 ; i<end ; i++)
		{
			if (srcCode.charAt(i)=='\n')
				line++;
		}
		line++;
		return line;
	}
//=======================================================================
/**
 *	Search the execute command method and start an editor.
 *
 *	@param	cmdName					the command eecute method to be edited.
 *	@throws	FileNotFoundException	Source file not found.
 *	@throws	PogoException			Method not found.
 *	@throws	InterruptedException	Forking editor failed.
 */
//=======================================================================
	public void setCommandTarget(String cmdName)
							throws	FileNotFoundException,
									IOException,
									PogoException
	{
		//	Search Command to treated.
		//-------------------------------------
		Cmd		cmd = pogo.commands.cmdAt(0);
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			cmd = pogo.commands.cmdAt(i);
			if (cmd.name.equals(cmdName))
				break;
		}

		//	Built line to be found.
		//------------------------------
		String		target;
		if (pogo.language == cppLang)
			target = cmd.buildCppExecCmdMethodSignature(pogo.class_name);
		else
			target = cmd.buildJavaExecCmdMethodSignature(SERVER);

		//	Get only first part, because the argin name could be changed.
		//------------------------------------------------------------------
		target = target.substring(0, target.indexOf("(")+1);

		lineNum = searchLineNumber(target);
	}
//=======================================================================
/**
 *	Search the attributes management method and start an editor.
 *
 *	@throws	FileNotFoundException	Source file not found.
 *	@throws	PogoException			Method not found.
 *	@throws	InterruptedException	Forking editor failed.
 */
//=======================================================================
	public void setAttributeTarget(String attname) throws FileNotFoundException,
											IOException,
											PogoException
	{
		//	Built line to be found.
		//------------------------------
		String	target;
		if (pogo.language == cppLang)
			target = "void " + pogo.class_name + "::read_" + attname +"(Tango::Attribute &attr)";
		else
			target = "public void read_attr_hardware(Vector attr_list)";

		lineNum = searchLineNumber(target);
	}
//=======================================================================
/**
 *	Search the Machine State description
 *
 *	@throws	FileNotFoundException	Source file not found.
 *	@throws	PogoException			Method not found.
 *	@throws	InterruptedException	Forking editor failed.
 */
//=======================================================================
	public void setStateTarget() throws FileNotFoundException,
											IOException,
											PogoException
	{
		//	Built line to be found.
		//------------------------------
		String	target;
		if (pogo.language == cppLang)
			target = "This file contains the methods to allow commands and attributes";
		else
			target = "public void read_attr_hardware(Vector attr_list)";

		int	idx = srcFilename.lastIndexOf(".", srcFilename.length()-1);
		srcFilename = srcFilename.substring(0, idx) + "StateMachine" + 
						srcFilename.substring(idx);
		lineNum = searchLineNumber(target);
	}

//=======================================================================
/**
 *	Search the properties management method and start an editor.
 *
 *	@param	type	class or device properties
 *	@throws	FileNotFoundException	Source file not found.
 *	@throws	PogoException			Method not found.
 *	@throws	InterruptedException	Forking editor failed.
 */
//=======================================================================
	public void setPropertiesTarget(int type) throws FileNotFoundException,
													IOException,
													PogoException
	{
		String[]	method_name = {	"get_class_property()" ,
									"get_device_property()"};
		//	if class properties, source file classnameClass file
		//---------------------------------------------------------
		if (type==CLASS_PROPERTIES)
		{
			int	idx = srcFilename.lastIndexOf(".", srcFilename.length()-1);
			srcFilename = srcFilename.substring(0, idx) + "Class" + 
							srcFilename.substring(idx);
		}
		//	Built line to be found.
		//------------------------------
		String	target;
		String	s = (type==CLASS_PROPERTIES)? "Class" : "";
		if (pogo.language == cppLang)
			target = "void " + pogo.class_name + s + "::" + method_name[type];
		else
			target = "public void " + method_name[type];

		lineNum = searchLineNumber(target);
	}
//===============================================================
//===============================================================
	String getSrcFilename()
	{
		return srcFilename;
	}

//===============================================================
/**
 *	Fork the editor an go to the line where target has been found.
 */
//===============================================================
	public void run()
	{
		try
		{
			//	Fork an editor for this line
			//----------------------------------
			String	cmdStr = new String(editor + " +" + lineNum + " " + srcFilename);
			Process proc = Runtime.getRuntime().exec(cmdStr);

			// get command's output stream and
			// put a buffered reader input stream on it.
			//-------------------------------------------
			InputStream istr = proc.getInputStream();
			BufferedReader br =
                new BufferedReader(new InputStreamReader(istr));
			StringBuffer	sb = new StringBuffer(cmdStr+"\n\n");
    
			// read output lines from command
			//-------------------------------------------
			String str1;
			while ((str1 = br.readLine()) != null)
				sb.append(str1+"\n");

			// wait for end of command
			//---------------------------------------
			int retVal;
			if ((retVal=proc.waitFor())!=0)
				System.out.println(cmdStr + "\nproc.waitFor() : " + retVal + " !");

			// check its exit value
			//------------------------
			if ((retVal=proc.exitValue()) != 0)
				System.out.println(cmdStr + "\nproc.exitValue() : " + retVal + " !");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}

//-----------------------------------------------------------------------------
/* end of $Source$ */
