//+======================================================================
//
// Project:   Tango
//
// Description:  source code for Tango code generator.
//
// $Author: verdier $
//
// Copyright (C) :  2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013,2014
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

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*

class PythonDeviceHL implements IGenerator {
    @Inject    extension PythonUtils
    @Inject    extension PythonTypeDefinitions

    override void doGenerate(Resource resource, IFileSystemAccess fsa){
        println("doGenerate for pythonHL")
        for(cls : resource.allContents.toIterable.filter(typeof(PogoDeviceClass))){
            if (cls.description.filestogenerate.toLowerCase.contains("code files") &&
            	cls.description.language.toLowerCase.equals("pythonhl") )    {
                println("doGenerate for pythonHL " + cls.name)
                fsa.generateFile(cls.name + '.py', cls.generate_pythonFile)
            }
        }
    }
    

    //====================================================
    //    The python file definition
    //====================================================
    def generate_pythonFile(PogoDeviceClass cls)'''
        «cls.pythonDevice»
        «cls.pythonMainMethodHL»
    '''

    //====================================================
    //    The python device 
    //====================================================
    def pythonDevice(PogoDeviceClass cls)'''
        «cls.pythonHeader»
        
        class «cls.name» («cls.inheritedPythonClassNameHL»):
            __metaclass__ = DeviceMeta
        
        «cls.pythonProperties»
        
        «cls.pythonAttributeDefinitions»
        
        «cls.pythonConstructors»
        
        «cls.pythonAttributes»
        
        «cls.pythonCommands»
    '''

    //====================================================
    //    File header
    //====================================================
    def pythonHeader(PogoDeviceClass cls) '''
import PyTango
import sys
from PyTango import AttrQuality, AttrWriteType, DispLevel
from PyTango.server import run
from PyTango.server import Device, DeviceMeta
from PyTango.server import attribute, command
from PyTango.server import class_property, device_property
'''

    //====================================================
    //    Constructors
    //====================================================
    def pythonConstructors(PogoDeviceClass cls)  '''
#====================================================
#    General methods
#====================================================
    def init_device(self):
        self.get_device_properties()
        
    def always_executed_hook(self):
        self.debug_stream("In always_executed_hook method()")
    def delete_device(self):
        self.debug_stream("In delete_device()")
'''

    //====================================================
    //    Attribute definitions
    //====================================================
    def pythonAttributeDefinitions(PogoDeviceClass cls)'''
    #====================================================
    #    Attributes declaration
    #====================================================
        «FOR attr : cls.attributes»
        «attr.pythonAttributeClassHL»
        
        «ENDFOR»
    '''
    //====================================================
    //    Attributes
    //====================================================
    def pythonAttributes(PogoDeviceClass cls)  '''
#====================================================
#    Attributes methods
#====================================================
    «FOR attr: cls.attributes»
    «IF attr.isRead»
    «readAttributeMethodHL(cls, attr)»
    «ENDIF»
    «IF attr.isWrite»
    «writeAttributeMethodHL(cls, attr)»
    «ENDIF»
    «IF !attr.readExcludedStates.empty || !attr.writeExcludedStates.empty»
    «attributeMethodStateMachineHL(cls, attr)»
    «ENDIF»
    «ENDFOR»
    «cls.pythonDynamicAttributes»
    '''
    //====================================================
    //    Dynamic Attributes
    //====================================================
    def pythonDynamicAttributes(PogoDeviceClass cls)  '''
            «FOR attr: cls.dynamicAttributes»
            «IF attr.isRead»
        «readAttributeMethodHL(cls, attr)»
            «ENDIF»
            «IF attr.isWrite»
        «writeAttributeMethodHL(cls, attr)»
            «ENDIF»
            «IF !attr.readExcludedStates.empty || !attr.writeExcludedStates.empty»
        «attributeMethodStateMachineHL(cls, attr)»
            «ENDIF»
        «ENDFOR»
        «IF !cls.dynamicAttributes.empty»
        def initialize_dynamic_attributes(self):
            self.debug_stream("In initialize_dynamic_attributes()")
            
            #   Example to add dynamic attributes
            #   Copy inside the folowing protected area to instanciate at startup.
            
            «FOR attr : cls.dynamicAttributes»
                """   For Attribute «attr.name»
                «attr.dynamicAttributeCreationExample»
                «attr.dynamicAttributeSetMemorizedExample»
                «cls.dynamicAttributeDefaultValueExample(attr)»"""
            «ENDFOR»
        «ENDIF»
    '''

    //====================================================
    //    Dynamic Attributes for class
    //====================================================
    def pythonDynamicAttributesClass(PogoDeviceClass cls)  '''
            def dyn_attr(self, dev_list):
                """Invoked to create dynamic attributes for the given devices.
                Default implementation calls
                :meth:`«cls.name».initialize_dynamic_attributes` for each device
            
                :param dev_list: list of devices
                :type dev_list: :class:`PyTango.DeviceImpl`"""
            
                for dev in dev_list:
                    try:
                        dev.initialize_dynamic_attributes()
                    except:
                        import traceback
                        dev.warn_stream("Failed to initialize dynamic attributes")
                        dev.debug_stream("Details: " + traceback.format_exc())
    '''

    //    Commands
    //====================================================
    def pythonCommands(PogoDeviceClass cls)  '''
#====================================================
#    Commands
#====================================================
    «FOR cmd: cls.commands»
    «commandExecutionHL(cls, cmd)»
    «IF !cmd.excludedStates.empty»
    «commandMethodStateMachineHL(cls, cmd)»
    «ENDIF»
    «ENDFOR»
    «cls.inheritanceCmdList»
    '''
    //====================================================
    //    Properties
    //====================================================
    def pythonProperties(PogoDeviceClass cls)'''
#====================================================
#    Properties
#====================================================
    «FOR prop : cls.classProperties»
    «prop.pythonPropertyClassHL»
    «ENDFOR»
    «cls.inheritanceClassPropertyList»
    «FOR prop : cls.deviceProperties»
    «prop.pythonPropertyDeviceHL»
    «ENDFOR»
    «cls.inheritanceDevicePropertyList»
    '''
    
    //====================================================
    //    Main method
    //====================================================
    def pythonMainMethodHL(PogoDeviceClass cls)'''
        
        if __name__ == '__main__':
            run((«cls.name»,))
    '''
}