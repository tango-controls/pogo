package fr.esrf.tango.pogo.generator.java

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import static extension fr.esrf.tango.pogo.generator.java.JavaUtils.*
import static extension fr.esrf.tango.pogo.generator.java.ProtectedArea.*
import static extension fr.esrf.tango.pogo.generator.java.JavaTypeDefinitions.*
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*
import fr.esrf.tango.pogo.generator.common.StringUtils
import fr.esrf.tango.pogo.pogoDsl.Command

class JavaCommand {

	@Inject extension JavaUtils
	@Inject extension ProtectedArea
	@Inject extension StringUtils


	
	//======================================================
	// Define code to execute command methods
	//======================================================
	def executeCommandMethods(PogoDeviceClass cls) '''
		«FOR Command command : cls.commands»
			«IF command.name.equals("State")==false && command.name.equals("Status")==false»
				«cls.executeCommandMethod(command)»

			«ENDIF»
		«ENDFOR»
	'''



	//======================================================
	// Define code to execute command method
	//======================================================
	def executeCommandMethod(PogoDeviceClass cls, Command command) '''
		/**
		 * Execute command "«command.name»".
		 * description: «command.description.comments("*              ")»
		 «command.headerParameters»
		 */
		@Command(name = "«command.name.toFirstLower»",inTypeDesc="«command.argin.description.oneLineString»", outTypeDesc="«command.argout.description.oneLineString»")
		public «command.strArgoutType» «command.name»(«command.strArginTypeDeclare») throws DevFailed {
			xlogger.entry();
			«command.strArgoutTypeDeclare»
			«cls.protectedArea(command.name.toFirstLower, "Put command code here", true)»
			xlogger.exit();
			«command.strArgoutTypeReturn»
		}
	'''
 

	//======================================================
	// Define code to Set and get state and status
	//======================================================
	def stateAndStatusMethods(PogoDeviceClass cls) '''
		/**
		 * The state of the device
		*/
		@State
		private DevState state = DevState.UNKNOWN;
		/**
		 * Execute command "State".
		 * description: This command gets the device state (stored in its 'state' data member) and returns it to the caller.
		 * @return Device state
		 * @throws DevFailed if command execution failed.
		 */
		public final DevState getState() throws DevFailed {
			«cls.protectedArea("getState", "Put state code here", true)»
			return state;
		}
		/**
		 * Set the device state
		 * @param state the new device state
		 */
		public void setState(final DevState state) {
			this.state = state;
		}

		/**
		 * The status of the device
		 */
		@Status
		private String status = "Server is starting. The device state is unknown";
		/**
		 * Execute command "Status".
		 * description: This command gets the device status (stored in its 'status' data member) and returns it to the caller.
		 * @return Device status
		 * @throws DevFailed if command execution failed.
		 */
		public final String getStatus() throws DevFailed {
			«cls.protectedArea("getStatus", "Put status code here", true)»
			return status;
		}
		/**
		 * Set the device status
		 * @param status the new device status
		 */
		public void setStatus(final String status) {
			this.status = status;
		}
	'''
}