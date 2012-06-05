package fr.esrf.tango.pogo.generator.cpp.global;

import com.google.inject.Inject;
import fr.esrf.tango.pogo.generator.cpp.global.Typedefinitions;
import fr.esrf.tango.pogo.pogoDsl.Argument;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.ClassDescription;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.FireEvents;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class CppUtil {
  @Inject
  private Typedefinitions _typedefinitions;
  
  /**
   * TODO: Obsolete! Do not use
   */
  public String concatString(final String s1, final String s2) {
    String _operator_plus = StringExtensions.operator_plus(s1, s2);
    return _operator_plus;
  }
  
  /**
   * Convert name to data member name (first char to lower case
   */
  public String dataMemberName(final String s) {
    String _substring = s.substring(0, 1);
    String _lowerCase = _substring.toLowerCase();
    int _length = s.length();
    String _substring_1 = s.substring(1, _length);
    String _operator_plus = StringExtensions.operator_plus(_lowerCase, _substring_1);
    return _operator_plus;
  }
  
  /**
   * Comment a String with more than one line
   */
  public String comments(final String s, final String tag) {
    String _operator_plus = StringExtensions.operator_plus("\n", tag);
    String _replaceAll = s.replaceAll("\n", _operator_plus);
    return _replaceAll;
  }
  
  /**
   * Define the signature for command execution method
   */
  public String commandExecutionMethodSignature(final PogoDeviceClass cls, final Command cmd, final boolean declare) {
    String _xifexpression = null;
    if (declare) {
      Argument _argout = cmd.getArgout();
      Type _type = _argout.getType();
      String _cppType = this._typedefinitions.cppType(_type);
      String _operator_plus = StringExtensions.operator_plus(_cppType, " ");
      String _execMethod = cmd.getExecMethod();
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _execMethod);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "(");
      Argument _argin = cmd.getArgin();
      Type _type_1 = _argin.getType();
      String _cppType_1 = this._typedefinitions.cppType(_type_1);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _cppType_1);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, " argin);");
      _xifexpression = _operator_plus_4;
    } else {
      Argument _argout_1 = cmd.getArgout();
      Type _type_2 = _argout_1.getType();
      String _cppType_2 = this._typedefinitions.cppType(_type_2);
      String _operator_plus_5 = StringExtensions.operator_plus(_cppType_2, " ");
      String _name = cls.getName();
      String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, _name);
      String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, "::");
      String _execMethod_1 = cmd.getExecMethod();
      String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, _execMethod_1);
      String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, "(");
      Argument _argin_1 = cmd.getArgin();
      Type _type_3 = _argin_1.getType();
      String _cppType_3 = this._typedefinitions.cppType(_type_3);
      String _operator_plus_10 = StringExtensions.operator_plus(_operator_plus_9, _cppType_3);
      String _operator_plus_11 = StringExtensions.operator_plus(_operator_plus_10, " argin)");
      _xifexpression = _operator_plus_11;
    }
    return _xifexpression;
  }
  
  /**
   * Comment a String with more than one line
   */
  public String inVector(final String s, final String vectName) {
    String _operator_plus = StringExtensions.operator_plus("\");\n\t", vectName);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".push_back(\"");
    String _replaceAll = s.replaceAll("\n", _operator_plus_1);
    return _replaceAll;
  }
  
  public String inOneLine(final String s) {
    String _replaceAll = s.replaceAll("\n", "\\\\n");
    return _replaceAll;
  }
  
  public String onlyOneLine(final String s) {
    String _replaceAll = s.replaceAll("\n", "  ");
    return _replaceAll;
  }
  
  /**
   * Define cpp protected areas
   */
  public String startProtedtedArea(final PogoDeviceClass clazz, final String method) {
    String _xifexpression = null;
    boolean _startsWith = method.startsWith(".");
    if (_startsWith) {
      String _name = clazz.getName();
      String _operator_plus = StringExtensions.operator_plus("/*----- PROTECTED REGION ID(", _name);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, method);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ") ENABLED START -----*/\n");
      _xifexpression = _operator_plus_2;
    } else {
      String _name_1 = clazz.getName();
      String _operator_plus_3 = StringExtensions.operator_plus("/*----- PROTECTED REGION ID(", _name_1);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, "::");
      String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, method);
      String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, ") ENABLED START -----*/\n");
      _xifexpression = _operator_plus_6;
    }
    return _xifexpression;
  }
  
  public String closeProtedtedArea(final PogoDeviceClass clazz, final String method) {
    String _xifexpression = null;
    boolean _startsWith = method.startsWith(".");
    if (_startsWith) {
      String _name = clazz.getName();
      String _operator_plus = StringExtensions.operator_plus("/*----- PROTECTED REGION END -----*/\t//\t", _name);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, method);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "\n");
      _xifexpression = _operator_plus_2;
    } else {
      String _name_1 = clazz.getName();
      String _operator_plus_3 = StringExtensions.operator_plus("/*----- PROTECTED REGION END -----*/\t//\t", _name_1);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, "::");
      String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, method);
      String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, "\n");
      _xifexpression = _operator_plus_6;
    }
    return _xifexpression;
  }
  
  public String protedtedArea(final PogoDeviceClass clazz, final String method, final String comments) {
    String _startProtedtedArea = this.startProtedtedArea(clazz, method);
    String _operator_plus = StringExtensions.operator_plus(_startProtedtedArea, "\n\t//\t");
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, comments);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "\n\n");
    String _closeProtedtedArea = this.closeProtedtedArea(clazz, method);
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _closeProtedtedArea);
    return _operator_plus_3;
  }
  
  public String attTypeDimentions(final Attribute attr) {
    String _switchResult = null;
    String _attType = attr.getAttType();
    final String __valOfSwitchOver = _attType;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,"Spectrum")) {
        matched=true;
        String _maxX = attr.getMaxX();
        String _operator_plus = StringExtensions.operator_plus("  max = ", _maxX);
        _switchResult = _operator_plus;
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,"Image")) {
        matched=true;
        String _maxX_1 = attr.getMaxX();
        String _operator_plus_1 = StringExtensions.operator_plus("  max = ", _maxX_1);
        String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, " x ");
        String _maxY = attr.getMaxY();
        String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _maxY);
        _switchResult = _operator_plus_3;
      }
    }
    if (!matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  /**
   * attribute constructor (scalar, spectrum, image)
   */
  public String attConstructorSize(final Attribute attr) {
    String _switchResult = null;
    String _attType = attr.getAttType();
    final String __valOfSwitchOver = _attType;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,"Spectrum")) {
        matched=true;
        String _maxX = attr.getMaxX();
        String _operator_plus = StringExtensions.operator_plus(", ", _maxX);
        _switchResult = _operator_plus;
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,"Image")) {
        matched=true;
        String _maxX_1 = attr.getMaxX();
        String _operator_plus_1 = StringExtensions.operator_plus(", ", _maxX_1);
        String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ", ");
        String _maxY = attr.getMaxY();
        String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _maxY);
        _switchResult = _operator_plus_3;
      }
    }
    if (!matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  /**
   * attribute set value (scalar, spectrum, image)
   */
  public String SetAttValueSize(final Attribute attr) {
    String _switchResult = null;
    String _attType = attr.getAttType();
    final String __valOfSwitchOver = _attType;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,"Spectrum")) {
        matched=true;
        String _maxX = attr.getMaxX();
        String _operator_plus = StringExtensions.operator_plus(", ", _maxX);
        _switchResult = _operator_plus;
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,"Image")) {
        matched=true;
        String _maxX_1 = attr.getMaxX();
        String _operator_plus_1 = StringExtensions.operator_plus(", ", _maxX_1);
        String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ", ");
        String _maxY = attr.getMaxY();
        String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _maxY);
        _switchResult = _operator_plus_3;
      }
    }
    if (!matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  /**
   * attribute allocation
   */
  public String attAllocSize(final Attribute attr) {
    String _switchResult = null;
    String _attType = attr.getAttType();
    final String __valOfSwitchOver = _attType;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,"Spectrum")) {
        matched=true;
        String _maxX = attr.getMaxX();
        _switchResult = _maxX;
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,"Image")) {
        matched=true;
        String _maxX_1 = attr.getMaxX();
        String _operator_plus = StringExtensions.operator_plus(", ", _maxX_1);
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " *");
        String _maxY = attr.getMaxY();
        String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _maxY);
        _switchResult = _operator_plus_2;
      }
    }
    if (!matched) {
      _switchResult = "1";
    }
    return _switchResult;
  }
  
  /**
   * Code to set the attribute property
   */
  public String setAttributeProperty(final String att_name, final String field, final String value) {
    String _xifexpression = null;
    int _length = value.length();
    boolean _operator_greaterThan = IntegerExtensions.operator_greaterThan(_length, 0);
    if (_operator_greaterThan) {
      String _lowerCase = att_name.toLowerCase();
      String _operator_plus = StringExtensions.operator_plus(_lowerCase, "_prop.set_");
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, field);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "(\"");
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, value);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, "\");");
      _xifexpression = _operator_plus_4;
    } else {
      String _operator_plus_5 = StringExtensions.operator_plus("//\t", field);
      String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, "\tnot set for\t");
      String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, att_name);
      _xifexpression = _operator_plus_7;
    }
    return _xifexpression;
  }
  
  public String setAttributeFireEvent(final String att_name, final String evtType, final FireEvents fe) {
    String _xifexpression = null;
    String _fire = fe.getFire();
    boolean _operator_equals = ObjectExtensions.operator_equals(_fire, "true");
    if (_operator_equals) {
      String _lowerCase = att_name.toLowerCase();
      String _operator_plus = StringExtensions.operator_plus(_lowerCase, "->set_");
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, evtType);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "_event(");
      String _fire_1 = fe.getFire();
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _fire_1);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, ", ");
      String _libCheckCriteria = fe.getLibCheckCriteria();
      String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, _libCheckCriteria);
      String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, ");");
      _xifexpression = _operator_plus_6;
    } else {
      String _operator_plus_7 = StringExtensions.operator_plus("//\t", att_name);
      String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, " does not fire ");
      String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, evtType);
      String _operator_plus_10 = StringExtensions.operator_plus(_operator_plus_9, " event");
      _xifexpression = _operator_plus_10;
    }
    return _xifexpression;
  }
  
  /**
   * Special case (one arg)
   */
  public String setAttributeFireDataReadyEvent(final String att_name, final FireEvents fe) {
    String _xifexpression = null;
    String _fire = fe.getFire();
    boolean _operator_equals = ObjectExtensions.operator_equals(_fire, "true");
    if (_operator_equals) {
      String _lowerCase = att_name.toLowerCase();
      String _operator_plus = StringExtensions.operator_plus(_lowerCase, "->set_data_ready_event(");
      String _fire_1 = fe.getFire();
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _fire_1);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ");");
      _xifexpression = _operator_plus_2;
    } else {
      String _operator_plus_3 = StringExtensions.operator_plus("//\t", att_name);
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, " does not fire data_ready event");
      _xifexpression = _operator_plus_4;
    }
    return _xifexpression;
  }
  
  public String writeAttrValueDeclaration(final Attribute att) {
    String _xifexpression = null;
    Type _dataType = att.getDataType();
    String _cppType = this._typedefinitions.cppType(_dataType);
    String _string = _cppType.toString();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_string, "Tango::DevString");
    if (_operator_notEquals) {
      Type _dataType_1 = att.getDataType();
      String _cppType_1 = this._typedefinitions.cppType(_dataType_1);
      String _string_1 = _cppType_1.toString();
      _xifexpression = _string_1;
    } else {
      _xifexpression = "Tango::ConstDevString";
    }
    return _xifexpression;
  }
  
  public String protectedID(final PogoDeviceClass cls, final Attribute att, final String str) {
    String _name = cls.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "::");
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, str);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "_");
    String _name_1 = att.getName();
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _name_1);
    return _operator_plus_3;
  }
  
  public String stateAllowedMethod(final Attribute attr) {
    String _name = attr.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "StateAllowed");
    return _operator_plus;
  }
  
  public String cppExcludeStatesClose(final Attribute attr) {
    String _xifexpression = null;
    EList<String> _readExcludedStates = attr.getReadExcludedStates();
    int _size = _readExcludedStates.size();
    boolean _operator_equals = IntegerExtensions.operator_equals(_size, 0);
    if (_operator_equals) {
      _xifexpression = null;
    } else {
      _xifexpression = "return false;\n\t}";
    }
    return _xifexpression;
  }
  
  public String protectedID(final PogoDeviceClass cls, final Command cmd) {
    String _name = cls.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "::");
    String _execMethod = cmd.getExecMethod();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _execMethod);
    return _operator_plus_1;
  }
  
  public String argoutDescription(final Command cmd) {
    String _xifexpression = null;
    Argument _argout = cmd.getArgout();
    String _description = _argout.getDescription();
    boolean _operator_equals = ObjectExtensions.operator_equals(_description, "");
    if (_operator_equals) {
      _xifexpression = "none";
    } else {
      Argument _argout_1 = cmd.getArgout();
      String _description_1 = _argout_1.getDescription();
      _xifexpression = _description_1;
    }
    return _xifexpression;
  }
  
  /**
   * dserverClass.cpp command execute method
   */
  public String executeCmdExtract(final Command cmd) {
    String _xifexpression = null;
    Argument _argin = cmd.getArgin();
    Type _type = _argin.getType();
    String _cppType = this._typedefinitions.cppType(_type);
    boolean _operator_equals = ObjectExtensions.operator_equals(_cppType, "void");
    if (_operator_equals) {
      _xifexpression = null;
    } else {
      String _xifexpression_1 = null;
      Argument _argin_1 = cmd.getArgin();
      Type _type_1 = _argin_1.getType();
      String _cppType_1 = this._typedefinitions.cppType(_type_1);
      String _string = _cppType_1.toString();
      boolean _endsWith = _string.endsWith("Array");
      if (_endsWith) {
        Argument _argin_2 = cmd.getArgin();
        Type _type_2 = _argin_2.getType();
        String _cppType_2 = this._typedefinitions.cppType(_type_2);
        String _string_1 = _cppType_2.toString();
        String _operator_plus = StringExtensions.operator_plus("const ", _string_1);
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "\t*argin;\n\textract(in_any, argin);");
        _xifexpression_1 = _operator_plus_1;
      } else {
        Argument _argin_3 = cmd.getArgin();
        Type _type_3 = _argin_3.getType();
        String _cppType_3 = this._typedefinitions.cppType(_type_3);
        String _string_2 = _cppType_3.toString();
        String _operator_plus_2 = StringExtensions.operator_plus(_string_2, "\targin;\n\textract(in_any, argin);");
        _xifexpression_1 = _operator_plus_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * dserverClass.cpp command execute method
   */
  public String executeCmdInsert(final PogoDeviceClass cls, final Command cmd) {
    String _xifexpression = null;
    boolean _operator_and = false;
    Argument _argin = cmd.getArgin();
    Type _type = _argin.getType();
    String _cppType = this._typedefinitions.cppType(_type);
    boolean _operator_equals = ObjectExtensions.operator_equals(_cppType, "void");
    if (!_operator_equals) {
      _operator_and = false;
    } else {
      Argument _argout = cmd.getArgout();
      Type _type_1 = _argout.getType();
      String _cppType_1 = this._typedefinitions.cppType(_type_1);
      boolean _operator_equals_1 = ObjectExtensions.operator_equals(_cppType_1, "void");
      _operator_and = BooleanExtensions.operator_and(_operator_equals, _operator_equals_1);
    }
    if (_operator_and) {
      String _name = cls.getName();
      String _operator_plus = StringExtensions.operator_plus("((static_cast<", _name);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " *>(device))->");
      String _execMethod = cmd.getExecMethod();
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _execMethod);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "());");
      String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, "\n\treturn new CORBA::Any();");
      _xifexpression = _operator_plus_4;
    } else {
      String _xifexpression_1 = null;
      boolean _operator_and_1 = false;
      Argument _argin_1 = cmd.getArgin();
      Type _type_2 = _argin_1.getType();
      String _cppType_2 = this._typedefinitions.cppType(_type_2);
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_cppType_2, "void");
      if (!_operator_notEquals) {
        _operator_and_1 = false;
      } else {
        Argument _argout_1 = cmd.getArgout();
        Type _type_3 = _argout_1.getType();
        String _cppType_3 = this._typedefinitions.cppType(_type_3);
        boolean _operator_equals_2 = ObjectExtensions.operator_equals(_cppType_3, "void");
        _operator_and_1 = BooleanExtensions.operator_and(_operator_notEquals, _operator_equals_2);
      }
      if (_operator_and_1) {
        String _name_1 = cls.getName();
        String _operator_plus_5 = StringExtensions.operator_plus("((static_cast<", _name_1);
        String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, " *>(device))->");
        String _execMethod_1 = cmd.getExecMethod();
        String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, _execMethod_1);
        String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, "(argin));");
        String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, "\n\treturn new CORBA::Any();");
        _xifexpression_1 = _operator_plus_9;
      } else {
        String _xifexpression_2 = null;
        boolean _operator_and_2 = false;
        Argument _argin_2 = cmd.getArgin();
        Type _type_4 = _argin_2.getType();
        String _cppType_4 = this._typedefinitions.cppType(_type_4);
        boolean _operator_equals_3 = ObjectExtensions.operator_equals(_cppType_4, "void");
        if (!_operator_equals_3) {
          _operator_and_2 = false;
        } else {
          Argument _argout_2 = cmd.getArgout();
          Type _type_5 = _argout_2.getType();
          String _cppType_5 = this._typedefinitions.cppType(_type_5);
          boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_cppType_5, "void");
          _operator_and_2 = BooleanExtensions.operator_and(_operator_equals_3, _operator_notEquals_1);
        }
        if (_operator_and_2) {
          String _name_2 = cls.getName();
          String _operator_plus_10 = StringExtensions.operator_plus("return insert((static_cast<", _name_2);
          String _operator_plus_11 = StringExtensions.operator_plus(_operator_plus_10, " *>(device))->");
          String _execMethod_2 = cmd.getExecMethod();
          String _operator_plus_12 = StringExtensions.operator_plus(_operator_plus_11, _execMethod_2);
          String _operator_plus_13 = StringExtensions.operator_plus(_operator_plus_12, "());");
          _xifexpression_2 = _operator_plus_13;
        } else {
          String _name_3 = cls.getName();
          String _operator_plus_14 = StringExtensions.operator_plus("return insert((static_cast<", _name_3);
          String _operator_plus_15 = StringExtensions.operator_plus(_operator_plus_14, " *>(device))->");
          String _execMethod_3 = cmd.getExecMethod();
          String _operator_plus_16 = StringExtensions.operator_plus(_operator_plus_15, _execMethod_3);
          String _operator_plus_17 = StringExtensions.operator_plus(_operator_plus_16, "(argin));");
          _xifexpression_2 = _operator_plus_17;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String declareArgumentWithPointer(final Argument arg) {
    String _xifexpression = null;
    Type _type = arg.getType();
    String _cppType = this._typedefinitions.cppType(_type);
    String _string = _cppType.toString();
    boolean _endsWith = _string.endsWith("Array");
    if (_endsWith) {
      Type _type_1 = arg.getType();
      String _cppType_1 = this._typedefinitions.cppType(_type_1);
      String _string_1 = _cppType_1.toString();
      String _operator_plus = StringExtensions.operator_plus(_string_1, " *");
      _xifexpression = _operator_plus;
    } else {
      Type _type_2 = arg.getType();
      String _cppType_2 = this._typedefinitions.cppType(_type_2);
      String _string_2 = _cppType_2.toString();
      String _operator_plus_1 = StringExtensions.operator_plus(_string_2, " ");
      _xifexpression = _operator_plus_1;
    }
    return _xifexpression;
  }
  
  public String declareCmdArgin(final Command cmd) {
    String _xifexpression = null;
    Argument _argin = cmd.getArgin();
    Type _type = _argin.getType();
    String _cppType = this._typedefinitions.cppType(_type);
    boolean _operator_equals = ObjectExtensions.operator_equals(_cppType, "void");
    if (_operator_equals) {
      _xifexpression = null;
    } else {
      String _xifexpression_1 = null;
      Argument _argin_1 = cmd.getArgin();
      Type _type_1 = _argin_1.getType();
      String _cppType_1 = this._typedefinitions.cppType(_type_1);
      String _string = _cppType_1.toString();
      boolean _endsWith = _string.endsWith("Array");
      if (_endsWith) {
        Argument _argin_2 = cmd.getArgin();
        Type _type_2 = _argin_2.getType();
        String _cppType_2 = this._typedefinitions.cppType(_type_2);
        String _string_1 = _cppType_2.toString();
        String _operator_plus = StringExtensions.operator_plus("const ", _string_1);
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " *argin");
        _xifexpression_1 = _operator_plus_1;
      } else {
        Argument _argin_3 = cmd.getArgin();
        Type _type_3 = _argin_3.getType();
        String _cppType_3 = this._typedefinitions.cppType(_type_3);
        String _string_2 = _cppType_3.toString();
        String _operator_plus_2 = StringExtensions.operator_plus(_string_2, " argin");
        _xifexpression_1 = _operator_plus_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String cppSetPollingPeriod(final Command cmd) {
    String _xifexpression = null;
    String _polledPeriod = cmd.getPolledPeriod();
    boolean _operator_equals = ObjectExtensions.operator_equals(_polledPeriod, null);
    if (_operator_equals) {
      _xifexpression = null;
    } else {
      String _name = cmd.getName();
      String _operator_plus = StringExtensions.operator_plus("p", _name);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "Cmd->set_polling_period(");
      String _polledPeriod_1 = cmd.getPolledPeriod();
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, _polledPeriod_1);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, ");\n\t");
      _xifexpression = _operator_plus_3;
    }
    return _xifexpression;
  }
  
  public String cppDisplayLevel(final Command cmd) {
    String _xifexpression = null;
    String _displayLevel = cmd.getDisplayLevel();
    boolean _operator_equals = ObjectExtensions.operator_equals(_displayLevel, null);
    if (_operator_equals) {
      _xifexpression = "Tango::OPERATOR";
    } else {
      String _displayLevel_1 = cmd.getDisplayLevel();
      String _operator_plus = StringExtensions.operator_plus("Tango::", _displayLevel_1);
      _xifexpression = _operator_plus;
    }
    return _xifexpression;
  }
  
  public String stateAllowedMethod(final Command cmd) {
    String _name = cmd.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "StateAllowed");
    return _operator_plus;
  }
  
  public String cppExculudeStatesClose(final Command cmd) {
    String _xifexpression = null;
    EList<String> _excludedStates = cmd.getExcludedStates();
    int _size = _excludedStates.size();
    boolean _operator_equals = IntegerExtensions.operator_equals(_size, 0);
    if (_operator_equals) {
      _xifexpression = null;
    } else {
      _xifexpression = "return false;\n\t}";
    }
    return _xifexpression;
  }
  
  /**
   * Inheritance util (return true if not the TangoDeviceImpl)
   */
  public boolean isInheritanceClass(final Inheritance inher) {
    boolean _xifexpression = false;
    boolean _operator_or = false;
    String _classname = inher.getClassname();
    boolean _operator_equals = ObjectExtensions.operator_equals(_classname, null);
    if (_operator_equals) {
      _operator_or = true;
    } else {
      String _classname_1 = inher.getClassname();
      int _length = _classname_1.length();
      boolean _operator_equals_1 = IntegerExtensions.operator_equals(_length, 0);
      _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
    }
    if (_operator_or) {
      _xifexpression = false;
    } else {
      boolean _xifexpression_1 = false;
      boolean _operator_and = false;
      String _classname_2 = inher.getClassname();
      boolean _startsWith = _classname_2.startsWith("Device_");
      boolean _operator_equals_2 = BooleanExtensions.operator_equals(_startsWith, true);
      if (!_operator_equals_2) {
        _operator_and = false;
      } else {
        String _classname_3 = inher.getClassname();
        boolean _endsWith = _classname_3.endsWith("Impl");
        boolean _operator_equals_3 = BooleanExtensions.operator_equals(_endsWith, true);
        _operator_and = BooleanExtensions.operator_and(_operator_equals_2, _operator_equals_3);
      }
      if (_operator_and) {
        _xifexpression_1 = false;
      } else {
        _xifexpression_1 = true;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Inheritance util (return true at least the first one is not the TangoDeviceImpl)
   */
  public boolean hasInheritanceClass(final ClassDescription cd) {
    boolean _operator_and = false;
    EList<Inheritance> _inheritances = cd.getInheritances();
    int _size = _inheritances.size();
    boolean _operator_greaterThan = IntegerExtensions.operator_greaterThan(_size, 0);
    if (!_operator_greaterThan) {
      _operator_and = false;
    } else {
      EList<Inheritance> _inheritances_1 = cd.getInheritances();
      EList<Inheritance> _inheritances_2 = cd.getInheritances();
      int _size_1 = _inheritances_2.size();
      int _operator_minus = IntegerExtensions.operator_minus(_size_1, 1);
      Inheritance _get = _inheritances_1.get(_operator_minus);
      boolean _isInheritanceClass = this.isInheritanceClass(_get);
      _operator_and = BooleanExtensions.operator_and(_operator_greaterThan, _isInheritanceClass);
    }
    return _operator_and;
  }
  
  public String makeVariable(final Inheritance inher, final String s) {
    String _classname = inher.getClassname();
    String _upperCase = _classname.toUpperCase();
    String _operator_plus = StringExtensions.operator_plus(_upperCase, s);
    return _operator_plus;
  }
  
  public String makeVariable(final OneClassSimpleDef _class, final String s) {
    String _classname = _class.getClassname();
    String _upperCase = _classname.toUpperCase();
    String _operator_plus = StringExtensions.operator_plus(_upperCase, s);
    return _operator_plus;
  }
}
