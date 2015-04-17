/**
 */
package bpmn2.util;

import bpmn2.Activity;
import bpmn2.BaseElement;
import bpmn2.Bpmn2Package;
import bpmn2.CallableElement;
import bpmn2.CatchEvent;
import bpmn2.Definitions;
import bpmn2.DocumentRoot;
import bpmn2.EndEvent;
import bpmn2.Event;
import bpmn2.EventBasedGateway;
import bpmn2.ExclusiveGateway;
import bpmn2.Expression;
import bpmn2.FlowElement;
import bpmn2.FlowElementsContainer;
import bpmn2.FlowNode;
import bpmn2.FormalExpression;
import bpmn2.Gateway;
import bpmn2.InteractionNode;
import bpmn2.IntermediateCatchEvent;
import bpmn2.IntermediateThrowEvent;
import bpmn2.Lane;
import bpmn2.LaneSet;
import bpmn2.ManualTask;
import bpmn2.ParallelGateway;
import bpmn2.RootElement;
import bpmn2.SequenceFlow;
import bpmn2.ServiceTask;
import bpmn2.StartEvent;
import bpmn2.Task;
import bpmn2.ThrowEvent;
import bpmn2.UserTask;

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
 * @see bpmn2.Bpmn2Package
 * @generated
 */
public class Bpmn2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Bpmn2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2Switch() {
		if (modelPackage == null) {
			modelPackage = Bpmn2Package.eINSTANCE;
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
		case Bpmn2Package.BASE_ELEMENT: {
			BaseElement baseElement = (BaseElement) theEObject;
			T result = caseBaseElement(baseElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.ROOT_ELEMENT: {
			RootElement rootElement = (RootElement) theEObject;
			T result = caseRootElement(rootElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.FLOW_ELEMENT: {
			FlowElement flowElement = (FlowElement) theEObject;
			T result = caseFlowElement(flowElement);
			if (result == null)
				result = caseBaseElement(flowElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.FLOW_NODE: {
			FlowNode flowNode = (FlowNode) theEObject;
			T result = caseFlowNode(flowNode);
			if (result == null)
				result = caseFlowElement(flowNode);
			if (result == null)
				result = caseBaseElement(flowNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.SEQUENCE_FLOW: {
			SequenceFlow sequenceFlow = (SequenceFlow) theEObject;
			T result = caseSequenceFlow(sequenceFlow);
			if (result == null)
				result = caseFlowElement(sequenceFlow);
			if (result == null)
				result = caseBaseElement(sequenceFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = caseFlowNode(activity);
			if (result == null)
				result = caseFlowElement(activity);
			if (result == null)
				result = caseBaseElement(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.CALLABLE_ELEMENT: {
			CallableElement callableElement = (CallableElement) theEObject;
			T result = caseCallableElement(callableElement);
			if (result == null)
				result = caseRootElement(callableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.CATCH_EVENT: {
			CatchEvent catchEvent = (CatchEvent) theEObject;
			T result = caseCatchEvent(catchEvent);
			if (result == null)
				result = caseEvent(catchEvent);
			if (result == null)
				result = caseFlowNode(catchEvent);
			if (result == null)
				result = caseInteractionNode(catchEvent);
			if (result == null)
				result = caseFlowElement(catchEvent);
			if (result == null)
				result = caseBaseElement(catchEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.DEFINITIONS: {
			Definitions definitions = (Definitions) theEObject;
			T result = caseDefinitions(definitions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.END_EVENT: {
			EndEvent endEvent = (EndEvent) theEObject;
			T result = caseEndEvent(endEvent);
			if (result == null)
				result = caseThrowEvent(endEvent);
			if (result == null)
				result = caseEvent(endEvent);
			if (result == null)
				result = caseFlowNode(endEvent);
			if (result == null)
				result = caseInteractionNode(endEvent);
			if (result == null)
				result = caseFlowElement(endEvent);
			if (result == null)
				result = caseBaseElement(endEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.EVENT_BASED_GATEWAY: {
			EventBasedGateway eventBasedGateway = (EventBasedGateway) theEObject;
			T result = caseEventBasedGateway(eventBasedGateway);
			if (result == null)
				result = caseGateway(eventBasedGateway);
			if (result == null)
				result = caseFlowNode(eventBasedGateway);
			if (result == null)
				result = caseFlowElement(eventBasedGateway);
			if (result == null)
				result = caseBaseElement(eventBasedGateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.EXCLUSIVE_GATEWAY: {
			ExclusiveGateway exclusiveGateway = (ExclusiveGateway) theEObject;
			T result = caseExclusiveGateway(exclusiveGateway);
			if (result == null)
				result = caseGateway(exclusiveGateway);
			if (result == null)
				result = caseFlowNode(exclusiveGateway);
			if (result == null)
				result = caseFlowElement(exclusiveGateway);
			if (result == null)
				result = caseBaseElement(exclusiveGateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseBaseElement(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.FLOW_ELEMENTS_CONTAINER: {
			FlowElementsContainer flowElementsContainer = (FlowElementsContainer) theEObject;
			T result = caseFlowElementsContainer(flowElementsContainer);
			if (result == null)
				result = caseBaseElement(flowElementsContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.FORMAL_EXPRESSION: {
			FormalExpression formalExpression = (FormalExpression) theEObject;
			T result = caseFormalExpression(formalExpression);
			if (result == null)
				result = caseExpression(formalExpression);
			if (result == null)
				result = caseBaseElement(formalExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.GATEWAY: {
			Gateway gateway = (Gateway) theEObject;
			T result = caseGateway(gateway);
			if (result == null)
				result = caseFlowNode(gateway);
			if (result == null)
				result = caseFlowElement(gateway);
			if (result == null)
				result = caseBaseElement(gateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.INTERACTION_NODE: {
			InteractionNode interactionNode = (InteractionNode) theEObject;
			T result = caseInteractionNode(interactionNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.INTERMEDIATE_CATCH_EVENT: {
			IntermediateCatchEvent intermediateCatchEvent = (IntermediateCatchEvent) theEObject;
			T result = caseIntermediateCatchEvent(intermediateCatchEvent);
			if (result == null)
				result = caseCatchEvent(intermediateCatchEvent);
			if (result == null)
				result = caseEvent(intermediateCatchEvent);
			if (result == null)
				result = caseFlowNode(intermediateCatchEvent);
			if (result == null)
				result = caseInteractionNode(intermediateCatchEvent);
			if (result == null)
				result = caseFlowElement(intermediateCatchEvent);
			if (result == null)
				result = caseBaseElement(intermediateCatchEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.INTERMEDIATE_THROW_EVENT: {
			IntermediateThrowEvent intermediateThrowEvent = (IntermediateThrowEvent) theEObject;
			T result = caseIntermediateThrowEvent(intermediateThrowEvent);
			if (result == null)
				result = caseThrowEvent(intermediateThrowEvent);
			if (result == null)
				result = caseEvent(intermediateThrowEvent);
			if (result == null)
				result = caseFlowNode(intermediateThrowEvent);
			if (result == null)
				result = caseInteractionNode(intermediateThrowEvent);
			if (result == null)
				result = caseFlowElement(intermediateThrowEvent);
			if (result == null)
				result = caseBaseElement(intermediateThrowEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.LANE: {
			Lane lane = (Lane) theEObject;
			T result = caseLane(lane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.LANE_SET: {
			LaneSet laneSet = (LaneSet) theEObject;
			T result = caseLaneSet(laneSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.MANUAL_TASK: {
			ManualTask manualTask = (ManualTask) theEObject;
			T result = caseManualTask(manualTask);
			if (result == null)
				result = caseTask(manualTask);
			if (result == null)
				result = caseActivity(manualTask);
			if (result == null)
				result = caseInteractionNode(manualTask);
			if (result == null)
				result = caseFlowNode(manualTask);
			if (result == null)
				result = caseFlowElement(manualTask);
			if (result == null)
				result = caseBaseElement(manualTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.PARALLEL_GATEWAY: {
			ParallelGateway parallelGateway = (ParallelGateway) theEObject;
			T result = caseParallelGateway(parallelGateway);
			if (result == null)
				result = caseGateway(parallelGateway);
			if (result == null)
				result = caseFlowNode(parallelGateway);
			if (result == null)
				result = caseFlowElement(parallelGateway);
			if (result == null)
				result = caseBaseElement(parallelGateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.PROCESS: {
			bpmn2.Process process = (bpmn2.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = caseCallableElement(process);
			if (result == null)
				result = caseFlowElementsContainer(process);
			if (result == null)
				result = caseRootElement(process);
			if (result == null)
				result = caseBaseElement(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.SERVICE_TASK: {
			ServiceTask serviceTask = (ServiceTask) theEObject;
			T result = caseServiceTask(serviceTask);
			if (result == null)
				result = caseTask(serviceTask);
			if (result == null)
				result = caseActivity(serviceTask);
			if (result == null)
				result = caseInteractionNode(serviceTask);
			if (result == null)
				result = caseFlowNode(serviceTask);
			if (result == null)
				result = caseFlowElement(serviceTask);
			if (result == null)
				result = caseBaseElement(serviceTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.START_EVENT: {
			StartEvent startEvent = (StartEvent) theEObject;
			T result = caseStartEvent(startEvent);
			if (result == null)
				result = caseCatchEvent(startEvent);
			if (result == null)
				result = caseEvent(startEvent);
			if (result == null)
				result = caseFlowNode(startEvent);
			if (result == null)
				result = caseInteractionNode(startEvent);
			if (result == null)
				result = caseFlowElement(startEvent);
			if (result == null)
				result = caseBaseElement(startEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = caseActivity(task);
			if (result == null)
				result = caseInteractionNode(task);
			if (result == null)
				result = caseFlowNode(task);
			if (result == null)
				result = caseFlowElement(task);
			if (result == null)
				result = caseBaseElement(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseFlowNode(event);
			if (result == null)
				result = caseInteractionNode(event);
			if (result == null)
				result = caseFlowElement(event);
			if (result == null)
				result = caseBaseElement(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.THROW_EVENT: {
			ThrowEvent throwEvent = (ThrowEvent) theEObject;
			T result = caseThrowEvent(throwEvent);
			if (result == null)
				result = caseEvent(throwEvent);
			if (result == null)
				result = caseFlowNode(throwEvent);
			if (result == null)
				result = caseInteractionNode(throwEvent);
			if (result == null)
				result = caseFlowElement(throwEvent);
			if (result == null)
				result = caseBaseElement(throwEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Bpmn2Package.USER_TASK: {
			UserTask userTask = (UserTask) theEObject;
			T result = caseUserTask(userTask);
			if (result == null)
				result = caseTask(userTask);
			if (result == null)
				result = caseActivity(userTask);
			if (result == null)
				result = caseInteractionNode(userTask);
			if (result == null)
				result = caseFlowNode(userTask);
			if (result == null)
				result = caseFlowElement(userTask);
			if (result == null)
				result = caseBaseElement(userTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseElement(BaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootElement(RootElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowElement(FlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNode(FlowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceFlow(SequenceFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallableElement(CallableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchEvent(CatchEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitions(Definitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndEvent(EndEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Based Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Based Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBasedGateway(EventBasedGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveGateway(ExclusiveGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Elements Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Elements Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowElementsContainer(FlowElementsContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalExpression(FormalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionNode(InteractionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Catch Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Catch Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateCatchEvent(IntermediateCatchEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Throw Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Throw Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateThrowEvent(IntermediateThrowEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLane(Lane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lane Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lane Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaneSet(LaneSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manual Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manual Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualTask(ManualTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelGateway(ParallelGateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(bpmn2.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTask(ServiceTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEvent(StartEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Throw Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowEvent(ThrowEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTask(UserTask object) {
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

} //Bpmn2Switch
