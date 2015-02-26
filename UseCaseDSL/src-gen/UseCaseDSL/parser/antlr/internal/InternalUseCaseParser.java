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
		"'.'", "'actors'", "'alternative flow'", "'alternatives'", "'as'", "'basic flow'", 
		"'by'", "'continue with step'", "'else'", "'end flow'", "'end package'", 
		"'end usecase'", "'exception flow'", "'extends'", "'if'", "'input'", "'invoke usecase'", 
		"'mix'", "'organization'", "'output'", "'package'", "'parallel flow'", 
		"'parallel step'", "'person'", "'postcondition'", "'preconditions'", "'process'", 
		"'step'", "'system'", "'then'", "'type'", "'usecase'", "'with postcondition'"
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

			otherlv_6=(Token)match(input,22,FOLLOW_22_in_rulePackageDeclaration328); 

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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:221:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_flows_10_0= ruleFlow ) )* otherlv_11= 'end usecase' ) ;
	public final EObject ruleUseCase() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token lv_description_2_0=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token otherlv_6=null;
		Token lv_preConditions_7_0=null;
		Token otherlv_8=null;
		Token lv_postcondition_9_0=null;
		Token otherlv_11=null;
		EObject lv_flows_10_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:224:28: ( (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_flows_10_0= ruleFlow ) )* otherlv_11= 'end usecase' ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:225:3: (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_flows_10_0= ruleFlow ) )* otherlv_11= 'end usecase' )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:225:3: (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_flows_10_0= ruleFlow ) )* otherlv_11= 'end usecase' )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:225:3: otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ( (lv_flows_10_0= ruleFlow ) )* otherlv_11= 'end usecase'
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
			if ( (LA7_0==25) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:265:5: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
					{
					otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleUseCase469); 

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

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:282:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:284:2: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:284:2: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:285:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )* )
			{
			 
				  getUnorderedGroupHelper().enter(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
				
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:288:2: ( ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )* )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:289:3: ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )*
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:289:3: ( ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) ) )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( LA8_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
					alt8=1;
				}
				else if ( LA8_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:291:4: ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:291:4: ({...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:292:5: {...}? => ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) )
					{
					if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
						throw new FailedPredicateException(input, "ruleUseCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0)");
					}
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:292:104: ( ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:293:6: ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) )
					{
					 
						 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0);
						 				
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:296:6: ({...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:296:7: {...}? => (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) )
					{
					if ( !((true)) ) {
						throw new FailedPredicateException(input, "ruleUseCase", "true");
					}
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:296:16: (otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:296:18: otherlv_6= 'preconditions' ( (lv_preConditions_7_0= RULE_STRING ) )
					{
					otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleUseCase549); 

					    	newLeafNode(otherlv_6, grammarAccess.getUseCaseAccess().getPreconditionsKeyword_4_0_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:300:3: ( (lv_preConditions_7_0= RULE_STRING ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:301:3: (lv_preConditions_7_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:301:3: (lv_preConditions_7_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:302:3: lv_preConditions_7_0= RULE_STRING
					{
					lv_preConditions_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase566); 

								newLeafNode(lv_preConditions_7_0, grammarAccess.getUseCaseAccess().getPreConditionsSTRINGTerminalRuleCall_4_0_1_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getUseCaseRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"preConditions",
					        		lv_preConditions_7_0, 
					        		"STRING");
						    
					}

					}

					}

					}

					 
						 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
						 				
					}

					}

					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:325:4: ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:325:4: ({...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:326:5: {...}? => ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) )
					{
					if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
						throw new FailedPredicateException(input, "ruleUseCase", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1)");
					}
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:326:104: ( ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:327:6: ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) )
					{
					 
						 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1);
						 				
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:330:6: ({...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:330:7: {...}? => (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) )
					{
					if ( !((true)) ) {
						throw new FailedPredicateException(input, "ruleUseCase", "true");
					}
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:330:16: (otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:330:18: otherlv_8= 'postcondition' ( (lv_postcondition_9_0= RULE_STRING ) )
					{
					otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleUseCase639); 

					    	newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getPostconditionKeyword_4_1_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:334:3: ( (lv_postcondition_9_0= RULE_STRING ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:335:3: (lv_postcondition_9_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:335:3: (lv_postcondition_9_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:336:3: lv_postcondition_9_0= RULE_STRING
					{
					lv_postcondition_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseCase656); 

								newLeafNode(lv_postcondition_9_0, grammarAccess.getUseCaseAccess().getPostconditionSTRINGTerminalRuleCall_4_1_1_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getUseCaseRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"postcondition",
					        		lv_postcondition_9_0, 
					        		"STRING");
						    
					}

					}

					}

					}

					 
						 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
						 				
					}

					}

					}
					break;

				default :
					break loop8;
				}
			}

			}

			}

			 
				  getUnorderedGroupHelper().leave(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
				
			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:366:2: ( (lv_flows_10_0= ruleFlow ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==14||LA9_0==17||LA9_0==24||LA9_0==33) ) {
					alt9=1;
				}

				switch (alt9) {
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
					break loop9;
				}
			}

			otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleUseCase736); 

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



	// $ANTLR start "entryRuleActor"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:396:1: entryRuleActor returns [EObject current=null] :iv_ruleActor= ruleActor EOF ;
	public final EObject entryRuleActor() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleActor =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:397:2: (iv_ruleActor= ruleActor EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:398:2: iv_ruleActor= ruleActor EOF
			{
			 newCompositeNode(grammarAccess.getActorRule()); 
			pushFollow(FOLLOW_ruleActor_in_entryRuleActor772);
			iv_ruleActor=ruleActor();
			state._fsp--;

			 current =iv_ruleActor; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleActor782); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:405:1: ruleActor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleActorType ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ) ;
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
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:408:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleActorType ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:409:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleActorType ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:409:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleActorType ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:409:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'as' ( (lv_type_2_0= ruleActorType ) ) ( (lv_description_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:409:2: ( (lv_name_0_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:410:3: (lv_name_0_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:410:3: (lv_name_0_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:411:3: lv_name_0_0= RULE_ID
			{
			lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor824); 

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

			otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleActor841); 

			    	newLeafNode(otherlv_1, grammarAccess.getActorAccess().getAsKeyword_1());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:431:3: ( (lv_type_2_0= ruleActorType ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:432:3: (lv_type_2_0= ruleActorType )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:432:3: (lv_type_2_0= ruleActorType )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:433:3: lv_type_2_0= ruleActorType
			{
			 
				        newCompositeNode(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_2_0()); 
				    
			pushFollow(FOLLOW_ruleActorType_in_ruleActor862);
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

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:449:2: ( (lv_description_3_0= RULE_STRING ) )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==RULE_STRING) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:450:3: (lv_description_3_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:450:3: (lv_description_3_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:451:3: lv_description_3_0= RULE_STRING
					{
					lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor879); 

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

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:467:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==25) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:467:5: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
					{
					otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleActor898); 

					    	newLeafNode(otherlv_4, grammarAccess.getActorAccess().getExtendsKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:471:3: ( (otherlv_5= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:472:3: (otherlv_5= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:472:3: (otherlv_5= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:473:3: otherlv_5= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getActorRule());
						        }
					        
					otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor918); 

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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:492:1: entryRuleStep returns [EObject current=null] :iv_ruleStep= ruleStep EOF ;
	public final EObject entryRuleStep() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleStep =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:493:2: (iv_ruleStep= ruleStep EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:494:2: iv_ruleStep= ruleStep EOF
			{
			 newCompositeNode(grammarAccess.getStepRule()); 
			pushFollow(FOLLOW_ruleStep_in_entryRuleStep956);
			iv_ruleStep=ruleStep();
			state._fsp--;

			 current =iv_ruleStep; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStep966); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:501:1: ruleStep returns [EObject current=null] : (this_NormalStep_0= ruleNormalStep |this_ParallelStep_1= ruleParallelStep ) ;
	public final EObject ruleStep() throws RecognitionException {
		EObject current = null;


		EObject this_NormalStep_0 =null;
		EObject this_ParallelStep_1 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:504:28: ( (this_NormalStep_0= ruleNormalStep |this_ParallelStep_1= ruleParallelStep ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:505:5: (this_NormalStep_0= ruleNormalStep |this_ParallelStep_1= ruleParallelStep )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:505:5: (this_NormalStep_0= ruleNormalStep |this_ParallelStep_1= ruleParallelStep )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==39) ) {
				alt12=1;
			}
			else if ( (LA12_0==34) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:506:5: this_NormalStep_0= ruleNormalStep
					{
					 
					        newCompositeNode(grammarAccess.getStepAccess().getNormalStepParserRuleCall_0()); 
					    
					pushFollow(FOLLOW_ruleNormalStep_in_ruleStep1013);
					this_NormalStep_0=ruleNormalStep();
					state._fsp--;

					 
					        current = this_NormalStep_0; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:516:5: this_ParallelStep_1= ruleParallelStep
					{
					 
					        newCompositeNode(grammarAccess.getStepAccess().getParallelStepParserRuleCall_1()); 
					    
					pushFollow(FOLLOW_ruleParallelStep_in_ruleStep1040);
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:532:1: entryRuleFlow returns [EObject current=null] :iv_ruleFlow= ruleFlow EOF ;
	public final EObject entryRuleFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:533:2: (iv_ruleFlow= ruleFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:534:2: iv_ruleFlow= ruleFlow EOF
			{
			 newCompositeNode(grammarAccess.getFlowRule()); 
			pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow1075);
			iv_ruleFlow=ruleFlow();
			state._fsp--;

			 current =iv_ruleFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleFlow1085); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:541:1: ruleFlow returns [EObject current=null] : (this_BasicFlow_0= ruleBasicFlow |this_NamedFlow_1= ruleNamedFlow ) ;
	public final EObject ruleFlow() throws RecognitionException {
		EObject current = null;


		EObject this_BasicFlow_0 =null;
		EObject this_NamedFlow_1 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:544:28: ( (this_BasicFlow_0= ruleBasicFlow |this_NamedFlow_1= ruleNamedFlow ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:545:5: (this_BasicFlow_0= ruleBasicFlow |this_NamedFlow_1= ruleNamedFlow )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:545:5: (this_BasicFlow_0= ruleBasicFlow |this_NamedFlow_1= ruleNamedFlow )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==17) ) {
				alt13=1;
			}
			else if ( (LA13_0==14||LA13_0==24||LA13_0==33) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:546:5: this_BasicFlow_0= ruleBasicFlow
					{
					 
					        newCompositeNode(grammarAccess.getFlowAccess().getBasicFlowParserRuleCall_0()); 
					    
					pushFollow(FOLLOW_ruleBasicFlow_in_ruleFlow1132);
					this_BasicFlow_0=ruleBasicFlow();
					state._fsp--;

					 
					        current = this_BasicFlow_0; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:556:5: this_NamedFlow_1= ruleNamedFlow
					{
					 
					        newCompositeNode(grammarAccess.getFlowAccess().getNamedFlowParserRuleCall_1()); 
					    
					pushFollow(FOLLOW_ruleNamedFlow_in_ruleFlow1159);
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:572:1: entryRuleBasicFlow returns [EObject current=null] :iv_ruleBasicFlow= ruleBasicFlow EOF ;
	public final EObject entryRuleBasicFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleBasicFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:573:2: (iv_ruleBasicFlow= ruleBasicFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:574:2: iv_ruleBasicFlow= ruleBasicFlow EOF
			{
			 newCompositeNode(grammarAccess.getBasicFlowRule()); 
			pushFollow(FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow1194);
			iv_ruleBasicFlow=ruleBasicFlow();
			state._fsp--;

			 current =iv_ruleBasicFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleBasicFlow1204); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:581:1: ruleBasicFlow returns [EObject current=null] : (otherlv_0= 'basic flow' () ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? ) ;
	public final EObject ruleBasicFlow() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token lv_finalState_5_0=null;
		EObject lv_steps_2_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:584:28: ( (otherlv_0= 'basic flow' () ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:585:3: (otherlv_0= 'basic flow' () ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:585:3: (otherlv_0= 'basic flow' () ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:585:3: otherlv_0= 'basic flow' () ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )?
			{
			otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleBasicFlow1241); 

			    	newLeafNode(otherlv_0, grammarAccess.getBasicFlowAccess().getBasicFlowKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:589:5: ()
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:590:5: 
			{

			        current = forceCreateModelElement(
			            grammarAccess.getBasicFlowAccess().getBasicFlowAction_1(),
			            current);
			    
			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:595:2: ( (lv_steps_2_0= ruleStep ) )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==34||LA14_0==39) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:596:3: (lv_steps_2_0= ruleStep )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:596:3: (lv_steps_2_0= ruleStep )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:597:3: lv_steps_2_0= ruleStep
					{
					 
						        newCompositeNode(grammarAccess.getBasicFlowAccess().getStepsStepParserRuleCall_2_0()); 
						    
					pushFollow(FOLLOW_ruleStep_in_ruleBasicFlow1271);
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

			}

			otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBasicFlow1284); 

			    	newLeafNode(otherlv_3, grammarAccess.getBasicFlowAccess().getEndFlowKeyword_3());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:617:3: (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==44) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:617:3: otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) )
					{
					otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleBasicFlow1297); 

					    	newLeafNode(otherlv_4, grammarAccess.getBasicFlowAccess().getWithPostconditionKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:621:3: ( (lv_finalState_5_0= RULE_STRING ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:622:3: (lv_finalState_5_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:622:3: (lv_finalState_5_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:623:3: lv_finalState_5_0= RULE_STRING
					{
					lv_finalState_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBasicFlow1314); 

								newLeafNode(lv_finalState_5_0, grammarAccess.getBasicFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getBasicFlowRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"finalState",
					        		lv_finalState_5_0, 
					        		"STRING");
						    
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:647:1: entryRuleNamedFlow returns [EObject current=null] :iv_ruleNamedFlow= ruleNamedFlow EOF ;
	public final EObject entryRuleNamedFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleNamedFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:648:2: (iv_ruleNamedFlow= ruleNamedFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:649:2: iv_ruleNamedFlow= ruleNamedFlow EOF
			{
			 newCompositeNode(grammarAccess.getNamedFlowRule()); 
			pushFollow(FOLLOW_ruleNamedFlow_in_entryRuleNamedFlow1357);
			iv_ruleNamedFlow=ruleNamedFlow();
			state._fsp--;

			 current =iv_ruleNamedFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleNamedFlow1367); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:656:1: ruleNamedFlow returns [EObject current=null] : (this_ExceptionFlow_0= ruleExceptionFlow |this_AlternativeFlow_1= ruleAlternativeFlow |this_ParallelFlow_2= ruleParallelFlow ) ;
	public final EObject ruleNamedFlow() throws RecognitionException {
		EObject current = null;


		EObject this_ExceptionFlow_0 =null;
		EObject this_AlternativeFlow_1 =null;
		EObject this_ParallelFlow_2 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:659:28: ( (this_ExceptionFlow_0= ruleExceptionFlow |this_AlternativeFlow_1= ruleAlternativeFlow |this_ParallelFlow_2= ruleParallelFlow ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:660:5: (this_ExceptionFlow_0= ruleExceptionFlow |this_AlternativeFlow_1= ruleAlternativeFlow |this_ParallelFlow_2= ruleParallelFlow )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:660:5: (this_ExceptionFlow_0= ruleExceptionFlow |this_AlternativeFlow_1= ruleAlternativeFlow |this_ParallelFlow_2= ruleParallelFlow )
			int alt16=3;
			switch ( input.LA(1) ) {
			case 24:
				{
				alt16=1;
				}
				break;
			case 14:
				{
				alt16=2;
				}
				break;
			case 33:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:661:5: this_ExceptionFlow_0= ruleExceptionFlow
					{
					 
					        newCompositeNode(grammarAccess.getNamedFlowAccess().getExceptionFlowParserRuleCall_0()); 
					    
					pushFollow(FOLLOW_ruleExceptionFlow_in_ruleNamedFlow1414);
					this_ExceptionFlow_0=ruleExceptionFlow();
					state._fsp--;

					 
					        current = this_ExceptionFlow_0; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:671:5: this_AlternativeFlow_1= ruleAlternativeFlow
					{
					 
					        newCompositeNode(grammarAccess.getNamedFlowAccess().getAlternativeFlowParserRuleCall_1()); 
					    
					pushFollow(FOLLOW_ruleAlternativeFlow_in_ruleNamedFlow1441);
					this_AlternativeFlow_1=ruleAlternativeFlow();
					state._fsp--;

					 
					        current = this_AlternativeFlow_1; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 3 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:681:5: this_ParallelFlow_2= ruleParallelFlow
					{
					 
					        newCompositeNode(grammarAccess.getNamedFlowAccess().getParallelFlowParserRuleCall_2()); 
					    
					pushFollow(FOLLOW_ruleParallelFlow_in_ruleNamedFlow1468);
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:697:1: entryRuleExceptionFlow returns [EObject current=null] :iv_ruleExceptionFlow= ruleExceptionFlow EOF ;
	public final EObject entryRuleExceptionFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleExceptionFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:698:2: (iv_ruleExceptionFlow= ruleExceptionFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:699:2: iv_ruleExceptionFlow= ruleExceptionFlow EOF
			{
			 newCompositeNode(grammarAccess.getExceptionFlowRule()); 
			pushFollow(FOLLOW_ruleExceptionFlow_in_entryRuleExceptionFlow1503);
			iv_ruleExceptionFlow=ruleExceptionFlow();
			state._fsp--;

			 current =iv_ruleExceptionFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionFlow1513); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:706:1: ruleExceptionFlow returns [EObject current=null] : (otherlv_0= 'exception flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )? otherlv_6= 'end flow' (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= RULE_STRING ) ) )? ) ;
	public final EObject ruleExceptionFlow() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_2=null;
		Token lv_condition_3_0=null;
		Token otherlv_4=null;
		Token otherlv_6=null;
		Token otherlv_7=null;
		Token lv_finalState_8_0=null;
		EObject lv_steps_5_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:709:28: ( (otherlv_0= 'exception flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )? otherlv_6= 'end flow' (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= RULE_STRING ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:710:3: (otherlv_0= 'exception flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )? otherlv_6= 'end flow' (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= RULE_STRING ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:710:3: (otherlv_0= 'exception flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )? otherlv_6= 'end flow' (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= RULE_STRING ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:710:3: otherlv_0= 'exception flow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'if' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= 'then' ( (lv_steps_5_0= ruleStep ) )? otherlv_6= 'end flow' (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= RULE_STRING ) ) )?
			{
			otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleExceptionFlow1550); 

			    	newLeafNode(otherlv_0, grammarAccess.getExceptionFlowAccess().getExceptionFlowKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:714:3: ( (lv_name_1_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:715:3: (lv_name_1_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:715:3: (lv_name_1_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:716:3: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExceptionFlow1567); 

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

			otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleExceptionFlow1584); 

			    	newLeafNode(otherlv_2, grammarAccess.getExceptionFlowAccess().getIfKeyword_2());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:736:3: ( (lv_condition_3_0= RULE_STRING ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:737:3: (lv_condition_3_0= RULE_STRING )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:737:3: (lv_condition_3_0= RULE_STRING )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:738:3: lv_condition_3_0= RULE_STRING
			{
			lv_condition_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExceptionFlow1601); 

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

			otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleExceptionFlow1618); 

			    	newLeafNode(otherlv_4, grammarAccess.getExceptionFlowAccess().getThenKeyword_4());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:758:3: ( (lv_steps_5_0= ruleStep ) )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==34||LA17_0==39) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:759:3: (lv_steps_5_0= ruleStep )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:759:3: (lv_steps_5_0= ruleStep )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:760:3: lv_steps_5_0= ruleStep
					{
					 
						        newCompositeNode(grammarAccess.getExceptionFlowAccess().getStepsStepParserRuleCall_5_0()); 
						    
					pushFollow(FOLLOW_ruleStep_in_ruleExceptionFlow1639);
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

			}

			otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleExceptionFlow1652); 

			    	newLeafNode(otherlv_6, grammarAccess.getExceptionFlowAccess().getEndFlowKeyword_6());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:780:3: (otherlv_7= 'with postcondition' ( (lv_finalState_8_0= RULE_STRING ) ) )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==44) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:780:3: otherlv_7= 'with postcondition' ( (lv_finalState_8_0= RULE_STRING ) )
					{
					otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleExceptionFlow1665); 

					    	newLeafNode(otherlv_7, grammarAccess.getExceptionFlowAccess().getWithPostconditionKeyword_7_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:784:3: ( (lv_finalState_8_0= RULE_STRING ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:785:3: (lv_finalState_8_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:785:3: (lv_finalState_8_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:786:3: lv_finalState_8_0= RULE_STRING
					{
					lv_finalState_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExceptionFlow1682); 

								newLeafNode(lv_finalState_8_0, grammarAccess.getExceptionFlowAccess().getFinalStateSTRINGTerminalRuleCall_7_1_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getExceptionFlowRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"finalState",
					        		lv_finalState_8_0, 
					        		"STRING");
						    
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:810:1: entryRuleAlternativeFlow returns [EObject current=null] :iv_ruleAlternativeFlow= ruleAlternativeFlow EOF ;
	public final EObject entryRuleAlternativeFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleAlternativeFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:811:2: (iv_ruleAlternativeFlow= ruleAlternativeFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:812:2: iv_ruleAlternativeFlow= ruleAlternativeFlow EOF
			{
			 newCompositeNode(grammarAccess.getAlternativeFlowRule()); 
			pushFollow(FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow1725);
			iv_ruleAlternativeFlow=ruleAlternativeFlow();
			state._fsp--;

			 current =iv_ruleAlternativeFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlow1735); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:819:1: ruleAlternativeFlow returns [EObject current=null] : (otherlv_0= 'alternative flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? ) ;
	public final EObject ruleAlternativeFlow() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token lv_finalState_5_0=null;
		EObject lv_steps_2_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:822:28: ( (otherlv_0= 'alternative flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:823:3: (otherlv_0= 'alternative flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:823:3: (otherlv_0= 'alternative flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:823:3: otherlv_0= 'alternative flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )?
			{
			otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAlternativeFlow1772); 

			    	newLeafNode(otherlv_0, grammarAccess.getAlternativeFlowAccess().getAlternativeFlowKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:827:3: ( (lv_name_1_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:828:3: (lv_name_1_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:828:3: (lv_name_1_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:829:3: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternativeFlow1789); 

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

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:845:2: ( (lv_steps_2_0= ruleStep ) )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==34||LA19_0==39) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:846:3: (lv_steps_2_0= ruleStep )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:846:3: (lv_steps_2_0= ruleStep )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:847:3: lv_steps_2_0= ruleStep
					{
					 
						        newCompositeNode(grammarAccess.getAlternativeFlowAccess().getStepsStepParserRuleCall_2_0()); 
						    
					pushFollow(FOLLOW_ruleStep_in_ruleAlternativeFlow1815);
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

			}

			otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAlternativeFlow1828); 

			    	newLeafNode(otherlv_3, grammarAccess.getAlternativeFlowAccess().getEndFlowKeyword_3());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:867:3: (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==44) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:867:3: otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) )
					{
					otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleAlternativeFlow1841); 

					    	newLeafNode(otherlv_4, grammarAccess.getAlternativeFlowAccess().getWithPostconditionKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:871:3: ( (lv_finalState_5_0= RULE_STRING ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:872:3: (lv_finalState_5_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:872:3: (lv_finalState_5_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:873:3: lv_finalState_5_0= RULE_STRING
					{
					lv_finalState_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAlternativeFlow1858); 

								newLeafNode(lv_finalState_5_0, grammarAccess.getAlternativeFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getAlternativeFlowRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"finalState",
					        		lv_finalState_5_0, 
					        		"STRING");
						    
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:897:1: entryRuleParallelFlow returns [EObject current=null] :iv_ruleParallelFlow= ruleParallelFlow EOF ;
	public final EObject entryRuleParallelFlow() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleParallelFlow =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:898:2: (iv_ruleParallelFlow= ruleParallelFlow EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:899:2: iv_ruleParallelFlow= ruleParallelFlow EOF
			{
			 newCompositeNode(grammarAccess.getParallelFlowRule()); 
			pushFollow(FOLLOW_ruleParallelFlow_in_entryRuleParallelFlow1901);
			iv_ruleParallelFlow=ruleParallelFlow();
			state._fsp--;

			 current =iv_ruleParallelFlow; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParallelFlow1911); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:906:1: ruleParallelFlow returns [EObject current=null] : (otherlv_0= 'parallel flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? ) ;
	public final EObject ruleParallelFlow() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token lv_finalState_5_0=null;
		EObject lv_steps_2_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:909:28: ( (otherlv_0= 'parallel flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:910:3: (otherlv_0= 'parallel flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:910:3: (otherlv_0= 'parallel flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:910:3: otherlv_0= 'parallel flow' ( (lv_name_1_0= RULE_ID ) ) ( (lv_steps_2_0= ruleStep ) )? otherlv_3= 'end flow' (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )?
			{
			otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleParallelFlow1948); 

			    	newLeafNode(otherlv_0, grammarAccess.getParallelFlowAccess().getParallelFlowKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:914:3: ( (lv_name_1_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:915:3: (lv_name_1_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:915:3: (lv_name_1_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:916:3: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParallelFlow1965); 

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

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:932:2: ( (lv_steps_2_0= ruleStep ) )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==34||LA21_0==39) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:933:3: (lv_steps_2_0= ruleStep )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:933:3: (lv_steps_2_0= ruleStep )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:934:3: lv_steps_2_0= ruleStep
					{
					 
						        newCompositeNode(grammarAccess.getParallelFlowAccess().getStepsStepParserRuleCall_2_0()); 
						    
					pushFollow(FOLLOW_ruleStep_in_ruleParallelFlow1991);
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

			}

			otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleParallelFlow2004); 

			    	newLeafNode(otherlv_3, grammarAccess.getParallelFlowAccess().getEndFlowKeyword_3());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:954:3: (otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) ) )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==44) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:954:3: otherlv_4= 'with postcondition' ( (lv_finalState_5_0= RULE_STRING ) )
					{
					otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleParallelFlow2017); 

					    	newLeafNode(otherlv_4, grammarAccess.getParallelFlowAccess().getWithPostconditionKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:958:3: ( (lv_finalState_5_0= RULE_STRING ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:959:3: (lv_finalState_5_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:959:3: (lv_finalState_5_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:960:3: lv_finalState_5_0= RULE_STRING
					{
					lv_finalState_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParallelFlow2034); 

								newLeafNode(lv_finalState_5_0, grammarAccess.getParallelFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
							

						        if (current==null) {
						            current = createModelElement(grammarAccess.getParallelFlowRule());
						        }
					       		setWithLastConsumed(
					       			current, 
					       			"finalState",
					        		lv_finalState_5_0, 
					        		"STRING");
						    
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:984:1: entryRuleStepAlternative returns [EObject current=null] :iv_ruleStepAlternative= ruleStepAlternative EOF ;
	public final EObject entryRuleStepAlternative() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleStepAlternative =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:985:2: (iv_ruleStepAlternative= ruleStepAlternative EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:986:2: iv_ruleStepAlternative= ruleStepAlternative EOF
			{
			 newCompositeNode(grammarAccess.getStepAlternativeRule()); 
			pushFollow(FOLLOW_ruleStepAlternative_in_entryRuleStepAlternative2077);
			iv_ruleStepAlternative=ruleStepAlternative();
			state._fsp--;

			 current =iv_ruleStepAlternative; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStepAlternative2087); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:993:1: ruleStepAlternative returns [EObject current=null] : (this_Condition_0= ruleCondition |this_LocalAlternative_1= ruleLocalAlternative |this_AlternativeFlowAlternative_2= ruleAlternativeFlowAlternative ) ;
	public final EObject ruleStepAlternative() throws RecognitionException {
		EObject current = null;


		EObject this_Condition_0 =null;
		EObject this_LocalAlternative_1 =null;
		EObject this_AlternativeFlowAlternative_2 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:996:28: ( (this_Condition_0= ruleCondition |this_LocalAlternative_1= ruleLocalAlternative |this_AlternativeFlowAlternative_2= ruleAlternativeFlowAlternative ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:997:5: (this_Condition_0= ruleCondition |this_LocalAlternative_1= ruleLocalAlternative |this_AlternativeFlowAlternative_2= ruleAlternativeFlowAlternative )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:997:5: (this_Condition_0= ruleCondition |this_LocalAlternative_1= ruleLocalAlternative |this_AlternativeFlowAlternative_2= ruleAlternativeFlowAlternative )
			int alt23=3;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==26) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==RULE_STRING) ) {
					int LA23_2 = input.LA(3);
					if ( (LA23_2==41) ) {
						switch ( input.LA(4) ) {
						case EOF:
						case 19:
						case 20:
						case 26:
							{
							alt23=1;
							}
							break;
						case RULE_STRING:
						case 28:
							{
							alt23=2;
							}
							break;
						case 14:
							{
							alt23=3;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 23, 3, input);
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
								new NoViableAltException("", 23, 2, input);
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
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:998:5: this_Condition_0= ruleCondition
					{
					 
					        newCompositeNode(grammarAccess.getStepAlternativeAccess().getConditionParserRuleCall_0()); 
					    
					pushFollow(FOLLOW_ruleCondition_in_ruleStepAlternative2134);
					this_Condition_0=ruleCondition();
					state._fsp--;

					 
					        current = this_Condition_0; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1008:5: this_LocalAlternative_1= ruleLocalAlternative
					{
					 
					        newCompositeNode(grammarAccess.getStepAlternativeAccess().getLocalAlternativeParserRuleCall_1()); 
					    
					pushFollow(FOLLOW_ruleLocalAlternative_in_ruleStepAlternative2161);
					this_LocalAlternative_1=ruleLocalAlternative();
					state._fsp--;

					 
					        current = this_LocalAlternative_1; 
					        afterParserOrEnumRuleCall();
					    
					}
					break;
				case 3 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1018:5: this_AlternativeFlowAlternative_2= ruleAlternativeFlowAlternative
					{
					 
					        newCompositeNode(grammarAccess.getStepAlternativeAccess().getAlternativeFlowAlternativeParserRuleCall_2()); 
					    
					pushFollow(FOLLOW_ruleAlternativeFlowAlternative_in_ruleStepAlternative2188);
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1034:1: entryRuleCondition returns [EObject current=null] :iv_ruleCondition= ruleCondition EOF ;
	public final EObject entryRuleCondition() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleCondition =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1035:2: (iv_ruleCondition= ruleCondition EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1036:2: iv_ruleCondition= ruleCondition EOF
			{
			 newCompositeNode(grammarAccess.getConditionRule()); 
			pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition2223);
			iv_ruleCondition=ruleCondition();
			state._fsp--;

			 current =iv_ruleCondition; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleCondition2233); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1043:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )? ) ;
	public final EObject ruleCondition() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_condition_1_0=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_4=null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1046:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1047:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1047:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1047:3: otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )?
			{
			otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleCondition2270); 

			    	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1051:3: ( (lv_condition_1_0= RULE_STRING ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1052:3: (lv_condition_1_0= RULE_STRING )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1052:3: (lv_condition_1_0= RULE_STRING )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1053:3: lv_condition_1_0= RULE_STRING
			{
			lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCondition2287); 

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

			otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleCondition2304); 

			    	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getThenKeyword_2());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1073:3: (otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) ) )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==19) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1073:3: otherlv_3= 'continue with step' ( (otherlv_4= RULE_ID ) )
					{
					otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleCondition2317); 

					    	newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getContinueWithStepKeyword_3_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1077:3: ( (otherlv_4= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1078:3: (otherlv_4= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1078:3: (otherlv_4= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1079:3: otherlv_4= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getConditionRule());
						        }
					        
					otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCondition2337); 

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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1098:1: entryRuleLocalAlternative returns [EObject current=null] :iv_ruleLocalAlternative= ruleLocalAlternative EOF ;
	public final EObject entryRuleLocalAlternative() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleLocalAlternative =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1099:2: (iv_ruleLocalAlternative= ruleLocalAlternative EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1100:2: iv_ruleLocalAlternative= ruleLocalAlternative EOF
			{
			 newCompositeNode(grammarAccess.getLocalAlternativeRule()); 
			pushFollow(FOLLOW_ruleLocalAlternative_in_entryRuleLocalAlternative2375);
			iv_ruleLocalAlternative=ruleLocalAlternative();
			state._fsp--;

			 current =iv_ruleLocalAlternative; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAlternative2385); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1107:1: ruleLocalAlternative returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) ) (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )? ) ;
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
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1110:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) ) (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1111:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) ) (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1111:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) ) (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1111:3: otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) ) (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )?
			{
			otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLocalAlternative2422); 

			    	newLeafNode(otherlv_0, grammarAccess.getLocalAlternativeAccess().getIfKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1115:3: ( (lv_condition_1_0= RULE_STRING ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1116:3: (lv_condition_1_0= RULE_STRING )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1116:3: (lv_condition_1_0= RULE_STRING )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1117:3: lv_condition_1_0= RULE_STRING
			{
			lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLocalAlternative2439); 

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

			otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleLocalAlternative2456); 

			    	newLeafNode(otherlv_2, grammarAccess.getLocalAlternativeAccess().getThenKeyword_2());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1137:2: ( ( (lv_description_3_0= RULE_STRING ) ) | (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) ) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==RULE_STRING) ) {
				alt25=1;
			}
			else if ( (LA25_0==28) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1137:2: ( (lv_description_3_0= RULE_STRING ) )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1137:2: ( (lv_description_3_0= RULE_STRING ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1138:3: (lv_description_3_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1138:3: (lv_description_3_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1139:3: lv_description_3_0= RULE_STRING
					{
					lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLocalAlternative2474); 

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
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1156:6: (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1156:6: (otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1156:8: otherlv_4= 'invoke usecase' ( (otherlv_5= RULE_ID ) )
					{
					otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleLocalAlternative2498); 

					    	newLeafNode(otherlv_4, grammarAccess.getLocalAlternativeAccess().getInvokeUsecaseKeyword_3_1_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1160:3: ( (otherlv_5= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1161:3: (otherlv_5= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1161:3: (otherlv_5= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1162:3: otherlv_5= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getLocalAlternativeRule());
						        }
					        
					otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalAlternative2518); 

							newLeafNode(otherlv_5, grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseCrossReference_3_1_1_0()); 
						
					}

					}

					}

					}
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1173:4: (otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) ) )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==19) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1173:6: otherlv_6= 'continue with step' ( (otherlv_7= RULE_ID ) )
					{
					otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleLocalAlternative2533); 

					    	newLeafNode(otherlv_6, grammarAccess.getLocalAlternativeAccess().getContinueWithStepKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1177:3: ( (otherlv_7= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1178:3: (otherlv_7= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1178:3: (otherlv_7= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1179:3: otherlv_7= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getLocalAlternativeRule());
						        }
					        
					otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalAlternative2553); 

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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1198:1: entryRuleAlternativeFlowAlternative returns [EObject current=null] :iv_ruleAlternativeFlowAlternative= ruleAlternativeFlowAlternative EOF ;
	public final EObject entryRuleAlternativeFlowAlternative() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleAlternativeFlowAlternative =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1199:2: (iv_ruleAlternativeFlowAlternative= ruleAlternativeFlowAlternative EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1200:2: iv_ruleAlternativeFlowAlternative= ruleAlternativeFlowAlternative EOF
			{
			 newCompositeNode(grammarAccess.getAlternativeFlowAlternativeRule()); 
			pushFollow(FOLLOW_ruleAlternativeFlowAlternative_in_entryRuleAlternativeFlowAlternative2591);
			iv_ruleAlternativeFlowAlternative=ruleAlternativeFlowAlternative();
			state._fsp--;

			 current =iv_ruleAlternativeFlowAlternative; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlowAlternative2601); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1207:1: ruleAlternativeFlowAlternative returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' otherlv_3= 'alternative flow' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )? ) ;
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
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1210:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' otherlv_3= 'alternative flow' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1211:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' otherlv_3= 'alternative flow' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1211:3: (otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' otherlv_3= 'alternative flow' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1211:3: otherlv_0= 'if' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= 'then' otherlv_3= 'alternative flow' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )?
			{
			otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleAlternativeFlowAlternative2638); 

			    	newLeafNode(otherlv_0, grammarAccess.getAlternativeFlowAlternativeAccess().getIfKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1215:3: ( (lv_condition_1_0= RULE_STRING ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1216:3: (lv_condition_1_0= RULE_STRING )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1216:3: (lv_condition_1_0= RULE_STRING )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1217:3: lv_condition_1_0= RULE_STRING
			{
			lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAlternativeFlowAlternative2655); 

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

			otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleAlternativeFlowAlternative2672); 

			    	newLeafNode(otherlv_2, grammarAccess.getAlternativeFlowAlternativeAccess().getThenKeyword_2());
			    
			otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleAlternativeFlowAlternative2684); 

			    	newLeafNode(otherlv_3, grammarAccess.getAlternativeFlowAlternativeAccess().getAlternativeFlowKeyword_3());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1241:3: ( (otherlv_4= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1242:3: (otherlv_4= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1242:3: (otherlv_4= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1243:3: otherlv_4= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getAlternativeFlowAlternativeRule());
				        }
			        
			otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternativeFlowAlternative2704); 

					newLeafNode(otherlv_4, grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowCrossReference_4_0()); 
				
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1254:2: (otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) ) )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==19) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1254:4: otherlv_5= 'continue with step' ( (otherlv_6= RULE_ID ) )
					{
					otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleAlternativeFlowAlternative2717); 

					    	newLeafNode(otherlv_5, grammarAccess.getAlternativeFlowAlternativeAccess().getContinueWithStepKeyword_5_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1258:3: ( (otherlv_6= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1259:3: (otherlv_6= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1259:3: (otherlv_6= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1260:3: otherlv_6= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getAlternativeFlowAlternativeRule());
						        }
					        
					otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternativeFlowAlternative2737); 

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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1279:1: entryRuleParallelStep returns [EObject current=null] :iv_ruleParallelStep= ruleParallelStep EOF ;
	public final EObject entryRuleParallelStep() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleParallelStep =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1280:2: (iv_ruleParallelStep= ruleParallelStep EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1281:2: iv_ruleParallelStep= ruleParallelStep EOF
			{
			 newCompositeNode(grammarAccess.getParallelStepRule()); 
			pushFollow(FOLLOW_ruleParallelStep_in_entryRuleParallelStep2775);
			iv_ruleParallelStep=ruleParallelStep();
			state._fsp--;

			 current =iv_ruleParallelStep; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParallelStep2785); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1288:1: ruleParallelStep returns [EObject current=null] : (otherlv_0= 'parallel step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ( (otherlv_6= RULE_ID ) )? ) ;
	public final EObject ruleParallelStep() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token lv_label_2_0=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_6=null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1291:28: ( (otherlv_0= 'parallel step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ( (otherlv_6= RULE_ID ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1292:3: (otherlv_0= 'parallel step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ( (otherlv_6= RULE_ID ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1292:3: (otherlv_0= 'parallel step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ( (otherlv_6= RULE_ID ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1292:3: otherlv_0= 'parallel step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ( (otherlv_6= RULE_ID ) )?
			{
			otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleParallelStep2822); 

			    	newLeafNode(otherlv_0, grammarAccess.getParallelStepAccess().getParallelStepKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1296:3: ( (lv_name_1_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1297:3: (lv_name_1_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1297:3: (lv_name_1_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1298:3: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParallelStep2839); 

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

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1314:2: ( (lv_label_2_0= RULE_STRING ) )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==RULE_STRING) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1315:3: (lv_label_2_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1315:3: (lv_label_2_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1316:3: lv_label_2_0= RULE_STRING
					{
					lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParallelStep2861); 

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

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1332:3: ( (otherlv_3= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1333:3: (otherlv_3= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1333:3: (otherlv_3= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1334:3: otherlv_3= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getParallelStepRule());
				        }
			        
			otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParallelStep2887); 

					newLeafNode(otherlv_3, grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_3_0()); 
				
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1345:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==11) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1345:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
					{
					otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleParallelStep2900); 

					    	newLeafNode(otherlv_4, grammarAccess.getParallelStepAccess().getCommaKeyword_4_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1349:3: ( (otherlv_5= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1350:3: (otherlv_5= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1350:3: (otherlv_5= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1351:3: otherlv_5= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getParallelStepRule());
						        }
					        
					otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParallelStep2920); 

							newLeafNode(otherlv_5, grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_4_1_0()); 
						
					}

					}

					}
					break;

				default :
					break loop29;
				}
			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1362:4: ( (otherlv_6= RULE_ID ) )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==RULE_ID) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1363:3: (otherlv_6= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1363:3: (otherlv_6= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1364:3: otherlv_6= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getParallelStepRule());
						        }
					        
					otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParallelStep2942); 

							newLeafNode(otherlv_6, grammarAccess.getParallelStepAccess().getNextStepCrossReference_5_0()); 
						
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1383:1: entryRuleNormalStep returns [EObject current=null] :iv_ruleNormalStep= ruleNormalStep EOF ;
	public final EObject entryRuleNormalStep() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleNormalStep =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1384:2: (iv_ruleNormalStep= ruleNormalStep EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1385:2: iv_ruleNormalStep= ruleNormalStep EOF
			{
			 newCompositeNode(grammarAccess.getNormalStepRule()); 
			pushFollow(FOLLOW_ruleNormalStep_in_entryRuleNormalStep2979);
			iv_ruleNormalStep=ruleNormalStep();
			state._fsp--;

			 current =iv_ruleNormalStep; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleNormalStep2989); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1392:1: ruleNormalStep returns [EObject current=null] : (otherlv_0= 'step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'type' ( (lv_customStepType_6_0= ruleCustomStepType ) ) )? ( (otherlv_7= 'alternatives' ( (lv_stepAlternative_8_0= ruleStepAlternative ) )+ otherlv_9= 'else' ) | (otherlv_10= 'invoke usecase' ( (otherlv_11= RULE_ID ) ) ) )? ( (otherlv_12= RULE_ID ) )? ) ;
	public final EObject ruleNormalStep() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token lv_label_2_0=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_7=null;
		Token otherlv_9=null;
		Token otherlv_10=null;
		Token otherlv_11=null;
		Token otherlv_12=null;
		Enumerator lv_customStepType_6_0 =null;
		EObject lv_stepAlternative_8_0 =null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1395:28: ( (otherlv_0= 'step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'type' ( (lv_customStepType_6_0= ruleCustomStepType ) ) )? ( (otherlv_7= 'alternatives' ( (lv_stepAlternative_8_0= ruleStepAlternative ) )+ otherlv_9= 'else' ) | (otherlv_10= 'invoke usecase' ( (otherlv_11= RULE_ID ) ) ) )? ( (otherlv_12= RULE_ID ) )? ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1396:3: (otherlv_0= 'step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'type' ( (lv_customStepType_6_0= ruleCustomStepType ) ) )? ( (otherlv_7= 'alternatives' ( (lv_stepAlternative_8_0= ruleStepAlternative ) )+ otherlv_9= 'else' ) | (otherlv_10= 'invoke usecase' ( (otherlv_11= RULE_ID ) ) ) )? ( (otherlv_12= RULE_ID ) )? )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1396:3: (otherlv_0= 'step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'type' ( (lv_customStepType_6_0= ruleCustomStepType ) ) )? ( (otherlv_7= 'alternatives' ( (lv_stepAlternative_8_0= ruleStepAlternative ) )+ otherlv_9= 'else' ) | (otherlv_10= 'invoke usecase' ( (otherlv_11= RULE_ID ) ) ) )? ( (otherlv_12= RULE_ID ) )? )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1396:3: otherlv_0= 'step' ( (lv_name_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) )? otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'type' ( (lv_customStepType_6_0= ruleCustomStepType ) ) )? ( (otherlv_7= 'alternatives' ( (lv_stepAlternative_8_0= ruleStepAlternative ) )+ otherlv_9= 'else' ) | (otherlv_10= 'invoke usecase' ( (otherlv_11= RULE_ID ) ) ) )? ( (otherlv_12= RULE_ID ) )?
			{
			otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleNormalStep3026); 

			    	newLeafNode(otherlv_0, grammarAccess.getNormalStepAccess().getStepKeyword_0());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1400:3: ( (lv_name_1_0= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1401:3: (lv_name_1_0= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1401:3: (lv_name_1_0= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1402:3: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNormalStep3043); 

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

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1418:2: ( (lv_label_2_0= RULE_STRING ) )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==RULE_STRING) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1419:3: (lv_label_2_0= RULE_STRING )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1419:3: (lv_label_2_0= RULE_STRING )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1420:3: lv_label_2_0= RULE_STRING
					{
					lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNormalStep3065); 

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

			otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleNormalStep3083); 

			    	newLeafNode(otherlv_3, grammarAccess.getNormalStepAccess().getByKeyword_3());
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1440:3: ( (otherlv_4= RULE_ID ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1441:3: (otherlv_4= RULE_ID )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1441:3: (otherlv_4= RULE_ID )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1442:3: otherlv_4= RULE_ID
			{

						if (current==null) {
				            current = createModelElement(grammarAccess.getNormalStepRule());
				        }
			        
			otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNormalStep3103); 

					newLeafNode(otherlv_4, grammarAccess.getNormalStepAccess().getActorActorCrossReference_4_0()); 
				
			}

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1453:2: (otherlv_5= 'type' ( (lv_customStepType_6_0= ruleCustomStepType ) ) )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==42) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1453:4: otherlv_5= 'type' ( (lv_customStepType_6_0= ruleCustomStepType ) )
					{
					otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleNormalStep3116); 

					    	newLeafNode(otherlv_5, grammarAccess.getNormalStepAccess().getTypeKeyword_5_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1457:3: ( (lv_customStepType_6_0= ruleCustomStepType ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1458:3: (lv_customStepType_6_0= ruleCustomStepType )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1458:3: (lv_customStepType_6_0= ruleCustomStepType )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1459:3: lv_customStepType_6_0= ruleCustomStepType
					{
					 
						        newCompositeNode(grammarAccess.getNormalStepAccess().getCustomStepTypeCustomStepTypeEnumRuleCall_5_1_0()); 
						    
					pushFollow(FOLLOW_ruleCustomStepType_in_ruleNormalStep3137);
					lv_customStepType_6_0=ruleCustomStepType();
					state._fsp--;


						        if (current==null) {
						            current = createModelElementForParent(grammarAccess.getNormalStepRule());
						        }
					       		set(
					       			current, 
					       			"customStepType",
					        		lv_customStepType_6_0, 
					        		"CustomStepType");
						        afterParserOrEnumRuleCall();
						    
					}

					}

					}
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1475:4: ( (otherlv_7= 'alternatives' ( (lv_stepAlternative_8_0= ruleStepAlternative ) )+ otherlv_9= 'else' ) | (otherlv_10= 'invoke usecase' ( (otherlv_11= RULE_ID ) ) ) )?
			int alt34=3;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==15) ) {
				alt34=1;
			}
			else if ( (LA34_0==28) ) {
				alt34=2;
			}
			switch (alt34) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1475:5: (otherlv_7= 'alternatives' ( (lv_stepAlternative_8_0= ruleStepAlternative ) )+ otherlv_9= 'else' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1475:5: (otherlv_7= 'alternatives' ( (lv_stepAlternative_8_0= ruleStepAlternative ) )+ otherlv_9= 'else' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1475:7: otherlv_7= 'alternatives' ( (lv_stepAlternative_8_0= ruleStepAlternative ) )+ otherlv_9= 'else'
					{
					otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleNormalStep3153); 

					    	newLeafNode(otherlv_7, grammarAccess.getNormalStepAccess().getAlternativesKeyword_6_0_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1479:3: ( (lv_stepAlternative_8_0= ruleStepAlternative ) )+
					int cnt33=0;
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==26) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1480:3: (lv_stepAlternative_8_0= ruleStepAlternative )
							{
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1480:3: (lv_stepAlternative_8_0= ruleStepAlternative )
							// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1481:3: lv_stepAlternative_8_0= ruleStepAlternative
							{
							 
								        newCompositeNode(grammarAccess.getNormalStepAccess().getStepAlternativeStepAlternativeParserRuleCall_6_0_1_0()); 
								    
							pushFollow(FOLLOW_ruleStepAlternative_in_ruleNormalStep3174);
							lv_stepAlternative_8_0=ruleStepAlternative();
							state._fsp--;


								        if (current==null) {
								            current = createModelElementForParent(grammarAccess.getNormalStepRule());
								        }
							       		add(
							       			current, 
							       			"stepAlternative",
							        		lv_stepAlternative_8_0, 
							        		"StepAlternative");
								        afterParserOrEnumRuleCall();
								    
							}

							}
							break;

						default :
							if ( cnt33 >= 1 ) break loop33;
							EarlyExitException eee = new EarlyExitException(33, input);
							throw eee;
						}
						cnt33++;
					}

					otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleNormalStep3187); 

					    	newLeafNode(otherlv_9, grammarAccess.getNormalStepAccess().getElseKeyword_6_0_2());
					    
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1502:6: (otherlv_10= 'invoke usecase' ( (otherlv_11= RULE_ID ) ) )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1502:6: (otherlv_10= 'invoke usecase' ( (otherlv_11= RULE_ID ) ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1502:8: otherlv_10= 'invoke usecase' ( (otherlv_11= RULE_ID ) )
					{
					otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleNormalStep3207); 

					    	newLeafNode(otherlv_10, grammarAccess.getNormalStepAccess().getInvokeUsecaseKeyword_6_1_0());
					    
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1506:3: ( (otherlv_11= RULE_ID ) )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1507:3: (otherlv_11= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1507:3: (otherlv_11= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1508:3: otherlv_11= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getNormalStepRule());
						        }
					        
					otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNormalStep3227); 

							newLeafNode(otherlv_11, grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseCrossReference_6_1_1_0()); 
						
					}

					}

					}

					}
					break;

			}

			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1519:5: ( (otherlv_12= RULE_ID ) )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==RULE_ID) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1520:3: (otherlv_12= RULE_ID )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1520:3: (otherlv_12= RULE_ID )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1521:3: otherlv_12= RULE_ID
					{

								if (current==null) {
						            current = createModelElement(grammarAccess.getNormalStepRule());
						        }
					        
					otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNormalStep3250); 

							newLeafNode(otherlv_12, grammarAccess.getNormalStepAccess().getNextStepCrossReference_7_0()); 
						
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1540:1: entryRuleQualifiedName returns [String current=null] :iv_ruleQualifiedName= ruleQualifiedName EOF ;
	public final String entryRuleQualifiedName() throws RecognitionException {
		String current = null;


		AntlrDatatypeRuleToken iv_ruleQualifiedName =null;

		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1541:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1542:2: iv_ruleQualifiedName= ruleQualifiedName EOF
			{
			 newCompositeNode(grammarAccess.getQualifiedNameRule()); 
			pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3288);
			iv_ruleQualifiedName=ruleQualifiedName();
			state._fsp--;

			 current =iv_ruleQualifiedName.getText(); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3299); 
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1549:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
	public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();


		Token this_ID_0=null;
		Token kw=null;
		Token this_ID_2=null;

		 enterRule(); 
		    
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1552:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1553:6: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1553:6: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1553:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
			{
			this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3339); 

					current.merge(this_ID_0);
			    
			 
			    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
			    
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1560:2: (kw= '.' this_ID_2= RULE_ID )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==12) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1561:2: kw= '.' this_ID_2= RULE_ID
					{
					kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName3358); 

					        current.merge(kw);
					        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
					    
					this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3373); 

							current.merge(this_ID_2);
					    
					 
					    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
					    
					}
					break;

				default :
					break loop36;
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
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1581:1: ruleActorType returns [Enumerator current=null] : ( (enumLiteral_0= 'person' ) | (enumLiteral_1= 'system' ) | (enumLiteral_2= 'organization' ) ) ;
	public final Enumerator ruleActorType() throws RecognitionException {
		Enumerator current = null;


		Token enumLiteral_0=null;
		Token enumLiteral_1=null;
		Token enumLiteral_2=null;

		 enterRule(); 
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1583:28: ( ( (enumLiteral_0= 'person' ) | (enumLiteral_1= 'system' ) | (enumLiteral_2= 'organization' ) ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1584:2: ( (enumLiteral_0= 'person' ) | (enumLiteral_1= 'system' ) | (enumLiteral_2= 'organization' ) )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1584:2: ( (enumLiteral_0= 'person' ) | (enumLiteral_1= 'system' ) | (enumLiteral_2= 'organization' ) )
			int alt37=3;
			switch ( input.LA(1) ) {
			case 35:
				{
				alt37=1;
				}
				break;
			case 40:
				{
				alt37=2;
				}
				break;
			case 30:
				{
				alt37=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1584:2: (enumLiteral_0= 'person' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1584:2: (enumLiteral_0= 'person' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1584:4: enumLiteral_0= 'person'
					{
					enumLiteral_0=(Token)match(input,35,FOLLOW_35_in_ruleActorType3434); 

					        current = grammarAccess.getActorTypeAccess().getPERSONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_0, grammarAccess.getActorTypeAccess().getPERSONEnumLiteralDeclaration_0()); 
					    
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1590:6: (enumLiteral_1= 'system' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1590:6: (enumLiteral_1= 'system' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1590:8: enumLiteral_1= 'system'
					{
					enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleActorType3451); 

					        current = grammarAccess.getActorTypeAccess().getSYSTEMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_1, grammarAccess.getActorTypeAccess().getSYSTEMEnumLiteralDeclaration_1()); 
					    
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1596:6: (enumLiteral_2= 'organization' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1596:6: (enumLiteral_2= 'organization' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1596:8: enumLiteral_2= 'organization'
					{
					enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_ruleActorType3468); 

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



	// $ANTLR start "ruleCustomStepType"
	// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1606:1: ruleCustomStepType returns [Enumerator current=null] : ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'process' ) | (enumLiteral_3= 'mix' ) ) ;
	public final Enumerator ruleCustomStepType() throws RecognitionException {
		Enumerator current = null;


		Token enumLiteral_0=null;
		Token enumLiteral_1=null;
		Token enumLiteral_2=null;
		Token enumLiteral_3=null;

		 enterRule(); 
		try {
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1608:28: ( ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'process' ) | (enumLiteral_3= 'mix' ) ) )
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1609:2: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'process' ) | (enumLiteral_3= 'mix' ) )
			{
			// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1609:2: ( (enumLiteral_0= 'input' ) | (enumLiteral_1= 'output' ) | (enumLiteral_2= 'process' ) | (enumLiteral_3= 'mix' ) )
			int alt38=4;
			switch ( input.LA(1) ) {
			case 27:
				{
				alt38=1;
				}
				break;
			case 31:
				{
				alt38=2;
				}
				break;
			case 38:
				{
				alt38=3;
				}
				break;
			case 29:
				{
				alt38=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1609:2: (enumLiteral_0= 'input' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1609:2: (enumLiteral_0= 'input' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1609:4: enumLiteral_0= 'input'
					{
					enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleCustomStepType3513); 

					        current = grammarAccess.getCustomStepTypeAccess().getINPUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_0, grammarAccess.getCustomStepTypeAccess().getINPUTEnumLiteralDeclaration_0()); 
					    
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1615:6: (enumLiteral_1= 'output' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1615:6: (enumLiteral_1= 'output' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1615:8: enumLiteral_1= 'output'
					{
					enumLiteral_1=(Token)match(input,31,FOLLOW_31_in_ruleCustomStepType3530); 

					        current = grammarAccess.getCustomStepTypeAccess().getOUTPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_1, grammarAccess.getCustomStepTypeAccess().getOUTPUTEnumLiteralDeclaration_1()); 
					    
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1621:6: (enumLiteral_2= 'process' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1621:6: (enumLiteral_2= 'process' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1621:8: enumLiteral_2= 'process'
					{
					enumLiteral_2=(Token)match(input,38,FOLLOW_38_in_ruleCustomStepType3547); 

					        current = grammarAccess.getCustomStepTypeAccess().getPROCESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_2, grammarAccess.getCustomStepTypeAccess().getPROCESSEnumLiteralDeclaration_2()); 
					    
					}

					}
					break;
				case 4 :
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1627:6: (enumLiteral_3= 'mix' )
					{
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1627:6: (enumLiteral_3= 'mix' )
					// ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1627:8: enumLiteral_3= 'mix'
					{
					enumLiteral_3=(Token)match(input,29,FOLLOW_29_in_ruleCustomStepType3564); 

					        current = grammarAccess.getCustomStepTypeAccess().getMIXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
					        newLeafNode(enumLiteral_3, grammarAccess.getCustomStepTypeAccess().getMIXEnumLiteralDeclaration_3()); 
					    
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
	// $ANTLR end "ruleCustomStepType"

	// Delegated rules



	public static final BitSet FOLLOW_ruleUseCasesModel_in_entryRuleUseCasesModel75 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleUseCasesModel85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleUseCasesModel130 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_rulePackageDeclaration213 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration234 = new BitSet(new long[]{0x0000080000402200L});
	public static final BitSet FOLLOW_RULE_STRING_in_rulePackageDeclaration251 = new BitSet(new long[]{0x0000080000402000L});
	public static final BitSet FOLLOW_13_in_rulePackageDeclaration270 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ruleActor_in_rulePackageDeclaration291 = new BitSet(new long[]{0x0000080000400020L});
	public static final BitSet FOLLOW_ruleUseCase_in_rulePackageDeclaration315 = new BitSet(new long[]{0x0000080000400000L});
	public static final BitSet FOLLOW_22_in_rulePackageDeclaration328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase364 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleUseCase374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_ruleUseCase411 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase428 = new BitSet(new long[]{0x0000003203824200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase450 = new BitSet(new long[]{0x0000003203824000L});
	public static final BitSet FOLLOW_25_in_ruleUseCase469 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleUseCase489 = new BitSet(new long[]{0x0000003201824000L});
	public static final BitSet FOLLOW_37_in_ruleUseCase549 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase566 = new BitSet(new long[]{0x0000003201824000L});
	public static final BitSet FOLLOW_36_in_ruleUseCase639 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleUseCase656 = new BitSet(new long[]{0x0000003201824000L});
	public static final BitSet FOLLOW_ruleFlow_in_ruleUseCase723 = new BitSet(new long[]{0x0000000201824000L});
	public static final BitSet FOLLOW_23_in_ruleUseCase736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActor_in_entryRuleActor772 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleActor782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleActor824 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_ruleActor841 = new BitSet(new long[]{0x0000010840000000L});
	public static final BitSet FOLLOW_ruleActorType_in_ruleActor862 = new BitSet(new long[]{0x0000000002000202L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleActor879 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_ruleActor898 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleActor918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_entryRuleStep956 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStep966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNormalStep_in_ruleStep1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelStep_in_ruleStep1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow1075 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleFlow1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBasicFlow_in_ruleFlow1132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNamedFlow_in_ruleFlow1159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow1194 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleBasicFlow1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_ruleBasicFlow1241 = new BitSet(new long[]{0x0000008400200000L});
	public static final BitSet FOLLOW_ruleStep_in_ruleBasicFlow1271 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_ruleBasicFlow1284 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_ruleBasicFlow1297 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleBasicFlow1314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNamedFlow_in_entryRuleNamedFlow1357 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleNamedFlow1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExceptionFlow_in_ruleNamedFlow1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlow_in_ruleNamedFlow1441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelFlow_in_ruleNamedFlow1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExceptionFlow_in_entryRuleExceptionFlow1503 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleExceptionFlow1513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_ruleExceptionFlow1550 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleExceptionFlow1567 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_ruleExceptionFlow1584 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleExceptionFlow1601 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ruleExceptionFlow1618 = new BitSet(new long[]{0x0000008400200000L});
	public static final BitSet FOLLOW_ruleStep_in_ruleExceptionFlow1639 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_ruleExceptionFlow1652 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_ruleExceptionFlow1665 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleExceptionFlow1682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow1725 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlow1735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_ruleAlternativeFlow1772 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeFlow1789 = new BitSet(new long[]{0x0000008400200000L});
	public static final BitSet FOLLOW_ruleStep_in_ruleAlternativeFlow1815 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_ruleAlternativeFlow1828 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_ruleAlternativeFlow1841 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleAlternativeFlow1858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelFlow_in_entryRuleParallelFlow1901 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParallelFlow1911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_ruleParallelFlow1948 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleParallelFlow1965 = new BitSet(new long[]{0x0000008400200000L});
	public static final BitSet FOLLOW_ruleStep_in_ruleParallelFlow1991 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_ruleParallelFlow2004 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_ruleParallelFlow2017 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleParallelFlow2034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStepAlternative_in_entryRuleStepAlternative2077 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStepAlternative2087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCondition_in_ruleStepAlternative2134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLocalAlternative_in_ruleStepAlternative2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlowAlternative_in_ruleStepAlternative2188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2223 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleCondition2233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_ruleCondition2270 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleCondition2287 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ruleCondition2304 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_ruleCondition2317 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleCondition2337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLocalAlternative_in_entryRuleLocalAlternative2375 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleLocalAlternative2385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_ruleLocalAlternative2422 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleLocalAlternative2439 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ruleLocalAlternative2456 = new BitSet(new long[]{0x0000000010000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleLocalAlternative2474 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_28_in_ruleLocalAlternative2498 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleLocalAlternative2518 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_ruleLocalAlternative2533 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleLocalAlternative2553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlowAlternative_in_entryRuleAlternativeFlowAlternative2591 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlowAlternative2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_ruleAlternativeFlowAlternative2638 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleAlternativeFlowAlternative2655 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_ruleAlternativeFlowAlternative2672 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_ruleAlternativeFlowAlternative2684 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeFlowAlternative2704 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_ruleAlternativeFlowAlternative2717 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeFlowAlternative2737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelStep_in_entryRuleParallelStep2775 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParallelStep2785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_ruleParallelStep2822 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleParallelStep2839 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleParallelStep2861 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleParallelStep2887 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_11_in_ruleParallelStep2900 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleParallelStep2920 = new BitSet(new long[]{0x0000000000000822L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleParallelStep2942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNormalStep_in_entryRuleNormalStep2979 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleNormalStep2989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_ruleNormalStep3026 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleNormalStep3043 = new BitSet(new long[]{0x0000000000040200L});
	public static final BitSet FOLLOW_RULE_STRING_in_ruleNormalStep3065 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ruleNormalStep3083 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleNormalStep3103 = new BitSet(new long[]{0x0000040010008022L});
	public static final BitSet FOLLOW_42_in_ruleNormalStep3116 = new BitSet(new long[]{0x00000040A8000000L});
	public static final BitSet FOLLOW_ruleCustomStepType_in_ruleNormalStep3137 = new BitSet(new long[]{0x0000000010008022L});
	public static final BitSet FOLLOW_15_in_ruleNormalStep3153 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ruleStepAlternative_in_ruleNormalStep3174 = new BitSet(new long[]{0x0000000004100000L});
	public static final BitSet FOLLOW_20_in_ruleNormalStep3187 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_28_in_ruleNormalStep3207 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleNormalStep3227 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleNormalStep3250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3288 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3339 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_ruleQualifiedName3358 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3373 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_35_in_ruleActorType3434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_ruleActorType3451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_ruleActorType3468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_ruleCustomStepType3513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_ruleCustomStepType3530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_ruleCustomStepType3547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_ruleCustomStepType3564 = new BitSet(new long[]{0x0000000000000002L});
}
