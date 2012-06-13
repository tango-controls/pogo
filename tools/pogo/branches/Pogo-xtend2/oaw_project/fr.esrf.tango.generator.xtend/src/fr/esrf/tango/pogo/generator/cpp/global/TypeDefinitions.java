package fr.esrf.tango.pogo.generator.cpp.global;

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
import fr.esrf.tango.pogo.pogoDsl.IntArrayType;
import fr.esrf.tango.pogo.pogoDsl.IntType;
import fr.esrf.tango.pogo.pogoDsl.IntVectorType;
import fr.esrf.tango.pogo.pogoDsl.LongArrayType;
import fr.esrf.tango.pogo.pogoDsl.LongStringArrayType;
import fr.esrf.tango.pogo.pogoDsl.LongType;
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


public class TypeDefinitions {
	/**
	 * Property Type utilities
	 */
	public static String cppPropType (PropType propType) {
		
		if (propType instanceof BooleanType)	   return "Tango::DevBoolean";
		if (propType instanceof ShortType) 		   return "Tango::DevShort";
		if (propType instanceof IntType)           return "Tango::DevLong";
		if (propType instanceof UShortType)        return "Tango::DevUShort";
		if (propType instanceof UIntType)      	   return "Tango::DevULong";
		if (propType instanceof FloatType)         return "Tango::DevFloat";
		if (propType instanceof DoubleType)        return "Tango::DevDouble";
		if (propType instanceof StringType)        return "string";
		if (propType instanceof ShortVectorType)   return "vector<Tango::DevShort>";
		if (propType instanceof IntVectorType)     return "vector<Tango::DevLong>";
		if (propType instanceof FloatVectorType)   return "vector<Tango::DevFloat>";
		if (propType instanceof DoubleVectorType)  return "vector<Tango::DevDouble>";
		if (propType instanceof StringVectorType)  return "vector<string>";
		return "";
	}

	/**
	 * Type utilities
	 */
	public static String cppType (Type type) {
		if (type instanceof VoidType)				return "void";
		if (type instanceof BooleanType)			return "Tango::DevBoolean";
		if (type instanceof ShortType)				return "Tango::DevShort";
		if (type instanceof IntType)				return "Tango::DevLong";
		if (type instanceof FloatType)				return "Tango::DevFloat";
		if (type instanceof DoubleType)				return "Tango::DevDouble";
		if (type instanceof UShortType)				return "Tango::DevUShort";
		if (type instanceof UIntType)				return "Tango::DevULong";
		if (type instanceof StringType)				return "Tango::DevString";
		if (type instanceof CharArrayType)			return "Tango::DevVarCharArray";
		if (type instanceof ShortArrayType)			return "Tango::DevVarShortArray";
		if (type instanceof IntArrayType)			return "Tango::DevVarLongArray";
		if (type instanceof FloatArrayType)			return "Tango::DevVarFloatArray";
		if (type instanceof DoubleArrayType)		return "Tango::DevVarDoubleArray";
		if (type instanceof UShortArrayType)		return "Tango::DevVarUShortArray";
		if (type instanceof UIntArrayType)			return "Tango::DevVarULongArray";
		if (type instanceof StringArrayType)		return "Tango::DevVarStringArray";
		if (type instanceof LongStringArrayType)	return "Tango::DevVarLongStringArray";
		if (type instanceof DoubleStringArrayType)	return "Tango::DevVarDoubleStringArray";
		if (type instanceof StateType)				return "Tango::DevState";
		if (type instanceof ConstStringType)		return "Tango::ConstDevString";
		if (type instanceof BooleanArrayType)		return "Tango::DevVarBooleanArray";
		if (type instanceof UCharType)				return "Tango::DevUChar";
		if (type instanceof LongType)				return "Tango::DevLong64";
		if (type instanceof ULongType)				return "Tango::DevULong64";
		if (type instanceof LongArrayType)			return "Tango::DevVarLong64Array";
		if (type instanceof ULongArrayType)			return "Tango::DevVarULong64Array";
		if (type instanceof DevIntType)				return "Tango::DevInt";
		if (type instanceof EncodedType)			return "Tango::DevEncoded";
		return "";
	}

	/**
	 * Type enum
	 */
	public static String cppTypeEnum (Type type) {
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

}