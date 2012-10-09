package fr.esrf.tango.pogo.generator.common


import static extension fr.esrf.tango.pogo.generator.common.StringUtils.*

class Headers {


	def cvsEscaped (String s)       { "$"   + s + "  $"   }
	def cvsEscapedForVar (String s) { "\"$" + s + "  $\"" }

	//======================================================
	// RcsId for .cpp files
	//======================================================
	def rcsId(String filename) {
		if (filename.endsWith("Class.cpp")) {
			"static const char *RcsId      = " + "Id:".cvsEscapedForVar + ";\n"       +
			"static const char *TagName    = " + "Name:".cvsEscapedForVar + ";\n"     +
			"static const char *CvsPath    = " + "Source:".cvsEscapedForVar + ";\n"   +
			"static const char *SvnPath    = " + "HeadURL:".cvsEscapedForVar + ";\n"  +
			"static const char *HttpServer = \"http://www.esrf.eu/computing/cs/tango/tango_doc/ds_doc/\";\n";
		}
		else
		if (filename.endsWith(".cpp"))
			"static const char *RcsId = " + "Id:".cvsEscapedForVar + ";\n"
		else
			""
	}
	
	
	//======================================================
	// generic file header
	//======================================================
	def fileHeader(String fileName, String description, String title, String licence) {
		rcsId(fileName) +
		"//=============================================================================\n" +
		"//\n" +
		"// file :        "+ fileName + "\n" +
		"//\n" +
		"// description : " + description.comments("//               ") + "\n" +
		"//\n" +
		"// project :     " + title + "\n" +
		"//\n" + licenseText(licence, "// ") +
		"// "  + "Author:".cvsEscaped + "\n" +
		"//\n" + 
		"// "  + "Revision:".cvsEscaped + "\n" +
		"// "  + "Date:".cvsEscaped + "\n" +
		"//\n" +
		"// "  + "HeadURL:".cvsEscaped() + "\n" +
		"//\n" +
		"//=============================================================================\n" +
		"//                This file is generated by POGO\n" +
		"//        (Program Obviously used to Generate tango Object)\n" +
		"//=============================================================================\n"
	}

	//======================================================
	//	Makefile header
	//======================================================
	def makefileHeader(String project) '''
		#=============================================================================
		#
		# file :        Makefile
		#
		# description : Makefile to generate a TANGO device server.
		#
		# project :     «project»
		#
		# «"Author:".cvsEscaped»
		#
		# «"Revision:".cvsEscaped»
		# «"Date:".cvsEscaped»
		#
		#=============================================================================
		#                This file is generated by POGO
		#        (Program Obviously used to Generate tango Object)
		#=============================================================================
		#
		#
	'''	
}