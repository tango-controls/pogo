package fr.esrf.tango.pogo.generator.python

import fr.esrf.tango.pogo.pogoDsl.Command
import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import fr.esrf.tango.pogo.pogoDsl.Property
import static extension fr.esrf.tango.pogo.generator.python.PythonTypeDefinitions.*
import org.eclipse.emf.common.util.EList

class PythonUtils {
	
	def commentMultiLinesPython(PogoDeviceClass cls){
		cls.description.description.replaceAll("\n","\n#\t\t\t\t");
	}
	
	def commentMultiLinesPythonStr(String str){
		str.replaceAll("\n","\n#\t\t\t\t");
	}
	
	def commandExecution(Command cmd) {
		'''#------------------------------------------------------------------
#	«cmd.name» command:
#------------------------------------------------------------------
	def «cmd.name»(self, argin):
	    """ «cmd.description»
	    
	    :param argin: «cmd.argin.description»
	    :type: «cmd.argin.type.pythonType»
	    :return: «cmd.argout.description»
	    :rtype: «cmd.argout.type.pythonType» """
        print "In ", self.get_name(), "::TemplCmd()"
        #	Add your own code here
«IF cmd.argout.type.pythonType != 'PyTango.DevVoid'»        return argout«ENDIF»
		'''
	}
	
	def writeAttributeMethod(Attribute attribute) '''
#------------------------------------------------------------------
#	Write «attribute.name» attribute
#------------------------------------------------------------------
	def write_«attribute.name»(self, attr):
		print "In ", self.get_name(), "::write_«attribute.name»()"
		data=attr.get_write_value()
		print "Attribute value = ", data

		#	Add your own code here
		
	'''
		
	def readAttributeMethod(Attribute attribute) '''
#------------------------------------------------------------------
#	Read «attribute.name» attribute
#------------------------------------------------------------------
	def read_«attribute.name»(self, attr):
		print "In ", self.get_name(), "::read_«attribute.name»()"
		
		#	Add your own code here
		
        attr.set_value(attr_«attribute.name»_read)
	'''
	
		
	def attributeMethodStateMachine(Attribute attribute) '''
#------------------------------------------------------------------
#	Is «attribute.name» attribute allowed
#------------------------------------------------------------------
	def is_«attribute.name»_allowed(self, attr):
	    print "In ", self.get_name(), "::is_«attribute.name»_allowed()"
        #	Add your own code here
	'''

    def pythonPropertyClass(Property prop) '''
        '«prop.name»':
            [«prop.type.pythonPropType»«IF !prop.description.empty»,
            "«prop.description»"«ENDIF»«IF !prop.defaultPropValue.empty»,
            «prop.defaultPropValue» «ENDIF»],
    '''
    
    def pythonCommandClass(Command cmd) '''
        '«cmd.name»':
            [[«cmd.argin.type.pythonType»«IF !cmd.argin.description.empty» , "«cmd.argin.description»"«ENDIF»],
            [«cmd.argout.type.pythonType»«IF !cmd.argout.description.empty» , "«cmd.argout.description»"«ENDIF»]],
    '''
    
    def pythonAttributeClass(Attribute attr) '''
        '«attr.name»':
            [[«attr.dataType.pythonType»,
            PyTango.«attr.attType.toUpperCase»,
            PyTango.«attr.rwType.toUpperCase»]«IF !attr.properties.label.empty || !attr.properties.unit.empty»,
            {
            «IF !attr.properties.label.empty»    'label':"«attr.properties.label»",«ENDIF»
            «IF !attr.properties.unit.empty»    'unit':"«attr.properties.unit»",«ENDIF»
            «IF !attr.properties.standardUnit.empty»    'standard unit':"«attr.properties.standardUnit»",«ENDIF»
            «IF !attr.properties.format.empty»    'label':"«attr.properties.format»",«ENDIF»
            «IF !attr.properties.maxValue.empty»    'max value':«attr.properties.maxValue»,«ENDIF»
            «IF !attr.properties.minValue.empty»    'min value':«attr.properties.minValue»,«ENDIF»
            «IF !attr.properties.maxAlarm.empty»    'max alarm':«attr.properties.maxAlarm»,«ENDIF»
            «IF !attr.properties.minAlarm.empty»    'min alarm':«attr.properties.minAlarm»,«ENDIF»
            «IF !attr.properties.maxWarning.empty»    'max warning':«attr.properties.maxWarning»,«ENDIF»
            «IF !attr.properties.minWarning.empty»    'min warning':«attr.properties.minWarning»,«ENDIF»
            «IF !attr.properties.deltaTime.empty»    'delta time':«attr.properties.deltaTime»,«ENDIF»
            «IF !attr.properties.deltaValue.empty»    'delta value':«attr.properties.deltaValue»,«ENDIF»
            «IF !attr.properties.description.empty»    'description':"«attr.properties.description»"«ENDIF»
            } ],
            «ELSE»],«ENDIF»
    '''
}