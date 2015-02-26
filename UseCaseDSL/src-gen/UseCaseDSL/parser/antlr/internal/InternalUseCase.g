/*
* generated by Xtext
*/
grammar InternalUseCase;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package UseCaseDSL.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package UseCaseDSL.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import UseCaseDSL.services.UseCaseGrammarAccess;

}

@parser::members {

 	private UseCaseGrammarAccess grammarAccess;
 	
    public InternalUseCaseParser(TokenStream input, UseCaseGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "UseCasesModel";	
   	}
   	
   	@Override
   	protected UseCaseGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleUseCasesModel
entryRuleUseCasesModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUseCasesModelRule()); }
	 iv_ruleUseCasesModel=ruleUseCasesModel 
	 { $current=$iv_ruleUseCasesModel.current; } 
	 EOF 
;

// Rule UseCasesModel
ruleUseCasesModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getUseCasesModelAccess().getPackagesPackageDeclarationParserRuleCall_0()); 
	    }
		lv_packages_0_0=rulePackageDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUseCasesModelRule());
	        }
       		add(
       			$current, 
       			"packages",
        		lv_packages_0_0, 
        		"PackageDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRulePackageDeclaration
entryRulePackageDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPackageDeclarationRule()); }
	 iv_rulePackageDeclaration=rulePackageDeclaration 
	 { $current=$iv_rulePackageDeclaration.current; } 
	 EOF 
;

// Rule PackageDeclaration
rulePackageDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_description_2_0=RULE_STRING
		{
			newLeafNode(lv_description_2_0, grammarAccess.getPackageDeclarationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPackageDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_2_0, 
        		"STRING");
	    }

)
)?(	otherlv_3='actors' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPackageDeclarationAccess().getActorsKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getActorsActorParserRuleCall_3_1_0()); 
	    }
		lv_actors_4_0=ruleActor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
	        }
       		add(
       			$current, 
       			"actors",
        		lv_actors_4_0, 
        		"Actor");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getUseCasesUseCaseParserRuleCall_4_0()); 
	    }
		lv_useCases_5_0=ruleUseCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
	        }
       		add(
       			$current, 
       			"useCases",
        		lv_useCases_5_0, 
        		"UseCase");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='end package' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getPackageDeclarationAccess().getEndPackageKeyword_5());
    }
)
;





// Entry rule entryRuleUseCase
entryRuleUseCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUseCaseRule()); }
	 iv_ruleUseCase=ruleUseCase 
	 { $current=$iv_ruleUseCase.current; } 
	 EOF 
;

// Rule UseCase
ruleUseCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='usecase' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUsecaseKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseCaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_description_2_0=RULE_STRING
		{
			newLeafNode(lv_description_2_0, grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseCaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_2_0, 
        		"STRING");
	    }

)
)?(	otherlv_3='extends' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseCaseRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getUseCaseAccess().getSuperCaseUseCaseCrossReference_3_1_0()); 
	}

)
))?(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0);
	 				}
					({true}?=>(	otherlv_6='preconditions' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getUseCaseAccess().getPreconditionsKeyword_4_0_0());
    }
(
(
		lv_preConditions_7_0=RULE_STRING
		{
			newLeafNode(lv_preConditions_7_0, grammarAccess.getUseCaseAccess().getPreConditionsSTRINGTerminalRuleCall_4_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseCaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"preConditions",
        		lv_preConditions_7_0, 
        		"STRING");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1);
	 				}
					({true}?=>(	otherlv_8='postcondition' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getPostconditionKeyword_4_1_0());
    }
(
(
		lv_postcondition_9_0=RULE_STRING
		{
			newLeafNode(lv_postcondition_9_0, grammarAccess.getUseCaseAccess().getPostconditionSTRINGTerminalRuleCall_4_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUseCaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"postcondition",
        		lv_postcondition_9_0, 
        		"STRING");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
	}

)(
(
		{ 
	        newCompositeNode(grammarAccess.getUseCaseAccess().getFlowsFlowParserRuleCall_5_0()); 
	    }
		lv_flows_10_0=ruleFlow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUseCaseRule());
	        }
       		add(
       			$current, 
       			"flows",
        		lv_flows_10_0, 
        		"Flow");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_11='end usecase' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getEndUsecaseKeyword_6());
    }
)
;





// Entry rule entryRuleActor
entryRuleActor returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActorRule()); }
	 iv_ruleActor=ruleActor 
	 { $current=$iv_ruleActor.current; } 
	 EOF 
;

// Rule Actor
ruleActor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='as' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getActorAccess().getAsKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleActorType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActorRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"ActorType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_description_3_0=RULE_STRING
		{
			newLeafNode(lv_description_3_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_3_0, 
        		"STRING");
	    }

)
)?(	otherlv_4='extends' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getActorAccess().getExtendsKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getActorRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getActorAccess().getExtendsActorCrossReference_4_1_0()); 
	}

)
))?)
;





// Entry rule entryRuleStep
entryRuleStep returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStepRule()); }
	 iv_ruleStep=ruleStep 
	 { $current=$iv_ruleStep.current; } 
	 EOF 
;

// Rule Step
ruleStep returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getStepAccess().getNormalStepParserRuleCall_0()); 
    }
    this_NormalStep_0=ruleNormalStep
    { 
        $current = $this_NormalStep_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStepAccess().getParallelStepParserRuleCall_1()); 
    }
    this_ParallelStep_1=ruleParallelStep
    { 
        $current = $this_ParallelStep_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleFlow
entryRuleFlow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFlowRule()); }
	 iv_ruleFlow=ruleFlow 
	 { $current=$iv_ruleFlow.current; } 
	 EOF 
;

// Rule Flow
ruleFlow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFlowAccess().getBasicFlowParserRuleCall_0()); 
    }
    this_BasicFlow_0=ruleBasicFlow
    { 
        $current = $this_BasicFlow_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFlowAccess().getNamedFlowParserRuleCall_1()); 
    }
    this_NamedFlow_1=ruleNamedFlow
    { 
        $current = $this_NamedFlow_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleBasicFlow
entryRuleBasicFlow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBasicFlowRule()); }
	 iv_ruleBasicFlow=ruleBasicFlow 
	 { $current=$iv_ruleBasicFlow.current; } 
	 EOF 
;

// Rule BasicFlow
ruleBasicFlow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='basic flow' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBasicFlowAccess().getBasicFlowKeyword_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getBasicFlowAccess().getBasicFlowAction_1(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBasicFlowAccess().getStepsStepParserRuleCall_2_0()); 
	    }
		lv_steps_2_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBasicFlowRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_2_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3='end flow' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBasicFlowAccess().getEndFlowKeyword_3());
    }
(	otherlv_4='with postcondition' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBasicFlowAccess().getWithPostconditionKeyword_4_0());
    }
(
(
		lv_finalState_5_0=RULE_STRING
		{
			newLeafNode(lv_finalState_5_0, grammarAccess.getBasicFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBasicFlowRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"finalState",
        		lv_finalState_5_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleNamedFlow
entryRuleNamedFlow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNamedFlowRule()); }
	 iv_ruleNamedFlow=ruleNamedFlow 
	 { $current=$iv_ruleNamedFlow.current; } 
	 EOF 
;

// Rule NamedFlow
ruleNamedFlow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getNamedFlowAccess().getExceptionFlowParserRuleCall_0()); 
    }
    this_ExceptionFlow_0=ruleExceptionFlow
    { 
        $current = $this_ExceptionFlow_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNamedFlowAccess().getAlternativeFlowParserRuleCall_1()); 
    }
    this_AlternativeFlow_1=ruleAlternativeFlow
    { 
        $current = $this_AlternativeFlow_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNamedFlowAccess().getParallelFlowParserRuleCall_2()); 
    }
    this_ParallelFlow_2=ruleParallelFlow
    { 
        $current = $this_ParallelFlow_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleExceptionFlow
entryRuleExceptionFlow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExceptionFlowRule()); }
	 iv_ruleExceptionFlow=ruleExceptionFlow 
	 { $current=$iv_ruleExceptionFlow.current; } 
	 EOF 
;

// Rule ExceptionFlow
ruleExceptionFlow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='exception flow' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExceptionFlowAccess().getExceptionFlowKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getExceptionFlowAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExceptionFlowRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='if' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExceptionFlowAccess().getIfKeyword_2());
    }
(
(
		lv_condition_3_0=RULE_STRING
		{
			newLeafNode(lv_condition_3_0, grammarAccess.getExceptionFlowAccess().getConditionSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExceptionFlowRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"condition",
        		lv_condition_3_0, 
        		"STRING");
	    }

)
)	otherlv_4='then' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getExceptionFlowAccess().getThenKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExceptionFlowAccess().getStepsStepParserRuleCall_5_0()); 
	    }
		lv_steps_5_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExceptionFlowRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_5_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='end flow' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getExceptionFlowAccess().getEndFlowKeyword_6());
    }
(	otherlv_7='with postcondition' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getExceptionFlowAccess().getWithPostconditionKeyword_7_0());
    }
(
(
		lv_finalState_8_0=RULE_STRING
		{
			newLeafNode(lv_finalState_8_0, grammarAccess.getExceptionFlowAccess().getFinalStateSTRINGTerminalRuleCall_7_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExceptionFlowRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"finalState",
        		lv_finalState_8_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleAlternativeFlow
entryRuleAlternativeFlow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAlternativeFlowRule()); }
	 iv_ruleAlternativeFlow=ruleAlternativeFlow 
	 { $current=$iv_ruleAlternativeFlow.current; } 
	 EOF 
;

// Rule AlternativeFlow
ruleAlternativeFlow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='alternative flow' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAlternativeFlowAccess().getAlternativeFlowKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAlternativeFlowAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAlternativeFlowRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAlternativeFlowAccess().getStepsStepParserRuleCall_2_0()); 
	    }
		lv_steps_2_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAlternativeFlowRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_2_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3='end flow' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAlternativeFlowAccess().getEndFlowKeyword_3());
    }
(	otherlv_4='with postcondition' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAlternativeFlowAccess().getWithPostconditionKeyword_4_0());
    }
(
(
		lv_finalState_5_0=RULE_STRING
		{
			newLeafNode(lv_finalState_5_0, grammarAccess.getAlternativeFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAlternativeFlowRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"finalState",
        		lv_finalState_5_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleParallelFlow
entryRuleParallelFlow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParallelFlowRule()); }
	 iv_ruleParallelFlow=ruleParallelFlow 
	 { $current=$iv_ruleParallelFlow.current; } 
	 EOF 
;

// Rule ParallelFlow
ruleParallelFlow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='parallel flow' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getParallelFlowAccess().getParallelFlowKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getParallelFlowAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParallelFlowRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getParallelFlowAccess().getStepsStepParserRuleCall_2_0()); 
	    }
		lv_steps_2_0=ruleStep		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParallelFlowRule());
	        }
       		add(
       			$current, 
       			"steps",
        		lv_steps_2_0, 
        		"Step");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3='end flow' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getParallelFlowAccess().getEndFlowKeyword_3());
    }
(	otherlv_4='with postcondition' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getParallelFlowAccess().getWithPostconditionKeyword_4_0());
    }
(
(
		lv_finalState_5_0=RULE_STRING
		{
			newLeafNode(lv_finalState_5_0, grammarAccess.getParallelFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParallelFlowRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"finalState",
        		lv_finalState_5_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleStepAlternative
entryRuleStepAlternative returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStepAlternativeRule()); }
	 iv_ruleStepAlternative=ruleStepAlternative 
	 { $current=$iv_ruleStepAlternative.current; } 
	 EOF 
;

// Rule StepAlternative
ruleStepAlternative returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getStepAlternativeAccess().getConditionParserRuleCall_0()); 
    }
    this_Condition_0=ruleCondition
    { 
        $current = $this_Condition_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStepAlternativeAccess().getLocalAlternativeParserRuleCall_1()); 
    }
    this_LocalAlternative_1=ruleLocalAlternative
    { 
        $current = $this_LocalAlternative_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStepAlternativeAccess().getAlternativeFlowAlternativeParserRuleCall_2()); 
    }
    this_AlternativeFlowAlternative_2=ruleAlternativeFlowAlternative
    { 
        $current = $this_AlternativeFlowAlternative_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	 iv_ruleCondition=ruleCondition 
	 { $current=$iv_ruleCondition.current; } 
	 EOF 
;

// Rule Condition
ruleCondition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
    }
(
(
		lv_condition_1_0=RULE_STRING
		{
			newLeafNode(lv_condition_1_0, grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"condition",
        		lv_condition_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='then' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getThenKeyword_2());
    }
(	otherlv_3='continue with step' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getContinueWithStepKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getContinuationStepCrossReference_3_1_0()); 
	}

)
))?)
;





// Entry rule entryRuleLocalAlternative
entryRuleLocalAlternative returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLocalAlternativeRule()); }
	 iv_ruleLocalAlternative=ruleLocalAlternative 
	 { $current=$iv_ruleLocalAlternative.current; } 
	 EOF 
;

// Rule LocalAlternative
ruleLocalAlternative returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLocalAlternativeAccess().getIfKeyword_0());
    }
(
(
		lv_condition_1_0=RULE_STRING
		{
			newLeafNode(lv_condition_1_0, grammarAccess.getLocalAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalAlternativeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"condition",
        		lv_condition_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='then' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLocalAlternativeAccess().getThenKeyword_2());
    }
((
(
		lv_description_3_0=RULE_STRING
		{
			newLeafNode(lv_description_3_0, grammarAccess.getLocalAlternativeAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalAlternativeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_3_0, 
        		"STRING");
	    }

)
)
    |(	otherlv_4='invoke usecase' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getLocalAlternativeAccess().getInvokeUsecaseKeyword_3_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalAlternativeRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseCrossReference_3_1_1_0()); 
	}

)
)))(	otherlv_6='continue with step' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getLocalAlternativeAccess().getContinueWithStepKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLocalAlternativeRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getLocalAlternativeAccess().getContinuationStepCrossReference_4_1_0()); 
	}

)
))?)
;





// Entry rule entryRuleAlternativeFlowAlternative
entryRuleAlternativeFlowAlternative returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAlternativeFlowAlternativeRule()); }
	 iv_ruleAlternativeFlowAlternative=ruleAlternativeFlowAlternative 
	 { $current=$iv_ruleAlternativeFlowAlternative.current; } 
	 EOF 
;

// Rule AlternativeFlowAlternative
ruleAlternativeFlowAlternative returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAlternativeFlowAlternativeAccess().getIfKeyword_0());
    }
(
(
		lv_condition_1_0=RULE_STRING
		{
			newLeafNode(lv_condition_1_0, grammarAccess.getAlternativeFlowAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAlternativeFlowAlternativeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"condition",
        		lv_condition_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='then' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAlternativeFlowAlternativeAccess().getThenKeyword_2());
    }
	otherlv_3='alternative flow' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAlternativeFlowAlternativeAccess().getAlternativeFlowKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAlternativeFlowAlternativeRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowCrossReference_4_0()); 
	}

)
)(	otherlv_5='continue with step' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAlternativeFlowAlternativeAccess().getContinueWithStepKeyword_5_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAlternativeFlowAlternativeRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepCrossReference_5_1_0()); 
	}

)
))?)
;





// Entry rule entryRuleParallelStep
entryRuleParallelStep returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParallelStepRule()); }
	 iv_ruleParallelStep=ruleParallelStep 
	 { $current=$iv_ruleParallelStep.current; } 
	 EOF 
;

// Rule ParallelStep
ruleParallelStep returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='parallel step' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getParallelStepAccess().getParallelStepKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getParallelStepAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParallelStepRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_label_2_0=RULE_STRING
		{
			newLeafNode(lv_label_2_0, grammarAccess.getParallelStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParallelStepRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_2_0, 
        		"STRING");
	    }

)
)?(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParallelStepRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_3_0()); 
	}

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getParallelStepAccess().getCommaKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParallelStepRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_4_1_0()); 
	}

)
))*(	otherlv_6='next' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getParallelStepAccess().getNextKeyword_5_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParallelStepRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getParallelStepAccess().getNextStepCrossReference_5_1_0()); 
	}

)
))?)
;





// Entry rule entryRuleNormalStep
entryRuleNormalStep returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNormalStepRule()); }
	 iv_ruleNormalStep=ruleNormalStep 
	 { $current=$iv_ruleNormalStep.current; } 
	 EOF 
;

// Rule NormalStep
ruleNormalStep returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='step' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNormalStepAccess().getStepKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getNormalStepAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNormalStepRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_label_2_0=RULE_STRING
		{
			newLeafNode(lv_label_2_0, grammarAccess.getNormalStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNormalStepRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_2_0, 
        		"STRING");
	    }

)
)?	otherlv_3='by' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getNormalStepAccess().getByKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNormalStepRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getNormalStepAccess().getActorActorCrossReference_4_0()); 
	}

)
)(	otherlv_5='type' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getNormalStepAccess().getTypeKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNormalStepAccess().getCustomStepTypeCustomStepTypeEnumRuleCall_5_1_0()); 
	    }
		lv_customStepType_6_0=ruleCustomStepType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNormalStepRule());
	        }
       		set(
       			$current, 
       			"customStepType",
        		lv_customStepType_6_0, 
        		"CustomStepType");
	        afterParserOrEnumRuleCall();
	    }

)
))?((	otherlv_7='alternatives' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getNormalStepAccess().getAlternativesKeyword_6_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNormalStepAccess().getStepAlternativeStepAlternativeParserRuleCall_6_0_1_0()); 
	    }
		lv_stepAlternative_8_0=ruleStepAlternative		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNormalStepRule());
	        }
       		add(
       			$current, 
       			"stepAlternative",
        		lv_stepAlternative_8_0, 
        		"StepAlternative");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_9='else' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getNormalStepAccess().getElseKeyword_6_0_2());
    }
)
    |(	otherlv_10='invoke usecase' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getNormalStepAccess().getInvokeUsecaseKeyword_6_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNormalStepRule());
	        }
        }
	otherlv_11=RULE_ID
	{
		newLeafNode(otherlv_11, grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseCrossReference_6_1_1_0()); 
	}

)
)))?(	otherlv_12='next' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getNormalStepAccess().getNextKeyword_7_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNormalStepRule());
	        }
        }
	otherlv_13=RULE_ID
	{
		newLeafNode(otherlv_13, grammarAccess.getNormalStepAccess().getNextStepCrossReference_7_1_0()); 
	}

)
))?)
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Rule ActorType
ruleActorType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='person' 
	{
        $current = grammarAccess.getActorTypeAccess().getPERSONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getActorTypeAccess().getPERSONEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='system' 
	{
        $current = grammarAccess.getActorTypeAccess().getSYSTEMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getActorTypeAccess().getSYSTEMEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='organization' 
	{
        $current = grammarAccess.getActorTypeAccess().getORGANIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getActorTypeAccess().getORGANIZATIONEnumLiteralDeclaration_2()); 
    }
));



// Rule CustomStepType
ruleCustomStepType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='input' 
	{
        $current = grammarAccess.getCustomStepTypeAccess().getINPUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getCustomStepTypeAccess().getINPUTEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='output' 
	{
        $current = grammarAccess.getCustomStepTypeAccess().getOUTPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getCustomStepTypeAccess().getOUTPUTEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='process' 
	{
        $current = grammarAccess.getCustomStepTypeAccess().getPROCESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getCustomStepTypeAccess().getPROCESSEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='mix' 
	{
        $current = grammarAccess.getCustomStepTypeAccess().getMIXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getCustomStepTypeAccess().getMIXEnumLiteralDeclaration_3()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


