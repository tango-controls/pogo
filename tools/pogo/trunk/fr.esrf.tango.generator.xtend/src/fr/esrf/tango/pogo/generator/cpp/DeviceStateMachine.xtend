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
import static extension fr.esrf.tango.pogo.generator.cpp.utils.CppStringUtils.*
import fr.esrf.tango.pogo.generator.cpp.utils.ProtectedArea
import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.pogoDsl.Command
import fr.esrf.tango.pogo.generator.cpp.utils.InheritanceUtils
import fr.esrf.tango.pogo.generator.cpp.utils.Headers
import fr.esrf.tango.pogo.generator.cpp.utils.CppStringUtils
import fr.esrf.tango.pogo.pogoDsl.Pipe

//======================================================
// Define Device state machine .cpp file to be generated
//======================================================
class DeviceStateMachine {
	
	@Inject	extension ProtectedArea
	@Inject	extension CppStringUtils
	@Inject	extension Headers
	@Inject	extension InheritanceUtils

	//======================================================
	// Define ClassFactory.cpp file to be generated
	//======================================================
	def generateStateMachineSourceFile (PogoDeviceClass cls) '''
		«cls.fileHeader»
		
		«cls.states.statesTable»


		namespace «cls.name»_ns
		{
		//=================================================
		//		Attributes Allowed Methods
		//=================================================
		«cls.attributesStateMachine»

		«IF cls.pipes.size>0»
			//=================================================
			//		pipe Allowed Methods
			//=================================================
			«cls.pipeStateMachine»
		«ENDIF»

		//=================================================
		//		Commands Allowed Methods
		//=================================================
		«cls.commandsStateMachine»


		«cls.protectedArea(cls.name+"StateAllowed"+".AdditionalMethods", "Additional Methods", true)»

		}	//	End of namespace
	'''

	//======================================================
	// define the header file
	//======================================================
	def fileHeader (PogoDeviceClass cls) '''
		«(cls.name+"StateMachine").openProtectedArea(".cpp")»
		«cls.stateMachineFileHeader»
		
		#include <«cls.name».h>
		
		«cls.closeProtectedArea(cls.stateMachineFileName)»
	'''
	
	
	
	
	//======================================================
	// define commands State Machine
	//======================================================
	def commandsStateMachine(PogoDeviceClass cls) '''
		«FOR Command command : cls.commands»
			«IF command.name.equals("State")==false && command.name.equals("Status")==false»
				«IF command.overrides==false»
					«cls.commandStateMachine(command)»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
		«FOR Command command : cls.dynamicCommands»
			«IF command.overrides==false»
				«cls.commandStateMachine(command)»
			«ENDIF»
		«ENDFOR»
	'''
	
	//======================================================
	// define one command State Machine
	//======================================================
	def commandStateMachine(PogoDeviceClass cls, Command command) '''
		
		«cls.simpleMethodHeader("is_"+command.name+"_allowed", "Execution allowed for "+command.name+" attribute")»
		bool «cls.name»::is_«command.name»_allowed(TANGO_UNUSED(const CORBA::Any &any))
		{
			«IF command.excludedStates.empty»
				//	Not any excluded states for «command.name» command.
				«cls.protectedArea(command.name+"StateAllowed")»
				return true;
			«ELSE»
				//	Compare device state with not allowed states.
				if («command.excludedStates.ifContentFromList»)
				{
				«cls.protectedArea(command.name+"StateAllowed")»
					return false;
				}
				return true;
			«ENDIF»
		}
	'''
	
	//======================================================
	// define attributes State Machine
	//======================================================
	def attributesStateMachine(PogoDeviceClass cls) '''
		«FOR Attribute attribute : cls.attributes»
			«IF attribute.alreadyOverloaded==false»
				«cls.attributeStateMachine(attribute)»
			«ENDIF»
		«ENDFOR»
		«FOR Attribute attribute : cls.dynamicAttributes»
			«cls.attributeStateMachine(attribute)»
		«ENDFOR»
	'''

	//======================================================
	// define one attribute State Machine
	//======================================================
	def attributeStateMachine(PogoDeviceClass cls, Attribute attribute) '''
		
		«cls.simpleMethodHeader("is_"+attribute.name+"_allowed", "Execution allowed for "+attribute.name+" attribute")»
		bool «cls.name»::is_«attribute.name»_allowed(TANGO_UNUSED(Tango::AttReqType type))
		{
			«IF attribute.isWrite»
				«IF attribute.writeExcludedStates.empty»
					//	Not any excluded states for «attribute.name» attribute in Write access.
					«cls.protectedArea(attribute.name+"StateAllowed_WRITE")»
				«ELSE»
					//	Check access type.
					if ( type!=Tango::READ_REQ )
					{
						//	Compare device state with not allowed states for WRITE 
						if («attribute.writeExcludedStates.ifContentFromList»)
						{
						«cls.protectedArea(attribute.name+"StateAllowed_WRITE")»
							return false;
						}
						return true;
					}
					«IF attribute.isRead»
					else
					«ENDIF»
				«ENDIF»
			«ENDIF»

			«IF attribute.isRead»
				«IF attribute.readExcludedStates.empty»
					//	Not any excluded states for «attribute.name» attribute in read access.
					«cls.protectedArea(attribute.name+"StateAllowed_READ")»
				«ELSE»
					//	Check access type.
					if ( type==Tango::READ_REQ )
					{
						//	Compare device state with not allowed states for READ 
						if («attribute.readExcludedStates.ifContentFromList»)
						{
						«cls.protectedArea(attribute.name+"StateAllowed_READ")»
							return false;
						}
						return true;
					}
				«ENDIF»
			«ENDIF»
			return true;
		}
	'''

	//======================================================
	// define pipes State Machine
	//======================================================
	def pipeStateMachine(PogoDeviceClass cls) '''
		«FOR Pipe pipe : cls.pipes»
			«cls.simpleMethodHeader("is_"+pipe.name+"_allowed", "Execution allowed for "+pipe.name+" pipe")»
			bool «cls.name»::is_«pipe.name»_allowed(TANGO_UNUSED(Tango::PipeReqType type))
			{
				«IF pipe.rwType.contains("WRITE")»
					«IF pipe.writeExcludedStates.empty»
						//	Not any excluded states for «pipe.name» pipe in Write access.
						«cls.protectedArea(pipe.name+"StateAllowed_WRITE")»
					«ELSE»
						//	Check access type.
						if ( type==Tango::WRITE_REQ )
						{
							//	Compare device state with not allowed states for WRITE 
							if («pipe.writeExcludedStates.ifContentFromList»)
							{
							«cls.protectedArea(pipe.name+"StateAllowed_WRITE")»
								return false;
							}
							return true;
						}
						else
					«ENDIF»
				«ENDIF»
				«IF pipe.readExcludedStates.empty»
					//	Not any excluded states for «pipe.name» pipe in read access.
					«cls.protectedArea(pipe.name+"StateAllowed_READ")»
					«IF pipe.writeExcludedStates.empty»
						return true;
					«ENDIF»
				«ELSE»
					//	Check access type.
					if ( type==Tango::READ_REQ )
					{
						//	Compare device state with not allowed states for READ 
						if («pipe.readExcludedStates.ifContentFromList»)
						{
						«cls.protectedArea(pipe.name+"StateAllowed_READ")»
							return false;
						}
					}
					return true;
				«ENDIF»
			}
		«ENDFOR»
	'''

	
	
}