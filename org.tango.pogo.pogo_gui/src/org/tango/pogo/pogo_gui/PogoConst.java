//+======================================================================
//
// Project:   Tango
//
// Description:	java source code defining constants for Pogo project.
//
// $Author: verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013,2014
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

import java.awt.Font;


/**
 * Many definitions for Pogo package.
 *
 * @author $Author: verdier $
 * @version $Revision: 1.6 $
 */
public interface PogoConst {
    /**
     * Revision number and date
     */
    @SuppressWarnings("UnnecessaryInterfaceModifier")
    public static String revNumber =
            "9.6.3  -  09-10-2017  13:02:52";

    int TANGO_PAGES = 0;
    int POGO_PAGES = 1;
    int KERNEL_PAGES = 2;
    int CLASS_PAGES = 3;
    String[] tangoHTTP = {
            "http://www.tango-controls.org/",
            "http://www.esrf.eu/computing/cs/tango/tango_doc/tools_doc/pogo_doc/",
            "http://www.tango-controls.org/resources/documentation/kernel/",
            "http://www.tango-controls.org/resources/device-classes/",
    };

    //	Miscellaneous
    int SINGLE_CLASS = 0;
    int MULTI_CLASS = 1;

    int CLASS_PROPERTIES = 0;
    int DEV_PROPERTIES = 1;
    int COMMANDS = 2;
    int SCALAR_ATTRIBUTES = 3;
    int SPECTRUM_ATTRIBUTES = 4;
    int IMAGE_ATTRIBUTES = 5;
    int FORWARDED_ATTRIBUTES = 6;
    int PIPES = 7;
    int STATES = 8;

    String CONVERSION_DIR = "/new_src";
    String[] strLevel = {"OPERATOR", "EXPERT"};
    int OPERATOR = 0;
    int EXPERT = 1;

    //	Languages
    String[] strLang = {"Java", "Cpp", "Python", "PythonHL"};
    String[] fileExtension = {"java", "cpp", "py", "py"};
    int Java = 0;
    int Cpp = 1;
    int Python = 2;
    int PythonHL = 3;


    //	Attributes
    String[] AttrDataArray = {
            "DevBoolean",    //	0
            "DevUChar",      //	1
            "DevShort",      //	2
            "DevUShort",     //	3
            "DevLong",       //	4
            "DevULong",      //	5
            "DevLong64",     //	6
            "DevULong64",    //	7
            "DevFloat",      //	8
            "DevDouble",     //	9
            "DevString",     //	10
            "DevState",      //	11
            "DevEncoded",    //	12
            "DevEnum",       //	13
    };
    String[] AttrRWtypeArray = {
            "READ",
            "WRITE",
            "READ_WRITE",
            "READ_WITH_WRITE"
    };
    String[] AttrTypeArray = {
            "Scalar",
            "Spectrum",
            "Image"
    };
    int READ = 0;
    int WRITE = 1;
    int READ_WRITE = 2;
    int READ_WITH_WRITE = 3;

    int SCALAR = 0;
    int SPECTRUM = 1;
    int IMAGE = 2;


    //  GUI
    Font rootFont_abstract = new Font("Dialog", Font.BOLD | Font.ITALIC, 20);
    Font rootFont_concrete = new Font("Dialog", Font.BOLD, 20);
    Font collecFont = new Font("Dialog", Font.BOLD, 16);
    Font leafFont_concrete = new Font("Dialog", Font.PLAIN, 12);
    Font leafFont_abstract = new Font("Dialog", Font.ITALIC, 12);

    boolean MonoClass = false;
    boolean MultiClasses = true;
}
