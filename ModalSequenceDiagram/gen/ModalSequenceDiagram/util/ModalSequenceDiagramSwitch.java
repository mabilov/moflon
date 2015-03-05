/**
 */
package ModalSequenceDiagram.util;

import ModalSequenceDiagram.Behavior;
import ModalSequenceDiagram.BehavioralFeature;
import ModalSequenceDiagram.BehavioredClassifier;
import ModalSequenceDiagram.CallEvent;
import ModalSequenceDiagram.Classifier;
import ModalSequenceDiagram.Collaboration;
import ModalSequenceDiagram.ConnectableElement;
import ModalSequenceDiagram.Connector;
import ModalSequenceDiagram.ConnectorEnd;
import ModalSequenceDiagram.Constraint;
import ModalSequenceDiagram.EncapsulatedClassifier;
import ModalSequenceDiagram.Event;
import ModalSequenceDiagram.Feature;
import ModalSequenceDiagram.Interaction;
import ModalSequenceDiagram.InteractionFragment;
import ModalSequenceDiagram.Lifeline;
import ModalSequenceDiagram.Message;
import ModalSequenceDiagram.MessageEnd;
import ModalSequenceDiagram.MessageEvent;
import ModalSequenceDiagram.MessageOccurrenceSpecification;
import ModalSequenceDiagram.ModalSequenceDiagramPackage;
import ModalSequenceDiagram.Model;
import ModalSequenceDiagram.NamedElement;
import ModalSequenceDiagram.OccurrenceSpecification;
import ModalSequenceDiagram.OpaqueExpression;
import ModalSequenceDiagram.Operation;
import ModalSequenceDiagram.PackageableElement;
import ModalSequenceDiagram.Property;
import ModalSequenceDiagram.RedefinableElement;
import ModalSequenceDiagram.StateInvariant;
import ModalSequenceDiagram.StructuredClassifier;
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
