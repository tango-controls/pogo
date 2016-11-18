package fr.esrf.tango.pogo;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Extensions {
  
  @Inject
  private IQualifiedNameProvider qfnProvider;
  
  public String loc(final EObject obj) {
    String _xifexpression = null;
    EObject _eContainer = obj.eContainer();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_eContainer, null);
    if (_operator_notEquals) {
      String _info = this.info(obj);
      String _operator_plus = StringExtensions.operator_plus(_info, "owned by ");
      EObject _eContainer_1 = obj.eContainer();
      String _info_1 = this.info(_eContainer_1);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _info_1);
      _xifexpression = _operator_plus_1;
    } else {
      String _info_2 = this.info(obj);
      _xifexpression = _info_2;
    }
    return _xifexpression;
  }
  
  public String info(final EObject obj) {
    {
      QualifiedName _fullyQualifiedName = this.qfnProvider.getFullyQualifiedName(obj);
      final QualifiedName name = _fullyQualifiedName;
      String _xifexpression = null;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(name, null);
      if (_operator_notEquals) {
        String _string = name.toString();
        _xifexpression = _string;
      } else {
        _xifexpression = "<unnamed>";
      }
      final String dynamicName = _xifexpression;
      String _operator_plus = StringExtensions.operator_plus(dynamicName, " [");
      EClass _eClass = obj.eClass();
      String _name = _eClass.getName();
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name);
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "]");
      return _operator_plus_2;
    }
  }
}