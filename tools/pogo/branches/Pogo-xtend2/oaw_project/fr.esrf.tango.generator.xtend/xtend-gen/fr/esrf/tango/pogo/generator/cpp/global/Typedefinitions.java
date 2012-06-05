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

@SuppressWarnings("all")
public class Typedefinitions {
  /**
   * Property Type utilities
   */
  public String cppPropType(final PropType propType) {
    String _switchResult = null;
    boolean matched = false;
    if (!matched) {
      if (propType instanceof BooleanType) {
        final BooleanType _booleanType = (BooleanType)propType;
        matched=true;
        _switchResult = "Tango::DevBoolean";
      }
    }
    if (!matched) {
      if (propType instanceof ShortType) {
        final ShortType _shortType = (ShortType)propType;
        matched=true;
        _switchResult = "Tango::DevShort";
      }
    }
    if (!matched) {
      if (propType instanceof IntType) {
        final IntType _intType = (IntType)propType;
        matched=true;
        _switchResult = "Tango::DevLong";
      }
    }
    if (!matched) {
      if (propType instanceof UShortType) {
        final UShortType _uShortType = (UShortType)propType;
        matched=true;
        _switchResult = "Tango::DevUShort";
      }
    }
    if (!matched) {
      if (propType instanceof UIntType) {
        final UIntType _uIntType = (UIntType)propType;
        matched=true;
        _switchResult = "Tango::DevULong";
      }
    }
    if (!matched) {
      if (propType instanceof FloatType) {
        final FloatType _floatType = (FloatType)propType;
        matched=true;
        _switchResult = "Tango::DevFloat";
      }
    }
    if (!matched) {
      if (propType instanceof DoubleType) {
        final DoubleType _doubleType = (DoubleType)propType;
        matched=true;
        _switchResult = "Tango::DevDouble";
      }
    }
    if (!matched) {
      if (propType instanceof StringType) {
        final StringType _stringType = (StringType)propType;
        matched=true;
        _switchResult = "string";
      }
    }
    if (!matched) {
      if (propType instanceof ShortVectorType) {
        final ShortVectorType _shortVectorType = (ShortVectorType)propType;
        matched=true;
        _switchResult = "vector<Tango::DevShort>";
      }
    }
    if (!matched) {
      if (propType instanceof IntVectorType) {
        final IntVectorType _intVectorType = (IntVectorType)propType;
        matched=true;
        _switchResult = "vector<Tango::DevLong>";
      }
    }
    if (!matched) {
      if (propType instanceof FloatVectorType) {
        final FloatVectorType _floatVectorType = (FloatVectorType)propType;
        matched=true;
        _switchResult = "vector<Tango::DevFloat>";
      }
    }
    if (!matched) {
      if (propType instanceof DoubleVectorType) {
        final DoubleVectorType _doubleVectorType = (DoubleVectorType)propType;
        matched=true;
        _switchResult = "vector<Tango::DevDouble>";
      }
    }
    if (!matched) {
      if (propType instanceof StringVectorType) {
        final StringVectorType _stringVectorType = (StringVectorType)propType;
        matched=true;
        _switchResult = "vector<string>";
      }
    }
    if (!matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  /**
   * Type utilities
   */
  public String cppType(final Type type) {
    String _switchResult = null;
    boolean matched = false;
    if (!matched) {
      if (type instanceof VoidType) {
        final VoidType _voidType = (VoidType)type;
        matched=true;
        _switchResult = "void";
      }
    }
    if (!matched) {
      if (type instanceof BooleanType) {
        final BooleanType _booleanType = (BooleanType)type;
        matched=true;
        _switchResult = "Tango::DevBoolean";
      }
    }
    if (!matched) {
      if (type instanceof ShortType) {
        final ShortType _shortType = (ShortType)type;
        matched=true;
        _switchResult = "Tango::DevShort";
      }
    }
    if (!matched) {
      if (type instanceof IntType) {
        final IntType _intType = (IntType)type;
        matched=true;
        _switchResult = "Tango::DevLong";
      }
    }
    if (!matched) {
      if (type instanceof FloatType) {
        final FloatType _floatType = (FloatType)type;
        matched=true;
        _switchResult = "Tango::DevFloat";
      }
    }
    if (!matched) {
      if (type instanceof DoubleType) {
        final DoubleType _doubleType = (DoubleType)type;
        matched=true;
        _switchResult = "Tango::DevDouble";
      }
    }
    if (!matched) {
      if (type instanceof UShortType) {
        final UShortType _uShortType = (UShortType)type;
        matched=true;
        _switchResult = "Tango::DevUShort";
      }
    }
    if (!matched) {
      if (type instanceof UIntType) {
        final UIntType _uIntType = (UIntType)type;
        matched=true;
        _switchResult = "Tango::DevULong";
      }
    }
    if (!matched) {
      if (type instanceof StringType) {
        final StringType _stringType = (StringType)type;
        matched=true;
        _switchResult = "Tango::DevString";
      }
    }
    if (!matched) {
      if (type instanceof CharArrayType) {
        final CharArrayType _charArrayType = (CharArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarCharArray";
      }
    }
    if (!matched) {
      if (type instanceof ShortArrayType) {
        final ShortArrayType _shortArrayType = (ShortArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarShortArray";
      }
    }
    if (!matched) {
      if (type instanceof IntArrayType) {
        final IntArrayType _intArrayType = (IntArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarLongArray";
      }
    }
    if (!matched) {
      if (type instanceof FloatArrayType) {
        final FloatArrayType _floatArrayType = (FloatArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarFloatArray";
      }
    }
    if (!matched) {
      if (type instanceof DoubleArrayType) {
        final DoubleArrayType _doubleArrayType = (DoubleArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarDoubleArray";
      }
    }
    if (!matched) {
      if (type instanceof UShortArrayType) {
        final UShortArrayType _uShortArrayType = (UShortArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarUShortArray";
      }
    }
    if (!matched) {
      if (type instanceof UIntArrayType) {
        final UIntArrayType _uIntArrayType = (UIntArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarULongArray";
      }
    }
    if (!matched) {
      if (type instanceof StringArrayType) {
        final StringArrayType _stringArrayType = (StringArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarStringArray";
      }
    }
    if (!matched) {
      if (type instanceof LongStringArrayType) {
        final LongStringArrayType _longStringArrayType = (LongStringArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarLongStringArray";
      }
    }
    if (!matched) {
      if (type instanceof DoubleStringArrayType) {
        final DoubleStringArrayType _doubleStringArrayType = (DoubleStringArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarDoubleStringArray";
      }
    }
    if (!matched) {
      if (type instanceof StateType) {
        final StateType _stateType = (StateType)type;
        matched=true;
        _switchResult = "Tango::DevState";
      }
    }
    if (!matched) {
      if (type instanceof ConstStringType) {
        final ConstStringType _constStringType = (ConstStringType)type;
        matched=true;
        _switchResult = "Tango::ConstDevString";
      }
    }
    if (!matched) {
      if (type instanceof BooleanArrayType) {
        final BooleanArrayType _booleanArrayType = (BooleanArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarBooleanArray";
      }
    }
    if (!matched) {
      if (type instanceof UCharType) {
        final UCharType _uCharType = (UCharType)type;
        matched=true;
        _switchResult = "Tango::DevUChar";
      }
    }
    if (!matched) {
      if (type instanceof LongType) {
        final LongType _longType = (LongType)type;
        matched=true;
        _switchResult = "Tango::DevLong64";
      }
    }
    if (!matched) {
      if (type instanceof ULongType) {
        final ULongType _uLongType = (ULongType)type;
        matched=true;
        _switchResult = "Tango::DevULong64";
      }
    }
    if (!matched) {
      if (type instanceof LongArrayType) {
        final LongArrayType _longArrayType = (LongArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarLong64Array";
      }
    }
    if (!matched) {
      if (type instanceof ULongArrayType) {
        final ULongArrayType _uLongArrayType = (ULongArrayType)type;
        matched=true;
        _switchResult = "Tango::DevVarULong64Array";
      }
    }
    if (!matched) {
      if (type instanceof DevIntType) {
        final DevIntType _devIntType = (DevIntType)type;
        matched=true;
        _switchResult = "Tango::DevInt";
      }
    }
    if (!matched) {
      if (type instanceof EncodedType) {
        final EncodedType _encodedType = (EncodedType)type;
        matched=true;
        _switchResult = "Tango::DevEncoded";
      }
    }
    return _switchResult;
  }
  
  /**
   * Type enum
   */
  public String cppTypeEnum(final Type type) {
    String _switchResult = null;
    boolean matched = false;
    if (!matched) {
      if (type instanceof VoidType) {
        final VoidType _voidType = (VoidType)type;
        matched=true;
        _switchResult = "Tango::DEV_VOID";
      }
    }
    if (!matched) {
      if (type instanceof BooleanType) {
        final BooleanType _booleanType = (BooleanType)type;
        matched=true;
        _switchResult = "Tango::DEV_BOOLEAN";
      }
    }
    if (!matched) {
      if (type instanceof ShortType) {
        final ShortType _shortType = (ShortType)type;
        matched=true;
        _switchResult = "Tango::DEV_SHORT";
      }
    }
    if (!matched) {
      if (type instanceof IntType) {
        final IntType _intType = (IntType)type;
        matched=true;
        _switchResult = "Tango::DEV_LONG";
      }
    }
    if (!matched) {
      if (type instanceof FloatType) {
        final FloatType _floatType = (FloatType)type;
        matched=true;
        _switchResult = "Tango::DEV_FLOAT";
      }
    }
    if (!matched) {
      if (type instanceof DoubleType) {
        final DoubleType _doubleType = (DoubleType)type;
        matched=true;
        _switchResult = "Tango::DEV_DOUBLE";
      }
    }
    if (!matched) {
      if (type instanceof UShortType) {
        final UShortType _uShortType = (UShortType)type;
        matched=true;
        _switchResult = "Tango::DEV_USHORT";
      }
    }
    if (!matched) {
      if (type instanceof UIntType) {
        final UIntType _uIntType = (UIntType)type;
        matched=true;
        _switchResult = "Tango::DEV_ULONG";
      }
    }
    if (!matched) {
      if (type instanceof StringType) {
        final StringType _stringType = (StringType)type;
        matched=true;
        _switchResult = "Tango::DEV_STRING";
      }
    }
    if (!matched) {
      if (type instanceof CharArrayType) {
        final CharArrayType _charArrayType = (CharArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_CHARARRAY";
      }
    }
    if (!matched) {
      if (type instanceof ShortArrayType) {
        final ShortArrayType _shortArrayType = (ShortArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_SHORTARRAY";
      }
    }
    if (!matched) {
      if (type instanceof IntArrayType) {
        final IntArrayType _intArrayType = (IntArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_LONGARRAY";
      }
    }
    if (!matched) {
      if (type instanceof FloatArrayType) {
        final FloatArrayType _floatArrayType = (FloatArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_FLOATARRAY";
      }
    }
    if (!matched) {
      if (type instanceof DoubleArrayType) {
        final DoubleArrayType _doubleArrayType = (DoubleArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_DOUBLEARRAY";
      }
    }
    if (!matched) {
      if (type instanceof UShortArrayType) {
        final UShortArrayType _uShortArrayType = (UShortArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_USHORTARRAY";
      }
    }
    if (!matched) {
      if (type instanceof UIntArrayType) {
        final UIntArrayType _uIntArrayType = (UIntArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_ULONGARRAY";
      }
    }
    if (!matched) {
      if (type instanceof StringArrayType) {
        final StringArrayType _stringArrayType = (StringArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_STRINGARRAY";
      }
    }
    if (!matched) {
      if (type instanceof LongStringArrayType) {
        final LongStringArrayType _longStringArrayType = (LongStringArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_LONGSTRINGARRAY";
      }
    }
    if (!matched) {
      if (type instanceof DoubleStringArrayType) {
        final DoubleStringArrayType _doubleStringArrayType = (DoubleStringArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_DOUBLESTRINGARRAY";
      }
    }
    if (!matched) {
      if (type instanceof StateType) {
        final StateType _stateType = (StateType)type;
        matched=true;
        _switchResult = "Tango::DEV_STATE";
      }
    }
    if (!matched) {
      if (type instanceof ConstStringType) {
        final ConstStringType _constStringType = (ConstStringType)type;
        matched=true;
        _switchResult = "Tango::CONST_DEV_STRING";
      }
    }
    if (!matched) {
      if (type instanceof BooleanArrayType) {
        final BooleanArrayType _booleanArrayType = (BooleanArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_BOOLEANARRAY";
      }
    }
    if (!matched) {
      if (type instanceof UCharType) {
        final UCharType _uCharType = (UCharType)type;
        matched=true;
        _switchResult = "Tango::DEV_UCHAR";
      }
    }
    if (!matched) {
      if (type instanceof LongType) {
        final LongType _longType = (LongType)type;
        matched=true;
        _switchResult = "Tango::DEV_LONG64";
      }
    }
    if (!matched) {
      if (type instanceof ULongType) {
        final ULongType _uLongType = (ULongType)type;
        matched=true;
        _switchResult = "Tango::DEV_ULONG64";
      }
    }
    if (!matched) {
      if (type instanceof LongArrayType) {
        final LongArrayType _longArrayType = (LongArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_LONG64ARRAY";
      }
    }
    if (!matched) {
      if (type instanceof ULongArrayType) {
        final ULongArrayType _uLongArrayType = (ULongArrayType)type;
        matched=true;
        _switchResult = "Tango::DEVVAR_ULONG64ARRAY";
      }
    }
    if (!matched) {
      if (type instanceof DevIntType) {
        final DevIntType _devIntType = (DevIntType)type;
        matched=true;
        _switchResult = "Tango::DEV_INT";
      }
    }
    if (!matched) {
      if (type instanceof EncodedType) {
        final EncodedType _encodedType = (EncodedType)type;
        matched=true;
        _switchResult = "Tango::DEV_ENCODED";
      }
    }
    return _switchResult;
  }
}
