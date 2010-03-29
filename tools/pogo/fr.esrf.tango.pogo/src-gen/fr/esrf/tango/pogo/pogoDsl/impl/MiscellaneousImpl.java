/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.Miscellaneous;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Miscellaneous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.MiscellaneousImpl#getMakefileHome <em>Makefile Home</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.MiscellaneousImpl#getInstallHome <em>Install Home</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MiscellaneousImpl extends MinimalEObjectImpl.Container implements Miscellaneous
{
  /**
   * The default value of the '{@link #getMakefileHome() <em>Makefile Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMakefileHome()
   * @generated
   * @ordered
   */
  protected static final String MAKEFILE_HOME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMakefileHome() <em>Makefile Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMakefileHome()
   * @generated
   * @ordered
   */
  protected String makefileHome = MAKEFILE_HOME_EDEFAULT;

  /**
   * The default value of the '{@link #getInstallHome() <em>Install Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstallHome()
   * @generated
   * @ordered
   */
  protected static final String INSTALL_HOME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInstallHome() <em>Install Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstallHome()
   * @generated
   * @ordered
   */
  protected String installHome = INSTALL_HOME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MiscellaneousImpl()
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
    return PogoDslPackage.Literals.MISCELLANEOUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMakefileHome()
  {
    return makefileHome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMakefileHome(String newMakefileHome)
  {
    String oldMakefileHome = makefileHome;
    makefileHome = newMakefileHome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.MISCELLANEOUS__MAKEFILE_HOME, oldMakefileHome, makefileHome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInstallHome()
  {
    return installHome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstallHome(String newInstallHome)
  {
    String oldInstallHome = installHome;
    installHome = newInstallHome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.MISCELLANEOUS__INSTALL_HOME, oldInstallHome, installHome));
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
      case PogoDslPackage.MISCELLANEOUS__MAKEFILE_HOME:
        return getMakefileHome();
      case PogoDslPackage.MISCELLANEOUS__INSTALL_HOME:
        return getInstallHome();
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
      case PogoDslPackage.MISCELLANEOUS__MAKEFILE_HOME:
        setMakefileHome((String)newValue);
        return;
      case PogoDslPackage.MISCELLANEOUS__INSTALL_HOME:
        setInstallHome((String)newValue);
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
      case PogoDslPackage.MISCELLANEOUS__MAKEFILE_HOME:
        setMakefileHome(MAKEFILE_HOME_EDEFAULT);
        return;
      case PogoDslPackage.MISCELLANEOUS__INSTALL_HOME:
        setInstallHome(INSTALL_HOME_EDEFAULT);
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
      case PogoDslPackage.MISCELLANEOUS__MAKEFILE_HOME:
        return MAKEFILE_HOME_EDEFAULT == null ? makefileHome != null : !MAKEFILE_HOME_EDEFAULT.equals(makefileHome);
      case PogoDslPackage.MISCELLANEOUS__INSTALL_HOME:
        return INSTALL_HOME_EDEFAULT == null ? installHome != null : !INSTALL_HOME_EDEFAULT.equals(installHome);
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
    result.append(" (makefileHome: ");
    result.append(makefileHome);
    result.append(", installHome: ");
    result.append(installHome);
    result.append(')');
    return result.toString();
  }

} //MiscellaneousImpl
