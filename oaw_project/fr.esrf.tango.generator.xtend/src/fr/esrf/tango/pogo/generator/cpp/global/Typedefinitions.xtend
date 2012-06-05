package fr.esrf.tango.pogo.generator.cpp.global

import fr.esrf.tango.pogo.pogoDsl.BooleanArrayType
import fr.esrf.tango.pogo.pogoDsl.BooleanType
import fr.esrf.tango.pogo.pogoDsl.CharArrayType
import fr.esrf.tango.pogo.pogoDsl.ConstStringType
import fr.esrf.tango.pogo.pogoDsl.DevIntType
import fr.esrf.tango.pogo.pogoDsl.DoubleArrayType
import fr.esrf.tango.pogo.pogoDsl.DoubleStringArrayType
import fr.esrf.tango.pogo.pogoDsl.DoubleType
import fr.esrf.tango.pogo.pogoDsl.DoubleVectorType
import fr.esrf.tango.pogo.pogoDsl.EncodedType
import fr.esrf.tango.pogo.pogoDsl.FloatArrayType
import fr.esrf.tango.pogo.pogoDsl.FloatType
import fr.esrf.tango.pogo.pogoDsl.FloatVectorType
import fr.esrf.tango.pogo.pogoDsl.IntArrayType
import fr.esrf.tango.pogo.pogoDsl.IntType
import fr.esrf.tango.pogo.pogoDsl.IntVectorType
import fr.esrf.tango.pogo.pogoDsl.LongArrayType
import fr.esrf.tango.pogo.pogoDsl.LongStringArrayType
import fr.esrf.tango.pogo.pogoDsl.LongType
import fr.esrf.tango.pogo.pogoDsl.PropType
import fr.esrf.tango.pogo.pogoDsl.ShortArrayType
import fr.esrf.tango.pogo.pogoDsl.ShortType
import fr.esrf.tango.pogo.pogoDsl.ShortVectorType
import fr.esrf.tango.pogo.pogoDsl.StateType
import fr.esrf.tango.pogo.pogoDsl.StringArrayType
import fr.esrf.tango.pogo.pogoDsl.StringType
import fr.esrf.tango.pogo.pogoDsl.StringVectorType
import fr.esrf.tango.pogo.pogoDsl.Type
import fr.esrf.tango.pogo.pogoDsl.UCharType
import fr.esrf.tango.pogo.pogoDsl.UIntArrayType
import fr.esrf.tango.pogo.pogoDsl.UIntType
import fr.esrf.tango.pogo.pogoDsl.ULongArrayType
import fr.esrf.tango.pogo.pogoDsl.ULongType
import fr.esrf.tango.pogo.pogoDsl.UShortArrayType
import fr.esrf.tango.pogo.pogoDsl.UShortType
import fr.esrf.tango.pogo.pogoDsl.VoidType


class Typedefinitions {
	/**
	 * Property Type utilities
	 */
	def cppPropType (PropType propType) {
		switch (propType) {
			BooleanType:	 	"Tango::DevBoolean"
			ShortType: 			"Tango::DevShort"
			IntType:        	"Tango::DevLong"
			UShortType:     	"Tango::DevUShort"
			UIntType:       	"Tango::DevULong"
			FloatType:      	"Tango::DevFloat"
			DoubleType:     	"Tango::DevDouble"
			StringType:     	"string"
			ShortVectorType:    "vector<Tango::DevShort>"
			IntVectorType:     	"vector<Tango::DevLong>"
			FloatVectorType:    "vector<Tango::DevFloat>"
			DoubleVectorType:   "vector<Tango::DevDouble>"
			StringVectorType:   "vector<string>"
			default: null
		}
	}

	/**
	 * Type utilities
	 */
	def cppType (Type type) {
		switch (type) {
			VoidType:				"void"
			BooleanType:			"Tango::DevBoolean"
			ShortType:				"Tango::DevShort"
			IntType:				"Tango::DevLong"
			FloatType:				"Tango::DevFloat"
			DoubleType:				"Tango::DevDouble"
			UShortType:				"Tango::DevUShort"
			UIntType:				"Tango::DevULong"
			StringType:				"Tango::DevString"
			CharArrayType:			"Tango::DevVarCharArray"
			ShortArrayType:			"Tango::DevVarShortArray"
			IntArrayType:			"Tango::DevVarLongArray"
			FloatArrayType:			"Tango::DevVarFloatArray"
			DoubleArrayType:		"Tango::DevVarDoubleArray"
			UShortArrayType:		"Tango::DevVarUShortArray"
			UIntArrayType:			"Tango::DevVarULongArray"
			StringArrayType:		"Tango::DevVarStringArray"
			LongStringArrayType:	"Tango::DevVarLongStringArray"
			DoubleStringArrayType:	"Tango::DevVarDoubleStringArray"
			StateType:				"Tango::DevState"
			ConstStringType:		"Tango::ConstDevString"
			BooleanArrayType:		"Tango::DevVarBooleanArray"
			UCharType:				"Tango::DevUChar"
			LongType:				"Tango::DevLong64"
			ULongType:				"Tango::DevULong64"
			LongArrayType:			"Tango::DevVarLong64Array"
			ULongArrayType:			"Tango::DevVarULong64Array"
			DevIntType:				"Tango::DevInt"
			EncodedType:			"Tango::DevEncoded"
		}
	}

	/**
	 * Type enum
	 */
	def cppTypeEnum (Type type) {
		switch (type) {
			VoidType:				"Tango::DEV_VOID"
			BooleanType:			"Tango::DEV_BOOLEAN"
			ShortType:				"Tango::DEV_SHORT"
			IntType:				"Tango::DEV_LONG"
			FloatType:				"Tango::DEV_FLOAT"
			DoubleType:				"Tango::DEV_DOUBLE"
			UShortType:				"Tango::DEV_USHORT"
			UIntType:				"Tango::DEV_ULONG"
			StringType:				"Tango::DEV_STRING"
			CharArrayType:			"Tango::DEVVAR_CHARARRAY"
			ShortArrayType:			"Tango::DEVVAR_SHORTARRAY"
			IntArrayType:			"Tango::DEVVAR_LONGARRAY"
			FloatArrayType:			"Tango::DEVVAR_FLOATARRAY"
			DoubleArrayType:		"Tango::DEVVAR_DOUBLEARRAY"
			UShortArrayType:		"Tango::DEVVAR_USHORTARRAY"
			UIntArrayType:			"Tango::DEVVAR_ULONGARRAY"
			StringArrayType:		"Tango::DEVVAR_STRINGARRAY"
			LongStringArrayType:	"Tango::DEVVAR_LONGSTRINGARRAY"
			DoubleStringArrayType:	"Tango::DEVVAR_DOUBLESTRINGARRAY"
			StateType:				"Tango::DEV_STATE"
			ConstStringType:		"Tango::CONST_DEV_STRING"
			BooleanArrayType:		"Tango::DEVVAR_BOOLEANARRAY"
			UCharType:				"Tango::DEV_UCHAR"
			LongType:				"Tango::DEV_LONG64"
			ULongType:				"Tango::DEV_ULONG64"
			LongArrayType:			"Tango::DEVVAR_LONG64ARRAY"
			ULongArrayType:			"Tango::DEVVAR_ULONG64ARRAY"
			DevIntType:				"Tango::DEV_INT"
			EncodedType:			"Tango::DEV_ENCODED"
		}
	}

}