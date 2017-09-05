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

package fr.esrf.tango.pogo.generator.cpp.projects

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import fr.esrf.tango.pogo.generator.cpp.utils.Headers
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses


//======================================================
// Define linux Makefile file to be generated
//======================================================
class LinuxMakefile {
	
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.utils.InheritanceUtils
	@Inject	extension Headers
	@Inject	extension MakefileUtils

	//======================================================
	// Define Linux Makefile code to be generated
	//======================================================
	def generateLinuxMakefileMultiClasses (PogoMultiClasses multi) '''
		«multi.name.makefileHeader(false)»
		«multi.makeEnv(false)»

		«multi.name.addMiscellaneousDefinitions»

		«multi.addClassesDefinitions»
		
		«multi.makefileIncludes»

		«addMiscellaneous2Definitions»

		«multi.addObjectFiles»

		#=============================================================================
		#	include common targets
		#
		include $(MAKE_ENV)/common_target.opt
		
		
		#=============================================================================
		# Following are dependancies of the classes used by project
		#
		«multi.dependancies»
		
	'''


	//======================================================
	// Define Linux Makefile code to be generated
	//======================================================
	def generateLinuxMakefile (PogoDeviceClass cls) '''
		«cls.name.makefileHeader(false)»
		«cls.makeEnv(false)»

		«cls.name.addMiscellaneousDefinitions»

		«cls.addInheritanceDefinitions»
		
		«cls.makefileIncludes»

		«addMiscellaneous2Definitions»

		#=============================================================================
		# SVC_OBJS is the list of all objects needed to make the output
		#
		SVC_INCL =  $(PACKAGE_NAME).h $(PACKAGE_NAME)Class.h «cls.addInheritancIncludeReference»
		
		
		SVC_OBJS =      \
				$(LIB_OBJS) \
				$(OBJDIR)/ClassFactory.o  \
		        $(OBJDIR)/main.o
		
		LIB_OBJS = \
		        $(OBJDIR)/$(PACKAGE_NAME).o \
		        $(OBJDIR)/$(PACKAGE_NAME)Class.o \
		        $(OBJDIR)/$(PACKAGE_NAME)StateMachine.o \
				«cls.dynamicAttrObjects»«cls.inheritanceObjects»
		        $(ADDITIONAL_OBJS) 

		«cls.addInheritanceObjectFiles»
		«cls.addAdditionalObjectFiles»
		
		#=============================================================================
		#	include common targets
		#
		include $(MAKE_ENV)/common_target.opt
		

		«IF cls.hasInheritanceClass»
			«cls.inheritanceDependancies»
 		«ENDIF»

 		«IF cls.additionalFiles.empty==false»
			«cls.additionalDependencies»
 		«ENDIF»

	'''

	//======================================================
	// Define Linux miscellaneous code to be generated
	//======================================================
	def addMiscellaneousDefinitions (String project) '''
		#=============================================================================
		# PACKAGE_NAME is the name of the library/device/exe you want to build
		#
		PACKAGE_NAME = «project»
		MAJOR_VERS   = 1
		MINOR_VERS   = 0
		RELEASE      = Release_$(MAJOR_VERS)_$(MINOR_VERS)
		
		# #=============================================================================
		# # RELEASE_TYPE
		# # - DEBUG     : debug symbols - no optimization
		# # - OPTIMIZED : no debug symbols - optimization level set to O2
		# #-----------------------------------------------------------------------------
		RELEASE_TYPE = DEBUG
		
		#=============================================================================
		# OUTPUT_TYPE can be one of the following :
		#   - 'STATIC_LIB' for a static library (.a)
		#   - 'SHARED_LIB' for a dynamic library (.so)
		#   - 'DEVICE' for a device server (will automatically include and link
		#            with Tango dependencies)
		#   - 'SIMPLE_EXE' for an executable with no dependency (for exemple the test tool
		#                of a library with no Tango dependencies)
		#
		OUTPUT_TYPE = DEVICE
		
		#=============================================================================
		# OUTPUT_DIR  is the directory which contains the build result.
		# if not set, the standard location is :
		#	- ./lib   if OUTPUT_TYPE is SHARED_LIB or STATIC_LIB
		#	- ./bin for others
		#
		#OUTPUT_DIR =
	'''

	//======================================================
	// Define Linux miscellaneous code to be generated
	//======================================================
	def addMiscellaneous2Definitions () '''
		#=============================================================================
		# LIB_DIR_USER is the list of user library directories
		#   - for a device server, tango libraries directories are automatically appended
		#   - '-L ../lib' is automatically appended in all cases
		#
		LIB_DIR_USER=
		
		#=============================================================================
		# LFLAGS_USR is the list of user link flags
		#   - for a device server, tango libraries directories are automatically appended
		#   - '-ldl -lpthread' is automatically appended in all cases
		#
		# !!! ATTENTION !!!
		# Be aware that the order matters. 
		# For example if you must link with libA, and if libA depends itself on libB
		# you must use '-lA -lB' in this order as link flags, otherwise you will get
		# 'undefined reference' errors
		#
		#LFLAGS_USR+=
		
		
		#=============================================================================
		# CXXFLAGS_USR lists the compilation flags specific for your library/device/exe
		# This is the place where to put your compile-time macros using '-Dmy_macro'
		#
		# -DACE_HAS_EXCEPTIONS -D__ACE_INLINE__ for ACE
		#
		#CXXFLAGS_USR+= -Wall
		
		
		#=============================================================================
		# TANGO_REQUIRED 
		# - TRUE  : your project depends on TANGO
		# - FALSE : your project does not depend on TANGO
		#-----------------------------------------------------------------------------
		# - NOTE : if PROJECT_TYPE is set to DEVICE, TANGO will be auto. added
		#-----------------------------------------------------------------------------  
		TANGO_REQUIRED = TRUE
		
		
		
		#=============================================================================
		#	include Standard TANGO compilation options
		#
		include $(MAKE_ENV)/tango.opt
		
		#=============================================================================
		#	POST_PROCESSING: action to be done after normal make.
		#	e.g.:  change executable file name, .....
		#POST_PROCESSING = \
		#	mv bin/$(BIN_DIR)/$(PACKAGE_NAME) bin/$(BIN_DIR)/$(PACKAGE_NAME)_DS
	'''
}