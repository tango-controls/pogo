/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fire Events</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.FireEvents#getFire <em>Fire</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.FireEvents#getLibCheckCriteria <em>Lib Check Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getFireEvents()
 * @model
 * @generated
 */
public interface FireEvents extends EObject
{
  /**
   * Returns the value of the '<em><b>Fire</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fire</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fire</em>' attribute.
   * @see #setFire(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getFireEvents_Fire()
   * @model
   * @generated
   */
  String getFire();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.FireEvents#getFire <em>Fire</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fire</em>' attribute.
   * @see #getFire()
   * @generated
   */
  void setFire(String value);

  /**
   * Returns the value of the '<em><b>Lib Check Criteria</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lib Check Criteria</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lib Check Criteria</em>' attribute.
   * @see #setLibCheckCriteria(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getFireEvents_LibCheckCriteria()
   * @model
   * @generated
   */
  String getLibCheckCriteria();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.FireEvents#getLibCheckCriteria <em>Lib Check Criteria</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lib Check Criteria</em>' attribute.
   * @see #getLibCheckCriteria()
   * @generated
   */
  void setLibCheckCriteria(String value);

} // FireEvents
