/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.AttrProperties;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attr Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getStandardUnit <em>Standard Unit</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getDisplayUnit <em>Display Unit</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getMaxAlarm <em>Max Alarm</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getMinAlarm <em>Min Alarm</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getMaxWarning <em>Max Warning</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getMinWarning <em>Min Warning</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getDeltaTime <em>Delta Time</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl#getDeltaValue <em>Delta Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttrPropertiesImpl extends MinimalEObjectImpl.Container implements AttrProperties
{
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
   * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected static final String UNIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected String unit = UNIT_EDEFAULT;

  /**
   * The default value of the '{@link #getStandardUnit() <em>Standard Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStandardUnit()
   * @generated
   * @ordered
   */
  protected static final String STANDARD_UNIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStandardUnit() <em>Standard Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStandardUnit()
   * @generated
   * @ordered
   */
  protected String standardUnit = STANDARD_UNIT_EDEFAULT;

  /**
   * The default value of the '{@link #getDisplayUnit() <em>Display Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayUnit()
   * @generated
   * @ordered
   */
  protected static final String DISPLAY_UNIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDisplayUnit() <em>Display Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayUnit()
   * @generated
   * @ordered
   */
  protected String displayUnit = DISPLAY_UNIT_EDEFAULT;

  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected String format = FORMAT_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxValue()
   * @generated
   * @ordered
   */
  protected static final String MAX_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxValue()
   * @generated
   * @ordered
   */
  protected String maxValue = MAX_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinValue()
   * @generated
   * @ordered
   */
  protected static final String MIN_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinValue()
   * @generated
   * @ordered
   */
  protected String minValue = MIN_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxAlarm() <em>Max Alarm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxAlarm()
   * @generated
   * @ordered
   */
  protected static final String MAX_ALARM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaxAlarm() <em>Max Alarm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxAlarm()
   * @generated
   * @ordered
   */
  protected String maxAlarm = MAX_ALARM_EDEFAULT;

  /**
   * The default value of the '{@link #getMinAlarm() <em>Min Alarm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinAlarm()
   * @generated
   * @ordered
   */
  protected static final String MIN_ALARM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinAlarm() <em>Min Alarm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinAlarm()
   * @generated
   * @ordered
   */
  protected String minAlarm = MIN_ALARM_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxWarning() <em>Max Warning</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxWarning()
   * @generated
   * @ordered
   */
  protected static final String MAX_WARNING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaxWarning() <em>Max Warning</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxWarning()
   * @generated
   * @ordered
   */
  protected String maxWarning = MAX_WARNING_EDEFAULT;

  /**
   * The default value of the '{@link #getMinWarning() <em>Min Warning</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinWarning()
   * @generated
   * @ordered
   */
  protected static final String MIN_WARNING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinWarning() <em>Min Warning</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinWarning()
   * @generated
   * @ordered
   */
  protected String minWarning = MIN_WARNING_EDEFAULT;

  /**
   * The default value of the '{@link #getDeltaTime() <em>Delta Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeltaTime()
   * @generated
   * @ordered
   */
  protected static final String DELTA_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeltaTime() <em>Delta Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeltaTime()
   * @generated
   * @ordered
   */
  protected String deltaTime = DELTA_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getDeltaValue() <em>Delta Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeltaValue()
   * @generated
   * @ordered
   */
  protected static final String DELTA_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeltaValue() <em>Delta Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeltaValue()
   * @generated
   * @ordered
   */
  protected String deltaValue = DELTA_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttrPropertiesImpl()
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
    return PogoDslPackage.Literals.ATTR_PROPERTIES;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnit(String newUnit)
  {
    String oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__UNIT, oldUnit, unit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStandardUnit()
  {
    return standardUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStandardUnit(String newStandardUnit)
  {
    String oldStandardUnit = standardUnit;
    standardUnit = newStandardUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__STANDARD_UNIT, oldStandardUnit, standardUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDisplayUnit()
  {
    return displayUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayUnit(String newDisplayUnit)
  {
    String oldDisplayUnit = displayUnit;
    displayUnit = newDisplayUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__DISPLAY_UNIT, oldDisplayUnit, displayUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(String newFormat)
  {
    String oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__FORMAT, oldFormat, format));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMaxValue()
  {
    return maxValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxValue(String newMaxValue)
  {
    String oldMaxValue = maxValue;
    maxValue = newMaxValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__MAX_VALUE, oldMaxValue, maxValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinValue()
  {
    return minValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinValue(String newMinValue)
  {
    String oldMinValue = minValue;
    minValue = newMinValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__MIN_VALUE, oldMinValue, minValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMaxAlarm()
  {
    return maxAlarm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxAlarm(String newMaxAlarm)
  {
    String oldMaxAlarm = maxAlarm;
    maxAlarm = newMaxAlarm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__MAX_ALARM, oldMaxAlarm, maxAlarm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinAlarm()
  {
    return minAlarm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinAlarm(String newMinAlarm)
  {
    String oldMinAlarm = minAlarm;
    minAlarm = newMinAlarm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__MIN_ALARM, oldMinAlarm, minAlarm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMaxWarning()
  {
    return maxWarning;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxWarning(String newMaxWarning)
  {
    String oldMaxWarning = maxWarning;
    maxWarning = newMaxWarning;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__MAX_WARNING, oldMaxWarning, maxWarning));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinWarning()
  {
    return minWarning;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinWarning(String newMinWarning)
  {
    String oldMinWarning = minWarning;
    minWarning = newMinWarning;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__MIN_WARNING, oldMinWarning, minWarning));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeltaTime()
  {
    return deltaTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeltaTime(String newDeltaTime)
  {
    String oldDeltaTime = deltaTime;
    deltaTime = newDeltaTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__DELTA_TIME, oldDeltaTime, deltaTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeltaValue()
  {
    return deltaValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeltaValue(String newDeltaValue)
  {
    String oldDeltaValue = deltaValue;
    deltaValue = newDeltaValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ATTR_PROPERTIES__DELTA_VALUE, oldDeltaValue, deltaValue));
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
      case PogoDslPackage.ATTR_PROPERTIES__DESCRIPTION:
        return getDescription();
      case PogoDslPackage.ATTR_PROPERTIES__LABEL:
        return getLabel();
      case PogoDslPackage.ATTR_PROPERTIES__UNIT:
        return getUnit();
      case PogoDslPackage.ATTR_PROPERTIES__STANDARD_UNIT:
        return getStandardUnit();
      case PogoDslPackage.ATTR_PROPERTIES__DISPLAY_UNIT:
        return getDisplayUnit();
      case PogoDslPackage.ATTR_PROPERTIES__FORMAT:
        return getFormat();
      case PogoDslPackage.ATTR_PROPERTIES__MAX_VALUE:
        return getMaxValue();
      case PogoDslPackage.ATTR_PROPERTIES__MIN_VALUE:
        return getMinValue();
      case PogoDslPackage.ATTR_PROPERTIES__MAX_ALARM:
        return getMaxAlarm();
      case PogoDslPackage.ATTR_PROPERTIES__MIN_ALARM:
        return getMinAlarm();
      case PogoDslPackage.ATTR_PROPERTIES__MAX_WARNING:
        return getMaxWarning();
      case PogoDslPackage.ATTR_PROPERTIES__MIN_WARNING:
        return getMinWarning();
      case PogoDslPackage.ATTR_PROPERTIES__DELTA_TIME:
        return getDeltaTime();
      case PogoDslPackage.ATTR_PROPERTIES__DELTA_VALUE:
        return getDeltaValue();
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
      case PogoDslPackage.ATTR_PROPERTIES__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__LABEL:
        setLabel((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__UNIT:
        setUnit((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__STANDARD_UNIT:
        setStandardUnit((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__DISPLAY_UNIT:
        setDisplayUnit((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__FORMAT:
        setFormat((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MAX_VALUE:
        setMaxValue((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MIN_VALUE:
        setMinValue((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MAX_ALARM:
        setMaxAlarm((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MIN_ALARM:
        setMinAlarm((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MAX_WARNING:
        setMaxWarning((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MIN_WARNING:
        setMinWarning((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__DELTA_TIME:
        setDeltaTime((String)newValue);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__DELTA_VALUE:
        setDeltaValue((String)newValue);
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
      case PogoDslPackage.ATTR_PROPERTIES__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__UNIT:
        setUnit(UNIT_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__STANDARD_UNIT:
        setStandardUnit(STANDARD_UNIT_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__DISPLAY_UNIT:
        setDisplayUnit(DISPLAY_UNIT_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MAX_VALUE:
        setMaxValue(MAX_VALUE_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MIN_VALUE:
        setMinValue(MIN_VALUE_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MAX_ALARM:
        setMaxAlarm(MAX_ALARM_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MIN_ALARM:
        setMinAlarm(MIN_ALARM_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MAX_WARNING:
        setMaxWarning(MAX_WARNING_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__MIN_WARNING:
        setMinWarning(MIN_WARNING_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__DELTA_TIME:
        setDeltaTime(DELTA_TIME_EDEFAULT);
        return;
      case PogoDslPackage.ATTR_PROPERTIES__DELTA_VALUE:
        setDeltaValue(DELTA_VALUE_EDEFAULT);
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
      case PogoDslPackage.ATTR_PROPERTIES__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case PogoDslPackage.ATTR_PROPERTIES__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case PogoDslPackage.ATTR_PROPERTIES__UNIT:
        return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
      case PogoDslPackage.ATTR_PROPERTIES__STANDARD_UNIT:
        return STANDARD_UNIT_EDEFAULT == null ? standardUnit != null : !STANDARD_UNIT_EDEFAULT.equals(standardUnit);
      case PogoDslPackage.ATTR_PROPERTIES__DISPLAY_UNIT:
        return DISPLAY_UNIT_EDEFAULT == null ? displayUnit != null : !DISPLAY_UNIT_EDEFAULT.equals(displayUnit);
      case PogoDslPackage.ATTR_PROPERTIES__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
      case PogoDslPackage.ATTR_PROPERTIES__MAX_VALUE:
        return MAX_VALUE_EDEFAULT == null ? maxValue != null : !MAX_VALUE_EDEFAULT.equals(maxValue);
      case PogoDslPackage.ATTR_PROPERTIES__MIN_VALUE:
        return MIN_VALUE_EDEFAULT == null ? minValue != null : !MIN_VALUE_EDEFAULT.equals(minValue);
      case PogoDslPackage.ATTR_PROPERTIES__MAX_ALARM:
        return MAX_ALARM_EDEFAULT == null ? maxAlarm != null : !MAX_ALARM_EDEFAULT.equals(maxAlarm);
      case PogoDslPackage.ATTR_PROPERTIES__MIN_ALARM:
        return MIN_ALARM_EDEFAULT == null ? minAlarm != null : !MIN_ALARM_EDEFAULT.equals(minAlarm);
      case PogoDslPackage.ATTR_PROPERTIES__MAX_WARNING:
        return MAX_WARNING_EDEFAULT == null ? maxWarning != null : !MAX_WARNING_EDEFAULT.equals(maxWarning);
      case PogoDslPackage.ATTR_PROPERTIES__MIN_WARNING:
        return MIN_WARNING_EDEFAULT == null ? minWarning != null : !MIN_WARNING_EDEFAULT.equals(minWarning);
      case PogoDslPackage.ATTR_PROPERTIES__DELTA_TIME:
        return DELTA_TIME_EDEFAULT == null ? deltaTime != null : !DELTA_TIME_EDEFAULT.equals(deltaTime);
      case PogoDslPackage.ATTR_PROPERTIES__DELTA_VALUE:
        return DELTA_VALUE_EDEFAULT == null ? deltaValue != null : !DELTA_VALUE_EDEFAULT.equals(deltaValue);
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
    result.append(" (description: ");
    result.append(description);
    result.append(", label: ");
    result.append(label);
    result.append(", unit: ");
    result.append(unit);
    result.append(", standardUnit: ");
    result.append(standardUnit);
    result.append(", displayUnit: ");
    result.append(displayUnit);
    result.append(", format: ");
    result.append(format);
    result.append(", maxValue: ");
    result.append(maxValue);
    result.append(", minValue: ");
    result.append(minValue);
    result.append(", maxAlarm: ");
    result.append(maxAlarm);
    result.append(", minAlarm: ");
    result.append(minAlarm);
    result.append(", maxWarning: ");
    result.append(maxWarning);
    result.append(", minWarning: ");
    result.append(minWarning);
    result.append(", deltaTime: ");
    result.append(deltaTime);
    result.append(", deltaValue: ");
    result.append(deltaValue);
    result.append(')');
    return result.toString();
  }

} //AttrPropertiesImpl
