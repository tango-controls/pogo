package fr.esrf.tango.pogo.generator.java

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import fr.esrf.tango.pogo.generator.java.projects.LinuxMakefile
import fr.esrf.tango.pogo.generator.java.projects.IdeaProject
import fr.esrf.tango.pogo.generator.common.EclipseProjects
import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass


class JavaGenerator implements IGenerator {

	@Inject	JavaDevice		javaDevice
	@Inject	LinuxMakefile	linuxMakefile
	@Inject	IdeaProject		ideaProject
	@Inject	extension 		EclipseProjects

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		//	Code files
		javaDevice.doGenerate(resource, fsa)
		//	Linux Makefile
		linuxMakefile.doGenerate(resource, fsa)
		//	IntelliJIDEA project
		ideaProject.doGenerate(resource, fsa)
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			if (cls.description.language.toLowerCase.equals("java")) {
				//	Eclipse Project
				if (cls.description.filestogenerate.toLowerCase.contains("eclipse")) {
					printTrace("Generating Eclipse project")
					fsa.generateFile(".project",  cls.generateEclipseProject)
//					fsa.generateFile(".cproject", cls.generateCppEclipseProject)
				}
			}
		}
	}
}