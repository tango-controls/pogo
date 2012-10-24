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
 * A representation of the model object '<em><b>Pogo Multi Classes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getName <em>Name</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getClasses <em>Classes</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getFilestogenerate <em>Filestogenerate</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getPreferences <em>Preferences</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoMultiClasses()
 * @model
 * @generated
 */
public interface PogoMultiClasses extends EObject
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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoMultiClasses_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Path</em>' attribute.
   * @see #setSourcePath(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoMultiClasses_SourcePath()
   * @model
   * @generated
   */
  String getSourcePath();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getSourcePath <em>Source Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Path</em>' attribute.
   * @see #getSourcePath()
   * @generated
   */
  void setSourcePath(String value);

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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoMultiClasses_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoMultiClasses_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoMultiClasses_Classes()
   * @model containment="true"
   * @generated
   */
  EList<OneClassSimpleDef> getClasses();

  /**
   * Returns the value of the '<em><b>Filestogenerate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filestogenerate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filestogenerate</em>' attribute.
   * @see #setFilestogenerate(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoMultiClasses_Filestogenerate()
   * @model
   * @generated
   */
  String getFilestogenerate();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getFilestogenerate <em>Filestogenerate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filestogenerate</em>' attribute.
   * @see #getFilestogenerate()
   * @generated
   */
  void setFilestogenerate(String value);

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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getPogoMultiClasses_Preferences()
   * @model containment="true"
   * @generated
   */
  Preferences getPreferences();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getPreferences <em>Preferences</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preferences</em>' containment reference.
   * @see #getPreferences()
   * @generated
   */
  void setPreferences(Preferences value);

} // PogoMultiClasses
