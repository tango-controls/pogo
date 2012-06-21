package fr.esrf.tango.pogo.generator.python;


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
		if (type instanceof StateType)				return "PyTango.DevState";
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


}
