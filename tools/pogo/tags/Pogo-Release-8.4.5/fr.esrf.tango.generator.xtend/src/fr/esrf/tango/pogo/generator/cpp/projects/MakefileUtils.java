//+======================================================================
//
// Project:   Tango
//
// Description:  source code for Tango code generator.
//
// $Author: verdier $
//
// Copyright (C) :  2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013,2014
//					European Synchrotron Radiation Facility
//                  BP 220, Grenoble 38043
//                  FRANCE
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

package fr.esrf.tango.pogo.generator.cpp.projects;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses;
import fr.esrf.tango.pogo.generator.cpp.utils.InheritanceUtils;

public class MakefileUtils extends fr.esrf.tango.pogo.generator.common.StringUtils{

	InheritanceUtils	inheritanceUtils = new InheritanceUtils();
	//======================================================
	/**
	 * Include part header
	 * @return include part header
	 */
	//======================================================
	String makefileIncludesHeader() {
		return
			"#=============================================================================\n" +
			"# INC_DIR_USER is the list of all include path needed by your sources\n"          +
			"#   - for a device server, tango dependencies are automatically appended\n"       +
			"#   - '-I ../include' and '-I .' are automatically appended in all cases\n"       +
			"#\n" +
			"INC_DIR_USER= -I . ";
	}
	//======================================================
	/**
	 * include for specified class
	 * @param clsspecified PogoDeviceClass object
	 * @return include for specified class
	 */
	//======================================================
	String makefileIncludes(PogoDeviceClass cls) {

		return  makefileIncludesHeader() +
				addInheritanceIncludeHome(cls.getDescription().getInheritances());
	}
	//======================================================
	/**
	 * include for specified classes
	 * @param multi specified PogoMultiClasses object
	 * @return include for specified classes
	 */
	//======================================================
	String makefileIncludes(PogoMultiClasses multi) {
		String code = makefileIncludesHeader();
		for (OneClassSimpleDef cls : multi.getClasses()) {
			code += addClassIncludeHome(cls.getClassname());
			code += addInheritanceIncludeHome(cls.getInheritances());
		}
		return code;
	}
	//======================================================
	//======================================================
	String addInheritanceIncludeHome(EList<Inheritance> inheritances) {
	 	// Add inheritance include files if any
		StringBuilder sb = new StringBuilder();
		for (Inheritance inheritance : inheritances) {
	 		if (inheritanceUtils.isInheritanceClass(inheritance)) {
	 			sb.append(addClassIncludeHome(inheritance.getClassname())); 
	 		}
		}
		return sb.toString();
	}
	//======================================================
	//======================================================
	String addClassIncludeHome(String className) {
		String code = "\\\n"; 
		code += "              -I $(" + classHomeDir(className) + ")";
		return code;
	}
	//=============================================================================
 	// Add inheritance include files reference if any
 	//=============================================================================
 	String addInheritancIncludeReference(PogoDeviceClass cls) {
		String code = "";
	 	for (Inheritance inheritance : cls.getDescription().getInheritances()) {
	 		if (inheritanceUtils.isInheritanceClass(inheritance)) {
				 code = "$(SVC_INHERITANCE_INCL)"; 
	 		}
	 	}
		return  code;
	}
	//======================================================
	//======================================================


	
	
	
	
	//======================================================
	/**
	 * Define the definition for all classes in project
	 * @param cls specified PogoDeviceClass object
	 * @return code to define all classes in project
	 */
	//======================================================
	String addClassesDefinitions(PogoMultiClasses multi) {
		inheritedObjectFiles = new ArrayList<String>();
		String code = 
				"#=============================================================================\n" +
				"# Tango Class list used by project\n" +
				"#\n";
		for (OneClassSimpleDef cls : multi.getClasses()) {
			code += addClassDefinition(cls.getClassname(), cls.getSourcePath());
			
			//	Add inheritance class if any
			for (Inheritance inheritance : cls.getInheritances()) {
				if (inheritanceUtils.isInheritanceClass(inheritance)) {
					code += "#------------ Inheritance from " + cls.getClassname() + " class ------------\n";
					code += addClassDefinition(inheritance.getClassname(), inheritance.getSourcePath());
				}
			}
		}
		return  code;
	}
	//======================================================
	/**
	 * Define the definition for inherited classes
	 * @param cls specified PogoDeviceClass object
	 * @return code to define inherited classes
	 */
	//======================================================
	String addInheritanceDefinitions(PogoDeviceClass cls){
		String code = "";
		if (inheritanceUtils.hasInheritanceClass(cls)) {
			code =  "#=============================================================================\n" +
					"# Following are names, pathes and files of the inherited classes used by project\n" +
					"#\n";
			for (Inheritance inheritance : cls.getDescription().getInheritances()) {
				if (inheritanceUtils.isInheritanceClass(inheritance)) {
					code += "#------------ Inheritance from " + cls.getName() + " class ------------\n";
					code += addClassDefinition(inheritance.getClassname(), inheritance.getSourcePath());
				}
			}
		}
		return  code;
	}
	//=============================================================================
 	/**
 	 *  Define the definition for inherited classes
 	 * @param clasname specified class name
 	 * @param sourcePath specified class source path
 	 * @return code 
 	 */
 	//=============================================================================
	String addClassDefinition(String classname, String sourcePath) {
		return 
			classname.toUpperCase() + "_CLASS = " + classname + "\n" +
			classHomeDir(classname) + "  = " + sourcePath + "\n\n";
	}
	//======================================================
	//======================================================

	
	
	//======================================================
	//======================================================
	String addObjectFiles(PogoMultiClasses multi) {
		String code =
			"#=============================================================================\n" +
			"# SVC_OBJS is the list of all objects needed to make the output\n" +
			"#\n" +
			"SVC_OBJS =  ";
	
		int	i=0;
		for (OneClassSimpleDef cls : multi.getClasses()) {
			if (i++>0)
				code += "            ";
			code += "$(SVC_"  + cls.getClassname().toUpperCase() + "_OBJS) \\\n";
		}
		code += "            $(OBJDIR)/MultiClassesFactory.o \\\n" +
				"            $(OBJDIR)/main.o";

		code += "\n\n";
		for (OneClassSimpleDef cls : multi.getClasses()) {
			code += addObjectFileList(cls);
		}
		
		return code;
	}
	//======================================================
	//======================================================
	private String addObjectFileList(OneClassSimpleDef cls) {
		String code = "#------------  Object files for " + cls.getClassname() + " class  ------------\n";
		code += "SVC_"  + cls.getClassname().toUpperCase() + "_OBJS = \\\n";
		code += addObjectFileList(cls.getClassname());

		//	Add dynamic attribute tools file if needed.
		if (isTrue(cls.getHasDynamic())) {
			code += " \\\n";
			code += "		$(OBJDIR)/" + cls.getClassname() + "DynAttrUtils.o"; 
		}

		//	Additional files
		for (AdditionalFile file : cls.getAdditionalFiles()) {
			code += " \\\n";
			code += "		$(OBJDIR)/" + file.getName() + ".o"; 
		}
		
		//	Inheritance files
		for (Inheritance inheritance : cls.getInheritances()) {
			if (inheritanceUtils.isInheritanceClass(inheritance)) {
				code += " \\\n"+
						addObjectFileList(inheritance.getClassname());
			}
		}
		code += "\n\n";
		return code;
	}
	//======================================================
	//======================================================
	private static ArrayList<String>	inheritedObjectFiles;
	private String addObjectFileList(String classname) {
		String	classObjectFile = classname +".o";
		String code = "";

		//	If class already declared, do not re-do it (e.g. inheritance)
		if (alreadyDeclared(classObjectFile, inheritedObjectFiles))
			return "";
		
		code += "		$(OBJDIR)/" + classname +".o \\\n";
		code += "		$(OBJDIR)/" + classname +"Class.o \\\n";
		code += "		$(OBJDIR)/" + classname +"StateMachine.o";
		inheritedObjectFiles.add(classObjectFile);
		return code;
	}
	//======================================================
	//======================================================
	private boolean alreadyDeclared(String str, ArrayList<String> list) {
		for (String s : list)
			if (s.equals(str))
				return true;
		return false;
	}
	//======================================================
	//======================================================
	String dependancies(PogoMultiClasses multi) {
		String code = "";
		for (OneClassSimpleDef cls : multi.getClasses()) {
			code += "#------------  Object files dependancies for " + cls.getClassname() + " class  ------------\n";
			code += dependanciesIncludes(cls.getClassname(), cls.getInheritances());
			code += dependanciesObject(cls.getClassname(), "");
			code += dependanciesObject(cls.getClassname(), "Class");
			code += dependanciesObject(cls.getClassname(), "StateMachine");

			//	Add dynamic attribute tools file if needed.
			if (isTrue(cls.getHasDynamic())) {
				code += dependanciesObject(cls.getClassname(), "DynAttrUtils");
			}

			//	Additional files
			for (AdditionalFile file : cls.getAdditionalFiles()) {
				code += dependanciesObjectAddFile(cls.getClassname(), file.getName());
			}

			//	Inheritance files
			for (Inheritance inheritance : cls.getInheritances()) {
				if (inheritanceUtils.isInheritanceClass(inheritance)) {
					if (alreadyDeclared(inheritance.getClassname(), inheritedDependanciesFiles)==false) {
						code += dependanciesObject(inheritance.getClassname(), "");
						code += dependanciesObject(inheritance.getClassname(), "Class");
						code += dependanciesObject(inheritance.getClassname(), "StateMachine");
						inheritedDependanciesFiles.add(inheritance.getClassname());
					}
				}
			}
			code += "\n";
		}
		return code;
	}
	//======================================================
	//======================================================
	private static ArrayList<String>	inheritedDependanciesFiles = new ArrayList<String>();
	String dependanciesIncludes(String classname, EList<Inheritance> inheritances) {
		String code = "";
		if (inheritances!=null) {
			code += classIncludeDir(classname) + " = \\\n";
			for (Inheritance inheritance : inheritances) {
				if (inheritanceUtils.isInheritanceClass(inheritance)) {
					code += dependanciesIncludes(inheritance.getClassname(), null);
					code += " \\\n";
				}
			}
		}

		code += "		$(" + classHomeDir(classname) + ")/" + classname + ".h \\\n"; 
		code += "		$(" + classHomeDir(classname) + ")/" + classname + "Class.h";
		
		if (inheritances!=null) {
			code += "\n\n";
		}
		return code;
	}
	//======================================================
	/**
	 * Generate something like (for Serial class)
	 *	$(OBJDIR)/Serial.o: $(SERIAL_HOME)/SerialClass.cpp $(SERIAL_INCL)
	 *	$(CC) $(CFLAGS) -c $< -o $(OBJDIR)/SerialClass.o
	 *
	 * @param classname specified class name
	 * @param sufix		(Class, Statemachine, ...)
	 * @return generated code
	 */
	//======================================================
	private String dependanciesObject(String classname, String sufix) {
		String code = 
			"$(OBJDIR)/" + classname + sufix + ".o:"+
				"  $(" +  classHomeDir(classname) + ")/"+classname+sufix+".cpp $("+classIncludeDir(classname)+")\n";
		code += "	$(CXX) $(CXXFLAGS) -c $< -o $(OBJDIR)/" + classname + sufix + ".o\n";
		return code;
	}
	//======================================================
	private String dependanciesObjectAddFile(String classname, String filename) {
		String code = 
			"$(OBJDIR)/" + filename + ".o:"+
				"  $(" +  classHomeDir(classname) + ")/"+filename+".cpp $("+classIncludeDir(classname)+")\n";
		code += "	$(CXX) $(CXXFLAGS) -c $< -o $(OBJDIR)/" + filename + ".o\n";
		return code;
	}
	//======================================================
	//======================================================
	private String classIncludeDir(String classname) {
		return classname.toUpperCase()+"_INCLUDES";
	}
	//======================================================
	//======================================================
	private String classHomeDir(String classname) {
		return classname.toUpperCase()+"_HOME";
	}
	//======================================================
	//======================================================

	//======================================================
	//======================================================
	String makeEnv(PogoMultiClasses multi) {
		String	dbg = System.getProperty("DEBUG_MAKE");
		String code = "MAKE_ENV = ";
		
		if (dbg!=null)
			code += dbg;
		else
		if (isSet(multi.getPreferences().getMakefileHome()))
			code += multi.getPreferences().getMakefileHome();
		else
			code += "$(TANGO_HOME)";
		return code;
	}
	//======================================================
	//======================================================
	String makeEnv(PogoDeviceClass cls) {
		String	dbg = System.getProperty("DEBUG_MAKE");
		String code = 
				"#=============================================================================\n" +
				"# MAKE_ENV is the path to find common environment to buil project\n" +
				"#\n" +
				"MAKE_ENV = ";

		if (dbg!=null)
			code += dbg;
		else
		if (isSet(cls.getPreferences().getMakefileHome()))
			code += cls.getPreferences().getMakefileHome();
		else
			code += "$(TANGO_HOME)";
		return code;
	}
	//======================================================
	//======================================================

	
	
	
	//======================================================
	//======================================================
	String inheritanceDependancies(PogoDeviceClass cls) {
		String code = 
			"#=============================================================================\n" +
			"# Following are dependancies of the inherited classes used by project\n" +
			"#\n";
		for (Inheritance inher : cls.getDescription().getInheritances()) {
			if (inheritanceUtils.isInheritanceClass(inher)) {
				code += "\n" +
						"#------------  Object files dependancies for " +inher.getClassname()+" class  ------------\n";
				code += classIncludeDir(inher.getClassname()) + " = \\\n";
				code += "		$(" + classHomeDir(inher.getClassname()) + ")/" + inher.getClassname() + ".h \\\n"; 
				code += "		$(" + classHomeDir(inher.getClassname()) + ")/" + inher.getClassname() + "Class.h\n";
				code += dependanciesObject(inher.getClassname(), "");
				code += dependanciesObject(inher.getClassname(), "Class");
				code += dependanciesObject(inher.getClassname(), "StateMachine");

				/*
				for (Inheritance inheritance : cls.getDescription().getInheritances()) {
					if (inheritanceUtils.isInheritanceClass(inheritance)) {
						code += dependanciesObject(inheritance.getClassname(), "");
						code += dependanciesObject(inheritance.getClassname(), "Class");
						code += dependanciesObject(inheritance.getClassname(), "StateMachine");
					}
				}
				*/
				for (AdditionalFile file : cls.getAdditionalFiles()) {
					code += dependanciesObjectAddFile(cls.getName(), file.getName());
				}
			}
		}

		code += "\nSVC_INHERITANCE_INCL = ";
		for (Inheritance inheritance : cls.getDescription().getInheritances()) {
			if (inheritanceUtils.isInheritanceClass(inheritance)) {
				code+= " $(" + classIncludeDir(inheritance.getClassname()) + ")";
			}
		}
		code += "\n";

		return code;
	}
	//=============================================================================
	// Add dynamic attribute util if any
	//=============================================================================
 	String dynamicAttrObjects(PogoDeviceClass cls) {
 		String code = "";
 		if (cls.getDynamicAttributes().size()>0) {
 			code = "$(OBJDIR)/$(PACKAGE_NAME)DynAttrUtils.o \\\n";
 		}
 		return code;
 	}
 	//=============================================================================
	// Add inheritance object if any
	//=============================================================================
 	String inheritanceObjects(PogoDeviceClass cls) {
 		String code = "";
 		if (inheritanceUtils.hasInheritanceClass(cls)) {
 			code = "$(SVC_INHERITANCE_OBJ) \\\n";
 			/*
 			for (Inheritance inheritance : cls.getDescription().getInheritances()) {
				if (inheritanceUtils.isInheritanceClass(inheritance)) {
 					code = "$(SVC_" + inheritance.getClassname().toUpperCase() + "_OBJ) \\\n";
				}
 			}
 			*/
 		}
 		return code;
 	}
 
 	//=============================================================================
	// Add Additional object files if any (Utils, threads, ...)
	//=============================================================================
 	String addAdditionalObjectFiles(PogoDeviceClass cls) {
 		String code = "";
 		if (cls.getAdditionalFiles().size()>0) {
			code = "#------------ Object files for additional files ------------\n" +
					"ADDITIONAL_OBJS = \\\n" +
					buildAdditionalFileListForMakefile(cls.getAdditionalFiles(), "		$(OBJDIR)/", ".o");
 		}
 		return code;
 	}
	//===========================================================
	public String buildAdditionalFileListForMakefile(EList<AdditionalFile> list, String startTag, String endTag) {
		ArrayList<String>	files = new ArrayList<String>();
		for (AdditionalFile file : list)
			files.add(file.getName());
		return buildFileListForMakefile(files, startTag, endTag);
	}
	//===========================================================
	public String buildInheritanceFileListForMakefile(EList<Inheritance> list, String startTag, String endTag) {
		ArrayList<String>	files = new ArrayList<String>();
		for (Inheritance inheritance : list)
			files.add(inheritance.getClassname());
		return buildFileListForMakefile(files, startTag, endTag);
	}
	//===========================================================
	//	Build a string with specified strings for Makefile
	//===========================================================
	private String buildFileListForMakefile(ArrayList<String> list, String startTag, String endTag) {
		StringBuffer	sb = new StringBuffer();
		for (int i=0 ; i<list.size();i++) {
			sb.append(startTag).append(list.get(i)).append(endTag);
			if (i<list.size()-1)
				sb.append(" \\").append('\n');
		}
		return sb.toString();
	}
}
