/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.Comments#getCommandsTable <em>Commands Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getComments()
 * @model
 * @generated
 */
public interface Comments extends EObject
{
  /**
   * Returns the value of the '<em><b>Commands Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands Table</em>' attribute.
   * @see #setCommandsTable(String)
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#getComments_CommandsTable()
   * @model
   * @generated
   */
  String getCommandsTable();

  /**
   * Sets the value of the '{@link fr.esrf.tango.pogo.pogoDsl.Comments#getCommandsTable <em>Commands Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commands Table</em>' attribute.
   * @see #getCommandsTable()
   * @generated
   */
  void setCommandsTable(String value);

} // Comments
