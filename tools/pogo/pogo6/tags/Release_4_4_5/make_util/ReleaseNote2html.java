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



public class  ReleaseNote2html
{

	//===============================================================
	/**
	 *	Used by : make tangorb doc
	 *	to add release number and notes in  html class doc
	 */
	//===============================================================
	public ReleaseNote2html(String title)
	{
		String	startBold   = "<li><b>";
		String	stopBold    = "</b>";
		String	breakLine   = "<Br>\n";
		String	space       = "&nbsp; ";
        String  indent      = space + space + space + space;
		String	header =
"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 3.2//EN\">\n"+
"<HTML>\n"+
"<HEAD>\n"+
"<Title> Release Note </Title>\n"+
"</HEAD>\n"+
"<BODY TEXT=\"#000000\" BGCOLOR=\"#FFFFFF\" "+
"LINK=\"#0000FF\" VLINK=\"#7F00FF\" ALINK=\"#FF0000\">\n"+
"<P><!-------TITLE------></P>\n\n";

		//	Append title to header
		header += "<Center><h2>" + title + "</h2></Center><Br>\n";

		try
		{
			//	Relace Header by html header.
			String	filename = "ReleaseNote";
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
				if (array[i-1].length() == 0)
				{
					int idx = array[i].indexOf(':')+1;
					String	revision = array[i].substring(0, idx);
					new_code += startBold + revision + stopBold + breakLine;
					new_code += indent + array[i].substring(idx) + breakLine;
				}
				else
				if (array[i].length() != 0)
				{
					new_code += indent + array[i] + breakLine;
				}
				else
					new_code += "\n" + breakLine;
			}
            //  And write in a new html file
			new_code = header + new_code + "</Body>\n</Html>\n";
			pogo.gene.PogoUtil.writeFile(filename + ".html", new_code);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//===============================================================
	//===============================================================
	//===============================================================
	//===============================================================
	public static void main(java.lang.String[] args)
	{
		//	The following part is used 
		//	to add release number and notes in  html class doc
		//	The input file must be a realease note file
		//----------------------------------------------------
		if (args.length!=2)
		{
			System.out.println();
			System.out.println("ReleaseNote2html <input file>  <page title>");
			System.out.println();
		}
		else
			new ReleaseNote2html(args[1]);
		System.exit(0);
	}
}
