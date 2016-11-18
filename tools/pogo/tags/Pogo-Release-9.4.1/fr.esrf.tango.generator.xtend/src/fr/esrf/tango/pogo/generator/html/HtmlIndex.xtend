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

class HtmlIndex  implements IGenerator {

	@Inject extension HtmlUtils

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : resource.allContents.toIterable.filter(typeof(PogoDeviceClass))) {

			if (cls.description.filestogenerate.contains("html")) {
					printTrace("Generating doc_html/index.html")
					fsa.generateFile("doc_html/index.html",        cls.generateHtmlIndexFile)
					printTrace("Generating doc_html/TitleBanner.html")
					fsa.generateFile("doc_html/TitleBanner.html",  cls.generateHtmlTitleBannerFile)
			}
		}
	}
	
	
	def generateHtmlIndexFile (PogoDeviceClass cls) '''
		<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
		<HTML>
		    <HEAD>
		       <META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=iso-8859-1">
		       <META name="GENERATOR" CONTENT="Mozilla/4.04 [en] (X11; I; SunOS 5.6 sun4d) [Netscape]">
		       <META name="Author" CONTENT="Pascal Verdier">
		       <META name="Description" CONTENT="«cls.name»  Pages">
		       <META name="Keywords" CONTENT="«cls.name» Tango class User Guide">
		       <TITLE>«cls.name» Tango class User Guide</TITLE>
		    </HEAD>
		
		
		«IF fromClasses2www»
			<!--- Definition for the 2 frames window ----------->
			<frameset rows="65,*">
			    <frame src="TitleBanner.html"        name="title">
			    <frame src="ClassDescription.html"   name="document">
			</frameset>
		«ELSE»
			<!--- Definition for the 4 frames window ----------->
			<frameset rows="58,65,*,65">
			    <frame src="http://www.esrf.fr/computing/cs/tango/TangoBanner.html"   name="header">
			    <frame src="TitleBanner.html"        name="title">
			    <frame src="ClassDescription.html"   name="document">
			    <frame src="http://www.esrf.fr/computing/cs/tango/SrcForgeBanner.html" name="footer" >
			</frameset>
		«ENDIF»
		</html>
	'''

	def generateHtmlTitleBannerFile(PogoDeviceClass cls) '''
		<!DOCTYPE html PUBLIC "-//W3C//Dtd XHTML 1.0 transitional//EN" "http://www.w3.org/TR/xhtml1/Dtd/xhtml1-transitional.dtd">
		<html>
			<center>
				«htmlTitle(cls.name + " Tango " + cls.description.language + " Class")»
				<table BORDER="1" WIDTH="100%" CELLSPACING=0>
			       <td ALIGN="center"> <a href="ClassDescription.html" target="document">  Description </a></td>
			       <td ALIGN="center"> <a href="Properties.html"       target="document">  Properties  </a></td>
			       <td ALIGN="center"> <a href="Commands.html"         target="document">  Commands    </a></td>
			       <td ALIGN="center"> <a href="Attributes.html"       target="document">  Attributes  </a></td>
			       <td ALIGN="center"> <a href="States.html"           target="document">  States      </a></td>
			       <td ALIGN="center"> <a href="FullDocument.html"     target="new">       Printable   </a></td>
				</table>
			</center>
		</html>
	'''
	
}