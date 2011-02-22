//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:	java source code to build Command for server code.
//
// $Author$
//
// $Version$
//
// $Log$
// Revision 3.0  2003/04/29 10:39:49  pascal_verdier
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
//
//
// Copyright 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;


import java.util.*;
import java.io.*;


//-======================================================================
/**
 * This class is a just a vector containing the <i>Attrib</i> objects,
 * for the PogoClass object.
 *
 * @author	$Author$
 * @version	$Revision$
 */
//-======================================================================

public class AttribTable implements PogoDefs
{
/*
 *	The vector containing the Attrib objects, of the PogoClass object.
 */
	public    Vector	vect = new Vector();

	//	Dummy construtor for test
	//----------------------------------
	public AttribTable()
	{
		/*
		vect.addElement(new Attrib("Current", "Tango_DEV_SHORT",  false));
		vect.addElement(new Attrib("Voltage", "Tango_DEV_DOUBLE", false));
		vect.addElement(new Attrib("Message", "Tango_DEV_STRING", true));
		*/
	}

//============================================================================
/**
 * Constructor for Attributes Table from a <i>java.util.Vector</i> class.
 *
 * @param v_in	The input commands vector to be copied.
 */
//============================================================================
	public AttribTable(Vector v_in)
	{
		for (int i=0 ; i<v_in.size() ; i++)
			vect.addElement(v_in.elementAt(i));
	}
//============================================================================
/**
 * Constructor for Attributes Table from source files.
 *
 *	@param filename		Pogo object class name file.
 *	@throws FileNotFoundException
 *	@throws SecurityException
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//============================================================================
	public AttribTable(String filename, int lang)
				throws	FileNotFoundException, SecurityException,
						IOException, PogoException
	{
		//	Open and read file
		//----------------------------------------
		FileInputStream		fidin = new FileInputStream(filename);
		int nb = fidin.available();
		byte[]	inStr  = new byte[nb];
		fidin.read(inStr);
		PogoString pgs = new PogoString(inStr);
		fidin.close();

		//	Checking for attribute_factory method
		//----------------------------------------------
		int		start, end;
		if ((start=pgs.str.indexOf("attribute_factory("))<0)
			return;

		PogoString	block = new PogoString(pgs.extractMethodCore(start));

		//	For each line extract params of constructor
		//------------------------------------------------------------------
		start = 0;
		String	patern = "Attr(\"";
		/*
		if (lang==javaLang)
			target = "Attr(\"";
		else
			target = "new Tango::";
		*/
		while ((start=block.str.indexOf(patern, start))>=0)
		{
			//	return to the begining of line
			start = block.str.lastIndexOf("\n", start);
		
			Attrib	attr;
			
			end = block.str.indexOf("(", start)+1;
			String constructor = block.str.substring(start, end);
			start = end;
			end   = block.str.indexOf(")", start);
			PogoString	s = new PogoString(block.str.substring(start, end));
			String[]	params = s.getParams();
	
			//	Call attribute constructor (depends on attrTpe)
			//----------------------------------------------------
			if (constructor.indexOf("Image")>=0)
			{
				int xSize = (new Integer(params[2])).intValue();
				int ySize = (new Integer(params[3])).intValue();
				attr = new Attrib(params[0], ATTR_IMAGE, params[1], xSize, ySize);
			}
			else
			if (constructor.indexOf("Spectrum")>=0)
			{
				int xSize = (new Integer(params[2])).intValue();
				attr = new Attrib(params[0], ATTR_SPECTRUM, params[1], xSize);
			}
			else
			//	Sclar data Type
			{
				//	Test if associated attribute fixed.
				//------------------------------------------
				int	type=ATTR_READ;
				for (int i=0 ; i<AttrRWtypeArray.length ; i++)
				{
					String	target;
					if (lang==javaLang)
						target = new String("AttrWriteType." + AttrRWtypeArray[i]);
					else
						target = new String(PogoDefs.cppNameSpace+AttrRWtypeArray[i]);
					if (params[2].equals(target))
						type = i;
				}
				if (params.length==4 && type==ATTR_READ_WITH_WRITE)	
					attr = new Attrib(params[0], ATTR_SCALAR,
											params[1], type, params[3]);
				else
					attr = new Attrib(params[0], ATTR_SCALAR,
											params[1], type, "");
			}
			attr.getDefaultProperties(block);
			vect.addElement(attr);
		}
	}
//===============================================================
/**
 *	Add a new Attrib object in the vector.
 *
 *	@param	st	Attrib to be added.
 */
//===============================================================
	public void addElement(Attrib st)
	{
		vect.addElement(st);
	}
//===============================================================
/**
 *	Return a the Attrib class for an index.
 *
 *	@param	idx	Index of the state.
 *	@return	Attrib class of this index.
 */
//===============================================================
	public Attrib elementAt(int idx)
	{
		return ((Attrib)(vect.elementAt(idx)));
	}
//===============================================================
/**
 * Return the number of elements in the vector.
 *
 * @return the number of elements in the vector.
 */
//===============================================================
	public int size()
	{
		return vect.size();
	}
//===============================================================
/**
 * Return attribute factory method.
 *
 *	@param	lang	Output language used.
 *	@return String method.
 */
//===============================================================
	public String buildFactory(int lang)
	{
		String			tab = (lang==javaLang)? "\t" : "";
		StringBuffer	sb = new StringBuffer(tab + "{\n");
		String			addKeyWord = (lang==javaLang)? javaAddAttrib : cppAddAttrib;

		for (int i=0 ; i<size() ; i++)
		{
			Attrib	attr = elementAt(i);

			//	Add code for attribute constructor call
			//-----------------------------------------
			sb.append(tab + "\t" + "//	Attribute : " + attr.name + "\n");
			sb.append(attr.buildCodeForAttributeConstructor(lang));

			//	Add the default properties
			//-----------------------------------------
			sb.append(attr.buitCodeForDefaultProperties(lang));

			//	And push it in vector
			//-----------------------------------------
			sb.append(tab + "\t" + addKeyWord + "(" + attr.getLowerName() + ");\n\n");
		}
		sb.append(tab + "}\n");

		return sb.toString();
	}
//-======================================================================
	public String toString()
	{
		StringBuffer	sb = new StringBuffer("");
		for (int i=0 ; i<vect.size() ; i++)
		{
			Attrib attr = (Attrib)(vect.elementAt(i));
			sb.append(attr.name+ "\t");
			sb.append(attr.dataType.cpp_code_str+ "\n");
		}
		return sb.toString();
	}	
}
