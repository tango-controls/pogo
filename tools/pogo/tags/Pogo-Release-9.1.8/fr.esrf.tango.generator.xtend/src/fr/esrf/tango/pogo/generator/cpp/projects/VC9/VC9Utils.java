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

package fr.esrf.tango.pogo.generator.cpp.projects.VC9;


import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;

/**
 *	Utilities for VC9 projects
 */

public class VC9Utils {

	//===========================================================
	/**
	 *	Build xml list of source files for VC9 projects
	 */
	//===========================================================
	public String sourceFileList(PogoDeviceClass cls) {
		StringBuffer	sb = new StringBuffer();
		
		sb.append(buildFileLine(cls.getName()+".cpp"));
		sb.append(buildFileLine(cls.getName()+"Class.cpp"));
		sb.append(buildFileLine(cls.getName()+"StateMachine.cpp"));

		//	Add dynamic attribute tools file if needed
		if (cls.getDynamicAttributes().size()>0) {
			sb.append(buildFileLine(cls.getName()+"DynAttrUtils.cpp"));
		}
		//	Add programmer's files if any
		for (AdditionalFile file : cls.getAdditionalFiles()) {
			String fileName = getOnlyFileName(file.getPath());
			if (fileName!=null)
				sb.append(buildFileLine(fileName));
		}
		return sb.toString();
	}
	//===========================================================
	/**
	 *	Build xml list of include files for VC9 projects
	 */
	//===========================================================
	public String includeFileList(PogoDeviceClass cls) {
		StringBuffer	sb = new StringBuffer();
		
		sb.append(buildFileLine(cls.getName()+".h"));
		sb.append(buildFileLine(cls.getName()+"Clas.h"));
		return sb.toString();
	}
	//===========================================================
	//===========================================================
	public String buildFileLine(String fileName) {
		return "<File RelativePath=\"..\\" + fileName + "\"> </File>\n";
	}
	//===========================================================
	//===========================================================
	private String getOnlyFileName(String pathName) {
		int pos = pathName.lastIndexOf('/');
		if (pos<0)
			pos = pathName.lastIndexOf('\\');
		if (pos<0)
			return null;
		else
			return pathName.substring(pos+1);
	}
	//===========================================================
	//===========================================================
}
