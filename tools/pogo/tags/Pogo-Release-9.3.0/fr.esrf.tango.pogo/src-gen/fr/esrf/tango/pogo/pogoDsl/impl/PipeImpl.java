/**
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.Pipe;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PipeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PipeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PipeImpl#getRwType <em>Rw Type</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PipeImpl#getDisplayLevel <em>Display Level</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PipeImpl#getReadExcludedStates <em>Read Excluded States</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PipeImpl#getWriteExcludedStates <em>Write Excluded States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PipeImpl extends MinimalEObjectImpl.Container implements Pipe
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getRwType() <em>Rw Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRwType()
   * @generated
   * @ordered
   */
  protected static final String RW_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRwType() <em>Rw Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRwType()
   * @generated
   * @ordered
   */
  protected String rwType = RW_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDisplayLevel() <em>Display Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayLevel()
   * @generated
   * @ordered
   */
  protected static final String DISPLAY_LEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDisplayLevel() <em>Display Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayLevel()
   * @generated
   * @ordered
   */
  protected String displayLevel = DISPLAY_LEVEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getReadExcludedStates() <em>Read Excluded States</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadExcludedStates()
   * @generated
   * @ordered
   */
  protected EList<String> readExcludedStates;

  /**
   * The cached value of the '{@link #getWriteExcludedStates() <em>Write Excluded States</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWriteExcludedStates()
   * @generated
   * @ordered
   */
  protected EList<String> writeExcludedStates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PipeImpl()
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
    return PogoDslPackage.Literals.PIPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.PIPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.PIPE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.PIPE__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRwType()
  {
    return rwType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRwType(String newRwType)
  {
    String oldRwType = rwType;
    rwType = newRwType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.PIPE__RW_TYPE, oldRwType, rwType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDisplayLevel()
  {
    return displayLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayLevel(String newDisplayLevel)
  {
    String oldDisplayLevel = displayLevel;
    displayLevel = newDisplayLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.PIPE__DISPLAY_LEVEL, oldDisplayLevel, displayLevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getReadExcludedStates()
  {
    if (readExcludedStates == null)
    {
      readExcludedStates = new EDataTypeEList<String>(String.class, this, PogoDslPackage.PIPE__READ_EXCLUDED_STATES);
    }
    return readExcludedStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getWriteExcludedStates()
  {
    if (writeExcludedStates == null)
    {
      writeExcludedStates = new EDataTypeEList<String>(String.class, this, PogoDslPackage.PIPE__WRITE_EXCLUDED_STATES);
    }
    return writeExcludedStates;
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
      case PogoDslPackage.PIPE__NAME:
        return getName();
      case PogoDslPackage.PIPE__DESCRIPTION:
        return getDescription();
      case PogoDslPackage.PIPE__LABEL:
        return getLabel();
      case PogoDslPackage.PIPE__RW_TYPE:
        return getRwType();
      case PogoDslPackage.PIPE__DISPLAY_LEVEL:
        return getDisplayLevel();
      case PogoDslPackage.PIPE__READ_EXCLUDED_STATES:
        return getReadExcludedStates();
      case PogoDslPackage.PIPE__WRITE_EXCLUDED_STATES:
        return getWriteExcludedStates();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PogoDslPackage.PIPE__NAME:
        setName((String)newValue);
        return;
      case PogoDslPackage.PIPE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case PogoDslPackage.PIPE__LABEL:
        setLabel((String)newValue);
        return;
      case PogoDslPackage.PIPE__RW_TYPE:
        setRwType((String)newValue);
        return;
      case PogoDslPackage.PIPE__DISPLAY_LEVEL:
        setDisplayLevel((String)newValue);
        return;
      case PogoDslPackage.PIPE__READ_EXCLUDED_STATES:
        getReadExcludedStates().clear();
        getReadExcludedStates().addAll((Collection<? extends String>)newValue);
        return;
      case PogoDslPackage.PIPE__WRITE_EXCLUDED_STATES:
        getWriteExcludedStates().clear();
        getWriteExcludedStates().addAll((Collection<? extends String>)newValue);
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
      case PogoDslPackage.PIPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PogoDslPackage.PIPE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case PogoDslPackage.PIPE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case PogoDslPackage.PIPE__RW_TYPE:
        setRwType(RW_TYPE_EDEFAULT);
        return;
      case PogoDslPackage.PIPE__DISPLAY_LEVEL:
        setDisplayLevel(DISPLAY_LEVEL_EDEFAULT);
        return;
      case PogoDslPackage.PIPE__READ_EXCLUDED_STATES:
        getReadExcludedStates().clear();
        return;
      case PogoDslPackage.PIPE__WRITE_EXCLUDED_STATES:
        getWriteExcludedStates().clear();
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
      case PogoDslPackage.PIPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PogoDslPackage.PIPE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case PogoDslPackage.PIPE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case PogoDslPackage.PIPE__RW_TYPE:
        return RW_TYPE_EDEFAULT == null ? rwType != null : !RW_TYPE_EDEFAULT.equals(rwType);
      case PogoDslPackage.PIPE__DISPLAY_LEVEL:
        return DISPLAY_LEVEL_EDEFAULT == null ? displayLevel != null : !DISPLAY_LEVEL_EDEFAULT.equals(displayLevel);
      case PogoDslPackage.PIPE__READ_EXCLUDED_STATES:
        return readExcludedStates != null && !readExcludedStates.isEmpty();
      case PogoDslPackage.PIPE__WRITE_EXCLUDED_STATES:
        return writeExcludedStates != null && !writeExcludedStates.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", label: ");
    result.append(label);
    result.append(", rwType: ");
    result.append(rwType);
    result.append(", displayLevel: ");
    result.append(displayLevel);
    result.append(", readExcludedStates: ");
    result.append(readExcludedStates);
    result.append(", writeExcludedStates: ");
    result.append(writeExcludedStates);
    result.append(')');
    return result.toString();
  }

} //PipeImpl
