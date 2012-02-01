/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.OverlodedPollPeriodObject;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overloded Poll Period Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.OverlodedPollPeriodObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.OverlodedPollPeriodObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.OverlodedPollPeriodObjectImpl#getPollPeriod <em>Poll Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OverlodedPollPeriodObjectImpl extends MinimalEObjectImpl.Container implements OverlodedPollPeriodObject
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getPollPeriod() <em>Poll Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPollPeriod()
   * @generated
   * @ordered
   */
  protected static final String POLL_PERIOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPollPeriod() <em>Poll Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPollPeriod()
   * @generated
   * @ordered
   */
  protected String pollPeriod = POLL_PERIOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OverlodedPollPeriodObjectImpl()
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
    return PogoDslPackage.Literals.OVERLODED_POLL_PERIOD_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPollPeriod()
  {
    return pollPeriod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPollPeriod(String newPollPeriod)
  {
    String oldPollPeriod = pollPeriod;
    pollPeriod = newPollPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__POLL_PERIOD, oldPollPeriod, pollPeriod));
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
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__NAME:
        return getName();
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__TYPE:
        return getType();
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__POLL_PERIOD:
        return getPollPeriod();
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
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__NAME:
        setName((String)newValue);
        return;
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__TYPE:
        setType((String)newValue);
        return;
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__POLL_PERIOD:
        setPollPeriod((String)newValue);
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
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__POLL_PERIOD:
        setPollPeriod(POLL_PERIOD_EDEFAULT);
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
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT__POLL_PERIOD:
        return POLL_PERIOD_EDEFAULT == null ? pollPeriod != null : !POLL_PERIOD_EDEFAULT.equals(pollPeriod);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(", pollPeriod: ");
    result.append(pollPeriod);
    result.append(')');
    return result.toString();
  }

} //OverlodedPollPeriodObjectImpl
