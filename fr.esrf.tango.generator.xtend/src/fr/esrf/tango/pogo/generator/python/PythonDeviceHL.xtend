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
    @Inject    extension PythonHlProjectUtils
    @Inject    extension ProtectedAreaHL

    override void doGenerate(Resource resource, IFileSystemAccess fsa){
        println("doGenerate for pythonHL")
        for(cls : resource.allContents.toIterable.filter(typeof(PogoDeviceClass))){         
			//	PythonHl Project Directory
			if (cls.description.filestogenerate.toLowerCase.contains("python package")) {
				printTrace("Generating PythonHl project directory")
				fsa.generateFile("setup.py",  cls.generatePythonHlProjectSetup)
				fsa.generateFile("README.rst",  cls.generatePythonHlProjectReadme)
				fsa.generateFile("MANIFEST.in",  cls.generatePythonHlProjectManifest)
				fsa.generateFile("scripts/" + cls.name,  cls.generatePythonHlProjectScript)
				fsa.generateFile("test/"+ cls.name + "_test.py",  cls.generatePythonHlTest)
				fsa.generateFile("test/__init__.py",  cls.generatePythonHlTestInit)
				fsa.generateFile(cls.name+"/__init__.py",  cls.generatePythonHlProjectInit)
				fsa.generateFile(cls.name+"/release.py",  cls.generatePythonHlProjectRelease)
				fsa.generateFile(cls.name+"/__main__.py",  cls.generatePythonHlProjectMain)
				if (cls.description.license == 'GPL') {
					fsa.generateFile("LICENSE.txt",  cls.generatePythonHlProjectLicenseGPL)
				}
				else if (cls.description.license == 'LGPL') {
					fsa.generateFile("LICENSE.txt",  cls.generatePythonHlProjectLicenseLGPL)
					}
				else if (cls.description.license == 'APACHE') {
					fsa.generateFile("LICENSE.txt",  cls.generatePythonHlProjectLicenseAPACHE)
					}
				else if (cls.description.license == 'MIT') {
					fsa.generateFile("LICENSE.txt",  cls.generatePythonHlProjectLicenseMIT)
				}
				if (cls.description.filestogenerate.toLowerCase.contains('sphinx')){
					fsa.generateFile("docs/source/index.rst",cls.generatePythonHlSphinxIndex)
					fsa.generateFile("docs/source/conf.py",cls.generatePythonHlSphinxConf)
					fsa.generateFile("setup.cfg",cls.generatePythonHlSetupCfg)
				}
			}
			 if (cls.description.filestogenerate.toLowerCase.contains("code files") &&
            	cls.description.language.toLowerCase.equals("pythonhl") )    {
            	if (cls.description.filestogenerate.toLowerCase.contains("python package")) {	
	                println("doGenerate for pythonHL " + cls.name)
	                fsa.generateFile(cls.name+"/"+cls.name + '.py', cls.generate_pythonFile)
                }
                else
                {
                	println("doGenerate for pythonHL " + cls.name)
	                fsa.generateFile(cls.name + '.py', cls.generate_pythonFile)
                }
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
# -*- coding: utf-8 -*-
#
# This file is part of the «cls.name» project
#
# «cls.description.copyright.commentMultiLinesPythonStr»
#
# Distributed under the terms of the «cls.description.license» license.
# See LICENSE.txt for more info.

«cls.pythonHeader»


class «cls.name»(«cls.inheritedPythonClassNameHL»):
    """
    «cls.description.description»
    """
    __metaclass__ = DeviceMeta
    «IF cls.description.filestogenerate.toLowerCase.contains("protected regions")»«cls.protectedAreaHL("class_variable")»«ENDIF»
    # ----------------
    # Class Properties
    # ----------------

«cls.pythonClassProperties»
    # -----------------
    # Device Properties
    # -----------------

«cls.pythonDeviceProperties»
    # ----------
    # Attributes
    # ----------

«cls.pythonAttributeDefinitions»
    # ---------------
    # General methods
    # ---------------

«cls.pythonConstructors»
    # ------------------
    # Attributes methods
    # ------------------

«cls.pythonAttributes»
    # --------
    # Commands
    # --------

«cls.pythonCommands»
    '''

    //====================================================
    //    File header
    //====================================================
    def pythonHeader(PogoDeviceClass cls) '''
""" «cls.description.title»

«cls.description.description»
"""

__all__ = ["«cls.name»", "main"]

# PyTango imports
import PyTango
from PyTango import DebugIt
from PyTango.server import run
from PyTango.server import Device, DeviceMeta
from PyTango.server import attribute, command
from PyTango.server import class_property, device_property
from PyTango import AttrQuality, AttrWriteType, DispLevel, DevState
# Additional import
«IF cls.description.filestogenerate.toLowerCase.contains("protected regions")»«cls.protectedAreaHL("additionnal_import")»«ENDIF»
'''

    //====================================================
    //    Constructors
    //====================================================
    def pythonConstructors(PogoDeviceClass cls)  '''
«IF true»    def init_device(self):
        Device.init_device(self)
        «IF cls.description.filestogenerate.toLowerCase.contains("protected regions")»«cls.protectedAreaHL("init_device")»«ENDIF»

    def always_executed_hook(self):
        «IF cls.description.filestogenerate.toLowerCase.contains("protected regions")»«cls.protectedAreaHL("always_executed_hook", "pass", false)»«ELSE»pass«ENDIF»

    def delete_device(self):
        «IF cls.description.filestogenerate.toLowerCase.contains("protected regions")»«cls.protectedAreaHL("delete_device", "pass", false)»«ELSE»pass«ENDIF»
«ENDIF»

'''

    //====================================================
    //    Attribute definitions
    //====================================================
    def pythonAttributeDefinitions(PogoDeviceClass cls)'''
«FOR attr : cls.attributes»    «attr.pythonAttributeClassHL»«IF !cls.attributes.empty»«ENDIF»

«ENDFOR»
    '''
    //====================================================
    //    Attributes
    //====================================================
    def pythonAttributes(PogoDeviceClass cls)  '''
«FOR attr: cls.attributes»
«IF attr.isRead»    «readAttributeMethodHL(cls, attr)»«ENDIF»
«IF attr.isWrite»    «writeAttributeMethodHL(cls, attr)»«ENDIF»
«IF !attr.readExcludedStates.empty || !attr.writeExcludedStates.empty»    «attributeMethodStateMachineHL(cls, attr)»«ENDIF»«ENDFOR»
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
«FOR cmd: cls.commands»«commandExecutionHL(cls, cmd)»
«IF !cmd.excludedStates.empty»    «commandMethodStateMachineHL(cls, cmd)»«ENDIF»«ENDFOR»«IF !cls.inheritanceCmdList.empty»
«cls.inheritanceCmdList»«ENDIF»
    '''
    //====================================================
    //    Properties
    //====================================================
    def pythonClassProperties(PogoDeviceClass cls)'''
«IF !cls.classProperties.empty»
«FOR prop : cls.classProperties»    «prop.pythonPropertyClassHL»

«ENDFOR»
«ENDIF»
«IF !cls.inheritanceClassPropertyList.empty»
«cls.inheritanceClassPropertyList»«ENDIF»
    '''
    
    //====================================================
    //    Properties
    //====================================================
    def pythonDeviceProperties(PogoDeviceClass cls)'''
«IF !cls.deviceProperties.empty»
«FOR prop : cls.deviceProperties»    «prop.pythonPropertyDeviceHL»

«ENDFOR»
«ENDIF»
«IF !cls.inheritanceDevicePropertyList.empty»
«cls.inheritanceDevicePropertyList»«ENDIF»
    '''
    
    //====================================================
    //    Main method
    //====================================================
    def pythonMainMethodHL(PogoDeviceClass cls)'''
# ----------
# Run server
# ----------


def main(args=None, **kwargs):
    from PyTango.server import run
    return run((PyHL,), args=args, **kwargs)

if __name__ == '__main__':
    main()
    '''
}