package fr.esrf.tango.pogo;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class Extensions {
  @Inject
  @Extension
  private IQualifiedNameProvider qfnProvider;
  
  public String loc(final EObject obj) {
    String _xifexpression = null;
    EObject _eContainer = obj.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    if (_notEquals) {
      String _info = this.info(obj);
      String _plus = (_info + "owned by ");
      EObject _eContainer_1 = obj.eContainer();
      String _info_1 = this.info(_eContainer_1);
      _xifexpression = (_plus + _info_1);
    } else {
      _xifexpression = this.info(obj);
    }
    return _xifexpression;
  }
  
  public String info(final EObject obj) {
    final QualifiedName name = this.qfnProvider.getFullyQualifiedName(obj);
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(name, null));
    if (_notEquals) {
      _xifexpression = name.toString();
    } else {
      _xifexpression = "<unnamed>";
    }
    final String dynamicName = _xifexpression;
    EClass _eClass = obj.eClass();
    String _name = _eClass.getName();
    String _plus = ((dynamicName + " [") + _name);
    return (_plus + "]");
  }
}
