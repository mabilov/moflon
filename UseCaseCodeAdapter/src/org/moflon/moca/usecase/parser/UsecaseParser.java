// $ANTLR 3.5.2 C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g 2015-04-17 16:09:13

package org.moflon.moca.usecase.parser; 
import java.util.Collection;
import Moca.MocaFactory;
import Moca.Problem;
import Moca.ProblemType;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class UsecaseParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTORS", "ALTERNATIVES", "ALTERNATIVE_FLOW", 
		"ALT_FLOW_ALT", "AS", "BASICFLOW", "BY", "CONDITION", "CONTINUEWITH", 
		"DESCRIPTION", "ELSE", "ENDFLOW", "ENDPACKAGE", "ENDUSECASE", "EXCEPTIONFLOW", 
		"EXTENDS", "FINALSTATE", "ID", "IF", "INPUT", "INVOKEUSECASE", "INVOKE_FLOW", 
		"LOCAL_ALTERNATIVE", "MIX", "NAME", "NEXT", "ORGANIZATION", "OUTPUT", 
		"PACKAGE", "PARALLEL_FLOW", "PARALLEL_STEP", "PERSON", "POSTCONDITIONS", 
		"PRECONDITIONS", "PROCESS", "QUALIFIED_NAME", "QUOTED_STRING", "SEPARATOR", 
		"STEP", "SYSTEM", "THEN", "TYPE", "USECASE", "WITHPOSTCONDITION", "WS"
	};
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public UsecaseParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public UsecaseParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return UsecaseParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g"; }


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


	public static class main_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:48:1: main : ( packageRule )+ ;
	public final UsecaseParser.main_return main() throws RecognitionException {
		UsecaseParser.main_return retval = new UsecaseParser.main_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope packageRule1 =null;


		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:48:5: ( ( packageRule )+ )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:48:7: ( packageRule )+
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:48:7: ( packageRule )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==PACKAGE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:48:7: packageRule
					{
					pushFollow(FOLLOW_packageRule_in_main61);
					packageRule1=packageRule();
					state._fsp--;

					adaptor.addChild(root_0, packageRule1.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main"


	public static class packageRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "packageRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:49:1: packageRule : PACKAGE QUALIFIED_NAME descriptionRule ( actorsRule )? useCasesRule ENDPACKAGE -> ^( QUALIFIED_NAME descriptionRule ( actorsRule )? useCasesRule ) ;
	public final UsecaseParser.packageRule_return packageRule() throws RecognitionException {
		UsecaseParser.packageRule_return retval = new UsecaseParser.packageRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PACKAGE2=null;
		Token QUALIFIED_NAME3=null;
		Token ENDPACKAGE7=null;
		ParserRuleReturnScope descriptionRule4 =null;
		ParserRuleReturnScope actorsRule5 =null;
		ParserRuleReturnScope useCasesRule6 =null;

		Object PACKAGE2_tree=null;
		Object QUALIFIED_NAME3_tree=null;
		Object ENDPACKAGE7_tree=null;
		RewriteRuleTokenStream stream_PACKAGE=new RewriteRuleTokenStream(adaptor,"token PACKAGE");
		RewriteRuleTokenStream stream_QUALIFIED_NAME=new RewriteRuleTokenStream(adaptor,"token QUALIFIED_NAME");
		RewriteRuleTokenStream stream_ENDPACKAGE=new RewriteRuleTokenStream(adaptor,"token ENDPACKAGE");
		RewriteRuleSubtreeStream stream_actorsRule=new RewriteRuleSubtreeStream(adaptor,"rule actorsRule");
		RewriteRuleSubtreeStream stream_descriptionRule=new RewriteRuleSubtreeStream(adaptor,"rule descriptionRule");
		RewriteRuleSubtreeStream stream_useCasesRule=new RewriteRuleSubtreeStream(adaptor,"rule useCasesRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:49:12: ( PACKAGE QUALIFIED_NAME descriptionRule ( actorsRule )? useCasesRule ENDPACKAGE -> ^( QUALIFIED_NAME descriptionRule ( actorsRule )? useCasesRule ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:49:14: PACKAGE QUALIFIED_NAME descriptionRule ( actorsRule )? useCasesRule ENDPACKAGE
			{
			PACKAGE2=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_packageRule68);  
			stream_PACKAGE.add(PACKAGE2);

			QUALIFIED_NAME3=(Token)match(input,QUALIFIED_NAME,FOLLOW_QUALIFIED_NAME_in_packageRule70);  
			stream_QUALIFIED_NAME.add(QUALIFIED_NAME3);

			pushFollow(FOLLOW_descriptionRule_in_packageRule72);
			descriptionRule4=descriptionRule();
			state._fsp--;

			stream_descriptionRule.add(descriptionRule4.getTree());
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:50:2: ( actorsRule )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ACTORS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:50:2: actorsRule
					{
					pushFollow(FOLLOW_actorsRule_in_packageRule76);
					actorsRule5=actorsRule();
					state._fsp--;

					stream_actorsRule.add(actorsRule5.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_useCasesRule_in_packageRule79);
			useCasesRule6=useCasesRule();
			state._fsp--;

			stream_useCasesRule.add(useCasesRule6.getTree());
			ENDPACKAGE7=(Token)match(input,ENDPACKAGE,FOLLOW_ENDPACKAGE_in_packageRule81);  
			stream_ENDPACKAGE.add(ENDPACKAGE7);

			// AST REWRITE
			// elements: descriptionRule, QUALIFIED_NAME, useCasesRule, actorsRule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 51:2: -> ^( QUALIFIED_NAME descriptionRule ( actorsRule )? useCasesRule )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:51:5: ^( QUALIFIED_NAME descriptionRule ( actorsRule )? useCasesRule )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_QUALIFIED_NAME.nextNode(), root_1);
				adaptor.addChild(root_1, stream_descriptionRule.nextTree());
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:51:38: ( actorsRule )?
				if ( stream_actorsRule.hasNext() ) {
					adaptor.addChild(root_1, stream_actorsRule.nextTree());
				}
				stream_actorsRule.reset();

				adaptor.addChild(root_1, stream_useCasesRule.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "packageRule"


	public static class actorsRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actorsRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:52:1: actorsRule : ACTORS ( actorRule )+ -> ^( ACTORS ( actorRule )+ ) ;
	public final UsecaseParser.actorsRule_return actorsRule() throws RecognitionException {
		UsecaseParser.actorsRule_return retval = new UsecaseParser.actorsRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ACTORS8=null;
		ParserRuleReturnScope actorRule9 =null;

		Object ACTORS8_tree=null;
		RewriteRuleTokenStream stream_ACTORS=new RewriteRuleTokenStream(adaptor,"token ACTORS");
		RewriteRuleSubtreeStream stream_actorRule=new RewriteRuleSubtreeStream(adaptor,"rule actorRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:52:11: ( ACTORS ( actorRule )+ -> ^( ACTORS ( actorRule )+ ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:52:13: ACTORS ( actorRule )+
			{
			ACTORS8=(Token)match(input,ACTORS,FOLLOW_ACTORS_in_actorsRule102);  
			stream_ACTORS.add(ACTORS8);

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:52:20: ( actorRule )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:52:20: actorRule
					{
					pushFollow(FOLLOW_actorRule_in_actorsRule104);
					actorRule9=actorRule();
					state._fsp--;

					stream_actorRule.add(actorRule9.getTree());
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// AST REWRITE
			// elements: actorRule, ACTORS
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 52:31: -> ^( ACTORS ( actorRule )+ )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:52:34: ^( ACTORS ( actorRule )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_ACTORS.nextNode(), root_1);
				if ( !(stream_actorRule.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_actorRule.hasNext() ) {
					adaptor.addChild(root_1, stream_actorRule.nextTree());
				}
				stream_actorRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actorsRule"


	public static class actorRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actorRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:53:1: actorRule : ID AS actorTypeRule descriptionRule ( extendRule )? -> ^( ID actorTypeRule descriptionRule ( extendRule )? ) ;
	public final UsecaseParser.actorRule_return actorRule() throws RecognitionException {
		UsecaseParser.actorRule_return retval = new UsecaseParser.actorRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID10=null;
		Token AS11=null;
		ParserRuleReturnScope actorTypeRule12 =null;
		ParserRuleReturnScope descriptionRule13 =null;
		ParserRuleReturnScope extendRule14 =null;

		Object ID10_tree=null;
		Object AS11_tree=null;
		RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_descriptionRule=new RewriteRuleSubtreeStream(adaptor,"rule descriptionRule");
		RewriteRuleSubtreeStream stream_extendRule=new RewriteRuleSubtreeStream(adaptor,"rule extendRule");
		RewriteRuleSubtreeStream stream_actorTypeRule=new RewriteRuleSubtreeStream(adaptor,"rule actorTypeRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:53:10: ( ID AS actorTypeRule descriptionRule ( extendRule )? -> ^( ID actorTypeRule descriptionRule ( extendRule )? ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:53:12: ID AS actorTypeRule descriptionRule ( extendRule )?
			{
			ID10=(Token)match(input,ID,FOLLOW_ID_in_actorRule120);  
			stream_ID.add(ID10);

			AS11=(Token)match(input,AS,FOLLOW_AS_in_actorRule122);  
			stream_AS.add(AS11);

			pushFollow(FOLLOW_actorTypeRule_in_actorRule124);
			actorTypeRule12=actorTypeRule();
			state._fsp--;

			stream_actorTypeRule.add(actorTypeRule12.getTree());
			pushFollow(FOLLOW_descriptionRule_in_actorRule126);
			descriptionRule13=descriptionRule();
			state._fsp--;

			stream_descriptionRule.add(descriptionRule13.getTree());
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:53:48: ( extendRule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==EXTENDS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:53:48: extendRule
					{
					pushFollow(FOLLOW_extendRule_in_actorRule128);
					extendRule14=extendRule();
					state._fsp--;

					stream_extendRule.add(extendRule14.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: actorTypeRule, descriptionRule, ID, extendRule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 54:2: -> ^( ID actorTypeRule descriptionRule ( extendRule )? )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:54:5: ^( ID actorTypeRule descriptionRule ( extendRule )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
				adaptor.addChild(root_1, stream_actorTypeRule.nextTree());
				adaptor.addChild(root_1, stream_descriptionRule.nextTree());
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:54:40: ( extendRule )?
				if ( stream_extendRule.hasNext() ) {
					adaptor.addChild(root_1, stream_extendRule.nextTree());
				}
				stream_extendRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actorRule"


	public static class actorTypeRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actorTypeRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:55:1: actorTypeRule : actorTypeEnumRule -> ^( TYPE actorTypeEnumRule ) ;
	public final UsecaseParser.actorTypeRule_return actorTypeRule() throws RecognitionException {
		UsecaseParser.actorTypeRule_return retval = new UsecaseParser.actorTypeRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope actorTypeEnumRule15 =null;

		RewriteRuleSubtreeStream stream_actorTypeEnumRule=new RewriteRuleSubtreeStream(adaptor,"rule actorTypeEnumRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:55:14: ( actorTypeEnumRule -> ^( TYPE actorTypeEnumRule ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:55:16: actorTypeEnumRule
			{
			pushFollow(FOLLOW_actorTypeEnumRule_in_actorTypeRule149);
			actorTypeEnumRule15=actorTypeEnumRule();
			state._fsp--;

			stream_actorTypeEnumRule.add(actorTypeEnumRule15.getTree());
			// AST REWRITE
			// elements: actorTypeEnumRule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 55:34: -> ^( TYPE actorTypeEnumRule )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:55:37: ^( TYPE actorTypeEnumRule )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);
				adaptor.addChild(root_1, stream_actorTypeEnumRule.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actorTypeRule"


	public static class useCasesRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "useCasesRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:56:1: useCasesRule : ( usecaseRule )* -> ^( USECASE ( usecaseRule )* ) ;
	public final UsecaseParser.useCasesRule_return useCasesRule() throws RecognitionException {
		UsecaseParser.useCasesRule_return retval = new UsecaseParser.useCasesRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope usecaseRule16 =null;

		RewriteRuleSubtreeStream stream_usecaseRule=new RewriteRuleSubtreeStream(adaptor,"rule usecaseRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:56:13: ( ( usecaseRule )* -> ^( USECASE ( usecaseRule )* ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:56:15: ( usecaseRule )*
			{
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:56:15: ( usecaseRule )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==USECASE) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:56:15: usecaseRule
					{
					pushFollow(FOLLOW_usecaseRule_in_useCasesRule163);
					usecaseRule16=usecaseRule();
					state._fsp--;

					stream_usecaseRule.add(usecaseRule16.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: usecaseRule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 56:28: -> ^( USECASE ( usecaseRule )* )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:56:31: ^( USECASE ( usecaseRule )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(USECASE, "USECASE"), root_1);
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:56:41: ( usecaseRule )*
				while ( stream_usecaseRule.hasNext() ) {
					adaptor.addChild(root_1, stream_usecaseRule.nextTree());
				}
				stream_usecaseRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "useCasesRule"


	public static class usecaseRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "usecaseRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:57:1: usecaseRule : USECASE ID descriptionRule ( extendRule )? ( preconditionRule )? ( flowRule )* ENDUSECASE -> ^( ID descriptionRule ( extendRule )? ( preconditionRule )? ( flowRule )* ) ;
	public final UsecaseParser.usecaseRule_return usecaseRule() throws RecognitionException {
		UsecaseParser.usecaseRule_return retval = new UsecaseParser.usecaseRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token USECASE17=null;
		Token ID18=null;
		Token ENDUSECASE23=null;
		ParserRuleReturnScope descriptionRule19 =null;
		ParserRuleReturnScope extendRule20 =null;
		ParserRuleReturnScope preconditionRule21 =null;
		ParserRuleReturnScope flowRule22 =null;

		Object USECASE17_tree=null;
		Object ID18_tree=null;
		Object ENDUSECASE23_tree=null;
		RewriteRuleTokenStream stream_USECASE=new RewriteRuleTokenStream(adaptor,"token USECASE");
		RewriteRuleTokenStream stream_ENDUSECASE=new RewriteRuleTokenStream(adaptor,"token ENDUSECASE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_preconditionRule=new RewriteRuleSubtreeStream(adaptor,"rule preconditionRule");
		RewriteRuleSubtreeStream stream_descriptionRule=new RewriteRuleSubtreeStream(adaptor,"rule descriptionRule");
		RewriteRuleSubtreeStream stream_flowRule=new RewriteRuleSubtreeStream(adaptor,"rule flowRule");
		RewriteRuleSubtreeStream stream_extendRule=new RewriteRuleSubtreeStream(adaptor,"rule extendRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:57:12: ( USECASE ID descriptionRule ( extendRule )? ( preconditionRule )? ( flowRule )* ENDUSECASE -> ^( ID descriptionRule ( extendRule )? ( preconditionRule )? ( flowRule )* ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:57:14: USECASE ID descriptionRule ( extendRule )? ( preconditionRule )? ( flowRule )* ENDUSECASE
			{
			USECASE17=(Token)match(input,USECASE,FOLLOW_USECASE_in_usecaseRule179);  
			stream_USECASE.add(USECASE17);

			ID18=(Token)match(input,ID,FOLLOW_ID_in_usecaseRule181);  
			stream_ID.add(ID18);

			pushFollow(FOLLOW_descriptionRule_in_usecaseRule183);
			descriptionRule19=descriptionRule();
			state._fsp--;

			stream_descriptionRule.add(descriptionRule19.getTree());
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:58:2: ( extendRule )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==EXTENDS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:58:2: extendRule
					{
					pushFollow(FOLLOW_extendRule_in_usecaseRule187);
					extendRule20=extendRule();
					state._fsp--;

					stream_extendRule.add(extendRule20.getTree());
					}
					break;

			}

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:58:14: ( preconditionRule )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==PRECONDITIONS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:58:14: preconditionRule
					{
					pushFollow(FOLLOW_preconditionRule_in_usecaseRule190);
					preconditionRule21=preconditionRule();
					state._fsp--;

					stream_preconditionRule.add(preconditionRule21.getTree());
					}
					break;

			}

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:58:32: ( flowRule )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==ALTERNATIVE_FLOW||LA8_0==BASICFLOW||LA8_0==EXCEPTIONFLOW||LA8_0==PARALLEL_FLOW) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:58:32: flowRule
					{
					pushFollow(FOLLOW_flowRule_in_usecaseRule193);
					flowRule22=flowRule();
					state._fsp--;

					stream_flowRule.add(flowRule22.getTree());
					}
					break;

				default :
					break loop8;
				}
			}

			ENDUSECASE23=(Token)match(input,ENDUSECASE,FOLLOW_ENDUSECASE_in_usecaseRule196);  
			stream_ENDUSECASE.add(ENDUSECASE23);

			// AST REWRITE
			// elements: preconditionRule, descriptionRule, flowRule, extendRule, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 59:2: -> ^( ID descriptionRule ( extendRule )? ( preconditionRule )? ( flowRule )* )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:59:5: ^( ID descriptionRule ( extendRule )? ( preconditionRule )? ( flowRule )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
				adaptor.addChild(root_1, stream_descriptionRule.nextTree());
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:59:26: ( extendRule )?
				if ( stream_extendRule.hasNext() ) {
					adaptor.addChild(root_1, stream_extendRule.nextTree());
				}
				stream_extendRule.reset();

				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:59:38: ( preconditionRule )?
				if ( stream_preconditionRule.hasNext() ) {
					adaptor.addChild(root_1, stream_preconditionRule.nextTree());
				}
				stream_preconditionRule.reset();

				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:59:56: ( flowRule )*
				while ( stream_flowRule.hasNext() ) {
					adaptor.addChild(root_1, stream_flowRule.nextTree());
				}
				stream_flowRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "usecaseRule"


	public static class flowRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "flowRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:60:1: flowRule : ( basicFlowRule | namedFlowRule );
	public final UsecaseParser.flowRule_return flowRule() throws RecognitionException {
		UsecaseParser.flowRule_return retval = new UsecaseParser.flowRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope basicFlowRule24 =null;
		ParserRuleReturnScope namedFlowRule25 =null;


		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:60:9: ( basicFlowRule | namedFlowRule )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==BASICFLOW) ) {
				alt9=1;
			}
			else if ( (LA9_0==ALTERNATIVE_FLOW||LA9_0==EXCEPTIONFLOW||LA9_0==PARALLEL_FLOW) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:60:11: basicFlowRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_basicFlowRule_in_flowRule221);
					basicFlowRule24=basicFlowRule();
					state._fsp--;

					adaptor.addChild(root_0, basicFlowRule24.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:60:27: namedFlowRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_namedFlowRule_in_flowRule225);
					namedFlowRule25=namedFlowRule();
					state._fsp--;

					adaptor.addChild(root_0, namedFlowRule25.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "flowRule"


	public static class namedFlowRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namedFlowRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:61:1: namedFlowRule : ( exceptionFlowRule | alternativeFlowRule | parallelflowRule );
	public final UsecaseParser.namedFlowRule_return namedFlowRule() throws RecognitionException {
		UsecaseParser.namedFlowRule_return retval = new UsecaseParser.namedFlowRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exceptionFlowRule26 =null;
		ParserRuleReturnScope alternativeFlowRule27 =null;
		ParserRuleReturnScope parallelflowRule28 =null;


		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:61:14: ( exceptionFlowRule | alternativeFlowRule | parallelflowRule )
			int alt10=3;
			switch ( input.LA(1) ) {
			case EXCEPTIONFLOW:
				{
				alt10=1;
				}
				break;
			case ALTERNATIVE_FLOW:
				{
				alt10=2;
				}
				break;
			case PARALLEL_FLOW:
				{
				alt10=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:61:16: exceptionFlowRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exceptionFlowRule_in_namedFlowRule231);
					exceptionFlowRule26=exceptionFlowRule();
					state._fsp--;

					adaptor.addChild(root_0, exceptionFlowRule26.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:61:36: alternativeFlowRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_alternativeFlowRule_in_namedFlowRule235);
					alternativeFlowRule27=alternativeFlowRule();
					state._fsp--;

					adaptor.addChild(root_0, alternativeFlowRule27.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:61:58: parallelflowRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_parallelflowRule_in_namedFlowRule239);
					parallelflowRule28=parallelflowRule();
					state._fsp--;

					adaptor.addChild(root_0, parallelflowRule28.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedFlowRule"


	public static class basicFlowRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "basicFlowRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:62:1: basicFlowRule : BASICFLOW ( stepRule )* ENDFLOW ( finalStateRule )? -> ^( BASICFLOW ( stepRule )* ( finalStateRule )? ) ;
	public final UsecaseParser.basicFlowRule_return basicFlowRule() throws RecognitionException {
		UsecaseParser.basicFlowRule_return retval = new UsecaseParser.basicFlowRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BASICFLOW29=null;
		Token ENDFLOW31=null;
		ParserRuleReturnScope stepRule30 =null;
		ParserRuleReturnScope finalStateRule32 =null;

		Object BASICFLOW29_tree=null;
		Object ENDFLOW31_tree=null;
		RewriteRuleTokenStream stream_BASICFLOW=new RewriteRuleTokenStream(adaptor,"token BASICFLOW");
		RewriteRuleTokenStream stream_ENDFLOW=new RewriteRuleTokenStream(adaptor,"token ENDFLOW");
		RewriteRuleSubtreeStream stream_finalStateRule=new RewriteRuleSubtreeStream(adaptor,"rule finalStateRule");
		RewriteRuleSubtreeStream stream_stepRule=new RewriteRuleSubtreeStream(adaptor,"rule stepRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:62:14: ( BASICFLOW ( stepRule )* ENDFLOW ( finalStateRule )? -> ^( BASICFLOW ( stepRule )* ( finalStateRule )? ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:62:16: BASICFLOW ( stepRule )* ENDFLOW ( finalStateRule )?
			{
			BASICFLOW29=(Token)match(input,BASICFLOW,FOLLOW_BASICFLOW_in_basicFlowRule245);  
			stream_BASICFLOW.add(BASICFLOW29);

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:62:26: ( stepRule )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==PARALLEL_STEP||LA11_0==STEP) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:62:26: stepRule
					{
					pushFollow(FOLLOW_stepRule_in_basicFlowRule247);
					stepRule30=stepRule();
					state._fsp--;

					stream_stepRule.add(stepRule30.getTree());
					}
					break;

				default :
					break loop11;
				}
			}

			ENDFLOW31=(Token)match(input,ENDFLOW,FOLLOW_ENDFLOW_in_basicFlowRule250);  
			stream_ENDFLOW.add(ENDFLOW31);

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:62:44: ( finalStateRule )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==WITHPOSTCONDITION) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:62:44: finalStateRule
					{
					pushFollow(FOLLOW_finalStateRule_in_basicFlowRule252);
					finalStateRule32=finalStateRule();
					state._fsp--;

					stream_finalStateRule.add(finalStateRule32.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: stepRule, finalStateRule, BASICFLOW
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:2: -> ^( BASICFLOW ( stepRule )* ( finalStateRule )? )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:63:5: ^( BASICFLOW ( stepRule )* ( finalStateRule )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_BASICFLOW.nextNode(), root_1);
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:63:17: ( stepRule )*
				while ( stream_stepRule.hasNext() ) {
					adaptor.addChild(root_1, stream_stepRule.nextTree());
				}
				stream_stepRule.reset();

				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:63:27: ( finalStateRule )?
				if ( stream_finalStateRule.hasNext() ) {
					adaptor.addChild(root_1, stream_finalStateRule.nextTree());
				}
				stream_finalStateRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "basicFlowRule"


	public static class exceptionFlowRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exceptionFlowRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:64:1: exceptionFlowRule : EXCEPTIONFLOW nameRule ifRule ( stepRule )* ENDFLOW ( finalStateRule )? -> ^( EXCEPTIONFLOW nameRule ifRule ( stepRule )* ( finalStateRule )? ) ;
	public final UsecaseParser.exceptionFlowRule_return exceptionFlowRule() throws RecognitionException {
		UsecaseParser.exceptionFlowRule_return retval = new UsecaseParser.exceptionFlowRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EXCEPTIONFLOW33=null;
		Token ENDFLOW37=null;
		ParserRuleReturnScope nameRule34 =null;
		ParserRuleReturnScope ifRule35 =null;
		ParserRuleReturnScope stepRule36 =null;
		ParserRuleReturnScope finalStateRule38 =null;

		Object EXCEPTIONFLOW33_tree=null;
		Object ENDFLOW37_tree=null;
		RewriteRuleTokenStream stream_EXCEPTIONFLOW=new RewriteRuleTokenStream(adaptor,"token EXCEPTIONFLOW");
		RewriteRuleTokenStream stream_ENDFLOW=new RewriteRuleTokenStream(adaptor,"token ENDFLOW");
		RewriteRuleSubtreeStream stream_nameRule=new RewriteRuleSubtreeStream(adaptor,"rule nameRule");
		RewriteRuleSubtreeStream stream_finalStateRule=new RewriteRuleSubtreeStream(adaptor,"rule finalStateRule");
		RewriteRuleSubtreeStream stream_ifRule=new RewriteRuleSubtreeStream(adaptor,"rule ifRule");
		RewriteRuleSubtreeStream stream_stepRule=new RewriteRuleSubtreeStream(adaptor,"rule stepRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:64:18: ( EXCEPTIONFLOW nameRule ifRule ( stepRule )* ENDFLOW ( finalStateRule )? -> ^( EXCEPTIONFLOW nameRule ifRule ( stepRule )* ( finalStateRule )? ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:64:20: EXCEPTIONFLOW nameRule ifRule ( stepRule )* ENDFLOW ( finalStateRule )?
			{
			EXCEPTIONFLOW33=(Token)match(input,EXCEPTIONFLOW,FOLLOW_EXCEPTIONFLOW_in_exceptionFlowRule272);  
			stream_EXCEPTIONFLOW.add(EXCEPTIONFLOW33);

			pushFollow(FOLLOW_nameRule_in_exceptionFlowRule274);
			nameRule34=nameRule();
			state._fsp--;

			stream_nameRule.add(nameRule34.getTree());
			pushFollow(FOLLOW_ifRule_in_exceptionFlowRule278);
			ifRule35=ifRule();
			state._fsp--;

			stream_ifRule.add(ifRule35.getTree());
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:65:9: ( stepRule )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==PARALLEL_STEP||LA13_0==STEP) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:65:9: stepRule
					{
					pushFollow(FOLLOW_stepRule_in_exceptionFlowRule280);
					stepRule36=stepRule();
					state._fsp--;

					stream_stepRule.add(stepRule36.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			ENDFLOW37=(Token)match(input,ENDFLOW,FOLLOW_ENDFLOW_in_exceptionFlowRule283);  
			stream_ENDFLOW.add(ENDFLOW37);

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:65:27: ( finalStateRule )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==WITHPOSTCONDITION) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:65:27: finalStateRule
					{
					pushFollow(FOLLOW_finalStateRule_in_exceptionFlowRule285);
					finalStateRule38=finalStateRule();
					state._fsp--;

					stream_finalStateRule.add(finalStateRule38.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: nameRule, finalStateRule, EXCEPTIONFLOW, ifRule, stepRule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:2: -> ^( EXCEPTIONFLOW nameRule ifRule ( stepRule )* ( finalStateRule )? )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:66:5: ^( EXCEPTIONFLOW nameRule ifRule ( stepRule )* ( finalStateRule )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_EXCEPTIONFLOW.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nameRule.nextTree());
				adaptor.addChild(root_1, stream_ifRule.nextTree());
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:66:37: ( stepRule )*
				while ( stream_stepRule.hasNext() ) {
					adaptor.addChild(root_1, stream_stepRule.nextTree());
				}
				stream_stepRule.reset();

				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:66:47: ( finalStateRule )?
				if ( stream_finalStateRule.hasNext() ) {
					adaptor.addChild(root_1, stream_finalStateRule.nextTree());
				}
				stream_finalStateRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exceptionFlowRule"


	public static class alternativeFlowRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "alternativeFlowRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:67:1: alternativeFlowRule : ALTERNATIVE_FLOW nameRule ( stepRule )* ENDFLOW ( finalStateRule )? -> ^( ALTERNATIVE_FLOW nameRule ( stepRule )* ( finalStateRule )? ) ;
	public final UsecaseParser.alternativeFlowRule_return alternativeFlowRule() throws RecognitionException {
		UsecaseParser.alternativeFlowRule_return retval = new UsecaseParser.alternativeFlowRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ALTERNATIVE_FLOW39=null;
		Token ENDFLOW42=null;
		ParserRuleReturnScope nameRule40 =null;
		ParserRuleReturnScope stepRule41 =null;
		ParserRuleReturnScope finalStateRule43 =null;

		Object ALTERNATIVE_FLOW39_tree=null;
		Object ENDFLOW42_tree=null;
		RewriteRuleTokenStream stream_ALTERNATIVE_FLOW=new RewriteRuleTokenStream(adaptor,"token ALTERNATIVE_FLOW");
		RewriteRuleTokenStream stream_ENDFLOW=new RewriteRuleTokenStream(adaptor,"token ENDFLOW");
		RewriteRuleSubtreeStream stream_nameRule=new RewriteRuleSubtreeStream(adaptor,"rule nameRule");
		RewriteRuleSubtreeStream stream_finalStateRule=new RewriteRuleSubtreeStream(adaptor,"rule finalStateRule");
		RewriteRuleSubtreeStream stream_stepRule=new RewriteRuleSubtreeStream(adaptor,"rule stepRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:67:20: ( ALTERNATIVE_FLOW nameRule ( stepRule )* ENDFLOW ( finalStateRule )? -> ^( ALTERNATIVE_FLOW nameRule ( stepRule )* ( finalStateRule )? ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:67:22: ALTERNATIVE_FLOW nameRule ( stepRule )* ENDFLOW ( finalStateRule )?
			{
			ALTERNATIVE_FLOW39=(Token)match(input,ALTERNATIVE_FLOW,FOLLOW_ALTERNATIVE_FLOW_in_alternativeFlowRule309);  
			stream_ALTERNATIVE_FLOW.add(ALTERNATIVE_FLOW39);

			pushFollow(FOLLOW_nameRule_in_alternativeFlowRule311);
			nameRule40=nameRule();
			state._fsp--;

			stream_nameRule.add(nameRule40.getTree());
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:67:48: ( stepRule )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==PARALLEL_STEP||LA15_0==STEP) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:67:48: stepRule
					{
					pushFollow(FOLLOW_stepRule_in_alternativeFlowRule313);
					stepRule41=stepRule();
					state._fsp--;

					stream_stepRule.add(stepRule41.getTree());
					}
					break;

				default :
					break loop15;
				}
			}

			ENDFLOW42=(Token)match(input,ENDFLOW,FOLLOW_ENDFLOW_in_alternativeFlowRule316);  
			stream_ENDFLOW.add(ENDFLOW42);

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:67:66: ( finalStateRule )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==WITHPOSTCONDITION) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:67:66: finalStateRule
					{
					pushFollow(FOLLOW_finalStateRule_in_alternativeFlowRule318);
					finalStateRule43=finalStateRule();
					state._fsp--;

					stream_finalStateRule.add(finalStateRule43.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: nameRule, stepRule, finalStateRule, ALTERNATIVE_FLOW
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 68:2: -> ^( ALTERNATIVE_FLOW nameRule ( stepRule )* ( finalStateRule )? )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:68:5: ^( ALTERNATIVE_FLOW nameRule ( stepRule )* ( finalStateRule )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_ALTERNATIVE_FLOW.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nameRule.nextTree());
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:68:33: ( stepRule )*
				while ( stream_stepRule.hasNext() ) {
					adaptor.addChild(root_1, stream_stepRule.nextTree());
				}
				stream_stepRule.reset();

				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:68:43: ( finalStateRule )?
				if ( stream_finalStateRule.hasNext() ) {
					adaptor.addChild(root_1, stream_finalStateRule.nextTree());
				}
				stream_finalStateRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alternativeFlowRule"


	public static class parallelflowRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parallelflowRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:69:1: parallelflowRule : PARALLEL_FLOW nameRule ( stepRule )* ENDFLOW ( finalStateRule )? -> ^( PARALLEL_FLOW nameRule ( stepRule )* ( finalStateRule )? ) ;
	public final UsecaseParser.parallelflowRule_return parallelflowRule() throws RecognitionException {
		UsecaseParser.parallelflowRule_return retval = new UsecaseParser.parallelflowRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PARALLEL_FLOW44=null;
		Token ENDFLOW47=null;
		ParserRuleReturnScope nameRule45 =null;
		ParserRuleReturnScope stepRule46 =null;
		ParserRuleReturnScope finalStateRule48 =null;

		Object PARALLEL_FLOW44_tree=null;
		Object ENDFLOW47_tree=null;
		RewriteRuleTokenStream stream_PARALLEL_FLOW=new RewriteRuleTokenStream(adaptor,"token PARALLEL_FLOW");
		RewriteRuleTokenStream stream_ENDFLOW=new RewriteRuleTokenStream(adaptor,"token ENDFLOW");
		RewriteRuleSubtreeStream stream_nameRule=new RewriteRuleSubtreeStream(adaptor,"rule nameRule");
		RewriteRuleSubtreeStream stream_finalStateRule=new RewriteRuleSubtreeStream(adaptor,"rule finalStateRule");
		RewriteRuleSubtreeStream stream_stepRule=new RewriteRuleSubtreeStream(adaptor,"rule stepRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:69:17: ( PARALLEL_FLOW nameRule ( stepRule )* ENDFLOW ( finalStateRule )? -> ^( PARALLEL_FLOW nameRule ( stepRule )* ( finalStateRule )? ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:69:19: PARALLEL_FLOW nameRule ( stepRule )* ENDFLOW ( finalStateRule )?
			{
			PARALLEL_FLOW44=(Token)match(input,PARALLEL_FLOW,FOLLOW_PARALLEL_FLOW_in_parallelflowRule340);  
			stream_PARALLEL_FLOW.add(PARALLEL_FLOW44);

			pushFollow(FOLLOW_nameRule_in_parallelflowRule342);
			nameRule45=nameRule();
			state._fsp--;

			stream_nameRule.add(nameRule45.getTree());
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:69:42: ( stepRule )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==PARALLEL_STEP||LA17_0==STEP) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:69:42: stepRule
					{
					pushFollow(FOLLOW_stepRule_in_parallelflowRule344);
					stepRule46=stepRule();
					state._fsp--;

					stream_stepRule.add(stepRule46.getTree());
					}
					break;

				default :
					break loop17;
				}
			}

			ENDFLOW47=(Token)match(input,ENDFLOW,FOLLOW_ENDFLOW_in_parallelflowRule347);  
			stream_ENDFLOW.add(ENDFLOW47);

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:69:60: ( finalStateRule )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==WITHPOSTCONDITION) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:69:60: finalStateRule
					{
					pushFollow(FOLLOW_finalStateRule_in_parallelflowRule349);
					finalStateRule48=finalStateRule();
					state._fsp--;

					stream_finalStateRule.add(finalStateRule48.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: nameRule, stepRule, finalStateRule, PARALLEL_FLOW
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 70:2: -> ^( PARALLEL_FLOW nameRule ( stepRule )* ( finalStateRule )? )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:70:5: ^( PARALLEL_FLOW nameRule ( stepRule )* ( finalStateRule )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_PARALLEL_FLOW.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nameRule.nextTree());
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:70:30: ( stepRule )*
				while ( stream_stepRule.hasNext() ) {
					adaptor.addChild(root_1, stream_stepRule.nextTree());
				}
				stream_stepRule.reset();

				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:70:40: ( finalStateRule )?
				if ( stream_finalStateRule.hasNext() ) {
					adaptor.addChild(root_1, stream_finalStateRule.nextTree());
				}
				stream_finalStateRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parallelflowRule"


	public static class stepAlternativeRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stepAlternativeRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:71:1: stepAlternativeRule : ( conditionRule | localAltRule | alternativeFlowAlternativeRule );
	public final UsecaseParser.stepAlternativeRule_return stepAlternativeRule() throws RecognitionException {
		UsecaseParser.stepAlternativeRule_return retval = new UsecaseParser.stepAlternativeRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope conditionRule49 =null;
		ParserRuleReturnScope localAltRule50 =null;
		ParserRuleReturnScope alternativeFlowAlternativeRule51 =null;


		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:71:20: ( conditionRule | localAltRule | alternativeFlowAlternativeRule )
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==IF) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==QUOTED_STRING) ) {
					int LA19_2 = input.LA(3);
					if ( (LA19_2==THEN) ) {
						switch ( input.LA(4) ) {
						case CONTINUEWITH:
						case ELSE:
						case IF:
							{
							alt19=1;
							}
							break;
						case INVOKEUSECASE:
						case QUOTED_STRING:
							{
							alt19=2;
							}
							break;
						case ALTERNATIVE_FLOW:
							{
							alt19=3;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 19, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:71:22: conditionRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_conditionRule_in_stepAlternativeRule371);
					conditionRule49=conditionRule();
					state._fsp--;

					adaptor.addChild(root_0, conditionRule49.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:71:38: localAltRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_localAltRule_in_stepAlternativeRule375);
					localAltRule50=localAltRule();
					state._fsp--;

					adaptor.addChild(root_0, localAltRule50.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:71:53: alternativeFlowAlternativeRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_alternativeFlowAlternativeRule_in_stepAlternativeRule379);
					alternativeFlowAlternativeRule51=alternativeFlowAlternativeRule();
					state._fsp--;

					adaptor.addChild(root_0, alternativeFlowAlternativeRule51.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stepAlternativeRule"


	public static class conditionRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditionRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:72:1: conditionRule : ifRule ( continuationRule )? -> ^( CONDITION ifRule ( continuationRule )? ) ;
	public final UsecaseParser.conditionRule_return conditionRule() throws RecognitionException {
		UsecaseParser.conditionRule_return retval = new UsecaseParser.conditionRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ifRule52 =null;
		ParserRuleReturnScope continuationRule53 =null;

		RewriteRuleSubtreeStream stream_ifRule=new RewriteRuleSubtreeStream(adaptor,"rule ifRule");
		RewriteRuleSubtreeStream stream_continuationRule=new RewriteRuleSubtreeStream(adaptor,"rule continuationRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:72:14: ( ifRule ( continuationRule )? -> ^( CONDITION ifRule ( continuationRule )? ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:72:16: ifRule ( continuationRule )?
			{
			pushFollow(FOLLOW_ifRule_in_conditionRule385);
			ifRule52=ifRule();
			state._fsp--;

			stream_ifRule.add(ifRule52.getTree());
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:72:23: ( continuationRule )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==CONTINUEWITH) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:72:23: continuationRule
					{
					pushFollow(FOLLOW_continuationRule_in_conditionRule387);
					continuationRule53=continuationRule();
					state._fsp--;

					stream_continuationRule.add(continuationRule53.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ifRule, continuationRule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 72:41: -> ^( CONDITION ifRule ( continuationRule )? )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:72:44: ^( CONDITION ifRule ( continuationRule )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_1);
				adaptor.addChild(root_1, stream_ifRule.nextTree());
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:72:63: ( continuationRule )?
				if ( stream_continuationRule.hasNext() ) {
					adaptor.addChild(root_1, stream_continuationRule.nextTree());
				}
				stream_continuationRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionRule"


	public static class localAltRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "localAltRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:73:1: localAltRule : ifRule localAltThenRule ( continuationRule )? -> ^( LOCAL_ALTERNATIVE ifRule localAltThenRule ( continuationRule )? ) ;
	public final UsecaseParser.localAltRule_return localAltRule() throws RecognitionException {
		UsecaseParser.localAltRule_return retval = new UsecaseParser.localAltRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ifRule54 =null;
		ParserRuleReturnScope localAltThenRule55 =null;
		ParserRuleReturnScope continuationRule56 =null;

		RewriteRuleSubtreeStream stream_localAltThenRule=new RewriteRuleSubtreeStream(adaptor,"rule localAltThenRule");
		RewriteRuleSubtreeStream stream_ifRule=new RewriteRuleSubtreeStream(adaptor,"rule ifRule");
		RewriteRuleSubtreeStream stream_continuationRule=new RewriteRuleSubtreeStream(adaptor,"rule continuationRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:73:13: ( ifRule localAltThenRule ( continuationRule )? -> ^( LOCAL_ALTERNATIVE ifRule localAltThenRule ( continuationRule )? ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:73:15: ifRule localAltThenRule ( continuationRule )?
			{
			pushFollow(FOLLOW_ifRule_in_localAltRule405);
			ifRule54=ifRule();
			state._fsp--;

			stream_ifRule.add(ifRule54.getTree());
			pushFollow(FOLLOW_localAltThenRule_in_localAltRule407);
			localAltThenRule55=localAltThenRule();
			state._fsp--;

			stream_localAltThenRule.add(localAltThenRule55.getTree());
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:73:39: ( continuationRule )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CONTINUEWITH) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:73:39: continuationRule
					{
					pushFollow(FOLLOW_continuationRule_in_localAltRule409);
					continuationRule56=continuationRule();
					state._fsp--;

					stream_continuationRule.add(continuationRule56.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ifRule, localAltThenRule, continuationRule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 74:2: -> ^( LOCAL_ALTERNATIVE ifRule localAltThenRule ( continuationRule )? )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:74:5: ^( LOCAL_ALTERNATIVE ifRule localAltThenRule ( continuationRule )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOCAL_ALTERNATIVE, "LOCAL_ALTERNATIVE"), root_1);
				adaptor.addChild(root_1, stream_ifRule.nextTree());
				adaptor.addChild(root_1, stream_localAltThenRule.nextTree());
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:74:49: ( continuationRule )?
				if ( stream_continuationRule.hasNext() ) {
					adaptor.addChild(root_1, stream_continuationRule.nextTree());
				}
				stream_continuationRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "localAltRule"


	public static class alternativeFlowAlternativeRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "alternativeFlowAlternativeRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:75:1: alternativeFlowAlternativeRule : ifRule ALTERNATIVE_FLOW ID ( continuationRule )? -> ^( ALT_FLOW_ALT ifRule ID ( continuationRule )? ) ;
	public final UsecaseParser.alternativeFlowAlternativeRule_return alternativeFlowAlternativeRule() throws RecognitionException {
		UsecaseParser.alternativeFlowAlternativeRule_return retval = new UsecaseParser.alternativeFlowAlternativeRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ALTERNATIVE_FLOW58=null;
		Token ID59=null;
		ParserRuleReturnScope ifRule57 =null;
		ParserRuleReturnScope continuationRule60 =null;

		Object ALTERNATIVE_FLOW58_tree=null;
		Object ID59_tree=null;
		RewriteRuleTokenStream stream_ALTERNATIVE_FLOW=new RewriteRuleTokenStream(adaptor,"token ALTERNATIVE_FLOW");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_ifRule=new RewriteRuleSubtreeStream(adaptor,"rule ifRule");
		RewriteRuleSubtreeStream stream_continuationRule=new RewriteRuleSubtreeStream(adaptor,"rule continuationRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:75:31: ( ifRule ALTERNATIVE_FLOW ID ( continuationRule )? -> ^( ALT_FLOW_ALT ifRule ID ( continuationRule )? ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:75:33: ifRule ALTERNATIVE_FLOW ID ( continuationRule )?
			{
			pushFollow(FOLLOW_ifRule_in_alternativeFlowAlternativeRule430);
			ifRule57=ifRule();
			state._fsp--;

			stream_ifRule.add(ifRule57.getTree());
			ALTERNATIVE_FLOW58=(Token)match(input,ALTERNATIVE_FLOW,FOLLOW_ALTERNATIVE_FLOW_in_alternativeFlowAlternativeRule432);  
			stream_ALTERNATIVE_FLOW.add(ALTERNATIVE_FLOW58);

			ID59=(Token)match(input,ID,FOLLOW_ID_in_alternativeFlowAlternativeRule434);  
			stream_ID.add(ID59);

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:75:60: ( continuationRule )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==CONTINUEWITH) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:75:60: continuationRule
					{
					pushFollow(FOLLOW_continuationRule_in_alternativeFlowAlternativeRule436);
					continuationRule60=continuationRule();
					state._fsp--;

					stream_continuationRule.add(continuationRule60.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ifRule, continuationRule, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 76:2: -> ^( ALT_FLOW_ALT ifRule ID ( continuationRule )? )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:76:5: ^( ALT_FLOW_ALT ifRule ID ( continuationRule )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALT_FLOW_ALT, "ALT_FLOW_ALT"), root_1);
				adaptor.addChild(root_1, stream_ifRule.nextTree());
				adaptor.addChild(root_1, stream_ID.nextNode());
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:76:30: ( continuationRule )?
				if ( stream_continuationRule.hasNext() ) {
					adaptor.addChild(root_1, stream_continuationRule.nextTree());
				}
				stream_continuationRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alternativeFlowAlternativeRule"


	public static class stepRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stepRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:77:1: stepRule : ( normalStepRule | parallelStepRule );
	public final UsecaseParser.stepRule_return stepRule() throws RecognitionException {
		UsecaseParser.stepRule_return retval = new UsecaseParser.stepRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope normalStepRule61 =null;
		ParserRuleReturnScope parallelStepRule62 =null;


		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:77:9: ( normalStepRule | parallelStepRule )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==STEP) ) {
				alt23=1;
			}
			else if ( (LA23_0==PARALLEL_STEP) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:77:11: normalStepRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_normalStepRule_in_stepRule457);
					normalStepRule61=normalStepRule();
					state._fsp--;

					adaptor.addChild(root_0, normalStepRule61.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:77:28: parallelStepRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_parallelStepRule_in_stepRule461);
					parallelStepRule62=parallelStepRule();
					state._fsp--;

					adaptor.addChild(root_0, parallelStepRule62.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stepRule"


	public static class parallelStepRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parallelStepRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:78:1: parallelStepRule : PARALLEL_STEP nameRule descriptionRule invokeFlowRule ( nextRule )? -> ^( PARALLEL_STEP nameRule descriptionRule invokeFlowRule ( nextRule )? ) ;
	public final UsecaseParser.parallelStepRule_return parallelStepRule() throws RecognitionException {
		UsecaseParser.parallelStepRule_return retval = new UsecaseParser.parallelStepRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PARALLEL_STEP63=null;
		ParserRuleReturnScope nameRule64 =null;
		ParserRuleReturnScope descriptionRule65 =null;
		ParserRuleReturnScope invokeFlowRule66 =null;
		ParserRuleReturnScope nextRule67 =null;

		Object PARALLEL_STEP63_tree=null;
		RewriteRuleTokenStream stream_PARALLEL_STEP=new RewriteRuleTokenStream(adaptor,"token PARALLEL_STEP");
		RewriteRuleSubtreeStream stream_invokeFlowRule=new RewriteRuleSubtreeStream(adaptor,"rule invokeFlowRule");
		RewriteRuleSubtreeStream stream_nameRule=new RewriteRuleSubtreeStream(adaptor,"rule nameRule");
		RewriteRuleSubtreeStream stream_descriptionRule=new RewriteRuleSubtreeStream(adaptor,"rule descriptionRule");
		RewriteRuleSubtreeStream stream_nextRule=new RewriteRuleSubtreeStream(adaptor,"rule nextRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:78:17: ( PARALLEL_STEP nameRule descriptionRule invokeFlowRule ( nextRule )? -> ^( PARALLEL_STEP nameRule descriptionRule invokeFlowRule ( nextRule )? ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:78:19: PARALLEL_STEP nameRule descriptionRule invokeFlowRule ( nextRule )?
			{
			PARALLEL_STEP63=(Token)match(input,PARALLEL_STEP,FOLLOW_PARALLEL_STEP_in_parallelStepRule467);  
			stream_PARALLEL_STEP.add(PARALLEL_STEP63);

			pushFollow(FOLLOW_nameRule_in_parallelStepRule469);
			nameRule64=nameRule();
			state._fsp--;

			stream_nameRule.add(nameRule64.getTree());
			pushFollow(FOLLOW_descriptionRule_in_parallelStepRule471);
			descriptionRule65=descriptionRule();
			state._fsp--;

			stream_descriptionRule.add(descriptionRule65.getTree());
			pushFollow(FOLLOW_invokeFlowRule_in_parallelStepRule473);
			invokeFlowRule66=invokeFlowRule();
			state._fsp--;

			stream_invokeFlowRule.add(invokeFlowRule66.getTree());
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:78:73: ( nextRule )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ID) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:78:73: nextRule
					{
					pushFollow(FOLLOW_nextRule_in_parallelStepRule475);
					nextRule67=nextRule();
					state._fsp--;

					stream_nextRule.add(nextRule67.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: invokeFlowRule, nextRule, descriptionRule, nameRule, PARALLEL_STEP
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 79:2: -> ^( PARALLEL_STEP nameRule descriptionRule invokeFlowRule ( nextRule )? )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:79:5: ^( PARALLEL_STEP nameRule descriptionRule invokeFlowRule ( nextRule )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_PARALLEL_STEP.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nameRule.nextTree());
				adaptor.addChild(root_1, stream_descriptionRule.nextTree());
				adaptor.addChild(root_1, stream_invokeFlowRule.nextTree());
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:79:61: ( nextRule )?
				if ( stream_nextRule.hasNext() ) {
					adaptor.addChild(root_1, stream_nextRule.nextTree());
				}
				stream_nextRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parallelStepRule"


	public static class normalStepRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "normalStepRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:80:1: normalStepRule : STEP nameRule descriptionRule byActorRule ( stepTypeRule )? ( stepDetailRule )? ( nextRule )? -> ^( STEP nameRule descriptionRule byActorRule ( stepTypeRule )? ( stepDetailRule )? ( nextRule )? ) ;
	public final UsecaseParser.normalStepRule_return normalStepRule() throws RecognitionException {
		UsecaseParser.normalStepRule_return retval = new UsecaseParser.normalStepRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STEP68=null;
		ParserRuleReturnScope nameRule69 =null;
		ParserRuleReturnScope descriptionRule70 =null;
		ParserRuleReturnScope byActorRule71 =null;
		ParserRuleReturnScope stepTypeRule72 =null;
		ParserRuleReturnScope stepDetailRule73 =null;
		ParserRuleReturnScope nextRule74 =null;

		Object STEP68_tree=null;
		RewriteRuleTokenStream stream_STEP=new RewriteRuleTokenStream(adaptor,"token STEP");
		RewriteRuleSubtreeStream stream_stepTypeRule=new RewriteRuleSubtreeStream(adaptor,"rule stepTypeRule");
		RewriteRuleSubtreeStream stream_nameRule=new RewriteRuleSubtreeStream(adaptor,"rule nameRule");
		RewriteRuleSubtreeStream stream_stepDetailRule=new RewriteRuleSubtreeStream(adaptor,"rule stepDetailRule");
		RewriteRuleSubtreeStream stream_descriptionRule=new RewriteRuleSubtreeStream(adaptor,"rule descriptionRule");
		RewriteRuleSubtreeStream stream_nextRule=new RewriteRuleSubtreeStream(adaptor,"rule nextRule");
		RewriteRuleSubtreeStream stream_byActorRule=new RewriteRuleSubtreeStream(adaptor,"rule byActorRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:80:15: ( STEP nameRule descriptionRule byActorRule ( stepTypeRule )? ( stepDetailRule )? ( nextRule )? -> ^( STEP nameRule descriptionRule byActorRule ( stepTypeRule )? ( stepDetailRule )? ( nextRule )? ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:80:17: STEP nameRule descriptionRule byActorRule ( stepTypeRule )? ( stepDetailRule )? ( nextRule )?
			{
			STEP68=(Token)match(input,STEP,FOLLOW_STEP_in_normalStepRule498);  
			stream_STEP.add(STEP68);

			pushFollow(FOLLOW_nameRule_in_normalStepRule500);
			nameRule69=nameRule();
			state._fsp--;

			stream_nameRule.add(nameRule69.getTree());
			pushFollow(FOLLOW_descriptionRule_in_normalStepRule502);
			descriptionRule70=descriptionRule();
			state._fsp--;

			stream_descriptionRule.add(descriptionRule70.getTree());
			pushFollow(FOLLOW_byActorRule_in_normalStepRule504);
			byActorRule71=byActorRule();
			state._fsp--;

			stream_byActorRule.add(byActorRule71.getTree());
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:80:59: ( stepTypeRule )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==TYPE) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:80:59: stepTypeRule
					{
					pushFollow(FOLLOW_stepTypeRule_in_normalStepRule506);
					stepTypeRule72=stepTypeRule();
					state._fsp--;

					stream_stepTypeRule.add(stepTypeRule72.getTree());
					}
					break;

			}

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:80:73: ( stepDetailRule )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ALTERNATIVES||LA26_0==INVOKEUSECASE) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:80:73: stepDetailRule
					{
					pushFollow(FOLLOW_stepDetailRule_in_normalStepRule509);
					stepDetailRule73=stepDetailRule();
					state._fsp--;

					stream_stepDetailRule.add(stepDetailRule73.getTree());
					}
					break;

			}

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:80:89: ( nextRule )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==ID) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:80:89: nextRule
					{
					pushFollow(FOLLOW_nextRule_in_normalStepRule512);
					nextRule74=nextRule();
					state._fsp--;

					stream_nextRule.add(nextRule74.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: stepTypeRule, descriptionRule, byActorRule, nextRule, STEP, nameRule, stepDetailRule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 81:3: -> ^( STEP nameRule descriptionRule byActorRule ( stepTypeRule )? ( stepDetailRule )? ( nextRule )? )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:81:6: ^( STEP nameRule descriptionRule byActorRule ( stepTypeRule )? ( stepDetailRule )? ( nextRule )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_STEP.nextNode(), root_1);
				adaptor.addChild(root_1, stream_nameRule.nextTree());
				adaptor.addChild(root_1, stream_descriptionRule.nextTree());
				adaptor.addChild(root_1, stream_byActorRule.nextTree());
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:81:50: ( stepTypeRule )?
				if ( stream_stepTypeRule.hasNext() ) {
					adaptor.addChild(root_1, stream_stepTypeRule.nextTree());
				}
				stream_stepTypeRule.reset();

				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:81:64: ( stepDetailRule )?
				if ( stream_stepDetailRule.hasNext() ) {
					adaptor.addChild(root_1, stream_stepDetailRule.nextTree());
				}
				stream_stepDetailRule.reset();

				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:81:80: ( nextRule )?
				if ( stream_nextRule.hasNext() ) {
					adaptor.addChild(root_1, stream_nextRule.nextTree());
				}
				stream_nextRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "normalStepRule"


	public static class actorTypeEnumRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actorTypeEnumRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:82:1: actorTypeEnumRule : ( PERSON | SYSTEM | ORGANIZATION );
	public final UsecaseParser.actorTypeEnumRule_return actorTypeEnumRule() throws RecognitionException {
		UsecaseParser.actorTypeEnumRule_return retval = new UsecaseParser.actorTypeEnumRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set75=null;

		Object set75_tree=null;

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:82:18: ( PERSON | SYSTEM | ORGANIZATION )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set75=input.LT(1);
			if ( input.LA(1)==ORGANIZATION||input.LA(1)==PERSON||input.LA(1)==SYSTEM ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set75));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actorTypeEnumRule"


	public static class customStepTypeRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "customStepTypeRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:83:1: customStepTypeRule : ( INPUT | OUTPUT | PROCESS | MIX );
	public final UsecaseParser.customStepTypeRule_return customStepTypeRule() throws RecognitionException {
		UsecaseParser.customStepTypeRule_return retval = new UsecaseParser.customStepTypeRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set76=null;

		Object set76_tree=null;

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:83:20: ( INPUT | OUTPUT | PROCESS | MIX )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set76=input.LT(1);
			if ( input.LA(1)==INPUT||input.LA(1)==MIX||input.LA(1)==OUTPUT||input.LA(1)==PROCESS ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set76));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "customStepTypeRule"


	public static class nameRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nameRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:85:1: nameRule : ID -> ^( NAME ID ) ;
	public final UsecaseParser.nameRule_return nameRule() throws RecognitionException {
		UsecaseParser.nameRule_return retval = new UsecaseParser.nameRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID77=null;

		Object ID77_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:85:9: ( ID -> ^( NAME ID ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:85:11: ID
			{
			ID77=(Token)match(input,ID,FOLLOW_ID_in_nameRule577);  
			stream_ID.add(ID77);

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 85:14: -> ^( NAME ID )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:85:17: ^( NAME ID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAME, "NAME"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nameRule"


	public static class descriptionRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "descriptionRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:86:1: descriptionRule : ( QUOTED_STRING )? -> ^( DESCRIPTION ( QUOTED_STRING )? ) ;
	public final UsecaseParser.descriptionRule_return descriptionRule() throws RecognitionException {
		UsecaseParser.descriptionRule_return retval = new UsecaseParser.descriptionRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token QUOTED_STRING78=null;

		Object QUOTED_STRING78_tree=null;
		RewriteRuleTokenStream stream_QUOTED_STRING=new RewriteRuleTokenStream(adaptor,"token QUOTED_STRING");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:86:16: ( ( QUOTED_STRING )? -> ^( DESCRIPTION ( QUOTED_STRING )? ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:86:18: ( QUOTED_STRING )?
			{
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:86:18: ( QUOTED_STRING )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==QUOTED_STRING) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:86:18: QUOTED_STRING
					{
					QUOTED_STRING78=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_descriptionRule591);  
					stream_QUOTED_STRING.add(QUOTED_STRING78);

					}
					break;

			}

			// AST REWRITE
			// elements: QUOTED_STRING
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 86:33: -> ^( DESCRIPTION ( QUOTED_STRING )? )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:86:36: ^( DESCRIPTION ( QUOTED_STRING )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DESCRIPTION, "DESCRIPTION"), root_1);
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:86:50: ( QUOTED_STRING )?
				if ( stream_QUOTED_STRING.hasNext() ) {
					adaptor.addChild(root_1, stream_QUOTED_STRING.nextNode());
				}
				stream_QUOTED_STRING.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "descriptionRule"


	public static class preconditionRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "preconditionRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:87:1: preconditionRule : PRECONDITIONS QUOTED_STRING -> ^( PRECONDITIONS QUOTED_STRING ) ;
	public final UsecaseParser.preconditionRule_return preconditionRule() throws RecognitionException {
		UsecaseParser.preconditionRule_return retval = new UsecaseParser.preconditionRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRECONDITIONS79=null;
		Token QUOTED_STRING80=null;

		Object PRECONDITIONS79_tree=null;
		Object QUOTED_STRING80_tree=null;
		RewriteRuleTokenStream stream_PRECONDITIONS=new RewriteRuleTokenStream(adaptor,"token PRECONDITIONS");
		RewriteRuleTokenStream stream_QUOTED_STRING=new RewriteRuleTokenStream(adaptor,"token QUOTED_STRING");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:87:17: ( PRECONDITIONS QUOTED_STRING -> ^( PRECONDITIONS QUOTED_STRING ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:87:19: PRECONDITIONS QUOTED_STRING
			{
			PRECONDITIONS79=(Token)match(input,PRECONDITIONS,FOLLOW_PRECONDITIONS_in_preconditionRule607);  
			stream_PRECONDITIONS.add(PRECONDITIONS79);

			QUOTED_STRING80=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_preconditionRule609);  
			stream_QUOTED_STRING.add(QUOTED_STRING80);

			// AST REWRITE
			// elements: QUOTED_STRING, PRECONDITIONS
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 87:47: -> ^( PRECONDITIONS QUOTED_STRING )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:87:50: ^( PRECONDITIONS QUOTED_STRING )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_PRECONDITIONS.nextNode(), root_1);
				adaptor.addChild(root_1, stream_QUOTED_STRING.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "preconditionRule"


	public static class continuationRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "continuationRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:88:1: continuationRule : CONTINUEWITH ID -> ^( CONTINUEWITH ID ) ;
	public final UsecaseParser.continuationRule_return continuationRule() throws RecognitionException {
		UsecaseParser.continuationRule_return retval = new UsecaseParser.continuationRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONTINUEWITH81=null;
		Token ID82=null;

		Object CONTINUEWITH81_tree=null;
		Object ID82_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_CONTINUEWITH=new RewriteRuleTokenStream(adaptor,"token CONTINUEWITH");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:88:17: ( CONTINUEWITH ID -> ^( CONTINUEWITH ID ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:88:19: CONTINUEWITH ID
			{
			CONTINUEWITH81=(Token)match(input,CONTINUEWITH,FOLLOW_CONTINUEWITH_in_continuationRule623);  
			stream_CONTINUEWITH.add(CONTINUEWITH81);

			ID82=(Token)match(input,ID,FOLLOW_ID_in_continuationRule625);  
			stream_ID.add(ID82);

			// AST REWRITE
			// elements: CONTINUEWITH, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 88:35: -> ^( CONTINUEWITH ID )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:88:38: ^( CONTINUEWITH ID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_CONTINUEWITH.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "continuationRule"


	public static class ifRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:89:1: ifRule : IF QUOTED_STRING THEN -> ^( IF QUOTED_STRING ) ;
	public final UsecaseParser.ifRule_return ifRule() throws RecognitionException {
		UsecaseParser.ifRule_return retval = new UsecaseParser.ifRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF83=null;
		Token QUOTED_STRING84=null;
		Token THEN85=null;

		Object IF83_tree=null;
		Object QUOTED_STRING84_tree=null;
		Object THEN85_tree=null;
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleTokenStream stream_QUOTED_STRING=new RewriteRuleTokenStream(adaptor,"token QUOTED_STRING");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:89:7: ( IF QUOTED_STRING THEN -> ^( IF QUOTED_STRING ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:89:9: IF QUOTED_STRING THEN
			{
			IF83=(Token)match(input,IF,FOLLOW_IF_in_ifRule639);  
			stream_IF.add(IF83);

			QUOTED_STRING84=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_ifRule641);  
			stream_QUOTED_STRING.add(QUOTED_STRING84);

			THEN85=(Token)match(input,THEN,FOLLOW_THEN_in_ifRule643);  
			stream_THEN.add(THEN85);

			// AST REWRITE
			// elements: IF, QUOTED_STRING
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 89:31: -> ^( IF QUOTED_STRING )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:89:34: ^( IF QUOTED_STRING )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_QUOTED_STRING.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifRule"


	public static class localAltDescriptionRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "localAltDescriptionRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:90:1: localAltDescriptionRule : QUOTED_STRING -> ^( DESCRIPTION QUOTED_STRING ) ;
	public final UsecaseParser.localAltDescriptionRule_return localAltDescriptionRule() throws RecognitionException {
		UsecaseParser.localAltDescriptionRule_return retval = new UsecaseParser.localAltDescriptionRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token QUOTED_STRING86=null;

		Object QUOTED_STRING86_tree=null;
		RewriteRuleTokenStream stream_QUOTED_STRING=new RewriteRuleTokenStream(adaptor,"token QUOTED_STRING");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:90:24: ( QUOTED_STRING -> ^( DESCRIPTION QUOTED_STRING ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:90:26: QUOTED_STRING
			{
			QUOTED_STRING86=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_localAltDescriptionRule657);  
			stream_QUOTED_STRING.add(QUOTED_STRING86);

			// AST REWRITE
			// elements: QUOTED_STRING
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 90:40: -> ^( DESCRIPTION QUOTED_STRING )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:90:43: ^( DESCRIPTION QUOTED_STRING )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DESCRIPTION, "DESCRIPTION"), root_1);
				adaptor.addChild(root_1, stream_QUOTED_STRING.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "localAltDescriptionRule"


	public static class localAltThenRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "localAltThenRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:91:1: localAltThenRule : ( localAltDescriptionRule | invokeUseCaseRule );
	public final UsecaseParser.localAltThenRule_return localAltThenRule() throws RecognitionException {
		UsecaseParser.localAltThenRule_return retval = new UsecaseParser.localAltThenRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope localAltDescriptionRule87 =null;
		ParserRuleReturnScope invokeUseCaseRule88 =null;


		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:91:17: ( localAltDescriptionRule | invokeUseCaseRule )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==QUOTED_STRING) ) {
				alt29=1;
			}
			else if ( (LA29_0==INVOKEUSECASE) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:91:19: localAltDescriptionRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_localAltDescriptionRule_in_localAltThenRule671);
					localAltDescriptionRule87=localAltDescriptionRule();
					state._fsp--;

					adaptor.addChild(root_0, localAltDescriptionRule87.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:91:45: invokeUseCaseRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_invokeUseCaseRule_in_localAltThenRule675);
					invokeUseCaseRule88=invokeUseCaseRule();
					state._fsp--;

					adaptor.addChild(root_0, invokeUseCaseRule88.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "localAltThenRule"


	public static class extendRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "extendRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:92:1: extendRule : EXTENDS ID -> ^( EXTENDS ID ) ;
	public final UsecaseParser.extendRule_return extendRule() throws RecognitionException {
		UsecaseParser.extendRule_return retval = new UsecaseParser.extendRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EXTENDS89=null;
		Token ID90=null;

		Object EXTENDS89_tree=null;
		Object ID90_tree=null;
		RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:92:11: ( EXTENDS ID -> ^( EXTENDS ID ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:92:13: EXTENDS ID
			{
			EXTENDS89=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_extendRule681);  
			stream_EXTENDS.add(EXTENDS89);

			ID90=(Token)match(input,ID,FOLLOW_ID_in_extendRule683);  
			stream_ID.add(ID90);

			// AST REWRITE
			// elements: ID, EXTENDS
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 92:24: -> ^( EXTENDS ID )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:92:27: ^( EXTENDS ID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extendRule"


	public static class finalStateRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "finalStateRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:93:1: finalStateRule : WITHPOSTCONDITION QUOTED_STRING -> ^( WITHPOSTCONDITION QUOTED_STRING ) ;
	public final UsecaseParser.finalStateRule_return finalStateRule() throws RecognitionException {
		UsecaseParser.finalStateRule_return retval = new UsecaseParser.finalStateRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WITHPOSTCONDITION91=null;
		Token QUOTED_STRING92=null;

		Object WITHPOSTCONDITION91_tree=null;
		Object QUOTED_STRING92_tree=null;
		RewriteRuleTokenStream stream_WITHPOSTCONDITION=new RewriteRuleTokenStream(adaptor,"token WITHPOSTCONDITION");
		RewriteRuleTokenStream stream_QUOTED_STRING=new RewriteRuleTokenStream(adaptor,"token QUOTED_STRING");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:93:15: ( WITHPOSTCONDITION QUOTED_STRING -> ^( WITHPOSTCONDITION QUOTED_STRING ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:93:17: WITHPOSTCONDITION QUOTED_STRING
			{
			WITHPOSTCONDITION91=(Token)match(input,WITHPOSTCONDITION,FOLLOW_WITHPOSTCONDITION_in_finalStateRule697);  
			stream_WITHPOSTCONDITION.add(WITHPOSTCONDITION91);

			QUOTED_STRING92=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_finalStateRule699);  
			stream_QUOTED_STRING.add(QUOTED_STRING92);

			// AST REWRITE
			// elements: QUOTED_STRING, WITHPOSTCONDITION
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 93:49: -> ^( WITHPOSTCONDITION QUOTED_STRING )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:93:52: ^( WITHPOSTCONDITION QUOTED_STRING )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_WITHPOSTCONDITION.nextNode(), root_1);
				adaptor.addChild(root_1, stream_QUOTED_STRING.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "finalStateRule"


	public static class invokeFlowRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "invokeFlowRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:94:1: invokeFlowRule : ID ( SEPARATOR ID )* -> ^( INVOKE_FLOW ( ID )+ ) ;
	public final UsecaseParser.invokeFlowRule_return invokeFlowRule() throws RecognitionException {
		UsecaseParser.invokeFlowRule_return retval = new UsecaseParser.invokeFlowRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID93=null;
		Token SEPARATOR94=null;
		Token ID95=null;

		Object ID93_tree=null;
		Object SEPARATOR94_tree=null;
		Object ID95_tree=null;
		RewriteRuleTokenStream stream_SEPARATOR=new RewriteRuleTokenStream(adaptor,"token SEPARATOR");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:94:15: ( ID ( SEPARATOR ID )* -> ^( INVOKE_FLOW ( ID )+ ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:94:17: ID ( SEPARATOR ID )*
			{
			ID93=(Token)match(input,ID,FOLLOW_ID_in_invokeFlowRule713);  
			stream_ID.add(ID93);

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:94:20: ( SEPARATOR ID )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==SEPARATOR) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:94:21: SEPARATOR ID
					{
					SEPARATOR94=(Token)match(input,SEPARATOR,FOLLOW_SEPARATOR_in_invokeFlowRule716);  
					stream_SEPARATOR.add(SEPARATOR94);

					ID95=(Token)match(input,ID,FOLLOW_ID_in_invokeFlowRule718);  
					stream_ID.add(ID95);

					}
					break;

				default :
					break loop30;
				}
			}

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 94:36: -> ^( INVOKE_FLOW ( ID )+ )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:94:39: ^( INVOKE_FLOW ( ID )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INVOKE_FLOW, "INVOKE_FLOW"), root_1);
				if ( !(stream_ID.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_ID.hasNext() ) {
					adaptor.addChild(root_1, stream_ID.nextNode());
				}
				stream_ID.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "invokeFlowRule"


	public static class invokeUseCaseRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "invokeUseCaseRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:95:1: invokeUseCaseRule : INVOKEUSECASE ID -> ^( INVOKEUSECASE ID ) ;
	public final UsecaseParser.invokeUseCaseRule_return invokeUseCaseRule() throws RecognitionException {
		UsecaseParser.invokeUseCaseRule_return retval = new UsecaseParser.invokeUseCaseRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INVOKEUSECASE96=null;
		Token ID97=null;

		Object INVOKEUSECASE96_tree=null;
		Object ID97_tree=null;
		RewriteRuleTokenStream stream_INVOKEUSECASE=new RewriteRuleTokenStream(adaptor,"token INVOKEUSECASE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:95:18: ( INVOKEUSECASE ID -> ^( INVOKEUSECASE ID ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:95:20: INVOKEUSECASE ID
			{
			INVOKEUSECASE96=(Token)match(input,INVOKEUSECASE,FOLLOW_INVOKEUSECASE_in_invokeUseCaseRule735);  
			stream_INVOKEUSECASE.add(INVOKEUSECASE96);

			ID97=(Token)match(input,ID,FOLLOW_ID_in_invokeUseCaseRule737);  
			stream_ID.add(ID97);

			// AST REWRITE
			// elements: ID, INVOKEUSECASE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 95:37: -> ^( INVOKEUSECASE ID )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:95:40: ^( INVOKEUSECASE ID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_INVOKEUSECASE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "invokeUseCaseRule"


	public static class nextRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nextRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:96:1: nextRule : ID -> ^( NEXT ID ) ;
	public final UsecaseParser.nextRule_return nextRule() throws RecognitionException {
		UsecaseParser.nextRule_return retval = new UsecaseParser.nextRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID98=null;

		Object ID98_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:96:9: ( ID -> ^( NEXT ID ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:96:11: ID
			{
			ID98=(Token)match(input,ID,FOLLOW_ID_in_nextRule751);  
			stream_ID.add(ID98);

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 96:14: -> ^( NEXT ID )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:96:17: ^( NEXT ID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEXT, "NEXT"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nextRule"


	public static class byActorRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "byActorRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:97:1: byActorRule : BY ID -> ^( BY ID ) ;
	public final UsecaseParser.byActorRule_return byActorRule() throws RecognitionException {
		UsecaseParser.byActorRule_return retval = new UsecaseParser.byActorRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BY99=null;
		Token ID100=null;

		Object BY99_tree=null;
		Object ID100_tree=null;
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:97:12: ( BY ID -> ^( BY ID ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:97:14: BY ID
			{
			BY99=(Token)match(input,BY,FOLLOW_BY_in_byActorRule765);  
			stream_BY.add(BY99);

			ID100=(Token)match(input,ID,FOLLOW_ID_in_byActorRule767);  
			stream_ID.add(ID100);

			// AST REWRITE
			// elements: BY, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 97:20: -> ^( BY ID )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:97:22: ^( BY ID )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_BY.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "byActorRule"


	public static class stepTypeRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stepTypeRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:98:1: stepTypeRule : TYPE customStepTypeRule -> ^( TYPE customStepTypeRule ) ;
	public final UsecaseParser.stepTypeRule_return stepTypeRule() throws RecognitionException {
		UsecaseParser.stepTypeRule_return retval = new UsecaseParser.stepTypeRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TYPE101=null;
		ParserRuleReturnScope customStepTypeRule102 =null;

		Object TYPE101_tree=null;
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
		RewriteRuleSubtreeStream stream_customStepTypeRule=new RewriteRuleSubtreeStream(adaptor,"rule customStepTypeRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:98:13: ( TYPE customStepTypeRule -> ^( TYPE customStepTypeRule ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:98:15: TYPE customStepTypeRule
			{
			TYPE101=(Token)match(input,TYPE,FOLLOW_TYPE_in_stepTypeRule780);  
			stream_TYPE.add(TYPE101);

			pushFollow(FOLLOW_customStepTypeRule_in_stepTypeRule782);
			customStepTypeRule102=customStepTypeRule();
			state._fsp--;

			stream_customStepTypeRule.add(customStepTypeRule102.getTree());
			// AST REWRITE
			// elements: TYPE, customStepTypeRule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 98:39: -> ^( TYPE customStepTypeRule )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:98:42: ^( TYPE customStepTypeRule )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_customStepTypeRule.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stepTypeRule"


	public static class stepDetailAlternativeRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stepDetailAlternativeRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:99:1: stepDetailAlternativeRule : ALTERNATIVES ( stepAlternativeRule )+ ELSE -> ^( ALTERNATIVES ( stepAlternativeRule )+ ) ;
	public final UsecaseParser.stepDetailAlternativeRule_return stepDetailAlternativeRule() throws RecognitionException {
		UsecaseParser.stepDetailAlternativeRule_return retval = new UsecaseParser.stepDetailAlternativeRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ALTERNATIVES103=null;
		Token ELSE105=null;
		ParserRuleReturnScope stepAlternativeRule104 =null;

		Object ALTERNATIVES103_tree=null;
		Object ELSE105_tree=null;
		RewriteRuleTokenStream stream_ALTERNATIVES=new RewriteRuleTokenStream(adaptor,"token ALTERNATIVES");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_stepAlternativeRule=new RewriteRuleSubtreeStream(adaptor,"rule stepAlternativeRule");

		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:99:26: ( ALTERNATIVES ( stepAlternativeRule )+ ELSE -> ^( ALTERNATIVES ( stepAlternativeRule )+ ) )
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:99:28: ALTERNATIVES ( stepAlternativeRule )+ ELSE
			{
			ALTERNATIVES103=(Token)match(input,ALTERNATIVES,FOLLOW_ALTERNATIVES_in_stepDetailAlternativeRule796);  
			stream_ALTERNATIVES.add(ALTERNATIVES103);

			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:99:41: ( stepAlternativeRule )+
			int cnt31=0;
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==IF) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:99:41: stepAlternativeRule
					{
					pushFollow(FOLLOW_stepAlternativeRule_in_stepDetailAlternativeRule798);
					stepAlternativeRule104=stepAlternativeRule();
					state._fsp--;

					stream_stepAlternativeRule.add(stepAlternativeRule104.getTree());
					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
					EarlyExitException eee = new EarlyExitException(31, input);
					throw eee;
				}
				cnt31++;
			}

			ELSE105=(Token)match(input,ELSE,FOLLOW_ELSE_in_stepDetailAlternativeRule801);  
			stream_ELSE.add(ELSE105);

			// AST REWRITE
			// elements: ALTERNATIVES, stepAlternativeRule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 100:2: -> ^( ALTERNATIVES ( stepAlternativeRule )+ )
			{
				// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:100:5: ^( ALTERNATIVES ( stepAlternativeRule )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_ALTERNATIVES.nextNode(), root_1);
				if ( !(stream_stepAlternativeRule.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_stepAlternativeRule.hasNext() ) {
					adaptor.addChild(root_1, stream_stepAlternativeRule.nextTree());
				}
				stream_stepAlternativeRule.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stepDetailAlternativeRule"


	public static class stepDetailRule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stepDetailRule"
	// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:101:1: stepDetailRule : ( stepDetailAlternativeRule | invokeUseCaseRule );
	public final UsecaseParser.stepDetailRule_return stepDetailRule() throws RecognitionException {
		UsecaseParser.stepDetailRule_return retval = new UsecaseParser.stepDetailRule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stepDetailAlternativeRule106 =null;
		ParserRuleReturnScope invokeUseCaseRule107 =null;


		try {
			// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:101:15: ( stepDetailAlternativeRule | invokeUseCaseRule )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==ALTERNATIVES) ) {
				alt32=1;
			}
			else if ( (LA32_0==INVOKEUSECASE) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:101:17: stepDetailAlternativeRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_stepDetailAlternativeRule_in_stepDetailRule818);
					stepDetailAlternativeRule106=stepDetailAlternativeRule();
					state._fsp--;

					adaptor.addChild(root_0, stepDetailAlternativeRule106.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\marat\\Documents\\EclipseWS\\Luna\\moflon\\UseCaseCodeAdapter\\src\\org\\moflon\\moca\\usecase\\parser\\UsecaseParser.g:101:45: invokeUseCaseRule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_invokeUseCaseRule_in_stepDetailRule822);
					invokeUseCaseRule107=invokeUseCaseRule();
					state._fsp--;

					adaptor.addChild(root_0, invokeUseCaseRule107.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stepDetailRule"

	// Delegated rules



	public static final BitSet FOLLOW_packageRule_in_main61 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_PACKAGE_in_packageRule68 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_QUALIFIED_NAME_in_packageRule70 = new BitSet(new long[]{0x0000410000010010L});
	public static final BitSet FOLLOW_descriptionRule_in_packageRule72 = new BitSet(new long[]{0x0000400000010010L});
	public static final BitSet FOLLOW_actorsRule_in_packageRule76 = new BitSet(new long[]{0x0000400000010000L});
	public static final BitSet FOLLOW_useCasesRule_in_packageRule79 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ENDPACKAGE_in_packageRule81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTORS_in_actorsRule102 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_actorRule_in_actorsRule104 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_ID_in_actorRule120 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_AS_in_actorRule122 = new BitSet(new long[]{0x0000080840000000L});
	public static final BitSet FOLLOW_actorTypeRule_in_actorRule124 = new BitSet(new long[]{0x0000010000080000L});
	public static final BitSet FOLLOW_descriptionRule_in_actorRule126 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_extendRule_in_actorRule128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actorTypeEnumRule_in_actorTypeRule149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_usecaseRule_in_useCasesRule163 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_USECASE_in_usecaseRule179 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_usecaseRule181 = new BitSet(new long[]{0x00000122000E0240L});
	public static final BitSet FOLLOW_descriptionRule_in_usecaseRule183 = new BitSet(new long[]{0x00000022000E0240L});
	public static final BitSet FOLLOW_extendRule_in_usecaseRule187 = new BitSet(new long[]{0x0000002200060240L});
	public static final BitSet FOLLOW_preconditionRule_in_usecaseRule190 = new BitSet(new long[]{0x0000000200060240L});
	public static final BitSet FOLLOW_flowRule_in_usecaseRule193 = new BitSet(new long[]{0x0000000200060240L});
	public static final BitSet FOLLOW_ENDUSECASE_in_usecaseRule196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basicFlowRule_in_flowRule221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namedFlowRule_in_flowRule225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exceptionFlowRule_in_namedFlowRule231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternativeFlowRule_in_namedFlowRule235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parallelflowRule_in_namedFlowRule239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BASICFLOW_in_basicFlowRule245 = new BitSet(new long[]{0x0000040400008000L});
	public static final BitSet FOLLOW_stepRule_in_basicFlowRule247 = new BitSet(new long[]{0x0000040400008000L});
	public static final BitSet FOLLOW_ENDFLOW_in_basicFlowRule250 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_finalStateRule_in_basicFlowRule252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXCEPTIONFLOW_in_exceptionFlowRule272 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_nameRule_in_exceptionFlowRule274 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ifRule_in_exceptionFlowRule278 = new BitSet(new long[]{0x0000040400008000L});
	public static final BitSet FOLLOW_stepRule_in_exceptionFlowRule280 = new BitSet(new long[]{0x0000040400008000L});
	public static final BitSet FOLLOW_ENDFLOW_in_exceptionFlowRule283 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_finalStateRule_in_exceptionFlowRule285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALTERNATIVE_FLOW_in_alternativeFlowRule309 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_nameRule_in_alternativeFlowRule311 = new BitSet(new long[]{0x0000040400008000L});
	public static final BitSet FOLLOW_stepRule_in_alternativeFlowRule313 = new BitSet(new long[]{0x0000040400008000L});
	public static final BitSet FOLLOW_ENDFLOW_in_alternativeFlowRule316 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_finalStateRule_in_alternativeFlowRule318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARALLEL_FLOW_in_parallelflowRule340 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_nameRule_in_parallelflowRule342 = new BitSet(new long[]{0x0000040400008000L});
	public static final BitSet FOLLOW_stepRule_in_parallelflowRule344 = new BitSet(new long[]{0x0000040400008000L});
	public static final BitSet FOLLOW_ENDFLOW_in_parallelflowRule347 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_finalStateRule_in_parallelflowRule349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionRule_in_stepAlternativeRule371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localAltRule_in_stepAlternativeRule375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternativeFlowAlternativeRule_in_stepAlternativeRule379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifRule_in_conditionRule385 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_continuationRule_in_conditionRule387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifRule_in_localAltRule405 = new BitSet(new long[]{0x0000010001000000L});
	public static final BitSet FOLLOW_localAltThenRule_in_localAltRule407 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_continuationRule_in_localAltRule409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifRule_in_alternativeFlowAlternativeRule430 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ALTERNATIVE_FLOW_in_alternativeFlowAlternativeRule432 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_alternativeFlowAlternativeRule434 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_continuationRule_in_alternativeFlowAlternativeRule436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalStepRule_in_stepRule457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parallelStepRule_in_stepRule461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARALLEL_STEP_in_parallelStepRule467 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_nameRule_in_parallelStepRule469 = new BitSet(new long[]{0x0000010000200000L});
	public static final BitSet FOLLOW_descriptionRule_in_parallelStepRule471 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_invokeFlowRule_in_parallelStepRule473 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_nextRule_in_parallelStepRule475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STEP_in_normalStepRule498 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_nameRule_in_normalStepRule500 = new BitSet(new long[]{0x0000010000000400L});
	public static final BitSet FOLLOW_descriptionRule_in_normalStepRule502 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_byActorRule_in_normalStepRule504 = new BitSet(new long[]{0x0000200001200022L});
	public static final BitSet FOLLOW_stepTypeRule_in_normalStepRule506 = new BitSet(new long[]{0x0000000001200022L});
	public static final BitSet FOLLOW_stepDetailRule_in_normalStepRule509 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_nextRule_in_normalStepRule512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_nameRule577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_STRING_in_descriptionRule591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRECONDITIONS_in_preconditionRule607 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_QUOTED_STRING_in_preconditionRule609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUEWITH_in_continuationRule623 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_continuationRule625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifRule639 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_QUOTED_STRING_in_ifRule641 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_THEN_in_ifRule643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_STRING_in_localAltDescriptionRule657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localAltDescriptionRule_in_localAltThenRule671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invokeUseCaseRule_in_localAltThenRule675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_extendRule681 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_extendRule683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITHPOSTCONDITION_in_finalStateRule697 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_QUOTED_STRING_in_finalStateRule699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_invokeFlowRule713 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_SEPARATOR_in_invokeFlowRule716 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_invokeFlowRule718 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_INVOKEUSECASE_in_invokeUseCaseRule735 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_invokeUseCaseRule737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_nextRule751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BY_in_byActorRule765 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_byActorRule767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_stepTypeRule780 = new BitSet(new long[]{0x0000004088800000L});
	public static final BitSet FOLLOW_customStepTypeRule_in_stepTypeRule782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALTERNATIVES_in_stepDetailAlternativeRule796 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_stepAlternativeRule_in_stepDetailAlternativeRule798 = new BitSet(new long[]{0x0000000000404000L});
	public static final BitSet FOLLOW_ELSE_in_stepDetailAlternativeRule801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stepDetailAlternativeRule_in_stepDetailRule818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invokeUseCaseRule_in_stepDetailRule822 = new BitSet(new long[]{0x0000000000000002L});
}
