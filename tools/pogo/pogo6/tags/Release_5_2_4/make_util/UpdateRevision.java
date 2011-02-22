//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the UpdateRevision class definition .
//
// $Author$
//
// $Revision$
//
// $Log$
// Revision 1.2  2005/11/24 08:29:49  pascal_verdier
// Analized with intelliJid.
//
// Revision 1.1  2004/09/24 11:20:05  pascal_verdier
// Automatic revision number update at jar genaration.
//
//
// Copyright 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.make_util;


/** 
 *	This class is able to update the revision number for an application,
 *	for example at make jar call.
 *
 * @author  verdier
 */
 

import java.util.Date;
import pogo.gene.PogoException;
import pogo.gene.PogoUtil;
import pogo.gene.PogoString;


public class  UpdateRevision
{
	private final static String	declare = "private static String revNumber =";
	private String		filename = null;
	private String		revision = null;
	private	PogoString	code;
	//===============================================================
	//===============================================================
	public UpdateRevision(String[] args) throws Exception
	{
		checkArguments(args);
		System.out.println("filename = " + filename + "  revision = " + revision);
		code = new PogoString(PogoUtil.readFile(filename));
		updateCode();
		PogoUtil.writeFile(filename, code.str);
	}
	//===============================================================
	//===============================================================
	private void updateCode() throws PogoException
	{
		//	Get sting to be replaced
		int start = code.str.indexOf(declare);
		if (start<0)
			throw new PogoException("Revision declaration not found !");
		int end = code.str.indexOf(";", start);
		start = code.str.indexOf("\"", start);
		if (start<0 || end<0)
			throw new PogoException("Syntax error in revision declaration !");

		//	Take off quotatio marks
		start++;
		end = code.str.lastIndexOf("\"", end);
		if (start<0 || end<0)
			throw new PogoException("Syntax error in revision declaration !");

		String	oldstr = code.str.substring(start, end);
		String	newstr = buildNewRevision();
		System.out.println("Replacing");
		System.out.println(oldstr);
		System.out.println(newstr);
		
		code.replace(oldstr, newstr);
	}
	//===============================================================
	//===============================================================
	private String buildNewRevision()
	{
		Date	date = new Date();
		return "Release " + revision + "  -  " + date.toString();
	}
	//===============================================================
	//===============================================================
	private void checkArguments(String[] args)
	{
		try
		{
			for (int i=0 ; i<args.length ; i++)
			{
				if (args[i].equals("-?"))
					displaySyntax();
				else
				if (args[i].equals("-f"))
					filename = args[++i];
				else
				if (args[i].equals("-r"))
					revision = args[++i];
			}
			if (filename==null || revision==null)
				displaySyntax();
		}
		catch (Exception e)
		{
			displaySyntax();
		}
	}
	//===============================================================
	//===============================================================
	private void displaySyntax()
	{
		System.out.println("java pogo.gene.UpdateRevision   " +
			"-f <file name>   -r <revision number>");
		System.exit(0);
	}
	//===============================================================
	//===============================================================
	public static void main (String args[])
	{
		UpdateRevision	client = null;

		try
		{
			client = new UpdateRevision(args);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
