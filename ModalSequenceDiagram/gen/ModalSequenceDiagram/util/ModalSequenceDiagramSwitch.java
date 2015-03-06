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
 * @see ModalSequenceDiagram.ModalSequenceDiagramPackage
 * @generated
 */
public class ModalSequenceDiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModalSequenceDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalSequenceDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = ModalSequenceDiagramPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ModalSequenceDiagramPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = casePackage(model);
			if (result == null)
				result = casePackageableElement(model);
			if (result == null)
				result = caseNamedElement(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.PACKAGE: {
			ModalSequenceDiagram.Package package_ = (ModalSequenceDiagram.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = casePackageableElement(package_);
			if (result == null)
				result = caseNamedElement(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.PACKAGEABLE_ELEMENT: {
			PackageableElement packageableElement = (PackageableElement) theEObject;
			T result = casePackageableElement(packageableElement);
			if (result == null)
				result = caseNamedElement(packageableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.COLLABORATION: {
			Collaboration collaboration = (Collaboration) theEObject;
			T result = caseCollaboration(collaboration);
			if (result == null)
				result = caseStructuredClassifier(collaboration);
			if (result == null)
				result = caseBehavioredClassifier(collaboration);
			if (result == null)
				result = caseClassifier(collaboration);
			if (result == null)
				result = caseType(collaboration);
			if (result == null)
				result = casePackageableElement(collaboration);
			if (result == null)
				result = caseNamedElement(collaboration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.STRUCTURED_CLASSIFIER: {
			StructuredClassifier structuredClassifier = (StructuredClassifier) theEObject;
			T result = caseStructuredClassifier(structuredClassifier);
			if (result == null)
				result = caseClassifier(structuredClassifier);
			if (result == null)
				result = caseType(structuredClassifier);
			if (result == null)
				result = casePackageableElement(structuredClassifier);
			if (result == null)
				result = caseNamedElement(structuredClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.BEHAVIORED_CLASSIFIER: {
			BehavioredClassifier behavioredClassifier = (BehavioredClassifier) theEObject;
			T result = caseBehavioredClassifier(behavioredClassifier);
			if (result == null)
				result = caseClassifier(behavioredClassifier);
			if (result == null)
				result = caseType(behavioredClassifier);
			if (result == null)
				result = casePackageableElement(behavioredClassifier);
			if (result == null)
				result = caseNamedElement(behavioredClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.CLASSIFIER: {
			Classifier classifier = (Classifier) theEObject;
			T result = caseClassifier(classifier);
			if (result == null)
				result = caseType(classifier);
			if (result == null)
				result = casePackageableElement(classifier);
			if (result == null)
				result = caseNamedElement(classifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = casePackageableElement(type);
			if (result == null)
				result = caseNamedElement(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.INTERACTION: {
			Interaction interaction = (Interaction) theEObject;
			T result = caseInteraction(interaction);
			if (result == null)
				result = caseBehavior(interaction);
			if (result == null)
				result = caseInteractionFragment(interaction);
			if (result == null)
				result = caseClass(interaction);
			if (result == null)
				result = caseBehavioredClassifier(interaction);
			if (result == null)
				result = caseEncapsulatedClassifier(interaction);
			if (result == null)
				result = caseStructuredClassifier(interaction);
			if (result == null)
				result = caseClassifier(interaction);
			if (result == null)
				result = caseType(interaction);
			if (result == null)
				result = casePackageableElement(interaction);
			if (result == null)
				result = caseNamedElement(interaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.BEHAVIOR: {
			Behavior behavior = (Behavior) theEObject;
			T result = caseBehavior(behavior);
			if (result == null)
				result = caseClass(behavior);
			if (result == null)
				result = caseBehavioredClassifier(behavior);
			if (result == null)
				result = caseEncapsulatedClassifier(behavior);
			if (result == null)
				result = caseStructuredClassifier(behavior);
			if (result == null)
				result = caseClassifier(behavior);
			if (result == null)
				result = caseType(behavior);
			if (result == null)
				result = casePackageableElement(behavior);
			if (result == null)
				result = caseNamedElement(behavior);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.CONNECTOR: {
			Connector connector = (Connector) theEObject;
			T result = caseConnector(connector);
			if (result == null)
				result = caseFeature(connector);
			if (result == null)
				result = caseRedefinableElement(connector);
			if (result == null)
				result = caseNamedElement(connector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.LIFELINE: {
			Lifeline lifeline = (Lifeline) theEObject;
			T result = caseLifeline(lifeline);
			if (result == null)
				result = caseNamedElement(lifeline);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.INTERACTION_FRAGMENT: {
			InteractionFragment interactionFragment = (InteractionFragment) theEObject;
			T result = caseInteractionFragment(interactionFragment);
			if (result == null)
				result = caseNamedElement(interactionFragment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.CONNECTABLE_ELEMENT: {
			ConnectableElement connectableElement = (ConnectableElement) theEObject;
			T result = caseConnectableElement(connectableElement);
			if (result == null)
				result = caseTypedElement(connectableElement);
			if (result == null)
				result = caseNamedElement(connectableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = caseConnectableElement(property);
			if (result == null)
				result = caseTypedElement(property);
			if (result == null)
				result = caseNamedElement(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.MESSAGE: {
			Message message = (Message) theEObject;
			T result = caseMessage(message);
			if (result == null)
				result = caseNamedElement(message);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.MESSAGE_END: {
			MessageEnd messageEnd = (MessageEnd) theEObject;
			T result = caseMessageEnd(messageEnd);
			if (result == null)
				result = caseNamedElement(messageEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.MESSAGE_OCCURRENCE_SPECIFICATION: {
			MessageOccurrenceSpecification messageOccurrenceSpecification = (MessageOccurrenceSpecification) theEObject;
			T result = caseMessageOccurrenceSpecification(messageOccurrenceSpecification);
			if (result == null)
				result = caseMessageEnd(messageOccurrenceSpecification);
			if (result == null)
				result = caseOccurrenceSpecification(messageOccurrenceSpecification);
			if (result == null)
				result = caseInteractionFragment(messageOccurrenceSpecification);
			if (result == null)
				result = caseNamedElement(messageOccurrenceSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.OCCURRENCE_SPECIFICATION: {
			OccurrenceSpecification occurrenceSpecification = (OccurrenceSpecification) theEObject;
			T result = caseOccurrenceSpecification(occurrenceSpecification);
			if (result == null)
				result = caseInteractionFragment(occurrenceSpecification);
			if (result == null)
				result = caseNamedElement(occurrenceSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.STATE_INVARIANT: {
			StateInvariant stateInvariant = (StateInvariant) theEObject;
			T result = caseStateInvariant(stateInvariant);
			if (result == null)
				result = caseInteractionFragment(stateInvariant);
			if (result == null)
				result = caseNamedElement(stateInvariant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = casePackageableElement(constraint);
			if (result == null)
				result = caseNamedElement(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.VALUE_SPECIFICATION: {
			ValueSpecification valueSpecification = (ValueSpecification) theEObject;
			T result = caseValueSpecification(valueSpecification);
			if (result == null)
				result = casePackageableElement(valueSpecification);
			if (result == null)
				result = caseNamedElement(valueSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.OPAQUE_EXPRESSION: {
			OpaqueExpression opaqueExpression = (OpaqueExpression) theEObject;
			T result = caseOpaqueExpression(opaqueExpression);
			if (result == null)
				result = caseValueSpecification(opaqueExpression);
			if (result == null)
				result = casePackageableElement(opaqueExpression);
			if (result == null)
				result = caseNamedElement(opaqueExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.TYPED_ELEMENT: {
			TypedElement typedElement = (TypedElement) theEObject;
			T result = caseTypedElement(typedElement);
			if (result == null)
				result = caseNamedElement(typedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.REDEFINABLE_ELEMENT: {
			RedefinableElement redefinableElement = (RedefinableElement) theEObject;
			T result = caseRedefinableElement(redefinableElement);
			if (result == null)
				result = caseNamedElement(redefinableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.FEATURE: {
			Feature feature = (Feature) theEObject;
			T result = caseFeature(feature);
			if (result == null)
				result = caseRedefinableElement(feature);
			if (result == null)
				result = caseNamedElement(feature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.CONNECTOR_END: {
			ConnectorEnd connectorEnd = (ConnectorEnd) theEObject;
			T result = caseConnectorEnd(connectorEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.CALL_EVENT: {
			CallEvent callEvent = (CallEvent) theEObject;
			T result = caseCallEvent(callEvent);
			if (result == null)
				result = caseMessageEvent(callEvent);
			if (result == null)
				result = caseEvent(callEvent);
			if (result == null)
				result = casePackageableElement(callEvent);
			if (result == null)
				result = caseNamedElement(callEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = caseBehavioralFeature(operation);
			if (result == null)
				result = caseFeature(operation);
			if (result == null)
				result = caseRedefinableElement(operation);
			if (result == null)
				result = caseNamedElement(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.MESSAGE_EVENT: {
			MessageEvent messageEvent = (MessageEvent) theEObject;
			T result = caseMessageEvent(messageEvent);
			if (result == null)
				result = caseEvent(messageEvent);
			if (result == null)
				result = casePackageableElement(messageEvent);
			if (result == null)
				result = caseNamedElement(messageEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = casePackageableElement(event);
			if (result == null)
				result = caseNamedElement(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.CLASS: {
			ModalSequenceDiagram.Class class_ = (ModalSequenceDiagram.Class) theEObject;
			T result = caseClass(class_);
			if (result == null)
				result = caseBehavioredClassifier(class_);
			if (result == null)
				result = caseEncapsulatedClassifier(class_);
			if (result == null)
				result = caseStructuredClassifier(class_);
			if (result == null)
				result = caseClassifier(class_);
			if (result == null)
				result = caseType(class_);
			if (result == null)
				result = casePackageableElement(class_);
			if (result == null)
				result = caseNamedElement(class_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.BEHAVIORAL_FEATURE: {
			BehavioralFeature behavioralFeature = (BehavioralFeature) theEObject;
			T result = caseBehavioralFeature(behavioralFeature);
			if (result == null)
				result = caseFeature(behavioralFeature);
			if (result == null)
				result = caseRedefinableElement(behavioralFeature);
			if (result == null)
				result = caseNamedElement(behavioralFeature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.DESTRUCTION_OCCURENCE_SPECIFICATION: {
			DestructionOccurenceSpecification destructionOccurenceSpecification = (DestructionOccurenceSpecification) theEObject;
			T result = caseDestructionOccurenceSpecification(destructionOccurenceSpecification);
			if (result == null)
				result = caseMessageOccurrenceSpecification(destructionOccurenceSpecification);
			if (result == null)
				result = caseMessageEnd(destructionOccurenceSpecification);
			if (result == null)
				result = caseOccurrenceSpecification(destructionOccurenceSpecification);
			if (result == null)
				result = caseInteractionFragment(destructionOccurenceSpecification);
			if (result == null)
				result = caseNamedElement(destructionOccurenceSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.GENERAL_ORDERING: {
			GeneralOrdering generalOrdering = (GeneralOrdering) theEObject;
			T result = caseGeneralOrdering(generalOrdering);
			if (result == null)
				result = caseNamedElement(generalOrdering);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.EXECUTION_OCCURRENCE_SPECIFICATION: {
			ExecutionOccurrenceSpecification executionOccurrenceSpecification = (ExecutionOccurrenceSpecification) theEObject;
			T result = caseExecutionOccurrenceSpecification(executionOccurrenceSpecification);
			if (result == null)
				result = caseOccurrenceSpecification(executionOccurrenceSpecification);
			if (result == null)
				result = caseInteractionFragment(executionOccurrenceSpecification);
			if (result == null)
				result = caseNamedElement(executionOccurrenceSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.ACTION_EXECUTION_SPECIFICATION: {
			ActionExecutionSpecification actionExecutionSpecification = (ActionExecutionSpecification) theEObject;
			T result = caseActionExecutionSpecification(actionExecutionSpecification);
			if (result == null)
				result = caseExecutionSpecification(actionExecutionSpecification);
			if (result == null)
				result = caseInteractionFragment(actionExecutionSpecification);
			if (result == null)
				result = caseNamedElement(actionExecutionSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.BEHAVIOR_EXECUTION_SPECIFICATION: {
			BehaviorExecutionSpecification behaviorExecutionSpecification = (BehaviorExecutionSpecification) theEObject;
			T result = caseBehaviorExecutionSpecification(behaviorExecutionSpecification);
			if (result == null)
				result = caseExecutionSpecification(behaviorExecutionSpecification);
			if (result == null)
				result = caseInteractionFragment(behaviorExecutionSpecification);
			if (result == null)
				result = caseNamedElement(behaviorExecutionSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.NAMESPACE: {
			Namespace namespace = (Namespace) theEObject;
			T result = caseNamespace(namespace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.CONSIDER_IGNORE_FRAGMENT: {
			ConsiderIgnoreFragment considerIgnoreFragment = (ConsiderIgnoreFragment) theEObject;
			T result = caseConsiderIgnoreFragment(considerIgnoreFragment);
			if (result == null)
				result = caseCombinedFragment(considerIgnoreFragment);
			if (result == null)
				result = caseInteractionFragment(considerIgnoreFragment);
			if (result == null)
				result = caseNamedElement(considerIgnoreFragment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.CONTINUATION: {
			Continuation continuation = (Continuation) theEObject;
			T result = caseContinuation(continuation);
			if (result == null)
				result = caseInteractionFragment(continuation);
			if (result == null)
				result = caseNamedElement(continuation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.INTERACTION_USE: {
			InteractionUse interactionUse = (InteractionUse) theEObject;
			T result = caseInteractionUse(interactionUse);
			if (result == null)
				result = caseInteractionFragment(interactionUse);
			if (result == null)
				result = caseNamedElement(interactionUse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.MODAL_MESSAGE: {
			ModalMessage modalMessage = (ModalMessage) theEObject;
			T result = caseModalMessage(modalMessage);
			if (result == null)
				result = caseMessage(modalMessage);
			if (result == null)
				result = caseNamedElement(modalMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = caseStateInvariant(condition);
			if (result == null)
				result = caseInteractionFragment(condition);
			if (result == null)
				result = caseNamedElement(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.TIME_CONDITION: {
			TimeCondition timeCondition = (TimeCondition) theEObject;
			T result = caseTimeCondition(timeCondition);
			if (result == null)
				result = caseCondition(timeCondition);
			if (result == null)
				result = caseStateInvariant(timeCondition);
			if (result == null)
				result = caseInteractionFragment(timeCondition);
			if (result == null)
				result = caseNamedElement(timeCondition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.SPECIFICATION_PART: {
			SpecificationPart specificationPart = (SpecificationPart) theEObject;
			T result = caseSpecificationPart(specificationPart);
			if (result == null)
				result = caseProperty(specificationPart);
			if (result == null)
				result = caseConnectableElement(specificationPart);
			if (result == null)
				result = caseTypedElement(specificationPart);
			if (result == null)
				result = caseNamedElement(specificationPart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.ENCAPSULATED_CLASSIFIER: {
			EncapsulatedClassifier encapsulatedClassifier = (EncapsulatedClassifier) theEObject;
			T result = caseEncapsulatedClassifier(encapsulatedClassifier);
			if (result == null)
				result = caseStructuredClassifier(encapsulatedClassifier);
			if (result == null)
				result = caseClassifier(encapsulatedClassifier);
			if (result == null)
				result = caseType(encapsulatedClassifier);
			if (result == null)
				result = casePackageableElement(encapsulatedClassifier);
			if (result == null)
				result = caseNamedElement(encapsulatedClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.INTERACTION_OPERAND: {
			InteractionOperand interactionOperand = (InteractionOperand) theEObject;
			T result = caseInteractionOperand(interactionOperand);
			if (result == null)
				result = caseInteractionFragment(interactionOperand);
			if (result == null)
				result = caseNamespace(interactionOperand);
			if (result == null)
				result = caseNamedElement(interactionOperand);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.COMBINED_FRAGMENT: {
			CombinedFragment combinedFragment = (CombinedFragment) theEObject;
			T result = caseCombinedFragment(combinedFragment);
			if (result == null)
				result = caseInteractionFragment(combinedFragment);
			if (result == null)
				result = caseNamedElement(combinedFragment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.INTERACTION_CONSTRAINT: {
			InteractionConstraint interactionConstraint = (InteractionConstraint) theEObject;
			T result = caseInteractionConstraint(interactionConstraint);
			if (result == null)
				result = caseConstraint(interactionConstraint);
			if (result == null)
				result = casePackageableElement(interactionConstraint);
			if (result == null)
				result = caseNamedElement(interactionConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.EXECUTION_SPECIFICATION: {
			ExecutionSpecification executionSpecification = (ExecutionSpecification) theEObject;
			T result = caseExecutionSpecification(executionSpecification);
			if (result == null)
				result = caseInteractionFragment(executionSpecification);
			if (result == null)
				result = caseNamedElement(executionSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.GATE: {
			Gate gate = (Gate) theEObject;
			T result = caseGate(gate);
			if (result == null)
				result = caseMessageEnd(gate);
			if (result == null)
				result = caseNamedElement(gate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.PART_DECOMPOSITION: {
			PartDecomposition partDecomposition = (PartDecomposition) theEObject;
			T result = casePartDecomposition(partDecomposition);
			if (result == null)
				result = caseInteractionUse(partDecomposition);
			if (result == null)
				result = caseInteractionFragment(partDecomposition);
			if (result == null)
				result = caseNamedElement(partDecomposition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.CLOCK_RESET: {
			ClockReset clockReset = (ClockReset) theEObject;
			T result = caseClockReset(clockReset);
			if (result == null)
				result = caseStateInvariant(clockReset);
			if (result == null)
				result = caseInteractionFragment(clockReset);
			if (result == null)
				result = caseNamedElement(clockReset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.MSD_SPECIFICATION: {
			MSDSpecification msdSpecification = (MSDSpecification) theEObject;
			T result = caseMSDSpecification(msdSpecification);
			if (result == null)
				result = casePackage(msdSpecification);
			if (result == null)
				result = casePackageableElement(msdSpecification);
			if (result == null)
				result = caseNamedElement(msdSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModalSequenceDiagramPackage.ENVIRONMENT_ASSUMPTION: {
			EnvironmentAssumption environmentAssumption = (EnvironmentAssumption) theEObject;
			T result = caseEnvironmentAssumption(environmentAssumption);
			if (result == null)
				result = caseInteraction(environmentAssumption);
			if (result == null)
				result = caseBehavior(environmentAssumption);
			if (result == null)
				result = caseInteractionFragment(environmentAssumption);
			if (result == null)
				result = caseClass(environmentAssumption);
			if (result == null)
				result = caseBehavioredClassifier(environmentAssumption);
			if (result == null)
				result = caseEncapsulatedClassifier(environmentAssumption);
			if (result == null)
				result = caseStructuredClassifier(environmentAssumption);
			if (result == null)
				result = caseClassifier(environmentAssumption);
			if (result == null)
				result = caseType(environmentAssumption);
			if (result == null)
				result = casePackageableElement(environmentAssumption);
			if (result == null)
				result = caseNamedElement(environmentAssumption);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(ModalSequenceDiagram.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaboration(Collaboration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredClassifier(StructuredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioredClassifier(BehavioredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
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
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeline(Lifeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFragment(InteractionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElement(ConnectableElement object) {
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
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEnd(MessageEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageOccurrenceSpecification(
			MessageOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrenceSpecification(OccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateInvariant(StateInvariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueExpression(OpaqueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableElement(RedefinableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEnd(ConnectorEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallEvent(CallEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEvent(MessageEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(ModalSequenceDiagram.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralFeature(BehavioralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destruction Occurence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destruction Occurence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestructionOccurenceSpecification(
			DestructionOccurenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralOrdering(GeneralOrdering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionOccurrenceSpecification(
			ExecutionOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionExecutionSpecification(
			ActionExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorExecutionSpecification(
			BehaviorExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consider Ignore Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsiderIgnoreFragment(ConsiderIgnoreFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuation(Continuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionUse(InteractionUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModalMessage(ModalMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeCondition(TimeCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificationPart(SpecificationPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedClassifier(EncapsulatedClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOperand(InteractionOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedFragment(CombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionConstraint(InteractionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionSpecification(ExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartDecomposition(PartDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockReset(ClockReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSD Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSD Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSDSpecification(MSDSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentAssumption(EnvironmentAssumption object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ModalSequenceDiagramSwitch
