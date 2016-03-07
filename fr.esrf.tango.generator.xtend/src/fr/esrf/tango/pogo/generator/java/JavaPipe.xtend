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

package fr.esrf.tango.pogo.generator.java

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*
import fr.esrf.tango.pogo.pogoDsl.Pipe

class JavaPipe {

	@Inject extension JavaUtils
	@Inject extension ProtectedArea

	//======================================================
	// define code to get and set pipes
	//======================================================
	def pipeMethods(PogoDeviceClass cls) '''
		«FOR Pipe pipe : cls.pipes»
			«cls.declarePipeMember(pipe)»
			«cls.getMethod(pipe)»
			«IF pipe.rwType.contains("WRITE")»
				«cls.setMethod(pipe)»
			«ENDIF»
		«ENDFOR»
	'''

	
	//======================================================
	// define code to declare pipes
	//======================================================
	def declarePipeMember(PogoDeviceClass cls, Pipe pipe) '''
		/**
		 * Pipe «pipe.name»
		 * description:
		 *     «pipe.description.comments("*     ")»
		 */
		@Pipe(displayLevel=DispLevel._«pipe.displayLevel», label="«pipe.label»")
		private PipeValue «pipe.name.dataMemberName»;
	'''

	//======================================================
	// define code to get pipe
	//======================================================
	def getMethod(PogoDeviceClass cls, Pipe pipe) '''
		/**
		 * Read Pipe «pipe.name»
		 * 
		 * @return attribute value
		 * @throws DevFailed if read pipe failed.
		 */
		public PipeValue get«pipe.name»() throws DevFailed {
			xlogger.entry();
			«cls.protectedArea("get"+pipe.name, "Put read pipe code here", true)»
			xlogger.exit();
			return «pipe.name.dataMemberName»;
		}
	'''
	//======================================================
	// define code to Set attribute
	//======================================================
	def setMethod(PogoDeviceClass cls, Pipe pipe) '''
		/**
		 * Write Pipe «pipe.name»
		 * @param  pipeValue value to write
		 * @throws DevFailed if write pipe failed.
		 */
		public void set«pipe.name»(PipeValue pipeValue) throws DevFailed {
			xlogger.entry();
			«cls.protectedArea("set" + pipe.name,
				"this." + pipe.name.dataMemberName + " = " + "pipeValue;", false)»
			xlogger.exit();
		}
	'''

}