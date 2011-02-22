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
// Revision 3.4  2004/12/10 13:42:45  pascal_verdier
// *** empty log message ***
//
// Revision 3.3  2004/12/10 13:28:06  pascal_verdier
// Add missing "return true;" at end of _is_allowed methods.
//
// Revision 3.2  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.1  2004/08/26 07:19:29  pascal_verdier
// Attributes are now generated as class.
//
//
// copyleft 1999 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;

import java.io.*;
import java.util.*;
/**
 *	This class generates Cpp source file for ServerClass files.
 *
 * @author	$Author$
 * @version	$Revision$
 */
public class CppStateMachine extends PogoGene implements PogoDefs
{
	public CppStateMachine(PogoClass pogo)
	{
		super(pogo);
	}
//=======================================================================
/**
 *	Build the Allowed.cpp file.
 */
//=======================================================================
	void generateSource(String template, String src_filename) 
								throws	FileNotFoundException,
										SecurityException,
										IOException,
										PogoException

	{
		PogoString readcode;
		if (mustGenerate(src_filename))
		{
			readcode = new PogoString(
				PogoUtil.readFile(template, templateClass, pogo.class_name));
			readcode = PogoUtil.removeLogMessages(readcode);
		}
		else
			readcode = new PogoString(PogoUtil.readFile(src_filename));

		//	Do it for each attribute
		for (int i=0 ; i<pogo.attributes.size() ; i++)
		{
			Attrib	attr = pogo.attributes.attributeAt(i);
			String	signature = attr.allowedSignatureMethod(pogo.class_name);

			//	Check if already exists
			if (readcode.indexOf(signature)<0)
			{
				//	create it With full signature
				signature = attr.allowedFullSignatureMethod(pogo.class_name);
				int	start = readcode.indexOf("Commands Allowed Methods");
				start = readcode.lastIndexOf("//============", start);
				start--;

				String	method = signature;
				method += "\n{\n		//	" + endGeneTag + "\n";
				method += "\n		//	"     + startGeneTag+ "\n";
				method += "\treturn true;\n}\n";
				readcode.insert(start, method);
			}
		}
		//	Do it for each command
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd	cmd = pogo.commands.cmdAt(i);

			//	Not for State and Status Cmd
			if (cmd.virtual_method==true)
			continue;

			String	signature = cmd.allowedSignatureMethod(pogo.class_name);
			//	Check if already exists
			if (readcode.indexOf(signature)<0)
			{
				//	create it With full signature
				signature = cmd.allowedFullSignatureMethod(pogo.class_name);
				int	start = readcode.indexOf(endNamespace);
				String	method = signature;
				method += "\n{\n		//	" + endGeneTag + "\n";
				method += "\n		//	"     + startGeneTag+ "\n";
				method += "\treturn true;\n}\n";
				readcode.insert(start, method);
			}
		}

		//	Update the method for allowed or not
		//------------------------------------------------------
		String	newcode = updateAllowedMethods(readcode);

		//	Open and write file
		//----------------------------------------
		FileOutputStream	fidout = new FileOutputStream(src_filename);
		fidout.write(newcode.getBytes());
		fidout.close();
	}
//=======================================================================
/**
 *	Update the Allowed.cpp file.
 */
//=======================================================================
	private String updateAllowedMethods(PogoString readcode)
	{
		//	Update Attribute allowed methods
		for (int i=0 ; i<pogo.attributes.size() ; i++)
		{
			Attrib	attr = pogo.attributes.attributeAt(i);
			
			String	signature = attr.allowedFullSignatureMethod(pogo.class_name);
			int start = readcode.indexOf(signature);
			String	method = readcode.extractMethodCore(start);

			//	get the user part
			String	user_part = getAllowedUserPart(method);
			
			//	store original method
			method = signature + "\n{" + method + "}";
			
			//	Build new method
			String	test = attr.allowedCore();
			if (test!=null)
			{
				String	newmethod = signature + "\n" + test + user_part + "\n";
				newmethod += "		return false;\n";
				newmethod += "	}\n	return true;\n}";
				readcode.replace(method, newmethod);
			}
		}
		//	Update Commands allowed methods
		for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd	cmd = pogo.commands.cmdAt(i);
			
			//	Not for State and Status Cmd
			if (cmd.virtual_method==true)
				continue;

			String	signature = cmd.allowedFullSignatureMethod(pogo.class_name);
			int start = readcode.indexOf(signature);
			String	method = readcode.extractMethodCore(start);

			//	get the user part
			String	user_part = getAllowedUserPart(method);
			
			//	store original method
			method = signature + "\n{" + method + "}";
			
			//	Build new method
			String	test = cmd.allowedCore();
			if (test!=null)
			{
				//	For impl<3 the allowed methods were in ServerClass.cpp
				if (pogo.deviceImpl<3)
			 		user_part = getAllowedUserPart(cmd);

				//	Create new method
				String	newmethod = signature + "\n" + test + user_part + "\n";
				newmethod += "		return false;\n";
				newmethod += "	}\n	return true;\n}";
				readcode.replace(method, newmethod);
			}
		}
		//	remove methods for deleted commands
		String newcode = removeDeletedAttrCmdAllowedMethods(readcode);

		//	For device imp2 -> impl3, remove allowed method in ServerClass.cpp
		removeOldAllowedMethods();

		return newcode;
	}
//=======================================================================
/**
 *	Remove the is_allowed methods for Attribute/command deleted
 */
//=======================================================================
	private String removeDeletedAttrCmdAllowedMethods(PogoString code)
	{
		//	Search method 
		String	start_signature = "bool " + pogo.class_name + "::is_";
		int		start = 0;
		while ((start=code.indexOf(start_signature, start))>0)
		{
			//	get attr/cmd name
			int	end = code.indexOf("_allowed(", start);
			if (end<0)
			{
				start++;
				continue;
			}
			String	name = code.substring(start+start_signature.length(), end);

			//	Check if still exists
			boolean still_exists = false;
			for (int i=0 ; i<pogo.commands.size() ; i++)
				if (pogo.commands.cmdAt(i).toString().equals(name))
					still_exists = true;
			for (int i=0 ; i<pogo.attributes.size() ; i++)
				if (pogo.attributes.attributeAt(i).toString().equals(name))
					still_exists = true;
			if (still_exists==false)
			{
				//	get block
				end = code.inMethod(end);
				end = code.outMethod(end);
				start = code.lastIndexOf("//+-------", start);
				String	method = code.substring(start, end);
				code.remove(method);
			}

			start = end;			
		}

		return code.str;
	}
//=======================================================================
/**
 *	Remove the is_allowed methods in ServerClass.cpp for impl <3
 */
//=======================================================================
	private void removeOldAllowedMethods()
	{
		String	filename = pogo.projectFiles.getServerClass();
		try
		{
			//	Get source code
			PogoString	readcode = new PogoString(PogoUtil.readFile(filename));
			for (int i=0 ; i<pogo.commands.size() ; i++)
			{
				Cmd	cmd = pogo.commands.cmdAt(i);
				if (cmd.virtual_method==true)
					continue;

				//	Search method start
				String	patern = cmd.cmd_class + "::is_allowed";
				int start = readcode.indexOf(patern);
				if (start<0)
					continue;
				start = readcode.lastIndexOf("}", start);
				//start = readcode.nextCr(start+1);

				//	Search method end
				int	end = readcode.inMethod(start);
				end = readcode.outMethod(end);
				end = readcode.nextCr(end);
				end = readcode.indexOf("//", end);
		
				//	Remove also the constructors !
				start = readcode.lastIndexOf("//+-------", start);

				//	And remove method
				String method = readcode.substring(start, end);
				readcode.remove(method);
			}

			//	And write result.
			FileOutputStream	fidout = new FileOutputStream(filename);
			fidout.write(readcode.getBytes());
			fidout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
//=======================================================================
//=======================================================================
	private String getAllowedUserPart(String method)
	{
		//	The user part is between stop and start code generation
		int	idx0  = method.indexOf(endGeneTag);
		int	idx1  = method.indexOf(startGeneTag);
			idx1 += startGeneTag.length();
		return method.substring(idx0, idx1);
	}
//=======================================================================
//=======================================================================
	private String getAllowedUserPart(Cmd cmd)
	{
		System.out.println("getAllowedUserPart for " + cmd);
		//	For impl<3 the allowed methods were in ServerClass.cpp
		String	filename = pogo.projectFiles.getServerClass();
		try{
			PogoString	readcode = new PogoString(PogoUtil.readFile(filename));

			String	signature = "bool " + cmd.name + 
				"Cmd::is_allowed(Tango::DeviceImpl *device, const CORBA::Any &in_any)";
		
			int	start, end;
			if ((start=readcode.indexOf(signature))>0)
			{
				start = readcode.inMethod(start);
				end   = readcode.outMethod(start);
				String	method = readcode.substring(start, end);
				return getAllowedUserPart(method);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		String	dummy = endGeneTag + "\n\n" +
						"		//	" +  startGeneTag + "\n";

		return dummy;
	}
//=======================================================================
//=======================================================================
}
