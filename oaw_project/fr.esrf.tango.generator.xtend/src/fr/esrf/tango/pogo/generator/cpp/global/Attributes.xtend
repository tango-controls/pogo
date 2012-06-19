package fr.esrf.tango.pogo.generator.cpp.global

import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static extension fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea.*
import static extension fr.esrf.tango.pogo.generator.cpp.global.StringUtils.*
import static extension fr.esrf.tango.pogo.generator.cpp.global.TypeDefinitions.*
import org.eclipse.emf.common.util.EList

//======================================================
//	Attribute utilities
//======================================================
class Attributes {
	@Inject	extension ProtectedArea
	@Inject	extension StringUtils


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
		if (attribute.attType.toLowerCase.equals("Image")) {
			", " + attribute.maxX +", " + attribute.maxY
		}
	}
	//======================================================
	def readAttrubuteSizeForAllocation(Attribute attribute) {
		if (attribute.attType.toLowerCase.equals("scalar")) {
			"[1]"
		}
		else
		if (attribute.attType.toLowerCase.equals("spectrum")) {
			"[" + attribute.maxX + "]"
		}
		else
		if (attribute.attType.toLowerCase.equals("Image")) {
			"[" + attribute.maxX +"*" + attribute.maxY + "]"
		}
	}
	//======================================================
	def readAttrubuteDataMember(Attribute attribute) {
		 "attr_" + attribute.name + "_read"
	}
	
	//======================================================
	//	Delete attribute data member
	//======================================================
	def deleteAttributeDataMember(Attribute attribute) {
		"delete[] " +  attribute.readAttrubuteDataMember + ";"
	}
	//======================================================
	//	Delete attribute data members
	//======================================================
	def deleteAttributeDataMembers(EList<Attribute> attributes) '''
		«FOR Attribute attribute : attributes»
			«IF isTrue(attribute.allocReadMember)»
				«attribute.deleteAttributeDataMember»
			«ENDIF»
		«ENDFOR»
	'''

	//======================================================
	//	Allocate attribute data member
	//======================================================
	def allocateAttributeDataMember(Attribute attribute) {
		attribute.readAttrubuteDataMember + " = new " + 
				attribute.dataType.cppType + attribute.readAttrubuteSizeForAllocation + ";"
	}
	//======================================================
	//	Allocate attribute data members
	//======================================================
	def allocateAttributeDataMembers(EList<Attribute> attributes) '''

		«FOR Attribute attribute : attributes»
			«IF attribute.allocReadMember.isTrue»
				«attribute.allocateAttributeDataMember»
			«ENDIF»
		«ENDFOR»
	'''

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
			«IF attribute.rwType.isRead»
				virtual void read(Tango::DeviceImpl *dev,Tango::Attribute &att)
					{(static_cast<«cls.name» *>(dev))->read_«attribute.name»(att);}
			«ENDIF»
			«IF attribute.rwType.isWrite»
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

	//======================================================
	// Define attribute Constructor
	//======================================================
	def attributeFactory(Attribute attribute) '''
		
		//	Attribute : «attribute.name»
		«attribute.name»Attrib	*«attribute.name.toLowerCase» = new «attribute.name»Attrib();
		Tango::UserDefaultAttrProp	«attribute.name.toLowerCase»_prop;
		«attribute.setProperty("description", attribute.properties.description)»
		«attribute.setProperty("label", attribute.properties.label)»
		«attribute.setProperty("unit", attribute.properties.unit)»
		«attribute.setProperty("standard_unit", attribute.properties.standardUnit)»
		«attribute.setProperty("display_unit", attribute.properties.displayUnit)»
		«attribute.setProperty("format", attribute.properties.format)»
		«attribute.setProperty("max_value", attribute.properties.maxValue)»
		«attribute.setProperty("min_value", attribute.properties.minValue)»
		«attribute.setProperty("max_alarm", attribute.properties.maxAlarm)»
		«attribute.setProperty("min_alarm", attribute.properties.minAlarm)»
		«attribute.setProperty("max_warning", attribute.properties.maxWarning)»
		«attribute.setProperty("min_warning", attribute.properties.minWarning)»
		«attribute.setProperty("delta_t", attribute.properties.deltaTime)»
		«attribute.setProperty("delta_val", attribute.properties.deltaValue)»
		«attribute.name.toLowerCase»->set_default_properties(«attribute.name.toLowerCase»_prop);
		«attribute.setExtendedProprty("polling_period", attribute.polledPeriod, "Not Polled")»
		«attribute.setExtendedProprty("disp_level", attribute.displayLevel, "Tango::OPERATOR")»
		«attribute.setExtendedProprty("memorized", attribute.memorized, "Not Memorized")»
		«attribute.setExtendedProprty("memorized_init", attribute.memorizedAtInit, "Not set to hardware at init")»
		att_list.push_back(«attribute.name.toLowerCase»);
	'''
	//======================================================
	def setProperty(Attribute attribute, String propertyName, String strValue) '''
		«IF strValue.isSet»
			«attribute.name.toLowerCase»_prop.set_«propertyName»("«strValue.oneLineString»");
		«ELSE»
			//	«propertyName»	not set for «attribute.name»
		«ENDIF»
	'''
	//======================================================
	def setExtendedProprty(Attribute attribute, String propertyName, String strValue, String comment) '''
		«IF strValue.isSet»
			«IF propertyName=="disp_level"»
				«attribute.name.toLowerCase»->set_«propertyName»(Tango::«strValue»);
			«ELSE»
				«attribute.name.toLowerCase»->set_«propertyName»(«strValue»);
			«ENDIF»
		«ELSE»
			//	«comment»
		«ENDIF»
	'''
}