/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.ClassIdentification;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl#getEmailDomain <em>Email Domain</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl#getClassFamily <em>Class Family</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl#getSiteSpecific <em>Site Specific</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassIdentificationImpl extends MinimalEObjectImpl.Container implements ClassIdentification
{
  /**
   * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContact()
   * @generated
   * @ordered
   */
  protected static final String CONTACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContact()
   * @generated
   * @ordered
   */
  protected String contact = CONTACT_EDEFAULT;

  /**
   * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected static final String AUTHOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected String author = AUTHOR_EDEFAULT;

  /**
   * The default value of the '{@link #getEmailDomain() <em>Email Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmailDomain()
   * @generated
   * @ordered
   */
  protected static final String EMAIL_DOMAIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmailDomain() <em>Email Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmailDomain()
   * @generated
   * @ordered
   */
  protected String emailDomain = EMAIL_DOMAIN_EDEFAULT;

  /**
   * The default value of the '{@link #getClassFamily() <em>Class Family</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassFamily()
   * @generated
   * @ordered
   */
  protected static final String CLASS_FAMILY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassFamily() <em>Class Family</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassFamily()
   * @generated
   * @ordered
   */
  protected String classFamily = CLASS_FAMILY_EDEFAULT;

  /**
   * The default value of the '{@link #getSiteSpecific() <em>Site Specific</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiteSpecific()
   * @generated
   * @ordered
   */
  protected static final String SITE_SPECIFIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSiteSpecific() <em>Site Specific</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiteSpecific()
   * @generated
   * @ordered
   */
  protected String siteSpecific = SITE_SPECIFIC_EDEFAULT;

  /**
   * The default value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlatform()
   * @generated
   * @ordered
   */
  protected static final String PLATFORM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlatform()
   * @generated
   * @ordered
   */
  protected String platform = PLATFORM_EDEFAULT;

  /**
   * The default value of the '{@link #getBus() <em>Bus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBus()
   * @generated
   * @ordered
   */
  protected static final String BUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBus() <em>Bus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBus()
   * @generated
   * @ordered
   */
  protected String bus = BUS_EDEFAULT;

  /**
   * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManufacturer()
   * @generated
   * @ordered
   */
  protected static final String MANUFACTURER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManufacturer()
   * @generated
   * @ordered
   */
  protected String manufacturer = MANUFACTURER_EDEFAULT;

  /**
   * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected String reference = REFERENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassIdentificationImpl()
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
    return PogoDslPackage.Literals.CLASS_IDENTIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContact()
  {
    return contact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContact(String newContact)
  {
    String oldContact = contact;
    contact = newContact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_IDENTIFICATION__CONTACT, oldContact, contact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(String newAuthor)
  {
    String oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_IDENTIFICATION__AUTHOR, oldAuthor, author));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmailDomain()
  {
    return emailDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmailDomain(String newEmailDomain)
  {
    String oldEmailDomain = emailDomain;
    emailDomain = newEmailDomain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_IDENTIFICATION__EMAIL_DOMAIN, oldEmailDomain, emailDomain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassFamily()
  {
    return classFamily;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassFamily(String newClassFamily)
  {
    String oldClassFamily = classFamily;
    classFamily = newClassFamily;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_IDENTIFICATION__CLASS_FAMILY, oldClassFamily, classFamily));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSiteSpecific()
  {
    return siteSpecific;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSiteSpecific(String newSiteSpecific)
  {
    String oldSiteSpecific = siteSpecific;
    siteSpecific = newSiteSpecific;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_IDENTIFICATION__SITE_SPECIFIC, oldSiteSpecific, siteSpecific));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPlatform()
  {
    return platform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlatform(String newPlatform)
  {
    String oldPlatform = platform;
    platform = newPlatform;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_IDENTIFICATION__PLATFORM, oldPlatform, platform));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBus()
  {
    return bus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBus(String newBus)
  {
    String oldBus = bus;
    bus = newBus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_IDENTIFICATION__BUS, oldBus, bus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getManufacturer()
  {
    return manufacturer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManufacturer(String newManufacturer)
  {
    String oldManufacturer = manufacturer;
    manufacturer = newManufacturer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_IDENTIFICATION__MANUFACTURER, oldManufacturer, manufacturer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(String newReference)
  {
    String oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.CLASS_IDENTIFICATION__REFERENCE, oldReference, reference));
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
      case PogoDslPackage.CLASS_IDENTIFICATION__CONTACT:
        return getContact();
      case PogoDslPackage.CLASS_IDENTIFICATION__AUTHOR:
        return getAuthor();
      case PogoDslPackage.CLASS_IDENTIFICATION__EMAIL_DOMAIN:
        return getEmailDomain();
      case PogoDslPackage.CLASS_IDENTIFICATION__CLASS_FAMILY:
        return getClassFamily();
      case PogoDslPackage.CLASS_IDENTIFICATION__SITE_SPECIFIC:
        return getSiteSpecific();
      case PogoDslPackage.CLASS_IDENTIFICATION__PLATFORM:
        return getPlatform();
      case PogoDslPackage.CLASS_IDENTIFICATION__BUS:
        return getBus();
      case PogoDslPackage.CLASS_IDENTIFICATION__MANUFACTURER:
        return getManufacturer();
      case PogoDslPackage.CLASS_IDENTIFICATION__REFERENCE:
        return getReference();
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
      case PogoDslPackage.CLASS_IDENTIFICATION__CONTACT:
        setContact((String)newValue);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__AUTHOR:
        setAuthor((String)newValue);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__EMAIL_DOMAIN:
        setEmailDomain((String)newValue);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__CLASS_FAMILY:
        setClassFamily((String)newValue);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__SITE_SPECIFIC:
        setSiteSpecific((String)newValue);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__PLATFORM:
        setPlatform((String)newValue);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__BUS:
        setBus((String)newValue);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__MANUFACTURER:
        setManufacturer((String)newValue);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__REFERENCE:
        setReference((String)newValue);
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
      case PogoDslPackage.CLASS_IDENTIFICATION__CONTACT:
        setContact(CONTACT_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__AUTHOR:
        setAuthor(AUTHOR_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__EMAIL_DOMAIN:
        setEmailDomain(EMAIL_DOMAIN_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__CLASS_FAMILY:
        setClassFamily(CLASS_FAMILY_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__SITE_SPECIFIC:
        setSiteSpecific(SITE_SPECIFIC_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__PLATFORM:
        setPlatform(PLATFORM_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__BUS:
        setBus(BUS_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__MANUFACTURER:
        setManufacturer(MANUFACTURER_EDEFAULT);
        return;
      case PogoDslPackage.CLASS_IDENTIFICATION__REFERENCE:
        setReference(REFERENCE_EDEFAULT);
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
      case PogoDslPackage.CLASS_IDENTIFICATION__CONTACT:
        return CONTACT_EDEFAULT == null ? contact != null : !CONTACT_EDEFAULT.equals(contact);
      case PogoDslPackage.CLASS_IDENTIFICATION__AUTHOR:
        return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
      case PogoDslPackage.CLASS_IDENTIFICATION__EMAIL_DOMAIN:
        return EMAIL_DOMAIN_EDEFAULT == null ? emailDomain != null : !EMAIL_DOMAIN_EDEFAULT.equals(emailDomain);
      case PogoDslPackage.CLASS_IDENTIFICATION__CLASS_FAMILY:
        return CLASS_FAMILY_EDEFAULT == null ? classFamily != null : !CLASS_FAMILY_EDEFAULT.equals(classFamily);
      case PogoDslPackage.CLASS_IDENTIFICATION__SITE_SPECIFIC:
        return SITE_SPECIFIC_EDEFAULT == null ? siteSpecific != null : !SITE_SPECIFIC_EDEFAULT.equals(siteSpecific);
      case PogoDslPackage.CLASS_IDENTIFICATION__PLATFORM:
        return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
      case PogoDslPackage.CLASS_IDENTIFICATION__BUS:
        return BUS_EDEFAULT == null ? bus != null : !BUS_EDEFAULT.equals(bus);
      case PogoDslPackage.CLASS_IDENTIFICATION__MANUFACTURER:
        return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
      case PogoDslPackage.CLASS_IDENTIFICATION__REFERENCE:
        return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
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
    result.append(" (contact: ");
    result.append(contact);
    result.append(", author: ");
    result.append(author);
    result.append(", emailDomain: ");
    result.append(emailDomain);
    result.append(", classFamily: ");
    result.append(classFamily);
    result.append(", siteSpecific: ");
    result.append(siteSpecific);
    result.append(", platform: ");
    result.append(platform);
    result.append(", bus: ");
    result.append(bus);
    result.append(", manufacturer: ");
    result.append(manufacturer);
    result.append(", reference: ");
    result.append(reference);
    result.append(')');
    return result.toString();
  }

} //ClassIdentificationImpl
