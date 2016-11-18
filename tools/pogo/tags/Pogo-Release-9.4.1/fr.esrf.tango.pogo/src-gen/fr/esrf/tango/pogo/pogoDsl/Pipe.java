/**
 */
package fr.esrf.tango.pogo.pogoDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getName <em>Name</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getRwType <em>Rw Type</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getDisplayLevel <em>Display Level</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getReadExcludedStates <em>Read Excluded States</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getWriteExcludedStates <em>Write Excluded States</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPipe()
 * @model
 * @generated
 */
public interface Pipe extends EObject
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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPipe_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPipe_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPipe_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Rw Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rw Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rw Type</em>' attribute.
   * @see #setRwType(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPipe_RwType()
   * @model
   * @generated
   */
  String getRwType();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getRwType <em>Rw Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rw Type</em>' attribute.
   * @see #getRwType()
   * @generated
   */
  void setRwType(String value);

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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPipe_DisplayLevel()
   * @model
   * @generated
   */
  String getDisplayLevel();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Pipe#getDisplayLevel <em>Display Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Level</em>' attribute.
   * @see #getDisplayLevel()
   * @generated
   */
  void setDisplayLevel(String value);

  /**
   * Returns the value of the '<em><b>Read Excluded States</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Excluded States</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Excluded States</em>' attribute list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPipe_ReadExcludedStates()
   * @model unique="false"
   * @generated
   */
  EList<String> getReadExcludedStates();

  /**
   * Returns the value of the '<em><b>Write Excluded States</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Write Excluded States</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Write Excluded States</em>' attribute list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPipe_WriteExcludedStates()
   * @model unique="false"
   * @generated
   */
  EList<String> getWriteExcludedStates();

} // Pipe
