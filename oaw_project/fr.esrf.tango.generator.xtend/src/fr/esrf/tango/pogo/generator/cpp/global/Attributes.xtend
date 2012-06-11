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
import static extension fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea.*

//======================================================
//	Attribute utilities
//======================================================
class Attributes {
	@Inject
	extension TypeDefinitions
	@Inject
	extension ProtectedArea


	//======================================================
	//	Attribute utilities
	//======================================================
	def attTypeDimentions(Attribute attr) {
		switch (attr.attType) {
			case "Spectrum": "  max = " + attr.maxX
			case "Image":    "  max = " + attr.maxX + " x " + attr.maxY
			default: null
		}
	}

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


	//======================================================
	// Define attribute classes
	//======================================================
	def attributeClass(PogoDeviceClass cls, Attribute attribute) '''
		//	Attribute «attribute.name» class definition
		class «attribute.name»Attrib: public Tango::«attribute.inheritance»
		{
		public:
			«attribute.Constructor»
			~«attribute.name»Attrib() {};
			«IF attribute.rwType.contains("READ")»
				virtual void read(Tango::DeviceImpl *dev,Tango::Attribute &att)
					{(static_cast<«cls.name» *>(dev))->read_«attribute.name»(att);}
			«ENDIF»
			«IF attribute.rwType.contains("WRITE")»
				virtual void write(Tango::DeviceImpl *dev,Tango::WAttribute &att)
					{(static_cast<«cls.name» *>(dev))->write_«attribute.name»(att);}
			«ENDIF»
			virtual bool is_allowed(Tango::DeviceImpl *dev,Tango::AttReqType ty)
				{return (static_cast<«cls.name» *>(dev))->is_«attribute.name»_allowed(ty);}
		};
		
	'''

	//======================================================
	// Define attribute class inheritance
	//======================================================
	def inheritance(Attribute attribute) {
		if (attribute.attType.equals("Scalar"))
			"Attr"
		else
		if (attribute.attType.equals("Spectrum"))
			"SpectrumAttr"
		else
		if (attribute.attType.equals("Image"))
			"ImageAttr"
	}
	//======================================================
	// Define attribute Constructor
	//======================================================
	def Constructor(Attribute attribute) '''
			«IF attribute.attType.equals("Scalar")»
			«attribute.name»Attrib():«attribute.inheritance»("«attribute.name»",
					«attribute.dataType.cppTypeEnum», Tango::«attribute.rwType») {};
		«ELSEIF attribute.attType.equals("Spectrum")»
			«attribute.name»Attrib():«attribute.inheritance»("«attribute.name»",
					«attribute.dataType.cppTypeEnum», Tango::«attribute.rwType», «attribute.maxX») {};
		«ELSE»
			«attribute.name»Attrib():«attribute.inheritance»("«attribute.name»",
					«attribute.dataType.cppTypeEnum», Tango::«attribute.rwType», «attribute.maxX», «attribute.maxY») {};
		«ENDIF»
	'''
}