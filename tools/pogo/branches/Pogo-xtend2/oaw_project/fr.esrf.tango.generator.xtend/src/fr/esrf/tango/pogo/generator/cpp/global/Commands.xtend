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




	//======================================================
	// Define the signature for command execution method
	//======================================================
	def commandExecutionMethodSignature(PogoDeviceClass cls, Command cmd, boolean declare) {
		if (declare)
			//	Method prototype
			cmd.argout.type.cppType + " " +  cmd.execMethod + cmd.argin.type.arginDeclaration
		else
			//	method signature
			cmd.argout.type.cppType + " " + cls.name +
				"::" + cmd.execMethod + cmd.argin.type.arginDeclaration
	}
	
	//======================================================
	// Manage teh argin declaration
	//======================================================
	def arginDeclaration(Type arginType) {
		if (arginType.cppType.equals("void"))
			"();"
		else
			"("  + arginType.cppType + " argin);"
	}


	//======================================================
	//	Output argument description 
	//======================================================
	def argoutDescription(Command cmd) {
		if (cmd.argout.description == "")
			"none"
		else
			cmd.argout.description
	}

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