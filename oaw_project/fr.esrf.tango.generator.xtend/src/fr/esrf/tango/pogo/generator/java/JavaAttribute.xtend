package fr.esrf.tango.pogo.generator.java

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import static extension fr.esrf.tango.pogo.generator.java.JavaUtils.*
import static extension fr.esrf.tango.pogo.generator.java.ProtectedArea.*
import static extension fr.esrf.tango.pogo.generator.java.JavaTypeDefinitions.*
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import static extension fr.esrf.tango.pogo.generator.cpp.global.StringUtils.*
import fr.esrf.tango.pogo.generator.cpp.global.StringUtils
import fr.esrf.tango.pogo.generator.cpp.global.Headers
import fr.esrf.tango.pogo.pogoDsl.Property
import fr.esrf.tango.pogo.pogoDsl.Attribute

class JavaAttribute {

	@Inject extension JavaUtils
	@Inject extension ProtectedArea
	@Inject extension StringUtils
	@Inject extension Headers


	//======================================================
	// define code to get and set attributes
	//======================================================
	def attributeMethods(PogoDeviceClass cls) '''
		«FOR Attribute attribute : cls.attributes»
			«cls.declareAttributeMember(attribute)»
			«cls.getMethod(attribute)»
			«IF attribute.rwType.contains("WRITE")»
				«cls.setMethod(attribute)»
			«ENDIF»

		«ENDFOR»
	'''

	
	//======================================================
	// define code to declare attributes
	//======================================================
	def declareAttributeMember(PogoDeviceClass cls, Attribute attribute) '''
		/**
		 * Attribute «attribute.name», «attribute.strType», «attribute.attType», «attribute.rwType»
		 * description:
		 * «attribute.properties.description.comments("* ")»
		 */
		@Attribute(name = "«attribute.name»")«attribute.declareProperties»«attribute.stateMachine»
		private «attribute.strFullJavaType» «attribute.name.dataMemberName»«attribute.allocation»;
	'''

	//======================================================
	// define code to get attribute
	//======================================================
	def getMethod(PogoDeviceClass cls, Attribute attribute) '''
		/**
		 * Read attribute «attribute.name»
		 * 
		 * @return attribute value
		 */
		public «attribute.strFullJavaType» get«attribute.name»() {
			xlogger.entry();
			«cls.protectedArea("get"+attribute.name, "Put read attribute code here", true)»
			xlogger.exit();
			return «attribute.name.dataMemberName»;
		}
	'''
	//======================================================
	// define code to Set attribute
	//======================================================
	def setMethod(PogoDeviceClass cls, Attribute attribute) '''
		/**
		 * Write attribute «attribute.name»
		 * @param  «attribute.name.dataMemberName» value to write
		 */
		public void set«attribute.name»(«attribute.strFullJavaType» «attribute.name.dataMemberName»){
			xlogger.entry();
			this.«attribute.name.dataMemberName» = «attribute.name.dataMemberName»;
			«cls.protectedArea("set" + attribute.name, "Put write attribute code here", true)»
			xlogger.exit();
		}
	'''

}