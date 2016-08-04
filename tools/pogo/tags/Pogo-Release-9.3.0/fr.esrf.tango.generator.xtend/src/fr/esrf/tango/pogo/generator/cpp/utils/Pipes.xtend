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

package fr.esrf.tango.pogo.generator.cpp.utils

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
import com.google.inject.Inject
import fr.esrf.tango.pogo.pogoDsl.Pipe
import fr.esrf.tango.pogo.generator.cpp.utils.Headers

//======================================================
//	Attribute utilities
//======================================================
class Pipes {
	@Inject	extension ProtectedArea
	@Inject	extension Headers

	//======================================================
	// Define read pipe method
	//======================================================
	def readPipeMethod(PogoDeviceClass cls, Pipe pipe) '''
		«pipe.pipeMethodHeader("Read")»
		void «cls.name»::read_«pipe.name»(Tango::Pipe &pipe)
		{
			DEBUG_STREAM << "«cls.name»::read_«pipe.name»(Tango::Pipe &pipe) entering... " << endl;
			«cls.protectedArea("read_" + pipe.name, "\n//	Add your own code here", false)»
		}
	'''
	
	//======================================================
	// Define write pipe method
	//======================================================
	def writePipeMethod(PogoDeviceClass cls, Pipe pipe) '''
		«pipe.pipeMethodHeader("Write")»
		void «cls.name»::write_«pipe.name»(Tango::WPipe &pipe)
		{
			DEBUG_STREAM << "«cls.name»::write_«pipe.name»(Tango::WPipe &pipe) entering... " << endl;
			«cls.protectedArea("write_" + pipe.name, "\n//	Add your own code here", false)»
		}
	'''
	
	//======================================================
	// Define pipe classes
	//======================================================
	def declareMethods(Pipe pipe) '''
		//	Pipe «pipe.name»
		bool is_«pipe.name»_allowed(Tango::PipeReqType);
		void read_«pipe.name»(Tango::Pipe &);
		«IF pipe.rwType.contains("WRITE")»
			void write_«pipe.name»(Tango::WPipe &);
		«ENDIF»
	'''
	//======================================================
	// Define pipe classes
	//======================================================
	def pipeClass(Pipe pipe, String className) '''
		//	Pipe «pipe.name» class definition
		class «pipe.name»Class: public Tango::«IF pipe.rwType.contains("WRITE")»W«ENDIF»Pipe
		{
		public:
			«pipe.name»Class(const string &name, Tango::DispLevel level)
				:«IF pipe.rwType.contains("WRITE")»W«ENDIF»Pipe(name, level) {};
		
			~«pipe.name»Class() {};

			virtual bool is_allowed (Tango::DeviceImpl *dev,Tango::PipeReqType _prt)
				{return (static_cast<«className» *>(dev))->is_«pipe.name»_allowed(_prt);}
			virtual void read(Tango::DeviceImpl *dev)
				{(static_cast<«className» *>(dev))->read_«pipe.name»(*this);}
			«IF pipe.rwType.contains("WRITE")»
				virtual void write(Tango::DeviceImpl *dev)
					{(static_cast<«className» *>(dev))->write_«pipe.name»(*this);}
			«ENDIF»
		};
		
	'''
}