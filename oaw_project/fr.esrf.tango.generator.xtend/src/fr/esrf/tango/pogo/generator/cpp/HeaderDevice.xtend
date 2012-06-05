package fr.esrf.tango.pogo.generator.cpp

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import fr.esrf.tango.pogo.pogoDsl.Attribute


class HeaderDevice implements IGenerator {
	@Inject
	extension CppUtil
	@Inject
	extension Headers

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			fsa.generateFile(cls.name+".h", cls.generateDeviceHeaderFile)
		}
	}
	
	def generateDeviceHeaderFile (PogoDeviceClass cls) '''
		«cls.deviceHeaderFileHeader»
		
		#ifndef «cls.name»_H
		#define «cls.name»_H
		
		#include <tango.h>
		#include <«cls.name»Class.h>
		
		/** «cls.name» class description:
		 * «cls.description.description.comments(" *  ")»
		 */
		
		namespace «cls.name»_ns
		{
		
		«cls.protedtedArea("extraClassDeclarations", "Add your extra class declarations")»
		
		class «cls.name» : public Tango::Device_4Impl
		{
		public:
			/**
			 *	will be called at device destruction or at init command.
			 */
			void delete_device();
			/**
			 *	Initialize the device
			 */
			virtual void init_device();
			/**
			 *	Read the device properties from database
			 */
			 void get_device_property();
			/**
			 *	Always executed method before execution command method.
			 */
			virtual void always_executed_hook();
		
		
		//	Attribute methods
		public:
			/**
			 *	Method      : Starter::read_attr_hardware()
			 *	Description : Hardware acquisition for attributes.
			 */
			virtual void read_attr_hardware(vector<long> &attr_list);

			«FOR Attribute attr : cls.attributes»
				/**
				 *	«attr.properties.description.comments("	 *	")»
				 *
				 *	Data type:	
				 *	Attr type:	«attr.attType»
				 */
				virtual void read_«attr.name»(Tango::Attribute &attr);
				virtual bool is_«attr.name»_allowed(Tango::AttReqType type);
			«ENDFOR»
		};
		
		}	//	End of namespace
		
		#endif   //	«cls.name»_H
	'''

}