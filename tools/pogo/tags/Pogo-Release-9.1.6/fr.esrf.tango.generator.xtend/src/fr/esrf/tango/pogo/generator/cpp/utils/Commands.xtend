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

package fr.esrf.tango.pogo.generator.cpp.utils

import fr.esrf.tango.pogo.pogoDsl.Type
import fr.esrf.tango.pogo.pogoDsl.Command
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*
import static extension fr.esrf.tango.pogo.generator.cpp.utils.CppTypeDefinitions.*

//======================================================
//	Command utilities
//======================================================
class Commands {
	@Inject	extension ProtectedArea
	@Inject	extension fr.esrf.tango.pogo.generator.common.StringUtils
	@Inject	extension InheritanceUtils

	//======================================================
	// Define the signature for command execution method
	//======================================================
	def commandExecutionMethodSignature(PogoDeviceClass cls, Command cmd, boolean declare) {
		if (declare)
			//	Method prototype
			if (cmd.isDynamic=="true") {
				if (cmd.argin.type.cppType.equals("void")) {
					"virtual " + cmd.argout.type.argoutDeclarationForSignature +  cmd.execMethod + "(" +
						 "Tango::Command &command)" + cmd.checkAbstractForProto  + ";"
				 }
				 else { // not void
					"virtual " + cmd.argout.type.argoutDeclarationForSignature +  cmd.execMethod + "(" +cmd.argin.type.arginDeclaration +
						 ",Tango::Command &command)" + cmd.checkAbstractForProto  + ";"
				 }
			} else { //	Not dynamic cmd
				"virtual " + cmd.argout.type.argoutDeclarationForSignature +  cmd.execMethod + "(" +cmd.argin.type.arginDeclaration +
						 ")" + cmd.checkAbstractForProto  + ";"
			}
		else
			//	method signature
			if (cmd.isDynamic=="true") {
				if (cmd.argin.type.cppType.equals("void")) {
					cmd.argout.type.argoutDeclarationForSignature + cls.name +
						"::" + cmd.execMethod + "(" + "Tango::Command &command)"
				}
				else { //	not void
					cmd.argout.type.argoutDeclarationForSignature + cls.name +
						"::" + cmd.execMethod + "(" + cmd.argin.type.arginDeclaration +", Tango::Command &command)"
				}
			} else { // not dynamic cmd
				cmd.argout.type.argoutDeclarationForSignature + cls.name +
					"::" + cmd.execMethod + "(" + cmd.argin.type.arginDeclaration +")"
			}
	}
	
	//======================================================
	// Manage the argin declaration
	//======================================================
	def arginDeclaration(Type type) {
		if (type.cppType.equals("void"))
			 ""
		else if (type.cppType.endsWith("Array") || type.cppType.contains("Encoded"))
			 "const " + type.cppType + " *argin"
		else type.cppType + " argin"
	}
	//======================================================
	// Manage the argout declaration
	//======================================================
	def argoutDeclarationForSignature(Type type) {
		if (type.cppType.equals("void"))
			 "void "
		else if (type.cppType.endsWith("Array") || type.cppType.contains("Encoded"))
			 type.cppType + " *"
		else type.cppType + " "
	}
	//======================================================
	//======================================================
	def argoutDeclaration(Command command) {
		if (command.name.equals("State") || command.name.equals("Status") ||
			command.argout.type.cppType.equals("void") ) {
				""
		}
		else {
			if (command.argout.type.cppType.endsWith("Array") ||
				command.argout.type.cppType.contains("Encoded"))
				command.argout.type.cppType + " *argout;"
			else
				command.argout.type.cppType + " argout;"
		}
	}


	//======================================================
	//	Output argument description 
	//======================================================
	def argoutDescription(Command cmd) {
		if (cmd.argout.description.empty)
			"none"
		else
			cmd.argout.description
	}

	//======================================================
	// Define the command execution method
	//======================================================
	def commandExecutionMethod(PogoDeviceClass cls, Command command) '''
		«cls.commandExecutionMethodSignature(command, false)»
		{
			«command.argoutDeclaration»
			«IF command.isDynamic=="true"»
				DEBUG_STREAM << "«cls.name»::" << command.get_name() << "  - " << device_name << endl;
			«ELSE»
				DEBUG_STREAM << "«cls.name»::«command.name»()  - " << device_name << endl;
			«ENDIF»
			«cls.openProtectedArea(command.execMethod)»
			
			«IF command.name.equals("State")»
				Tango::DevState	argout = Tango::UNKNOWN; // replace by your own algorithm
			«ELSEIF command.name.equals("Status")»
				string	status = "Device is OK";
			«ENDIF»
			//	Add your own code
			
			«cls.closeProtectedArea(command.execMethod)»
			«IF command.name.equals("State")»
				set_state(argout);    // Give the state to Tango.
				if (argout!=Tango::ALARM)
					DeviceImpl::dev_state();
				return get_state();  // Return it after Tango management.
			«ELSEIF command.name.equals("Status")»
				set_status(status);               // Give the status to Tango.
				return DeviceImpl::dev_status();  // Return it.
			«ELSE»
				«IF command.argout.type.cppType.equals("void")==false»
					return argout;
				«ENDIF»
			«ENDIF»
		}
	'''


	//======================================================
	// dserverClass.cpp command execute method
	//======================================================
	def executeCmdExtract(Command cmd) {
		if (cmd.argin.type.cppType()=="void")
			null
		else {
			if (cmd.argin.type.cppType().toString().endsWith("Array"))
				"const " + cmd.argin.type.cppType().toString()+
				"	*argin;\n	extract(in_any, argin);"
			else
				cmd.argin.type.cppType().toString()+
				"	argin;\n	extract(in_any, argin);"
		}
	}

	//======================================================
	// Define command classes
	//======================================================
	def commandClass(PogoDeviceClass cls, Command command) '''
		//	Command «command.name» class definition
		class «command.name»Class : public Tango::Command
		{
		public:
			«command.name»Class(const char   *name,
			               Tango::CmdArgType in,
						   Tango::CmdArgType out,
						   const char        *in_desc,
						   const char        *out_desc,
						   Tango::DispLevel  level)
			:Command(name,in,out,in_desc,out_desc, level)	{};
		
			«command.name»Class(const char   *name,
			               Tango::CmdArgType in,
						   Tango::CmdArgType out)
			:Command(name,in,out)	{};
			~«command.name»Class() {};
			
			virtual CORBA::Any *execute (Tango::DeviceImpl *dev, const CORBA::Any &any);
			virtual bool is_allowed (Tango::DeviceImpl *dev, const CORBA::Any &any)
			{return (static_cast<«cls.name» *>(dev))->is_«command.name»_allowed(any);}
		};
		
	'''
	
	//==============================================================
	// Define command class execution method (for DeviceClass.cpp)
	//==============================================================
	def classExecuteMethodArgin(Command command) '''
		«IF command.argin.type.cppType.equals("void")»
			TANGO_UNUSED(const CORBA::Any &in_any))
		«ELSE»
			const CORBA::Any &in_any)
		«ENDIF»
	'''
	//==============================================================
	def classExecuteMethod(PogoDeviceClass cls, Command command) '''
		//--------------------------------------------------------
		/**
		 * method : 		«command.name»Class::execute()
		 * description : 	method to trigger the execution of the command.
		 *
		 * @param	device	The device on which the command must be executed
		 * @param	in_any	The command input data
		 *
		 *	returns The command output data (packed in the Any object)
		 */
		//--------------------------------------------------------
		CORBA::Any *«command.name»Class::execute(Tango::DeviceImpl *device, «command.classExecuteMethodArgin»
		{
			cout2 << "«command.name»Class::execute(): arrived" << endl;
			«command.extractArgin»
			«cls.returnArgout(command)»
		}

	'''
	//======================================================
	def extractArgin(Command cmd) {
		if (cmd.argin.type.cppType.equals("void"))
			""
		else 
			cmd.argin.type.arginDeclaration + ";\n" +
			"extract(in_any, argin);"
	}
	//======================================================
	def arginParam(Command cmd) {
		if(cmd.argin.type.cppType.equals("void")) "" else "argin"
	}
	//======================================================
	def returnArgout(PogoDeviceClass cls, Command cmd) '''
		«IF cmd.argout.type.cppType.equals("void")»
			«IF cmd.isDynamic=="true"»
				((static_cast<«cls.name» *>(device))->«cmd.execMethod»(*this));
			«ELSE»
				((static_cast<«cls.name» *>(device))->«cmd.execMethod»(«cmd.arginParam»));
			«ENDIF»
			return new CORBA::Any();
		«ELSE»
			«IF cmd.isDynamic=="true"»
				return insert((static_cast<«cls.name» *>(device))->«cmd.execMethod»(«cmd.arginParam», *this));
			«ELSE»
				return insert((static_cast<«cls.name» *>(device))->«cmd.execMethod»(«cmd.arginParam»));
			«ENDIF»
		«ENDIF»
	'''

	//======================================================
	

	//======================================================
	//	Define the command factory
	//======================================================
	def commandFactory(Command command) '''
		«command.name»Class	*p«command.name»Cmd =
			new «command.name»Class("«command.name»",
				«command.argin.type.cppTypeEnum», «command.argout.type.cppTypeEnum»,
				"«command.argin.description.oneLineString»",
				"«command.argout.description.oneLineString»",
				Tango::«command.displayLevel»);
		«IF command.polledPeriod.getIntegerValue > 0»
			p«command.name»Cmd->set_polling_period(«command.polledPeriod»);
		«ENDIF»
		command_list.push_back(p«command.name»Cmd);
	'''

	//======================================================
	//	Define the factory for dynamic command
	//======================================================
	def dynamicCommandFactory(Command command) '''
		«command.name»Class	*p«command.name»Cmd =
			new «command.name»Class(cmdname.c_str(),
				«command.argin.type.cppTypeEnum», «command.argout.type.cppTypeEnum»,
				"«command.argin.description.oneLineString»",
				"«command.argout.description.oneLineString»",
				Tango::«command.displayLevel»);
		«IF command.polledPeriod.getIntegerValue > 0»
			p«command.name»Cmd->set_polling_period(«command.polledPeriod»);
		«ENDIF»
		add_command(p«command.name»Cmd, device);
	'''

	//	Add code for State and status polling if needed
	def checkStateStatusPolling(Command command) '''
		«IF command.polledPeriod.getIntegerValue > 0»
			//	Set polling perod for command «command.name»
			Tango::Command	&«command.name.toLowerCase»Cmd = get_cmd_by_name("«command.name»");
			«command.name.toLowerCase»Cmd.set_polling_period(«command.polledPeriod»);

		«ENDIF»
	'''
}