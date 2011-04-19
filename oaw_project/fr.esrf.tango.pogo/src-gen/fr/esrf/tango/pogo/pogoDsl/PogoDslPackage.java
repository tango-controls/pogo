/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslFactory
 * @model kind="package"
 * @generated
 */
public interface PogoDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pogoDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.esrf.fr/tango/pogo/PogoDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pogoDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PogoDslPackage eINSTANCE = fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoSystemImpl <em>Pogo System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoSystemImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getPogoSystem()
   * @generated
   */
  int POGO_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_SYSTEM__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_SYSTEM__CLASSES = 1;

  /**
   * The feature id for the '<em><b>Multi Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_SYSTEM__MULTI_CLASSES = 2;

  /**
   * The number of structural features of the '<em>Pogo System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_SYSTEM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.ImportImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoMultiClassesImpl <em>Pogo Multi Classes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoMultiClassesImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getPogoMultiClasses()
   * @generated
   */
  int POGO_MULTI_CLASSES = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_MULTI_CLASSES__NAME = 0;

  /**
   * The feature id for the '<em><b>Source Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_MULTI_CLASSES__SOURCE_PATH = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_MULTI_CLASSES__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_MULTI_CLASSES__TITLE = 3;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_MULTI_CLASSES__CLASSES = 4;

  /**
   * The feature id for the '<em><b>Filestogenerate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_MULTI_CLASSES__FILESTOGENERATE = 5;

  /**
   * The feature id for the '<em><b>Preferences</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_MULTI_CLASSES__PREFERENCES = 6;

  /**
   * The number of structural features of the '<em>Pogo Multi Classes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_MULTI_CLASSES_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.OneClassSimpleDefImpl <em>One Class Simple Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.OneClassSimpleDefImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getOneClassSimpleDef()
   * @generated
   */
  int ONE_CLASS_SIMPLE_DEF = 3;

  /**
   * The feature id for the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_CLASS_SIMPLE_DEF__CLASSNAME = 0;

  /**
   * The feature id for the '<em><b>Source Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_CLASS_SIMPLE_DEF__SOURCE_PATH = 1;

  /**
   * The feature id for the '<em><b>Pogo6</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_CLASS_SIMPLE_DEF__POGO6 = 2;

  /**
   * The feature id for the '<em><b>Inheritances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_CLASS_SIMPLE_DEF__INHERITANCES = 3;

  /**
   * The feature id for the '<em><b>Parent Classes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_CLASS_SIMPLE_DEF__PARENT_CLASSES = 4;

  /**
   * The feature id for the '<em><b>Additional Files</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_CLASS_SIMPLE_DEF__ADDITIONAL_FILES = 5;

  /**
   * The number of structural features of the '<em>One Class Simple Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_CLASS_SIMPLE_DEF_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl <em>Pogo Device Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getPogoDeviceClass()
   * @generated
   */
  int POGO_DEVICE_CLASS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__IS_ABSTRACT = 1;

  /**
   * The feature id for the '<em><b>Base Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__BASE_CLASS = 2;

  /**
   * The feature id for the '<em><b>Institute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__INSTITUTE = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Class Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__CLASS_PROPERTIES = 5;

  /**
   * The feature id for the '<em><b>Device Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__DEVICE_PROPERTIES = 6;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__COMMANDS = 7;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__ATTRIBUTES = 8;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__STATES = 9;

  /**
   * The feature id for the '<em><b>Preferences</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__PREFERENCES = 10;

  /**
   * The feature id for the '<em><b>Additional Files</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS__ADDITIONAL_FILES = 11;

  /**
   * The number of structural features of the '<em>Pogo Device Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POGO_DEVICE_CLASS_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl <em>Class Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getClassDescription()
   * @generated
   */
  int CLASS_DESCRIPTION = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__TITLE = 1;

  /**
   * The feature id for the '<em><b>Source Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__SOURCE_PATH = 2;

  /**
   * The feature id for the '<em><b>Inheritances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__INHERITANCES = 3;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__LANGUAGE = 4;

  /**
   * The feature id for the '<em><b>Filestogenerate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__FILESTOGENERATE = 5;

  /**
   * The feature id for the '<em><b>Identification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__IDENTIFICATION = 6;

  /**
   * The feature id for the '<em><b>Comments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__COMMENTS = 7;

  /**
   * The feature id for the '<em><b>Has Abstract Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__HAS_ABSTRACT_COMMAND = 8;

  /**
   * The feature id for the '<em><b>Has Abstract Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__HAS_ABSTRACT_ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Has Dynamic Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__HAS_DYNAMIC_ATTRIBUTE = 10;

  /**
   * The feature id for the '<em><b>Description Html Exists</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION__DESCRIPTION_HTML_EXISTS = 11;

  /**
   * The number of structural features of the '<em>Class Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DESCRIPTION_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.InheritanceImpl <em>Inheritance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.InheritanceImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getInheritance()
   * @generated
   */
  int INHERITANCE = 6;

  /**
   * The feature id for the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__CLASSNAME = 0;

  /**
   * The feature id for the '<em><b>Source Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__SOURCE_PATH = 1;

  /**
   * The number of structural features of the '<em>Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl <em>Class Identification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getClassIdentification()
   * @generated
   */
  int CLASS_IDENTIFICATION = 7;

  /**
   * The feature id for the '<em><b>Contact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_IDENTIFICATION__CONTACT = 0;

  /**
   * The feature id for the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_IDENTIFICATION__AUTHOR = 1;

  /**
   * The feature id for the '<em><b>Email Domain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_IDENTIFICATION__EMAIL_DOMAIN = 2;

  /**
   * The feature id for the '<em><b>Class Family</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_IDENTIFICATION__CLASS_FAMILY = 3;

  /**
   * The feature id for the '<em><b>Site Specific</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_IDENTIFICATION__SITE_SPECIFIC = 4;

  /**
   * The feature id for the '<em><b>Platform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_IDENTIFICATION__PLATFORM = 5;

  /**
   * The feature id for the '<em><b>Bus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_IDENTIFICATION__BUS = 6;

  /**
   * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_IDENTIFICATION__MANUFACTURER = 7;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_IDENTIFICATION__REFERENCE = 8;

  /**
   * The number of structural features of the '<em>Class Identification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_IDENTIFICATION_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.CommentsImpl <em>Comments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.CommentsImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getComments()
   * @generated
   */
  int COMMENTS = 8;

  /**
   * The feature id for the '<em><b>Commands Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENTS__COMMANDS_TABLE = 0;

  /**
   * The number of structural features of the '<em>Comments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PreferencesImpl <em>Preferences</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PreferencesImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getPreferences()
   * @generated
   */
  int PREFERENCES = 9;

  /**
   * The feature id for the '<em><b>Doc Home</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES__DOC_HOME = 0;

  /**
   * The feature id for the '<em><b>Makefile Home</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES__MAKEFILE_HOME = 1;

  /**
   * The feature id for the '<em><b>Install Home</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES__INSTALL_HOME = 2;

  /**
   * The feature id for the '<em><b>Html Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES__HTML_VERSION = 3;

  /**
   * The number of structural features of the '<em>Preferences</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFERENCES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.StateImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getState()
   * @generated
   */
  int STATE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATUS = 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PropertyImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__STATUS = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Default Prop Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DEFAULT_PROP_VALUE = 4;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PropTypeImpl <em>Prop Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PropTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getPropType()
   * @generated
   */
  int PROP_TYPE = 12;

  /**
   * The number of structural features of the '<em>Prop Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROP_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.SimpleTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getSimpleType()
   * @generated
   */
  int SIMPLE_TYPE = 13;

  /**
   * The number of structural features of the '<em>Simple Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_FEATURE_COUNT = PROP_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.VectorTypeImpl <em>Vector Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.VectorTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getVectorType()
   * @generated
   */
  int VECTOR_TYPE = 14;

  /**
   * The number of structural features of the '<em>Vector Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_TYPE_FEATURE_COUNT = PROP_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.InheritanceStatusImpl <em>Inheritance Status</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.InheritanceStatusImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getInheritanceStatus()
   * @generated
   */
  int INHERITANCE_STATUS = 15;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_STATUS__ABSTRACT = 0;

  /**
   * The feature id for the '<em><b>Inherited</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_STATUS__INHERITED = 1;

  /**
   * The feature id for the '<em><b>Concrete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_STATUS__CONCRETE = 2;

  /**
   * The feature id for the '<em><b>Concrete Here</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_STATUS__CONCRETE_HERE = 3;

  /**
   * The feature id for the '<em><b>Has Changed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_STATUS__HAS_CHANGED = 4;

  /**
   * The number of structural features of the '<em>Inheritance Status</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_STATUS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = 0;

  /**
   * The feature id for the '<em><b>Argin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__ARGIN = 1;

  /**
   * The feature id for the '<em><b>Argout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__ARGOUT = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__STATUS = 4;

  /**
   * The feature id for the '<em><b>Exec Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__EXEC_METHOD = 5;

  /**
   * The feature id for the '<em><b>Display Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__DISPLAY_LEVEL = 6;

  /**
   * The feature id for the '<em><b>Polled Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__POLLED_PERIOD = 7;

  /**
   * The feature id for the '<em><b>Excluded States</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__EXCLUDED_STATES = 8;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.ArgumentImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 17;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.AttributeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Att Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATT_TYPE = 1;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DATA_TYPE = 2;

  /**
   * The feature id for the '<em><b>Rw Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__RW_TYPE = 3;

  /**
   * The feature id for the '<em><b>Display Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DISPLAY_LEVEL = 4;

  /**
   * The feature id for the '<em><b>Polled Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__POLLED_PERIOD = 5;

  /**
   * The feature id for the '<em><b>Max X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MAX_X = 6;

  /**
   * The feature id for the '<em><b>Max Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MAX_Y = 7;

  /**
   * The feature id for the '<em><b>Associated Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ASSOCIATED_ATTR = 8;

  /**
   * The feature id for the '<em><b>Memorized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MEMORIZED = 9;

  /**
   * The feature id for the '<em><b>Memorized At Init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MEMORIZED_AT_INIT = 10;

  /**
   * The feature id for the '<em><b>Change Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__CHANGE_EVENT = 11;

  /**
   * The feature id for the '<em><b>Archive Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ARCHIVE_EVENT = 12;

  /**
   * The feature id for the '<em><b>Data Ready Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DATA_READY_EVENT = 13;

  /**
   * The feature id for the '<em><b>Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__STATUS = 14;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__PROPERTIES = 15;

  /**
   * The feature id for the '<em><b>Alloc Read Member</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ALLOC_READ_MEMBER = 16;

  /**
   * The feature id for the '<em><b>Is Dynamic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__IS_DYNAMIC = 17;

  /**
   * The feature id for the '<em><b>Read Excluded States</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__READ_EXCLUDED_STATES = 18;

  /**
   * The feature id for the '<em><b>Write Excluded States</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__WRITE_EXCLUDED_STATES = 19;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 20;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.FireEventsImpl <em>Fire Events</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.FireEventsImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getFireEvents()
   * @generated
   */
  int FIRE_EVENTS = 19;

  /**
   * The feature id for the '<em><b>Fire</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRE_EVENTS__FIRE = 0;

  /**
   * The feature id for the '<em><b>Lib Check Criteria</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRE_EVENTS__LIB_CHECK_CRITERIA = 1;

  /**
   * The number of structural features of the '<em>Fire Events</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIRE_EVENTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl <em>Attr Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getAttrProperties()
   * @generated
   */
  int ATTR_PROPERTIES = 20;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__LABEL = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__UNIT = 2;

  /**
   * The feature id for the '<em><b>Standard Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__STANDARD_UNIT = 3;

  /**
   * The feature id for the '<em><b>Display Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__DISPLAY_UNIT = 4;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__FORMAT = 5;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__MAX_VALUE = 6;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__MIN_VALUE = 7;

  /**
   * The feature id for the '<em><b>Max Alarm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__MAX_ALARM = 8;

  /**
   * The feature id for the '<em><b>Min Alarm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__MIN_ALARM = 9;

  /**
   * The feature id for the '<em><b>Max Warning</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__MAX_WARNING = 10;

  /**
   * The feature id for the '<em><b>Min Warning</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__MIN_WARNING = 11;

  /**
   * The feature id for the '<em><b>Delta Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__DELTA_TIME = 12;

  /**
   * The feature id for the '<em><b>Delta Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES__DELTA_VALUE = 13;

  /**
   * The number of structural features of the '<em>Attr Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_PROPERTIES_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.AdditionalFileImpl <em>Additional File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.AdditionalFileImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getAdditionalFile()
   * @generated
   */
  int ADDITIONAL_FILE = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_FILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_FILE__PATH = 1;

  /**
   * The number of structural features of the '<em>Additional File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.TypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 22;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.VoidTypeImpl <em>Void Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.VoidTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getVoidType()
   * @generated
   */
  int VOID_TYPE = 23;

  /**
   * The number of structural features of the '<em>Void Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.BooleanTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getBooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 24;

  /**
   * The number of structural features of the '<em>Boolean Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ShortTypeImpl <em>Short Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.ShortTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getShortType()
   * @generated
   */
  int SHORT_TYPE = 25;

  /**
   * The number of structural features of the '<em>Short Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.UShortTypeImpl <em>UShort Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.UShortTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getUShortType()
   * @generated
   */
  int USHORT_TYPE = 26;

  /**
   * The number of structural features of the '<em>UShort Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USHORT_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.IntTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 27;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.UIntTypeImpl <em>UInt Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.UIntTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getUIntType()
   * @generated
   */
  int UINT_TYPE = 28;

  /**
   * The number of structural features of the '<em>UInt Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UINT_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.FloatTypeImpl <em>Float Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.FloatTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getFloatType()
   * @generated
   */
  int FLOAT_TYPE = 29;

  /**
   * The number of structural features of the '<em>Float Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.DoubleTypeImpl <em>Double Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.DoubleTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getDoubleType()
   * @generated
   */
  int DOUBLE_TYPE = 30;

  /**
   * The number of structural features of the '<em>Double Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.StringTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 31;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = SIMPLE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.CharArrayTypeImpl <em>Char Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.CharArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getCharArrayType()
   * @generated
   */
  int CHAR_ARRAY_TYPE = 32;

  /**
   * The number of structural features of the '<em>Char Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ShortArrayTypeImpl <em>Short Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.ShortArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getShortArrayType()
   * @generated
   */
  int SHORT_ARRAY_TYPE = 33;

  /**
   * The number of structural features of the '<em>Short Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.UShortArrayTypeImpl <em>UShort Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.UShortArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getUShortArrayType()
   * @generated
   */
  int USHORT_ARRAY_TYPE = 34;

  /**
   * The number of structural features of the '<em>UShort Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USHORT_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.IntArrayTypeImpl <em>Int Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.IntArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getIntArrayType()
   * @generated
   */
  int INT_ARRAY_TYPE = 35;

  /**
   * The number of structural features of the '<em>Int Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.UIntArrayTypeImpl <em>UInt Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.UIntArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getUIntArrayType()
   * @generated
   */
  int UINT_ARRAY_TYPE = 36;

  /**
   * The number of structural features of the '<em>UInt Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UINT_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.FloatArrayTypeImpl <em>Float Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.FloatArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getFloatArrayType()
   * @generated
   */
  int FLOAT_ARRAY_TYPE = 37;

  /**
   * The number of structural features of the '<em>Float Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.DoubleArrayTypeImpl <em>Double Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.DoubleArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getDoubleArrayType()
   * @generated
   */
  int DOUBLE_ARRAY_TYPE = 38;

  /**
   * The number of structural features of the '<em>Double Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.StringArrayTypeImpl <em>String Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.StringArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getStringArrayType()
   * @generated
   */
  int STRING_ARRAY_TYPE = 39;

  /**
   * The number of structural features of the '<em>String Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.LongStringArrayTypeImpl <em>Long String Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.LongStringArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getLongStringArrayType()
   * @generated
   */
  int LONG_STRING_ARRAY_TYPE = 40;

  /**
   * The number of structural features of the '<em>Long String Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_STRING_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.DoubleStringArrayTypeImpl <em>Double String Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.DoubleStringArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getDoubleStringArrayType()
   * @generated
   */
  int DOUBLE_STRING_ARRAY_TYPE = 41;

  /**
   * The number of structural features of the '<em>Double String Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_STRING_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.StateTypeImpl <em>State Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.StateTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getStateType()
   * @generated
   */
  int STATE_TYPE = 42;

  /**
   * The number of structural features of the '<em>State Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ConstStringTypeImpl <em>Const String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.ConstStringTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getConstStringType()
   * @generated
   */
  int CONST_STRING_TYPE = 43;

  /**
   * The number of structural features of the '<em>Const String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_STRING_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.BooleanArrayTypeImpl <em>Boolean Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.BooleanArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getBooleanArrayType()
   * @generated
   */
  int BOOLEAN_ARRAY_TYPE = 44;

  /**
   * The number of structural features of the '<em>Boolean Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.UCharTypeImpl <em>UChar Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.UCharTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getUCharType()
   * @generated
   */
  int UCHAR_TYPE = 45;

  /**
   * The number of structural features of the '<em>UChar Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UCHAR_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.LongTypeImpl <em>Long Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.LongTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getLongType()
   * @generated
   */
  int LONG_TYPE = 46;

  /**
   * The number of structural features of the '<em>Long Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ULongTypeImpl <em>ULong Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.ULongTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getULongType()
   * @generated
   */
  int ULONG_TYPE = 47;

  /**
   * The number of structural features of the '<em>ULong Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ULONG_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.LongArrayTypeImpl <em>Long Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.LongArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getLongArrayType()
   * @generated
   */
  int LONG_ARRAY_TYPE = 48;

  /**
   * The number of structural features of the '<em>Long Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ULongArrayTypeImpl <em>ULong Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.ULongArrayTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getULongArrayType()
   * @generated
   */
  int ULONG_ARRAY_TYPE = 49;

  /**
   * The number of structural features of the '<em>ULong Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ULONG_ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.DevIntTypeImpl <em>Dev Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.DevIntTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getDevIntType()
   * @generated
   */
  int DEV_INT_TYPE = 50;

  /**
   * The number of structural features of the '<em>Dev Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEV_INT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.EncodedTypeImpl <em>Encoded Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.EncodedTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getEncodedType()
   * @generated
   */
  int ENCODED_TYPE = 51;

  /**
   * The number of structural features of the '<em>Encoded Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENCODED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ShortVectorTypeImpl <em>Short Vector Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.ShortVectorTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getShortVectorType()
   * @generated
   */
  int SHORT_VECTOR_TYPE = 52;

  /**
   * The number of structural features of the '<em>Short Vector Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHORT_VECTOR_TYPE_FEATURE_COUNT = VECTOR_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.IntVectorTypeImpl <em>Int Vector Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.IntVectorTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getIntVectorType()
   * @generated
   */
  int INT_VECTOR_TYPE = 53;

  /**
   * The number of structural features of the '<em>Int Vector Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VECTOR_TYPE_FEATURE_COUNT = VECTOR_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.FloatVectorTypeImpl <em>Float Vector Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.FloatVectorTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getFloatVectorType()
   * @generated
   */
  int FLOAT_VECTOR_TYPE = 54;

  /**
   * The number of structural features of the '<em>Float Vector Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VECTOR_TYPE_FEATURE_COUNT = VECTOR_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.DoubleVectorTypeImpl <em>Double Vector Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.DoubleVectorTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getDoubleVectorType()
   * @generated
   */
  int DOUBLE_VECTOR_TYPE = 55;

  /**
   * The number of structural features of the '<em>Double Vector Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VECTOR_TYPE_FEATURE_COUNT = VECTOR_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.StringVectorTypeImpl <em>String Vector Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.esrf.tango.pogo.pogoDsl.impl.StringVectorTypeImpl
   * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getStringVectorType()
   * @generated
   */
  int STRING_VECTOR_TYPE = 56;

  /**
   * The number of structural features of the '<em>String Vector Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VECTOR_TYPE_FEATURE_COUNT = VECTOR_TYPE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.PogoSystem <em>Pogo System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pogo System</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoSystem
   * @generated
   */
  EClass getPogoSystem();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.PogoSystem#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoSystem#getImports()
   * @see #getPogoSystem()
   * @generated
   */
  EReference getPogoSystem_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.PogoSystem#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoSystem#getClasses()
   * @see #getPogoSystem()
   * @generated
   */
  EReference getPogoSystem_Classes();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.PogoSystem#getMultiClasses <em>Multi Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Multi Classes</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoSystem#getMultiClasses()
   * @see #getPogoSystem()
   * @generated
   */
  EReference getPogoSystem_MultiClasses();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses <em>Pogo Multi Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pogo Multi Classes</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses
   * @generated
   */
  EClass getPogoMultiClasses();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getName()
   * @see #getPogoMultiClasses()
   * @generated
   */
  EAttribute getPogoMultiClasses_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getSourcePath <em>Source Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Path</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getSourcePath()
   * @see #getPogoMultiClasses()
   * @generated
   */
  EAttribute getPogoMultiClasses_SourcePath();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getDescription()
   * @see #getPogoMultiClasses()
   * @generated
   */
  EAttribute getPogoMultiClasses_Description();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getTitle()
   * @see #getPogoMultiClasses()
   * @generated
   */
  EAttribute getPogoMultiClasses_Title();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getClasses()
   * @see #getPogoMultiClasses()
   * @generated
   */
  EReference getPogoMultiClasses_Classes();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getFilestogenerate <em>Filestogenerate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filestogenerate</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getFilestogenerate()
   * @see #getPogoMultiClasses()
   * @generated
   */
  EAttribute getPogoMultiClasses_Filestogenerate();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getPreferences <em>Preferences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preferences</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses#getPreferences()
   * @see #getPogoMultiClasses()
   * @generated
   */
  EReference getPogoMultiClasses_Preferences();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef <em>One Class Simple Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>One Class Simple Def</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef
   * @generated
   */
  EClass getOneClassSimpleDef();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Classname</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getClassname()
   * @see #getOneClassSimpleDef()
   * @generated
   */
  EAttribute getOneClassSimpleDef_Classname();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getSourcePath <em>Source Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Path</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getSourcePath()
   * @see #getOneClassSimpleDef()
   * @generated
   */
  EAttribute getOneClassSimpleDef_SourcePath();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getPogo6 <em>Pogo6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pogo6</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getPogo6()
   * @see #getOneClassSimpleDef()
   * @generated
   */
  EAttribute getOneClassSimpleDef_Pogo6();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getInheritances <em>Inheritances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inheritances</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getInheritances()
   * @see #getOneClassSimpleDef()
   * @generated
   */
  EReference getOneClassSimpleDef_Inheritances();

  /**
   * Returns the meta object for the attribute list '{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getParentClasses <em>Parent Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parent Classes</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getParentClasses()
   * @see #getOneClassSimpleDef()
   * @generated
   */
  EAttribute getOneClassSimpleDef_ParentClasses();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getAdditionalFiles <em>Additional Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additional Files</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.OneClassSimpleDef#getAdditionalFiles()
   * @see #getOneClassSimpleDef()
   * @generated
   */
  EReference getOneClassSimpleDef_AdditionalFiles();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass <em>Pogo Device Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pogo Device Class</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
   * @generated
   */
  EClass getPogoDeviceClass();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getName()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EAttribute getPogoDeviceClass_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#isIsAbstract()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EAttribute getPogoDeviceClass_IsAbstract();

  /**
   * Returns the meta object for the reference '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getBaseClass <em>Base Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Class</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getBaseClass()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EReference getPogoDeviceClass_BaseClass();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getInstitute <em>Institute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Institute</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getInstitute()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EAttribute getPogoDeviceClass_Institute();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getDescription()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EReference getPogoDeviceClass_Description();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getClassProperties <em>Class Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Properties</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getClassProperties()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EReference getPogoDeviceClass_ClassProperties();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getDeviceProperties <em>Device Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device Properties</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getDeviceProperties()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EReference getPogoDeviceClass_DeviceProperties();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getCommands()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EReference getPogoDeviceClass_Commands();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getAttributes()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EReference getPogoDeviceClass_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getStates()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EReference getPogoDeviceClass_States();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getPreferences <em>Preferences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Preferences</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getPreferences()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EReference getPogoDeviceClass_Preferences();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getAdditionalFiles <em>Additional Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additional Files</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass#getAdditionalFiles()
   * @see #getPogoDeviceClass()
   * @generated
   */
  EReference getPogoDeviceClass_AdditionalFiles();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription <em>Class Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Description</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription
   * @generated
   */
  EClass getClassDescription();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getDescription()
   * @see #getClassDescription()
   * @generated
   */
  EAttribute getClassDescription_Description();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getTitle()
   * @see #getClassDescription()
   * @generated
   */
  EAttribute getClassDescription_Title();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getSourcePath <em>Source Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Path</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getSourcePath()
   * @see #getClassDescription()
   * @generated
   */
  EAttribute getClassDescription_SourcePath();

  /**
   * Returns the meta object for the containment reference list '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getInheritances <em>Inheritances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inheritances</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getInheritances()
   * @see #getClassDescription()
   * @generated
   */
  EReference getClassDescription_Inheritances();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Language</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getLanguage()
   * @see #getClassDescription()
   * @generated
   */
  EAttribute getClassDescription_Language();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getFilestogenerate <em>Filestogenerate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filestogenerate</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getFilestogenerate()
   * @see #getClassDescription()
   * @generated
   */
  EAttribute getClassDescription_Filestogenerate();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getIdentification <em>Identification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identification</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getIdentification()
   * @see #getClassDescription()
   * @generated
   */
  EReference getClassDescription_Identification();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getComments <em>Comments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comments</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getComments()
   * @see #getClassDescription()
   * @generated
   */
  EReference getClassDescription_Comments();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasAbstractCommand <em>Has Abstract Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Abstract Command</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasAbstractCommand()
   * @see #getClassDescription()
   * @generated
   */
  EAttribute getClassDescription_HasAbstractCommand();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasAbstractAttribute <em>Has Abstract Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Abstract Attribute</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasAbstractAttribute()
   * @see #getClassDescription()
   * @generated
   */
  EAttribute getClassDescription_HasAbstractAttribute();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasDynamicAttribute <em>Has Dynamic Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Dynamic Attribute</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getHasDynamicAttribute()
   * @see #getClassDescription()
   * @generated
   */
  EAttribute getClassDescription_HasDynamicAttribute();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription#getDescriptionHtmlExists <em>Description Html Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description Html Exists</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription#getDescriptionHtmlExists()
   * @see #getClassDescription()
   * @generated
   */
  EAttribute getClassDescription_DescriptionHtmlExists();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.Inheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inheritance</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Inheritance
   * @generated
   */
  EClass getInheritance();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Inheritance#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Classname</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Inheritance#getClassname()
   * @see #getInheritance()
   * @generated
   */
  EAttribute getInheritance_Classname();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Inheritance#getSourcePath <em>Source Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Path</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Inheritance#getSourcePath()
   * @see #getInheritance()
   * @generated
   */
  EAttribute getInheritance_SourcePath();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.ClassIdentification <em>Class Identification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Identification</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassIdentification
   * @generated
   */
  EClass getClassIdentification();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getContact <em>Contact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contact</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getContact()
   * @see #getClassIdentification()
   * @generated
   */
  EAttribute getClassIdentification_Contact();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Author</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getAuthor()
   * @see #getClassIdentification()
   * @generated
   */
  EAttribute getClassIdentification_Author();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getEmailDomain <em>Email Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email Domain</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getEmailDomain()
   * @see #getClassIdentification()
   * @generated
   */
  EAttribute getClassIdentification_EmailDomain();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getClassFamily <em>Class Family</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Family</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getClassFamily()
   * @see #getClassIdentification()
   * @generated
   */
  EAttribute getClassIdentification_ClassFamily();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getSiteSpecific <em>Site Specific</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Site Specific</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getSiteSpecific()
   * @see #getClassIdentification()
   * @generated
   */
  EAttribute getClassIdentification_SiteSpecific();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getPlatform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Platform</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getPlatform()
   * @see #getClassIdentification()
   * @generated
   */
  EAttribute getClassIdentification_Platform();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getBus <em>Bus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bus</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getBus()
   * @see #getClassIdentification()
   * @generated
   */
  EAttribute getClassIdentification_Bus();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getManufacturer <em>Manufacturer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Manufacturer</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getManufacturer()
   * @see #getClassIdentification()
   * @generated
   */
  EAttribute getClassIdentification_Manufacturer();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassIdentification#getReference()
   * @see #getClassIdentification()
   * @generated
   */
  EAttribute getClassIdentification_Reference();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.Comments <em>Comments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comments</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Comments
   * @generated
   */
  EClass getComments();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Comments#getCommandsTable <em>Commands Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Commands Table</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Comments#getCommandsTable()
   * @see #getComments()
   * @generated
   */
  EAttribute getComments_CommandsTable();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.Preferences <em>Preferences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preferences</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Preferences
   * @generated
   */
  EClass getPreferences();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getDocHome <em>Doc Home</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc Home</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Preferences#getDocHome()
   * @see #getPreferences()
   * @generated
   */
  EAttribute getPreferences_DocHome();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getMakefileHome <em>Makefile Home</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Makefile Home</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Preferences#getMakefileHome()
   * @see #getPreferences()
   * @generated
   */
  EAttribute getPreferences_MakefileHome();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getInstallHome <em>Install Home</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Install Home</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Preferences#getInstallHome()
   * @see #getPreferences()
   * @generated
   */
  EAttribute getPreferences_InstallHome();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Preferences#getHtmlVersion <em>Html Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Html Version</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Preferences#getHtmlVersion()
   * @see #getPreferences()
   * @generated
   */
  EAttribute getPreferences_HtmlVersion();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.State#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.State#getDescription()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Description();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.State#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Status</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.State#getStatus()
   * @see #getState()
   * @generated
   */
  EReference getState_Status();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Property#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Status</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Property#getStatus()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Status();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Property#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Property#getDescription()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Description();

  /**
   * Returns the meta object for the attribute list '{@link fr.esrf.tango.pogo.pogoDsl.Property#getDefaultPropValue <em>Default Prop Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Default Prop Value</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Property#getDefaultPropValue()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_DefaultPropValue();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.PropType <em>Prop Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prop Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.PropType
   * @generated
   */
  EClass getPropType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.SimpleType
   * @generated
   */
  EClass getSimpleType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.VectorType <em>Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.VectorType
   * @generated
   */
  EClass getVectorType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus <em>Inheritance Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inheritance Status</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.InheritanceStatus
   * @generated
   */
  EClass getInheritanceStatus();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getAbstract()
   * @see #getInheritanceStatus()
   * @generated
   */
  EAttribute getInheritanceStatus_Abstract();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getInherited <em>Inherited</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inherited</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getInherited()
   * @see #getInheritanceStatus()
   * @generated
   */
  EAttribute getInheritanceStatus_Inherited();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getConcrete <em>Concrete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Concrete</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getConcrete()
   * @see #getInheritanceStatus()
   * @generated
   */
  EAttribute getInheritanceStatus_Concrete();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getConcreteHere <em>Concrete Here</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Concrete Here</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getConcreteHere()
   * @see #getInheritanceStatus()
   * @generated
   */
  EAttribute getInheritanceStatus_ConcreteHere();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getHasChanged <em>Has Changed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Changed</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.InheritanceStatus#getHasChanged()
   * @see #getInheritanceStatus()
   * @generated
   */
  EAttribute getInheritanceStatus_HasChanged();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Command#getArgin <em>Argin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argin</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Command#getArgin()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Argin();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Command#getArgout <em>Argout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argout</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Command#getArgout()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Argout();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Command#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Command#getDescription()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Description();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Command#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Status</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Command#getStatus()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Status();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Command#getExecMethod <em>Exec Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exec Method</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Command#getExecMethod()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_ExecMethod();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Command#getDisplayLevel <em>Display Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Level</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Command#getDisplayLevel()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_DisplayLevel();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Command#getPolledPeriod <em>Polled Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Polled Period</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Command#getPolledPeriod()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_PolledPeriod();

  /**
   * Returns the meta object for the attribute list '{@link fr.esrf.tango.pogo.pogoDsl.Command#getExcludedStates <em>Excluded States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Excluded States</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Command#getExcludedStates()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_ExcludedStates();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Argument#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Argument#getType()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Type();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Argument#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Argument#getDescription()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Description();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getAttType <em>Att Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Att Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getAttType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AttType();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getDataType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_DataType();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getRwType <em>Rw Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rw Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getRwType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_RwType();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getDisplayLevel <em>Display Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Level</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getDisplayLevel()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_DisplayLevel();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getPolledPeriod <em>Polled Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Polled Period</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getPolledPeriod()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_PolledPeriod();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMaxX <em>Max X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max X</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getMaxX()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_MaxX();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMaxY <em>Max Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Y</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getMaxY()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_MaxY();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getAssociatedAttr <em>Associated Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Associated Attr</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getAssociatedAttr()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AssociatedAttr();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMemorized <em>Memorized</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Memorized</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getMemorized()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Memorized();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getMemorizedAtInit <em>Memorized At Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Memorized At Init</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getMemorizedAtInit()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_MemorizedAtInit();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getChangeEvent <em>Change Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Change Event</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getChangeEvent()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_ChangeEvent();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getArchiveEvent <em>Archive Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Archive Event</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getArchiveEvent()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_ArchiveEvent();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getDataReadyEvent <em>Data Ready Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Ready Event</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getDataReadyEvent()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_DataReadyEvent();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Status</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getStatus()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Status();

  /**
   * Returns the meta object for the containment reference '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getProperties()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Properties();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getAllocReadMember <em>Alloc Read Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alloc Read Member</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getAllocReadMember()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AllocReadMember();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getIsDynamic <em>Is Dynamic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Dynamic</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getIsDynamic()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_IsDynamic();

  /**
   * Returns the meta object for the attribute list '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getReadExcludedStates <em>Read Excluded States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Read Excluded States</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getReadExcludedStates()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_ReadExcludedStates();

  /**
   * Returns the meta object for the attribute list '{@link fr.esrf.tango.pogo.pogoDsl.Attribute#getWriteExcludedStates <em>Write Excluded States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Write Excluded States</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute#getWriteExcludedStates()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_WriteExcludedStates();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.FireEvents <em>Fire Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fire Events</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.FireEvents
   * @generated
   */
  EClass getFireEvents();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.FireEvents#getFire <em>Fire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fire</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.FireEvents#getFire()
   * @see #getFireEvents()
   * @generated
   */
  EAttribute getFireEvents_Fire();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.FireEvents#getLibCheckCriteria <em>Lib Check Criteria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lib Check Criteria</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.FireEvents#getLibCheckCriteria()
   * @see #getFireEvents()
   * @generated
   */
  EAttribute getFireEvents_LibCheckCriteria();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties <em>Attr Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr Properties</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties
   * @generated
   */
  EClass getAttrProperties();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getDescription()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_Description();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getLabel()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_Label();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getUnit()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_Unit();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getStandardUnit <em>Standard Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Standard Unit</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getStandardUnit()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_StandardUnit();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getDisplayUnit <em>Display Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Unit</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getDisplayUnit()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_DisplayUnit();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getFormat()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_Format();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMaxValue <em>Max Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Value</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMaxValue()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_MaxValue();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMinValue <em>Min Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Value</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMinValue()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_MinValue();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMaxAlarm <em>Max Alarm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Alarm</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMaxAlarm()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_MaxAlarm();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMinAlarm <em>Min Alarm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Alarm</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMinAlarm()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_MinAlarm();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMaxWarning <em>Max Warning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Warning</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMaxWarning()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_MaxWarning();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMinWarning <em>Min Warning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Warning</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getMinWarning()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_MinWarning();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getDeltaTime <em>Delta Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delta Time</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getDeltaTime()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_DeltaTime();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties#getDeltaValue <em>Delta Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delta Value</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties#getDeltaValue()
   * @see #getAttrProperties()
   * @generated
   */
  EAttribute getAttrProperties_DeltaValue();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.AdditionalFile <em>Additional File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additional File</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AdditionalFile
   * @generated
   */
  EClass getAdditionalFile();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AdditionalFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AdditionalFile#getName()
   * @see #getAdditionalFile()
   * @generated
   */
  EAttribute getAdditionalFile_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.esrf.tango.pogo.pogoDsl.AdditionalFile#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.AdditionalFile#getPath()
   * @see #getAdditionalFile()
   * @generated
   */
  EAttribute getAdditionalFile_Path();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.VoidType <em>Void Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Void Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.VoidType
   * @generated
   */
  EClass getVoidType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.BooleanType
   * @generated
   */
  EClass getBooleanType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.ShortType <em>Short Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Short Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ShortType
   * @generated
   */
  EClass getShortType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.UShortType <em>UShort Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UShort Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.UShortType
   * @generated
   */
  EClass getUShortType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.UIntType <em>UInt Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UInt Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.UIntType
   * @generated
   */
  EClass getUIntType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.FloatType
   * @generated
   */
  EClass getFloatType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.DoubleType <em>Double Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.DoubleType
   * @generated
   */
  EClass getDoubleType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.CharArrayType <em>Char Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.CharArrayType
   * @generated
   */
  EClass getCharArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.ShortArrayType <em>Short Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Short Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ShortArrayType
   * @generated
   */
  EClass getShortArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.UShortArrayType <em>UShort Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UShort Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.UShortArrayType
   * @generated
   */
  EClass getUShortArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.IntArrayType <em>Int Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.IntArrayType
   * @generated
   */
  EClass getIntArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.UIntArrayType <em>UInt Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UInt Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.UIntArrayType
   * @generated
   */
  EClass getUIntArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.FloatArrayType <em>Float Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.FloatArrayType
   * @generated
   */
  EClass getFloatArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.DoubleArrayType <em>Double Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.DoubleArrayType
   * @generated
   */
  EClass getDoubleArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.StringArrayType <em>String Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.StringArrayType
   * @generated
   */
  EClass getStringArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.LongStringArrayType <em>Long String Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long String Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.LongStringArrayType
   * @generated
   */
  EClass getLongStringArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.DoubleStringArrayType <em>Double String Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double String Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.DoubleStringArrayType
   * @generated
   */
  EClass getDoubleStringArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.StateType
   * @generated
   */
  EClass getStateType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.ConstStringType <em>Const String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Const String Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ConstStringType
   * @generated
   */
  EClass getConstStringType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.BooleanArrayType <em>Boolean Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.BooleanArrayType
   * @generated
   */
  EClass getBooleanArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.UCharType <em>UChar Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UChar Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.UCharType
   * @generated
   */
  EClass getUCharType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.LongType <em>Long Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.LongType
   * @generated
   */
  EClass getLongType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.ULongType <em>ULong Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ULong Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ULongType
   * @generated
   */
  EClass getULongType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.LongArrayType <em>Long Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.LongArrayType
   * @generated
   */
  EClass getLongArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.ULongArrayType <em>ULong Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ULong Array Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ULongArrayType
   * @generated
   */
  EClass getULongArrayType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.DevIntType <em>Dev Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dev Int Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.DevIntType
   * @generated
   */
  EClass getDevIntType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.EncodedType <em>Encoded Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Encoded Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.EncodedType
   * @generated
   */
  EClass getEncodedType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.ShortVectorType <em>Short Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Short Vector Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.ShortVectorType
   * @generated
   */
  EClass getShortVectorType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.IntVectorType <em>Int Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Vector Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.IntVectorType
   * @generated
   */
  EClass getIntVectorType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.FloatVectorType <em>Float Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Vector Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.FloatVectorType
   * @generated
   */
  EClass getFloatVectorType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.DoubleVectorType <em>Double Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Vector Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.DoubleVectorType
   * @generated
   */
  EClass getDoubleVectorType();

  /**
   * Returns the meta object for class '{@link fr.esrf.tango.pogo.pogoDsl.StringVectorType <em>String Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Vector Type</em>'.
   * @see fr.esrf.tango.pogo.pogoDsl.StringVectorType
   * @generated
   */
  EClass getStringVectorType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PogoDslFactory getPogoDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoSystemImpl <em>Pogo System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoSystemImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getPogoSystem()
     * @generated
     */
    EClass POGO_SYSTEM = eINSTANCE.getPogoSystem();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_SYSTEM__IMPORTS = eINSTANCE.getPogoSystem_Imports();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_SYSTEM__CLASSES = eINSTANCE.getPogoSystem_Classes();

    /**
     * The meta object literal for the '<em><b>Multi Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_SYSTEM__MULTI_CLASSES = eINSTANCE.getPogoSystem_MultiClasses();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.ImportImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoMultiClassesImpl <em>Pogo Multi Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoMultiClassesImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getPogoMultiClasses()
     * @generated
     */
    EClass POGO_MULTI_CLASSES = eINSTANCE.getPogoMultiClasses();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POGO_MULTI_CLASSES__NAME = eINSTANCE.getPogoMultiClasses_Name();

    /**
     * The meta object literal for the '<em><b>Source Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POGO_MULTI_CLASSES__SOURCE_PATH = eINSTANCE.getPogoMultiClasses_SourcePath();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POGO_MULTI_CLASSES__DESCRIPTION = eINSTANCE.getPogoMultiClasses_Description();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POGO_MULTI_CLASSES__TITLE = eINSTANCE.getPogoMultiClasses_Title();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_MULTI_CLASSES__CLASSES = eINSTANCE.getPogoMultiClasses_Classes();

    /**
     * The meta object literal for the '<em><b>Filestogenerate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POGO_MULTI_CLASSES__FILESTOGENERATE = eINSTANCE.getPogoMultiClasses_Filestogenerate();

    /**
     * The meta object literal for the '<em><b>Preferences</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_MULTI_CLASSES__PREFERENCES = eINSTANCE.getPogoMultiClasses_Preferences();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.OneClassSimpleDefImpl <em>One Class Simple Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.OneClassSimpleDefImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getOneClassSimpleDef()
     * @generated
     */
    EClass ONE_CLASS_SIMPLE_DEF = eINSTANCE.getOneClassSimpleDef();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_CLASS_SIMPLE_DEF__CLASSNAME = eINSTANCE.getOneClassSimpleDef_Classname();

    /**
     * The meta object literal for the '<em><b>Source Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_CLASS_SIMPLE_DEF__SOURCE_PATH = eINSTANCE.getOneClassSimpleDef_SourcePath();

    /**
     * The meta object literal for the '<em><b>Pogo6</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_CLASS_SIMPLE_DEF__POGO6 = eINSTANCE.getOneClassSimpleDef_Pogo6();

    /**
     * The meta object literal for the '<em><b>Inheritances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_CLASS_SIMPLE_DEF__INHERITANCES = eINSTANCE.getOneClassSimpleDef_Inheritances();

    /**
     * The meta object literal for the '<em><b>Parent Classes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_CLASS_SIMPLE_DEF__PARENT_CLASSES = eINSTANCE.getOneClassSimpleDef_ParentClasses();

    /**
     * The meta object literal for the '<em><b>Additional Files</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_CLASS_SIMPLE_DEF__ADDITIONAL_FILES = eINSTANCE.getOneClassSimpleDef_AdditionalFiles();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl <em>Pogo Device Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDeviceClassImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getPogoDeviceClass()
     * @generated
     */
    EClass POGO_DEVICE_CLASS = eINSTANCE.getPogoDeviceClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POGO_DEVICE_CLASS__NAME = eINSTANCE.getPogoDeviceClass_Name();

    /**
     * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POGO_DEVICE_CLASS__IS_ABSTRACT = eINSTANCE.getPogoDeviceClass_IsAbstract();

    /**
     * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_DEVICE_CLASS__BASE_CLASS = eINSTANCE.getPogoDeviceClass_BaseClass();

    /**
     * The meta object literal for the '<em><b>Institute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POGO_DEVICE_CLASS__INSTITUTE = eINSTANCE.getPogoDeviceClass_Institute();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_DEVICE_CLASS__DESCRIPTION = eINSTANCE.getPogoDeviceClass_Description();

    /**
     * The meta object literal for the '<em><b>Class Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_DEVICE_CLASS__CLASS_PROPERTIES = eINSTANCE.getPogoDeviceClass_ClassProperties();

    /**
     * The meta object literal for the '<em><b>Device Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_DEVICE_CLASS__DEVICE_PROPERTIES = eINSTANCE.getPogoDeviceClass_DeviceProperties();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_DEVICE_CLASS__COMMANDS = eINSTANCE.getPogoDeviceClass_Commands();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_DEVICE_CLASS__ATTRIBUTES = eINSTANCE.getPogoDeviceClass_Attributes();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_DEVICE_CLASS__STATES = eINSTANCE.getPogoDeviceClass_States();

    /**
     * The meta object literal for the '<em><b>Preferences</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_DEVICE_CLASS__PREFERENCES = eINSTANCE.getPogoDeviceClass_Preferences();

    /**
     * The meta object literal for the '<em><b>Additional Files</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POGO_DEVICE_CLASS__ADDITIONAL_FILES = eINSTANCE.getPogoDeviceClass_AdditionalFiles();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl <em>Class Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.ClassDescriptionImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getClassDescription()
     * @generated
     */
    EClass CLASS_DESCRIPTION = eINSTANCE.getClassDescription();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DESCRIPTION__DESCRIPTION = eINSTANCE.getClassDescription_Description();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DESCRIPTION__TITLE = eINSTANCE.getClassDescription_Title();

    /**
     * The meta object literal for the '<em><b>Source Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DESCRIPTION__SOURCE_PATH = eINSTANCE.getClassDescription_SourcePath();

    /**
     * The meta object literal for the '<em><b>Inheritances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DESCRIPTION__INHERITANCES = eINSTANCE.getClassDescription_Inheritances();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DESCRIPTION__LANGUAGE = eINSTANCE.getClassDescription_Language();

    /**
     * The meta object literal for the '<em><b>Filestogenerate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DESCRIPTION__FILESTOGENERATE = eINSTANCE.getClassDescription_Filestogenerate();

    /**
     * The meta object literal for the '<em><b>Identification</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DESCRIPTION__IDENTIFICATION = eINSTANCE.getClassDescription_Identification();

    /**
     * The meta object literal for the '<em><b>Comments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DESCRIPTION__COMMENTS = eINSTANCE.getClassDescription_Comments();

    /**
     * The meta object literal for the '<em><b>Has Abstract Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DESCRIPTION__HAS_ABSTRACT_COMMAND = eINSTANCE.getClassDescription_HasAbstractCommand();

    /**
     * The meta object literal for the '<em><b>Has Abstract Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DESCRIPTION__HAS_ABSTRACT_ATTRIBUTE = eINSTANCE.getClassDescription_HasAbstractAttribute();

    /**
     * The meta object literal for the '<em><b>Has Dynamic Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DESCRIPTION__HAS_DYNAMIC_ATTRIBUTE = eINSTANCE.getClassDescription_HasDynamicAttribute();

    /**
     * The meta object literal for the '<em><b>Description Html Exists</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DESCRIPTION__DESCRIPTION_HTML_EXISTS = eINSTANCE.getClassDescription_DescriptionHtmlExists();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.InheritanceImpl <em>Inheritance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.InheritanceImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getInheritance()
     * @generated
     */
    EClass INHERITANCE = eINSTANCE.getInheritance();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE__CLASSNAME = eINSTANCE.getInheritance_Classname();

    /**
     * The meta object literal for the '<em><b>Source Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE__SOURCE_PATH = eINSTANCE.getInheritance_SourcePath();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl <em>Class Identification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.ClassIdentificationImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getClassIdentification()
     * @generated
     */
    EClass CLASS_IDENTIFICATION = eINSTANCE.getClassIdentification();

    /**
     * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_IDENTIFICATION__CONTACT = eINSTANCE.getClassIdentification_Contact();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_IDENTIFICATION__AUTHOR = eINSTANCE.getClassIdentification_Author();

    /**
     * The meta object literal for the '<em><b>Email Domain</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_IDENTIFICATION__EMAIL_DOMAIN = eINSTANCE.getClassIdentification_EmailDomain();

    /**
     * The meta object literal for the '<em><b>Class Family</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_IDENTIFICATION__CLASS_FAMILY = eINSTANCE.getClassIdentification_ClassFamily();

    /**
     * The meta object literal for the '<em><b>Site Specific</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_IDENTIFICATION__SITE_SPECIFIC = eINSTANCE.getClassIdentification_SiteSpecific();

    /**
     * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_IDENTIFICATION__PLATFORM = eINSTANCE.getClassIdentification_Platform();

    /**
     * The meta object literal for the '<em><b>Bus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_IDENTIFICATION__BUS = eINSTANCE.getClassIdentification_Bus();

    /**
     * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_IDENTIFICATION__MANUFACTURER = eINSTANCE.getClassIdentification_Manufacturer();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_IDENTIFICATION__REFERENCE = eINSTANCE.getClassIdentification_Reference();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.CommentsImpl <em>Comments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.CommentsImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getComments()
     * @generated
     */
    EClass COMMENTS = eINSTANCE.getComments();

    /**
     * The meta object literal for the '<em><b>Commands Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENTS__COMMANDS_TABLE = eINSTANCE.getComments_CommandsTable();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PreferencesImpl <em>Preferences</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PreferencesImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getPreferences()
     * @generated
     */
    EClass PREFERENCES = eINSTANCE.getPreferences();

    /**
     * The meta object literal for the '<em><b>Doc Home</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCES__DOC_HOME = eINSTANCE.getPreferences_DocHome();

    /**
     * The meta object literal for the '<em><b>Makefile Home</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCES__MAKEFILE_HOME = eINSTANCE.getPreferences_MakefileHome();

    /**
     * The meta object literal for the '<em><b>Install Home</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCES__INSTALL_HOME = eINSTANCE.getPreferences_InstallHome();

    /**
     * The meta object literal for the '<em><b>Html Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFERENCES__HTML_VERSION = eINSTANCE.getPreferences_HtmlVersion();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.StateImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__DESCRIPTION = eINSTANCE.getState_Description();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STATUS = eINSTANCE.getState_Status();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PropertyImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__STATUS = eINSTANCE.getProperty_Status();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

    /**
     * The meta object literal for the '<em><b>Default Prop Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DEFAULT_PROP_VALUE = eINSTANCE.getProperty_DefaultPropValue();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.PropTypeImpl <em>Prop Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PropTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getPropType()
     * @generated
     */
    EClass PROP_TYPE = eINSTANCE.getPropType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.SimpleTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getSimpleType()
     * @generated
     */
    EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.VectorTypeImpl <em>Vector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.VectorTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getVectorType()
     * @generated
     */
    EClass VECTOR_TYPE = eINSTANCE.getVectorType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.InheritanceStatusImpl <em>Inheritance Status</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.InheritanceStatusImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getInheritanceStatus()
     * @generated
     */
    EClass INHERITANCE_STATUS = eINSTANCE.getInheritanceStatus();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_STATUS__ABSTRACT = eINSTANCE.getInheritanceStatus_Abstract();

    /**
     * The meta object literal for the '<em><b>Inherited</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_STATUS__INHERITED = eINSTANCE.getInheritanceStatus_Inherited();

    /**
     * The meta object literal for the '<em><b>Concrete</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_STATUS__CONCRETE = eINSTANCE.getInheritanceStatus_Concrete();

    /**
     * The meta object literal for the '<em><b>Concrete Here</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_STATUS__CONCRETE_HERE = eINSTANCE.getInheritanceStatus_ConcreteHere();

    /**
     * The meta object literal for the '<em><b>Has Changed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INHERITANCE_STATUS__HAS_CHANGED = eINSTANCE.getInheritanceStatus_HasChanged();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.CommandImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

    /**
     * The meta object literal for the '<em><b>Argin</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__ARGIN = eINSTANCE.getCommand_Argin();

    /**
     * The meta object literal for the '<em><b>Argout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__ARGOUT = eINSTANCE.getCommand_Argout();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__DESCRIPTION = eINSTANCE.getCommand_Description();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__STATUS = eINSTANCE.getCommand_Status();

    /**
     * The meta object literal for the '<em><b>Exec Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__EXEC_METHOD = eINSTANCE.getCommand_ExecMethod();

    /**
     * The meta object literal for the '<em><b>Display Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__DISPLAY_LEVEL = eINSTANCE.getCommand_DisplayLevel();

    /**
     * The meta object literal for the '<em><b>Polled Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__POLLED_PERIOD = eINSTANCE.getCommand_PolledPeriod();

    /**
     * The meta object literal for the '<em><b>Excluded States</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__EXCLUDED_STATES = eINSTANCE.getCommand_ExcludedStates();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.ArgumentImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__DESCRIPTION = eINSTANCE.getArgument_Description();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.AttributeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Att Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATT_TYPE = eINSTANCE.getAttribute_AttType();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

    /**
     * The meta object literal for the '<em><b>Rw Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__RW_TYPE = eINSTANCE.getAttribute_RwType();

    /**
     * The meta object literal for the '<em><b>Display Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DISPLAY_LEVEL = eINSTANCE.getAttribute_DisplayLevel();

    /**
     * The meta object literal for the '<em><b>Polled Period</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__POLLED_PERIOD = eINSTANCE.getAttribute_PolledPeriod();

    /**
     * The meta object literal for the '<em><b>Max X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MAX_X = eINSTANCE.getAttribute_MaxX();

    /**
     * The meta object literal for the '<em><b>Max Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MAX_Y = eINSTANCE.getAttribute_MaxY();

    /**
     * The meta object literal for the '<em><b>Associated Attr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ASSOCIATED_ATTR = eINSTANCE.getAttribute_AssociatedAttr();

    /**
     * The meta object literal for the '<em><b>Memorized</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MEMORIZED = eINSTANCE.getAttribute_Memorized();

    /**
     * The meta object literal for the '<em><b>Memorized At Init</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MEMORIZED_AT_INIT = eINSTANCE.getAttribute_MemorizedAtInit();

    /**
     * The meta object literal for the '<em><b>Change Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__CHANGE_EVENT = eINSTANCE.getAttribute_ChangeEvent();

    /**
     * The meta object literal for the '<em><b>Archive Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__ARCHIVE_EVENT = eINSTANCE.getAttribute_ArchiveEvent();

    /**
     * The meta object literal for the '<em><b>Data Ready Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__DATA_READY_EVENT = eINSTANCE.getAttribute_DataReadyEvent();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__STATUS = eINSTANCE.getAttribute_Status();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__PROPERTIES = eINSTANCE.getAttribute_Properties();

    /**
     * The meta object literal for the '<em><b>Alloc Read Member</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ALLOC_READ_MEMBER = eINSTANCE.getAttribute_AllocReadMember();

    /**
     * The meta object literal for the '<em><b>Is Dynamic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__IS_DYNAMIC = eINSTANCE.getAttribute_IsDynamic();

    /**
     * The meta object literal for the '<em><b>Read Excluded States</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__READ_EXCLUDED_STATES = eINSTANCE.getAttribute_ReadExcludedStates();

    /**
     * The meta object literal for the '<em><b>Write Excluded States</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__WRITE_EXCLUDED_STATES = eINSTANCE.getAttribute_WriteExcludedStates();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.FireEventsImpl <em>Fire Events</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.FireEventsImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getFireEvents()
     * @generated
     */
    EClass FIRE_EVENTS = eINSTANCE.getFireEvents();

    /**
     * The meta object literal for the '<em><b>Fire</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIRE_EVENTS__FIRE = eINSTANCE.getFireEvents_Fire();

    /**
     * The meta object literal for the '<em><b>Lib Check Criteria</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIRE_EVENTS__LIB_CHECK_CRITERIA = eINSTANCE.getFireEvents_LibCheckCriteria();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl <em>Attr Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.AttrPropertiesImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getAttrProperties()
     * @generated
     */
    EClass ATTR_PROPERTIES = eINSTANCE.getAttrProperties();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__DESCRIPTION = eINSTANCE.getAttrProperties_Description();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__LABEL = eINSTANCE.getAttrProperties_Label();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__UNIT = eINSTANCE.getAttrProperties_Unit();

    /**
     * The meta object literal for the '<em><b>Standard Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__STANDARD_UNIT = eINSTANCE.getAttrProperties_StandardUnit();

    /**
     * The meta object literal for the '<em><b>Display Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__DISPLAY_UNIT = eINSTANCE.getAttrProperties_DisplayUnit();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__FORMAT = eINSTANCE.getAttrProperties_Format();

    /**
     * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__MAX_VALUE = eINSTANCE.getAttrProperties_MaxValue();

    /**
     * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__MIN_VALUE = eINSTANCE.getAttrProperties_MinValue();

    /**
     * The meta object literal for the '<em><b>Max Alarm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__MAX_ALARM = eINSTANCE.getAttrProperties_MaxAlarm();

    /**
     * The meta object literal for the '<em><b>Min Alarm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__MIN_ALARM = eINSTANCE.getAttrProperties_MinAlarm();

    /**
     * The meta object literal for the '<em><b>Max Warning</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__MAX_WARNING = eINSTANCE.getAttrProperties_MaxWarning();

    /**
     * The meta object literal for the '<em><b>Min Warning</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__MIN_WARNING = eINSTANCE.getAttrProperties_MinWarning();

    /**
     * The meta object literal for the '<em><b>Delta Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__DELTA_TIME = eINSTANCE.getAttrProperties_DeltaTime();

    /**
     * The meta object literal for the '<em><b>Delta Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_PROPERTIES__DELTA_VALUE = eINSTANCE.getAttrProperties_DeltaValue();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.AdditionalFileImpl <em>Additional File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.AdditionalFileImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getAdditionalFile()
     * @generated
     */
    EClass ADDITIONAL_FILE = eINSTANCE.getAdditionalFile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIONAL_FILE__NAME = eINSTANCE.getAdditionalFile_Name();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIONAL_FILE__PATH = eINSTANCE.getAdditionalFile_Path();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.TypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.VoidTypeImpl <em>Void Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.VoidTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getVoidType()
     * @generated
     */
    EClass VOID_TYPE = eINSTANCE.getVoidType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.BooleanTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getBooleanType()
     * @generated
     */
    EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ShortTypeImpl <em>Short Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.ShortTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getShortType()
     * @generated
     */
    EClass SHORT_TYPE = eINSTANCE.getShortType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.UShortTypeImpl <em>UShort Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.UShortTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getUShortType()
     * @generated
     */
    EClass USHORT_TYPE = eINSTANCE.getUShortType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.IntTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.UIntTypeImpl <em>UInt Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.UIntTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getUIntType()
     * @generated
     */
    EClass UINT_TYPE = eINSTANCE.getUIntType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.FloatTypeImpl <em>Float Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.FloatTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getFloatType()
     * @generated
     */
    EClass FLOAT_TYPE = eINSTANCE.getFloatType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.DoubleTypeImpl <em>Double Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.DoubleTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getDoubleType()
     * @generated
     */
    EClass DOUBLE_TYPE = eINSTANCE.getDoubleType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.StringTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.CharArrayTypeImpl <em>Char Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.CharArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getCharArrayType()
     * @generated
     */
    EClass CHAR_ARRAY_TYPE = eINSTANCE.getCharArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ShortArrayTypeImpl <em>Short Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.ShortArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getShortArrayType()
     * @generated
     */
    EClass SHORT_ARRAY_TYPE = eINSTANCE.getShortArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.UShortArrayTypeImpl <em>UShort Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.UShortArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getUShortArrayType()
     * @generated
     */
    EClass USHORT_ARRAY_TYPE = eINSTANCE.getUShortArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.IntArrayTypeImpl <em>Int Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.IntArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getIntArrayType()
     * @generated
     */
    EClass INT_ARRAY_TYPE = eINSTANCE.getIntArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.UIntArrayTypeImpl <em>UInt Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.UIntArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getUIntArrayType()
     * @generated
     */
    EClass UINT_ARRAY_TYPE = eINSTANCE.getUIntArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.FloatArrayTypeImpl <em>Float Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.FloatArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getFloatArrayType()
     * @generated
     */
    EClass FLOAT_ARRAY_TYPE = eINSTANCE.getFloatArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.DoubleArrayTypeImpl <em>Double Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.DoubleArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getDoubleArrayType()
     * @generated
     */
    EClass DOUBLE_ARRAY_TYPE = eINSTANCE.getDoubleArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.StringArrayTypeImpl <em>String Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.StringArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getStringArrayType()
     * @generated
     */
    EClass STRING_ARRAY_TYPE = eINSTANCE.getStringArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.LongStringArrayTypeImpl <em>Long String Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.LongStringArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getLongStringArrayType()
     * @generated
     */
    EClass LONG_STRING_ARRAY_TYPE = eINSTANCE.getLongStringArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.DoubleStringArrayTypeImpl <em>Double String Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.DoubleStringArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getDoubleStringArrayType()
     * @generated
     */
    EClass DOUBLE_STRING_ARRAY_TYPE = eINSTANCE.getDoubleStringArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.StateTypeImpl <em>State Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.StateTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getStateType()
     * @generated
     */
    EClass STATE_TYPE = eINSTANCE.getStateType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ConstStringTypeImpl <em>Const String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.ConstStringTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getConstStringType()
     * @generated
     */
    EClass CONST_STRING_TYPE = eINSTANCE.getConstStringType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.BooleanArrayTypeImpl <em>Boolean Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.BooleanArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getBooleanArrayType()
     * @generated
     */
    EClass BOOLEAN_ARRAY_TYPE = eINSTANCE.getBooleanArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.UCharTypeImpl <em>UChar Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.UCharTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getUCharType()
     * @generated
     */
    EClass UCHAR_TYPE = eINSTANCE.getUCharType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.LongTypeImpl <em>Long Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.LongTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getLongType()
     * @generated
     */
    EClass LONG_TYPE = eINSTANCE.getLongType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ULongTypeImpl <em>ULong Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.ULongTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getULongType()
     * @generated
     */
    EClass ULONG_TYPE = eINSTANCE.getULongType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.LongArrayTypeImpl <em>Long Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.LongArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getLongArrayType()
     * @generated
     */
    EClass LONG_ARRAY_TYPE = eINSTANCE.getLongArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ULongArrayTypeImpl <em>ULong Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.ULongArrayTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getULongArrayType()
     * @generated
     */
    EClass ULONG_ARRAY_TYPE = eINSTANCE.getULongArrayType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.DevIntTypeImpl <em>Dev Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.DevIntTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getDevIntType()
     * @generated
     */
    EClass DEV_INT_TYPE = eINSTANCE.getDevIntType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.EncodedTypeImpl <em>Encoded Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.EncodedTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getEncodedType()
     * @generated
     */
    EClass ENCODED_TYPE = eINSTANCE.getEncodedType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.ShortVectorTypeImpl <em>Short Vector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.ShortVectorTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getShortVectorType()
     * @generated
     */
    EClass SHORT_VECTOR_TYPE = eINSTANCE.getShortVectorType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.IntVectorTypeImpl <em>Int Vector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.IntVectorTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getIntVectorType()
     * @generated
     */
    EClass INT_VECTOR_TYPE = eINSTANCE.getIntVectorType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.FloatVectorTypeImpl <em>Float Vector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.FloatVectorTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getFloatVectorType()
     * @generated
     */
    EClass FLOAT_VECTOR_TYPE = eINSTANCE.getFloatVectorType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.DoubleVectorTypeImpl <em>Double Vector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.DoubleVectorTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getDoubleVectorType()
     * @generated
     */
    EClass DOUBLE_VECTOR_TYPE = eINSTANCE.getDoubleVectorType();

    /**
     * The meta object literal for the '{@link fr.esrf.tango.pogo.pogoDsl.impl.StringVectorTypeImpl <em>String Vector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.esrf.tango.pogo.pogoDsl.impl.StringVectorTypeImpl
     * @see fr.esrf.tango.pogo.pogoDsl.impl.PogoDslPackageImpl#getStringVectorType()
     * @generated
     */
    EClass STRING_VECTOR_TYPE = eINSTANCE.getStringVectorType();

  }

} //PogoDslPackage
