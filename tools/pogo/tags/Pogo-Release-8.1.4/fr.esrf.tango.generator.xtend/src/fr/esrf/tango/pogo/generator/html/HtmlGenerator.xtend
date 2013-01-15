package fr.esrf.tango.pogo.generator.html

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource


class HtmlGenerator implements IGenerator {

	@Inject	HtmlIndex		htmlIndex
	@Inject	HtmlDescription	htmlDescription
	@Inject	HtmlCommands	htmlCommands
	@Inject	HtmlAttributes	htmlAttributes

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
			htmlIndex.doGenerate(resource, fsa)
			htmlDescription.doGenerate(resource, fsa)	//	Do description, properties and states
			htmlCommands.doGenerate(resource, fsa)
			htmlAttributes.doGenerate(resource, fsa)
	}
}