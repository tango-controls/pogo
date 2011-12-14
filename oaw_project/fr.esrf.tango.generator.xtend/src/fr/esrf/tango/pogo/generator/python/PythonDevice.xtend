package fr.esrf.tango.pogo.generator.python

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import fr.esrf.tango.pogo.pogoDsl.Attribute

class PythonDevice implements IGenerator {
	@Inject
	extension PythonUtils 
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
			fsa.generateFile(resource.pythonFileName, resource.generate_pythonFile)
	}
	
	def generate_pythonFile (Resource resource) '''		
		import PyTango
		import sys
		«FOR cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))»
			«cls.generate_pythonDeviceClass»
		«ENDFOR»
	'''
	
	def generate_pythonDeviceClass (PogoDeviceClass cls) '''		
	class «cls.name»(PyTango.Device_4Impl):
		"""
		Class Description: «cls.description.description»
			
		@author	«"Author".vcsEscaped»
		@version	 «"Revision".vcsEscaped»
		"""
	
		def __init__(self,cl, name):
			"""
			Device constructor
			"""
			PyTango.Device_4Impl.__init__(self,cl,name)
			PyMotor.init_device(self)
		
		def delete_device(self):
			"""
			Device destructor
			"""
			print "[Device delete_device method] for device",self.get_name()
		
		def init_device(self):
			"""
			Device initialization
			"""
			print "In ", self.get_name(), "::init_device()"
			self.set_state(PyTango.DevState.ON)
			self.get_device_properties(self.get_device_class())
		
		def always_executed_hook(self):
			"""
			Always executed hook
			"""
			print "In ", self.get_name(), "::always_excuted_hook()"
		
		def read_attr_hardware(self,data):
			"""
			Read attribute hardware
			"""
			print "In ", self.get_name(), "::read_attr_hardware()"
		
		""" properties """
			«FOR prop: cls.deviceProperties»
				«prop.pythonPropType» «prop.name.toFirstLower()»;
			«ENDFOR»
	
		""" attributes """
		«FOR attr : cls.attributes»
			«attr.generate_attribute»
		«ENDFOR»	
	
	"""
		main method
	"""	
	if __name__ == '__main__':
		try:
			py = PyTango.Util(sys.argv)
			py.add_TgClass(PyMotorClass,PyMotor,'PyMotor')

			U = PyTango.Util.instance()
			U.server_init()
			U.server_run()

			except PyTango.DevFailed,e:
				print '-------> Received a DevFailed exception:',e
			except Exception,e:
				print '-------> An unforeseen exception occured....',e
	
	'''
	
	def generate_attribute(Attribute attr)'''
		def read_«attr.name»(self, attr):
			print "In ", self.get_name(), "::read_«attr.name»()"

			"""	Add your own code here """

			attr_«attr.name»_read = 1.0
			attr.set_value(attr_«attr.name»_read)
		
		«IF attr.rwType == "READ_WRITE"»
			def write_«attr.name»(self, attr):
				print "In ", self.get_name(), "::read_«attr.name»()"

				"""	Add your own code here """

				attr_«attr.name»_read = 1.0
				attr.get_value(attr_«attr.name»_read)
		«ENDIF»
		'''
	
}