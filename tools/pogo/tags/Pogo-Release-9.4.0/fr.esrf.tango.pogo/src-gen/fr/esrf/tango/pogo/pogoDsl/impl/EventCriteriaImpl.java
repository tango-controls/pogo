/**
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.EventCriteria;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.EventCriteriaImpl#getRelChange <em>Rel Change</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.EventCriteriaImpl#getAbsChange <em>Abs Change</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.EventCriteriaImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventCriteriaImpl extends MinimalEObjectImpl.Container implements EventCriteria
{
  /**
   * The default value of the '{@link #getRelChange() <em>Rel Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelChange()
   * @generated
   * @ordered
   */
  protected static final String REL_CHANGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelChange() <em>Rel Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelChange()
   * @generated
   * @ordered
   */
  protected String relChange = REL_CHANGE_EDEFAULT;

  /**
   * The default value of the '{@link #getAbsChange() <em>Abs Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsChange()
   * @generated
   * @ordered
   */
  protected static final String ABS_CHANGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbsChange() <em>Abs Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsChange()
   * @generated
   * @ordered
   */
  protected String absChange = ABS_CHANGE_EDEFAULT;

  /**
   * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected static final String PERIOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriod()
   * @generated
   * @ordered
   */
  protected String period = PERIOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventCriteriaImpl()
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
    return PogoDslPackage.Literals.EVENT_CRITERIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelChange()
  {
    return relChange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelChange(String newRelChange)
  {
    String oldRelChange = relChange;
    relChange = newRelChange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.EVENT_CRITERIA__REL_CHANGE, oldRelChange, relChange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbsChange()
  {
    return absChange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbsChange(String newAbsChange)
  {
    String oldAbsChange = absChange;
    absChange = newAbsChange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.EVENT_CRITERIA__ABS_CHANGE, oldAbsChange, absChange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPeriod()
  {
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPeriod(String newPeriod)
  {
    String oldPeriod = period;
    period = newPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.EVENT_CRITERIA__PERIOD, oldPeriod, period));
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
      case PogoDslPackage.EVENT_CRITERIA__REL_CHANGE:
        return getRelChange();
      case PogoDslPackage.EVENT_CRITERIA__ABS_CHANGE:
        return getAbsChange();
      case PogoDslPackage.EVENT_CRITERIA__PERIOD:
        return getPeriod();
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
      case PogoDslPackage.EVENT_CRITERIA__REL_CHANGE:
        setRelChange((String)newValue);
        return;
      case PogoDslPackage.EVENT_CRITERIA__ABS_CHANGE:
        setAbsChange((String)newValue);
        return;
      case PogoDslPackage.EVENT_CRITERIA__PERIOD:
        setPeriod((String)newValue);
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
      case PogoDslPackage.EVENT_CRITERIA__REL_CHANGE:
        setRelChange(REL_CHANGE_EDEFAULT);
        return;
      case PogoDslPackage.EVENT_CRITERIA__ABS_CHANGE:
        setAbsChange(ABS_CHANGE_EDEFAULT);
        return;
      case PogoDslPackage.EVENT_CRITERIA__PERIOD:
        setPeriod(PERIOD_EDEFAULT);
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
      case PogoDslPackage.EVENT_CRITERIA__REL_CHANGE:
        return REL_CHANGE_EDEFAULT == null ? relChange != null : !REL_CHANGE_EDEFAULT.equals(relChange);
      case PogoDslPackage.EVENT_CRITERIA__ABS_CHANGE:
        return ABS_CHANGE_EDEFAULT == null ? absChange != null : !ABS_CHANGE_EDEFAULT.equals(absChange);
      case PogoDslPackage.EVENT_CRITERIA__PERIOD:
        return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
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
    result.append(" (relChange: ");
    result.append(relChange);
    result.append(", absChange: ");
    result.append(absChange);
    result.append(", period: ");
    result.append(period);
    result.append(')');
    return result.toString();
  }

} //EventCriteriaImpl
