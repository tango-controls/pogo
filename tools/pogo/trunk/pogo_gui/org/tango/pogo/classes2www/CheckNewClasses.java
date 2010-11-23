//+======================================================================
// $Source: /cvsroot/tango-cs/tango/tools/pogo/classes2www/CheckNewClasses.java,v $
//
// Project:   Tango
//
// Description:  java source code for the CheckNewClasses class definition .
//
// $Author: pascal_verdier $
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
// $Revision: 1.3 $
//
// $Log: CheckNewClasses.java,v $
//
//-======================================================================


package org.tango.pogo.classes2www;

import org.tango.pogo.pogo_gui.tools.ParserTool;

import java.util.Vector;

public class CheckNewClasses
{
	private Repositories	repositories;
	private String			log_filename;
	private String 			mail_filename;
	private String 			send_mail;
	private static final String relative_filename = "/log/class_list.txt";
	private static final String rel_mail_filename = "/log/mail.html";
	private static final String rel_send_mail     = "/log/send_mail";
	//====================================================================
	//====================================================================
	public CheckNewClasses(String dirname, Repositories repositories)
	{
		this.repositories = repositories;
		log_filename  = dirname + relative_filename;
		mail_filename = dirname + rel_mail_filename;
		send_mail     = dirname + rel_send_mail;
	}
	//====================================================================
	//====================================================================
	private String[] readPreviousClassList()
	{
		String[]	list = new String[0];
		//	Read previous backup list if exist
		try
		{
			String	code = ParserTool.readFile(log_filename);
			list = Utils.string2array(code);
		}
		catch(Exception e)
		{
			System.err.println(e);
			//Except.throw_exception(e.toString(),
			//		e.toString(), "Class2www.checkNewClases()");
		}
		return list;
	}
	//====================================================================
	//====================================================================
    /*
	public Vector<String> readTestFile()
	{
		//	Read previous backup list if exist
		String[]	list = new String[0];
		try
		{
			String	test_filename = log_filename.substring(0, log_filename.lastIndexOf('.'))+".sav";
			String	code = ParserTool.readFile(test_filename);
			list = Utils.string2array(code);
		}
		catch(Exception e)
		{
			System.err.println(e);
			System.exit(-1);
			//Except.throw_exception(e.toString(),
			//		e.toString(), "Class2www.checkNewClases()");
		}
		Vector<String>	v = new Vector<String>();
		for (String s : list)
			v.add(s);
		return v;
	}
	*/
	//====================================================================
	//====================================================================
	public void check()
	{
		//	Get previous class from log file
		String[]	previous_classes = readPreviousClassList();

		//	Get classes for today
		Vector<Module>	classes = new Vector<Module>();
		for (int i=0 ; i<repositories.size() ; i++)
		{
			Vector<Module> modules = repositories.getRepository(i).getClassList();
			for (Module module : modules)
				classes.add(module);
		}

		//	Compare with previous list
		Vector<Module>	v = new Vector<Module>();
		for (Module module : classes)
		{
			String	name = module.server.class_name;
			boolean found = false;
			for (int i=0 ; !found && i<previous_classes.length ; i++)
				found = (previous_classes[i].equals(name));
			if (!found)
				v.add(module);
		}
		if (v.size()>0)
		{
			Module[]	modules = new Module[v.size()];
			for (int i=0 ; i<v.size() ; i++)
				modules[i] = v.get(i);
			sendMail(modules);
		}
		saveNewClassList(classes);
	}
	//====================================================================
	//====================================================================
	private void sendMail(Module[] modules)
	{
		System.out.println(modules.length + "  new classes");
		for (Module module : modules)
			System.out.println(module.server.class_name);

		try
		{
			String	header = Utils.readTemplateFile("header.html");
			StringBuffer	sb = new StringBuffer(header);

			String	str = IHtmlTemplates.mail_hader;
			str = Utils.strReplace(str, "$NB_CLASSES", ""+modules.length);
			sb.append(str);

			for (Module module : modules)
				sb.append(module.getSummary());
			ParserTool.writeFile(mail_filename, sb.toString());

			String	mail_list = System.getProperty("_MAIL_LIST_");
			if (mail_list==null || mail_list.length()==0)
				throw new Exception("No mail list specified !");

			String	cmd = send_mail + " " +
					mail_filename   + " " +
					mail_list;
			System.out.println(cmd);
			String	resp = Utils.getInstance().executeShellCmd(cmd, 1000);
			System.out.println("execution returns:\n" + resp);
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
	}
	//====================================================================
	//====================================================================
	private void saveNewClassList(Vector<Module> classes)
	{

		Vector<String>	classnames = new Vector<String>();
		for (Module module : classes)
			classnames.add(module.server.class_name);
		try
		{
			String code = Utils.array2string(classnames);
			ParserTool.writeFile(log_filename, code);
		}
		catch(Exception e)
		{
			System.err.println(e);
			//Except.throw_exception(e.toString(),
			//		e.toString(), "Class2www.checkNewClases()");
		}
	}
	//====================================================================
	//====================================================================
	public static void main(String[] args)
	{
		Repositories	rep = new Repositories();
		CheckNewClasses	cnc = new CheckNewClasses("/segfs/tango/backup", rep);
		cnc.check();
	}
}
