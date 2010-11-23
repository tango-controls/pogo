/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.Argument;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.InheritanceStatus;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl#getArgin <em>Argin</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl#getArgout <em>Argout</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl#getExecMethod <em>Exec Method</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl#getDisplayLevel <em>Display Level</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl#getPolledPeriod <em>Polled Period</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl#getExcludedStates <em>Excluded States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command
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
   * The cached value of the '{@link #getArgin() <em>Argin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgin()
   * @generated
   * @ordered
   */
  protected Argument argin;

  /**
   * The cached value of the '{@link #getArgout() <em>Argout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgout()
   * @generated
   * @ordered
   */
  protected Argument argout;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected InheritanceStatus status;

  /**
   * The default value of the '{@link #getExecMethod() <em>Exec Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecMethod()
   * @generated
   * @ordered
   */
  protected static final String EXEC_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExecMethod() <em>Exec Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecMethod()
   * @generated
   * @ordered
   */
  protected String execMethod = EXEC_METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getDisplayLevel() <em>Display Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayLevel()
   * @generated
   * @ordered
   */
  protected static final String DISPLAY_LEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDisplayLevel() <em>Display Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayLevel()
   * @generated
   * @ordered
   */
  protected String displayLevel = DISPLAY_LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #getPolledPeriod() <em>Polled Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolledPeriod()
   * @generated
   * @ordered
   */
  protected static final String POLLED_PERIOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPolledPeriod() <em>Polled Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolledPeriod()
   * @generated
   * @ordered
   */
  protected String polledPeriod = POLLED_PERIOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getExcludedStates() <em>Excluded States</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludedStates()
   * @generated
   * @ordered
   */
  protected EList<String> excludedStates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandImpl()
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
    return PogoDslPackage.Literals.COMMAND;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMAND__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getArgin()
  {
    return argin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgin(Argument newArgin, NotificationChain msgs)
  {
    Argument oldArgin = argin;
    argin = newArgin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMAND__ARGIN, oldArgin, newArgin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgin(Argument newArgin)
  {
    if (newArgin != argin)
    {
      NotificationChain msgs = null;
      if (argin != null)
        msgs = ((InternalEObject)argin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.COMMAND__ARGIN, null, msgs);
      if (newArgin != null)
        msgs = ((InternalEObject)newArgin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.COMMAND__ARGIN, null, msgs);
      msgs = basicSetArgin(newArgin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMAND__ARGIN, newArgin, newArgin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getArgout()
  {
    return argout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgout(Argument newArgout, NotificationChain msgs)
  {
    Argument oldArgout = argout;
    argout = newArgout;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMAND__ARGOUT, oldArgout, newArgout);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgout(Argument newArgout)
  {
    if (newArgout != argout)
    {
      NotificationChain msgs = null;
      if (argout != null)
        msgs = ((InternalEObject)argout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.COMMAND__ARGOUT, null, msgs);
      if (newArgout != null)
        msgs = ((InternalEObject)newArgout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.COMMAND__ARGOUT, null, msgs);
      msgs = basicSetArgout(newArgout, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMAND__ARGOUT, newArgout, newArgout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMAND__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InheritanceStatus getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatus(InheritanceStatus newStatus, NotificationChain msgs)
  {
    InheritanceStatus oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMAND__STATUS, oldStatus, newStatus);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(InheritanceStatus newStatus)
  {
    if (newStatus != status)
    {
      NotificationChain msgs = null;
      if (status != null)
        msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.COMMAND__STATUS, null, msgs);
      if (newStatus != null)
        msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.COMMAND__STATUS, null, msgs);
      msgs = basicSetStatus(newStatus, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMAND__STATUS, newStatus, newStatus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExecMethod()
  {
    return execMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecMethod(String newExecMethod)
  {
    String oldExecMethod = execMethod;
    execMethod = newExecMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMAND__EXEC_METHOD, oldExecMethod, execMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDisplayLevel()
  {
    return displayLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayLevel(String newDisplayLevel)
  {
    String oldDisplayLevel = displayLevel;
    displayLevel = newDisplayLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMAND__DISPLAY_LEVEL, oldDisplayLevel, displayLevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPolledPeriod()
  {
    return polledPeriod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolledPeriod(String newPolledPeriod)
  {
    String oldPolledPeriod = polledPeriod;
    polledPeriod = newPolledPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMAND__POLLED_PERIOD, oldPolledPeriod, polledPeriod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getExcludedStates()
  {
    if (excludedStates == null)
    {
      excludedStates = new EDataTypeEList<String>(String.class, this, PogoDslPackage.COMMAND__EXCLUDED_STATES);
    }
    return excludedStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PogoDslPackage.COMMAND__ARGIN:
        return basicSetArgin(null, msgs);
      case PogoDslPackage.COMMAND__ARGOUT:
        return basicSetArgout(null, msgs);
      case PogoDslPackage.COMMAND__STATUS:
        return basicSetStatus(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PogoDslPackage.COMMAND__NAME:
        return getName();
      case PogoDslPackage.COMMAND__ARGIN:
        return getArgin();
      case PogoDslPackage.COMMAND__ARGOUT:
        return getArgout();
      case PogoDslPackage.COMMAND__DESCRIPTION:
        return getDescription();
      case PogoDslPackage.COMMAND__STATUS:
        return getStatus();
      case PogoDslPackage.COMMAND__EXEC_METHOD:
        return getExecMethod();
      case PogoDslPackage.COMMAND__DISPLAY_LEVEL:
        return getDisplayLevel();
      case PogoDslPackage.COMMAND__POLLED_PERIOD:
        return getPolledPeriod();
      case PogoDslPackage.COMMAND__EXCLUDED_STATES:
        return getExcludedStates();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PogoDslPackage.COMMAND__NAME:
        setName((String)newValue);
        return;
      case PogoDslPackage.COMMAND__ARGIN:
        setArgin((Argument)newValue);
        return;
      case PogoDslPackage.COMMAND__ARGOUT:
        setArgout((Argument)newValue);
        return;
      case PogoDslPackage.COMMAND__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case PogoDslPackage.COMMAND__STATUS:
        setStatus((InheritanceStatus)newValue);
        return;
      case PogoDslPackage.COMMAND__EXEC_METHOD:
        setExecMethod((String)newValue);
        return;
      case PogoDslPackage.COMMAND__DISPLAY_LEVEL:
        setDisplayLevel((String)newValue);
        return;
      case PogoDslPackage.COMMAND__POLLED_PERIOD:
        setPolledPeriod((String)newValue);
        return;
      case PogoDslPackage.COMMAND__EXCLUDED_STATES:
        getExcludedStates().clear();
        getExcludedStates().addAll((Collection<? extends String>)newValue);
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
      case PogoDslPackage.COMMAND__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PogoDslPackage.COMMAND__ARGIN:
        setArgin((Argument)null);
        return;
      case PogoDslPackage.COMMAND__ARGOUT:
        setArgout((Argument)null);
        return;
      case PogoDslPackage.COMMAND__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case PogoDslPackage.COMMAND__STATUS:
        setStatus((InheritanceStatus)null);
        return;
      case PogoDslPackage.COMMAND__EXEC_METHOD:
        setExecMethod(EXEC_METHOD_EDEFAULT);
        return;
      case PogoDslPackage.COMMAND__DISPLAY_LEVEL:
        setDisplayLevel(DISPLAY_LEVEL_EDEFAULT);
        return;
      case PogoDslPackage.COMMAND__POLLED_PERIOD:
        setPolledPeriod(POLLED_PERIOD_EDEFAULT);
        return;
      case PogoDslPackage.COMMAND__EXCLUDED_STATES:
        getExcludedStates().clear();
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
      case PogoDslPackage.COMMAND__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PogoDslPackage.COMMAND__ARGIN:
        return argin != null;
      case PogoDslPackage.COMMAND__ARGOUT:
        return argout != null;
      case PogoDslPackage.COMMAND__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case PogoDslPackage.COMMAND__STATUS:
        return status != null;
      case PogoDslPackage.COMMAND__EXEC_METHOD:
        return EXEC_METHOD_EDEFAULT == null ? execMethod != null : !EXEC_METHOD_EDEFAULT.equals(execMethod);
      case PogoDslPackage.COMMAND__DISPLAY_LEVEL:
        return DISPLAY_LEVEL_EDEFAULT == null ? displayLevel != null : !DISPLAY_LEVEL_EDEFAULT.equals(displayLevel);
      case PogoDslPackage.COMMAND__POLLED_PERIOD:
        return POLLED_PERIOD_EDEFAULT == null ? polledPeriod != null : !POLLED_PERIOD_EDEFAULT.equals(polledPeriod);
      case PogoDslPackage.COMMAND__EXCLUDED_STATES:
        return excludedStates != null && !excludedStates.isEmpty();
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
    result.append(", description: ");
    result.append(description);
    result.append(", execMethod: ");
    result.append(execMethod);
    result.append(", displayLevel: ");
    result.append(displayLevel);
    result.append(", polledPeriod: ");
    result.append(polledPeriod);
    result.append(", excludedStates: ");
    result.append(excludedStates);
    result.append(')');
    return result.toString();
  }

} //CommandImpl
