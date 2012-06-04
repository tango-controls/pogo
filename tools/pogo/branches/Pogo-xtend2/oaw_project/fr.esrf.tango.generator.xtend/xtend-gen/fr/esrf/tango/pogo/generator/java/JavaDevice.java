package fr.esrf.tango.pogo.generator.java;

import com.google.inject.Inject;
import fr.esrf.tango.pogo.generator.java.JavaUtils;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.ClassDescription;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.Property;
import fr.esrf.tango.pogo.pogoDsl.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;

@SuppressWarnings("all")
public class JavaDevice implements IGenerator {
  @Inject
  private JavaUtils _javaUtils;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<PogoDeviceClass> _filter = IterableExtensions.<PogoDeviceClass>filter(_allContentsIterable, fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass.class);
    for (final PogoDeviceClass cls : _filter) {
      String _javaDeviceClassFileName = this._javaUtils.javaDeviceClassFileName(cls);
      CharSequence _generate_javaFile = this.generate_javaFile(cls);
      fsa.generateFile(_javaDeviceClassFileName, _generate_javaFile);
    }
  }
  
  public CharSequence generate_javaFile(final PogoDeviceClass cls) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _javaDevicePackage = this._javaUtils.javaDevicePackage(cls);
    _builder.append(_javaDevicePackage, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.Vector;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.omg.CORBA.SystemException;");
    _builder.newLine();
    _builder.append("import org.omg.CORBA.UserException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import fr.esrf.Tango.DevFailed;");
    _builder.newLine();
    _builder.append("import fr.esrf.TangoApi.DbDatum;");
    _builder.newLine();
    _builder.append("import fr.esrf.TangoDs.Attribute;");
    _builder.newLine();
    _builder.append("import fr.esrf.TangoDs.DeviceClass;");
    _builder.newLine();
    _builder.append("import fr.esrf.TangoDs.DeviceImpl;");
    _builder.newLine();
    _builder.append("import fr.esrf.TangoDs.Except;");
    _builder.newLine();
    _builder.append("import fr.esrf.TangoDs.TangoConst;");
    _builder.newLine();
    _builder.append("import fr.esrf.TangoDs.Util;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*\tClass Description: ");
    ClassDescription _description = cls.getDescription();
    String _description_1 = _description.getDescription();
    _builder.append(_description_1, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*\t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @author\t");
    String _vcsEscaped = this._javaUtils.vcsEscaped("Author");
    _builder.append(_vcsEscaped, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @version\t ");
    String _vcsEscaped_1 = this._javaUtils.vcsEscaped("Revision");
    _builder.append(_vcsEscaped_1, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _name = cls.getName();
    _builder.append(_name, "");
    _builder.append(" extends DeviceImpl implements TangoConst{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("//PROTECTED REGION ID(");
    String _name_1 = cls.getName();
    _builder.append(_name_1, "	");
    _builder.append("::HEAD) ENABLED START");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// TODO: Add protected code here!");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//PROTECTED REGION END");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// properties");
    _builder.newLine();
    {
      EList<Property> _deviceProperties = cls.getDeviceProperties();
      for(final Property prop : _deviceProperties) {
        _builder.append("\t");
        String _javaPropType = this._javaUtils.javaPropType(prop);
        _builder.append(_javaPropType, "	");
        _builder.append(" ");
        String _name_2 = prop.getName();
        String _firstLower = StringExtensions.toFirstLower(_name_2);
        _builder.append(_firstLower, "	");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("// attributes");
    _builder.newLine();
    {
      EList<Attribute> _attributes = cls.getAttributes();
      for(final Attribute attr : _attributes) {
        _builder.append("\t");
        Type _dataType = attr.getDataType();
        String _javaType = this._javaUtils.javaType(_dataType);
        _builder.append(_javaType, "	");
        _builder.append("  attr");
        String _name_3 = attr.getName();
        _builder.append(_name_3, "	");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
