//+======================================================================
//
//Project:   Tango
//
//Description:  source code for Tango code generator.
//
//$Author: verdier $
//
//Copyright (C) :  2004,2005,2006,2007,2008,2009,2009,2010,2011,2012,2013,2014
//					European Synchrotron Radiation Facility
//               BP 220, Grenoble 38043
//               FRANCE
//
//This file is part of Tango.
//
//Tango is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.
//
//Tango is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
//$Revision: $
//$Date:  $
//
//$HeadURL: $
//
//-======================================================================

package fr.esrf.tango.pogo.generator.python;


import org.eclipse.emf.common.util.EList;

import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.BooleanArrayType;
import fr.esrf.tango.pogo.pogoDsl.BooleanType;
import fr.esrf.tango.pogo.pogoDsl.CharArrayType;
import fr.esrf.tango.pogo.pogoDsl.ConstStringType;
import fr.esrf.tango.pogo.pogoDsl.DevIntType;
import fr.esrf.tango.pogo.pogoDsl.DoubleArrayType;
import fr.esrf.tango.pogo.pogoDsl.DoubleStringArrayType;
import fr.esrf.tango.pogo.pogoDsl.DoubleType;
import fr.esrf.tango.pogo.pogoDsl.DoubleVectorType;
import fr.esrf.tango.pogo.pogoDsl.EncodedType;
import fr.esrf.tango.pogo.pogoDsl.FloatArrayType;
import fr.esrf.tango.pogo.pogoDsl.FloatType;
import fr.esrf.tango.pogo.pogoDsl.FloatVectorType;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.IntArrayType;
import fr.esrf.tango.pogo.pogoDsl.IntType;
import fr.esrf.tango.pogo.pogoDsl.IntVectorType;
import fr.esrf.tango.pogo.pogoDsl.LongArrayType;
import fr.esrf.tango.pogo.pogoDsl.LongStringArrayType;
import fr.esrf.tango.pogo.pogoDsl.LongType;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.PropType;
import fr.esrf.tango.pogo.pogoDsl.ShortArrayType;
import fr.esrf.tango.pogo.pogoDsl.ShortType;
import fr.esrf.tango.pogo.pogoDsl.ShortVectorType;
import fr.esrf.tango.pogo.pogoDsl.StateType;
import fr.esrf.tango.pogo.pogoDsl.StringArrayType;
import fr.esrf.tango.pogo.pogoDsl.StringType;
import fr.esrf.tango.pogo.pogoDsl.StringVectorType;
import fr.esrf.tango.pogo.pogoDsl.Type;
import fr.esrf.tango.pogo.pogoDsl.UCharType;
import fr.esrf.tango.pogo.pogoDsl.UIntArrayType;
import fr.esrf.tango.pogo.pogoDsl.UIntType;
import fr.esrf.tango.pogo.pogoDsl.ULongArrayType;
import fr.esrf.tango.pogo.pogoDsl.ULongType;
import fr.esrf.tango.pogo.pogoDsl.UShortArrayType;
import fr.esrf.tango.pogo.pogoDsl.UShortType;
import fr.esrf.tango.pogo.pogoDsl.VoidType;
public class PythonTypeDefinitions {
	/**
	 * Property Type utilities
	 */
	public static String pythonPropType (PropType propType) {
		
		if (propType instanceof BooleanType)	   return "PyTango.DevBoolean";
		if (propType instanceof ShortType) 		   return "PyTango.DevShort";
		if (propType instanceof IntType)           return "PyTango.DevLong";
		if (propType instanceof UShortType)        return "PyTango.DevUShort";
		if (propType instanceof UIntType)      	   return "PyTango.DevULong";
		if (propType instanceof FloatType)         return "PyTango.DevFloat";
		if (propType instanceof DoubleType)        return "PyTango.DevDouble";
		if (propType instanceof StringType)        return "PyTango.DevString";
		if (propType instanceof ShortVectorType)   return "PyTango.DevVarShortArray";
		if (propType instanceof IntVectorType)     return "PyTango.DevVarLongArray";
		if (propType instanceof FloatVectorType)   return "PyTango.DevVarFloatArray";
		if (propType instanceof DoubleVectorType)  return "PyTango.DevVarDoubleArray";
		if (propType instanceof StringVectorType)  return "PyTango.DevVarStringArray";
		return "";
	}

	/**
	 * Type utilities
	 */
	public static String pythonType (Type type) {
		if (type instanceof VoidType)				return "PyTango.DevVoid";
		if (type instanceof BooleanType)			return "PyTango.DevBoolean";
		if (type instanceof ShortType)				return "PyTango.DevShort";
		if (type instanceof IntType)				return "PyTango.DevLong";
		if (type instanceof FloatType)				return "PyTango.DevFloat";
		if (type instanceof DoubleType)				return "PyTango.DevDouble";
		if (type instanceof UShortType)				return "PyTango.DevUShort";
		if (type instanceof UIntType)				return "PyTango.DevULong";
		if (type instanceof StringType)				return "PyTango.DevString";
		if (type instanceof CharArrayType)			return "PyTango.DevVarCharArray";
		if (type instanceof ShortArrayType)			return "PyTango.DevVarShortArray";
		if (type instanceof IntArrayType)			return "PyTango.DevVarLongArray";
		if (type instanceof FloatArrayType)			return "PyTango.DevVarFloatArray";
		if (type instanceof DoubleArrayType)		return "PyTango.DevVarDoubleArray";
		if (type instanceof UShortArrayType)		return "PyTango.DevVarUShortArray";
		if (type instanceof UIntArrayType)			return "PyTango.DevVarULongArray";
		if (type instanceof StringArrayType)		return "PyTango.DevVarStringArray";
		if (type instanceof LongStringArrayType)	return "PyTango.DevVarLongStringArray";
		if (type instanceof DoubleStringArrayType)	return "PyTango.DevVarDoubleStringArray";
		if (type instanceof StateType)				return "PyTango.CmdArgType.DevState";
		if (type instanceof ConstStringType)		return "PyTango.ConstDevString";
		if (type instanceof BooleanArrayType)		return "PyTango.DevVarBooleanArray";
		if (type instanceof UCharType)				return "PyTango.DevUChar";
		if (type instanceof LongType)				return "PyTango.DevLong64";
		if (type instanceof ULongType)				return "PyTango.DevULong64";
		if (type instanceof LongArrayType)			return "PyTango.DevVarLong64Array";
		if (type instanceof ULongArrayType)			return "PyTango.DevVarULong64Array";
		if (type instanceof DevIntType)				return "PyTango.DevInt";
		if (type instanceof EncodedType)			return "PyTango.DevEncoded";
		return "";
	}

	/**
	 * Type enum
	 */
	public static String pythonTypeEnum (Type type) {
		if (type instanceof VoidType)				return "Tango::DEV_VOID";
		if (type instanceof BooleanType)			return "Tango::DEV_BOOLEAN";
		if (type instanceof ShortType)				return "Tango::DEV_SHORT";
		if (type instanceof IntType)				return "Tango::DEV_LONG";
		if (type instanceof FloatType)				return "Tango::DEV_FLOAT";
		if (type instanceof DoubleType)				return "Tango::DEV_DOUBLE";
		if (type instanceof UShortType)				return "Tango::DEV_USHORT";
		if (type instanceof UIntType)				return "Tango::DEV_ULONG";
		if (type instanceof StringType)				return "Tango::DEV_STRING";
		if (type instanceof CharArrayType)			return "Tango::DEVVAR_CHARARRAY";
		if (type instanceof ShortArrayType)			return "Tango::DEVVAR_SHORTARRAY";
		if (type instanceof IntArrayType)			return "Tango::DEVVAR_LONGARRAY";
		if (type instanceof FloatArrayType)			return "Tango::DEVVAR_FLOATARRAY";
		if (type instanceof DoubleArrayType)		return "Tango::DEVVAR_DOUBLEARRAY";
		if (type instanceof UShortArrayType)		return "Tango::DEVVAR_USHORTARRAY";
		if (type instanceof UIntArrayType)			return "Tango::DEVVAR_ULONGARRAY";
		if (type instanceof StringArrayType)		return "Tango::DEVVAR_STRINGARRAY";
		if (type instanceof LongStringArrayType)	return "Tango::DEVVAR_LONGSTRINGARRAY";
		if (type instanceof DoubleStringArrayType)	return "Tango::DEVVAR_DOUBLESTRINGARRAY";
		if (type instanceof StateType)				return "Tango::DEV_STATE";
		if (type instanceof ConstStringType)		return "Tango::CONST_DEV_STRING";
		if (type instanceof BooleanArrayType)		return "Tango::DEVVAR_BOOLEANARRAY";
		if (type instanceof UCharType)				return "Tango::DEV_UCHAR";
		if (type instanceof LongType)				return "Tango::DEV_LONG64";
		if (type instanceof ULongType)				return "Tango::DEV_ULONG64";
		if (type instanceof LongArrayType)			return "Tango::DEVVAR_LONG64ARRAY";
		if (type instanceof ULongArrayType)			return "Tango::DEVVAR_ULONG64ARRAY";
		if (type instanceof DevIntType)				return "Tango::DEV_INT";
		if (type instanceof EncodedType)			return "Tango::DEV_ENCODED";
		return "";
	}
	
	/**
	 * Type utilities
	 */
	public static String defaultValue (Type type) {
		if (type instanceof VoidType)				return "";
		if (type instanceof BooleanType)			return "False";
		if (type instanceof ShortType)				return "0";
		if (type instanceof IntType)				return "0";
		if (type instanceof FloatType)				return "0.0";
		if (type instanceof DoubleType)				return "0.0";
		if (type instanceof UShortType)				return "0";
		if (type instanceof UIntType)				return "0";
		if (type instanceof StringType)				return "''";
		if (type instanceof CharArrayType)			return "['']";
		if (type instanceof ShortArrayType)			return "[0]";
		if (type instanceof IntArrayType)			return "[0]";
		if (type instanceof FloatArrayType)			return "[0.0]";
		if (type instanceof DoubleArrayType)		return "[0.0]";
		if (type instanceof UShortArrayType)		return "[0]";
		if (type instanceof UIntArrayType)			return "[0]";
		if (type instanceof StringArrayType)		return "['']";
		if (type instanceof LongStringArrayType)	return "[0],['']";
		if (type instanceof DoubleStringArrayType)	return "[0.0],['']";
		if (type instanceof StateType)				return "PyTango.DevState.UNKNOWN";
		if (type instanceof ConstStringType)		return "''";
		if (type instanceof BooleanArrayType)		return "[False]";
		if (type instanceof UCharType)				return "";
		if (type instanceof LongType)				return "0";
		if (type instanceof ULongType)				return "0";
		if (type instanceof LongArrayType)			return "[0]";
		if (type instanceof ULongArrayType)			return "[0]";
		if (type instanceof DevIntType)				return "0";
		if (type instanceof EncodedType)			return "''";
		return "''";
	}

	
	/**
	 * Type utilities
	 */
	public static String defaultValueDim (Attribute attr) {
		if (attr.getAttType().equals("Spectrum"))
		{
			return "[" + defaultValue(attr.getDataType()) + "]";
		}
		if (attr.getAttType().equals("Scalar"))
		{
			return defaultValue(attr.getDataType());
		}
		if (attr.getAttType().equals("Image"))
		{
			return "[[" + defaultValue(attr.getDataType()) + "]]";
		}
		return "";
	}
	
	/**
	 * attribute configuration utilities
	 */
	public String setAttrProperty(String propertyName, String strValue)
	{
		if (propertyName.equals("Display level"))
		{
			if (strValue.equals("EXPERT") || strValue.equals("PyTango.DispLevel.EXPERT"))
			{
				return "    \'" + propertyName + "\': PyTango.DispLevel.EXPERT,";
			}
			else
				return "";
		}
		else
		{
			if (propertyName.equals("Polling period"))
			{
				if (!strValue.equals("0"))
				{
					return "    \'" + propertyName + "\': \"" + strValue + "\",";
				}
				else
					return "";
			}
			else
			{
				if (strValue.length() > 0)
					return "    \'" + propertyName + "\': \"" + strValue + "\",";
				else
					return "";
			}
		}
	}
	
	public String getArgDescription(String strValue)
	{
		if (strValue.length() > 0)
		{
			return "" + strValue + "";
		}
		else
			return "none";
	}

	
	
	public boolean isVoidType(Type my_type){
		if (my_type instanceof VoidType)
	    {
    		return true;
    	}
    	else
    		return false;
	}
	

	public String inheritedPythonClassName(PogoDeviceClass cls) {
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return PyUtils.deviceImpl();
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return PyUtils.deviceImpl();
			else
				return className;
		}
	}
	
	public String inheritedConstructor(PogoDeviceClass cls) {
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return PyUtils.deviceImpl() + "__init__(self,cl,name)";
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return PyUtils.deviceImpl() + ".__init__(self,cl,name)";
			else
				return "super(" + cls.getName() + ",self).__init__(cl,name)";
		}
	}
	
	public String inheritedAdditionalImport(PogoDeviceClass cls) {
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return "";
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return "";
			else
				return "from " + className + " import " + className + ", " + className + "Class\n";
		}
	}
	
	private boolean isDefaultDeviceImpl(String className) {
		
		return (className.startsWith("Device_") && className.endsWith("Impl"));
	}
	
	public String inheritanceAttrList(PogoDeviceClass cls){
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return "";
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return "";
			else
				return "attr_list.update(" + className + "Class.attr_list)";
		}
	}
	
	public String inheritanceCmdList(PogoDeviceClass cls){
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return "";
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return "";
			else
				return "cmd_list.update(" + className + "Class.cmd_list)";
		}
	}
	
	public String inheritanceClassPropertyList(PogoDeviceClass cls){
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return "";
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return "";
			else
				return "class_property_list.update(" + className + "Class.class_property_list)";
		}
	}
	
	public String inheritanceDevicePropertyList(PogoDeviceClass cls){
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return "";
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return "";
			else
				return "device_property_list.update(" + className + "Class.device_property_list)";
		}
	}
	

	public String inheritedPythonDeviceClassName(PogoDeviceClass cls) {
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return "PyTango.DeviceClass";
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return "PyTango.DeviceClass";
			else
				return className + "Class";
		}
	}
	
	public String setAttrVal(Attribute attr){
		return "attr.set_value(self.attr_" + attr.getName() + "_read)";
	}
}
