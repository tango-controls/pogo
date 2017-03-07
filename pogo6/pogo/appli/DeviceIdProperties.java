//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  Basic Dialog Class to display info
//
// $Author$
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2009
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
// $Revision$
//
// $Log$
//
//-======================================================================

package pogo.appli;



/**
 *	Definitions for Pogo Device class identification.
 *
 * @author	$Author$
 * @version	$Revision$
 */
public class DeviceIdProperties
{
	public final static String	classFamilies[] = {
			"",
			"Miscellaneous",
			"AbstractClasses",
			"Acquisition",
			"Application",
			"BeamDiag",
			"Calculation",
			"Communication",
			"Controllers",
			"InputOutput",
			"Instrumentation",
			"Interlock",
			"Motion",
			"PowerSupply",
			"Process",
			"RadioProtection",
			"Sequencer",
			"Simulators",
			"Training",
			"Vacuum",
		};
	
    public final static String	platformNames[] = {
			 "All Platforms",
			 "Unix Like",
			 "Windows"
		};
    public final static String	busNames[] = {
			 "",
			 "Not Applicable",
			 "Compact PCI",
			 "Data Socket",
			 "Ethernet",
			 "FireWire",
			 "GPIB",
			 "Modbus",
			 "PCI",
			 "PCI Express",
			 "Serial Line",
			 "Socket",
			 "TCP/UDP",
			 "USB",
			 "VME"
		};



	public static String	siteName = "ESRF";
	public static String	siteClassFamilies[] = {
			"",
			"Hqps",
			"InputOutput",
			"Interlock",
			"Linac",
			"Measures",
			"Motion",
			"PowerSupply",
			"Protocols",
			"RadioFrequency",
			"TACO_Interfaces",
			"Vacuum",
			"Miscellaneous",
		};
}
