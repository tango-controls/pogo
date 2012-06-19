package fr.esrf.tango.pogo.generator.cpp

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.pogoDsl.Command
import static extension fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea.*
import static extension fr.esrf.tango.pogo.generator.cpp.global.StringUtils.*
import fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea
import fr.esrf.tango.pogo.generator.cpp.global.StringUtils


//======================================================
// Define device source file to be generated
//======================================================
class DeviceSource implements IGenerator {
	@Inject	extension ProtectedArea
	@Inject	extension StringUtils
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.global.Headers
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.global.Commands
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.global.Attributes
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.global.Properties

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	}


	//======================================================
	// Define device source file to be generated
	//======================================================
	def generateDeviceSourceFile (PogoDeviceClass cls) '''
		«cls.fileHeader»
		
		/**
		 *  «cls.name» class description:
		 *    «cls.description.description.comments("*    ")»
		 */
		
		«cls.commands.commandsTable»

		«cls.attributes.attributesTable»
		
		namespace «cls.name»_ns
		{
		«cls.protectedArea("namespace_starting", "static initializations", true)»
		«cls.constructors»
		«cls.globalMethods»
		«cls.attributeMethods»
		«cls.commandMethods»

		«cls.protectedArea("namespace_ending", "Additional Methods", true)»
		} //	namespace
	'''

	//======================================================
	// define the header file
	//======================================================
	def fileHeader (PogoDeviceClass cls) '''
		«cls.protectedArea(".cpp",
			cls.deviceSourceFileHeader+
			"\n\n" +
			"#include <"+cls.name+".h>\n"+
			"#include <"+cls.name+"Class.h>", false)»
	'''


	//======================================================
	// Define constructors code
	//======================================================
	def constructors(PogoDeviceClass cls) '''
		
		«cls.simpleMethodHeader(cls.name,
			 "Constructors for a Tango device\nimplementing the class" + cls.name)»
		«cls.name»::«cls.name»(Tango::DeviceClass *cl, string &s)
		 : «DeviceImpl»(cl, s.c_str())
		{
			«cls.protectedArea("constructor_1", "init_device();", false)»
		}
		//--------------------------------------------------------
		«cls.name»::«cls.name»(Tango::DeviceClass *cl, const char *s)
		 : «DeviceImpl»(cl, s)
		{
			«cls.protectedArea("constructor_2", "init_device();", false)»
		}
		//--------------------------------------------------------
		«cls.name»::«cls.name»(Tango::DeviceClass *cl, const char *s, const char *d)
		 : «DeviceImpl»(cl, s, d)
		{
			«cls.protectedArea("constructor_3", "init_device();", false)»
		}

		«cls.simpleMethodHeader("delete_device",
			 "will be called at device destruction or at init command")»
		void «cls.name»::delete_device()
		{
			DEBUG_STREAM << "«cls.name»::delete_device() " << device_name << endl;
			«cls.protectedArea("delete_device", "Delete device allocated objects", true)»
			«cls.attributes.deleteAttributeDataMembers»
		}
	'''
	
	//======================================================
	// Define init_device() and get_device_properies() methods
	//======================================================
	def globalMethods(PogoDeviceClass cls) '''

		«cls.simpleMethodHeader("init_device", "will be called at device initialization.")»
		void «cls.name»::init_device()
		{
			DEBUG_STREAM << "«cls.name»::init_device() create device " << device_name << endl;
			«cls.protectedArea("init_device_before", "Initialization before get_device_property() call", true)»
			
			«IF cls.deviceProperties.size>0»
				//	Get the device properties from database
				get_device_property();
				«IF cls.deviceProperties.hasMandatoryProperty»
				if (mandatoryNotDefined)
					return;
				«ENDIF»
			«ELSE»
				//	No device property to be read from database
			«ENDIF»
			«cls.attributes.allocateAttributeDataMembers»

			«cls.protectedArea("init_device", "Initialize device", true)»
		}
		
		«IF cls.deviceProperties.size>0»
			«cls.getDevicePropertiesMethod»
			«IF cls.deviceProperties.hasMandatoryProperty»
				«cls.simpleMethodHeader("check_mandatory_property", "For mandatory properties check if defined in database.")»
				void «cls.name»::check_mandatory_property(Tango::DbDatum &class_prop, Tango::DbDatum &dev_prop)
				{
					//	Check if all properties are empty
					if (class_prop.is_empty() && dev_prop.is_empty())
					{
						TangoSys_OMemStream	tms;
						tms << endl <<"Property \'" << dev_prop.name;
						if (Tango::Util::instance()->_UseDb==true)
							tms << "\' is mandatory but not defined in database";
						else
							tms << "\' is mandatory but cannot be defined without database";
						string	status(get_status());
						status += tms.str();
						set_status(status);
						mandatoryNotDefined = true;
						«cls.protectedArea("check_mandatory_property",
							"cerr << tms.str() << \" for \" << device_name << endl;", false)»
					}
				}

			«ENDIF»
		«ENDIF»
		
		«cls.simpleMethodHeader("always_executed_hook", "method always executed before any command is executed")»
		void «cls.name»::always_executed_hook()
		{
			INFO_STREAM << "«cls.name»::always_executed_hook()  " << device_name << endl;
			«IF cls.deviceProperties.hasMandatoryProperty»
				if (mandatoryNotDefined)
				{
					string	status(get_status());
					Tango::Except::throw_exception(
								(const char *)"PROPERTY_NOT_SET",
								status.c_str(),
								(const char *)"«cls.name»::always_executed_hook()");
				}
			«ENDIF»
			«cls.protectedArea("always_executed_hook", "code always executed before all requests", true)»
		}

		«cls.simpleMethodHeader("read_attr_hardware", "Hardware acquisition for attributes")»
		void «cls.name»::read_attr_hardware(TANGO_UNUSED(vector<long> &attr_list))
		{
			DEBUG_STREAM << "«cls.name»::read_attr_hardware(vector<long> &attr_list) entering... " << endl;
			«cls.protectedArea("read_attr_hardware", "Add your own code", true)»
		}
		
	'''

	//======================================================
	// Define attribute related methods
	//======================================================
	def attributeMethods(PogoDeviceClass cls) '''
		«FOR Attribute attribute : cls.attributes»
			«IF attribute.rwType.contains("READ")»
				«attribute.attributeMethodHeader("Read")»
				«cls.readAttributeMethod(attribute)»
			«ENDIF»
			«IF attribute.rwType.contains("WRITE")»
				«attribute.attributeMethodHeader("Write")»
				«cls.writeAttributeMethod(attribute)»
			«ENDIF»
		«ENDFOR»
		
		«cls.simpleMethodHeader("add_dynamic_attributes", "Create the dynamic attributes if any\nfor specified device.")»
		void «cls.name»::add_dynamic_attributes()
		{

			«cls.protectedArea("add_dynamic_attributes", "Add your own code to create and add dynamic attributes if any", true)»

		}
		
	'''
		
	//======================================================
	// Define Command related methods
	//======================================================
	def commandMethods(PogoDeviceClass cls) '''
		«FOR Command command : cls.commands»
			«IF isTrue(command.status.concreteHere)»
				//--------------------------------------------------------
				«command.commandExecutionMethodHeader»
				//--------------------------------------------------------
				«cls.commandExecutionMethod(command)»
			«ENDIF»
		«ENDFOR»
	'''
}