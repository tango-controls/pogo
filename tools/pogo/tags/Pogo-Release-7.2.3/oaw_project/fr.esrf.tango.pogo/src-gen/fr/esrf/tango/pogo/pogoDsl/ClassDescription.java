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
 * A representation of the model object '<em><b>Class Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getInheritances <em>Inheritances</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getLanguage <em>Language</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getFilestogenerate <em>Filestogenerate</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getIdentification <em>Identification</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getComments <em>Comments</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasAbstractCommand <em>Has Abstract Command</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasAbstractAttribute <em>Has Abstract Attribute</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasDynamicAttribute <em>Has Dynamic Attribute</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getDescriptionHtmlExists <em>Description Html Exists</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription()
 * @model
 * @generated
 */
public interface ClassDescription extends EObject
{
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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getDescription <em>Description</em>}' attribute.
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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_SourcePath()
   * @model
   * @generated
   */
  String getSourcePath();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getSourcePath <em>Source Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Path</em>' attribute.
   * @see #getSourcePath()
   * @generated
   */
  void setSourcePath(String value);

  /**
   * Returns the value of the '<em><b>Inheritances</b></em>' containment reference list.
   * The list contents are of type {@link fr.esrf.tango.pogo.pogoDsl.Inheritance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inheritances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritances</em>' containment reference list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_Inheritances()
   * @model containment="true"
   * @generated
   */
  EList<Inheritance> getInheritances();

  /**
   * Returns the value of the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' attribute.
   * @see #setLanguage(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_Language()
   * @model
   * @generated
   */
  String getLanguage();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getLanguage <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' attribute.
   * @see #getLanguage()
   * @generated
   */
  void setLanguage(String value);

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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_Filestogenerate()
   * @model
   * @generated
   */
  String getFilestogenerate();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getFilestogenerate <em>Filestogenerate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filestogenerate</em>' attribute.
   * @see #getFilestogenerate()
   * @generated
   */
  void setFilestogenerate(String value);

  /**
   * Returns the value of the '<em><b>Identification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identification</em>' containment reference.
   * @see #setIdentification(ClassIdentification)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_Identification()
   * @model containment="true"
   * @generated
   */
  ClassIdentification getIdentification();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getIdentification <em>Identification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identification</em>' containment reference.
   * @see #getIdentification()
   * @generated
   */
  void setIdentification(ClassIdentification value);

  /**
   * Returns the value of the '<em><b>Comments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' containment reference.
   * @see #setComments(Comments)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_Comments()
   * @model containment="true"
   * @generated
   */
  Comments getComments();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getComments <em>Comments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comments</em>' containment reference.
   * @see #getComments()
   * @generated
   */
  void setComments(Comments value);

  /**
   * Returns the value of the '<em><b>Has Abstract Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Abstract Command</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Abstract Command</em>' attribute.
   * @see #setHasAbstractCommand(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_HasAbstractCommand()
   * @model
   * @generated
   */
  String getHasAbstractCommand();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasAbstractCommand <em>Has Abstract Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Abstract Command</em>' attribute.
   * @see #getHasAbstractCommand()
   * @generated
   */
  void setHasAbstractCommand(String value);

  /**
   * Returns the value of the '<em><b>Has Abstract Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Abstract Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Abstract Attribute</em>' attribute.
   * @see #setHasAbstractAttribute(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_HasAbstractAttribute()
   * @model
   * @generated
   */
  String getHasAbstractAttribute();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasAbstractAttribute <em>Has Abstract Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Abstract Attribute</em>' attribute.
   * @see #getHasAbstractAttribute()
   * @generated
   */
  void setHasAbstractAttribute(String value);

  /**
   * Returns the value of the '<em><b>Has Dynamic Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Dynamic Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Dynamic Attribute</em>' attribute.
   * @see #setHasDynamicAttribute(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_HasDynamicAttribute()
   * @model
   * @generated
   */
  String getHasDynamicAttribute();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasDynamicAttribute <em>Has Dynamic Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Dynamic Attribute</em>' attribute.
   * @see #getHasDynamicAttribute()
   * @generated
   */
  void setHasDynamicAttribute(String value);

  /**
   * Returns the value of the '<em><b>Description Html Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description Html Exists</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description Html Exists</em>' attribute.
   * @see #setDescriptionHtmlExists(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getClassDescription_DescriptionHtmlExists()
   * @model
   * @generated
   */
  String getDescriptionHtmlExists();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getDescriptionHtmlExists <em>Description Html Exists</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description Html Exists</em>' attribute.
   * @see #getDescriptionHtmlExists()
   * @generated
   */
  void setDescriptionHtmlExists(String value);

} // ClassDescription
