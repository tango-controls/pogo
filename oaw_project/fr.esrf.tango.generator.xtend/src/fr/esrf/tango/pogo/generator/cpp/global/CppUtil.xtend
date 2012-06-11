package fr.esrf.tango.pogo.generator.cpp.global

import fr.esrf.tango.pogo.pogoDsl.ClassDescription
import fr.esrf.tango.pogo.pogoDsl.Inheritance
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef

class CppUtil {


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