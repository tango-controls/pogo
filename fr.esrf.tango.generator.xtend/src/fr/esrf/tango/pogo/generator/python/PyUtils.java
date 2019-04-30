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

import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;

import fr.esrf.tango.pogo.generator.common.StringUtils;

//===========================================================
/**
 * PyUtils helper class
 */
//===========================================================
public class PyUtils {
	
	//===========================================================
	/**
	 * Global DeviceImpl inheritance
	 * @return used DeviceImpl inheritance
	 */
	//===========================================================
	static String deviceImpl() {
		return "PyTango.Device_4Impl";
	}
	//===========================================================
	/**
	 * Returns the method execution name for specified command (special case for State and Status) 
	 * @param command the specified command
	 * @return  the method execution name for specified command
	 */
	//===========================================================
	String methodName(Command command) {
		if (command.getName().equals("State"))
			return "dev_state";
		else
		if (command.getName().equals("Status"))
			return "dev_status";
		else
			return command.getName();
	}
	//===========================================================
	/**
	 * Returns the method execution name for specified command (special case for State and Status) 
	 * @param command the specified command
	 * @return  the method execution name for specified command
	 */
	//===========================================================
	String returnMethodCode(Command command) {
		
		if (command.getName().equals("State")) {
			return	"if argout != PyTango.DevState.ALARM:\n" +
					"    " + PyUtils.deviceImpl() + ".dev_state(self)\n" +
					"return self.get_state()";
		}
		else
		if (command.getName().equals("Status")) {
			return	"self.set_status(self.argout)\n" +
					"self.__status = " + PyUtils.deviceImpl() + ".dev_status(self)\n" +
					"return self.__status";
		}
		else {
		    if (!command.getArgout().getType().toString().contains("Void"))
		    	return "return argout";
			return "";
		}
	}
	//===========================================================
	/**
	 * Returns an example of a dynamic attribute
	 * @param cls PogoDeviceClass
	 * @param attribute Attribute
	 * @return  a string representing how to add a dynamic attribute
	 */
	//===========================================================
	String addDynamicAttributeExample(PogoDeviceClass cls, Attribute attribute) {
		StringBuilder	sb = new StringBuilder("self.add_attribute(");
		sb.append("my").append(attribute.getName()).append(",");
		if (StringUtils.isRead(attribute))
			sb.append(cls.getName()).append(".read_").append(attribute.getName());
		else
			sb.append("None");
		sb.append(", ");
		if (StringUtils.isWrite(attribute))
			sb.append(cls.getName()).append(".write_").append(attribute.getName());
		else
			sb.append("None");
		sb.append(", ");
		if (attribute.getReadExcludedStates().size()>0)
			sb.append(cls.getName()).append(".is_").append(attribute.getName()).append("_allowed");
		else
			sb.append("None");
		sb.append(")");
		return sb.toString();
	}

	//===========================================================
	/**
	 * Returns the method execution code for specified command (special case for test) 
	 * @param command the specified command
	 * @return  the method execution name for specified command
	 */
	//===========================================================
	String methodTest(Command cmd, String defVal) {
		if (cmd.getName().equals("State")) {
			return "self.device.State()";
		}
		else
		{
			if (cmd.getName().equals("Status")) {
				return "self.device.Status()";
			}
			else
			{
				if (cmd.getArgin().getType().equals("VoidTypeImpl")==false)
				{
					return "self.device." + cmd.getName() + "("+ defVal +")";
				}
				else
				{
					return "self.device." + cmd.getName() + "()";
				}
			}
		}
	}

	//===========================================================
	/**
	 * Returns the enum labels on one line 
	 * @param command the specified command
	 * @return  the method execution name for specified command
	 */
	//===========================================================
    String pythonPipeEnum(Attribute attr){
    	if (attr.getEnumLabels() != null)
    	{
			StringBuilder	sb = new StringBuilder("[");
			for (String label : attr.getEnumLabels())
			{
				sb.append("\"").append(label).append("\", ");
			}
			sb.append("]");
			return sb.toString();
    	}
    	else
    	{
    		return "";
    	}
    }
}
