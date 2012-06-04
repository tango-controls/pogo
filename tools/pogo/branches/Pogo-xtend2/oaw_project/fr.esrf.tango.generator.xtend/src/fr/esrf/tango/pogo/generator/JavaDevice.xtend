package fr.esrf.tango.pogo.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

class JavaDevice implements IGenerator {
	@Inject
	extension JavaUtils
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			fsa.generateFile(cls.javaDeviceClassFileName, cls.generate_javaFile)
		}
	}
	
	def generate_javaFile (PogoDeviceClass cls) '''
		package «cls.javaDevicePackage»;
		
		import java.util.Vector;
		
		import org.omg.CORBA.SystemException;
		import org.omg.CORBA.UserException;
		
		import fr.esrf.Tango.DevFailed;
		import fr.esrf.TangoApi.DbDatum;
		import fr.esrf.TangoDs.Attribute;
		import fr.esrf.TangoDs.DeviceClass;
		import fr.esrf.TangoDs.DeviceImpl;
		import fr.esrf.TangoDs.Except;
		import fr.esrf.TangoDs.TangoConst;
		import fr.esrf.TangoDs.Util;
		
		/**
		 *	Class Description: «cls.description.description»
		 *	
		 * @author	«"Author".vcsEscaped»
		 * @version	 «"Revision".vcsEscaped»
		 */
		public class «cls.name» extends DeviceImpl implements TangoConst{
			//PROTECTED REGION ID(«cls.name»::HEAD) ENABLED START
			// TODO: Add protected code here!
			//PROTECTED REGION END
			// properties
			«FOR prop: cls.deviceProperties»
				«prop.javaPropType» «prop.name.toFirstLower()»;
			«ENDFOR»
			// attributes
			«FOR attr : cls.attributes»
				«attr.dataType.javaType»  attr«attr.name»;
			«ENDFOR»	
		}
	'''
}