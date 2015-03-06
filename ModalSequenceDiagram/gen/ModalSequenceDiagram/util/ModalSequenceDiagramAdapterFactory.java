/**
 */
package ModalSequenceDiagram.util;

import ModalSequenceDiagram.Action;
import ModalSequenceDiagram.ActionExecutionSpecification;
import ModalSequenceDiagram.Behavior;
import ModalSequenceDiagram.BehaviorExecutionSpecification;
import ModalSequenceDiagram.BehavioralFeature;
import ModalSequenceDiagram.BehavioredClassifier;
import ModalSequenceDiagram.CallEvent;
import ModalSequenceDiagram.Classifier;
import ModalSequenceDiagram.ClockReset;
import ModalSequenceDiagram.Collaboration;
import ModalSequenceDiagram.CombinedFragment;
import ModalSequenceDiagram.Condition;
import ModalSequenceDiagram.ConnectableElement;
import ModalSequenceDiagram.Connector;
import ModalSequenceDiagram.ConnectorEnd;
import ModalSequenceDiagram.ConsiderIgnoreFragment;
import ModalSequenceDiagram.Constraint;
import ModalSequenceDiagram.Continuation;
import ModalSequenceDiagram.DestructionOccurenceSpecification;
import ModalSequenceDiagram.EncapsulatedClassifier;
import ModalSequenceDiagram.EnvironmentAssumption;
import ModalSequenceDiagram.Event;
import ModalSequenceDiagram.ExecutionOccurrenceSpecification;
import ModalSequenceDiagram.ExecutionSpecification;
import ModalSequenceDiagram.Feature;
import ModalSequenceDiagram.Gate;
import ModalSequenceDiagram.GeneralOrdering;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionConstraint;
import ModalSequenceDiagram.InteractionFragment;
import ModalSequenceDiagram.InteractionOperand;
import ModalSequenceDiagram.InteractionUse;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.MSDSpecification;
import ModalSequenceDiagram.Message;
import ModalSequenceDiagram.MessageEnd;
import ModalSequenceDiagram.MessageEvent;
import ModalSequenceDiagram.MessageOccurrenceSpecification;
import ModalSequenceDiagram.ModalMessage;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;
import ModalSequenceDiagram.Model;
import ModalSequenceDiagram.NamedElement;
import ModalSequenceDiagram.Namespace;
import ModalSequenceDiagram.OccurrenceSpecification;
import ModalSequenceDiagram.OpaqueExpression;
import ModalSequenceDiagram.Operation;
import ModalSequenceDiagram.PackageableElement;
import ModalSequenceDiagram.PartDecomposition;
import ModalSequenceDiagram.Property;
import ModalSequenceDiagram.RedefinableElement;
import ModalSequenceDiagram.SpecificationPart;
import ModalSequenceDiagram.StateInvariant;
import ModalSequenceDiagram.StructuredClassifier;
import ModalSequenceDiagram.TimeCondition;
import ModalSequenceDiagram.Type;
import ModalSequenceDiagram.TypedElement;
import ModalSequenceDiagram.ValueSpecification;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage
 * @generated
 */
public class ModalSequenceDiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModalSequenceDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalSequenceDiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModalSequenceDiagramPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModalSequenceDiagramSwitch<Adapter> modelSwitch = new ModalSequenceDiagramSwitch<Adapter>() {
		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter casePackage(ModalSequenceDiagram.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter casePackageableElement(PackageableElement object) {
			return createPackageableElementAdapter();
		}

		@Override
		public Adapter caseCollaboration(Collaboration object) {
			return createCollaborationAdapter();
		}

		@Override
		public Adapter caseStructuredClassifier(StructuredClassifier object) {
			return createStructuredClassifierAdapter();
		}

		@Override
		public Adapter caseBehavioredClassifier(BehavioredClassifier object) {
			return createBehavioredClassifierAdapter();
		}

		@Override
		public Adapter caseClassifier(Classifier object) {
			return createClassifierAdapter();
		}

		@Override
		public Adapter caseType(Type object) {
			return createTypeAdapter();
		}

		@Override
		public Adapter caseInteraction(Interaction object) {
			return createInteractionAdapter();
		}

		@Override
		public Adapter caseBehavior(Behavior object) {
			return createBehaviorAdapter();
		}

		@Override
		public Adapter caseConnector(Connector object) {
			return createConnectorAdapter();
		}

		@Override
		public Adapter caseLifeline(Lifeline object) {
			return createLifelineAdapter();
		}

		@Override
		public Adapter caseInteractionFragment(InteractionFragment object) {
			return createInteractionFragmentAdapter();
		}

		@Override
		public Adapter caseConnectableElement(ConnectableElement object) {
			return createConnectableElementAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseMessageEnd(MessageEnd object) {
			return createMessageEndAdapter();
		}

		@Override
		public Adapter caseMessageOccurrenceSpecification(
				MessageOccurrenceSpecification object) {
			return createMessageOccurrenceSpecificationAdapter();
		}

		@Override
		public Adapter caseOccurrenceSpecification(
				OccurrenceSpecification object) {
			return createOccurrenceSpecificationAdapter();
		}

		@Override
		public Adapter caseStateInvariant(StateInvariant object) {
			return createStateInvariantAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter caseValueSpecification(ValueSpecification object) {
			return createValueSpecificationAdapter();
		}

		@Override
		public Adapter caseOpaqueExpression(OpaqueExpression object) {
			return createOpaqueExpressionAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseTypedElement(TypedElement object) {
			return createTypedElementAdapter();
		}

		@Override
		public Adapter caseRedefinableElement(RedefinableElement object) {
			return createRedefinableElementAdapter();
		}

		@Override
		public Adapter caseFeature(Feature object) {
			return createFeatureAdapter();
		}

		@Override
		public Adapter caseConnectorEnd(ConnectorEnd object) {
			return createConnectorEndAdapter();
		}

		@Override
		public Adapter caseCallEvent(CallEvent object) {
			return createCallEventAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseMessageEvent(MessageEvent object) {
			return createMessageEventAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseClass(ModalSequenceDiagram.Class object) {
			return createClassAdapter();
		}

		@Override
		public Adapter caseBehavioralFeature(BehavioralFeature object) {
			return createBehavioralFeatureAdapter();
		}

		@Override
		public Adapter caseDestructionOccurenceSpecification(
				DestructionOccurenceSpecification object) {
			return createDestructionOccurenceSpecificationAdapter();
		}

		@Override
		public Adapter caseGeneralOrdering(GeneralOrdering object) {
			return createGeneralOrderingAdapter();
		}

		@Override
		public Adapter caseExecutionOccurrenceSpecification(
				ExecutionOccurrenceSpecification object) {
			return createExecutionOccurrenceSpecificationAdapter();
		}

		@Override
		public Adapter caseActionExecutionSpecification(
				ActionExecutionSpecification object) {
			return createActionExecutionSpecificationAdapter();
		}

		@Override
		public Adapter caseBehaviorExecutionSpecification(
				BehaviorExecutionSpecification object) {
			return createBehaviorExecutionSpecificationAdapter();
		}

		@Override
		public Adapter caseNamespace(Namespace object) {
			return createNamespaceAdapter();
		}

		@Override
		public Adapter caseConsiderIgnoreFragment(ConsiderIgnoreFragment object) {
			return createConsiderIgnoreFragmentAdapter();
		}

		@Override
		public Adapter caseContinuation(Continuation object) {
			return createContinuationAdapter();
		}

		@Override
		public Adapter caseInteractionUse(InteractionUse object) {
			return createInteractionUseAdapter();
		}

		@Override
		public Adapter caseModalMessage(ModalMessage object) {
			return createModalMessageAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseTimeCondition(TimeCondition object) {
			return createTimeConditionAdapter();
		}

		@Override
		public Adapter caseSpecificationPart(SpecificationPart object) {
			return createSpecificationPartAdapter();
		}

		@Override
		public Adapter caseEncapsulatedClassifier(EncapsulatedClassifier object) {
			return createEncapsulatedClassifierAdapter();
		}

		@Override
		public Adapter caseInteractionOperand(InteractionOperand object) {
			return createInteractionOperandAdapter();
		}

		@Override
		public Adapter caseCombinedFragment(CombinedFragment object) {
			return createCombinedFragmentAdapter();
		}

		@Override
		public Adapter caseInteractionConstraint(InteractionConstraint object) {
			return createInteractionConstraintAdapter();
		}

		@Override
		public Adapter caseExecutionSpecification(ExecutionSpecification object) {
			return createExecutionSpecificationAdapter();
		}

		@Override
		public Adapter caseGate(Gate object) {
			return createGateAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter casePartDecomposition(PartDecomposition object) {
			return createPartDecompositionAdapter();
		}

		@Override
		public Adapter caseClockReset(ClockReset object) {
			return createClockResetAdapter();
		}

		@Override
		public Adapter caseMSDSpecification(MSDSpecification object) {
			return createMSDSpecificationAdapter();
		}

		@Override
		public Adapter caseEnvironmentAssumption(EnvironmentAssumption object) {
			return createEnvironmentAssumptionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Collaboration
	 * @generated
	 */
	public Adapter createCollaborationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.StructuredClassifier <em>Structured Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.StructuredClassifier
	 * @generated
	 */
	public Adapter createStructuredClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.BehavioredClassifier <em>Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.BehavioredClassifier
	 * @generated
	 */
	public Adapter createBehavioredClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Lifeline
	 * @generated
	 */
	public Adapter createLifelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.InteractionFragment
	 * @generated
	 */
	public Adapter createInteractionFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.ConnectableElement <em>Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.ConnectableElement
	 * @generated
	 */
	public Adapter createConnectableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.MessageEnd
	 * @generated
	 */
	public Adapter createMessageEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.MessageOccurrenceSpecification <em>Message Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.MessageOccurrenceSpecification
	 * @generated
	 */
	public Adapter createMessageOccurrenceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.OccurrenceSpecification <em>Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.OccurrenceSpecification
	 * @generated
	 */
	public Adapter createOccurrenceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.StateInvariant <em>State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.StateInvariant
	 * @generated
	 */
	public Adapter createStateInvariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.OpaqueExpression
	 * @generated
	 */
	public Adapter createOpaqueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.RedefinableElement
	 * @generated
	 */
	public Adapter createRedefinableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.ConnectorEnd <em>Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.ConnectorEnd
	 * @generated
	 */
	public Adapter createConnectorEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.CallEvent <em>Call Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.CallEvent
	 * @generated
	 */
	public Adapter createCallEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.MessageEvent
	 * @generated
	 */
	public Adapter createMessageEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.BehavioralFeature
	 * @generated
	 */
	public Adapter createBehavioralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.DestructionOccurenceSpecification <em>Destruction Occurence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.DestructionOccurenceSpecification
	 * @generated
	 */
	public Adapter createDestructionOccurenceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.GeneralOrdering <em>General Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.GeneralOrdering
	 * @generated
	 */
	public Adapter createGeneralOrderingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.ExecutionOccurrenceSpecification <em>Execution Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.ExecutionOccurrenceSpecification
	 * @generated
	 */
	public Adapter createExecutionOccurrenceSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.ActionExecutionSpecification <em>Action Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.ActionExecutionSpecification
	 * @generated
	 */
	public Adapter createActionExecutionSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.BehaviorExecutionSpecification <em>Behavior Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.BehaviorExecutionSpecification
	 * @generated
	 */
	public Adapter createBehaviorExecutionSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.ConsiderIgnoreFragment <em>Consider Ignore Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.ConsiderIgnoreFragment
	 * @generated
	 */
	public Adapter createConsiderIgnoreFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Continuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Continuation
	 * @generated
	 */
	public Adapter createContinuationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.InteractionUse <em>Interaction Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.InteractionUse
	 * @generated
	 */
	public Adapter createInteractionUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.ModalMessage <em>Modal Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.ModalMessage
	 * @generated
	 */
	public Adapter createModalMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.TimeCondition <em>Time Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.TimeCondition
	 * @generated
	 */
	public Adapter createTimeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.SpecificationPart <em>Specification Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.SpecificationPart
	 * @generated
	 */
	public Adapter createSpecificationPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.EncapsulatedClassifier <em>Encapsulated Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.EncapsulatedClassifier
	 * @generated
	 */
	public Adapter createEncapsulatedClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.InteractionOperand <em>Interaction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.InteractionOperand
	 * @generated
	 */
	public Adapter createInteractionOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.CombinedFragment
	 * @generated
	 */
	public Adapter createCombinedFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.InteractionConstraint <em>Interaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.InteractionConstraint
	 * @generated
	 */
	public Adapter createInteractionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.ExecutionSpecification <em>Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.ExecutionSpecification
	 * @generated
	 */
	public Adapter createExecutionSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.PartDecomposition <em>Part Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.PartDecomposition
	 * @generated
	 */
	public Adapter createPartDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.ClockReset <em>Clock Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.ClockReset
	 * @generated
	 */
	public Adapter createClockResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.MSDSpecification <em>MSD Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.MSDSpecification
	 * @generated
	 */
	public Adapter createMSDSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ModalSequenceDiagram.EnvironmentAssumption <em>Environment Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ModalSequenceDiagram.EnvironmentAssumption
	 * @generated
	 */
	public Adapter createEnvironmentAssumptionAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModalSequenceDiagramAdapterFactory
