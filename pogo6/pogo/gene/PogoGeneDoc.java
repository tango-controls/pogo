//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:	java source code for the Pogo class definition .
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.23  2009/04/07 10:49:56  pascal_verdier
// Pb in font size fixed
//
// Revision 3.22  2009/02/18 15:02:15  pascal_verdier
// Tango 7 (IDL 4) compatibility implementation.
//
// Revision 3.21  2008/03/13 08:47:27  pascal_verdier
// Default property values added to html pages.
// Bug in property description (use cotes in python) fixed.
//
// Revision 3.20  2008/02/13 15:46:15  pascal_verdier
// Footer separator changed
//
// Revision 3.19  2006/11/15 14:10:16  pascal_verdier
// Change inheritance diagram
//
// Revision 3.18  2006/11/09 14:09:51  pascal_verdier
// CVS tags management modified.
//
// Revision 3.17  2006/09/29 09:32:03  pascal_verdier
// Generate inheritance diagram in index.html.
//
// Revision 3.16  2006/06/26 09:22:47  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.15  2006/03/16 08:57:23  pascal_verdier
// Change a bit the table look.
//
// Revision 3.14  2006/01/30 11:02:10  pascal_verdier
// Revision and cvsroot are taken from CVS files if exists.
// Doc in pdf generated if linux.
//
// Revision 3.13  2005/11/24 08:29:49  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.12  2005/10/12 13:50:45  pascal_verdier
// Fix a bug in adding pdf or doc file download.
//
// Revision 3.11  2005/06/14 08:44:25  pascal_verdier
// SuperClass is replaced by AbstractClass.
//
// Revision 3.10  2005/03/02 10:27:11  pascal_verdier
// Managing Super Classes and inherited classes.
//
// Revision 3.9  2005/02/23 11:59:39  pascal_verdier
// Force a new header in Description file.
//
// Revision 3.8  2004/11/22 15:29:31  pascal_verdier
// Javadoc tags correction.
//
// Revision 3.7  2004/11/12 08:05:17  pascal_verdier
// minor bugs fixed.
//
// Revision 3.6  2004/10/25 14:03:56  pascal_verdier
// Minor changes.
//
// Revision 3.5  2004/10/21 06:59:29  pascal_verdier
// Default value management added for properties.
// And minor changes
//
// Revision 3.4  2004/10/01 09:16:51  pascal_verdier
// Check Description.html header.
//
// Revision 3.3  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.2  2004/08/26 07:19:30  pascal_verdier
// Attributes are now generated as class.
//
// Revision 3.1  2003/09/10 08:11:30  pascal_verdier
// Minor bugs fixed.
// HTML doc generated with more details.
//
// Revision 3.0  2003/04/29 10:39:50  pascal_verdier
// TANGO 3.0 compatibility
// little bugs fixed.
//
// Revision 1.33  2003/01/16 14:32:36  verdier
// Tango classe files detected for open JFileChooser.
//
// Revision 1.32  2002/10/03 13:53:47  verdier
// Pogo has been used without known bug.
// Put class description as class property.
//
// Revision 1.31  2002/04/25 12:05:08  verdier
// IDL 2 implemented for c++ servers
//
// Revision 1.30  2002/02/06 15:20:20  verdier
// Java code generation updated.
//
// Revision 1.26  2001/12/18 10:12:22  verdier
// Attribute user default property code added.
//
// Revision 1.25  2001/11/09 09:46:13  verdier
// Many bugs fixed.
//
// Revision 1.24  2001/04/04 12:21:27  verdier
// Property management added for cpp.
//
// Revision 1.23  2000/10/24 06:20:13  verdier
// The compatibility with TANGO2 has been tested on DatabaseDs.
//
// Revision 1.22  2000/10/02 05:52:20  verdier
// Attribute code generated is now compatible with Tango 2.
//
// Revision 1.21  2000/09/22 08:54:31  verdier
// DevState & DevStatus are virtual.
// First tests with Tango2
// Taco import utility added.
//
// Revision 1.20  2000/07/07 13:29:17  verdier
// Utilities added after first users.
//
// Revision 1.18  2000/06/20 07:01:38  verdier
// Right button double click management added for :
// editing src code, creating item, editing class....
// Little bugs fixed on generation/re-read src code.
//
// Revision 1.17  2000/05/12 07:35:41  verdier
// Attributes management added for java generation.
//
// Revision 1.16  2000/04/26 06:06:52  verdier
// The save/restore file (.pogo) does not exist anymore.
// DevStates and DevStates allowed management is now available for java.
//
// Revision 1.15  2000/04/18 08:13:48  verdier
// Management of DevStates to allow command added.
//
// Revision 1.14  2000/04/12 09:24:10  verdier
// Methods to manage attributes are now generated
// Only if at leat one attribute exists.
//
// Revision 1.13  2000/04/11 09:34:13  verdier
// Attributes Management Added.
//
// Revision 1.12  2000/03/29 13:14:00  verdier
// Doc generation added.
//
//
// copyleft 1999 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;

import fr.esrf.Tango.DispLevel;
import fr.esrf.TangoDs.TangoConst;

import java.io.*;


/**
 *	This class generates html Doc file.
 *
 * @author	$Author$
 * @version	$Revision$
 */
public class PogoGeneDoc extends PogoGene implements PogoDefs, TangoConst
{
/**
 *	Pogo Class to be used for generation.
 */
	private PogoClass	server;
	private String		outDoc;
	private String		footer = null;
	private Cmd			init_cmd;

	private	final String	end_html = "\n\n</BODY>\n</HTML>\n";

//=======================================================================
/**
 *	Constructor for Pogo Class Doc files generation.
 *
 *	@param	server	Pogo Class definition used for generation.
 */
//=======================================================================
	public PogoGeneDoc(PogoClass server)
	{
		super(server);
		this.server = server;
		outDoc = server.projectFiles.getDocHtml();
		//	Build the non overriding Init command
		init_cmd = new Cmd("Init", "",
							"Tango::DEV_VOID",
							"Tango::DEV_VOID",
							"none.",
							"none.",
							PogoDefs.init_desc);
	}
//=======================================================================
/**
 *	Build header for table.
 *	@param	title	table title
 *	@param	nb_col	column table number.
 *	@return the table header.
 */
//=======================================================================
	static private String buildTableHeader(String title, int nb_col)
	{
		String	sb ="<Table Border=2 Cellpadding=3 CELLSPACING=0 WIDTH=\"100%\">\n";
		sb += "<TR BGCOLOR=\"#CCCCFF\" CLASS=\"TableHeadingColor\">\n";

		sb += "<Td COLSPAN=" + nb_col + "> <Font Size=+2>";
		sb += "<Center>";
		sb += "<b>" +  title + "</b></td></Font></Center>\n";

		return sb;
	}
//=======================================================================
/**
 *	Build header for table.
 *	@param	title	table title
 *	@param	col_titles	column table titles.
 *	@return the table header.
 */
//=======================================================================
	static public String buildTableHeader(String title, String[] col_titles)
	{
		String	str = buildTableHeader(title, col_titles.length);

		str += "<TR BGCOLOR=\"#CCCCFF\" CLASS=\"TableHeadingColor\">\n";
		for (int i=0 ; i<col_titles.length ; i++)
		{
			str +="<Td>";
			str += "<Center>";
			str += "<b>" +  col_titles[i] + "</b></td></Center>\n";
		}

		//sb.append("</Tr>\n");
		return str;
	}

//=======================================================================
/**
 *	Create the Output director for Doc, if doesn't already exist
 */
//=======================================================================
	private void makeDocDir()throws	SecurityException
	{
		//	Do it for all sub-directories
		for (int end=1 ; (end=outDoc.indexOf("/", end))>0 ; end++)
		{
			String	path = outDoc.substring(0, end);
			File	f = new File(path);
			if (!f.exists())
			{
				f.mkdir();
				System.out.println(path + "  created");
			}
		}
		//	Do it for full name
		File	f = new File(outDoc);
		if (!f.exists())
		{
			f.mkdir();
			System.out.println(outDoc + "  created");
		}
	}
//=======================================================================
/**
 *	Create the index.html file from template file and PogoClass Object.
 *
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected void generateIndexFile()
						throws	IOException, PogoException
	{
		PogoString	pgs = readTemplate("index.html", "");
        //	Add inheritance if any
       	String  inheritance = buildInheritanceDiagram();
		String	dev_id = pogo.device_id.toHtmlString();
		if (dev_id!=null)
		{
        	int     idx = pgs.str.indexOf("Description");
       	    idx = pgs.str.lastIndexOf("<Br>", idx);
       	    idx = pgs.str.lastIndexOf("<Br>", idx-1);
       	    pgs.insert(idx, dev_id);
		}

        if (inheritance!=null)
        {
        	int     idx = pgs.str.indexOf("Description");
       	    idx = pgs.str.lastIndexOf("<Br>", idx);
       	    idx = pgs.str.lastIndexOf("<Br>", idx-1);
       	    pgs.insert(idx, inheritance);
        }
        //	Open Output file and search place to write
		//----------------------------------------------
		String	f_out = outDoc + "/index.html";
		writeDocFile(f_out, pgs.str, true);
    }
//=======================================================================
//=======================================================================
    private String buildInheritanceDiagram()
    {
        PogoString  code;
        try
        {
            int start, end;
            String  pattern;
            //  Read Inheritance template and split it
            code = new PogoString(PogoUtil.readFile(
                        server.templates_dir + "/html/Inheritance.html"));
            while (code.str.indexOf("CLASS")>0)
                code.replace("CLASS", pogo.class_name);

            //  If inherite from device impl -> remove abstract class
            if (pogo.inherited_from.equals(PogoDefs.tangoDeviceImpl))
            {
				while (code.str.indexOf("DEVICE_IMPL")>0)
	                code.replace("DEVICE_IMPL", pogo.inheritedClassName());
                //  Remove abstract part
                start = code.str.indexOf("ABSTRACT");
                end   = code.str.indexOf("<li>", start);
                start = code.str.lastIndexOf("<li>", start);
                pattern = code.str.substring(start, end);
                code.remove(pattern);
                code.remove(end, "/ul>");
            }
            else
			{
                while (code.str.indexOf("ABSTRACT")>0)
                    code.replace("ABSTRACT", pogo.inheritedClassName());
				while (code.str.indexOf("DEVICE_IMPL")>0)
	                code.replace("DEVICE_IMPL", "DeviceImpl");	//	Does'nt know which one
			}

            //  Keep only line for language.
            start = code.str.indexOf("<li>");
            switch(pogo.language)
            {
            case cppLang:
                //  Take off 2nd and 3rd
                start = code.str.indexOf("<li>", start+1);
                end   = code.str.indexOf("<li>", start+1);
                end   = code.str.indexOf("<ul>", end+1);
                pattern = code.substring(start, end);
                code.remove(pattern);
                break;
            case javaLang:
                //  Take off 1rst and 3rd
                end   = code.str.indexOf("<li>", start+1);
                pattern = code.substring(start, end);
                code.remove(pattern);

                start = code.str.indexOf("<li>", start+1);
                end   = code.str.indexOf("<ul>", end+1);
                pattern = code.substring(start, end);
                code.remove(pattern);
                break;
            case pyLang:
                //  Take off 1rst and 2nd
                end   = code.str.indexOf("<li>", start+1);
                end   = code.str.indexOf("<li>", end+1);
                pattern = code.substring(start, end);
                code.remove(pattern);
                break;
            }

            /*
            int idx = inheritance.indexOf("<img ");
            String  arrow = inheritance.substring(idx);
            inheritance = inheritance.substring(0, idx);
            PogoString  pg_str = new PogoString(inheritance);

			String	base = "Device_" + pogo.deviceImpl + "Impl";
            pg_str.replace("ClassName", base);
            code = "<Center>\n"+ pg_str.str + arrow;
            if (!pogo.inheritedClassName().equals(tangoDeviceImpl))
            {
                pg_str = new PogoString(inheritance);
                pg_str.replace("ClassName", pogo.inheritedClassName());
                code += pg_str.str + arrow;
            }
            pg_str = new PogoString(inheritance);
            pg_str.replace("ClassName", pogo.class_name);
            code += pg_str.str + "</Center>\n<Br>\n";
 */
        }
        catch (Exception e)
        {
            //  skip it if failed.
            return null;
        }
        return code.str;
    }
//=======================================================================
/**
 *	Create the Description.html file from template file and PogoClass Object.
 *	This file will be filled by the programmer.
 *	For this reason, if the file already exists, it will not be overwritten.
 *
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected void generateDescriptionFile()
						throws	IOException, PogoException
	{
		//	DO NOT GENERATE IF ALREADY EXISTS.
		//------------------------------------------------
		String	f_out = outDoc + "/Description.html";
		if (new File(f_out).exists())
		{
			//	check header (old or new)
			boolean	modified = false;
			PogoString	code = new PogoString(PogoUtil.readFile(f_out));
			//	It is the old one --> put the new header
			int	end = code.str.indexOf("<HR WIDTH=\"100%\"></H5>");
			if (end>0)
			{
				String	templname  = server.templates_dir + "/html/header.html";
				String	old_header = code.str.substring(0, end);
				String	new_header = PogoUtil.readFile(templname);

				//	Remove end of header and change it
				int p = new_header.indexOf("</Body>");
				if (p>0)
					new_header = new_header.substring(0, p);
				code.replace(old_header, new_header);
				modified = true;
			}
			//	Check if old default message
			String	old_mess = "This Page Must Be Filled by <Br>\n" +
								"The Programmer";
			int	start = code.str.indexOf(old_mess);
			if (start>0)
			{
				code.replace(old_mess, server.class_desc);
				modified = true;
			}

			//	Write new code if modified
			if (modified)
				PogoUtil.writeFile(f_out, code.str);
		}
		else
		{
			//	If does not already exist generate a new one
			PogoString	pgs = readTemplate("page.html", "Device Description");
			pgs.append("<Center>\n");
			pgs.append(server.class_desc);
			pgs.append("\n<Br>\n<Br>\n");
			pgs.append("</Center>\n");

			//	Open Output file and write
			//----------------------------------------------
			writeDocFile(f_out, pgs.str, true);
		}
		//	Check if doc or pdf files
		checkDocFile(outDoc);
	}
//=======================================================================
/**
 *	Create the tangoDevStates.html file from template file and PogoClass Object.
 *	This file will describe the device server states in a table.
 *
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected void generateStateDescriptionFile()
						throws	IOException, PogoException
	{
		PogoString	pgs = readTemplate("page.html", "Device States Description");
		//	Open Output file and search place to write
		//----------------------------------------------
		pgs.append("<Center>\n");
		pgs.append("<Br> <Br> <Br> \n");
		String[]	titles = { "Names" , "Descriptions" };
		pgs.append(buildTableHeader("States", titles));

		for (int i=0 ; i<server.states.size() ; i++)
		{
			DevState state = (DevState)(server.states.elementAt(i));
			pgs.append("<Tr><Td><b>"+ removeTangoNamespace(state.name) +"</b></Td>\n");
			pgs.append("<Td><Font Size=-1>" + state.description + "</Font></Td></Tr>\n\n");
		}

		pgs.append("\n");
		pgs.append("\n");
		pgs.append("\n");
		pgs.append("</Table>\n");
		pgs.append("</Center>\n");

		String	f_out = outDoc + "/TangoDevStates.html";
		writeDocFile(f_out, pgs.str, true);
	}
//=======================================================================
/**
 *	Create the DevProperites.html file from template file and PogoClass Object.
 *	This file will describe the device server property in a table.
 *
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected void generatePropertyDescriptionFile()
						throws	IOException, PogoException
	{
		boolean	class_prop  = false;
		boolean	device_prop = false;
		PogoString	pgs =
				readTemplate("page.html", "Properties Description");

		pgs.append("<Center>\n");
		String[]	titles = { "Property name", "Property type", "Description" };

		//	Class Properties if any
		//----------------------------------
		if (server.class_properties.size() > 0)
		{
			class_prop = true;
			pgs.append("<Br> <Br> <Br> \n");
			pgs.append(buildTableHeader("Class Properties", titles));
			pgs.append("\n");

			for (int i=0 ; i<server.class_properties.size() ; i++)
			{
				Property	property = server.class_properties.propertyAt(i);
				pgs.append("<Tr><Td><b><a href=#Class_DefaultValues>" +
                                property.name +" </a></b></Td>\n");
				pgs.append("<Td><Font Size=-1>"+
								property.type.cpp_code_str +"</Font></Td>\n");
				pgs.append("<Td><Font Size=-1>" +
								property.description + "</Font></Td></Tr>\n\n");
			}
			pgs.append("</Table>\n");
			pgs.append("\n");
		}
		//	Device Properties if any
		//----------------------------------
		if (server.dev_properties.size() > 0)
		{
			device_prop = true;
			pgs.append("<Br> <Br> <Br> \n");
			pgs.append(buildTableHeader("Device Properties", titles));

			for (int i=0 ; i<server.dev_properties.size() ; i++)
			{
				Property	property = server.dev_properties.propertyAt(i);

				pgs.append("<Tr><Td><b><a href=#Dev_DefaultValues>" +
                        property.name +" </a></b></Td>\n");
				pgs.append("<Td><Font Size=-1>"+
								property.type.cpp_code_str +"</Font></Td>\n");
				pgs.append("<Td><Font Size=-1>" +
								property.description + "</Font></Td></Tr>\n\n");
			}
			pgs.append("</Table>\n");
			pgs.append("\n");
		}
        pgs.append("</Center>\n<Br><Br><Br>\n<Br><Br><Br>\n\n");

        //	Class Properties if any for default values
        if (server.class_properties.size() > 0)
        {
            pgs.append("<A name=Class_DefaultValues>" + "<!---  ---></a>\n");
            pgs.append("<Font Size=+1>Class Properties Default Values:</Font><Br>\n");
            pgs.append("<Table Border=2 Cellpadding=2 CELLSPACING=2>\n");
            pgs.append("    <tr BGCOLOR=\"#CCCCFF\" CLASS=\"TableHeadingColor\">\n");
            pgs.append("        <Td><b>Property Name</b></td>\n");
            pgs.append("        <td><b>Default Values<</b>/td>\n");
            pgs.append("    </Tr>\n");
            pgs.append("");

            for (int i=0 ; i<server.class_properties.size() ; i++)
            {
                Property	property = server.class_properties.propertyAt(i);
                pgs.append("    <Tr>\n");
                pgs.append("        <Td>"+ property.name + "</Td>\n");
                pgs.append("        <td>" + property.defaultValueToHtmlString() + "</td>\n");
                pgs.append("    </Tr>\n");
            }
            pgs.append("</Table>\n");
            pgs.append("\n");
            pgs.append("<Br><Br><Br>\n");
        }

        //	Device Properties if any for default values
        if (server.dev_properties.size() > 0)
        {
            pgs.append("<A name=Dev_DefaultValues>" + "<!---  ---></a>\n");
            pgs.append("<Font Size=+1>Device Properties Default Values:</Font><Br>\n");
            pgs.append("<Table Border=2 Cellpadding=2 CELLSPACING=2>\n");
            pgs.append("    <tr BGCOLOR=\"#CCCCFF\" CLASS=\"TableHeadingColor\">\n");
            pgs.append("        <Td><b>Property Name</b></td>\n");
            pgs.append("        <td><b>Default Values</b></td>\n");
            pgs.append("    </Tr>\n");
            pgs.append("");

            for (int i=0 ; i<server.dev_properties.size() ; i++)
            {
                Property	property = server.dev_properties.propertyAt(i);
                pgs.append("    <Tr>\n");
                pgs.append("        <Td>"+ property.name + "</Td>\n");
                pgs.append("        <td>" + property.defaultValueToHtmlString() + "</td>\n");
                pgs.append("    </Tr>\n");
            }
            pgs.append("</Table>\n");
            pgs.append("\n");
            pgs.append("<Br><Br><Br>\n");
        }



        if (!device_prop || !class_prop)
		{
			pgs.append("<Center><b>\n");
			if (!class_prop)
				pgs.append("There is no Class properties.<Br><Br>\n");
			if (!device_prop)
				pgs.append("There is no Device Properties.<Br><Br>\n");
			pgs.append("</Center></b>\n");
		}
        pgs.append("<Br> <Br> <Br> \n");

		//	Open Output file and  write
		//----------------------------------------------
		String	f_out = outDoc + "/Properties.html";
		writeDocFile(f_out, pgs.str, true);
	}
//=======================================================================
/**
 *	Create the DevCommands.html file from template file and PogoClass Object.
 *	This file will describe the device server commands in a table.
 *
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected void generateAttributesFile()
						throws	IOException, PogoException
	{
		PogoString	pgs =
				readTemplate("page.html", "Device Attributes Description");
		pgs.append("<Br>\n");


		//	Check if scalar, Spectrum and Image attributes are defined
		//----------------------------------------------------------------
		boolean	assAttr = false;
		boolean scalar  = false;
		boolean spectrum= false;
		boolean image   = false;
		for (int i=0 ; i<server.attributes.size() ; i++)
		{
			Attrib attr = server.attributes.attributeAt(i);
			if (attr.attrType==ATTR_SCALAR)
			{
				scalar = true;
				if (attr.rwType==ATTR_READ_WITH_WRITE)
					assAttr  = true;
			}
			else
			if (attr.attrType==ATTR_SPECTRUM)
				spectrum = true;
			else
			if (attr.attrType==ATTR_IMAGE)
				image = true;
		}

		//	Generate for scalar attributs if exist
		//------------------------------------------

		if (scalar)
		{
			String[]	titles = new String[4 + ((assAttr)? 1 : 0)];
			int	n =0;
			titles[n++] = "Attribute name";
			titles[n++] = "Data Type";
			titles[n++] = "R/W Type";
			if (assAttr)
				titles[n++] = "Ass. Attr.";
			titles[n] = "Expert";
			pgs.append(buildTableHeader("Scalar Attributes", titles));

			for (int i=0 ; i<server.attributes.size() ; i++)
			{
				Attrib attr = server.attributes.attributeAt(i);
				if (attr.attrType==ATTR_SCALAR)
				{
					//	Write att name
                    //pgs.append("<Font Size=-1>\n");
					pgs.append("<Tr><Td><b>"+ attr.name + "</b>");

					//	Write att description if exists
					String	desc = attr.getDescriptionLine();
					if (desc!=null)
						if (desc.length()>0)
							pgs.append(": <Font Size=-1>"+ desc + "</Font>");
					pgs.append("</Td>\n");
					String	str_type = simpleType(attr.dataType);
					String	str_rw   = AttrRWtypeArray[attr.rwType];
					String	level;
					if (attr.disp_level==DispLevel.OPERATOR)
						level = "No";
					else
						level = "Yes";

					pgs.append("<Td><Center><Font Size=-1>" + str_type + "</Font></Center></Td>");
					pgs.append("<Td><Center><Font Size=-1>" + str_rw + "</Font></Center></Td>");
					if (attr.rwType==ATTR_READ_WITH_WRITE)
						pgs.append("<Td><Center><Font Size=-1>" + attr.assAttr + "</Font></Center></Td>");
					else
					if (assAttr)
						pgs.append("<Td><Center> - </Center></Td>");

					pgs.append("<Td><Center><Font Size=-1>" + level + "</Font></Center></Td>");
					pgs.append("</Tr>\n\n");
				}
			}
			pgs.append("</Table>\n");
			pgs.append("</Center>\n");
			pgs.append("<Br><Br><Br><Br><Br>\n");
		}
		//	Generate for spectrum attributs if exist
		//------------------------------------------
		if (spectrum)
		{
			String[]	titles = new String[4];
			titles[0] = "Attribute name";
			titles[1] = "Data Type";
			titles[2] = "X Data Length";
			titles[3] = "Expert";
			pgs.append(buildTableHeader("Spectrum Attributes", titles));

			for (int i=0 ; i<server.attributes.size() ; i++)
			{
				Attrib attr = server.attributes.attributeAt(i);
				if (attr.attrType==ATTR_SPECTRUM)
				{
					pgs.append("<Tr><Td><b>"+ attr.name + "</b>");

					//	Write att description if exists
					String	desc = attr.getDescriptionLine();
					if (desc!=null)
						if (desc.length()>0)
							pgs.append(": <Font Size=-1>"+ desc + "</Font>");
					pgs.append("</Td>\n");

					String	str_type = simpleType(attr.dataType);
					String	level;
					if (attr.disp_level==DispLevel.OPERATOR)
						level = "No";
					else
						level = "Yes";
					pgs.append("<Td><Center><Font Size=-1>" + str_type   + "</Font></Center></Td>");
					pgs.append("<Td><Center><Font Size=-1>" + attr.xSize + "</Font></Center></Td>");
					pgs.append("<Td><Center><Font Size=-1>" + level      + "</Font></Center></Td>");
					pgs.append("</Tr>\n\n");
				}
			}
			pgs.append("</Table>\n");
			pgs.append("</Center>\n");
			pgs.append("<Br><Br><Br><Br><Br>\n");
		}
		//	Generate for image attributs if exist
		//------------------------------------------
		if (image)
		{
			String[]	titles = new String[5];
			titles[0] = "Attribute name";
			titles[1] = "Data Type";
			titles[2] = "X Data Length";
			titles[3] = "Y Data Length";
			titles[4] = "Expert";
			pgs.append(buildTableHeader("Image Attributes", titles));

			for (int i=0 ; i<server.attributes.size() ; i++)
			{
				Attrib attr = server.attributes.attributeAt(i);
				if (attr.attrType==ATTR_IMAGE)
				{
					pgs.append("<Tr><Td><b>"+ attr.name + "</b>");

					//	Write att description if exists
					String	desc = attr.getDescriptionLine();
					if (desc!=null)
						if (desc.length()>0)
							pgs.append(": <Font Size=-1>"+ desc + "</Font>");
					pgs.append("</Td>\n");

					String	str_type = simpleType(attr.dataType);
					String	level;
					if (attr.disp_level==DispLevel.OPERATOR)
						level = "No";
					else
						level = "Yes";
					pgs.append("<Td><Center><Font Size=-1>" + str_type   + "</Font></Center></Td>");
					pgs.append("<Td><Center><Font Size=-1>" + attr.xSize + "</Font></Center></Td>");
					pgs.append("<Td><Center><Font Size=-1>" + attr.ySize + "</Font></Center></Td>");
					pgs.append("<Td><Center><Font Size=-1>" + level      + "</Font></Center></Td>");
					pgs.append("</Tr>\n\n");
				}
			}
			pgs.append("</Table>\n");
			pgs.append("</Center>\n");
		}
		//	Open Output file and search place to write
		//----------------------------------------------
		String	f_out = outDoc + "/Attributes.html";
		writeDocFile(f_out, pgs.str, true);
	}
//=======================================================================
/**
 *	Create the DevCommands.html file from template file and PogoClass Object.
 *	This file will be a list of device server commands for the left frame part.
 *
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected void generateCmdListFile()
						throws	IOException, PogoException
	{
		String	str = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\">\n";

		str += "<HTML><HEAD>\n";
		str += "<TITLE>Commands\n</TITLE></HEAD>\n";
		str += "<BODY BGCOLOR=\"white\">\n";
		str += "<FONT size=\"+1\" ID=\"FrameHeadingFont\">\n";
		str += "<B>Commands:</B></FONT>\n";
		str += "<Br>\n<Br>\n<Br>\n";

		//	Add the non overwritable command init
		str += "<A Href=\"DevCommands.html#Init";
		str += "\" TARGET=\"DevCommands\"> ";
		str += 	"Init</a><Br>\n";

		//	Add all commands
		for (int i=0 ; i<server.commands.size() ; i++)
		{
			Cmd		cmd = server.commands.cmdAt(i);
			str += "<A Href=\"DevCommands.html#" + cmd.name;
			str += "\" TARGET=\"DevCommands\"> ";
			str += 	cmd.name + "</a><Br>\n";
		}

		//	Add the abstract link
		/*
		str += "<Br>\n<Br>\n<A Href=\"DevCommandsTable.html\""+
						" TARGET=\"DevCommands\"> Abstract </a><Br>\n";
		*/
		str += end_html;

		//	Open Output file and  write
		//----------------------------------------------
		String	f_out = outDoc + "/DevCommandsList.html";
		writeDocFile(f_out, str, false);

		//	Copy the Commands Frame file
		//-------------------------------------------
		copyFile(server.templates_dir + "/html/frame.html",
					outDoc + "/DevCommandsFrame.html");
	}
//=======================================================================
//=======================================================================
	private String buildCmdDesc(Cmd cmd, int cmd_idx)
	{
		PogoString	pgs =
			new PogoString("<A NAME=\"" + cmd.name  + "\"><!-- --></A>\n");

			//	Label for Href html command
			pgs.append("<A NAME=\"" + cmd.name  + "\"><!-- --></A>\n");
			//	Cmd name
			pgs.append("<h2>" + cmd_idx + " - " + cmd.name);

			if (cmd.level==fr.esrf.Tango.DispLevel.EXPERT)
				pgs.append(" (for expert only)");

 			pgs.append("</h2>\n<ul>\n");

			//	Cmd Description
			pgs.append("<Li><Strong>Description: </Strong> ");
			if (cmd.description!=null)
				pgs.append(cmd.description);

			//	Argin
			pgs.append("<Br>&nbsp\n");
			pgs.append("<Li><Strong>Argin:<Br>" + simpleType(cmd.argin) +
								"</Strong>\n");
			if (cmd.argin.description!=null)
			{
				PogoString	desc = new PogoString(cmd.argin.description);
				while (desc.indexOf("\\n")>=0)
					desc.replace("\\n", "<Br>\n");
				pgs.append(" : " + desc);
			}
			//	Argout
			pgs.append("<Br>&nbsp\n");
			pgs.append("<Li><Strong>Argout:<Br>" + simpleType(cmd.argout) +
								"</Strong>\n");
			if (cmd.argout.description!=null)
			{
				PogoString	desc = new PogoString(cmd.argout.description);
				while (desc.indexOf("\\n")>=0)
					desc.replace("\\n", "<Br>\n");
				pgs.append(" : " + desc);
			}

			//	Command allowed for states
			if (cmd.notAllowedFor!=null)
			{
				pgs.append("<Br>&nbsp\n");
				pgs.append("<Li><Strong>Command allowed for: " +
											"</Strong><Ul>\n");

				for (int idx=0 ; idx<server.states.size() ; idx++)
				{
					DevState	st = server.states.stateAt(idx);
					boolean 	found=false;
					for (int alIdx=0 ;alIdx<cmd.notAllowedFor.size() ; alIdx++)
					{
						DevState	st1 = cmd.notAllowedFor.stateAt(alIdx);
						if (st1.name.equals(st.name))
							found = true;
					}
					if (!found)
						pgs.append("<Li>" + st.name);
				}

				pgs.append("</Ul>\n");
			}
			else
				pgs.append("<Li><Strong>Command allowed for all device states." +
											"</Strong><Br>\n");

			pgs.append("<Br>&nbsp\n");
			if (cmd.polled_period>0)
				pgs.append("<Li><Strong>Polled every " + cmd.polled_period +
										 " ms</Strong><Br>\n");
			pgs.append("</ul><Br>\n<Br>\n");
		return pgs.str;
	}
//=======================================================================
/**
 *	Create the DevCommands.html file from template file and PogoClass Object.
 *	This file will describe the device server commands in a printable list.
 *
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected void generateCmdListDescriptionFile()
						throws	IOException, PogoException
	{
		PogoString	pgs =
				readTemplate("page.html", "Device Commands Description");


		pgs.append("<Br>\n<Br>\n<Br>\n");

		//	Add the non overwritable command init
		int	cmd_idx = 1;
		pgs.append(buildCmdDesc(init_cmd, cmd_idx++));

		//	Add all commands
		for (int i=0 ; i<server.commands.size() ; i++)
		{
			Cmd		cmd = server.commands.cmdAt(i);
			pgs.append(buildCmdDesc(cmd, cmd_idx++));
		}

		//	Open Output file and search place to write
		//----------------------------------------------
		String	f_out = outDoc + "/DevCommands.html";
		writeDocFile(f_out, pgs.str, true);
	}
//=======================================================================
/**
 *	Create the DevCommands.html file from template file and PogoClass Object.
 *	This file will describe the device server commands in a table.
 *
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	protected void generateCmdTableFile()
						throws	IOException, PogoException
	{
		PogoString	pgs =
			readTemplate("page.html", "Device Commands Description");
		String[]	titles = new String[3];
		titles[0] = "Command name";
		titles[1] = "Argument In";
		titles[2] = "Argument Out";


		pgs.append("<Center>\n");
		pgs.append("<Br><Br>\n<A Href=\"DevCommandsFrame.html\">"+
						" More Details on commands.... </a><Br>\n");
		//	Build table for DispLevel.OPERATOR Commands
		pgs.append("<Br> <Br>\n");

		pgs.append(buildTableHeader("Device Commands for Operator Level", titles));

		//	Add the non overwritable command init
		pgs.append("<Tr><Td><b>"+ init_cmd.name +"</b></Td>\n");
		pgs.append("<Td><Font Size=-1>"+ simpleType(init_cmd.argin) +"</Font></Td>\n");
		pgs.append("<Td><Font Size=-1>"+ simpleType(init_cmd.argout) +"</Font></Td>\n");

		//	Add all  commands
		int	nb_expert = 0;
		for (int i=0 ; i<server.commands.size() ; i++)
		{
			Cmd		cmd = server.commands.cmdAt(i);
			if (cmd.level==DispLevel.OPERATOR)
			{
				pgs.append("<Tr><Td><b>"+ cmd.name +"</b></Td>\n");
				pgs.append("<Td><Font Size=-1>"+ simpleType(cmd.argin) +"</Font></Td>\n");
				pgs.append("<Td><Font Size=-1>"+ simpleType(cmd.argout) +"</Font></Td>\n");
			}
			else
				nb_expert++;
		}
		pgs.append("\n\n\n</Table></Center>\n");

		//	Build table for DispLevel.EXPERT Commands if any
		if (nb_expert>0)
		{
			pgs.append("<Br> <Br> <Br> \n");
			pgs.append("<Center>\n");
			pgs.append(buildTableHeader("Device Commands for Expert Level Only", titles));

			for (int i=0 ; i<server.commands.size() ; i++)
			{
				Cmd		cmd = server.commands.cmdAt(i);

				if (cmd.level==DispLevel.EXPERT)
				{
					pgs.append("<Tr><Td><b>"+ cmd.name +"</b></Td>\n");
					pgs.append("<Td><Font Size=-1>"+ simpleType(cmd.argin) +"</Font></Td>\n");
					pgs.append("<Td><Font Size=-1>"+ simpleType(cmd.argout) +"</Font></Td>\n");
				}
			}
			pgs.append("\n\n\n</Table></Center>\n");
		}
		//	Open Output file and write
		//----------------------------------------------
		String	f_out = outDoc + "/DevCommandsTable.html";
		writeDocFile(f_out, pgs.str, true);
	}
//=======================================================================
/**
 *	Add footer if request and write file.
 */
//=======================================================================
	private void writeDocFile(String filename, String str, boolean write_footer)
						throws	IOException
	{
		if (write_footer)
		{
			if (footer==null)
			{
				String	footname = server.templates_dir + "/html/footer.html";
				FileInputStream		fidin = new FileInputStream(footname);
				int nb = fidin.available();
				byte[]	inStr  = new byte[nb];
				nb = fidin.read(inStr);
                if (nb>0)
                    footer = new String(inStr);
                else
                    footer = "";
                fidin.close();
			}
			str += footer;
		}
		FileOutputStream	fidout = new FileOutputStream(filename);
		fidout.write(str.getBytes());
		fidout.close();
	}
//=======================================================================
//=======================================================================
	protected void removePgGuideLink() throws
								FileNotFoundException,
								IOException
	{
		String[]	pgGuideLink = {
			"<h2>Programmer's guide:</h2>",
			"<ul>",
			"<li> <a href=\"html/index.html\">		Software description.</a>",
			"</ul>"
			};

		String	filename = server.projectFiles.getDocHtml() + "/index.html";
		PogoString	pgs = new PogoString(PogoUtil.readFile(filename));

		for (int i=0 ; i<pgGuideLink.length ; i++)
			pgs.replace(pgGuideLink[i], "");

		FileOutputStream	fidout = new FileOutputStream(filename);
		fidout.write(pgs.str.getBytes());
		fidout.close();
	}
//=======================================================================
/**
 *	Read a template file and update the page title.
 *	@param	filename	template file name
 *	@param	page_title	text to be used as title.
 */
//=======================================================================
	private PogoString readTemplate(String filename, String page_title)
						throws	IOException
	{
		//	Open and read file
		//----------------------------------------
		String  templname = server.templates_dir + "/html/" + filename;
		PogoString pgs = new PogoString(PogoUtil.readFile(templname));

        String lang = "";
        if (pogo.language==cppLang)
            lang = "C++";
        else
        if (pogo.language==javaLang)
            lang = "Java";
        else
        if (pogo.language==pyLang)
            lang = "Python";

        //	Update page title
		pgs.replace(projectTitleRes, server.title);
		pgs.replace(pageTitleRes, page_title);
		pgs.replace("ClassName", server.class_name);
		pgs.replace("Language", lang);
		pgs.replace("1.0", server.revision);
		pgs.replace("Verdier", server.author);
		pgs.replace(classDescRes, server.class_desc);
        //  Add repository if known
        if (server.cvs_repository!=null)
        {
            int pos = pgs.indexOf("Implemented in");
			if (pos>0)
			{
			 	pos = pgs.str.indexOf("\n", pos);
           		pgs.insert(pos, " -  CVS repository: " + server.cvs_repository);
        	}
		}
		return pgs;
	}
//=======================================================================
    /**
     * Useed by server2www classes to patch DS family (from CVS)
     *
     * @param family Family name found in CVS repository
     */
//=======================================================================
    public void addCvsFamily(String family)
    {
        try
        {
            String		indexfile = outDoc + "/index.html";
            PogoString  pgs = new PogoString(PogoUtil.readFile(indexfile));
            int pos = pgs.str.indexOf("CVS repository:");
            if (pos<0)
                return;
            pos = pgs.str.indexOf("\n", pos);
            pgs.insert(pos, " (" + family + ")");
            PogoUtil.writeFile(indexfile, pgs.str);
        }
        catch(Exception e) {
            System.out.println("    " + pogo.class_name + " IN addCvsFamily(" + family+")");
            System.out.println("    "+ e);
        }


    }
//=======================================================================
/**
 *	Remove 'Tango::' from type and return as string.
 */
//=======================================================================
	private String simpleType(TangoTypes type)
	{
		return removeTangoNamespace(type.cpp_code_str);
	}
//=======================================================================
/**
 *	Remove 'Tango::' from string.
 */
//=======================================================================
	private String removeTangoNamespace(String s)
	{
		if (s.indexOf(PogoDefs.cppNameSpace)!=0)
			return s;
		else
			return s.substring(PogoDefs.cppNameSpace.length());
	}

//===============================================================
/**
 *	Search if .doc or .pdf in directory --> add link on it
 */
//===============================================================
	static public void checkDocFile(String targetdir)
	{
		File	f = new File(targetdir);
		if (!f.exists())
			return;

		//	Get file list in directory
		String[]	src_files = f.list();
		for (int i=0 ; i<src_files.length ; i++)
		{
			String	src_file = targetdir + "/" + src_files[i];
			File	sf = new File(src_file);
			if (! sf.isDirectory())	    //	Not recursive
			{
				//	Check if doc or pdf file
				int	idx = src_file.lastIndexOf(".");
				if (idx<0)
					continue;

				if (src_file.substring(idx).equals(".doc")  ||
					src_file.substring(idx).equals(".pdf") )
				{
					//	Get filename without targetdir
					idx = src_file.lastIndexOf("/");
					if (idx<0)
						idx = 0;
					else
						idx++;
					String	filename = PogoUtil.checkFileName(src_file.substring(idx));
					System.out.println("---------> " + filename);

					sf.renameTo(new File(targetdir+ "/" + filename));

					//	Add a link on description file
					addLinkOnDoc(targetdir, filename);
				}
			}
		}
	}
//===============================================================
/**
 *	Add link on .doc or .pdf file in Description.html file
 */
//===============================================================
	static public void addLinkOnDoc(String targetdir, String filename)
	{
		try
		{
			//	Add a link on description file
			PogoString	code = new PogoString(
				PogoUtil.readFile(targetdir + "/Description.html"));

			//	Check if link already exists
			if (code.str.indexOf(filename)>0)
				return;

			//	else search place to insert after Revision number
			int	idx = code.str.indexOf("Revision");
			if (idx<0)
				return;
			idx = code.str.toLowerCase().indexOf("</center>", idx);
			if (idx<0)
				return;

			String	link =  "<Br><Br><Br>\n" +
					"Download <A href=" + filename + "> " + filename +" </a>\n";
			code.insert(idx, link);
			PogoUtil.writeFile(targetdir + "/Description.html", code.str);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
//=======================================================================
/**
 *	Generate Html Doc files for tango device Server
 *	from Pogo Class definition
 *
 *	@return	Output doc. generation process.
 *	@throws FileNotFoundException
 *	@throws SecurityException
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
	public String generate() throws	FileNotFoundException,
									SecurityException,
									IOException,
									InterruptedException,
									PogoException
	{
		System.out.println("Generating HTML Doc files...");

		//	Generate the User's Guide files.
		//-----------------------------------------
		makeDocDir();
		generateIndexFile();
		generateDescriptionFile();
		generateStateDescriptionFile();
		generatePropertyDescriptionFile();
		generateCmdListDescriptionFile();
		generateCmdListFile();
		generateCmdTableFile();
		generateAttributesFile();

        //  Generate doc in one age (could be used to generate a pdf
		generateFull();

		return "";
	}
//=======================================================================
//=======================================================================
    private String takeOffHeaderAndFooter(String code, boolean is_desc)
    {
        String	separator ="<HR WIDTH=\"100%\"></H5>";
        int	pos = code.indexOf(separator);
        if (pos>0)
		{
            code = code.substring(pos);
			if (is_desc)
			{
				//	Syntax could have been modified
				pos = code.indexOf("Revision:");
				if (pos<0)
					pos = 0;
            	pos = code.indexOf("\n", pos);
			}
           	else
			{
				pos = code.indexOf("</center>\n");
            	pos += "</center>\n".length();
			}
        }
		if (pos>0)
        {
           code = code.substring(pos);
           if (pos>0)
            {
			
				pos = code.indexOf("<!--- html Footer --->");
				if (pos>0)
                    return code.substring(0, pos);

				//	Prvious case
                pos = code.indexOf(separator);
                pos = code.lastIndexOf("<Center>", pos);
                if (pos<0)
                    pos = code.toLowerCase().indexOf("</body>");
                if (pos>0)
                    return code.substring(0, pos);
                else
                    return code;
            }
        }
        return "";
    }
//=======================================================================
//=======================================================================
    protected String getDescriptionPart()
            throws	IOException, PogoException
    {
        String	f_in = outDoc + "/Description.html";
        String	code = PogoUtil.readFile(f_in);
        code = takeOffHeaderAndFooter(code, true) + "\n</center>\n";

		//	Remove center tag if no more than PogoClass description
		String	target = "<Center>\n" + server.class_desc +
					"\n<Br>\n<Br>\n</Center>";
		int	start;
		if ((start=code.indexOf(target))>0)
		{
			//	No specific description
			return null;
		}

        //  remove   "get users_guide.pdf line if any
        start = code.indexOf("user_guide.pdf");
        if (start>0)
        {
            int end = code.indexOf('\n', start);
            start   = code.lastIndexOf('\n', start);
            code = code.substring(0, start) + code.substring(end);
        }
		
        return code;
    }
//=======================================================================
//=======================================================================
    protected String getPropertiesPart()
            throws	IOException, PogoException
    {
        String	f_in = outDoc + "/Properties.html";
        String	code = PogoUtil.readFile(f_in);
        return  Cr + Cr +
			"<h2>Properties:</h2>\n" + takeOffHeaderAndFooter(code, false) + "\n</center>\n";
    }
//=======================================================================
//=======================================================================
    protected String getStatesPart()
            throws	IOException, PogoException
    {
        String	f_in = outDoc + "/TangoDevStates.html";
        String	code = PogoUtil.readFile(f_in);
        return Cr + Cr +
			"<h2>States:</h2>\n"+ takeOffHeaderAndFooter(code, false) + "\n</center>\n";
    }
//=======================================================================
//=======================================================================
    protected String getAttributesPart()
            throws	IOException, PogoException
    {
        String	f_in = outDoc + "/Attributes.html";
        String	code = PogoUtil.readFile(f_in);
        return Cr + Cr +
			"<h2>Attributes:</h2>\n"+ takeOffHeaderAndFooter(code, false) + "\n</center>\n";
    }
//=======================================================================
//=======================================================================
    protected String getCommandsPart()
            throws	IOException, PogoException
    {
        String	f_in = outDoc + "/DevCommandsTable.html";
        String	code = PogoUtil.readFile(f_in);
        String result = "<h2>Commands:</h2>\n"+ takeOffHeaderAndFooter(code, false) + "</center>\n";

        f_in = outDoc + "/DevCommands.html";
        code = PogoUtil.readFile(f_in);
        result += Cr + takeOffHeaderAndFooter(code, false) + "</center>\n";

        return Cr + Cr + result;
    }
//=======================================================================
//=======================================================================
    private boolean display_trace = false;
    protected boolean buildPdf(String f_in)
    {
		try
		{
	        String  filename = f_in.substring(0, f_in.lastIndexOf("."));
    	    String  cmd = "html2pdf " + filename  + ".html  " + filename + ".pdf";
			String	trace = PogoUtil.executeShellCmd(cmd);
			if (display_trace)
                System.out.println(trace);
			return true;
		}
		catch(Exception e){
			System.out.println("Cannot buid pdf file");
			e.printStackTrace();
			return false;
		}
    }
//=======================================================================
//=======================================================================
	private static final String		Cr = "<Br>&nbsp;<Br>";
	private String buildTitle(String code)
	{
		int	start_title = code.indexOf("<h1>");
		start_title = code.lastIndexOf("<center>", start_title);
		if (start_title<0)
			return code;
		int	end_title = code.indexOf("</center>");

		String	title = code.substring(start_title, end_title);
		String	new_title = Cr + Cr + Cr + "<center>" +
			"<Table Border=2 Cellpadding=3 CELLSPACING=0 WIDTH=\"100%\">\n" +
			"<Tr><Td>" + Cr + "\n";

		//	Build titlke in a table
		int pos = title.indexOf("User's Guide") + "User's Guide".length();
		new_title += title.substring(0, pos) + Cr;
		int	pos2 = title.indexOf("Class", pos) + "Class".length();
		new_title += title.substring(pos, pos2) + Cr;

		//	Add CVS info
		new_title += "</Td></Tr>\n</h1>\n<Tr><Td>\n";
		pos  = title.indexOf("Revision:", pos2);
		pos2 = title.indexOf("</b>", pos);
		new_title += "<b><Center>" + title.substring(pos, pos2) +
					"</Center></b>\n";

		//	build final header
		new_title += "</Td></Tr>\n</center>\n</Table>\n";
        return code.substring(0, start_title) + new_title +
                code.substring(end_title);
	}
//=======================================================================
//=======================================================================
    protected void generateFull()
			throws	IOException, PogoException
    {
		//	Available only under linux
        if (!PogoUtil.osName().equals("Linux"))
			return;

        String	code = readTemplate("index.html", "").str;
		code = buildTitle(code);
        String	intro = "<h2>Introduction:</h2>\n";
        String	desc  = "<h2>Class Description:</h2>";
		int		pos;

		//	Add some Cr
        pos = code.indexOf(intro);
        code = code.substring(0, pos) + Cr + Cr + "\n" +
                code.substring(pos);
        pos = code.indexOf(desc);
		if (pos<0)
		{
        	desc  = "<h2>Description:</h2>";
        	pos = code.indexOf(desc);
		}
        code = code.substring(0, pos) + Cr + Cr + "\n" +
                code.substring(pos);

		String	dev_id = pogo.device_id.toHtmlString();
		if (dev_id!=null)
		{
        	int     idx = code.indexOf(desc);
       	    idx = code.lastIndexOf("<Br>", idx);
       	    idx = code.lastIndexOf("<Br>", idx-1);
            code = code.substring(0, pos) + dev_id + code.substring(pos);
		}

        //  Add inheritance
        String  inheritance = buildInheritanceDiagram();
        if (inheritance!=null)
        {
            pos = code.indexOf(desc);
            pos = code.lastIndexOf("<Br>", pos);
            pos = code.lastIndexOf("<Br>", pos-1);
            code = code.substring(0, pos) + inheritance  + code.substring(pos);
        }
        //	Add description
        pos = code.indexOf(desc);
        String	class_desc = getDescriptionPart();
		if (class_desc!=null)
		{
			pos += desc.length();
        	code = code.substring(0, pos) + "\n" + class_desc;
		}
		else
        	code = code.substring(0, pos) + "\n";

        code += getPropertiesPart();
        if (server.states.size()>0)
			code += getStatesPart();
        if (server.attributes.size()>0)
       		code += getAttributesPart();
        if (server.commands.size()>0)
	        code += getCommandsPart();
		code += Cr+Cr + "\n";

        //	Open Output file and write
        //----------------------------------------------
        String	f_out = outDoc + "/user_guide.html";
        writeDocFile(f_out, code, true);

		//	Convert to pdf
        if (buildPdf(f_out))
		{
			try
			{
				//	add link in index
				String		indexfile = outDoc + "/index.html";
				PogoString	pgs = new PogoString(PogoUtil.readFile(indexfile));
				pos = pgs.str.indexOf("Revision:");
				pos = pgs.str.indexOf("<Br>", pos+1);
				pos = pgs.str.indexOf("<Br>", pos+1);
				pos = pgs.str.indexOf("<Br>", pos+1);
				pgs.insert(pos,"<center>\n" +
					 "<a href=user_guide.pdf target=new> Download PDF format</a>\n"+
					 "</center>\n");
				PogoUtil.writeFile(indexfile, pgs.str);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
    }
}
//-----------------------------------------------------------------------------
/* end of $Source$ */
