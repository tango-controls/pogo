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
import fr.esrf.tango.pogo.pogoDsl.Command

class HtmlCommands  implements IGenerator {

	@Inject extension HtmlUtils

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : resource.allContents.toIterable.filter(typeof(PogoDeviceClass))) {

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
	/*
	 */
	//==================================================================
	def generateHtmlOneCommandFile(PogoDeviceClass cls, Command command, boolean withHeader) '''
		«IF withHeader»«cls.htmlFileHeader("Command " + command.name)»«ENDIF»
		<br><br><br>
		«htmlTitle("Command " + command.name + " :")»
		<ul>
			«command.description.checkSpecialChars.htmlStringWithBreak»
		</ul>
		<br><br><br>
		«command.htmlOneCommandTable»
		«IF withHeader»
			</body>
			</html>
		«ENDIF»
	'''
}