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
//	Attribute utilities
//======================================================
class Attributes {
	@Inject
	extension TypeDefinitions
	@Inject
	extension CppUtil



	//======================================================
	//	General methods
	//======================================================
	def writeAttrubuteMethod(Attribute attribute) {
		"write_" + attribute.name
	}
	//======================================================
	def readAttrubuteMethod(Attribute attribute) {
		"read_" + attribute.name
	}
	//======================================================
	def readAttrubuteSize(Attribute attribute) {
		if (attribute.attType.toLowerCase.equals("scalar")) {
			""
		}
		else
		if (attribute.attType.toLowerCase.equals("spectrum")) {
			", " + attribute.maxX
		}
		else
		if (attribute.attType.toLowerCase.equals("Scalar")) {
			", " + attribute.maxX +", " + attribute.maxY
		}
	}
	//======================================================
	def readAttrubuteDataMember(Attribute attribute) {
		 "attr_" + attribute.name + "_read"
	}
	
	
	
	//======================================================
	// Define read attribute related method
	//======================================================
	def readAttributeMethod(PogoDeviceClass cls, Attribute attribute) '''
		void «cls.name»::«attribute.readAttrubuteMethod»(Tango::Attribute &attr)
		{
			DEBUG_STREAM << "«cls.name»::«attribute.readAttrubuteMethod»(Tango::Attribute &attr) entering... " << endl;
			«cls.protectedArea(attribute.readAttrubuteMethod,
				"//	Set the attribute value\n" +
				"attr.set_value("+attribute.readAttrubuteDataMember+
				attribute.readAttrubuteSize + ");", false)»
		}
	'''
	
	
	//======================================================
	// Define write attribute related method
	//======================================================
	def writeAttributeMethod(PogoDeviceClass cls, Attribute attribute) '''
		void «cls.name»::«attribute.writeAttrubuteMethod»(Tango::WAttribute &attr)
		{
			DEBUG_STREAM << "«cls.name»::«attribute.writeAttrubuteMethod»(Tango::WAttribute &attr) entering... " << endl;
			//	Retrieve write value
			«attribute.dataType.cppType»	w_val;
			attr.get_write_value(w_val);
			«cls.protectedArea(attribute.writeAttrubuteMethod, "", false)»
		}
	'''
}