/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Command#getName <em>Name</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Command#getArgin <em>Argin</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Command#getArgout <em>Argout</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Command#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Command#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Command#getExecMethod <em>Exec Method</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Command#getDisplayLevel <em>Display Level</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Command#getPolledPeriod <em>Polled Period</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Command#getExcludedStates <em>Excluded States</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getCommand_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Command#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Argin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argin</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argin</em>' containment reference.
   * @see #setArgin(Argument)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getCommand_Argin()
   * @model containment="true"
   * @generated
   */
  Argument getArgin();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Command#getArgin <em>Argin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argin</em>' containment reference.
   * @see #getArgin()
   * @generated
   */
  void setArgin(Argument value);

  /**
   * Returns the value of the '<em><b>Argout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argout</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argout</em>' containment reference.
   * @see #setArgout(Argument)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getCommand_Argout()
   * @model containment="true"
   * @generated
   */
  Argument getArgout();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Command#getArgout <em>Argout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argout</em>' containment reference.
   * @see #getArgout()
   * @generated
   */
  void setArgout(Argument value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getCommand_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Command#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' containment reference.
   * @see #setStatus(InheritanceStatus)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getCommand_Status()
   * @model containment="true"
   * @generated
   */
  InheritanceStatus getStatus();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Command#getStatus <em>Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' containment reference.
   * @see #getStatus()
   * @generated
   */
  void setStatus(InheritanceStatus value);

  /**
   * Returns the value of the '<em><b>Exec Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exec Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exec Method</em>' attribute.
   * @see #setExecMethod(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getCommand_ExecMethod()
   * @model
   * @generated
   */
  String getExecMethod();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Command#getExecMethod <em>Exec Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exec Method</em>' attribute.
   * @see #getExecMethod()
   * @generated
   */
  void setExecMethod(String value);

  /**
   * Returns the value of the '<em><b>Display Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display Level</em>' attribute.
   * @see #setDisplayLevel(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getCommand_DisplayLevel()
   * @model
   * @generated
   */
  String getDisplayLevel();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Command#getDisplayLevel <em>Display Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Level</em>' attribute.
   * @see #getDisplayLevel()
   * @generated
   */
  void setDisplayLevel(String value);

  /**
   * Returns the value of the '<em><b>Polled Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Polled Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Polled Period</em>' attribute.
   * @see #setPolledPeriod(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getCommand_PolledPeriod()
   * @model
   * @generated
   */
  String getPolledPeriod();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Command#getPolledPeriod <em>Polled Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Polled Period</em>' attribute.
   * @see #getPolledPeriod()
   * @generated
   */
  void setPolledPeriod(String value);

  /**
   * Returns the value of the '<em><b>Excluded States</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Excluded States</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Excluded States</em>' attribute list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getCommand_ExcludedStates()
   * @model unique="false"
   * @generated
   */
  EList<String> getExcludedStates();

} // Command
