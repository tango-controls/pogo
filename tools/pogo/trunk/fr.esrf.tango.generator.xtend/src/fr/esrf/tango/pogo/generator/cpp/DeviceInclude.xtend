//+======================================================================
//
// Project:   Tango
//
// Description:  source code for Tango code generator.
//
// $Author: verdier $
//
// Copyright (C) :  2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013,2014
//					European Synchrotron Radiation Facility
//                  BP 220, Grenoble 38043
//                  FRANCE
//
// This file is part of Tango.
//
// Tango is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// Tango is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
// $Revision: $
// $Date:  $
//
// $HeadURL: $
//
//-======================================================================

package fr.esrf.tango.pogo.generator.cpp

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.pogoDsl.Command
import fr.esrf.tango.pogo.pogoDsl.Property
import static extension fr.esrf.tango.pogo.generator.cpp.utils.CppStringUtils.*
import static extension fr.esrf.tango.pogo.generator.cpp.utils.ProtectedArea.*
import fr.esrf.tango.pogo.generator.cpp.utils.ProtectedArea
import static extension fr.esrf.tango.pogo.generator.cpp.utils.CppTypeDefinitions.*
import static extension fr.esrf.tango.pogo.generator.cpp.utils.InheritanceUtils.*
import fr.esrf.tango.pogo.generator.cpp.utils.Headers
import fr.esrf.tango.pogo.generator.cpp.utils.Commands
import fr.esrf.tango.pogo.generator.cpp.utils.Attributes
import fr.esrf.tango.pogo.generator.cpp.utils.InheritanceUtils


//======================================================
//	Define device include file to be generated
//======================================================
class DeviceInclude  {
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.utils.CppStringUtils
	@Inject	extension ProtectedArea
	@Inject	extension Headers
	@Inject	extension Commands
	@Inject	extension Attributes
	@Inject	extension InheritanceUtils


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
		
		class «cls.name» : public «cls.inheritedClassNameForDevice»
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
		
		«cls.protectedArea("Additional Classes Definitions", "Additional Classes Definitions", true)»

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
			"#include <tango.h>\n" +
			cls.inheritanceIncludeList(false), false)»
	'''
	

	//======================================================
	// Data members for device property declarations
	//======================================================
	def declareDevicePropertyDataMembers(PogoDeviceClass cls) '''
		«IF cls.deviceProperties.size>0»
			//	Device property data members
			public:
				«FOR Property property : cls.deviceProperties»
					«IF property.concreteHere»
						//	«property.name»:	«property.description.comments("//  ")»
						«property.type.cppPropType»	«property.name.dataMemberName»;
					«ENDIF»
				«ENDFOR»
				«IF cls.deviceProperties.hasMandatoryProperty»

					bool	mandatoryNotDefined;
				«ENDIF»
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
					«IF isTrue(attr.status.concreteHere) && attr.isRead»
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
			/*
			 *	will be called at device destruction or at init command.
			 */
			void delete_device();
			/*
			 *	Initialize the device
			 */
			virtual void init_device();
			«IF cls.deviceProperties.size>0 && isTrue(cls.description.hasConcreteProperty)»
				/*
				 *	Read the device properties from database
				 */
				void get_device_property();
			«ENDIF»
			/*
			 *	Always executed method before execution command method.
			 */
			virtual void always_executed_hook();

			«IF cls.deviceProperties.hasMandatoryProperty»
				/*
				 *	Check if mandatory property has been set
				 */
				 void check_mandatory_property(Tango::DbDatum &class_prop, Tango::DbDatum &dev_prop);
			«ENDIF»

	'''



	//======================================================
	// Attribute declarations
	//======================================================
	def declareAttributes(PogoDeviceClass cls) '''
		//	Attribute methods
		public:
			«cls.simpleMethodHeader1("read_attr_hardware", "Hardware acquisition for attributes.")»
			virtual void read_attr_hardware(vector<long> &attr_list);
			«IF cls.hasWritableAttribute»
				«cls.simpleMethodHeader1("write_attr_hardware", "Hardware writing for attributes.")»
				virtual void write_attr_hardware(vector<long> &attr_list);
			«ENDIF»
		«IF cls.attributes.size()>0»

			«FOR Attribute attr : cls.attributes»
				«IF attr.alreadyOverloaded==false»
					«attr.attributePrototypeMethodHeader»
						«IF attr.isRead»
							virtual void «attr.readAttrubuteMethod»(Tango::Attribute &attr)«attr.checkAbstractForProto»;
						«ENDIF»
						«IF attr.isWrite»
							virtual void «attr.writeAttrubuteMethod»(Tango::WAttribute &attr)«attr.checkAbstractForProto»;
						«ENDIF»
						virtual bool is_«attr.name»_allowed(Tango::AttReqType type);
				«ENDIF»
			«ENDFOR»
		«ENDIF»

		«IF cls.dynamicAttributes.size()>0»
			//	Dynamic attribute methods
			public:
			«FOR Attribute attr : cls.dynamicAttributes»
			
				«attr.attributePrototypeMethodHeader»
				«IF attr.isRead»
					virtual void «attr.readAttrubuteMethod»(Tango::Attribute &attr);
				«ENDIF»
				«IF attr.isWrite»
					virtual void «attr.writeAttrubuteMethod»(Tango::WAttribute &attr);
				«ENDIF»
				virtual bool is_«attr.name»_allowed(Tango::AttReqType type);
				«cls.addDynamicAttributeSignature(attr, true)»
				«cls.removeDynamicAttributeSignature(attr, true)»
				«attr.dataType.cppType» *get_«attr.name»_data_ptr(string &name);
				«IF attr.isScalar»
					map<string,«attr.dataType.cppType»>	   «attr.name»_data;
				«ELSE»
					map<string,«attr.dataType.cppType» *>	   «attr.name»_data;
				«ENDIF»
			«ENDFOR»
		«ENDIF»

			«cls.simpleMethodHeader("add_dynamic_attributes", "Add dynamic attributes if any.")»
			void add_dynamic_attributes();



	'''
	
	//======================================================
	// Command declarations
	//======================================================
	def declareCommands(PogoDeviceClass cls) '''
		«IF cls.commands.size()>0»
		//	Command related methods
		public:
			«FOR Command command : cls.commands»
				«IF command.isAbstract || command.isConcreteHere»
					«command.commandExecutionMethodHeader»
					«cls.commandExecutionMethodSignature(command, true)»
					«IF command.name.equals("State")==false && command.name.equals("Status")==false»
						virtual bool is_«command.name»_allowed(const CORBA::Any &any);
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDIF»

		«IF cls.dynamicCommands.size()>0»
			//	Dynamic commands methods
			public:
				«FOR Command command : cls.dynamicCommands»
					«command.commandExecutionMethodHeader»
					«cls.commandExecutionMethodSignature(command, true)»
					virtual bool is_«command.name»_allowed(const CORBA::Any &any);
					«cls.addDynamicCommandSignature(command, true)»
					«cls.removeDynamicCommandSignature(command, true)»
				«ENDFOR»
		«ENDIF»
		
			«cls.simpleMethodHeader("add_dynamic_commands", "Add dynamic commands if any.")»
			void add_dynamic_commands();

	'''
}