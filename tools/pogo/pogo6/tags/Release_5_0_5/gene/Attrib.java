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
// Revision 3.15  2006/12/05 09:33:49  pascal_verdier
// Min/Max warning  attribute properties added.
// delay time/val   attribute properties added.
// self. removed on attributes and commands returned values.
//
// Revision 3.14  2006/11/24 14:28:18  pascal_verdier
// Implements first Python gurus remarks.
//
// Revision 3.13  2006/11/06 15:40:30  pascal_verdier
// Put property methods in Util class.
//
// Revision 3.12  2006/11/02 11:40:59  pascal_verdier
// Python code generation added.
//
// Revision 3.11  2006/06/26 09:22:47  pascal_verdier
// ango-5.5 compatiblity.
// extern C method added to be used as shared library.
// VCC 6 project file generated if running on Win32.
// .obj, .so, executable files generated in separated directories.
//
// Revision 3.10  2005/11/24 08:29:16  pascal_verdier
// Analized with intelliJid.
//
// Revision 3.9  2005/11/07 08:41:33  pascal_verdier
// Memorized attribute written or not at starteup added.
//
// Revision 3.8  2005/03/21 08:24:28  pascal_verdier
// Bug fixed concerning an attribute containing 'Spectrum' or 'Image' in it's name.
//
// Revision 3.7  2005/02/02 08:05:35  pascal_verdier
// Bug with confusion between Spectrum attribute and class called Spectrum fixed.
//
// Revision 3.6  2004/11/22 11:07:46  pascal_verdier
// First revision to generate a super class.
// User code managed in device_factory().
//
// Revision 3.5  2004/09/24 11:21:24  pascal_verdier
// Spectrum and Image attributes are now writable.
//
// Revision 3.4  2004/09/07 11:59:28  pascal_verdier
// Remove CVS log messages and info from templates.
//
// Revision 3.3  2004/09/02 06:41:34  pascal_verdier
// float, boolean, ushort, ubyte added for attributes.
// Writable attributes can be momorized.
// Spectum and Image attributes can be witten.
//
// Revision 3.2  2004/08/26 07:09:23  pascal_verdier
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


import fr.esrf.Tango.DispLevel;
import fr.esrf.TangoDs.TangoConst;

//-======================================================================
/**
 * This class defines an attribute for device server code.
 *
 * @author	$Author$
 * @version	$Revision$
 */
//-======================================================================

public class Attrib implements PogoDefs, TangoConst
{
	/**
	 *	Attribute's name.
	 */
	 public String	name;
	/**
	 *	Attribute Type.
	 */
	 public int	attrType;
	/**
	 *	Attribute data dataType.
	 */
	 public TangoTypes	dataType;
	/**
	 *	Read/Write type.
	 */
	 public int	rwType;
	/**
	 *	Associated attribute if Read/Write type is READ_WITH_WRITE.
	 */
	 public String assAttr;
	/**
	 *	Maximum X legh data size.
	 */
	 public int xSize;
	/**
	 *	Maximum Y legh data size.
	 */
	 public int ySize;
	/**
	 *	</i>DevState </i> list which for the command is NOT allowed.
	 */
	public DevStateTable	notAllowedFor;
	/**
	 *	Display level (OPERATOR or EXPERT)
	 */
	public DispLevel	disp_level = DispLevel.OPERATOR;
	/**
	 *	polled period (not polled if 0)
	 */
	public int	polled_period = 0;
	/**
	 *	Attribute (Scalar) memorized or not.
	 */
	public boolean	memorized = false;
	/**
	 *	Attribute (Scalar) memorized written at init
	 */
	public boolean	memorized_init = true;
	/**
	 *	Attribute default properties
	 */
	public Property[]	properties;


    private FireEvent           change_evt;
    private FireEvent           archive_evt;
    public static final int     CHANGE  = 0;
    public static final int     ARCHIVE = 1;

//======================================================================
/**
 *	Constructor for attribute.
 *
 *	@param	name		Attribute's name.
 *	@param	readcode	Code read from header file (only for device impl 3 and above)
 */
//======================================================================
	public Attrib(String name, String readcode)
				throws	PogoException
	{
		this.name = name;
        this.change_evt  = new FireEvent();
        this.archive_evt = new FireEvent();
        PogoString	code = new PogoString(readcode);
        buildPropertiesArray();
        //	Get the class definition in header code
		int	start = code.indexOf("class " + name + "Attr:");
		if (start<0)
		{
			start = code.indexOf("class " + name + "Attrib:");
			if (start<0)
				throw new PogoException("Attribute class not defined in header file !");
		}
		start = code.inMethod(start);
		int	end = code.outMethod(start);
		PogoString	class_def = new PogoString(code.substring(start, end));
		
		//	Analyse Attribute constructor
		end = class_def.indexOf(") {}");
		start = class_def.lastIndexOf("(", end) + 1;
		PogoString	constructor = new PogoString(class_def.substring(start, end));
		String[]	params = constructor.getFields();

		//	Get constructor signature
		end = start;
		start = class_def.lastIndexOf("public:", end) + "public:".length();
		String		constr_signature =class_def.substring(start, end).trim();
		//	Serach attribute type
		if (constr_signature.indexOf(":ImageAttr")>0)
			attrType = ATTR_IMAGE;
		else
		if (constr_signature.indexOf(":SpectrumAttr")>0)
			attrType = ATTR_SPECTRUM;
		else
			attrType = ATTR_SCALAR;

		//	Get Attribute data type
		//---------------------------------
		int	idx = 1;	//	first param to be used
		dataType = new TangoTypes(params[idx++]);

		//	Read/Write type
		rwType=ATTR_READ;
		for (int i=0 ; i<AttrRWtypeArray.length ; i++)
		{
			String	target = PogoDefs.cppNameSpace+AttrRWtypeArray[i];
			if (params[idx].equals(target))
				rwType = i;
		}
		idx++;
		//	Other params depends on attribute type
		switch(attrType)
		{
		case ATTR_SCALAR:
			if (rwType==ATTR_READ_WITH_WRITE)
				assAttr =params[idx];
			break;
		case ATTR_SPECTRUM:
			xSize = (new Integer(params[idx])).intValue();
			break;
		case ATTR_IMAGE:
			xSize = (new Integer(params[idx])).intValue();
			ySize = (new Integer(params[++idx])).intValue();
			break;
		}
		notAllowedFor = new DevStateTable();
	}

//======================================================================
/**
 *	Attribute Constructor for SCALAR type.
 *
 *	@param	name		Attribute's name.
 *	@param	attrType	Attribut's type.
 *	@param	dataType	Attribute's dataType.
 *	@param	rwType		Read/Write type.
 *	@param	assAttr		Associated attribute (only if writable==READ_WITH_WRITE)
 */
//======================================================================
 	public Attrib(String name, int attrType, String dataType, int rwType, String assAttr)
	{
		this(name, attrType, dataType, 1, 1);
		this.rwType   = rwType;
		this.assAttr  = assAttr;
        this.change_evt  = new FireEvent();
        this.archive_evt = new FireEvent();
	}
//======================================================================
/**
 *	Attribute Constructor for SPECTRUM type.
 *
 *	@param	name		Attribute's name.
 *	@param	attrType	Attribut's type.
 *	@param	dataType	Attribute's dataType.
 *	@param	rwType		Read/Write type.
 *	@param	xSize		maximum X length size.
 */
//======================================================================
 	public Attrib(String name, int attrType, String dataType, int rwType, int xSize)
	{
		this(name, attrType, dataType, rwType, xSize, 1);
        this.change_evt  = new FireEvent();
        this.archive_evt = new FireEvent();
	}
//======================================================================
/**
 *	Attribute Constructor for IMAGE type.
 *
 *	@param	name		Attribute's name.
 *	@param	attrType	Attribut's type.
 *	@param	dataType	Attribute's dataType.
 *	@param	rwType		Read/Write type.
 *	@param	xSize		maximum X length size.
 *	@param	ySize		maximum Y length size.
 */
//======================================================================
 	public Attrib(String name, int attrType, String dataType, int rwType, int xSize, int ySize)
	{
		this.name     = name;
		this.attrType = attrType;
		this.dataType = new TangoTypes(dataType, "");
		this.rwType   = rwType;
		this.xSize    = xSize;
		this.ySize    = ySize;
		this.assAttr  = "";
		buildPropertiesArray();
		notAllowedFor = new DevStateTable();
        this.change_evt  = new FireEvent();
        this.archive_evt = new FireEvent();
	}
//======================================================================
/**
 *	Set the dataType field.
 *
 *	@param	dataType	Tango dataType name.
 */
//======================================================================
	public void setDataType(String dataType)
	{
		this.dataType = new TangoTypes(dataType, "");
	}
//======================================================================
/**
 *	Set the dataType field.
 *
 *	@param	dataType	Language dataType name.
 *	@param	lang	Language used.
 */
//======================================================================
	public void setDataType(String dataType, int lang)
	{
		this.dataType = new TangoTypes(dataType);
	}
//======================================================================
/**
 *	reaturn the writable state.
 */
//======================================================================
	public boolean getWritable()
	{
		//return (attrType==ATTR_SCALAR && rwType!=ATTR_READ &&
		//			rwType!=ATTR_READ_WITH_WRITE);
		return (rwType!=ATTR_READ && rwType!=ATTR_READ_WITH_WRITE);
	}
//======================================================================
/**
 *	Built C++ member data line for ClassName.h file.
 *
 *	@return String line.
 */
//======================================================================
	public String cppMemberData()
	{
		String  str = "";
		
		//	read part
		if (rwType!=ATTR_WRITE)
			str += "\t\t" + dataType.cpp + "\t*attr_" + name + "_read;\n";
		//	Write part
		if (getWritable())
			str += "\t\t" + dataType.cpp + "	attr_" + name + "_write;\n";
		return str;
	}
//======================================================================
/**
 *	Built java member data line for ClassName.java file.
 *
 *	@return String line.
 */
//======================================================================
	public String javaMemberData()
	{
		String  str = "";
		
		//	Read part
		if (rwType!=ATTR_WRITE)
		{
			str += "\tprotected " + dataType.java + "[]\tattr_" + name + "_read " + "= new " + dataType.java;
			switch (attrType)
			{
			case ATTR_SCALAR:
				str += "[1];\n";
				break;
			case ATTR_SPECTRUM:
				str += "[" + xSize + "];\n";
				break;
			case ATTR_IMAGE:
				str += "[" + (xSize*ySize) + "];\n";
				break;
			}
		}
		//	Write part
		if (attrType==ATTR_SCALAR && rwType!=ATTR_READ &&
					rwType!=ATTR_READ_WITH_WRITE)
			str += "\tprotected " + dataType.java + "	attr_" + name + "_write;\n";
		return str;
	}
//======================================================================
//======================================================================
    public boolean propertiesAreSet()
    {
        for (int i=0 ; i<properties.length ; i++)
            if (properties[i].value!=null && properties[i].value.length()>0)
                return true;
        return (memorized || polled_period>0);
    }
//======================================================================
/**
 *	Generate code for attribute constructor in attribute_factory method.
 */
//======================================================================
	public String buildCodeForAttributeConstructor(int lang)
	{
		if (lang==pyLang)
        {
            //  Build common part (types)
            String  tab = "\t\t\t";
            String  str = "\t\t\'"+name + "\':\n" +
                          tab + "[[" + this.dataType.pyType()  + ",\n" +
                          tab + "PyTango." + AttrTypeArray[attrType] + ",\n" +
                          tab + "PyTango."  + AttrRWtypeArray[rwType];
            //  Add spectrum and image sizes
            if (attrType==ATTR_SPECTRUM)
                str += ", " + xSize;
            else
            if (attrType==ATTR_IMAGE)
                str += ", " + xSize + ", " + ySize;
            str += "]";
            //  Add properties if any.
            if (propertiesAreSet())
            {
                str += ",\n" + tab + "{";
                for (int i=0 ; i<properties.length ; i++)
                    if (properties[i].value!=null && properties[i].value.length()>0)
                    {
                        str += "\n" + tab + "\t" + "\'" + properties[i].name + "\'" +
                                ":" + properties[i].str_value() + ",";
                    }

                //  Add special case for thing view as properties in PYTHON !!!!
                if (memorized)
                {
                    if (memorized_init)
                        str += "\n" + tab + "\t" + "\'Memorized\':\"true\",";
                    else
                        str += "\n" + tab + "\t" + "\'Memorized\':\"" + pyAttWithoutHardApplied + "\",";
                }
                if (polled_period>0)
                {
                    str += "\n" + tab + "\t" + "\'Polling period\':" + polled_period + ",";
                }
                if (disp_level==DispLevel.EXPERT)
                {
                    str += "\n" + tab + "\t" + "\'Display level\':PyTango.DispLevel.EXPERT,";
                }

                str += "\n" + tab + "} ";
            }
            str += "],\n";
            return str;
        }
        else
        if (lang==cppLang)
		{
				//	Has been mofified for Device_3Impl
			return "\t" + name + "Attrib	*" + getLowerName() +
						 " = new " + name + "Attrib();\n";
					
		}
		else
		{
            String[]	att_type = { "Attr", "SpectrumAttr", "ImageAttr"};
            String		namespace = (lang==javaLang)? "" : cppNameSpace;
            String		tab = (lang==javaLang)? "\t" : "";
            String		pointer = (lang==javaLang)? "":"*";
            String		argtype = (lang==javaLang)?
                                    dataType.java_code_str : dataType.cpp_code_str;
            //	Create the pointer object
            String  str = "\t" + tab + namespace +
                att_type[attrType] + "\t" + pointer + getLowerName() +" = \n" +
            //	Add constructor call
                tab + "\t\t" + "new " + namespace + att_type[attrType] + "(" +
            //	add parameters (depends on type)
                "\"" + name + "\", " + argtype + ", ";
            switch(attrType)
            {
            case ATTR_SCALAR:
                if (lang==javaLang)
                    namespace = "AttrWriteType.";
                str += namespace + AttrRWtypeArray[rwType];

                if (rwType==ATTR_READ_WITH_WRITE)
                    str += ", \"" + assAttr +"\"";
                break;

            case ATTR_SPECTRUM:
                str += xSize;
                break;

            case ATTR_IMAGE:
                str += xSize + ", " + ySize;
                break;
            }
            str += ");\n";
            return str;
		}
	}

//======================================================================
/**
 *	Generate code for default properties in attribute_factory method.
 */
//======================================================================
	public String buildCodeForDefaultProperties(int lang)
	{
		String			tab = (lang==javaLang)? "\t" : "";
		//	Search if at leas one property has been set
		//---------------------------------------------------------
		boolean	has_been_set = false;
		for (int i=0 ; i<properties.length ; i++)
			if (properties[i].value!=null && properties[i].value.length()>0)
				has_been_set = true;

		String  str = "";
		String	pointer = (lang==javaLang)? ".":"->";
		if (has_been_set)
		{
			String	namespace = (lang==javaLang)? "" : cppNameSpace;
			str += tab + "\t" + 	namespace + "UserDefaultAttrProp	" +
								getLowerName() + "_prop";

			//	if java, add a constructor call
			if (lang==javaLang)
				str += " = new UserDefaultAttrProp()";
			str += ";\n";

			//	for each property write code if value not null
			for (int i=0 ; i<properties.length ; i++)
				if (properties[i].value!=null && properties[i].value.length()>0)
				{
					str += tab + "\t" + getLowerName() + "_prop."+
						properties[i].method + "(\"" + properties[i].value + "\");\n";
				}

			//	and code to set these properties

			str += tab + "\t" + 	getLowerName() + pointer +
									Property.set_def_prop_method + "(" +
									getLowerName() + "_prop);\n";
		}
		
		//	Add polling period and display level
		if (polled_period>0)
			str += tab + "\t" + 	getLowerName() + pointer +
								"set_polling_period(" + polled_period + ");\n";
		if (disp_level==DispLevel.EXPERT)
		{
			String	namespace = (lang==javaLang)? "DispLevel.":"Tango::";
			str += tab + "\t" + 	getLowerName() + pointer +
								"set_disp_level(" + namespace + "EXPERT);\n";
		}
        if (lang==cppLang)
        {
            //  Generate for memorized and init memorized
            if (memorized)
            {
                str +=  tab + "\t" + 	getLowerName() + pointer + "set_memorized();\n" +
                        tab + "\t" + 	getLowerName() + pointer +
                        "set_memorized_init(" + memorized_init + ");\n";
            }

            //	generate for change event fire management
            if (change_evt.by_code)
            {
                str += tab + "\t" + 	getLowerName() + pointer + "set_change_event(" +
                        change_evt.by_code + ", " + change_evt.whith_check + ");\n";
            }
            //	generate for archive event fire management
            if (archive_evt.by_code)
            {
                str += tab + "\t" + 	getLowerName() + pointer + "set_archive_event(" +
                        archive_evt.by_code + ", " + archive_evt.whith_check + ");\n";
            }
        }
        return str;
	}
//======================================================================
/**
 *	Get the default properties value for block code.
 */
//======================================================================
	public void getDefaultProperties(PogoString pgs, int lang)
	{
		String		prop_def = getLowerName() + "_prop.";
		int			start;
		int			end;
		String		method;
		PogoString	block;

		//	Search start definition
		String	pattern = "//	Attribute : ";
		if ((start=pgs.str.indexOf(pattern + name))<0)
			return;
		//	search end of definition
		if ((end=pgs.str.indexOf(pattern, start+1))>0)
			block = new PogoString(pgs.str.substring(start, end));
		else
			block = new PogoString(pgs.str.substring(start));

		//	Search for each property
		end = 0;
		while ((start=block.str.indexOf(prop_def, end))>0)
		{
			end = block.nextCr(start);
			
			//	Search property name
			int start1 = start + prop_def.length();
			int	end1   = block.str.indexOf("(", start1);
			method = block.str.substring(start1, end1);
			
			//	Search propety value
			start1 = block.str.indexOf("\"", end1)+1;
			end1   = block.str.indexOf("\"", start1);
			String	value = block.str.substring(start1 , end1);

			//	Compeare method's name and fill properties array
			//------------------------------------------------------
			for (int i=0 ; i<properties.length ; i++)
				if (method.equals(properties[i].method))
					properties[i].value = value;
		}
//		for (int i=0 ; i<properties.length ; i++)
//			System.out.println(i + ":	" + properties[i]);

		//	Search for polled period.
		String	code = block.str;
		String	pointer = (lang==javaLang)? ".":"->";
		method = getLowerName() + pointer + "set_polling_period(";
		if ((start=code.indexOf(method))>0)
		{
			start += method.length();
			polled_period = Integer.parseInt(code.substring(start,
											code.indexOf(")", start)));
		}

		//	Search for display level
		method = getLowerName() + pointer + "set_disp_level(";
		if ((start=code.indexOf(method))>0)
		{
			start += method.length();
			String	strlevel = code.substring(start, code.indexOf(")", start));
			if (strlevel.indexOf("EXPERT")>0)
				disp_level = DispLevel.EXPERT;
			else
				disp_level = DispLevel.OPERATOR;
		}

		//	Search for memorized
		method = getLowerName() + pointer + "set_memorized();";
		if (code.indexOf(method)>0)
		{
			memorized = true;
			method = getLowerName() + pointer + "set_memorized_init(";
			if ((start=code.indexOf(method))>0)
			{
				String	param = code.substring(start+method.length());
				memorized_init = param.startsWith("true");
			}
			else
				memorized_init = true;
		}
        //	Search for change event fire management
        method = getLowerName() + pointer + "set_change_event(";
        if ((start=code.indexOf(method))>0)
        {
            start += method.length();
            String	params[] = new String[2];
            end   = code.indexOf(",", start);
            params[0] = code.substring(start, end).trim().toLowerCase();
            start = end+1;
            end   = code.indexOf(");", start);
            params[1] = code.substring(start, end).trim().toLowerCase();
            this.setFireEvent(CHANGE, params[0].equals("true"), params[1].equals("true"));
        }
        //	Search for archive event fire management
        method = getLowerName() + pointer + "set_archive_event(";
        if ((start=code.indexOf(method))>0)
        {
            start += method.length();
            String	params[] = new String[2];
            end   = code.indexOf(",", start);
            params[0] = code.substring(start, end).trim().toLowerCase();
            start = end+1;
            end   = code.indexOf(");", start);
            params[1] = code.substring(start, end).trim().toLowerCase();
            this.setFireEvent(ARCHIVE, params[0].equals("true"), params[1].equals("true"));
        }
	}
//======================================================================
//======================================================================
    public String getPropValue(int i)
    {
        return properties[i].value;
    }
//======================================================================
//======================================================================
    public void setPropValue(int i, String val)
    {
        properties[i].value = val;
    }
//======================================================================
//======================================================================
	public String getDescription()
	{
		return properties[properties.length - 1].value;
	}
//======================================================================
//======================================================================
	public void setDescription(String desc)
	{
		properties[properties.length - 1].value = desc;
	}
//======================================================================
//======================================================================
	public String getDescriptionLine()
	{
		String desc = getDescription();
		if (desc==null) return desc;
		if (desc.length()==0) return desc;

		//	Replace '\n' char by space
		PogoString line = new PogoString(desc);
		while (line.str.indexOf("\\n")>=0)
			line.replace("\\n", " ");
		return line.str;
	}
//======================================================================
//======================================================================
	String buildCppClassesDefs(String template, String class_name)
	{
		//	Set attribute name
		PogoString	pgs = new PogoString(template);
		while (pgs.indexOf("ATTRIBUTE")>0)
			pgs.replace("ATTRIBUTE", name);
		while (pgs.indexOf("CLASS")>0)
			pgs.replace("CLASS", class_name);

		//	Set Attribute inheritance class
		String	src = ":Attr";
		String	inherite_class = src;
		if (attrType==ATTR_SPECTRUM)
			inherite_class = ":SpectrumAttr";
		else
		if (attrType==ATTR_IMAGE)
			inherite_class = ":ImageAttr";

		pgs.replace(src, inherite_class);	//	Class declaration
		pgs.replace(src, inherite_class);	//	calling constructor

		//	set data type
		pgs.replace("DATA_TYPE", dataType.cpp_code_str);

		//	set read/write type
		pgs.replace("RW_TYPE", "Tango::" + AttrRWtypeArray[rwType]);

		//	Add optionnal params

		//	Add associated attr if any
		if (attrType==ATTR_SCALAR && rwType==ATTR_READ_WITH_WRITE)
		{
			//	Get end of constructor line
			int	start = pgs.indexOf(") {}");
			String	add_param = ", \""+ assAttr + "\"";
			pgs.insert(start, add_param);
		}
		//	Add x size if any
		if (attrType==ATTR_SPECTRUM || attrType==ATTR_IMAGE)
		{
			//	Get end of constructor line
			int	start = pgs.indexOf(") {}");
			String	add_param = ", "+ xSize;
			pgs.insert(start, add_param);
		}
		//	Add y size if any
		if (attrType==ATTR_IMAGE)
		{
			//	Get end of constructor line
			int	start = pgs.indexOf(") {}");
			String	add_param = ", "+ ySize;
			pgs.insert(start, add_param);
		}
		
		
		//	If not writable -> remove write method
		if (!getWritable())
		{
			int	 start = pgs.indexOf("	virtual void write");
			int	 end   = pgs.indexOf("	virtual bool is_allowed");

			pgs.remove(pgs.substring(start, end));			
		}
		return pgs.str;
	}
//======================================================================
/**
 *	Read attribute exec method (Device_3impl and above).
 */
//======================================================================
	String readSignatureMethod(String class_name)
	{
		return signature(readAttSigTemplate, class_name, "read_" + name, false);
	}
//======================================================================
/**
 *	Write attribute exec method (Device_3impl and above).
 */
//======================================================================
	String writeSignatureMethod(String class_name)
	{
		return signature(writeAttSigTemplate, class_name, "write_" + name, false);
	}
//======================================================================
/**
 *	is_allowed method for attribut (Device_3impl and above).
 */
//======================================================================
	String allowedSignatureMethod(String class_name)
	{
		return signature(allowedAttSigTemplate,
						class_name, "is_" + name + "_allowed", false);
	}
//======================================================================
/**
 *	Read attribute exec method (Device_3impl and above).
 */
//======================================================================
	String readFullSignatureMethod(String class_name)
	{
		return signature(readAttSigTemplate, class_name, "read_" + name, true);
	}
//======================================================================
/**
 *	Write attribute exec method (Device_3impl and above).
 */
//======================================================================
	String writeFullSignatureMethod(String class_name)
	{
		return signature(writeAttSigTemplate, class_name, "write_" + name, true);
	}
//======================================================================
/**
 *	is_allowed method for attribut (Device_3impl and above).
 */
//======================================================================
	String allowedFullSignatureMethod(String class_name)
	{
		return signature(allowedAttSigTemplate,
						class_name, "is_" + name + "_allowed", true);
	}
//======================================================================
//======================================================================
	private String signature(String template, String cl_name, String method, boolean full)
	{
		PogoString	pgs = new PogoString(template);
		pgs.replace("ATTRIBUTE", name);
		pgs.replace("METHOD", method);

		if (cl_name==null)
			pgs.replace("CLASS::", "");		//	Prototype in .h
		else
		{
			pgs.replace("CLASS", cl_name);
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
				separator.replace("CLASS", cl_name);
				separator.replace("METHOD", method);
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
//======================================================================
//======================================================================
	String getDevImpl2ReadAttr(PogoString code, String classname)
	{
		String	pattern = "void " + classname + 
							"::read_attr(Tango::Attribute &attr)";
		int	start, end;
		if ((start=code.str.indexOf(pattern))<0)
			return "";
		start = code.inMethod(start);
		end   = code.outMethod(start);
		PogoString	method = new PogoString(code.str.substring(start, end));

		//	Search if block
		pattern = "if (attr_name == \"" + name + "\")";
		if ((start=method.str.indexOf(pattern))<0)
			return "";
		start = method.inMethod(start);
		end   = method.outMethod(start);
		start = method.nextCr(start);
		end   = method.previousCr(end-2);

		PogoString	block = new PogoString(method.str.substring(start, end));
		block.indent(-1);
		return block.str;
	}
//======================================================================
//======================================================================
	String getDevImpl2WriteAttr(PogoString code, String classname)
	{
		String	pattern = "void " + classname + 
							"::write_attr_hardware(vector<long> &attr_list)";
		int	start, end;
		if ((start=code.str.indexOf(pattern))<0)
		{
			System.out.println(pattern + " Not found !");
			return "";
		}
		start = code.inMethod(start);
		end   = code.outMethod(start);
		PogoString	method = new PogoString(code.str.substring(start, end));

		//	Search if block
		pattern = "if (attr_name == \"" + name + "\")";
		if ((start=method.str.indexOf(pattern))<0)
		{
			System.out.println(pattern + " Not found !");
			return "";
		}
		start = method.inMethod(start);
		end   = method.outMethod(start);
		start = method.nextCr(start);
		end   = method.previousCr(end-2);

		PogoString	block = new PogoString(method.str.substring(start, end));
		block.indent(-2);

		//	Attribute att is now attr
		while (block.str.indexOf("att.")>0)
			block.replace("att.", "attr.");
		return block.str;
	}
//======================================================================
//======================================================================
    void setPyProperties(String code) throws PogoException
    {
        //  Parse for standard attribute properties
        for (int i=0 ; i<properties.length ; i++)
        {
            String  prop_name = "\'" + properties[i].name + "\'";
            int idx;
            if ((idx=code.indexOf(prop_name))>0)
            {
                //  Property found -> parse value
                idx = code.indexOf(":", idx) + 1;
				//	Check if string or not
				int end = idx;
				if (code.substring(idx).startsWith("\""))
					end = code.indexOf("\"", idx+1);

				end = code.indexOf(",", end);
                if (end<0)  //  Last one ?
                    end = code.indexOf("}", idx);
                if (end<0)
                    throw new PogoException("Syntax Error in attr_list (property " + prop_name + ")");
                String  strval = code.substring(idx, end).trim();
                //  Remove cotes if any
                while ((idx=strval.indexOf("\""))>=0)
                {
                    String  first = strval.substring(0, idx);
                    String  second= "";
                    if (idx<strval.length()-2) // NOT last char ?
                        second = strval.substring(idx+1);
                    strval = first + second;
                }
                //System.out.println(name + ":    "+ prop_name + " = " + strval);
                properties[i].value = strval;
            }
        }
        //  Parse for PY special things view as properties !!!!
        String  target = "polling period";
        int idx;
        if ((idx=code.toLowerCase().indexOf(target))>0)
        {
            //  Property found -> parse value
            idx = code.indexOf(":", idx) + 1;
            int end = code.indexOf(",", idx);
            if (end<0)  //  Last one ?
                end = code.indexOf("}", idx);
            if (end<0)
                throw new PogoException("Syntax Error in attr_list (" + target + ")");
            String  strval = code.substring(idx, end).trim();
            try {
                this.polled_period = Integer.parseInt(strval);
            }
            catch (NumberFormatException e){
                throw new PogoException("Syntax Error in attr_list (" + target + " = " + strval + ")");
            }
        }
        target = "memorized";
        if ((idx=code.toLowerCase().indexOf(target))>0)
        {
            //  Property found -> parse value
            idx = code.indexOf(":", idx) + 1;
            int end = code.indexOf(",", idx);
            if (end<0)  //  Last one ?
                end = code.indexOf("}", idx);
            if (end<0)
                throw new PogoException("Syntax Error in attr_list (" + target + ")");
            String  strval = code.substring(idx, end).toLowerCase().trim();
            strval = strval.substring(1, strval.length()-1);    //  Take off quotesthis.memorized      = strval.startsWith("true");
            if (memorized=strval.startsWith("true"))
                memorized_init = !strval.equals(pyAttWithoutHardApplied);
        }
        target = "display level";
        if ((idx=code.toLowerCase().indexOf(target))>0)
        {
            //  Property found -> parse value
            idx = code.indexOf(":", idx) + 1;
            int end = code.indexOf(",", idx);
            if (end<0)  //  Last one ?
                end = code.indexOf("}", idx);
            if (end<0)
                throw new PogoException("Syntax Error in attr_list (" + target + ")");
            String  strval = code.substring(idx, end).trim();
            if (strval.equals("PyTango.DispLevel.EXPERT"))
                disp_level = DispLevel.EXPERT;
            else
                disp_level = DispLevel.OPERATOR;
        }
    }
//======================================================================
//======================================================================
    public boolean[] getFireEvent(int type)
    {
        FireEvent   evt = (type==CHANGE)? change_evt : archive_evt;
        return new boolean[] { evt.by_code, evt.whith_check };
    }
//======================================================================
//======================================================================
    public void setFireEvent(int type, boolean code, boolean checked)
    {
        FireEvent   evt = (type==CHANGE)? change_evt : archive_evt;
        if (evt==null)  evt = new FireEvent();
        evt.by_code     = code;
        if (code)
            evt.whith_check = checked;
        else
            evt.whith_check = false;
    }
//======================================================================
//======================================================================
    private void buildPropertiesArray()
    {
        int i = 0;
        properties = new Property[14];
        properties[i++] = new Property("label", true);
        properties[i++] = new Property("unit", true);
        properties[i++] = new Property("standard unit", false);
        properties[i++] = new Property("display unit", true);
        properties[i++] = new Property("format", true);
        properties[i++] = new Property("max value", false);
        properties[i++] = new Property("min value", false);
        properties[i++] = new Property("max alarm", false);
        properties[i++] = new Property("min alarm", false);
        properties[i++] = new Property("max warning", false);
        properties[i++] = new Property("min warning", false);
        properties[i++] = new Property("delta time", false);
        properties[i++] = new Property("delta val", false);
        properties[i]   = new Property("description", true);
    }
//======================================================================
//======================================================================
    String pyUpdateAllowedStates(String method, String signature)
    {
        return this.notAllowedFor.pyUpdateAllowedStateMethod(method, signature);
    }
//======================================================================
//======================================================================
    String buildPyStateMachineMethod(String template)
    {
        PogoString  code = new PogoString(template);
        //  Replace cmd template by cmd name
        String  target = "TemplAttr";
        while (code.indexOf(target)>0)
            code.replace(target, name);
        return code.str;
    }
//======================================================================
//======================================================================
    String buildPyWriteMethod(String template)
    {
        PogoString  code = new PogoString(template);
        //  Replace cmd template by cmd name
        String  target = "TemplAttr";
        while (code.indexOf(target)>0)
            code.replace(target, name);
        return code.str;
    }
//======================================================================
//======================================================================
    String buildPyReadMethod(String template)
    {
        PogoString  code = new PogoString(template);
        //  Replace cmd template by cmd name
        String  target = "TemplAttr";
        while (code.indexOf(target)>0)
            code.replace(target, name);

        //  get set_value
        target = "attr.set_value(";
        int ins_init = code.indexOf(target);
        int ins_size = ins_init+target.length();
        String  strval = code.substring(ins_size, code.indexOf(")", ins_size));
        ins_size += strval.length();
        ins_init = code.lastIndexOf("\n", ins_init)+1;

        //  build initilising value and set_value
        String  str_init = "\t\t" + strval + " = ";
        String  str_size = "";
        switch (this.attrType)
        {
        case ATTR_SCALAR:
            switch(this.dataType.code)
            {
            case Tango_DEV_FLOAT:
            case Tango_DEV_DOUBLE:
                str_init += "1.0";
                break;
            case Tango_DEV_STRING:
                str_init += "\"Hello Tango world\"";
                break;
            default:
                str_init += "1";
            }
            break;
        case ATTR_SPECTRUM:
            str_size = ", 1";
            switch(this.dataType.code)
            {
            case Tango_DEV_FLOAT:
            case Tango_DEV_DOUBLE:
                str_init += "[1.0]";
                break;
            case Tango_DEV_STRING:
                str_init += "[\"Hello Tango world\"]";
                break;
            default:
                str_init += "[1]";
            }
            break;
        case ATTR_IMAGE:
            str_size = ", 1, 1";
            switch(this.dataType.code)
            {
            case Tango_DEV_FLOAT:
            case Tango_DEV_DOUBLE:
                str_init += "[1.1][2.2]";
                break;
            case Tango_DEV_STRING:
                str_init += "[\"Hello\"] [\"Tango world\"]";
                break;
            default:
                str_init += "[1][2]";
            }
            break;
        }
        str_init += "\n";
        //  And insert
        code.insert(ins_size, str_size);
        code.insert(ins_init, str_init);
        return code.str;
    }
//======================================================================
//======================================================================



//======================================================================
//======================================================================
	String allowedCore()
	{
		return notAllowedFor.allowedCore();
	}
//======================================================================
//======================================================================
	public void setMemorized(boolean val)
	{
		memorized = val;
	}
//======================================================================
//======================================================================
	public boolean getMemorized()
	{
		return memorized;
	}
//======================================================================
//======================================================================
	public void setMemorizedInit(boolean val)
	{
		memorized_init = val;
	}
//======================================================================
//======================================================================
	public boolean getMemorizedInit()
	{
		return memorized_init;
	}
//======================================================================
//======================================================================
	public String getLowerName()
	{
		PogoString	pgs = new PogoString(name);
		return pgs.toLowerString();
	}
//======================================================================
//======================================================================
	public String toString()
	{
		return name;
	}	







    /**
     *	class used to set attribute default properties.
     */
    class Property
    {
        String  name;
        String  method;
        boolean is_str;
        String  value;
        static final String	set_def_prop_method	 = "set_default_properties";

        //-----------------------------------------------
        public Property(String name, boolean is_str)
        {
            this.name   = name;
            this.is_str = is_str;
            this.value  = "";
            //  method is set_name but replace space by '_'
            method = "set_" + name;
            int idx = method.indexOf(' ');
            if (idx>0)
                method = method.substring(0, idx) + "_" +
                            method.substring(idx+1);
			//	Special case for Delta time (selta_t in c++)
			if (method.equals("set_delta_time"))
				method = "set_delta_t";
        }
        //-----------------------------------------------
        public String toString()
        {
            return name;
        }
        //-----------------------------------------------
        public String str_value()
        {
            if (is_str)
                return "\"" + value + "\"";
            else
                return value;
        }
        //-----------------------------------------------
    }


    /**
     * Class defining fired event
     */
    class FireEvent {
        boolean  by_code     = false;
        boolean  whith_check = false;
    }
}
