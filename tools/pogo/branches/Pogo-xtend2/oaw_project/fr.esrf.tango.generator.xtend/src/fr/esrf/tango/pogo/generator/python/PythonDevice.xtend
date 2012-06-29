package fr.esrf.tango.pogo.generator.python

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import fr.esrf.tango.pogo.generator.cpp.global.StringUtils
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import static extension fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea.*
import fr.esrf.tango.pogo.generator.cpp.global.ProtectedArea

class PythonDevice implements IGenerator {
	@Inject	extension PythonUtils
	@Inject extension fr.esrf.tango.pogo.generator.cpp.global.StringUtils
	@Inject extension ProtectedArea
	override void doGenerate(Resource resource, IFileSystemAccess fsa){
		for(cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))){
			if (cls.description.language.toLowerCase.equals("python")) {
				fsa.generateFile(cls.name.toLowerCase + '.py', cls.generate_pythonFile)
			}
		}
	}
	
	def generate_pythonFile(PogoDeviceClass cls)'''
			#!/usr/bin/env python
			# -*- coding:utf-8 -*- 
			
			
			##############################################################################
			## license :
			##============================================================================
			##
			## File :        «cls.name + ".py"»
			## 
			## Project :     «cls.description.title»
			##
			## $Author :      «cls.description.identification.author»$
			##
			## $Revision :    $
			##
			## $Date :        $
			##
			## $HeadUrl :     $
			##============================================================================
			##  		This file is generated by POGO
			##	(Program Obviously used to Generate tango Object)
			##
			##        (c) - Software Engineering Group - ESRF
			##############################################################################
			
			"""«cls.description.description»"""
			
			__all__ = ["«cls.name»", "«cls.name»Class", "main"]
			
			__docformat__ = 'restructuredtext'
			
			import PyTango
			import sys
			
			##############################################################################
			## Device States Description
			##
			«FOR state : cls.states»
			## «state.name» : «state.description»
			«ENDFOR»
			##############################################################################
			
			class «cls.name» (PyTango.Device_4Impl):
			
			#--------- Add you global variables here --------------------------
			
			#------------------------------------------------------------------
			#	Device constructor
			#------------------------------------------------------------------
				def __init__(self,cl, name):
					PyTango.Device_4Impl.__init__(self,cl,name)
					«cls.name».init_device(self)
			
			#------------------------------------------------------------------
			#	Device destructor
			#------------------------------------------------------------------
				def delete_device(self):
					print "[Device delete_device method] for device",self.get_name()
			
			
			#------------------------------------------------------------------
			#	Device initialization
			#------------------------------------------------------------------
				def init_device(self):
					print "In ", self.get_name(), "::init_device()"
					self.get_device_properties(self.get_device_class())
			
			#------------------------------------------------------------------
			#	Always excuted hook method
			#------------------------------------------------------------------
				def always_executed_hook(self):
					print "In ", self.get_name(), "::always_excuted_hook()"
			
			#==================================================================
			#
			#	«cls.name» read/write attribute methods
			#
			#==================================================================
			
			«FOR attr: cls.attributes»
				«IF attr.isRead»
					«attr.readAttributeMethod»
				«ENDIF»
				«IF attr.isWrite»
					«attr.writeAttributeMethod»
				«ENDIF»
				«attr.attributeMethodStateMachine»
			«ENDFOR»
			
			#------------------------------------------------------------------
			#	Read Attribute Hardware
			#------------------------------------------------------------------
				def read_attr_hardware(self,data):
					print "In ", self.get_name(), "::read_attr_hardware()"
			
			
			#==================================================================
			#
			#	«cls.name» command methods
			#
			#==================================================================
			
			«FOR cmd: cls.commands»
				«cmd.commandExecution»
			«ENDFOR»
			
			#==================================================================
			#
			#	«cls.name»Class class definition
			#
			#==================================================================
			class «cls.name»Class(PyTango.DeviceClass):
			
				#	Class Properties
				class_property_list = {
					«FOR prop : cls.classProperties»
					    «prop.pythonPropertyClass»
					«ENDFOR»
					}
			
			
				#	Device Properties
				device_property_list = {
					«FOR prop : cls.deviceProperties»
					    «prop.pythonPropertyClass»
					«ENDFOR»
					}
			
			
				#	Command definitions
				cmd_list = {
					«FOR cmd : cls.commands»
					    «cmd.pythonCommandClass»
					«ENDFOR»
					}
			
			
				#	Attribute definitions
				attr_list = {
					«FOR attr : cls.attributes»
					    «attr.pythonAttributeClass»
					«ENDFOR»
					}
			
			
			#------------------------------------------------------------------
			#	«cls.name»Class Constructor
			#------------------------------------------------------------------
				def __init__(self, name):
					PyTango.DeviceClass.__init__(self, name)
					self.set_type(name);
					print "In «cls.name»Class  constructor"
			
			#==================================================================
			#
			#	«cls.name» class main method
			#
			#==================================================================
			def main():
				try:
					py = PyTango.Util(sys.argv)
					py.add_class(«cls.name»Class,«cls.name»,'«cls.name»')
			
					U = PyTango.Util.instance()
					U.server_init()
					U.server_run()
			
				except PyTango.DevFailed,e:
					print '-------> Received a DevFailed exception:',e
				except Exception,e:
					print '-------> An unforeseen exception occured....',e
			
			if __name__ == '__main__':
			    main()
	'''
}