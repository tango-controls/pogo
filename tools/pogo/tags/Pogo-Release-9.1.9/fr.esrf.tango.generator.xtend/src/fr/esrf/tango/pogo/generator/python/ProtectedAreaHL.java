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

package fr.esrf.tango.pogo.generator.python;

import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;

import fr.esrf.tango.pogo.generator.common.StringUtils;

/**
 * Java Protected Area
 */
 

public class ProtectedAreaHL {

	/**
	 * Open protected area
	 * @param cls PogoDeviceClass
	 * @param method the method name
	 * @return string representing opened the protected area
	 */
	public String openProtectedAreaHL(PogoDeviceClass cls, String method) {
		return openProtectedAreaHL(cls.getName(), method);
	}
	/**
	 * Open protected area
	 * @param className the class name
	 * @param method the method name
	 * @return string representing opened the protected area
	 */
	public String openProtectedAreaHL(String className, String method) {
		if (method.startsWith("."))	//	Not method, it is a file name
			return "# PROTECTED REGION ID(" + className + method + ") ENABLED START #";
		else
			return "# PROTECTED REGION ID(" + className + "." + method + ") ENABLED START #";
	}
	/**
	 * CLose protected area
	 * @param cls PogoDeviceClass
	 * @param method the method name
	 * @return string representing the closed protected area
	 */
	public String closeProtectedAreaHL(PogoDeviceClass cls, String method) {
		return closeProtectedAreaHL(cls.getName(), method);
	}
	/**
	 * Close protected area
	 * @param className the class name
	 * @param method the method name
	 * @return string representing the protected area
	 */
	public String closeProtectedAreaHL(String className, String method) {
		if (method.startsWith("."))
			return "# PROTECTED REGION END #    //  " + className + method + "\n";
		else
			return "# PROTECTED REGION END #    //  " + className + "." + method + "\n";
	}
	/**
	 * Insert a protected area
	 * @param cls PogoDeviceClass
	 * @param method the method name
	 * @param code the code to be added in the protected area
	 * @param comments indicates if it is comments or not
	 * @return string representing the protected area
	 */
	public String protectedAreaHL(PogoDeviceClass cls, String method, String code, boolean comments) {
		if (comments)
			return	openProtectedAreaHL(cls, method)+ "\n" +
					"# " + StringUtils.comments(code, "	# ") + "\n" +
					closeProtectedAreaHL(cls, method);
		else
			return	openProtectedAreaHL(cls, method) + "\n" +
					code + "\n" +
					closeProtectedAreaHL(cls, method);
	}
	/**
	 * Insert a protected area
	 * @param cls PogoDeviceClass
	 * @param method the method name
	 * @return string representing the protected area
	 */
	public String protectedAreaHL(PogoDeviceClass cls, String method) {
		return	openProtectedAreaHL(cls.getName(), method)+ "\n" +
				closeProtectedAreaHL(cls.getName(), method);
	}
}
