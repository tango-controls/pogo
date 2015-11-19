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
import static extension fr.esrf.tango.pogo.generator.java.JavaTypeDefinitions.*
import com.google.inject.Inject
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*
import fr.esrf.tango.pogo.generator.common.Headers
import fr.esrf.tango.pogo.pogoDsl.Command

class JavaDynamicCommand {

	@Inject extension JavaUtils
	@Inject extension Headers
	@Inject extension ProtectedArea

	//======================================================
	// define code to declare attributes class
	//======================================================
	def generateJavaDynamicCommandClassFile(PogoDeviceClass cls, Command command) '''
		«cls.header(command)»

		/**
		 * Dynamic command «command.name», «command.argin.type.javaType», «command.argout.type.javaType»
		 * description:
		 *     «command.description.comments("*     ")»
		 */
		public class «command.name» implements ICommandBehavior {

			/**	The command name */
			private String  commandName;

			«cls.protectedArea(command.name+"." + "dataMembers", "Put your data member declarations", true)»

			«cls.constructor(command)»

			«cls.getConfigurationMethod(command)»

			«cls.stateMachineMethod(command)»

			«cls.executeMethod(command)»

			«cls.protectedArea(command.name+"." + "methods", "Put your own methods", true)»
		}
	'''
	//======================================================
	// define code for file header
	//======================================================
	def header(PogoDeviceClass cls, Command command) '''
		«cls.openProtectedArea(command.name+".java")»
		«(command.name+".java").fileHeader(
			"Java source for the dynamic command " + command.name +".\n" +
			"this command belongs to the " + cls.name + " class.",
			cls.description.title,
			cls.description.license,
			cls.description.copyright
		)»

		«cls.closeProtectedArea(command.name+".java")»

		package «cls.javaDevicePackage»;

		import org.tango.DeviceState;
		import fr.esrf.TangoDs.TangoConst;
		import org.tango.server.StateMachineBehavior;

		//	Import Tango IDL types
		import fr.esrf.Tango.*;
		import org.tango.server.command.CommandConfiguration;
		import org.tango.server.command.ICommandBehavior;

		«cls.protectedArea(command.name+"." + "addImports")»

	'''

	//======================================================
	// define code for constructor
	//======================================================
	def constructor(PogoDeviceClass cls, Command command) '''
		/**
		 * Dynamic command «command.name» constructor
		 * @param commandName The dynamic command name
		 */
		public «command.name»(String commandName) {
			this.commandName = commandName;
		}
	'''


	//======================================================
	// define code for getConfiguration() method
	//======================================================
	def getConfigurationMethod(PogoDeviceClass cls, Command command) '''
		/**
		 * Build and return the configuration for dynamic command «command.name».
		 * @return the configuration for dynamic command «command.name».
		 * @throws DevFailed in case of configuration error.
		 */
		@Override
		public CommandConfiguration getConfiguration() throws DevFailed {
			CommandConfiguration  config = new CommandConfiguration();
			config.setName(commandName);
			config.setInTangoType(«command.argin.type.javaTypeConstants»);
			config.setInTypeDesc("«command.argin.description.oneLineString»");
			config.setOutTangoType(«command.argout.type.javaTypeConstants»);
			config.setOutTypeDesc("«command.argout.description.oneLineString»");
			config.setDispLevel(DispLevel.«command.displayLevel»);
			«IF command.polledPeriod!=null && command.polledPeriod!="0"»
				config.setPolled(true);
				config.setPollingPeriod(«command.polledPeriod»);
			«ENDIF»
			return config;
		}
	'''
	/*
	 * 
	 */
	
	//======================================================
	// define code for stateMachine() method
	//======================================================
	def stateMachineMethod(PogoDeviceClass cls, Command command) '''
		/**
		 * Get dynamic command state machine
		 * @return the command state machine
		 * @throws DevFailed if the state machine computation failed.
		 */
		@Override
		public StateMachineBehavior getStateMachine() throws DevFailed {
			StateMachineBehavior stateMachine = new StateMachineBehavior();
			«command.stateMachineForDynamic»
			«cls.protectedArea(command.name+"." + "getStateMachine")»
			return stateMachine;
		}
	'''



	//======================================================
	// define code for execute() method
	//======================================================
	def executeMethod(PogoDeviceClass cls, Command command) '''
		/**
		 * Execute the dynamic command «command.name»
		 * 
		«IF command.argin.type.javaType.equals("void")==false»
			 * @param argIn «command.argin.description.comments("*              ")»
		«ENDIF»
		«IF command.argout.type.javaType.equals("void")==false»
		 * @return  «command.argout.description.comments("*          ")»
		«ENDIF»
		 * @throws DevFailed if the command execution failed.
		 */
		@Override
		public Object execute(Object argIn) throws DevFailed {
			«IF command.argout.type.javaType.equals("void")==false»
				«command.argout.type.javaType»	argOut;
				«cls.protectedArea(command.name+"." + "execute")»
				return argOut;
			«ELSE»
				«cls.protectedArea(command.name+"." + "execute")»
				return null;
			«ENDIF»
		}
	'''

}