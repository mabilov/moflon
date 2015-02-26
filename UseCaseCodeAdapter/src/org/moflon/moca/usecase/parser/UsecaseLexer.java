// $ANTLR 3.5.2 C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g 2015-02-25 19:17:40

package org.moflon.moca.usecase.parser;
import org.moflon.moca.MocaUtil;
import java.util.Collection;
import Moca.MocaFactory;
import Moca.Problem;
import Moca.ProblemType;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class UsecaseLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ACTORS=4;
	public static final int ALTERNATIVES=5;
	public static final int ALTERNATIVE_FLOW=6;
	public static final int ALT_FLOW_ALT=7;
	public static final int AS=8;
	public static final int BASICFLOW=9;
	public static final int BY=10;
	public static final int CONDITION=11;
	public static final int CONTINUEWITH=12;
	public static final int DESCRIPTION=13;
	public static final int ELSE=14;
	public static final int ENDFLOW=15;
	public static final int ENDPACKAGE=16;
	public static final int ENDUSECASE=17;
	public static final int EXCEPTIONFLOW=18;
	public static final int EXTENDS=19;
	public static final int FINALSTATE=20;
	public static final int ID=21;
	public static final int IF=22;
	public static final int INPUT=23;
	public static final int INVOKEUSECASE=24;
	public static final int INVOKE_FLOW=25;
	public static final int LOCAL_ALTERNATIVE=26;
	public static final int MIX=27;
	public static final int NAME=28;
	public static final int NEXT=29;
	public static final int ORGANIZATION=30;
	public static final int OUTPUT=31;
	public static final int PACKAGE=32;
	public static final int PARALLEL_FLOW=33;
	public static final int PARALLEL_STEP=34;
	public static final int PERSON=35;
	public static final int POSTCONDITIONS=36;
	public static final int PRECONDITIONS=37;
	public static final int PROCESS=38;
	public static final int QUALIFIED_NAME=39;
	public static final int QUOTED_STRING=40;
	public static final int SEPARATOR=41;
	public static final int STEP=42;
	public static final int SYSTEM=43;
	public static final int THEN=44;
	public static final int TYPE=45;
	public static final int USECASE=46;
	public static final int WITHPOSTCONDITION=47;
	public static final int WS=48;

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


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public UsecaseLexer() {} 
	public UsecaseLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public UsecaseLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g"; }

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:37:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:37:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:37:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "QUOTED_STRING"
	public final void mQUOTED_STRING() throws RecognitionException {
		try {
			int _type = QUOTED_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:38:14: ( '\"' ( . )* '\"' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:38:16: '\"' ( . )* '\"'
			{
			match('\"'); 
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:38:20: ( . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\"') ) {
					alt2=2;
				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '!')||(LA2_0 >= '#' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:38:20: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
			}

			match('\"'); 
			MocaUtil.trim(this, 1, 1);
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTED_STRING"

	// $ANTLR start "SEPARATOR"
	public final void mSEPARATOR() throws RecognitionException {
		try {
			int _type = SEPARATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:40:10: ( ',' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:40:12: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEPARATOR"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:42:8: ( 'package' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:42:10: 'package'
			{
			match("package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PACKAGE"

	// $ANTLR start "ACTORS"
	public final void mACTORS() throws RecognitionException {
		try {
			int _type = ACTORS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:43:7: ( 'actors' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:43:9: 'actors'
			{
			match("actors"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ACTORS"

	// $ANTLR start "ENDPACKAGE"
	public final void mENDPACKAGE() throws RecognitionException {
		try {
			int _type = ENDPACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:44:11: ( 'end package' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:44:13: 'end package'
			{
			match("end package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDPACKAGE"

	// $ANTLR start "USECASE"
	public final void mUSECASE() throws RecognitionException {
		try {
			int _type = USECASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:45:8: ( 'usecase' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:45:10: 'usecase'
			{
			match("usecase"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USECASE"

	// $ANTLR start "EXTENDS"
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:46:8: ( 'extends' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:46:10: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDS"

	// $ANTLR start "PRECONDITIONS"
	public final void mPRECONDITIONS() throws RecognitionException {
		try {
			int _type = PRECONDITIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:47:14: ( 'preconditions' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:47:16: 'preconditions'
			{
			match("preconditions"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRECONDITIONS"

	// $ANTLR start "POSTCONDITIONS"
	public final void mPOSTCONDITIONS() throws RecognitionException {
		try {
			int _type = POSTCONDITIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:48:15: ( 'postconditions' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:48:17: 'postconditions'
			{
			match("postconditions"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POSTCONDITIONS"

	// $ANTLR start "ENDUSECASE"
	public final void mENDUSECASE() throws RecognitionException {
		try {
			int _type = ENDUSECASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:49:11: ( 'end usecase' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:49:13: 'end usecase'
			{
			match("end usecase"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDUSECASE"

	// $ANTLR start "AS"
	public final void mAS() throws RecognitionException {
		try {
			int _type = AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:50:3: ( 'as' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:50:5: 'as'
			{
			match("as"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AS"

	// $ANTLR start "BASICFLOW"
	public final void mBASICFLOW() throws RecognitionException {
		try {
			int _type = BASICFLOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:51:10: ( 'basic flow' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:51:12: 'basic flow'
			{
			match("basic flow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BASICFLOW"

	// $ANTLR start "ENDFLOW"
	public final void mENDFLOW() throws RecognitionException {
		try {
			int _type = ENDFLOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:52:8: ( 'end flow' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:52:10: 'end flow'
			{
			match("end flow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDFLOW"

	// $ANTLR start "WITHPOSTCONDITION"
	public final void mWITHPOSTCONDITION() throws RecognitionException {
		try {
			int _type = WITHPOSTCONDITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:53:18: ( 'with postcondition' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:53:20: 'with postcondition'
			{
			match("with postcondition"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WITHPOSTCONDITION"

	// $ANTLR start "EXCEPTIONFLOW"
	public final void mEXCEPTIONFLOW() throws RecognitionException {
		try {
			int _type = EXCEPTIONFLOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:54:14: ( 'exception flow' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:54:16: 'exception flow'
			{
			match("exception flow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXCEPTIONFLOW"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:55:3: ( 'if' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:55:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:56:5: ( 'then' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:56:7: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ALTERNATIVE_FLOW"
	public final void mALTERNATIVE_FLOW() throws RecognitionException {
		try {
			int _type = ALTERNATIVE_FLOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:57:17: ( 'alternative flow' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:57:19: 'alternative flow'
			{
			match("alternative flow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALTERNATIVE_FLOW"

	// $ANTLR start "PARALLEL_FLOW"
	public final void mPARALLEL_FLOW() throws RecognitionException {
		try {
			int _type = PARALLEL_FLOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:58:14: ( 'parallel flow' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:58:16: 'parallel flow'
			{
			match("parallel flow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARALLEL_FLOW"

	// $ANTLR start "CONTINUEWITH"
	public final void mCONTINUEWITH() throws RecognitionException {
		try {
			int _type = CONTINUEWITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:59:13: ( 'continue with step' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:59:15: 'continue with step'
			{
			match("continue with step"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUEWITH"

	// $ANTLR start "INVOKEUSECASE"
	public final void mINVOKEUSECASE() throws RecognitionException {
		try {
			int _type = INVOKEUSECASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:60:14: ( 'invoke usecase' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:60:16: 'invoke usecase'
			{
			match("invoke usecase"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INVOKEUSECASE"

	// $ANTLR start "STEP"
	public final void mSTEP() throws RecognitionException {
		try {
			int _type = STEP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:61:5: ( 'step' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:61:7: 'step'
			{
			match("step"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STEP"

	// $ANTLR start "PARALLEL_STEP"
	public final void mPARALLEL_STEP() throws RecognitionException {
		try {
			int _type = PARALLEL_STEP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:62:14: ( 'parallel step' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:62:16: 'parallel step'
			{
			match("parallel step"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARALLEL_STEP"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:63:3: ( 'by' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:63:5: 'by'
			{
			match("by"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:64:5: ( 'type' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:64:7: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "ALTERNATIVES"
	public final void mALTERNATIVES() throws RecognitionException {
		try {
			int _type = ALTERNATIVES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:65:13: ( 'alternatives' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:65:15: 'alternatives'
			{
			match("alternatives"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALTERNATIVES"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:66:5: ( 'else' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:66:7: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "PERSON"
	public final void mPERSON() throws RecognitionException {
		try {
			int _type = PERSON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:67:7: ( 'person' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:67:9: 'person'
			{
			match("person"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERSON"

	// $ANTLR start "SYSTEM"
	public final void mSYSTEM() throws RecognitionException {
		try {
			int _type = SYSTEM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:68:7: ( 'system' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:68:9: 'system'
			{
			match("system"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYSTEM"

	// $ANTLR start "ORGANIZATION"
	public final void mORGANIZATION() throws RecognitionException {
		try {
			int _type = ORGANIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:69:13: ( 'organization' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:69:15: 'organization'
			{
			match("organization"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORGANIZATION"

	// $ANTLR start "INPUT"
	public final void mINPUT() throws RecognitionException {
		try {
			int _type = INPUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:70:6: ( 'input' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:70:8: 'input'
			{
			match("input"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INPUT"

	// $ANTLR start "OUTPUT"
	public final void mOUTPUT() throws RecognitionException {
		try {
			int _type = OUTPUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:71:7: ( 'output' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:71:9: 'output'
			{
			match("output"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OUTPUT"

	// $ANTLR start "PROCESS"
	public final void mPROCESS() throws RecognitionException {
		try {
			int _type = PROCESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:72:8: ( 'process' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:72:10: 'process'
			{
			match("process"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROCESS"

	// $ANTLR start "MIX"
	public final void mMIX() throws RecognitionException {
		try {
			int _type = MIX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:73:4: ( 'mix' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:73:6: 'mix'
			{
			match("mix"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIX"

	// $ANTLR start "FINALSTATE"
	public final void mFINALSTATE() throws RecognitionException {
		try {
			int _type = FINALSTATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:74:11: ( 'FINALSTATE' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:74:13: 'FINALSTATE'
			{
			match("FINALSTATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FINALSTATE"

	// $ANTLR start "CONDITION"
	public final void mCONDITION() throws RecognitionException {
		try {
			int _type = CONDITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:75:10: ( 'CONDITION' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:75:12: 'CONDITION'
			{
			match("CONDITION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONDITION"

	// $ANTLR start "LOCAL_ALTERNATIVE"
	public final void mLOCAL_ALTERNATIVE() throws RecognitionException {
		try {
			int _type = LOCAL_ALTERNATIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:76:18: ( 'LOCAL_ALTERNATIVE' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:76:20: 'LOCAL_ALTERNATIVE'
			{
			match("LOCAL_ALTERNATIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOCAL_ALTERNATIVE"

	// $ANTLR start "ALT_FLOW_ALT"
	public final void mALT_FLOW_ALT() throws RecognitionException {
		try {
			int _type = ALT_FLOW_ALT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:77:13: ( 'ALT_FLOW_ALT' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:77:15: 'ALT_FLOW_ALT'
			{
			match("ALT_FLOW_ALT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALT_FLOW_ALT"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:78:5: ( 'NAME' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:78:7: 'NAME'
			{
			match("NAME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	// $ANTLR start "DESCRIPTION"
	public final void mDESCRIPTION() throws RecognitionException {
		try {
			int _type = DESCRIPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:79:12: ( 'DESCRIPTION' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:79:14: 'DESCRIPTION'
			{
			match("DESCRIPTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DESCRIPTION"

	// $ANTLR start "INVOKE_FLOW"
	public final void mINVOKE_FLOW() throws RecognitionException {
		try {
			int _type = INVOKE_FLOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:80:12: ( 'INVOKE_FLOW' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:80:14: 'INVOKE_FLOW'
			{
			match("INVOKE_FLOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INVOKE_FLOW"

	// $ANTLR start "NEXT"
	public final void mNEXT() throws RecognitionException {
		try {
			int _type = NEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:81:5: ( 'NEXT' )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:81:7: 'NEXT'
			{
			match("NEXT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEXT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:82:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+ )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:82:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
			{
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:82:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "QUALIFIED_NAME"
	public final void mQUALIFIED_NAME() throws RecognitionException {
		try {
			int _type = QUALIFIED_NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:83:15: ( ID ( '.' ID )* )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:83:17: ID ( '.' ID )*
			{
			mID(); 

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:83:20: ( '.' ID )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='.') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:83:21: '.' ID
					{
					match('.'); 
					mID(); 

					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUALIFIED_NAME"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:8: ( WS | QUOTED_STRING | SEPARATOR | PACKAGE | ACTORS | ENDPACKAGE | USECASE | EXTENDS | PRECONDITIONS | POSTCONDITIONS | ENDUSECASE | AS | BASICFLOW | ENDFLOW | WITHPOSTCONDITION | EXCEPTIONFLOW | IF | THEN | ALTERNATIVE_FLOW | PARALLEL_FLOW | CONTINUEWITH | INVOKEUSECASE | STEP | PARALLEL_STEP | BY | TYPE | ALTERNATIVES | ELSE | PERSON | SYSTEM | ORGANIZATION | INPUT | OUTPUT | PROCESS | MIX | FINALSTATE | CONDITION | LOCAL_ALTERNATIVE | ALT_FLOW_ALT | NAME | DESCRIPTION | INVOKE_FLOW | NEXT | ID | QUALIFIED_NAME )
		int alt5=45;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:10: WS
				{
				mWS(); 

				}
				break;
			case 2 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:13: QUOTED_STRING
				{
				mQUOTED_STRING(); 

				}
				break;
			case 3 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:27: SEPARATOR
				{
				mSEPARATOR(); 

				}
				break;
			case 4 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:37: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 5 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:45: ACTORS
				{
				mACTORS(); 

				}
				break;
			case 6 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:52: ENDPACKAGE
				{
				mENDPACKAGE(); 

				}
				break;
			case 7 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:63: USECASE
				{
				mUSECASE(); 

				}
				break;
			case 8 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:71: EXTENDS
				{
				mEXTENDS(); 

				}
				break;
			case 9 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:79: PRECONDITIONS
				{
				mPRECONDITIONS(); 

				}
				break;
			case 10 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:93: POSTCONDITIONS
				{
				mPOSTCONDITIONS(); 

				}
				break;
			case 11 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:108: ENDUSECASE
				{
				mENDUSECASE(); 

				}
				break;
			case 12 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:119: AS
				{
				mAS(); 

				}
				break;
			case 13 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:122: BASICFLOW
				{
				mBASICFLOW(); 

				}
				break;
			case 14 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:132: ENDFLOW
				{
				mENDFLOW(); 

				}
				break;
			case 15 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:140: WITHPOSTCONDITION
				{
				mWITHPOSTCONDITION(); 

				}
				break;
			case 16 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:158: EXCEPTIONFLOW
				{
				mEXCEPTIONFLOW(); 

				}
				break;
			case 17 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:172: IF
				{
				mIF(); 

				}
				break;
			case 18 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:175: THEN
				{
				mTHEN(); 

				}
				break;
			case 19 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:180: ALTERNATIVE_FLOW
				{
				mALTERNATIVE_FLOW(); 

				}
				break;
			case 20 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:197: PARALLEL_FLOW
				{
				mPARALLEL_FLOW(); 

				}
				break;
			case 21 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:211: CONTINUEWITH
				{
				mCONTINUEWITH(); 

				}
				break;
			case 22 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:224: INVOKEUSECASE
				{
				mINVOKEUSECASE(); 

				}
				break;
			case 23 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:238: STEP
				{
				mSTEP(); 

				}
				break;
			case 24 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:243: PARALLEL_STEP
				{
				mPARALLEL_STEP(); 

				}
				break;
			case 25 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:257: BY
				{
				mBY(); 

				}
				break;
			case 26 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:260: TYPE
				{
				mTYPE(); 

				}
				break;
			case 27 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:265: ALTERNATIVES
				{
				mALTERNATIVES(); 

				}
				break;
			case 28 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:278: ELSE
				{
				mELSE(); 

				}
				break;
			case 29 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:283: PERSON
				{
				mPERSON(); 

				}
				break;
			case 30 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:290: SYSTEM
				{
				mSYSTEM(); 

				}
				break;
			case 31 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:297: ORGANIZATION
				{
				mORGANIZATION(); 

				}
				break;
			case 32 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:310: INPUT
				{
				mINPUT(); 

				}
				break;
			case 33 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:316: OUTPUT
				{
				mOUTPUT(); 

				}
				break;
			case 34 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:323: PROCESS
				{
				mPROCESS(); 

				}
				break;
			case 35 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:331: MIX
				{
				mMIX(); 

				}
				break;
			case 36 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:335: FINALSTATE
				{
				mFINALSTATE(); 

				}
				break;
			case 37 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:346: CONDITION
				{
				mCONDITION(); 

				}
				break;
			case 38 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:356: LOCAL_ALTERNATIVE
				{
				mLOCAL_ALTERNATIVE(); 

				}
				break;
			case 39 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:374: ALT_FLOW_ALT
				{
				mALT_FLOW_ALT(); 

				}
				break;
			case 40 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:387: NAME
				{
				mNAME(); 

				}
				break;
			case 41 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:392: DESCRIPTION
				{
				mDESCRIPTION(); 

				}
				break;
			case 42 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:404: INVOKE_FLOW
				{
				mINVOKE_FLOW(); 

				}
				break;
			case 43 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:416: NEXT
				{
				mNEXT(); 

				}
				break;
			case 44 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:421: ID
				{
				mID(); 

				}
				break;
			case 45 :
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseLexer.g:1:424: QUALIFIED_NAME
				{
				mQUALIFIED_NAME(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\4\uffff\30\34\2\uffff\1\34\1\101\6\34\1\111\1\34\1\113\30\34\1\uffff"+
		"\7\34\1\uffff\1\34\1\uffff\11\34\1\166\20\34\1\uffff\2\34\1\u008c\5\34"+
		"\1\u0092\1\u0093\1\34\1\u0095\3\34\1\uffff\4\34\1\u009d\1\u009e\12\34"+
		"\3\uffff\2\34\1\uffff\2\34\1\uffff\1\34\1\u00ae\2\uffff\1\34\1\uffff\7"+
		"\34\2\uffff\7\34\1\u00be\1\u00bf\4\34\1\uffff\1\34\1\uffff\1\34\1\u00c6"+
		"\1\34\1\u00c8\6\34\1\u00cf\2\34\1\u00d2\1\34\2\uffff\1\34\1\u00d5\1\34"+
		"\1\u00d7\1\uffff\1\34\1\uffff\1\34\1\uffff\6\34\1\uffff\2\34\1\uffff\2"+
		"\34\1\uffff\1\34\1\uffff\10\34\1\uffff\4\34\1\uffff\2\34\1\u00f5\4\34"+
		"\2\uffff\3\34\1\uffff\1\34\1\u00fe\1\uffff\10\34\1\uffff\2\34\1\u010a"+
		"\1\u010b\2\34\1\uffff\1\u010e\1\u010f\1\34\1\u0111\2\uffff\1\u0112\1\34"+
		"\2\uffff\1\34\2\uffff\1\u0115\1\34\1\uffff\2\34\1\u0119\1\uffff";
	static final String DFA5_eofS =
		"\u011a\uffff";
	static final String DFA5_minS =
		"\1\11\3\uffff\30\56\2\uffff\43\56\1\uffff\1\56\1\40\5\56\1\uffff\1\56"+
		"\1\uffff\32\56\1\146\5\56\1\40\11\56\1\uffff\20\56\3\uffff\2\56\1\uffff"+
		"\1\56\1\40\1\uffff\2\56\2\uffff\1\56\1\uffff\7\56\2\uffff\15\56\1\uffff"+
		"\1\40\1\uffff\17\56\2\uffff\4\56\1\uffff\1\56\1\uffff\1\56\1\uffff\6\56"+
		"\1\uffff\1\40\1\56\1\uffff\2\56\1\uffff\1\56\1\uffff\1\40\7\56\1\146\3"+
		"\56\1\40\1\uffff\7\56\2\uffff\3\56\1\uffff\2\56\1\uffff\6\56\1\40\1\56"+
		"\1\uffff\6\56\1\uffff\4\56\2\uffff\2\56\2\uffff\1\56\2\uffff\2\56\1\uffff"+
		"\3\56\1\uffff";
	static final String DFA5_maxS =
		"\1\172\3\uffff\30\172\2\uffff\43\172\1\uffff\7\172\1\uffff\1\172\1\uffff"+
		"\32\172\1\165\17\172\1\uffff\20\172\3\uffff\2\172\1\uffff\2\172\1\uffff"+
		"\2\172\2\uffff\1\172\1\uffff\7\172\2\uffff\15\172\1\uffff\1\172\1\uffff"+
		"\17\172\2\uffff\4\172\1\uffff\1\172\1\uffff\1\172\1\uffff\6\172\1\uffff"+
		"\2\172\1\uffff\2\172\1\uffff\1\172\1\uffff\10\172\1\163\4\172\1\uffff"+
		"\7\172\2\uffff\3\172\1\uffff\2\172\1\uffff\10\172\1\uffff\6\172\1\uffff"+
		"\4\172\2\uffff\2\172\2\uffff\1\172\2\uffff\2\172\1\uffff\3\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\30\uffff\1\54\1\55\43\uffff\1\14\7\uffff\1\31\1\uffff"+
		"\1\21\52\uffff\1\43\20\uffff\1\6\1\13\1\16\2\uffff\1\34\2\uffff\1\17\2"+
		"\uffff\1\22\1\32\1\uffff\1\27\7\uffff\1\50\1\53\15\uffff\1\15\1\uffff"+
		"\1\40\17\uffff\1\35\1\5\4\uffff\1\26\1\uffff\1\36\1\uffff\1\41\6\uffff"+
		"\1\4\2\uffff\1\42\2\uffff\1\10\1\uffff\1\7\15\uffff\1\25\7\uffff\1\24"+
		"\1\30\3\uffff\1\20\2\uffff\1\45\10\uffff\1\44\6\uffff\1\23\4\uffff\1\51"+
		"\1\52\2\uffff\1\33\1\37\1\uffff\1\47\1\11\2\uffff\1\12\3\uffff\1\46";
	static final String DFA5_specialS =
		"\u011a\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\1\2\uffff\1\1\22\uffff\1\1\1\uffff\1\2\11\uffff\1\3\3\uffff\12\27"+
			"\7\uffff\1\23\1\27\1\21\1\25\1\27\1\20\2\27\1\26\2\27\1\22\1\27\1\24"+
			"\14\27\4\uffff\1\27\1\uffff\1\5\1\10\1\14\1\27\1\6\3\27\1\12\3\27\1\17"+
			"\1\27\1\16\1\4\2\27\1\15\1\13\1\7\1\27\1\11\3\27",
			"",
			"",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\30\3\27\1\33"+
			"\11\27\1\32\2\27\1\31\10\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\2\27\1\36\10"+
			"\27\1\40\6\27\1\37\7\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27\1\43\1"+
			"\27\1\41\11\27\1\42\2\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\44\7"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\45\27\27\1"+
			"\46\1\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\47\21"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\5\27\1\50\7\27"+
			"\1\51\14\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\7\27\1\52\20"+
			"\27\1\53\1\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\54\13"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\55\4"+
			"\27\1\56\1\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27\1\57\2"+
			"\27\1\60\5\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\61\21"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\10\27\1\62\21\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\16\27\1\63\13\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\16\27\1\64\13\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\13\27\1\65\16\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\1\66\3\27\1\67\25\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\4\27\1\70\25\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\15\27\1\71\14\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\2\27\1\72\16"+
			"\27\1\73\10\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\74\11"+
			"\27\1\75\13\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\76\7"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27\1\77\10"+
			"\27",
			"",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\100\6"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\102\6"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\3\27\1\103\26"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\2\27\1\105\20"+
			"\27\1\104\6\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\106\7"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\107\25"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\110\7"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\112\6"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\17\27\1\115\5"+
			"\27\1\114\4\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\116\25"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\17\27\1\117\12"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\120\14"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\121\25"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\122\7"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\6\27\1\123\23"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\124\6"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\27\27\1\125\2"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\15\27\1\126\14\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\15\27\1\127\14\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\2\27\1\130\27\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\23\27\1\131\6\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\14\27\1\132\15\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\27\27\1\133\2\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\22\27\1\134\7\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\25\27\1\135\4\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\12\27\1\136\17"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\137\31\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\2\27\1\140\27"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\2\27\1\141\27"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\142\6"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\143\7"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\144\13"+
			"\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\145\25"+
			"\27",
			"\1\146\15\uffff\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\147\25"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\150\25"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\151\25"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\2\27\1\152\27"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\153\21"+
			"\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\7\27\1\154\22"+
			"\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\155\13"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\24\27\1\156\5"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\157\14"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\160\25"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\161\6"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\17\27\1\162\12"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\163\6"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\164\31\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\17\27\1\165\12"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\1\167\31\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\3\27\1\170\26\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\1\171\31\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\172\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\4\27\1\173\25\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\23\27\1\174\6\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\2\27\1\175\27\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\16\27\1\176\13\27\4\uffff\1\27\1\uffff\32"+
			"\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\177\31\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27\1\u0080"+
			"\16\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\u0081"+
			"\13\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\u0082"+
			"\25\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\2\27\1\u0083"+
			"\27\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\u0084"+
			"\13\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27\1\u0085"+
			"\10\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27\1\u0086"+
			"\10\27",
			"\1\u0089\11\uffff\1\u0087\4\uffff\1\u0088",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\u008a"+
			"\14\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\17\27\1\u008b"+
			"\12\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\u008d\31\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\2\27\1\u008e"+
			"\27\27",
			"\1\u008f\15\uffff\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\12\27\1\u0090"+
			"\17\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\u0091"+
			"\6\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\u0094"+
			"\21\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\u0096"+
			"\25\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\u0097"+
			"\14\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\24\27\1\u0098"+
			"\5\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\13\27\1\u0099\16\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\10\27\1\u009a\21\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\13\27\1\u009b\16\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\5\27\1\u009c\24\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\21\27\1\u009f\10\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\12\27\1\u00a0\17\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\6\27\1\u00a1"+
			"\23\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27\1\u00a2"+
			"\16\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\u00a3"+
			"\14\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u00a4"+
			"\7\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\u00a5"+
			"\13\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\u00a6"+
			"\14\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u00a7"+
			"\7\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\u00a8"+
			"\14\27",
			"",
			"",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\3\27\1\u00a9"+
			"\26\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\u00aa"+
			"\6\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u00ab"+
			"\7\27",
			"\1\u00ac\15\uffff\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\u00ad"+
			"\25\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\u00af"+
			"\14\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\14\27\1\u00b0"+
			"\15\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\u00b1"+
			"\21\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\u00b2"+
			"\6\27",
			"\1\35\1\uffff\12\27\7\uffff\22\27\1\u00b3\7\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\23\27\1\u00b4\6\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\u00b5\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\13\27\1\u00b6\16\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"",
			"",
			"\1\35\1\uffff\12\27\7\uffff\10\27\1\u00b7\21\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\4\27\1\u00b8\25\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\u00b9"+
			"\25\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\u00ba"+
			"\25\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\3\27\1\u00bb"+
			"\26\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u00bc"+
			"\7\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\u00bd"+
			"\14\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\u00c0\31\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u00c1"+
			"\7\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\u00c2"+
			"\21\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\u00c3"+
			"\25\27",
			"",
			"\1\u00c4\15\uffff\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\24\27\1\u00c5"+
			"\5\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\31\27\1\u00c7",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\23\27\1\u00c9\6\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\10\27\1\u00ca\21\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\1\u00cb\31\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\16\27\1\u00cc\13\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\17\27\1\u00cd\12\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\u00ce\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27\1\u00d0"+
			"\16\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\u00d1"+
			"\21\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\3\27\1\u00d3"+
			"\26\27",
			"",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\u00d4"+
			"\6\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\u00d6"+
			"\13\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\u00d8"+
			"\25\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\u00d9\31\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\1\u00da\31\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\16\27\1\u00db\13\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\13\27\1\u00dc\16\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\26\27\1\u00dd\3\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\23\27\1\u00de\6\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\5\27\1\u00df\24\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"",
			"\1\u00e0\15\uffff\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\u00e1"+
			"\6\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\u00e2"+
			"\21\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\u00e3"+
			"\21\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\u00e4"+
			"\14\27",
			"",
			"\1\u00e5\15\uffff\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\u00e6"+
			"\6\27",
			"\1\35\1\uffff\12\27\7\uffff\23\27\1\u00e7\6\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\15\27\1\u00e8\14\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\23\27\1\u00e9\6\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\u00ea\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\10\27\1\u00eb\21\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\13\27\1\u00ec\16\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\u00ed\14\uffff\1\u00ee",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\u00ef"+
			"\21\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\u00f0"+
			"\6\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\25\27\1\u00f1"+
			"\4\27",
			"\1\u00f2\15\uffff\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\u00f3"+
			"\21\27",
			"\1\35\1\uffff\12\27\7\uffff\4\27\1\u00f4\25\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\4\27\1\u00f6\25\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\1\u00f7\31\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\16\27\1\u00f8\13\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\16\27\1\u00f9\13\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\u00fa"+
			"\13\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\10\27\1\u00fb"+
			"\21\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\u00fc"+
			"\25\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\u00fd"+
			"\13\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\21\27\1\u00ff\10\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\13\27\1\u0100\16\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\15\27\1\u0101\14\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\26\27\1\u0102\3\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\u0103"+
			"\14\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\u0104"+
			"\13\27",
			"\1\u0105\15\uffff\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff"+
			"\22\27\1\u0106\7\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\u0107"+
			"\14\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\15\27\1\u0108\14\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\23\27\1\u0109\6\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u010c"+
			"\7\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\u010d"+
			"\14\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\1\u0110\31\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u0113"+
			"\7\27",
			"",
			"",
			"\1\35\1\uffff\12\27\7\uffff\23\27\1\u0114\6\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"",
			"",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\35\1\uffff\12\27\7\uffff\10\27\1\u0116\21\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"",
			"\1\35\1\uffff\12\27\7\uffff\25\27\1\u0117\4\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\4\27\1\u0118\25\27\4\uffff\1\27\1\uffff"+
			"\32\27",
			"\1\35\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WS | QUOTED_STRING | SEPARATOR | PACKAGE | ACTORS | ENDPACKAGE | USECASE | EXTENDS | PRECONDITIONS | POSTCONDITIONS | ENDUSECASE | AS | BASICFLOW | ENDFLOW | WITHPOSTCONDITION | EXCEPTIONFLOW | IF | THEN | ALTERNATIVE_FLOW | PARALLEL_FLOW | CONTINUEWITH | INVOKEUSECASE | STEP | PARALLEL_STEP | BY | TYPE | ALTERNATIVES | ELSE | PERSON | SYSTEM | ORGANIZATION | INPUT | OUTPUT | PROCESS | MIX | FINALSTATE | CONDITION | LOCAL_ALTERNATIVE | ALT_FLOW_ALT | NAME | DESCRIPTION | INVOKE_FLOW | NEXT | ID | QUALIFIED_NAME );";
		}
	}

}
