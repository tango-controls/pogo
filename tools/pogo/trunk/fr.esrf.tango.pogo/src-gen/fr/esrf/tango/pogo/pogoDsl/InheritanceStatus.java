/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getInherited <em>Inherited</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getConcrete <em>Concrete</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getConcreteHere <em>Concrete Here</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getHasChanged <em>Has Changed</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getInheritanceStatus()
 * @model
 * @generated
 */
public interface InheritanceStatus extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getInheritanceStatus_Abstract()
   * @model
   * @generated
   */
  String getAbstract();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #getAbstract()
   * @generated
   */
  void setAbstract(String value);

  /**
   * Returns the value of the '<em><b>Inherited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inherited</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inherited</em>' attribute.
   * @see #setInherited(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getInheritanceStatus_Inherited()
   * @model
   * @generated
   */
  String getInherited();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getInherited <em>Inherited</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inherited</em>' attribute.
   * @see #getInherited()
   * @generated
   */
  void setInherited(String value);

  /**
   * Returns the value of the '<em><b>Concrete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete</em>' attribute.
   * @see #setConcrete(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getInheritanceStatus_Concrete()
   * @model
   * @generated
   */
  String getConcrete();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getConcrete <em>Concrete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete</em>' attribute.
   * @see #getConcrete()
   * @generated
   */
  void setConcrete(String value);

  /**
   * Returns the value of the '<em><b>Concrete Here</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Here</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Here</em>' attribute.
   * @see #setConcreteHere(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getInheritanceStatus_ConcreteHere()
   * @model
   * @generated
   */
  String getConcreteHere();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getConcreteHere <em>Concrete Here</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete Here</em>' attribute.
   * @see #getConcreteHere()
   * @generated
   */
  void setConcreteHere(String value);

  /**
   * Returns the value of the '<em><b>Has Changed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Changed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Changed</em>' attribute.
   * @see #setHasChanged(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getInheritanceStatus_HasChanged()
   * @model
   * @generated
   */
  String getHasChanged();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getHasChanged <em>Has Changed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Changed</em>' attribute.
   * @see #getHasChanged()
   * @generated
   */
  void setHasChanged(String value);

} // InheritanceStatus
