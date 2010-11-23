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
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getAttType <em>Att Type</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getDataType <em>Data Type</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getRwType <em>Rw Type</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getDisplayLevel <em>Display Level</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getPolledPeriod <em>Polled Period</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMaxX <em>Max X</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMaxY <em>Max Y</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMemorized <em>Memorized</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMemorizedAtInit <em>Memorized At Init</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getChangeEvent <em>Change Event</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getArchiveEvent <em>Archive Event</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getProperties <em>Properties</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getAllocReadMember <em>Alloc Read Member</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getIsDynamic <em>Is Dynamic</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getReadExcludedStates <em>Read Excluded States</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getWriteExcludedStates <em>Write Excluded States</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Att Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att Type</em>' attribute.
   * @see #setAttType(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_AttType()
   * @model
   * @generated
   */
  String getAttType();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getAttType <em>Att Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Att Type</em>' attribute.
   * @see #getAttType()
   * @generated
   */
  void setAttType(String value);

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' containment reference.
   * @see #setDataType(Type)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_DataType()
   * @model containment="true"
   * @generated
   */
  Type getDataType();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getDataType <em>Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' containment reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(Type value);

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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_RwType()
   * @model
   * @generated
   */
  String getRwType();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getRwType <em>Rw Type</em>}' attribute.
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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_DisplayLevel()
   * @model
   * @generated
   */
  String getDisplayLevel();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getDisplayLevel <em>Display Level</em>}' attribute.
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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_PolledPeriod()
   * @model
   * @generated
   */
  String getPolledPeriod();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getPolledPeriod <em>Polled Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Polled Period</em>' attribute.
   * @see #getPolledPeriod()
   * @generated
   */
  void setPolledPeriod(String value);

  /**
   * Returns the value of the '<em><b>Max X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max X</em>' attribute.
   * @see #setMaxX(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_MaxX()
   * @model
   * @generated
   */
  String getMaxX();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMaxX <em>Max X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max X</em>' attribute.
   * @see #getMaxX()
   * @generated
   */
  void setMaxX(String value);

  /**
   * Returns the value of the '<em><b>Max Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Y</em>' attribute.
   * @see #setMaxY(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_MaxY()
   * @model
   * @generated
   */
  String getMaxY();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMaxY <em>Max Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Y</em>' attribute.
   * @see #getMaxY()
   * @generated
   */
  void setMaxY(String value);

  /**
   * Returns the value of the '<em><b>Memorized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memorized</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memorized</em>' attribute.
   * @see #setMemorized(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_Memorized()
   * @model
   * @generated
   */
  String getMemorized();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMemorized <em>Memorized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Memorized</em>' attribute.
   * @see #getMemorized()
   * @generated
   */
  void setMemorized(String value);

  /**
   * Returns the value of the '<em><b>Memorized At Init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memorized At Init</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memorized At Init</em>' attribute.
   * @see #setMemorizedAtInit(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_MemorizedAtInit()
   * @model
   * @generated
   */
  String getMemorizedAtInit();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMemorizedAtInit <em>Memorized At Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Memorized At Init</em>' attribute.
   * @see #getMemorizedAtInit()
   * @generated
   */
  void setMemorizedAtInit(String value);

  /**
   * Returns the value of the '<em><b>Change Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Change Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change Event</em>' containment reference.
   * @see #setChangeEvent(FireEvents)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_ChangeEvent()
   * @model containment="true"
   * @generated
   */
  FireEvents getChangeEvent();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getChangeEvent <em>Change Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Change Event</em>' containment reference.
   * @see #getChangeEvent()
   * @generated
   */
  void setChangeEvent(FireEvents value);

  /**
   * Returns the value of the '<em><b>Archive Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Archive Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Archive Event</em>' containment reference.
   * @see #setArchiveEvent(FireEvents)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_ArchiveEvent()
   * @model containment="true"
   * @generated
   */
  FireEvents getArchiveEvent();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getArchiveEvent <em>Archive Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Archive Event</em>' containment reference.
   * @see #getArchiveEvent()
   * @generated
   */
  void setArchiveEvent(FireEvents value);

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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_Status()
   * @model containment="true"
   * @generated
   */
  InheritanceStatus getStatus();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getStatus <em>Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' containment reference.
   * @see #getStatus()
   * @generated
   */
  void setStatus(InheritanceStatus value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(AttrProperties)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_Properties()
   * @model containment="true"
   * @generated
   */
  AttrProperties getProperties();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(AttrProperties value);

  /**
   * Returns the value of the '<em><b>Alloc Read Member</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alloc Read Member</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alloc Read Member</em>' attribute.
   * @see #setAllocReadMember(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_AllocReadMember()
   * @model
   * @generated
   */
  String getAllocReadMember();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getAllocReadMember <em>Alloc Read Member</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alloc Read Member</em>' attribute.
   * @see #getAllocReadMember()
   * @generated
   */
  void setAllocReadMember(String value);

  /**
   * Returns the value of the '<em><b>Is Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Dynamic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Dynamic</em>' attribute.
   * @see #setIsDynamic(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_IsDynamic()
   * @model
   * @generated
   */
  String getIsDynamic();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getIsDynamic <em>Is Dynamic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Dynamic</em>' attribute.
   * @see #getIsDynamic()
   * @generated
   */
  void setIsDynamic(String value);

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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_ReadExcludedStates()
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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getAttribute_WriteExcludedStates()
   * @model unique="false"
   * @generated
   */
  EList<String> getWriteExcludedStates();

} // Attribute
