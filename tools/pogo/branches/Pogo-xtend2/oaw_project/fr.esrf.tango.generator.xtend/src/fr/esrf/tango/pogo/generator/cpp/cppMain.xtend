package fr.esrf.tango.pogo.generator.cpp

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource


class cppMain implements IGenerator {

	@Inject
	extension HeaderDevice
	@Inject
	extension CppUtil

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {

// how to set filestogenerate? commented out for now - AG 4jul12
//			if (cls.description.filestogenerate.contains("cpp")) {
//				cls.generateDeviceHeaderFile
//			}
			fsa.generateFile(cls.cppHeaderFileName, cls.generateDeviceHeaderFile)
		}
	}
}