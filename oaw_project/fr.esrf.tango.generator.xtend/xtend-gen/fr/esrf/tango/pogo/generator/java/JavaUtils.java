package fr.esrf.tango.pogo.generator.java;

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
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.PropType;
import fr.esrf.tango.pogo.pogoDsl.Property;
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
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class JavaUtils {
  public String javaDevicePackage(final PogoDeviceClass cls) {
    String _name = cls.getName();
    String _lowerCase = _name.toLowerCase();
    return _lowerCase;
  }
  
  public String fqJavaDeviceClassName(final PogoDeviceClass cls) {
    String _javaDevicePackage = this.javaDevicePackage(cls);
    String _operator_plus = StringExtensions.operator_plus(_javaDevicePackage, ".");
    String _name = cls.getName();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
    return _operator_plus_1;
  }
  
  public String javaDeviceClassFileName(final PogoDeviceClass cls) {
    String _fqJavaDeviceClassName = this.fqJavaDeviceClassName(cls);
    String _replaceAll = _fqJavaDeviceClassName.replaceAll("\\.", "/");
    String _operator_plus = StringExtensions.operator_plus(_replaceAll, ".java");
    return _operator_plus;
  }
  
  public String vcsEscaped(final String s) {
    String _operator_plus = StringExtensions.operator_plus("$", s);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "$");
    return _operator_plus_1;
  }
  
  public String javaPropType(final Property prop) {
    String _switchResult = null;
    PropType _type = prop.getType();
    final PropType __valOfSwitchOver = _type;
    boolean matched = false;
    if (!matched) {
      if (__valOfSwitchOver instanceof BooleanType) {
        final BooleanType _booleanType = (BooleanType)__valOfSwitchOver;
        matched=true;
        _switchResult = "boolean";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof ShortType) {
        final ShortType _shortType = (ShortType)__valOfSwitchOver;
        matched=true;
        _switchResult = "short";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof IntType) {
        final IntType _intType = (IntType)__valOfSwitchOver;
        matched=true;
        _switchResult = "int";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof UShortType) {
        final UShortType _uShortType = (UShortType)__valOfSwitchOver;
        matched=true;
        _switchResult = "short";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof UIntType) {
        final UIntType _uIntType = (UIntType)__valOfSwitchOver;
        matched=true;
        _switchResult = "int";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof FloatType) {
        final FloatType _floatType = (FloatType)__valOfSwitchOver;
        matched=true;
        _switchResult = "float";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof DoubleType) {
        final DoubleType _doubleType = (DoubleType)__valOfSwitchOver;
        matched=true;
        _switchResult = "double";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof StringType) {
        final StringType _stringType = (StringType)__valOfSwitchOver;
        matched=true;
        _switchResult = "String";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof ShortVectorType) {
        final ShortVectorType _shortVectorType = (ShortVectorType)__valOfSwitchOver;
        matched=true;
        _switchResult = "short[]";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof IntVectorType) {
        final IntVectorType _intVectorType = (IntVectorType)__valOfSwitchOver;
        matched=true;
        _switchResult = "int[]";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof FloatVectorType) {
        final FloatVectorType _floatVectorType = (FloatVectorType)__valOfSwitchOver;
        matched=true;
        _switchResult = "float[]";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof DoubleVectorType) {
        final DoubleVectorType _doubleVectorType = (DoubleVectorType)__valOfSwitchOver;
        matched=true;
        _switchResult = "double[]";
      }
    }
    if (!matched) {
      if (__valOfSwitchOver instanceof StringVectorType) {
        final StringVectorType _stringVectorType = (StringVectorType)__valOfSwitchOver;
        matched=true;
        _switchResult = "String[]";
      }
    }
    if (!matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  public String javaType(final Type type) {
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
        _switchResult = "boolean";
      }
    }
    if (!matched) {
      if (type instanceof ShortType) {
        final ShortType _shortType = (ShortType)type;
        matched=true;
        _switchResult = "short";
      }
    }
    if (!matched) {
      if (type instanceof IntType) {
        final IntType _intType = (IntType)type;
        matched=true;
        _switchResult = "long";
      }
    }
    if (!matched) {
      if (type instanceof FloatType) {
        final FloatType _floatType = (FloatType)type;
        matched=true;
        _switchResult = "float";
      }
    }
    if (!matched) {
      if (type instanceof DoubleType) {
        final DoubleType _doubleType = (DoubleType)type;
        matched=true;
        _switchResult = "double";
      }
    }
    if (!matched) {
      if (type instanceof UShortType) {
        final UShortType _uShortType = (UShortType)type;
        matched=true;
        _switchResult = "short";
      }
    }
    if (!matched) {
      if (type instanceof UIntType) {
        final UIntType _uIntType = (UIntType)type;
        matched=true;
        _switchResult = "long";
      }
    }
    if (!matched) {
      if (type instanceof StringType) {
        final StringType _stringType = (StringType)type;
        matched=true;
        _switchResult = "string";
      }
    }
    if (!matched) {
      if (type instanceof CharArrayType) {
        final CharArrayType _charArrayType = (CharArrayType)type;
        matched=true;
        _switchResult = "char[]";
      }
    }
    if (!matched) {
      if (type instanceof ShortArrayType) {
        final ShortArrayType _shortArrayType = (ShortArrayType)type;
        matched=true;
        _switchResult = "short[]";
      }
    }
    if (!matched) {
      if (type instanceof IntArrayType) {
        final IntArrayType _intArrayType = (IntArrayType)type;
        matched=true;
        _switchResult = "long[]";
      }
    }
    if (!matched) {
      if (type instanceof FloatArrayType) {
        final FloatArrayType _floatArrayType = (FloatArrayType)type;
        matched=true;
        _switchResult = "float[]";
      }
    }
    if (!matched) {
      if (type instanceof DoubleArrayType) {
        final DoubleArrayType _doubleArrayType = (DoubleArrayType)type;
        matched=true;
        _switchResult = "double[]";
      }
    }
    if (!matched) {
      if (type instanceof UShortArrayType) {
        final UShortArrayType _uShortArrayType = (UShortArrayType)type;
        matched=true;
        _switchResult = "short[]";
      }
    }
    if (!matched) {
      if (type instanceof UIntArrayType) {
        final UIntArrayType _uIntArrayType = (UIntArrayType)type;
        matched=true;
        _switchResult = "int[]";
      }
    }
    if (!matched) {
      if (type instanceof StringArrayType) {
        final StringArrayType _stringArrayType = (StringArrayType)type;
        matched=true;
        _switchResult = "string[]";
      }
    }
    if (!matched) {
      if (type instanceof LongStringArrayType) {
        final LongStringArrayType _longStringArrayType = (LongStringArrayType)type;
        matched=true;
        _switchResult = "DevVarLongStringArray";
      }
    }
    if (!matched) {
      if (type instanceof DoubleStringArrayType) {
        final DoubleStringArrayType _doubleStringArrayType = (DoubleStringArrayType)type;
        matched=true;
        _switchResult = "DevVarDoubleStringArray";
      }
    }
    if (!matched) {
      if (type instanceof StateType) {
        final StateType _stateType = (StateType)type;
        matched=true;
        _switchResult = "DevState";
      }
    }
    if (!matched) {
      if (type instanceof ConstStringType) {
        final ConstStringType _constStringType = (ConstStringType)type;
        matched=true;
        _switchResult = "final string";
      }
    }
    if (!matched) {
      if (type instanceof BooleanArrayType) {
        final BooleanArrayType _booleanArrayType = (BooleanArrayType)type;
        matched=true;
        _switchResult = "boolean[]";
      }
    }
    if (!matched) {
      if (type instanceof UCharType) {
        final UCharType _uCharType = (UCharType)type;
        matched=true;
        _switchResult = "chat[]";
      }
    }
    if (!matched) {
      if (type instanceof LongType) {
        final LongType _longType = (LongType)type;
        matched=true;
        _switchResult = "long";
      }
    }
    if (!matched) {
      if (type instanceof ULongType) {
        final ULongType _uLongType = (ULongType)type;
        matched=true;
        _switchResult = "long";
      }
    }
    if (!matched) {
      if (type instanceof LongArrayType) {
        final LongArrayType _longArrayType = (LongArrayType)type;
        matched=true;
        _switchResult = "long[]";
      }
    }
    if (!matched) {
      if (type instanceof ULongArrayType) {
        final ULongArrayType _uLongArrayType = (ULongArrayType)type;
        matched=true;
        _switchResult = "long[]";
      }
    }
    if (!matched) {
      if (type instanceof DevIntType) {
        final DevIntType _devIntType = (DevIntType)type;
        matched=true;
        _switchResult = "int";
      }
    }
    if (!matched) {
      if (type instanceof EncodedType) {
        final EncodedType _encodedType = (EncodedType)type;
        matched=true;
        _switchResult = "DevEncoded";
      }
    }
    if (!matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
}
