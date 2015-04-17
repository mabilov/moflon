/**
 */
package ModalSequenceDiagram.impl;

import ModalSequenceDiagram.ActionExecutionSpecification;
import ModalSequenceDiagram.BehaviorExecutionSpecification;
import ModalSequenceDiagram.CallEvent;
import ModalSequenceDiagram.ClockReset;
import ModalSequenceDiagram.Collaboration;
import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Condition;
import ModalSequenceDiagram.Connector;
import ModalSequenceDiagram.ConnectorEnd;
import ModalSequenceDiagram.ConsiderIgnoreFragment;
import ModalSequenceDiagram.Constraint;
import ModalSequenceDiagram.Continuation;
import ModalSequenceDiagram.DestructionOccurenceSpecification;
import ModalSequenceDiagram.EnvironmentAssumption;
import ModalSequenceDiagram.ExecutionKind;
import ModalSequenceDiagram.ExecutionOccurrenceSpecification;
import ModalSequenceDiagram.Gate;
import ModalSequenceDiagram.GeneralOrdering;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionConstraint;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.InteractionOperatorKind;
import ModalSequenceDiagram.InteractionUse;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.LiteralString;
import ModalSequenceDiagram.MSDSpecification;
import ModalSequenceDiagram.Message;
import ModalSequenceDiagram.MessageEnd;
import ModalSequenceDiagram.MessageKind;
import ModalSequenceDiagram.MessageOccurrenceSpecification;
import ModalSequenceDiagram.MessageSort;
import ModalSequenceDiagram.ModalMessage;
import ModalSequenceDiagram.ModalSequenceDiagramFactory;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;
import ModalSequenceDiagram.Model;
import ModalSequenceDiagram.OccurrenceSpecification;
import ModalSequenceDiagram.OpaqueExpression;
import ModalSequenceDiagram.Operation;
import ModalSequenceDiagram.PartDecomposition;
import ModalSequenceDiagram.PartKind;
import ModalSequenceDiagram.Property;
import ModalSequenceDiagram.SpecificationKind;
import ModalSequenceDiagram.SpecificationPart;
import ModalSequenceDiagram.StateInvariant;
import ModalSequenceDiagram.TemperatureKind;
import ModalSequenceDiagram.TimeCondition;
import ModalSequenceDiagram.TypedElement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModalSequenceDiagramFactoryImpl extends EFactoryImpl implements
		ModalSequenceDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModalSequenceDiagramFactory init() {
		try {
			ModalSequenceDiagramFactory theModalSequenceDiagramFactory = (ModalSequenceDiagramFactory) EPackage.Registry.INSTANCE
					.getEFactory(ModalSequenceDiagramPackage.eNS_URI);
			if (theModalSequenceDiagramFactory != null) {
				return theModalSequenceDiagramFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModalSequenceDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalSequenceDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModalSequenceDiagramPackage.MODEL:
			return createModel();
		case ModalSequenceDiagramPackage.PACKAGE:
			return createPackage();
		case ModalSequenceDiagramPackage.COLLABORATION:
			return createCollaboration();
		case ModalSequenceDiagramPackage.INTERACTION:
			return createInteraction();
		case ModalSequenceDiagramPackage.CONNECTOR:
			return createConnector();
		case ModalSequenceDiagramPackage.LIFELINE:
			return createLifeline();
		case ModalSequenceDiagramPackage.PROPERTY:
			return createProperty();
		case ModalSequenceDiagramPackage.MESSAGE:
			return createMessage();
		case ModalSequenceDiagramPackage.MESSAGE_END:
			return createMessageEnd();
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION:
			return createMessageOccurrenceSpecification();
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION:
			return createOccurrenceSpecification();
		case ModalSequenceDiagramPackage.STATE_INVARIANT:
			return createStateInvariant();
		case ModalSequenceDiagramPackage.CONSTRAINT:
			return createConstraint();
		case ModalSequenceDiagramPackage.OPAQUE_EXPRESSION:
			return createOpaqueExpression();
		case ModalSequenceDiagramPackage.TYPED_ELEMENT:
			return createTypedElement();
		case ModalSequenceDiagramPackage.CONNECTOR_END:
			return createConnectorEnd();
		case ModalSequenceDiagramPackage.CALL_EVENT:
			return createCallEvent();
		case ModalSequenceDiagramPackage.OPERATION:
			return createOperation();
		case ModalSequenceDiagramPackage.CLASS:
			return createClass();
		case ModalSequenceDiagramPackage.DESTRUCTION_OCCURENCE_SPECIFICATION:
			return createDestructionOccurenceSpecification();
		case ModalSequenceDiagramPackage.GENERAL_ORDERING:
			return createGeneralOrdering();
		case ModalSequenceDiagramPackage.EXECUTION_OCCURRENCE_SPECIFICATION:
			return createExecutionOccurrenceSpecification();
		case ModalSequenceDiagramPackage.ACTION_EXECUTION_SPECIFICATION:
			return createActionExecutionSpecification();
		case ModalSequenceDiagramPackage.BEHAVIOR_EXECUTION_SPECIFICATION:
			return createBehaviorExecutionSpecification();
		case ModalSequenceDiagramPackage.CONSIDER_IGNORE_FRAGMENT:
			return createConsiderIgnoreFragment();
		case ModalSequenceDiagramPackage.CONTINUATION:
			return createContinuation();
		case ModalSequenceDiagramPackage.INTERACTION_USE:
			return createInteractionUse();
		case ModalSequenceDiagramPackage.MODAL_MESSAGE:
			return createModalMessage();
		case ModalSequenceDiagramPackage.CONDITION:
			return createCondition();
		case ModalSequenceDiagramPackage.TIME_CONDITION:
			return createTimeCondition();
		case ModalSequenceDiagramPackage.SPECIFICATION_PART:
			return createSpecificationPart();
		case ModalSequenceDiagramPackage.INTERACTION_OPERAND:
			return createInteractionOperand();
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT:
			return createCombinedFragment();
		case ModalSequenceDiagramPackage.INTERACTION_CONSTRAINT:
			return createInteractionConstraint();
		case ModalSequenceDiagramPackage.GATE:
			return createGate();
		case ModalSequenceDiagramPackage.PART_DECOMPOSITION:
			return createPartDecomposition();
		case ModalSequenceDiagramPackage.CLOCK_RESET:
			return createClockReset();
		case ModalSequenceDiagramPackage.MSD_SPECIFICATION:
			return createMSDSpecification();
		case ModalSequenceDiagramPackage.ENVIRONMENT_ASSUMPTION:
			return createEnvironmentAssumption();
		case ModalSequenceDiagramPackage.LITERAL_STRING:
			return createLiteralString();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ModalSequenceDiagramPackage.MESSAGE_KIND:
			return createMessageKindFromString(eDataType, initialValue);
		case ModalSequenceDiagramPackage.MESSAGE_SORT:
			return createMessageSortFromString(eDataType, initialValue);
		case ModalSequenceDiagramPackage.TEMPERATURE_KIND:
			return createTemperatureKindFromString(eDataType, initialValue);
		case ModalSequenceDiagramPackage.PART_KIND:
			return createPartKindFromString(eDataType, initialValue);
		case ModalSequenceDiagramPackage.EXECUTION_KIND:
			return createExecutionKindFromString(eDataType, initialValue);
		case ModalSequenceDiagramPackage.INTERACTION_OPERATOR_KIND:
			return createInteractionOperatorKindFromString(eDataType,
					initialValue);
		case ModalSequenceDiagramPackage.SPECIFICATION_KIND:
			return createSpecificationKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ModalSequenceDiagramPackage.MESSAGE_KIND:
			return convertMessageKindToString(eDataType, instanceValue);
		case ModalSequenceDiagramPackage.MESSAGE_SORT:
			return convertMessageSortToString(eDataType, instanceValue);
		case ModalSequenceDiagramPackage.TEMPERATURE_KIND:
			return convertTemperatureKindToString(eDataType, instanceValue);
		case ModalSequenceDiagramPackage.PART_KIND:
			return convertPartKindToString(eDataType, instanceValue);
		case ModalSequenceDiagramPackage.EXECUTION_KIND:
			return convertExecutionKindToString(eDataType, instanceValue);
		case ModalSequenceDiagramPackage.INTERACTION_OPERATOR_KIND:
			return convertInteractionOperatorKindToString(eDataType,
					instanceValue);
		case ModalSequenceDiagramPackage.SPECIFICATION_KIND:
			return convertSpecificationKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalSequenceDiagram.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline() {
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEnd createMessageEnd() {
		MessageEndImpl messageEnd = new MessageEndImpl();
		return messageEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOccurrenceSpecification createMessageOccurrenceSpecification() {
		MessageOccurrenceSpecificationImpl messageOccurrenceSpecification = new MessageOccurrenceSpecificationImpl();
		return messageOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification createOccurrenceSpecification() {
		OccurrenceSpecificationImpl occurrenceSpecification = new OccurrenceSpecificationImpl();
		return occurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInvariant createStateInvariant() {
		StateInvariantImpl stateInvariant = new StateInvariantImpl();
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression createOpaqueExpression() {
		OpaqueExpressionImpl opaqueExpression = new OpaqueExpressionImpl();
		return opaqueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement createTypedElement() {
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd createConnectorEnd() {
		ConnectorEndImpl connectorEnd = new ConnectorEndImpl();
		return connectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallEvent createCallEvent() {
		CallEventImpl callEvent = new CallEventImpl();
		return callEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalSequenceDiagram.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestructionOccurenceSpecification createDestructionOccurenceSpecification() {
		DestructionOccurenceSpecificationImpl destructionOccurenceSpecification = new DestructionOccurenceSpecificationImpl();
		return destructionOccurenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering createGeneralOrdering() {
		GeneralOrderingImpl generalOrdering = new GeneralOrderingImpl();
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrenceSpecification createExecutionOccurrenceSpecification() {
		ExecutionOccurrenceSpecificationImpl executionOccurrenceSpecification = new ExecutionOccurrenceSpecificationImpl();
		return executionOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionExecutionSpecification createActionExecutionSpecification() {
		ActionExecutionSpecificationImpl actionExecutionSpecification = new ActionExecutionSpecificationImpl();
		return actionExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorExecutionSpecification createBehaviorExecutionSpecification() {
		BehaviorExecutionSpecificationImpl behaviorExecutionSpecification = new BehaviorExecutionSpecificationImpl();
		return behaviorExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsiderIgnoreFragment createConsiderIgnoreFragment() {
		ConsiderIgnoreFragmentImpl considerIgnoreFragment = new ConsiderIgnoreFragmentImpl();
		return considerIgnoreFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continuation createContinuation() {
		ContinuationImpl continuation = new ContinuationImpl();
		return continuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUse createInteractionUse() {
		InteractionUseImpl interactionUse = new InteractionUseImpl();
		return interactionUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalMessage createModalMessage() {
		ModalMessageImpl modalMessage = new ModalMessageImpl();
		return modalMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCondition createTimeCondition() {
		TimeConditionImpl timeCondition = new TimeConditionImpl();
		return timeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationPart createSpecificationPart() {
		SpecificationPartImpl specificationPart = new SpecificationPartImpl();
		return specificationPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand createInteractionOperand() {
		InteractionOperandImpl interactionOperand = new InteractionOperandImpl();
		return interactionOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragment createCombinedFragment() {
		CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
		return combinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint createInteractionConstraint() {
		InteractionConstraintImpl interactionConstraint = new InteractionConstraintImpl();
		return interactionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition createPartDecomposition() {
		PartDecompositionImpl partDecomposition = new PartDecompositionImpl();
		return partDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockReset createClockReset() {
		ClockResetImpl clockReset = new ClockResetImpl();
		return clockReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSDSpecification createMSDSpecification() {
		MSDSpecificationImpl msdSpecification = new MSDSpecificationImpl();
		return msdSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentAssumption createEnvironmentAssumption() {
		EnvironmentAssumptionImpl environmentAssumption = new EnvironmentAssumptionImpl();
		return environmentAssumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralString createLiteralString() {
		LiteralStringImpl literalString = new LiteralStringImpl();
		return literalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind createMessageKindFromString(EDataType eDataType,
			String initialValue) {
		MessageKind result = MessageKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort createMessageSortFromString(EDataType eDataType,
			String initialValue) {
		MessageSort result = MessageSort.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSortToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureKind createTemperatureKindFromString(EDataType eDataType,
			String initialValue) {
		TemperatureKind result = TemperatureKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemperatureKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartKind createPartKindFromString(EDataType eDataType,
			String initialValue) {
		PartKind result = PartKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionKind createExecutionKindFromString(EDataType eDataType,
			String initialValue) {
		ExecutionKind result = ExecutionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperatorKind createInteractionOperatorKindFromString(
			EDataType eDataType, String initialValue) {
		InteractionOperatorKind result = InteractionOperatorKind
				.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionOperatorKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationKind createSpecificationKindFromString(
			EDataType eDataType, String initialValue) {
		SpecificationKind result = SpecificationKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecificationKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalSequenceDiagramPackage getModalSequenceDiagramPackage() {
		return (ModalSequenceDiagramPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModalSequenceDiagramPackage getPackage() {
		return ModalSequenceDiagramPackage.eINSTANCE;
	}

} //ModalSequenceDiagramFactoryImpl
