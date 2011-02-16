/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;
import fr.esrf.tango.pogo.pogoDsl.Preferences;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PreferencesImpl#getDocHome <em>Doc Home</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PreferencesImpl#getMakefileHome <em>Makefile Home</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PreferencesImpl#getInstallHome <em>Install Home</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PreferencesImpl#getHtmlVersion <em>Html Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreferencesImpl extends MinimalEObjectImpl.Container implements Preferences
{
  /**
   * The default value of the '{@link #getDocHome() <em>Doc Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocHome()
   * @generated
   * @ordered
   */
  protected static final String DOC_HOME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocHome() <em>Doc Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocHome()
   * @generated
   * @ordered
   */
  protected String docHome = DOC_HOME_EDEFAULT;

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
   * The default value of the '{@link #getHtmlVersion() <em>Html Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHtmlVersion()
   * @generated
   * @ordered
   */
  protected static final String HTML_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHtmlVersion() <em>Html Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHtmlVersion()
   * @generated
   * @ordered
   */
  protected String htmlVersion = HTML_VERSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreferencesImpl()
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
    return PogoDslPackage.Literals.PREFERENCES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocHome()
  {
    return docHome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocHome(String newDocHome)
  {
    String oldDocHome = docHome;
    docHome = newDocHome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.PREFERENCES__DOC_HOME, oldDocHome, docHome));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.PREFERENCES__MAKEFILE_HOME, oldMakefileHome, makefileHome));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.PREFERENCES__INSTALL_HOME, oldInstallHome, installHome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHtmlVersion()
  {
    return htmlVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHtmlVersion(String newHtmlVersion)
  {
    String oldHtmlVersion = htmlVersion;
    htmlVersion = newHtmlVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.PREFERENCES__HTML_VERSION, oldHtmlVersion, htmlVersion));
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
      case PogoDslPackage.PREFERENCES__DOC_HOME:
        return getDocHome();
      case PogoDslPackage.PREFERENCES__MAKEFILE_HOME:
        return getMakefileHome();
      case PogoDslPackage.PREFERENCES__INSTALL_HOME:
        return getInstallHome();
      case PogoDslPackage.PREFERENCES__HTML_VERSION:
        return getHtmlVersion();
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
      case PogoDslPackage.PREFERENCES__DOC_HOME:
        setDocHome((String)newValue);
        return;
      case PogoDslPackage.PREFERENCES__MAKEFILE_HOME:
        setMakefileHome((String)newValue);
        return;
      case PogoDslPackage.PREFERENCES__INSTALL_HOME:
        setInstallHome((String)newValue);
        return;
      case PogoDslPackage.PREFERENCES__HTML_VERSION:
        setHtmlVersion((String)newValue);
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
      case PogoDslPackage.PREFERENCES__DOC_HOME:
        setDocHome(DOC_HOME_EDEFAULT);
        return;
      case PogoDslPackage.PREFERENCES__MAKEFILE_HOME:
        setMakefileHome(MAKEFILE_HOME_EDEFAULT);
        return;
      case PogoDslPackage.PREFERENCES__INSTALL_HOME:
        setInstallHome(INSTALL_HOME_EDEFAULT);
        return;
      case PogoDslPackage.PREFERENCES__HTML_VERSION:
        setHtmlVersion(HTML_VERSION_EDEFAULT);
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
      case PogoDslPackage.PREFERENCES__DOC_HOME:
        return DOC_HOME_EDEFAULT == null ? docHome != null : !DOC_HOME_EDEFAULT.equals(docHome);
      case PogoDslPackage.PREFERENCES__MAKEFILE_HOME:
        return MAKEFILE_HOME_EDEFAULT == null ? makefileHome != null : !MAKEFILE_HOME_EDEFAULT.equals(makefileHome);
      case PogoDslPackage.PREFERENCES__INSTALL_HOME:
        return INSTALL_HOME_EDEFAULT == null ? installHome != null : !INSTALL_HOME_EDEFAULT.equals(installHome);
      case PogoDslPackage.PREFERENCES__HTML_VERSION:
        return HTML_VERSION_EDEFAULT == null ? htmlVersion != null : !HTML_VERSION_EDEFAULT.equals(htmlVersion);
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
    result.append(" (docHome: ");
    result.append(docHome);
    result.append(", makefileHome: ");
    result.append(makefileHome);
    result.append(", installHome: ");
    result.append(installHome);
    result.append(", htmlVersion: ");
    result.append(htmlVersion);
    result.append(')');
    return result.toString();
  }

} //PreferencesImpl
