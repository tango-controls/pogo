package fr.esrf.tango.pogo.generator.cpp

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import fr.esrf.tango.pogo.generator.cpp.projects.LinuxMakefile
import fr.esrf.tango.pogo.generator.cpp.projects.VC9.VC9_Project
import fr.esrf.tango.pogo.generator.cpp.projects.VC10.VC10_Project


class CppGenerator implements IGenerator {

	@Inject	extension fr.esrf.tango.pogo.generator.cpp.global.Headers
	@Inject	extension DeviceInclude
	@Inject	extension DeviceSource
	@Inject	extension DeviceClassInclude
	@Inject	extension DeviceClassSource
	@Inject	extension DeviceStateMachine
	@Inject	extension DynamicAttributeUtils
	@Inject	extension ClassFactory
	@Inject	extension Main
	
	@Inject	extension LinuxMakefile
	@Inject	extension VC9_Project
	@Inject	extension VC10_Project

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			//println(cls.description.filestogenerate)
			//println("Lannguage="+cls.description.language)
			if (cls.description.language.toLowerCase.equals("cpp")) {
				//	Code files
				if (cls.description.filestogenerate.contains("Code files")) {
					fsa.generateFile(cls.deviceIncludeFileName,      cls.generateDeviceIncludeFile)
					fsa.generateFile(cls.deviceSourceFileName,       cls.generateDeviceSourceFile)
					fsa.generateFile(cls.deviceClassIncludeFileName, cls.generateDeviceClassIncludeFile)
					fsa.generateFile(cls.deviceClassSourceFileName,  cls.generateDeviceClassSourceFile)
					fsa.generateFile(cls.stateMachineFileName,       cls.generateStateMachineSourceFile)
					fsa.generateFile("ClassFactory.cpp",             cls.generateClassFactoryFile)
					fsa.generateFile("main.cpp",                     cls.generateMainFile)

					if (cls.dynamicAttributes.size>0) {
						fsa.generateFile(cls.dynamicAttrUtilsFileName,       cls.generateDynamicAttrUtilsFile)
					}
				}
				
				//	Linux Makefile
				if (cls.description.filestogenerate.contains("Makefile")) {
					fsa.generateFile("Makefile",             cls.generateLinuxMakefile)
				}
				
				//	Widows projects
				if (cls.description.filestogenerate.contains("VC9")) {
					fsa.generateFile("vc9_proj/"+cls.name+".sln",     cls.generateVC9_Project)
					fsa.generateFile("vc9_proj/Class_lib.vcproj",     cls.generateVC9_ClassLib)
					fsa.generateFile("vc9_proj/Server_static.vcproj", cls.generateVC9_ServerStatic)
					fsa.generateFile("vc9_proj/Class_dll.vcproj",     cls.generateVC9_ClassDll)
					fsa.generateFile("vc9_proj/Server_shared.vcproj", cls.generateVC9_ServerShared)
				}
				if (cls.description.filestogenerate.contains("VC10")) {
					fsa.generateFile("vc10_proj/"+cls.name+".sln",      cls.generateVC10_Project)
					fsa.generateFile("vc10_proj/Class_lib.vcxproj",     cls.generateVC10_ClassLib)
					fsa.generateFile("vc10_proj/Server_static.vcxproj", cls.generateVC10_ServerStatic)
					fsa.generateFile("vc10_proj/Class_dll.vcxproj",     cls.generateVC10_ClassDll)
					fsa.generateFile("vc10_proj/Server_shared.vcxproj", cls.generateVC10_ServerShared)

					fsa.generateFile("vc10_proj/Class_lib.vcxproj.filters", cls.generateVC10_Filters)
					fsa.generateFile("vc10_proj/Class_dll.vcxproj.filters", cls.generateVC10_Filters)
				}
			}
		}
	}
}