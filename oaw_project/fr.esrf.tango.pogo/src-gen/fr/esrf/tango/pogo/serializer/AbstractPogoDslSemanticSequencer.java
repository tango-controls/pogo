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
import fr.esrf.tango.pogo.pogoDsl.EventCriteria;
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
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractPogoDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected PogoDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
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
					sequence_Type(context, (BooleanArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.BOOLEAN_TYPE:
				if(context == grammarAccess.getBooleanTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PropType(context, (BooleanType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.CHAR_ARRAY_TYPE:
				if(context == grammarAccess.getCharArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (CharArrayType) semanticObject); 
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
					sequence_Type(context, (ConstStringType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.DEV_INT_TYPE:
				if(context == grammarAccess.getDevIntTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (DevIntType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.DOUBLE_ARRAY_TYPE:
				if(context == grammarAccess.getDoubleArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (DoubleArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.DOUBLE_STRING_ARRAY_TYPE:
				if(context == grammarAccess.getDoubleStringArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (DoubleStringArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.DOUBLE_TYPE:
				if(context == grammarAccess.getDoubleTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PropType(context, (DoubleType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.DOUBLE_VECTOR_TYPE:
				if(context == grammarAccess.getDoubleVectorTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getVectorTypeRule()) {
					sequence_PropType(context, (DoubleVectorType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.ENCODED_TYPE:
				if(context == grammarAccess.getEncodedTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (EncodedType) semanticObject); 
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
					sequence_Type(context, (FloatArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.FLOAT_TYPE:
				if(context == grammarAccess.getFloatTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PropType(context, (FloatType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.FLOAT_VECTOR_TYPE:
				if(context == grammarAccess.getFloatVectorTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getVectorTypeRule()) {
					sequence_PropType(context, (FloatVectorType) semanticObject); 
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
					sequence_Type(context, (IntArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.INT_TYPE:
				if(context == grammarAccess.getIntTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PropType(context, (IntType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.INT_VECTOR_TYPE:
				if(context == grammarAccess.getIntVectorTypeRule() ||
				   context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getVectorTypeRule()) {
					sequence_PropType(context, (IntVectorType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.LONG_ARRAY_TYPE:
				if(context == grammarAccess.getLongArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (LongArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.LONG_STRING_ARRAY_TYPE:
				if(context == grammarAccess.getLongStringArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (LongStringArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.LONG_TYPE:
				if(context == grammarAccess.getLongTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (LongType) semanticObject); 
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
					sequence_Type(context, (ShortArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.SHORT_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getShortTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PropType(context, (ShortType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.SHORT_VECTOR_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getShortVectorTypeRule() ||
				   context == grammarAccess.getVectorTypeRule()) {
					sequence_PropType(context, (ShortVectorType) semanticObject); 
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
					sequence_Type(context, (StateType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.STRING_ARRAY_TYPE:
				if(context == grammarAccess.getStringArrayTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (StringArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.STRING_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getStringTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PropType(context, (StringType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.STRING_VECTOR_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getStringVectorTypeRule() ||
				   context == grammarAccess.getVectorTypeRule()) {
					sequence_PropType(context, (StringVectorType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.UCHAR_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUCharTypeRule()) {
					sequence_Type(context, (UCharType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.UINT_ARRAY_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUIntArrayTypeRule()) {
					sequence_Type(context, (UIntArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.UINT_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUIntTypeRule()) {
					sequence_PropType(context, (UIntType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.ULONG_ARRAY_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getULongArrayTypeRule()) {
					sequence_Type(context, (ULongArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.ULONG_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getULongTypeRule()) {
					sequence_Type(context, (ULongType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.USHORT_ARRAY_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUShortArrayTypeRule()) {
					sequence_Type(context, (UShortArrayType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.USHORT_TYPE:
				if(context == grammarAccess.getPropTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUShortTypeRule()) {
					sequence_PropType(context, (UShortType) semanticObject); 
					return; 
				}
				else break;
			case PogoDslPackage.VOID_TYPE:
				if(context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVoidTypeRule()) {
					sequence_Type(context, (VoidType) semanticObject); 
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
	 *         readExcludedStates+=STRING* 
	 *         writeExcludedStates+=STRING*
	 *     )
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
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
	 *     )
	 */
	protected void sequence_ClassIdentification(EObject context, ClassIdentification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__CONTACT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__CONTACT));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__AUTHOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__AUTHOR));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__EMAIL_DOMAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__EMAIL_DOMAIN));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__CLASS_FAMILY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__CLASS_FAMILY));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__SITE_SPECIFIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__SITE_SPECIFIC));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__PLATFORM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__PLATFORM));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__BUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__BUS));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__MANUFACTURER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__MANUFACTURER));
			if(transientValues.isValueTransient(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PogoDslPackage.Literals.CLASS_IDENTIFICATION__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassIdentificationAccess().getContactSTRINGTerminalRuleCall_0_0(), semanticObject.getContact());
		feeder.accept(grammarAccess.getClassIdentificationAccess().getAuthorSTRINGTerminalRuleCall_1_0(), semanticObject.getAuthor());
		feeder.accept(grammarAccess.getClassIdentificationAccess().getEmailDomainSTRINGTerminalRuleCall_2_0(), semanticObject.getEmailDomain());
		feeder.accept(grammarAccess.getClassIdentificationAccess().getClassFamilySTRINGTerminalRuleCall_3_0(), semanticObject.getClassFamily());
		feeder.accept(grammarAccess.getClassIdentificationAccess().getSiteSpecificSTRINGTerminalRuleCall_4_0(), semanticObject.getSiteSpecific());
		feeder.accept(grammarAccess.getClassIdentificationAccess().getPlatformSTRINGTerminalRuleCall_5_0(), semanticObject.getPlatform());
		feeder.accept(grammarAccess.getClassIdentificationAccess().getBusSTRINGTerminalRuleCall_6_0(), semanticObject.getBus());
		feeder.accept(grammarAccess.getClassIdentificationAccess().getManufacturerSTRINGTerminalRuleCall_7_0(), semanticObject.getManufacturer());
		feeder.accept(grammarAccess.getClassIdentificationAccess().getReferenceSTRINGTerminalRuleCall_8_0(), semanticObject.getReference());
		feeder.finish();
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
	 *         name=ID 
	 *         isAbstract?='abstract'? 
	 *         baseClass=[PogoDeviceClass|ID]? 
	 *         pogoRevision=ID 
	 *         institute=ID 
	 *         description=ClassDescription 
	 *         classProperties+=Property* 
	 *         deviceProperties+=Property* 
	 *         commands+=Command* 
	 *         attributes+=Attribute* 
	 *         dynamicAttributes+=Attribute* 
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
	 *     {BooleanType}
	 */
	protected void sequence_PropType(EObject context, BooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DoubleType}
	 */
	protected void sequence_PropType(EObject context, DoubleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DoubleVectorType}
	 */
	protected void sequence_PropType(EObject context, DoubleVectorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FloatType}
	 */
	protected void sequence_PropType(EObject context, FloatType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FloatVectorType}
	 */
	protected void sequence_PropType(EObject context, FloatVectorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntType}
	 */
	protected void sequence_PropType(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntVectorType}
	 */
	protected void sequence_PropType(EObject context, IntVectorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ShortType}
	 */
	protected void sequence_PropType(EObject context, ShortType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ShortVectorType}
	 */
	protected void sequence_PropType(EObject context, ShortVectorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StringType}
	 */
	protected void sequence_PropType(EObject context, StringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StringVectorType}
	 */
	protected void sequence_PropType(EObject context, StringVectorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UIntType}
	 */
	protected void sequence_PropType(EObject context, UIntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UShortType}
	 */
	protected void sequence_PropType(EObject context, UShortType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     {BooleanArrayType}
	 */
	protected void sequence_Type(EObject context, BooleanArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {CharArrayType}
	 */
	protected void sequence_Type(EObject context, CharArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ConstStringType}
	 */
	protected void sequence_Type(EObject context, ConstStringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DevIntType}
	 */
	protected void sequence_Type(EObject context, DevIntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DoubleArrayType}
	 */
	protected void sequence_Type(EObject context, DoubleArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DoubleStringArrayType}
	 */
	protected void sequence_Type(EObject context, DoubleStringArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EncodedType}
	 */
	protected void sequence_Type(EObject context, EncodedType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {FloatArrayType}
	 */
	protected void sequence_Type(EObject context, FloatArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntArrayType}
	 */
	protected void sequence_Type(EObject context, IntArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LongArrayType}
	 */
	protected void sequence_Type(EObject context, LongArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LongStringArrayType}
	 */
	protected void sequence_Type(EObject context, LongStringArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LongType}
	 */
	protected void sequence_Type(EObject context, LongType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ShortArrayType}
	 */
	protected void sequence_Type(EObject context, ShortArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StateType}
	 */
	protected void sequence_Type(EObject context, StateType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {StringArrayType}
	 */
	protected void sequence_Type(EObject context, StringArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UCharType}
	 */
	protected void sequence_Type(EObject context, UCharType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UIntArrayType}
	 */
	protected void sequence_Type(EObject context, UIntArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ULongArrayType}
	 */
	protected void sequence_Type(EObject context, ULongArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ULongType}
	 */
	protected void sequence_Type(EObject context, ULongType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UShortArrayType}
	 */
	protected void sequence_Type(EObject context, UShortArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {VoidType}
	 */
	protected void sequence_Type(EObject context, VoidType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
