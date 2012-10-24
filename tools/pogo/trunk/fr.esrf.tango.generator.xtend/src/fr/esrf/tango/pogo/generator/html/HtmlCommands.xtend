package fr.esrf.tango.pogo.generator.html

import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import static extension fr.esrf.tango.pogo.generator.html.HtmlUtils.*
import com.google.inject.Inject
import fr.esrf.tango.pogo.pogoDsl.Command

class HtmlCommands  implements IGenerator {

	@Inject extension HtmlUtils

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {

			if (cls.description.filestogenerate.contains("html")) {
				printTrace("Generating doc_html/Commands.html")
				fsa.generateFile("doc_html/Commands.html", cls.generateHtmlCommandsFile(true))
				
				for (Command command : cls.commands) {
					printTrace("Generating doc_html/Cmd" + command.name + ".html")
					fsa.generateFile("doc_html/Cmd" + command.name + ".html", cls.generateHtmlOneCommandFile(command, true))
				}
			}
		}
	}
	
	//==================================================================
	//==================================================================
	def generateHtmlCommandsFile(PogoDeviceClass cls, boolean withHeader) '''
		«IF withHeader»«cls.htmlFileHeader("Commands")»«ENDIF»
		<br><br><br><br>
		«cls.commands.htmlCommandsTable(cls.name)»
		«IF withHeader»
			</body>
			</html>
		«ENDIF»
	'''

	//==================================================================
	//==================================================================
	def generateHtmlOneCommandFile(PogoDeviceClass cls, Command command, boolean withHeader) '''
		«IF withHeader»«cls.htmlFileHeader("Command " + command.name)»«ENDIF»
		<br><br><br>
		«htmlTitle("Command " + command.name + " :")»
		<ul>
			«command.description.htmlStringWithBreak»
		</ul>
		<br><br><br>
		«command.htmlOneCommandTable»
		«IF withHeader»
			</body>
			</html>
		«ENDIF»
	'''
}