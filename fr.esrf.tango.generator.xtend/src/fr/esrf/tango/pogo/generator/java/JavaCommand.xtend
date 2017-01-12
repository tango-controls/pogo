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
import fr.esrf.tango.pogo.pogoDsl.Command

class JavaCommand {

	@Inject extension JavaUtils
	@Inject extension ProtectedArea


	
	//======================================================
	// Define code to execute command methods
	//======================================================
	def executeCommandMethods(PogoDeviceClass cls) '''
		«FOR Command command : cls.commands»
			«IF command.name.equals("State")==false && command.name.equals("Status")==false»
				«IF command.concreteHere»
					«cls.executeCommandMethod(command)»

				«ENDIF»
			«ENDIF»
		«ENDFOR»
	'''



	//======================================================
	// Define code to execute command method
	//======================================================
	def executeCommandMethod(PogoDeviceClass cls, Command command) '''
		/**
		 * Execute command "«command.name»".
		 * description: «command.description.comments("*              ")»
		 «command.headerParameters»
		 * @throws DevFailed if command execution failed.
		 */
		«command.declareParameters»
		«command.stateMachine»
		public «command.strArgoutType» «command.name»(«command.strArginTypeDeclare») throws DevFailed {
			xlogger.entry();
			«command.strArgoutTypeDeclare»
			«cls.protectedArea(command.name.toFirstLower, "Put command code here", true)»
			xlogger.exit();
			«command.strArgoutTypeReturn»
		}
	'''
 

	//======================================================
	// Define code to Set and get state and status
	//======================================================
	def stateAndStatusMethods(PogoDeviceClass cls) '''
		/**
		 * The state of the device
		*/
		@State «cls.commands.get(0).pollingCommandCode»
		private DevState state = DevState.UNKNOWN;
		/**
		 * Execute command "State".
		 * description: This command gets the device state (stored in its 'state' data member) and returns it to the caller.
		 * @return Device state
		 * @throws DevFailed if command execution failed.
		 */
		public final DevState getState() throws DevFailed {
			«cls.protectedArea("getState", "Put state code here", true)»
			return state;
		}
		/**
		 * Set the device state
		 * @param state the new device state
		 */
		public void setState(final DevState state) {
			this.state = state;
		}

		/**
		 * The status of the device
		 */
		@Status «cls.commands.get(0).pollingCommandCode»
		private String status = "Server is starting. The device state is unknown";
		/**
		 * Execute command "Status".
		 * description: This command gets the device status (stored in its 'status' data member) and returns it to the caller.
		 * @return Device status
		 * @throws DevFailed if command execution failed.
		 */
		public final String getStatus() throws DevFailed {
			«cls.protectedArea("getStatus", "Put status code here", true)»
			return status;
		}
		/**
		 * Set the device status
		 * @param status the new device status
		 */
		public void setStatus(final String status) {
			this.status = status;
		}
	'''
}