//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the Utils class definition .
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

import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;
import pogo.gene.PogoUtil;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;


/**
 *	This class is able to
 *
 * @author  verdier
 */

public class  Utils
{
	private static Utils	instance = null;
	
	/**
	 *	Command timeout 60 seconds
	 */
	private static final int	CMD_TIMEOUT = 60000;
	//===============================================================
	//===============================================================
	private Utils()
	{
	}
	//===============================================================
	//===============================================================
	public static Utils getInstance()
	{
		if (instance==null)
			instance = new Utils();
		return instance;
	}
	//===============================================================
	//===============================================================
	public String getModuleFile(String cvsroot) throws DevFailed
	{
		String	code = "";
		try
		{
			//	Check out module
			checkOutModule("CVSROOT/modules", cvsroot);

			//	Read it
			code = pogo.gene.PogoUtil.readFile("CVSROOT/modules");

			//	And release it
			String cmd = "rm -R CVSROOT";
			pogo.gene.PogoUtil.executeShellCmd(cmd);
		}
		catch (Exception e)
		{
			Except.throw_exception(e.toString(), e.toString(), "Utils.getModuleFile()");
		}
		return code;
	}
	//===============================================================
	//===============================================================
	public void checkOutModule(String module, String cvsroot)
	{
		checkOutModule(module, cvsroot, null);
	}
	//===============================================================
	//===============================================================
	public void checkOutModule(String module, String cvsroot, String tag)
	{
		try
		{
			String	cmd = "cvs -d " + cvsroot + " co ";
			if (tag!=null)
				cmd += "-r " + tag + "  ";
			cmd += module;
			System.out.println(cmd);
			this.executeShellCmd(cmd, CMD_TIMEOUT);
			System.out.println(cmd + "  done");
		}
		catch (Exception e)
		{
			System.err.println("Utils.checkOutModule():	" + e);
			//Except.throw_exception(e.toString(), e.toString(), "Utils.getModuleFile()");
		}
	}
    //===============================================================
    /**
     *	Execute a shell command and throw exception if command failed.
     *
     *	@param cmd	shell command to be executed.
      *	@param timeout	time out for waitFor method.
    */
    //===============================================================
    public  String executeShellCmd(String cmd, int timeout)
			throws IOException, InterruptedException, Exception
    {
        Process proc = Runtime.getRuntime().exec(cmd);
		ProcessTimeout	pto = new ProcessTimeout(proc, timeout);

        // get command's output stream and
        // put a buffered reader input stream on it.
        //-------------------------------------------
        InputStream istr = proc.getInputStream();
        BufferedReader br =
                new BufferedReader(new InputStreamReader(istr));
        String	sb = "";

        // read output lines from command
        String str;
        while ((str = br.readLine()) != null)
        {
            //System.out.println(str);
            sb += str+"\n";
        }

        // wait for end of command
        proc.waitFor();


        // check its exit value
        int retVal;
        if ((retVal=proc.exitValue()) != 0)
        {
			if (pto.timedOut())
				throw new Exception(
                "the shell command\n" + cmd + "\nexits on timeout !\n\n");
			
            //	An error occured try to read it
            InputStream errstr = proc.getErrorStream();
            br = new BufferedReader(new InputStreamReader(errstr));
            while ((str = br.readLine()) != null)
            {
                System.out.println(str);
                sb += str+"\n";
            }
            throw new Exception(
                "the shell command\n" + cmd + "\nreturns : " + retVal + " !\n\n"+ sb);
        }
        //System.out.println(sb);
        return sb;

    }
	//===============================================================
	//===============================================================
	public static  String removeHtmlTag(String code)
	{
		String[]	tags = { "<td","<tr","</td","</tr", "<p"};
		int	start;
		for (String tag : tags)
		{
			while ((start=code.indexOf(tag))>=0)
			{
				int	end = code.indexOf(">", start);
				if (end>0)
					code = code.substring(0, start) + code.substring(end+1);
				else
					code = code.substring(0, start);
			}
		}
		return code;
	}
	//===============================================================
	//===============================================================
	public Vector sort(Vector v)
	{
		MyCompare		compare = new MyCompare();
		Collections.sort(v, compare);
		return v;
	 }
	//===============================================================
	//===============================================================
	private static String	template_home = null;
	public static String readTemplateFile(String filename)
	{
		String	code = null;
		if (template_home==null)
			template_home = System.getProperty("TEMPL_HOME");
		try
		{
			code = PogoUtil.readFile(template_home+"/html/" + filename);
			int pos = code.indexOf("</Body>");
			if (pos>0)
				code = code.substring(0, pos);
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
		return code;
	}
	//===============================================================
	//===============================================================




	//======================================================
	/**
	 *	MyCompare class to sort collection
	 */
	//======================================================
	class  MyCompare implements Comparator
	{
		public int compare(Object o1, Object o2)
		{
			if (o1 instanceof String && o2 instanceof String)
			{
				String	s1 = o1.toString().toLowerCase();
				String	s2 = o2.toString().toLowerCase();
				if (s1==null)
					return 1;
				else
				if (s2==null)
					return -1;
				else
					return s1.compareTo(s2);
			}
			else
			if (o1 instanceof Family && o2 instanceof Family)
			{
				String	s1 = ((Family)o1).name;
				String	s2 = ((Family)o2).name;
				return s1.compareTo(s2);
			}
			else
			if (o1 instanceof Module && o2 instanceof Module)
			{
				Module	m1 = (Module)o1;
				Module	m2 = (Module)o2;

				String	s1 = (m1.server!=null)? m1.server.class_name : m1.name;
				String	s2 = (m2.server!=null)? m2.server.class_name : m2.name;
				return s1.compareTo(s2);
			}
			else
				return 0;
		}
	}
	//===============================================================
	//===============================================================


	//===============================================================
	/**
	 *	A thread class to have a timeout for Process.waitFor() method.
	 *	timeout is in milli seconds
	 */
	//===============================================================
	private class ProcessTimeout extends Thread
	{
		private Process	process;
		private int		timeout;
		private long	t0;
		private boolean	failed = false;
		//=======================================================
		public ProcessTimeout(Process process, int timeout)
		{
			this.process = process;
			this.timeout = timeout;
			t0 = System.currentTimeMillis();
			start();
		}
		//=======================================================
		public boolean timedOut()
		{
			return failed;
		}
		//=======================================================
		public void run()
		{
			boolean	finished = false;
			while(!finished)
			{
				try
				{
					int	ret = process.exitValue();
					finished = true;
				}
				catch (Exception e)
				{
					//System.out.println(e);
				}
				if ((System.currentTimeMillis()-t0)>timeout)
				{
					process.destroy();	//	kill sub-process
					failed = true;
				}

				try { Thread.sleep(timeout/10); } catch (Exception e){}
			}
		}
		//=======================================================
	}
	//===============================================================
	//===============================================================
}
