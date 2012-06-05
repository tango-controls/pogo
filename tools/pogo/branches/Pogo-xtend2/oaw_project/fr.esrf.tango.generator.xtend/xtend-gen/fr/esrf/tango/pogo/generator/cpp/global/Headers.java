package fr.esrf.tango.pogo.generator.cpp.global;

import com.google.inject.Inject;
import fr.esrf.tango.pogo.generator.cpp.global.CppUtil;
import fr.esrf.tango.pogo.generator.cpp.global.Typedefinitions;
import fr.esrf.tango.pogo.pogoDsl.Argument;
import fr.esrf.tango.pogo.pogoDsl.AttrProperties;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.ClassDescription;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.Type;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Headers {
  @Inject
  private CppUtil _cppUtil;
  
  @Inject
  private Typedefinitions _typedefinitions;
  
  public String cvsEscaped(final String s) {
    String _operator_plus = StringExtensions.operator_plus("$", s);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "  $");
    return _operator_plus_1;
  }
  
  /**
   * header for device.h
   */
  public String deviceHeaderFileName(final PogoDeviceClass clazz) {
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, ".h");
    return _operator_plus;
  }
  
  public String deviceHeaderFileHeader(final PogoDeviceClass clazz) {
    String _deviceHeaderFileName = this.deviceHeaderFileName(clazz);
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus("Include file for the ", _name);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " class");
    ClassDescription _description = clazz.getDescription();
    String _title = _description.getTitle();
    String _fileHeader = this.fileHeader(_deviceHeaderFileName, _operator_plus_1, _title);
    return _fileHeader;
  }
  
  /**
   * header for deviceClass.h
   */
  public String deviceClassHeaderFileName(final PogoDeviceClass clazz) {
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "Class.h");
    return _operator_plus;
  }
  
  public String deviceClassHeaderFileHeader(final PogoDeviceClass clazz) {
    String _deviceClassHeaderFileHeader = this.deviceClassHeaderFileHeader(clazz);
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus("Include for the ", _name);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " root class.\n");
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "This class is the singleton class for\n");
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, " the ");
    String _name_1 = clazz.getName();
    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, _name_1);
    String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, " device class.\n");
    String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, "It contains all properties and methods which the \n");
    String _name_2 = clazz.getName();
    String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, _name_2);
    String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, " requires only once e.g. the commands.");
    ClassDescription _description = clazz.getDescription();
    String _title = _description.getTitle();
    String _fileHeader = this.fileHeader(_deviceClassHeaderFileHeader, _operator_plus_8, _title);
    return _fileHeader;
  }
  
  /**
   * header for device.cpp
   */
  public String deviceSourceFileName(final PogoDeviceClass clazz) {
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, ".cpp");
    return _operator_plus;
  }
  
  public String deviceSourceFileHeader(final PogoDeviceClass clazz) {
    String _deviceSourceFileName = this.deviceSourceFileName(clazz);
    ClassDescription _description = clazz.getDescription();
    String _description_1 = _description.getDescription();
    String _operator_plus = StringExtensions.operator_plus("C++ source for the Danfysik9000 and its commands.\n", _description_1);
    ClassDescription _description_2 = clazz.getDescription();
    String _title = _description_2.getTitle();
    String _fileHeader = this.fileHeader(_deviceSourceFileName, _operator_plus, _title);
    return _fileHeader;
  }
  
  /**
   * header for deviceClass.cpp
   */
  public String deviceClassSourceFileName(final PogoDeviceClass clazz) {
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "Class.cpp");
    return _operator_plus;
  }
  
  public String deviceClassSourceFileHeader(final PogoDeviceClass clazz) {
    String _deviceClassSourceFileName = this.deviceClassSourceFileName(clazz);
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus("C++ source for the ", _name);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " root class.\n");
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "This class is the singleton class for\n");
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, " the ");
    String _name_1 = clazz.getName();
    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, _name_1);
    String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, " device class.\n");
    String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, "It contains all properties and methods which the \n");
    String _name_2 = clazz.getName();
    String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, _name_2);
    String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, " requires only once e.g. the commands.");
    ClassDescription _description = clazz.getDescription();
    String _title = _description.getTitle();
    String _fileHeader = this.fileHeader(_deviceClassSourceFileName, _operator_plus_8, _title);
    return _fileHeader;
  }
  
  /**
   * header for StateMachine.cpp
   */
  public String stateMachineFileName(final PogoDeviceClass clazz) {
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, "StateMachine.cpp");
    return _operator_plus;
  }
  
  public String stateMachineFileHeader(final PogoDeviceClass clazz) {
    String _stateMachineFileName = this.stateMachineFileName(clazz);
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus("State machine file for the ", _name);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, " class");
    ClassDescription _description = clazz.getDescription();
    String _title = _description.getTitle();
    String _fileHeader = this.fileHeader(_stateMachineFileName, _operator_plus_1, _title);
    return _fileHeader;
  }
  
  /**
   * generic file header
   */
  public String fileHeader(final String fileName, final String description, final String title) {
    String _operator_plus = StringExtensions.operator_plus("//=============================================================================\n", "//\n");
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "// file :        ");
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, fileName);
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "\n");
    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, "//\n");
    String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, "// description : ");
    String _comments = this._cppUtil.comments(description, "//               ");
    String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, _comments);
    String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, "\n");
    String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, "//\n");
    String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, "// project :     ");
    String _operator_plus_10 = StringExtensions.operator_plus(_operator_plus_9, title);
    String _operator_plus_11 = StringExtensions.operator_plus(_operator_plus_10, "\n");
    String _operator_plus_12 = StringExtensions.operator_plus(_operator_plus_11, "//\n");
    String _operator_plus_13 = StringExtensions.operator_plus(_operator_plus_12, "// ");
    String _cvsEscaped = this.cvsEscaped("Author:");
    String _operator_plus_14 = StringExtensions.operator_plus(_operator_plus_13, _cvsEscaped);
    String _operator_plus_15 = StringExtensions.operator_plus(_operator_plus_14, "\n");
    String _operator_plus_16 = StringExtensions.operator_plus(_operator_plus_15, "//\n");
    String _operator_plus_17 = StringExtensions.operator_plus(_operator_plus_16, "// ");
    String _cvsEscaped_1 = this.cvsEscaped("Revision:");
    String _operator_plus_18 = StringExtensions.operator_plus(_operator_plus_17, _cvsEscaped_1);
    String _operator_plus_19 = StringExtensions.operator_plus(_operator_plus_18, "\n");
    String _operator_plus_20 = StringExtensions.operator_plus(_operator_plus_19, "// ");
    String _cvsEscaped_2 = this.cvsEscaped("Date:");
    String _operator_plus_21 = StringExtensions.operator_plus(_operator_plus_20, _cvsEscaped_2);
    String _operator_plus_22 = StringExtensions.operator_plus(_operator_plus_21, "\n");
    String _operator_plus_23 = StringExtensions.operator_plus(_operator_plus_22, "//\n");
    String _operator_plus_24 = StringExtensions.operator_plus(_operator_plus_23, "// ");
    String _cvsEscaped_3 = this.cvsEscaped("HeadURL:");
    String _operator_plus_25 = StringExtensions.operator_plus(_operator_plus_24, _cvsEscaped_3);
    String _operator_plus_26 = StringExtensions.operator_plus(_operator_plus_25, "\n");
    String _operator_plus_27 = StringExtensions.operator_plus(_operator_plus_26, "//\n");
    String _operator_plus_28 = StringExtensions.operator_plus(_operator_plus_27, "//=============================================================================\n");
    String _operator_plus_29 = StringExtensions.operator_plus(_operator_plus_28, "//                This file is generated by POGO\n");
    String _operator_plus_30 = StringExtensions.operator_plus(_operator_plus_29, "//        (Program Obviously used to Generate tango Object)\n");
    String _operator_plus_31 = StringExtensions.operator_plus(_operator_plus_30, "//=============================================================================\n");
    return _operator_plus_31;
  }
  
  /**
   * Methods headers
   */
  public String attributeReadMethodHeader(final Attribute attr) {
    String _operator_plus = StringExtensions.operator_plus("/**\n", " *\tAttribute ");
    String _name = attr.getName();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, " related mehods\n");
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, " *\tDescription: ");
    AttrProperties _properties = attr.getProperties();
    String _description = _properties.getDescription();
    String _comments = this._cppUtil.comments(_description, "\t *\t\t");
    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, _comments);
    String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, "\n");
    String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, " *\n");
    String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, " *\tData type:\t");
    Type _dataType = attr.getDataType();
    String _cppType = this._typedefinitions.cppType(_dataType);
    String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, _cppType);
    String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, "\n");
    String _operator_plus_10 = StringExtensions.operator_plus(_operator_plus_9, " *\tAttr type:\t");
    String _attType = attr.getAttType();
    String _operator_plus_11 = StringExtensions.operator_plus(_operator_plus_10, _attType);
    String _attTypeDimentions = this._cppUtil.attTypeDimentions(attr);
    String _operator_plus_12 = StringExtensions.operator_plus(_operator_plus_11, _attTypeDimentions);
    String _operator_plus_13 = StringExtensions.operator_plus(_operator_plus_12, "\n");
    String _operator_plus_14 = StringExtensions.operator_plus(_operator_plus_13, " */\n");
    return _operator_plus_14;
  }
  
  public String commandExecutionMethodHeader(final Command cmd) {
    String _operator_plus = StringExtensions.operator_plus("/**\n", " *\tCommand ");
    String _name = cmd.getName();
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, " related mehods\n");
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, " *\tDescription: ");
    String _description = cmd.getDescription();
    String _comments = this._cppUtil.comments(_description, "\t *\t\t");
    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, _comments);
    String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, "\n");
    String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, " *\n");
    String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, " *\t@param argin ");
    Argument _argin = cmd.getArgin();
    String _description_1 = _argin.getDescription();
    String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, _description_1);
    String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, "\n");
    String _operator_plus_10 = StringExtensions.operator_plus(_operator_plus_9, " *\t@returns ");
    Argument _argout = cmd.getArgout();
    String _description_2 = _argout.getDescription();
    String _operator_plus_11 = StringExtensions.operator_plus(_operator_plus_10, _description_2);
    String _operator_plus_12 = StringExtensions.operator_plus(_operator_plus_11, "\n");
    String _operator_plus_13 = StringExtensions.operator_plus(_operator_plus_12, " */\n");
    return _operator_plus_13;
  }
}
