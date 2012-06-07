package fr.esrf.tango.pogo.generator.cpp

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.pogoDsl.Command
import fr.esrf.tango.pogo.pogoDsl.Property


//======================================================
//	Define deviceClass include file to be generated
//======================================================
class DeviceClassInclude implements IGenerator {
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.CppUtil
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.Headers
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.TypeDefinitions
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.Commands

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			fsa.generateFile(cls.deviceClassIncludeFileName, cls.generateDeviceClassIncludeFile)
		}
	}
	
	//======================================================
	// Define device include file to be generated
	//======================================================
	def generateDeviceClassIncludeFile (PogoDeviceClass cls) '''
		«cls.fileHeader»
		
		
		namespace «cls.name»_ns
		{

			/**
			 *	The «cls.name»Class singleton definition
			 */
			
			class
			#ifdef _TG_WINDOWS_
				__declspec(dllexport)
			#endif
				«cls.name»Class : public Tango::DeviceClass
			{
				
				«cls.propertyMethods»
			
			}
		}	//	End of namespace
		
		#endif   //	«cls.name»_H
	'''

	//======================================================
	// define the header file
	//======================================================
	def fileHeader (PogoDeviceClass cls) '''
		«cls.protectedArea("class.h",
			cls.deviceClassIncludeFileHeader+
			"\n\n" +
			"#ifndef " + cls.name + "Class_H\n"+
			"#define " + cls.name + "Class_H\n\n"+
			"#include <tango.h>\n", false)»
	'''
	// define the header file
	//======================================================
	def propertyMethods (PogoDeviceClass cls) '''
		public:
			Tango::DbDatum	get_class_property(string &);
			Tango::DbDatum	get_default_device_property(string &);
			Tango::DbDatum	get_default_class_property(string &);

	'''

	//======================================================
	// 
	//======================================================
}