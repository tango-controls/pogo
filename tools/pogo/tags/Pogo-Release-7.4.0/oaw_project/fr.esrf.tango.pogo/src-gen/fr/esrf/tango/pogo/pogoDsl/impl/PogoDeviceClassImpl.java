/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.ClassDescription;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;
import fr.esrf.tango.pogo.pogoDsl.Preferences;
import fr.esrf.tango.pogo.pogoDsl.Property;
import fr.esrf.tango.pogo.pogoDsl.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pogo Device Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getInstitute <em>Institute</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getClassProperties <em>Class Properties</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getDeviceProperties <em>Device Properties</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getDynamicAttributes <em>Dynamic Attributes</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getStates <em>States</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl#getAdditionalFiles <em>Additional Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PogoDeviceClassImpl extends MinimalEObjectImpl.Container implements PogoDeviceClass
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
   * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getBaseClass() <em>Base Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseClass()
   * @generated
   * @ordered
   */
  protected PogoDeviceClass baseClass;

  /**
   * The default value of the '{@link #getInstitute() <em>Institute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstitute()
   * @generated
   * @ordered
   */
  protected static final String INSTITUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInstitute() <em>Institute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstitute()
   * @generated
   * @ordered
   */
  protected String institute = INSTITUTE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected ClassDescription description;

  /**
   * The cached value of the '{@link #getClassProperties() <em>Class Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> classProperties;

  /**
   * The cached value of the '{@link #getDeviceProperties() <em>Device Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> deviceProperties;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command> commands;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getDynamicAttributes() <em>Dynamic Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDynamicAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> dynamicAttributes;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * The cached value of the '{@link #getPreferences() <em>Preferences</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreferences()
   * @generated
   * @ordered
   */
  protected Preferences preferences;

  /**
   * The cached value of the '{@link #getAdditionalFiles() <em>Additional Files</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditionalFiles()
   * @generated
   * @ordered
   */
  protected EList<AdditionalFile> additionalFiles;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PogoDeviceClassImpl()
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
    return PogoDslPackage.Literals.POGO_DEVICE_CLASS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_DEVICE_CLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAbstract()
  {
    return isAbstract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAbstract(boolean newIsAbstract)
  {
    boolean oldIsAbstract = isAbstract;
    isAbstract = newIsAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_DEVICE_CLASS__IS_ABSTRACT, oldIsAbstract, isAbstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PogoDeviceClass getBaseClass()
  {
    if (baseClass != null && baseClass.eIsProxy())
    {
      InternalEObject oldBaseClass = (InternalEObject)baseClass;
      baseClass = (PogoDeviceClass)eResolveProxy(oldBaseClass);
      if (baseClass != oldBaseClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PogoDslPackage.POGO_DEVICE_CLASS__BASE_CLASS, oldBaseClass, baseClass));
      }
    }
    return baseClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PogoDeviceClass basicGetBaseClass()
  {
    return baseClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseClass(PogoDeviceClass newBaseClass)
  {
    PogoDeviceClass oldBaseClass = baseClass;
    baseClass = newBaseClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_DEVICE_CLASS__BASE_CLASS, oldBaseClass, baseClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInstitute()
  {
    return institute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstitute(String newInstitute)
  {
    String oldInstitute = institute;
    institute = newInstitute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_DEVICE_CLASS__INSTITUTE, oldInstitute, institute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDescription getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(ClassDescription newDescription, NotificationChain msgs)
  {
    ClassDescription oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_DEVICE_CLASS__DESCRIPTION, oldDescription, newDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(ClassDescription newDescription)
  {
    if (newDescription != description)
    {
      NotificationChain msgs = null;
      if (description != null)
        msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.POGO_DEVICE_CLASS__DESCRIPTION, null, msgs);
      if (newDescription != null)
        msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.POGO_DEVICE_CLASS__DESCRIPTION, null, msgs);
      msgs = basicSetDescription(newDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_DEVICE_CLASS__DESCRIPTION, newDescription, newDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getClassProperties()
  {
    if (classProperties == null)
    {
      classProperties = new EObjectContainmentEList<Property>(Property.class, this, PogoDslPackage.POGO_DEVICE_CLASS__CLASS_PROPERTIES);
    }
    return classProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getDeviceProperties()
  {
    if (deviceProperties == null)
    {
      deviceProperties = new EObjectContainmentEList<Property>(Property.class, this, PogoDslPackage.POGO_DEVICE_CLASS__DEVICE_PROPERTIES);
    }
    return deviceProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<Command>(Command.class, this, PogoDslPackage.POGO_DEVICE_CLASS__COMMANDS);
    }
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, PogoDslPackage.POGO_DEVICE_CLASS__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getDynamicAttributes()
  {
    if (dynamicAttributes == null)
    {
      dynamicAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, PogoDslPackage.POGO_DEVICE_CLASS__DYNAMIC_ATTRIBUTES);
    }
    return dynamicAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, PogoDslPackage.POGO_DEVICE_CLASS__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Preferences getPreferences()
  {
    return preferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreferences(Preferences newPreferences, NotificationChain msgs)
  {
    Preferences oldPreferences = preferences;
    preferences = newPreferences;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_DEVICE_CLASS__PREFERENCES, oldPreferences, newPreferences);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreferences(Preferences newPreferences)
  {
    if (newPreferences != preferences)
    {
      NotificationChain msgs = null;
      if (preferences != null)
        msgs = ((InternalEObject)preferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.POGO_DEVICE_CLASS__PREFERENCES, null, msgs);
      if (newPreferences != null)
        msgs = ((InternalEObject)newPreferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.POGO_DEVICE_CLASS__PREFERENCES, null, msgs);
      msgs = basicSetPreferences(newPreferences, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_DEVICE_CLASS__PREFERENCES, newPreferences, newPreferences));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AdditionalFile> getAdditionalFiles()
  {
    if (additionalFiles == null)
    {
      additionalFiles = new EObjectContainmentEList<AdditionalFile>(AdditionalFile.class, this, PogoDslPackage.POGO_DEVICE_CLASS__ADDITIONAL_FILES);
    }
    return additionalFiles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PogoDslPackage.POGO_DEVICE_CLASS__DESCRIPTION:
        return basicSetDescription(null, msgs);
      case PogoDslPackage.POGO_DEVICE_CLASS__CLASS_PROPERTIES:
        return ((InternalEList<?>)getClassProperties()).basicRemove(otherEnd, msgs);
      case PogoDslPackage.POGO_DEVICE_CLASS__DEVICE_PROPERTIES:
        return ((InternalEList<?>)getDeviceProperties()).basicRemove(otherEnd, msgs);
      case PogoDslPackage.POGO_DEVICE_CLASS__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
      case PogoDslPackage.POGO_DEVICE_CLASS__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case PogoDslPackage.POGO_DEVICE_CLASS__DYNAMIC_ATTRIBUTES:
        return ((InternalEList<?>)getDynamicAttributes()).basicRemove(otherEnd, msgs);
      case PogoDslPackage.POGO_DEVICE_CLASS__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case PogoDslPackage.POGO_DEVICE_CLASS__PREFERENCES:
        return basicSetPreferences(null, msgs);
      case PogoDslPackage.POGO_DEVICE_CLASS__ADDITIONAL_FILES:
        return ((InternalEList<?>)getAdditionalFiles()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PogoDslPackage.POGO_DEVICE_CLASS__NAME:
        return getName();
      case PogoDslPackage.POGO_DEVICE_CLASS__IS_ABSTRACT:
        return isIsAbstract();
      case PogoDslPackage.POGO_DEVICE_CLASS__BASE_CLASS:
        if (resolve) return getBaseClass();
        return basicGetBaseClass();
      case PogoDslPackage.POGO_DEVICE_CLASS__INSTITUTE:
        return getInstitute();
      case PogoDslPackage.POGO_DEVICE_CLASS__DESCRIPTION:
        return getDescription();
      case PogoDslPackage.POGO_DEVICE_CLASS__CLASS_PROPERTIES:
        return getClassProperties();
      case PogoDslPackage.POGO_DEVICE_CLASS__DEVICE_PROPERTIES:
        return getDeviceProperties();
      case PogoDslPackage.POGO_DEVICE_CLASS__COMMANDS:
        return getCommands();
      case PogoDslPackage.POGO_DEVICE_CLASS__ATTRIBUTES:
        return getAttributes();
      case PogoDslPackage.POGO_DEVICE_CLASS__DYNAMIC_ATTRIBUTES:
        return getDynamicAttributes();
      case PogoDslPackage.POGO_DEVICE_CLASS__STATES:
        return getStates();
      case PogoDslPackage.POGO_DEVICE_CLASS__PREFERENCES:
        return getPreferences();
      case PogoDslPackage.POGO_DEVICE_CLASS__ADDITIONAL_FILES:
        return getAdditionalFiles();
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
      case PogoDslPackage.POGO_DEVICE_CLASS__NAME:
        setName((String)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__IS_ABSTRACT:
        setIsAbstract((Boolean)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__BASE_CLASS:
        setBaseClass((PogoDeviceClass)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__INSTITUTE:
        setInstitute((String)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__DESCRIPTION:
        setDescription((ClassDescription)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__CLASS_PROPERTIES:
        getClassProperties().clear();
        getClassProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__DEVICE_PROPERTIES:
        getDeviceProperties().clear();
        getDeviceProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends Command>)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__DYNAMIC_ATTRIBUTES:
        getDynamicAttributes().clear();
        getDynamicAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__PREFERENCES:
        setPreferences((Preferences)newValue);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__ADDITIONAL_FILES:
        getAdditionalFiles().clear();
        getAdditionalFiles().addAll((Collection<? extends AdditionalFile>)newValue);
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
      case PogoDslPackage.POGO_DEVICE_CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__IS_ABSTRACT:
        setIsAbstract(IS_ABSTRACT_EDEFAULT);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__BASE_CLASS:
        setBaseClass((PogoDeviceClass)null);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__INSTITUTE:
        setInstitute(INSTITUTE_EDEFAULT);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__DESCRIPTION:
        setDescription((ClassDescription)null);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__CLASS_PROPERTIES:
        getClassProperties().clear();
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__DEVICE_PROPERTIES:
        getDeviceProperties().clear();
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__COMMANDS:
        getCommands().clear();
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__ATTRIBUTES:
        getAttributes().clear();
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__DYNAMIC_ATTRIBUTES:
        getDynamicAttributes().clear();
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__STATES:
        getStates().clear();
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__PREFERENCES:
        setPreferences((Preferences)null);
        return;
      case PogoDslPackage.POGO_DEVICE_CLASS__ADDITIONAL_FILES:
        getAdditionalFiles().clear();
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
      case PogoDslPackage.POGO_DEVICE_CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PogoDslPackage.POGO_DEVICE_CLASS__IS_ABSTRACT:
        return isAbstract != IS_ABSTRACT_EDEFAULT;
      case PogoDslPackage.POGO_DEVICE_CLASS__BASE_CLASS:
        return baseClass != null;
      case PogoDslPackage.POGO_DEVICE_CLASS__INSTITUTE:
        return INSTITUTE_EDEFAULT == null ? institute != null : !INSTITUTE_EDEFAULT.equals(institute);
      case PogoDslPackage.POGO_DEVICE_CLASS__DESCRIPTION:
        return description != null;
      case PogoDslPackage.POGO_DEVICE_CLASS__CLASS_PROPERTIES:
        return classProperties != null && !classProperties.isEmpty();
      case PogoDslPackage.POGO_DEVICE_CLASS__DEVICE_PROPERTIES:
        return deviceProperties != null && !deviceProperties.isEmpty();
      case PogoDslPackage.POGO_DEVICE_CLASS__COMMANDS:
        return commands != null && !commands.isEmpty();
      case PogoDslPackage.POGO_DEVICE_CLASS__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case PogoDslPackage.POGO_DEVICE_CLASS__DYNAMIC_ATTRIBUTES:
        return dynamicAttributes != null && !dynamicAttributes.isEmpty();
      case PogoDslPackage.POGO_DEVICE_CLASS__STATES:
        return states != null && !states.isEmpty();
      case PogoDslPackage.POGO_DEVICE_CLASS__PREFERENCES:
        return preferences != null;
      case PogoDslPackage.POGO_DEVICE_CLASS__ADDITIONAL_FILES:
        return additionalFiles != null && !additionalFiles.isEmpty();
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
    result.append(", isAbstract: ");
    result.append(isAbstract);
    result.append(", institute: ");
    result.append(institute);
    result.append(')');
    return result.toString();
  }

} //PogoDeviceClassImpl
