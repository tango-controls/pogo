package fr.esrf.tango.pogo.generator.cpp

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import static extension fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea.*
import fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea


//======================================================
// Define ClassFactory.cpp file to be generated
//======================================================
class ClassFactory implements IGenerator {
	@Inject
	extension ProtectedArea
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.Headers

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			fsa.generateFile("ClassFactory.cpp", cls.generateClassFactoryFile)
		}
	}


	//======================================================
	// Define ClassFactory.cpp file to be generated
	//======================================================
	def generateClassFactoryFile (PogoDeviceClass cls) '''
		«cls.openProtectedArea("ClassFactory.cpp")»
		«cls.ClassFactoryFileHeader»
		
		#include <tango.h>
		#include <«cls.name»Class.h>
		
		//	Add class header files if needed
		
		
		/**
		 *	Create «cls.name» Class singleton and store it in DServer object.
		 */
		
		void Tango::DServer::class_factory()
		{
			//	Add method class init if needed
			add_class(«cls.name»_ns::«cls.name»Class::init("«cls.name»"));
		}
		«cls.closeProtectedArea("ClassFactory.cpp")»
	'''

}