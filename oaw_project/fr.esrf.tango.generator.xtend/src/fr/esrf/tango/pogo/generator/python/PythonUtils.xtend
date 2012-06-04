package fr.esrf.tango.pogo.generator.python

import fr.esrf.tango.pogo.pogoDsl.*
import org.eclipse.emf.ecore.resource.Resource

class PythonUtils {
	def pythonDevicePackage (PogoDeviceClass cls) {
		cls.name.toLowerCase
	}
	
	def fqJavaDeviceClassName( PogoDeviceClass cls ){
		cls.pythonDevicePackage+"."+cls.name
	} 
	
	def pythonDeviceClassFileName( PogoDeviceClass cls ) {
		cls.fqJavaDeviceClassName.replaceAll("\\.","/")+".py";
	} 
	def pythonFileName( Resource resource ) {
		resource.URI.lastSegment.replaceFirst(".xmi","py")
	} 
	
	
	def vcsEscaped (String s) {
		"$"+s+"$";
	}
	
	def pythonPropType (Property prop) {
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
	def pythonType (Type type) {
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
