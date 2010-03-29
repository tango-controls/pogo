/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Miscellaneous</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Miscellaneous#getMakefileHome <em>Makefile Home</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Miscellaneous#getInstallHome <em>Install Home</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getMiscellaneous()
 * @model
 * @generated
 */
public interface Miscellaneous extends EObject
{
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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getMiscellaneous_MakefileHome()
   * @model
   * @generated
   */
  String getMakefileHome();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Miscellaneous#getMakefileHome <em>Makefile Home</em>}' attribute.
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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getMiscellaneous_InstallHome()
   * @model
   * @generated
   */
  String getInstallHome();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Miscellaneous#getInstallHome <em>Install Home</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Install Home</em>' attribute.
   * @see #getInstallHome()
   * @generated
   */
  void setInstallHome(String value);

} // Miscellaneous
