package fr.esrf.tango.pogo.generator.java

import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import static extension fr.esrf.tango.pogo.generator.java.JavaUtils.*
import static extension fr.esrf.tango.pogo.generator.java.ProtectedArea.*
import static extension fr.esrf.tango.pogo.generator.java.JavaTypeDefinitions.*
import fr.esrf.tango.pogo.generator.java.JavaAttribute
import fr.esrf.tango.pogo.generator.java.JavaCommand
import com.google.inject.Inject
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*
import fr.esrf.tango.pogo.generator.common.StringUtils
import fr.esrf.tango.pogo.generator.common.Headers
import fr.esrf.tango.pogo.pogoDsl.Property

class JavaDevice  implements IGenerator {

	@Inject extension JavaUtils
	@Inject extension JavaAttribute
	@Inject extension JavaCommand
	@Inject extension ProtectedArea
	@Inject extension StringUtils
	@Inject extension Headers

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			//	Code files
			if (cls.description.filestogenerate.contains("Code files")) {
				fsa.generateFile(cls.javaDeviceClassFileName,     cls.generateJavaDeviceFile)
			}
		}
	}
	def generateJavaDeviceFile (PogoDeviceClass cls) '''
		«cls.javaHeader»

		/**
		 *  «cls.name» class description:
		 *    «cls.description.description.comments("*    ")»
		 */
		
		@Device
		public class «cls.name» {
		
		    private static final Logger logger = LoggerFactory.getLogger(«cls.name».class);
		    private static final XLogger xlogger = XLoggerFactory.getXLogger(«cls.name».class);
		    «cls.protectedArea("variables", "put static variables here", true)»
		
			//========================================================
			//	Property data members and related methods
			//========================================================
			«cls.addClassProperties»
			«cls.addDeviceProperties»

			//========================================================
			//	Programmer's data members
			//========================================================
			«cls.protectedArea("private", "Put private variables here", true)»

			//========================================================
			//	Miscellaneous methods
			//========================================================
			«cls.initDeviceMethod»

			«cls.deleteDeviceMethod»

			«cls.aroundInvokeMethod»

			«cls.dynamicManagerMethod»


			//========================================================
			//	Attribute data members and related methods
			//========================================================
			«cls.attributeMethods»

			//========================================================
			//	Command data members and related methods
			//========================================================
			«cls.stateAndStatusMethods»
			
			«cls.executeCommandMethods»

			//========================================================
			//	Programmer's methods
			//========================================================
			«cls.protectedArea("methods", "Put your own methods here", true)»


			«cls.mainMethod»
		}
	'''
	
	
	//======================================================
	// define the header file and imports
	//======================================================
	def javaHeader(PogoDeviceClass cls) '''
		«cls.openProtectedArea(cls.name+".java")»
		«cls.javaDeviceClassFileName.fileHeader(
			"Java source for the " + cls.name + " class and its commands.\n" +
			"The class is derived from Device. It represents the\n" +
			"CORBA servant object which will be accessed from the\n" +
			"network. All commands which can be executed on the\n" +
			cls.name + " are implemented in this file.",  cls.description.title)»

		«cls.closeProtectedArea(cls.name+".java")»

		package «cls.javaDevicePackage»;

		import org.slf4j.Logger;
		import org.slf4j.LoggerFactory;
		import org.slf4j.ext.XLogger;
		import org.slf4j.ext.XLoggerFactory;
		import org.tango.DeviceState;
		import org.tango.server.InvocationContext;
		import org.tango.server.ServerManager;
		import org.tango.server.annotation.AroundInvoke;
		import org.tango.server.annotation.Attribute;
		import org.tango.server.annotation.AttributeProperties;
		import org.tango.server.annotation.ClassProperty;
		import org.tango.server.annotation.Command;
		import org.tango.server.annotation.Delete;
		import org.tango.server.annotation.Device;
		import org.tango.server.annotation.DeviceProperty;
		import org.tango.server.annotation.DynamicManagement;
		import org.tango.server.annotation.Init;
		import org.tango.server.annotation.State;
		import org.tango.server.annotation.StateMachine;
		import org.tango.server.annotation.Status;
		import org.tango.server.dynamic.DynamicManager;
		import org.tango.utils.DevFailedUtils;
		
		//	Import Tango IDL types
		import fr.esrf.Tango.*;

		«cls.protectedArea("imports", "Add your own import packages", true)»
	'''


	//======================================================
	// define code for class properties
	//======================================================
	def addClassProperties(PogoDeviceClass cls) '''
		«FOR Property property : cls.classProperties»
			/**
			 * Class Property «property.name»
			 * «property.description.comments("* ")»
			 */
			@ClassProperty(name = "«property.name»", description = "«property.description.oneLineString»" «property.defaultValue»)
			private «property.strJavaType» «property.name.dataMemberName»;
			/**
			 * set property «property.name»
			 * @param  «property.name.dataMemberName»
			 */
			public void set«property.name»(«property.strJavaType» «property.name.dataMemberName») {
				«cls.protectedArea("set" + property.name, "Check property value here", true)»
				this.«property.name.dataMemberName» = «property.name.dataMemberName»;
			}
			
		«ENDFOR»
	'''

	//======================================================
	// define code for device properties
	//======================================================
	def addDeviceProperties(PogoDeviceClass cls) '''
		«FOR Property property : cls.deviceProperties»
			/**
			 * Device Property «property.name»
			 * «property.description.comments("* ")»
			 */
			@DeviceProperty(name = "«property.name»", description = "«property.description.oneLineString»" «property.defaultValue»)
			private «property.strJavaType» «property.name.dataMemberName»;
			/**
			 * set property «property.name»
			 * @param  «property.name.dataMemberName»
			 */
			public void set«property.name»(«property.strJavaType» «property.name.dataMemberName») {
				«cls.protectedArea("set" + property.name, "Check property value here", true)»
				this.«property.name.dataMemberName» = «property.name.dataMemberName»;
			}
			
		«ENDFOR»
	'''

	//======================================================
	// define code for init device method
	//======================================================
	def initDeviceMethod(PogoDeviceClass cls) '''
		/**
		 * Initialize the device.
		 * 
		 * @throws DevFailed if something fails during the device initialization.
		 */
		@Init(lazyLoading = false)
		public final void initDevice() throws DevFailed {
			xlogger.entry();
			logger.debug("init");
			«cls.protectedArea("initDevice", "Put your device initialization code here", true)»
			xlogger.exit();
		}
	'''
	//======================================================
	// define code for delete device method
	//======================================================
	def deleteDeviceMethod(PogoDeviceClass cls) '''
		/**
		 * all resources may be closed here. Collections may be also cleared.
		 * 
		 * @throws DevFailed if something fails during the device object delation.
		 */
		@Delete
		public final void deleteDevice() throws DevFailed {
			xlogger.entry();
			«cls.protectedArea("deleteDevice", "Put your device clearing code here", true)»
			xlogger.exit();
		}
	'''
	//======================================================
	// define code for always_executed_hook method like
	//======================================================
	def aroundInvokeMethod(PogoDeviceClass cls) '''
		/**
		 * Method called before and after command and attribute calls.
		 * @param ctx the invocation context
		 * @throws DevFailed if something fails during the this method execution.
		 */
		@AroundInvoke
		public final void aroundInvoke(final InvocationContext ctx) throws DevFailed {
			xlogger.entry(ctx);
			«cls.protectedArea("aroundInvoke", "Put aroundInvoke code here", true)»
			xlogger.exit();
		}
	'''
	//======================================================
	// define code for setDynamicManager method like
	//======================================================
	def dynamicManagerMethod(PogoDeviceClass cls) '''

		/**
		 * dynamic command and attribute management. Will be injected by the framework.
		 */
		@DynamicManagement
		private DynamicManager dynamicManager;
		/**
		 * Returns the DynamicManager instance 
		 */
		public void setDynamicManager(final DynamicManager dynamicManager) {
			this.dynamicManager = dynamicManager;
			«cls.protectedArea("setDynamicManager", "Put your code here", true)»
		}
	'''

	//======================================================
	// define code for main method
	//======================================================
	def mainMethod(PogoDeviceClass cls) '''

		/**
		 * Starts the server.
		 * @param args program arguments (instance_name [-v[trace level]]  [-nodb [-dlist <device name list>] [-file=fileName]])
		 */
		public static void main(final String[] args) {
			ServerManager.getInstance().start(args, «cls.name».class);
			System.out.println("------- Started -------------");
		}
	'''

}