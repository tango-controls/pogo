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
 *	This class is able parse protected areas from code.
 *  Keep it in a vector and write them in a new file for new class name. 
 *
 * @author  verdier
 */


import java.util.Vector;
import fr.esrf.Tango.DevFailed;

public class  ProtectedAreaManager
{
    private Vector<ProtectedArea>   protectedAreas = new Vector<ProtectedArea>();
    //===============================================================
    //===============================================================
    public ProtectedAreaManager(String fileName) throws DevFailed
    {
        String code = ParserTool.readFile(fileName);
        int  start;
        int  end = 0;
        while ((start=code.indexOf(PogoParser.start_protected, end))>0) {

            //  Get the full protected area string and create area object
            start = code.lastIndexOf("\n", start);
            start++;

            end = code.indexOf(PogoParser.end_protected, start);
            end = code.lastIndexOf("\n", end);

            String  paCode = code.substring(start, end);
            protectedAreas.add(new ProtectedArea(paCode));
            //System.out.println(protectedAreas.get(protectedAreas.size()-1));
        }
    }
    //===============================================================
    //===============================================================
    public void setClassName(String newClassName, String fileName) throws DevFailed
    {
        //  Get code
        String  code = ParserTool.readFile(fileName);

        //  For each protected area
        for (ProtectedArea   pa : protectedAreas) {
            //  Replace protected code
            pa.setClass(newClassName);
            code = replaceProtectedAreaCode(code, pa);
        }

        ParserTool.writeFile(fileName, code);
        //System.out.println(fileName + "  Written");
    }
    //===============================================================
    //===============================================================
    private String replaceProtectedAreaCode(String code, ProtectedArea pa)
    {
        int start = code.indexOf(pa.id_start);
        if (start>=0) {
            start = code.indexOf('\n', start)+1;
            int end = code.indexOf(PogoParser.end_protected, start);
            end = code.lastIndexOf("\n", end);
            code = code.substring(0, start) + pa.code +
                    code.substring(end);
        }
        return code;
    }
    //===============================================================
    //===============================================================

    


    //===============================================================
    //===============================================================
    private class ProtectedArea
    {
        String  id_start;
        String  className;
        String  code;
        //===========================================================
        private ProtectedArea(String str)
        {
            //  Parse it
            int end = str.indexOf('\n');
			if (end>0) {
	            id_start = str.substring(0, end).trim();
    	        code = str.substring(end+1);
			}
			else {
				id_start = str;
				code = "";
			}

            int start = id_start.indexOf("ID(") + "ID(".length();
            end = id_start.indexOf("::", start);
            if (end<0)
                end = id_start.indexOf(")", start);
            className = id_start.substring(start, end);
        }
        //===========================================================
        private void setClass(String newClassName)
        {
            if (id_start.indexOf("::")>0) {
                int pos = id_start.indexOf(className);
                id_start = id_start.substring(0, pos) + newClassName +
                        id_start.substring(pos+className.length());
            }
            else {
                //  Special case for first one (it is the header)
                String tmpClassName = className;
                int pos = tmpClassName.indexOf(".");
                
                if (pos>0) //    remove extension if any
                    tmpClassName = tmpClassName.substring(0, pos);
                id_start = Utils.strReplace(id_start, tmpClassName, newClassName);

                code = Utils.strReplace(code, tmpClassName, newClassName);
                code = Utils.strReplace(code, tmpClassName.toUpperCase(), newClassName.toUpperCase());
                code = Utils.strReplace(code, tmpClassName.toLowerCase(), newClassName.toLowerCase());
            }

            className = newClassName;
        }
        //===========================================================
        public String toString()
        {
            return className + "\n" + id_start + "\n" + code + "\n------------------------";
        }
        //===========================================================
    }

}
