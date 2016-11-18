package fr.esrf.tango.pogo.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
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
import fr.esrf.tango.pogo.pogoDsl.EnumType;
import fr.esrf.tango.pogo.pogoDsl.EventCriteria;
import fr.esrf.tango.pogo.pogoDsl.FireEvents;
import fr.esrf.tango.pogo.pogoDsl.FloatArrayType;
import fr.esrf.tango.pogo.pogoDsl.FloatType;
import fr.esrf.tango.pogo.pogoDsl.FloatVectorType;
import fr.esrf.tango.pogo.pogoDsl.ForwardedAttribute;
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
import fr.esrf.tango.pogo.pogoDsl.Pipe;
import fr.esrf.tango.pogo.pogoDsl.PogoDeviceClass;
import fr.esrf.tango.pogo.pogoDsl.PogoDslPackage;
import fr.esrf.tango.pogo.pogoDsl.PogoMultiClasses;
import fr.esrf.tango.pogo.pogoDsl.PogoSystem;
import fr.esrf.tango.pogo.pogoDsl.Preferences;
import fr.esrf.tango.pogo.pogoDsl.Property;
import fr.esrf.tango.pogo.pogoDsl.ShortArrayType;
import fr.esrf.tango.pogo.pogoDsl.ShortType;
import fr.esrf.tango.pogo.pogoDsl.ShortVectorType;
import fr.esrf.tango.pogo.pogoDsl.State;
import fr.esrf.tango.pogo.pogoDsl.StateType;
import fr.esrf.tango.pogo.pogoDsl.StringArrayType;
import fr.esrf.tango.pogo.pogoDsl.StringType;
import fr.esrf.tango.pogo.pogoDsl.StringVectorType;
import fr.esrf.tango.pogo.pogoDsl.UCharType;
import fr.esrf.tango.pogo.pogoDsl.UIntArrayType;
import fr.esrf.tango.pogo.pogoDsl.UIntType;
import fr.esrf.tango.pogo.pogoDsl.ULongArrayType;
import fr.esrf.tango.pogo.pogoDsl.ULongType;
import fr.esrf.tango.pogo.pogoDsl.UShortArrayType;
import fr.esrf.tango.pogo.pogoDsl.UShortType;
import fr.esrf.tango.pogo.pogoDsl.VoidType;
import fr.esrf.tango.pogo.services.PogoDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractPogoDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PogoDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PogoDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PogoDslPackage.ADDITIONAL_FILE:
				if(context == grammarAccess.getAdditionalFileRule()) {
					sequence_AdditionalFile(context, (AdditionalFile) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.ARGUMENT:
				if(context == grammarAccess.getArgumentRule()) {
					sequence_Argument(context, (Argument) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.ATTR_PROPERTIES:
				if(context == grammarAccess.getAttrPropertiesRule()) {
					sequence_AttrProperties(context, (AttrProperties) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.BOOLEAN_ARRAY_TYPE:
				if(context == grammarAccess.getBooleanArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BooleanArrayType(context, (BooleanArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.BOOLEAN_TYPE:
				if(context == grammarAccess.getBooleanTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BooleanType(context, (BooleanType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.CHAR_ARRAY_TYPE:
				if(context == grammarAccess.getCharArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_CharArrayType(context, (CharArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.CLASS_DESCRIPTION:
				if(context == grammarAccess.getClassDescriptionRule()) {
					sequence_ClassDescription(context, (ClassDescription) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.CLASS_IDENTIFICATION:
				if(context == grammarAccess.getClassIdentificationRule()) {
					sequence_ClassIdentification(context, (ClassIdentification) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.COMMAND:
				if(context == grammarAccess.getCommandRule()) {
					sequence_Command(context, (Command) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.COMMENTS:
				if(context == grammarAccess.getCommentsRule()) {
					sequence_Comments(context, (Comments) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.CONST_STRING_TYPE:
				if(context == grammarAccess.getConstStringTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ConstStringType(context, (ConstStringType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.DEV_INT_TYPE:
				if(context == grammarAccess.getDevIntTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DevIntType(context, (DevIntType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.DOUBLE_ARRAY_TYPE:
				if(context == grammarAccess.getDoubleArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DoubleArrayType(context, (DoubleArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.DOUBLE_STRING_ARRAY_TYPE:
				if(context == grammarAccess.getDoubleStringArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DoubleStringArrayType(context, (DoubleStringArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.DOUBLE_TYPE:
				if(context == grammarAccess.getDoubleTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DoubleType(context, (DoubleType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.DOUBLE_VECTOR_TYPE:
				if(context == grammarAccess.getDoubleVectorTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getVectorTypeRule()) {
					sequence_DoubleVectorType(context, (DoubleVectorType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.ENCODED_TYPE:
				if(context == grammarAccess.getEncodedTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_EncodedType(context, (EncodedType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.ENUM_TYPE:
				if(context == grammarAccess.getEnumTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_EnumType(context, (EnumType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.EVENT_CRITERIA:
				if(context == grammarAccess.getEventCriteriaRule()) {
					sequence_EventCriteria(context, (EventCriteria) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.FIRE_EVENTS:
				if(context == grammarAccess.getFireEventsRule()) {
					sequence_FireEvents(context, (FireEvents) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.FLOAT_ARRAY_TYPE:
				if(context == grammarAccess.getFloatArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_FloatArrayType(context, (FloatArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.FLOAT_TYPE:
				if(context == grammarAccess.getFloatTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_FloatType(context, (FloatType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.FLOAT_VECTOR_TYPE:
				if(context == grammarAccess.getFloatVectorTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getVectorTypeRule()) {
					sequence_FloatVectorType(context, (FloatVectorType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.FORWARDED_ATTRIBUTE:
				if(context == grammarAccess.getForwardedAttributeRule()) {
					sequence_ForwardedAttribute(context, (ForwardedAttribute) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.INHERITANCE:
				if(context == grammarAccess.getInheritanceRule()) {
					sequence_Inheritance(context, (Inheritance) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.INHERITANCE_STATUS:
				if(context == grammarAccess.getInheritanceStatusRule()) {
					sequence_InheritanceStatus(context, (InheritanceStatus) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.INT_ARRAY_TYPE:
				if(context == grammarAccess.getIntArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_IntArrayType(context, (IntArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.INT_TYPE:
				if(context == grammarAccess.getIntTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_IntType(context, (IntType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.INT_VECTOR_TYPE:
				if(context == grammarAccess.getIntVectorTypeRule() ||
				   context == grammarAccess.getLongVectorTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getULongVectorTypeRule() ||
				   context == grammarAccess.getVectorTypeRule()) {
					sequence_IntVectorType_LongVectorType_ULongVectorType(context, (IntVectorType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.LONG_ARRAY_TYPE:
				if(context == grammarAccess.getLongArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_LongArrayType(context, (LongArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.LONG_STRING_ARRAY_TYPE:
				if(context == grammarAccess.getLongStringArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_LongStringArrayType(context, (LongStringArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.LONG_TYPE:
				if(context == grammarAccess.getLongTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_LongType(context, (LongType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.ONE_CLASS_SIMPLE_DEF:
				if(context == grammarAccess.getOneClassSimpleDefRule()) {
					sequence_OneClassSimpleDef(context, (OneClassSimpleDef) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.OVERLODED_POLL_PERIOD_OBJECT:
				if(context == grammarAccess.getOverlodedPollPeriodObjectRule()) {
					sequence_OverlodedPollPeriodObject(context, (OverlodedPollPeriodObject) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.PIPE:
				if(context == grammarAccess.getPipeRule()) {
					sequence_Pipe(context, (Pipe) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.POGO_DEVICE_CLASS:
				if(context == grammarAccess.getPogoDeviceClassRule()) {
					sequence_PogoDeviceClass(context, (PogoDeviceClass) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.POGO_MULTI_CLASSES:
				if(context == grammarAccess.getPogoMultiClassesRule()) {
					sequence_PogoMultiClasses(context, (PogoMultiClasses) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.POGO_SYSTEM:
				if(context == grammarAccess.getPogoSystemRule()) {
					sequence_PogoSystem(context, (PogoSystem) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.PREFERENCES:
				if(context == grammarAccess.getPreferencesRule()) {
					sequence_Preferences(context, (Preferences) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.SHORT_ARRAY_TYPE:
				if(context == grammarAccess.getShortArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ShortArrayType(context, (ShortArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.SHORT_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getShortTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ShortType(context, (ShortType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.SHORT_VECTOR_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getShortVectorTypeRule() ||
				   context == grammarAccess.getVectorTypeRule()) {
					sequence_ShortVectorType(context, (ShortVectorType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.STATE_TYPE:
				if(context == grammarAccess.getStateTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_StateType(context, (StateType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.STRING_ARRAY_TYPE:
				if(context == grammarAccess.getStringArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_StringArrayType(context, (StringArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.STRING_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getStringTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_StringType(context, (StringType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.STRING_VECTOR_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getStringVectorTypeRule() ||
				   context == grammarAccess.getVectorTypeRule()) {
					sequence_StringVectorType(context, (StringVectorType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.UCHAR_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUCharTypeRule()) {
					sequence_UCharType(context, (UCharType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.UINT_ARRAY_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUIntArrayTypeRule()) {
					sequence_UIntArrayType(context, (UIntArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.UINT_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUIntTypeRule()) {
					sequence_UIntType(context, (UIntType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.ULONG_ARRAY_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getULongArrayTypeRule()) {
					sequence_ULongArrayType(context, (ULongArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.ULONG_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getULongTypeRule()) {
					sequence_ULongType(context, (ULongType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.USHORT_ARRAY_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUShortArrayTypeRule()) {
					sequence_UShortArrayType(context, (UShortArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.USHORT_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUShortTypeRule()) {
					sequence_UShortType(context, (UShortType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.VOID_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVoidTypeRule()) {
					sequence_VoidType(context, (VoidType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING path=STRING)
	 */
	protected void sequence_AdditionalFile(EObject context, AdditionalFile semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ADDITIONAL_FILE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ADDITIONAL_FILE__NAME));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ADDITIONAL_FILE__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ADDITIONAL_FILE__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionalFileAccess().getNameSTRINGTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAdditionalFileAccess().getPathSTRINGTerminalRuleCall_1_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type description=STRING)
	 */
	protected void sequence_Argument(EObject context, Argument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ARGUMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ARGUMENT__TYPE));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ARGUMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ARGUMENT__DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         description=STRING 
	 *         label=STRING 
	 *         unit=STRING 
	 *         standardUnit=STRING 
	 *         displayUnit=STRING 
	 *         format=STRING 
	 *         maxValue=STRING 
	 *         minValue=STRING 
	 *         maxAlarm=STRING 
	 *         minAlarm=STRING 
	 *         maxWarning=STRING 
	 *         minWarning=STRING 
	 *         deltaTime=STRING 
	 *         deltaValue=STRING
	 *     )
	 */
	protected void sequence_AttrProperties(EObject context, AttrProperties semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__LABEL));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__UNIT));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__STANDARD_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__STANDARD_UNIT));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__DISPLAY_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__DISPLAY_UNIT));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__FORMAT));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MAX_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MAX_VALUE));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MIN_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MIN_VALUE));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MAX_ALARM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MAX_ALARM));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MIN_ALARM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MIN_ALARM));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MAX_WARNING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MAX_WARNING));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MIN_WARNING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__MIN_WARNING));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__DELTA_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__DELTA_TIME));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__DELTA_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.ATTR_PROPERTIES__DELTA_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getDescriptionSTRINGTerminalRuleCall_0_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getLabelSTRINGTerminalRuleCall_1_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getUnitSTRINGTerminalRuleCall_2_0(), semanticObject.getUnit());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getStandardUnitSTRINGTerminalRuleCall_3_0(), semanticObject.getStandardUnit());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getDisplayUnitSTRINGTerminalRuleCall_4_0(), semanticObject.getDisplayUnit());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getFormatSTRINGTerminalRuleCall_5_0(), semanticObject.getFormat());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getMaxValueSTRINGTerminalRuleCall_6_0(), semanticObject.getMaxValue());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getMinValueSTRINGTerminalRuleCall_7_0(), semanticObject.getMinValue());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getMaxAlarmSTRINGTerminalRuleCall_8_0(), semanticObject.getMaxAlarm());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getMinAlarmSTRINGTerminalRuleCall_9_0(), semanticObject.getMinAlarm());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getMaxWarningSTRINGTerminalRuleCall_10_0(), semanticObject.getMaxWarning());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getMinWarningSTRINGTerminalRuleCall_11_0(), semanticObject.getMinWarning());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getDeltaTimeSTRINGTerminalRuleCall_12_0(), semanticObject.getDeltaTime());
		feeder.accept(grammarAccess.getAttrPropertiesAccess().getDeltaValueSTRINGTerminalRuleCall_13_0(), semanticObject.getDeltaValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         attType=AttrType 
	 *         dataType=Type 
	 *         rwType=RW_Type 
	 *         displayLevel=DisplayLevel 
	 *         polledPeriod=STRING 
	 *         maxX=STRING 
	 *         maxY=STRING 
	 *         associatedAttr=STRING 
	 *         memorized=Boolean 
	 *         memorizedAtInit=Boolean 
	 *         changeEvent=FireEvents 
	 *         archiveEvent=FireEvents 
	 *         dataReadyEvent=FireEvents 
	 *         status=InheritanceStatus 
	 *         properties=AttrProperties 
	 *         allocReadMember=Boolean 
	 *         isDynamic=Boolean 
	 *         eventCriteria=EventCriteria 
	 *         evArchiveCriteria=EventCriteria 
	 *         enumLabels+=STRING* 
	 *         readExcludedStates+=STRING* 
	 *         writeExcludedStates+=STRING*
	 *     )
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BooleanArrayType}
	 */
	protected void sequence_BooleanArrayType(EObject context, BooleanArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BooleanType}
	 */
	protected void sequence_BooleanType(EObject context, BooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {CharArrayType}
	 */
	protected void sequence_CharArrayType(EObject context, CharArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         description=STRING 
	 *         title=STRING 
	 *         sourcePath=STRING 
	 *         inheritances+=Inheritance 
	 *         language=Language 
	 *         filestogenerate=STRING 
	 *         identification=ClassIdentification 
	 *         comments=Comments 
	 *         license=STRING 
	 *         copyright=STRING 
	 *         hasMandatoryProperty=Boolean 
	 *         hasConcreteProperty=Boolean 
	 *         hasAbstractCommand=Boolean 
	 *         hasAbstractAttribute=Boolean 
	 *         descriptionHtmlExists=Boolean
	 *     )
	 */
	protected void sequence_ClassDescription(EObject context, ClassDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         contact=STRING 
	 *         author=STRING 
	 *         emailDomain=STRING 
	 *         classFamily=STRING 
	 *         siteSpecific=STRING 
	 *         platform=STRING 
	 *         bus=STRING 
	 *         manufacturer=STRING 
	 *         reference=STRING 
	 *         keyWords+=STRING*
	 *     )
	 */
	protected void sequence_ClassIdentification(EObject context, ClassIdentification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         argin=Argument 
	 *         argout=Argument 
	 *         description=STRING 
	 *         status=InheritanceStatus 
	 *         execMethod=STRING 
	 *         displayLevel=DisplayLevel 
	 *         polledPeriod=STRING 
	 *         isDynamic=Boolean 
	 *         excludedStates+=STRING*
	 *     )
	 */
	protected void sequence_Command(EObject context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     commandsTable=STRING
	 */
	protected void sequence_Comments(EObject context, Comments semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.COMMENTS__COMMANDS_TABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.COMMENTS__COMMANDS_TABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommentsAccess().getCommandsTableSTRINGTerminalRuleCall_0(), semanticObject.getCommandsTable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ConstStringType}
	 */
	protected void sequence_ConstStringType(EObject context, ConstStringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DevIntType}
	 */
	protected void sequence_DevIntType(EObject context, DevIntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DoubleArrayType}
	 */
	protected void sequence_DoubleArrayType(EObject context, DoubleArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DoubleStringArrayType}
	 */
	protected void sequence_DoubleStringArrayType(EObject context, DoubleStringArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DoubleType}
	 */
	protected void sequence_DoubleType(EObject context, DoubleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DoubleVectorType}
	 */
	protected void sequence_DoubleVectorType(EObject context, DoubleVectorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EncodedType}
	 */
	protected void sequence_EncodedType(EObject context, EncodedType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EnumType}
	 */
	protected void sequence_EnumType(EObject context, EnumType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (relChange=STRING absChange=STRING period=STRING)
	 */
	protected void sequence_EventCriteria(EObject context, EventCriteria semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.EVENT_CRITERIA__REL_CHANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.EVENT_CRITERIA__REL_CHANGE));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.EVENT_CRITERIA__ABS_CHANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.EVENT_CRITERIA__ABS_CHANGE));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.EVENT_CRITERIA__PERIOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.EVENT_CRITERIA__PERIOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventCriteriaAccess().getRelChangeSTRINGTerminalRuleCall_0_0(), semanticObject.getRelChange());
		feeder.accept(grammarAccess.getEventCriteriaAccess().getAbsChangeSTRINGTerminalRuleCall_1_0(), semanticObject.getAbsChange());
		feeder.accept(grammarAccess.getEventCriteriaAccess().getPeriodSTRINGTerminalRuleCall_2_0(), semanticObject.getPeriod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fire=Boolean libCheckCriteria=Boolean)
	 */
	protected void sequence_FireEvents(EObject context, FireEvents semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.FIRE_EVENTS__FIRE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.FIRE_EVENTS__FIRE));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.FIRE_EVENTS__LIB_CHECK_CRITERIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.FIRE_EVENTS__LIB_CHECK_CRITERIA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0(), semanticObject.getFire());
		feeder.accept(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0(), semanticObject.getLibCheckCriteria());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {FloatArrayType}
	 */
	protected void sequence_FloatArrayType(EObject context, FloatArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FloatType}
	 */
	protected void sequence_FloatType(EObject context, FloatType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FloatVectorType}
	 */
	protected void sequence_FloatVectorType(EObject context, FloatVectorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID label=STRING status=InheritanceStatus)
	 */
	protected void sequence_ForwardedAttribute(EObject context, ForwardedAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.FORWARDED_ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.FORWARDED_ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.FORWARDED_ATTRIBUTE__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.FORWARDED_ATTRIBUTE__LABEL));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.FORWARDED_ATTRIBUTE__STATUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.FORWARDED_ATTRIBUTE__STATUS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForwardedAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getForwardedAttributeAccess().getLabelSTRINGTerminalRuleCall_1_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getForwardedAttributeAccess().getStatusInheritanceStatusParserRuleCall_2_0(), semanticObject.getStatus());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (abstract=Boolean inherited=Boolean concrete=Boolean concreteHere=Boolean hasChanged=STRING)
	 */
	protected void sequence_InheritanceStatus(EObject context, InheritanceStatus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.INHERITANCE_STATUS__ABSTRACT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.INHERITANCE_STATUS__ABSTRACT));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.INHERITANCE_STATUS__INHERITED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.INHERITANCE_STATUS__INHERITED));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.INHERITANCE_STATUS__CONCRETE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.INHERITANCE_STATUS__CONCRETE));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.INHERITANCE_STATUS__CONCRETE_HERE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.INHERITANCE_STATUS__CONCRETE_HERE));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.INHERITANCE_STATUS__HAS_CHANGED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.INHERITANCE_STATUS__HAS_CHANGED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInheritanceStatusAccess().getAbstractBooleanParserRuleCall_0_0(), semanticObject.getAbstract());
		feeder.accept(grammarAccess.getInheritanceStatusAccess().getInheritedBooleanParserRuleCall_1_0(), semanticObject.getInherited());
		feeder.accept(grammarAccess.getInheritanceStatusAccess().getConcreteBooleanParserRuleCall_2_0(), semanticObject.getConcrete());
		feeder.accept(grammarAccess.getInheritanceStatusAccess().getConcreteHereBooleanParserRuleCall_3_0(), semanticObject.getConcreteHere());
		feeder.accept(grammarAccess.getInheritanceStatusAccess().getHasChangedSTRINGTerminalRuleCall_4_0(), semanticObject.getHasChanged());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (classname=STRING sourcePath=STRING)
	 */
	protected void sequence_Inheritance(EObject context, Inheritance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.INHERITANCE__CLASSNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.INHERITANCE__CLASSNAME));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.INHERITANCE__SOURCE_PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.INHERITANCE__SOURCE_PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInheritanceAccess().getClassnameSTRINGTerminalRuleCall_0_0(), semanticObject.getClassname());
		feeder.accept(grammarAccess.getInheritanceAccess().getSourcePathSTRINGTerminalRuleCall_1_0(), semanticObject.getSourcePath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {IntArrayType}
	 */
	protected void sequence_IntArrayType(EObject context, IntArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntType}
	 */
	protected void sequence_IntType(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntVectorType}
	 */
	protected void sequence_IntVectorType_LongVectorType_ULongVectorType(EObject context, IntVectorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LongArrayType}
	 */
	protected void sequence_LongArrayType(EObject context, LongArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LongStringArrayType}
	 */
	protected void sequence_LongStringArrayType(EObject context, LongStringArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LongType}
	 */
	protected void sequence_LongType(EObject context, LongType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         classname=STRING 
	 *         sourcePath=STRING 
	 *         hasDynamic=Boolean 
	 *         pogo6=Boolean 
	 *         inheritances+=Inheritance 
	 *         parentClasses+=STRING 
	 *         additionalFiles+=AdditionalFile*
	 *     )
	 */
	protected void sequence_OneClassSimpleDef(EObject context, OneClassSimpleDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING type=STRING pollPeriod=STRING)
	 */
	protected void sequence_OverlodedPollPeriodObject(EObject context, OverlodedPollPeriodObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.OVERLODED_POLL_PERIOD_OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.OVERLODED_POLL_PERIOD_OBJECT__NAME));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.OVERLODED_POLL_PERIOD_OBJECT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.OVERLODED_POLL_PERIOD_OBJECT__TYPE));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.OVERLODED_POLL_PERIOD_OBJECT__POLL_PERIOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.OVERLODED_POLL_PERIOD_OBJECT__POLL_PERIOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOverlodedPollPeriodObjectAccess().getNameSTRINGTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOverlodedPollPeriodObjectAccess().getTypeSTRINGTerminalRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getOverlodedPollPeriodObjectAccess().getPollPeriodSTRINGTerminalRuleCall_2_0(), semanticObject.getPollPeriod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         description=STRING 
	 *         label=STRING 
	 *         rwType=RW_PipeType 
	 *         displayLevel=DisplayLevel 
	 *         readExcludedStates+=STRING* 
	 *         writeExcludedStates+=STRING*
	 *     )
	 */
	protected void sequence_Pipe(EObject context, Pipe semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         isAbstract?='abstract'? 
	 *         baseClass=[PogoDeviceClass|ID]? 
	 *         pogoRevision=ID 
	 *         institute=ID 
	 *         description=ClassDescription 
	 *         classProperties+=Property* 
	 *         deviceProperties+=Property* 
	 *         commands+=Command* 
	 *         dynamicCommands+=Command* 
	 *         attributes+=Attribute* 
	 *         dynamicAttributes+=Attribute* 
	 *         forwardedAttributes+=ForwardedAttribute* 
	 *         pipes+=Pipe* 
	 *         states+=State* 
	 *         preferences=Preferences 
	 *         additionalFiles+=AdditionalFile* 
	 *         overlodedPollPeriodObject+=OverlodedPollPeriodObject*
	 *     )
	 */
	protected void sequence_PogoDeviceClass(EObject context, PogoDeviceClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         pogoRevision=ID 
	 *         name=ID 
	 *         sourcePath=STRING 
	 *         description=STRING 
	 *         title=STRING 
	 *         license=STRING 
	 *         copyright=STRING 
	 *         classes+=OneClassSimpleDef 
	 *         filestogenerate=STRING 
	 *         preferences=Preferences
	 *     )
	 */
	protected void sequence_PogoMultiClasses(EObject context, PogoMultiClasses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* classes+=PogoDeviceClass* multiClasses+=PogoMultiClasses*)
	 */
	protected void sequence_PogoSystem(EObject context, PogoSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (docHome=STRING makefileHome=STRING installHome=STRING htmlVersion=Boolean)
	 */
	protected void sequence_Preferences(EObject context, Preferences semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.PREFERENCES__DOC_HOME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.PREFERENCES__DOC_HOME));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.PREFERENCES__MAKEFILE_HOME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.PREFERENCES__MAKEFILE_HOME));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.PREFERENCES__INSTALL_HOME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.PREFERENCES__INSTALL_HOME));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.PREFERENCES__HTML_VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.PREFERENCES__HTML_VERSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPreferencesAccess().getDocHomeSTRINGTerminalRuleCall_0_0(), semanticObject.getDocHome());
		feeder.accept(grammarAccess.getPreferencesAccess().getMakefileHomeSTRINGTerminalRuleCall_1_0(), semanticObject.getMakefileHome());
		feeder.accept(grammarAccess.getPreferencesAccess().getInstallHomeSTRINGTerminalRuleCall_2_0(), semanticObject.getInstallHome());
		feeder.accept(grammarAccess.getPreferencesAccess().getHtmlVersionBooleanParserRuleCall_3_0(), semanticObject.getHtmlVersion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=PropType 
	 *         status=InheritanceStatus 
	 *         mandatory=Boolean 
	 *         description=STRING 
	 *         DefaultPropValue+=STRING*
	 *     )
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ShortArrayType}
	 */
	protected void sequence_ShortArrayType(EObject context, ShortArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ShortType}
	 */
	protected void sequence_ShortType(EObject context, ShortType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ShortVectorType}
	 */
	protected void sequence_ShortVectorType(EObject context, ShortVectorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StateType}
	 */
	protected void sequence_StateType(EObject context, StateType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING status=InheritanceStatus)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.STATE__NAME));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.STATE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.STATE__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.STATE__STATUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.STATE__STATUS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getStateAccess().getStatusInheritanceStatusParserRuleCall_2_0(), semanticObject.getStatus());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {StringArrayType}
	 */
	protected void sequence_StringArrayType(EObject context, StringArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StringType}
	 */
	protected void sequence_StringType(EObject context, StringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StringVectorType}
	 */
	protected void sequence_StringVectorType(EObject context, StringVectorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UCharType}
	 */
	protected void sequence_UCharType(EObject context, UCharType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UIntArrayType}
	 */
	protected void sequence_UIntArrayType(EObject context, UIntArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UIntType}
	 */
	protected void sequence_UIntType(EObject context, UIntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ULongArrayType}
	 */
	protected void sequence_ULongArrayType(EObject context, ULongArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ULongType}
	 */
	protected void sequence_ULongType(EObject context, ULongType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UShortArrayType}
	 */
	protected void sequence_UShortArrayType(EObject context, UShortArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UShortType}
	 */
	protected void sequence_UShortType(EObject context, UShortType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {VoidType}
	 */
	protected void sequence_VoidType(EObject context, VoidType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
