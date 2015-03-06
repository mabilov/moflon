/**
 */
package UseCaseToModalSequenceDiagramIntegration.Rules.impl;

import UseCaseToModalSequenceDiagramIntegration.Rules.*;

import org.eclipse.emf.ecore.EClass;
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
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE
					.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
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
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE:
			return createUCModelToMSDModelRule();
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE:
			return createUCPackageToMSDPackage();
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE:
			return createUseCaseToInteractionRule();
		case RulesPackage.ACTOR_TO_CLASS_RULE:
			return createActorToClassRule();
		case RulesPackage.NORMAL_STEP_TO_MESSAGE_RULE:
			return createNormalStepToMessageRule();
		case RulesPackage.NORMAL_STEP_BASIC_FLOW_TO_MESSAGE_RULE:
			return createNormalStepBasicFlowToMessageRule();
		case RulesPackage.NORMAL_STEP_NAMED_FLOW_TO_MESSAGE_RULE:
			return createNormalStepNamedFlowToMessageRule();
		case RulesPackage.STEP_TO_COMBINED_FRAGMENT_RULE:
			return createStepToCombinedFragmentRule();
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE:
			return createStepAltToOperandRule();
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
	public UCModelToMSDModelRule createUCModelToMSDModelRule() {
		UCModelToMSDModelRuleImpl ucModelToMSDModelRule = new UCModelToMSDModelRuleImpl();
		return ucModelToMSDModelRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCPackageToMSDPackage createUCPackageToMSDPackage() {
		UCPackageToMSDPackageImpl ucPackageToMSDPackage = new UCPackageToMSDPackageImpl();
		return ucPackageToMSDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseToInteractionRule createUseCaseToInteractionRule() {
		UseCaseToInteractionRuleImpl useCaseToInteractionRule = new UseCaseToInteractionRuleImpl();
		return useCaseToInteractionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorToClassRule createActorToClassRule() {
		ActorToClassRuleImpl actorToClassRule = new ActorToClassRuleImpl();
		return actorToClassRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalStepToMessageRule createNormalStepToMessageRule() {
		NormalStepToMessageRuleImpl normalStepToMessageRule = new NormalStepToMessageRuleImpl();
		return normalStepToMessageRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalStepBasicFlowToMessageRule createNormalStepBasicFlowToMessageRule() {
		NormalStepBasicFlowToMessageRuleImpl normalStepBasicFlowToMessageRule = new NormalStepBasicFlowToMessageRuleImpl();
		return normalStepBasicFlowToMessageRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalStepNamedFlowToMessageRule createNormalStepNamedFlowToMessageRule() {
		NormalStepNamedFlowToMessageRuleImpl normalStepNamedFlowToMessageRule = new NormalStepNamedFlowToMessageRuleImpl();
		return normalStepNamedFlowToMessageRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepToCombinedFragmentRule createStepToCombinedFragmentRule() {
		StepToCombinedFragmentRuleImpl stepToCombinedFragmentRule = new StepToCombinedFragmentRuleImpl();
		return stepToCombinedFragmentRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepAltToOperandRule createStepAltToOperandRule() {
		StepAltToOperandRuleImpl stepAltToOperandRule = new StepAltToOperandRuleImpl();
		return stepAltToOperandRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
