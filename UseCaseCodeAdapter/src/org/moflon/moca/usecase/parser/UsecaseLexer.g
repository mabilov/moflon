lexer grammar UsecaseLexer;

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
          problem.setMessage("Lexer: " + getErrorMessage(e, tokenNames)); 
          
          problems.add(problem);
          super.displayRecognitionError(tokenNames, e);
    }
}

@header {
package org.moflon.moca.usecase.parser;
import org.moflon.moca.MocaUtil;
import java.util.Collection;
import Moca.MocaFactory;
import Moca.Problem;
import Moca.ProblemType;
}

WS: (' ' | '\t' | '\n' | '\r')+ {skip(); };
QUOTED_STRING: '"' .* '"' {MocaUtil.trim(this, 1, 1);};

SEPARATOR: ',';

PACKAGE: 'package';
ACTORS: 'actors';
ENDPACKAGE: 'end package';
USECASE: 'usecase';
EXTENDS: 'extends';
PRECONDITIONS: 'preconditions';
POSTCONDITIONS: 'postconditions';
ENDUSECASE: 'end usecase';
AS: 'as';
BASICFLOW: 'basic flow';
ENDFLOW: 'end flow';
WITHPOSTCONDITION: 'with postcondition';
EXCEPTIONFLOW: 'exception flow';
IF: 'if';
THEN: 'then';
ALTERNATIVE_FLOW: 'alternative flow';
PARALLEL_FLOW: 'parallel flow';
CONTINUEWITH: 'continue with step';
INVOKEUSECASE: 'invoke usecase';
STEP: 'step';
PARALLEL_STEP: 'parallel step';
BY: 'by';
TYPE: 'type';
ALTERNATIVES: 'alternatives';
ELSE: 'else';
PERSON: 'person';
SYSTEM: 'system';
ORGANIZATION: 'organization';
INPUT: 'input';
OUTPUT: 'output';
PROCESS: 'process';
MIX: 'mix';
FINALSTATE: 'FINALSTATE';
CONDITION: 'CONDITION';
LOCAL_ALTERNATIVE: 'LOCAL_ALTERNATIVE';
ALT_FLOW_ALT: 'ALT_FLOW_ALT';
NAME: 'NAME';
DESCRIPTION: 'DESCRIPTION';
INVOKE_FLOW: 'INVOKE_FLOW';
NEXT: 'NEXT';
ID: ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')+;
QUALIFIED_NAME: ID ('.' ID)*;
