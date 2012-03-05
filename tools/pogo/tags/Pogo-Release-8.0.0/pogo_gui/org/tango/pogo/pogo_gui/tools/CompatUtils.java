//+======================================================================
//
// Project:   Tango
//
// Description:	java source code to parse generated code
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

package org.tango.pogo.pogo_gui.tools;

/**
 *	This class is able parse generated code.
 *
 * @author verdier
 */


import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoDs.Except;

public class CompatUtils {
    private String fileCode;
    private String filename;
    private static final String startAttributeTag = "<attributes";
    private static final String endAttributeTag = "</attributes>";

    //===============================================================
    //===============================================================
    public CompatUtils(String filename) throws DevFailed {
        this.filename = filename;
        fileCode = ParserTool.readFile(filename);
    }

    //===============================================================
    //===============================================================
    public void write() throws DevFailed {
        ParserTool.writeFile(filename, fileCode);
    }

    //===============================================================
    //===============================================================
    private void replaceAttributeTags(String find, String with) {
        //	Get Attribute part
        int start;
        int end = 0;
        String[] data = new String[]{find, with};
        while ((start = fileCode.indexOf(startAttributeTag, end)) > 0) {
            end = fileCode.indexOf(endAttributeTag, start);
            String str = fileCode.substring(start, end);
            str = replaceString(str, data);
            fileCode = fileCode.substring(0, start) + str +
                    fileCode.substring(end);
            end = start + str.length();
        }
    }

    //===============================================================
    //===============================================================
    private String replaceString(String str, String[] data) {
        int start;
        int end = 0;
        while ((start = str.indexOf(data[0], end)) > 0) {
            end = start + data[0].length();
            str = str.substring(0, start) + data[1] +
                    str.substring(end);
            end = start + data[1].length();
        }
        return str;
    }

    //===============================================================
    //===============================================================
    public String toString() {
        return fileCode;
    }

    //===============================================================
    //===============================================================
    private static final boolean test = false;

    public static void main(String[] args) {
        if (!test && args.length == 0) {
            System.err.println("xmi file  ?");
            System.exit(0);
        }
        String filename;
        if (test)
            filename = "/segfs/tango/tools/pogo/test/cpp/test_oaw-1/Holec/Holec.xmi";
        else
            filename = args[0];

        try {
            CompatUtils util = new CompatUtils(filename);
            util.replaceAttributeTags("excludedStates", "readExcludedStates");
            util.write();
            //System.out.println(util);

        } catch (DevFailed e) {
            Except.print_exception(e);
        }
    }
    //===============================================================
    //===============================================================

}
