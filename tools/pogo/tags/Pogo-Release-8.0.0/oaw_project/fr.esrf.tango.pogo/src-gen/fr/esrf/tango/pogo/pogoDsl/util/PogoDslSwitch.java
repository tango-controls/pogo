/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.util;

import fr.esrf.tango.pogo.pogoDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage
 * @generated
 */
public class PogoDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PogoDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PogoDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PogoDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PogoDslPackage.POGO_SYSTEM:
      {
        PogoSystem pogoSystem = (PogoSystem)theEObject;
        T result = casePogoSystem(pogoSystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.POGO_MULTI_CLASSES:
      {
        PogoMultiClasses pogoMultiClasses = (PogoMultiClasses)theEObject;
        T result = casePogoMultiClasses(pogoMultiClasses);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.ONE_CLASS_SIMPLE_DEF:
      {
        OneClassSimpleDef oneClassSimpleDef = (OneClassSimpleDef)theEObject;
        T result = caseOneClassSimpleDef(oneClassSimpleDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.POGO_DEVICE_CLASS:
      {
        PogoDeviceClass pogoDeviceClass = (PogoDeviceClass)theEObject;
        T result = casePogoDeviceClass(pogoDeviceClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.CLASS_DESCRIPTION:
      {
        ClassDescription classDescription = (ClassDescription)theEObject;
        T result = caseClassDescription(classDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.INHERITANCE:
      {
        Inheritance inheritance = (Inheritance)theEObject;
        T result = caseInheritance(inheritance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.CLASS_IDENTIFICATION:
      {
        ClassIdentification classIdentification = (ClassIdentification)theEObject;
        T result = caseClassIdentification(classIdentification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.COMMENTS:
      {
        Comments comments = (Comments)theEObject;
        T result = caseComments(comments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.PREFERENCES:
      {
        Preferences preferences = (Preferences)theEObject;
        T result = casePreferences(preferences);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.PROP_TYPE:
      {
        PropType propType = (PropType)theEObject;
        T result = casePropType(propType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.SIMPLE_TYPE:
      {
        SimpleType simpleType = (SimpleType)theEObject;
        T result = caseSimpleType(simpleType);
        if (result == null) result = casePropType(simpleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.VECTOR_TYPE:
      {
        VectorType vectorType = (VectorType)theEObject;
        T result = caseVectorType(vectorType);
        if (result == null) result = casePropType(vectorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.INHERITANCE_STATUS:
      {
        InheritanceStatus inheritanceStatus = (InheritanceStatus)theEObject;
        T result = caseInheritanceStatus(inheritanceStatus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.COMMAND:
      {
        Command command = (Command)theEObject;
        T result = caseCommand(command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.FIRE_EVENTS:
      {
        FireEvents fireEvents = (FireEvents)theEObject;
        T result = caseFireEvents(fireEvents);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.ATTR_PROPERTIES:
      {
        AttrProperties attrProperties = (AttrProperties)theEObject;
        T result = caseAttrProperties(attrProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.ADDITIONAL_FILE:
      {
        AdditionalFile additionalFile = (AdditionalFile)theEObject;
        T result = caseAdditionalFile(additionalFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT:
      {
        OverlodedPollPeriodObject overlodedPollPeriodObject = (OverlodedPollPeriodObject)theEObject;
        T result = caseOverlodedPollPeriodObject(overlodedPollPeriodObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.VOID_TYPE:
      {
        VoidType voidType = (VoidType)theEObject;
        T result = caseVoidType(voidType);
        if (result == null) result = caseType(voidType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.BOOLEAN_TYPE:
      {
        BooleanType booleanType = (BooleanType)theEObject;
        T result = caseBooleanType(booleanType);
        if (result == null) result = caseSimpleType(booleanType);
        if (result == null) result = caseType(booleanType);
        if (result == null) result = casePropType(booleanType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.SHORT_TYPE:
      {
        ShortType shortType = (ShortType)theEObject;
        T result = caseShortType(shortType);
        if (result == null) result = caseSimpleType(shortType);
        if (result == null) result = caseType(shortType);
        if (result == null) result = casePropType(shortType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.USHORT_TYPE:
      {
        UShortType uShortType = (UShortType)theEObject;
        T result = caseUShortType(uShortType);
        if (result == null) result = caseSimpleType(uShortType);
        if (result == null) result = caseType(uShortType);
        if (result == null) result = casePropType(uShortType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.INT_TYPE:
      {
        IntType intType = (IntType)theEObject;
        T result = caseIntType(intType);
        if (result == null) result = caseSimpleType(intType);
        if (result == null) result = caseType(intType);
        if (result == null) result = casePropType(intType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.UINT_TYPE:
      {
        UIntType uIntType = (UIntType)theEObject;
        T result = caseUIntType(uIntType);
        if (result == null) result = caseSimpleType(uIntType);
        if (result == null) result = caseType(uIntType);
        if (result == null) result = casePropType(uIntType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.FLOAT_TYPE:
      {
        FloatType floatType = (FloatType)theEObject;
        T result = caseFloatType(floatType);
        if (result == null) result = caseSimpleType(floatType);
        if (result == null) result = caseType(floatType);
        if (result == null) result = casePropType(floatType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.DOUBLE_TYPE:
      {
        DoubleType doubleType = (DoubleType)theEObject;
        T result = caseDoubleType(doubleType);
        if (result == null) result = caseSimpleType(doubleType);
        if (result == null) result = caseType(doubleType);
        if (result == null) result = casePropType(doubleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.STRING_TYPE:
      {
        StringType stringType = (StringType)theEObject;
        T result = caseStringType(stringType);
        if (result == null) result = caseSimpleType(stringType);
        if (result == null) result = caseType(stringType);
        if (result == null) result = casePropType(stringType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.CHAR_ARRAY_TYPE:
      {
        CharArrayType charArrayType = (CharArrayType)theEObject;
        T result = caseCharArrayType(charArrayType);
        if (result == null) result = caseType(charArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.SHORT_ARRAY_TYPE:
      {
        ShortArrayType shortArrayType = (ShortArrayType)theEObject;
        T result = caseShortArrayType(shortArrayType);
        if (result == null) result = caseType(shortArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.USHORT_ARRAY_TYPE:
      {
        UShortArrayType uShortArrayType = (UShortArrayType)theEObject;
        T result = caseUShortArrayType(uShortArrayType);
        if (result == null) result = caseType(uShortArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.INT_ARRAY_TYPE:
      {
        IntArrayType intArrayType = (IntArrayType)theEObject;
        T result = caseIntArrayType(intArrayType);
        if (result == null) result = caseType(intArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.UINT_ARRAY_TYPE:
      {
        UIntArrayType uIntArrayType = (UIntArrayType)theEObject;
        T result = caseUIntArrayType(uIntArrayType);
        if (result == null) result = caseType(uIntArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.FLOAT_ARRAY_TYPE:
      {
        FloatArrayType floatArrayType = (FloatArrayType)theEObject;
        T result = caseFloatArrayType(floatArrayType);
        if (result == null) result = caseType(floatArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.DOUBLE_ARRAY_TYPE:
      {
        DoubleArrayType doubleArrayType = (DoubleArrayType)theEObject;
        T result = caseDoubleArrayType(doubleArrayType);
        if (result == null) result = caseType(doubleArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.STRING_ARRAY_TYPE:
      {
        StringArrayType stringArrayType = (StringArrayType)theEObject;
        T result = caseStringArrayType(stringArrayType);
        if (result == null) result = caseType(stringArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.LONG_STRING_ARRAY_TYPE:
      {
        LongStringArrayType longStringArrayType = (LongStringArrayType)theEObject;
        T result = caseLongStringArrayType(longStringArrayType);
        if (result == null) result = caseType(longStringArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.DOUBLE_STRING_ARRAY_TYPE:
      {
        DoubleStringArrayType doubleStringArrayType = (DoubleStringArrayType)theEObject;
        T result = caseDoubleStringArrayType(doubleStringArrayType);
        if (result == null) result = caseType(doubleStringArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.STATE_TYPE:
      {
        StateType stateType = (StateType)theEObject;
        T result = caseStateType(stateType);
        if (result == null) result = caseType(stateType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.CONST_STRING_TYPE:
      {
        ConstStringType constStringType = (ConstStringType)theEObject;
        T result = caseConstStringType(constStringType);
        if (result == null) result = caseType(constStringType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.BOOLEAN_ARRAY_TYPE:
      {
        BooleanArrayType booleanArrayType = (BooleanArrayType)theEObject;
        T result = caseBooleanArrayType(booleanArrayType);
        if (result == null) result = caseType(booleanArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.UCHAR_TYPE:
      {
        UCharType uCharType = (UCharType)theEObject;
        T result = caseUCharType(uCharType);
        if (result == null) result = caseType(uCharType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.LONG_TYPE:
      {
        LongType longType = (LongType)theEObject;
        T result = caseLongType(longType);
        if (result == null) result = caseType(longType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.ULONG_TYPE:
      {
        ULongType uLongType = (ULongType)theEObject;
        T result = caseULongType(uLongType);
        if (result == null) result = caseType(uLongType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.LONG_ARRAY_TYPE:
      {
        LongArrayType longArrayType = (LongArrayType)theEObject;
        T result = caseLongArrayType(longArrayType);
        if (result == null) result = caseType(longArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.ULONG_ARRAY_TYPE:
      {
        ULongArrayType uLongArrayType = (ULongArrayType)theEObject;
        T result = caseULongArrayType(uLongArrayType);
        if (result == null) result = caseType(uLongArrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.DEV_INT_TYPE:
      {
        DevIntType devIntType = (DevIntType)theEObject;
        T result = caseDevIntType(devIntType);
        if (result == null) result = caseType(devIntType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.ENCODED_TYPE:
      {
        EncodedType encodedType = (EncodedType)theEObject;
        T result = caseEncodedType(encodedType);
        if (result == null) result = caseType(encodedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.SHORT_VECTOR_TYPE:
      {
        ShortVectorType shortVectorType = (ShortVectorType)theEObject;
        T result = caseShortVectorType(shortVectorType);
        if (result == null) result = caseVectorType(shortVectorType);
        if (result == null) result = casePropType(shortVectorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.INT_VECTOR_TYPE:
      {
        IntVectorType intVectorType = (IntVectorType)theEObject;
        T result = caseIntVectorType(intVectorType);
        if (result == null) result = caseVectorType(intVectorType);
        if (result == null) result = casePropType(intVectorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.FLOAT_VECTOR_TYPE:
      {
        FloatVectorType floatVectorType = (FloatVectorType)theEObject;
        T result = caseFloatVectorType(floatVectorType);
        if (result == null) result = caseVectorType(floatVectorType);
        if (result == null) result = casePropType(floatVectorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.DOUBLE_VECTOR_TYPE:
      {
        DoubleVectorType doubleVectorType = (DoubleVectorType)theEObject;
        T result = caseDoubleVectorType(doubleVectorType);
        if (result == null) result = caseVectorType(doubleVectorType);
        if (result == null) result = casePropType(doubleVectorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PogoDslPackage.STRING_VECTOR_TYPE:
      {
        StringVectorType stringVectorType = (StringVectorType)theEObject;
        T result = caseStringVectorType(stringVectorType);
        if (result == null) result = caseVectorType(stringVectorType);
        if (result == null) result = casePropType(stringVectorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pogo System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pogo System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePogoSystem(PogoSystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pogo Multi Classes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pogo Multi Classes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePogoMultiClasses(PogoMultiClasses object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One Class Simple Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One Class Simple Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneClassSimpleDef(OneClassSimpleDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pogo Device Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pogo Device Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePogoDeviceClass(PogoDeviceClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDescription(ClassDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInheritance(Inheritance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Identification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Identification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassIdentification(ClassIdentification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComments(Comments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preferences</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preferences</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreferences(Preferences object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prop Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prop Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropType(PropType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleType(SimpleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vector Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vector Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVectorType(VectorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inheritance Status</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inheritance Status</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInheritanceStatus(InheritanceStatus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommand(Command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgument(Argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fire Events</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fire Events</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFireEvents(FireEvents object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attr Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attr Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttrProperties(AttrProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additional File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additional File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditionalFile(AdditionalFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Overloded Poll Period Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Overloded Poll Period Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOverlodedPollPeriodObject(OverlodedPollPeriodObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVoidType(VoidType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanType(BooleanType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Short Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Short Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShortType(ShortType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UShort Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UShort Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUShortType(UShortType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntType(IntType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UInt Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UInt Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIntType(UIntType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatType(FloatType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleType(DoubleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringType(StringType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Char Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Char Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharArrayType(CharArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Short Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Short Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShortArrayType(ShortArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UShort Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UShort Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUShortArrayType(UShortArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntArrayType(IntArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UInt Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UInt Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIntArrayType(UIntArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatArrayType(FloatArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleArrayType(DoubleArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringArrayType(StringArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Long String Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Long String Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLongStringArrayType(LongStringArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double String Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double String Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleStringArrayType(DoubleStringArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateType(StateType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const String Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const String Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstStringType(ConstStringType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanArrayType(BooleanArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UChar Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UChar Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUCharType(UCharType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Long Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Long Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLongType(LongType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ULong Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ULong Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseULongType(ULongType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Long Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Long Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLongArrayType(LongArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ULong Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ULong Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseULongArrayType(ULongArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dev Int Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dev Int Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDevIntType(DevIntType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Encoded Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Encoded Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEncodedType(EncodedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Short Vector Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Short Vector Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShortVectorType(ShortVectorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Vector Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Vector Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntVectorType(IntVectorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Vector Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Vector Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatVectorType(FloatVectorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Vector Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Vector Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleVectorType(DoubleVectorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Vector Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Vector Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringVectorType(StringVectorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PogoDslSwitch
