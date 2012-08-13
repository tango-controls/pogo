/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.InheritanceStatus;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inheritance Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.InheritanceStatusImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.InheritanceStatusImpl#getInherited <em>Inherited</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.InheritanceStatusImpl#getConcrete <em>Concrete</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.InheritanceStatusImpl#getConcreteHere <em>Concrete Here</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.InheritanceStatusImpl#getHasChanged <em>Has Changed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InheritanceStatusImpl extends MinimalEObjectImpl.Container implements InheritanceStatus
{
  /**
   * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract()
   * @generated
   * @ordered
   */
  protected static final String ABSTRACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract()
   * @generated
   * @ordered
   */
  protected String abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #getInherited() <em>Inherited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInherited()
   * @generated
   * @ordered
   */
  protected static final String INHERITED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInherited() <em>Inherited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInherited()
   * @generated
   * @ordered
   */
  protected String inherited = INHERITED_EDEFAULT;

  /**
   * The default value of the '{@link #getConcrete() <em>Concrete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcrete()
   * @generated
   * @ordered
   */
  protected static final String CONCRETE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConcrete() <em>Concrete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcrete()
   * @generated
   * @ordered
   */
  protected String concrete = CONCRETE_EDEFAULT;

  /**
   * The default value of the '{@link #getConcreteHere() <em>Concrete Here</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteHere()
   * @generated
   * @ordered
   */
  protected static final String CONCRETE_HERE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConcreteHere() <em>Concrete Here</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteHere()
   * @generated
   * @ordered
   */
  protected String concreteHere = CONCRETE_HERE_EDEFAULT;

  /**
   * The default value of the '{@link #getHasChanged() <em>Has Changed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasChanged()
   * @generated
   * @ordered
   */
  protected static final String HAS_CHANGED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHasChanged() <em>Has Changed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasChanged()
   * @generated
   * @ordered
   */
  protected String hasChanged = HAS_CHANGED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InheritanceStatusImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PogoDslPackage.Literals.INHERITANCE_STATUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(String newAbstract)
  {
    String oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.INHERITANCE_STATUS__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInherited()
  {
    return inherited;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInherited(String newInherited)
  {
    String oldInherited = inherited;
    inherited = newInherited;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.INHERITANCE_STATUS__INHERITED, oldInherited, inherited));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConcrete()
  {
    return concrete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcrete(String newConcrete)
  {
    String oldConcrete = concrete;
    concrete = newConcrete;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.INHERITANCE_STATUS__CONCRETE, oldConcrete, concrete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConcreteHere()
  {
    return concreteHere;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcreteHere(String newConcreteHere)
  {
    String oldConcreteHere = concreteHere;
    concreteHere = newConcreteHere;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.INHERITANCE_STATUS__CONCRETE_HERE, oldConcreteHere, concreteHere));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHasChanged()
  {
    return hasChanged;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasChanged(String newHasChanged)
  {
    String oldHasChanged = hasChanged;
    hasChanged = newHasChanged;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.INHERITANCE_STATUS__HAS_CHANGED, oldHasChanged, hasChanged));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PogoDslPackage.INHERITANCE_STATUS__ABSTRACT:
        return getAbstract();
      case PogoDslPackage.INHERITANCE_STATUS__INHERITED:
        return getInherited();
      case PogoDslPackage.INHERITANCE_STATUS__CONCRETE:
        return getConcrete();
      case PogoDslPackage.INHERITANCE_STATUS__CONCRETE_HERE:
        return getConcreteHere();
      case PogoDslPackage.INHERITANCE_STATUS__HAS_CHANGED:
        return getHasChanged();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PogoDslPackage.INHERITANCE_STATUS__ABSTRACT:
        setAbstract((String)newValue);
        return;
      case PogoDslPackage.INHERITANCE_STATUS__INHERITED:
        setInherited((String)newValue);
        return;
      case PogoDslPackage.INHERITANCE_STATUS__CONCRETE:
        setConcrete((String)newValue);
        return;
      case PogoDslPackage.INHERITANCE_STATUS__CONCRETE_HERE:
        setConcreteHere((String)newValue);
        return;
      case PogoDslPackage.INHERITANCE_STATUS__HAS_CHANGED:
        setHasChanged((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PogoDslPackage.INHERITANCE_STATUS__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case PogoDslPackage.INHERITANCE_STATUS__INHERITED:
        setInherited(INHERITED_EDEFAULT);
        return;
      case PogoDslPackage.INHERITANCE_STATUS__CONCRETE:
        setConcrete(CONCRETE_EDEFAULT);
        return;
      case PogoDslPackage.INHERITANCE_STATUS__CONCRETE_HERE:
        setConcreteHere(CONCRETE_HERE_EDEFAULT);
        return;
      case PogoDslPackage.INHERITANCE_STATUS__HAS_CHANGED:
        setHasChanged(HAS_CHANGED_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PogoDslPackage.INHERITANCE_STATUS__ABSTRACT:
        return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
      case PogoDslPackage.INHERITANCE_STATUS__INHERITED:
        return INHERITED_EDEFAULT == null ? inherited != null : !INHERITED_EDEFAULT.equals(inherited);
      case PogoDslPackage.INHERITANCE_STATUS__CONCRETE:
        return CONCRETE_EDEFAULT == null ? concrete != null : !CONCRETE_EDEFAULT.equals(concrete);
      case PogoDslPackage.INHERITANCE_STATUS__CONCRETE_HERE:
        return CONCRETE_HERE_EDEFAULT == null ? concreteHere != null : !CONCRETE_HERE_EDEFAULT.equals(concreteHere);
      case PogoDslPackage.INHERITANCE_STATUS__HAS_CHANGED:
        return HAS_CHANGED_EDEFAULT == null ? hasChanged != null : !HAS_CHANGED_EDEFAULT.equals(hasChanged);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(", inherited: ");
    result.append(inherited);
    result.append(", concrete: ");
    result.append(concrete);
    result.append(", concreteHere: ");
    result.append(concreteHere);
    result.append(", hasChanged: ");
    result.append(hasChanged);
    result.append(')');
    return result.toString();
  }

} //InheritanceStatusImpl
