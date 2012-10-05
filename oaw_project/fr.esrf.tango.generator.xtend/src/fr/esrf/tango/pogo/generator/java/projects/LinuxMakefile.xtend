package fr.esrf.tango.pogo.generator.java.projects

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import static org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import static extension fr.esrf.tango.pogo.generator.java.JavaUtils.*
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
		for (cls : allContentsIterable(resource).filter(typeof(PogoDeviceClass))) {
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
		«cls.name.makefileHeader()»

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
		JAR_NAME = «cls.name.toLowerCase».jar
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