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


class DeviceSource implements IGenerator {
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.CppUtil
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.Headers
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.TypeDefinitions

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			fsa.generateFile(cls.deviceSourceFileName, cls.generateDeviceSourceFile)
		}
	}
	

	//======================================================
	// Define device source file to be generated
	//======================================================
	def generateDeviceSourceFile (PogoDeviceClass cls) '''
		«cls.fileHeader»
		
		/** «cls.name» class description:
		 *    «cls.description.description.comments("*    ")»
		 */
		
		«cls.description.comments.commandsTable»
		«cls.attributeTable»
		
		namespace «cls.name»_ns
		{
		«cls.protedtedArea("namespace_starting", "static initializations", true)»
		«cls.constructors»
		
		} //	namespace
	'''

	//======================================================
	// define the header file
	//======================================================
	def fileHeader (PogoDeviceClass cls) '''
		«cls.protedtedArea(".cpp",
			cls.deviceSourceFileHeader+
			"\n\n" +
			"#include <tango.h>\n"+
			"#include <"+cls.name+".h>\n"+
			"#include <"+cls.name+"Class.h>", false)»
	'''


	//======================================================
	// Define constructors code
	//======================================================
	def constructors(PogoDeviceClass cls) '''
			
		//--------------------------------------------------------
		/**
		 *	Method      : «cls.name»::«cls.name»()
		 *	Description : Constructors for a Tango device
		 *	              implementing the class «cls.name»
		 */
		//--------------------------------------------------------
		«cls.name»::«cls.name»(Tango::DeviceClass *cl, string &s)
		 : «deviceImpl»(cl, s.c_str())
		{
			«cls.protedtedArea("constructor_1", "init_device();", false)»
		}
		//--------------------------------------------------------
		«cls.name»::«cls.name»(Tango::DeviceClass *cl, const char *s)
		 : «deviceImpl»(cl, s)
		{
			«cls.protedtedArea("constructor_2", "init_device();", false)»
		}
		//--------------------------------------------------------
		«cls.name»::«cls.name»(Tango::DeviceClass *cl, const char *s, const char *d)
		 : «deviceImpl»(cl, s, d)
		{
			«cls.protedtedArea("constructor_3", "init_device();", false)»
		}
		//--------------------------------------------------------
		/**
		 *	Method      : «cls.name»::delete_device()()
		 *	Description : will be called at device destruction or at init command
		 */
		//--------------------------------------------------------
		void «cls.name»::delete_device()
		{
			DEBUG_STREAM << "«cls.name»::delete_device() " << device_name << endl;
			«cls.protedtedArea("delete_device", "Delete device allocated objects", true)»
		}
	'''
	
	//======================================================
	// Define managed attribute table
	//======================================================
	def attributeTable(PogoDeviceClass cls) '''
		
		//	Attributes managed are:
		//-------------------------
		«FOR Attribute attr : cls.attributes»
			//  «attr.name»
		«ENDFOR»
	'''
}