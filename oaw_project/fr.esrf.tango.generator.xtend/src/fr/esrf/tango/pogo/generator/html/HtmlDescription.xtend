package fr.esrf.tango.pogo.generator.html

import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import static extension fr.esrf.tango.pogo.generator.html.HtmlUtils.*
import com.google.inject.Inject

class HtmlDescription  implements IGenerator {

	@Inject extension HtmlUtils
	@Inject extension HtmlCommands
	@Inject extension HtmlAttributes

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {

			if (cls.description.filestogenerate.contains("html")) {
					printTrace("Generating doc_html/Description.html")
					fsa.generateFile("doc_html/Description.html",    cls.generateHtmlDescriptionFile(true))
					printTrace("Generating doc_html/Properties.html")
					fsa.generateFile("doc_html/Properties.html",     cls.generateHtmlPropertiesFile(true))
					printTrace("Generating doc_html/States.html")
					fsa.generateFile("doc_html/States.html",         cls.generateHtmlStatesFile(true))
					printTrace("Generating doc_html/FullDocument.html")
					fsa.generateFile("doc_html/FullDocument.html",   cls.generateHtmlFullDocumentFile)

					cls.retrieveProtectedDescriptionPart
			}
		}
	}
	
	//==================================================================
	//==================================================================
	def generateHtmlDescriptionFile(PogoDeviceClass cls, boolean withHeader) '''
		«IF withHeader»«cls.htmlFileHeader("Description")»«ENDIF»
		<ul>
			<br><br>
			«htmlTitle("Class Description :")»
			<br><br>
			<ul>
				«cls.description.description.htmlStringWithBreak»
				
				«IF withHeader»
					<!---  /*PROTECTED REGION ID(./doc_html/index.html) ENABLED START*/  --->
				«ELSE»
					<!---  /*PROTECTED REGION ID(./doc_html/FullDocument.html) ENABLED START*/  --->
				«ENDIF»
					<!--- Add your own documentation, pictures, links,.... --->
					
				<!---  /*PROTECTED REGION END*/  --->
				
			</ul>
			<br><br><br>
			<table border="0" width="100%">
				<Tr>
					<td> «htmlTitle("Class Identification :")» </td>
					<td> «htmlTitle("Class Inheritance :")» </td>
				</tr>
				<td><ul>
					<table border="0">
						<Tr>
							<td> Contact </td><td> : at «htmlIdContact(cls.description.identification)»</td>
						</tr>
						<tr>
							<td> Class Family </td><td> : «htmlClassFamily(cls.description.identification)»
						</tr>
						<tr>
							<td> Platform </td><td> : «cls.description.identification.platform» </td>
						</tr>
						<tr>
							<td> Bus </td><td> : «cls.description.identification.bus» </td>
						</tr>
						<tr>
							<td> Manufacturer </td><td> : «cls.description.identification.manufacturer» </td>
						</tr>
						<tr>
							<td> Manufacturer ref.</td><td> : «cls.description.identification.reference» </td>
						</tr>
					</Table>
				</ul></td>
				<td>
					«cls.htmlInheritance»
				</td>
			</Table>
		</ul>
		«IF withHeader»
			</body>
			</html>
		«ENDIF»
	'''


	//==================================================================
	//==================================================================
	def generateHtmlPropertiesFile(PogoDeviceClass cls, boolean withHeader) '''
		«IF withHeader»«cls.htmlFileHeader("Properties")»«ENDIF»
		<br><br><br>
		«htmlTitle(cls.name + "  Properties :")»
		<br><br><br>
		«cls.classProperties.htmlPropertyTable("Class Properties")»
		<br><br><br>
		«cls.deviceProperties.htmlPropertyTable("Device Properties")»
		«IF withHeader»
			</body>
			</html>
		«ENDIF»
	'''

	//==================================================================
	//==================================================================
	def generateHtmlStatesFile(PogoDeviceClass cls, boolean withHeader) '''
		«IF withHeader»«cls.htmlFileHeader("States")»«ENDIF»
		<br><br><br><br>
		«cls.states.htmlStatesTable»
		«IF withHeader»
			</body>
			</html>
		«ENDIF»
	'''

	//==================================================================
	//==================================================================
	def generateHtmlFullDocumentFile(PogoDeviceClass cls) '''
		«cls.htmlFileHeader»
		«generateHtmlTangoBannerFile»
		<hr>
		<br>
		«cls.htmlFullDocummentTitleAndContents»
		<br><br>
		<a name="description"> </a>
		«cls.generateHtmlDescriptionFile(false)»
		<br><br>
		<hr>
		<a name="properties"> </a>
		«cls.generateHtmlPropertiesFile(false)»
		<br><br>
		<hr>
		<a name="commands"> </a>
		«cls.generateHtmlCommandsFile(false)»
		«FOR command : cls.commands»
			<br><br><hr>
			<a name="cmd«command.name»"> </a>
			«cls.generateHtmlOneCommandFile(command, false)»
		«ENDFOR»
		<br><br>
		<hr>
		<a name="attributes"> </a>
		«cls.generateHtmlAttributesFile(false)»
		«FOR attribute : cls.attributes»
			<br><br>
			<hr>
			<a name="attr«attribute.name»"> </a>
			«cls.generateHtmlOneAttributeFile(attribute, false)»
		«ENDFOR»
		<br><br>
		<hr>
		«FOR attribute : cls.dynamicAttributes»
			<br><br>
			<hr>
			<a name="attr«attribute.name»"> </a>
			«cls.generateHtmlOneAttributeFile(attribute, false)»
		«ENDFOR»
		<br><br>
		<hr>
		<a name="states"> </a>
		«cls.generateHtmlStatesFile(false)»
		</body>
		</html>
	'''


	//==================================================================
	//==================================================================
	def generateHtmlTangoBannerFile() '''
	    <table border="0" width="100%" cellspacing="0" cellpadding="0" >
	        <td align="center">
	            <a href="http://www.esrf.fr/" target=new>
	                <IMG SRC="http://www.esrf.fr/gifs/logo/80.gif" border=0 Height="40"></a>
	        </td>
	        <td align="center">
	            <a href="http://www.elettra.trieste.it/" target=new>
	                <IMG SRC="http://www.esrf.fr/computing/cs/tango/elettra_logo.gif" border=0 Height="40"></a>
	        </td>
	        <td align="center">
	            <a href="http://www.synchrotron-soleil.fr/" target=new>
	                <IMG SRC="http://www.esrf.fr/computing/cs/tango/soleil_logo.gif" border=0 Height="40"></a>
	        </td>
	        <td align="center">
	            <a href="http://www.cells.es/" target=new>
	                <IMG SRC="http://www.esrf.fr/computing/cs/tango/alba.jpg" border=0 Height="27"></a>
	        </td>
	        <td align="center">
	            <a href="http://www.tango-controls.org/" target="_top">
	               <img src="http://www.tango-controls.org/logo.jpg" alt=""  height="35" /></a>
	        </td>
	        <td align="center">
	            <a href="http://www.desy.de/html/home/index_eng.html" target=new>
	                <IMG SRC="http://www.esrf.fr/computing/cs/tango/desy.gif" border=0 Height="30"></a>
	        </td>
	        <td align="center">
	            <a href="http://www.maxlab.lu.se/maxlab/max4/index.html" target=new>
	                <IMG SRC="http://www.esrf.fr/computing/cs/tango/maxlab.gif" border=0 Height="27"></a>
	        </td>
	        <td align="center">
	            <a href="http://www.frm2.tum.de/en/index.html" target=new>
	                <IMG SRC="http://www.esrf.fr/computing/cs/tango/frm-2.jpg" border=0 Height="28"></a>
	        </td>
	    </table>
	'''
}
