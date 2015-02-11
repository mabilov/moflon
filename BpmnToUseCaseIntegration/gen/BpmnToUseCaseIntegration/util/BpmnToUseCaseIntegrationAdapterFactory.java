/**
 */
package BpmnToUseCaseIntegration.util;

import BpmnToUseCaseIntegration.*;

import TGGRuntime.AbstractCorrespondence;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BpmnToUseCaseIntegration.BpmnToUseCaseIntegrationPackage
 * @generated
 */
public class BpmnToUseCaseIntegrationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BpmnToUseCaseIntegrationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnToUseCaseIntegrationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BpmnToUseCaseIntegrationPackage.eINSTANCE;
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
	protected BpmnToUseCaseIntegrationSwitch<Adapter> modelSwitch = new BpmnToUseCaseIntegrationSwitch<Adapter>() {
		@Override
		public Adapter caseDocumentRootToUseCasesModel(
				DocumentRootToUseCasesModel object) {
			return createDocumentRootToUseCasesModelAdapter();
		}

		@Override
		public Adapter caseDefinitionsToPackageDeclaration(
				DefinitionsToPackageDeclaration object) {
			return createDefinitionsToPackageDeclarationAdapter();
		}

		@Override
		public Adapter caseProcessToUseCase(ProcessToUseCase object) {
			return createProcessToUseCaseAdapter();
		}

		@Override
		public Adapter caseStartEventToUseCase(StartEventToUseCase object) {
			return createStartEventToUseCaseAdapter();
		}

		@Override
		public Adapter caseStartEventToBasicFlow(StartEventToBasicFlow object) {
			return createStartEventToBasicFlowAdapter();
		}

		@Override
		public Adapter caseSequenceFlowToUCFlow(SequenceFlowToUCFlow object) {
			return createSequenceFlowToUCFlowAdapter();
		}

		@Override
		public Adapter caseProcessToActor(ProcessToActor object) {
			return createProcessToActorAdapter();
		}

		@Override
		public Adapter caseFlowNodeToStep(FlowNodeToStep object) {
			return createFlowNodeToStepAdapter();
		}

		@Override
		public Adapter caseSequenceFlowToStep(SequenceFlowToStep object) {
			return createSequenceFlowToStepAdapter();
		}

		@Override
		public Adapter caseLaneToActor(LaneToActor object) {
			return createLaneToActorAdapter();
		}

		@Override
		public Adapter caseSequenceFlowToAlternativeFlowAlternative(
				SequenceFlowToAlternativeFlowAlternative object) {
			return createSequenceFlowToAlternativeFlowAlternativeAdapter();
		}

		@Override
		public Adapter caseIntermediateCatchEventToAlternativeFlow(
				IntermediateCatchEventToAlternativeFlow object) {
			return createIntermediateCatchEventToAlternativeFlowAdapter();
		}

		@Override
		public Adapter caseEndEventToFlow(EndEventToFlow object) {
			return createEndEventToFlowAdapter();
		}

		@Override
		public Adapter caseAbstractCorrespondence(AbstractCorrespondence object) {
			return createAbstractCorrespondenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.DocumentRootToUseCasesModel <em>Document Root To Use Cases Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.DocumentRootToUseCasesModel
	 * @generated
	 */
	public Adapter createDocumentRootToUseCasesModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration <em>Definitions To Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.DefinitionsToPackageDeclaration
	 * @generated
	 */
	public Adapter createDefinitionsToPackageDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.ProcessToUseCase <em>Process To Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.ProcessToUseCase
	 * @generated
	 */
	public Adapter createProcessToUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.StartEventToUseCase <em>Start Event To Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.StartEventToUseCase
	 * @generated
	 */
	public Adapter createStartEventToUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.StartEventToBasicFlow <em>Start Event To Basic Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.StartEventToBasicFlow
	 * @generated
	 */
	public Adapter createStartEventToBasicFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.SequenceFlowToUCFlow <em>Sequence Flow To UC Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToUCFlow
	 * @generated
	 */
	public Adapter createSequenceFlowToUCFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.ProcessToActor <em>Process To Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.ProcessToActor
	 * @generated
	 */
	public Adapter createProcessToActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.FlowNodeToStep <em>Flow Node To Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.FlowNodeToStep
	 * @generated
	 */
	public Adapter createFlowNodeToStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.SequenceFlowToStep <em>Sequence Flow To Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToStep
	 * @generated
	 */
	public Adapter createSequenceFlowToStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.LaneToActor <em>Lane To Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.LaneToActor
	 * @generated
	 */
	public Adapter createLaneToActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative <em>Sequence Flow To Alternative Flow Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.SequenceFlowToAlternativeFlowAlternative
	 * @generated
	 */
	public Adapter createSequenceFlowToAlternativeFlowAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow <em>Intermediate Catch Event To Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.IntermediateCatchEventToAlternativeFlow
	 * @generated
	 */
	public Adapter createIntermediateCatchEventToAlternativeFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BpmnToUseCaseIntegration.EndEventToFlow <em>End Event To Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BpmnToUseCaseIntegration.EndEventToFlow
	 * @generated
	 */
	public Adapter createEndEventToFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TGGRuntime.AbstractCorrespondence <em>Abstract Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TGGRuntime.AbstractCorrespondence
	 * @generated
	 */
	public Adapter createAbstractCorrespondenceAdapter() {
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

} //BpmnToUseCaseIntegrationAdapterFactory
