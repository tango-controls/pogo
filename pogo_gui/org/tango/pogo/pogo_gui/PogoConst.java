//+======================================================================
//
// Project:   Tango
//
// Description:	java source code defining constants for Pogo project.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011
//						European Synchrotron Radiation Facility
//                      BP 220, Grenoble 38043
//                      FRANCE
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

package org.tango.pogo.pogo_gui;

import java.awt.*;


/**
 *	Many definitions for Pogo package.
 *
 * @author	$Author: verdier $
 * @version	$Revision: 1.6 $
 */
public interface PogoConst 
{
	/**
	 *  Revision number and date
	 */
    public static String revNumber =
            "Release 7.3.2  -  Thu Sep 08 08:59:34 CEST 2011";

    public static final int	TANGO_PAGES   = 0;
    public static final int	POGO_PAGES    = 1;
    public static final int	KERNEL_PAGES  = 2;
    public static final int	CLASS_PAGES   = 3;
    public static final String[]      tangoHTTP = {
            "http://www.tango-controls.org/",
            "http://www.esrf.eu/computing/cs/tango/tango_doc/tools_doc/pogo_doc/",
            "http://www.tango-controls.org/Documents/tango-kernel",
            "http://www.tango-controls.org/device-servers",
    };

	//	Miscellaneous
    public static final int SINGLE_CLASS = 0;
    public static final int MULTI_CLASS  = 1;

	public static final int	CLASS_PROPERTIES   = 0;
	public static final int	DEV_PROPERTIES     = 1;
	public static final int	COMMANDS           = 2;
	public static final int	SCALAR_ATTRIBUTE   = 3;
	public static final int	SPECTRUM_ATTRIBUTE = 4;
	public static final int	IMAGE_ATTRIBUTE    = 5;
	public static final int	STATES             = 6;

	public static final String		CONVERTION_DIR = "/new_src";
	public static final String[]	strLevel = { "OPERATOR", "EXPERT" };
	public static final int			OPERATOR = 0;
	public static final int			EXPERT   = 1;

	//	Languages
	public static final String[]	strLang = { "Java", "Cpp", "Python" };
	public static final String[]	fileExtention = { "java", "cpp", "py" };
	public static final int			Java   = 0;
	public static final int			Cpp    = 1;
	public static final int			Python = 2;


	//	Attributes
	public static final String[]	AttrDataArray = {
			"DevBoolean",	//	0
			"DevUChar",		//	1
			"DevShort",		//	2
			"DevUShort",	//	3
			"DevLong",		//	4
			"DevULong",		//	5
			"DevLong64",	//	6
			"DevULong64",	//	7
			"DevFloat",		//	8
			"DevDouble",	//	9
			"DevString",	//	10
			"DevState",		//	11
			"DevEncoded",	//	12
		};
	public static final String[]	AttrRWtypeArray = {
			"READ",
			"WRITE",
			"READ_WRITE",
			"READ_WITH_WRITE"
		};
	public static final String[]	AttrTypeArray = {
			"Scalar",
			"Spectrum",
			"Image"
		};
	public static final int	READ            = 0;
	public static final int	WRITE           = 1;
	public static final int	READ_WRITE      = 2;
	public static final int	READ_WITH_WRITE = 3;

	public static final int	SCALAR          = 0;
	public static final int	SPECTRUM        = 1;
	public static final int	IMAGE           = 2;


    //  GUI
    public static final Font    rootFont_abstract = new Font("Dialog", Font.BOLD | Font.ITALIC, 20);
    public static final Font    rootFont_concrete = new Font("Dialog", Font.BOLD, 20);
    public static final Font    collecFont = new Font("Dialog", Font.BOLD, 16);
    public static final Font    leafFont_concrete = new Font("Dialog", Font.PLAIN, 12);
    public static final Font    leafFont_abstract = new Font("Dialog", Font.ITALIC, 12);


}
