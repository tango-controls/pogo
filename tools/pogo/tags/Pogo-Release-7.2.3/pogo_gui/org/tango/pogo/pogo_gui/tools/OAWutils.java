//+======================================================================
//
// Project:   Tango
//
// Description:  java source code to manage OAW utilities.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011
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
// $Revision: $
// $Date:  $
//
// $HeadURL: $
//
//-======================================================================

package org.tango.pogo.pogo_gui.tools;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.StringTokenizer;

import fr.esrf.tango.pogo.pogoDsl.*;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;

import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;
import fr.esrf.TangoDs.TangoConst;
import org.tango.pogo.pogo_gui.PropertyDialog;


public class OAWutils
{
	private static OAWutils	instance = null;
	//========================================================================
	private OAWutils()
	{
		System.setProperty("file.encoding", "ISO-8859-1");
	}
	//========================================================================
	public static OAWutils getInstance()
	{
		if (instance==null)
			instance = new OAWutils();
		return instance;
	}
	//========================================================================

	private static final String	backend =
			"fr/esrf/tango/pogo/backend.mwe";

    //  Do not remove, it seems to more than a simple assignment
    @SuppressWarnings({"UnusedDeclaration"})
    public static PogoDslPackage dp      = PogoDslPackage.eINSTANCE;
	public static PogoDslFactory factory = PogoDslFactory.eINSTANCE;

	//========================================================================
	/**
	 * Read the xmi file and returns the PogoDeviceClass model found.
	 * @param  xmiFile   xmi file name.
	 * @return the model loaded form xmi file.
	 * @throws DevFailed in case of I/O error or bad xmi file.
	 */
	//========================================================================
    public PogoMultiClasses loadMultiClassesModel(String xmiFile) throws DevFailed
	{
        //  Before everything, update xmi file for compatibility.
        //ParserTool.removeXmiKey("", xmiFile);

        //  OK, Now can be loaded
        Object  pogoObj = loadTheModel(xmiFile);
        if (! (pogoObj instanceof PogoMultiClasses))
            Except.throw_exception("BAD_FILE",
                    "This is not a Pogo Multi Classes file !",
                    "OAWutils.loadModel()");
        PogoMultiClasses    pmc = (PogoMultiClasses)pogoObj;
        reverseClassOrder(pmc);
        return pmc;
    }
	//========================================================================
	/**
	 * Read the xmi file and returns the PogoDeviceClass model found.
	 * @param  xmiFile   xmi file name.
	 * @return the model loaded form xmi file.
	 * @throws DevFailed in case of I/O error or bad xmi file.
	 */
	//========================================================================
    public PogoDeviceClass loadDeviceClassModel(String xmiFile) throws DevFailed
	{
        //  Before everything, update xmi file for compatibility.
        ParserTool.removeXmiKey("htmlInheritance", xmiFile);
        //ParserTool.renameXmiKey("Key1", "Key2", xmiFile);

        //  OK, Now can be loaded
        Object  pogoObj = loadTheModel(xmiFile);
        if (! (pogoObj instanceof PogoDeviceClass))
            Except.throw_exception("BAD_FILE",
                    "This is not a Pogo Device Class file !",
                    "OAWutils.loadModel()");
        return (PogoDeviceClass) pogoObj;
    }
	//========================================================================
	/**
	 * Read the xmi file and returns the PogoDeviceClass model found.
	 * @param xmi	xmi file name.
	 * @return the model loaded form xmi file.
	 * @throws DevFailed in case of I/O error or bad xmi file.
	 */
	//========================================================================
    private Object loadTheModel(String xmi) throws DevFailed
	{
		System.out.println("Loading "+xmi);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		final URI fileURI = URI.createFileURI(new File(xmi).getAbsolutePath());
		final Resource resource = new ResourceSetImpl().createResource(fileURI);
		try {
			resource.load(null);
		}
		catch (final IOException e) {
            //e.printStackTrace();
			Except.throw_exception("IOException",
					e.toString(), "DeviceClass.loadModel()");
		}

		PogoSystem	sys = (PogoSystem)resource.getContents().get(0);
        if (sys.getMultiClasses().size()>0)
            return sys.getMultiClasses().get(0);    //  A multi classes project
        else
            return sys.getClasses().get(0);         //  A single device classes project
	}
	//========================================================================
	/**
	 * Generate xmi file for PogoDeviceClass object and code associeted.
	 * @param pogo_class	The model
	 * @throws DevFailed in caseof I/O error
	 */
	//========================================================================
	@SuppressWarnings({"unchecked"})
    public void generate(PogoDeviceClass pogo_class) throws DevFailed
	{
        PogoSystem  sys = buildPogoSystem(pogo_class);
        String      prExcludes = Utils.getExcludeFilesAndDir(pogo_class.getDescription().getSourcePath());
        //System.out.println("\n-----------------------------------------------------------------");
        //System.out.println("Excluded : "+prExcludes);
        //System.out.println("-----------------------------------------------------------------\\n");

        //	Generate XMI file if requested.
		if (pogo_class.getDescription().getFilestogenerate().toLowerCase().indexOf("xmi")>=0) {
			String	xmi_file = pogo_class.getDescription().getSourcePath() + "/" +
										pogo_class.getName() + ".xmi";
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			URI fileURI = URI.createFileURI(new File(xmi_file).getAbsolutePath());
			Resource resource = resourceSet.createResource(fileURI);
			resource.getContents().add(sys);
			try {
				resource.save(Collections.EMPTY_MAP);
				System.out.println(xmi_file + " generated");
			}
			catch (IOException e) {
				Except.throw_exception("IOException",
						e.toString(), "DeviceClass.generate()");
			}
		}
		//	Start the code generation
		Map params = new HashMap();
		params.put("targetDir",      pogo_class.getDescription().getSourcePath());
		params.put("targetLanguage", pogo_class.getDescription().getLanguage());
        params.put("theModel",       sys);
        params.put("prExcludes",     prExcludes);

		runWorkflow(params);
	}
	//========================================================================
	/**
	 * Generate xmi file for PogoDeviceClass object and code associeted.
	 * @param multiClasses	The multi classes project
	 * @throws DevFailed in caseof I/O error
	 */
	//========================================================================
	@SuppressWarnings({"unchecked"})
    public void generate(PogoMultiClasses multiClasses) throws DevFailed
	{
        PogoSystem  sys = factory.createPogoSystem();
        String      prExcludes = Utils.getExcludeFilesAndDir(multiClasses.getSourcePath());

        reverseClassOrder(multiClasses);
        sys.getMultiClasses().add(multiClasses);

		//	Generate XMI file if requested.
        String	xmi_file = multiClasses.getSourcePath()+"/"+multiClasses.getName()+".multi.xmi";
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
        URI fileURI = URI.createFileURI(new File(xmi_file).getAbsolutePath());
        Resource resource = resourceSet.createResource(fileURI);
        resource.getContents().add(sys);
        try {
            resource.save(Collections.EMPTY_MAP);
            System.out.println(xmi_file + " generated");
        }
        catch (IOException e) {
            Except.throw_exception("IOException",
                    e.toString(), "DeviceClass.generate()");
        }

		//	Start the code generation
		Map params = new HashMap();
		params.put("targetDir",      multiClasses.getSourcePath());
		params.put("targetLanguage", "MultiCpp");
		params.put("theModel",       sys);
        params.put("prExcludes",     prExcludes);

		runWorkflow(params);
	}
	//========================================================================
	//========================================================================
	private String buildSubDirMessage(String strerror)
	{
		StringTokenizer	st = new StringTokenizer(strerror);
		Vector<String>	v = new Vector<String>();
		while (st.hasMoreTokens())
			v.add(st.nextToken());
		if (v.size()==11)
		{
			return  "XPand cannot generate code !\n" +
					"Duplicate file Problem:\n\n" +
					"Same tag      ----- PROTECTED REGION ID(" + v.get(1) + ") -----\n" +
					"       has been found in:\n" +
					v.get(5) + "\n" +
					"       and\n" + v.get(7) + "\n\n"+
					"Hint: (re)move any duplicate file(s).";
		}
		else
			return "Sub-directory Problem:";
	}
	//========================================================================
	//========================================================================
	private void runWorkflow(Map params) throws DevFailed
	{
		WorkflowRunner runner  = new WorkflowRunner();
		@SuppressWarnings({"unchecked"})
        final boolean configOK = runner.prepare(backend, null, params);
		if (configOK)
		{
			final Issues issues = new IssuesImpl();
			runner.executeWorkflow(params, issues);

			if (issues.hasWarnings())
			{
                //  Get the last one (it is a Stack)
                MWEDiagnostic[]	warn = issues.getWarnings();
                int lastIdx = warn.length-1;
                System.err.println("----------> Message: " + warn[lastIdx].getMessage());
                System.err.println("----------> Element: " + warn[lastIdx].getElement());
            }
            if (issues.hasErrors())
            {
                //  Get the last one (it is a Stack)
                MWEDiagnostic[] errors = issues.getErrors();
                int lastIdx = errors.length-1;
				String message = errors[lastIdx].getMessage().trim();
				
				if (message.endsWith("is not unique"))
                	message = buildSubDirMessage(message);

               Except.throw_exception("Running WorkFlow Error",
                        message,
						"DeviceClass.runWorkFlow() -> " + errors[lastIdx].getElement());
            }
		}
	}
	//========================================================================
	/**
	 *	Do a pre-processing for additional info (eg: coments, tables,....
     * @param pogo_class    Specified PogoDeviceClass object
     * @throws DevFailed in case of changing prtected area ID dailed. 
     */
	//========================================================================
	private void doPreProcessing(PogoDeviceClass pogo_class) throws DevFailed
	{
		//	Set the institute field (could have changed)
		String	institute = System.getenv("INSTITUTE");
		if (institute==null)
			institute = System.getProperty("INSTITUTE");
		if (institute!=null)
			pogo_class.setInstitute(institute.toUpperCase());
		
        //  Set the default environment.
        Preferences   pref = OAWutils.factory.createPreferences();
        pref.setMakefileHome(PogoProperty.makefileHome);
        pref.setDocHome(PogoProperty.docHome);
        pogo_class.setPreferences(pref);

        //  If from classes2www, give info to xpand
        //  to add link on version.html file. 
        String  env=System.getenv("Classes2www");
        if (env!=null)
           if (env.equals("true"))
              pref.setHtmlVersion("true");

		//	Update the additional comments
		Comments	comments = OAWutils.factory.createComments();
		comments.setCommandsTable(buildCommandsTable(pogo_class));
		pogo_class.getDescription().setComments(comments);

        //  Change protected Area ID if have been change.
        if (pogo_class.getDescription().getFilestogenerate().toLowerCase().indexOf("code")>0) {

            if (pogo_class.getDescription().getLanguage().toLowerCase().equals("cpp")) {
                //  ClassFactory ID has been modified to take in account class name
                ParserTool.modifyProtectedAreaID(pogo_class.getDescription().getSourcePath(),
                        "ClassFactory.cpp",
                        "ClassFactory.cpp", pogo_class.getName()+"::ClassFactory.cpp");
            }
        }

        //  If doc is generated, check if old pogo Description.html file exists
        if (pogo_class.getDescription().getFilestogenerate().indexOf("html")>=0) {
            String filename = pogo_class.getDescription().getSourcePath() + "/" +
                    pogo_class.getPreferences().getDocHome() + "/Description.html";
            if (new File(filename).exists())
                pogo_class.getDescription().setDescriptionHtmlExists("true");
            else
                pogo_class.getDescription().setDescriptionHtmlExists("false");
        }
	}
	//========================================================================
	//========================================================================
	public static Command[] createStateStatusCommand()
	{
		Command[]	commands = new Command[2];
		String		name;
		String		desc;
		String		argout_str;
		String		argout_desc;
		for (int i=0 ; i<2 ; i++) {
			if (i==0) {
				//	Create State
				name = "State";
				desc = "This command gets the device state (stored in its device_state data member) and returns it to the caller.";
				argout_str   = "State";
				argout_desc = "Device state";
			}
			else {
				//	Create Status
				name = "Status";
				desc = "This command gets the device status (stored in its device_status data member) and returns it to the caller.";
				argout_str   = "ConstDevString";
				argout_desc = "Device status";
			}

			Command	cmd = factory.createCommand();
			cmd.setName(name);
			cmd.setExecMethod(Utils.buildExcecMethodName(name));
			cmd.setDescription(desc);

			//	Argin/argout management
			Argument	argin  = factory.createArgument();
			Argument	argout = factory.createArgument();
			Type	arginType  = tango2pogoType("DevVoid");
			Type	argoutType = tango2pogoType(argout_str);
			argin.setType(arginType);
			argout.setType(argoutType);

			argin.setDescription("none");
			argout.setDescription(argout_desc);
			cmd.setArgin(argin);
			cmd.setArgout(argout);
			InheritanceStatus	status = OAWutils.factory.createInheritanceStatus();
			status.setAbstract("true");
			status.setInherited("true");
			status.setConcrete("true");
			cmd.setStatus(status);
			commands[i] = cmd;
		}
		return commands;
	}
	//========================================================================
	//========================================================================



	//========================================================================
	/**
	 * Create a new pogo type.
	 * @param type	original specified type.
	 * @return the pogo.Type created as specified type
	 */
	//========================================================================
	public static Type createType(Type type)
	{
		return tango2pogoType(pogo2tangoType(type.toString()));
	}
	//========================================================================
	/**
	 * Convert a Tango type as String to a pogo.Type object
	 * @param tangoType	the tango type.
	 * @return the pogo.Type for specified tango type
	 */
	//========================================================================
	public static Type tango2pogoType(String tangoType)
	{
		//	Old cpp case
		if (tangoType.startsWith("Tango::"))
			tangoType = tangoType.substring("Tango::".length());
		if (tangoType.equals("void"))
			tangoType = "DevVoid";

		if (tangoType.equals("DevVoid"))
				return factory.createVoidType();
		if (tangoType.equals("DevBoolean"))
				return factory.createBooleanType();
		if (tangoType.equals("DevShort"))
				return factory.createShortType();
		if (tangoType.equals("DevLong"))
				return factory.createIntType();
		if (tangoType.equals("DevFloat"))
				return factory.createFloatType();
		if (tangoType.equals("DevDouble"))
				return factory.createDoubleType();
		if (tangoType.equals("DevUShort"))
				return factory.createUShortType();
		if (tangoType.equals("DevULong"))
				return factory.createUIntType();
		if (tangoType.equals("DevString"))
				return factory.createStringType();
		if (tangoType.equals("DevVarCharArray"))
				return factory.createCharArrayType();
		if (tangoType.equals("DevVarShortArray"))
				return factory.createShortArrayType();
		if (tangoType.equals("DevVarLongArray") ||
            tangoType.equals("DevVarIntArray"))
				return factory.createIntArrayType();
		if (tangoType.equals("DevVarFloatArray"))
				return factory.createFloatArrayType();
		if (tangoType.equals("DevVarDoubleArray"))
				return factory.createDoubleArrayType();
		if (tangoType.equals("DevVarUShortArray"))
				return factory.createUShortArrayType();
		if (tangoType.equals("DevVarULongArray") ||
			tangoType.equals("DevVarUIntArray"))
				return factory.createUIntArrayType();
		if (tangoType.equals("DevVarStringArray"))
				return factory.createStringArrayType();
		if (tangoType.equals("DevVarLongStringArray"))
				return factory.createLongStringArrayType();
		if (tangoType.equals("DevVarDoubleStringArray"))
				return factory.createDoubleStringArrayType();
		if (tangoType.equals("DevState") ||
			tangoType.equals("State"))
				return factory.createStateType();
		if (tangoType.equals("ConstDevString"))
				return factory.createConstStringType();
		if (tangoType.equals("DevVarBooleanArray"))
				return factory.createBooleanArrayType();
		if (tangoType.equals("DevUChar"))
				return factory.createUCharType();
		if (tangoType.equals("DevLong64"))
				return factory.createLongType();
		if (tangoType.equals("DevULong64"))
				return factory.createULongType();
		if (tangoType.equals("DevVarLong64Array"))
				return factory.createLongArrayType();
		if (tangoType.equals("DevVarULong64Array"))
				return factory.createULongArrayType();
		if (tangoType.equals("DevInt"))
				return factory.createIntType();
		if (tangoType.equals("DevEncoded"))
				return factory.createEncodedType();
		System.out.println(tangoType + " NOT FOUND !!!");
		return null;
	}
	//========================================================================
	/**
	 * Convert a pogo.Type object as String to a tango type as String
	 * @param strPogoType	the pogo type.
	 * @return the tango type for specified pogo type
	 */
	//========================================================================
	public static String pogo2tangoType(String strPogoType)
	{
		String	header   = "fr.esrf.tango.pogo.pogoDsl.impl.";
		String	footer   = "TypeImpl";
		if (strPogoType.startsWith(header))
		{
			String	tangoType = strPogoType.substring(header.length());
			int		pos =tangoType.indexOf(footer);
			if (pos>0)
				tangoType = tangoType.substring(0, pos);
			if  (tangoType.indexOf("Array")>0){
                //System.out.println(tangoType);
                if (tangoType.indexOf("ULong")>=0)    //  Int is Long
    				return "DevVarULong64Array";
                else
                if (tangoType.indexOf("Long")>=0)    //  Int is Long
    				return "DevVarLong64Array";
                else
                if (tangoType.indexOf("UInt")>=0)    //  Int is Long
    				return "DevVarULongArray";
                else
                if (tangoType.indexOf("Int")>=0)    //  Int is Long
    				return "DevVarLongArray";
                else
	    			return "DevVar" + tangoType;
            }
			else
			{
				if (tangoType.startsWith("Const"))
					return TangoConst.Tango_CmdArgTypeName[TangoConst.Tango_CONST_DEV_STRING];
				if (tangoType.equals("State"))
					return tangoType;
				else
				if (tangoType.equals("Long"))    //  Int is a DevLong
					return "DevLong64";
				else
				if (tangoType.equals("ULong"))    //  UInt is a DevULong
					return "DevULong64";
				else
				if (tangoType.equals("Int"))    //  Int is a DevLong
					return "DevLong";
				else
				if (tangoType.equals("UInt"))    //  UInt is a DevULong
					return "DevULong";
				else
					return "Dev" + tangoType;
			}
		}
		return "Not a Pogo Type";
	}
	//========================================================================
	/**
	 * Build a String as a to show in html the inheritance diagram
	 * @param pogo_class Specified PogoDeviceClass object.
     * @return the string built
	 */
	//========================================================================
    /*   NOT Used any more
     *
	private static String buildHtmlInheritance(PogoDeviceClass pogo_class)
	{
        //  If no inheritance -> return empty string.
        EList<Inheritance>    inheritances = pogo_class.getDescription().getInheritances();
        if (inheritances==null ||
            inheritances.size()==0 ||
            DeviceClass.isDefaultInheritance(inheritances.get(0)))
                return "";

        //  get classes in inverse order
        // Higher is before last (last isdeviceImpl)
        StringBuffer    sb = new StringBuffer();
        for (int i=inheritances.size()-2 ; i>=0 ; i--)
        {
            sb.append("         <ul><li> ");
            sb.append(inheritances.get(i).getClassname());
            sb.append("</li>\n");
        }
        //  Add this class
        sb.append("         <ul><li>").append(pogo_class.getName()).append("</l>");

        //  Cloas the tabs
        sb.append("         </ul>");
        for (int i=inheritances.size()-2 ; i>=0 ; i--)
            sb.append("</ul>");
        return sb.toString();
    }
    */
	//========================================================================
	/**
	 * Build a String as a to give the correspondence
	 * between command and method names.
	 * @param pogo_class Specified PogoDeviceClass object.
     * @return the string built
	 */
	//========================================================================
	private static String buildCommandsTable(PogoDeviceClass pogo_class)
	{
		EList<Command>	commands = pogo_class.getCommands();
		StringBuffer	sb = new StringBuffer();
		String			cmd_name = "Command name";
		int	max_len = cmd_name.length();
		for (Command cmd : commands)
			if (cmd.getName().length()>max_len)
				max_len = cmd.getName().length();

		max_len += 2;
		int	nb = max_len - cmd_name.length();
		sb.append("//================================================================\n");
		sb.append("//\n");
		sb.append("//  The following table gives the correspondence\n");
		sb.append("//  between command and method names.\n");
		sb.append("//\n");
		sb.append("//  ").append(cmd_name).append(Utils.spaceTabulation(nb)).append("|  Method name\n");
		sb.append("//----------------------------------------------------------------\n");

		for (Command cmd : commands)
		{
			nb = max_len - cmd.getName().length();
			sb.append("//  ").append(cmd.getName()).append(Utils.spaceTabulation(nb));
			sb.append('|').append("  ");
			InheritanceStatus	status = cmd.getStatus();
			if (! Utils.isTrue(status.getConcreteHere()))
				sb.append("Inherited (no method)\n");
			else
				sb.append(cmd.getExecMethod()).append('\n');
		}
		sb.append("//================================================================");
		return sb.toString();
	}
    //========================================================================
    //========================================================================
    private PogoSystem buildPogoSystem(PogoDeviceClass pogoClass) throws DevFailed
    {
        PogoSystem sys = factory.createPogoSystem();

        //	pre-process the class for additional info
        doPreProcessing(pogoClass);

        sys.getClasses().add(pogoClass);
        return sys;
    }
    //===============================================================
    /**
     * The classes must be returned between display and code generation,
     * because it is displayed low level class at bottom and in class factory,
     * The low level class must be created in first.
     * @param pmc The object where tyhe classes must be reversed.
     */
    //===============================================================
    private void reverseClassOrder(PogoMultiClasses pmc)
    {
        EList<OneClassSimpleDef>    classes = pmc.getClasses();
        Vector<OneClassSimpleDef>   v = new Vector<OneClassSimpleDef>();
        //  copy list to vector in reverse order
        for (OneClassSimpleDef _class : classes)
            v.insertElementAt(_class, 0);
        classes.clear();
        //  Copy vector to list
        for (OneClassSimpleDef _class : v)
            classes.add(_class);
    }
    //========================================================================
    //========================================================================







    //========================================================================
    /**
     * clone a class identification object
     * @param id	the  Argument to be cloned.
     * @return a clone of specified  object.
     */
    //========================================================================
    public static ClassIdentification cloneClassIdentification(ClassIdentification id)
    {
        ClassIdentification new_id = factory.createClassIdentification();
        new_id.setBus(id.getBus());
        new_id.setClassFamily(id.getClassFamily());
        new_id.setContact(id.getContact());
        new_id.setAuthor(id.getAuthor());
        new_id.setEmailDomain(id.getEmailDomain());
        new_id.setManufacturer(id.getManufacturer());
        new_id.setPlatform(id.getPlatform());
        new_id.setReference(id.getReference());
        new_id.setSiteSpecific(id.getSiteSpecific());

        return new_id;
    }
    //========================================================================
    /**
     * clone an Argument object
     * @param src	the  Argument to be cloned.
     * @return a clone of specified  Argument object.
     */
    //========================================================================
    public static Type cloneType(Type src)
    {
        String  strType =  pogo2tangoType(src.toString());
        return tango2pogoType(strType);
    }
    //========================================================================
    /**
     * clone an Argument object
     * @param src	the  Argument to be cloned.
     * @return a clone of specified  Argument object.
     */
    //========================================================================
    public static PropType cloneType(PropType src)
    {
        String  strType =  PropertyDialog.pogo2tangoType(src);
        return PropertyDialog.tango2pogoType(strType);

    }
    //========================================================================
    /**
     * clone an Argument object
     * @param src	the  Argument to be cloned.
     * @return a clone of specified  Argument object.
     */
    //========================================================================
    public static Argument cloneArgument(Argument src)
    {
        Argument    arg = factory.createArgument();
        arg.setType(cloneType(src.getType()));
        arg.setDescription(src.getDescription());
        return arg;
    }
	//===============================================================
	//===============================================================
	public static Command cloneCommand(Command src)
	{
		Command	cmd = factory.createCommand();
		String	name = src.getName();
		cmd.setName(name);
	    cmd.setExecMethod(Utils.buildExcecMethodName(name));
	    cmd.setDescription(src.getDescription());

		//	Argin/argout management
		Argument	argin  = cloneArgument(src.getArgin());
	    Argument	argout = cloneArgument(src.getArgout());
	    cmd.setArgin(argin);
	    cmd.setArgout(argout);

        if (src.getDisplayLevel() == null)
		    cmd.setDisplayLevel("OPERATOR");
        else
		    cmd.setDisplayLevel(src.getDisplayLevel());

        //	Inheritance status
        InheritanceStatus   status = factory.createInheritanceStatus();
        InheritanceStatus   src_st = src.getStatus();
        status .setAbstract(src_st.getAbstract());
        status .setInherited(src_st.getInherited());
        status .setConcrete(src_st.getConcrete());
        status .setConcreteHere(src_st.getConcreteHere());
        cmd.setStatus(status);

        EList<String>   src_excluded = src.getExcludedStates();
        EList<String>   new_excuded  = cmd.getExcludedStates();
        for (String s : src_excluded)
            new_excuded.add(s);

		cmd.setPolledPeriod(src.getPolledPeriod());
		return cmd;
	}
    //======================================================
    //======================================================
      public static Attribute  cloneAttribute(Attribute src)
      {
          Attribute	attr = factory.createAttribute();
          attr.setName(src.getName());

          attr.setAttType(src.getAttType());
          attr.setRwType(src.getRwType());
          if (src.getAssociatedAttr()!=null && src.getAssociatedAttr().length()>0)
            attr.setAssociatedAttr(src.getAssociatedAttr());
if (src.getDataType()==null)
	System.out.println("Type is null for " + src.getName());
          attr.setDataType(cloneType(src.getDataType()));

          attr.setMaxX(src.getMaxX());
          attr.setMaxY(src.getMaxY());

          //	Attribute properties
          AttrProperties	prop = OAWutils.factory.createAttrProperties();
          AttrProperties	src_prop = src.getProperties();
          prop.setDescription(src_prop.getDescription());
          prop.setLabel(src_prop.getLabel());
          prop.setUnit(src_prop.getUnit());
          prop.setStandardUnit(src_prop.getStandardUnit());
          prop.setDisplayUnit(src_prop.getDisplayUnit());
          prop.setFormat(src_prop.getFormat());
          prop.setMaxValue(src_prop.getMaxValue());
          prop.setMinValue(src_prop.getMinValue());
          prop.setMaxAlarm(src_prop.getMaxAlarm());
          prop.setMinAlarm(src_prop.getMinAlarm());
          prop.setMaxWarning(src_prop.getMaxWarning());
          prop.setMinWarning(src_prop.getMinWarning());
          prop.setDeltaTime(src_prop.getDeltaTime());
          prop.setDeltaValue(src_prop.getDeltaValue());
          attr.setProperties(prop);

          //	Polling period
          attr.setPolledPeriod(src.getPolledPeriod());

          //	Display level
          if (src.getDisplayLevel() == null)
              attr.setDisplayLevel("OPERATOR");
          else
              attr.setDisplayLevel(src.getDisplayLevel());

          //	memorized
          attr.setMemorized(src.getMemorized());
          attr.setMemorizedAtInit(src.getMemorizedAtInit());

          //	Inheritance status
          InheritanceStatus   status = factory.createInheritanceStatus();
          InheritanceStatus   src_st = src.getStatus();
          status.setAbstract(src_st.getAbstract());
          status.setInherited(src_st.getInherited());
          status.setConcrete(src_st.getConcrete());
          status.setConcreteHere(src_st.getConcreteHere());

          EList<String>   src_excluded = src.getReadExcludedStates();
          EList<String>   new_excuded  = attr.getReadExcludedStates();
          for (String s : src_excluded)
              new_excuded.add(s);

          src_excluded = src.getWriteExcludedStates();
          new_excuded  = attr.getWriteExcludedStates();
          for (String s : src_excluded)
              new_excuded.add(s);

          attr.setStatus(status);
          attr.setAllocReadMember(src.getAllocReadMember());

          //  Set event fire management
          if (src.getChangeEvent()!=null) {
              FireEvents  changeEvents = OAWutils.factory.createFireEvents();
              changeEvents.setFire(src.getChangeEvent().getFire());
              changeEvents.setLibCheckCriteria(src.getChangeEvent().getLibCheckCriteria());
              attr.setChangeEvent(changeEvents);
          }
          if (src.getArchiveEvent()!=null) {
              FireEvents  archiveEvents = OAWutils.factory.createFireEvents();
              archiveEvents.setFire(src.getArchiveEvent().getFire());
              archiveEvents.setLibCheckCriteria(src.getArchiveEvent().getLibCheckCriteria());
              attr.setArchiveEvent(archiveEvents);
          }
          if (src.getDataReadyEvent()!=null) {
              FireEvents  dataReadyEvents = OAWutils.factory.createFireEvents();
              dataReadyEvents.setFire(src.getDataReadyEvent().getFire());
              dataReadyEvents.setLibCheckCriteria(src.getDataReadyEvent().getLibCheckCriteria());
              attr.setDataReadyEvent(dataReadyEvents);
          }
          return attr;
      }
    //===============================================================
    //===============================================================
    public static Property cloneProperty(Property src)
    {
        Property	property = factory.createProperty();
        property.setName(src.getName());
        property.setDescription(src.getDescription());

        //	type management
        property.setType(cloneType(src.getType()));

        //	Default value
        EList<String>	list     = property.getDefaultPropValue();
        EList<String>   src_list = src.getDefaultPropValue();
        for (String s : src_list)
            list.add(s);

        //	Inheritance status
        InheritanceStatus   status = factory.createInheritanceStatus();
        InheritanceStatus   src_st = src.getStatus();
        status .setAbstract(src_st.getAbstract());
        status .setInherited(src_st.getInherited());
        status .setConcrete(src_st.getConcrete());
        status .setConcreteHere(src_st.getConcreteHere());
        property.setStatus(status);
        return property;
    }
    //======================================================
    //======================================================
    public static State cloneState(State src)
    {
        State	state = factory.createState();
        state.setName(src.getName());
        state.setDescription(src.getDescription());
        
        //	Inheritance status
        InheritanceStatus   status = factory.createInheritanceStatus();
        InheritanceStatus   src_st = src.getStatus();
        status .setAbstract(src_st.getAbstract());
        status .setInherited(src_st.getInherited());
        status .setConcrete(src_st.getConcrete());
        status .setConcreteHere(src_st.getConcreteHere());
        state.setStatus(status);
        return state;
    }
	//========================================================================
	//========================================================================
    public static AdditionalFile cloneAdditionalFile(AdditionalFile src)
    {
        AdditionalFile  file = factory.createAdditionalFile();
        file.setName(src.getName());
        file.setPath(src.getPath());

        return file;
    }
	//========================================================================
	//========================================================================
}
