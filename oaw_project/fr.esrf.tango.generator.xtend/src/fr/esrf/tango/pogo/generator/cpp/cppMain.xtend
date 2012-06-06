package fr.esrf.tango.pogo.generator.cpp

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource


class cppMain implements IGenerator {

	@Inject
	extension fr.esrf.tango.pogo.generator.cpp.global.Headers
	@Inject
	extension DeviceInclude
	@Inject
	extension DeviceSource

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			if (cls.description.language.toLowerCase.equals("cpp")) {
				fsa.generateFile(cls.deviceIncludeFileName, cls.generateDeviceIncludeFile)
				fsa.generateFile(cls.deviceSourceFileName, cls.generateDeviceSourceFile)
			}
		}
	}
}