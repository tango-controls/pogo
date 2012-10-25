package fr.esrf.tango.pogo.generator.java

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import fr.esrf.tango.pogo.generator.java.projects.LinuxMakefile
import fr.esrf.tango.pogo.generator.java.projects.IdeaProject


class JavaGenerator implements IGenerator {

	@Inject	JavaDevice		javaDevice
	@Inject	LinuxMakefile	linuxMakefile
	@Inject	IdeaProject		ideaProject

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
			//	Code files
			javaDevice.doGenerate(resource, fsa)
			//	Linux Makefile
			linuxMakefile.doGenerate(resource, fsa)
			//	IntelliJIDEA project
			ideaProject.doGenerate(resource, fsa)
	}
}