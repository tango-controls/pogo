/**
 */
package fr.esrf.tango.pogo.pogoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.EventCriteria#getRelChange <em>Rel Change</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.EventCriteria#getAbsChange <em>Abs Change</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.EventCriteria#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getEventCriteria()
 * @model
 * @generated
 */
public interface EventCriteria extends EObject
{
  /**
   * Returns the value of the '<em><b>Rel Change</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Change</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Change</em>' attribute.
   * @see #setRelChange(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getEventCriteria_RelChange()
   * @model
   * @generated
   */
  String getRelChange();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.EventCriteria#getRelChange <em>Rel Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel Change</em>' attribute.
   * @see #getRelChange()
   * @generated
   */
  void setRelChange(String value);

  /**
   * Returns the value of the '<em><b>Abs Change</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abs Change</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abs Change</em>' attribute.
   * @see #setAbsChange(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getEventCriteria_AbsChange()
   * @model
   * @generated
   */
  String getAbsChange();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.EventCriteria#getAbsChange <em>Abs Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abs Change</em>' attribute.
   * @see #getAbsChange()
   * @generated
   */
  void setAbsChange(String value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' attribute.
   * @see #setPeriod(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getEventCriteria_Period()
   * @model
   * @generated
   */
  String getPeriod();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.EventCriteria#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(String value);

} // EventCriteria
