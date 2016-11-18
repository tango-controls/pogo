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
import fr.esrf.tango.pogo.pogoDsl.Command;
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
import fr.esrf.tango.pogo.pogoDsl.EnumType;
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

/**
 * Python Type Definitions
 */

public class PythonTypeDefinitions {
	/**
	 * Python Property Type utility
	 * @param propType Type of the property
	 * @return string representing the PyTango Type
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
	 * PythonHL Property Type utility
	 * @param propType Type of the property
	 * @return string representing the PyTango HL Type
	 */
	public static String pythonPropTypeHL (PropType propType) {
		
		if (propType instanceof BooleanType)	   return "'bool'";
		if (propType instanceof ShortType) 		   return "'int16'";
		if (propType instanceof IntType)           return "'int'";
		if (propType instanceof UShortType)        return "'uint16'";
		if (propType instanceof UIntType)      	   return "'uint'";
		if (propType instanceof FloatType)         return "'float'";
		if (propType instanceof DoubleType)        return "'double'";
		if (propType instanceof StringType)        return "'str'";
		if (propType instanceof ShortVectorType)   return "('int16',)";
		if (propType instanceof IntVectorType)     return "('int',)";
		if (propType instanceof FloatVectorType)   return "('float',)";
		if (propType instanceof DoubleVectorType)  return "('double',)";
		if (propType instanceof StringVectorType)  return "('str',)";
		return "";
	}

	/**
	 * Python Type utility
	 * @param type Type
	 * @return string representing the PyTango HL Type
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
	 * PythonHL Type utility
	 * @param type Type of the property
	 * @return string representing the PyTango Type
	 */
	public static String pythonTypeHL (Type type) {
		if (type instanceof VoidType)				return "'None'";
		if (type instanceof BooleanType)			return "'bool'";
		if (type instanceof ShortType)				return "'int16'";
		if (type instanceof IntType)				return "'int'";
		if (type instanceof FloatType)				return "'float'";
		if (type instanceof DoubleType)				return "'double'";
		if (type instanceof UShortType)				return "'uint16'";
		if (type instanceof UIntType)				return "'uint'";
		if (type instanceof StringType)				return "'str'";
		if (type instanceof CharArrayType)			return "('char',)";
		if (type instanceof ShortArrayType)			return "('int16',)";
		if (type instanceof IntArrayType)			return "('int',)";
		if (type instanceof FloatArrayType)			return "('float',)";
		if (type instanceof DoubleArrayType)		return "('double',)";
		if (type instanceof UShortArrayType)		return "('uint16',)";
		if (type instanceof UIntArrayType)			return "('uint',)";
		if (type instanceof StringArrayType)		return "('str',)";
		if (type instanceof LongStringArrayType)	return "'DevVarLongStringArray'";
		if (type instanceof DoubleStringArrayType)	return "'DevVarDoubleStringArray'";
		if (type instanceof StateType)				return "'DevState'";
		if (type instanceof ConstStringType)		return "'str'";
		if (type instanceof BooleanArrayType)		return "('bool',)";
		if (type instanceof UCharType)				return "'char'";
		if (type instanceof LongType)				return "'int64'";
		if (type instanceof ULongType)				return "'uint64'";
		if (type instanceof LongArrayType)			return "('int64',)";
		if (type instanceof ULongArrayType)			return "('uint64')";
		if (type instanceof DevIntType)				return "'DevInt'";
		if (type instanceof EncodedType)			return "'bytearray'";
		if (type instanceof EnumType)				return "'DevEnum'";
		return "";
	}

	/**
	 * PythonHL Attribute Type utility
	 * @param attr Attribute
	 * @return string representing the PyTango HL Type
	 */
	public static String pythonTypeAttrHL (Attribute attr) {
		String l_str = "";
		if (attr.getDataType() instanceof VoidType)				l_str = "'None'";
		if (attr.getDataType() instanceof BooleanType)			l_str = "'bool'";
		if (attr.getDataType() instanceof ShortType)			l_str = "'int16'";
		if (attr.getDataType() instanceof IntType)				l_str = "'int'";
		if (attr.getDataType() instanceof FloatType)			l_str = "'float'";
		if (attr.getDataType() instanceof DoubleType)			l_str = "'double'";
		if (attr.getDataType() instanceof UShortType)			l_str = "'uint16'";
		if (attr.getDataType() instanceof UIntType)				l_str = "'uint'";
		if (attr.getDataType() instanceof StringType)			l_str = "'str'";
		if (attr.getDataType() instanceof StateType)			l_str = "'DevState'";
		if (attr.getDataType() instanceof ConstStringType)		l_str = "'str'";
		if (attr.getDataType() instanceof UCharType)			l_str = "'char'";
		if (attr.getDataType() instanceof LongType)				l_str = "'int64'";
		if (attr.getDataType() instanceof ULongType)			l_str = "'uint64'";
		if (attr.getDataType() instanceof DevIntType)			l_str = "'DevInt'";
		if (attr.getDataType() instanceof EncodedType)			l_str = "'bytearray'";
		if (attr.getDataType() instanceof EnumType)				l_str = "'DevEnum'";
		
		if (attr.getAttType().equals("Spectrum"))
		{
			l_str = "(" + l_str + ",)";
		}
		if (attr.getAttType().equals("Image"))
		{
			l_str = "((" + l_str + ",),)";
		}
		return l_str;
	}
	
	/**
	 * Python Type Enum utility
	 * @param type Type 
	 * @return string representing the PyTango Enum Type
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
	 * PythonHL Default Value utility
	 * @param attr Attribute
	 * @return string representing the default value for the attribute
	 */
	public static String defaultValueHL (Attribute attr) {
		String def_val = "";
		if (attr.getDataType() instanceof VoidType)				def_val =  "";
		if (attr.getDataType() instanceof BooleanType)			def_val =  "False";
		if (attr.getDataType() instanceof ShortType)			def_val =  "0";
		if (attr.getDataType() instanceof IntType)				def_val =  "0";
		if (attr.getDataType() instanceof FloatType)			def_val =  "0.0";
		if (attr.getDataType() instanceof DoubleType)			def_val =  "0.0";
		if (attr.getDataType() instanceof UShortType)			def_val =  "0";
		if (attr.getDataType() instanceof UIntType)				def_val =  "0";
		if (attr.getDataType() instanceof StringType)			def_val =  "''";
		if (attr.getDataType() instanceof StateType)			def_val =  "PyTango.DevState.UNKNOWN";
		if (attr.getDataType() instanceof ConstStringType)		def_val =  "''";
		if (attr.getDataType() instanceof UCharType)			def_val =  "0";
		if (attr.getDataType() instanceof LongType)				def_val =  "0";
		if (attr.getDataType() instanceof ULongType)			def_val =  "0";
		if (attr.getDataType() instanceof DevIntType)			def_val =  "0";
		if (attr.getDataType() instanceof EncodedType)			def_val =  "['', '']";
		if (attr.getDataType() instanceof EnumType)				def_val =  "0";
		
		if (attr.getAttType().equals("Spectrum"))
		{
			def_val = "[" + def_val + "]";
		}
		if (attr.getAttType().equals("Image"))
		{
			def_val = "[[" + def_val + "]]";
		}
		return def_val;
	}
	
	/**
	 * PythonHL Default Value for test utility
	 * @param attr Attribute
	 * @return string representing the default value for the attribute
	 */
	public static String defaultValueHLTest (Attribute attr) {
		String def_val = "";
		if (attr.getDataType() instanceof VoidType)				def_val =  "";
		if (attr.getDataType() instanceof BooleanType)			def_val =  "[\"False\", \"True\"]";
		if (attr.getDataType() instanceof ShortType)			def_val =  "[-1, 0, 5]";
		if (attr.getDataType() instanceof IntType)				def_val =  "[-1, 0, 5]";
		if (attr.getDataType() instanceof FloatType)			def_val =  "[-1.12, 0.0, 56.35]";
		if (attr.getDataType() instanceof DoubleType)			def_val =  "[-1.12, 0.0, 56.35]";
		if (attr.getDataType() instanceof UShortType)			def_val =  "[0, 12]";
		if (attr.getDataType() instanceof UIntType)				def_val =  "[0, 12]";
		if (attr.getDataType() instanceof StringType)			def_val =  "['', 'This is a test string', 'test_string']";
		if (attr.getDataType() instanceof StateType)			def_val =  "[PyTango.DevState.UNKNOWN, PyTango.DevState.ON, PyTango.DevState.FAULT]";
		if (attr.getDataType() instanceof ConstStringType)		def_val =  "['', 'This is a test string', 'test_string']";
		if (attr.getDataType() instanceof UCharType)			def_val =  "['', 'a', '#', 'P']";
		if (attr.getDataType() instanceof LongType)				def_val =  "[-1, 0, 5]";
		if (attr.getDataType() instanceof ULongType)			def_val =  "[0, 12]";
		if (attr.getDataType() instanceof DevIntType)			def_val =  "[-1, 0, 5]";
		if (attr.getDataType() instanceof EncodedType)			def_val =  "['', '#12BF']";
		if (attr.getDataType() instanceof EnumType)				def_val =  "0";
        
		if (attr.getAttType().equals("Spectrum"))
		{
			def_val = "[" + def_val + "]";
		}
		if (attr.getAttType().equals("Image"))
		{
			def_val = "[[" + def_val + "]]";
		}
		return def_val;
	}

	/**
	 * Python Default Value utility
	 * @param type Type
	 * @return string representing the default value for the attribute
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
		if (type instanceof StringType)				return "\"\"";
		if (type instanceof CharArrayType)			return "[0]";
		if (type instanceof ShortArrayType)			return "[0]";
		if (type instanceof IntArrayType)			return "[0]";
		if (type instanceof FloatArrayType)			return "[0.0]";
		if (type instanceof DoubleArrayType)		return "[0.0]";
		if (type instanceof UShortArrayType)		return "[0]";
		if (type instanceof UIntArrayType)			return "[0]";
		if (type instanceof StringArrayType)		return "[\"\"]";
		if (type instanceof LongStringArrayType)	return "[[0], [\"\"]]";
		if (type instanceof DoubleStringArrayType)	return "[[0.0], [\"\"]]";
		if (type instanceof StateType)				return "PyTango.DevState.UNKNOWN";
		if (type instanceof ConstStringType)		return "\"\"";
		if (type instanceof BooleanArrayType)		return "[False]";
		if (type instanceof UCharType)				return "0";
		if (type instanceof LongType)				return "0";
		if (type instanceof ULongType)				return "0";
		if (type instanceof LongArrayType)			return "[0]";
		if (type instanceof ULongArrayType)			return "[0]";
		if (type instanceof DevIntType)				return "0";
		if (type instanceof EncodedType)			return "\"\", \"\"";
		return "''";
	}
	
	/**
	 * Python Default Value utility
	 * @param type Type
	 * @return string representing the default value for the attribute
	 */
	public static String defaultValueTestHL (Type type) {
		if (type instanceof VoidType)				return "";
		if (type instanceof BooleanType)			return "False";
		if (type instanceof ShortType)				return "0";
		if (type instanceof IntType)				return "0";
		if (type instanceof FloatType)				return "0.0";
		if (type instanceof DoubleType)				return "0.0";
		if (type instanceof UShortType)				return "0";
		if (type instanceof UIntType)				return "0";
		if (type instanceof StringType)				return "\"\"";
		if (type instanceof CharArrayType)			return "[0]";
		if (type instanceof ShortArrayType)			return "[0]";
		if (type instanceof IntArrayType)			return "[0]";
		if (type instanceof FloatArrayType)			return "[0.0]";
		if (type instanceof DoubleArrayType)		return "[0.0]";
		if (type instanceof UShortArrayType)		return "[0]";
		if (type instanceof UIntArrayType)			return "[0]";
		if (type instanceof StringArrayType)		return "[\"\"]";
		if (type instanceof LongStringArrayType)	return "[[0], [\"\"]]";
		if (type instanceof DoubleStringArrayType)	return "[[0.0], [\"\"]]";
		if (type instanceof StateType)				return "DevState.UNKNOWN";
		if (type instanceof ConstStringType)		return "\"\"";
		if (type instanceof BooleanArrayType)		return "[False]";
		if (type instanceof UCharType)				return "0";
		if (type instanceof LongType)				return "0";
		if (type instanceof ULongType)				return "0";
		if (type instanceof LongArrayType)			return "[0]";
		if (type instanceof ULongArrayType)			return "[0]";
		if (type instanceof DevIntType)				return "0";
		if (type instanceof EncodedType)			return "\"\", \"\"";
		if (type instanceof EnumType)				return "0";
		return "''";
	}
	

	/**
	 * Python Default Value utility
	 * @param type Type
	 * @return string representing the default value for the attribute
	 */
	public static String defaultValueReturn (Type type) {
		if (type instanceof VoidType)				return "pass";
		if (type instanceof BooleanType)			return "return False";
		if (type instanceof ShortType)				return "return 0";
		if (type instanceof IntType)				return "return 0";
		if (type instanceof FloatType)				return "return 0.0";
		if (type instanceof DoubleType)				return "return 0.0";
		if (type instanceof UShortType)				return "return 0";
		if (type instanceof UIntType)				return "return 0";
		if (type instanceof StringType)				return "return \"\"";
		if (type instanceof CharArrayType)			return "return [0]";
		if (type instanceof ShortArrayType)			return "return [0]";
		if (type instanceof IntArrayType)			return "return [0]";
		if (type instanceof FloatArrayType)			return "return [0.0]";
		if (type instanceof DoubleArrayType)		return "return [0.0]";
		if (type instanceof UShortArrayType)		return "return [0]";
		if (type instanceof UIntArrayType)			return "return [0]";
		if (type instanceof StringArrayType)		return "return [\"\"]";
		if (type instanceof LongStringArrayType)	return "return [[0], [\"\"]]";
		if (type instanceof DoubleStringArrayType)	return "return [[0.0], [\"\"]]";
		if (type instanceof StateType)				return "return PyTango.DevState.UNKNOWN";
		if (type instanceof ConstStringType)		return "return \"\"";
		if (type instanceof BooleanArrayType)		return "return [False]";
		if (type instanceof UCharType)				return "return 0";
		if (type instanceof LongType)				return "return 0";
		if (type instanceof ULongType)				return "return 0";
		if (type instanceof LongArrayType)			return "return [0]";
		if (type instanceof ULongArrayType)			return "return [0]";
		if (type instanceof DevIntType)				return "return 0";
		if (type instanceof EncodedType)			return "return \"\", \"\"";
		return "''";
	}
	
	/**
	 * Python Default Value utility
	 * @param type Type
	 * @return string representing the default value for the attribute
	 */
	public static String defaultValueReturnHL (Type type) {
		if (type instanceof VoidType)				return "pass";
		if (type instanceof BooleanType)			return "return False";
		if (type instanceof ShortType)				return "return 0";
		if (type instanceof IntType)				return "return 0";
		if (type instanceof FloatType)				return "return 0.0";
		if (type instanceof DoubleType)				return "return 0.0";
		if (type instanceof UShortType)				return "return 0";
		if (type instanceof UIntType)				return "return 0";
		if (type instanceof StringType)				return "return \"\"";
		if (type instanceof CharArrayType)			return "return [0]";
		if (type instanceof ShortArrayType)			return "return [0]";
		if (type instanceof IntArrayType)			return "return [0]";
		if (type instanceof FloatArrayType)			return "return [0.0]";
		if (type instanceof DoubleArrayType)		return "return [0.0]";
		if (type instanceof UShortArrayType)		return "return [0]";
		if (type instanceof UIntArrayType)			return "return [0]";
		if (type instanceof StringArrayType)		return "return [\"\"]";
		if (type instanceof LongStringArrayType)	return "return [[0], [\"\"]]";
		if (type instanceof DoubleStringArrayType)	return "return [[0.0], [\"\"]]";
		if (type instanceof StateType)				return "return DevState.UNKNOWN";
		if (type instanceof ConstStringType)		return "return \"\"";
		if (type instanceof BooleanArrayType)		return "return [False]";
		if (type instanceof UCharType)				return "return 0";
		if (type instanceof LongType)				return "return 0";
		if (type instanceof ULongType)				return "return 0";
		if (type instanceof LongArrayType)			return "return [0]";
		if (type instanceof ULongArrayType)			return "return [0]";
		if (type instanceof DevIntType)				return "return 0";
		if (type instanceof EncodedType)			return "return \"\", \"\"";
		if (type instanceof EnumType)				return "return 0";
		return "''";
	}
	/**
	 * Python Default Value Dim utility
	 * @param attr Attribute
	 * @return string representing the default value for the attribute with the dimension
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
	 * Python Attribute utility
	 * @param propertyName the name of the attribute property
	 * @param strValue value to be inserted
	 * @return resulting string
	 */
	public String setAttrProperty(String propertyName, String strValue)
	{
		if (propertyName.equals("Display level"))
		{
			if (strValue != null && (strValue.equals("EXPERT") || strValue.equals("PyTango.DispLevel.EXPERT")))
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
				if (strValue != null && !strValue.equals("0"))
				{
					return "    \'" + propertyName + "\': \"" + strValue + "\",";
				}
				else
					return "";
			}
			else
			{
				if (strValue != null && strValue.length() > 0)
					return "    \'" + propertyName + "\': \"" + strValue + "\",";
				else
					return "";
			}
		}
	}

	/**
	 * PythonHL Attribute utility
	 * @param propertyName the name of the attribute property
	 * @param strValue value to be inserted
	 * @param isString indicates if the value is a string
	 * @return resulting string
	 */
	public String setAttrPropertyHL(String propertyName, String strValue, Boolean isString)
	{
		if (propertyName.equals("display_level"))
		{
			if (strValue != null && ( strValue.equals("EXPERT") || strValue.equals("PyTango.DispLevel.EXPERT")))
			{
				return "display_level=DispLevel.EXPERT,";
			}
			else
				return "";
		}
		else
		{
			if (propertyName.equals("polling_period"))
			{
				if (strValue.equals("0"))
				{
					return "";	
				}
			}
            if (strValue != null && strValue.length() > 0)
            	if(isString)
                    return propertyName + "=\"" + strValue + "\",";
            	else
            		    if (strValue.contains( "true"))
            		        return propertyName + "=" + "True" + ",";
            		    else
                            return propertyName + "=" + strValue + ",";
            else
                return "";
		}
	}
	
	/**
	 * PythonHL Pipe utility
	 * @param propertyName the name of the pipe property
	 * @param strValue value to be inserted
	 * @param isString indicates if the value is a string
	 * @return resulting string
	 */
	public String setPipePropertyHL(String propertyName, String strValue, Boolean isString)
	{
		if (propertyName.equals("display_level"))
		{
			if (strValue != null && ( strValue.equals("EXPERT") || strValue.equals("PyTango.DispLevel.EXPERT")))
			{
				return "display_level=DispLevel.EXPERT,";
			}
			else
				return "";
		}
		else
		{
            if (strValue != null && strValue.length() > 0)
            	if(isString)
                    return propertyName + "=\"" + strValue + "\",";
            	else
                    return propertyName + "=" + strValue + ",";
            else
                return "";
		}
	}

	/**
	 * Python String utility
	 * @param strValue value to be quoted
	 * @return resulting string
	 */
	public String getArgDescription(String strValue)
	{
		if (strValue != null && strValue.length() > 0)
		{
			return "" + strValue + "";
		}
		else
			return "none";
	}

	/**
	 * Python utility
	 * @param my_type type to test
	 * @return true if the type is void
	 */
	public boolean isVoidType(Type my_type){
		if (my_type instanceof VoidType)
	    {
    		return true;
    	}
    	else
    		return false;
	}
	
	/**
	 * Python utility
	 * @param my_type type to test
	 * @return true if the type is void
	 */
	public boolean hasCommandArg(Command cmd){
		if (cmd.getArgin().getType() instanceof VoidType)
	    {
			if (cmd.getArgout().getType() instanceof VoidType)
		    {
				if (cmd.getDisplayLevel() == "EXPERT") 
				{
					return true;
				}
				else
				{
					if(cmd.getPolledPeriod() != "0")
					{
						return true;
					}
					else
					{
						return false;
					}
				}
	    	}
			else
			{
				return true;
			}
    	}
		else
		{
			return true;
		}
	}

	/**
	 * Python Pogo Device Class inherited class utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
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

	/**
	 * PythonHL Pogo Device Class inherited class utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
	public String inheritedPythonClassNameHL(PogoDeviceClass cls) {
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return "Device";
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return "Device";
			else
				return className;
		}
	}

	/**
	 * Python Pogo Device Class inherited constructor utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
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
	/**
	 * Python Pogo Device Class inherited constructor utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
	public String constructorHL(PogoDeviceClass cls) {
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return "    def init_device(self):\n        Device.init_device(self)";
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return "    def init_device(self):\n        Device.init_device(self)";
			else
				return "    def init_device(self):\n        " + className + ".init_device(self)";
		}
	}

	/**
	 * Python Pogo Device Class inherited additional import utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
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
	
	/**
	 * Python Pogo Device Class inherited additional import utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
	public String inheritedAdditionalImportHL(PogoDeviceClass cls) {
		EList<Inheritance> inheritances = cls.getDescription().getInheritances();
		if (inheritances==null || inheritances.size()==0)
			return "";
		else {
			int	last = inheritances.size()-1;
			String	className = inheritances.get(last).getClassname();
			if (isDefaultDeviceImpl(className))
				return "";
			else
				return "from " + className + " import " + className + "\n";
		}
	}

	/**
	 * Python Pogo Device Class inherited class utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
	private boolean isDefaultDeviceImpl(String className) {
		
		return (className.startsWith("Device_") && className.endsWith("Impl"));
	}

	/**
	 * Python Pogo Device Class inherited attributes utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
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

	/**
	 * Python Pogo Device Class inherited commands utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
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

	/**
	 * Python Pogo Device Class inherited class property utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
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

	/**
	 * Python Pogo Device Class inherited device property utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
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

	/**
	 * Python Pogo Device Class inherited device class utility
	 * @param cls PogoDeviceClass
	 * @return resulting string
	 */
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

	/**
	 * Python Attribute set utility
	 * @param attr Attribute
	 * @return resulting string
	 */
	public String setAttrVal(Attribute attr){
		return "attr.set_value(self.attr_" + attr.getName() + "_read)";
	}
}
