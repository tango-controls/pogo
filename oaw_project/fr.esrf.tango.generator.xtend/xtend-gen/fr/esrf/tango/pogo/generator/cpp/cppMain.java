package fr.esrf.tango.pogo.generator.cpp;

import com.google.inject.Inject;
import fr.esrf.tango.pogo.generator.cpp.HeaderDevice;
import fr.esrf.tango.pogo.pogoDsl.ClassDescription;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;

@SuppressWarnings("all")
public class cppMain implements IGenerator {
  @Inject
  private HeaderDevice _headerDevice;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<PogoDeviceClass> _filter = IterableExtensions.<PogoDeviceClass>filter(_allContentsIterable, fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass.class);
    for (final PogoDeviceClass cls : _filter) {
      ClassDescription _description = cls.getDescription();
      String _language = _description.getLanguage();
      String _lowerCase = _language.toLowerCase();
      boolean _equals = _lowerCase.equals("cpp");
      if (_equals) {
        String _name = cls.getName();
        String _operator_plus = StringExtensions.operator_plus(_name, ".h");
        CharSequence _generateDeviceHeaderFile = this._headerDevice.generateDeviceHeaderFile(cls);
        fsa.generateFile(_operator_plus, _generateDeviceHeaderFile);
      }
    }
  }
}
