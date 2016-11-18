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

package fr.esrf.tango.pogo.generator.java.projects

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import fr.esrf.tango.pogo.generator.cpp.utils.Headers
import fr.esrf.tango.pogo.generator.java.JavaUtils


//======================================================
// Define linux Makefile file to be generated
//======================================================
class LinuxMakefile   implements IGenerator{
	
	@Inject	extension Headers
	@Inject	extension JavaUtils

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (cls : resource.allContents.toIterable.filter(typeof(PogoDeviceClass))) {
			if (cls.description.language.toLowerCase.equals("java")) {
				if (cls.description.filestogenerate.contains("Makefile")) {
					fsa.generateFile("Makefile", cls.generateLinuxMakefile)
				}
			}
		}
	}

	//======================================================
	// Define Linux Makefile code to be generated
	//======================================================
	def generateLinuxMakefile (PogoDeviceClass cls) '''
		«cls.name.makefileHeader(false)»

		#=============================================================================
		# PACKAGE_NAME is the name of the library/device/exe you want to build
		#
		CLASS	     = «cls.name»
		PACKAGE_NAME = «cls.javaDevicePackage»
		SOURCE_FILES = «cls.javaDeviceSourceFile»
		MAJOR_VERS   = 1
		MINOR_VERS   = 0
		RELEASE      = Release_$(MAJOR_VERS)_$(MINOR_VERS)
		
		INSTANCE     = test

		
		#=============================================================================
		#		The compiler flags
		#
		JAVAC = javac -classpath .:$(CLASSPATH)
		BIN_DIR = ./bin
		JAVAFLAGS = -d $(BIN_DIR)
		
		#=============================================================================
		# Rulee to compile
		#
		.SUFFIXES:	.class .java
		.java.class:
			$(JAVAC) $(JAVAFLAGS) $<
		
		
		#=============================================================================
		# Class list of objects needed to make the output
		#
		all:	classes
		classes:
			$(JAVAC) $(JAVAFLAGS) $(SOURCE_FILES)/*.java
		
		run:
			java $(PACKAGE_NAME)/$(CLASS)  $(INSTANCE)

		#=============================================================================
		# Jar file generation
		#
		JAR_NAME = «cls.name.toLowerCase»-$(MAJOR_VERS).$(MINOR_VERS).jar
		jar:	classes
			cd $(BIN_DIR); jar cvf  $(JAR_NAME) $(SOURCE_FILES)/*.class
			mv $(BIN_DIR)/$(JAR_NAME) .
			ls -l $(JAR_NAME)

		#=============================================================================
		# Java doc generation
		#
		doc:
			javadoc -d documentation -windowtitle $(PACKAGE_NAME).$(CLASS) \
			-private -version -author -nodeprecated -header "$(PACKAGE_NAME).$(CLASS) Class"	\
			$(SOURCE_FILES)/*.java

		#=============================================================================
		# remove class files
		#
		clean:
			rm $(BIN_DIR)/$(SOURCE_FILES)/*.class

	'''
}