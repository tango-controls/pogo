package fr.esrf.tango.pogo.generator.cpp.global

import fr.esrf.tango.pogo.pogoDsl.Argument
import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.pogoDsl.ClassDescription
import fr.esrf.tango.pogo.pogoDsl.Command
import fr.esrf.tango.pogo.pogoDsl.Inheritance
import fr.esrf.tango.pogo.pogoDsl.FireEvents
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject

class CppUtil {

	@Inject
	extension TypeDefinitions

	/*
	 * Define the DeviceImpl used to generate
	 */
	def deviceImpl() {
		"Tango::Device_4Impl"
	}


	/**
 	 * TODO: Obsolete! Do not use
 	 */
 	def concatString(String s1, String s2) {
 		s1 + s2;
 	}
	
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
	 * Define cpp protected areas
	 */
	def openProtectedArea(PogoDeviceClass clazz, String method) {
		if (method.startsWith("."))
			"/*----- PROTECTED REGION ID(" + clazz.name + method + ") ENABLED START -----*/\n"
		else
			"/*----- PROTECTED REGION ID(" + clazz.name + "::" + method + ") ENABLED START -----*/\n"
	}
	def closeProtectedArea(PogoDeviceClass clazz, String method) {
		if (method.startsWith("."))
			"/*----- PROTECTED REGION END -----*/	//	" + clazz.name + method + "\n"
		else
			"/*----- PROTECTED REGION END -----*/	//	" + clazz.name + "::" + method + "\n"
	}
	def protectedArea(PogoDeviceClass clazz, String method, String code, boolean comments) {
		if (comments)
			openProtectedArea(clazz, method)+ "\n" +
				"//	" + code.comments("	//	") + "\n\n" +
				closeProtectedArea(clazz, method)
		else
			openProtectedArea(clazz, method) +
			code + "\n\n" +
			closeProtectedArea(clazz, method)
	}


	// Attribute utilities
	def attTypeDimentions(Attribute attr) {
		switch (attr.attType) {
			case "Spectrum": "  max = " + attr.maxX
			case "Image":    "  max = " + attr.maxX + " x " + attr.maxY
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
}