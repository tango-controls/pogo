/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.Comments;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.CommentsImpl#getHtmlInheritance <em>Html Inheritance</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.CommentsImpl#getCommandsTable <em>Commands Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentsImpl extends MinimalEObjectImpl.Container implements Comments
{
  /**
   * The default value of the '{@link #getHtmlInheritance() <em>Html Inheritance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHtmlInheritance()
   * @generated
   * @ordered
   */
  protected static final String HTML_INHERITANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHtmlInheritance() <em>Html Inheritance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHtmlInheritance()
   * @generated
   * @ordered
   */
  protected String htmlInheritance = HTML_INHERITANCE_EDEFAULT;

  /**
   * The default value of the '{@link #getCommandsTable() <em>Commands Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandsTable()
   * @generated
   * @ordered
   */
  protected static final String COMMANDS_TABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCommandsTable() <em>Commands Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandsTable()
   * @generated
   * @ordered
   */
  protected String commandsTable = COMMANDS_TABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommentsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PogoDslPackage.Literals.COMMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHtmlInheritance()
  {
    return htmlInheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHtmlInheritance(String newHtmlInheritance)
  {
    String oldHtmlInheritance = htmlInheritance;
    htmlInheritance = newHtmlInheritance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMENTS__HTML_INHERITANCE, oldHtmlInheritance, htmlInheritance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCommandsTable()
  {
    return commandsTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommandsTable(String newCommandsTable)
  {
    String oldCommandsTable = commandsTable;
    commandsTable = newCommandsTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.COMMENTS__COMMANDS_TABLE, oldCommandsTable, commandsTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PogoDslPackage.COMMENTS__HTML_INHERITANCE:
        return getHtmlInheritance();
      case PogoDslPackage.COMMENTS__COMMANDS_TABLE:
        return getCommandsTable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PogoDslPackage.COMMENTS__HTML_INHERITANCE:
        setHtmlInheritance((String)newValue);
        return;
      case PogoDslPackage.COMMENTS__COMMANDS_TABLE:
        setCommandsTable((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PogoDslPackage.COMMENTS__HTML_INHERITANCE:
        setHtmlInheritance(HTML_INHERITANCE_EDEFAULT);
        return;
      case PogoDslPackage.COMMENTS__COMMANDS_TABLE:
        setCommandsTable(COMMANDS_TABLE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PogoDslPackage.COMMENTS__HTML_INHERITANCE:
        return HTML_INHERITANCE_EDEFAULT == null ? htmlInheritance != null : !HTML_INHERITANCE_EDEFAULT.equals(htmlInheritance);
      case PogoDslPackage.COMMENTS__COMMANDS_TABLE:
        return COMMANDS_TABLE_EDEFAULT == null ? commandsTable != null : !COMMANDS_TABLE_EDEFAULT.equals(commandsTable);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (htmlInheritance: ");
    result.append(htmlInheritance);
    result.append(", commandsTable: ");
    result.append(commandsTable);
    result.append(')');
    return result.toString();
  }

} //CommentsImpl
