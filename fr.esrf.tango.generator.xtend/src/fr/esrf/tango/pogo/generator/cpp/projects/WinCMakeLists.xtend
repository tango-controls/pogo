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

//======================================================
// Define Windiws CMakeLists file to be generated
//======================================================
class WinCMakeLists {
	
	@Inject	extension Headers
	@Inject	extension MakefileUtils
	
	//======================================================
	// Define Windows CMakeLists code to be generated
	//======================================================
	def generateWinCMakeLists (PogoDeviceClass cls) '''
		«cls.name.makefileHeader(true)»

		cmake_minimum_required (VERSION 2.8)
		set(CMAKE_SKIP_RPATH true)
		
		# Windows cmakelists

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
		include(CmakeTangoWin.cmake)
		
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
		link_directories(${TANGO_LNK_DIR})

		#
		# Device Server generation
		#
		set(SERVER_NAME «cls.name»)
		add_executable(«cls.name» ${SERVER_SRC})
		target_link_libraries(«cls.name» PUBLIC ${TANGO_LIBS} ${WIN_LIBS} ${ZMQ_LIB})
		# Cpack target
		install(TARGETS «cls.name»
			RUNTIME DESTINATION bin
			LIBRARY DESTINATION bin
			ARCHIVE DESTINATION bin)
	'''
//		«cls.makefileIncludes»

	//======================================================
	// Define Linux miscellaneous code to be generated
	//======================================================
	def addMiscellaneousDefinitions (String project) '''
	'''
	
	//======================================================
	// Defaut cmake file to build against Tango
	//======================================================
	def generateCMakeWinConf () '''
		cmake_minimum_required(VERSION 3.0.2)
		set(CMP0048 NEW)

		# definitions and compile options
		add_definitions(-DWIN32)
		add_definitions(-D_WINDLL)
		add_definitions(-DNDEBUG)
		add_definitions(-DTANGO_HAS_DLL)
		add_definitions(-DLOG4TANGO_HAS_DLL)
		if(CMAKE_CL_64)
		add_definitions(-D_64BITS)
		if(MSVC14)
		add_definitions(-D_TIMERS_T_)
		endif(MSVC14)
		else(CMAKE_CL_64)
		add_definitions(-DJPG_USE_ASM)
		endif(CMAKE_CL_64)
		# include directories
		set(TANGO_INCLUDES "$ENV{TANGO_ROOT}/include")
		# link directories
		set(TANGO_LNK_DIR "$ENV{TANGO_ROOT}/bin;$ENV{TANGO_ROOT}/lib")
		# link files
		set(TANGO_LIBS "$ENV{TANGO_ROOT}/lib/tango.lib;$ENV{TANGO_ROOT}/bin/omniORB4_rt.lib;$ENV{TANGO_ROOT}/bin/omniDynamic4_rt.lib;$ENV{TANGO_ROOT}/bin/COS4_rt.lib;$ENV{TANGO_ROOT}/bin/omnithread_rt.lib;$ENV{TANGO_ROOT}/bin/msvcstub.lib;$ENV{TANGO_ROOT}/lib/pthreadVC2.lib")
		set(WIN_LIBS ws2_32 mswsock advapi32 comctl32 odbc32)
		if(MSVC90)
			set(ZMQ_LIB $ENV{TANGO_ROOT}/lib/libzmq-v90-mt-4_1_7.lib)
		elseif(MSVC10)
			set(ZMQ_LIB $ENV{TANGO_ROOT}/lib/libzmq-v100-mt-4_1_7.lib)
		elseif(MSVC12)
			set(ZMQ_LIB $ENV{TANGO_ROOT}/lib/libzmq-v120-mt-4_1_7.lib)
		elseif(MSVC14)
			set(ZMQ_LIB $ENV{TANGO_ROOT}/lib/libzmq-v140-mt-4_1_7.lib)
		endif(MSVC90)

		#easy packagin with cpack and NSIS

		set (CPACK_PACKAGE_VENDOR "www.tango-controls.org")
		set (CPACK_PACKAGE_DESCRIPTION_SUMMARY "Tango - Connecting Things Together")
		set (CPACK_PACKAGE_VERSION "${MAJOR_VERSION}.${MINOR_VERSION}.${PATCH_VERSION}")
		set (CPACK_PACKAGE_VERSION_MAJOR ${MAJOR_VERSION})
		set (CPACK_PACKAGE_VERSION_MINOR ${MINOR_VERSION})
		set (CPACK_PACKAGE_VERSION_PATCH ${PATCH_VERSION})

		set(CPACK_NSIS_HELP_LINK "http://www.tango-controls.org")
		set(CPACK_NSIS_URL_INFO_ABOUT "http://www.tango-controls.org")
		set(CPACK_NSIS_MODIFY_PATH ON)
		set(CPACK_NSIS_ENABLE_UNINSTALL_BEFORE_INSTALL ON)
		set(CPACK_NSIS_MENU_LINKS
			"http://tango-controls.readthedocs.io/en/latest/" "Tango Doc")

		include(CPack)
	'''

}
