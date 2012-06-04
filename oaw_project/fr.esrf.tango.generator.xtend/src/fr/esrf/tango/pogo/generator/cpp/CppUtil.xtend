package fr.esrf.tango.pogo.generator.cpp

import fr.esrf.tango.pogo.pogoDsl.Argument
import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.pogoDsl.BooleanArrayType
import fr.esrf.tango.pogo.pogoDsl.BooleanType
import fr.esrf.tango.pogo.pogoDsl.CharArrayType
import fr.esrf.tango.pogo.pogoDsl.ClassDescription
import fr.esrf.tango.pogo.pogoDsl.Command
import fr.esrf.tango.pogo.pogoDsl.ConstStringType
import fr.esrf.tango.pogo.pogoDsl.DevIntType
import fr.esrf.tango.pogo.pogoDsl.DoubleArrayType
import fr.esrf.tango.pogo.pogoDsl.DoubleStringArrayType
import fr.esrf.tango.pogo.pogoDsl.DoubleType
import fr.esrf.tango.pogo.pogoDsl.DoubleVectorType
import fr.esrf.tango.pogo.pogoDsl.EncodedType
import fr.esrf.tango.pogo.pogoDsl.FireEvents
import fr.esrf.tango.pogo.pogoDsl.FloatArrayType
import fr.esrf.tango.pogo.pogoDsl.FloatType
import fr.esrf.tango.pogo.pogoDsl.FloatVectorType
import fr.esrf.tango.pogo.pogoDsl.Inheritance
import fr.esrf.tango.pogo.pogoDsl.IntArrayType
import fr.esrf.tango.pogo.pogoDsl.IntType
import fr.esrf.tango.pogo.pogoDsl.IntVectorType
import fr.esrf.tango.pogo.pogoDsl.LongArrayType
import fr.esrf.tango.pogo.pogoDsl.LongStringArrayType
import fr.esrf.tango.pogo.pogoDsl.LongType
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import fr.esrf.tango.pogo.pogoDsl.PropType
import fr.esrf.tango.pogo.pogoDsl.ShortArrayType
import fr.esrf.tango.pogo.pogoDsl.ShortType
import fr.esrf.tango.pogo.pogoDsl.ShortVectorType
import fr.esrf.tango.pogo.pogoDsl.StateType
import fr.esrf.tango.pogo.pogoDsl.StringArrayType
import fr.esrf.tango.pogo.pogoDsl.StringType
import fr.esrf.tango.pogo.pogoDsl.StringVectorType
import fr.esrf.tango.pogo.pogoDsl.Type
import fr.esrf.tango.pogo.pogoDsl.UCharType
import fr.esrf.tango.pogo.pogoDsl.UIntArrayType
import fr.esrf.tango.pogo.pogoDsl.UIntType
import fr.esrf.tango.pogo.pogoDsl.ULongArrayType
import fr.esrf.tango.pogo.pogoDsl.ULongType
import fr.esrf.tango.pogo.pogoDsl.UShortArrayType
import fr.esrf.tango.pogo.pogoDsl.UShortType
import fr.esrf.tango.pogo.pogoDsl.VoidType

class CppUtil {
	def cvsEscaped (String s) { "$" + s + "  $" }
	
	/**
	 * Convert name to data member name (first char to lower case
	 */
	def dataMemberName(String s) {	
		s.substring(0,1).toLowerCase()+s.substring(1, s.length)
	}
	
	/**
	 * Comment a String with more than one line
	 */
	def comments(String s, String tag) {
		s.replaceAll("\n", "\n"+tag);
	}
	
	/**
	 * Comment a String with more than one line
	 */
	def inVector(String s, String vectName) {
		s.replaceAll("\n", "\");\n	"+vectName+".push_back(\"");
	}
	
	def inOneLine(String s) {
		s.replaceAll("\n", "\\\\n");
	}

	def onlyOneLine(String s) {
		s.replaceAll("\n", "  ");	//	It seems that  \\n does not work !!
	}

	/**
	 * TODO: Obsolete! Do not use
	 */
	def concatString(String s1, String s2) {
		s1 + s2;
	}

	// Attribute utilities
	def attTypeDimentions(Attribute attr) {
		switch (attr.attType) {
			case "Spectrum": " max = "+attr.maxX
			case "Image": " max = "+attr.maxX+" x "+attr.maxY
			default: null
		}
	}
	
	/**
	 * attribute constructor (scalar, spectrum, image)
	 */
	def attConstructorSize(Attribute attr) {
		switch (attr.attType) {
			case "Spectrum": ", "+attr.maxX
			case "Image": ", "+attr.maxX+", "+attr.maxY
			default: ""
		}
	}	
	
	/**
	 * attribute set value (scalar, spectrum, image)
	 */
	def SetAttValueSize(Attribute attr) {
		switch (attr.attType) {
			case "Spectrum": ", "+attr.maxX
			case "Image": ", "+attr.maxX+", "+attr.maxY
			default: ""
		}
	}
		
	/**
	 * attribute allocation
	 */
	def attAllocSize(Attribute attr) {	
		switch (attr.attType) {
			case "Spectrum": attr.maxX
			case "Image": ", "+attr.maxX+" *"+attr.maxY
			default: "1"
		}
	}

	/**
	 * Code to set the attribute property
	 */
	def setAttributeProperty(String att_name, String field, String value) {
		if (value.length > 0)
			att_name.toLowerCase()+"_prop.set_"+field+"(\""+value+"\");"
		else
			"//	"+field+"	not set for	"+att_name; 
	}

	def setAttributeFireEvent(String att_name, String evtType, FireEvents fe) {
		if (fe.fire == "true")
			att_name.toLowerCase()+"->set_"+evtType+"_event("+fe.fire+", "+fe.libCheckCriteria+");"
		else
			"//	"+att_name+" does not fire "+evtType+" event";
	}

	/**
	 * Special case (one arg)
	 */
	def setAttributeFireDataReadyEvent(String att_name, FireEvents fe) {
		if (fe.fire == "true")
			att_name.toLowerCase()+"->set_data_ready_event("+fe.fire+");"
		else
			"//	"+att_name+" does not fire data_ready event";
	}
	
	def writeAttrValueDeclaration(Attribute att) {
		if (att.dataType.cppType().toString()!="Tango::DevString")
			att.dataType.cppType().toString()
		else "Tango::ConstDevString"
	}


	def protectedID(PogoDeviceClass cls, Attribute att, String str) {
		cls.name + "::"+str+"_"+att.name;
	}

	def stateAllowedMethod( Attribute attr ) {
		attr.name+"StateAllowed";
	}

	def cppExcludeStatesClose(Attribute attr) {
		if (attr.readExcludedStates.size == 0)
			null
		else
			"return false;\n\t}"; 
	}


//	Command utilities
	def protectedID(PogoDeviceClass cls, Command cmd) {
		cls.name + "::"+cmd.execMethod;
	}

	def argoutDescription(Command cmd) {
		if (cmd.argout.description == "")
			"none"
		else
			cmd.argout.description
	}

	/**
	 * dserverClass.cpp command execute method
	 */
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


	def declareCmdArgin(Command cmd) {
		if (cmd.argin.type.cppType()=="void")
			null
		else if (cmd.argin.type.cppType().toString().endsWith("Array"))
			"const " + cmd.argin.type.cppType().toString()+" *argin"
		else cmd.argin.type.cppType().toString()+" argin"
	}

	def cppSetPollingPeriod(Command cmd) {
		if (cmd.polledPeriod ==null)
			null
		else
			"p"+cmd.name+"Cmd->set_polling_period("+cmd.polledPeriod+");\n\t";
	}

	def cppDisplayLevel(Command cmd) {
		if (cmd.displayLevel==null)
			"Tango::OPERATOR"
		else
			"Tango::"+cmd.displayLevel;
	}


	def stateAllowedMethod( Command cmd ) {
		cmd.name+"StateAllowed";
	}


	def cppExculudeStatesClose(Command cmd) {
		if (cmd.excludedStates.size == 0)
			null
		else "return false;\n\t}";
	}

	/**
	 *	Inheritance util (return true if not the TangoDeviceImpl)
	 */
	def isInheritanceClass(Inheritance inher) {
		if (inher.classname==null || inher.classname.length==0)
			false
		else if ((inher.classname.startsWith("Device_")==true && inher.classname.endsWith("Impl")==true))
			false
		else true
	}

	/**
	 *	Inheritance util (return true at least the first one is not the TangoDeviceImpl)
	 */
	def hasInheritanceClass(ClassDescription cd) {
		return cd.inheritances.size>0 && isInheritanceClass(cd.inheritances.get(cd.inheritances.size-1))
	}

	//
	//	Makefile util
	def makeVariable( Inheritance inher, String s ) { 
		inher.classname.toUpperCase() + s;
	}

	//
	//	Makefile util
	def makeVariable( OneClassSimpleDef _class, String s ) { 
		_class.classname.toUpperCase() + s;
	}

	/**
	 * Property Type utilities
	 */
	def cppPropType (PropType propType) {
		switch (propType) {
			BooleanType: 	"Tango::DevBoolean"
			ShortType: 		"Tango::DevShort"
			IntType:        "Tango::DevLong"
			UShortType:     "Tango::DevUShort"
			UIntType:       "Tango::DevULong"
			FloatType:      "Tango::DevFloat"
			DoubleType:     "Tango::DevDouble"
			StringType:     "string"
			ShortVectorType:     "vector<Tango::DevShort>"
			IntVectorType:     "vector<Tango::DevLong>"
			FloatVectorType:     "vector<Tango::DevFloat>"
			DoubleVectorType:     "vector<Tango::DevDouble>"
			StringVectorType:     "vector<string>"
			default: null
		}
	}

	/**
	 * Type utilities
	 */
	def cppType (Type type) {
		switch (type) {
			VoidType:			"void"
			BooleanType:			"Tango::DevBoolean"
			ShortType:			"Tango::DevShort"
			IntType:			"Tango::DevLong"
			FloatType:			"Tango::DevFloat"
			DoubleType:			"Tango::DevDouble"
			UShortType:			"Tango::DevUShort"
			UIntType:			"Tango::DevULong"
			StringType:			"Tango::DevString"
			CharArrayType:			"Tango::DevVarCharArray"
			ShortArrayType:			"Tango::DevVarShortArray"
			IntArrayType:			"Tango::DevVarLongArray"
			FloatArrayType:			"Tango::DevVarFloatArray"
			DoubleArrayType:			"Tango::DevVarDoubleArray"
			UShortArrayType:			"Tango::DevVarUShortArray"
			UIntArrayType:			"Tango::DevVarULongArray"
			StringArrayType:			"Tango::DevVarStringArray"
			LongStringArrayType:			"Tango::DevVarLongStringArray"
			DoubleStringArrayType:"Tango::DevVarDoubleStringArray"
			StateType:			"Tango::DevState"
			ConstStringType:			"Tango::ConstDevString"
			BooleanArrayType:			"Tango::DevVarBooleanArray"
			UCharType:			"Tango::DevUChar"
			LongType:			"Tango::DevLong64"
			ULongType:			"Tango::DevULong64"
			LongArrayType:			"Tango::DevVarLong64Array"
			ULongArrayType:			"Tango::DevVarULong64Array"
			DevIntType:			"Tango::DevInt"
			EncodedType:			"Tango::DevEncoded"
		}
	}

	/**
	 * Type enum
	 */
	def cppTypeEnum (Type type) {
		switch (type) {
			VoidType:			"Tango::DEV_VOID"
			BooleanType:			"Tango::DEV_BOOLEAN"
			ShortType:			"Tango::DEV_SHORT"
			IntType:			"Tango::DEV_LONG"
			FloatType:			"Tango::DEV_FLOAT"
			DoubleType:			"Tango::DEV_DOUBLE"
			UShortType:			"Tango::DEV_USHORT"
			UIntType:			"Tango::DEV_ULONG"
			StringType:			"Tango::DEV_STRING"
			CharArrayType:			"Tango::DEVVAR_CHARARRAY"
			ShortArrayType:			"Tango::DEVVAR_SHORTARRAY"
			IntArrayType:			"Tango::DEVVAR_LONGARRAY"
			FloatArrayType:			"Tango::DEVVAR_FLOATARRAY"
			DoubleArrayType:			"Tango::DEVVAR_DOUBLEARRAY"
			UShortArrayType:			"Tango::DEVVAR_USHORTARRAY"
			UIntArrayType:			"Tango::DEVVAR_ULONGARRAY"
			StringArrayType:			"Tango::DEVVAR_STRINGARRAY"
			LongStringArrayType:			"Tango::DEVVAR_LONGSTRINGARRAY"
			DoubleStringArrayType:	"Tango::DEVVAR_DOUBLESTRINGARRAY"
			StateType:			"Tango::DEV_STATE"
			ConstStringType:			"Tango::CONST_DEV_STRING"
			BooleanArrayType:			"Tango::DEVVAR_BOOLEANARRAY"
			UCharType:			"Tango::DEV_UCHAR"
			LongType:			"Tango::DEV_LONG64"
			ULongType:			"Tango::DEV_ULONG64"
			LongArrayType:			"Tango::DEVVAR_LONG64ARRAY"
			ULongArrayType:			"Tango::DEVVAR_ULONG64ARRAY"
			DevIntType:			"Tango::DEV_INT"
			EncodedType:			"Tango::DEV_ENCODED"
		}
	}
}