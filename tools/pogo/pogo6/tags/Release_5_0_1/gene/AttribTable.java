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
// Revision 3.15  2006/11/09 14:08:55  pascal_verdier
// User part added in ServerClass files.
//
// Revision 3.14  2006/11/02 11:40:59  pascal_verdier
// Python code generation added.
//
// Revision 3.13  2006/09/19 13:20:52  pascal_verdier
// Allow boolean attribute for java servers.
// Bug in command factory for abstract class generation fixed.
// Bug in changing class name fixed.
// Abstarct classes sorted.
//
// Revision 3.12  2006/06/26 09:22:47  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.11  2005/12/20 11:17:16  pascal_verdier
// If StateMachine file not found, display warning message
// and generate a new one at next code generation.
//
// Revision 3.10  2005/11/24 08:29:16  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.9  2005/06/14 08:44:25  pascal_verdier
// SuperClass is replaced by AbstractClass.
//
// Revision 3.8  2005/01/19 07:33:09  pascal_verdier
// Bug on Tab/spaces char fixed.
//
// Revision 3.7  2004/11/29 09:47:43  pascal_verdier
// Method to check java/cpp API server update added.
//
// Revision 3.6  2004/11/22 11:07:46  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.5  2004/11/12 08:05:17  pascal_verdier
// minor bugs fixed.
//
// Revision 3.4  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.3  2004/09/02 06:41:34  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
//
// Revision 3.2  2004/08/26 07:10:53  pascal_verdier
// Attributes are now generated as class.
//
// Revision 3.1  2003/09/10 08:11:30  pascal_verdier
// Minor bugs fixed.
// HTML doc generated with more details.
//
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
// copyleft 1995 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

//-======================================================================
/**
 * This class is a just a vector containing the <i>Attrib</i> objects,
 * for the PogoClass object.
 *
 * @author	$Author$
 * @version	$Revision$
 */
//-======================================================================



public class AttribTable extends Vector implements PogoDefs
{
	Exception except = null;

	//	Dummy construtor for test
	//----------------------------------
	public AttribTable()
	{
		/*
		addElement(new Attrib("Current", "Tango_DEV_SHORT",  false));
		addElement(new Attrib("Voltage", "Tango_DEV_DOUBLE", false));
		addElement(new Attrib("Message", "Tango_DEV_STRING", true));
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
			addElement(v_in.elementAt(i));
	}
//============================================================================
/**
 * Constructor for Attributes Table from source files.
 *
 *	@param	prjfiles	Pogo object class file names.
 *	@param	lang		language used
 *
 *	@throws FileNotFoundException
 *	@throws SecurityException
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//============================================================================
	public AttribTable(ProjectFiles prjfiles, int lang)
				throws	FileNotFoundException, SecurityException,
						IOException, PogoException
	{
		//	Check if class used for pogo or Servers2www
		boolean	toWWW = (System.getProperty("CVSROOT")!=null);

		//	Open and read file
		//----------------------------------------
		String	filename = prjfiles.getServerClass();
		int		devimpl = javaDeviceImpl;
		if (lang==cppLang)
			devimpl = PogoUtil.deviceImplRevisionNumber(prjfiles.getServer_h());
		PogoString pgs = new PogoString(PogoUtil.readFile(filename));

		if (toWWW)
			System.out.println("Reading " + filename);
		//	Checking for attribute_factory method
		//----------------------------------------------
		int		start, end;
        if (lang==pyLang)
        {
            parsePyAttributes(pgs);
            return;
        }
        else
        if ((start=pgs.str.indexOf("attribute_factory("))<0)
		{
			//	No attribute defined.
			System.out.println("Attribute factory not found in :\n" + filename);
			//throw new PogoException("Attribute factory not found in :\n" + filename);
			return;
		}

		PogoString	method = new PogoString(pgs.extractMethodCore(start));

		//	For each line extract params of constructor
		//------------------------------------------------------------------
        if (lang==javaLang || devimpl<3)
		{
			start = 0;
			String	patern = "Attr(\"";
			while ((start=method.str.indexOf(patern, start))>=0)
			{
				//	return to the begining of line
				start = method.str.lastIndexOf("\n", start);

				Attrib	attr;

				end = method.str.indexOf("(", start)+1;
				String constructor = method.str.substring(start, end);
				start = end;
				end   = method.str.indexOf(")", start);
				PogoString	s = new PogoString(method.str.substring(start, end));
				String[]	params = s.getParams();

				//	Call attribute constructor (depends on attrTpe)
				//----------------------------------------------------
				int	type = ATTR_READ;
				if (constructor.indexOf("Image")>=0)
				{
					//	Check if R/W for Image version
					int xSize;
					int ySize;
					if (params.length>4)	//	Exists
					{
						for (int i=0 ; i<AttrRWtypeArray.length ; i++)
						{
							String	target;
							if (lang==javaLang)
								target = "AttrWriteType." + AttrRWtypeArray[i];
							else
								target = PogoDefs.cppNameSpace+AttrRWtypeArray[i];
							if (params[2].equals(target))
								type = i;
						}
						try
						{
							xSize = (new Integer(params[3])).intValue();
							ySize = (new Integer(params[4])).intValue();
						}
						catch(NumberFormatException e)
						{
							if (toWWW)
								xSize = ySize = 1;
							else
								throw e;
						}
					}
					else
					{
						try
						{
							xSize = (new Integer(params[2])).intValue();
							ySize = (new Integer(params[3])).intValue();
						}
						catch(NumberFormatException e)
						{
							if (toWWW)
								xSize = ySize = 1;
							else
								throw e;
						}
					}
					attr = new Attrib(params[0], ATTR_IMAGE, params[1], type, xSize, ySize);
				}
				else
				if (constructor.indexOf("Spectrum")>=0)
				{
					//	Check if R/W for Spectrum version
					int xSize;
					if (params.length>3)	//	Exists
					{
						for (int i=0 ; i<AttrRWtypeArray.length ; i++)
						{
							String	target;
							if (lang==javaLang)
								target = "AttrWriteType." + AttrRWtypeArray[i];
							else
								target = PogoDefs.cppNameSpace+AttrRWtypeArray[i];
							if (params[2].equals(target))
								type = i;
						}
						try
						{
							xSize = (new Integer(params[3])).intValue();
						}
						catch(NumberFormatException e)
						{
							if (toWWW)
								xSize = 1;
							else
								throw e;
						}
					}
					else
					{
						try
						{
							xSize = (new Integer(params[2])).intValue();
						}
						catch(NumberFormatException e)
						{
							if (toWWW)
								xSize = 1;
							else
								throw e;
						}
					}
					attr = new Attrib(params[0], ATTR_SPECTRUM, params[1], type, xSize);
				}
				else
				//	Scalar data Type
				{
					//	Test if associated attribute fixed.
					//------------------------------------------
					for (int i=0 ; i<AttrRWtypeArray.length ; i++)
					{
						String	target;
						if (lang==javaLang)
							target = "AttrWriteType." + AttrRWtypeArray[i];
						else
							target = PogoDefs.cppNameSpace+AttrRWtypeArray[i];
						if (params.length>2)
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
				attr.getDefaultProperties(method, lang);
				addElement(attr);
			}
		}
		else
		{
			//	C++ and device impl 3 or above
			//===================================
			
			//	Read c++ header file
			String	header = PogoUtil.readFile(prjfiles.getServerClass_h());

			//	Search each attribute in attribute factory
			String	pattern = "Attribute : ";
			start = 0;
			while ((start=method.indexOf(pattern, start))>0)
			{
				if (method.isCommentLine(start))
				{
					//	Get the attribute name
					start += pattern.length();
					end = method.nextCr(start);
					String	name = method.substring(start, end);

					//	create attribute itself.
					Attrib	attr = new Attrib(name, header);

					//	Get attribute properties and put it vector
					attr.getDefaultProperties(method, lang);
					addElement(attr);
				}
			}
		}
	}
//===============================================================
//===============================================================
    private void parsePyAttributes(PogoString code) throws PogoException
    {
        int start = code.str.indexOf("Class(PyTango.PyDeviceClass):");
        if (start<0)
            throw new PogoException("No DeviceClass class found !");
        start = code.str.indexOf("attr_list", start);
        if (start<0)
            throw new PogoException("No Attribute list found !");
        start = code.inMethod(start);
        int end = code.outMethod(start);
        String  attr_list = code.str.substring(start, end);
        String  target = "[[";
        end = 0;
        //  Check for each attribute
        while ((start=attr_list.indexOf(target, end))>0)
        {
            //  Get name
            end   = attr_list.lastIndexOf("\'", start-1);
            start = attr_list.lastIndexOf("\'", end-1);
            String  name = attr_list.substring(start+1, end).trim();
            //  Get type
            start = end+target.length();
            end   = attr_list.indexOf(",", start);
            start = attr_list.lastIndexOf(".", end);
            String  type = "Tango::"+attr_list.substring(start+1, end).trim();
            //  Get Attrib type
            start = end+1;
            end   = attr_list.indexOf(",", start);
            start = attr_list.lastIndexOf(".", end);
            String  s_att_type = attr_list.substring(start+1, end).trim();
            int att_type = ATTR_SCALAR;
            for (int i=0 ; i<AttrTypeArray.length ; i++)
                if (s_att_type.equals(AttrTypeArray[i]))
                    att_type = i;

            //  Get RW type and dimentions
            start = end+1;
            end   = attr_list.indexOf("]", start);
            start = attr_list.lastIndexOf(".", end);
            int dim_x = 1;
            int dim_y = 1;
            int idx = end;
            switch(att_type)
            {
            case ATTR_SCALAR:
                break;
            case ATTR_SPECTRUM:
                //  Get dim_x
                end = attr_list.lastIndexOf(",", end);
                try {
                    dim_x = Integer.parseInt(attr_list.substring(end+1, idx).trim());
                }catch(NumberFormatException e) {
                    System.out.println(e);
                }
                break;
            case ATTR_IMAGE:
                //  Get dim_x and dim_y
                end = attr_list.lastIndexOf(",", end);
                int idx2 = end;
                end = attr_list.lastIndexOf(",", end-1);
                try {
                    dim_x = Integer.parseInt(attr_list.substring(end+1, idx2).trim());
                    dim_y = Integer.parseInt(attr_list.substring(idx2+1, idx).trim());
                }catch(NumberFormatException e) {
                    System.out.println(e);
                }
                break;
            }
            String  s_rw_type = attr_list.substring(start+1, end).trim();
            int     rw_type = ATTR_READ;
            for (int i=0 ; i<AttrRWtypeArray.length ; i++)
                 if (s_rw_type.equals(AttrRWtypeArray[i]))
                    rw_type = i;
            Attrib  attr = new Attrib(name, att_type, type, rw_type, dim_x, dim_y);

            //  Get properties any.
            start = idx+1;
            end   = attr_list.indexOf("]", start);
            String  str_prop = attr_list.substring(start, end);
            attr.setPyProperties(str_prop);

            attr.notAllowedFor.setPyNotAllowedFor(code.str, name);

            this.add(attr);
        }
    }
//===============================================================
//===============================================================
	void setAllowedState(String class_name, String filename, boolean is_abstractclass)
				throws	FileNotFoundException, SecurityException,
						IOException, PogoException
	{
		//	Read the description file
		//---------------------------------
		PogoString	readcode;
		
		try
		{
			readcode = new PogoString(PogoUtil.readFile(filename));
		}
		catch (FileNotFoundException e)
		{
			if (is_abstractclass)
				return;
			else
			{
				except = e;
				return;
				//throw e;
			}
		}

		for(int i=0 ; i<size() ; i++)
		{
			Attrib	attr = attributeAt(i);
			String	signature = attr.allowedFullSignatureMethod(class_name);
			int	start;
			if ((start=readcode.indexOf(signature))>0)
			{
				String	method = readcode.extractMethodCore(start);
				attr.notAllowedFor = new DevStateTable(method);
				//System.out.println(attr.name + ":\n" + attr.notAllowedFor);
			}
		}
	}
//===============================================================
/**
 *	Return a the Attrib class for an index.
 *
 *	@param	idx	Index of the state.
 *	@return	Attrib class of this index.
 */
//===============================================================
	public Attrib attributeAt(int idx)
	{
		return ((Attrib)(elementAt(idx)));
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
        if (lang==pyLang)
        {
            String  str = "";
            for (int i=0 ; i<size() ; i++)
            {
                Attrib	attr = attributeAt(i);
                str += attr.buildCodeForAttributeConstructor(lang);
            }
            return str;
        }
        else
        {
            String		tab = (lang==javaLang)? "\t" : "";
            String  	str = tab + "{\n";
            String		addKeyWord = (lang==javaLang)? javaAddAttrib : cppAddAttrib;

            for (int i=0 ; i<size() ; i++)
            {
                Attrib	attr = attributeAt(i);

                //	Add code for attribute constructor call
                //-----------------------------------------
                str += tab + "\t" + "//	Attribute : " + attr.name + "\n";
                str += attr.buildCodeForAttributeConstructor(lang);

                //	Add the default properties
                //-----------------------------------------
                str += attr.buildCodeForDefaultProperties(lang);

                //	And push it in vector
                //-----------------------------------------
                str += tab + "\t" + addKeyWord + "(" + attr.getLowerName() + ");\n\n";
            }
            if (lang==cppLang)
            {
                str += "\t//\tEnd of Automatic code generation\n" +
                       "\t//-------------------------------------------------------------\n";
            }

            str += tab + "}\n";
            return str;
        }
	}


//======================================================================
/**
 *	Read attribute hardware method signature
 */
//======================================================================
	String readHardwareFullSignatureMethod(String class_name)
	{
		return signature(class_name, true);
	}
//======================================================================
//======================================================================
	String readHardwareSignatureMethod(String class_name)
	{
		return signature(class_name, false);
	}
///======================================================================
//======================================================================
	private String signature(String class_name, boolean full)
	{
		PogoString	pgs = new PogoString(readAttrhardwareTemplate);
		if (class_name==null)
			pgs.replace("CLASS::", "");			//	Prototype in .h
		else
		{
			pgs.replace("CLASS", class_name);
			if (full)
			{
				//	if full signature -> modify separator and comments
				//	Get description
				String	target = " *\t";
				int	start = pgs.indexOf(target, "/**".length());
				start += target.length();
				int end = pgs.nextCr(start);
				String	desc = pgs.substring(start, end);

				//	build method separator
				PogoString	separator = new PogoString(cppMethodSeparatorTemplate);
				separator.replace("CLASS", class_name);
				separator.replace("METHOD", "read_attr_hardware");
				separator.replace("DESCRIPTION", desc);

				//	Replace comments by separator
				target = " */\n\tvirtual ";
				end = pgs.indexOf(target);
				String	comments = pgs.substring(0, end+target.length());
				pgs.replace(comments, separator.str);		
			}
		}
		if (!full)
		{
			//	Take off description comments
			String	target = " */\n\tvirtual ";
			int	start = pgs.indexOf(target);
			start += target.length();
			return pgs.substring(start);
		}
		return pgs.str;
	}
//-======================================================================
/**
 *	Control if java (not up to date) server API is compatible.
 */
//-======================================================================
	public String[] isJavaCompatible()
	{
		String[]	AttrDataArray = {
							"Tango::DEV_BOOLEAN",
							"Tango::DEV_SHORT",
							"Tango::DEV_LONG",
							"Tango::DEV_DOUBLE",
							"Tango::DEV_STRING"
						};
		Vector	v = new Vector();
		for (int i=0 ; i<size() ; i++)
		{
			Attrib	attr = attributeAt(i);
			//	Check memorize boolean field
			if (attr.memorized)
				v.add("Attribute memorized  (" + attr.name + ")");

			//	check dataType field
			boolean	found = false;
			for (int t=0 ; !found && t<AttrDataArray.length ; t++)
				found = (attr.dataType.cpp_code_str.equals(AttrDataArray[t]));
			if (!found)
				v.add("Attribute type " + attr.dataType.cpp_code_str + "  (" + attr.name + ")");

			//	check rwType
			if (attr.getWritable() && attr.attrType!=ATTR_SCALAR)
				v.add("Write an attribute " +
						 AttrTypeArray[attr.attrType] + "  ("+ attr.name + ")");
		}
		//	Check for returned value.
		if (v.size()==0)
			return null;
		else
		{
			String[]	problems = new String[v.size()];
			System.out.println("Java Servers API do not support:");
			for (int i=0 ; i<v.size() ; i++)
			{
				problems[i] = (String) v.elementAt(i);
				System.out.println(problems[i]);
			}
			return problems;
		}
	}
//-======================================================================
//-======================================================================
    String updatePyAttributes(String code, String readcode, String template, String class_name) throws PogoException
    {
        //  Split template
        String  target = "attr.set_value(";
        int start = template.indexOf(target);
        if (start<0)
            throw new PogoException("Attribute template syntax error.");
        start = template.indexOf("\n", start)+1;
        String  read_templ = template.substring(0, start);

        int idx =start;
        target = "#\tAdd your own code here";
        start = template.indexOf(target, start);
        if (start<0)
            throw new PogoException("Attribute template syntax error.");
        start += target.length()+1;
        String  write_templ = template.substring(idx, start);
        String  stm_templ  = "\t" + template.substring(start).trim();

        //  Get position to insert
        int insert_pos = code.indexOf("def read_attr_hardware(self,");
        insert_pos = PogoUtil.endOfPythonMethod(code, insert_pos);
        code = code.substring(0, insert_pos) + "\n\n" +
               code.substring(insert_pos);
        insert_pos += 2;

        //  Generate methods for each attribute
        for (int i=size()-1 ; i>=0 ; i--)
        {
            Attrib  attr = attributeAt(i);

            //  Manage Read attribute method
            String  read_method;
            String  signature = "def read_" + attr.name + "(self, attr):";
            //  Check if already exists
            if (readcode.indexOf(signature)>0)
            {
                //  Get it
                read_method = PogoUtil.pythonMethod(readcode, signature);
            }
            else
                read_method = attr.buildPyReadMethod(read_templ);
            read_method = "\n" + read_method.trim() + "\n\n";

            //  Manage Write attribute method if any
            String  write_method = null;
            if (attr.rwType==ATTR_WRITE  ||
                attr.rwType==ATTR_READ_WRITE )
            {
                signature = "def write_" + attr.name + "(self, attr):";
                //  Check if already exists
                if (readcode.indexOf(signature)>0)
                {
                    //  Get it
                    write_method = PogoUtil.pythonMethod(readcode, signature);
                }
                else
                    write_method = attr.buildPyWriteMethod(write_templ);
                write_method = "\n" + write_method.trim() + "\n\n";
            }

            //  Manage State Machine method
            String  stm_method = null;
            signature = "def is_" + attr.name + "_allowed(self, req_type):";
            //  Check if already exists
            int sigpos = readcode.indexOf(signature);
            if (sigpos>0 || attr.notAllowedFor.size()>0)
            {
                if (sigpos>0)
                {
                    //  Get it
                    stm_method = PogoUtil.pythonMethod(readcode, signature);
                }
                else
                    stm_method = attr.buildPyStateMachineMethod(stm_templ);
                stm_method = attr.pyUpdateAllowedStates(stm_method, signature);
                stm_method = "\n" + stm_method.trim() + "\n\n";
            }

            //  Insert them
            if (stm_method!=null)
                code = code.substring(0, insert_pos) + stm_method +
                       code.substring(insert_pos);
            if (write_method!=null)
                code = code.substring(0, insert_pos) + write_method +
                       code.substring(insert_pos);
            code = code.substring(0, insert_pos) + read_method +
                   code.substring(insert_pos);
        }
        return code;
    }
//-======================================================================
//-======================================================================
	public String toString()
	{
		String  str ="";
		for (int i=0 ; i<size() ; i++)
		{
			Attrib attr = attributeAt(i);
			str += attr.name+ "\t";
			str += attr.dataType.cpp_code_str+ "\n";
		}
		return str;
	}	
//-======================================================================
//-======================================================================
	public static void main(java.lang.String[] args)
	{
		String filename = "/segfs/tango/tools/pogo/test/cpp/PowerSupply/PowerSupply.h";
	
		try
		{
			ProjectFiles	prj = new ProjectFiles(filename);
			AttribTable		table = new AttribTable(prj, cppLang);
            System.out.println(table);
        }
		catch (Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}

