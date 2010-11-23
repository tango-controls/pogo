/**
 * <copyright>
 * </copyright>
 *
 */
package fr.esrf.tango.pogo.pogoDsl.util;

import fr.esrf.tango.pogo.pogoDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.esrf.tango.pogo.pogoDsl.PogoDslPackage
 * @generated
 */
public class PogoDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PogoDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PogoDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PogoDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PogoDslSwitch<Adapter> modelSwitch =
    new PogoDslSwitch<Adapter>()
    {
      @Override
      public Adapter casePogoSystem(PogoSystem object)
      {
        return createPogoSystemAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePogoDeviceClass(PogoDeviceClass object)
      {
        return createPogoDeviceClassAdapter();
      }
      @Override
      public Adapter caseClassDescription(ClassDescription object)
      {
        return createClassDescriptionAdapter();
      }
      @Override
      public Adapter caseInheritance(Inheritance object)
      {
        return createInheritanceAdapter();
      }
      @Override
      public Adapter caseClassIdentification(ClassIdentification object)
      {
        return createClassIdentificationAdapter();
      }
      @Override
      public Adapter caseComments(Comments object)
      {
        return createCommentsAdapter();
      }
      @Override
      public Adapter casePreferences(Preferences object)
      {
        return createPreferencesAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter casePropType(PropType object)
      {
        return createPropTypeAdapter();
      }
      @Override
      public Adapter caseSimpleType(SimpleType object)
      {
        return createSimpleTypeAdapter();
      }
      @Override
      public Adapter caseVectorType(VectorType object)
      {
        return createVectorTypeAdapter();
      }
      @Override
      public Adapter caseInheritanceStatus(InheritanceStatus object)
      {
        return createInheritanceStatusAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseFireEvents(FireEvents object)
      {
        return createFireEventsAdapter();
      }
      @Override
      public Adapter caseAttrProperties(AttrProperties object)
      {
        return createAttrPropertiesAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseVoidType(VoidType object)
      {
        return createVoidTypeAdapter();
      }
      @Override
      public Adapter caseBooleanType(BooleanType object)
      {
        return createBooleanTypeAdapter();
      }
      @Override
      public Adapter caseShortType(ShortType object)
      {
        return createShortTypeAdapter();
      }
      @Override
      public Adapter caseUShortType(UShortType object)
      {
        return createUShortTypeAdapter();
      }
      @Override
      public Adapter caseIntType(IntType object)
      {
        return createIntTypeAdapter();
      }
      @Override
      public Adapter caseUIntType(UIntType object)
      {
        return createUIntTypeAdapter();
      }
      @Override
      public Adapter caseFloatType(FloatType object)
      {
        return createFloatTypeAdapter();
      }
      @Override
      public Adapter caseDoubleType(DoubleType object)
      {
        return createDoubleTypeAdapter();
      }
      @Override
      public Adapter caseStringType(StringType object)
      {
        return createStringTypeAdapter();
      }
      @Override
      public Adapter caseCharArrayType(CharArrayType object)
      {
        return createCharArrayTypeAdapter();
      }
      @Override
      public Adapter caseShortArrayType(ShortArrayType object)
      {
        return createShortArrayTypeAdapter();
      }
      @Override
      public Adapter caseUShortArrayType(UShortArrayType object)
      {
        return createUShortArrayTypeAdapter();
      }
      @Override
      public Adapter caseIntArrayType(IntArrayType object)
      {
        return createIntArrayTypeAdapter();
      }
      @Override
      public Adapter caseUIntArrayType(UIntArrayType object)
      {
        return createUIntArrayTypeAdapter();
      }
      @Override
      public Adapter caseFloatArrayType(FloatArrayType object)
      {
        return createFloatArrayTypeAdapter();
      }
      @Override
      public Adapter caseDoubleArrayType(DoubleArrayType object)
      {
        return createDoubleArrayTypeAdapter();
      }
      @Override
      public Adapter caseStringArrayType(StringArrayType object)
      {
        return createStringArrayTypeAdapter();
      }
      @Override
      public Adapter caseLongStringArrayType(LongStringArrayType object)
      {
        return createLongStringArrayTypeAdapter();
      }
      @Override
      public Adapter caseDoubleStringArrayType(DoubleStringArrayType object)
      {
        return createDoubleStringArrayTypeAdapter();
      }
      @Override
      public Adapter caseStateType(StateType object)
      {
        return createStateTypeAdapter();
      }
      @Override
      public Adapter caseConstStringType(ConstStringType object)
      {
        return createConstStringTypeAdapter();
      }
      @Override
      public Adapter caseBooleanArrayType(BooleanArrayType object)
      {
        return createBooleanArrayTypeAdapter();
      }
      @Override
      public Adapter caseUCharType(UCharType object)
      {
        return createUCharTypeAdapter();
      }
      @Override
      public Adapter caseLongType(LongType object)
      {
        return createLongTypeAdapter();
      }
      @Override
      public Adapter caseULongType(ULongType object)
      {
        return createULongTypeAdapter();
      }
      @Override
      public Adapter caseLongArrayType(LongArrayType object)
      {
        return createLongArrayTypeAdapter();
      }
      @Override
      public Adapter caseULongArrayType(ULongArrayType object)
      {
        return createULongArrayTypeAdapter();
      }
      @Override
      public Adapter caseDevIntType(DevIntType object)
      {
        return createDevIntTypeAdapter();
      }
      @Override
      public Adapter caseEncodedType(EncodedType object)
      {
        return createEncodedTypeAdapter();
      }
      @Override
      public Adapter caseShortVectorType(ShortVectorType object)
      {
        return createShortVectorTypeAdapter();
      }
      @Override
      public Adapter caseIntVectorType(IntVectorType object)
      {
        return createIntVectorTypeAdapter();
      }
      @Override
      public Adapter caseFloatVectorType(FloatVectorType object)
      {
        return createFloatVectorTypeAdapter();
      }
      @Override
      public Adapter caseDoubleVectorType(DoubleVectorType object)
      {
        return createDoubleVectorTypeAdapter();
      }
      @Override
      public Adapter caseStringVectorType(StringVectorType object)
      {
        return createStringVectorTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.PogoSystem <em>Pogo System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoSystem
   * @generated
   */
  public Adapter createPogoSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass <em>Pogo Device Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass
   * @generated
   */
  public Adapter createPogoDeviceClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.ClassDescription <em>Class Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassDescription
   * @generated
   */
  public Adapter createClassDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.Inheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.Inheritance
   * @generated
   */
  public Adapter createInheritanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.ClassIdentification <em>Class Identification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.ClassIdentification
   * @generated
   */
  public Adapter createClassIdentificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.Comments <em>Comments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.Comments
   * @generated
   */
  public Adapter createCommentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.Preferences <em>Preferences</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.Preferences
   * @generated
   */
  public Adapter createPreferencesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.PropType <em>Prop Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.PropType
   * @generated
   */
  public Adapter createPropTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.SimpleType <em>Simple Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.SimpleType
   * @generated
   */
  public Adapter createSimpleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.VectorType <em>Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.VectorType
   * @generated
   */
  public Adapter createVectorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.InheritanceStatus <em>Inheritance Status</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.InheritanceStatus
   * @generated
   */
  public Adapter createInheritanceStatusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.FireEvents <em>Fire Events</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.FireEvents
   * @generated
   */
  public Adapter createFireEventsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.AttrProperties <em>Attr Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.AttrProperties
   * @generated
   */
  public Adapter createAttrPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.VoidType <em>Void Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.VoidType
   * @generated
   */
  public Adapter createVoidTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.BooleanType
   * @generated
   */
  public Adapter createBooleanTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.ShortType <em>Short Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.ShortType
   * @generated
   */
  public Adapter createShortTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.UShortType <em>UShort Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.UShortType
   * @generated
   */
  public Adapter createUShortTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.IntType
   * @generated
   */
  public Adapter createIntTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.UIntType <em>UInt Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.UIntType
   * @generated
   */
  public Adapter createUIntTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.FloatType
   * @generated
   */
  public Adapter createFloatTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.DoubleType <em>Double Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.DoubleType
   * @generated
   */
  public Adapter createDoubleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.StringType
   * @generated
   */
  public Adapter createStringTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.CharArrayType <em>Char Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.CharArrayType
   * @generated
   */
  public Adapter createCharArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.ShortArrayType <em>Short Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.ShortArrayType
   * @generated
   */
  public Adapter createShortArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.UShortArrayType <em>UShort Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.UShortArrayType
   * @generated
   */
  public Adapter createUShortArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.IntArrayType <em>Int Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.IntArrayType
   * @generated
   */
  public Adapter createIntArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.UIntArrayType <em>UInt Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.UIntArrayType
   * @generated
   */
  public Adapter createUIntArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.FloatArrayType <em>Float Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.FloatArrayType
   * @generated
   */
  public Adapter createFloatArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.DoubleArrayType <em>Double Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.DoubleArrayType
   * @generated
   */
  public Adapter createDoubleArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.StringArrayType <em>String Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.StringArrayType
   * @generated
   */
  public Adapter createStringArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.LongStringArrayType <em>Long String Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.LongStringArrayType
   * @generated
   */
  public Adapter createLongStringArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.DoubleStringArrayType <em>Double String Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.DoubleStringArrayType
   * @generated
   */
  public Adapter createDoubleStringArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.StateType
   * @generated
   */
  public Adapter createStateTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.ConstStringType <em>Const String Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.ConstStringType
   * @generated
   */
  public Adapter createConstStringTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.BooleanArrayType <em>Boolean Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.BooleanArrayType
   * @generated
   */
  public Adapter createBooleanArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.UCharType <em>UChar Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.UCharType
   * @generated
   */
  public Adapter createUCharTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.LongType <em>Long Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.LongType
   * @generated
   */
  public Adapter createLongTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.ULongType <em>ULong Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.ULongType
   * @generated
   */
  public Adapter createULongTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.LongArrayType <em>Long Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.LongArrayType
   * @generated
   */
  public Adapter createLongArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.ULongArrayType <em>ULong Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.ULongArrayType
   * @generated
   */
  public Adapter createULongArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.DevIntType <em>Dev Int Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.DevIntType
   * @generated
   */
  public Adapter createDevIntTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.EncodedType <em>Encoded Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.EncodedType
   * @generated
   */
  public Adapter createEncodedTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.ShortVectorType <em>Short Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.ShortVectorType
   * @generated
   */
  public Adapter createShortVectorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.IntVectorType <em>Int Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.IntVectorType
   * @generated
   */
  public Adapter createIntVectorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.FloatVectorType <em>Float Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.FloatVectorType
   * @generated
   */
  public Adapter createFloatVectorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.DoubleVectorType <em>Double Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.DoubleVectorType
   * @generated
   */
  public Adapter createDoubleVectorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.esrf.tango.pogo.pogoDsl.StringVectorType <em>String Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.esrf.tango.pogo.pogoDsl.StringVectorType
   * @generated
   */
  public Adapter createStringVectorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PogoDslAdapterFactory
