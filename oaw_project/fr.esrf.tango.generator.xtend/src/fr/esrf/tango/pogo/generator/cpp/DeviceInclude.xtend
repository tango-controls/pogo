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
//	Define device include file to be generated
//======================================================
class DeviceInclude implements IGenerator {
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
			fsa.generateFile(cls.deviceIncludeFileName, cls.generateDeviceIncludeFile)
		}
	}
	
	//======================================================
	// Define device include file to be generated
	//======================================================
	def generateDeviceIncludeFile (PogoDeviceClass cls) '''
		«cls.fileHeader»
		
		/**
		 *  «cls.name» class description:
		 *    «cls.description.description.comments("*    ")»
		 */
		
		namespace «cls.name»_ns
		{
		«cls.protectedArea("Additional Class Declarations", "Additional Class Declarations", true)»
		
		class «cls.name» : public «deviceImpl»
		{

		«cls.protectedArea("Data Members", "Add your own data members", true)»
		
		«cls.declareDevicePropertyDataMembers»
		«cls.declareAttributeDataMembers»
		«cls.declareConstructors»
		«cls.declareGlobals»
		«cls.declareAttributes»
		«cls.declareCommands»
		«cls.protectedArea("Additional Method prototypes", "Additional Method prototypes", true)»
		};
		
		«cls.protectedArea("Additional Classes definitions", "Additional Classes definitions", true)»

		}	//	End of namespace
		
		#endif   //	«cls.name»_H
	'''

	//======================================================
	// define the header file
	//======================================================
	def fileHeader (PogoDeviceClass cls) '''
		«cls.protectedArea(".h",
			cls.deviceIncludeFileHeader+
			"\n\n" +
			"#ifndef " + cls.name + "_H\n"+
			"#define " + cls.name + "_H\n\n"+
			"#include <tango.h>\n", false)»
	'''
	

	//======================================================
	// Data members for device property declarations
	//======================================================
	def declareDevicePropertyDataMembers(PogoDeviceClass cls) '''
		«IF cls.deviceProperties.size>0»
			//	Device property data members
			public:
				«FOR Property property : cls.deviceProperties»
					//	«property.name»:	«property.description»
					«property.type.cppPropType»	«property.name.dataMemberName»;
				«ENDFOR»
		«ENDIF»
		
	'''

	//======================================================
	// Data members for attribute declarations
	//======================================================
	def declareAttributeDataMembers(PogoDeviceClass cls) '''
		«IF cls.attributes.size>0»
			//	Attribute data members
			public:
				«FOR Attribute attr : cls.attributes»
					«IF attr.status.concreteHere.equals("true") &&
						 attr.rwType.contains("READ")»
							«attr.dataType.cppType»	*attr_«attr.name»_read;
					«ENDIF»
				«ENDFOR»
		«ENDIF»
		
	'''

	//======================================================
	// Constructor declarations
	//======================================================
	def declareConstructors(PogoDeviceClass cls) '''
		//	Constructors and destructors
		public:
			/**
			 * Constructs a newly device object.
			 *
			 *	@param cl	Class.
			 *	@param s 	Device Name
			 */
			«cls.name»(Tango::DeviceClass *cl,string &s);
			/**
			 * Constructs a newly device object.
			 *
			 *	@param cl	Class.
			 *	@param s 	Device Name
			 */
			«cls.name»(Tango::DeviceClass *cl,const char *s);
			/**
			 * Constructs a newly device object.
			 *
			 *	@param cl	Class.
			 *	@param s 	Device name
			 *	@param d	Device description.
			 */
			«cls.name»(Tango::DeviceClass *cl,const char *s,const char *d);
			/**
			 * The device object destructor.
			 */	
			~«cls.name»() {delete_device();};


	'''


	//======================================================
	// General declarations
	//======================================================
	def declareGlobals(PogoDeviceClass cls) '''
		//	Miscellaneous methods
		public:
			/**
			 *	will be called at device destruction or at init command.
			 */
			void delete_device();
			/**
			 *	Initialize the device
			 */
			virtual void init_device();
			«IF cls.deviceProperties.size>0»
				/**
				 *	Read the device properties from database
				 */
				void get_device_property();
			«ENDIF»
			/**
			 *	Always executed method before execution command method.
			 */
			virtual void always_executed_hook();



	'''



	//======================================================
	// Attribute declarations
	//======================================================
	def declareAttributes(PogoDeviceClass cls) '''
		«IF cls.attributes.size()>0»
		//	Attribute methods
		public:
			/**
			 *	Method      : «cls.name»::read_attr_hardware()
			 *	Description : Hardware acquisition for attributes.
			 */
			virtual void read_attr_hardware(vector<long> &attr_list);

			«FOR Attribute attr : cls.attributes»
				«attr.attributeReadMethodHeader»
				«IF attr.rwType.contains("READ")»
					virtual void read_«attr.name»(Tango::Attribute &attr);
				«ENDIF»
				«IF attr.rwType.contains("WRITE")»
					virtual void write_«attr.name»(Tango::WAttribute &attr;
				«ENDIF»
				virtual bool is_«attr.name»_allowed(Tango::AttReqType type);
			«ENDFOR»
		«ENDIF»



	'''
	
	//======================================================
	// Command declarations
	//======================================================
	def declareCommands(PogoDeviceClass cls) '''
		«IF cls.commands.size()>0»
		//	Command related methods
		public:
			«FOR Command cmd : cls.commands»
				«IF cmd.status.concreteHere.equals("true")»
					«cmd.commandExecutionMethodHeader»
					«cls.commandExecutionMethodSignature(cmd, true)»
				«ENDIF»
			«ENDFOR»
		«ENDIF»


	'''
}