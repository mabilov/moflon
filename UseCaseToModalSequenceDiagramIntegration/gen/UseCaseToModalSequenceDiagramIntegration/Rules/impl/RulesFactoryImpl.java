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
		case RulesPackage.WAIT_STEP_TO_FOUND_MESSAGE_RULE:
			return createWaitStepToFoundMessageRule();
		case RulesPackage.SEND_STEP_TO_LOST_MESSAGE_RULE:
			return createSendStepToLostMessageRule();
		case RulesPackage.UC_MODEL_TO_MSD_MODEL_RULE:
			return createUCModelToMSDModelRule();
		case RulesPackage.UC_PACKAGE_TO_MSD_PACKAGE:
			return createUCPackageToMSDPackage();
		case RulesPackage.USE_CASE_TO_INTERACTION_RULE:
			return createUseCaseToInteractionRule();
		case RulesPackage.ACTOR_TO_LIFELINE_RULE:
			return createActorToLifelineRule();
		case RulesPackage.PARALLEL_STEP_TO_COMBINED_FRAGMENT_RULE:
			return createParallelStepToCombinedFragmentRule();
		case RulesPackage.PARALLEL_FLOW_TO_OPERAND_RULE:
			return createParallelFlowToOperandRule();
		case RulesPackage.USE_CASE_PRECOND_TO_FOUND_MESSAGE_RULE:
			return createUseCasePrecondToFoundMessageRule();
		case RulesPackage.SYSTEM_STEP_BF_TO_MESSAGE_RULE:
			return createSystemStepBFToMessageRule();
		case RulesPackage.STEP_ALT_TO_OPERAND_RULE:
			return createStepAltToOperandRule();
		case RulesPackage.USER_STEP_BF_MESSAGE_RULE:
			return createUserStepBFMessageRule();
		case RulesPackage.SYSTEM_STEP_NF_TO_MESSAGE_RULE:
			return createSystemStepNFToMessageRule();
		case RulesPackage.USER_STEP_NF_TO_MESSAGE_RULE:
			return createUserStepNfToMessageRule();
		case RulesPackage.ALT_SYS_STEP_BF_TO_COMBO_RULE:
			return createAltSysStepBFToComboRule();
		case RulesPackage.ALT_USER_STEP_BF_TO_COMBO_RULE:
			return createAltUserStepBFToComboRule();
		case RulesPackage.ALT_SYS_STEP_NF_TO_COMBO_RULE:
			return createAltSysStepNFToComboRule();
		case RulesPackage.ALT_USER_STEP_NF_TO_COMBO_RULE:
			return createAltUserStepNFToComboRule();
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
	public WaitStepToFoundMessageRule createWaitStepToFoundMessageRule() {
		WaitStepToFoundMessageRuleImpl waitStepToFoundMessageRule = new WaitStepToFoundMessageRuleImpl();
		return waitStepToFoundMessageRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendStepToLostMessageRule createSendStepToLostMessageRule() {
		SendStepToLostMessageRuleImpl sendStepToLostMessageRule = new SendStepToLostMessageRuleImpl();
		return sendStepToLostMessageRule;
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
	public ActorToLifelineRule createActorToLifelineRule() {
		ActorToLifelineRuleImpl actorToLifelineRule = new ActorToLifelineRuleImpl();
		return actorToLifelineRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelStepToCombinedFragmentRule createParallelStepToCombinedFragmentRule() {
		ParallelStepToCombinedFragmentRuleImpl parallelStepToCombinedFragmentRule = new ParallelStepToCombinedFragmentRuleImpl();
		return parallelStepToCombinedFragmentRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelFlowToOperandRule createParallelFlowToOperandRule() {
		ParallelFlowToOperandRuleImpl parallelFlowToOperandRule = new ParallelFlowToOperandRuleImpl();
		return parallelFlowToOperandRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCasePrecondToFoundMessageRule createUseCasePrecondToFoundMessageRule() {
		UseCasePrecondToFoundMessageRuleImpl useCasePrecondToFoundMessageRule = new UseCasePrecondToFoundMessageRuleImpl();
		return useCasePrecondToFoundMessageRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStepBFToMessageRule createSystemStepBFToMessageRule() {
		SystemStepBFToMessageRuleImpl systemStepBFToMessageRule = new SystemStepBFToMessageRuleImpl();
		return systemStepBFToMessageRule;
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
	public UserStepBFMessageRule createUserStepBFMessageRule() {
		UserStepBFMessageRuleImpl userStepBFMessageRule = new UserStepBFMessageRuleImpl();
		return userStepBFMessageRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStepNFToMessageRule createSystemStepNFToMessageRule() {
		SystemStepNFToMessageRuleImpl systemStepNFToMessageRule = new SystemStepNFToMessageRuleImpl();
		return systemStepNFToMessageRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStepNfToMessageRule createUserStepNfToMessageRule() {
		UserStepNfToMessageRuleImpl userStepNfToMessageRule = new UserStepNfToMessageRuleImpl();
		return userStepNfToMessageRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltSysStepBFToComboRule createAltSysStepBFToComboRule() {
		AltSysStepBFToComboRuleImpl altSysStepBFToComboRule = new AltSysStepBFToComboRuleImpl();
		return altSysStepBFToComboRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltUserStepBFToComboRule createAltUserStepBFToComboRule() {
		AltUserStepBFToComboRuleImpl altUserStepBFToComboRule = new AltUserStepBFToComboRuleImpl();
		return altUserStepBFToComboRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltSysStepNFToComboRule createAltSysStepNFToComboRule() {
		AltSysStepNFToComboRuleImpl altSysStepNFToComboRule = new AltSysStepNFToComboRuleImpl();
		return altSysStepNFToComboRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltUserStepNFToComboRule createAltUserStepNFToComboRule() {
		AltUserStepNFToComboRuleImpl altUserStepNFToComboRule = new AltUserStepNFToComboRuleImpl();
		return altUserStepNFToComboRule;
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
