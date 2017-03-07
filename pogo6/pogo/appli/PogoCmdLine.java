//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the PogoCmdLine class definition .
//
// $Author$
//
// $Revision$
//
// $Log$
// Revision 3.5  2007/08/07 13:04:42  pascal_verdier
// Generate Makefile and Windows Project menu added.
//
// Revision 3.4  2007/06/13 07:50:24  pascal_verdier
// 64 bits data types added.
//
// Revision 3.3  2007/05/09 07:37:48  pascal_verdier
// Bug on bad syntax fixed.
//
// Revision 3.2  2005/11/24 08:28:45  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.1  2005/03/30 09:13:32  pascal_verdier
// Command line has been added.
//
//
// Copyleft 2005 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.appli;


/** 
 *	This class is able to start pogo on shell command line.
 *
 * @author  verdier
 */
 
import pogo.gene.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;



public class  PogoCmdLine
            implements PogoAppliDefs, PogoDefs
{
	private Vector<String>		sourcefiles = new Vector<String>();
	private int			action = NOT_INITIALIZED;
	private PogoClass	server = null;
	
	private static final int		NOT_INITIALIZED = -1;
	private static final int		HELP = 2;
	private static final String[]	known_actions = { "-src", "-doc", "-?" };
	//===============================================================
	//===============================================================
	public PogoCmdLine(String[] args) throws PogoException,
					FileNotFoundException, 
					SecurityException,
					IOException,
					InterruptedException
		{
		//	Check command line
		manageArgs(args);

		switch (action)
		{
		case GENE_SRC:
			//	Load server from 
			for (String s : sourcefiles)
			{
				server = new PogoClass(s);
				switch (server.language)
				{
				case cppLang:
					new PogoGeneCpp(server).generate(action);
					break;
				case javaLang:
					new PogoGeneJava(server).generate(action);
					break;
				case pyLang:
					new PogoGenePython(server).generate();
					break;
				}
			}
			System.exit(0);
			break;
		case GENE_DOC:
			//	Load server from 
			for (String	s : sourcefiles)
			{
				server = new PogoClass(s);
				new PogoGeneDoc(server).generate();
			}
			System.exit(0);
			break;
		case HELP:
			displaySyntax();
			break;

		default:
			System.setProperty("POGO_FILE", args[0]);
		}
	}
	//===============================================================
	//===============================================================
	private void manageArgs(String[] args) throws PogoException
	{
		//	Check all arguments
		for (int i=0 ; i<args.length ; i++)
		{
			//	Search if action
			boolean found = false;
			for (int j=0 ; !found &&j<known_actions.length ; j++)
				if ((found=args[i].equals(known_actions[j]))==true)
					action = j;
			//	else get source file names
			if (!found)
				sourcefiles.add(args[i]);
		}

		//	Display results
		if (action !=NOT_INITIALIZED)
			System.out.println("action: " + known_actions[action]);
		System.out.print("sourcefiles: ");
		for (String s : sourcefiles)
			System.out.println("	" + s);
	}
	//===============================================================
	//===============================================================
	private void displaySyntax()
	{
		System.out.println("Syntax:");
		System.out.println("pogo <action> <filename1> <filename2>....");
		System.out.println();
		System.out.println("Without option, pogo start the Graphic User Interface");
		System.out.println();
		System.out.println("Actions:");
		System.out.println("	-src:	will re-generate the device server source files.");
		System.out.println("	-doc:	will generate the device server documentation.");
		System.out.println();
		System.exit(0);
	}
}
