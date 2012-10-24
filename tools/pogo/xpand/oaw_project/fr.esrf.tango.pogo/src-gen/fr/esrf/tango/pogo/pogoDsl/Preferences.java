/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getDocHome <em>Doc Home</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getMakefileHome <em>Makefile Home</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getInstallHome <em>Install Home</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getHtmlVersion <em>Html Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPreferences()
 * @model
 * @generated
 */
public interface Preferences extends EObject
{
  /**
   * Returns the value of the '<em><b>Doc Home</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc Home</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc Home</em>' attribute.
   * @see #setDocHome(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPreferences_DocHome()
   * @model
   * @generated
   */
  String getDocHome();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getDocHome <em>Doc Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc Home</em>' attribute.
   * @see #getDocHome()
   * @generated
   */
  void setDocHome(String value);

  /**
   * Returns the value of the '<em><b>Makefile Home</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Makefile Home</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Makefile Home</em>' attribute.
   * @see #setMakefileHome(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPreferences_MakefileHome()
   * @model
   * @generated
   */
  String getMakefileHome();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getMakefileHome <em>Makefile Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Makefile Home</em>' attribute.
   * @see #getMakefileHome()
   * @generated
   */
  void setMakefileHome(String value);

  /**
   * Returns the value of the '<em><b>Install Home</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Install Home</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Install Home</em>' attribute.
   * @see #setInstallHome(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPreferences_InstallHome()
   * @model
   * @generated
   */
  String getInstallHome();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getInstallHome <em>Install Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Install Home</em>' attribute.
   * @see #getInstallHome()
   * @generated
   */
  void setInstallHome(String value);

  /**
   * Returns the value of the '<em><b>Html Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Html Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Html Version</em>' attribute.
   * @see #setHtmlVersion(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPreferences_HtmlVersion()
   * @model
   * @generated
   */
  String getHtmlVersion();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getHtmlVersion <em>Html Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Html Version</em>' attribute.
   * @see #getHtmlVersion()
   * @generated
   */
  void setHtmlVersion(String value);

} // Preferences
