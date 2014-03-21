//+======================================================================
//
// Project:   Tango
//
// Description:  source code for Tango code generator.
//
// $Author: verdier $
//
// Copyright (C) :  2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013
//					European Synchrotron Radiation Facility
//                  BP 220, Grenoble 38043
//                  FRANCE
//
// This file is part of Tango.
//
// Tango is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// Tango is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
// $Revision: $
// $Date:  $
//
// $HeadURL: $
//
//-======================================================================

package fr.esrf.tango.pogo.generator.python

import fr.esrf.tango.pogo.pogoDsl.Command
import fr.esrf.tango.pogo.pogoDsl.Attribute
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import fr.esrf.tango.pogo.pogoDsl.Property
import com.google.inject.Inject
import static extension fr.esrf.tango.pogo.generator.python.PythonTypeDefinitions.*
import static extension fr.esrf.tango.pogo.generator.python.ProtectedArea.*
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*

class PythonUtils {
    @Inject extension fr.esrf.tango.pogo.generator.common.StringUtils
    @Inject extension ProtectedArea
    @Inject extension fr.esrf.tango.pogo.generator.python.PythonTypeDefinitions    
	@Inject	extension fr.esrf.tango.pogo.generator.python.PyUtils
        
    def commentMultiLinesPython(PogoDeviceClass cls){
        cls.description.description.replaceAll("\n","\n#                ");
    }
    
    def commentMultiLinesPythonStr(String str){
        str.replaceAll("\n","\n#                ");
    }
    def commentCmdParamMultiLines(String str){
    	if (str.contains("\n"))
    	{
    		return "\n    " + str.replaceAll("\n","\n    ");
    	}
    	else
    	{
    		return str;
    	}
    }
    
    def isMemorized(Attribute attr) {
        if (attr.write)    {
            if (attr.memorized!=null) {
                if (attr.memorized == "true") {
                    if(attr.memorizedAtInit == "true") {
                        return "    \'Memorized\':\"true\""; 
                    }
                    else {
                        return "    \'Memorized\':\"true_without_hard_applied\"";
                    }
                }
            }
        }
        return "";
    }
    
    def hasAttrPropertySet(Attribute attr){
        return (
        	(attr.memorized!=null && !attr.memorized.empty) ||
            !attr.properties.label.empty       ||
            !attr.properties.unit.empty        ||
            !attr.properties.standardUnit.empty||
            !attr.properties.displayUnit.empty ||
            !attr.properties.format.empty      || 
            !attr.properties.maxValue.empty    ||
            !attr.properties.minValue.empty    ||
            !attr.properties.maxAlarm.empty    || 
            !attr.properties.minAlarm.empty    ||
            !attr.properties.maxWarning.empty  ||
            !attr.properties.minWarning.empty  ||
            !attr.properties.deltaTime.empty   ||
            !attr.properties.deltaValue.empty  ||
            !attr.properties.description.empty ||
            attr.displayLevel.equals("EXPERT") ||
            !attr.polledPeriod.equals("0")     ||
            attr.eventCriteria!=null           ||
            attr.eventCriteria!=null);
    }
    
    def hasCmdPropertySet(Command cmd){
        return (cmd.displayLevel.equals("EXPERT") || !cmd.polledPeriod.equals("0"));
    }
    
    def commandExecution(PogoDeviceClass cls, Command cmd) '''
		def «cmd.methodName»(self«IF !cmd.argin.type.voidType», argin«ENDIF»):
		    """ «cmd.description»
		    
		    :param «IF !cmd.argin.type.voidType»argin«ENDIF»: «cmd.argin.description.commentCmdParamMultiLines»
		    :type: «cmd.argin.type.pythonType»
		    :return: «cmd.argout.description.commentCmdParamMultiLines»
		    :rtype: «cmd.argout.type.pythonType» """
		    self.debug_stream("In «cmd.methodName»()")
		    «IF !cmd.argout.type.voidType»argout = «cmd.argout.type.defaultValue»«ENDIF»
		    «protectedArea(cls, cmd.name)»
		    «cmd.returnMethodCode»
		    
        '''
        
    def commandMethodStateMachine(PogoDeviceClass cls, Command cmd) '''
		def is_«cmd.name»_allowed(self):
		    self.debug_stream("In is_«cmd.name»_allowed()")
		    state_ok = not(«cmd.excludedStates.ifContentFromListPython»)
		    «protectedArea(cls, "is_" + cmd.name + "_allowed")»
		    return state_ok
		    
    '''
    
    def writeAttributeMethod(PogoDeviceClass cls, Attribute attribute) '''
		def write_«attribute.name»(self, attr):
		    self.debug_stream("In write_«attribute.name»()")
		    data=attr.get_write_value()
		    «protectedArea(cls, attribute.name + "_write")»
		    
    '''
        
    def readAttributeMethod(PogoDeviceClass cls, Attribute attribute) '''
		def read_«attribute.name»(self, attr):
		    self.debug_stream("In read_«attribute.name»()")
		    «protectedArea(cls, attribute.name + "_read", attribute.setAttrVal, false)»
		    
    '''
    
    def attributeMethodStateMachine(PogoDeviceClass cls, Attribute attribute) '''
		def is_«attribute.name»_allowed(self, attr):
		    self.debug_stream("In is_«attribute.name»_allowed()")
		    if attr==PyTango.AttReqType.READ_REQ:
		        state_ok = not(«attribute.readExcludedStates.ifContentFromListPython»)
		    else:
		        state_ok = not(«attribute.writeExcludedStates.ifContentFromListPython»)
		    «protectedArea(cls, "is_" + attribute.name + "_allowed")»
		    return state_ok
		    
    '''

    def pythonPropertyClass(Property prop) '''        '«prop.name»':
            [«prop.type.pythonPropType»«IF !prop.description.empty»,
            "«prop.description.oneLineString»"«ENDIF»«IF !prop.defaultPropValue.empty»,
            «IF prop.type.pythonPropType.equals("PyTango.DevString")»["«prop.defaultPropValue.get(0)»"] «ELSE»«prop.defaultPropValue»«ENDIF»«ELSE»,
            [] «ENDIF»],
    '''
    
    def pythonCommandClass(Command cmd) '''        '«cmd.name»':
            [[«cmd.argin.type.pythonType», "«getArgDescription(cmd.argin.description.oneLineString)»"],
            [«cmd.argout.type.pythonType», "«getArgDescription(cmd.argout.description.oneLineString)»"]«IF cmd.hasCmdPropertySet»,
            {
            «setAttrProperty("Polling period", cmd.polledPeriod)»
            «setAttrProperty("Display level", cmd.displayLevel)»
            } ],
    «ELSE»],«ENDIF»
    '''
    
    def String pythonAttributeSize(Attribute attr) {
        if (attr.image) {
            return ", " + attr.maxX + ", " + attr.maxY;
        }
        else
        if (attr.spectrum) {
            return ", " + attr.maxX;
        }
        else
            return "";
    }
    
    def pythonAttributeClass(Attribute attr) '''        '«attr.name»':
            [[«attr.dataType.pythonType»,
            PyTango.«attr.attType.toUpperCase»,
            PyTango.«attr.rwType.toUpperCase»«pythonAttributeSize(attr)»]«IF attr.hasAttrPropertySet»,
            {
            «setAttrProperty("label", attr.properties.label)»
            «setAttrProperty("unit", attr.properties.unit)»
            «setAttrProperty("standard unit", attr.properties.standardUnit)»
            «setAttrProperty("display unit", attr.properties.displayUnit)»
            «setAttrProperty("format", attr.properties.format)»
            «setAttrProperty("max value", attr.properties.maxValue)»
            «setAttrProperty("min value", attr.properties.minValue)»
            «setAttrProperty("max alarm", attr.properties.maxAlarm)»
            «setAttrProperty("min alarm", attr.properties.minAlarm)»
            «setAttrProperty("max warning", attr.properties.maxWarning)»
            «setAttrProperty("min warning", attr.properties.minWarning)»
            «setAttrProperty("delta time", attr.properties.deltaTime)»
            «setAttrProperty("delta value", attr.properties.deltaValue)»
            «setAttrProperty("description", attr.properties.description.oneLineString)»
            «setAttrProperty("Polling period", attr.polledPeriod)»
            «setAttrProperty("Display level", attr.displayLevel)»
            «IF attr.eventCriteria!=null»
                «setAttrProperty("period", attr.eventCriteria.period)»
                «setAttrProperty("rel_change", attr.eventCriteria.relChange)»
                «setAttrProperty("abs_change", attr.eventCriteria.absChange)»
            «ENDIF»
            «IF attr.evArchiveCriteria!=null»
                «setAttrProperty("archive_period", attr.evArchiveCriteria.period)»
                «setAttrProperty("archive_rel_change", attr.evArchiveCriteria.relChange)»
                «setAttrProperty("archive_abs_change", attr.evArchiveCriteria.absChange)»
             «ENDIF»
            «attr.isMemorized»
            } ],
            «ELSE»],«ENDIF»
    '''
    
    //======================================================
    def setEventCriteria(Attribute attribute) '''
        «IF attribute.dataReadyEvent!=null»
            «IF attribute.dataReadyEvent.fire!=null && attribute.dataReadyEvent.fire.equals("true")»
                «attribute.name».set_data_ready_event(«attribute.dataReadyEvent.fire»);
            «ENDIF»
        «ENDIF»
        «IF attribute.changeEvent!=null»
            «IF attribute.changeEvent.fire!=null && attribute.changeEvent.fire.equals("true")»
                 «attribute.name».set_change_event(«attribute.changeEvent.fire», «attribute.changeEvent.libCheckCriteria»);
            «ENDIF»
        «ENDIF»
        «IF attribute.archiveEvent!=null»
            «IF attribute.archiveEvent.fire!=null && attribute.archiveEvent.fire.equals("true")»
                 «attribute.name».set_archive_event(«attribute.archiveEvent.fire», «attribute.archiveEvent.libCheckCriteria»);
            «ENDIF»
        «ENDIF»
    '''
    //======================================================
    /**
     * Code to generate dynamic attribute example.
     */
    //======================================================
    def dynamicAttributeCreationExample(Attribute attr) '''
        «IF attr.scalar»
            my«attr.name» = PyTango.Attr('My«attr.name»', «attr.dataType.pythonType», PyTango.«attr.rwType.toUpperCase»)
        «ENDIF»
        «IF attr.spectrum»
            my«attr.name» = PyTango.SpectrumAttr('My«attr.name»', «attr.dataType.pythonType», PyTango.«attr.rwType.toUpperCase», «attr.maxX»)
        «ENDIF»
        «IF attr.image»
            my«attr.name» = PyTango.ImageAttr('«attr.name»', «attr.dataType.pythonType», PyTango.«attr.rwType.toUpperCase», «attr.maxX», «attr.maxY»)
        «ENDIF»
    '''
    //======================================================
    def dynamicAttributeDefaultValueExample(PogoDeviceClass cls, Attribute attr) '''
        «IF attr.displayLevel.equals("EXPERT")»
            my«attr.name».set_disp_level(PyTango.DispLevel.EXPERT)
        «ENDIF»
        «cls.addDynamicAttributeExample(attr)»
        «IF attr.read»
            self.attr_«attr.name»_read = «attr.defaultValueDim»
        «ENDIF»
    '''
    //======================================================
    def dynamicAttributeSetMemorizedExample(Attribute attribute) '''
        «IF attribute.write»
            «IF attribute.memorized!=null»
                «IF attribute.memorized == "true"»
                    my«attribute.name».set_memorized()
                    «IF attribute.memorizedAtInit == "true"»
                        my«attribute.name».set_memorized_init(True)
                    «ELSE»
                        my«attribute.name».set_memorized_init(False)
                    «ENDIF»
                «ENDIF»
            «ENDIF»
        «ENDIF»
    '''
    //======================================================
}