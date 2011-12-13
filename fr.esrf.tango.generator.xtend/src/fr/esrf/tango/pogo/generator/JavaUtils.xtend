package fr.esrf.tango.pogo.generator

import fr.esrf.tango.pogo.pogoDsl.*

class JavaUtils {
	def javaDevicePackage (PogoDeviceClass cls) {
		cls.name.toLowerCase
	}
	
	def fqJavaDeviceClassName( PogoDeviceClass cls ){
		cls.javaDevicePackage+"."+cls.name
	} 
	
	def javaDeviceClassFileName( PogoDeviceClass cls ) {
		cls.fqJavaDeviceClassName.replaceAll("\\.","/")+".java";
	} 
	
	
	def vcsEscaped (String s) {
		"$"+s+"$";
	}
	
	def javaPropType (Property prop) {
		switch (prop.type) {
			BooleanType      : "boolean"
			ShortType        : "short"
			IntType      	 : "int"     
			UShortType       : "short"   
			UIntType         : "int"     
			FloatType        : "float"   
			DoubleType       : "double"  
			StringType       : "String"  
			ShortVectorType  : "short[]" 
			IntVectorType    : "int[]"   
			FloatVectorType  : "float[]" 
			DoubleVectorType : "double[]"
			StringVectorType : "String[]"
			default: null
		}
	}
	def javaType (Type type) {
		switch (type) {
			VoidType:				"void"
			BooleanType:			"boolean"
			ShortType:				"short"
			IntType:				"long"
			FloatType:				"float"
			DoubleType:				"double"
			UShortType:				"short"
			UIntType:				"long"
			StringType:				"string"
			CharArrayType:			"char[]"
			ShortArrayType:			"short[]"
			IntArrayType:			"long[]"
			FloatArrayType:			"float[]"
			DoubleArrayType:		"double[]"
			UShortArrayType:		"short[]"
			UIntArrayType:			"int[]"
			StringArrayType:		"string[]"
			LongStringArrayType:	"DevVarLongStringArray"
			DoubleStringArrayType:	"DevVarDoubleStringArray"
			StateType:				"DevState"
			ConstStringType:		"final string"
			BooleanArrayType:		"boolean[]"
			UCharType:				"chat[]"
			LongType:				"long"
			ULongType:				"long"
			LongArrayType:			"long[]"
			ULongArrayType:			"long[]"
			DevIntType:				"int"
			EncodedType:			"DevEncoded"
			default: null
		}
	}
}
