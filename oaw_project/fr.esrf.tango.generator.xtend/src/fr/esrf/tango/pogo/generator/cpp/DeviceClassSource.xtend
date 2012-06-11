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
import static extension fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea.*
import fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea


class DeviceClassSource implements IGenerator {
	@Inject
	extension ProtectedArea
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.Headers
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.Attributes
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.Commands
	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.Properties

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
		«cls.constructors»
		«cls.commandRelatedMethods»
		«cls.propertyRelatedMethod»
		} //	namespace
	'''





	//======================================================
	// Define the header file
	//======================================================
	def fileHeader (PogoDeviceClass cls) '''
		«cls.protectedAreaClass(".cpp",
			cls.deviceClassSourceFileHeader+
			"\n\n" +
			"#include <"+cls.name+".h>\n"+
			"#include <"+cls.name+"Class.h>", false)»

		//-------------------------------------------------------------------
		/**
		 *	Create «cls.name»Class singleton and
		 *	return it in a C function for Python usage
		 */
		//-------------------------------------------------------------------
		extern "C" {
		#ifdef _TG_WINDOWS_
		
		__declspec(dllexport)
		
		#endif
		
			Tango::DeviceClass *_create_«cls.name»_class(const char *name) {
				return «cls.name»_ns::«cls.name»Class::init(name);
			}
		}
	'''


	//==========================================================
	// Define command related methods
	//==========================================================
	def commandRelatedMethods(PogoDeviceClass cls) '''
		«IF cls.commands.size>2»
			«FOR Command command : cls.commands»
				«IF command.name.equals("State")==false && command.name.equals("Status")==false»
					«cls.classExecuteMethod(command)»
				«ENDIF»
			«ENDFOR»
		«ENDIF»
	'''

	
	//==========================================================
	// Define singleto constructor, get_intance and init methods
	//==========================================================
	def constructors(PogoDeviceClass cls) '''
		//===================================================================
		//	Initialize pointer for singleton pattern
		//===================================================================
		«cls.name»Class *«cls.name»Class::_instance = NULL;
		
		//--------------------------------------------------------
		/**
		 * method : 		«cls.name»Class::«cls.name»Class(string &s)
		 * description : 	constructor for the «cls.name»Class
		 *
		 * @param s	The class name
		 */
		//--------------------------------------------------------
		«cls.name»Class::«cls.name»Class(string &s):DeviceClass(s)
		{
			cout2 << "Entering «cls.name»Class constructor" << endl;
			set_default_property();
			get_class_property();
			write_class_property();
		
			«cls.protectedAreaClass("constructor", "", false)»
		
			cout2 << "Leaving «cls.name»Class constructor" << endl;
		}

		//--------------------------------------------------------
		/**
		 * method : 		«cls.name»Class::~«cls.name»Class()
		 * description : 	destructor for the «cls.name»Class
		 */
		//--------------------------------------------------------
		«cls.name»Class::~«cls.name»Class()
		{
			«cls.protectedAreaClass("destructor", "", false)»

			_instance = NULL;
		}
		
		
		//--------------------------------------------------------
		/**
		 * method : 		«cls.name»Class::init
		 * description : 	Create the object if not already done.
		 *                  Otherwise, just return a pointer to the object
		 *
		 * @param	name	The class name
		 */
		//--------------------------------------------------------
		«cls.name»Class *«cls.name»Class::init(const char *name)
		{
			if (_instance == NULL)
			{
				try
				{
					string s(name);
					_instance = new «cls.name»Class(s);
				}
				catch (bad_alloc)
				{
					throw;
				}		
			}		
			return _instance;
		}
		
		//--------------------------------------------------------
		/**
		 * method : 		«cls.name»Class::instance
		 * description : 	Check if object already created,
		 *                  and return a pointer to the object
		 */
		//--------------------------------------------------------
		«cls.name»Class *«cls.name»Class::instance()
		{
			if (_instance == NULL)
			{
				cerr << "Class is not initialised !!" << endl;
				exit(-1);
			}
			return _instance;
		}


	'''
}