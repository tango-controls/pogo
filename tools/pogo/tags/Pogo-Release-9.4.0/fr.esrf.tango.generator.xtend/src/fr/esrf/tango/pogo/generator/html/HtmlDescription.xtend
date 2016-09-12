//+======================================================================
//
// Project:   Tango
//
// Description:  source code for Tango code generator.
//
// $Author: verdier $
//
// Copyright (C) :  2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013,2014
//					European Synchrotron Radiation Facility
//                  BP 220, Grenoble 38043
//                  FRANCE
//
// This file is part of Tango.
//
// Tango is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// Tango is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
// $Revision: $
// $Date:  $
//
// $HeadURL: $
//
//-======================================================================

package fr.esrf.tango.pogo.generator.html

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
		for (cls : resource.allContents.toIterable.filter(typeof(PogoDeviceClass))) {

			if (cls.description.filestogenerate.contains("html")) {
					printTrace("Generating doc_html/ClassDescription.html")
					fsa.generateFile("doc_html/ClassDescription.html", cls.generateHtmlDescriptionFile(true))
					printTrace("Generating doc_html/Properties.html")
					fsa.generateFile("doc_html/Properties.html",       cls.generateHtmlPropertiesFile(true))
					printTrace("Generating doc_html/States.html")
					fsa.generateFile("doc_html/States.html",           cls.generateHtmlStatesFile(true))
					printTrace("Generating doc_html/FullDocument.html")
					fsa.generateFile("doc_html/FullDocument.html",     cls.generateHtmlFullDocumentFile)
					
					printTrace("Try to manage Documentation.html from pogo-6 if any")
					cls.retrieveProtectedDescriptionPart
			}
		}
	}
	
	//==================================================================
	//==================================================================
	def generateHtmlDescriptionFile(PogoDeviceClass cls, boolean withHeader) '''
		«IF withHeader»«cls.htmlFileHeader("Description")»«ENDIF»
		<ul>
			<br><br><br>
			<table border="0" width="100%">
				<Tr>
					<td> «htmlTitle(cls.name + " Class Identification :")» </td>
					<td> «htmlTitle(cls.name + " Class Inheritance :")» </td>
				</tr>
				<td><ul>
					«IF cls.description.identification==null»
						Class has no identification card !
					«ELSE»
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
					«ENDIF»
				</ul></td>
				<td>
					«cls.htmlInheritance»
				</td>
			</Table>
			<br><br><br>
			«htmlTitle(cls.name + " Class Description :")»
			<br><br>
			<ul>
				«cls.description.description.checkSpecialChars.htmlStringWithBreak»
				
				«cls.addDescriptionFromPogo6IfExists»
				«IF withHeader»
					<!---  /*PROTECTED REGION ID(index.html) ENABLED START*/  --->
				«ELSE»
					<!---  /*PROTECTED REGION ID(FullDocument.html) ENABLED START*/  --->
				«ENDIF»
					<!--- Add your own documentation, pictures, links,.... --->
					
				<!---  /*PROTECTED REGION END*/  --->
				
			</ul>
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
		«cls.states.htmlStatesTable(cls.name)»
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
	/*
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
	*/
}
