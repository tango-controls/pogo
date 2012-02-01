/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.impl;

import fr.esrf.tango.pogo.pogoDsl.AdditionalFile;
import fr.esrf.tango.pogo.pogoDsl.Argument;
import fr.esrf.tango.pogo.pogoDsl.AttrProperties;
import fr.esrf.tango.pogo.pogoDsl.Attribute;
import fr.esrf.tango.pogo.pogoDsl.BooleanArrayType;
import fr.esrf.tango.pogo.pogoDsl.BooleanType;
import fr.esrf.tango.pogo.pogoDsl.CharArrayType;
import fr.esrf.tango.pogo.pogoDsl.ClassDescription;
import fr.esrf.tango.pogo.pogoDsl.ClassIdentification;
import fr.esrf.tango.pogo.pogoDsl.Command;
import fr.esrf.tango.pogo.pogoDsl.Comments;
import fr.esrf.tango.pogo.pogoDsl.ConstStringType;
import fr.esrf.tango.pogo.pogoDsl.DevIntType;
import fr.esrf.tango.pogo.pogoDsl.DoubleArrayType;
import fr.esrf.tango.pogo.pogoDsl.DoubleStringArrayType;
import fr.esrf.tango.pogo.pogoDsl.DoubleType;
import fr.esrf.tango.pogo.pogoDsl.DoubleVectorType;
import fr.esrf.tango.pogo.pogoDsl.EncodedType;
import fr.esrf.tango.pogo.pogoDsl.FireEvents;
import fr.esrf.tango.pogo.pogoDsl.FloatArrayType;
import fr.esrf.tango.pogo.pogoDsl.FloatType;
import fr.esrf.tango.pogo.pogoDsl.FloatVectorType;
import fr.esrf.tango.pogo.pogoDsl.Import;
import fr.esrf.tango.pogo.pogoDsl.Inheritance;
import fr.esrf.tango.pogo.pogoDsl.InheritanceStatus;
import fr.esrf.tango.pogo.pogoDsl.IntArrayType;
import fr.esrf.tango.pogo.pogoDsl.IntType;
import fr.esrf.tango.pogo.pogoDsl.IntVectorType;
import fr.esrf.tango.pogo.pogoDsl.LongArrayType;
import fr.esrf.tango.pogo.pogoDsl.LongStringArrayType;
import fr.esrf.tango.pogo.pogoDsl.LongType;
import fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef;
import fr.esrf.tango.pogo.pogoDsl.OverlodedPollPeriodObject;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.PogoDslFactory;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses;
import fr.esrf.tango.pogo.pogoDsl.PogoSystem;
import fr.esrf.tango.pogo.pogoDsl.Preferences;
import fr.esrf.tango.pogo.pogoDsl.PropType;
import fr.esrf.tango.pogo.pogoDsl.Property;
import fr.esrf.tango.pogo.pogoDsl.ShortArrayType;
import fr.esrf.tango.pogo.pogoDsl.ShortType;
import fr.esrf.tango.pogo.pogoDsl.ShortVectorType;
import fr.esrf.tango.pogo.pogoDsl.SimpleType;
import fr.esrf.tango.pogo.pogoDsl.State;
import fr.esrf.tango.pogo.pogoDsl.StateType;
import fr.esrf.tango.pogo.pogoDsl.StringArrayType;
import fr.esrf.tango.pogo.pogoDsl.StringType;
import fr.esrf.tango.pogo.pogoDsl.StringVectorType;
import fr.esrf.tango.pogo.pogoDsl.Type;
import fr.esrf.tango.pogo.pogoDsl.UCharType;
import fr.esrf.tango.pogo.pogoDsl.UIntArrayType;
import fr.esrf.tango.pogo.pogoDsl.UIntType;
import fr.esrf.tango.pogo.pogoDsl.ULongArrayType;
import fr.esrf.tango.pogo.pogoDsl.ULongType;
import fr.esrf.tango.pogo.pogoDsl.UShortArrayType;
import fr.esrf.tango.pogo.pogoDsl.UShortType;
import fr.esrf.tango.pogo.pogoDsl.VectorType;
import fr.esrf.tango.pogo.pogoDsl.VoidType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PogoDslPackageImpl extends EPackageImpl implements PogoDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pogoSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pogoMultiClassesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oneClassSimpleDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pogoDeviceClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inheritanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classIdentificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preferencesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vectorTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inheritanceStatusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fireEventsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attrPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additionalFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass overlodedPollPeriodObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass voidTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shortTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uShortTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uIntTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shortArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uShortArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uIntArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longStringArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleStringArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constStringTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uCharTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uLongTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uLongArrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass devIntTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass encodedTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shortVectorTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intVectorTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatVectorTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleVectorTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringVectorTypeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PogoDslPackageImpl()
  {
    super(eNS_URI, PogoDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PogoDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PogoDslPackage init()
  {
    if (isInited) return (PogoDslPackage)EPackage.Registry.INSTANCE.getEPackage(PogoDslPackage.eNS_URI);

    // Obtain or create and register package
    PogoDslPackageImpl thePogoDslPackage = (PogoDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PogoDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PogoDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePogoDslPackage.createPackageContents();

    // Initialize created meta-data
    thePogoDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePogoDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PogoDslPackage.eNS_URI, thePogoDslPackage);
    return thePogoDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPogoSystem()
  {
    return pogoSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoSystem_Imports()
  {
    return (EReference)pogoSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoSystem_Classes()
  {
    return (EReference)pogoSystemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoSystem_MultiClasses()
  {
    return (EReference)pogoSystemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportURI()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPogoMultiClasses()
  {
    return pogoMultiClassesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPogoMultiClasses_Name()
  {
    return (EAttribute)pogoMultiClassesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPogoMultiClasses_SourcePath()
  {
    return (EAttribute)pogoMultiClassesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPogoMultiClasses_Description()
  {
    return (EAttribute)pogoMultiClassesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPogoMultiClasses_Title()
  {
    return (EAttribute)pogoMultiClassesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoMultiClasses_Classes()
  {
    return (EReference)pogoMultiClassesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPogoMultiClasses_Filestogenerate()
  {
    return (EAttribute)pogoMultiClassesEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoMultiClasses_Preferences()
  {
    return (EReference)pogoMultiClassesEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOneClassSimpleDef()
  {
    return oneClassSimpleDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneClassSimpleDef_Classname()
  {
    return (EAttribute)oneClassSimpleDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneClassSimpleDef_SourcePath()
  {
    return (EAttribute)oneClassSimpleDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneClassSimpleDef_Pogo6()
  {
    return (EAttribute)oneClassSimpleDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneClassSimpleDef_Inheritances()
  {
    return (EReference)oneClassSimpleDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOneClassSimpleDef_ParentClasses()
  {
    return (EAttribute)oneClassSimpleDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOneClassSimpleDef_AdditionalFiles()
  {
    return (EReference)oneClassSimpleDefEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPogoDeviceClass()
  {
    return pogoDeviceClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPogoDeviceClass_Name()
  {
    return (EAttribute)pogoDeviceClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPogoDeviceClass_IsAbstract()
  {
    return (EAttribute)pogoDeviceClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoDeviceClass_BaseClass()
  {
    return (EReference)pogoDeviceClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPogoDeviceClass_Institute()
  {
    return (EAttribute)pogoDeviceClassEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoDeviceClass_Description()
  {
    return (EReference)pogoDeviceClassEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoDeviceClass_ClassProperties()
  {
    return (EReference)pogoDeviceClassEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoDeviceClass_DeviceProperties()
  {
    return (EReference)pogoDeviceClassEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoDeviceClass_Commands()
  {
    return (EReference)pogoDeviceClassEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoDeviceClass_Attributes()
  {
    return (EReference)pogoDeviceClassEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoDeviceClass_DynamicAttributes()
  {
    return (EReference)pogoDeviceClassEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoDeviceClass_States()
  {
    return (EReference)pogoDeviceClassEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoDeviceClass_Preferences()
  {
    return (EReference)pogoDeviceClassEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoDeviceClass_AdditionalFiles()
  {
    return (EReference)pogoDeviceClassEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPogoDeviceClass_OverlodedPollPeriodObject()
  {
    return (EReference)pogoDeviceClassEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassDescription()
  {
    return classDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDescription_Description()
  {
    return (EAttribute)classDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDescription_Title()
  {
    return (EAttribute)classDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDescription_SourcePath()
  {
    return (EAttribute)classDescriptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDescription_Inheritances()
  {
    return (EReference)classDescriptionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDescription_Language()
  {
    return (EAttribute)classDescriptionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDescription_Filestogenerate()
  {
    return (EAttribute)classDescriptionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDescription_Identification()
  {
    return (EReference)classDescriptionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDescription_Comments()
  {
    return (EReference)classDescriptionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDescription_HasMandatoryProperty()
  {
    return (EAttribute)classDescriptionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDescription_HasAbstractCommand()
  {
    return (EAttribute)classDescriptionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDescription_HasAbstractAttribute()
  {
    return (EAttribute)classDescriptionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDescription_DescriptionHtmlExists()
  {
    return (EAttribute)classDescriptionEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInheritance()
  {
    return inheritanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritance_Classname()
  {
    return (EAttribute)inheritanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritance_SourcePath()
  {
    return (EAttribute)inheritanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassIdentification()
  {
    return classIdentificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassIdentification_Contact()
  {
    return (EAttribute)classIdentificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassIdentification_Author()
  {
    return (EAttribute)classIdentificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassIdentification_EmailDomain()
  {
    return (EAttribute)classIdentificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassIdentification_ClassFamily()
  {
    return (EAttribute)classIdentificationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassIdentification_SiteSpecific()
  {
    return (EAttribute)classIdentificationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassIdentification_Platform()
  {
    return (EAttribute)classIdentificationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassIdentification_Bus()
  {
    return (EAttribute)classIdentificationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassIdentification_Manufacturer()
  {
    return (EAttribute)classIdentificationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassIdentification_Reference()
  {
    return (EAttribute)classIdentificationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComments()
  {
    return commentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComments_CommandsTable()
  {
    return (EAttribute)commentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreferences()
  {
    return preferencesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferences_DocHome()
  {
    return (EAttribute)preferencesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferences_MakefileHome()
  {
    return (EAttribute)preferencesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferences_InstallHome()
  {
    return (EAttribute)preferencesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPreferences_HtmlVersion()
  {
    return (EAttribute)preferencesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Name()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Description()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Status()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Type()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Status()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Mandatory()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Description()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_DefaultPropValue()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropType()
  {
    return propTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleType()
  {
    return simpleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVectorType()
  {
    return vectorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInheritanceStatus()
  {
    return inheritanceStatusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceStatus_Abstract()
  {
    return (EAttribute)inheritanceStatusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceStatus_Inherited()
  {
    return (EAttribute)inheritanceStatusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceStatus_Concrete()
  {
    return (EAttribute)inheritanceStatusEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceStatus_ConcreteHere()
  {
    return (EAttribute)inheritanceStatusEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInheritanceStatus_HasChanged()
  {
    return (EAttribute)inheritanceStatusEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_Name()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_Argin()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_Argout()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_Description()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_Status()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_ExecMethod()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_DisplayLevel()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_PolledPeriod()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_ExcludedStates()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_Type()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgument_Description()
  {
    return (EAttribute)argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_AttType()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_DataType()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_RwType()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_DisplayLevel()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_PolledPeriod()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_MaxX()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_MaxY()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_AssociatedAttr()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Memorized()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_MemorizedAtInit()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_ChangeEvent()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_ArchiveEvent()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_DataReadyEvent()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Status()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Properties()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_AllocReadMember()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_IsDynamic()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_ReadExcludedStates()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_WriteExcludedStates()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFireEvents()
  {
    return fireEventsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFireEvents_Fire()
  {
    return (EAttribute)fireEventsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFireEvents_LibCheckCriteria()
  {
    return (EAttribute)fireEventsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttrProperties()
  {
    return attrPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_Description()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_Label()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_Unit()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_StandardUnit()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_DisplayUnit()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_Format()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_MaxValue()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_MinValue()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_MaxAlarm()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_MinAlarm()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_MaxWarning()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_MinWarning()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_DeltaTime()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttrProperties_DeltaValue()
  {
    return (EAttribute)attrPropertiesEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditionalFile()
  {
    return additionalFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdditionalFile_Name()
  {
    return (EAttribute)additionalFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdditionalFile_Path()
  {
    return (EAttribute)additionalFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOverlodedPollPeriodObject()
  {
    return overlodedPollPeriodObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOverlodedPollPeriodObject_Name()
  {
    return (EAttribute)overlodedPollPeriodObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOverlodedPollPeriodObject_Type()
  {
    return (EAttribute)overlodedPollPeriodObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOverlodedPollPeriodObject_PollPeriod()
  {
    return (EAttribute)overlodedPollPeriodObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVoidType()
  {
    return voidTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanType()
  {
    return booleanTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShortType()
  {
    return shortTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUShortType()
  {
    return uShortTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntType()
  {
    return intTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIntType()
  {
    return uIntTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatType()
  {
    return floatTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleType()
  {
    return doubleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringType()
  {
    return stringTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharArrayType()
  {
    return charArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShortArrayType()
  {
    return shortArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUShortArrayType()
  {
    return uShortArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntArrayType()
  {
    return intArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUIntArrayType()
  {
    return uIntArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatArrayType()
  {
    return floatArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleArrayType()
  {
    return doubleArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringArrayType()
  {
    return stringArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongStringArrayType()
  {
    return longStringArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleStringArrayType()
  {
    return doubleStringArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateType()
  {
    return stateTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstStringType()
  {
    return constStringTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanArrayType()
  {
    return booleanArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUCharType()
  {
    return uCharTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongType()
  {
    return longTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getULongType()
  {
    return uLongTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongArrayType()
  {
    return longArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getULongArrayType()
  {
    return uLongArrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDevIntType()
  {
    return devIntTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEncodedType()
  {
    return encodedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShortVectorType()
  {
    return shortVectorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntVectorType()
  {
    return intVectorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatVectorType()
  {
    return floatVectorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleVectorType()
  {
    return doubleVectorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringVectorType()
  {
    return stringVectorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PogoDslFactory getPogoDslFactory()
  {
    return (PogoDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pogoSystemEClass = createEClass(POGO_SYSTEM);
    createEReference(pogoSystemEClass, POGO_SYSTEM__IMPORTS);
    createEReference(pogoSystemEClass, POGO_SYSTEM__CLASSES);
    createEReference(pogoSystemEClass, POGO_SYSTEM__MULTI_CLASSES);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);

    pogoMultiClassesEClass = createEClass(POGO_MULTI_CLASSES);
    createEAttribute(pogoMultiClassesEClass, POGO_MULTI_CLASSES__NAME);
    createEAttribute(pogoMultiClassesEClass, POGO_MULTI_CLASSES__SOURCE_PATH);
    createEAttribute(pogoMultiClassesEClass, POGO_MULTI_CLASSES__DESCRIPTION);
    createEAttribute(pogoMultiClassesEClass, POGO_MULTI_CLASSES__TITLE);
    createEReference(pogoMultiClassesEClass, POGO_MULTI_CLASSES__CLASSES);
    createEAttribute(pogoMultiClassesEClass, POGO_MULTI_CLASSES__FILESTOGENERATE);
    createEReference(pogoMultiClassesEClass, POGO_MULTI_CLASSES__PREFERENCES);

    oneClassSimpleDefEClass = createEClass(ONE_CLASS_SIMPLE_DEF);
    createEAttribute(oneClassSimpleDefEClass, ONE_CLASS_SIMPLE_DEF__CLASSNAME);
    createEAttribute(oneClassSimpleDefEClass, ONE_CLASS_SIMPLE_DEF__SOURCE_PATH);
    createEAttribute(oneClassSimpleDefEClass, ONE_CLASS_SIMPLE_DEF__POGO6);
    createEReference(oneClassSimpleDefEClass, ONE_CLASS_SIMPLE_DEF__INHERITANCES);
    createEAttribute(oneClassSimpleDefEClass, ONE_CLASS_SIMPLE_DEF__PARENT_CLASSES);
    createEReference(oneClassSimpleDefEClass, ONE_CLASS_SIMPLE_DEF__ADDITIONAL_FILES);

    pogoDeviceClassEClass = createEClass(POGO_DEVICE_CLASS);
    createEAttribute(pogoDeviceClassEClass, POGO_DEVICE_CLASS__NAME);
    createEAttribute(pogoDeviceClassEClass, POGO_DEVICE_CLASS__IS_ABSTRACT);
    createEReference(pogoDeviceClassEClass, POGO_DEVICE_CLASS__BASE_CLASS);
    createEAttribute(pogoDeviceClassEClass, POGO_DEVICE_CLASS__INSTITUTE);
    createEReference(pogoDeviceClassEClass, POGO_DEVICE_CLASS__DESCRIPTION);
    createEReference(pogoDeviceClassEClass, POGO_DEVICE_CLASS__CLASS_PROPERTIES);
    createEReference(pogoDeviceClassEClass, POGO_DEVICE_CLASS__DEVICE_PROPERTIES);
    createEReference(pogoDeviceClassEClass, POGO_DEVICE_CLASS__COMMANDS);
    createEReference(pogoDeviceClassEClass, POGO_DEVICE_CLASS__ATTRIBUTES);
    createEReference(pogoDeviceClassEClass, POGO_DEVICE_CLASS__DYNAMIC_ATTRIBUTES);
    createEReference(pogoDeviceClassEClass, POGO_DEVICE_CLASS__STATES);
    createEReference(pogoDeviceClassEClass, POGO_DEVICE_CLASS__PREFERENCES);
    createEReference(pogoDeviceClassEClass, POGO_DEVICE_CLASS__ADDITIONAL_FILES);
    createEReference(pogoDeviceClassEClass, POGO_DEVICE_CLASS__OVERLODED_POLL_PERIOD_OBJECT);

    classDescriptionEClass = createEClass(CLASS_DESCRIPTION);
    createEAttribute(classDescriptionEClass, CLASS_DESCRIPTION__DESCRIPTION);
    createEAttribute(classDescriptionEClass, CLASS_DESCRIPTION__TITLE);
    createEAttribute(classDescriptionEClass, CLASS_DESCRIPTION__SOURCE_PATH);
    createEReference(classDescriptionEClass, CLASS_DESCRIPTION__INHERITANCES);
    createEAttribute(classDescriptionEClass, CLASS_DESCRIPTION__LANGUAGE);
    createEAttribute(classDescriptionEClass, CLASS_DESCRIPTION__FILESTOGENERATE);
    createEReference(classDescriptionEClass, CLASS_DESCRIPTION__IDENTIFICATION);
    createEReference(classDescriptionEClass, CLASS_DESCRIPTION__COMMENTS);
    createEAttribute(classDescriptionEClass, CLASS_DESCRIPTION__HAS_MANDATORY_PROPERTY);
    createEAttribute(classDescriptionEClass, CLASS_DESCRIPTION__HAS_ABSTRACT_COMMAND);
    createEAttribute(classDescriptionEClass, CLASS_DESCRIPTION__HAS_ABSTRACT_ATTRIBUTE);
    createEAttribute(classDescriptionEClass, CLASS_DESCRIPTION__DESCRIPTION_HTML_EXISTS);

    inheritanceEClass = createEClass(INHERITANCE);
    createEAttribute(inheritanceEClass, INHERITANCE__CLASSNAME);
    createEAttribute(inheritanceEClass, INHERITANCE__SOURCE_PATH);

    classIdentificationEClass = createEClass(CLASS_IDENTIFICATION);
    createEAttribute(classIdentificationEClass, CLASS_IDENTIFICATION__CONTACT);
    createEAttribute(classIdentificationEClass, CLASS_IDENTIFICATION__AUTHOR);
    createEAttribute(classIdentificationEClass, CLASS_IDENTIFICATION__EMAIL_DOMAIN);
    createEAttribute(classIdentificationEClass, CLASS_IDENTIFICATION__CLASS_FAMILY);
    createEAttribute(classIdentificationEClass, CLASS_IDENTIFICATION__SITE_SPECIFIC);
    createEAttribute(classIdentificationEClass, CLASS_IDENTIFICATION__PLATFORM);
    createEAttribute(classIdentificationEClass, CLASS_IDENTIFICATION__BUS);
    createEAttribute(classIdentificationEClass, CLASS_IDENTIFICATION__MANUFACTURER);
    createEAttribute(classIdentificationEClass, CLASS_IDENTIFICATION__REFERENCE);

    commentsEClass = createEClass(COMMENTS);
    createEAttribute(commentsEClass, COMMENTS__COMMANDS_TABLE);

    preferencesEClass = createEClass(PREFERENCES);
    createEAttribute(preferencesEClass, PREFERENCES__DOC_HOME);
    createEAttribute(preferencesEClass, PREFERENCES__MAKEFILE_HOME);
    createEAttribute(preferencesEClass, PREFERENCES__INSTALL_HOME);
    createEAttribute(preferencesEClass, PREFERENCES__HTML_VERSION);

    stateEClass = createEClass(STATE);
    createEAttribute(stateEClass, STATE__NAME);
    createEAttribute(stateEClass, STATE__DESCRIPTION);
    createEReference(stateEClass, STATE__STATUS);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEReference(propertyEClass, PROPERTY__TYPE);
    createEReference(propertyEClass, PROPERTY__STATUS);
    createEAttribute(propertyEClass, PROPERTY__MANDATORY);
    createEAttribute(propertyEClass, PROPERTY__DESCRIPTION);
    createEAttribute(propertyEClass, PROPERTY__DEFAULT_PROP_VALUE);

    propTypeEClass = createEClass(PROP_TYPE);

    simpleTypeEClass = createEClass(SIMPLE_TYPE);

    vectorTypeEClass = createEClass(VECTOR_TYPE);

    inheritanceStatusEClass = createEClass(INHERITANCE_STATUS);
    createEAttribute(inheritanceStatusEClass, INHERITANCE_STATUS__ABSTRACT);
    createEAttribute(inheritanceStatusEClass, INHERITANCE_STATUS__INHERITED);
    createEAttribute(inheritanceStatusEClass, INHERITANCE_STATUS__CONCRETE);
    createEAttribute(inheritanceStatusEClass, INHERITANCE_STATUS__CONCRETE_HERE);
    createEAttribute(inheritanceStatusEClass, INHERITANCE_STATUS__HAS_CHANGED);

    commandEClass = createEClass(COMMAND);
    createEAttribute(commandEClass, COMMAND__NAME);
    createEReference(commandEClass, COMMAND__ARGIN);
    createEReference(commandEClass, COMMAND__ARGOUT);
    createEAttribute(commandEClass, COMMAND__DESCRIPTION);
    createEReference(commandEClass, COMMAND__STATUS);
    createEAttribute(commandEClass, COMMAND__EXEC_METHOD);
    createEAttribute(commandEClass, COMMAND__DISPLAY_LEVEL);
    createEAttribute(commandEClass, COMMAND__POLLED_PERIOD);
    createEAttribute(commandEClass, COMMAND__EXCLUDED_STATES);

    argumentEClass = createEClass(ARGUMENT);
    createEReference(argumentEClass, ARGUMENT__TYPE);
    createEAttribute(argumentEClass, ARGUMENT__DESCRIPTION);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__ATT_TYPE);
    createEReference(attributeEClass, ATTRIBUTE__DATA_TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__RW_TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__DISPLAY_LEVEL);
    createEAttribute(attributeEClass, ATTRIBUTE__POLLED_PERIOD);
    createEAttribute(attributeEClass, ATTRIBUTE__MAX_X);
    createEAttribute(attributeEClass, ATTRIBUTE__MAX_Y);
    createEAttribute(attributeEClass, ATTRIBUTE__ASSOCIATED_ATTR);
    createEAttribute(attributeEClass, ATTRIBUTE__MEMORIZED);
    createEAttribute(attributeEClass, ATTRIBUTE__MEMORIZED_AT_INIT);
    createEReference(attributeEClass, ATTRIBUTE__CHANGE_EVENT);
    createEReference(attributeEClass, ATTRIBUTE__ARCHIVE_EVENT);
    createEReference(attributeEClass, ATTRIBUTE__DATA_READY_EVENT);
    createEReference(attributeEClass, ATTRIBUTE__STATUS);
    createEReference(attributeEClass, ATTRIBUTE__PROPERTIES);
    createEAttribute(attributeEClass, ATTRIBUTE__ALLOC_READ_MEMBER);
    createEAttribute(attributeEClass, ATTRIBUTE__IS_DYNAMIC);
    createEAttribute(attributeEClass, ATTRIBUTE__READ_EXCLUDED_STATES);
    createEAttribute(attributeEClass, ATTRIBUTE__WRITE_EXCLUDED_STATES);

    fireEventsEClass = createEClass(FIRE_EVENTS);
    createEAttribute(fireEventsEClass, FIRE_EVENTS__FIRE);
    createEAttribute(fireEventsEClass, FIRE_EVENTS__LIB_CHECK_CRITERIA);

    attrPropertiesEClass = createEClass(ATTR_PROPERTIES);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__DESCRIPTION);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__LABEL);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__UNIT);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__STANDARD_UNIT);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__DISPLAY_UNIT);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__FORMAT);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__MAX_VALUE);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__MIN_VALUE);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__MAX_ALARM);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__MIN_ALARM);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__MAX_WARNING);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__MIN_WARNING);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__DELTA_TIME);
    createEAttribute(attrPropertiesEClass, ATTR_PROPERTIES__DELTA_VALUE);

    additionalFileEClass = createEClass(ADDITIONAL_FILE);
    createEAttribute(additionalFileEClass, ADDITIONAL_FILE__NAME);
    createEAttribute(additionalFileEClass, ADDITIONAL_FILE__PATH);

    overlodedPollPeriodObjectEClass = createEClass(OVERLODED_POLL_PERIOD_OBJECT);
    createEAttribute(overlodedPollPeriodObjectEClass, OVERLODED_POLL_PERIOD_OBJECT__NAME);
    createEAttribute(overlodedPollPeriodObjectEClass, OVERLODED_POLL_PERIOD_OBJECT__TYPE);
    createEAttribute(overlodedPollPeriodObjectEClass, OVERLODED_POLL_PERIOD_OBJECT__POLL_PERIOD);

    typeEClass = createEClass(TYPE);

    voidTypeEClass = createEClass(VOID_TYPE);

    booleanTypeEClass = createEClass(BOOLEAN_TYPE);

    shortTypeEClass = createEClass(SHORT_TYPE);

    uShortTypeEClass = createEClass(USHORT_TYPE);

    intTypeEClass = createEClass(INT_TYPE);

    uIntTypeEClass = createEClass(UINT_TYPE);

    floatTypeEClass = createEClass(FLOAT_TYPE);

    doubleTypeEClass = createEClass(DOUBLE_TYPE);

    stringTypeEClass = createEClass(STRING_TYPE);

    charArrayTypeEClass = createEClass(CHAR_ARRAY_TYPE);

    shortArrayTypeEClass = createEClass(SHORT_ARRAY_TYPE);

    uShortArrayTypeEClass = createEClass(USHORT_ARRAY_TYPE);

    intArrayTypeEClass = createEClass(INT_ARRAY_TYPE);

    uIntArrayTypeEClass = createEClass(UINT_ARRAY_TYPE);

    floatArrayTypeEClass = createEClass(FLOAT_ARRAY_TYPE);

    doubleArrayTypeEClass = createEClass(DOUBLE_ARRAY_TYPE);

    stringArrayTypeEClass = createEClass(STRING_ARRAY_TYPE);

    longStringArrayTypeEClass = createEClass(LONG_STRING_ARRAY_TYPE);

    doubleStringArrayTypeEClass = createEClass(DOUBLE_STRING_ARRAY_TYPE);

    stateTypeEClass = createEClass(STATE_TYPE);

    constStringTypeEClass = createEClass(CONST_STRING_TYPE);

    booleanArrayTypeEClass = createEClass(BOOLEAN_ARRAY_TYPE);

    uCharTypeEClass = createEClass(UCHAR_TYPE);

    longTypeEClass = createEClass(LONG_TYPE);

    uLongTypeEClass = createEClass(ULONG_TYPE);

    longArrayTypeEClass = createEClass(LONG_ARRAY_TYPE);

    uLongArrayTypeEClass = createEClass(ULONG_ARRAY_TYPE);

    devIntTypeEClass = createEClass(DEV_INT_TYPE);

    encodedTypeEClass = createEClass(ENCODED_TYPE);

    shortVectorTypeEClass = createEClass(SHORT_VECTOR_TYPE);

    intVectorTypeEClass = createEClass(INT_VECTOR_TYPE);

    floatVectorTypeEClass = createEClass(FLOAT_VECTOR_TYPE);

    doubleVectorTypeEClass = createEClass(DOUBLE_VECTOR_TYPE);

    stringVectorTypeEClass = createEClass(STRING_VECTOR_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    simpleTypeEClass.getESuperTypes().add(this.getPropType());
    vectorTypeEClass.getESuperTypes().add(this.getPropType());
    voidTypeEClass.getESuperTypes().add(this.getType());
    booleanTypeEClass.getESuperTypes().add(this.getSimpleType());
    booleanTypeEClass.getESuperTypes().add(this.getType());
    shortTypeEClass.getESuperTypes().add(this.getSimpleType());
    shortTypeEClass.getESuperTypes().add(this.getType());
    uShortTypeEClass.getESuperTypes().add(this.getSimpleType());
    uShortTypeEClass.getESuperTypes().add(this.getType());
    intTypeEClass.getESuperTypes().add(this.getSimpleType());
    intTypeEClass.getESuperTypes().add(this.getType());
    uIntTypeEClass.getESuperTypes().add(this.getSimpleType());
    uIntTypeEClass.getESuperTypes().add(this.getType());
    floatTypeEClass.getESuperTypes().add(this.getSimpleType());
    floatTypeEClass.getESuperTypes().add(this.getType());
    doubleTypeEClass.getESuperTypes().add(this.getSimpleType());
    doubleTypeEClass.getESuperTypes().add(this.getType());
    stringTypeEClass.getESuperTypes().add(this.getSimpleType());
    stringTypeEClass.getESuperTypes().add(this.getType());
    charArrayTypeEClass.getESuperTypes().add(this.getType());
    shortArrayTypeEClass.getESuperTypes().add(this.getType());
    uShortArrayTypeEClass.getESuperTypes().add(this.getType());
    intArrayTypeEClass.getESuperTypes().add(this.getType());
    uIntArrayTypeEClass.getESuperTypes().add(this.getType());
    floatArrayTypeEClass.getESuperTypes().add(this.getType());
    doubleArrayTypeEClass.getESuperTypes().add(this.getType());
    stringArrayTypeEClass.getESuperTypes().add(this.getType());
    longStringArrayTypeEClass.getESuperTypes().add(this.getType());
    doubleStringArrayTypeEClass.getESuperTypes().add(this.getType());
    stateTypeEClass.getESuperTypes().add(this.getType());
    constStringTypeEClass.getESuperTypes().add(this.getType());
    booleanArrayTypeEClass.getESuperTypes().add(this.getType());
    uCharTypeEClass.getESuperTypes().add(this.getType());
    longTypeEClass.getESuperTypes().add(this.getType());
    uLongTypeEClass.getESuperTypes().add(this.getType());
    longArrayTypeEClass.getESuperTypes().add(this.getType());
    uLongArrayTypeEClass.getESuperTypes().add(this.getType());
    devIntTypeEClass.getESuperTypes().add(this.getType());
    encodedTypeEClass.getESuperTypes().add(this.getType());
    shortVectorTypeEClass.getESuperTypes().add(this.getVectorType());
    intVectorTypeEClass.getESuperTypes().add(this.getVectorType());
    floatVectorTypeEClass.getESuperTypes().add(this.getVectorType());
    doubleVectorTypeEClass.getESuperTypes().add(this.getVectorType());
    stringVectorTypeEClass.getESuperTypes().add(this.getVectorType());

    // Initialize classes and features; add operations and parameters
    initEClass(pogoSystemEClass, PogoSystem.class, "PogoSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPogoSystem_Imports(), this.getImport(), null, "imports", null, 0, -1, PogoSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoSystem_Classes(), this.getPogoDeviceClass(), null, "classes", null, 0, -1, PogoSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoSystem_MultiClasses(), this.getPogoMultiClasses(), null, "multiClasses", null, 0, -1, PogoSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pogoMultiClassesEClass, PogoMultiClasses.class, "PogoMultiClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPogoMultiClasses_Name(), ecorePackage.getEString(), "name", null, 0, 1, PogoMultiClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPogoMultiClasses_SourcePath(), ecorePackage.getEString(), "sourcePath", null, 0, 1, PogoMultiClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPogoMultiClasses_Description(), ecorePackage.getEString(), "description", null, 0, 1, PogoMultiClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPogoMultiClasses_Title(), ecorePackage.getEString(), "title", null, 0, 1, PogoMultiClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoMultiClasses_Classes(), this.getOneClassSimpleDef(), null, "classes", null, 0, -1, PogoMultiClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPogoMultiClasses_Filestogenerate(), ecorePackage.getEString(), "filestogenerate", null, 0, 1, PogoMultiClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoMultiClasses_Preferences(), this.getPreferences(), null, "preferences", null, 0, 1, PogoMultiClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oneClassSimpleDefEClass, OneClassSimpleDef.class, "OneClassSimpleDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOneClassSimpleDef_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, OneClassSimpleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneClassSimpleDef_SourcePath(), ecorePackage.getEString(), "sourcePath", null, 0, 1, OneClassSimpleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneClassSimpleDef_Pogo6(), ecorePackage.getEString(), "pogo6", null, 0, 1, OneClassSimpleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneClassSimpleDef_Inheritances(), this.getInheritance(), null, "inheritances", null, 0, -1, OneClassSimpleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOneClassSimpleDef_ParentClasses(), ecorePackage.getEString(), "parentClasses", null, 0, -1, OneClassSimpleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOneClassSimpleDef_AdditionalFiles(), this.getAdditionalFile(), null, "additionalFiles", null, 0, -1, OneClassSimpleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pogoDeviceClassEClass, PogoDeviceClass.class, "PogoDeviceClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPogoDeviceClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPogoDeviceClass_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoDeviceClass_BaseClass(), this.getPogoDeviceClass(), null, "baseClass", null, 0, 1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPogoDeviceClass_Institute(), ecorePackage.getEString(), "institute", null, 0, 1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoDeviceClass_Description(), this.getClassDescription(), null, "description", null, 0, 1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoDeviceClass_ClassProperties(), this.getProperty(), null, "classProperties", null, 0, -1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoDeviceClass_DeviceProperties(), this.getProperty(), null, "deviceProperties", null, 0, -1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoDeviceClass_Commands(), this.getCommand(), null, "commands", null, 0, -1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoDeviceClass_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoDeviceClass_DynamicAttributes(), this.getAttribute(), null, "dynamicAttributes", null, 0, -1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoDeviceClass_States(), this.getState(), null, "states", null, 0, -1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoDeviceClass_Preferences(), this.getPreferences(), null, "preferences", null, 0, 1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoDeviceClass_AdditionalFiles(), this.getAdditionalFile(), null, "additionalFiles", null, 0, -1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPogoDeviceClass_OverlodedPollPeriodObject(), this.getOverlodedPollPeriodObject(), null, "overlodedPollPeriodObject", null, 0, -1, PogoDeviceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classDescriptionEClass, ClassDescription.class, "ClassDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassDescription_Description(), ecorePackage.getEString(), "description", null, 0, 1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassDescription_Title(), ecorePackage.getEString(), "title", null, 0, 1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassDescription_SourcePath(), ecorePackage.getEString(), "sourcePath", null, 0, 1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDescription_Inheritances(), this.getInheritance(), null, "inheritances", null, 0, -1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassDescription_Language(), ecorePackage.getEString(), "language", null, 0, 1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassDescription_Filestogenerate(), ecorePackage.getEString(), "filestogenerate", null, 0, 1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDescription_Identification(), this.getClassIdentification(), null, "identification", null, 0, 1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDescription_Comments(), this.getComments(), null, "comments", null, 0, 1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassDescription_HasMandatoryProperty(), ecorePackage.getEString(), "hasMandatoryProperty", null, 0, 1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassDescription_HasAbstractCommand(), ecorePackage.getEString(), "hasAbstractCommand", null, 0, 1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassDescription_HasAbstractAttribute(), ecorePackage.getEString(), "hasAbstractAttribute", null, 0, 1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassDescription_DescriptionHtmlExists(), ecorePackage.getEString(), "descriptionHtmlExists", null, 0, 1, ClassDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInheritance_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, Inheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInheritance_SourcePath(), ecorePackage.getEString(), "sourcePath", null, 0, 1, Inheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classIdentificationEClass, ClassIdentification.class, "ClassIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassIdentification_Contact(), ecorePackage.getEString(), "contact", null, 0, 1, ClassIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassIdentification_Author(), ecorePackage.getEString(), "author", null, 0, 1, ClassIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassIdentification_EmailDomain(), ecorePackage.getEString(), "emailDomain", null, 0, 1, ClassIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassIdentification_ClassFamily(), ecorePackage.getEString(), "classFamily", null, 0, 1, ClassIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassIdentification_SiteSpecific(), ecorePackage.getEString(), "siteSpecific", null, 0, 1, ClassIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassIdentification_Platform(), ecorePackage.getEString(), "platform", null, 0, 1, ClassIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassIdentification_Bus(), ecorePackage.getEString(), "bus", null, 0, 1, ClassIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassIdentification_Manufacturer(), ecorePackage.getEString(), "manufacturer", null, 0, 1, ClassIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassIdentification_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, ClassIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commentsEClass, Comments.class, "Comments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComments_CommandsTable(), ecorePackage.getEString(), "commandsTable", null, 0, 1, Comments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preferencesEClass, Preferences.class, "Preferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPreferences_DocHome(), ecorePackage.getEString(), "docHome", null, 0, 1, Preferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPreferences_MakefileHome(), ecorePackage.getEString(), "makefileHome", null, 0, 1, Preferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPreferences_InstallHome(), ecorePackage.getEString(), "installHome", null, 0, 1, Preferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPreferences_HtmlVersion(), ecorePackage.getEString(), "htmlVersion", null, 0, 1, Preferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_Description(), ecorePackage.getEString(), "description", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_Status(), this.getInheritanceStatus(), null, "status", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Type(), this.getPropType(), null, "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Status(), this.getInheritanceStatus(), null, "status", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Mandatory(), ecorePackage.getEString(), "mandatory", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_DefaultPropValue(), ecorePackage.getEString(), "DefaultPropValue", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propTypeEClass, PropType.class, "PropType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(vectorTypeEClass, VectorType.class, "VectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inheritanceStatusEClass, InheritanceStatus.class, "InheritanceStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInheritanceStatus_Abstract(), ecorePackage.getEString(), "abstract", null, 0, 1, InheritanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInheritanceStatus_Inherited(), ecorePackage.getEString(), "inherited", null, 0, 1, InheritanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInheritanceStatus_Concrete(), ecorePackage.getEString(), "concrete", null, 0, 1, InheritanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInheritanceStatus_ConcreteHere(), ecorePackage.getEString(), "concreteHere", null, 0, 1, InheritanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInheritanceStatus_HasChanged(), ecorePackage.getEString(), "hasChanged", null, 0, 1, InheritanceStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_Argin(), this.getArgument(), null, "argin", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_Argout(), this.getArgument(), null, "argout", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommand_Description(), ecorePackage.getEString(), "description", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_Status(), this.getInheritanceStatus(), null, "status", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommand_ExecMethod(), ecorePackage.getEString(), "execMethod", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommand_DisplayLevel(), ecorePackage.getEString(), "displayLevel", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommand_PolledPeriod(), ecorePackage.getEString(), "polledPeriod", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommand_ExcludedStates(), ecorePackage.getEString(), "excludedStates", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgument_Type(), this.getType(), null, "type", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgument_Description(), ecorePackage.getEString(), "description", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_AttType(), ecorePackage.getEString(), "attType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_DataType(), this.getType(), null, "dataType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_RwType(), ecorePackage.getEString(), "rwType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_DisplayLevel(), ecorePackage.getEString(), "displayLevel", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_PolledPeriod(), ecorePackage.getEString(), "polledPeriod", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_MaxX(), ecorePackage.getEString(), "maxX", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_MaxY(), ecorePackage.getEString(), "maxY", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_AssociatedAttr(), ecorePackage.getEString(), "associatedAttr", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Memorized(), ecorePackage.getEString(), "memorized", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_MemorizedAtInit(), ecorePackage.getEString(), "memorizedAtInit", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_ChangeEvent(), this.getFireEvents(), null, "changeEvent", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_ArchiveEvent(), this.getFireEvents(), null, "archiveEvent", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_DataReadyEvent(), this.getFireEvents(), null, "dataReadyEvent", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Status(), this.getInheritanceStatus(), null, "status", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Properties(), this.getAttrProperties(), null, "properties", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_AllocReadMember(), ecorePackage.getEString(), "allocReadMember", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_IsDynamic(), ecorePackage.getEString(), "isDynamic", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_ReadExcludedStates(), ecorePackage.getEString(), "readExcludedStates", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_WriteExcludedStates(), ecorePackage.getEString(), "writeExcludedStates", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fireEventsEClass, FireEvents.class, "FireEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFireEvents_Fire(), ecorePackage.getEString(), "fire", null, 0, 1, FireEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFireEvents_LibCheckCriteria(), ecorePackage.getEString(), "libCheckCriteria", null, 0, 1, FireEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attrPropertiesEClass, AttrProperties.class, "AttrProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttrProperties_Description(), ecorePackage.getEString(), "description", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_Label(), ecorePackage.getEString(), "label", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_StandardUnit(), ecorePackage.getEString(), "standardUnit", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_DisplayUnit(), ecorePackage.getEString(), "displayUnit", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_Format(), ecorePackage.getEString(), "format", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_MaxValue(), ecorePackage.getEString(), "maxValue", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_MinValue(), ecorePackage.getEString(), "minValue", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_MaxAlarm(), ecorePackage.getEString(), "maxAlarm", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_MinAlarm(), ecorePackage.getEString(), "minAlarm", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_MaxWarning(), ecorePackage.getEString(), "maxWarning", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_MinWarning(), ecorePackage.getEString(), "minWarning", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_DeltaTime(), ecorePackage.getEString(), "deltaTime", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttrProperties_DeltaValue(), ecorePackage.getEString(), "deltaValue", null, 0, 1, AttrProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additionalFileEClass, AdditionalFile.class, "AdditionalFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdditionalFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdditionalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdditionalFile_Path(), ecorePackage.getEString(), "path", null, 0, 1, AdditionalFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(overlodedPollPeriodObjectEClass, OverlodedPollPeriodObject.class, "OverlodedPollPeriodObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOverlodedPollPeriodObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, OverlodedPollPeriodObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOverlodedPollPeriodObject_Type(), ecorePackage.getEString(), "type", null, 0, 1, OverlodedPollPeriodObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOverlodedPollPeriodObject_PollPeriod(), ecorePackage.getEString(), "pollPeriod", null, 0, 1, OverlodedPollPeriodObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(voidTypeEClass, VoidType.class, "VoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(shortTypeEClass, ShortType.class, "ShortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uShortTypeEClass, UShortType.class, "UShortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intTypeEClass, IntType.class, "IntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uIntTypeEClass, UIntType.class, "UIntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatTypeEClass, FloatType.class, "FloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(doubleTypeEClass, DoubleType.class, "DoubleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(charArrayTypeEClass, CharArrayType.class, "CharArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(shortArrayTypeEClass, ShortArrayType.class, "ShortArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uShortArrayTypeEClass, UShortArrayType.class, "UShortArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intArrayTypeEClass, IntArrayType.class, "IntArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uIntArrayTypeEClass, UIntArrayType.class, "UIntArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatArrayTypeEClass, FloatArrayType.class, "FloatArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(doubleArrayTypeEClass, DoubleArrayType.class, "DoubleArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringArrayTypeEClass, StringArrayType.class, "StringArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(longStringArrayTypeEClass, LongStringArrayType.class, "LongStringArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(doubleStringArrayTypeEClass, DoubleStringArrayType.class, "DoubleStringArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateTypeEClass, StateType.class, "StateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constStringTypeEClass, ConstStringType.class, "ConstStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanArrayTypeEClass, BooleanArrayType.class, "BooleanArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uCharTypeEClass, UCharType.class, "UCharType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(longTypeEClass, LongType.class, "LongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uLongTypeEClass, ULongType.class, "ULongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(longArrayTypeEClass, LongArrayType.class, "LongArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(uLongArrayTypeEClass, ULongArrayType.class, "ULongArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(devIntTypeEClass, DevIntType.class, "DevIntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(encodedTypeEClass, EncodedType.class, "EncodedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(shortVectorTypeEClass, ShortVectorType.class, "ShortVectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intVectorTypeEClass, IntVectorType.class, "IntVectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatVectorTypeEClass, FloatVectorType.class, "FloatVectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(doubleVectorTypeEClass, DoubleVectorType.class, "DoubleVectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringVectorTypeEClass, StringVectorType.class, "StringVectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //PogoDslPackageImpl
