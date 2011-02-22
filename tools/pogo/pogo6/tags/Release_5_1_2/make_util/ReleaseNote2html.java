//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the ReleaseNote2html  class definition .
//
// $Author$
//
// $Revision$
//
// $Log$
// Revision 1.4  2005/12/09 14:34:42  pascal_verdier
// Change indent.
//
// Revision 1.3  2005/12/09 13:55:18  pascal_verdier
// Add message on display syntax.
//
// Revision 1.2  2005/12/08 09:27:58  pascal_verdier
// Now able to generate a java interface containing HTML source as String.
//
// Revision 1.1  2005/12/07 12:48:13  pascal_verdier
// *** empty log message ***
//
//
// Copyleft 2005 by European Synchrotron Radiation Facility, Grenoble, France
//               All Rights Reversed
//-======================================================================


package pogo.make_util;


/**
 *	This class is able to convert a release note ascii file
 *	to an HTML file.
 *
 * @author  verdier
 */

import java.util.StringTokenizer;
import java.util.Date;


public class  ReleaseNote2html
{
	private	static final String	filename = "ReleaseNote";

	//===============================================================
	//===============================================================
	public static void writeFile(String title)
	{
		try
		{
			String	code = buildHtmPage(title);
			pogo.gene.PogoUtil.writeFile(filename+".html", code);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//===============================================================
	//===============================================================
	public static void makeJavaRelease(String title, String jpackage)
	{
		try
		{
			String	header = "\npackage " + jpackage + ";\n\n" +
						"public interface ReleaseNote\n{\n"    +
						"	public final String	str = \n" ;

			String	str = buildHtmPage(title);
			
			String	code = header;
			StringTokenizer stk = new StringTokenizer(str, "\n");
			while (stk.hasMoreTokens())
			{
			
				String line = checkString(stk.nextToken());
				code += "		\"" + line + "\\n\" + \n";
			}
			code += "		\"\";\n}\n";

			pogo.gene.PogoUtil.writeFile(filename+".java", code);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//===============================================================
	//===============================================================
	private static String checkString(String s)
	{
		int	idx = 0;
		//	Check for quotes
		while ((idx=s.indexOf('\"', idx))>=0)
		{
			s = s.substring(0, idx) + "\\" + s.substring(idx);
			idx +=2;
		}
		return s;
	}
	//===============================================================
	//===============================================================
	private static String buildHtmPage(String title) throws Exception
	{
		String	startBold   = "<li><b>";
		String	stopBold    = "</b>";
		String	breakLine   = "<Br>\n";
		String	space       = "&nbsp; ";
        String  indent      = space + space;
		String	header =
"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 3.2//EN\">\n"+
"<HTML>\n"+
"<HEAD>\n"+
"<Title> Release Note </Title>\n"+
"</HEAD>\n"+
"<BODY TEXT=\"#000000\" BGCOLOR=\"#FFFFFF\" "+
"LINK=\"#0000FF\" VLINK=\"#7F00FF\" ALINK=\"#FF0000\">\n"+
"<P><!-------TITLE------></P>\n\n";

		//	Append title to header and generated date
		header += "<Center>";
		header += "\t<h2>" + title + "</h2>\n";
		header += "\t(Generated " + new Date() + ")";
		header += "</Center><Br>\n";
		//	Relace Header by html header.
		String	str = pogo.gene.PogoUtil.readFile(filename);

		//	get each line
		int	start = 0;
        int end   = 0;
		int	nb    = 0;
		while ((end=str.indexOf('\n', start))>=0)
        {
            if (str.substring(start, end).startsWith("#")==false)
                nb++;
			start = end+1;
        }

        //  And put it in an array
		String[]	array = new String[nb];
		start  = 0;
		for (int i=0 ; (end=str.indexOf('\n', start))>=0 ; )
		{
            if (str.substring(start, end).startsWith("#")==false)
    			array[i++] = str.substring(start, end);
			start = end+1;
		}

		// for each line
		String	new_code = "";
		for (int i=1 ; i<array.length ; i++)
		{
			//	is it a new revision number
			if (array[i-1].length() == 0 && array[i].indexOf(':')>0)
			{
				int idx = array[i].indexOf(':')+1;
				String	revision = array[i].substring(0, idx);
				new_code += startBold + revision + stopBold + breakLine;
				String	s = array[i].substring(idx).trim();
				if (s.length()>0 && !s.equals(":"))
					new_code += indent + array[i].substring(idx).trim() + breakLine;
			}
			else
			if (array[i].length() != 0)
			{
				new_code += indent + array[i].trim() + breakLine;
			}
			//else
			//	new_code += "\n" + breakLine;
		}
        //  And write in a new html file
		new_code = header + new_code + "</Body>\n</Html>\n";
		return new_code;
	}
	//===============================================================
	//===============================================================
	public static void displaySyntax(String message)
	{
		System.out.println();
		System.out.println("********  " + message +   "********");
		System.out.println();
		System.out.println("ReleaseNote2html -html <page title>");
		System.out.println("		or");
		System.out.println("ReleaseNote2html -java <page title> <package>");
		System.out.println();
		System.exit(1);
	}
	//===============================================================
	//===============================================================
	public static void main(java.lang.String[] args)
	{
		//	The following part is used 
		//	to add release number and notes in  html class doc
		//	The input file must be a realease note file
		//----------------------------------------------------
		switch (args.length)
		{
		case 2:
			if (args[0].equals("-html"))
				ReleaseNote2html.writeFile(args[1]);
			else
				ReleaseNote2html.displaySyntax(args[0] +
					"  invalid option for " + args.length + " arguments");
			break;
		case 3:
			if (args[0].equals("-java"))
				ReleaseNote2html.makeJavaRelease(args[1], args[2]);
			else
				ReleaseNote2html.displaySyntax(args[0] +
					"  invalid option for " + args.length + " arguments");
			break;
		default:
			ReleaseNote2html.displaySyntax("" + args.length +
					"  invalid arguments number");
		}
		System.exit(0);
	}
}
