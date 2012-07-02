package fr.esrf.tango.pogo.generator.java

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import fr.esrf.tango.pogo.generator.java.projects.IdeaProject


class JavaGenerator implements IGenerator {

	@Inject	extension JavaDevice
	@Inject	extension JavaUtils
	@Inject	extension IdeaProject

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
			println(cls.description.filestogenerate)
			println("Lannguage="+cls.description.language)
			if (cls.description.language.toLowerCase.equals("java")) {

				//	Code files
				if (cls.description.filestogenerate.contains("Code files")) {
					fsa.generateFile(cls.javaDeviceClassFileName,     cls.generateJavaDeviceFile)
				}
				
				//	IntelliJIDEA project
				fsa.generateFile(cls.name + ".iml",     cls.generateIdeaProjectMain)
				fsa.generateFile(".idea/ant.xml",       cls.generateIdeaProjectAnt)
				fsa.generateFile(".idea/compiler.xml",  cls.generateIdeaProjectCompiler);
				fsa.generateFile(".idea/encodings.xml", cls.generateIdeaProjectEncoding);
				fsa.generateFile(".idea/misc.xml",      cls.generateIdeaProjectMisc);
				fsa.generateFile(".idea/modules.xml",   cls.generateIdeaProjectModules);
				fsa.generateFile(".idea/uiDesigner.xml",cls.generateIdeaProjectUiDesigner);
				fsa.generateFile(".idea/vcs.xml",       cls.generateIdeaProjectVcs);
				fsa.generateFile(".idea/workspace.xml", cls.generateIdeaProjectWorkspace);
				fsa.generateFile(".idea/copyright/profiles_settings.xml", cls.generateIdeaProjectProfile);
				fsa.generateFile(".idea/scopes/scope_settings.xml",       cls.generateIdeaProjectScope);
			}
		}
	}
}