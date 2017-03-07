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
// Revision 3.7  2006/06/26 09:22:47  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.6  2005/11/24 08:29:16  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.5  2005/03/15 08:01:52  pascal_verdier
// Bug on get_class_property() from template fixed.
//
// Revision 3.4  2005/01/28 12:43:53  pascal_verdier
// Bug with spaces/tab fixed.
//
// Revision 3.3  2004/11/29 09:49:19  pascal_verdier
// if device property not found in database, it takes class property value if exists in java.
//
// Revision 3.2  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.1  2004/08/26 07:14:30  pascal_verdier
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
//
// copyleft 1999 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;

import fr.esrf.TangoDs.TangoConst;

import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *	This class generates Cpp source file for Server files.
 *
 * @author	$Author$
 * @version	$Revision$
 */
public class JavaServer extends PogoGene implements PogoDefs, TangoConst
{
	private String			classname;
	private PropertyTable	properties;
	private	static String	readprop_method_name = "get_device_property";
	private	String			readprop_method_signature;
	private	String			init_signature;
	//================================================================
	/**
	 *	Constructor
	 */
	//================================================================
	public JavaServer(PogoClass pogo)
	{
		super(pogo);
		properties = pogo.dev_properties;
		classname = pogo.class_name;

		//	Build the init_device and get property method signatures
		//------------------------------------------------------------
		init_signature = "public void init_device()";

		readprop_method_signature = "public void " +
										readprop_method_name + "()";
	}





//=========================================================================
/*	Source file generation
//=========================================================================


	//================================================================
	/**
	 *	Generate the java Server.java file.
	 */
	//================================================================
	public void generateSource(String server) throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		System.out.println("Generating " + server + "....");

		//	Read Template file
		//----------------------------
		String	filename;
		boolean	src_exist = already_exists(server);
		if (src_exist)
			filename = server;
		else
			filename = pogo.templates_dir + "/java/" +
											templateFile + ".java";
		PogoString readcode = new PogoString(PogoUtil.readFile(filename));
		if (!src_exist)
			readcode = PogoUtil.removeLogMessages(readcode);

		//	Replace template pattern
		//----------------------------------
		if (!src_exist)
		{
			while (readcode.str.indexOf(templateClass)>=0)
				readcode.replace(templateClass, pogo.class_name);
		}
		
		//	Add the methods where commands are really executed
		//--------------------------------------------------------
		String	newcode = readcode.str;
		if (src_exist)
			newcode = checkForExecMethodModif(new PogoString(newcode), javaLang);
		newcode = addMethodsToExecuteCmd(newcode);
		
		//	Manage class description
		//----------------------------------
		newcode = addClassDescription(newcode);

		//	Manage states
		//----------------------------------
		newcode = addStatesDescriptions(newcode);

		//	manage attributes
		//----------------------------------
		if (pogo.attributes.size()>0)
			newcode = buildAttributesMethods(new PogoString(newcode), javaLang);

		//	manage properties
		//----------------------------------
		if (properties.size()>0)
		{
			newcode = properties.addJavaDataMembers(newcode);
			newcode = addReadPropMethod(new PogoString(newcode));
		}

		//	Open and write file
		//----------------------------------
        PogoUtil.writeFile(server, newcode);
	}
//=======================================================================
/**
 *	Add the methods where the commands are really executed.
 *
 *	@param	readcode	read source code.
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String addMethodsToExecuteCmd(String readcode)
						throws PogoException
	{
		PogoString	newcode	= new PogoString(readcode);

		//	Serch the place to insert
		//----------------------------------------
		int		start = 0;
		if ((start=newcode.str.indexOf(mainSignature, start))<0)
		    throw new PogoException("Input File Syntax error !\n"+
										mainSignature + "\nNot Found !");
		
		start = newcode.str.lastIndexOf("}", start);
		start += 2;

		//	Add description for commands/method 
		//----------------------------------------
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdAt(i);
			if (!cmd.virtual_method ||
				(cmd.virtual_method && cmd.override_method!=NOT_OVERRIDE))
			{
				boolean	generate = true;
				int		sig_pos;
				String	signature = cmd.buildJavaExecCmdMethodSignature(SERVER);
				//	Search the bigining of exec method.
				//----------------------------------------
				if ((sig_pos=newcode.str.indexOf(signature))>0)
					generate = false;
				
				//	Test if must be generated or already exists
				//-----------------------------------------------		
				if (generate)
				{
					//	Must be generated
					String  method = cmd.buildJavaExecCmdMethodComments();
					method += "\t"+cmd.buildJavaExecCmdMethod();

                    //  Re-search start position (could have changed if comment have changed bellow)
                    start = newcode.str.indexOf(mainSignature, start);
                    start = newcode.str.lastIndexOf("}", start);
                    start += 2;
                    newcode.insert(start, method);
                }
				else
				{
					//	Replace only comments (could have been changed)
					int	start_comments = newcode.str.lastIndexOf("}", sig_pos) + 3;
					String old_comments = newcode.str.substring(start_comments, sig_pos);
					newcode.replace(old_comments, cmd.buildJavaExecCmdMethodComments()+"\t");					
				}
			}
		}
		//System.out.println(method);
		return newcode.toString();
	}



//=======================================================================
/**
 *	Add the read properties method if does not exist.
 *
 *	@param	readcode	read source code.
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	private String addReadPropMethod(PogoString readcode)
							throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException
	{
		//	If no properties then do nothing
		//-----------------------------------------
		if (properties.size()==0)
			return readcode.str;

		//	Get the template method
		//----------------------------
		String	templatefile = pogo.templates_dir +
    							"/java/readPropMethodName.java";
		PogoString method = new PogoString(PogoUtil.readFile(templatefile));
		method = PogoUtil.removeLogMessages(method);


		//	Get only the second mehod for device.
		int	start;
		start = method.str.indexOf("//================================");
		start = method.str.indexOf("//================================", start+1);
		start = method.str.indexOf("//================================", start+1);
		method.str = method.str.substring(start);

		//	Extract method code
		//-----------------------------------------------------------
		while (method.str.indexOf(templateClass)>=0)
			method.replace(templateClass, pogo.class_name);
		while (method.str.indexOf("target")>=0)
			method.replace("target", "device");
		String template_method = method.str;

		//	search it
		//----------------------------
		if (readcode.str.indexOf(readprop_method_signature)<0)
		{
			//	 init_device method.
			//--------------------------------------
			if ((start=readcode.str.indexOf(init_signature))<0)
				throw new PogoException("Syntax error in input file\n"+
										init_signature +
										"\n Not Found !");
			start = readcode.inMethod(start);
			start = readcode.outMethod(start) + 1;

			//	If does not already exists -> add tenplate
			//------------------------------------------------
			readcode.insert(start, template_method);
		}

		//	Build the new one
		//----------------------
		readcode.str = properties.updateJavaMethod(readcode.str, "device", classname);

		//	Add method cal
		//------------------------------
		addReadPropMethodCall(readcode);
		return readcode.str;
	}
//=======================================================================
/**
 *	Search init_device method and 
 *	add the read properties method call if does not exist.
 *
 *	@param	readcode	read source code.
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	private void addReadPropMethodCall(PogoString readcode)
						throws PogoException
	{
		//	Extract the init_device method.
		//--------------------------------------
		int	start, end;
		if ((start=readcode.str.indexOf(init_signature))<0)
			throw new PogoException("Syntax error in input file\n"+
									init_signature + "\n Not Found !");
		
		start = readcode.inMethod(start);
		end   = readcode.outMethod(start);
		String	meth_core = readcode.str.substring(start, end);
		
		//	Check if method call alredy exists
		//---------------------------------------
		if (meth_core.indexOf(readprop_method_name)>=0)
			return;

		//	Else search the good place to insert.
		//--------------------------------------------
		start = readcode.str.indexOf("Initialise variables to default values", start);
		start = readcode.nextCr(start) + 1;
		start = readcode.nextCr(start) + 1;
		readcode.insert(start, "\t\t"+ readprop_method_name+"();\n");
	}
//===============================================================
/**
 *	Write the state descriptions
 *
 *	@param	readcode	The read source code.
 *	@return the modified code.
*	@throws	PogoException	If a synthax error occured on input file
 */
//===============================================================
	protected String addStatesDescriptions(String readcode)
							throws	PogoException
	{
		PogoString	pg = new PogoString(readcode);
		//	Get previous declaration
		int	start, end;
		if ((start=pg.str.indexOf(startStateStr))<0)
			throw new PogoException("Input File Syntax error !\n" +
										startStateStr + "\n Not found !");
		if ((end=pg.str.indexOf(endStateStr))<0)
			throw new PogoException("Input File Syntax error !\n" +
										endStateStr + "\n Not found !");
		String	prev_code = pg.str.substring(start, end);
			
		//	Buid the String to be inserted
		StringBuffer	sb = new StringBuffer(startStateStr);
		sb.append("\n/*\n");
		sb.append(pogo.states.toStringComments(javaLang));
		sb.append(" */\n");
		pg.replace(prev_code, sb.toString());
		return pg.str;
	}
//===============================================================
/**
 *	Write the class description just before author definition
 *
 *	@param	readcode	The read source code.
 *	@return the modified code.
*	@throws	PogoException	If a synthax error occured on input file
 */
//===============================================================
	protected String addClassDescription(String readcode)
							throws	PogoException
	{
		PogoString	pg = new PogoString(readcode);
		//	Get previous declaration
		int	start, end;
		String	startComments =  " *	Class Description:";
		if ((start=pg.str.indexOf(startComments))<0)
		{
			//	Check without tab
			startComments = " * Class Description:";
			if ((start=pg.str.indexOf(startComments))<0)
				throw new PogoException("Input File Syntax error !\n" +
										startComments+ "\n Not found !");
		}
		String	author = " * @author	$Author:";
		if ((end=pg.str.indexOf(author))<0)
			throw new PogoException("Input File Syntax error !\n" +
										author + "\n Not found !");
		String	prev_code = pg.str.substring(start, end);
			
		//	Buid the String to be inserted
		StringBuffer	sb = new StringBuffer(startComments);
		sb.append("\n *	");
		PogoString	desc = new PogoString(pogo.class_desc);
		sb.append(desc.setComments());
		sb.append("\n *\n");
		pg.replace(prev_code, sb.toString());
		return pg.str;
	}

}
