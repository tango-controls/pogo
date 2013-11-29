/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.FireEvents;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fire Events</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.FireEventsImpl#getFire <em>Fire</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.FireEventsImpl#getLibCheckCriteria <em>Lib Check Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FireEventsImpl extends MinimalEObjectImpl.Container implements FireEvents
{
  /**
   * The default value of the '{@link #getFire() <em>Fire</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFire()
   * @generated
   * @ordered
   */
  protected static final String FIRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFire() <em>Fire</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFire()
   * @generated
   * @ordered
   */
  protected String fire = FIRE_EDEFAULT;

  /**
   * The default value of the '{@link #getLibCheckCriteria() <em>Lib Check Criteria</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibCheckCriteria()
   * @generated
   * @ordered
   */
  protected static final String LIB_CHECK_CRITERIA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLibCheckCriteria() <em>Lib Check Criteria</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibCheckCriteria()
   * @generated
   * @ordered
   */
  protected String libCheckCriteria = LIB_CHECK_CRITERIA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FireEventsImpl()
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
    return PogoDslPackage.Literals.FIRE_EVENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFire()
  {
    return fire;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFire(String newFire)
  {
    String oldFire = fire;
    fire = newFire;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.FIRE_EVENTS__FIRE, oldFire, fire));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLibCheckCriteria()
  {
    return libCheckCriteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLibCheckCriteria(String newLibCheckCriteria)
  {
    String oldLibCheckCriteria = libCheckCriteria;
    libCheckCriteria = newLibCheckCriteria;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.FIRE_EVENTS__LIB_CHECK_CRITERIA, oldLibCheckCriteria, libCheckCriteria));
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
      case PogoDslPackage.FIRE_EVENTS__FIRE:
        return getFire();
      case PogoDslPackage.FIRE_EVENTS__LIB_CHECK_CRITERIA:
        return getLibCheckCriteria();
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
      case PogoDslPackage.FIRE_EVENTS__FIRE:
        setFire((String)newValue);
        return;
      case PogoDslPackage.FIRE_EVENTS__LIB_CHECK_CRITERIA:
        setLibCheckCriteria((String)newValue);
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
      case PogoDslPackage.FIRE_EVENTS__FIRE:
        setFire(FIRE_EDEFAULT);
        return;
      case PogoDslPackage.FIRE_EVENTS__LIB_CHECK_CRITERIA:
        setLibCheckCriteria(LIB_CHECK_CRITERIA_EDEFAULT);
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
      case PogoDslPackage.FIRE_EVENTS__FIRE:
        return FIRE_EDEFAULT == null ? fire != null : !FIRE_EDEFAULT.equals(fire);
      case PogoDslPackage.FIRE_EVENTS__LIB_CHECK_CRITERIA:
        return LIB_CHECK_CRITERIA_EDEFAULT == null ? libCheckCriteria != null : !LIB_CHECK_CRITERIA_EDEFAULT.equals(libCheckCriteria);
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
    result.append(" (fire: ");
    result.append(fire);
    result.append(", libCheckCriteria: ");
    result.append(libCheckCriteria);
    result.append(')');
    return result.toString();
  }

} //FireEventsImpl
