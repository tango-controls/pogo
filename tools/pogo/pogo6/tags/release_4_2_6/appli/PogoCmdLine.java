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
//
// Copyleft 2005 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.appli;


/** 
 *	This class is able to start pogo on shell command line.
 *
 * @author  verdier
 * @Revision 
 */
 
import fr.esrf.Tango.*;
import fr.esrf.TangoDs.*;
import fr.esrf.TangoApi.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import pogo.gene.*;



public class  PogoCmdLine
            implements PogoAppliDefs, PogoDefs
{
	private Vector		sourcefiles = new Vector();
	private int			action = NOT_INITIALIZED;
	private PogoClass	server = null;
	
	private static final int		NOT_INITIALIZED = -1;
	private static final String[]	known_actions = { "-src", "-doc" };
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
			for (int i=0 ; i<sourcefiles.size() ; i++)
			{
				server = new PogoClass((String)sourcefiles.elementAt(i));
				if (server.language==javaLang)
					new PogoGeneJava(server).generate();
				else
					new PogoGeneCpp(server).generate();
			}
			break;
		case GENE_DOC:
			//	Load server from 
			for (int i=0 ; i<sourcefiles.size() ; i++)
			{
				server = new PogoClass((String)sourcefiles.elementAt(i));
				new PogoGeneDoc(server).generate();
			}
			break;
		default:
			throw new PogoException(known_actions[action] + " Not yet implemented");
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
		System.out.println("action: " + known_actions[action]);
		System.out.println("sourcefiles: ");
		for (int i=0 ; i<sourcefiles.size() ; i++)
			System.out.println("	" + sourcefiles.elementAt(i));

		//	Check if correctly initialized.
		if (action==NOT_INITIALIZED	||
			sourcefiles.size()==0)
		{
			displaySyntax();
			throw new PogoException("");
		}
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
	}
}
