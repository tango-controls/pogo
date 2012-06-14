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
import fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea


//======================================================
//	Define deviceClass include file to be generated
//======================================================
class DeviceClassInclude implements IGenerator {
	@Inject	extension ProtectedArea
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.global.Headers
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.global.Commands
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.global.Attributes
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.global.Properties

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	}
	
	//======================================================
	// Define device include file to be generated
	//======================================================
	def generateDeviceClassIncludeFile (PogoDeviceClass cls) '''
		«cls.fileHeader»
		
		
		namespace «cls.name»_ns
		{
		«cls.protectedAreaClass("classes for dynamic creation", "", false)»
		«IF cls.attributes.size>0»
			
			//=========================================
			//	Define classes for attributes
			//=========================================
			«cls.attributeClasses»
		«ENDIF»
		«IF cls.commands.size>2»
			
			//=========================================
			//	Define classes for commands
			//=========================================
			«cls.commandClasses»
		«ENDIF»

		/**
		 *	The «cls.name»Class singleton definition
		 */
		
		class
		#ifdef _TG_WINDOWS_
			__declspec(dllexport)
		#endif
		«cls.name»Class : public Tango::DeviceClass
		{
			«cls.protectedAreaClass("dditionnal DServer data members", "", false)»

			«cls.classPropertyDeclarations»
			«cls.publicMethodPrototypes»
			«cls.protectedMethodPrototypes»
			«privateMethodPrototypes»
		};
		
		}	//	End of namespace
		
		#endif   //	«cls.name»_H
	'''

	//======================================================
	// define the header file
	//======================================================
	def fileHeader (PogoDeviceClass cls) '''
		«cls.protectedAreaClass(".h",
			cls.deviceClassIncludeFileHeader+
			"\n\n" +
			"#ifndef " + cls.name + "Class_H\n"+
			"#define " + cls.name + "Class_H\n\n"+
			"#include <tango.h>\n"+
			"#include <" + cls.name + ".h>\n",
			 false)»
	'''
	
	//======================================================
	//	Define attribute Classes 
	//======================================================
	def attributeClasses(PogoDeviceClass cls) '''
		«FOR Attribute attribute : cls.attributes»
			«cls.attributeClass(attribute)»
		«ENDFOR»
	'''
	
	//======================================================
	//	Define connand Classes 
	//======================================================
	def commandClasses(PogoDeviceClass cls) '''
		«FOR Command command : cls.commands»
			«IF command.name.equals("State")==false && command.name.equals("Status")==false»
				«cls.commandClass(command)»
			«ENDIF»
		«ENDFOR»
	'''
	
	
	//======================================================
	// Define public methods prototypes
	//======================================================
	def publicMethodPrototypes(PogoDeviceClass cls) '''
		//	Method prototypes
			static «cls.name»Class *init(const char *);
			static «cls.name»Class *instance();
			~«cls.name»Class();
			Tango::DbDatum	get_class_property(string &);
			Tango::DbDatum	get_default_device_property(string &);
			Tango::DbDatum	get_default_class_property(string &);
		
	'''
	
	//======================================================
	// Define protected methods prototypes
	//======================================================
	def protectedMethodPrototypes(PogoDeviceClass cls) '''
		protected:
			«cls.name»Class(string &);
			static «cls.name»Class *_instance;
			void command_factory();
			void attribute_factory(vector<Tango::Attr *> &);
			void write_class_property();
			void set_default_property();
			void get_class_property();
			string get_cvstag();
			string get_cvsroot();
		
	'''
	
	//======================================================
	// Define private methods prototypes
	//======================================================
	def privateMethodPrototypes() '''
		private:
			void device_factory(const Tango::DevVarStringArray *);
			void create_static_attribute_list(vector<Tango::Attr *> &);
			void erase_dynamic_attributes(const Tango::DevVarStringArray *,vector<Tango::Attr *> &);
			vector<string>	defaultAttList;
			Tango::Attr *get_attr_object_by_name(vector<Tango::Attr *> &att_list, string attname);
	'''
}