/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.ClassDescription;
import fr.esrf.tango.pogo.pogoDsl.ClassIdentification;
import fr.esrf.tango.pogo.pogoDsl.Comments;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

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
 * An implementation of the model object '<em><b>Class Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl#getInheritances <em>Inheritances</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl#getFilestogenerate <em>Filestogenerate</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl#getIdentification <em>Identification</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl#getHasAbstractCommand <em>Has Abstract Command</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl#getHasAbstractAttribute <em>Has Abstract Attribute</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl#getHasDynamicAttribute <em>Has Dynamic Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDescriptionImpl extends MinimalEObjectImpl.Container implements ClassDescription
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
   * The cached value of the '{@link #getInheritances() <em>Inheritances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInheritances()
   * @generated
   * @ordered
   */
  protected EList<Inheritance> inheritances;

  /**
   * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
  protected static final String LANGUAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
  protected String language = LANGUAGE_EDEFAULT;

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
   * The cached value of the '{@link #getIdentification() <em>Identification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentification()
   * @generated
   * @ordered
   */
  protected ClassIdentification identification;

  /**
   * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected Comments comments;

  /**
   * The default value of the '{@link #getHasAbstractCommand() <em>Has Abstract Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasAbstractCommand()
   * @generated
   * @ordered
   */
  protected static final String HAS_ABSTRACT_COMMAND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHasAbstractCommand() <em>Has Abstract Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasAbstractCommand()
   * @generated
   * @ordered
   */
  protected String hasAbstractCommand = HAS_ABSTRACT_COMMAND_EDEFAULT;

  /**
   * The default value of the '{@link #getHasAbstractAttribute() <em>Has Abstract Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasAbstractAttribute()
   * @generated
   * @ordered
   */
  protected static final String HAS_ABSTRACT_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHasAbstractAttribute() <em>Has Abstract Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasAbstractAttribute()
   * @generated
   * @ordered
   */
  protected String hasAbstractAttribute = HAS_ABSTRACT_ATTRIBUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getHasDynamicAttribute() <em>Has Dynamic Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasDynamicAttribute()
   * @generated
   * @ordered
   */
  protected static final String HAS_DYNAMIC_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHasDynamicAttribute() <em>Has Dynamic Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasDynamicAttribute()
   * @generated
   * @ordered
   */
  protected String hasDynamicAttribute = HAS_DYNAMIC_ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassDescriptionImpl()
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
    return PogoDslPackage.Literals.CLASS_DESCRIPTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__TITLE, oldTitle, title));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__SOURCE_PATH, oldSourcePath, sourcePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Inheritance> getInheritances()
  {
    if (inheritances == null)
    {
      inheritances = new EObjectContainmentEList<Inheritance>(Inheritance.class, this, PogoDslPackage.CLASS_DESCRIPTION__INHERITANCES);
    }
    return inheritances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLanguage()
  {
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLanguage(String newLanguage)
  {
    String oldLanguage = language;
    language = newLanguage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__LANGUAGE, oldLanguage, language));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__FILESTOGENERATE, oldFilestogenerate, filestogenerate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassIdentification getIdentification()
  {
    return identification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentification(ClassIdentification newIdentification, NotificationChain msgs)
  {
    ClassIdentification oldIdentification = identification;
    identification = newIdentification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__IDENTIFICATION, oldIdentification, newIdentification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentification(ClassIdentification newIdentification)
  {
    if (newIdentification != identification)
    {
      NotificationChain msgs = null;
      if (identification != null)
        msgs = ((InternalEObject)identification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.CLASS_DESCRIPTION__IDENTIFICATION, null, msgs);
      if (newIdentification != null)
        msgs = ((InternalEObject)newIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.CLASS_DESCRIPTION__IDENTIFICATION, null, msgs);
      msgs = basicSetIdentification(newIdentification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__IDENTIFICATION, newIdentification, newIdentification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comments getComments()
  {
    return comments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComments(Comments newComments, NotificationChain msgs)
  {
    Comments oldComments = comments;
    comments = newComments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__COMMENTS, oldComments, newComments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComments(Comments newComments)
  {
    if (newComments != comments)
    {
      NotificationChain msgs = null;
      if (comments != null)
        msgs = ((InternalEObject)comments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.CLASS_DESCRIPTION__COMMENTS, null, msgs);
      if (newComments != null)
        msgs = ((InternalEObject)newComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PogoDslPackage.CLASS_DESCRIPTION__COMMENTS, null, msgs);
      msgs = basicSetComments(newComments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__COMMENTS, newComments, newComments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHasAbstractCommand()
  {
    return hasAbstractCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasAbstractCommand(String newHasAbstractCommand)
  {
    String oldHasAbstractCommand = hasAbstractCommand;
    hasAbstractCommand = newHasAbstractCommand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__HAS_ABSTRACT_COMMAND, oldHasAbstractCommand, hasAbstractCommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHasAbstractAttribute()
  {
    return hasAbstractAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasAbstractAttribute(String newHasAbstractAttribute)
  {
    String oldHasAbstractAttribute = hasAbstractAttribute;
    hasAbstractAttribute = newHasAbstractAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__HAS_ABSTRACT_ATTRIBUTE, oldHasAbstractAttribute, hasAbstractAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHasDynamicAttribute()
  {
    return hasDynamicAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasDynamicAttribute(String newHasDynamicAttribute)
  {
    String oldHasDynamicAttribute = hasDynamicAttribute;
    hasDynamicAttribute = newHasDynamicAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_DESCRIPTION__HAS_DYNAMIC_ATTRIBUTE, oldHasDynamicAttribute, hasDynamicAttribute));
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
      case PogoDslPackage.CLASS_DESCRIPTION__INHERITANCES:
        return ((InternalEList<?>)getInheritances()).basicRemove(otherEnd, msgs);
      case PogoDslPackage.CLASS_DESCRIPTION__IDENTIFICATION:
        return basicSetIdentification(null, msgs);
      case PogoDslPackage.CLASS_DESCRIPTION__COMMENTS:
        return basicSetComments(null, msgs);
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
      case PogoDslPackage.CLASS_DESCRIPTION__DESCRIPTION:
        return getDescription();
      case PogoDslPackage.CLASS_DESCRIPTION__TITLE:
        return getTitle();
      case PogoDslPackage.CLASS_DESCRIPTION__SOURCE_PATH:
        return getSourcePath();
      case PogoDslPackage.CLASS_DESCRIPTION__INHERITANCES:
        return getInheritances();
      case PogoDslPackage.CLASS_DESCRIPTION__LANGUAGE:
        return getLanguage();
      case PogoDslPackage.CLASS_DESCRIPTION__FILESTOGENERATE:
        return getFilestogenerate();
      case PogoDslPackage.CLASS_DESCRIPTION__IDENTIFICATION:
        return getIdentification();
      case PogoDslPackage.CLASS_DESCRIPTION__COMMENTS:
        return getComments();
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_ABSTRACT_COMMAND:
        return getHasAbstractCommand();
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_ABSTRACT_ATTRIBUTE:
        return getHasAbstractAttribute();
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_DYNAMIC_ATTRIBUTE:
        return getHasDynamicAttribute();
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
      case PogoDslPackage.CLASS_DESCRIPTION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__TITLE:
        setTitle((String)newValue);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__SOURCE_PATH:
        setSourcePath((String)newValue);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__INHERITANCES:
        getInheritances().clear();
        getInheritances().addAll((Collection<? extends Inheritance>)newValue);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__LANGUAGE:
        setLanguage((String)newValue);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__FILESTOGENERATE:
        setFilestogenerate((String)newValue);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__IDENTIFICATION:
        setIdentification((ClassIdentification)newValue);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__COMMENTS:
        setComments((Comments)newValue);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_ABSTRACT_COMMAND:
        setHasAbstractCommand((String)newValue);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_ABSTRACT_ATTRIBUTE:
        setHasAbstractAttribute((String)newValue);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_DYNAMIC_ATTRIBUTE:
        setHasDynamicAttribute((String)newValue);
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
      case PogoDslPackage.CLASS_DESCRIPTION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__SOURCE_PATH:
        setSourcePath(SOURCE_PATH_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__INHERITANCES:
        getInheritances().clear();
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__LANGUAGE:
        setLanguage(LANGUAGE_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__FILESTOGENERATE:
        setFilestogenerate(FILESTOGENERATE_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__IDENTIFICATION:
        setIdentification((ClassIdentification)null);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__COMMENTS:
        setComments((Comments)null);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_ABSTRACT_COMMAND:
        setHasAbstractCommand(HAS_ABSTRACT_COMMAND_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_ABSTRACT_ATTRIBUTE:
        setHasAbstractAttribute(HAS_ABSTRACT_ATTRIBUTE_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_DYNAMIC_ATTRIBUTE:
        setHasDynamicAttribute(HAS_DYNAMIC_ATTRIBUTE_EDEFAULT);
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
      case PogoDslPackage.CLASS_DESCRIPTION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case PogoDslPackage.CLASS_DESCRIPTION__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case PogoDslPackage.CLASS_DESCRIPTION__SOURCE_PATH:
        return SOURCE_PATH_EDEFAULT == null ? sourcePath != null : !SOURCE_PATH_EDEFAULT.equals(sourcePath);
      case PogoDslPackage.CLASS_DESCRIPTION__INHERITANCES:
        return inheritances != null && !inheritances.isEmpty();
      case PogoDslPackage.CLASS_DESCRIPTION__LANGUAGE:
        return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
      case PogoDslPackage.CLASS_DESCRIPTION__FILESTOGENERATE:
        return FILESTOGENERATE_EDEFAULT == null ? filestogenerate != null : !FILESTOGENERATE_EDEFAULT.equals(filestogenerate);
      case PogoDslPackage.CLASS_DESCRIPTION__IDENTIFICATION:
        return identification != null;
      case PogoDslPackage.CLASS_DESCRIPTION__COMMENTS:
        return comments != null;
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_ABSTRACT_COMMAND:
        return HAS_ABSTRACT_COMMAND_EDEFAULT == null ? hasAbstractCommand != null : !HAS_ABSTRACT_COMMAND_EDEFAULT.equals(hasAbstractCommand);
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_ABSTRACT_ATTRIBUTE:
        return HAS_ABSTRACT_ATTRIBUTE_EDEFAULT == null ? hasAbstractAttribute != null : !HAS_ABSTRACT_ATTRIBUTE_EDEFAULT.equals(hasAbstractAttribute);
      case PogoDslPackage.CLASS_DESCRIPTION__HAS_DYNAMIC_ATTRIBUTE:
        return HAS_DYNAMIC_ATTRIBUTE_EDEFAULT == null ? hasDynamicAttribute != null : !HAS_DYNAMIC_ATTRIBUTE_EDEFAULT.equals(hasDynamicAttribute);
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
    result.append(", title: ");
    result.append(title);
    result.append(", sourcePath: ");
    result.append(sourcePath);
    result.append(", language: ");
    result.append(language);
    result.append(", filestogenerate: ");
    result.append(filestogenerate);
    result.append(", hasAbstractCommand: ");
    result.append(hasAbstractCommand);
    result.append(", hasAbstractAttribute: ");
    result.append(hasAbstractAttribute);
    result.append(", hasDynamicAttribute: ");
    result.append(hasDynamicAttribute);
    result.append(')');
    return result.toString();
  }

} //ClassDescriptionImpl
