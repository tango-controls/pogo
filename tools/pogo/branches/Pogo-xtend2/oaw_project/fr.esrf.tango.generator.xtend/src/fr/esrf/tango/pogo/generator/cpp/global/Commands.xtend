package fr.esrf.tango.pogo.generator.cpp.global

import fr.esrf.tango.pogo.pogoDsl.Type
import fr.esrf.tango.pogo.pogoDsl.Command
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static extension fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea.*
import static extension fr.esrf.tango.pogo.generator.cpp.global.StringUtils.*
import static extension fr.esrf.tango.pogo.generator.cpp.global.TypeDefinitions.*

//======================================================
//	Command utilities
//======================================================
class Commands {
	@Inject	extension ProtectedArea
	@Inject	extension StringUtils


	//======================================================
	// Define the signature for command execution method
	//======================================================
	def commandExecutionMethodSignature(PogoDeviceClass cls, Command cmd, boolean declare) {
		if (declare)
			//	Method prototype
			cmd.argout.type.argoutDeclarationForSignature +  cmd.execMethod + "(" +cmd.argin.type.arginDeclaration + ");"
		else
			//	method signature
			cmd.argout.type.argoutDeclarationForSignature + cls.name +
				"::" + cmd.execMethod + "(" + cmd.argin.type.arginDeclaration +")"
	}
	
	//======================================================
	// Manage the argin declaration
	//======================================================
	def arginDeclaration(Type type) {
		if (type.cppType.equals("void"))
			 ""
		else if (type.cppType.endsWith("Array"))
			 "const " + type.cppType + " *argin"
		else type.cppType + " argin"
	}
	//======================================================
	// Manage the argout declaration
	//======================================================
	def argoutDeclarationForSignature(Type type) {
		if (type.cppType.equals("void"))
			 "void "
		else if (type.cppType.endsWith("Array"))
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
			if (command.argout.type.cppType.endsWith("Array"))
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
			DEBUG_STREAM << "MultiCellGauges::«command.name»()  - " << device_name << endl;
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
			TANGO_UNUSED(const CORBA::Any &in_any)
		«ELSE»
			const CORBA::Any &in_any
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
		CORBA::Any *«command.name»Class::execute(Tango::DeviceImpl *device, «command.classExecuteMethodArgin»)
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
			((static_cast<«cls.name» *>(device))->«cmd.execMethod»(«cmd.arginParam»));
			return new CORBA::Any();
		«ELSE»
			return insert((static_cast<«cls.name» *>(device))->«cmd.execMethod»(«cmd.arginParam»));
		«ENDIF»
	'''

	//======================================================
	

	//======================================================
	//	Define the command factory
	//======================================================
	def commandFactory(Command command) '''
		«IF command.status.concreteHere.isTrue &&
			command.name.equals("State")==false && command.name.equals("Status")==false»
				«command.name»Class	*p«command.name»Cmd =
					new «command.name»Class("«command.name»",
						«command.argin.type.cppTypeEnum», «command.argout.type.cppTypeEnum»,
						"«command.argin.description.oneLineString»",
						"«command.argout.description.oneLineString»",
						Tango::«command.displayLevel»);
				command_list.push_back(p«command.name»Cmd);
		«ENDIF»
	'''

}