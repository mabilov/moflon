parser grammar UsecaseParser;

options {
  language = Java;
  tokenVocab = UsecaseLexer;
  output = AST;
}

// List of tokens used to structure the tree
//tokens {
//  MY_TOKEN;
//}

@members {
  public Collection<Problem> problems = new ArrayList<Problem>();

      public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
          Problem problem = MocaFactory.eINSTANCE.createProblem();
          int line  = e.line;
          int charPos = e.charPositionInLine;
          int tokenLenght = 1;
          Token token = e.token;
          if(token != null) 
            tokenLenght = token.getText().length();
                  
          
          problem.setType(ProblemType.ERROR);
          problem.setLine(line); 
          problem.setCharacterPositionStart(charPos); 
          problem.setCharacterPositionEnd(charPos+tokenLenght);
          problem.setMessage("Parser: " + getErrorMessage(e, tokenNames));
          
          problems.add(problem);
          super.displayRecognitionError(tokenNames, e);
    }
}

@header {
package org.moflon.moca.usecase.parser; 
import java.util.Collection;
import Moca.MocaFactory;
import Moca.Problem;
import Moca.ProblemType;
}

// Parser Rules:
main: packageRule+;
packageRule: PACKAGE QUALIFIED_NAME	descriptionRule 
	actorsRule? useCasesRule ENDPACKAGE 
	-> ^(QUALIFIED_NAME descriptionRule actorsRule? useCasesRule);
actorsRule: ACTORS actorRule+ -> ^(ACTORS actorRule+);
actorRule: ID AS actorTypeRule descriptionRule extendRule?
	-> ^(ID actorTypeRule descriptionRule extendRule?);
actorTypeRule: actorTypeEnumRule -> ^(TYPE actorTypeEnumRule);
useCasesRule: usecaseRule* -> ^(USECASE usecaseRule*);
usecaseRule: USECASE ID descriptionRule 
	extendRule? preconditionRule? flowRule* ENDUSECASE 
	-> ^(ID descriptionRule extendRule? preconditionRule? flowRule*);
flowRule: basicFlowRule | namedFlowRule;
namedFlowRule: exceptionFlowRule | alternativeFlowRule | parallelflowRule;
basicFlowRule: BASICFLOW stepRule* ENDFLOW finalStateRule?
	-> ^(BASICFLOW stepRule* finalStateRule?);
exceptionFlowRule: EXCEPTIONFLOW nameRule 
	ifRule stepRule* ENDFLOW finalStateRule?
	-> ^(EXCEPTIONFLOW nameRule ifRule stepRule* finalStateRule?);
alternativeFlowRule: ALTERNATIVE_FLOW nameRule stepRule* ENDFLOW finalStateRule?
	-> ^(ALTERNATIVE_FLOW nameRule stepRule* finalStateRule?);
parallelflowRule: PARALLEL_FLOW nameRule stepRule* ENDFLOW finalStateRule?
	-> ^(PARALLEL_FLOW nameRule stepRule* finalStateRule?);
stepAlternativeRule: conditionRule | localAltRule | alternativeFlowAlternativeRule;
conditionRule: ifRule continuationRule? -> ^(CONDITION ifRule continuationRule?);
localAltRule: ifRule localAltThenRule continuationRule?
	-> ^(LOCAL_ALTERNATIVE ifRule localAltThenRule continuationRule?);
alternativeFlowAlternativeRule: ifRule ALTERNATIVE_FLOW ID continuationRule?
	-> ^(ALT_FLOW_ALT ifRule ID continuationRule?);
stepRule: normalStepRule | parallelStepRule;
parallelStepRule: PARALLEL_STEP nameRule descriptionRule invokeFlowRule nextRule?
	-> ^(PARALLEL_STEP nameRule descriptionRule invokeFlowRule nextRule?);
normalStepRule: STEP nameRule descriptionRule byActorRule stepTypeRule? stepDetailRule? nextRule?
		-> ^(STEP nameRule descriptionRule byActorRule stepTypeRule? stepDetailRule? nextRule?);
actorTypeEnumRule: PERSON | SYSTEM | ORGANIZATION;
customStepTypeRule : INPUT | OUTPUT | PROCESS | MIX ;

nameRule: ID -> ^(NAME ID);
descriptionRule: QUOTED_STRING? -> ^(DESCRIPTION QUOTED_STRING?);
preconditionRule: PRECONDITIONS QUOTED_STRING -> ^(PRECONDITIONS QUOTED_STRING);
continuationRule: CONTINUEWITH ID -> ^(CONTINUEWITH ID);
ifRule: IF QUOTED_STRING THEN -> ^(IF QUOTED_STRING);
localAltDescriptionRule: QUOTED_STRING -> ^(DESCRIPTION QUOTED_STRING);
localAltThenRule: localAltDescriptionRule | invokeUseCaseRule;
extendRule: EXTENDS ID -> ^(EXTENDS ID);
finalStateRule: WITHPOSTCONDITION QUOTED_STRING -> ^(WITHPOSTCONDITION QUOTED_STRING);
invokeFlowRule: ID (SEPARATOR ID)* -> ^(INVOKE_FLOW ID+);
invokeUseCaseRule: INVOKEUSECASE ID -> ^(INVOKEUSECASE ID);
nextRule: ID -> ^(NEXT ID);
byActorRule: BY ID ->^(BY ID);
stepTypeRule: TYPE customStepTypeRule -> ^(TYPE customStepTypeRule);
stepDetailAlternativeRule: ALTERNATIVES stepAlternativeRule+ ELSE 
	-> ^(ALTERNATIVES stepAlternativeRule+);
stepDetailRule: stepDetailAlternativeRule | invokeUseCaseRule;