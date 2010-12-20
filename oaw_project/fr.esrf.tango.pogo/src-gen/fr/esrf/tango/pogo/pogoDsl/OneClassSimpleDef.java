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
 * A representation of the model object '<em><b>One Class Simple Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getClassname <em>Classname</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getPogo6 <em>Pogo6</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getInheritances <em>Inheritances</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getParentClasses <em>Parent Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getOneClassSimpleDef()
 * @model
 * @generated
 */
public interface OneClassSimpleDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' attribute.
   * @see #setClassname(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getOneClassSimpleDef_Classname()
   * @model
   * @generated
   */
  String getClassname();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getClassname <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' attribute.
   * @see #getClassname()
   * @generated
   */
  void setClassname(String value);

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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getOneClassSimpleDef_SourcePath()
   * @model
   * @generated
   */
  String getSourcePath();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getSourcePath <em>Source Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Path</em>' attribute.
   * @see #getSourcePath()
   * @generated
   */
  void setSourcePath(String value);

  /**
   * Returns the value of the '<em><b>Pogo6</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pogo6</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pogo6</em>' attribute.
   * @see #setPogo6(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getOneClassSimpleDef_Pogo6()
   * @model
   * @generated
   */
  String getPogo6();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getPogo6 <em>Pogo6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pogo6</em>' attribute.
   * @see #getPogo6()
   * @generated
   */
  void setPogo6(String value);

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
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getOneClassSimpleDef_Inheritances()
   * @model containment="true"
   * @generated
   */
  EList<Inheritance> getInheritances();

  /**
   * Returns the value of the '<em><b>Parent Classes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Classes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Classes</em>' attribute list.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getOneClassSimpleDef_ParentClasses()
   * @model unique="false"
   * @generated
   */
  EList<String> getParentClasses();

} // OneClassSimpleDef
