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
// Revision 3.12  2006/06/26 09:22:47  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.11  2006/01/30 11:02:10  pascal_verdier
// Revision and cvsroot are taken from CVS files if exists.
// Doc in pdf generated if linux.
//
// Revision 3.10  2005/11/24 08:29:49  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.9  2005/10/12 13:50:45  pascal_verdier
// Fix a bug in adding pdf or doc file download.
//
// Revision 3.8  2005/09/07 08:19:19  pascal_verdier
// Property Default value managed and set for wizard usage.
//
// Revision 3.7  2005/03/29 15:02:25  pascal_verdier
// Bug on change class name fixed.
//
// Revision 3.6  2005/01/24 08:42:05  pascal_verdier
// Modifying previous files if class name has changed.
//
// Revision 3.5  2004/11/22 15:29:31  pascal_verdier
// Javadoc tags correction.
//
// Revision 3.4  2004/11/12 08:05:17  pascal_verdier
// minor bugs fixed.
//
// Revision 3.3  2004/10/25 14:03:54  pascal_verdier
// Minor changes.
//
// Revision 3.2  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.1  2004/08/26 07:19:29  pascal_verdier
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
// Revision 1.10  2000/03/03 09:45:56  verdier
// States Management has been added (for .pogo files).
//
// Revision 1.8  2000/01/12  10:23:28  verdier
// Set as description the methods where the arguments have been modified.
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
//
// copyleft 1999 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;

import fr.esrf.TangoDs.TangoConst;

import java.io.*;


/**
 *	This class generates source file.
 *	it could generate .pogo, .cpp or .java files.
 */
public class PogoGene implements PogoDefs, TangoConst
{
/**
 *	Pogo Class to be used for generation.
 */
	PogoClass	pogo;
/**
 *	trace used during code generation.
 */
 protected String	strTrace;

//=======================================================================
/**
 *	Constructors for Pogo Class definition.
 *
 *	@param	pogo	Pogo Class definition used for generation.
 */
//=======================================================================
	public PogoGene(PogoClass pogo)
	{
		this.pogo = pogo;
	}

//=======================================================================
	public String getTrace()
	{
		return strTrace;
	}

//=======================================================================
/**
 *	Test if file already exists.
 *
 *	if exists -> do not generate else generate.
 *
 *	@param	filename	File name to be checked.
 *	@return true if do not exists (ok to generate.
 */
//=======================================================================
	static protected boolean mustGenerate(String filename)
	{
		return !already_exists(filename);
	}
//=======================================================================
/**
 *	Test if file already exists.
 *
 *	if exists -> do not generate else generate.
 *
 *	@param	filename	File name to be checked.
 *	@return true if exists.
 */
//=======================================================================
	static protected boolean already_exists(String filename)
	{
		return (new File(filename).exists());
	}
//=======================================================================
/**
 *	Put the method begining at startline in description
 *
 *	@param	pgs			A PogoString containing the method to be put in description.
 *	@param	startline	Index in pgs where the method begins.
 *	@return				The method in commants.
 */
//=======================================================================
	protected String setMethodInComments(PogoString pgs, int startline)
	{
		int end_bl = pgs.inMethod(startline);
		end_bl = pgs.outMethod(end_bl);
		PogoString	pgs1 = new PogoString(pgs.str.substring(startline, end_bl));

		StringBuffer	sb = new StringBuffer("//");
		for (int i=0 ; i<pgs1.str.length() ; i++)
		{
			sb.append(pgs1.str.charAt(i));
			if (pgs1.str.charAt(i)=='\n')
				sb.append("//");
		}
		return sb.toString();
	}
//=======================================================================
/**
 *	Copy file 'f_in' to file 'f_out'.
 *
 *	@param	f_in	Input file name.
 *	@param	f_out	Output file name.
 */
//=======================================================================
	static public void copyFile(String f_in, String f_out)
					throws FileNotFoundException,IOException
	{
		copyFile(f_in, f_out, true);
	}
//=======================================================================
/**
 *	Copy file 'f_in' to file 'f_out'.
 *
 *	@param	f_in	Input file name.
 *	@param	f_out	Output file name.
 *	@param	remove	Remove the log messages if true.
 */
//=======================================================================
	static public void copyFile(String f_in, String f_out, boolean remove)
					throws FileNotFoundException,IOException
	{
		if (remove)
		{
			PogoString	readcode = new PogoString(PogoUtil.readFile(f_in));
			readcode = PogoUtil.removeLogMessages(readcode);
			PogoUtil.writeFile(f_out, readcode.str);
		}
		else
		{
			//	Directly bytes to bytes
			FileInputStream	fid = new FileInputStream(f_in);
			FileOutputStream	fidout = new FileOutputStream(f_out);
			int nb = fid.available();
			byte[]	inStr  = new byte[nb];
			if (fid.read(inStr)>0)
    			fidout.write(inStr);

            fid.close();
			fidout.close();
		}
	}
//=======================================================================
/**
 *	Copy files from a source directory to a target one
 *
 *	@param	src		Input directory name.
 *	@param	target	Output directory name.
 */
//=======================================================================
	static public void copyDirectory(String src, String target)
					throws FileNotFoundException,IOException
	{
		File	src_dir    = new File(src);
		File	target_dir = new File(target);
		if (!target_dir.exists())
			target_dir.mkdir();

		System.out.println("Copiing " + src + " to " + target);
		String[]	src_files = src_dir.list();
		if (src_files==null)
		{
			System.out.println("	ERROR");
			return;
		}
		for (int i=0 ; i<src_files.length ; i++)
		{
			String	src_file = src + "/" + src_files[i];
			if (! new File(src_file).isDirectory())	//	Not recursive
			{
				String	target_file = target_dir + "/" + src_files[i];
				//System.out.println("Copiing " + src_file + " to " + target_file);
				copyFile(src_file, target_file, false);
			}
		}
	}
//=======================================================================
/**
 *	Read a file a rewrite it after pattern replacement.
 *
 *	@param	f_in	Input file's name.
 *	@param	f_out	Output file's name.
 *	@param	to_find	Pattern to be replaced.
 *	@param	target	New Pattern.
 *	@throws	IOException
 */
//=======================================================================
	protected void replacePatternFile(String f_in, String f_out, String to_find, String target)
					throws	FileNotFoundException, 
							SecurityException,
							IOException
	{
		//	Open and read file
		//-------------------------
		PogoString	pgs = new PogoString(PogoUtil.readFile(f_in));
		pgs = PogoUtil.removeLogMessages(pgs);

		//	Search and Replace
		//-------------------------
		for (int start=0 ; (start=pgs.str.indexOf(to_find, start))>=0 ;
					start += target.length())
			pgs.replace(start, to_find, target);

		//	Write result
		//-------------------------
		PogoUtil.writeFile(f_out, pgs.str);
	}
//=======================================================================
/**
 *	Set old execute method in description and Generate the new one
 *
 *	@param	cmd		Command fo this execute method.
 *	@param	str		String containig the method to be updated.
 *	@param	idx		index where the execute method begins in str.
 *	@param	lang	language to bo generated.
 *	@return	String containing the old execute method in description and anew one.
 */
//=======================================================================
	protected String changeExeMethodArgs(Cmd cmd, String str, int idx, int lang)
	{
		StringBuffer	sb = new StringBuffer(str);
		boolean			in_method = false;
		int				cnt = 0;
		char			c;
		String			description;

		sb.insert(idx, "//");
		while (!in_method || cnt>0)
		{
			if ((c=sb.charAt(idx++))=='\n')
				sb.insert(idx, "//");
			if (c=='{')
			{
				cnt++;
				in_method = true;
			}
			else
			if (c=='}')
				cnt--;
		}

		switch (lang)
		{
		case PogoDefs.javaLang:
			description = cmd.buildJavaExecCmdMethodComments();
			sb.insert(idx, description);
			idx += description.length();
			sb.insert(idx, cmd.buildJavaExecCmdMethod());
			break;
		case PogoDefs.cppLang:
			/*****
			sb.insert(idx, "\n");
			idx += 2;
			description = cmd.buildCppExecCmdMethodComments(pogo.class_name);
			sb.insert(idx, description);
			idx += description.length();
			sb.insert(idx, cmd.buildCppExecCmdMethod(pogo.class_name));
			************/
			break;
		}
	
		//System.out.println(sb.toString());
		return sb.toString();
	}
//=======================================================================
/**
 *	Check if arguments have been modified in methods
 *	where commands are really executed.
 *
 *	@param	readcode		The read source code.
 *	@param	lang			Source language.
 *	@throws	PogoException	If a synthax error occured on input file.
 */
//=======================================================================
	protected String checkForExecMethodModif(PogoString readcode, int lang)
						throws PogoException
	{
		//	Update the header for args and descriptions
		//-------------------------------------------------
		if (lang==cppLang)
			for (int i=0 ; i<pogo.commands.size() ; i++)
			{
				Cmd		cmd = pogo.commands.cmdAt(i);
				if (!cmd.virtual_method)
					cmd.updateCppExecCmdMethodComments(readcode, pogo.class_name);
			}
		//	Don't forget to skip virtual status Cmds.
		//--------------------------------------------
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdAt(i);
			if (!cmd.virtual_method)
			{
				int		startmethod;
				int		startline;
				int		endline;
				String	pattern;
				if (lang==cppLang)
					//pattern = cmd.buildCppExecCmdMethodSignature(pogo.class_name);
					pattern = pogo.class_name+ "::" + cmd.exec_method + "(";
				else
					pattern = cmd.exec_method + "(";
	
				//	Check if method does not already exists
				//--------------------------------------------
				endline = 0;
				boolean done = false;
				while (!done &&
					(startmethod=readcode.str.indexOf(pattern, endline))>=0)
				{
					//	keep only the line where the method's name has been found.
					//-------------------------------------------------------------
					startline = readcode.previousCr(startmethod);
					endline   = readcode.nextCr(startline);
					String	line = readcode.str.substring(startline, endline);
					//	Take Of "argin" could have change it's name.
					int	sl = line.indexOf("(");
					int	el = line.indexOf(")", sl);
					if (el<0)	el = sl+1 ;
					line = line.substring(0, el);

					//	check if method's arguments have been modified.
					//--------------------------------------------------
					if (cmd.isExecMethod(readcode.str.substring(startmethod, endline)))
					{
						if (line.indexOf("//")<0 &&		//	Not a comment
							line.indexOf("\"")<0 &&		//	not a trace
							line.indexOf("<<")<0 &&		//	not a C++ trace
							line.indexOf("println")<0)	//	not a java trace
						{
							if (cmd.execMethodArgsChanged(line, lang))
							{

								String s = changeExeMethodArgs(cmd,
												readcode.str, startline, lang);
								readcode = new PogoString(s);
							}
							done = true;
						}
					}
				}
			}
		}
		return readcode.str;
	}
//=======================================================================
/**
 *	Replace the project title by the PogoClass object field content.
 *	
 *	@param	header	File header String where the project title will be replaced.
 *	@return The header String with the new project title.
 */
//=======================================================================
	protected String setProjectTitle(String header)
	{
		int	start, end;
		if ((start=header.indexOf(projectTitleRes))<0)
			return header;		// No title found -> Do not modify
		
		start += projectTitleRes.length();
		end    =  header.indexOf("\n", start);
		return header.substring(0, start) +
		            "\t" + pogo.title +
                    header.substring(end);
	}
//=======================================================================
/**
 *	Get the Attribute Read/Write template
 *
 *	@param	f_in	Input template file.
 *	@param	part	Read or Write part.
 *	@throws FileNotFoundException
 *	@throws SecurityException
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String readAttributeTemplate(String f_in, int part)
										throws	FileNotFoundException,
												SecurityException,
												IOException,
												PogoException
	{
		//	Read The Read Write Attribute Template file.
		//-------------------------------------------------------------
		PogoString rw = new PogoString(PogoUtil.readFile(f_in));

		//	Replace key with class name
		//--------------------------------------
		rw = PogoUtil.removeLogMessages(rw);
		while(rw.str.indexOf(templateClass)>=0)
			rw.replace(templateClass, pogo.class_name);

		//	extract Read and write part
		//----------------------------------------
		int	end;
		if ((end=rw.str.indexOf("WRITE ATTRIBUTE"))<0)
			throw new PogoException("\'WRITE ATTRIBUTE\' method not found");
		end = rw.previousCr(end);
		
		String	str = null;
		switch (part)
		{
		case readFile:
			str = rw.str.substring(0, end);
			break;

		case writeFile:
			int start = rw.nextCr(end)+1;
			str = rw.str.substring(start);
			break;
		}
		return str;
	}
//=======================================================================
/**
 *	Get the Attribute Read/Write template
 *
 *	@param	pgs		Source code read from file.
 *	@param	lang	Output language.
 *	@throws FileNotFoundException
 *	@throws SecurityException
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected String buildAttributesMethods(PogoString pgs, int lang)
										throws	PogoException,
												IOException,
												FileNotFoundException
	{
		String	tab = (lang==javaLang)? "\t\t" : "\t";
		int		start, end, ptr;

		//	If java -> add attribute data members
		//-----------------------------------------------
		if (lang==javaLang)
		{
			//	Get previous declaration
			if ((start=pgs.str.indexOf(startAttrStr))<0)
				throw new PogoException("Input File Syntax error !\n"+
													startAttrStr +
													"\nNot Found !");

			if ((end=pgs.str.indexOf(endAttrStr))<0)
				throw new PogoException("Input File Syntax error !\n" +
											endAttrStr +
											"\n Not found !");
			String	prev_declar = pgs.str.substring(start, end);

			//	And build the new one		
			StringBuffer	sb = new StringBuffer(startAttrStr);
			sb.append("\n\n");
			for (int i=0 ; i<pogo.attributes.size() ; i++)
			{
				//	Build description as comments
				Attrib	attr = pogo.attributes.attributeAt(i);
					sb.append(attr.javaMemberData());
			}
			sb.append("\n");
			pgs.replace(prev_declar, sb.toString());
		}

		//	Build template name and get the read and write part
		//-----------------------------------------------------------
		String rwAttr;
		if (lang==javaLang)
			rwAttr = pogo.templates_dir + "/java/ReadWriteAttr.java";
		else
			rwAttr = pogo.templates_dir + "/cpp/ReadHardwareAttr.cpp";
		String	read  = readAttributeTemplate(rwAttr, readFile);
		String	write = readAttributeTemplate(rwAttr, writeFile);
		
		//	Checking for read_attr_hardware method already exists
		//	If not exists insert it from template.
		//-------------------------------------------------------------
		String	pattern;
		if (lang==javaLang)
			pattern = "public void read_attr_hardware";
		else
			pattern = "::read_attr_hardware";
		if (pgs.str.indexOf(pattern)<0)
		{
			//	insert Reading attr part
			//--------------------------------
			if (lang==javaLang)
				pattern = "always_executed_hook()";
			else
				pattern = "::always_executed_hook";
			if ((ptr=pgs.str.indexOf(pattern))<0)
				throw new PogoException("\'" + pattern + "()\' method not found");
			ptr = pgs.inMethod(ptr)+1;
			ptr = pgs.outMethod(ptr)+1;
			pgs.insert(ptr, read);
		}

		//	check if at least one attribute is writable
		//	If True and does not already exist
		//		--> Insert  write_attr_hardware method.
		//--------------------------------------------------
		boolean	writable = false;
		for (int i=0 ; i<pogo.attributes.size() ; i++)
		{
			Attrib	attr = pogo.attributes.attributeAt(i);
			if (attr.getWritable())
				writable = true;
		}
		if (lang==javaLang)
			pattern = "public void write_attr_hardware";
		else
			pattern = "::write_attr_hardware";
		if (writable && pgs.str.indexOf(pattern)<0)
		{
			//	Inssert Writing part
			//--------------------------------
			if (lang==javaLang)
				pattern = "public void always_executed_hook()";
			else
				pattern = "::always_executed_hook()";
			ptr = pgs.str.indexOf(pattern);
			ptr = pgs.inMethod(ptr)+1;
			ptr = pgs.outMethod(ptr)+1;
			pgs.insert(ptr, write);
		}

		//----------------------------------------------
		//	Checking for read_attr method
		//	Get the method core
		//----------------------------------------------
		if (lang==javaLang)
			pattern = "public void read_attr(";
		else
			pattern = "::read_attr(";
		if ((start=pgs.str.indexOf(pattern))<0)
			throw new PogoException("\'" + pattern + ")\' method not found");
		start = pgs.inMethod(start)  + 1;
		end   = pgs.outMethod(start);
		//	take off brackets
		end = pgs.str.lastIndexOf('}', end);
		PogoString	method = new PogoString(pgs.str.substring(start, end));
		String	 oldmethod = method.str;
		
		//	Start at Switch of attribute name
		//---------------------------------------------
		if ((ptr=method.str.indexOf("Switch on attribute name"))<0)
		{
			System.out.println(method);
			throw new PogoException("\'Switch on attribute name\' not found");
		}

		ptr = method.nextCr(ptr)+1;
		ptr = method.nextCr(ptr)+1;

		for (int i=0 ; i<pogo.attributes.size() ; i++)
		{
			Attrib	attr = pogo.attributes.attributeAt(i);
			if (attr.rwType!=ATTR_WRITE)
			{
				//	Check if alredy exists
				//--------------------------------------
				String	target	= "\""+ attr.name + "\"";
				if (method.str.indexOf(target, ptr)<0)	//	Does not exist -> generate
				{
					String  str = "";

					//	if not the first attr, add else before this one
					if (i!=0)
						str += tab + "else\n";
					str += tab + "if (attr_name == "+target+")\n" +
					        tab + "{\n" +
                            tab + "\t//	Add your own code here\n" +
                            tab + "}\n";

					//	if not the first attr, get the end of last done
					int		here;
					if (i!=0)
						here = method.str.lastIndexOf("}", method.str.length())
														+ "}\n".length();
					else
						here = ptr;
					method.insert(here, str);
				}
			}
		}
		pgs.replace(oldmethod, method.str);

		//----------------------------------------------
		//	Checking for write_attr_hardware method
		//	Get the method core
		//----------------------------------------------
		if (writable)
		{
			if (lang==javaLang)
				pattern = "public void write_attr_hardware(";
			else
				pattern = "::write_attr_hardware";
			if ((start=pgs.str.indexOf(pattern))<0)
				throw new PogoException("\'" + pattern + "\' method not found");
			start = pgs.inMethod(start)  + 1;
			end   = pgs.outMethod(start) - 2;	//	Take off Brackets
			method    = new PogoString(pgs.str.substring(start, end));
			oldmethod = method.str;

			//	Start at Switch of attribute name
			//---------------------------------------------
			if ((ptr=method.str.indexOf("Switch on attribute name"))<0)
				throw new PogoException("\'Switch on attribute name\' not found");

			ptr = method.nextCr(ptr)+1;
			ptr = method.nextCr(ptr)+1;

			for (int i=0, n=0 ; i<pogo.attributes.size() ; i++)
			{
				Attrib	attr = pogo.attributes.attributeAt(i);

				//	Check if attribute is writable
				//----------------------------------------
				tab = (lang==javaLang)? "\t\t\t" : "\t\t";
				if (attr.getWritable())
				{
					//	Check if alredy exists
					//--------------------------------------
					String	target	= "\""+ attr.name + "\"";
					if (method.str.indexOf(target, ptr)<0)	//	Does not exist
					{
						String  str ="";
						//	if not the first attr, add else before this one
						if (n!=0)
							str += tab + "else\n";
						str += tab + "if (attr_name == "+target+")\n" +
						        tab + "{\n" +
                                tab + "\t//	Add your own code here\n" +
						        tab + "}\n";
						//	if not the first attr, get the end of method
						int		here;
						if (n!=0)
						{
							here = method.str.lastIndexOf("}", method.str.length());
							here = method.str.lastIndexOf("}", here-1) + "}\n".length();
						}
						else
							here = ptr;
						method.insert(here, str);
					}
					n++;	//	Count writable
				}
			}
			pgs.replace(oldmethod, method.str);
		}
		return pgs.toString();
	}
//=======================================================================
/**
 *	Build a README file to help programmer.
 *
 *	@param	f_in	Input file's name.
 *	@param	f_out	Output file's name.
 */
//=======================================================================
	protected void buildReadMeFile(String f_in, String f_out)
	{
		try {
		PogoString	pgs = new PogoString(PogoUtil.readFile(f_in));
		pgs = PogoUtil.removeLogMessages(pgs);
		while (pgs.str.indexOf(templateClass)>0)
			pgs.replace(templateClass, pogo.class_name);

		FileOutputStream	fidout = new FileOutputStream(f_out);
		fidout.write(pgs.str.getBytes());
		
		//	Special Case for java (One file for each command).
		//---------------------------------------------------------
		if (pogo.language==javaLang)
		{
			for (int i=0 ; i<pogo.commands.size() ; i++)
			{
				Cmd		cmd = pogo.commands.cmdAt(i);
				if (!cmd.virtual_method)
				{
					String	str = cmd.name + "Cmd" + javaExtention +
								":\n\t" + 
								"Java source code for the command " +
								cmd.name + "\n\t" + cmd.description+ "\n\n";
					fidout.write(str.getBytes());
				}
			}
		}
		fidout.close();
		}
		catch(Exception ex) {
			System.out.println("README Cannot be generated\n" + ex.toString());
		}
	}
	
	
//=======================================================================
/**
 *	Build a client proxy methods.
 *
 */	
//=======================================================================
	private String buildProxyMethods()
	{
		StringBuffer	sb = new StringBuffer();

		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd		cmd = pogo.commands.cmdAt(i);
			sb.append(cmd.buildJavaExecCmdMethodComments());
			sb.append(cmd.buildJavaExecCmdMethodSignature(CLIENT_PROXY));
			//sb.append(cmd.buildJavaProxyMethod());
		}
		sb.append("\n\n");

		return sb.toString();
	}
//=======================================================================
/**
 *	Build a client proxy source file.
 *
 *	@param template		file read as template to generate
 *	@param proxyfile	file to be generated.
 *	@param proxyclass	client proxy name.
 */
//=======================================================================
	protected void buildClientProxyFile(String template, String proxyfile, String proxyclass)
										throws	PogoException,
												IOException,
												FileNotFoundException
	{
		
		if (mustGenerate(proxyfile))
		{
			System.out.println("Generating " + proxyfile);
			//	Does not already exist -> read template and prepeare.
			PogoString	pgs = new PogoString(PogoUtil.readFile(template));

			pgs = PogoUtil.removeLogMessages(pgs);
			while (pgs.str.indexOf("TangoclassProxy")>=0)
				pgs.replace("TangoclassProxy", proxyclass);

			PogoUtil.writeFile(proxyfile, pgs.str);
		}
		//	Read file and keep only methods part.
		PogoString	pgs = new PogoString(PogoUtil.readFile(proxyfile));

		//	Search constructor signature
		int		start, end;
		String constructor = "public " + proxyclass + 
							 "(String devname) throws DevFailed";
		end = pgs.str.indexOf(constructor);
		end = pgs.inMethod(end);
		end = pgs.outMethod(end) + 1;
		constructor = pgs.str.substring(0, end);

		// Search main signature
		start = pgs.str.indexOf(mainSignature);
		start = pgs.str.lastIndexOf("/**", start);
		start = pgs.str.lastIndexOf("//==========", start);
		String	main = pgs.str.substring(start);


		//Write output file
        PogoUtil.writeFile(proxyfile, constructor+buildProxyMethods()+main);
	}
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
