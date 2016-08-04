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

package fr.esrf.tango.pogo.generator.cpp.utils;

import org.eclipse.emf.common.util.EList;

import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.Property;


public class InheritanceUtils {

	
	
	//===========================================================
	/**
	 *	Return true if class has no abstract command 
	 *	and no abstract attribute
	 */
	//===========================================================
	public boolean isConcreteClass(PogoDeviceClass cls) {
		return CppStringUtils.isFalse(cls.getDescription().getHasAbstractAttribute()) &&
				CppStringUtils.isFalse(cls.getDescription().getHasAbstractCommand()) ;
	}

	//===========================================================
	/**
	 *	Return the inheritance class
	 */
	//===========================================================
	public String inheritedClassName(PogoDeviceClass cls) {
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return CppStringUtils.DeviceImpl();
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return CppStringUtils.DeviceImpl();
			else
				return className;
		}
	}
	//===========================================================
	/**
	 *	Return the inheritance class for device  class
	 */
	//===========================================================
	public String inheritedClassNameForDevice(PogoDeviceClass cls) {
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return CppStringUtils.DeviceImpl();
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return CppStringUtils.DeviceImpl();
			else
				return className + "_ns::" + className;
		}
	}
	//===========================================================
	/**
	 *	Return the inheritance class for deviceClass class
	 */
	//===========================================================
	public String inheritedClassNameForDeviceClass(PogoDeviceClass cls) {
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return "Tango::DeviceClass";
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return "Tango::DeviceClass";
			else
				return className + "_ns::" + className + "Class";
		}
	}
	//===========================================================
	//===========================================================
	private boolean isDefaultDeviceImpl(String className) {
		
		return (className.startsWith("Device_") && className.endsWith("Impl"));
	}
	//===========================================================
	//===========================================================
	public boolean isDefaultDeviceImpl(Inheritance inheritance) {
		return isDefaultDeviceImpl(inheritance.getClassname());
	}
	//===========================================================
	/**
	 *	Return true if not the Tango DeviceImpl
	 */
	//===========================================================
	public boolean isInheritanceClass(Inheritance inheritance) {
		if (CppStringUtils.isSet(inheritance.getClassname())) {
			return (isDefaultDeviceImpl(inheritance.getClassname())==false);
		}
		else
			return false;
	}

	//===========================================================
	/**
	 *	Return true at least the first one is not the Tango DeviceImpl
	 */
	//===========================================================
	public boolean hasInheritanceClass(PogoDeviceClass cls) {

		int	inherSize = cls.getDescription().getInheritances().size();
		return inherSize>0 &&
				isInheritanceClass(cls.getDescription().getInheritances().get(inherSize-1));
	}
	//===========================================================
	/**
	 *	Return true at least the first one is not the Tango DeviceImpl
	 */
	//===========================================================
	public boolean hasInheritanceClass(OneClassSimpleDef cls) {

		int	inherSize = cls.getInheritances().size();
		return inherSize>0 &&
				isInheritanceClass(cls.getInheritances().get(inherSize-1));
	}
	
	//===========================================================
	public boolean isInherited(Property property) {
		return (property.getStatus()!=null &&
				property.getStatus().getInherited()!=null &&
				property.getStatus().getInherited().equals("true"));
	}
	//===========================================================
	public boolean isInherited(Attribute attribute) {
		return (attribute.getStatus()!=null &&
				attribute.getStatus().getInherited()!=null &&
				attribute.getStatus().getInherited().equals("true"));
	}
	//===========================================================
	public boolean isInherited(Command command) {
		return (command.getStatus()!=null &&
				command.getStatus().getInherited()!=null &&
				command.getStatus().getInherited().equals("true"));
	}
	//===========================================================
	public boolean isConcreteHere(Property property) {
		return (property.getStatus()!=null &&
				property.getStatus().getConcreteHere()!=null &&
				property.getStatus().getConcreteHere().equals("true"));
	}
	//===========================================================
	public boolean isConcreteHere(Attribute attribute) {
		return (attribute.getStatus()!=null &&
				attribute.getStatus().getConcreteHere()!=null &&
				attribute.getStatus().getConcreteHere().equals("true"));
	}
	//===========================================================
	public boolean isConcreteHere(Command command) {
		return (command.getStatus()!=null &&
				command.getStatus().getConcreteHere()!=null &&
				command.getStatus().getConcreteHere().equals("true"));
	}
	//===========================================================
	public boolean isAbstract(Attribute attribute) {
		return CppStringUtils.isTrue(attribute.getStatus().getAbstract()) &&
				CppStringUtils.isTrue(attribute.getStatus().getInherited())==false &&
				CppStringUtils.isTrue(attribute.getStatus().getConcreteHere())==false;
	}
	//===========================================================
	public boolean alreadyOverloaded(Attribute attribute) {
		return CppStringUtils.isTrue(attribute.getStatus().getConcrete()) &&
				CppStringUtils.isTrue(attribute.getStatus().getConcreteHere())==false;
	}
	//===========================================================
	public boolean isAbstract(Command command) {
		return CppStringUtils.isTrue(command.getStatus().getAbstract()) &&
				CppStringUtils.isTrue(command.getStatus().getInherited())==false &&
				CppStringUtils.isTrue(command.getStatus().getConcreteHere())==false;
	}
	//===========================================================
	public boolean overrides(Command command) {
		return CppStringUtils.isTrue(command.getStatus().getConcrete()) &&
				CppStringUtils.isTrue(command.getStatus().getConcreteHere())==false;
	}
	//===========================================================
	public String checkAbstractForProto(Attribute attribute) {
		if (isAbstract(attribute))
			return " = 0";
		else
			return "";
	}
	//===========================================================
	public String checkAbstractForProto(Command command) {
		if (isAbstract(command))
			return " = 0";
		else
			return "";
	}
	//===========================================================
	public String inheritanceIncludeList(PogoDeviceClass cls, boolean devClass) {
		
		StringBuffer	sb = new StringBuffer();
		for (Inheritance inheritance : cls.getDescription().getInheritances()) {
			if (isDefaultDeviceImpl(inheritance)==false) {
				sb.append("#include <").append(inheritance.getClassname());
				if (devClass)
					sb.append("Class.h>\n");
				else
					sb.append(".h>\n");
			}
		}
		return sb.toString();
	}
	//===========================================================

	
	
	
	
	
	
	//===========================================================
	//	Utilities for Makefile
	//===========================================================
	public String inheritanceNameForMakefile(Inheritance inheritance) {
		return inheritance.getClassname().toUpperCase();
	}
	//===========================================================
	public String addInheritanceObjectFiles(PogoDeviceClass cls) {

		StringBuffer	sb = new StringBuffer();
		sb.append("SVC_INHERITANCE_OBJ =  \\\n");
		for (Inheritance inheritance : cls.getDescription().getInheritances()) {
			if (isDefaultDeviceImpl(inheritance)==false) {
				sb.append("        ").append("$(SVC_").append(inheritance.getClassname().toUpperCase()).append("_OBJ) \\\n");
			}
		}
		sb.append("\n");
		for (Inheritance inheritance : cls.getDescription().getInheritances()) {
			if (isDefaultDeviceImpl(inheritance)==false) {
				sb.append("#------------  Object files for GenericPS class  ------------\n");
				sb.append("SVC_").append(inheritance.getClassname().toUpperCase()).append("_OBJ = \\\n");
				sb.append("        $(OBJDIR)/").append(inheritance.getClassname()).append(".o \\\n");
				sb.append("        $(OBJDIR)/").append(inheritance.getClassname()).append("Class.o \\\n");
				sb.append("        $(OBJDIR)/").append(inheritance.getClassname()).append("StateMachine.o \\\n\n");
			}
		}
		return sb.toString();
	}
	//===========================================================
}
