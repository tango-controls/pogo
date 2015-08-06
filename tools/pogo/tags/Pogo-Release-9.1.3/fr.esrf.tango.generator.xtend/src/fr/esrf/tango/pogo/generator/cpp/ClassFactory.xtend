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

package fr.esrf.tango.pogo.generator.cpp

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import fr.esrf.tango.pogo.generator.cpp.utils.ProtectedArea
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef


//======================================================
// Define ClassFactory.cpp file to be generated
//======================================================
class ClassFactory {
	@Inject	extension ProtectedArea
	@Inject	extension fr.esrf.tango.pogo.generator.cpp.utils.Headers

	//======================================================
	// Define ClassFactory.cpp file to be generated
	//======================================================
	def generateClassFactoryFile (PogoDeviceClass cls) '''
		«cls.openProtectedArea("ClassFactory.cpp")»
		«cls.ClassFactoryFileHeader»
		
		#include <tango.h>
		#include <«cls.name»Class.h>
		
		//	Add class header files if needed
		
		
		/**
		 *	Create «cls.name» Class singleton and store it in DServer object.
		 */
		
		void Tango::DServer::class_factory()
		{
			//	Add method class init if needed
			add_class(«cls.name»_ns::«cls.name»Class::init("«cls.name»"));
		}
		«cls.closeProtectedArea("ClassFactory.cpp")»
	'''
	//======================================================
	// Define MultiClassFactory.cpp file tfor multi class project
	//======================================================
	def generateMultiClassesFactoryFile (PogoMultiClasses cls) '''
		«cls.ClassFactoryFileHeader»
		
		#include <tango.h>
		«FOR OneClassSimpleDef clazz : cls.classes»
			#include <«clazz.classname»Class.h>
		«ENDFOR»
		
		/**
		 *	Create Class singletons and store them in DServer object.
		 */
		
		void Tango::DServer::class_factory()
		{
			«FOR OneClassSimpleDef clazz : cls.classes»
				add_class(«clazz.classname»_ns::«clazz.classname»Class::init("«clazz.classname»"));
			«ENDFOR»
		}
	'''

}