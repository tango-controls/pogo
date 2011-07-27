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
 * A representation of the model object '<em><b>Pogo Device Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getName <em>Name</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getInstitute <em>Institute</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getClassProperties <em>Class Properties</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getDeviceProperties <em>Device Properties</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getCommands <em>Commands</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getDynamicAttributes <em>Dynamic Attributes</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getStates <em>States</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getAdditionalFiles <em>Additional Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass()
 * @model
 * @generated
 */
public interface PogoDeviceClass extends EObject
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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Abstract</em>' attribute.
   * @see #setIsAbstract(boolean)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_IsAbstract()
   * @model
   * @generated
   */
  boolean isIsAbstract();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#isIsAbstract <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Abstract</em>' attribute.
   * @see #isIsAbstract()
   * @generated
   */
  void setIsAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Base Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Class</em>' reference.
   * @see #setBaseClass(PogoDeviceClass)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_BaseClass()
   * @model
   * @generated
   */
  PogoDeviceClass getBaseClass();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getBaseClass <em>Base Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Class</em>' reference.
   * @see #getBaseClass()
   * @generated
   */
  void setBaseClass(PogoDeviceClass value);

  /**
   * Returns the value of the '<em><b>Institute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Institute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Institute</em>' attribute.
   * @see #setInstitute(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_Institute()
   * @model
   * @generated
   */
  String getInstitute();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getInstitute <em>Institute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Institute</em>' attribute.
   * @see #getInstitute()
   * @generated
   */
  void setInstitute(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(ClassDescription)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_Description()
   * @model containment="true"
   * @generated
   */
  ClassDescription getDescription();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(ClassDescription value);

  /**
   * Returns the value of the '<em><b>Class Properties</b></em>' containment reference list.
   * The list contents are of type {@link fr.esrf.tango.pogo.pogoDsl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Properties</em>' containment reference list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_ClassProperties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getClassProperties();

  /**
   * Returns the value of the '<em><b>Device Properties</b></em>' containment reference list.
   * The list contents are of type {@link fr.esrf.tango.pogo.pogoDsl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Properties</em>' containment reference list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_DeviceProperties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getDeviceProperties();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link fr.esrf.tango.pogo.pogoDsl.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link fr.esrf.tango.pogo.pogoDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Dynamic Attributes</b></em>' containment reference list.
   * The list contents are of type {@link fr.esrf.tango.pogo.pogoDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dynamic Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic Attributes</em>' containment reference list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_DynamicAttributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getDynamicAttributes();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link fr.esrf.tango.pogo.pogoDsl.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Preferences</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preferences</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preferences</em>' containment reference.
   * @see #setPreferences(Preferences)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_Preferences()
   * @model containment="true"
   * @generated
   */
  Preferences getPreferences();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getPreferences <em>Preferences</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preferences</em>' containment reference.
   * @see #getPreferences()
   * @generated
   */
  void setPreferences(Preferences value);

  /**
   * Returns the value of the '<em><b>Additional Files</b></em>' containment reference list.
   * The list contents are of type {@link fr.esrf.tango.pogo.pogoDsl.AdditionalFile}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additional Files</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additional Files</em>' containment reference list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoDeviceClass_AdditionalFiles()
   * @model containment="true"
   * @generated
   */
  EList<AdditionalFile> getAdditionalFiles();

} // PogoDeviceClass
