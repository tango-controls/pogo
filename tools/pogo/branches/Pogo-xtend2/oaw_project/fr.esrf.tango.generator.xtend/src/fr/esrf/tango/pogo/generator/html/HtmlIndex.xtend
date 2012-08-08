package fr.esrf.tango.pogo.generator.html

import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import static extension fr.esrf.tango.pogo.generator.html.HtmlUtils.*
import com.google.inject.Inject

class HtmlIndex  implements IGenerator {

	@Inject extension HtmlUtils

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {

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
		
		
		<!--- Definition for the 4 frames window ----------->
		    <frameset rows="58,65,*,65">
		        <frame src="http://www.esrf.fr/computing/cs/tango/TangoBanner.html"   name="header">
		        <frame src="TitleBanner.html" name="title">
		        <frame src="Description.html" name="document">
		        <frame src="http://www.esrf.fr/computing/cs/tango/SrcForgeBanner.html" name="footer" >
		    </frameset>
		</html>
	'''

	def generateHtmlTitleBannerFile(PogoDeviceClass cls) '''
		<!DOCTYPE html PUBLIC "-//W3C//Dtd XHTML 1.0 transitional//EN" "http://www.w3.org/TR/xhtml1/Dtd/xhtml1-transitional.dtd">
		<html>
			<center>
				«htmlTitle(cls.name + " Tango " + cls.description.language + " Class")»
				<table BORDER="1" WIDTH="100%" CELLSPACING=0>
			       <td ALIGN="center"> <a href="Description.html"  target="document">  Description </a></td>
			       <td ALIGN="center"> <a href="Properties.html"   target="document">  Properties  </a></td>
			       <td ALIGN="center"> <a href="Commands.html"     target="document">  Commands    </a></td>
			       <td ALIGN="center"> <a href="Attributes.html"   target="document">  Attributes  </a></td>
			       <td ALIGN="center"> <a href="States.html"       target="document">  States      </a></td>
			       <td ALIGN="center"> <a href="FullDocument.html" target="new">       Printable   </a></td>
				</table>
			</center>
		</html>
	'''
	
}