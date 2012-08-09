package fr.esrf.tango.pogo.generator.cpp.utils;

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses;




public class ProtectedArea {

	//======================================================================
	// Define cpp protected areas for device
	//======================================================================
	public String openProtectedArea(PogoDeviceClass cls, String method) {
		return openProtectedArea(cls.getName(), method);
	}
	public String openProtectedArea(String className, String method) {
		if (method.startsWith("."))	//	Not method, it is a file name
			return "/*----- PROTECTED REGION ID(" + className + method + ") ENABLED START -----*/\n";
		else
			return "/*----- PROTECTED REGION ID(" + className + "::" + method + ") ENABLED START -----*/\n";
	}
	//======================================================================
	public String closeProtectedArea(PogoDeviceClass cls, String method) {
		return closeProtectedArea(cls.getName(), method);
	}
	public String closeProtectedArea(String className, String method) {
		if (method.startsWith("."))
			return "/*----- PROTECTED REGION END -----*/	//	" + className + method + "\n";
		else
			return "/*----- PROTECTED REGION END -----*/	//	" + className + "::" + method + "\n";
	}
	//======================================================================
	public String protectedArea(PogoDeviceClass cls, String method, String code, boolean comments) {
		if (comments)
			return	openProtectedArea(cls, method)+ "\n" +
					"//	" + CppStringUtils.comments(code, "	//	") + "\n\n" +
					closeProtectedArea(cls, method);
		else
			return	openProtectedArea(cls, method) +
					code + "\n\n" +
					closeProtectedArea(cls, method);
	}
	//======================================================================
	public String protectedArea(PogoDeviceClass cls, String method) {
		return	openProtectedArea(cls.getName(), method)+ "\n" +
				closeProtectedArea(cls.getName(), method);
	}
	//======================================================================
	
	
	
	
	
	
	
	//======================================================================
	// Define cpp protected areas for deviceClass
	//======================================================================
	public String protectedAreaClass(PogoDeviceClass cls, String method, String code, boolean comments) {
		if (comments)
			return	openProtectedArea(cls.getName()+"Class", method)+ "\n" +
					"//	" + CppStringUtils.comments(code, "	//	") + "\n\n" +
					closeProtectedArea(cls.getName()+"Class", method);
		else
			return	openProtectedArea(cls.getName()+"Class", method) +
					code + "\n\n" +
					closeProtectedArea(cls.getName()+"Class", method);
	}
	//======================================================================
	public String protectedAreaClass(PogoDeviceClass cls, String method) {
		return	openProtectedArea(cls.getName()+"Class", method)+ "\n" +
				closeProtectedArea(cls.getName()+"Class", method);
	}



	//======================================================================
	// Define cpp protected areas for Multi Classes
	//======================================================================
	public String openProtectedArea(PogoMultiClasses multi, String method) {
		return openProtectedArea("multi-"+multi.getName(), method);
	}
	//======================================================================
	public String closeProtectedArea(PogoMultiClasses multi, String method) {
		return closeProtectedArea("multi-"+multi.getName(), method);
	}
}
