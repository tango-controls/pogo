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
// Revision 1.12  2009/10/07 12:41:51  pascal_verdier
// IDL 4 added for Python (PyTango-7)
//
// Revision 1.11  2009/02/18 15:02:15  pascal_verdier
// Tango 7 (IDL 4) compatibility implementation.
//
// Revision 1.10  2008/03/13 08:47:27  pascal_verdier
// Default property values added to html pages.
// Bug in property description (use cotes in python) fixed.
//
// Revision 1.9  2007/09/14 14:32:19  pascal_verdier
// Possibility to add own methods in ServerClass class added
//
// Revision 1.8  2007/06/13 08:09:38  pascal_verdier
// Bug on main() method fixed.
//
// Revision 1.7  2007/01/08 07:07:47  pascal_verdier
// always_executed_hook signature modified.
//
// Revision 1.6  2007/01/05 09:47:58  pascal_verdier
// Bug in python init_device method fixed.
//
// Revision 1.5  2006/11/24 14:28:18  pascal_verdier
// Implements first Python gurus remarks.
//
// Revision 1.4  2006/11/07 14:55:57  pascal_verdier
// Change class name add.
//
// Revision 1.3  2006/11/07 12:45:55  pascal_verdier
// Keep header from read code added.
//
// Revision 1.2  2006/11/06 15:40:30  pascal_verdier
// Put property methods in Util class.
//
// Revision 1.1  2006/11/02 11:41:46  pascal_verdier
// Python code generation added.
//
//
// copyleft 1999 by European Synchrotron Radiation Facility, Grenoble, France
//							 All Rights Reversed
//-======================================================================
package pogo.gene;

import fr.esrf.TangoDs.TangoConst;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Vector;


/**
 *	This class generates python source file.
 *
 * @author	$Author$
 * @version	$Revision$
 */
public class PogoGenePython extends PogoGene implements PogoDefs, TangoConst
{
    /**
     * Generated code
     */
    private String  new_code;
    /**
     * Read server code
     */
    private String  read_code = "";

//=======================================================================
/**
 *	Constructor for Pogo Class python files generation.
 *
 *	@param	pogo	Pogo Class definition used for generation.
 */
//=======================================================================
    public PogoGenePython(PogoClass pogo)
    {
        super(pogo);

        //  In python, the method where command will be executed
        //  does NOT respect TANGO convention  !!!!
        for (int i=0 ; i<pogo.commands.size() ; i++)
		{
			Cmd	cmd =  pogo.commands.cmdAt(i);
			if (cmd.name.equals("Status"))
				cmd.exec_method = "dev_status";
			else
			if (cmd.name.equals("State"))
				cmd.exec_method = "dev_state";
			else
				cmd.exec_method = cmd.name;
 		}
    }

//=======================================================================
//=======================================================================
    private void addHeaderTables()
    {
        String  empty_line = "#\n";
        //  Add class description
        String  tables = pvCommentSeparator +
                            pogo.buildPyDescription()+
                            empty_line+
                            pvCommentSeparator;

        //  Add States description
        if (pogo.states.size()>0)
            tables += pogo.states.toStringComments(pyLang) +
                         pvCommentSeparator;

        String  target = "class " + pogo.class_name + "(PyTango.Device_"+pyDeviceImpl+"Impl):";
        int start = new_code.indexOf(target);
        if (start<0)
            return;
        start = new_code.lastIndexOf("\n", start);
        new_code = new_code.substring(0, start) + tables + "\n" + new_code.substring(start);
    }
//=======================================================================
//=======================================================================
    private void addReadAttributeMethods()
                                 throws FileNotFoundException,
                                        SecurityException,
                                        IOException,
                                        PogoException
    {
        //  Read Command template
        String  template = PogoUtil.readFile(pogo.templates_dir + "/python/Attribute.py");
        new_code = pogo.attributes.updatePyAttributes(new_code, read_code, template, pogo.class_name);
    }
//=======================================================================
//=======================================================================
    private void addCommandExecMethods()throws	FileNotFoundException,
                                        SecurityException,
                                        IOException, PogoException
    {
        //  Read Command template
        String  template = PogoUtil.readFile(pogo.templates_dir + "/python/Command.py");
        new_code = pogo.commands.updatePyCommands(new_code, read_code, template, pogo.class_name);
    }
//=======================================================================
//=======================================================================
    static int pyEndMethod(String str)
    {
        return pyEndMethod(str, 0);
    }
//=======================================================================
//=======================================================================
    static int pyEndMethod(String str, int idx)
    {
        for (int i=idx ; i<str.length() ; i++)
        {
            if (str.charAt(i)=='\n')
                if (str.charAt(i+1)!=' ' && str.charAt(i+1)!='\t')
                    return i+1;
        }
        return -1;
    }
//=======================================================================
//=======================================================================
    private void addFactories()throws	SecurityException,
                                        PogoException
    {
        //  Build factories
        String  class_prop_list = pogo.class_properties.buildPyFactory();
        String  dev_prop_list   = pogo.dev_properties.buildPyFactory();
        String  cmd_list        = pogo.commands.buildCommandFactoryMethod(pyLang);
        String  att_list        = pogo.attributes.buildFactory(pyLang);

        //  Chck if Tango device file
        int start = -1;
		for (int i=0 ; start<0 && i<PogoUtil.py_target.length ; i++)
			start = new_code.indexOf(PogoUtil.py_target[i]);
        if (start<0)
            throw new PogoException("Template Syntax error on DeviceClass definition");

        //  Insert them
        String  target;
        target = "class_property_list = {";
        start = new_code.indexOf(target, start);
        start = new_code.indexOf("\n", start) + 1;
        new_code = new_code.substring(0, start) + class_prop_list + new_code.substring(start);

        target = "device_property_list = {";
        start = new_code.indexOf(target, start);
        start = new_code.indexOf("\n", start) + 1;
        new_code = new_code.substring(0, start) + dev_prop_list + new_code.substring(start);

        target = "cmd_list = {";
        start = new_code.indexOf(target, start);
        start = new_code.indexOf("\n", start) + 1;
        new_code = new_code.substring(0, start) + cmd_list + new_code.substring(start);

        target = "attr_list = {";
        start = new_code.indexOf(target, start);
        start = new_code.indexOf("\n", start) + 1;
        new_code = new_code.substring(0, start) + att_list + new_code.substring(start);
    }
//=======================================================================
//=======================================================================
    private Vector getGeneratedMethods()
    {
        Vector    v = new Vector();
        v.add("def init_device(self):");

        //  Built command method signatures
        for (int i=0 ; i<pogo.commands.size() ; i++)
        {
            Cmd cmd = pogo.commands.cmdAt(i);
            if (!cmd.virtual_method || cmd.override_method!=NOT_OVERRIDE)
            {
                v.add(cmd.buildPyExecCmdMethodSignature());
                if (!cmd.virtual_method)
                    v.add("def is_" + cmd.name+ "_allowed(self):");
            }
        }
        //  Built attribute method signatures
        for (int i=0 ; i<pogo.attributes.size() ; i++)
        {
            Attrib attr = pogo.attributes.attributeAt(i);
            v.add("def read_" + attr.name + "(self, attr):");
            if (attr.rwType==ATTR_WRITE  || attr.rwType==ATTR_READ_WRITE )
                v.add("def write_" + attr.name + "(self, attr):");
            v.add("def is_" + attr.name+ "_allowed(self, req_type):");
        }
        return v;
    }
//=======================================================================
//=======================================================================
    private Vector getOtherMethods(String[] existing_methods, Vector generated_methods)
    {
        //  Compare the 2 vectors to know the other ones
        Vector  methods = new Vector();
		for (String existing_method : existing_methods)
		{
			boolean found = false;
			for (int j = 0; !found && j < generated_methods.size(); j++)
			{
				String s = (String) generated_methods.get(j);
				found = existing_method.startsWith(s);
			}
			if (!found)
				methods.add(existing_method);
		}
         return methods;
    }
//=======================================================================
    /**
     *	This method manage methods not generated by pogo in ServerClass class.
     * It compare the generated method list and the existing method list.
     * Then it copy the methods found in read code to (generated) code.
     */
//=======================================================================
    private void updateClassOtherMethods()
    {
        //  Get device class methods
        if (read_code.equals(""))
            return; //  No method already exist

        int start = read_code.indexOf("class " + pogo.class_name + "(");
            start = read_code.indexOf("class " + pogo.class_name + "Class(", start);
        int end   = read_code.indexOf("if __name__ == '__main__':", start);

        //  Compare the 2 vectors to know the other ones
        String[]  existing_methods = PogoUtil.getPyMethodList(read_code.substring(start, end));
        Vector  generated_methods = new Vector();
        generated_methods.add("def __init__(self, name):");
        Vector  meth_sig = getOtherMethods(existing_methods, generated_methods);

        //  And insert each one
		for (Object aMeth_sig : meth_sig)
		{
			//  get the method core
			String method = PogoUtil.pythonMethod(read_code, (String) aMeth_sig);
			//  Get insert position
			int insert_idx = new_code.indexOf("def __init__(self, name):", start);
			insert_idx = PogoUtil.endOfPythonMethod(new_code, insert_idx);
			new_code = new_code.substring(0, insert_idx) + "\n\n" + method + "\n" +
					new_code.substring(insert_idx);
		}
    }
//=======================================================================
/**
 *	This method manage methods not generated by pogo in Servr class.
 * It compare the generated method list and the existing method list.
 * Then it copy the methods found in read code to (generated) code.
 */
//=======================================================================
    private void updateOtherMethods()
    {
        //  Get device methods
        if (read_code.equals(""))
            return; //  No method already exist
        int start = read_code.indexOf("class " + pogo.class_name + "(");
        int end   = read_code.indexOf("class " + pogo.class_name + "Class(", start);
        String[]  existing_methods = PogoUtil.getPyMethodList(read_code.substring(start, end));
        Vector    generated_methods = getGeneratedMethods();

        //  Compare the 2 vectors to know the other ones
        Vector  meth_sig = getOtherMethods(existing_methods, generated_methods);

        //  Get effective methods form read code.
        for (int i=meth_sig.size()-1 ; i>=0 ; i--)
        {
            String  method = PogoUtil.pythonMethod(read_code, (String)meth_sig.get(i));

            //  Check if it exists in new code.
            String  dummy_method = PogoUtil.pythonMethod(new_code, (String)meth_sig.get(i));
            if (dummy_method!=null)
            {
                start = new_code.indexOf(dummy_method);
                end   = start + dummy_method.length();
                new_code = new_code.substring(0, start) + method +
                           new_code.substring(end);
            }
            else
            {
               //  get place to insert new methods if any
                int     insert_idx = new_code.indexOf("def always_executed_hook(self):");
                if (insert_idx<0)
					insert_idx = new_code.indexOf("def always_excuted_hook(self):");
                if (insert_idx<0)
                    insert_idx = new_code.length()-1;
                else
                    insert_idx = PogoUtil.endOfPythonMethod(new_code, insert_idx);
				//	if not starting with comment adda tab
				if (method.startsWith("def "))
					method = '\t'+ method;
				new_code = new_code.substring(0, insert_idx) + "\n\n" + method + "\n"+
                           new_code.substring(insert_idx);
				//System.out.println(new_code);
			}
        }
    }

	//=======================================================================
	/**
	 *  Replace main method by the read one if exists.
	 */
	//=======================================================================
    private void checkMainMethod()
    {
        if (read_code.equals(""))
            return;

		//	Get the new and old methods
		String	meth_sig = "if __name__ == '__main__':";
		String	read_method = PogoUtil.pythonMethod(read_code, meth_sig)+"\n";

        //	And replace the new (generated) by old (read) one
		if (read_method!=null)
        	if (!read_method.equals(""))
			{
				int	idx = new_code.indexOf(meth_sig);
				new_code = new_code.substring(0, idx) + read_method;
			}
	}
	//=======================================================================
	/**
	 *  Copy header from read code  to  new code.
	 */
	//=======================================================================
    private void addHeader()
    {
        if (read_code.equals(""))
            return;

        //  Replace header from template by the read one
        int end = read_code.indexOf(pogo.class_name + " Class Description:");
        if (end<0)
            return;
        int idx = end;
        end = read_code.lastIndexOf("#==============", end);
        if (end<0)
        {
            end = read_code.lastIndexOf('\n', idx-1);
            end = read_code.lastIndexOf('\n', end-1);
        }
        String  read_header = read_code.substring(0, end);

        end = new_code.indexOf("class " + pogo.class_name + "(");
        if (end<0)
            return;
        end = new_code.lastIndexOf('\n', end);
        end = new_code.lastIndexOf('\n', end);
        String  templ_header = new_code.substring(0, end);
        PogoString  pgs = new PogoString(new_code);
        pgs.replace(templ_header, read_header);

        //  Replace global variales declaration
        int start = read_code.indexOf("Add you global variables here");
        if (start<0)
        {
            new_code = pgs.str;
            return;
        }
        start = read_code.lastIndexOf('\n', start);
        end   = read_code.indexOf("Device constructor", start);
        end   = read_code.lastIndexOf('\n', end);
        String  read_declaration = read_code.substring(start, end);

        start = pgs.str.indexOf("Add you global variables here");
        if (start<0)
        {
            new_code = pgs.str;
            return;
        }
        start = pgs.str.lastIndexOf('\n', start);
        end   = pgs.str.indexOf("Device constructor", start);
        end   = pgs.str.lastIndexOf('\n', end);
        String  templ_declaration = pgs.str.substring(start, end);
        pgs.replace(templ_declaration, read_declaration);

        new_code = pgs.str;
    }
//=======================================================================
//=======================================================================
    private void manageInit()
    {
        //  If no read code, nothing to do.
        if (read_code.equals(""))
            return;
        String  old_method = PogoUtil.pythonMethod(read_code, "def init_device(self):");
        String  new_method = PogoUtil.pythonMethod(new_code, "def init_device(self):");

        //  Replace the new method by the old (implemented) one.
        PogoString  pgs = new PogoString(new_code);
        pgs.replace(new_method, old_method);
        new_code = pgs.str;
    }
//=======================================================================
/**
 *	Generate python source for tango device Server
 *	from Pogo Class definition
 *
 *	@throws FileNotFoundException
 *	@throws SecurityException
 *	@throws IOException
 *	@throws	PogoException	If a synthax error occured on input file
 */
//=======================================================================
    public void generate() throws FileNotFoundException,
                                  SecurityException,
                                  IOException,
                                  PogoException
    {
        String	server        = pogo.projectFiles.getPath() + "/" + pogo.class_name + ".py";

        strTrace = "python source code generation:\n\n";

 		//	Device ID file
		if (writeDeviceIdFile())
            strTrace += DeviceID.getFilename(server) + "     Created\n";

       //	Read existing file if any to modified
        if (new File(server).exists())
            read_code = new PogoString(PogoUtil.readFile(server)).str;

        //	Read template to enerate server
        new_code = PogoUtil.removeLogMessages(new PogoString(
                            PogoUtil.readFile(pogo.templates_dir + "/python/DevServ.py",
                            templateClass, pogo.class_name))).str;

        addHeader();
        manageInit();
        addFactories();
        addCommandExecMethods();
        addReadAttributeMethods();
        addHeaderTables();
        updateOtherMethods();
		updateClassOtherMethods();
		checkMainMethod();
		
		updateDeviceImpl();

        String  save = System.getProperty("SAVE");
        if (save==null  || save.equals("true"))
            PogoUtil.writeFile(server, new_code);
		//else
		//	System.out.println(new_code);

		strTrace += server + "   generated.";

    }
	//=======================================================================
	/**
	 *	Replace with last version of IDL even in protected area
	 */
	//=======================================================================
	private void updateDeviceImpl()
	{
		String	new_str = "Device_" +  pyDeviceImpl    + "Impl";
		String	old_str = "Device_" + (pyDeviceImpl-1) + "Impl";
		int	 start;
		while ((start=new_code.indexOf(old_str))>0)
			new_code = new_code.substring(0, start) + new_str + 
						new_code.substring(start + old_str.length());
		//	From 3Impl to 4Impl replace pyUtil to Util
		new_str = "Util";
		old_str = "PyUtil";
		while ((start=new_code.indexOf(old_str))>0)
			new_code = new_code.substring(0, start) + new_str + 
						new_code.substring(start + old_str.length());

		//	From 3Impl to 4Impl replace pyDeviceClass to DeviceClass
		new_str = "DeviceClass";
		old_str = "pyDeviceClass";
		while ((start=new_code.indexOf(old_str))>0)
			new_code = new_code.substring(0, start) + new_str + 
						new_code.substring(start + old_str.length());
	}
	//=======================================================================
	//=======================================================================
    public void changeClassName() throws FileNotFoundException,
                                        SecurityException,
                                        IOException,
                                        PogoException
    {
        String  old_classname = pogo.projectFiles.getOriginalClassName();
        String	old_server    = pogo.projectFiles.getPath() + "/" + old_classname + ".py";
        PogoString  code = new PogoString(PogoUtil.readFile(old_server));
        int idx = 0;
        while ((idx=code.indexOf(old_classname, idx))>0)
        {
            code.replace(idx, old_classname, pogo.class_name);
            idx++;
        }

        String	new_server       = pogo.projectFiles.getPath() + "/" + pogo.class_name + ".py";
        PogoUtil.writeFile(new_server, code.str);
    }

//=======================================================================
//=======================================================================

}
//-----------------------------------------------------------------------------
/* end of $Source$ */
