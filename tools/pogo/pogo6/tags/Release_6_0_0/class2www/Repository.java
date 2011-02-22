//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Repository class definition .
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
// Revision 1.2  2008/11/20 13:05:55  pascal_verdier
// Methods moved from Utils to PogoUtils class.
//
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
import pogo.gene.PogoClass;
import pogo.gene.PogoGeneDoc;
import pogo.gene.PogoUtil;

import java.io.File;
import java.util.Vector;


public class  Repository
{
	protected String		cvsroot;
	protected String		svnroot;
	protected FamilyList	families;
	protected String		str_module;
	protected String		name;
	protected boolean		remote = true;
	protected String		url;
	protected String		home;
	protected boolean		check_svn;
	protected String		default_family;
	private   String		svn_serv = "Servers";
	public static final int	CVS = 0;
	public static final int	SVN = 1;
	public static final String[]	RepositoryTypeStr = { "CVS", "SVN" };

	//===============================================================
	//===============================================================
	public String toString()
	{
		StringBuffer	sb = new StringBuffer(name);
		sb.append('\n');

		for (Object o : families)
		{
			Family	family = (Family) o;
			sb.append(family.size()).append(" - ").append(family);
		}
		return sb.toString();
	}
	//===============================================================
	//===============================================================
	public Repository(String cvsroot) throws DevFailed
	{
		this.cvsroot = cvsroot;
		svnroot = cvsroot.substring(0, cvsroot.lastIndexOf('/')) + "/svnroot";
		str_module = Utils.getInstance().getModuleFile(cvsroot);
	}
	//===============================================================
	//===============================================================
	public void buildServerDoc() throws DevFailed
	{
		File	r_dir = new File(name);
		if (!r_dir.exists())
			r_dir.mkdir();

		checkOutCvsModules();
		System.out.println(name + " check svn=" + check_svn);
		if (check_svn)
		{
			checkOutSvnServers();
			buildFamilyAndModulesFromSvn();
		}
		buildModulesDoc();
	}
	//===============================================================
	//===============================================================
	protected void checkOutCvsModules()
	{
		//	Get tag list for modules
		Vector	tags = new Vector();
		try
		{
			tags = PogoUtil.getLastCvsTags(cvsroot);
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		for (Object o : families)
		{
			//	Create family directory if does not exist
			Family family = (Family) o;
			File	f_dir = new File(name+"/"+family.name);
			if (!f_dir.exists())
				f_dir.mkdir();
			for (Object obj : family)
			{
				//	Check out module and move it to the family directory
				Module	module = (Module) obj;
				String	tag = PogoUtil.getLastCvsTag(tags, module.name);
				Utils.getInstance().checkOutModule(module.name, cvsroot, tag);
				if (tag!=null)
					module.tag = tag;
				File	m_dir = new File(module.name);

				//	Buid path to move module dir
				String	path = name + "/"
						+ family.name + "/" + module.name;
				module.setHtmlPath(path);
				m_dir.renameTo(new File(path));
			}
		}
	}
	//===============================================================
	//===============================================================
	protected void buildModulesDoc() throws DevFailed
	{
		for (Object o : families)
		{
			Family family = (Family) o;
			for (Object obj : family)
			{
				Module	module = (Module) obj;
				if (!module.doc_done)
				{
					String	path = name + "/" + family.name + "/" + module.name;

					Vector	servnames =
							PogoUtil.getInstance().checkForTangoDir(path);
					if (servnames.size()>0)
					{
						String	servname = (String)servnames.get(0);

						//	check if doc_html dir is upper (SOLEIL usage)
						String	dirname = servname.substring(0, servname.lastIndexOf('/'));
						int	pos = dirname.lastIndexOf('/');
						if (pos>0)
						{
							//	Put it in class directory
							String	doc_html = dirname + "/../doc_html";
							File	f = new File(doc_html);
							if (f.exists())
								f.renameTo(new File(dirname+"/doc_html"));
							else
							{
								doc_html = dirname + "/../doc/doc_html";
								f = new File(doc_html);
								if (f.exists())
									f.renameTo(new File(dirname+"/doc_html"));
							}
						}	//	End of SOLEIL usage management


						try
						{
							//	Use Pogo classes to generate doc
							module.server = new PogoClass(servname);
							PogoGeneDoc	gene = new PogoGeneDoc(module.server);
							gene.generate();
							gene.addCvsFamily(family.name);
							removeCvsSvnDir(dirname);
							moveDocDir(module);
						}
						catch(Exception e)
						{
							System.err.println(servname + ":  " + e);
						}
					}
					else
						System.err.println("No server found for " + path);
					//	To do not re-do when SVN if it is from CVS
					module.doc_done = true;
				}
			}
		}
	}
	//===============================================================
	//===============================================================
	private void removeCvsSvnDir(String dirname)
	{
		//	Remove CVS or .svn dir if any
		try
		{
			String	cmd = null;
			File	sub_cvs = new File(dirname+"/CVS");
			if (sub_cvs.exists())
				cmd = "rm -Rf " + sub_cvs;
			else
			{
				File	sub_svn = new File(dirname+"/.svn");
				if (sub_svn.exists())
					cmd = "rm -Rf " + sub_svn;
			}
			if (cmd!=null)
				PogoUtil.executeShellCmd(cmd);
		}
		catch(Exception e) {
			System.err.println(e);
		}
	}
	//===============================================================
	//===============================================================
	protected void checkOutSvnServers()
	{
		//	Check out the SVN servers repository
		String	cmd = "svn co file://"+svnroot + "/" + svn_serv;
		try
		{
			System.out.println(cmd + "\n");
			System.out.println(PogoUtil.executeShellCmd(cmd));
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
		//	and move it in repository dir
		new File(svn_serv).renameTo(new File(name+"/"+svn_serv));
	}
	//===============================================================
	//===============================================================
	public void buildFamilyAndModulesFromSvn()
	{
		//	Get Tango class list
		String	dirname = name+"/"+svn_serv;
		Vector	tango_class = PogoUtil.getInstance().checkForTangoDir(dirname);
		for (Object o : tango_class)
		{
			//	Parse module name
			String	full = (String) o;
			System.out.println(full);
			int	start = full.lastIndexOf('/')+1;
			int end   = full.lastIndexOf('.');
			String	module_name = full.substring(start, end);

			//	Parse family name
			start = full.indexOf(dirname);
			start += dirname.length() + 1;
			end    = full.indexOf('/', start);
			String	family_name = full.substring(start, end);

			//	Parse SVN path
			start = full.indexOf(svn_serv);
			end   = full.lastIndexOf('/');
			String	svn_path = full.substring(start, end);

			//	Check if family already exists. else create
			Family	family = families.getFamily(family_name);
			if (family==null)
			{
				family = new Family(family_name);
				families.add(family);
			}
			//	Build module and add it to family
			Module	module = new Module(module_name, svn_path, this, family, SVN);
			family.add(module);
			String	path = name + "/"
					+ family.name + "/" + module.name;
			module.setHtmlPath(path);
		}

		for (Object o : families)
		{
			Family	family = (Family) o;
			//	For each module put it in family dir (CVS model)
			for (Object o2 : family)
			{
				Module	module = (Module) o2;
				if (module.repos_type==SVN)
				{
					File	src  = new File(name + "/" + module.cvs_path);
					File	fam  = new File(name + "/" + family.name);
					if (!fam.exists())
						fam.mkdir();
					File	dest = new File(fam.toString() + "/" + module.name);
					System.out.println("	moving " + src + "  to  " + dest);
					src.renameTo(dest);
				}
			}
		}
	}
	//===============================================================
	//===============================================================
	protected void moveDocDir(Module module)
	{
		//	Move the doc directory to a tmp dir
		String	path = name + "/" + module.family.name;
		File	tmp = new File(path + "/tmp");
		//tmp.mkdir();

		File	doc = new File(module.server.projectFiles.getDocHtml());
		System.out.print("Moving " + doc + " to " + tmp);
		boolean	done = doc.renameTo(tmp);
		System.out.println((done)? "   done" : "   NOT done");
		//	Then remove source files
		String	module_path = path + "/" + module.name;
		String cmd = "rm -R " + module_path;
		try {
			System.out.println(cmd);
			String ret = PogoUtil.executeShellCmd(cmd);
			System.out.println(ret);
		}
		catch(Exception e) {
			System.err.println(e);
		}

		//	And finaly rename doc dir as module
		System.out.print("Rename " + tmp + "  to  " + module_path);
		tmp.renameTo(new File(module_path));
		System.out.println((done)? "   done" : "   NOT done");
	}
	//===============================================================
	//===============================================================
	protected void sort()
	{
		for (Object o : families)
			((Family)o).sort();
		Utils.getInstance().sort(families);
		Family	family = families.getFamily("Miscellaneous");
		if (family!=null)
		{
			//	Put it at end
			families.remove(family);
			families.add(family);
		}
	}
	//===============================================================
	//===============================================================
	public String getSummary()
	{
		return families.getSummary();
	}
	//===============================================================
	//===============================================================
	public int nbClasses()
	{
		int	nb = 0;
		for (Object o : families)
			nb += ((Family)o).nbClasses();
		return nb;
	}
	//===============================================================
	//===============================================================
	public Vector getClassList()
	{
		Vector	v = new Vector();
		for (Object o : families)
		{
			Family	family = (Family) o;
			for (Object o2: family)
			{
				Module	module = (Module) o2;
				if (module.server!=null)
					v.add(module);
			}
		}
		return v;
	}
	//===============================================================
	//===============================================================
	public int nbFamilies()
	{
		return families.size();
	}
	//===============================================================
	//===============================================================
}
