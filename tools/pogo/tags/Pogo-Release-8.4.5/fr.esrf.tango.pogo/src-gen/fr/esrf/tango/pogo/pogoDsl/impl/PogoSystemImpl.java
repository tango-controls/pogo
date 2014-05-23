/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.Import;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses;
import fr.esrf.tango.pogo.pogoDsl.PogoSystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pogo System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoSystemImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoSystemImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoSystemImpl#getMultiClasses <em>Multi Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PogoSystemImpl extends MinimalEObjectImpl.Container implements PogoSystem
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<PogoDeviceClass> classes;

  /**
   * The cached value of the '{@link #getMultiClasses() <em>Multi Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiClasses()
   * @generated
   * @ordered
   */
  protected EList<PogoMultiClasses> multiClasses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PogoSystemImpl()
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
    return PogoDslPackage.Literals.POGO_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, PogoDslPackage.POGO_SYSTEM__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PogoDeviceClass> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<PogoDeviceClass>(PogoDeviceClass.class, this, PogoDslPackage.POGO_SYSTEM__CLASSES);
    }
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PogoMultiClasses> getMultiClasses()
  {
    if (multiClasses == null)
    {
      multiClasses = new EObjectContainmentEList<PogoMultiClasses>(PogoMultiClasses.class, this, PogoDslPackage.POGO_SYSTEM__MULTI_CLASSES);
    }
    return multiClasses;
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
      case PogoDslPackage.POGO_SYSTEM__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case PogoDslPackage.POGO_SYSTEM__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
      case PogoDslPackage.POGO_SYSTEM__MULTI_CLASSES:
        return ((InternalEList<?>)getMultiClasses()).basicRemove(otherEnd, msgs);
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
      case PogoDslPackage.POGO_SYSTEM__IMPORTS:
        return getImports();
      case PogoDslPackage.POGO_SYSTEM__CLASSES:
        return getClasses();
      case PogoDslPackage.POGO_SYSTEM__MULTI_CLASSES:
        return getMultiClasses();
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
      case PogoDslPackage.POGO_SYSTEM__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case PogoDslPackage.POGO_SYSTEM__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends PogoDeviceClass>)newValue);
        return;
      case PogoDslPackage.POGO_SYSTEM__MULTI_CLASSES:
        getMultiClasses().clear();
        getMultiClasses().addAll((Collection<? extends PogoMultiClasses>)newValue);
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
      case PogoDslPackage.POGO_SYSTEM__IMPORTS:
        getImports().clear();
        return;
      case PogoDslPackage.POGO_SYSTEM__CLASSES:
        getClasses().clear();
        return;
      case PogoDslPackage.POGO_SYSTEM__MULTI_CLASSES:
        getMultiClasses().clear();
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
      case PogoDslPackage.POGO_SYSTEM__IMPORTS:
        return imports != null && !imports.isEmpty();
      case PogoDslPackage.POGO_SYSTEM__CLASSES:
        return classes != null && !classes.isEmpty();
      case PogoDslPackage.POGO_SYSTEM__MULTI_CLASSES:
        return multiClasses != null && !multiClasses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PogoSystemImpl
