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

package fr.esrf.tango.pogo.generator.pr;

import java.util.regex.Pattern;

import net.danieldietrich.protectedregions.core.IRegionOracle;

public class PogoPR implements IRegionOracle {
    private static final String ID = "[a-zA-Z\\d_$:\\.\\s]*";

    private Pattern start;
    private Pattern end;

    public PogoPR () {
      start =
          Pattern.compile("PROTECTED\\s+REGION\\s+ID\\s*\\(\\s*[a-zA-Z\\d_\\.\\s:]*\\s*\\)\\s+(ENABLED\\s+)?START");
      end = Pattern.compile("PROTECTED\\s+REGION\\s+END");
    }

    //@Override
    public boolean isMarkedRegionStart(String s) {
      return start.matcher(s).find();
    }

    //@Override
    public boolean isMarkedRegionEnd(String s) {
      return end.matcher(s).find();
    }

    //@Override
    public String getId(String markedRegionStart) {
      int i = markedRegionStart.indexOf("(");
      int j = i + 1 + markedRegionStart.substring(i + 1).indexOf(")");
      return (i != -1 && j != -1) ? markedRegionStart.substring(i + 1, j).trim() : null;
    }

    //@Override
    public boolean isEnabled(String markedRegionStart) {
      return markedRegionStart.contains("ENABLED");
    }

}
