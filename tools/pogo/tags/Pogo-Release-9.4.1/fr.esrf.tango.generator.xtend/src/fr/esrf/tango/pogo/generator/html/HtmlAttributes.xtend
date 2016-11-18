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
import fr.esrf.tango.pogo.pogoDsl.Attribute

class HtmlAttributes  implements IGenerator {

	@Inject extension HtmlUtils

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : resource.allContents.toIterable.filter(typeof(PogoDeviceClass))) {

			if (cls.description.filestogenerate.contains("html")) {
				printTrace("Generating doc_html/Attributes.html")
				fsa.generateFile("doc_html/Attributes.html", cls.generateHtmlAttributesFile(true))
				
				for (Attribute attribute : cls.attributes) {
					printTrace("Generating doc_html/Attr" + attribute.name + ".html")
					fsa.generateFile("doc_html/Attr" + attribute.name + ".html", cls.generateHtmlOneAttributeFile(attribute, true))
				}
				for (Attribute attribute : cls.dynamicAttributes) {
					printTrace("Generating doc_html/Attr" + attribute.name + ".html")
					fsa.generateFile("doc_html/Attr" + attribute.name + ".html", cls.generateHtmlOneAttributeFile(attribute, true))
				}
			}
		}
	}
	
	//==================================================================
	//==================================================================
	def generateHtmlAttributesFile(PogoDeviceClass cls, boolean withHeader) '''
		«IF withHeader»«cls.htmlFileHeader("Attributes")»«ENDIF»
		<br><br><br><br>
		«cls.attributes.htmlAttributesTable(cls.name, false)»
		<br><br>
		<hr>
		<br><br>
		«cls.dynamicAttributes.htmlAttributesTable(cls.name, true)»
		«IF withHeader»
			</body>
			</html>
		«ENDIF»
	'''

	//==================================================================
	//==================================================================
	def generateHtmlOneAttributeFile(PogoDeviceClass cls, Attribute attribute, boolean withHeader) '''
		«IF withHeader»«cls.htmlFileHeader("Attribute " + attribute.name)»«ENDIF»
		<br><br><br>
		«IF attribute.isDynamic.isTrue»
			«htmlTitle("Dynamic attribute " + attribute.name + " :")»
		«ELSE»
			«htmlTitle("Attribute " + attribute.name + " :")»
		«ENDIF»
		<ul>
			«attribute.properties.description.checkSpecialChars.htmlStringWithBreak»
		</ul>
		<br><br><br>
		<Table Border=0 Cellpadding=0 CELLSPACING=20>
			<TR>
				<TD ALIGN="left" VALIGN=top>
					«attribute.htmlOneAttributeDefinitionTable»
				</td>
				<TD ALIGN="Center" VALIGN=top>
					«attribute.htmlOneAttributePropertiesTable»
				</td>
				<TD ALIGN="Right" VALIGN=top>
					«attribute.htmlOneAttributeEventCriteriaTable»
				</td>
			</TR>
		</table>
		«IF withHeader»
			</body>
			</html>
		«ENDIF»
	'''
}