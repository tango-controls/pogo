package fr.esrf.tango.pogo.generator.cpp;

import com.google.inject.Inject;
import fr.esrf.tango.pogo.generator.cpp.CppUtil;
import fr.esrf.tango.pogo.pogoDsl.ClassDescription;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Headers {
  @Inject
  private CppUtil _cppUtil;
  
  /**
   * header for device.h
   */
  public String deviceHeaderFileHeader(final PogoDeviceClass clazz) {
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, ".h");
    String _name_1 = clazz.getName();
    String _operator_plus_1 = StringExtensions.operator_plus("Include file for the ", _name_1);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, " class");
    ClassDescription _description = clazz.getDescription();
    String _title = _description.getTitle();
    String _fileHeader = this.fileHeader(_operator_plus, _operator_plus_2, _title);
    return _fileHeader;
  }
  
  /**
   * header for deviceClass.h
   */
  public String deviceClassHeaderFileHeader(final PogoDeviceClass clazz) {
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, ".h");
    String _name_1 = clazz.getName();
    String _operator_plus_1 = StringExtensions.operator_plus("Include for the ", _name_1);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, " root class.\n");
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "This class is the singleton class for\n");
    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, " the ");
    String _name_2 = clazz.getName();
    String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, _name_2);
    String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, " device class.\n");
    String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, "It contains all properties and methods which the \n");
    String _name_3 = clazz.getName();
    String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, _name_3);
    String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, " requires only once e.g. the commands.");
    ClassDescription _description = clazz.getDescription();
    String _title = _description.getTitle();
    String _fileHeader = this.fileHeader(_operator_plus, _operator_plus_9, _title);
    return _fileHeader;
  }
  
  /**
   * header got device.cpp
   */
  public String deviceSourceFileHeader(final PogoDeviceClass clazz) {
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, ".cpp");
    ClassDescription _description = clazz.getDescription();
    String _description_1 = _description.getDescription();
    String _operator_plus_1 = StringExtensions.operator_plus("C++ source for the Danfysik9000 and its commands.\n", _description_1);
    ClassDescription _description_2 = clazz.getDescription();
    String _title = _description_2.getTitle();
    String _fileHeader = this.fileHeader(_operator_plus, _operator_plus_1, _title);
    return _fileHeader;
  }
  
  /**
   * header for deviceClass.cpp
   */
  public String deviceClasSourceFileHeader(final PogoDeviceClass clazz) {
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, ".h");
    String _name_1 = clazz.getName();
    String _operator_plus_1 = StringExtensions.operator_plus("C++ source for the ", _name_1);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, " root class.\n");
    String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "This class is the singleton class for\n");
    String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, " the ");
    String _name_2 = clazz.getName();
    String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, _name_2);
    String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, " device class.\n");
    String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, "It contains all properties and methods which the \n");
    String _name_3 = clazz.getName();
    String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, _name_3);
    String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, " requires only once e.g. the commands.");
    ClassDescription _description = clazz.getDescription();
    String _title = _description.getTitle();
    String _fileHeader = this.fileHeader(_operator_plus, _operator_plus_9, _title);
    return _fileHeader;
  }
  
  /**
   * header for StateMachine.h
   */
  public String stateMachineFileHeader(final PogoDeviceClass clazz) {
    String _name = clazz.getName();
    String _operator_plus = StringExtensions.operator_plus(_name, ".h");
    String _name_1 = clazz.getName();
    String _operator_plus_1 = StringExtensions.operator_plus("State machine file for the ", _name_1);
    String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, " class");
    ClassDescription _description = clazz.getDescription();
    String _title = _description.getTitle();
    String _fileHeader = this.fileHeader(_operator_plus, _operator_plus_2, _title);
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
    String _cvsEscaped = this._cppUtil.cvsEscaped("Author:");
    String _operator_plus_14 = StringExtensions.operator_plus(_operator_plus_13, _cvsEscaped);
    String _operator_plus_15 = StringExtensions.operator_plus(_operator_plus_14, "\n");
    String _operator_plus_16 = StringExtensions.operator_plus(_operator_plus_15, "//\n");
    String _operator_plus_17 = StringExtensions.operator_plus(_operator_plus_16, "// ");
    String _cvsEscaped_1 = this._cppUtil.cvsEscaped("Revision:");
    String _operator_plus_18 = StringExtensions.operator_plus(_operator_plus_17, _cvsEscaped_1);
    String _operator_plus_19 = StringExtensions.operator_plus(_operator_plus_18, "\n");
    String _operator_plus_20 = StringExtensions.operator_plus(_operator_plus_19, "// ");
    String _cvsEscaped_2 = this._cppUtil.cvsEscaped("Date:");
    String _operator_plus_21 = StringExtensions.operator_plus(_operator_plus_20, _cvsEscaped_2);
    String _operator_plus_22 = StringExtensions.operator_plus(_operator_plus_21, "\n");
    String _operator_plus_23 = StringExtensions.operator_plus(_operator_plus_22, "//\n");
    String _operator_plus_24 = StringExtensions.operator_plus(_operator_plus_23, "// ");
    String _cvsEscaped_3 = this._cppUtil.cvsEscaped("HeadURL:");
    String _operator_plus_25 = StringExtensions.operator_plus(_operator_plus_24, _cvsEscaped_3);
    String _operator_plus_26 = StringExtensions.operator_plus(_operator_plus_25, "\n");
    String _operator_plus_27 = StringExtensions.operator_plus(_operator_plus_26, "//\n");
    String _operator_plus_28 = StringExtensions.operator_plus(_operator_plus_27, "//=============================================================================\n");
    String _operator_plus_29 = StringExtensions.operator_plus(_operator_plus_28, "//                This file is generated by POGO\n");
    String _operator_plus_30 = StringExtensions.operator_plus(_operator_plus_29, "//        (Program Obviously used to Generate tango Object)\n");
    String _operator_plus_31 = StringExtensions.operator_plus(_operator_plus_30, "//=============================================================================\n");
    return _operator_plus_31;
  }
}
