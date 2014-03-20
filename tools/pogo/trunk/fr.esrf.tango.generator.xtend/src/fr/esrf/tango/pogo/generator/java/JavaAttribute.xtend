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

package fr.esrf.tango.pogo.generator.java

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import static extension fr.esrf.tango.pogo.generator.java.JavaUtils.*
import static extension fr.esrf.tango.pogo.generator.java.ProtectedArea.*
import static extension fr.esrf.tango.pogo.generator.java.JavaTypeDefinitions.*
import com.google.inject.Inject
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*
import fr.esrf.tango.pogo.generator.common.StringUtils
import fr.esrf.tango.pogo.pogoDsl.Attribute

class JavaAttribute {

	@Inject extension JavaUtils
	@Inject extension ProtectedArea
	@Inject extension StringUtils


	//======================================================
	// define code to get and set attributes
	//======================================================
	def attributeMethods(PogoDeviceClass cls) '''
		«FOR Attribute attribute : cls.attributes»
			«cls.declareAttributeMember(attribute)»
			«cls.getMethod(attribute)»
			«IF attribute.rwType.contains("WRITE")»
				«cls.setMethod(attribute)»
			«ENDIF»

		«ENDFOR»
	'''

	
	//======================================================
	// define code to declare attributes
	//======================================================
	def declareAttributeMember(PogoDeviceClass cls, Attribute attribute) '''
		/**
		 * Attribute «attribute.name», «attribute.strJavaType», «attribute.attType», «attribute.rwType»
		 * description:
		 *     «attribute.properties.description.comments("*     ")»
		 */
		«attribute.declareParameters»
		«attribute.declareProperties»
		«attribute.stateMachine»
		private «attribute.strFullJavaType» «attribute.name.dataMemberName»«attribute.allocation»;
	'''

	//======================================================
	// define code to get attribute
	//======================================================
	def getMethod(PogoDeviceClass cls, Attribute attribute) '''
		/**
		 * Read attribute «attribute.name»
		 * 
		 * @return attribute value
		 * @throws DevFailed if read attribute failed.
		 */
		public org.tango.server.attribute.AttributeValue «attribute.attributeMethodName(true)»() throws DevFailed {
			xlogger.entry();
			org.tango.server.attribute.AttributeValue
				attributeValue = new org.tango.server.attribute.AttributeValue();
			«cls.protectedArea("get"+attribute.name, "Put read attribute code here", true)»
			attributeValue.setValue(«attribute.name.dataMemberName»);
			xlogger.exit();
			return attributeValue;
		}
	'''
	//======================================================
	// define code to Set attribute
	//======================================================
	def setMethod(PogoDeviceClass cls, Attribute attribute) '''
		/**
		 * Write attribute «attribute.name»
		 * @param  «attribute.name.dataMemberName» value to write
		 * @throws DevFailed if read attribute failed.
		 */
		public void «attribute.attributeMethodName(false)»(«attribute.strFullJavaType» «attribute.name.dataMemberName») throws DevFailed {
			xlogger.entry();
			«cls.protectedArea("set" + attribute.name, "Put write attribute code here", true)»
			xlogger.exit();
		}
	'''

}