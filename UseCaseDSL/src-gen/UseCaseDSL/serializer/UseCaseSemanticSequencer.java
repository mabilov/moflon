package UseCaseDSL.serializer;

import UseCaseDSL.Actor;
import UseCaseDSL.AlternativeFlow;
import UseCaseDSL.AlternativeFlowAlternative;
import UseCaseDSL.BasicFlow;
import UseCaseDSL.Condition;
import UseCaseDSL.ExceptionFlow;
import UseCaseDSL.LocalAlternative;
import UseCaseDSL.NormalStep;
import UseCaseDSL.PackageDeclaration;
import UseCaseDSL.ParallelFlow;
import UseCaseDSL.ParallelStep;
import UseCaseDSL.UseCase;
import UseCaseDSL.UseCaseDSLPackage;
import UseCaseDSL.UseCasesModel;
import UseCaseDSL.services.UseCaseGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class UseCaseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UseCaseGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == UseCaseDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UseCaseDSLPackage.ACTOR:
				if(context == grammarAccess.getActorRule()) {
					sequence_Actor(context, (Actor) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.ALTERNATIVE_FLOW:
				if(context == grammarAccess.getAlternativeFlowRule() ||
				   context == grammarAccess.getFlowRule() ||
				   context == grammarAccess.getNamedFlowRule()) {
					sequence_AlternativeFlow(context, (AlternativeFlow) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.ALTERNATIVE_FLOW_ALTERNATIVE:
				if(context == grammarAccess.getAlternativeFlowAlternativeRule() ||
				   context == grammarAccess.getStepAlternativeRule()) {
					sequence_AlternativeFlowAlternative(context, (AlternativeFlowAlternative) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.BASIC_FLOW:
				if(context == grammarAccess.getBasicFlowRule() ||
				   context == grammarAccess.getFlowRule()) {
					sequence_BasicFlow(context, (BasicFlow) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.CONDITION:
				if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getStepAlternativeRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.EXCEPTION_FLOW:
				if(context == grammarAccess.getExceptionFlowRule() ||
				   context == grammarAccess.getFlowRule() ||
				   context == grammarAccess.getNamedFlowRule()) {
					sequence_ExceptionFlow(context, (ExceptionFlow) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.LOCAL_ALTERNATIVE:
				if(context == grammarAccess.getLocalAlternativeRule() ||
				   context == grammarAccess.getStepAlternativeRule()) {
					sequence_LocalAlternative(context, (LocalAlternative) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.NORMAL_STEP:
				if(context == grammarAccess.getNormalStepRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_NormalStep(context, (NormalStep) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.PARALLEL_FLOW:
				if(context == grammarAccess.getFlowRule() ||
				   context == grammarAccess.getNamedFlowRule() ||
				   context == grammarAccess.getParallelFlowRule()) {
					sequence_ParallelFlow(context, (ParallelFlow) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.PARALLEL_STEP:
				if(context == grammarAccess.getParallelStepRule() ||
				   context == grammarAccess.getStepRule()) {
					sequence_ParallelStep(context, (ParallelStep) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.USE_CASE:
				if(context == grammarAccess.getUseCaseRule()) {
					sequence_UseCase(context, (UseCase) semanticObject); 
					return; 
				}
				else break;
			case UseCaseDSLPackage.USE_CASES_MODEL:
				if(context == grammarAccess.getUseCasesModelRule()) {
					sequence_UseCasesModel(context, (UseCasesModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID type=ActorType description=STRING? extends=[Actor|ID]?)
	 */
	protected void sequence_Actor(EObject context, Actor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=STRING ref=[NamedFlow|ID] continuation=[Step|ID]?)
	 */
	protected void sequence_AlternativeFlowAlternative(EObject context, AlternativeFlowAlternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID steps+=Step? finalState=STRING?)
	 */
	protected void sequence_AlternativeFlow(EObject context, AlternativeFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (steps+=Step? finalState=STRING?)
	 */
	protected void sequence_BasicFlow(EObject context, BasicFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=STRING continuation=[Step|ID]?)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID condition=STRING steps+=Step? finalState=STRING?)
	 */
	protected void sequence_ExceptionFlow(EObject context, ExceptionFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=STRING (description=STRING | invokedUseCase=[UseCase|ID]) continuation=[Step|ID]?)
	 */
	protected void sequence_LocalAlternative(EObject context, LocalAlternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         label=STRING? 
	 *         actor=[Actor|ID] 
	 *         customStepType=CustomStepType? 
	 *         (stepAlternative+=StepAlternative+ | invokedUseCase=[UseCase|ID])? 
	 *         next=[Step|ID]?
	 *     )
	 */
	protected void sequence_NormalStep(EObject context, NormalStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName description=STRING? actors+=Actor* useCases+=UseCase*)
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID steps+=Step? finalState=STRING?)
	 */
	protected void sequence_ParallelFlow(EObject context, ParallelFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID label=STRING? invokedFlows+=[ParallelFlow|ID] invokedFlows+=[ParallelFlow|ID]* next=[Step|ID]?)
	 */
	protected void sequence_ParallelStep(EObject context, ParallelStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING? 
	 *         superCase=[UseCase|ID]? 
	 *         preConditions=STRING? 
	 *         postcondition=STRING? 
	 *         flows+=Flow*
	 *     )
	 */
	protected void sequence_UseCase(EObject context, UseCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     packages+=PackageDeclaration*
	 */
	protected void sequence_UseCasesModel(EObject context, UseCasesModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
