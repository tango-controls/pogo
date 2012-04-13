/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses;
import fr.esrf.tango.pogo.pogoDsl.Preferences;

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
 * An implementation of the model object '<em><b>Pogo Multi Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoMultiClassesImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoMultiClassesImpl#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoMultiClassesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoMultiClassesImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoMultiClassesImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoMultiClassesImpl#getFilestogenerate <em>Filestogenerate</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoMultiClassesImpl#getPreferences <em>Preferences</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PogoMultiClassesImpl extends MinimalEObjectImpl.Container implements PogoMultiClasses
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
   * The default value of the '{@link #getSourcePath() <em>Source Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcePath()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourcePath() <em>Source Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcePath()
   * @generated
   * @ordered
   */
  protected String sourcePath = SOURCE_PATH_EDEFAULT;

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
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<OneClassSimpleDef> classes;

  /**
   * The default value of the '{@link #getFilestogenerate() <em>Filestogenerate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilestogenerate()
   * @generated
   * @ordered
   */
  protected static final String FILESTOGENERATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilestogenerate() <em>Filestogenerate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilestogenerate()
   * @generated
   * @ordered
   */
  protected String filestogenerate = FILESTOGENERATE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PogoMultiClassesImpl()
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
    return PogoDslPackage.Literals.POGO_MULTI_CLASSES;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_MULTI_CLASSES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourcePath()
  {
    return sourcePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourcePath(String newSourcePath)
  {
    String oldSourcePath = sourcePath;
    sourcePath = newSourcePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_MULTI_CLASSES__SOURCE_PATH, oldSourcePath, sourcePath));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_MULTI_CLASSES__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_MULTI_CLASSES__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OneClassSimpleDef> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<OneClassSimpleDef>(OneClassSimpleDef.class, this, PogoDslPackage.POGO_MULTI_CLASSES__CLASSES);
    }
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilestogenerate()
  {
    return filestogenerate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilestogenerate(String newFilestogenerate)
  {
    String oldFilestogenerate = filestogenerate;
    filestogenerate = newFilestogenerate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_MULTI_CLASSES__FILESTOGENERATE, oldFilestogenerate, filestogenerate));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_MULTI_CLASSES__PREFERENCES, oldPreferences, newPreferences);
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
        msgs = ((InternalEObject)preferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.POGO_MULTI_CLASSES__PREFERENCES, null, msgs);
      if (newPreferences != null)
        msgs = ((InternalEObject)newPreferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.POGO_MULTI_CLASSES__PREFERENCES, null, msgs);
      msgs = basicSetPreferences(newPreferences, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.POGO_MULTI_CLASSES__PREFERENCES, newPreferences, newPreferences));
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
      case PogoDslPackage.POGO_MULTI_CLASSES__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
      case PogoDslPackage.POGO_MULTI_CLASSES__PREFERENCES:
        return basicSetPreferences(null, msgs);
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
      case PogoDslPackage.POGO_MULTI_CLASSES__NAME:
        return getName();
      case PogoDslPackage.POGO_MULTI_CLASSES__SOURCE_PATH:
        return getSourcePath();
      case PogoDslPackage.POGO_MULTI_CLASSES__DESCRIPTION:
        return getDescription();
      case PogoDslPackage.POGO_MULTI_CLASSES__TITLE:
        return getTitle();
      case PogoDslPackage.POGO_MULTI_CLASSES__CLASSES:
        return getClasses();
      case PogoDslPackage.POGO_MULTI_CLASSES__FILESTOGENERATE:
        return getFilestogenerate();
      case PogoDslPackage.POGO_MULTI_CLASSES__PREFERENCES:
        return getPreferences();
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
      case PogoDslPackage.POGO_MULTI_CLASSES__NAME:
        setName((String)newValue);
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__SOURCE_PATH:
        setSourcePath((String)newValue);
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__TITLE:
        setTitle((String)newValue);
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends OneClassSimpleDef>)newValue);
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__FILESTOGENERATE:
        setFilestogenerate((String)newValue);
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__PREFERENCES:
        setPreferences((Preferences)newValue);
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
      case PogoDslPackage.POGO_MULTI_CLASSES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__SOURCE_PATH:
        setSourcePath(SOURCE_PATH_EDEFAULT);
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__CLASSES:
        getClasses().clear();
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__FILESTOGENERATE:
        setFilestogenerate(FILESTOGENERATE_EDEFAULT);
        return;
      case PogoDslPackage.POGO_MULTI_CLASSES__PREFERENCES:
        setPreferences((Preferences)null);
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
      case PogoDslPackage.POGO_MULTI_CLASSES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PogoDslPackage.POGO_MULTI_CLASSES__SOURCE_PATH:
        return SOURCE_PATH_EDEFAULT == null ? sourcePath != null : !SOURCE_PATH_EDEFAULT.equals(sourcePath);
      case PogoDslPackage.POGO_MULTI_CLASSES__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case PogoDslPackage.POGO_MULTI_CLASSES__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case PogoDslPackage.POGO_MULTI_CLASSES__CLASSES:
        return classes != null && !classes.isEmpty();
      case PogoDslPackage.POGO_MULTI_CLASSES__FILESTOGENERATE:
        return FILESTOGENERATE_EDEFAULT == null ? filestogenerate != null : !FILESTOGENERATE_EDEFAULT.equals(filestogenerate);
      case PogoDslPackage.POGO_MULTI_CLASSES__PREFERENCES:
        return preferences != null;
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
    result.append(", sourcePath: ");
    result.append(sourcePath);
    result.append(", description: ");
    result.append(description);
    result.append(", title: ");
    result.append(title);
    result.append(", filestogenerate: ");
    result.append(filestogenerate);
    result.append(')');
    return result.toString();
  }

} //PogoMultiClassesImpl
