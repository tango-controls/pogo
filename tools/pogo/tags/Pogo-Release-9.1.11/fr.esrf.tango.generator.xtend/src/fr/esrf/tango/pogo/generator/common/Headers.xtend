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
	def fileHeader(String fileName, String description, String title, String license, String copyright) {
		rcsId(fileName) +
		"//=============================================================================\n" +
		"//\n" +
		"// file :        "+ fileName + "\n" +
		"//\n" +
		"// description : " + description.comments("//               ") + "\n" +
		"//\n" +
		"// project :     " + title + "\n" +
		"//\n" + licenseText(license, "// ") +
		"// "  + "Author:".cvsEscaped + "\n" +
		getCopyrightCommented(copyright) +
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