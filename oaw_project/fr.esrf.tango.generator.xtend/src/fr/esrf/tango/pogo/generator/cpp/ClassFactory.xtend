package fr.esrf.tango.pogo.generator.cpp

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import static extension fr.esrf.tango.pogo.generator.cpp.utils.ProtectedArea.*
import fr.esrf.tango.pogo.generator.cpp.utils.ProtectedArea
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef


//======================================================
// Define ClassFactory.cpp file to be generated
//======================================================
class ClassFactory {
	@Inject	extension ProtectedArea
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.utils.Headers

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
	//======================================================
	// Define MultiClassFactory.cpp file tfor multi class project
	//======================================================
	def generateMultiClassesFactoryFile (PogoMultiClasses cls) '''
		«cls.ClassFactoryFileHeader»
		
		#include <tango.h>
		«FOR OneClassSimpleDef clazz : cls.classes»
			#include <«clazz.classname»Class.h>
		«ENDFOR»
		
		/**
		 *	Create Class singletons and store them in DServer object.
		 */
		
		void Tango::DServer::class_factory()
		{
			«FOR OneClassSimpleDef clazz : cls.classes»
				add_class(«clazz.classname»_ns::«clazz.classname»Class::init("«clazz.classname»"));
			«ENDFOR»
		}
	'''

}