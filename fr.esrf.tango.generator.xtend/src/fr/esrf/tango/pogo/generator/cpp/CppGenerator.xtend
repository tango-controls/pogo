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

package fr.esrf.tango.pogo.generator.cpp

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import fr.esrf.tango.pogo.generator.cpp.projects.LinuxMakefile
import fr.esrf.tango.pogo.generator.cpp.projects.LinuxCMakeLists
import fr.esrf.tango.pogo.generator.cpp.projects.WinCMakeLists
import fr.esrf.tango.pogo.generator.cpp.projects.VC12.VC12_Project
import fr.esrf.tango.pogo.generator.cpp.projects.VC10.VC10_Project
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*
import fr.esrf.tango.pogo.generator.common.EclipseProjects

class CppGenerator implements IGenerator {

	@Inject	extension fr.esrf.tango.pogo.generator.cpp.utils.Headers
	@Inject	extension DeviceInclude
	@Inject	extension DeviceSource
	@Inject	extension DeviceClassInclude
	@Inject	extension DeviceClassSource
	@Inject	extension DeviceStateMachine
	@Inject	extension DynamicAttributeUtils
	@Inject	extension ClassFactory
	@Inject	extension Main
	
	@Inject	extension LinuxCMakeLists
	@Inject	extension WinCMakeLists
	@Inject	extension LinuxMakefile
	@Inject	extension VC10_Project
	@Inject	extension VC12_Project
	@Inject extension EclipseProjects

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		//
		//	Generate cpp files for PogoDeviceClass objects
		//
		for (cls : resource.allContents.toIterable.filter(typeof(PogoDeviceClass))) {
			//println(cls.description.filestogenerate)
			//println("Lannguage="+cls.description.language)
			if (cls.description.language.toLowerCase.equals("cpp")) {
				//	Code files
				if (cls.description.filestogenerate.contains("Code files")) {
					printTrace("Generating " + cls.deviceIncludeFileName)
					fsa.generateFile(cls.deviceIncludeFileName,      cls.generateDeviceIncludeFile)
					
					printTrace("Generating " + cls.deviceSourceFileName)
					fsa.generateFile(cls.deviceSourceFileName,       cls.generateDeviceSourceFile)
					
					printTrace("Generating " + cls.deviceClassIncludeFileName)
					fsa.generateFile(cls.deviceClassIncludeFileName, cls.generateDeviceClassIncludeFile)
					
					printTrace("Generating " + cls.deviceClassSourceFileName)
					fsa.generateFile(cls.deviceClassSourceFileName,  cls.generateDeviceClassSourceFile)
					
					printTrace("Generating " + cls.stateMachineFileName)
					fsa.generateFile(cls.stateMachineFileName,       cls.generateStateMachineSourceFile)
					
					printTrace("Generating ClassFactory.cpp")
					fsa.generateFile("ClassFactory.cpp",             cls.generateClassFactoryFile)
					
					printTrace("Generating main.cpp")
					fsa.generateFile("main.cpp",                     cls.generateMainFile)

					//	Dynamic attributes if any
					if (cls.dynamicAttributes.size>0 || cls.dynamicCommands.size()>0) {
						printTrace("Generating " + cls.dynamicAttrUtilsFileName)
						fsa.generateFile(cls.dynamicAttrUtilsFileName,cls.generateDynamicAttrUtilsFile)
					}
				}
				printTrace("------> " + cls.description.filestogenerate)
				
				//	Linux Makefile
				if (cls.description.filestogenerate.contains("Makefile")) {
					printTrace("Generating Makefile")
					fsa.generateFile("Makefile",  cls.generateLinuxMakefile)
				}
				
				//	Linux CMakeLists.txt
				if (cls.description.filestogenerate.contains("CMakeLists")) {
					printTrace("Generating CMakeLists")
					fsa.generateFile("CMakeLists.txt",  cls.generateLinuxCMakeLists)
				}
				
				//	Eclipse Project
				if (cls.description.filestogenerate.toLowerCase.contains("eclipse")) {
					printTrace("Generating Eclipse project")
					fsa.generateFile(".project",  cls.generateEclipseProject)
					fsa.generateFile(".cproject", cls.generateCppEclipseProject)
				}
				
				//	Widows projects
				/*
				if (cls.description.filestogenerate.contains("VC9")) {
					printTrace("Generating VC9 project in vc9_proj")
					fsa.generateFile("vc9_proj/"+cls.name+".sln",     cls.generateVC9_Project)
					fsa.generateFile("vc9_proj/Class_lib.vcproj",     cls.generateVC9_ClassLib)
					fsa.generateFile("vc9_proj/Server_static.vcproj", cls.generateVC9_ServerStatic)
					fsa.generateFile("vc9_proj/Class_dll.vcproj",     cls.generateVC9_ClassDll)
					fsa.generateFile("vc9_proj/Server_shared.vcproj", cls.generateVC9_ServerShared)
				}
				*/
				if (cls.description.filestogenerate.contains("VC10")) {
					printTrace("Generating VC10 project in vc10_proj")
					fsa.generateFile("vc10_proj/"+cls.name+".sln",      cls.generateVC10_Project)
					fsa.generateFile("vc10_proj/Class_lib.vcxproj",     cls.generateVC10_ClassLib)
					fsa.generateFile("vc10_proj/Server_static.vcxproj", cls.generateVC10_ServerStatic)
					fsa.generateFile("vc10_proj/Class_dll.vcxproj",     cls.generateVC10_ClassDll)
					fsa.generateFile("vc10_proj/Server_shared.vcxproj", cls.generateVC10_ServerShared)

					fsa.generateFile("vc10_proj/Class_lib.vcxproj.filters", cls.generateVC10_Filters)
					fsa.generateFile("vc10_proj/Class_dll.vcxproj.filters", cls.generateVC10_Filters)
				}
				if (cls.description.filestogenerate.contains("VC12")) {
					printTrace("Generating VC12 project in vc12_proj")
					fsa.generateFile("vc12_proj/"+cls.name+".sln",      cls.generateVC12_Project)
					fsa.generateFile("vc12_proj/Class_lib.vcxproj",     cls.generateVC12_ClassLib)
					fsa.generateFile("vc12_proj/Server_static.vcxproj", cls.generateVC12_ServerStatic)
					fsa.generateFile("vc12_proj/Class_dll.vcxproj",     cls.generateVC12_ClassDll)
					fsa.generateFile("vc12_proj/Server_shared.vcxproj", cls.generateVC12_ServerShared)

					fsa.generateFile("vc12_proj/Class_lib.vcxproj.filters", cls.generateVC12_Filters)
					fsa.generateFile("vc12_proj/Class_dll.vcxproj.filters", cls.generateVC12_Filters)
				}
				if (cls.description.filestogenerate.contains("WindowsCMakeLists")) {
					printTrace("Generating CMakeLists.txt")
					fsa.generateFile("CMakeLists.txt",       cls.generateWinCMakeLists)
					fsa.generateFile("CmakeTangoWin.cmake",  generateCMakeWinConf)
				}
			}
		}
		//
		//	Generate cpp files for PogoMultiClasses  objects
		//
		for (multi : resource.allContents.toIterable.filter(typeof(PogoMultiClasses))) {
			//	Multi class
			if (multi.filestogenerate.contains("Code files")) {
				printTrace("Generating MultiClassesFactory.cpp")
				fsa.generateFile("MultiClassesFactory.cpp",  multi.generateMultiClassesFactoryFile)
				
				// Do override the main for simple class if exists
				if (fileExists(multi.sourcePath + "/main.cpp")==false) {
					printTrace("Generating main.cpp")
					fsa.generateFile("main.cpp",   multi.generateMainFile)
				}
			}

			if (multi.filestogenerate.contains("Makefile")) {
				printTrace("Generating Makefile.multi")
				fsa.generateFile("Makefile.multi", multi.generateLinuxMakefileMultiClasses)
			}
			if (multi.filestogenerate.contains("CMakeLists")) {
				printTrace("Generating CMakeLists.txt")
				fsa.generateFile("CMakeLists.txt", multi.generateLinuxCMakeListsMultiClasses)
			}
		}
	}
	
}