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


class DeviceClassSource implements IGenerator {
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.CppUtil
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.Headers
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.TypeDefinitions

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			fsa.generateFile(cls.deviceClassSourceFileName, cls.generateDeviceClassSourceFile)
		}
	}
	

	//======================================================
	// Define deviceClass source file to be generated
	//======================================================
	def generateDeviceClassSourceFile (PogoDeviceClass cls) '''
		«cls.fileHeader»
				
		namespace «cls.name»_ns
		{

		} //	namespace
	'''

	//======================================================
	// define the header file
	//======================================================
	def fileHeader (PogoDeviceClass cls) '''
		«cls.protectedArea("class.cpp",
			cls.deviceClassSourceFileHeader+
			"\n\n" +
			"#include <"+cls.name+".h>\n"+
			"#include <"+cls.name+"Class.h>", false)»
	'''


	//======================================================
	// Define constructor code
	//======================================================
	def constructors(PogoDeviceClass cls) '''
	'''
}