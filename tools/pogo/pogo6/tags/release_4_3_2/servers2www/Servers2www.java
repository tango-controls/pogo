//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Servers2www class definition .
//
// $Author$
//
// $Revision$
//
// $Log$
// Revision 1.4  2004/11/22 15:30:28  pascal_verdier
// Javadoc tags correction.
//
// Revision 1.3  2004/10/29 10:52:34  pascal_verdier
// Tango-ds compatibility added.
//
// Revision 1.2  2004/10/25 14:01:54  pascal_verdier
// Servers are now sorted in sections.
//
// Revision 1.1  2004/09/02 06:46:11  pascal_verdier
// *** empty log message ***
//
//
// Copyright 1995 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================

package pogo.servers2www;


/** 
 *	This class is able create HTML TANGO servers list from CVS reppositories.
 *
 * @author  verdier
 * @Revision 
 */
 
import fr.esrf.Tango.*;
import fr.esrf.TangoDs.*;
import pogo.gene.*;

import java.io.*;
import java.util.*;



public class  Servers2www
{
	private String[]	cvsroots;
	private Vector		repositories;
	public int			nb_servers = 0;
	public String		final_message = null;
	//===============================================================
	/**
	 *	Build object, Scan CVS repository module files and sort it.
	 *
	 *	@param cvs_roots the CVSROOT to check modules. 
	 */
	//===============================================================
	public Servers2www(String cvs_roots) throws Exception
	{
		//	Search and split cvsroots
		cvsroots = (new PogoString(cvs_roots).string2array(":"));
		repositories = new Vector();
		
		//	Get table titles from property and check size
		PogoString	pgs = new PogoString(System.getProperty("TABLE_TITLES"));
		if (pgs.str==null)
			throw new PogoException("TABLE_TITLES property not defined");

		String[]	prop = pgs.string2array(":");
		if (prop.length < cvsroots.length)
			throw new PogoException("TABLE_TITLES property must have the same number than CVSROOT");

		//	and build ScanRepository object
		System.out.println(cvsroots.length + " repositories");
		for (int i=0 ; i<cvsroots.length ; i++)
			repositories.add(new ScanRepository(cvsroots[i], prop[i]));
	}
	
	//===============================================================
	//===============================================================
	public void buildHtmlPage() throws Exception
	{
		Vector	families = new Vector();
		for (int i=0 ; i<repositories.size() ; i++)
		{
			//	extract modules from one repository 
			ScanRepository	repository = (ScanRepository)repositories.elementAt(i);
			nb_servers += repository.cvsCheckOutModules();

			for (int f=0 ; f<repository.servers.size() ; f++)
			{
				ModuleFamily	family =
						(ModuleFamily)repository.servers.elementAt(f);
				families.add(family);

				//	Generate doc and an html table with servers found
				HTMLpage	h = new HTMLpage(family);
				String		final_message = h.generateServersList();
			}
			//	release modules
			repository.cvsReleaseModules();
		}
		
		//	Build index file
		//---------------------------------
		HTMLpage.generateIndexFile(families, nb_servers);
	}
	//===============================================================
	//===============================================================
	public String toString()
	{
		String	s = "" + cvsroots.length + " TANGO CVS repositories:\n";
		for (int i=0 ; i<cvsroots.length ; i++)
			s +=  cvsroots[i] + "\n";
		return s;
	}
	//===============================================================
	//===============================================================
	public static void main (String args[])
	{
		String	cvsroot = System.getProperty("CVSROOT");
		try
		{
			if (cvsroot!=null)
			{
				long	t0 = System.currentTimeMillis();

				System.out.println("CVSROOT="+cvsroot);
				Servers2www	appli = new Servers2www(cvsroot);
				appli.buildHtmlPage();

				long	t = System.currentTimeMillis() - t0;
				int		n_sec = (int)(t/1000);
				int		n_min = n_sec/60;
				n_sec = n_sec - (n_min*60);


				System.out.println("\n-------------------------------------------------");
				System.out.println(appli.final_message);
				System.out.print  ("Elapsed time : " + n_min + " min " + n_sec + " sec");
				System.out.println("  for " + appli.nb_servers + " servers");
				System.exit(0);
			}
			else
				throw new PogoException("CVSROOT Not set !");
		}
		catch(Exception e)
		{
			Except.print_exception(e);
			e.printStackTrace();
			System.exit(1);
		}
	}
}
