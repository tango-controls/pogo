//+======================================================================
//
// Project:   Tango
//
// Description:  source code for Tango code generator.
//
// $Author: verdier $
//
// Copyright (C) :  2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013
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
import static extension fr.esrf.tango.pogo.generator.cpp.utils.ProtectedArea.*
import fr.esrf.tango.pogo.generator.cpp.utils.ProtectedArea
import fr.esrf.tango.pogo.generator.cpp.utils.Headers
import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.generator.cpp.utils.Attributes


//======================================================
// Define DynamicAttributeUtils.cpp file to be generated
//======================================================
class DynamicAttributeUtils {
	@Inject	extension ProtectedArea
	@Inject	extension Headers
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.utils.CppStringUtils
	@Inject	extension Attributes

	//======================================================
	// Define DynamicAttributeUtils.cpp file to be generated
	//======================================================
	def generateDynamicAttrUtilsFile (PogoDeviceClass cls) '''
		«cls.fileHeader»

		«cls.dynamicAttributes.attributesTable»
		
		namespace «cls.name»_ns
		{
		«cls.addAndRemoveMethods»


		//============================================================
		//	Tool methods to get pointer on attribute data buffer 
		//============================================================
		«FOR Attribute attribute : cls.dynamicAttributes»
			«cls.dynamicAttributeTools(attribute)»
		«ENDFOR»

		} //	namespace
	'''

	//======================================================
	// define the header file
	//======================================================
	def fileHeader (PogoDeviceClass cls) '''
		«cls.protectedArea("DynAttrUtils.cpp",
			cls.dynamicAttrUtilsFileHeader+
			"\n\n" +
			"#include <"+cls.name+".h>\n"+
			"#include <"+cls.name+"Class.h>", false)»
	'''


	//======================================================
	// define the add/remove methods
	//======================================================
	def addAndRemoveMethods(PogoDeviceClass cls) '''
		//=============================================================
		//	Add/Remove dynamic attribute methods
		//=============================================================
		
		«FOR Attribute attribute : cls.dynamicAttributes»
			«cls.addDynamicAttribute(attribute)»
			«cls.removeDynamicAttribute(attribute)»
		«ENDFOR»
	'''



	//======================================================
	// define the add dynamic attribute method
	//======================================================
	def addDynamicAttribute(PogoDeviceClass cls, Attribute attribute) '''
		//--------------------------------------------------------
		/**
		 *	Add a «attribute.name» dynamic attribute.
		 *
		«attribute.addDynamicAttributeHeaderComment»
		 */
		//--------------------------------------------------------
		«cls.addDynamicAttributeSignature(attribute, false)»
		{
			«attribute.attributeFactory(cls)»
		}
	'''

	//======================================================
	// define the remove dynamic attribute method
	//======================================================
	def removeDynamicAttribute(PogoDeviceClass cls, Attribute attribute) '''
		//--------------------------------------------------------
		/**
		 *	remove a «attribute.name» dynamic attribute.
		 *
		«attribute.removeDynamicAttributeHeaderComment»
		 */
		//--------------------------------------------------------
		«cls.removeDynamicAttributeSignature(attribute, false)»
		{
			remove_attribute(attname, true);
			«IF attribute.isScalar»
			    map<string,«attribute.strType»>::iterator ite;
			«ELSE»
			    map<string,«attribute.strType» *>::iterator ite;
			«ENDIF»
		    if ((ite=«attribute.name»_data.find(attname))!=«attribute.name»_data.end())
		    {
		    	«cls.protectedArea("remove_" + attribute.name + "_dynamic_attribute")»
				«IF attribute.attType.equals("Scalar")==false»
					if (free_it)
						delete ite->second;
				«ENDIF»
				«attribute.name»_data.erase(ite);
			}
		}
	'''

	//======================================================
	// define the tools for dynamic attribute
	//======================================================
	def dynamicAttributeTools(PogoDeviceClass cls, Attribute attribute) '''
		//--------------------------------------------------------
		/**
		 *	Return a pointer on «attribute.name» data.
		 *
		 *  parameter attname: the specified attribute name.
		 */
		//--------------------------------------------------------
		«attribute.strType» *«cls.name»::get_«attribute.name»_data_ptr(string &name)
		{
			«IF attribute.isScalar»
			    map<string,«attribute.strType»>::iterator ite;
			«ELSE»
			    map<string,«attribute.strType» *>::iterator ite;
			«ENDIF»
		    if ((ite=«attribute.name»_data.find(name))==«attribute.name»_data.end())
		    {
				TangoSys_OMemStream	tms;
				tms << "Dynamic attribute " << name << " has not been created";
				Tango::Except::throw_exception(
							(const char *)"ATTRIBUTE_NOT_FOUND",
							tms.str().c_str(),
							(const char *)"«cls.name»::get_«attribute.name»_data_ptr()");
		    }
			«IF attribute.isScalar»
				return  &(ite->second);
			«ELSE»
				return  ite->second;
			«ENDIF»
		}
	'''
}