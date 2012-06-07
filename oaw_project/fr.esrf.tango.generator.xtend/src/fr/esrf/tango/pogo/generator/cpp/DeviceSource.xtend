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
		
		/**
		 *  «cls.name» class description:
		 *    «cls.description.description.comments("*    ")»
		 */
		
		«cls.description.comments.commandsTable»
		«cls.attributeTable»
		
		namespace «cls.name»_ns
		{
		«cls.protectedArea("namespace_starting", "static initializations", true)»
		«cls.constructors»
		«cls.globalMethods»
		
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
			«cls.protectedArea("constructor_1", "init_device();", false)»
		}
		//--------------------------------------------------------
		«cls.name»::«cls.name»(Tango::DeviceClass *cl, const char *s)
		 : «deviceImpl»(cl, s)
		{
			«cls.protectedArea("constructor_2", "init_device();", false)»
		}
		//--------------------------------------------------------
		«cls.name»::«cls.name»(Tango::DeviceClass *cl, const char *s, const char *d)
		 : «deviceImpl»(cl, s, d)
		{
			«cls.protectedArea("constructor_3", "init_device();", false)»
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
			«cls.protectedArea("delete_device", "Delete device allocated objects", true)»
		}
	'''
	
	//======================================================
	// Define init_device() and get_device_properies() methods
	//======================================================
	def globalMethods(PogoDeviceClass cls) '''
		//--------------------------------------------------------
		/**
		 *	Method      : «cls.name»::init_device()
		 *	Description : //	will be called at device initialization.
		 */
		//--------------------------------------------------------
		void «cls.name»::init_device()
		{
			DEBUG_STREAM << "«cls.name»::init_device() create device " << device_name << endl;
			«cls.protectedArea("init_device_before", "Initialization before get_device_property() call", true)»
			
			«IF cls.deviceProperties.size>0»
			//	Get the device properties from database
			get_device_property();
			«ELSE»
			//	No device property to be read from database
			«ENDIF»

			«cls.protectedArea("init_device", "Initialize device", true)»
		}
		«IF cls.deviceProperties.size>0»
		//--------------------------------------------------------
		/**
		 *	Method      : «cls.name»::get_device_property()
		 *	Description : Read database to initialize property data members.
		 */
		//--------------------------------------------------------
		void «cls.name»::get_device_property()
		{
			«cls.protectedArea("get_device_property_before", "Initialize property data members", true)»
		
			//	Read device properties from database.
			Tango::DbData	dev_prop;
			«FOR Property property : cls.deviceProperties»
				dev_prop.push_back(Tango::DbDatum("«property.name»"));
			«ENDFOR»
		
			//	is there at least one property to be read ?
			if (dev_prop.size()>0)
			{
				//	Call database and extract values
				if (Tango::Util::instance()->_UseDb==true)
					get_db_device()->get_property(dev_prop);
			
				//	get instance on «cls.name»Class to get class property
				Tango::DbDatum	def_prop, cl_prop;
				«cls.name»Class	*ds_class =
					(static_cast<«cls.name»Class *>(get_device_class()));
				int	i = -1;
		
				«FOR Property property : cls.deviceProperties»
				//	Try to initialize «property.name» from class property
				cl_prop = ds_class->get_class_property(dev_prop[++i].name);
				if (cl_prop.is_empty()==false)	cl_prop  >>  «property.name.dataMemberName»;
				else {
					//	Try to initialize «property.name» from default device value
					def_prop = ds_class->get_default_device_property(dev_prop[i].name);
					if (def_prop.is_empty()==false)	def_prop  >>  «property.name.dataMemberName»;
				}
				//	And try to extract «property.name» value from database
				if (dev_prop[i].is_empty()==false)	dev_prop[i]  >>  «property.name.dataMemberName»;

				«ENDFOR»
			}
		
			«cls.protectedArea("get_device_property_after", "Check device property data members init", true)»
		}

		«cls.simpleMethodHeader("always_executed_hook", "method always executed before any command is executed")»
		void «cls.name»::always_executed_hook()
		{
			INFO_STREAM << "«cls.name»::always_executed_hook()  " << device_name << endl;
			«cls.protectedArea("always_executed_hook", "code always executed before all requests", true)»
		}

		«cls.simpleMethodHeader("read_attr_hardware", "Hardware acquisition for attributes")»
		void «cls.name»::read_attr_hardware(TANGO_UNUSED(vector<long> &attr_list))
		{
			DEBUG_STREAM << "«cls.name»::read_attr_hardware(vector<long> &attr_list) entering... " << endl;
			«cls.protectedArea("read_attr_hardware", "Add your own code", true)»
		}
		«ENDIF»
		
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