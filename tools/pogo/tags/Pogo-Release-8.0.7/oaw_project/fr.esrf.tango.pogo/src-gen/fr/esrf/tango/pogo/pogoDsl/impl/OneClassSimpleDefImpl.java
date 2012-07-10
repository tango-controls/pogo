/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Class Simple Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.OneClassSimpleDefImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.OneClassSimpleDefImpl#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.OneClassSimpleDefImpl#getPogo6 <em>Pogo6</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.OneClassSimpleDefImpl#getInheritances <em>Inheritances</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.OneClassSimpleDefImpl#getParentClasses <em>Parent Classes</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.OneClassSimpleDefImpl#getAdditionalFiles <em>Additional Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneClassSimpleDefImpl extends MinimalEObjectImpl.Container implements OneClassSimpleDef
{
  /**
   * The default value of the '{@link #getClassname() <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected static final String CLASSNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassname() <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected String classname = CLASSNAME_EDEFAULT;

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
   * The default value of the '{@link #getPogo6() <em>Pogo6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPogo6()
   * @generated
   * @ordered
   */
  protected static final String POGO6_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPogo6() <em>Pogo6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPogo6()
   * @generated
   * @ordered
   */
  protected String pogo6 = POGO6_EDEFAULT;

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
   * The cached value of the '{@link #getParentClasses() <em>Parent Classes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentClasses()
   * @generated
   * @ordered
   */
  protected EList<String> parentClasses;

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
  protected OneClassSimpleDefImpl()
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
    return PogoDslPackage.Literals.ONE_CLASS_SIMPLE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassname()
  {
    return classname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassname(String newClassname)
  {
    String oldClassname = classname;
    classname = newClassname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ONE_CLASS_SIMPLE_DEF__CLASSNAME, oldClassname, classname));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ONE_CLASS_SIMPLE_DEF__SOURCE_PATH, oldSourcePath, sourcePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPogo6()
  {
    return pogo6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPogo6(String newPogo6)
  {
    String oldPogo6 = pogo6;
    pogo6 = newPogo6;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PogoDslPackage.ONE_CLASS_SIMPLE_DEF__POGO6, oldPogo6, pogo6));
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
      inheritances = new EObjectContainmentEList<Inheritance>(Inheritance.class, this, PogoDslPackage.ONE_CLASS_SIMPLE_DEF__INHERITANCES);
    }
    return inheritances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParentClasses()
  {
    if (parentClasses == null)
    {
      parentClasses = new EDataTypeEList<String>(String.class, this, PogoDslPackage.ONE_CLASS_SIMPLE_DEF__PARENT_CLASSES);
    }
    return parentClasses;
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
      additionalFiles = new EObjectContainmentEList<AdditionalFile>(AdditionalFile.class, this, PogoDslPackage.ONE_CLASS_SIMPLE_DEF__ADDITIONAL_FILES);
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
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__INHERITANCES:
        return ((InternalEList<?>)getInheritances()).basicRemove(otherEnd, msgs);
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__ADDITIONAL_FILES:
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
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__CLASSNAME:
        return getClassname();
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__SOURCE_PATH:
        return getSourcePath();
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__POGO6:
        return getPogo6();
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__INHERITANCES:
        return getInheritances();
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__PARENT_CLASSES:
        return getParentClasses();
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__ADDITIONAL_FILES:
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
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__CLASSNAME:
        setClassname((String)newValue);
        return;
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__SOURCE_PATH:
        setSourcePath((String)newValue);
        return;
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__POGO6:
        setPogo6((String)newValue);
        return;
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__INHERITANCES:
        getInheritances().clear();
        getInheritances().addAll((Collection<? extends Inheritance>)newValue);
        return;
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__PARENT_CLASSES:
        getParentClasses().clear();
        getParentClasses().addAll((Collection<? extends String>)newValue);
        return;
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__ADDITIONAL_FILES:
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
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__CLASSNAME:
        setClassname(CLASSNAME_EDEFAULT);
        return;
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__SOURCE_PATH:
        setSourcePath(SOURCE_PATH_EDEFAULT);
        return;
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__POGO6:
        setPogo6(POGO6_EDEFAULT);
        return;
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__INHERITANCES:
        getInheritances().clear();
        return;
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__PARENT_CLASSES:
        getParentClasses().clear();
        return;
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__ADDITIONAL_FILES:
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
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__CLASSNAME:
        return CLASSNAME_EDEFAULT == null ? classname != null : !CLASSNAME_EDEFAULT.equals(classname);
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__SOURCE_PATH:
        return SOURCE_PATH_EDEFAULT == null ? sourcePath != null : !SOURCE_PATH_EDEFAULT.equals(sourcePath);
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__POGO6:
        return POGO6_EDEFAULT == null ? pogo6 != null : !POGO6_EDEFAULT.equals(pogo6);
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__INHERITANCES:
        return inheritances != null && !inheritances.isEmpty();
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__PARENT_CLASSES:
        return parentClasses != null && !parentClasses.isEmpty();
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF__ADDITIONAL_FILES:
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
    result.append(" (classname: ");
    result.append(classname);
    result.append(", sourcePath: ");
    result.append(sourcePath);
    result.append(", pogo6: ");
    result.append(pogo6);
    result.append(", parentClasses: ");
    result.append(parentClasses);
    result.append(')');
    return result.toString();
  }

} //OneClassSimpleDefImpl
