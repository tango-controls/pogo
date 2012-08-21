package fr.esrf.tango.pogo.generator.python

import fr.esrf.tango.pogo.pogoDsl.Command
import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import fr.esrf.tango.pogo.pogoDsl.Property
import com.google.inject.Inject
import static extension fr.esrf.tango.pogo.generator.python.PythonTypeDefinitions.*
import static extension fr.esrf.tango.pogo.generator.python.ProtectedArea.*

class PythonUtils {
	@Inject extension fr.esrf.tango.pogo.generator.common.StringUtils
	@Inject	extension ProtectedArea
		
	def commentMultiLinesPython(PogoDeviceClass cls){
		cls.description.description.replaceAll("\n","\n#\t\t\t\t");
	}
	
	def commentMultiLinesPythonStr(String str){
		str.replaceAll("\n","\n#\t\t\t\t");
	}
	
	def commandExecution(PogoDeviceClass cls, Command cmd) '''
#------------------------------------------------------------------
#	«cmd.name» command:
#------------------------------------------------------------------
    def «cmd.name»(self«IF cmd.argout.type.pythonType != 'PyTango.DevVoid'», argin«ENDIF»):
        """ «cmd.description»
	    
        :param argin: «cmd.argin.description»
        :type: «cmd.argin.type.pythonType»
        :return: «cmd.argout.description»
        :rtype: «cmd.argout.type.pythonType» """
        self.debug_stream("In " + self.get_name() +  ".«cmd.name»()")
        «IF cmd.argout.type.pythonType != 'PyTango.DevVoid'»argout = «cmd.argout.type.defaultValue»«ENDIF»
        «protectedArea(cls, cmd.name)»
        «IF cmd.argout.type.pythonType != 'PyTango.DevVoid'»return argout«ENDIF»

		'''
	
	def commandMethodStateMachine2(Command cmd) '''
#------------------------------------------------------------------
#	Is «cmd.name» command allowed
#------------------------------------------------------------------
    def is_«cmd.name»_allowed(self):
        self.debug_stream("In " + self.get_name() + ".is_«cmd.name»_allowed()")
        if («cmd.excludedStates.ifContentFromListPython»):
            return False
        else:
            return True
	        
	        
		'''
		
	def commandMethodStateMachine(Command cmd) '''
#------------------------------------------------------------------
#	Is «cmd.name» command allowed
#------------------------------------------------------------------
    def is_«cmd.name»_allowed(self):
        self.debug_stream("In " + self.get_name() + ".is_«cmd.name»_allowed()")
        return not(«cmd.excludedStates.ifContentFromListPython»)
		'''
	
	def writeAttributeMethod(PogoDeviceClass cls, Attribute attribute) '''
#------------------------------------------------------------------
#	Write «attribute.name» attribute
#------------------------------------------------------------------
    def write_«attribute.name»(self, attr):
        self.debug_stream("In " + self.get_name() + ".write_«attribute.name»()")
        data=attr.get_write_value()
        self.debug_stream("Attribute value = " + str(data))
        «protectedArea(cls, attribute.name + "_write")»
	'''
		
	def readAttributeMethod(PogoDeviceClass cls, Attribute attribute) '''
#------------------------------------------------------------------
#	Read «attribute.name» attribute
#------------------------------------------------------------------
    def read_«attribute.name»(self, attr):
        self.debug_stream("In " + self.get_name() + ".read_«attribute.name»()")
        «protectedArea(cls, attribute.name + "_read")»
        attr.set_value(self.attr_«attribute.name»_read)
        
	'''
	
	def attributeMethodStateMachine(Attribute attribute) '''
#------------------------------------------------------------------
#	Is «attribute.name» attribute allowed
#------------------------------------------------------------------
    def is_«attribute.name»_allowed(self, attr):
        self.debug_stream("In " + self.get_name() + ".is_«attribute.name»_allowed()")
        return not(«attribute.readExcludedStates.ifContentFromListPython»)
	'''

    def pythonPropertyClass(Property prop) ''''«prop.name»':
    [«prop.type.pythonPropType»«IF !prop.description.empty»,
    "«prop.description»"«ENDIF»«IF !prop.defaultPropValue.empty»,
    «IF prop.type.pythonPropType.equals("PyTango.DevString")»["«prop.defaultPropValue.get(0)»"] «ELSE»«prop.defaultPropValue»«ENDIF»«ELSE»,
    [] «ENDIF»],
    '''
    
    def pythonCommandClass(Command cmd) '''        '«cmd.name»':
            [[«cmd.argin.type.pythonType»«IF !cmd.argin.description.empty» , "«cmd.argin.description.oneLineString»"«ELSE» , "none"«ENDIF»],
            [«cmd.argout.type.pythonType»«IF !cmd.argout.description.empty» , "«cmd.argout.description.oneLineString»"«ELSE» , "none"«ENDIF»]«IF cmd.displayLevel.equals("EXPERT") || 
    !cmd.polledPeriod.equals("0")»,
            {
    «IF cmd.displayLevel.equals("EXPERT")»            'Display level':PyTango.DispLevel.EXPERT,«ENDIF»
    «IF !cmd.polledPeriod.equals("0")»            'Polling Period':«cmd.polledPeriod»,«ENDIF»
            } ],
    «ELSE»],«ENDIF»
    '''
    
    def pythonAttributeClass(Attribute attr) ''''«attr.name»':
    [[«attr.dataType.pythonType»,
    PyTango.«attr.attType.toUpperCase»,
    PyTango.«attr.rwType.toUpperCase»«IF attr.image», «attr.maxX», «attr.maxY»«ELSE
    »«IF attr.spectrum», «attr.maxX»«ENDIF»«ENDIF»]«IF !attr.properties.label.empty || !attr.properties.unit.empty ||
    !attr.properties.standardUnit.empty ||!attr.properties.displayUnit.empty || !attr.properties.format.empty || 
    !attr.properties.maxValue.empty|| !attr.properties.minValue.empty || !attr.properties.maxAlarm.empty || 
    !attr.properties.minAlarm.empty || !attr.properties.maxWarning.empty || !attr.properties.minWarning.empty || 
    !attr.properties.deltaTime.empty || !attr.properties.deltaValue.empty || !attr.properties.description.empty ||
    attr.displayLevel.equals("EXPERT") || !attr.polledPeriod.equals("0") || attr.eventCriteria!=null ||
    attr.eventCriteria!=null || !attr.memorized.empty»,
    {
    «IF !attr.properties.label.empty»    'label':"«attr.properties.label»",«ENDIF»
    «IF !attr.properties.unit.empty»    'unit':"«attr.properties.unit»",«ENDIF»
    «IF !attr.properties.standardUnit.empty»    'standard unit':«attr.properties.standardUnit»,«ENDIF»
    «IF !attr.properties.displayUnit.empty»    'display unit':"«attr.properties.displayUnit»",«ENDIF»
    «IF !attr.properties.format.empty»    'format':"«attr.properties.format»",«ENDIF»
    «IF !attr.properties.maxValue.empty»    'max value':«attr.properties.maxValue»,«ENDIF»
    «IF !attr.properties.minValue.empty»    'min value':«attr.properties.minValue»,«ENDIF»
    «IF !attr.properties.maxAlarm.empty»    'max alarm':«attr.properties.maxAlarm»,«ENDIF»
    «IF !attr.properties.minAlarm.empty»    'min alarm':«attr.properties.minAlarm»,«ENDIF»
    «IF !attr.properties.maxWarning.empty»    'max warning':«attr.properties.maxWarning»,«ENDIF»
    «IF !attr.properties.minWarning.empty»    'min warning':«attr.properties.minWarning»,«ENDIF»
    «IF !attr.properties.deltaTime.empty»    'delta time':«attr.properties.deltaTime»,«ENDIF»
    «IF !attr.properties.deltaValue.empty»    'delta value':«attr.properties.deltaValue»,«ENDIF»
    «IF !attr.properties.description.empty»    'description':"«attr.properties.description.oneLineString»",«ENDIF»
    «IF !attr.polledPeriod.equals("0")»    'Polling period':«attr.polledPeriod»,«ENDIF»
    «IF attr.displayLevel.equals("EXPERT")»    'Display level':PyTango.DispLevel.EXPERT,«ENDIF»
    «IF attr.eventCriteria!=null»«IF !attr.eventCriteria.period.empty»    'period':'«attr.eventCriteria.period»',«ENDIF»
    «IF !attr.eventCriteria.relChange.empty»    'rel_change':'«attr.eventCriteria.relChange»',«ENDIF»
    «IF !attr.eventCriteria.absChange.empty»    'abs_change':'«attr.eventCriteria.absChange»',«ENDIF»«ENDIF»
    «IF attr.evArchiveCriteria!=null»«IF !attr.evArchiveCriteria.period.empty»    'archive_period':'«attr.evArchiveCriteria.period»',«ENDIF»
    «IF !attr.evArchiveCriteria.relChange.empty»    'archive_rel_change':'«attr.evArchiveCriteria.relChange»',«ENDIF»
    «IF !attr.evArchiveCriteria.absChange.empty»    'archive_abs_change':'«attr.evArchiveCriteria.absChange»',«ENDIF»«ENDIF»
    «IF attr.write»«IF !attr.memorized.empty»    'Memorized':"«IF attr.memorizedAtInit.empty»false«ELSE»true«ENDIF»",«ENDIF»«ENDIF»
    } ],
    «ELSE»],«ENDIF»
    '''
    
    //======================================================
	def setEventCriteria(Attribute attribute) '''
		«IF attribute.dataReadyEvent!=null»
			«IF attribute.dataReadyEvent.fire!=null && attribute.dataReadyEvent.fire.equals("true")»
				«attribute.name.toLowerCase».set_data_ready_event(«attribute.dataReadyEvent.fire»);
			«ENDIF»
		«ENDIF»
		«IF attribute.changeEvent!=null»
			«IF attribute.changeEvent.fire!=null && attribute.changeEvent.fire.equals("true")»
				«attribute.name.toLowerCase».set_change_event(«attribute.changeEvent.fire», «attribute.changeEvent.libCheckCriteria»);
			«ENDIF»
		«ENDIF»
		«IF attribute.archiveEvent!=null»
			«IF attribute.archiveEvent.fire!=null && attribute.archiveEvent.fire.equals("true")»
				«attribute.name.toLowerCase».set_archive_event(«attribute.archiveEvent.fire», «attribute.archiveEvent.libCheckCriteria»);
			«ENDIF»
		«ENDIF»
	'''
}