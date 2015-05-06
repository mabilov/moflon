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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", 
		"RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "','", 
		"'.'", "'actors'", "'alt'", "'alternative flow'", "'alternatives'", "'as'", 
		"'basic flow'", "'by'", "'call'", "'continue with step'", "'else'", "'end flow'", 
		"'end package'", "'end usecase'", "'exception flow'", "'extends'", "'if'", 
		"'invoke usecase'", "'next'", "'organization'", "'package'", "'parallel flow'", 
		"'parallel step'", "'perform'", "'person'", "'postcondition'", "'preconditions'", 
		"'send'", "'step'", "'system'", "'then'", "'usecase'", "'wait'", "'with postcondition'"
	};
	public static final int EOF=-1;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int RULE_ANY_OTHER=4;
	public static final int RULE_ID=5;
	public static final int RULE_INT=6;
	public static final int RULE_ML_COMMENT=7;
	public static final int RULE_SL_COMMENT=8;
	public static final int RULE_STRING=9;
	public static final int RULE_WS=10;

	// delegates
	public AbstractInternalAntlrParser[] getDelegates() {
		return new AbstractInternalAntlrParser[] {};
	}

	// delegators


	public InternalUseCaseParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public InternalUseCaseParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return InternalUseCaseParser.tokenNames; }
	@Override public String getGrammarFileName() { return "../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g"; }



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



	// $ANTLR start "entryRuleUseCasesModel"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:68:1: entryRuleUseCasesModel returns [EObject current=null] :iv_ruleUseCasesModel= ruleUseCasesModel EOF ;
	public final EObject entryRuleUseCasesModel() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleUseCasesModel =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:69:2: (iv_ruleUseCasesModel= ruleUseCasesModel EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:70:2: iv_ruleUseCasesModel= ruleUseCasesModel EOF
			{
			 newCompositeNode(grammarAccess.getUseCasesModelRule()); 
			pushFollow(FOLLOW_ruleUseCasesModel_in_entryRuleUseCasesModel75);
			iv_ruleUseCasesModel=ruleUseCasesModel();
			state._fsp--;

			 current =iv_ruleUseCasesModel; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleUseCasesModel85); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleUseCasesModel"



	// $ANTLR start "ruleUseCasesModel"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:77:1: ruleUseCasesModel returns [EObject current=null] : ( (lv_packages_0_0= rulePackageDeclaration ) )* ;
	public final EObject ruleUseCasesModel() throws RecognitionException {
		EObject current = null;


		EObject lv_packages_0_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:80:28: ( ( (lv_packages_0_0= rulePackageDeclaration ) )* )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:81:3: ( (lv_packages_0_0= rulePackageDeclaration ) )*
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:81:3: ( (lv_packages_0_0= rulePackageDeclaration ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==32) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:82:3: (lv_packages_0_0= rulePackageDeclaration )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:82:3: (lv_packages_0_0= rulePackageDeclaration )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:83:3: lv_packages_0_0= rulePackageDeclaration
					{
					 
						        newCompositeNode(grammarAccess.getUseCasesModelAccess().getPackagesPackageDeclarationParserRuleCall_0()); 
						    
					pushFollow(FOLLOW_rulePackageDeclaration_in_ruleUseCasesModel130);
					lv_packages_0_0=rulePackageDeclaration();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getUseCasesModelRule());
						        }
					       		add(
					       			current, 
					       			"packages",
					        		lv_packages_0_0, 
					        		"PackageDeclaration");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop1;
				}
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleUseCasesModel"



	// $ANTLR start "entryRulePackageDeclaration"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:107:1: entryRulePackageDeclaration returns [EObject current=null] :iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
	public final EObject entryRulePackageDeclaration() throws RecognitionException {
		EObject current = null;


		EObject iv_rulePackageDeclaration =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:108:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:109:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
			{
			 newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
			pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration166);
			iv_rulePackageDeclaration=rulePackageDeclaration();
			state._fsp--;

			 current =iv_rulePackageDeclaration; 
			match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration176); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRulePackageDeclaration"



	// $ANTLR start "rulePackageDeclaration"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:116:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'actors' ( (lv_actors_4_0= ruleActor ) )+ )? ( (lv_useCases_5_0= ruleUseCase ) )* otherlv_6= 'end package' ) ;
	public final EObject rulePackageDeclaration() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_description_2_0=null;
		Token otherlv_3=null;
		Token otherlv_6=null;
		AntlrDatatypeRuleToken lv_name_1_0 =null;
		EObject lv_actors_4_0 =null;
		EObject lv_useCases_5_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:119:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'actors' ( (lv_actors_4_0= ruleActor ) )+ )? ( (lv_useCases_5_0= ruleUseCase ) )* otherlv_6= 'end package' ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:120:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'actors' ( (lv_actors_4_0= ruleActor ) )+ )? ( (lv_useCases_5_0= ruleUseCase ) )* otherlv_6= 'end package' )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:120:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'actors' ( (lv_actors_4_0= ruleActor ) )+ )? ( (lv_useCases_5_0= ruleUseCase ) )* otherlv_6= 'end package' )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:120:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'actors' ( (lv_actors_4_0= ruleActor ) )+ )? ( (lv_useCases_5_0= ruleUseCase ) )* otherlv_6= 'end package'
			{
			otherlv_0=(Token)match(input,32,FOLLOW_32_in_rulePackageDeclaration213); 

			    	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:124:3: ( (lv_name_1_0= ruleQualifiedName ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:125:3: (lv_name_1_0= ruleQualifiedName )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:125:3: (lv_name_1_0= ruleQualifiedName )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:126:3: lv_name_1_0= ruleQualifiedName
			{
			 
				        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
				    
			pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration234);
			lv_name_1_0=ruleQualifiedName();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
				        }
			       		set(
			       			current, 
			       			"name",
			        		lv_name_1_0, 
			        		"QualifiedName");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:142:2: ( (lv_description_2_0= RULE_STRING ) )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==RULE_STRING) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:143:3: (lv_description_2_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:143:3: (lv_description_2_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:144:3: lv_description_2_0= RULE_STRING
					{
					lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePackageDeclaration251); 

								newLeafNode(lv_description_2_0, grammarAccess.getPackageDeclarationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getPackageDeclarationRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"description",
					        		lv_description_2_0, 
					        		"STRING");
						    
					}

					}
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:160:3: (otherlv_3= 'actors' ( (lv_actors_4_0= ruleActor ) )+ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==13) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:160:5: otherlv_3= 'actors' ( (lv_actors_4_0= ruleActor ) )+
					{
					otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePackageDeclaration270); 

					    	newLeafNode(otherlv_3, grammarAccess.getPackageDeclarationAccess().getActorsKeyword_3_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:164:3: ( (lv_actors_4_0= ruleActor ) )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==RULE_ID) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:165:3: (lv_actors_4_0= ruleActor )
							{
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:165:3: (lv_actors_4_0= ruleActor )
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:166:3: lv_actors_4_0= ruleActor
							{
							 
								        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getActorsActorParserRuleCall_3_1_0()); 
								    
							pushFollow(FOLLOW_ruleActor_in_rulePackageDeclaration291);
							lv_actors_4_0=ruleActor();
							state._fsp--;


								        if (current==null) {
								            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
								        }
							       		add(
							       			current, 
							       			"actors",
							        		lv_actors_4_0, 
							        		"Actor");
								        afterParserOrEnumRuleCall();
								    
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
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:182:5: ( (lv_useCases_5_0= ruleUseCase ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==43) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:183:3: (lv_useCases_5_0= ruleUseCase )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:183:3: (lv_useCases_5_0= ruleUseCase )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:184:3: lv_useCases_5_0= ruleUseCase
					{
					 
						        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getUseCasesUseCaseParserRuleCall_4_0()); 
						    
					pushFollow(FOLLOW_ruleUseCase_in_rulePackageDeclaration315);
					lv_useCases_5_0=ruleUseCase();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
						        }
					       		add(
					       			current, 
					       			"useCases",
					        		lv_useCases_5_0, 
					        		"UseCase");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop5;
				}
			}

			otherlv_6=(Token)match(input,24,FOLLOW_24_in_rulePackageDeclaration328); 

			    	newLeafNode(otherlv_6, grammarAccess.getPackageDeclarationAccess().getEndPackageKeyword_5());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "rulePackageDeclaration"



	// $ANTLR start "entryRuleUseCase"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:212:1: entryRuleUseCase returns [EObject current=null] :iv_ruleUseCase= ruleUseCase EOF ;
	public final EObject entryRuleUseCase() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleUseCase =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:213:2: (iv_ruleUseCase= ruleUseCase EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:214:2: iv_ruleUseCase= ruleUseCase EOF
			{
			 newCompositeNode(grammarAccess.getUseCaseRule()); 
			pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase364);
			iv_ruleUseCase=ruleUseCase();
			state._fsp--;

			 current =iv_ruleUseCase; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase374); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleUseCase"



	// $ANTLR start "ruleUseCase"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:221:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )* ) ) ) ( (lv_flows_10_0= ruleFlow ) )* otherlv_11= 'end usecase' ) ;
	public final EObject ruleUseCase() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token lv_description_2_0=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token otherlv_6=null;
		Token otherlv_8=null;
		Token otherlv_11=null;
		EObject lv_preconditions_7_0 =null;
		EObject lv_postconditions_9_0 =null;
		EObject lv_flows_10_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:224:28: ( (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )* ) ) ) ( (lv_flows_10_0= ruleFlow ) )* otherlv_11= 'end usecase' ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:225:3: (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )* ) ) ) ( (lv_flows_10_0= ruleFlow ) )* otherlv_11= 'end usecase' )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:225:3: (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )* ) ) ) ( (lv_flows_10_0= ruleFlow ) )* otherlv_11= 'end usecase' )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:225:3: otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )* ) ) ) ( (lv_flows_10_0= ruleFlow ) )* otherlv_11= 'end usecase'
			{
			otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleUseCase411); 

			    	newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUsecaseKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:229:3: ( (lv_name_1_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:230:3: (lv_name_1_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:230:3: (lv_name_1_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:231:3: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase428); 

						newLeafNode(lv_name_1_0, grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getUseCaseRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_1_0, 
			        		"ID");
				    
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:247:2: ( (lv_description_2_0= RULE_STRING ) )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==RULE_STRING) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:248:3: (lv_description_2_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:248:3: (lv_description_2_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:249:3: lv_description_2_0= RULE_STRING
					{
					lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase450); 

								newLeafNode(lv_description_2_0, grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getUseCaseRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"description",
					        		lv_description_2_0, 
					        		"STRING");
						    
					}

					}
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:265:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==27) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:265:5: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
					{
					otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleUseCase469); 

					    	newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:269:3: ( (otherlv_4= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:270:3: (otherlv_4= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:270:3: (otherlv_4= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:271:3: otherlv_4= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getUseCaseRule());
						        }
					        
					otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseCase489); 

							newLeafNode(otherlv_4, grammarAccess.getUseCaseAccess().getSuperCaseUseCaseCrossReference_3_1_0()); 
						
					}

					}

					}
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:282:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )* ) ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:284:2: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )* ) )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:284:2: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )* ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:285:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )* )
			{
			 
				  getUnorderedGroupHelper().enter(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
				
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:288:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )* )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:289:3: ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )*
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:289:3: ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) ) )*
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( LA10_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
					alt10=1;
				}
				else if ( LA10_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
					alt10=2;
				}

				switch (alt10) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:291:4: ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:291:4: ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:292:5: {...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) )
					{
					if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
						throw new FailedPredicateException(input, "ruleUseCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0)");
					}
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:292:104: ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:293:6: ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) )
					{
					 
						 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0);
						 				
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:296:6: ({...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:296:7: {...}? => (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ )
					{
					if ( !((true)) ) {
						throw new FailedPredicateException(input, "ruleUseCase", "true");
					}
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:296:16: (otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+ )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:296:18: otherlv_6= 'preconditions' ( (lv_preconditions_7_0= ruleUCCondition ) )+
					{
					otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleUseCase549); 

					    	newLeafNode(otherlv_6, grammarAccess.getUseCaseAccess().getPreconditionsKeyword_4_0_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:300:3: ( (lv_preconditions_7_0= ruleUCCondition ) )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==RULE_STRING) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:301:3: (lv_preconditions_7_0= ruleUCCondition )
							{
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:301:3: (lv_preconditions_7_0= ruleUCCondition )
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:302:3: lv_preconditions_7_0= ruleUCCondition
							{
							 
								        newCompositeNode(grammarAccess.getUseCaseAccess().getPreconditionsUCConditionParserRuleCall_4_0_1_0()); 
								    
							pushFollow(FOLLOW_ruleUCCondition_in_ruleUseCase570);
							lv_preconditions_7_0=ruleUCCondition();
							state._fsp--;


								        if (current==null) {
								            current = createModelElementForParent(grammarAccess.getUseCaseRule());
								        }
							       		add(
							       			current, 
							       			"preconditions",
							        		lv_preconditions_7_0, 
							        		"UCCondition");
								        afterParserOrEnumRuleCall();
								    
							}

							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					}

					}

					 
						 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
						 				
					}

					}

					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:325:4: ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:325:4: ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:326:5: {...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) )
					{
					if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
						throw new FailedPredicateException(input, "ruleUseCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1)");
					}
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:326:104: ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:327:6: ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) )
					{
					 
						 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1);
						 				
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:330:6: ({...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:330:7: {...}? => (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ )
					{
					if ( !((true)) ) {
						throw new FailedPredicateException(input, "ruleUseCase", "true");
					}
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:330:16: (otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+ )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:330:18: otherlv_8= 'postcondition' ( (lv_postconditions_9_0= ruleUCCondition ) )+
					{
					otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleUseCase639); 

					    	newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getPostconditionKeyword_4_1_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:334:3: ( (lv_postconditions_9_0= ruleUCCondition ) )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==RULE_STRING) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:335:3: (lv_postconditions_9_0= ruleUCCondition )
							{
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:335:3: (lv_postconditions_9_0= ruleUCCondition )
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:336:3: lv_postconditions_9_0= ruleUCCondition
							{
							 
								        newCompositeNode(grammarAccess.getUseCaseAccess().getPostconditionsUCConditionParserRuleCall_4_1_1_0()); 
								    
							pushFollow(FOLLOW_ruleUCCondition_in_ruleUseCase660);
							lv_postconditions_9_0=ruleUCCondition();
							state._fsp--;


								        if (current==null) {
								            current = createModelElementForParent(grammarAccess.getUseCaseRule());
								        }
							       		add(
							       			current, 
							       			"postconditions",
							        		lv_postconditions_9_0, 
							        		"UCCondition");
								        afterParserOrEnumRuleCall();
								    
							}

							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					}

					}

					 
						 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
						 				
					}

					}

					}
					break;

				default :
					break loop10;
				}
			}

			}

			}

			 
				  getUnorderedGroupHelper().leave(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
				
			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:366:2: ( (lv_flows_10_0= ruleFlow ) )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==15||LA11_0==18||LA11_0==26||LA11_0==33) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:367:3: (lv_flows_10_0= ruleFlow )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:367:3: (lv_flows_10_0= ruleFlow )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:368:3: lv_flows_10_0= ruleFlow
					{
					 
						        newCompositeNode(grammarAccess.getUseCaseAccess().getFlowsFlowParserRuleCall_5_0()); 
						    
					pushFollow(FOLLOW_ruleFlow_in_ruleUseCase723);
					lv_flows_10_0=ruleFlow();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getUseCaseRule());
						        }
					       		add(
					       			current, 
					       			"flows",
					        		lv_flows_10_0, 
					        		"Flow");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop11;
				}
			}

			otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleUseCase736); 

			    	newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getEndUsecaseKeyword_6());
			    
			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleUseCase"



	// $ANTLR start "entryRuleUCCondition"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:396:1: entryRuleUCCondition returns [EObject current=null] :iv_ruleUCCondition= ruleUCCondition EOF ;
	public final EObject entryRuleUCCondition() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleUCCondition =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:397:2: (iv_ruleUCCondition= ruleUCCondition EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:398:2: iv_ruleUCCondition= ruleUCCondition EOF
			{
			 newCompositeNode(grammarAccess.getUCConditionRule()); 
			pushFollow(FOLLOW_ruleUCCondition_in_entryRuleUCCondition772);
			iv_ruleUCCondition=ruleUCCondition();
			state._fsp--;

			 current =iv_ruleUCCondition; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleUCCondition782); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleUCCondition"



	// $ANTLR start "ruleUCCondition"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:405:1: ruleUCCondition returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
	public final EObject ruleUCCondition() throws RecognitionException {
		EObject current = null;


		Token lv_name_0_0=null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:408:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:409:3: ( (lv_name_0_0= RULE_STRING ) )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:409:3: ( (lv_name_0_0= RULE_STRING ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:410:3: (lv_name_0_0= RULE_STRING )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:410:3: (lv_name_0_0= RULE_STRING )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:411:3: lv_name_0_0= RULE_STRING
			{
			lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUCCondition823); 

						newLeafNode(lv_name_0_0, grammarAccess.getUCConditionAccess().getNameSTRINGTerminalRuleCall_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getUCConditionRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_0_0, 
			        		"STRING");
				    
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleUCCondition"



	// $ANTLR start "entryRuleActor"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:435:1: entryRuleActor returns [EObject current=null] :iv_ruleActor= ruleActor EOF ;
	public final EObject entryRuleActor() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleActor =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:436:2: (iv_ruleActor= ruleActor EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:437:2: iv_ruleActor= ruleActor EOF
			{
			 newCompositeNode(grammarAccess.getActorRule()); 
			pushFollow(FOLLOW_ruleActor_in_entryRuleActor863);
			iv_ruleActor=ruleActor();
			state._fsp--;

			 current =iv_ruleActor; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleActor873); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleActor"



	// $ANTLR start "ruleActor"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:444:1: ruleActor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleActorType ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ) ;
	public final EObject ruleActor() throws RecognitionException {
		EObject current = null;


		Token lv_name_0_0=null;
		Token otherlv_1=null;
		Token lv_description_3_0=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Enumerator lv_type_2_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:447:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleActorType ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:448:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleActorType ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:448:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleActorType ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:448:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleActorType ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:448:2: ( (lv_name_0_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:449:3: (lv_name_0_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:449:3: (lv_name_0_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:450:3: lv_name_0_0= RULE_ID
			{
			lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor915); 

						newLeafNode(lv_name_0_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getActorRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_0_0, 
			        		"ID");
				    
			}

			}

			otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleActor932); 

			    	newLeafNode(otherlv_1, grammarAccess.getActorAccess().getAsKeyword_1());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:470:3: ( (lv_type_2_0= ruleActorType ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:471:3: (lv_type_2_0= ruleActorType )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:471:3: (lv_type_2_0= ruleActorType )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:472:3: lv_type_2_0= ruleActorType
			{
			 
				        newCompositeNode(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_2_0()); 
				    
			pushFollow(FOLLOW_ruleActorType_in_ruleActor953);
			lv_type_2_0=ruleActorType();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getActorRule());
				        }
			       		set(
			       			current, 
			       			"type",
			        		lv_type_2_0, 
			        		"ActorType");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:488:2: ( (lv_description_3_0= RULE_STRING ) )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==RULE_STRING) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:489:3: (lv_description_3_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:489:3: (lv_description_3_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:490:3: lv_description_3_0= RULE_STRING
					{
					lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor970); 

								newLeafNode(lv_description_3_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getActorRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"description",
					        		lv_description_3_0, 
					        		"STRING");
						    
					}

					}
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:506:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==27) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:506:5: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
					{
					otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleActor989); 

					    	newLeafNode(otherlv_4, grammarAccess.getActorAccess().getExtendsKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:510:3: ( (otherlv_5= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:511:3: (otherlv_5= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:511:3: (otherlv_5= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:512:3: otherlv_5= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getActorRule());
						        }
					        
					otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1009); 

							newLeafNode(otherlv_5, grammarAccess.getActorAccess().getExtendsActorCrossReference_4_1_0()); 
						
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleActor"



	// $ANTLR start "entryRuleStep"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:531:1: entryRuleStep returns [EObject current=null] :iv_ruleStep= ruleStep EOF ;
	public final EObject entryRuleStep() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleStep =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:532:2: (iv_ruleStep= ruleStep EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:533:2: iv_ruleStep= ruleStep EOF
			{
			 newCompositeNode(grammarAccess.getStepRule()); 
			pushFollow(FOLLOW_ruleStep_in_entryRuleStep1047);
			iv_ruleStep=ruleStep();
			state._fsp--;

			 current =iv_ruleStep; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStep1057); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleStep"



	// $ANTLR start "ruleStep"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:540:1: ruleStep returns [EObject current=null] : (this_NormalStep_0= ruleNormalStep |this_ParallelStep_1= ruleParallelStep ) ;
	public final EObject ruleStep() throws RecognitionException {
		EObject current = null;


		EObject this_NormalStep_0 =null;
		EObject this_ParallelStep_1 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:543:28: ( (this_NormalStep_0= ruleNormalStep |this_ParallelStep_1= ruleParallelStep ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:544:5: (this_NormalStep_0= ruleNormalStep |this_ParallelStep_1= ruleParallelStep )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:544:5: (this_NormalStep_0= ruleNormalStep |this_ParallelStep_1= ruleParallelStep )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==40) ) {
				alt14=1;
			}
			else if ( (LA14_0==34) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:545:5: this_NormalStep_0= ruleNormalStep
					{
					 
					        newCompositeNode(grammarAccess.getStepAccess().getNormalStepParserRuleCall_0()); 
					    
					pushFollow(FOLLOW_ruleNormalStep_in_ruleStep1104);
					this_NormalStep_0=ruleNormalStep();
					state._fsp--;

					 
					        current = this_NormalStep_0; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:555:5: this_ParallelStep_1= ruleParallelStep
					{
					 
					        newCompositeNode(grammarAccess.getStepAccess().getParallelStepParserRuleCall_1()); 
					    
					pushFollow(FOLLOW_ruleParallelStep_in_ruleStep1131);
					this_ParallelStep_1=ruleParallelStep();
					state._fsp--;

					 
					        current = this_ParallelStep_1; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleStep"



	// $ANTLR start "entryRuleFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:571:1: entryRuleFlow returns [EObject current=null] :iv_ruleFlow= ruleFlow EOF ;
	public final EObject entryRuleFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:572:2: (iv_ruleFlow= ruleFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:573:2: iv_ruleFlow= ruleFlow EOF
			{
			 newCompositeNode(grammarAccess.getFlowRule()); 
			pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow1166);
			iv_ruleFlow=ruleFlow();
			state._fsp--;

			 current =iv_ruleFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleFlow1176); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleFlow"



	// $ANTLR start "ruleFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:580:1: ruleFlow returns [EObject current=null] : (this_BasicFlow_0= ruleBasicFlow |this_NamedFlow_1= ruleNamedFlow ) ;
	public final EObject ruleFlow() throws RecognitionException {
		EObject current = null;


		EObject this_BasicFlow_0 =null;
		EObject this_NamedFlow_1 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:583:28: ( (this_BasicFlow_0= ruleBasicFlow |this_NamedFlow_1= ruleNamedFlow ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:584:5: (this_BasicFlow_0= ruleBasicFlow |this_NamedFlow_1= ruleNamedFlow )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:584:5: (this_BasicFlow_0= ruleBasicFlow |this_NamedFlow_1= ruleNamedFlow )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==18) ) {
				alt15=1;
			}
			else if ( (LA15_0==15||LA15_0==26||LA15_0==33) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:585:5: this_BasicFlow_0= ruleBasicFlow
					{
					 
					        newCompositeNode(grammarAccess.getFlowAccess().getBasicFlowParserRuleCall_0()); 
					    
					pushFollow(FOLLOW_ruleBasicFlow_in_ruleFlow1223);
					this_BasicFlow_0=ruleBasicFlow();
					state._fsp--;

					 
					        current = this_BasicFlow_0; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:595:5: this_NamedFlow_1= ruleNamedFlow
					{
					 
					        newCompositeNode(grammarAccess.getFlowAccess().getNamedFlowParserRuleCall_1()); 
					    
					pushFollow(FOLLOW_ruleNamedFlow_in_ruleFlow1250);
					this_NamedFlow_1=ruleNamedFlow();
					state._fsp--;

					 
					        current = this_NamedFlow_1; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleFlow"



	// $ANTLR start "entryRuleBasicFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:611:1: entryRuleBasicFlow returns [EObject current=null] :iv_ruleBasicFlow= ruleBasicFlow EOF ;
	public final EObject entryRuleBasicFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleBasicFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:612:2: (iv_ruleBasicFlow= ruleBasicFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:613:2: iv_ruleBasicFlow= ruleBasicFlow EOF
			{
			 newCompositeNode(grammarAccess.getBasicFlowRule()); 
			pushFollow(FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow1285);
			iv_ruleBasicFlow=ruleBasicFlow();
			state._fsp--;

			 current =iv_ruleBasicFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleBasicFlow1295); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleBasicFlow"



	// $ANTLR start "ruleBasicFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:620:1: ruleBasicFlow returns [EObject current=null] : (otherlv_0= 'basic flow' () ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? ) ;
	public final EObject ruleBasicFlow() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		EObject lv_steps_2_0 =null;
		EObject lv_finalState_5_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:623:28: ( (otherlv_0= 'basic flow' () ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:624:3: (otherlv_0= 'basic flow' () ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:624:3: (otherlv_0= 'basic flow' () ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:624:3: otherlv_0= 'basic flow' () ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )?
			{
			otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleBasicFlow1332); 

			    	newLeafNode(otherlv_0, grammarAccess.getBasicFlowAccess().getBasicFlowKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:628:5: ()
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:629:5: 
			{

			        current = forceCreateModelElement(
			            grammarAccess.getBasicFlowAccess().getBasicFlowAction_1(),
			            current);
			    
			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:634:2: ( (lv_steps_2_0= ruleStep ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==34||LA16_0==40) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:635:3: (lv_steps_2_0= ruleStep )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:635:3: (lv_steps_2_0= ruleStep )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:636:3: lv_steps_2_0= ruleStep
					{
					 
						        newCompositeNode(grammarAccess.getBasicFlowAccess().getStepsStepParserRuleCall_2_0()); 
						    
					pushFollow(FOLLOW_ruleStep_in_ruleBasicFlow1362);
					lv_steps_2_0=ruleStep();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getBasicFlowRule());
						        }
					       		add(
					       			current, 
					       			"steps",
					        		lv_steps_2_0, 
					        		"Step");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop16;
				}
			}

			otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleBasicFlow1375); 

			    	newLeafNode(otherlv_3, grammarAccess.getBasicFlowAccess().getEndFlowKeyword_3());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:656:3: (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==45) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:656:3: otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) )
					{
					otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleBasicFlow1388); 

					    	newLeafNode(otherlv_4, grammarAccess.getBasicFlowAccess().getWithPostconditionKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:660:3: ( (lv_finalState_5_0= ruleUCCondition ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:661:3: (lv_finalState_5_0= ruleUCCondition )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:661:3: (lv_finalState_5_0= ruleUCCondition )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:662:3: lv_finalState_5_0= ruleUCCondition
					{
					 
						        newCompositeNode(grammarAccess.getBasicFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
						    
					pushFollow(FOLLOW_ruleUCCondition_in_ruleBasicFlow1409);
					lv_finalState_5_0=ruleUCCondition();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getBasicFlowRule());
						        }
					       		set(
					       			current, 
					       			"finalState",
					        		lv_finalState_5_0, 
					        		"UCCondition");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleBasicFlow"



	// $ANTLR start "entryRuleNamedFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:686:1: entryRuleNamedFlow returns [EObject current=null] :iv_ruleNamedFlow= ruleNamedFlow EOF ;
	public final EObject entryRuleNamedFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleNamedFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:687:2: (iv_ruleNamedFlow= ruleNamedFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:688:2: iv_ruleNamedFlow= ruleNamedFlow EOF
			{
			 newCompositeNode(grammarAccess.getNamedFlowRule()); 
			pushFollow(FOLLOW_ruleNamedFlow_in_entryRuleNamedFlow1447);
			iv_ruleNamedFlow=ruleNamedFlow();
			state._fsp--;

			 current =iv_ruleNamedFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleNamedFlow1457); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleNamedFlow"



	// $ANTLR start "ruleNamedFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:695:1: ruleNamedFlow returns [EObject current=null] : (this_ExceptionFlow_0= ruleExceptionFlow |this_AlternativeFlow_1= ruleAlternativeFlow |this_ParallelFlow_2= ruleParallelFlow ) ;
	public final EObject ruleNamedFlow() throws RecognitionException {
		EObject current = null;


		EObject this_ExceptionFlow_0 =null;
		EObject this_AlternativeFlow_1 =null;
		EObject this_ParallelFlow_2 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:698:28: ( (this_ExceptionFlow_0= ruleExceptionFlow |this_AlternativeFlow_1= ruleAlternativeFlow |this_ParallelFlow_2= ruleParallelFlow ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:699:5: (this_ExceptionFlow_0= ruleExceptionFlow |this_AlternativeFlow_1= ruleAlternativeFlow |this_ParallelFlow_2= ruleParallelFlow )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:699:5: (this_ExceptionFlow_0= ruleExceptionFlow |this_AlternativeFlow_1= ruleAlternativeFlow |this_ParallelFlow_2= ruleParallelFlow )
			int alt18=3;
			switch ( input.LA(1) ) {
			case 26:
				{
				alt18=1;
				}
				break;
			case 15:
				{
				alt18=2;
				}
				break;
			case 33:
				{
				alt18=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:700:5: this_ExceptionFlow_0= ruleExceptionFlow
					{
					 
					        newCompositeNode(grammarAccess.getNamedFlowAccess().getExceptionFlowParserRuleCall_0()); 
					    
					pushFollow(FOLLOW_ruleExceptionFlow_in_ruleNamedFlow1504);
					this_ExceptionFlow_0=ruleExceptionFlow();
					state._fsp--;

					 
					        current = this_ExceptionFlow_0; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:710:5: this_AlternativeFlow_1= ruleAlternativeFlow
					{
					 
					        newCompositeNode(grammarAccess.getNamedFlowAccess().getAlternativeFlowParserRuleCall_1()); 
					    
					pushFollow(FOLLOW_ruleAlternativeFlow_in_ruleNamedFlow1531);
					this_AlternativeFlow_1=ruleAlternativeFlow();
					state._fsp--;

					 
					        current = this_AlternativeFlow_1; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 3 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:720:5: this_ParallelFlow_2= ruleParallelFlow
					{
					 
					        newCompositeNode(grammarAccess.getNamedFlowAccess().getParallelFlowParserRuleCall_2()); 
					    
					pushFollow(FOLLOW_ruleParallelFlow_in_ruleNamedFlow1558);
					this_ParallelFlow_2=ruleParallelFlow();
					state._fsp--;

					 
					        current = this_ParallelFlow_2; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleNamedFlow"



	// $ANTLR start "entryRuleExceptionFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:736:1: entryRuleExceptionFlow returns [EObject current=null] :iv_ruleExceptionFlow= ruleExceptionFlow EOF ;
	public final EObject entryRuleExceptionFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleExceptionFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:737:2: (iv_ruleExceptionFlow= ruleExceptionFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:738:2: iv_ruleExceptionFlow= ruleExceptionFlow EOF
			{
			 newCompositeNode(grammarAccess.getExceptionFlowRule()); 
			pushFollow(FOLLOW_ruleExceptionFlow_in_entryRuleExceptionFlow1593);
			iv_ruleExceptionFlow=ruleExceptionFlow();
			state._fsp--;

			 current =iv_ruleExceptionFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionFlow1603); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleExceptionFlow"



	// $ANTLR start "ruleExceptionFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:745:1: ruleExceptionFlow returns [EObject current=null] : (otherlv_0= 'exception flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )* otherlv_6= 'end flow' (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= ruleUCCondition ) ) )? ) ;
	public final EObject ruleExceptionFlow() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_2=null;
		Token lv_condition_3_0=null;
		Token otherlv_4=null;
		Token otherlv_6=null;
		Token otherlv_7=null;
		EObject lv_steps_5_0 =null;
		EObject lv_finalState_8_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:748:28: ( (otherlv_0= 'exception flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )* otherlv_6= 'end flow' (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= ruleUCCondition ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:749:3: (otherlv_0= 'exception flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )* otherlv_6= 'end flow' (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= ruleUCCondition ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:749:3: (otherlv_0= 'exception flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )* otherlv_6= 'end flow' (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= ruleUCCondition ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:749:3: otherlv_0= 'exception flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )* otherlv_6= 'end flow' (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= ruleUCCondition ) ) )?
			{
			otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleExceptionFlow1640); 

			    	newLeafNode(otherlv_0, grammarAccess.getExceptionFlowAccess().getExceptionFlowKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:753:3: ( (lv_name_1_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:754:3: (lv_name_1_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:754:3: (lv_name_1_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:755:3: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExceptionFlow1657); 

						newLeafNode(lv_name_1_0, grammarAccess.getExceptionFlowAccess().getNameIDTerminalRuleCall_1_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getExceptionFlowRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_1_0, 
			        		"ID");
				    
			}

			}

			otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleExceptionFlow1674); 

			    	newLeafNode(otherlv_2, grammarAccess.getExceptionFlowAccess().getIfKeyword_2());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:775:3: ( (lv_condition_3_0= RULE_STRING ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:776:3: (lv_condition_3_0= RULE_STRING )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:776:3: (lv_condition_3_0= RULE_STRING )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:777:3: lv_condition_3_0= RULE_STRING
			{
			lv_condition_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExceptionFlow1691); 

						newLeafNode(lv_condition_3_0, grammarAccess.getExceptionFlowAccess().getConditionSTRINGTerminalRuleCall_3_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getExceptionFlowRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"condition",
			        		lv_condition_3_0, 
			        		"STRING");
				    
			}

			}

			otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleExceptionFlow1708); 

			    	newLeafNode(otherlv_4, grammarAccess.getExceptionFlowAccess().getThenKeyword_4());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:797:3: ( (lv_steps_5_0= ruleStep ) )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==34||LA19_0==40) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:798:3: (lv_steps_5_0= ruleStep )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:798:3: (lv_steps_5_0= ruleStep )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:799:3: lv_steps_5_0= ruleStep
					{
					 
						        newCompositeNode(grammarAccess.getExceptionFlowAccess().getStepsStepParserRuleCall_5_0()); 
						    
					pushFollow(FOLLOW_ruleStep_in_ruleExceptionFlow1729);
					lv_steps_5_0=ruleStep();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getExceptionFlowRule());
						        }
					       		add(
					       			current, 
					       			"steps",
					        		lv_steps_5_0, 
					        		"Step");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop19;
				}
			}

			otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleExceptionFlow1742); 

			    	newLeafNode(otherlv_6, grammarAccess.getExceptionFlowAccess().getEndFlowKeyword_6());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:819:3: (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= ruleUCCondition ) ) )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==45) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:819:3: otherlv_7= 'with postcondition' ( (lv_finalState_8_0= ruleUCCondition ) )
					{
					otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleExceptionFlow1755); 

					    	newLeafNode(otherlv_7, grammarAccess.getExceptionFlowAccess().getWithPostconditionKeyword_7_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:823:3: ( (lv_finalState_8_0= ruleUCCondition ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:824:3: (lv_finalState_8_0= ruleUCCondition )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:824:3: (lv_finalState_8_0= ruleUCCondition )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:825:3: lv_finalState_8_0= ruleUCCondition
					{
					 
						        newCompositeNode(grammarAccess.getExceptionFlowAccess().getFinalStateUCConditionParserRuleCall_7_1_0()); 
						    
					pushFollow(FOLLOW_ruleUCCondition_in_ruleExceptionFlow1776);
					lv_finalState_8_0=ruleUCCondition();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getExceptionFlowRule());
						        }
					       		set(
					       			current, 
					       			"finalState",
					        		lv_finalState_8_0, 
					        		"UCCondition");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleExceptionFlow"



	// $ANTLR start "entryRuleAlternativeFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:849:1: entryRuleAlternativeFlow returns [EObject current=null] :iv_ruleAlternativeFlow= ruleAlternativeFlow EOF ;
	public final EObject entryRuleAlternativeFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleAlternativeFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:850:2: (iv_ruleAlternativeFlow= ruleAlternativeFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:851:2: iv_ruleAlternativeFlow= ruleAlternativeFlow EOF
			{
			 newCompositeNode(grammarAccess.getAlternativeFlowRule()); 
			pushFollow(FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow1814);
			iv_ruleAlternativeFlow=ruleAlternativeFlow();
			state._fsp--;

			 current =iv_ruleAlternativeFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlow1824); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleAlternativeFlow"



	// $ANTLR start "ruleAlternativeFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:858:1: ruleAlternativeFlow returns [EObject current=null] : (otherlv_0= 'alternative flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? ) ;
	public final EObject ruleAlternativeFlow() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		EObject lv_steps_2_0 =null;
		EObject lv_finalState_5_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:861:28: ( (otherlv_0= 'alternative flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:862:3: (otherlv_0= 'alternative flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:862:3: (otherlv_0= 'alternative flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:862:3: otherlv_0= 'alternative flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )?
			{
			otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleAlternativeFlow1861); 

			    	newLeafNode(otherlv_0, grammarAccess.getAlternativeFlowAccess().getAlternativeFlowKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:866:3: ( (lv_name_1_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:867:3: (lv_name_1_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:867:3: (lv_name_1_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:868:3: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternativeFlow1878); 

						newLeafNode(lv_name_1_0, grammarAccess.getAlternativeFlowAccess().getNameIDTerminalRuleCall_1_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getAlternativeFlowRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_1_0, 
			        		"ID");
				    
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:884:2: ( (lv_steps_2_0= ruleStep ) )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==34||LA21_0==40) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:885:3: (lv_steps_2_0= ruleStep )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:885:3: (lv_steps_2_0= ruleStep )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:886:3: lv_steps_2_0= ruleStep
					{
					 
						        newCompositeNode(grammarAccess.getAlternativeFlowAccess().getStepsStepParserRuleCall_2_0()); 
						    
					pushFollow(FOLLOW_ruleStep_in_ruleAlternativeFlow1904);
					lv_steps_2_0=ruleStep();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getAlternativeFlowRule());
						        }
					       		add(
					       			current, 
					       			"steps",
					        		lv_steps_2_0, 
					        		"Step");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop21;
				}
			}

			otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleAlternativeFlow1917); 

			    	newLeafNode(otherlv_3, grammarAccess.getAlternativeFlowAccess().getEndFlowKeyword_3());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:906:3: (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==45) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:906:3: otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) )
					{
					otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleAlternativeFlow1930); 

					    	newLeafNode(otherlv_4, grammarAccess.getAlternativeFlowAccess().getWithPostconditionKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:910:3: ( (lv_finalState_5_0= ruleUCCondition ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:911:3: (lv_finalState_5_0= ruleUCCondition )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:911:3: (lv_finalState_5_0= ruleUCCondition )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:912:3: lv_finalState_5_0= ruleUCCondition
					{
					 
						        newCompositeNode(grammarAccess.getAlternativeFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
						    
					pushFollow(FOLLOW_ruleUCCondition_in_ruleAlternativeFlow1951);
					lv_finalState_5_0=ruleUCCondition();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getAlternativeFlowRule());
						        }
					       		set(
					       			current, 
					       			"finalState",
					        		lv_finalState_5_0, 
					        		"UCCondition");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleAlternativeFlow"



	// $ANTLR start "entryRuleParallelFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:936:1: entryRuleParallelFlow returns [EObject current=null] :iv_ruleParallelFlow= ruleParallelFlow EOF ;
	public final EObject entryRuleParallelFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleParallelFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:937:2: (iv_ruleParallelFlow= ruleParallelFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:938:2: iv_ruleParallelFlow= ruleParallelFlow EOF
			{
			 newCompositeNode(grammarAccess.getParallelFlowRule()); 
			pushFollow(FOLLOW_ruleParallelFlow_in_entryRuleParallelFlow1989);
			iv_ruleParallelFlow=ruleParallelFlow();
			state._fsp--;

			 current =iv_ruleParallelFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParallelFlow1999); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleParallelFlow"



	// $ANTLR start "ruleParallelFlow"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:945:1: ruleParallelFlow returns [EObject current=null] : (otherlv_0= 'parallel flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? ) ;
	public final EObject ruleParallelFlow() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		EObject lv_steps_2_0 =null;
		EObject lv_finalState_5_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:948:28: ( (otherlv_0= 'parallel flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:949:3: (otherlv_0= 'parallel flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:949:3: (otherlv_0= 'parallel flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:949:3: otherlv_0= 'parallel flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )* otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )?
			{
			otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleParallelFlow2036); 

			    	newLeafNode(otherlv_0, grammarAccess.getParallelFlowAccess().getParallelFlowKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:953:3: ( (lv_name_1_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:954:3: (lv_name_1_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:954:3: (lv_name_1_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:955:3: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParallelFlow2053); 

						newLeafNode(lv_name_1_0, grammarAccess.getParallelFlowAccess().getNameIDTerminalRuleCall_1_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getParallelFlowRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_1_0, 
			        		"ID");
				    
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:971:2: ( (lv_steps_2_0= ruleStep ) )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==34||LA23_0==40) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:972:3: (lv_steps_2_0= ruleStep )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:972:3: (lv_steps_2_0= ruleStep )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:973:3: lv_steps_2_0= ruleStep
					{
					 
						        newCompositeNode(grammarAccess.getParallelFlowAccess().getStepsStepParserRuleCall_2_0()); 
						    
					pushFollow(FOLLOW_ruleStep_in_ruleParallelFlow2079);
					lv_steps_2_0=ruleStep();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getParallelFlowRule());
						        }
					       		add(
					       			current, 
					       			"steps",
					        		lv_steps_2_0, 
					        		"Step");
						        afterParserOrEnumRuleCall();
						    
					}

					}
					break;

				default :
					break loop23;
				}
			}

			otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleParallelFlow2092); 

			    	newLeafNode(otherlv_3, grammarAccess.getParallelFlowAccess().getEndFlowKeyword_3());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:993:3: (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) ) )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==45) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:993:3: otherlv_4= 'with postcondition' ( (lv_finalState_5_0= ruleUCCondition ) )
					{
					otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleParallelFlow2105); 

					    	newLeafNode(otherlv_4, grammarAccess.getParallelFlowAccess().getWithPostconditionKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:997:3: ( (lv_finalState_5_0= ruleUCCondition ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:998:3: (lv_finalState_5_0= ruleUCCondition )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:998:3: (lv_finalState_5_0= ruleUCCondition )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:999:3: lv_finalState_5_0= ruleUCCondition
					{
					 
						        newCompositeNode(grammarAccess.getParallelFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
						    
					pushFollow(FOLLOW_ruleUCCondition_in_ruleParallelFlow2126);
					lv_finalState_5_0=ruleUCCondition();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getParallelFlowRule());
						        }
					       		set(
					       			current, 
					       			"finalState",
					        		lv_finalState_5_0, 
					        		"UCCondition");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleParallelFlow"



	// $ANTLR start "entryRuleStepAlternative"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1023:1: entryRuleStepAlternative returns [EObject current=null] :iv_ruleStepAlternative= ruleStepAlternative EOF ;
	public final EObject entryRuleStepAlternative() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleStepAlternative =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1024:2: (iv_ruleStepAlternative= ruleStepAlternative EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1025:2: iv_ruleStepAlternative= ruleStepAlternative EOF
			{
			 newCompositeNode(grammarAccess.getStepAlternativeRule()); 
			pushFollow(FOLLOW_ruleStepAlternative_in_entryRuleStepAlternative2164);
			iv_ruleStepAlternative=ruleStepAlternative();
			state._fsp--;

			 current =iv_ruleStepAlternative; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStepAlternative2174); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleStepAlternative"



	// $ANTLR start "ruleStepAlternative"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1032:1: ruleStepAlternative returns [EObject current=null] : (this_Condition_0= ruleCondition |this_LocalAlternative_1= ruleLocalAlternative |this_AlternativeFlowAlternative_2= ruleAlternativeFlowAlternative ) ;
	public final EObject ruleStepAlternative() throws RecognitionException {
		EObject current = null;


		EObject this_Condition_0 =null;
		EObject this_LocalAlternative_1 =null;
		EObject this_AlternativeFlowAlternative_2 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1035:28: ( (this_Condition_0= ruleCondition |this_LocalAlternative_1= ruleLocalAlternative |this_AlternativeFlowAlternative_2= ruleAlternativeFlowAlternative ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1036:5: (this_Condition_0= ruleCondition |this_LocalAlternative_1= ruleLocalAlternative |this_AlternativeFlowAlternative_2= ruleAlternativeFlowAlternative )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1036:5: (this_Condition_0= ruleCondition |this_LocalAlternative_1= ruleLocalAlternative |this_AlternativeFlowAlternative_2= ruleAlternativeFlowAlternative )
			int alt25=3;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==28) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==RULE_STRING) ) {
					int LA25_2 = input.LA(3);
					if ( (LA25_2==42) ) {
						switch ( input.LA(4) ) {
						case EOF:
						case 21:
						case 22:
						case 28:
							{
							alt25=1;
							}
							break;
						case RULE_STRING:
						case 29:
							{
							alt25=2;
							}
							break;
						case 15:
							{
							alt25=3;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 25, 3, input);
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
								new NoViableAltException("", 25, 2, input);
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
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1037:5: this_Condition_0= ruleCondition
					{
					 
					        newCompositeNode(grammarAccess.getStepAlternativeAccess().getConditionParserRuleCall_0()); 
					    
					pushFollow(FOLLOW_ruleCondition_in_ruleStepAlternative2221);
					this_Condition_0=ruleCondition();
					state._fsp--;

					 
					        current = this_Condition_0; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1047:5: this_LocalAlternative_1= ruleLocalAlternative
					{
					 
					        newCompositeNode(grammarAccess.getStepAlternativeAccess().getLocalAlternativeParserRuleCall_1()); 
					    
					pushFollow(FOLLOW_ruleLocalAlternative_in_ruleStepAlternative2248);
					this_LocalAlternative_1=ruleLocalAlternative();
					state._fsp--;

					 
					        current = this_LocalAlternative_1; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 3 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1057:5: this_AlternativeFlowAlternative_2= ruleAlternativeFlowAlternative
					{
					 
					        newCompositeNode(grammarAccess.getStepAlternativeAccess().getAlternativeFlowAlternativeParserRuleCall_2()); 
					    
					pushFollow(FOLLOW_ruleAlternativeFlowAlternative_in_ruleStepAlternative2275);
					this_AlternativeFlowAlternative_2=ruleAlternativeFlowAlternative();
					state._fsp--;

					 
					        current = this_AlternativeFlowAlternative_2; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleStepAlternative"



	// $ANTLR start "entryRuleCondition"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1073:1: entryRuleCondition returns [EObject current=null] :iv_ruleCondition= ruleCondition EOF ;
	public final EObject entryRuleCondition() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleCondition =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1074:2: (iv_ruleCondition= ruleCondition EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1075:2: iv_ruleCondition= ruleCondition EOF
			{
			 newCompositeNode(grammarAccess.getConditionRule()); 
			pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition2310);
			iv_ruleCondition=ruleCondition();
			state._fsp--;

			 current =iv_ruleCondition; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleCondition2320); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleCondition"



	// $ANTLR start "ruleCondition"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1082:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )? ) ;
	public final EObject ruleCondition() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_condition_1_0=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_4=null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1085:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1086:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1086:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1086:3: otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )?
			{
			otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleCondition2357); 

			    	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1090:3: ( (lv_condition_1_0= RULE_STRING ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1091:3: (lv_condition_1_0= RULE_STRING )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1091:3: (lv_condition_1_0= RULE_STRING )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1092:3: lv_condition_1_0= RULE_STRING
			{
			lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCondition2374); 

						newLeafNode(lv_condition_1_0, grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getConditionRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"condition",
			        		lv_condition_1_0, 
			        		"STRING");
				    
			}

			}

			otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleCondition2391); 

			    	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getThenKeyword_2());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1112:3: (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==21) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1112:3: otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) )
					{
					otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleCondition2404); 

					    	newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getContinueWithStepKeyword_3_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1116:3: ( (otherlv_4= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1117:3: (otherlv_4= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1117:3: (otherlv_4= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1118:3: otherlv_4= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getConditionRule());
						        }
					        
					otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCondition2424); 

							newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getContinuationStepCrossReference_3_1_0()); 
						
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleCondition"



	// $ANTLR start "entryRuleLocalAlternative"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1137:1: entryRuleLocalAlternative returns [EObject current=null] :iv_ruleLocalAlternative= ruleLocalAlternative EOF ;
	public final EObject entryRuleLocalAlternative() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleLocalAlternative =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1138:2: (iv_ruleLocalAlternative= ruleLocalAlternative EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1139:2: iv_ruleLocalAlternative= ruleLocalAlternative EOF
			{
			 newCompositeNode(grammarAccess.getLocalAlternativeRule()); 
			pushFollow(FOLLOW_ruleLocalAlternative_in_entryRuleLocalAlternative2462);
			iv_ruleLocalAlternative=ruleLocalAlternative();
			state._fsp--;

			 current =iv_ruleLocalAlternative; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAlternative2472); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleLocalAlternative"



	// $ANTLR start "ruleLocalAlternative"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1146:1: ruleLocalAlternative returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) ) (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )? ) ;
	public final EObject ruleLocalAlternative() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_condition_1_0=null;
		Token otherlv_2=null;
		Token lv_description_3_0=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_6=null;
		Token otherlv_7=null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1149:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) ) (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1150:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) ) (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1150:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) ) (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1150:3: otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) ) (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )?
			{
			otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleLocalAlternative2509); 

			    	newLeafNode(otherlv_0, grammarAccess.getLocalAlternativeAccess().getIfKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1154:3: ( (lv_condition_1_0= RULE_STRING ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1155:3: (lv_condition_1_0= RULE_STRING )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1155:3: (lv_condition_1_0= RULE_STRING )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1156:3: lv_condition_1_0= RULE_STRING
			{
			lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLocalAlternative2526); 

						newLeafNode(lv_condition_1_0, grammarAccess.getLocalAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getLocalAlternativeRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"condition",
			        		lv_condition_1_0, 
			        		"STRING");
				    
			}

			}

			otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleLocalAlternative2543); 

			    	newLeafNode(otherlv_2, grammarAccess.getLocalAlternativeAccess().getThenKeyword_2());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1176:2: ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==RULE_STRING) ) {
				alt27=1;
			}
			else if ( (LA27_0==29) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1176:2: ( (lv_description_3_0= RULE_STRING ) )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1176:2: ( (lv_description_3_0= RULE_STRING ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1177:3: (lv_description_3_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1177:3: (lv_description_3_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1178:3: lv_description_3_0= RULE_STRING
					{
					lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLocalAlternative2561); 

								newLeafNode(lv_description_3_0, grammarAccess.getLocalAlternativeAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getLocalAlternativeRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"description",
					        		lv_description_3_0, 
					        		"STRING");
						    
					}

					}

					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1195:6: (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1195:6: (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1195:8: otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) )
					{
					otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleLocalAlternative2585); 

					    	newLeafNode(otherlv_4, grammarAccess.getLocalAlternativeAccess().getInvokeUsecaseKeyword_3_1_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1199:3: ( (otherlv_5= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1200:3: (otherlv_5= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1200:3: (otherlv_5= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1201:3: otherlv_5= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getLocalAlternativeRule());
						        }
					        
					otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalAlternative2605); 

							newLeafNode(otherlv_5, grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseCrossReference_3_1_1_0()); 
						
					}

					}

					}

					}
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1212:4: (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==21) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1212:6: otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) )
					{
					otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleLocalAlternative2620); 

					    	newLeafNode(otherlv_6, grammarAccess.getLocalAlternativeAccess().getContinueWithStepKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1216:3: ( (otherlv_7= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1217:3: (otherlv_7= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1217:3: (otherlv_7= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1218:3: otherlv_7= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getLocalAlternativeRule());
						        }
					        
					otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalAlternative2640); 

							newLeafNode(otherlv_7, grammarAccess.getLocalAlternativeAccess().getContinuationStepCrossReference_4_1_0()); 
						
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleLocalAlternative"



	// $ANTLR start "entryRuleAlternativeFlowAlternative"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1237:1: entryRuleAlternativeFlowAlternative returns [EObject current=null] :iv_ruleAlternativeFlowAlternative= ruleAlternativeFlowAlternative EOF ;
	public final EObject entryRuleAlternativeFlowAlternative() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleAlternativeFlowAlternative =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1238:2: (iv_ruleAlternativeFlowAlternative= ruleAlternativeFlowAlternative EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1239:2: iv_ruleAlternativeFlowAlternative= ruleAlternativeFlowAlternative EOF
			{
			 newCompositeNode(grammarAccess.getAlternativeFlowAlternativeRule()); 
			pushFollow(FOLLOW_ruleAlternativeFlowAlternative_in_entryRuleAlternativeFlowAlternative2678);
			iv_ruleAlternativeFlowAlternative=ruleAlternativeFlowAlternative();
			state._fsp--;

			 current =iv_ruleAlternativeFlowAlternative; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlowAlternative2688); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleAlternativeFlowAlternative"



	// $ANTLR start "ruleAlternativeFlowAlternative"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1246:1: ruleAlternativeFlowAlternative returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' otherlv_3= 'alternative flow' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )? ) ;
	public final EObject ruleAlternativeFlowAlternative() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_condition_1_0=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_6=null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1249:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' otherlv_3= 'alternative flow' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1250:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' otherlv_3= 'alternative flow' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1250:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' otherlv_3= 'alternative flow' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1250:3: otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' otherlv_3= 'alternative flow' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )?
			{
			otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAlternativeFlowAlternative2725); 

			    	newLeafNode(otherlv_0, grammarAccess.getAlternativeFlowAlternativeAccess().getIfKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1254:3: ( (lv_condition_1_0= RULE_STRING ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1255:3: (lv_condition_1_0= RULE_STRING )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1255:3: (lv_condition_1_0= RULE_STRING )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1256:3: lv_condition_1_0= RULE_STRING
			{
			lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAlternativeFlowAlternative2742); 

						newLeafNode(lv_condition_1_0, grammarAccess.getAlternativeFlowAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getAlternativeFlowAlternativeRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"condition",
			        		lv_condition_1_0, 
			        		"STRING");
				    
			}

			}

			otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleAlternativeFlowAlternative2759); 

			    	newLeafNode(otherlv_2, grammarAccess.getAlternativeFlowAlternativeAccess().getThenKeyword_2());
			    
			otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleAlternativeFlowAlternative2771); 

			    	newLeafNode(otherlv_3, grammarAccess.getAlternativeFlowAlternativeAccess().getAlternativeFlowKeyword_3());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1280:3: ( (otherlv_4= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1281:3: (otherlv_4= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1281:3: (otherlv_4= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1282:3: otherlv_4= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getAlternativeFlowAlternativeRule());
				        }
			        
			otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternativeFlowAlternative2791); 

					newLeafNode(otherlv_4, grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowCrossReference_4_0()); 
				
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1293:2: (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==21) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1293:4: otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) )
					{
					otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleAlternativeFlowAlternative2804); 

					    	newLeafNode(otherlv_5, grammarAccess.getAlternativeFlowAlternativeAccess().getContinueWithStepKeyword_5_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1297:3: ( (otherlv_6= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1298:3: (otherlv_6= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1298:3: (otherlv_6= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1299:3: otherlv_6= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getAlternativeFlowAlternativeRule());
						        }
					        
					otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternativeFlowAlternative2824); 

							newLeafNode(otherlv_6, grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepCrossReference_5_1_0()); 
						
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleAlternativeFlowAlternative"



	// $ANTLR start "entryRuleParallelStep"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1318:1: entryRuleParallelStep returns [EObject current=null] :iv_ruleParallelStep= ruleParallelStep EOF ;
	public final EObject entryRuleParallelStep() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleParallelStep =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1319:2: (iv_ruleParallelStep= ruleParallelStep EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1320:2: iv_ruleParallelStep= ruleParallelStep EOF
			{
			 newCompositeNode(grammarAccess.getParallelStepRule()); 
			pushFollow(FOLLOW_ruleParallelStep_in_entryRuleParallelStep2862);
			iv_ruleParallelStep=ruleParallelStep();
			state._fsp--;

			 current =iv_ruleParallelStep; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParallelStep2872); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleParallelStep"



	// $ANTLR start "ruleParallelStep"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1327:1: ruleParallelStep returns [EObject current=null] : (otherlv_0= 'parallel step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'next' ( (otherlv_7= RULE_ID ) ) )? ) ;
	public final EObject ruleParallelStep() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token lv_label_2_0=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_6=null;
		Token otherlv_7=null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1330:28: ( (otherlv_0= 'parallel step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'next' ( (otherlv_7= RULE_ID ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1331:3: (otherlv_0= 'parallel step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'next' ( (otherlv_7= RULE_ID ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1331:3: (otherlv_0= 'parallel step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'next' ( (otherlv_7= RULE_ID ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1331:3: otherlv_0= 'parallel step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= 'next' ( (otherlv_7= RULE_ID ) ) )?
			{
			otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleParallelStep2909); 

			    	newLeafNode(otherlv_0, grammarAccess.getParallelStepAccess().getParallelStepKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1335:3: ( (lv_name_1_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1336:3: (lv_name_1_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1336:3: (lv_name_1_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1337:3: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParallelStep2926); 

						newLeafNode(lv_name_1_0, grammarAccess.getParallelStepAccess().getNameIDTerminalRuleCall_1_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getParallelStepRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_1_0, 
			        		"ID");
				    
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1353:2: ( (lv_label_2_0= RULE_STRING ) )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==RULE_STRING) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1354:3: (lv_label_2_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1354:3: (lv_label_2_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1355:3: lv_label_2_0= RULE_STRING
					{
					lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParallelStep2948); 

								newLeafNode(lv_label_2_0, grammarAccess.getParallelStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getParallelStepRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"label",
					        		lv_label_2_0, 
					        		"STRING");
						    
					}

					}
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1371:3: ( (otherlv_3= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1372:3: (otherlv_3= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1372:3: (otherlv_3= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1373:3: otherlv_3= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getParallelStepRule());
				        }
			        
			otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParallelStep2974); 

					newLeafNode(otherlv_3, grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_3_0()); 
				
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1384:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==11) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1384:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
					{
					otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleParallelStep2987); 

					    	newLeafNode(otherlv_4, grammarAccess.getParallelStepAccess().getCommaKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1388:3: ( (otherlv_5= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1389:3: (otherlv_5= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1389:3: (otherlv_5= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1390:3: otherlv_5= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getParallelStepRule());
						        }
					        
					otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParallelStep3007); 

							newLeafNode(otherlv_5, grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_4_1_0()); 
						
					}

					}

					}
					break;

				default :
					break loop31;
				}
			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1401:4: (otherlv_6= 'next' ( (otherlv_7= RULE_ID ) ) )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==30) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1401:6: otherlv_6= 'next' ( (otherlv_7= RULE_ID ) )
					{
					otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleParallelStep3022); 

					    	newLeafNode(otherlv_6, grammarAccess.getParallelStepAccess().getNextKeyword_5_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1405:3: ( (otherlv_7= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1406:3: (otherlv_7= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1406:3: (otherlv_7= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1407:3: otherlv_7= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getParallelStepRule());
						        }
					        
					otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParallelStep3042); 

							newLeafNode(otherlv_7, grammarAccess.getParallelStepAccess().getNextStepCrossReference_5_1_0()); 
						
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleParallelStep"



	// $ANTLR start "entryRuleNormalStep"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1426:1: entryRuleNormalStep returns [EObject current=null] :iv_ruleNormalStep= ruleNormalStep EOF ;
	public final EObject entryRuleNormalStep() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleNormalStep =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1427:2: (iv_ruleNormalStep= ruleNormalStep EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1428:2: iv_ruleNormalStep= ruleNormalStep EOF
			{
			 newCompositeNode(grammarAccess.getNormalStepRule()); 
			pushFollow(FOLLOW_ruleNormalStep_in_entryRuleNormalStep3080);
			iv_ruleNormalStep=ruleNormalStep();
			state._fsp--;

			 current =iv_ruleNormalStep; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleNormalStep3090); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleNormalStep"



	// $ANTLR start "ruleNormalStep"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1435:1: ruleNormalStep returns [EObject current=null] : (otherlv_0= 'step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (lv_type_3_0= ruleStepType ) ) otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'alternatives' ( (lv_stepAlternative_7_0= ruleStepAlternative ) )+ otherlv_8= 'else' ) | (otherlv_9= 'invoke usecase' ( (otherlv_10= RULE_ID ) ) ) )? (otherlv_11= 'next' ( (otherlv_12= RULE_ID ) ) )? ) ;
	public final EObject ruleNormalStep() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token lv_label_2_0=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_6=null;
		Token otherlv_8=null;
		Token otherlv_9=null;
		Token otherlv_10=null;
		Token otherlv_11=null;
		Token otherlv_12=null;
		Enumerator lv_type_3_0 =null;
		EObject lv_stepAlternative_7_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1438:28: ( (otherlv_0= 'step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (lv_type_3_0= ruleStepType ) ) otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'alternatives' ( (lv_stepAlternative_7_0= ruleStepAlternative ) )+ otherlv_8= 'else' ) | (otherlv_9= 'invoke usecase' ( (otherlv_10= RULE_ID ) ) ) )? (otherlv_11= 'next' ( (otherlv_12= RULE_ID ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1439:3: (otherlv_0= 'step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (lv_type_3_0= ruleStepType ) ) otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'alternatives' ( (lv_stepAlternative_7_0= ruleStepAlternative ) )+ otherlv_8= 'else' ) | (otherlv_9= 'invoke usecase' ( (otherlv_10= RULE_ID ) ) ) )? (otherlv_11= 'next' ( (otherlv_12= RULE_ID ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1439:3: (otherlv_0= 'step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (lv_type_3_0= ruleStepType ) ) otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'alternatives' ( (lv_stepAlternative_7_0= ruleStepAlternative ) )+ otherlv_8= 'else' ) | (otherlv_9= 'invoke usecase' ( (otherlv_10= RULE_ID ) ) ) )? (otherlv_11= 'next' ( (otherlv_12= RULE_ID ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1439:3: otherlv_0= 'step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (lv_type_3_0= ruleStepType ) ) otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= 'alternatives' ( (lv_stepAlternative_7_0= ruleStepAlternative ) )+ otherlv_8= 'else' ) | (otherlv_9= 'invoke usecase' ( (otherlv_10= RULE_ID ) ) ) )? (otherlv_11= 'next' ( (otherlv_12= RULE_ID ) ) )?
			{
			otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleNormalStep3127); 

			    	newLeafNode(otherlv_0, grammarAccess.getNormalStepAccess().getStepKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1443:3: ( (lv_name_1_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1444:3: (lv_name_1_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1444:3: (lv_name_1_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1445:3: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNormalStep3144); 

						newLeafNode(lv_name_1_0, grammarAccess.getNormalStepAccess().getNameIDTerminalRuleCall_1_0()); 
					

				        if (current==null) {
				            current = createModelElement(grammarAccess.getNormalStepRule());
				        }
			       		setWithLastConsumed(
			       			current, 
			       			"name",
			        		lv_name_1_0, 
			        		"ID");
				    
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1461:2: ( (lv_label_2_0= RULE_STRING ) )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==RULE_STRING) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1462:3: (lv_label_2_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1462:3: (lv_label_2_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1463:3: lv_label_2_0= RULE_STRING
					{
					lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNormalStep3166); 

								newLeafNode(lv_label_2_0, grammarAccess.getNormalStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getNormalStepRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"label",
					        		lv_label_2_0, 
					        		"STRING");
						    
					}

					}
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1479:3: ( (lv_type_3_0= ruleStepType ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1480:3: (lv_type_3_0= ruleStepType )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1480:3: (lv_type_3_0= ruleStepType )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1481:3: lv_type_3_0= ruleStepType
			{
			 
				        newCompositeNode(grammarAccess.getNormalStepAccess().getTypeStepTypeEnumRuleCall_3_0()); 
				    
			pushFollow(FOLLOW_ruleStepType_in_ruleNormalStep3193);
			lv_type_3_0=ruleStepType();
			state._fsp--;


				        if (current==null) {
				            current = createModelElementForParent(grammarAccess.getNormalStepRule());
				        }
			       		set(
			       			current, 
			       			"type",
			        		lv_type_3_0, 
			        		"StepType");
				        afterParserOrEnumRuleCall();
				    
			}

			}

			otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleNormalStep3205); 

			    	newLeafNode(otherlv_4, grammarAccess.getNormalStepAccess().getByKeyword_4());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1501:3: ( (otherlv_5= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1502:3: (otherlv_5= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1502:3: (otherlv_5= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1503:3: otherlv_5= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getNormalStepRule());
				        }
			        
			otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNormalStep3225); 

					newLeafNode(otherlv_5, grammarAccess.getNormalStepAccess().getActorActorCrossReference_5_0()); 
				
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1514:2: ( (otherlv_6= 'alternatives' ( (lv_stepAlternative_7_0= ruleStepAlternative ) )+ otherlv_8= 'else' ) | (otherlv_9= 'invoke usecase' ( (otherlv_10= RULE_ID ) ) ) )?
			int alt35=3;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==16) ) {
				alt35=1;
			}
			else if ( (LA35_0==29) ) {
				alt35=2;
			}
			switch (alt35) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1514:3: (otherlv_6= 'alternatives' ( (lv_stepAlternative_7_0= ruleStepAlternative ) )+ otherlv_8= 'else' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1514:3: (otherlv_6= 'alternatives' ( (lv_stepAlternative_7_0= ruleStepAlternative ) )+ otherlv_8= 'else' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1514:5: otherlv_6= 'alternatives' ( (lv_stepAlternative_7_0= ruleStepAlternative ) )+ otherlv_8= 'else'
					{
					otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleNormalStep3239); 

					    	newLeafNode(otherlv_6, grammarAccess.getNormalStepAccess().getAlternativesKeyword_6_0_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1518:3: ( (lv_stepAlternative_7_0= ruleStepAlternative ) )+
					int cnt34=0;
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==28) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1519:3: (lv_stepAlternative_7_0= ruleStepAlternative )
							{
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1519:3: (lv_stepAlternative_7_0= ruleStepAlternative )
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1520:3: lv_stepAlternative_7_0= ruleStepAlternative
							{
							 
								        newCompositeNode(grammarAccess.getNormalStepAccess().getStepAlternativeStepAlternativeParserRuleCall_6_0_1_0()); 
								    
							pushFollow(FOLLOW_ruleStepAlternative_in_ruleNormalStep3260);
							lv_stepAlternative_7_0=ruleStepAlternative();
							state._fsp--;


								        if (current==null) {
								            current = createModelElementForParent(grammarAccess.getNormalStepRule());
								        }
							       		add(
							       			current, 
							       			"stepAlternative",
							        		lv_stepAlternative_7_0, 
							        		"StepAlternative");
								        afterParserOrEnumRuleCall();
								    
							}

							}
							break;

						default :
							if ( cnt34 >= 1 ) break loop34;
							EarlyExitException eee = new EarlyExitException(34, input);
							throw eee;
						}
						cnt34++;
					}

					otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleNormalStep3273); 

					    	newLeafNode(otherlv_8, grammarAccess.getNormalStepAccess().getElseKeyword_6_0_2());
					    
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1541:6: (otherlv_9= 'invoke usecase' ( (otherlv_10= RULE_ID ) ) )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1541:6: (otherlv_9= 'invoke usecase' ( (otherlv_10= RULE_ID ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1541:8: otherlv_9= 'invoke usecase' ( (otherlv_10= RULE_ID ) )
					{
					otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleNormalStep3293); 

					    	newLeafNode(otherlv_9, grammarAccess.getNormalStepAccess().getInvokeUsecaseKeyword_6_1_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1545:3: ( (otherlv_10= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1546:3: (otherlv_10= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1546:3: (otherlv_10= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1547:3: otherlv_10= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getNormalStepRule());
						        }
					        
					otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNormalStep3313); 

							newLeafNode(otherlv_10, grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseCrossReference_6_1_1_0()); 
						
					}

					}

					}

					}
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1558:5: (otherlv_11= 'next' ( (otherlv_12= RULE_ID ) ) )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==30) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1558:7: otherlv_11= 'next' ( (otherlv_12= RULE_ID ) )
					{
					otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleNormalStep3329); 

					    	newLeafNode(otherlv_11, grammarAccess.getNormalStepAccess().getNextKeyword_7_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1562:3: ( (otherlv_12= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1563:3: (otherlv_12= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1563:3: (otherlv_12= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1564:3: otherlv_12= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getNormalStepRule());
						        }
					        
					otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNormalStep3349); 

							newLeafNode(otherlv_12, grammarAccess.getNormalStepAccess().getNextStepCrossReference_7_1_0()); 
						
					}

					}

					}
					break;

			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleNormalStep"



	// $ANTLR start "entryRuleQualifiedName"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1583:1: entryRuleQualifiedName returns [String current=null] :iv_ruleQualifiedName= ruleQualifiedName EOF ;
	public final String entryRuleQualifiedName() throws RecognitionException {
		String current = null;


		AntlrDatatypeRuleToken iv_ruleQualifiedName =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1584:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1585:2: iv_ruleQualifiedName= ruleQualifiedName EOF
			{
			 newCompositeNode(grammarAccess.getQualifiedNameRule()); 
			pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3388);
			iv_ruleQualifiedName=ruleQualifiedName();
			state._fsp--;

			 current =iv_ruleQualifiedName.getText(); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3399); 
			}

		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleQualifiedName"



	// $ANTLR start "ruleQualifiedName"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1592:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
	public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();


		Token this_ID_0=null;
		Token kw=null;
		Token this_ID_2=null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1595:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1596:6: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1596:6: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1596:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
			{
			this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3439); 

					current.merge(this_ID_0);
			    
			 
			    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1603:2: (kw= '.' this_ID_2= RULE_ID )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==12) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1604:2: kw= '.' this_ID_2= RULE_ID
					{
					kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName3458); 

					        current.merge(kw);
					        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
					    
					this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3473); 

							current.merge(this_ID_2);
					    
					 
					    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
					    
					}
					break;

				default :
					break loop37;
				}
			}

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleQualifiedName"



	// $ANTLR start "ruleActorType"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1624:1: ruleActorType returns [Enumerator current=null] : ( (enumLiteral_0= 'person' ) | (enumLiteral_1= 'system' ) | (enumLiteral_2= 'organization' ) ) ;
	public final Enumerator ruleActorType() throws RecognitionException {
		Enumerator current = null;


		Token enumLiteral_0=null;
		Token enumLiteral_1=null;
		Token enumLiteral_2=null;

		 enterRule(); 
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1626:28: ( ( (enumLiteral_0= 'person' ) | (enumLiteral_1= 'system' ) | (enumLiteral_2= 'organization' ) ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1627:2: ( (enumLiteral_0= 'person' ) | (enumLiteral_1= 'system' ) | (enumLiteral_2= 'organization' ) )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1627:2: ( (enumLiteral_0= 'person' ) | (enumLiteral_1= 'system' ) | (enumLiteral_2= 'organization' ) )
			int alt38=3;
			switch ( input.LA(1) ) {
			case 36:
				{
				alt38=1;
				}
				break;
			case 41:
				{
				alt38=2;
				}
				break;
			case 31:
				{
				alt38=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1627:2: (enumLiteral_0= 'person' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1627:2: (enumLiteral_0= 'person' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1627:4: enumLiteral_0= 'person'
					{
					enumLiteral_0=(Token)match(input,36,FOLLOW_36_in_ruleActorType3534); 

					        current = grammarAccess.getActorTypeAccess().getPERSONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_0, grammarAccess.getActorTypeAccess().getPERSONEnumLiteralDeclaration_0()); 
					    
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1633:6: (enumLiteral_1= 'system' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1633:6: (enumLiteral_1= 'system' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1633:8: enumLiteral_1= 'system'
					{
					enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleActorType3551); 

					        current = grammarAccess.getActorTypeAccess().getSYSTEMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_1, grammarAccess.getActorTypeAccess().getSYSTEMEnumLiteralDeclaration_1()); 
					    
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1639:6: (enumLiteral_2= 'organization' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1639:6: (enumLiteral_2= 'organization' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1639:8: enumLiteral_2= 'organization'
					{
					enumLiteral_2=(Token)match(input,31,FOLLOW_31_in_ruleActorType3568); 

					        current = grammarAccess.getActorTypeAccess().getORGANIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_2, grammarAccess.getActorTypeAccess().getORGANIZATIONEnumLiteralDeclaration_2()); 
					    
					}

					}
					break;

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleActorType"



	// $ANTLR start "ruleStepType"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1649:1: ruleStepType returns [Enumerator current=null] : ( (enumLiteral_0= 'wait' ) | (enumLiteral_1= 'send' ) | (enumLiteral_2= 'perform' ) | (enumLiteral_3= 'call' ) | (enumLiteral_4= 'alt' ) ) ;
	public final Enumerator ruleStepType() throws RecognitionException {
		Enumerator current = null;


		Token enumLiteral_0=null;
		Token enumLiteral_1=null;
		Token enumLiteral_2=null;
		Token enumLiteral_3=null;
		Token enumLiteral_4=null;

		 enterRule(); 
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1651:28: ( ( (enumLiteral_0= 'wait' ) | (enumLiteral_1= 'send' ) | (enumLiteral_2= 'perform' ) | (enumLiteral_3= 'call' ) | (enumLiteral_4= 'alt' ) ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1652:2: ( (enumLiteral_0= 'wait' ) | (enumLiteral_1= 'send' ) | (enumLiteral_2= 'perform' ) | (enumLiteral_3= 'call' ) | (enumLiteral_4= 'alt' ) )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1652:2: ( (enumLiteral_0= 'wait' ) | (enumLiteral_1= 'send' ) | (enumLiteral_2= 'perform' ) | (enumLiteral_3= 'call' ) | (enumLiteral_4= 'alt' ) )
			int alt39=5;
			switch ( input.LA(1) ) {
			case 44:
				{
				alt39=1;
				}
				break;
			case 39:
				{
				alt39=2;
				}
				break;
			case 35:
				{
				alt39=3;
				}
				break;
			case 20:
				{
				alt39=4;
				}
				break;
			case 14:
				{
				alt39=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1652:2: (enumLiteral_0= 'wait' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1652:2: (enumLiteral_0= 'wait' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1652:4: enumLiteral_0= 'wait'
					{
					enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleStepType3613); 

					        current = grammarAccess.getStepTypeAccess().getWAITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_0, grammarAccess.getStepTypeAccess().getWAITEnumLiteralDeclaration_0()); 
					    
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1658:6: (enumLiteral_1= 'send' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1658:6: (enumLiteral_1= 'send' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1658:8: enumLiteral_1= 'send'
					{
					enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleStepType3630); 

					        current = grammarAccess.getStepTypeAccess().getSENDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_1, grammarAccess.getStepTypeAccess().getSENDEnumLiteralDeclaration_1()); 
					    
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1664:6: (enumLiteral_2= 'perform' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1664:6: (enumLiteral_2= 'perform' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1664:8: enumLiteral_2= 'perform'
					{
					enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleStepType3647); 

					        current = grammarAccess.getStepTypeAccess().getPERFORMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_2, grammarAccess.getStepTypeAccess().getPERFORMEnumLiteralDeclaration_2()); 
					    
					}

					}
					break;
				case 4 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1670:6: (enumLiteral_3= 'call' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1670:6: (enumLiteral_3= 'call' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1670:8: enumLiteral_3= 'call'
					{
					enumLiteral_3=(Token)match(input,20,FOLLOW_20_in_ruleStepType3664); 

					        current = grammarAccess.getStepTypeAccess().getCALLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_3, grammarAccess.getStepTypeAccess().getCALLEnumLiteralDeclaration_3()); 
					    
					}

					}
					break;
				case 5 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1676:6: (enumLiteral_4= 'alt' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1676:6: (enumLiteral_4= 'alt' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1676:8: enumLiteral_4= 'alt'
					{
					enumLiteral_4=(Token)match(input,14,FOLLOW_14_in_ruleStepType3681); 

					        current = grammarAccess.getStepTypeAccess().getALTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_4, grammarAccess.getStepTypeAccess().getALTEnumLiteralDeclaration_4()); 
					    
					}

					}
					break;

			}

			}

			 leaveRule(); 
		}
		 
		    catch (RecognitionException re) { 
		        recover(input,re); 
		        appendSkippedTokens();
		    } 

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleStepType"

	// Delegated rules



	public static final BitSet FOLLOW_ruleUseCasesModel_in_entryRuleUseCasesModel75 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleUseCasesModel85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleUseCasesModel130 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_rulePackageDeclaration213 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration234 = new BitSet(new long[]{0x0000080001002200L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulePackageDeclaration251 = new BitSet(new long[]{0x0000080001002000L});
	public static final BitSet FOLLOW_13_in_rulePackageDeclaration270 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleActor_in_rulePackageDeclaration291 = new BitSet(new long[]{0x0000080001000020L});
	public static final BitSet FOLLOW_ruleUseCase_in_rulePackageDeclaration315 = new BitSet(new long[]{0x0000080001000000L});
	public static final BitSet FOLLOW_24_in_rulePackageDeclaration328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase364 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleUseCase374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ruleUseCase411 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase428 = new BitSet(new long[]{0x000000620E048200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase450 = new BitSet(new long[]{0x000000620E048000L});
	public static final BitSet FOLLOW_27_in_ruleUseCase469 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase489 = new BitSet(new long[]{0x0000006206048000L});
	public static final BitSet FOLLOW_38_in_ruleUseCase549 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ruleUCCondition_in_ruleUseCase570 = new BitSet(new long[]{0x0000006206048200L});
	public static final BitSet FOLLOW_37_in_ruleUseCase639 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ruleUCCondition_in_ruleUseCase660 = new BitSet(new long[]{0x0000006206048200L});
	public static final BitSet FOLLOW_ruleFlow_in_ruleUseCase723 = new BitSet(new long[]{0x0000000206048000L});
	public static final BitSet FOLLOW_25_in_ruleUseCase736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_entryRuleUCCondition772 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleUCCondition782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleUCCondition823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActor_in_entryRuleActor863 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleActor873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleActor915 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_ruleActor932 = new BitSet(new long[]{0x0000021080000000L});
	public static final BitSet FOLLOW_ruleActorType_in_ruleActor953 = new BitSet(new long[]{0x0000000008000202L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleActor970 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_ruleActor989 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleActor1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_entryRuleStep1047 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStep1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNormalStep_in_ruleStep1104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelStep_in_ruleStep1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow1166 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleFlow1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBasicFlow_in_ruleFlow1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNamedFlow_in_ruleFlow1250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow1285 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleBasicFlow1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_ruleBasicFlow1332 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_ruleStep_in_ruleBasicFlow1362 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_23_in_ruleBasicFlow1375 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_ruleBasicFlow1388 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ruleUCCondition_in_ruleBasicFlow1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNamedFlow_in_entryRuleNamedFlow1447 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleNamedFlow1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExceptionFlow_in_ruleNamedFlow1504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlow_in_ruleNamedFlow1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelFlow_in_ruleNamedFlow1558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExceptionFlow_in_entryRuleExceptionFlow1593 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleExceptionFlow1603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_ruleExceptionFlow1640 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleExceptionFlow1657 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_ruleExceptionFlow1674 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleExceptionFlow1691 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleExceptionFlow1708 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_ruleStep_in_ruleExceptionFlow1729 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_23_in_ruleExceptionFlow1742 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_ruleExceptionFlow1755 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ruleUCCondition_in_ruleExceptionFlow1776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow1814 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlow1824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_ruleAlternativeFlow1861 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeFlow1878 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_ruleStep_in_ruleAlternativeFlow1904 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_23_in_ruleAlternativeFlow1917 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_ruleAlternativeFlow1930 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ruleUCCondition_in_ruleAlternativeFlow1951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelFlow_in_entryRuleParallelFlow1989 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParallelFlow1999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_ruleParallelFlow2036 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleParallelFlow2053 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_ruleStep_in_ruleParallelFlow2079 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_23_in_ruleParallelFlow2092 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_ruleParallelFlow2105 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ruleUCCondition_in_ruleParallelFlow2126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStepAlternative_in_entryRuleStepAlternative2164 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStepAlternative2174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCondition_in_ruleStepAlternative2221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLocalAlternative_in_ruleStepAlternative2248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlowAlternative_in_ruleStepAlternative2275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2310 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleCondition2320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_ruleCondition2357 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleCondition2374 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleCondition2391 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_ruleCondition2404 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleCondition2424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLocalAlternative_in_entryRuleLocalAlternative2462 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleLocalAlternative2472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_ruleLocalAlternative2509 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleLocalAlternative2526 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleLocalAlternative2543 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleLocalAlternative2561 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_29_in_ruleLocalAlternative2585 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleLocalAlternative2605 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_ruleLocalAlternative2620 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleLocalAlternative2640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlowAlternative_in_entryRuleAlternativeFlowAlternative2678 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlowAlternative2688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_ruleAlternativeFlowAlternative2725 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleAlternativeFlowAlternative2742 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_ruleAlternativeFlowAlternative2759 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ruleAlternativeFlowAlternative2771 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeFlowAlternative2791 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_ruleAlternativeFlowAlternative2804 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeFlowAlternative2824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelStep_in_entryRuleParallelStep2862 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParallelStep2872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_ruleParallelStep2909 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleParallelStep2926 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleParallelStep2948 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleParallelStep2974 = new BitSet(new long[]{0x0000000040000802L});
	public static final BitSet FOLLOW_11_in_ruleParallelStep2987 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleParallelStep3007 = new BitSet(new long[]{0x0000000040000802L});
	public static final BitSet FOLLOW_30_in_ruleParallelStep3022 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleParallelStep3042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNormalStep_in_entryRuleNormalStep3080 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleNormalStep3090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_ruleNormalStep3127 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleNormalStep3144 = new BitSet(new long[]{0x0000108800104200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleNormalStep3166 = new BitSet(new long[]{0x0000108800104000L});
	public static final BitSet FOLLOW_ruleStepType_in_ruleNormalStep3193 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ruleNormalStep3205 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleNormalStep3225 = new BitSet(new long[]{0x0000000060010002L});
	public static final BitSet FOLLOW_16_in_ruleNormalStep3239 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ruleStepAlternative_in_ruleNormalStep3260 = new BitSet(new long[]{0x0000000010400000L});
	public static final BitSet FOLLOW_22_in_ruleNormalStep3273 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_29_in_ruleNormalStep3293 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleNormalStep3313 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_ruleNormalStep3329 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleNormalStep3349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3388 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3439 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_ruleQualifiedName3458 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3473 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_36_in_ruleActorType3534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ruleActorType3551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_ruleActorType3568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_ruleStepType3613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_ruleStepType3630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_ruleStepType3647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_ruleStepType3664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_ruleStepType3681 = new BitSet(new long[]{0x0000000000000002L});
}
