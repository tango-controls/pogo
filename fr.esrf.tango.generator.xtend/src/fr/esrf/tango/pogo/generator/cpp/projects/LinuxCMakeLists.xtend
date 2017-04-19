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
class LinuxCMakeLists {
	
	@Inject	extension Headers
	@Inject	extension MakefileUtils


	//======================================================
	// Define Linux Makefile code to be generated
	//======================================================
	def generateLinuxCMakeListsMultiClasses (PogoMultiClasses multi) '''
		«multi.name.makefileHeader(true)»
		cmake_minimum_required (VERSION 2.8)
		set(CMAKE_SKIP_RPATH true)

		«multi.makeEnv(true)»
		#
		# Project definitions
		#
		project(«multi.name»)

		#
		# optional compiler flags
		#
		set(CXXFLAGS_USER -g)
		

		#
		# Get global information
		#
		include(${MAKE_ENV}/cmake_tango.opt)

		«multi.cmakeAddClassesDefinitions»

		#
		# User additional include, link folders/libraries and source files
		#
		set(USER_INCL_DIR )
		set(USER_LIB_DIR )
		set(USER_LIBS )
		set(USER_SRC_FILES )

		#
		# Set global info and include directories
		#
		set(ALL_CLASS_INCLUDE «multi.cmakeFileList("_INCLUDE")»)
		set(SERVER_SRC «multi.cmakeFileList("_SRC")» ${USER_SRC_FILES} MultiClassesFactory.cpp main.cpp)
		include_directories(${ALL_CLASS_INCLUDE}  ${USER_INCL_DIR} ${TANGO_INCLUDES})

		#
		# Device Server generation
		#
		set(SERVER_NAME «multi.name»)
		include(${MAKE_ENV}/cmake_common_target.opt)
	'''

	//======================================================
	// Define Linux CMakeLists code to be generated
	//======================================================
	def generateLinuxCMakeLists (PogoDeviceClass cls) '''
		«cls.name.makefileHeader(true)»

		cmake_minimum_required (VERSION 2.8)
		set(CMAKE_SKIP_RPATH true)

		«cls.makeEnv(true)»
		#
		# Project definitions
		#
		project(«cls.name»)

		#
		# optional compiler flags
		#
		set(CXXFLAGS_USER -g)
		

		#
		# Get global information
		#
		include(${MAKE_ENV}/cmake_tango.opt)
		
		«cls.cmakeClassParameters»
		«cls.cmakeInheritanceClassParameters»
		
		
		#
		# User additional include, link folders/libraries and source files
		#
		set(USER_INCL_DIR )
		set(USER_LIB_DIR )
		set(USER_LIBS )
		set(USER_SRC_FILES )

		#
		# Set global info and include directories
		#
		set(ALL_CLASS_INCLUDE  ${«cls.upperClassName»_INCLUDE} «cls.cmakeInheritanceFileList("_INCLUDE")» ${USER_INCL_DIR})
		set(SERVER_SRC ${«cls.upperClassName»_SRC} «cls.cmakeInheritanceFileList("_SRC")» ${USER_SRC_FILES} ClassFactory.cpp main.cpp)
		include_directories(${ALL_CLASS_INCLUDE}  ${USER_INCL_DIR} ${TANGO_INCLUDES})

		#
		# Device Server generation
		#
		set(SERVER_NAME «cls.name»)
		include(${MAKE_ENV}/cmake_common_target.opt)

	'''
//		«cls.makefileIncludes»

	//======================================================
	// Define Linux miscellaneous code to be generated
	//======================================================
	def addMiscellaneousDefinitions (String project) '''
	'''

}