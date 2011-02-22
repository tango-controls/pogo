//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Class2www class definition .
//
// $Author$
//
// Copyright (C) :      2004,2005,2006,2007,2008
//						European Synchrotron Radiation Facility
//                      BP 220, Grenoble 38043
//                      FRANCE
//
// This file is part of Tango.
//
// Tango is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// Tango is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
// $Revision$
//
// $Log$
// Revision 1.1  2008/11/10 15:21:46  pascal_verdier
// *** empty log message ***
//
//-======================================================================

package pogo.class2www;


/** 
 *	This class is able to
 *
 * @author  verdier
 */

import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;
import pogo.gene.PogoUtil;

import java.io.File;


@SuppressWarnings({"ConstantConditions"})
public class  Class2www
{
	static final String	web_home = "http://www.esrf.fr/computing/cs/tango/tango_doc/ds_doc";
	//static final String	web_home = ".";
	private Repositories	repositories;
	private TangoCsRepository	cs;
	private TangoDsRepository	ds;
	private EsrfRepository		esrf;
	private String		backup_home;
	private long		t0;
	private static final boolean do_cs   = true;
	private static final boolean do_ds   = true;
	private static final boolean do_esrf = true;

	public static InstituteList	instituteList;
	//===============================================================
	//===============================================================
	public Class2www() throws DevFailed
	{
		backup_home = System.getProperty("_BACKUP_HOME_");
		//	On windows -> no check out
		if (PogoUtil.osIsUnix())
		{
			if (backup_home==null)
				Except.throw_exception("BACKUP_HOME_NOT_SET",
					"_BACKUP_HOME_ has not been set",
					"Class2www.Class2www()");
		}
		instituteList = new InstituteList(backup_home);

		t0 = System.currentTimeMillis();
		repositories = new Repositories();
		if (do_cs)
		{
			cs = new TangoCsRepository(backup_home, false);
			repositories.add(cs);
		}
		if (do_ds)
		{
			ds = new TangoDsRepository(backup_home, true);
			repositories.add(ds);
		}
		if (do_esrf)
		{
			esrf = new EsrfRepository(backup_home, false);
			repositories.add(esrf);
		}
	}

	//===============================================================
	//===============================================================
	private void parseModules()
	{
		/****/
		if (do_cs)
			cs.parseCvsModule();
		if (do_ds)
			ds.parseCvsModule();
		if (do_esrf)
			esrf.parseCvsModule();
	}
	//===============================================================
	//===============================================================
	private void buildServerDoc() throws DevFailed
	{
		//	Build the server doc for each repository
		for (int i=0 ; i<repositories.size() ; i++)
			repositories.getRepository(i).buildServerDoc();

		//	Sort the repositories
		for (int i=0 ; i<repositories.size() ; i++)
			repositories.getRepository(i).sort();

		//	Then build HTML pages
		if (do_cs && do_ds)
		{
			String[]	use_rep = new String[] { cs.name, ds.name };
			String[]	link_to = new String[] { esrf.name };
			new HtmlMainPage("Sourceforge",
					repositories, use_rep, link_to).generate();
		}
		else
		if (do_ds)
		{
			String[]	use_rep = new String[] { ds.name };
			String[]	link_to = new String[] { };
			new HtmlMainPage("Sourceforge",
					repositories, use_rep, link_to).generate();
		}

		if (do_esrf)
		{
			String[]	use_rep = new String[] { esrf.name };
			String[]	link_to = new String[] {  };
			new HtmlMainPage("Local Repository",
					repositories, use_rep, link_to).generate();
		}
	}
	//===============================================================
	//===============================================================
	private void checkNewClases()
	{
		new CheckNewClasses(backup_home, repositories).check();
	}
	//===============================================================
	//===============================================================
	private void moveToWWW()
	{
		String	classes_dir = System.getProperty("_CLASSES_DIR_");
		if (classes_dir==null)
			return;

		String[]	filenames = {
				cs.name, ds.name, esrf.name,
				IHtmlTemplates.html_index,
				IHtmlTemplates.html_list,
				IHtmlTemplates.html_alpha
		};

		//	Move files and directories to one dir
		File	doc_dir = new File(classes_dir);
		try
		{
			if (!doc_dir.exists())
			{
				doc_dir.mkdir();
				//	move ll files inside
				for (String filename : filenames)
					new File(filename).renameTo(new File(doc_dir+"/"+filename));
			}
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
	//===============================================================
	//===============================================================
	private void showResults()
	{
		long	t1 = System.currentTimeMillis();
		long	dt = (t1-t0)/1000;
		long	min = dt/60;
		long	sec = dt - (60*min);

		System.out.println("Duration: " + min + ":" + sec + "  (" + dt + " sec.)");

		for (int i=0 ; i<repositories.size() ; i++)
			System.out.println(repositories.getRepository(i).getSummary());
	}
	//===============================================================
	//===============================================================
	public void logAuthors()
	{
		Authors	authors = new Authors();
		for (Object o : cs.families)
		{
			Family	family = (Family) o;
			for (Object o2 : family)
			{
				Module	module = (Module) o2;
				if (module.server!=null)
					if (module.server.author!=null &&
						module.server.author.length()>0)
					{
						authors.addClass(module);
					}
			}
		}
		for (Object o : ds.families)
		{
			Family	family = (Family) o;
			for (Object o2 : family)
			{
				Module	module = (Module) o2;
				if (module.server!=null)
					if (module.server.author!=null &&
						module.server.author.length()>0)
					{
						authors.addClass(module);
					}
			}
		}
		try
		{
			PogoUtil.writeFile(backup_home + "/log/authors.txt", authors.toString());
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
	//===============================================================
	//===============================================================
	public void logEsrfAuthors()
	{
		Authors	authors = new Authors();
		for (Object o : esrf.families)
		{
			Family	family = (Family) o;
			for (Object o2 : family)
			{
				Module	module = (Module) o2;
				if (module.server!=null)
					if (module.server.author!=null &&
						module.server.author.length()>0)
					{
						authors.addClass(module);
					}
			}
		}
		try
		{
			PogoUtil.writeFile(backup_home + "/log/esrf_authors.txt", authors.toString());
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
	//===============================================================
	//===============================================================
	public static void main (String[] args)
	{
		try
		{
			Class2www	c2w = new Class2www();
			c2w.parseModules();
			c2w.buildServerDoc();
			c2w.checkNewClases();

			c2w.moveToWWW();
			c2w.logAuthors();
			c2w.logEsrfAuthors();
			c2w.showResults();
		}
		catch(DevFailed e)
		{
			Except.print_exception(e);
		}
	}
}
