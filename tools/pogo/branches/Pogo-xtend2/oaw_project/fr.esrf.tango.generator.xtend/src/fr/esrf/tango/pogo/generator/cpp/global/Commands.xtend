package fr.esrf.tango.pogo.generator.cpp.global

import fr.esrf.tango.pogo.pogoDsl.Argument
import fr.esrf.tango.pogo.pogoDsl.Type
import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.pogoDsl.ClassDescription
import fr.esrf.tango.pogo.pogoDsl.Command
import fr.esrf.tango.pogo.pogoDsl.Inheritance
import fr.esrf.tango.pogo.pogoDsl.FireEvents
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject

//======================================================
//	Command utilities
//======================================================
class Commands {
	@Inject
	extension TypeDefinitions

	@Inject
	extension CppUtil




	//======================================================
	// Define the signature for command execution method
	//======================================================
	def commandExecutionMethodSignature(PogoDeviceClass cls, Command cmd, boolean declare) {
		if (declare)
			//	Method prototype
			cmd.argout.type.argoutDeclaration +  cmd.execMethod + cmd.argin.type.arginDeclaration + ";"
		else
			//	method signature
			cmd.argout.type.argoutDeclaration + cls.name +
				"::" + cmd.execMethod + cmd.argin.type.arginDeclaration
	}
	
	//======================================================
	// Manage the argin declaration
	//======================================================
	def arginDeclaration(Type type) {
		if (type.cppType.equals("void"))
			 "()"
		else if (type.cppType.endsWith("Array"))
			 "(const " + type.cppType + " *argin)"
		else "(" + type.cppType + " argin)"
	}
	//======================================================
	// Manage the argout declaration
	//======================================================
	def argoutDeclaration(Type type) {
		if (type.cppType.equals("void"))
			 "void "
		else if (type.cppType.endsWith("Array"))
			 type.cppType + " *"
		else type.cppType + " "
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
			DEBUG_STREAM << "MultiCellGauges::«command.name»()  - " << device_name << endl;
			«cls.openProtectedArea(command.execMethod)»
			
			«IF command.name.equals("State")»
				Tango::DevState	argout = Tango::UNKNOWN; // replace by your own algorithm
			«ELSEIF command.name.equals("Status")»
				string	status = "Device is OK";
			«ELSE»
				«IF command.argout.type.cppType.equals("void")==false»
					«command.argout.type.argoutDeclaration»argout;
					//	Add your own code
				«ENDIF»
			«ENDIF»
			
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

	/**
	 * dserverClass.cpp command execute method
	 */
	def executeCmdInsert(PogoDeviceClass cls, Command cmd) {
	//	Depends on if argout and/or argin type is void
		if (cmd.argin.type.cppType()=="void" && cmd.argout.type.cppType()=="void")
			"((static_cast<"+cls.name+" *>(device))->"+cmd.execMethod+"());"
			+"\n	return new CORBA::Any();"

		else {
			if (cmd.argin.type.cppType()!="void" && cmd.argout.type.cppType()=="void")
				"((static_cast<"+cls.name+" *>(device))->"+cmd.execMethod+"(argin));"+
				"\n	return new CORBA::Any();"

			else {
				if (cmd.argin.type.cppType()=="void" && cmd.argout.type.cppType()!="void")
					"return insert((static_cast<"+cls.name+" *>(device))->"+cmd.execMethod+"());"
				else //	cmd.argin.type.cppType()!="void" && cmd.argout.type.cppType()!="void"
					"return insert((static_cast<"+cls.name+" *>(device))->"+cmd.execMethod+"(argin));"
					
			}
		
		}
	}

	def declareArgumentWithPointer(Argument arg) {
		//	Check if pointer needed
		if (arg.type.cppType().toString().endsWith("Array"))
			arg.type.cppType().toString() + " *"
		else arg.type.cppType().toString() + " ";
	
	}


}