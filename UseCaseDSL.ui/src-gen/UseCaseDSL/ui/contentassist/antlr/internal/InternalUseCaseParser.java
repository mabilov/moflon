package UseCaseDSL.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import UseCaseDSL.services.UseCaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseParser extends AbstractInternalContentAssistParser {
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
	public AbstractInternalContentAssistParser[] getDelegates() {
		return new AbstractInternalContentAssistParser[] {};
	}

	// delegators


	public InternalUseCaseParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public InternalUseCaseParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return InternalUseCaseParser.tokenNames; }
	@Override public String getGrammarFileName() { return "../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g"; }


	 
	 	private UseCaseGrammarAccess grammarAccess;
	 	
	    public void setGrammarAccess(UseCaseGrammarAccess grammarAccess) {
	    	this.grammarAccess = grammarAccess;
	    }
	    
	    @Override
	    protected Grammar getGrammar() {
	    	return grammarAccess.getGrammar();
	    }
	    
	    @Override
	    protected String getValueForTokenName(String tokenName) {
	    	return tokenName;
	    }




	// $ANTLR start "entryRuleUseCasesModel"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:60:1: entryRuleUseCasesModel : ruleUseCasesModel EOF ;
	public final void entryRuleUseCasesModel() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:61:1: ( ruleUseCasesModel EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:62:1: ruleUseCasesModel EOF
			{
			 before(grammarAccess.getUseCasesModelRule()); 
			pushFollow(FOLLOW_ruleUseCasesModel_in_entryRuleUseCasesModel61);
			ruleUseCasesModel();
			state._fsp--;

			 after(grammarAccess.getUseCasesModelRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleUseCasesModel68); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleUseCasesModel"



	// $ANTLR start "ruleUseCasesModel"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:69:1: ruleUseCasesModel : ( ( rule__UseCasesModel__PackagesAssignment )* ) ;
	public final void ruleUseCasesModel() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:73:2: ( ( ( rule__UseCasesModel__PackagesAssignment )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:74:1: ( ( rule__UseCasesModel__PackagesAssignment )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:74:1: ( ( rule__UseCasesModel__PackagesAssignment )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:75:1: ( rule__UseCasesModel__PackagesAssignment )*
			{
			 before(grammarAccess.getUseCasesModelAccess().getPackagesAssignment()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:76:2: ( rule__UseCasesModel__PackagesAssignment )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==32) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:76:2: rule__UseCasesModel__PackagesAssignment
					{
					pushFollow(FOLLOW_rule__UseCasesModel__PackagesAssignment_in_ruleUseCasesModel94);
					rule__UseCasesModel__PackagesAssignment();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			 after(grammarAccess.getUseCasesModelAccess().getPackagesAssignment()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleUseCasesModel"



	// $ANTLR start "entryRulePackageDeclaration"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:88:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
	public final void entryRulePackageDeclaration() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:89:1: ( rulePackageDeclaration EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:90:1: rulePackageDeclaration EOF
			{
			 before(grammarAccess.getPackageDeclarationRule()); 
			pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration122);
			rulePackageDeclaration();
			state._fsp--;

			 after(grammarAccess.getPackageDeclarationRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration129); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRulePackageDeclaration"



	// $ANTLR start "rulePackageDeclaration"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:97:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
	public final void rulePackageDeclaration() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:101:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:102:1: ( ( rule__PackageDeclaration__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:102:1: ( ( rule__PackageDeclaration__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:103:1: ( rule__PackageDeclaration__Group__0 )
			{
			 before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:104:2: ( rule__PackageDeclaration__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:104:2: rule__PackageDeclaration__Group__0
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration155);
			rule__PackageDeclaration__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getPackageDeclarationAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rulePackageDeclaration"



	// $ANTLR start "entryRuleUseCase"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:116:1: entryRuleUseCase : ruleUseCase EOF ;
	public final void entryRuleUseCase() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:117:1: ( ruleUseCase EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:118:1: ruleUseCase EOF
			{
			 before(grammarAccess.getUseCaseRule()); 
			pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase182);
			ruleUseCase();
			state._fsp--;

			 after(grammarAccess.getUseCaseRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase189); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleUseCase"



	// $ANTLR start "ruleUseCase"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:125:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
	public final void ruleUseCase() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:129:2: ( ( ( rule__UseCase__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:130:1: ( ( rule__UseCase__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:130:1: ( ( rule__UseCase__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:131:1: ( rule__UseCase__Group__0 )
			{
			 before(grammarAccess.getUseCaseAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:132:2: ( rule__UseCase__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:132:2: rule__UseCase__Group__0
			{
			pushFollow(FOLLOW_rule__UseCase__Group__0_in_ruleUseCase215);
			rule__UseCase__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getUseCaseAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleUseCase"



	// $ANTLR start "entryRuleUCCondition"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:144:1: entryRuleUCCondition : ruleUCCondition EOF ;
	public final void entryRuleUCCondition() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:145:1: ( ruleUCCondition EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:146:1: ruleUCCondition EOF
			{
			 before(grammarAccess.getUCConditionRule()); 
			pushFollow(FOLLOW_ruleUCCondition_in_entryRuleUCCondition242);
			ruleUCCondition();
			state._fsp--;

			 after(grammarAccess.getUCConditionRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleUCCondition249); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleUCCondition"



	// $ANTLR start "ruleUCCondition"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:153:1: ruleUCCondition : ( ( rule__UCCondition__NameAssignment ) ) ;
	public final void ruleUCCondition() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:157:2: ( ( ( rule__UCCondition__NameAssignment ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:158:1: ( ( rule__UCCondition__NameAssignment ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:158:1: ( ( rule__UCCondition__NameAssignment ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:159:1: ( rule__UCCondition__NameAssignment )
			{
			 before(grammarAccess.getUCConditionAccess().getNameAssignment()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:160:2: ( rule__UCCondition__NameAssignment )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:160:2: rule__UCCondition__NameAssignment
			{
			pushFollow(FOLLOW_rule__UCCondition__NameAssignment_in_ruleUCCondition275);
			rule__UCCondition__NameAssignment();
			state._fsp--;

			}

			 after(grammarAccess.getUCConditionAccess().getNameAssignment()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleUCCondition"



	// $ANTLR start "entryRuleActor"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:172:1: entryRuleActor : ruleActor EOF ;
	public final void entryRuleActor() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:173:1: ( ruleActor EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:174:1: ruleActor EOF
			{
			 before(grammarAccess.getActorRule()); 
			pushFollow(FOLLOW_ruleActor_in_entryRuleActor302);
			ruleActor();
			state._fsp--;

			 after(grammarAccess.getActorRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleActor309); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleActor"



	// $ANTLR start "ruleActor"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:181:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
	public final void ruleActor() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:185:2: ( ( ( rule__Actor__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:186:1: ( ( rule__Actor__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:186:1: ( ( rule__Actor__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:187:1: ( rule__Actor__Group__0 )
			{
			 before(grammarAccess.getActorAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:188:2: ( rule__Actor__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:188:2: rule__Actor__Group__0
			{
			pushFollow(FOLLOW_rule__Actor__Group__0_in_ruleActor335);
			rule__Actor__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getActorAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleActor"



	// $ANTLR start "entryRuleStep"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:200:1: entryRuleStep : ruleStep EOF ;
	public final void entryRuleStep() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:201:1: ( ruleStep EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:202:1: ruleStep EOF
			{
			 before(grammarAccess.getStepRule()); 
			pushFollow(FOLLOW_ruleStep_in_entryRuleStep362);
			ruleStep();
			state._fsp--;

			 after(grammarAccess.getStepRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStep369); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleStep"



	// $ANTLR start "ruleStep"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:209:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
	public final void ruleStep() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:213:2: ( ( ( rule__Step__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:214:1: ( ( rule__Step__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:214:1: ( ( rule__Step__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:215:1: ( rule__Step__Alternatives )
			{
			 before(grammarAccess.getStepAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:216:2: ( rule__Step__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:216:2: rule__Step__Alternatives
			{
			pushFollow(FOLLOW_rule__Step__Alternatives_in_ruleStep395);
			rule__Step__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getStepAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleStep"



	// $ANTLR start "entryRuleFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:228:1: entryRuleFlow : ruleFlow EOF ;
	public final void entryRuleFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:229:1: ( ruleFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:230:1: ruleFlow EOF
			{
			 before(grammarAccess.getFlowRule()); 
			pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow422);
			ruleFlow();
			state._fsp--;

			 after(grammarAccess.getFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleFlow429); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleFlow"



	// $ANTLR start "ruleFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:237:1: ruleFlow : ( ( rule__Flow__Alternatives ) ) ;
	public final void ruleFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:241:2: ( ( ( rule__Flow__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:242:1: ( ( rule__Flow__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:242:1: ( ( rule__Flow__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:243:1: ( rule__Flow__Alternatives )
			{
			 before(grammarAccess.getFlowAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:244:2: ( rule__Flow__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:244:2: rule__Flow__Alternatives
			{
			pushFollow(FOLLOW_rule__Flow__Alternatives_in_ruleFlow455);
			rule__Flow__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getFlowAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleFlow"



	// $ANTLR start "entryRuleBasicFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:256:1: entryRuleBasicFlow : ruleBasicFlow EOF ;
	public final void entryRuleBasicFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:257:1: ( ruleBasicFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:258:1: ruleBasicFlow EOF
			{
			 before(grammarAccess.getBasicFlowRule()); 
			pushFollow(FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow482);
			ruleBasicFlow();
			state._fsp--;

			 after(grammarAccess.getBasicFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleBasicFlow489); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleBasicFlow"



	// $ANTLR start "ruleBasicFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:265:1: ruleBasicFlow : ( ( rule__BasicFlow__Group__0 ) ) ;
	public final void ruleBasicFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:269:2: ( ( ( rule__BasicFlow__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:270:1: ( ( rule__BasicFlow__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:270:1: ( ( rule__BasicFlow__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:271:1: ( rule__BasicFlow__Group__0 )
			{
			 before(grammarAccess.getBasicFlowAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:272:2: ( rule__BasicFlow__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:272:2: rule__BasicFlow__Group__0
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__0_in_ruleBasicFlow515);
			rule__BasicFlow__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getBasicFlowAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleBasicFlow"



	// $ANTLR start "entryRuleNamedFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:284:1: entryRuleNamedFlow : ruleNamedFlow EOF ;
	public final void entryRuleNamedFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:285:1: ( ruleNamedFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:286:1: ruleNamedFlow EOF
			{
			 before(grammarAccess.getNamedFlowRule()); 
			pushFollow(FOLLOW_ruleNamedFlow_in_entryRuleNamedFlow542);
			ruleNamedFlow();
			state._fsp--;

			 after(grammarAccess.getNamedFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleNamedFlow549); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleNamedFlow"



	// $ANTLR start "ruleNamedFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:293:1: ruleNamedFlow : ( ( rule__NamedFlow__Alternatives ) ) ;
	public final void ruleNamedFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:297:2: ( ( ( rule__NamedFlow__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:298:1: ( ( rule__NamedFlow__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:298:1: ( ( rule__NamedFlow__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:299:1: ( rule__NamedFlow__Alternatives )
			{
			 before(grammarAccess.getNamedFlowAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:300:2: ( rule__NamedFlow__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:300:2: rule__NamedFlow__Alternatives
			{
			pushFollow(FOLLOW_rule__NamedFlow__Alternatives_in_ruleNamedFlow575);
			rule__NamedFlow__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getNamedFlowAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleNamedFlow"



	// $ANTLR start "entryRuleExceptionFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:312:1: entryRuleExceptionFlow : ruleExceptionFlow EOF ;
	public final void entryRuleExceptionFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:313:1: ( ruleExceptionFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:314:1: ruleExceptionFlow EOF
			{
			 before(grammarAccess.getExceptionFlowRule()); 
			pushFollow(FOLLOW_ruleExceptionFlow_in_entryRuleExceptionFlow602);
			ruleExceptionFlow();
			state._fsp--;

			 after(grammarAccess.getExceptionFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionFlow609); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleExceptionFlow"



	// $ANTLR start "ruleExceptionFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:321:1: ruleExceptionFlow : ( ( rule__ExceptionFlow__Group__0 ) ) ;
	public final void ruleExceptionFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:325:2: ( ( ( rule__ExceptionFlow__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:326:1: ( ( rule__ExceptionFlow__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:326:1: ( ( rule__ExceptionFlow__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:327:1: ( rule__ExceptionFlow__Group__0 )
			{
			 before(grammarAccess.getExceptionFlowAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:328:2: ( rule__ExceptionFlow__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:328:2: rule__ExceptionFlow__Group__0
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__0_in_ruleExceptionFlow635);
			rule__ExceptionFlow__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getExceptionFlowAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleExceptionFlow"



	// $ANTLR start "entryRuleAlternativeFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:340:1: entryRuleAlternativeFlow : ruleAlternativeFlow EOF ;
	public final void entryRuleAlternativeFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:341:1: ( ruleAlternativeFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:342:1: ruleAlternativeFlow EOF
			{
			 before(grammarAccess.getAlternativeFlowRule()); 
			pushFollow(FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow662);
			ruleAlternativeFlow();
			state._fsp--;

			 after(grammarAccess.getAlternativeFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlow669); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleAlternativeFlow"



	// $ANTLR start "ruleAlternativeFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:349:1: ruleAlternativeFlow : ( ( rule__AlternativeFlow__Group__0 ) ) ;
	public final void ruleAlternativeFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:353:2: ( ( ( rule__AlternativeFlow__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:354:1: ( ( rule__AlternativeFlow__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:354:1: ( ( rule__AlternativeFlow__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:355:1: ( rule__AlternativeFlow__Group__0 )
			{
			 before(grammarAccess.getAlternativeFlowAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:356:2: ( rule__AlternativeFlow__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:356:2: rule__AlternativeFlow__Group__0
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__0_in_ruleAlternativeFlow695);
			rule__AlternativeFlow__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getAlternativeFlowAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleAlternativeFlow"



	// $ANTLR start "entryRuleParallelFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:368:1: entryRuleParallelFlow : ruleParallelFlow EOF ;
	public final void entryRuleParallelFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:369:1: ( ruleParallelFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:370:1: ruleParallelFlow EOF
			{
			 before(grammarAccess.getParallelFlowRule()); 
			pushFollow(FOLLOW_ruleParallelFlow_in_entryRuleParallelFlow722);
			ruleParallelFlow();
			state._fsp--;

			 after(grammarAccess.getParallelFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParallelFlow729); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleParallelFlow"



	// $ANTLR start "ruleParallelFlow"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:377:1: ruleParallelFlow : ( ( rule__ParallelFlow__Group__0 ) ) ;
	public final void ruleParallelFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:381:2: ( ( ( rule__ParallelFlow__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:382:1: ( ( rule__ParallelFlow__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:382:1: ( ( rule__ParallelFlow__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:383:1: ( rule__ParallelFlow__Group__0 )
			{
			 before(grammarAccess.getParallelFlowAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:384:2: ( rule__ParallelFlow__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:384:2: rule__ParallelFlow__Group__0
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__0_in_ruleParallelFlow755);
			rule__ParallelFlow__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getParallelFlowAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleParallelFlow"



	// $ANTLR start "entryRuleStepAlternative"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:396:1: entryRuleStepAlternative : ruleStepAlternative EOF ;
	public final void entryRuleStepAlternative() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:397:1: ( ruleStepAlternative EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:398:1: ruleStepAlternative EOF
			{
			 before(grammarAccess.getStepAlternativeRule()); 
			pushFollow(FOLLOW_ruleStepAlternative_in_entryRuleStepAlternative782);
			ruleStepAlternative();
			state._fsp--;

			 after(grammarAccess.getStepAlternativeRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStepAlternative789); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleStepAlternative"



	// $ANTLR start "ruleStepAlternative"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:405:1: ruleStepAlternative : ( ( rule__StepAlternative__Alternatives ) ) ;
	public final void ruleStepAlternative() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:409:2: ( ( ( rule__StepAlternative__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:410:1: ( ( rule__StepAlternative__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:410:1: ( ( rule__StepAlternative__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:411:1: ( rule__StepAlternative__Alternatives )
			{
			 before(grammarAccess.getStepAlternativeAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:412:2: ( rule__StepAlternative__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:412:2: rule__StepAlternative__Alternatives
			{
			pushFollow(FOLLOW_rule__StepAlternative__Alternatives_in_ruleStepAlternative815);
			rule__StepAlternative__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getStepAlternativeAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleStepAlternative"



	// $ANTLR start "entryRuleCondition"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:424:1: entryRuleCondition : ruleCondition EOF ;
	public final void entryRuleCondition() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:425:1: ( ruleCondition EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:426:1: ruleCondition EOF
			{
			 before(grammarAccess.getConditionRule()); 
			pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition842);
			ruleCondition();
			state._fsp--;

			 after(grammarAccess.getConditionRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleCondition849); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleCondition"



	// $ANTLR start "ruleCondition"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:433:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
	public final void ruleCondition() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:437:2: ( ( ( rule__Condition__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:438:1: ( ( rule__Condition__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:438:1: ( ( rule__Condition__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:439:1: ( rule__Condition__Group__0 )
			{
			 before(grammarAccess.getConditionAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:440:2: ( rule__Condition__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:440:2: rule__Condition__Group__0
			{
			pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition875);
			rule__Condition__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getConditionAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleCondition"



	// $ANTLR start "entryRuleLocalAlternative"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:452:1: entryRuleLocalAlternative : ruleLocalAlternative EOF ;
	public final void entryRuleLocalAlternative() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:453:1: ( ruleLocalAlternative EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:454:1: ruleLocalAlternative EOF
			{
			 before(grammarAccess.getLocalAlternativeRule()); 
			pushFollow(FOLLOW_ruleLocalAlternative_in_entryRuleLocalAlternative902);
			ruleLocalAlternative();
			state._fsp--;

			 after(grammarAccess.getLocalAlternativeRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAlternative909); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleLocalAlternative"



	// $ANTLR start "ruleLocalAlternative"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:461:1: ruleLocalAlternative : ( ( rule__LocalAlternative__Group__0 ) ) ;
	public final void ruleLocalAlternative() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:465:2: ( ( ( rule__LocalAlternative__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:466:1: ( ( rule__LocalAlternative__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:466:1: ( ( rule__LocalAlternative__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:467:1: ( rule__LocalAlternative__Group__0 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:468:2: ( rule__LocalAlternative__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:468:2: rule__LocalAlternative__Group__0
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__0_in_ruleLocalAlternative935);
			rule__LocalAlternative__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getLocalAlternativeAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleLocalAlternative"



	// $ANTLR start "entryRuleAlternativeFlowAlternative"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:480:1: entryRuleAlternativeFlowAlternative : ruleAlternativeFlowAlternative EOF ;
	public final void entryRuleAlternativeFlowAlternative() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:481:1: ( ruleAlternativeFlowAlternative EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:482:1: ruleAlternativeFlowAlternative EOF
			{
			 before(grammarAccess.getAlternativeFlowAlternativeRule()); 
			pushFollow(FOLLOW_ruleAlternativeFlowAlternative_in_entryRuleAlternativeFlowAlternative962);
			ruleAlternativeFlowAlternative();
			state._fsp--;

			 after(grammarAccess.getAlternativeFlowAlternativeRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlowAlternative969); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleAlternativeFlowAlternative"



	// $ANTLR start "ruleAlternativeFlowAlternative"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:489:1: ruleAlternativeFlowAlternative : ( ( rule__AlternativeFlowAlternative__Group__0 ) ) ;
	public final void ruleAlternativeFlowAlternative() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:493:2: ( ( ( rule__AlternativeFlowAlternative__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:494:1: ( ( rule__AlternativeFlowAlternative__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:494:1: ( ( rule__AlternativeFlowAlternative__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:495:1: ( rule__AlternativeFlowAlternative__Group__0 )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:496:2: ( rule__AlternativeFlowAlternative__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:496:2: rule__AlternativeFlowAlternative__Group__0
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__0_in_ruleAlternativeFlowAlternative995);
			rule__AlternativeFlowAlternative__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleAlternativeFlowAlternative"



	// $ANTLR start "entryRuleParallelStep"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:508:1: entryRuleParallelStep : ruleParallelStep EOF ;
	public final void entryRuleParallelStep() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:509:1: ( ruleParallelStep EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:510:1: ruleParallelStep EOF
			{
			 before(grammarAccess.getParallelStepRule()); 
			pushFollow(FOLLOW_ruleParallelStep_in_entryRuleParallelStep1022);
			ruleParallelStep();
			state._fsp--;

			 after(grammarAccess.getParallelStepRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParallelStep1029); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleParallelStep"



	// $ANTLR start "ruleParallelStep"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:517:1: ruleParallelStep : ( ( rule__ParallelStep__Group__0 ) ) ;
	public final void ruleParallelStep() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:521:2: ( ( ( rule__ParallelStep__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:522:1: ( ( rule__ParallelStep__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:522:1: ( ( rule__ParallelStep__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:523:1: ( rule__ParallelStep__Group__0 )
			{
			 before(grammarAccess.getParallelStepAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:524:2: ( rule__ParallelStep__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:524:2: rule__ParallelStep__Group__0
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__0_in_ruleParallelStep1055);
			rule__ParallelStep__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getParallelStepAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleParallelStep"



	// $ANTLR start "entryRuleNormalStep"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:536:1: entryRuleNormalStep : ruleNormalStep EOF ;
	public final void entryRuleNormalStep() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:537:1: ( ruleNormalStep EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:538:1: ruleNormalStep EOF
			{
			 before(grammarAccess.getNormalStepRule()); 
			pushFollow(FOLLOW_ruleNormalStep_in_entryRuleNormalStep1082);
			ruleNormalStep();
			state._fsp--;

			 after(grammarAccess.getNormalStepRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleNormalStep1089); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleNormalStep"



	// $ANTLR start "ruleNormalStep"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:545:1: ruleNormalStep : ( ( rule__NormalStep__Group__0 ) ) ;
	public final void ruleNormalStep() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:549:2: ( ( ( rule__NormalStep__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:550:1: ( ( rule__NormalStep__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:550:1: ( ( rule__NormalStep__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:551:1: ( rule__NormalStep__Group__0 )
			{
			 before(grammarAccess.getNormalStepAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:552:2: ( rule__NormalStep__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:552:2: rule__NormalStep__Group__0
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__0_in_ruleNormalStep1115);
			rule__NormalStep__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getNormalStepAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleNormalStep"



	// $ANTLR start "entryRuleQualifiedName"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:564:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
	public final void entryRuleQualifiedName() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:565:1: ( ruleQualifiedName EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:566:1: ruleQualifiedName EOF
			{
			 before(grammarAccess.getQualifiedNameRule()); 
			pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1142);
			ruleQualifiedName();
			state._fsp--;

			 after(grammarAccess.getQualifiedNameRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1149); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleQualifiedName"



	// $ANTLR start "ruleQualifiedName"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:573:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
	public final void ruleQualifiedName() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:577:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:578:1: ( ( rule__QualifiedName__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:578:1: ( ( rule__QualifiedName__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:579:1: ( rule__QualifiedName__Group__0 )
			{
			 before(grammarAccess.getQualifiedNameAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:580:2: ( rule__QualifiedName__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:580:2: rule__QualifiedName__Group__0
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1175);
			rule__QualifiedName__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getQualifiedNameAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleQualifiedName"



	// $ANTLR start "ruleActorType"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:593:1: ruleActorType : ( ( rule__ActorType__Alternatives ) ) ;
	public final void ruleActorType() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:597:1: ( ( ( rule__ActorType__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:598:1: ( ( rule__ActorType__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:598:1: ( ( rule__ActorType__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:599:1: ( rule__ActorType__Alternatives )
			{
			 before(grammarAccess.getActorTypeAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:600:2: ( rule__ActorType__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:600:2: rule__ActorType__Alternatives
			{
			pushFollow(FOLLOW_rule__ActorType__Alternatives_in_ruleActorType1212);
			rule__ActorType__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getActorTypeAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleActorType"



	// $ANTLR start "ruleStepType"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:612:1: ruleStepType : ( ( rule__StepType__Alternatives ) ) ;
	public final void ruleStepType() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:616:1: ( ( ( rule__StepType__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:617:1: ( ( rule__StepType__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:617:1: ( ( rule__StepType__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:618:1: ( rule__StepType__Alternatives )
			{
			 before(grammarAccess.getStepTypeAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:619:2: ( rule__StepType__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:619:2: rule__StepType__Alternatives
			{
			pushFollow(FOLLOW_rule__StepType__Alternatives_in_ruleStepType1248);
			rule__StepType__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getStepTypeAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleStepType"



	// $ANTLR start "rule__Step__Alternatives"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:630:1: rule__Step__Alternatives : ( ( ruleNormalStep ) | ( ruleParallelStep ) );
	public final void rule__Step__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:634:1: ( ( ruleNormalStep ) | ( ruleParallelStep ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==40) ) {
				alt2=1;
			}
			else if ( (LA2_0==34) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:635:1: ( ruleNormalStep )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:635:1: ( ruleNormalStep )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:636:1: ruleNormalStep
					{
					 before(grammarAccess.getStepAccess().getNormalStepParserRuleCall_0()); 
					pushFollow(FOLLOW_ruleNormalStep_in_rule__Step__Alternatives1283);
					ruleNormalStep();
					state._fsp--;

					 after(grammarAccess.getStepAccess().getNormalStepParserRuleCall_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:641:6: ( ruleParallelStep )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:641:6: ( ruleParallelStep )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:642:1: ruleParallelStep
					{
					 before(grammarAccess.getStepAccess().getParallelStepParserRuleCall_1()); 
					pushFollow(FOLLOW_ruleParallelStep_in_rule__Step__Alternatives1300);
					ruleParallelStep();
					state._fsp--;

					 after(grammarAccess.getStepAccess().getParallelStepParserRuleCall_1()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Step__Alternatives"



	// $ANTLR start "rule__Flow__Alternatives"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:652:1: rule__Flow__Alternatives : ( ( ruleBasicFlow ) | ( ruleNamedFlow ) );
	public final void rule__Flow__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:656:1: ( ( ruleBasicFlow ) | ( ruleNamedFlow ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==18) ) {
				alt3=1;
			}
			else if ( (LA3_0==15||LA3_0==26||LA3_0==33) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:657:1: ( ruleBasicFlow )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:657:1: ( ruleBasicFlow )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:658:1: ruleBasicFlow
					{
					 before(grammarAccess.getFlowAccess().getBasicFlowParserRuleCall_0()); 
					pushFollow(FOLLOW_ruleBasicFlow_in_rule__Flow__Alternatives1332);
					ruleBasicFlow();
					state._fsp--;

					 after(grammarAccess.getFlowAccess().getBasicFlowParserRuleCall_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:663:6: ( ruleNamedFlow )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:663:6: ( ruleNamedFlow )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:664:1: ruleNamedFlow
					{
					 before(grammarAccess.getFlowAccess().getNamedFlowParserRuleCall_1()); 
					pushFollow(FOLLOW_ruleNamedFlow_in_rule__Flow__Alternatives1349);
					ruleNamedFlow();
					state._fsp--;

					 after(grammarAccess.getFlowAccess().getNamedFlowParserRuleCall_1()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Flow__Alternatives"



	// $ANTLR start "rule__NamedFlow__Alternatives"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:674:1: rule__NamedFlow__Alternatives : ( ( ruleExceptionFlow ) | ( ruleAlternativeFlow ) | ( ruleParallelFlow ) );
	public final void rule__NamedFlow__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:678:1: ( ( ruleExceptionFlow ) | ( ruleAlternativeFlow ) | ( ruleParallelFlow ) )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 26:
				{
				alt4=1;
				}
				break;
			case 15:
				{
				alt4=2;
				}
				break;
			case 33:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:679:1: ( ruleExceptionFlow )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:679:1: ( ruleExceptionFlow )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:680:1: ruleExceptionFlow
					{
					 before(grammarAccess.getNamedFlowAccess().getExceptionFlowParserRuleCall_0()); 
					pushFollow(FOLLOW_ruleExceptionFlow_in_rule__NamedFlow__Alternatives1381);
					ruleExceptionFlow();
					state._fsp--;

					 after(grammarAccess.getNamedFlowAccess().getExceptionFlowParserRuleCall_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:685:6: ( ruleAlternativeFlow )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:685:6: ( ruleAlternativeFlow )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:686:1: ruleAlternativeFlow
					{
					 before(grammarAccess.getNamedFlowAccess().getAlternativeFlowParserRuleCall_1()); 
					pushFollow(FOLLOW_ruleAlternativeFlow_in_rule__NamedFlow__Alternatives1398);
					ruleAlternativeFlow();
					state._fsp--;

					 after(grammarAccess.getNamedFlowAccess().getAlternativeFlowParserRuleCall_1()); 
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:691:6: ( ruleParallelFlow )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:691:6: ( ruleParallelFlow )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:692:1: ruleParallelFlow
					{
					 before(grammarAccess.getNamedFlowAccess().getParallelFlowParserRuleCall_2()); 
					pushFollow(FOLLOW_ruleParallelFlow_in_rule__NamedFlow__Alternatives1415);
					ruleParallelFlow();
					state._fsp--;

					 after(grammarAccess.getNamedFlowAccess().getParallelFlowParserRuleCall_2()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NamedFlow__Alternatives"



	// $ANTLR start "rule__StepAlternative__Alternatives"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:702:1: rule__StepAlternative__Alternatives : ( ( ruleCondition ) | ( ruleLocalAlternative ) | ( ruleAlternativeFlowAlternative ) );
	public final void rule__StepAlternative__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:706:1: ( ( ruleCondition ) | ( ruleLocalAlternative ) | ( ruleAlternativeFlowAlternative ) )
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==28) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==RULE_STRING) ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2==42) ) {
						switch ( input.LA(4) ) {
						case EOF:
						case 21:
						case 22:
						case 28:
							{
							alt5=1;
							}
							break;
						case RULE_STRING:
						case 29:
							{
							alt5=2;
							}
							break;
						case 15:
							{
							alt5=3;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 3, input);
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
								new NoViableAltException("", 5, 2, input);
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
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:707:1: ( ruleCondition )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:707:1: ( ruleCondition )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:708:1: ruleCondition
					{
					 before(grammarAccess.getStepAlternativeAccess().getConditionParserRuleCall_0()); 
					pushFollow(FOLLOW_ruleCondition_in_rule__StepAlternative__Alternatives1447);
					ruleCondition();
					state._fsp--;

					 after(grammarAccess.getStepAlternativeAccess().getConditionParserRuleCall_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:713:6: ( ruleLocalAlternative )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:713:6: ( ruleLocalAlternative )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:714:1: ruleLocalAlternative
					{
					 before(grammarAccess.getStepAlternativeAccess().getLocalAlternativeParserRuleCall_1()); 
					pushFollow(FOLLOW_ruleLocalAlternative_in_rule__StepAlternative__Alternatives1464);
					ruleLocalAlternative();
					state._fsp--;

					 after(grammarAccess.getStepAlternativeAccess().getLocalAlternativeParserRuleCall_1()); 
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:719:6: ( ruleAlternativeFlowAlternative )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:719:6: ( ruleAlternativeFlowAlternative )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:720:1: ruleAlternativeFlowAlternative
					{
					 before(grammarAccess.getStepAlternativeAccess().getAlternativeFlowAlternativeParserRuleCall_2()); 
					pushFollow(FOLLOW_ruleAlternativeFlowAlternative_in_rule__StepAlternative__Alternatives1481);
					ruleAlternativeFlowAlternative();
					state._fsp--;

					 after(grammarAccess.getStepAlternativeAccess().getAlternativeFlowAlternativeParserRuleCall_2()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__StepAlternative__Alternatives"



	// $ANTLR start "rule__LocalAlternative__Alternatives_3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:730:1: rule__LocalAlternative__Alternatives_3 : ( ( ( rule__LocalAlternative__DescriptionAssignment_3_0 ) ) | ( ( rule__LocalAlternative__Group_3_1__0 ) ) );
	public final void rule__LocalAlternative__Alternatives_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:734:1: ( ( ( rule__LocalAlternative__DescriptionAssignment_3_0 ) ) | ( ( rule__LocalAlternative__Group_3_1__0 ) ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==RULE_STRING) ) {
				alt6=1;
			}
			else if ( (LA6_0==29) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:735:1: ( ( rule__LocalAlternative__DescriptionAssignment_3_0 ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:735:1: ( ( rule__LocalAlternative__DescriptionAssignment_3_0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:736:1: ( rule__LocalAlternative__DescriptionAssignment_3_0 )
					{
					 before(grammarAccess.getLocalAlternativeAccess().getDescriptionAssignment_3_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:737:2: ( rule__LocalAlternative__DescriptionAssignment_3_0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:737:2: rule__LocalAlternative__DescriptionAssignment_3_0
					{
					pushFollow(FOLLOW_rule__LocalAlternative__DescriptionAssignment_3_0_in_rule__LocalAlternative__Alternatives_31513);
					rule__LocalAlternative__DescriptionAssignment_3_0();
					state._fsp--;

					}

					 after(grammarAccess.getLocalAlternativeAccess().getDescriptionAssignment_3_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:741:6: ( ( rule__LocalAlternative__Group_3_1__0 ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:741:6: ( ( rule__LocalAlternative__Group_3_1__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:742:1: ( rule__LocalAlternative__Group_3_1__0 )
					{
					 before(grammarAccess.getLocalAlternativeAccess().getGroup_3_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:743:2: ( rule__LocalAlternative__Group_3_1__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:743:2: rule__LocalAlternative__Group_3_1__0
					{
					pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__0_in_rule__LocalAlternative__Alternatives_31531);
					rule__LocalAlternative__Group_3_1__0();
					state._fsp--;

					}

					 after(grammarAccess.getLocalAlternativeAccess().getGroup_3_1()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Alternatives_3"



	// $ANTLR start "rule__NormalStep__Alternatives_6"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:752:1: rule__NormalStep__Alternatives_6 : ( ( ( rule__NormalStep__Group_6_0__0 ) ) | ( ( rule__NormalStep__Group_6_1__0 ) ) );
	public final void rule__NormalStep__Alternatives_6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:756:1: ( ( ( rule__NormalStep__Group_6_0__0 ) ) | ( ( rule__NormalStep__Group_6_1__0 ) ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==16) ) {
				alt7=1;
			}
			else if ( (LA7_0==29) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:757:1: ( ( rule__NormalStep__Group_6_0__0 ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:757:1: ( ( rule__NormalStep__Group_6_0__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:758:1: ( rule__NormalStep__Group_6_0__0 )
					{
					 before(grammarAccess.getNormalStepAccess().getGroup_6_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:759:2: ( rule__NormalStep__Group_6_0__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:759:2: rule__NormalStep__Group_6_0__0
					{
					pushFollow(FOLLOW_rule__NormalStep__Group_6_0__0_in_rule__NormalStep__Alternatives_61564);
					rule__NormalStep__Group_6_0__0();
					state._fsp--;

					}

					 after(grammarAccess.getNormalStepAccess().getGroup_6_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:763:6: ( ( rule__NormalStep__Group_6_1__0 ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:763:6: ( ( rule__NormalStep__Group_6_1__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:764:1: ( rule__NormalStep__Group_6_1__0 )
					{
					 before(grammarAccess.getNormalStepAccess().getGroup_6_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:765:2: ( rule__NormalStep__Group_6_1__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:765:2: rule__NormalStep__Group_6_1__0
					{
					pushFollow(FOLLOW_rule__NormalStep__Group_6_1__0_in_rule__NormalStep__Alternatives_61582);
					rule__NormalStep__Group_6_1__0();
					state._fsp--;

					}

					 after(grammarAccess.getNormalStepAccess().getGroup_6_1()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Alternatives_6"



	// $ANTLR start "rule__ActorType__Alternatives"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:774:1: rule__ActorType__Alternatives : ( ( ( 'person' ) ) | ( ( 'system' ) ) | ( ( 'organization' ) ) );
	public final void rule__ActorType__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:778:1: ( ( ( 'person' ) ) | ( ( 'system' ) ) | ( ( 'organization' ) ) )
			int alt8=3;
			switch ( input.LA(1) ) {
			case 36:
				{
				alt8=1;
				}
				break;
			case 41:
				{
				alt8=2;
				}
				break;
			case 31:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:779:1: ( ( 'person' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:779:1: ( ( 'person' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:780:1: ( 'person' )
					{
					 before(grammarAccess.getActorTypeAccess().getPERSONEnumLiteralDeclaration_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:781:3: ( 'person' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:781:3: 'person'
					{
					match(input,36,FOLLOW_36_in_rule__ActorType__Alternatives1616); 
					}

					 after(grammarAccess.getActorTypeAccess().getPERSONEnumLiteralDeclaration_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:786:6: ( ( 'system' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:786:6: ( ( 'system' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:787:1: ( 'system' )
					{
					 before(grammarAccess.getActorTypeAccess().getSYSTEMEnumLiteralDeclaration_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:788:3: ( 'system' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:788:3: 'system'
					{
					match(input,41,FOLLOW_41_in_rule__ActorType__Alternatives1637); 
					}

					 after(grammarAccess.getActorTypeAccess().getSYSTEMEnumLiteralDeclaration_1()); 
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:793:6: ( ( 'organization' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:793:6: ( ( 'organization' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:794:1: ( 'organization' )
					{
					 before(grammarAccess.getActorTypeAccess().getORGANIZATIONEnumLiteralDeclaration_2()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:795:3: ( 'organization' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:795:3: 'organization'
					{
					match(input,31,FOLLOW_31_in_rule__ActorType__Alternatives1658); 
					}

					 after(grammarAccess.getActorTypeAccess().getORGANIZATIONEnumLiteralDeclaration_2()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ActorType__Alternatives"



	// $ANTLR start "rule__StepType__Alternatives"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:805:1: rule__StepType__Alternatives : ( ( ( 'wait' ) ) | ( ( 'send' ) ) | ( ( 'perform' ) ) | ( ( 'call' ) ) | ( ( 'alt' ) ) );
	public final void rule__StepType__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:809:1: ( ( ( 'wait' ) ) | ( ( 'send' ) ) | ( ( 'perform' ) ) | ( ( 'call' ) ) | ( ( 'alt' ) ) )
			int alt9=5;
			switch ( input.LA(1) ) {
			case 44:
				{
				alt9=1;
				}
				break;
			case 39:
				{
				alt9=2;
				}
				break;
			case 35:
				{
				alt9=3;
				}
				break;
			case 20:
				{
				alt9=4;
				}
				break;
			case 14:
				{
				alt9=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:810:1: ( ( 'wait' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:810:1: ( ( 'wait' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:811:1: ( 'wait' )
					{
					 before(grammarAccess.getStepTypeAccess().getWAITEnumLiteralDeclaration_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:812:3: ( 'wait' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:812:3: 'wait'
					{
					match(input,44,FOLLOW_44_in_rule__StepType__Alternatives1694); 
					}

					 after(grammarAccess.getStepTypeAccess().getWAITEnumLiteralDeclaration_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:817:6: ( ( 'send' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:817:6: ( ( 'send' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:818:1: ( 'send' )
					{
					 before(grammarAccess.getStepTypeAccess().getSENDEnumLiteralDeclaration_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:819:3: ( 'send' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:819:3: 'send'
					{
					match(input,39,FOLLOW_39_in_rule__StepType__Alternatives1715); 
					}

					 after(grammarAccess.getStepTypeAccess().getSENDEnumLiteralDeclaration_1()); 
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:824:6: ( ( 'perform' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:824:6: ( ( 'perform' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:825:1: ( 'perform' )
					{
					 before(grammarAccess.getStepTypeAccess().getPERFORMEnumLiteralDeclaration_2()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:826:3: ( 'perform' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:826:3: 'perform'
					{
					match(input,35,FOLLOW_35_in_rule__StepType__Alternatives1736); 
					}

					 after(grammarAccess.getStepTypeAccess().getPERFORMEnumLiteralDeclaration_2()); 
					}

					}
					break;
				case 4 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:831:6: ( ( 'call' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:831:6: ( ( 'call' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:832:1: ( 'call' )
					{
					 before(grammarAccess.getStepTypeAccess().getCALLEnumLiteralDeclaration_3()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:833:3: ( 'call' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:833:3: 'call'
					{
					match(input,20,FOLLOW_20_in_rule__StepType__Alternatives1757); 
					}

					 after(grammarAccess.getStepTypeAccess().getCALLEnumLiteralDeclaration_3()); 
					}

					}
					break;
				case 5 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:838:6: ( ( 'alt' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:838:6: ( ( 'alt' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:839:1: ( 'alt' )
					{
					 before(grammarAccess.getStepTypeAccess().getALTEnumLiteralDeclaration_4()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:840:3: ( 'alt' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:840:3: 'alt'
					{
					match(input,14,FOLLOW_14_in_rule__StepType__Alternatives1778); 
					}

					 after(grammarAccess.getStepTypeAccess().getALTEnumLiteralDeclaration_4()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__StepType__Alternatives"



	// $ANTLR start "rule__PackageDeclaration__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:852:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
	public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:856:2: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:857:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01811);
			rule__PackageDeclaration__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01814);
			rule__PackageDeclaration__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__0"



	// $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:864:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
	public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:868:1: ( ( 'package' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:869:1: ( 'package' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:869:1: ( 'package' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:870:1: 'package'
			{
			 before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
			match(input,32,FOLLOW_32_in_rule__PackageDeclaration__Group__0__Impl1842); 
			 after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__0__Impl"



	// $ANTLR start "rule__PackageDeclaration__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:883:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
	public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:887:2: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:888:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11873);
			rule__PackageDeclaration__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11876);
			rule__PackageDeclaration__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__1"



	// $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:895:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
	public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:899:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:900:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:900:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:901:1: ( rule__PackageDeclaration__NameAssignment_1 )
			{
			 before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:902:2: ( rule__PackageDeclaration__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:902:2: rule__PackageDeclaration__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1903);
			rule__PackageDeclaration__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__1__Impl"



	// $ANTLR start "rule__PackageDeclaration__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:912:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
	public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:916:2: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:917:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21933);
			rule__PackageDeclaration__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21936);
			rule__PackageDeclaration__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__2"



	// $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:924:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? ) ;
	public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:928:1: ( ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:929:1: ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:929:1: ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:930:1: ( rule__PackageDeclaration__DescriptionAssignment_2 )?
			{
			 before(grammarAccess.getPackageDeclarationAccess().getDescriptionAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:931:2: ( rule__PackageDeclaration__DescriptionAssignment_2 )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==RULE_STRING) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:931:2: rule__PackageDeclaration__DescriptionAssignment_2
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__DescriptionAssignment_2_in_rule__PackageDeclaration__Group__2__Impl1963);
					rule__PackageDeclaration__DescriptionAssignment_2();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getPackageDeclarationAccess().getDescriptionAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__2__Impl"



	// $ANTLR start "rule__PackageDeclaration__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:941:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
	public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:945:2: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:946:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31994);
			rule__PackageDeclaration__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31997);
			rule__PackageDeclaration__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__3"



	// $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:953:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__Group_3__0 )? ) ;
	public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:957:1: ( ( ( rule__PackageDeclaration__Group_3__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:958:1: ( ( rule__PackageDeclaration__Group_3__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:958:1: ( ( rule__PackageDeclaration__Group_3__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:959:1: ( rule__PackageDeclaration__Group_3__0 )?
			{
			 before(grammarAccess.getPackageDeclarationAccess().getGroup_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:960:2: ( rule__PackageDeclaration__Group_3__0 )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==13) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:960:2: rule__PackageDeclaration__Group_3__0
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2024);
					rule__PackageDeclaration__Group_3__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getPackageDeclarationAccess().getGroup_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__3__Impl"



	// $ANTLR start "rule__PackageDeclaration__Group__4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:970:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
	public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:974:2: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:975:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42055);
			rule__PackageDeclaration__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42058);
			rule__PackageDeclaration__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__4"



	// $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:982:1: rule__PackageDeclaration__Group__4__Impl : ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* ) ;
	public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:986:1: ( ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:987:1: ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:987:1: ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:988:1: ( rule__PackageDeclaration__UseCasesAssignment_4 )*
			{
			 before(grammarAccess.getPackageDeclarationAccess().getUseCasesAssignment_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:989:2: ( rule__PackageDeclaration__UseCasesAssignment_4 )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==43) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:989:2: rule__PackageDeclaration__UseCasesAssignment_4
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__UseCasesAssignment_4_in_rule__PackageDeclaration__Group__4__Impl2085);
					rule__PackageDeclaration__UseCasesAssignment_4();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			 after(grammarAccess.getPackageDeclarationAccess().getUseCasesAssignment_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__4__Impl"



	// $ANTLR start "rule__PackageDeclaration__Group__5"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:999:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl ;
	public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1003:2: ( rule__PackageDeclaration__Group__5__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1004:2: rule__PackageDeclaration__Group__5__Impl
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52116);
			rule__PackageDeclaration__Group__5__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__5"



	// $ANTLR start "rule__PackageDeclaration__Group__5__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1010:1: rule__PackageDeclaration__Group__5__Impl : ( 'end package' ) ;
	public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1014:1: ( ( 'end package' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1015:1: ( 'end package' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1015:1: ( 'end package' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1016:1: 'end package'
			{
			 before(grammarAccess.getPackageDeclarationAccess().getEndPackageKeyword_5()); 
			match(input,24,FOLLOW_24_in_rule__PackageDeclaration__Group__5__Impl2144); 
			 after(grammarAccess.getPackageDeclarationAccess().getEndPackageKeyword_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group__5__Impl"



	// $ANTLR start "rule__PackageDeclaration__Group_3__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1041:1: rule__PackageDeclaration__Group_3__0 : rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 ;
	public final void rule__PackageDeclaration__Group_3__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1045:2: ( rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1046:2: rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02187);
			rule__PackageDeclaration__Group_3__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02190);
			rule__PackageDeclaration__Group_3__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group_3__0"



	// $ANTLR start "rule__PackageDeclaration__Group_3__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1053:1: rule__PackageDeclaration__Group_3__0__Impl : ( 'actors' ) ;
	public final void rule__PackageDeclaration__Group_3__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1057:1: ( ( 'actors' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1058:1: ( 'actors' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1058:1: ( 'actors' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1059:1: 'actors'
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsKeyword_3_0()); 
			match(input,13,FOLLOW_13_in_rule__PackageDeclaration__Group_3__0__Impl2218); 
			 after(grammarAccess.getPackageDeclarationAccess().getActorsKeyword_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group_3__0__Impl"



	// $ANTLR start "rule__PackageDeclaration__Group_3__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1072:1: rule__PackageDeclaration__Group_3__1 : rule__PackageDeclaration__Group_3__1__Impl ;
	public final void rule__PackageDeclaration__Group_3__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1076:2: ( rule__PackageDeclaration__Group_3__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1077:2: rule__PackageDeclaration__Group_3__1__Impl
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__12249);
			rule__PackageDeclaration__Group_3__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group_3__1"



	// $ANTLR start "rule__PackageDeclaration__Group_3__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1083:1: rule__PackageDeclaration__Group_3__1__Impl : ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) ) ;
	public final void rule__PackageDeclaration__Group_3__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1087:1: ( ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1088:1: ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1088:1: ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1089:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1089:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1090:1: ( rule__PackageDeclaration__ActorsAssignment_3_1 )
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1091:2: ( rule__PackageDeclaration__ActorsAssignment_3_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1091:2: rule__PackageDeclaration__ActorsAssignment_3_1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2278);
			rule__PackageDeclaration__ActorsAssignment_3_1();
			state._fsp--;

			}

			 after(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
			}

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1094:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1095:1: ( rule__PackageDeclaration__ActorsAssignment_3_1 )*
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1096:2: ( rule__PackageDeclaration__ActorsAssignment_3_1 )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==RULE_ID) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1096:2: rule__PackageDeclaration__ActorsAssignment_3_1
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2290);
					rule__PackageDeclaration__ActorsAssignment_3_1();
					state._fsp--;

					}
					break;

				default :
					break loop13;
				}
			}

			 after(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__Group_3__1__Impl"



	// $ANTLR start "rule__UseCase__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1111:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
	public final void rule__UseCase__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1115:2: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1116:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__02327);
			rule__UseCase__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__02330);
			rule__UseCase__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__0"



	// $ANTLR start "rule__UseCase__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1123:1: rule__UseCase__Group__0__Impl : ( 'usecase' ) ;
	public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1127:1: ( ( 'usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1128:1: ( 'usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1128:1: ( 'usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1129:1: 'usecase'
			{
			 before(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 
			match(input,43,FOLLOW_43_in_rule__UseCase__Group__0__Impl2358); 
			 after(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__0__Impl"



	// $ANTLR start "rule__UseCase__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1142:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
	public final void rule__UseCase__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1146:2: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1147:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
			{
			pushFollow(FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__12389);
			rule__UseCase__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__2_in_rule__UseCase__Group__12392);
			rule__UseCase__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__1"



	// $ANTLR start "rule__UseCase__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1154:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
	public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1158:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1159:1: ( ( rule__UseCase__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1159:1: ( ( rule__UseCase__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1160:1: ( rule__UseCase__NameAssignment_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1161:2: ( rule__UseCase__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1161:2: rule__UseCase__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__UseCase__NameAssignment_1_in_rule__UseCase__Group__1__Impl2419);
			rule__UseCase__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__1__Impl"



	// $ANTLR start "rule__UseCase__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1171:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
	public final void rule__UseCase__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1175:2: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1176:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
			{
			pushFollow(FOLLOW_rule__UseCase__Group__2__Impl_in_rule__UseCase__Group__22449);
			rule__UseCase__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__3_in_rule__UseCase__Group__22452);
			rule__UseCase__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__2"



	// $ANTLR start "rule__UseCase__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1183:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionAssignment_2 )? ) ;
	public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1187:1: ( ( ( rule__UseCase__DescriptionAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1188:1: ( ( rule__UseCase__DescriptionAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1188:1: ( ( rule__UseCase__DescriptionAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1189:1: ( rule__UseCase__DescriptionAssignment_2 )?
			{
			 before(grammarAccess.getUseCaseAccess().getDescriptionAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1190:2: ( rule__UseCase__DescriptionAssignment_2 )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==RULE_STRING) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1190:2: rule__UseCase__DescriptionAssignment_2
					{
					pushFollow(FOLLOW_rule__UseCase__DescriptionAssignment_2_in_rule__UseCase__Group__2__Impl2479);
					rule__UseCase__DescriptionAssignment_2();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getUseCaseAccess().getDescriptionAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__2__Impl"



	// $ANTLR start "rule__UseCase__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1200:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
	public final void rule__UseCase__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1204:2: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1205:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
			{
			pushFollow(FOLLOW_rule__UseCase__Group__3__Impl_in_rule__UseCase__Group__32510);
			rule__UseCase__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__4_in_rule__UseCase__Group__32513);
			rule__UseCase__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__3"



	// $ANTLR start "rule__UseCase__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1212:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__Group_3__0 )? ) ;
	public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1216:1: ( ( ( rule__UseCase__Group_3__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1217:1: ( ( rule__UseCase__Group_3__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1217:1: ( ( rule__UseCase__Group_3__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1218:1: ( rule__UseCase__Group_3__0 )?
			{
			 before(grammarAccess.getUseCaseAccess().getGroup_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1219:2: ( rule__UseCase__Group_3__0 )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==27) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1219:2: rule__UseCase__Group_3__0
					{
					pushFollow(FOLLOW_rule__UseCase__Group_3__0_in_rule__UseCase__Group__3__Impl2540);
					rule__UseCase__Group_3__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getUseCaseAccess().getGroup_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__3__Impl"



	// $ANTLR start "rule__UseCase__Group__4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1229:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
	public final void rule__UseCase__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1233:2: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1234:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
			{
			pushFollow(FOLLOW_rule__UseCase__Group__4__Impl_in_rule__UseCase__Group__42571);
			rule__UseCase__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__5_in_rule__UseCase__Group__42574);
			rule__UseCase__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__4"



	// $ANTLR start "rule__UseCase__Group__4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1241:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__UnorderedGroup_4 ) ) ;
	public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1245:1: ( ( ( rule__UseCase__UnorderedGroup_4 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1246:1: ( ( rule__UseCase__UnorderedGroup_4 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1246:1: ( ( rule__UseCase__UnorderedGroup_4 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1247:1: ( rule__UseCase__UnorderedGroup_4 )
			{
			 before(grammarAccess.getUseCaseAccess().getUnorderedGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1248:2: ( rule__UseCase__UnorderedGroup_4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1248:2: rule__UseCase__UnorderedGroup_4
			{
			pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4_in_rule__UseCase__Group__4__Impl2601);
			rule__UseCase__UnorderedGroup_4();
			state._fsp--;

			}

			 after(grammarAccess.getUseCaseAccess().getUnorderedGroup_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__4__Impl"



	// $ANTLR start "rule__UseCase__Group__5"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1258:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
	public final void rule__UseCase__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1262:2: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1263:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
			{
			pushFollow(FOLLOW_rule__UseCase__Group__5__Impl_in_rule__UseCase__Group__52631);
			rule__UseCase__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__6_in_rule__UseCase__Group__52634);
			rule__UseCase__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__5"



	// $ANTLR start "rule__UseCase__Group__5__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1270:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__FlowsAssignment_5 )* ) ;
	public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1274:1: ( ( ( rule__UseCase__FlowsAssignment_5 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1275:1: ( ( rule__UseCase__FlowsAssignment_5 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1275:1: ( ( rule__UseCase__FlowsAssignment_5 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1276:1: ( rule__UseCase__FlowsAssignment_5 )*
			{
			 before(grammarAccess.getUseCaseAccess().getFlowsAssignment_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1277:2: ( rule__UseCase__FlowsAssignment_5 )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==15||LA16_0==18||LA16_0==26||LA16_0==33) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1277:2: rule__UseCase__FlowsAssignment_5
					{
					pushFollow(FOLLOW_rule__UseCase__FlowsAssignment_5_in_rule__UseCase__Group__5__Impl2661);
					rule__UseCase__FlowsAssignment_5();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			 after(grammarAccess.getUseCaseAccess().getFlowsAssignment_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__5__Impl"



	// $ANTLR start "rule__UseCase__Group__6"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1287:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl ;
	public final void rule__UseCase__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1291:2: ( rule__UseCase__Group__6__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1292:2: rule__UseCase__Group__6__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group__6__Impl_in_rule__UseCase__Group__62692);
			rule__UseCase__Group__6__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__6"



	// $ANTLR start "rule__UseCase__Group__6__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1298:1: rule__UseCase__Group__6__Impl : ( 'end usecase' ) ;
	public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1302:1: ( ( 'end usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1303:1: ( 'end usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1303:1: ( 'end usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1304:1: 'end usecase'
			{
			 before(grammarAccess.getUseCaseAccess().getEndUsecaseKeyword_6()); 
			match(input,25,FOLLOW_25_in_rule__UseCase__Group__6__Impl2720); 
			 after(grammarAccess.getUseCaseAccess().getEndUsecaseKeyword_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group__6__Impl"



	// $ANTLR start "rule__UseCase__Group_3__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1331:1: rule__UseCase__Group_3__0 : rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 ;
	public final void rule__UseCase__Group_3__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1335:2: ( rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1336:2: rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group_3__0__Impl_in_rule__UseCase__Group_3__02765);
			rule__UseCase__Group_3__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group_3__1_in_rule__UseCase__Group_3__02768);
			rule__UseCase__Group_3__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_3__0"



	// $ANTLR start "rule__UseCase__Group_3__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1343:1: rule__UseCase__Group_3__0__Impl : ( 'extends' ) ;
	public final void rule__UseCase__Group_3__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1347:1: ( ( 'extends' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1348:1: ( 'extends' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1348:1: ( 'extends' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1349:1: 'extends'
			{
			 before(grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0()); 
			match(input,27,FOLLOW_27_in_rule__UseCase__Group_3__0__Impl2796); 
			 after(grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_3__0__Impl"



	// $ANTLR start "rule__UseCase__Group_3__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1362:1: rule__UseCase__Group_3__1 : rule__UseCase__Group_3__1__Impl ;
	public final void rule__UseCase__Group_3__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1366:2: ( rule__UseCase__Group_3__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1367:2: rule__UseCase__Group_3__1__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group_3__1__Impl_in_rule__UseCase__Group_3__12827);
			rule__UseCase__Group_3__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_3__1"



	// $ANTLR start "rule__UseCase__Group_3__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1373:1: rule__UseCase__Group_3__1__Impl : ( ( rule__UseCase__SuperCaseAssignment_3_1 ) ) ;
	public final void rule__UseCase__Group_3__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1377:1: ( ( ( rule__UseCase__SuperCaseAssignment_3_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1378:1: ( ( rule__UseCase__SuperCaseAssignment_3_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1378:1: ( ( rule__UseCase__SuperCaseAssignment_3_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1379:1: ( rule__UseCase__SuperCaseAssignment_3_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getSuperCaseAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1380:2: ( rule__UseCase__SuperCaseAssignment_3_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1380:2: rule__UseCase__SuperCaseAssignment_3_1
			{
			pushFollow(FOLLOW_rule__UseCase__SuperCaseAssignment_3_1_in_rule__UseCase__Group_3__1__Impl2854);
			rule__UseCase__SuperCaseAssignment_3_1();
			state._fsp--;

			}

			 after(grammarAccess.getUseCaseAccess().getSuperCaseAssignment_3_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_3__1__Impl"



	// $ANTLR start "rule__UseCase__Group_4_0__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1394:1: rule__UseCase__Group_4_0__0 : rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1 ;
	public final void rule__UseCase__Group_4_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1398:2: ( rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1399:2: rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_0__0__Impl_in_rule__UseCase__Group_4_0__02888);
			rule__UseCase__Group_4_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group_4_0__1_in_rule__UseCase__Group_4_0__02891);
			rule__UseCase__Group_4_0__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_4_0__0"



	// $ANTLR start "rule__UseCase__Group_4_0__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1406:1: rule__UseCase__Group_4_0__0__Impl : ( 'preconditions' ) ;
	public final void rule__UseCase__Group_4_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1410:1: ( ( 'preconditions' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1411:1: ( 'preconditions' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1411:1: ( 'preconditions' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1412:1: 'preconditions'
			{
			 before(grammarAccess.getUseCaseAccess().getPreconditionsKeyword_4_0_0()); 
			match(input,38,FOLLOW_38_in_rule__UseCase__Group_4_0__0__Impl2919); 
			 after(grammarAccess.getUseCaseAccess().getPreconditionsKeyword_4_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_4_0__0__Impl"



	// $ANTLR start "rule__UseCase__Group_4_0__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1425:1: rule__UseCase__Group_4_0__1 : rule__UseCase__Group_4_0__1__Impl ;
	public final void rule__UseCase__Group_4_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1429:2: ( rule__UseCase__Group_4_0__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1430:2: rule__UseCase__Group_4_0__1__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_0__1__Impl_in_rule__UseCase__Group_4_0__12950);
			rule__UseCase__Group_4_0__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_4_0__1"



	// $ANTLR start "rule__UseCase__Group_4_0__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1436:1: rule__UseCase__Group_4_0__1__Impl : ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) ) ;
	public final void rule__UseCase__Group_4_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1440:1: ( ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1441:1: ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1441:1: ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1442:1: ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1442:1: ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1443:1: ( rule__UseCase__PreconditionsAssignment_4_0_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_4_0_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1444:2: ( rule__UseCase__PreconditionsAssignment_4_0_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1444:2: rule__UseCase__PreconditionsAssignment_4_0_1
			{
			pushFollow(FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl2979);
			rule__UseCase__PreconditionsAssignment_4_0_1();
			state._fsp--;

			}

			 after(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_4_0_1()); 
			}

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1447:1: ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1448:1: ( rule__UseCase__PreconditionsAssignment_4_0_1 )*
			{
			 before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_4_0_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1449:2: ( rule__UseCase__PreconditionsAssignment_4_0_1 )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==RULE_STRING) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1449:2: rule__UseCase__PreconditionsAssignment_4_0_1
					{
					pushFollow(FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl2991);
					rule__UseCase__PreconditionsAssignment_4_0_1();
					state._fsp--;

					}
					break;

				default :
					break loop17;
				}
			}

			 after(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_4_0_1()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_4_0__1__Impl"



	// $ANTLR start "rule__UseCase__Group_4_1__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1464:1: rule__UseCase__Group_4_1__0 : rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1 ;
	public final void rule__UseCase__Group_4_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1468:2: ( rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1469:2: rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_1__0__Impl_in_rule__UseCase__Group_4_1__03028);
			rule__UseCase__Group_4_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group_4_1__1_in_rule__UseCase__Group_4_1__03031);
			rule__UseCase__Group_4_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_4_1__0"



	// $ANTLR start "rule__UseCase__Group_4_1__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1476:1: rule__UseCase__Group_4_1__0__Impl : ( 'postcondition' ) ;
	public final void rule__UseCase__Group_4_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1480:1: ( ( 'postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1481:1: ( 'postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1481:1: ( 'postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1482:1: 'postcondition'
			{
			 before(grammarAccess.getUseCaseAccess().getPostconditionKeyword_4_1_0()); 
			match(input,37,FOLLOW_37_in_rule__UseCase__Group_4_1__0__Impl3059); 
			 after(grammarAccess.getUseCaseAccess().getPostconditionKeyword_4_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_4_1__0__Impl"



	// $ANTLR start "rule__UseCase__Group_4_1__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1495:1: rule__UseCase__Group_4_1__1 : rule__UseCase__Group_4_1__1__Impl ;
	public final void rule__UseCase__Group_4_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1499:2: ( rule__UseCase__Group_4_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1500:2: rule__UseCase__Group_4_1__1__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_1__1__Impl_in_rule__UseCase__Group_4_1__13090);
			rule__UseCase__Group_4_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_4_1__1"



	// $ANTLR start "rule__UseCase__Group_4_1__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1506:1: rule__UseCase__Group_4_1__1__Impl : ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) ) ;
	public final void rule__UseCase__Group_4_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1510:1: ( ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1511:1: ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1511:1: ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1512:1: ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1512:1: ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1513:1: ( rule__UseCase__PostconditionsAssignment_4_1_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getPostconditionsAssignment_4_1_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1514:2: ( rule__UseCase__PostconditionsAssignment_4_1_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1514:2: rule__UseCase__PostconditionsAssignment_4_1_1
			{
			pushFollow(FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3119);
			rule__UseCase__PostconditionsAssignment_4_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getUseCaseAccess().getPostconditionsAssignment_4_1_1()); 
			}

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1517:1: ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1518:1: ( rule__UseCase__PostconditionsAssignment_4_1_1 )*
			{
			 before(grammarAccess.getUseCaseAccess().getPostconditionsAssignment_4_1_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1519:2: ( rule__UseCase__PostconditionsAssignment_4_1_1 )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==RULE_STRING) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1519:2: rule__UseCase__PostconditionsAssignment_4_1_1
					{
					pushFollow(FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3131);
					rule__UseCase__PostconditionsAssignment_4_1_1();
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}

			 after(grammarAccess.getUseCaseAccess().getPostconditionsAssignment_4_1_1()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__Group_4_1__1__Impl"



	// $ANTLR start "rule__Actor__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1534:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
	public final void rule__Actor__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1538:2: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1539:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
			{
			pushFollow(FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03168);
			rule__Actor__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03171);
			rule__Actor__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group__0"



	// $ANTLR start "rule__Actor__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1546:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__NameAssignment_0 ) ) ;
	public final void rule__Actor__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1550:1: ( ( ( rule__Actor__NameAssignment_0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1551:1: ( ( rule__Actor__NameAssignment_0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1551:1: ( ( rule__Actor__NameAssignment_0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1552:1: ( rule__Actor__NameAssignment_0 )
			{
			 before(grammarAccess.getActorAccess().getNameAssignment_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1553:2: ( rule__Actor__NameAssignment_0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1553:2: rule__Actor__NameAssignment_0
			{
			pushFollow(FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3198);
			rule__Actor__NameAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getActorAccess().getNameAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group__0__Impl"



	// $ANTLR start "rule__Actor__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1563:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
	public final void rule__Actor__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1567:2: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1568:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
			{
			pushFollow(FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13228);
			rule__Actor__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13231);
			rule__Actor__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group__1"



	// $ANTLR start "rule__Actor__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1575:1: rule__Actor__Group__1__Impl : ( 'as' ) ;
	public final void rule__Actor__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1579:1: ( ( 'as' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1580:1: ( 'as' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1580:1: ( 'as' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1581:1: 'as'
			{
			 before(grammarAccess.getActorAccess().getAsKeyword_1()); 
			match(input,17,FOLLOW_17_in_rule__Actor__Group__1__Impl3259); 
			 after(grammarAccess.getActorAccess().getAsKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group__1__Impl"



	// $ANTLR start "rule__Actor__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1594:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
	public final void rule__Actor__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1598:2: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1599:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
			{
			pushFollow(FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23290);
			rule__Actor__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23293);
			rule__Actor__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group__2"



	// $ANTLR start "rule__Actor__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1606:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__TypeAssignment_2 ) ) ;
	public final void rule__Actor__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1610:1: ( ( ( rule__Actor__TypeAssignment_2 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1611:1: ( ( rule__Actor__TypeAssignment_2 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1611:1: ( ( rule__Actor__TypeAssignment_2 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1612:1: ( rule__Actor__TypeAssignment_2 )
			{
			 before(grammarAccess.getActorAccess().getTypeAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1613:2: ( rule__Actor__TypeAssignment_2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1613:2: rule__Actor__TypeAssignment_2
			{
			pushFollow(FOLLOW_rule__Actor__TypeAssignment_2_in_rule__Actor__Group__2__Impl3320);
			rule__Actor__TypeAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getActorAccess().getTypeAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group__2__Impl"



	// $ANTLR start "rule__Actor__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1623:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
	public final void rule__Actor__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1627:2: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1628:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
			{
			pushFollow(FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__33350);
			rule__Actor__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__4_in_rule__Actor__Group__33353);
			rule__Actor__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group__3"



	// $ANTLR start "rule__Actor__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1635:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__DescriptionAssignment_3 )? ) ;
	public final void rule__Actor__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1639:1: ( ( ( rule__Actor__DescriptionAssignment_3 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1640:1: ( ( rule__Actor__DescriptionAssignment_3 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1640:1: ( ( rule__Actor__DescriptionAssignment_3 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1641:1: ( rule__Actor__DescriptionAssignment_3 )?
			{
			 before(grammarAccess.getActorAccess().getDescriptionAssignment_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1642:2: ( rule__Actor__DescriptionAssignment_3 )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==RULE_STRING) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1642:2: rule__Actor__DescriptionAssignment_3
					{
					pushFollow(FOLLOW_rule__Actor__DescriptionAssignment_3_in_rule__Actor__Group__3__Impl3380);
					rule__Actor__DescriptionAssignment_3();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getActorAccess().getDescriptionAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group__3__Impl"



	// $ANTLR start "rule__Actor__Group__4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1652:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl ;
	public final void rule__Actor__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1656:2: ( rule__Actor__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1657:2: rule__Actor__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__Actor__Group__4__Impl_in_rule__Actor__Group__43411);
			rule__Actor__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group__4"



	// $ANTLR start "rule__Actor__Group__4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1663:1: rule__Actor__Group__4__Impl : ( ( rule__Actor__Group_4__0 )? ) ;
	public final void rule__Actor__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1667:1: ( ( ( rule__Actor__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1668:1: ( ( rule__Actor__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1668:1: ( ( rule__Actor__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1669:1: ( rule__Actor__Group_4__0 )?
			{
			 before(grammarAccess.getActorAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1670:2: ( rule__Actor__Group_4__0 )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==27) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1670:2: rule__Actor__Group_4__0
					{
					pushFollow(FOLLOW_rule__Actor__Group_4__0_in_rule__Actor__Group__4__Impl3438);
					rule__Actor__Group_4__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getActorAccess().getGroup_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group__4__Impl"



	// $ANTLR start "rule__Actor__Group_4__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1690:1: rule__Actor__Group_4__0 : rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1 ;
	public final void rule__Actor__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1694:2: ( rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1695:2: rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1
			{
			pushFollow(FOLLOW_rule__Actor__Group_4__0__Impl_in_rule__Actor__Group_4__03479);
			rule__Actor__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group_4__1_in_rule__Actor__Group_4__03482);
			rule__Actor__Group_4__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group_4__0"



	// $ANTLR start "rule__Actor__Group_4__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1702:1: rule__Actor__Group_4__0__Impl : ( 'extends' ) ;
	public final void rule__Actor__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1706:1: ( ( 'extends' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1707:1: ( 'extends' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1707:1: ( 'extends' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1708:1: 'extends'
			{
			 before(grammarAccess.getActorAccess().getExtendsKeyword_4_0()); 
			match(input,27,FOLLOW_27_in_rule__Actor__Group_4__0__Impl3510); 
			 after(grammarAccess.getActorAccess().getExtendsKeyword_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group_4__0__Impl"



	// $ANTLR start "rule__Actor__Group_4__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1721:1: rule__Actor__Group_4__1 : rule__Actor__Group_4__1__Impl ;
	public final void rule__Actor__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1725:2: ( rule__Actor__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1726:2: rule__Actor__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__Actor__Group_4__1__Impl_in_rule__Actor__Group_4__13541);
			rule__Actor__Group_4__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group_4__1"



	// $ANTLR start "rule__Actor__Group_4__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1732:1: rule__Actor__Group_4__1__Impl : ( ( rule__Actor__ExtendsAssignment_4_1 ) ) ;
	public final void rule__Actor__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1736:1: ( ( ( rule__Actor__ExtendsAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1737:1: ( ( rule__Actor__ExtendsAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1737:1: ( ( rule__Actor__ExtendsAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1738:1: ( rule__Actor__ExtendsAssignment_4_1 )
			{
			 before(grammarAccess.getActorAccess().getExtendsAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1739:2: ( rule__Actor__ExtendsAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1739:2: rule__Actor__ExtendsAssignment_4_1
			{
			pushFollow(FOLLOW_rule__Actor__ExtendsAssignment_4_1_in_rule__Actor__Group_4__1__Impl3568);
			rule__Actor__ExtendsAssignment_4_1();
			state._fsp--;

			}

			 after(grammarAccess.getActorAccess().getExtendsAssignment_4_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__Group_4__1__Impl"



	// $ANTLR start "rule__BasicFlow__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1753:1: rule__BasicFlow__Group__0 : rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1 ;
	public final void rule__BasicFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1757:2: ( rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1758:2: rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__0__Impl_in_rule__BasicFlow__Group__03602);
			rule__BasicFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__1_in_rule__BasicFlow__Group__03605);
			rule__BasicFlow__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group__0"



	// $ANTLR start "rule__BasicFlow__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1765:1: rule__BasicFlow__Group__0__Impl : ( 'basic flow' ) ;
	public final void rule__BasicFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1769:1: ( ( 'basic flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1770:1: ( 'basic flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1770:1: ( 'basic flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1771:1: 'basic flow'
			{
			 before(grammarAccess.getBasicFlowAccess().getBasicFlowKeyword_0()); 
			match(input,18,FOLLOW_18_in_rule__BasicFlow__Group__0__Impl3633); 
			 after(grammarAccess.getBasicFlowAccess().getBasicFlowKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group__0__Impl"



	// $ANTLR start "rule__BasicFlow__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1784:1: rule__BasicFlow__Group__1 : rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2 ;
	public final void rule__BasicFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1788:2: ( rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1789:2: rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__1__Impl_in_rule__BasicFlow__Group__13664);
			rule__BasicFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__2_in_rule__BasicFlow__Group__13667);
			rule__BasicFlow__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group__1"



	// $ANTLR start "rule__BasicFlow__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1796:1: rule__BasicFlow__Group__1__Impl : ( () ) ;
	public final void rule__BasicFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1800:1: ( ( () ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1801:1: ( () )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1801:1: ( () )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1802:1: ()
			{
			 before(grammarAccess.getBasicFlowAccess().getBasicFlowAction_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1803:1: ()
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1805:1: 
			{
			}

			 after(grammarAccess.getBasicFlowAccess().getBasicFlowAction_1()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group__1__Impl"



	// $ANTLR start "rule__BasicFlow__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1815:1: rule__BasicFlow__Group__2 : rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3 ;
	public final void rule__BasicFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1819:2: ( rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1820:2: rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__2__Impl_in_rule__BasicFlow__Group__23725);
			rule__BasicFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__3_in_rule__BasicFlow__Group__23728);
			rule__BasicFlow__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group__2"



	// $ANTLR start "rule__BasicFlow__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1827:1: rule__BasicFlow__Group__2__Impl : ( ( rule__BasicFlow__StepsAssignment_2 )* ) ;
	public final void rule__BasicFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1831:1: ( ( ( rule__BasicFlow__StepsAssignment_2 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1832:1: ( ( rule__BasicFlow__StepsAssignment_2 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1832:1: ( ( rule__BasicFlow__StepsAssignment_2 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1833:1: ( rule__BasicFlow__StepsAssignment_2 )*
			{
			 before(grammarAccess.getBasicFlowAccess().getStepsAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1834:2: ( rule__BasicFlow__StepsAssignment_2 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==34||LA21_0==40) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1834:2: rule__BasicFlow__StepsAssignment_2
					{
					pushFollow(FOLLOW_rule__BasicFlow__StepsAssignment_2_in_rule__BasicFlow__Group__2__Impl3755);
					rule__BasicFlow__StepsAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop21;
				}
			}

			 after(grammarAccess.getBasicFlowAccess().getStepsAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group__2__Impl"



	// $ANTLR start "rule__BasicFlow__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1844:1: rule__BasicFlow__Group__3 : rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4 ;
	public final void rule__BasicFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1848:2: ( rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1849:2: rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__3__Impl_in_rule__BasicFlow__Group__33786);
			rule__BasicFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__4_in_rule__BasicFlow__Group__33789);
			rule__BasicFlow__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group__3"



	// $ANTLR start "rule__BasicFlow__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1856:1: rule__BasicFlow__Group__3__Impl : ( 'end flow' ) ;
	public final void rule__BasicFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1860:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1861:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1861:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1862:1: 'end flow'
			{
			 before(grammarAccess.getBasicFlowAccess().getEndFlowKeyword_3()); 
			match(input,23,FOLLOW_23_in_rule__BasicFlow__Group__3__Impl3817); 
			 after(grammarAccess.getBasicFlowAccess().getEndFlowKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group__3__Impl"



	// $ANTLR start "rule__BasicFlow__Group__4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1875:1: rule__BasicFlow__Group__4 : rule__BasicFlow__Group__4__Impl ;
	public final void rule__BasicFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1879:2: ( rule__BasicFlow__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1880:2: rule__BasicFlow__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__4__Impl_in_rule__BasicFlow__Group__43848);
			rule__BasicFlow__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group__4"



	// $ANTLR start "rule__BasicFlow__Group__4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1886:1: rule__BasicFlow__Group__4__Impl : ( ( rule__BasicFlow__Group_4__0 )? ) ;
	public final void rule__BasicFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1890:1: ( ( ( rule__BasicFlow__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1891:1: ( ( rule__BasicFlow__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1891:1: ( ( rule__BasicFlow__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1892:1: ( rule__BasicFlow__Group_4__0 )?
			{
			 before(grammarAccess.getBasicFlowAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1893:2: ( rule__BasicFlow__Group_4__0 )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==45) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1893:2: rule__BasicFlow__Group_4__0
					{
					pushFollow(FOLLOW_rule__BasicFlow__Group_4__0_in_rule__BasicFlow__Group__4__Impl3875);
					rule__BasicFlow__Group_4__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getBasicFlowAccess().getGroup_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group__4__Impl"



	// $ANTLR start "rule__BasicFlow__Group_4__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1913:1: rule__BasicFlow__Group_4__0 : rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1 ;
	public final void rule__BasicFlow__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1917:2: ( rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1918:2: rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group_4__0__Impl_in_rule__BasicFlow__Group_4__03916);
			rule__BasicFlow__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group_4__1_in_rule__BasicFlow__Group_4__03919);
			rule__BasicFlow__Group_4__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group_4__0"



	// $ANTLR start "rule__BasicFlow__Group_4__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1925:1: rule__BasicFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
	public final void rule__BasicFlow__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1929:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1930:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1930:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1931:1: 'with postcondition'
			{
			 before(grammarAccess.getBasicFlowAccess().getWithPostconditionKeyword_4_0()); 
			match(input,45,FOLLOW_45_in_rule__BasicFlow__Group_4__0__Impl3947); 
			 after(grammarAccess.getBasicFlowAccess().getWithPostconditionKeyword_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group_4__0__Impl"



	// $ANTLR start "rule__BasicFlow__Group_4__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1944:1: rule__BasicFlow__Group_4__1 : rule__BasicFlow__Group_4__1__Impl ;
	public final void rule__BasicFlow__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1948:2: ( rule__BasicFlow__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1949:2: rule__BasicFlow__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group_4__1__Impl_in_rule__BasicFlow__Group_4__13978);
			rule__BasicFlow__Group_4__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group_4__1"



	// $ANTLR start "rule__BasicFlow__Group_4__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1955:1: rule__BasicFlow__Group_4__1__Impl : ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) ) ;
	public final void rule__BasicFlow__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1959:1: ( ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1960:1: ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1960:1: ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1961:1: ( rule__BasicFlow__FinalStateAssignment_4_1 )
			{
			 before(grammarAccess.getBasicFlowAccess().getFinalStateAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1962:2: ( rule__BasicFlow__FinalStateAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1962:2: rule__BasicFlow__FinalStateAssignment_4_1
			{
			pushFollow(FOLLOW_rule__BasicFlow__FinalStateAssignment_4_1_in_rule__BasicFlow__Group_4__1__Impl4005);
			rule__BasicFlow__FinalStateAssignment_4_1();
			state._fsp--;

			}

			 after(grammarAccess.getBasicFlowAccess().getFinalStateAssignment_4_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__Group_4__1__Impl"



	// $ANTLR start "rule__ExceptionFlow__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1976:1: rule__ExceptionFlow__Group__0 : rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1 ;
	public final void rule__ExceptionFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1980:2: ( rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1981:2: rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__0__Impl_in_rule__ExceptionFlow__Group__04039);
			rule__ExceptionFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__1_in_rule__ExceptionFlow__Group__04042);
			rule__ExceptionFlow__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__0"



	// $ANTLR start "rule__ExceptionFlow__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1988:1: rule__ExceptionFlow__Group__0__Impl : ( 'exception flow' ) ;
	public final void rule__ExceptionFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1992:1: ( ( 'exception flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1993:1: ( 'exception flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1993:1: ( 'exception flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1994:1: 'exception flow'
			{
			 before(grammarAccess.getExceptionFlowAccess().getExceptionFlowKeyword_0()); 
			match(input,26,FOLLOW_26_in_rule__ExceptionFlow__Group__0__Impl4070); 
			 after(grammarAccess.getExceptionFlowAccess().getExceptionFlowKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__0__Impl"



	// $ANTLR start "rule__ExceptionFlow__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2007:1: rule__ExceptionFlow__Group__1 : rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2 ;
	public final void rule__ExceptionFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2011:2: ( rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2012:2: rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__1__Impl_in_rule__ExceptionFlow__Group__14101);
			rule__ExceptionFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__2_in_rule__ExceptionFlow__Group__14104);
			rule__ExceptionFlow__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__1"



	// $ANTLR start "rule__ExceptionFlow__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2019:1: rule__ExceptionFlow__Group__1__Impl : ( ( rule__ExceptionFlow__NameAssignment_1 ) ) ;
	public final void rule__ExceptionFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2023:1: ( ( ( rule__ExceptionFlow__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2024:1: ( ( rule__ExceptionFlow__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2024:1: ( ( rule__ExceptionFlow__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2025:1: ( rule__ExceptionFlow__NameAssignment_1 )
			{
			 before(grammarAccess.getExceptionFlowAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2026:2: ( rule__ExceptionFlow__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2026:2: rule__ExceptionFlow__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__NameAssignment_1_in_rule__ExceptionFlow__Group__1__Impl4131);
			rule__ExceptionFlow__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getExceptionFlowAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__1__Impl"



	// $ANTLR start "rule__ExceptionFlow__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2036:1: rule__ExceptionFlow__Group__2 : rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3 ;
	public final void rule__ExceptionFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2040:2: ( rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2041:2: rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__2__Impl_in_rule__ExceptionFlow__Group__24161);
			rule__ExceptionFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__3_in_rule__ExceptionFlow__Group__24164);
			rule__ExceptionFlow__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__2"



	// $ANTLR start "rule__ExceptionFlow__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2048:1: rule__ExceptionFlow__Group__2__Impl : ( 'if' ) ;
	public final void rule__ExceptionFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2052:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2053:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2053:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2054:1: 'if'
			{
			 before(grammarAccess.getExceptionFlowAccess().getIfKeyword_2()); 
			match(input,28,FOLLOW_28_in_rule__ExceptionFlow__Group__2__Impl4192); 
			 after(grammarAccess.getExceptionFlowAccess().getIfKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__2__Impl"



	// $ANTLR start "rule__ExceptionFlow__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2067:1: rule__ExceptionFlow__Group__3 : rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4 ;
	public final void rule__ExceptionFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2071:2: ( rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2072:2: rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__3__Impl_in_rule__ExceptionFlow__Group__34223);
			rule__ExceptionFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__4_in_rule__ExceptionFlow__Group__34226);
			rule__ExceptionFlow__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__3"



	// $ANTLR start "rule__ExceptionFlow__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2079:1: rule__ExceptionFlow__Group__3__Impl : ( ( rule__ExceptionFlow__ConditionAssignment_3 ) ) ;
	public final void rule__ExceptionFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2083:1: ( ( ( rule__ExceptionFlow__ConditionAssignment_3 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2084:1: ( ( rule__ExceptionFlow__ConditionAssignment_3 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2084:1: ( ( rule__ExceptionFlow__ConditionAssignment_3 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2085:1: ( rule__ExceptionFlow__ConditionAssignment_3 )
			{
			 before(grammarAccess.getExceptionFlowAccess().getConditionAssignment_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2086:2: ( rule__ExceptionFlow__ConditionAssignment_3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2086:2: rule__ExceptionFlow__ConditionAssignment_3
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__ConditionAssignment_3_in_rule__ExceptionFlow__Group__3__Impl4253);
			rule__ExceptionFlow__ConditionAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getExceptionFlowAccess().getConditionAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__3__Impl"



	// $ANTLR start "rule__ExceptionFlow__Group__4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2096:1: rule__ExceptionFlow__Group__4 : rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5 ;
	public final void rule__ExceptionFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2100:2: ( rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2101:2: rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__4__Impl_in_rule__ExceptionFlow__Group__44283);
			rule__ExceptionFlow__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__5_in_rule__ExceptionFlow__Group__44286);
			rule__ExceptionFlow__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__4"



	// $ANTLR start "rule__ExceptionFlow__Group__4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2108:1: rule__ExceptionFlow__Group__4__Impl : ( 'then' ) ;
	public final void rule__ExceptionFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2112:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2113:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2113:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2114:1: 'then'
			{
			 before(grammarAccess.getExceptionFlowAccess().getThenKeyword_4()); 
			match(input,42,FOLLOW_42_in_rule__ExceptionFlow__Group__4__Impl4314); 
			 after(grammarAccess.getExceptionFlowAccess().getThenKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__4__Impl"



	// $ANTLR start "rule__ExceptionFlow__Group__5"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2127:1: rule__ExceptionFlow__Group__5 : rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6 ;
	public final void rule__ExceptionFlow__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2131:2: ( rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2132:2: rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__5__Impl_in_rule__ExceptionFlow__Group__54345);
			rule__ExceptionFlow__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__6_in_rule__ExceptionFlow__Group__54348);
			rule__ExceptionFlow__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__5"



	// $ANTLR start "rule__ExceptionFlow__Group__5__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2139:1: rule__ExceptionFlow__Group__5__Impl : ( ( rule__ExceptionFlow__StepsAssignment_5 )* ) ;
	public final void rule__ExceptionFlow__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2143:1: ( ( ( rule__ExceptionFlow__StepsAssignment_5 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2144:1: ( ( rule__ExceptionFlow__StepsAssignment_5 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2144:1: ( ( rule__ExceptionFlow__StepsAssignment_5 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2145:1: ( rule__ExceptionFlow__StepsAssignment_5 )*
			{
			 before(grammarAccess.getExceptionFlowAccess().getStepsAssignment_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2146:2: ( rule__ExceptionFlow__StepsAssignment_5 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==34||LA23_0==40) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2146:2: rule__ExceptionFlow__StepsAssignment_5
					{
					pushFollow(FOLLOW_rule__ExceptionFlow__StepsAssignment_5_in_rule__ExceptionFlow__Group__5__Impl4375);
					rule__ExceptionFlow__StepsAssignment_5();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			 after(grammarAccess.getExceptionFlowAccess().getStepsAssignment_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__5__Impl"



	// $ANTLR start "rule__ExceptionFlow__Group__6"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2156:1: rule__ExceptionFlow__Group__6 : rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7 ;
	public final void rule__ExceptionFlow__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2160:2: ( rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2161:2: rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__6__Impl_in_rule__ExceptionFlow__Group__64406);
			rule__ExceptionFlow__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__7_in_rule__ExceptionFlow__Group__64409);
			rule__ExceptionFlow__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__6"



	// $ANTLR start "rule__ExceptionFlow__Group__6__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2168:1: rule__ExceptionFlow__Group__6__Impl : ( 'end flow' ) ;
	public final void rule__ExceptionFlow__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2172:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2173:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2173:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2174:1: 'end flow'
			{
			 before(grammarAccess.getExceptionFlowAccess().getEndFlowKeyword_6()); 
			match(input,23,FOLLOW_23_in_rule__ExceptionFlow__Group__6__Impl4437); 
			 after(grammarAccess.getExceptionFlowAccess().getEndFlowKeyword_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__6__Impl"



	// $ANTLR start "rule__ExceptionFlow__Group__7"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2187:1: rule__ExceptionFlow__Group__7 : rule__ExceptionFlow__Group__7__Impl ;
	public final void rule__ExceptionFlow__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2191:2: ( rule__ExceptionFlow__Group__7__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2192:2: rule__ExceptionFlow__Group__7__Impl
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__7__Impl_in_rule__ExceptionFlow__Group__74468);
			rule__ExceptionFlow__Group__7__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__7"



	// $ANTLR start "rule__ExceptionFlow__Group__7__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2198:1: rule__ExceptionFlow__Group__7__Impl : ( ( rule__ExceptionFlow__Group_7__0 )? ) ;
	public final void rule__ExceptionFlow__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2202:1: ( ( ( rule__ExceptionFlow__Group_7__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2203:1: ( ( rule__ExceptionFlow__Group_7__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2203:1: ( ( rule__ExceptionFlow__Group_7__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2204:1: ( rule__ExceptionFlow__Group_7__0 )?
			{
			 before(grammarAccess.getExceptionFlowAccess().getGroup_7()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2205:2: ( rule__ExceptionFlow__Group_7__0 )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==45) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2205:2: rule__ExceptionFlow__Group_7__0
					{
					pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__0_in_rule__ExceptionFlow__Group__7__Impl4495);
					rule__ExceptionFlow__Group_7__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getExceptionFlowAccess().getGroup_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group__7__Impl"



	// $ANTLR start "rule__ExceptionFlow__Group_7__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2231:1: rule__ExceptionFlow__Group_7__0 : rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1 ;
	public final void rule__ExceptionFlow__Group_7__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2235:2: ( rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2236:2: rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__0__Impl_in_rule__ExceptionFlow__Group_7__04542);
			rule__ExceptionFlow__Group_7__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__1_in_rule__ExceptionFlow__Group_7__04545);
			rule__ExceptionFlow__Group_7__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group_7__0"



	// $ANTLR start "rule__ExceptionFlow__Group_7__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2243:1: rule__ExceptionFlow__Group_7__0__Impl : ( 'with postcondition' ) ;
	public final void rule__ExceptionFlow__Group_7__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2247:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2248:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2248:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2249:1: 'with postcondition'
			{
			 before(grammarAccess.getExceptionFlowAccess().getWithPostconditionKeyword_7_0()); 
			match(input,45,FOLLOW_45_in_rule__ExceptionFlow__Group_7__0__Impl4573); 
			 after(grammarAccess.getExceptionFlowAccess().getWithPostconditionKeyword_7_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group_7__0__Impl"



	// $ANTLR start "rule__ExceptionFlow__Group_7__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2262:1: rule__ExceptionFlow__Group_7__1 : rule__ExceptionFlow__Group_7__1__Impl ;
	public final void rule__ExceptionFlow__Group_7__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2266:2: ( rule__ExceptionFlow__Group_7__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2267:2: rule__ExceptionFlow__Group_7__1__Impl
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__1__Impl_in_rule__ExceptionFlow__Group_7__14604);
			rule__ExceptionFlow__Group_7__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group_7__1"



	// $ANTLR start "rule__ExceptionFlow__Group_7__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2273:1: rule__ExceptionFlow__Group_7__1__Impl : ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) ) ;
	public final void rule__ExceptionFlow__Group_7__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2277:1: ( ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2278:1: ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2278:1: ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2279:1: ( rule__ExceptionFlow__FinalStateAssignment_7_1 )
			{
			 before(grammarAccess.getExceptionFlowAccess().getFinalStateAssignment_7_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2280:2: ( rule__ExceptionFlow__FinalStateAssignment_7_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2280:2: rule__ExceptionFlow__FinalStateAssignment_7_1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__FinalStateAssignment_7_1_in_rule__ExceptionFlow__Group_7__1__Impl4631);
			rule__ExceptionFlow__FinalStateAssignment_7_1();
			state._fsp--;

			}

			 after(grammarAccess.getExceptionFlowAccess().getFinalStateAssignment_7_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__Group_7__1__Impl"



	// $ANTLR start "rule__AlternativeFlow__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2294:1: rule__AlternativeFlow__Group__0 : rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1 ;
	public final void rule__AlternativeFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2298:2: ( rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2299:2: rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__0__Impl_in_rule__AlternativeFlow__Group__04665);
			rule__AlternativeFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__1_in_rule__AlternativeFlow__Group__04668);
			rule__AlternativeFlow__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group__0"



	// $ANTLR start "rule__AlternativeFlow__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2306:1: rule__AlternativeFlow__Group__0__Impl : ( 'alternative flow' ) ;
	public final void rule__AlternativeFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2310:1: ( ( 'alternative flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2311:1: ( 'alternative flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2311:1: ( 'alternative flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2312:1: 'alternative flow'
			{
			 before(grammarAccess.getAlternativeFlowAccess().getAlternativeFlowKeyword_0()); 
			match(input,15,FOLLOW_15_in_rule__AlternativeFlow__Group__0__Impl4696); 
			 after(grammarAccess.getAlternativeFlowAccess().getAlternativeFlowKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group__0__Impl"



	// $ANTLR start "rule__AlternativeFlow__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2325:1: rule__AlternativeFlow__Group__1 : rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2 ;
	public final void rule__AlternativeFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2329:2: ( rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2330:2: rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__1__Impl_in_rule__AlternativeFlow__Group__14727);
			rule__AlternativeFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__2_in_rule__AlternativeFlow__Group__14730);
			rule__AlternativeFlow__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group__1"



	// $ANTLR start "rule__AlternativeFlow__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2337:1: rule__AlternativeFlow__Group__1__Impl : ( ( rule__AlternativeFlow__NameAssignment_1 ) ) ;
	public final void rule__AlternativeFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2341:1: ( ( ( rule__AlternativeFlow__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2342:1: ( ( rule__AlternativeFlow__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2342:1: ( ( rule__AlternativeFlow__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2343:1: ( rule__AlternativeFlow__NameAssignment_1 )
			{
			 before(grammarAccess.getAlternativeFlowAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2344:2: ( rule__AlternativeFlow__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2344:2: rule__AlternativeFlow__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__NameAssignment_1_in_rule__AlternativeFlow__Group__1__Impl4757);
			rule__AlternativeFlow__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getAlternativeFlowAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group__1__Impl"



	// $ANTLR start "rule__AlternativeFlow__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2354:1: rule__AlternativeFlow__Group__2 : rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3 ;
	public final void rule__AlternativeFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2358:2: ( rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2359:2: rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__2__Impl_in_rule__AlternativeFlow__Group__24787);
			rule__AlternativeFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__3_in_rule__AlternativeFlow__Group__24790);
			rule__AlternativeFlow__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group__2"



	// $ANTLR start "rule__AlternativeFlow__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2366:1: rule__AlternativeFlow__Group__2__Impl : ( ( rule__AlternativeFlow__StepsAssignment_2 )* ) ;
	public final void rule__AlternativeFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2370:1: ( ( ( rule__AlternativeFlow__StepsAssignment_2 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2371:1: ( ( rule__AlternativeFlow__StepsAssignment_2 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2371:1: ( ( rule__AlternativeFlow__StepsAssignment_2 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2372:1: ( rule__AlternativeFlow__StepsAssignment_2 )*
			{
			 before(grammarAccess.getAlternativeFlowAccess().getStepsAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2373:2: ( rule__AlternativeFlow__StepsAssignment_2 )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==34||LA25_0==40) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2373:2: rule__AlternativeFlow__StepsAssignment_2
					{
					pushFollow(FOLLOW_rule__AlternativeFlow__StepsAssignment_2_in_rule__AlternativeFlow__Group__2__Impl4817);
					rule__AlternativeFlow__StepsAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			 after(grammarAccess.getAlternativeFlowAccess().getStepsAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group__2__Impl"



	// $ANTLR start "rule__AlternativeFlow__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2383:1: rule__AlternativeFlow__Group__3 : rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4 ;
	public final void rule__AlternativeFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2387:2: ( rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2388:2: rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__3__Impl_in_rule__AlternativeFlow__Group__34848);
			rule__AlternativeFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__4_in_rule__AlternativeFlow__Group__34851);
			rule__AlternativeFlow__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group__3"



	// $ANTLR start "rule__AlternativeFlow__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2395:1: rule__AlternativeFlow__Group__3__Impl : ( 'end flow' ) ;
	public final void rule__AlternativeFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2399:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2400:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2400:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2401:1: 'end flow'
			{
			 before(grammarAccess.getAlternativeFlowAccess().getEndFlowKeyword_3()); 
			match(input,23,FOLLOW_23_in_rule__AlternativeFlow__Group__3__Impl4879); 
			 after(grammarAccess.getAlternativeFlowAccess().getEndFlowKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group__3__Impl"



	// $ANTLR start "rule__AlternativeFlow__Group__4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2414:1: rule__AlternativeFlow__Group__4 : rule__AlternativeFlow__Group__4__Impl ;
	public final void rule__AlternativeFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2418:2: ( rule__AlternativeFlow__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2419:2: rule__AlternativeFlow__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__4__Impl_in_rule__AlternativeFlow__Group__44910);
			rule__AlternativeFlow__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group__4"



	// $ANTLR start "rule__AlternativeFlow__Group__4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2425:1: rule__AlternativeFlow__Group__4__Impl : ( ( rule__AlternativeFlow__Group_4__0 )? ) ;
	public final void rule__AlternativeFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2429:1: ( ( ( rule__AlternativeFlow__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2430:1: ( ( rule__AlternativeFlow__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2430:1: ( ( rule__AlternativeFlow__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2431:1: ( rule__AlternativeFlow__Group_4__0 )?
			{
			 before(grammarAccess.getAlternativeFlowAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2432:2: ( rule__AlternativeFlow__Group_4__0 )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==45) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2432:2: rule__AlternativeFlow__Group_4__0
					{
					pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__0_in_rule__AlternativeFlow__Group__4__Impl4937);
					rule__AlternativeFlow__Group_4__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getAlternativeFlowAccess().getGroup_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group__4__Impl"



	// $ANTLR start "rule__AlternativeFlow__Group_4__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2452:1: rule__AlternativeFlow__Group_4__0 : rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1 ;
	public final void rule__AlternativeFlow__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2456:2: ( rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2457:2: rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__0__Impl_in_rule__AlternativeFlow__Group_4__04978);
			rule__AlternativeFlow__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__1_in_rule__AlternativeFlow__Group_4__04981);
			rule__AlternativeFlow__Group_4__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group_4__0"



	// $ANTLR start "rule__AlternativeFlow__Group_4__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2464:1: rule__AlternativeFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
	public final void rule__AlternativeFlow__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2468:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2469:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2469:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2470:1: 'with postcondition'
			{
			 before(grammarAccess.getAlternativeFlowAccess().getWithPostconditionKeyword_4_0()); 
			match(input,45,FOLLOW_45_in_rule__AlternativeFlow__Group_4__0__Impl5009); 
			 after(grammarAccess.getAlternativeFlowAccess().getWithPostconditionKeyword_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group_4__0__Impl"



	// $ANTLR start "rule__AlternativeFlow__Group_4__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2483:1: rule__AlternativeFlow__Group_4__1 : rule__AlternativeFlow__Group_4__1__Impl ;
	public final void rule__AlternativeFlow__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2487:2: ( rule__AlternativeFlow__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2488:2: rule__AlternativeFlow__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__1__Impl_in_rule__AlternativeFlow__Group_4__15040);
			rule__AlternativeFlow__Group_4__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group_4__1"



	// $ANTLR start "rule__AlternativeFlow__Group_4__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2494:1: rule__AlternativeFlow__Group_4__1__Impl : ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) ) ;
	public final void rule__AlternativeFlow__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2498:1: ( ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2499:1: ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2499:1: ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2500:1: ( rule__AlternativeFlow__FinalStateAssignment_4_1 )
			{
			 before(grammarAccess.getAlternativeFlowAccess().getFinalStateAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2501:2: ( rule__AlternativeFlow__FinalStateAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2501:2: rule__AlternativeFlow__FinalStateAssignment_4_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__FinalStateAssignment_4_1_in_rule__AlternativeFlow__Group_4__1__Impl5067);
			rule__AlternativeFlow__FinalStateAssignment_4_1();
			state._fsp--;

			}

			 after(grammarAccess.getAlternativeFlowAccess().getFinalStateAssignment_4_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__Group_4__1__Impl"



	// $ANTLR start "rule__ParallelFlow__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2515:1: rule__ParallelFlow__Group__0 : rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1 ;
	public final void rule__ParallelFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2519:2: ( rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2520:2: rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__0__Impl_in_rule__ParallelFlow__Group__05101);
			rule__ParallelFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__1_in_rule__ParallelFlow__Group__05104);
			rule__ParallelFlow__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group__0"



	// $ANTLR start "rule__ParallelFlow__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2527:1: rule__ParallelFlow__Group__0__Impl : ( 'parallel flow' ) ;
	public final void rule__ParallelFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2531:1: ( ( 'parallel flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2532:1: ( 'parallel flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2532:1: ( 'parallel flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2533:1: 'parallel flow'
			{
			 before(grammarAccess.getParallelFlowAccess().getParallelFlowKeyword_0()); 
			match(input,33,FOLLOW_33_in_rule__ParallelFlow__Group__0__Impl5132); 
			 after(grammarAccess.getParallelFlowAccess().getParallelFlowKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group__0__Impl"



	// $ANTLR start "rule__ParallelFlow__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2546:1: rule__ParallelFlow__Group__1 : rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2 ;
	public final void rule__ParallelFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2550:2: ( rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2551:2: rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__1__Impl_in_rule__ParallelFlow__Group__15163);
			rule__ParallelFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__2_in_rule__ParallelFlow__Group__15166);
			rule__ParallelFlow__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group__1"



	// $ANTLR start "rule__ParallelFlow__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2558:1: rule__ParallelFlow__Group__1__Impl : ( ( rule__ParallelFlow__NameAssignment_1 ) ) ;
	public final void rule__ParallelFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2562:1: ( ( ( rule__ParallelFlow__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2563:1: ( ( rule__ParallelFlow__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2563:1: ( ( rule__ParallelFlow__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2564:1: ( rule__ParallelFlow__NameAssignment_1 )
			{
			 before(grammarAccess.getParallelFlowAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2565:2: ( rule__ParallelFlow__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2565:2: rule__ParallelFlow__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__NameAssignment_1_in_rule__ParallelFlow__Group__1__Impl5193);
			rule__ParallelFlow__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getParallelFlowAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group__1__Impl"



	// $ANTLR start "rule__ParallelFlow__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2575:1: rule__ParallelFlow__Group__2 : rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3 ;
	public final void rule__ParallelFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2579:2: ( rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2580:2: rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__2__Impl_in_rule__ParallelFlow__Group__25223);
			rule__ParallelFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__3_in_rule__ParallelFlow__Group__25226);
			rule__ParallelFlow__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group__2"



	// $ANTLR start "rule__ParallelFlow__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2587:1: rule__ParallelFlow__Group__2__Impl : ( ( rule__ParallelFlow__StepsAssignment_2 )* ) ;
	public final void rule__ParallelFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2591:1: ( ( ( rule__ParallelFlow__StepsAssignment_2 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2592:1: ( ( rule__ParallelFlow__StepsAssignment_2 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2592:1: ( ( rule__ParallelFlow__StepsAssignment_2 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2593:1: ( rule__ParallelFlow__StepsAssignment_2 )*
			{
			 before(grammarAccess.getParallelFlowAccess().getStepsAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2594:2: ( rule__ParallelFlow__StepsAssignment_2 )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==34||LA27_0==40) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2594:2: rule__ParallelFlow__StepsAssignment_2
					{
					pushFollow(FOLLOW_rule__ParallelFlow__StepsAssignment_2_in_rule__ParallelFlow__Group__2__Impl5253);
					rule__ParallelFlow__StepsAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			}

			 after(grammarAccess.getParallelFlowAccess().getStepsAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group__2__Impl"



	// $ANTLR start "rule__ParallelFlow__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2604:1: rule__ParallelFlow__Group__3 : rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4 ;
	public final void rule__ParallelFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2608:2: ( rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2609:2: rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__3__Impl_in_rule__ParallelFlow__Group__35284);
			rule__ParallelFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__4_in_rule__ParallelFlow__Group__35287);
			rule__ParallelFlow__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group__3"



	// $ANTLR start "rule__ParallelFlow__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2616:1: rule__ParallelFlow__Group__3__Impl : ( 'end flow' ) ;
	public final void rule__ParallelFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2620:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2621:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2621:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2622:1: 'end flow'
			{
			 before(grammarAccess.getParallelFlowAccess().getEndFlowKeyword_3()); 
			match(input,23,FOLLOW_23_in_rule__ParallelFlow__Group__3__Impl5315); 
			 after(grammarAccess.getParallelFlowAccess().getEndFlowKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group__3__Impl"



	// $ANTLR start "rule__ParallelFlow__Group__4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2635:1: rule__ParallelFlow__Group__4 : rule__ParallelFlow__Group__4__Impl ;
	public final void rule__ParallelFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2639:2: ( rule__ParallelFlow__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2640:2: rule__ParallelFlow__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__4__Impl_in_rule__ParallelFlow__Group__45346);
			rule__ParallelFlow__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group__4"



	// $ANTLR start "rule__ParallelFlow__Group__4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2646:1: rule__ParallelFlow__Group__4__Impl : ( ( rule__ParallelFlow__Group_4__0 )? ) ;
	public final void rule__ParallelFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2650:1: ( ( ( rule__ParallelFlow__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2651:1: ( ( rule__ParallelFlow__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2651:1: ( ( rule__ParallelFlow__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2652:1: ( rule__ParallelFlow__Group_4__0 )?
			{
			 before(grammarAccess.getParallelFlowAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2653:2: ( rule__ParallelFlow__Group_4__0 )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==45) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2653:2: rule__ParallelFlow__Group_4__0
					{
					pushFollow(FOLLOW_rule__ParallelFlow__Group_4__0_in_rule__ParallelFlow__Group__4__Impl5373);
					rule__ParallelFlow__Group_4__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getParallelFlowAccess().getGroup_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group__4__Impl"



	// $ANTLR start "rule__ParallelFlow__Group_4__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2673:1: rule__ParallelFlow__Group_4__0 : rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1 ;
	public final void rule__ParallelFlow__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2677:2: ( rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2678:2: rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group_4__0__Impl_in_rule__ParallelFlow__Group_4__05414);
			rule__ParallelFlow__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group_4__1_in_rule__ParallelFlow__Group_4__05417);
			rule__ParallelFlow__Group_4__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group_4__0"



	// $ANTLR start "rule__ParallelFlow__Group_4__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2685:1: rule__ParallelFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
	public final void rule__ParallelFlow__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2689:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2690:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2690:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2691:1: 'with postcondition'
			{
			 before(grammarAccess.getParallelFlowAccess().getWithPostconditionKeyword_4_0()); 
			match(input,45,FOLLOW_45_in_rule__ParallelFlow__Group_4__0__Impl5445); 
			 after(grammarAccess.getParallelFlowAccess().getWithPostconditionKeyword_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group_4__0__Impl"



	// $ANTLR start "rule__ParallelFlow__Group_4__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2704:1: rule__ParallelFlow__Group_4__1 : rule__ParallelFlow__Group_4__1__Impl ;
	public final void rule__ParallelFlow__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2708:2: ( rule__ParallelFlow__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2709:2: rule__ParallelFlow__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group_4__1__Impl_in_rule__ParallelFlow__Group_4__15476);
			rule__ParallelFlow__Group_4__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group_4__1"



	// $ANTLR start "rule__ParallelFlow__Group_4__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2715:1: rule__ParallelFlow__Group_4__1__Impl : ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) ) ;
	public final void rule__ParallelFlow__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2719:1: ( ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2720:1: ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2720:1: ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2721:1: ( rule__ParallelFlow__FinalStateAssignment_4_1 )
			{
			 before(grammarAccess.getParallelFlowAccess().getFinalStateAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2722:2: ( rule__ParallelFlow__FinalStateAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2722:2: rule__ParallelFlow__FinalStateAssignment_4_1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__FinalStateAssignment_4_1_in_rule__ParallelFlow__Group_4__1__Impl5503);
			rule__ParallelFlow__FinalStateAssignment_4_1();
			state._fsp--;

			}

			 after(grammarAccess.getParallelFlowAccess().getFinalStateAssignment_4_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__Group_4__1__Impl"



	// $ANTLR start "rule__Condition__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2736:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
	public final void rule__Condition__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2740:2: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2741:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
			{
			pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05537);
			rule__Condition__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05540);
			rule__Condition__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group__0"



	// $ANTLR start "rule__Condition__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2748:1: rule__Condition__Group__0__Impl : ( 'if' ) ;
	public final void rule__Condition__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2752:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2753:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2753:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2754:1: 'if'
			{
			 before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
			match(input,28,FOLLOW_28_in_rule__Condition__Group__0__Impl5568); 
			 after(grammarAccess.getConditionAccess().getIfKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group__0__Impl"



	// $ANTLR start "rule__Condition__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2767:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
	public final void rule__Condition__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2771:2: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2772:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
			{
			pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15599);
			rule__Condition__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__15602);
			rule__Condition__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group__1"



	// $ANTLR start "rule__Condition__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2779:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ConditionAssignment_1 ) ) ;
	public final void rule__Condition__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2783:1: ( ( ( rule__Condition__ConditionAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2784:1: ( ( rule__Condition__ConditionAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2784:1: ( ( rule__Condition__ConditionAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2785:1: ( rule__Condition__ConditionAssignment_1 )
			{
			 before(grammarAccess.getConditionAccess().getConditionAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2786:2: ( rule__Condition__ConditionAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2786:2: rule__Condition__ConditionAssignment_1
			{
			pushFollow(FOLLOW_rule__Condition__ConditionAssignment_1_in_rule__Condition__Group__1__Impl5629);
			rule__Condition__ConditionAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getConditionAccess().getConditionAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group__1__Impl"



	// $ANTLR start "rule__Condition__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2796:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
	public final void rule__Condition__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2800:2: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2801:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
			{
			pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__25659);
			rule__Condition__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__25662);
			rule__Condition__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group__2"



	// $ANTLR start "rule__Condition__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2808:1: rule__Condition__Group__2__Impl : ( 'then' ) ;
	public final void rule__Condition__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2812:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2813:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2813:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2814:1: 'then'
			{
			 before(grammarAccess.getConditionAccess().getThenKeyword_2()); 
			match(input,42,FOLLOW_42_in_rule__Condition__Group__2__Impl5690); 
			 after(grammarAccess.getConditionAccess().getThenKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group__2__Impl"



	// $ANTLR start "rule__Condition__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2827:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
	public final void rule__Condition__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2831:2: ( rule__Condition__Group__3__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2832:2: rule__Condition__Group__3__Impl
			{
			pushFollow(FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__35721);
			rule__Condition__Group__3__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group__3"



	// $ANTLR start "rule__Condition__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2838:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__Group_3__0 )? ) ;
	public final void rule__Condition__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2842:1: ( ( ( rule__Condition__Group_3__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2843:1: ( ( rule__Condition__Group_3__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2843:1: ( ( rule__Condition__Group_3__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2844:1: ( rule__Condition__Group_3__0 )?
			{
			 before(grammarAccess.getConditionAccess().getGroup_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2845:2: ( rule__Condition__Group_3__0 )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==21) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2845:2: rule__Condition__Group_3__0
					{
					pushFollow(FOLLOW_rule__Condition__Group_3__0_in_rule__Condition__Group__3__Impl5748);
					rule__Condition__Group_3__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getConditionAccess().getGroup_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group__3__Impl"



	// $ANTLR start "rule__Condition__Group_3__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2863:1: rule__Condition__Group_3__0 : rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 ;
	public final void rule__Condition__Group_3__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2867:2: ( rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2868:2: rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1
			{
			pushFollow(FOLLOW_rule__Condition__Group_3__0__Impl_in_rule__Condition__Group_3__05787);
			rule__Condition__Group_3__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group_3__1_in_rule__Condition__Group_3__05790);
			rule__Condition__Group_3__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group_3__0"



	// $ANTLR start "rule__Condition__Group_3__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2875:1: rule__Condition__Group_3__0__Impl : ( 'continue with step' ) ;
	public final void rule__Condition__Group_3__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2879:1: ( ( 'continue with step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2880:1: ( 'continue with step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2880:1: ( 'continue with step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2881:1: 'continue with step'
			{
			 before(grammarAccess.getConditionAccess().getContinueWithStepKeyword_3_0()); 
			match(input,21,FOLLOW_21_in_rule__Condition__Group_3__0__Impl5818); 
			 after(grammarAccess.getConditionAccess().getContinueWithStepKeyword_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group_3__0__Impl"



	// $ANTLR start "rule__Condition__Group_3__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2894:1: rule__Condition__Group_3__1 : rule__Condition__Group_3__1__Impl ;
	public final void rule__Condition__Group_3__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2898:2: ( rule__Condition__Group_3__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2899:2: rule__Condition__Group_3__1__Impl
			{
			pushFollow(FOLLOW_rule__Condition__Group_3__1__Impl_in_rule__Condition__Group_3__15849);
			rule__Condition__Group_3__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group_3__1"



	// $ANTLR start "rule__Condition__Group_3__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2905:1: rule__Condition__Group_3__1__Impl : ( ( rule__Condition__ContinuationAssignment_3_1 ) ) ;
	public final void rule__Condition__Group_3__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2909:1: ( ( ( rule__Condition__ContinuationAssignment_3_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2910:1: ( ( rule__Condition__ContinuationAssignment_3_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2910:1: ( ( rule__Condition__ContinuationAssignment_3_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2911:1: ( rule__Condition__ContinuationAssignment_3_1 )
			{
			 before(grammarAccess.getConditionAccess().getContinuationAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2912:2: ( rule__Condition__ContinuationAssignment_3_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2912:2: rule__Condition__ContinuationAssignment_3_1
			{
			pushFollow(FOLLOW_rule__Condition__ContinuationAssignment_3_1_in_rule__Condition__Group_3__1__Impl5876);
			rule__Condition__ContinuationAssignment_3_1();
			state._fsp--;

			}

			 after(grammarAccess.getConditionAccess().getContinuationAssignment_3_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__Group_3__1__Impl"



	// $ANTLR start "rule__LocalAlternative__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2926:1: rule__LocalAlternative__Group__0 : rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1 ;
	public final void rule__LocalAlternative__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2930:2: ( rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2931:2: rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__0__Impl_in_rule__LocalAlternative__Group__05910);
			rule__LocalAlternative__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__1_in_rule__LocalAlternative__Group__05913);
			rule__LocalAlternative__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group__0"



	// $ANTLR start "rule__LocalAlternative__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2938:1: rule__LocalAlternative__Group__0__Impl : ( 'if' ) ;
	public final void rule__LocalAlternative__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2942:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2943:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2943:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2944:1: 'if'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getIfKeyword_0()); 
			match(input,28,FOLLOW_28_in_rule__LocalAlternative__Group__0__Impl5941); 
			 after(grammarAccess.getLocalAlternativeAccess().getIfKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group__0__Impl"



	// $ANTLR start "rule__LocalAlternative__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2957:1: rule__LocalAlternative__Group__1 : rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2 ;
	public final void rule__LocalAlternative__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2961:2: ( rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2962:2: rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__1__Impl_in_rule__LocalAlternative__Group__15972);
			rule__LocalAlternative__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__2_in_rule__LocalAlternative__Group__15975);
			rule__LocalAlternative__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group__1"



	// $ANTLR start "rule__LocalAlternative__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2969:1: rule__LocalAlternative__Group__1__Impl : ( ( rule__LocalAlternative__ConditionAssignment_1 ) ) ;
	public final void rule__LocalAlternative__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2973:1: ( ( ( rule__LocalAlternative__ConditionAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2974:1: ( ( rule__LocalAlternative__ConditionAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2974:1: ( ( rule__LocalAlternative__ConditionAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2975:1: ( rule__LocalAlternative__ConditionAssignment_1 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getConditionAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2976:2: ( rule__LocalAlternative__ConditionAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2976:2: rule__LocalAlternative__ConditionAssignment_1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__ConditionAssignment_1_in_rule__LocalAlternative__Group__1__Impl6002);
			rule__LocalAlternative__ConditionAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getLocalAlternativeAccess().getConditionAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group__1__Impl"



	// $ANTLR start "rule__LocalAlternative__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2986:1: rule__LocalAlternative__Group__2 : rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3 ;
	public final void rule__LocalAlternative__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2990:2: ( rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2991:2: rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__2__Impl_in_rule__LocalAlternative__Group__26032);
			rule__LocalAlternative__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__3_in_rule__LocalAlternative__Group__26035);
			rule__LocalAlternative__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group__2"



	// $ANTLR start "rule__LocalAlternative__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2998:1: rule__LocalAlternative__Group__2__Impl : ( 'then' ) ;
	public final void rule__LocalAlternative__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3002:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3003:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3003:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3004:1: 'then'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getThenKeyword_2()); 
			match(input,42,FOLLOW_42_in_rule__LocalAlternative__Group__2__Impl6063); 
			 after(grammarAccess.getLocalAlternativeAccess().getThenKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group__2__Impl"



	// $ANTLR start "rule__LocalAlternative__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3017:1: rule__LocalAlternative__Group__3 : rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4 ;
	public final void rule__LocalAlternative__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3021:2: ( rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3022:2: rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__3__Impl_in_rule__LocalAlternative__Group__36094);
			rule__LocalAlternative__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__4_in_rule__LocalAlternative__Group__36097);
			rule__LocalAlternative__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group__3"



	// $ANTLR start "rule__LocalAlternative__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3029:1: rule__LocalAlternative__Group__3__Impl : ( ( rule__LocalAlternative__Alternatives_3 ) ) ;
	public final void rule__LocalAlternative__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3033:1: ( ( ( rule__LocalAlternative__Alternatives_3 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3034:1: ( ( rule__LocalAlternative__Alternatives_3 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3034:1: ( ( rule__LocalAlternative__Alternatives_3 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3035:1: ( rule__LocalAlternative__Alternatives_3 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getAlternatives_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3036:2: ( rule__LocalAlternative__Alternatives_3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3036:2: rule__LocalAlternative__Alternatives_3
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Alternatives_3_in_rule__LocalAlternative__Group__3__Impl6124);
			rule__LocalAlternative__Alternatives_3();
			state._fsp--;

			}

			 after(grammarAccess.getLocalAlternativeAccess().getAlternatives_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group__3__Impl"



	// $ANTLR start "rule__LocalAlternative__Group__4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3046:1: rule__LocalAlternative__Group__4 : rule__LocalAlternative__Group__4__Impl ;
	public final void rule__LocalAlternative__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3050:2: ( rule__LocalAlternative__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3051:2: rule__LocalAlternative__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__4__Impl_in_rule__LocalAlternative__Group__46154);
			rule__LocalAlternative__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group__4"



	// $ANTLR start "rule__LocalAlternative__Group__4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3057:1: rule__LocalAlternative__Group__4__Impl : ( ( rule__LocalAlternative__Group_4__0 )? ) ;
	public final void rule__LocalAlternative__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3061:1: ( ( ( rule__LocalAlternative__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3062:1: ( ( rule__LocalAlternative__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3062:1: ( ( rule__LocalAlternative__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3063:1: ( rule__LocalAlternative__Group_4__0 )?
			{
			 before(grammarAccess.getLocalAlternativeAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3064:2: ( rule__LocalAlternative__Group_4__0 )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==21) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3064:2: rule__LocalAlternative__Group_4__0
					{
					pushFollow(FOLLOW_rule__LocalAlternative__Group_4__0_in_rule__LocalAlternative__Group__4__Impl6181);
					rule__LocalAlternative__Group_4__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getLocalAlternativeAccess().getGroup_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group__4__Impl"



	// $ANTLR start "rule__LocalAlternative__Group_3_1__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3084:1: rule__LocalAlternative__Group_3_1__0 : rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1 ;
	public final void rule__LocalAlternative__Group_3_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3088:2: ( rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3089:2: rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__0__Impl_in_rule__LocalAlternative__Group_3_1__06222);
			rule__LocalAlternative__Group_3_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__1_in_rule__LocalAlternative__Group_3_1__06225);
			rule__LocalAlternative__Group_3_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group_3_1__0"



	// $ANTLR start "rule__LocalAlternative__Group_3_1__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3096:1: rule__LocalAlternative__Group_3_1__0__Impl : ( 'invoke usecase' ) ;
	public final void rule__LocalAlternative__Group_3_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3100:1: ( ( 'invoke usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3101:1: ( 'invoke usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3101:1: ( 'invoke usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3102:1: 'invoke usecase'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokeUsecaseKeyword_3_1_0()); 
			match(input,29,FOLLOW_29_in_rule__LocalAlternative__Group_3_1__0__Impl6253); 
			 after(grammarAccess.getLocalAlternativeAccess().getInvokeUsecaseKeyword_3_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group_3_1__0__Impl"



	// $ANTLR start "rule__LocalAlternative__Group_3_1__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3115:1: rule__LocalAlternative__Group_3_1__1 : rule__LocalAlternative__Group_3_1__1__Impl ;
	public final void rule__LocalAlternative__Group_3_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3119:2: ( rule__LocalAlternative__Group_3_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3120:2: rule__LocalAlternative__Group_3_1__1__Impl
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__1__Impl_in_rule__LocalAlternative__Group_3_1__16284);
			rule__LocalAlternative__Group_3_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group_3_1__1"



	// $ANTLR start "rule__LocalAlternative__Group_3_1__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3126:1: rule__LocalAlternative__Group_3_1__1__Impl : ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) ) ;
	public final void rule__LocalAlternative__Group_3_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3130:1: ( ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3131:1: ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3131:1: ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3132:1: ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseAssignment_3_1_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3133:2: ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3133:2: rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1_in_rule__LocalAlternative__Group_3_1__1__Impl6311);
			rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseAssignment_3_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group_3_1__1__Impl"



	// $ANTLR start "rule__LocalAlternative__Group_4__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3147:1: rule__LocalAlternative__Group_4__0 : rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1 ;
	public final void rule__LocalAlternative__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3151:2: ( rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3152:2: rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_4__0__Impl_in_rule__LocalAlternative__Group_4__06345);
			rule__LocalAlternative__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group_4__1_in_rule__LocalAlternative__Group_4__06348);
			rule__LocalAlternative__Group_4__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group_4__0"



	// $ANTLR start "rule__LocalAlternative__Group_4__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3159:1: rule__LocalAlternative__Group_4__0__Impl : ( 'continue with step' ) ;
	public final void rule__LocalAlternative__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3163:1: ( ( 'continue with step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3164:1: ( 'continue with step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3164:1: ( 'continue with step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3165:1: 'continue with step'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinueWithStepKeyword_4_0()); 
			match(input,21,FOLLOW_21_in_rule__LocalAlternative__Group_4__0__Impl6376); 
			 after(grammarAccess.getLocalAlternativeAccess().getContinueWithStepKeyword_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group_4__0__Impl"



	// $ANTLR start "rule__LocalAlternative__Group_4__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3178:1: rule__LocalAlternative__Group_4__1 : rule__LocalAlternative__Group_4__1__Impl ;
	public final void rule__LocalAlternative__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3182:2: ( rule__LocalAlternative__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3183:2: rule__LocalAlternative__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_4__1__Impl_in_rule__LocalAlternative__Group_4__16407);
			rule__LocalAlternative__Group_4__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group_4__1"



	// $ANTLR start "rule__LocalAlternative__Group_4__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3189:1: rule__LocalAlternative__Group_4__1__Impl : ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) ) ;
	public final void rule__LocalAlternative__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3193:1: ( ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3194:1: ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3194:1: ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3195:1: ( rule__LocalAlternative__ContinuationAssignment_4_1 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinuationAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3196:2: ( rule__LocalAlternative__ContinuationAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3196:2: rule__LocalAlternative__ContinuationAssignment_4_1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__ContinuationAssignment_4_1_in_rule__LocalAlternative__Group_4__1__Impl6434);
			rule__LocalAlternative__ContinuationAssignment_4_1();
			state._fsp--;

			}

			 after(grammarAccess.getLocalAlternativeAccess().getContinuationAssignment_4_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__Group_4__1__Impl"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3210:1: rule__AlternativeFlowAlternative__Group__0 : rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1 ;
	public final void rule__AlternativeFlowAlternative__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3214:2: ( rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3215:2: rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__0__Impl_in_rule__AlternativeFlowAlternative__Group__06468);
			rule__AlternativeFlowAlternative__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__1_in_rule__AlternativeFlowAlternative__Group__06471);
			rule__AlternativeFlowAlternative__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__0"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3222:1: rule__AlternativeFlowAlternative__Group__0__Impl : ( 'if' ) ;
	public final void rule__AlternativeFlowAlternative__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3226:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3227:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3227:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3228:1: 'if'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getIfKeyword_0()); 
			match(input,28,FOLLOW_28_in_rule__AlternativeFlowAlternative__Group__0__Impl6499); 
			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getIfKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__0__Impl"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3241:1: rule__AlternativeFlowAlternative__Group__1 : rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2 ;
	public final void rule__AlternativeFlowAlternative__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3245:2: ( rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3246:2: rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__1__Impl_in_rule__AlternativeFlowAlternative__Group__16530);
			rule__AlternativeFlowAlternative__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__2_in_rule__AlternativeFlowAlternative__Group__16533);
			rule__AlternativeFlowAlternative__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__1"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3253:1: rule__AlternativeFlowAlternative__Group__1__Impl : ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) ) ;
	public final void rule__AlternativeFlowAlternative__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3257:1: ( ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3258:1: ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3258:1: ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3259:1: ( rule__AlternativeFlowAlternative__ConditionAssignment_1 )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getConditionAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3260:2: ( rule__AlternativeFlowAlternative__ConditionAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3260:2: rule__AlternativeFlowAlternative__ConditionAssignment_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__ConditionAssignment_1_in_rule__AlternativeFlowAlternative__Group__1__Impl6560);
			rule__AlternativeFlowAlternative__ConditionAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getConditionAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__1__Impl"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3270:1: rule__AlternativeFlowAlternative__Group__2 : rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3 ;
	public final void rule__AlternativeFlowAlternative__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3274:2: ( rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3275:2: rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__2__Impl_in_rule__AlternativeFlowAlternative__Group__26590);
			rule__AlternativeFlowAlternative__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__3_in_rule__AlternativeFlowAlternative__Group__26593);
			rule__AlternativeFlowAlternative__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__2"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3282:1: rule__AlternativeFlowAlternative__Group__2__Impl : ( 'then' ) ;
	public final void rule__AlternativeFlowAlternative__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3286:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3287:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3287:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3288:1: 'then'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getThenKeyword_2()); 
			match(input,42,FOLLOW_42_in_rule__AlternativeFlowAlternative__Group__2__Impl6621); 
			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getThenKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__2__Impl"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3301:1: rule__AlternativeFlowAlternative__Group__3 : rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4 ;
	public final void rule__AlternativeFlowAlternative__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3305:2: ( rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3306:2: rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__3__Impl_in_rule__AlternativeFlowAlternative__Group__36652);
			rule__AlternativeFlowAlternative__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__4_in_rule__AlternativeFlowAlternative__Group__36655);
			rule__AlternativeFlowAlternative__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__3"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3313:1: rule__AlternativeFlowAlternative__Group__3__Impl : ( 'alternative flow' ) ;
	public final void rule__AlternativeFlowAlternative__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3317:1: ( ( 'alternative flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3318:1: ( 'alternative flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3318:1: ( 'alternative flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3319:1: 'alternative flow'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getAlternativeFlowKeyword_3()); 
			match(input,15,FOLLOW_15_in_rule__AlternativeFlowAlternative__Group__3__Impl6683); 
			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getAlternativeFlowKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__3__Impl"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3332:1: rule__AlternativeFlowAlternative__Group__4 : rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5 ;
	public final void rule__AlternativeFlowAlternative__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3336:2: ( rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3337:2: rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__4__Impl_in_rule__AlternativeFlowAlternative__Group__46714);
			rule__AlternativeFlowAlternative__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__5_in_rule__AlternativeFlowAlternative__Group__46717);
			rule__AlternativeFlowAlternative__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__4"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3344:1: rule__AlternativeFlowAlternative__Group__4__Impl : ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) ) ;
	public final void rule__AlternativeFlowAlternative__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3348:1: ( ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3349:1: ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3349:1: ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3350:1: ( rule__AlternativeFlowAlternative__RefAssignment_4 )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefAssignment_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3351:2: ( rule__AlternativeFlowAlternative__RefAssignment_4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3351:2: rule__AlternativeFlowAlternative__RefAssignment_4
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__RefAssignment_4_in_rule__AlternativeFlowAlternative__Group__4__Impl6744);
			rule__AlternativeFlowAlternative__RefAssignment_4();
			state._fsp--;

			}

			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getRefAssignment_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__4__Impl"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__5"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3361:1: rule__AlternativeFlowAlternative__Group__5 : rule__AlternativeFlowAlternative__Group__5__Impl ;
	public final void rule__AlternativeFlowAlternative__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3365:2: ( rule__AlternativeFlowAlternative__Group__5__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3366:2: rule__AlternativeFlowAlternative__Group__5__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__5__Impl_in_rule__AlternativeFlowAlternative__Group__56774);
			rule__AlternativeFlowAlternative__Group__5__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__5"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group__5__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3372:1: rule__AlternativeFlowAlternative__Group__5__Impl : ( ( rule__AlternativeFlowAlternative__Group_5__0 )? ) ;
	public final void rule__AlternativeFlowAlternative__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3376:1: ( ( ( rule__AlternativeFlowAlternative__Group_5__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3377:1: ( ( rule__AlternativeFlowAlternative__Group_5__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3377:1: ( ( rule__AlternativeFlowAlternative__Group_5__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3378:1: ( rule__AlternativeFlowAlternative__Group_5__0 )?
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getGroup_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3379:2: ( rule__AlternativeFlowAlternative__Group_5__0 )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==21) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3379:2: rule__AlternativeFlowAlternative__Group_5__0
					{
					pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__0_in_rule__AlternativeFlowAlternative__Group__5__Impl6801);
					rule__AlternativeFlowAlternative__Group_5__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getGroup_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group__5__Impl"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group_5__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3401:1: rule__AlternativeFlowAlternative__Group_5__0 : rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1 ;
	public final void rule__AlternativeFlowAlternative__Group_5__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3405:2: ( rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3406:2: rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__0__Impl_in_rule__AlternativeFlowAlternative__Group_5__06844);
			rule__AlternativeFlowAlternative__Group_5__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__1_in_rule__AlternativeFlowAlternative__Group_5__06847);
			rule__AlternativeFlowAlternative__Group_5__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group_5__0"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group_5__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3413:1: rule__AlternativeFlowAlternative__Group_5__0__Impl : ( 'continue with step' ) ;
	public final void rule__AlternativeFlowAlternative__Group_5__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3417:1: ( ( 'continue with step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3418:1: ( 'continue with step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3418:1: ( 'continue with step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3419:1: 'continue with step'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinueWithStepKeyword_5_0()); 
			match(input,21,FOLLOW_21_in_rule__AlternativeFlowAlternative__Group_5__0__Impl6875); 
			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getContinueWithStepKeyword_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group_5__0__Impl"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group_5__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3432:1: rule__AlternativeFlowAlternative__Group_5__1 : rule__AlternativeFlowAlternative__Group_5__1__Impl ;
	public final void rule__AlternativeFlowAlternative__Group_5__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3436:2: ( rule__AlternativeFlowAlternative__Group_5__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3437:2: rule__AlternativeFlowAlternative__Group_5__1__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__1__Impl_in_rule__AlternativeFlowAlternative__Group_5__16906);
			rule__AlternativeFlowAlternative__Group_5__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group_5__1"



	// $ANTLR start "rule__AlternativeFlowAlternative__Group_5__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3443:1: rule__AlternativeFlowAlternative__Group_5__1__Impl : ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) ) ;
	public final void rule__AlternativeFlowAlternative__Group_5__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3447:1: ( ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3448:1: ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3448:1: ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3449:1: ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationAssignment_5_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3450:2: ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3450:2: rule__AlternativeFlowAlternative__ContinuationAssignment_5_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__ContinuationAssignment_5_1_in_rule__AlternativeFlowAlternative__Group_5__1__Impl6933);
			rule__AlternativeFlowAlternative__ContinuationAssignment_5_1();
			state._fsp--;

			}

			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationAssignment_5_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__Group_5__1__Impl"



	// $ANTLR start "rule__ParallelStep__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3464:1: rule__ParallelStep__Group__0 : rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1 ;
	public final void rule__ParallelStep__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3468:2: ( rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3469:2: rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__0__Impl_in_rule__ParallelStep__Group__06967);
			rule__ParallelStep__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__1_in_rule__ParallelStep__Group__06970);
			rule__ParallelStep__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__0"



	// $ANTLR start "rule__ParallelStep__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3476:1: rule__ParallelStep__Group__0__Impl : ( 'parallel step' ) ;
	public final void rule__ParallelStep__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3480:1: ( ( 'parallel step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3481:1: ( 'parallel step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3481:1: ( 'parallel step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3482:1: 'parallel step'
			{
			 before(grammarAccess.getParallelStepAccess().getParallelStepKeyword_0()); 
			match(input,34,FOLLOW_34_in_rule__ParallelStep__Group__0__Impl6998); 
			 after(grammarAccess.getParallelStepAccess().getParallelStepKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__0__Impl"



	// $ANTLR start "rule__ParallelStep__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3495:1: rule__ParallelStep__Group__1 : rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2 ;
	public final void rule__ParallelStep__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3499:2: ( rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3500:2: rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__1__Impl_in_rule__ParallelStep__Group__17029);
			rule__ParallelStep__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__2_in_rule__ParallelStep__Group__17032);
			rule__ParallelStep__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__1"



	// $ANTLR start "rule__ParallelStep__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3507:1: rule__ParallelStep__Group__1__Impl : ( ( rule__ParallelStep__NameAssignment_1 ) ) ;
	public final void rule__ParallelStep__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3511:1: ( ( ( rule__ParallelStep__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3512:1: ( ( rule__ParallelStep__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3512:1: ( ( rule__ParallelStep__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3513:1: ( rule__ParallelStep__NameAssignment_1 )
			{
			 before(grammarAccess.getParallelStepAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3514:2: ( rule__ParallelStep__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3514:2: rule__ParallelStep__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__ParallelStep__NameAssignment_1_in_rule__ParallelStep__Group__1__Impl7059);
			rule__ParallelStep__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getParallelStepAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__1__Impl"



	// $ANTLR start "rule__ParallelStep__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3524:1: rule__ParallelStep__Group__2 : rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3 ;
	public final void rule__ParallelStep__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3528:2: ( rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3529:2: rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__2__Impl_in_rule__ParallelStep__Group__27089);
			rule__ParallelStep__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__3_in_rule__ParallelStep__Group__27092);
			rule__ParallelStep__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__2"



	// $ANTLR start "rule__ParallelStep__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3536:1: rule__ParallelStep__Group__2__Impl : ( ( rule__ParallelStep__LabelAssignment_2 )? ) ;
	public final void rule__ParallelStep__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3540:1: ( ( ( rule__ParallelStep__LabelAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3541:1: ( ( rule__ParallelStep__LabelAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3541:1: ( ( rule__ParallelStep__LabelAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3542:1: ( rule__ParallelStep__LabelAssignment_2 )?
			{
			 before(grammarAccess.getParallelStepAccess().getLabelAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3543:2: ( rule__ParallelStep__LabelAssignment_2 )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==RULE_STRING) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3543:2: rule__ParallelStep__LabelAssignment_2
					{
					pushFollow(FOLLOW_rule__ParallelStep__LabelAssignment_2_in_rule__ParallelStep__Group__2__Impl7119);
					rule__ParallelStep__LabelAssignment_2();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getParallelStepAccess().getLabelAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__2__Impl"



	// $ANTLR start "rule__ParallelStep__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3553:1: rule__ParallelStep__Group__3 : rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4 ;
	public final void rule__ParallelStep__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3557:2: ( rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3558:2: rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__3__Impl_in_rule__ParallelStep__Group__37150);
			rule__ParallelStep__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__4_in_rule__ParallelStep__Group__37153);
			rule__ParallelStep__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__3"



	// $ANTLR start "rule__ParallelStep__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3565:1: rule__ParallelStep__Group__3__Impl : ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) ) ;
	public final void rule__ParallelStep__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3569:1: ( ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3570:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3570:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3571:1: ( rule__ParallelStep__InvokedFlowsAssignment_3 )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsAssignment_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3572:2: ( rule__ParallelStep__InvokedFlowsAssignment_3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3572:2: rule__ParallelStep__InvokedFlowsAssignment_3
			{
			pushFollow(FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_3_in_rule__ParallelStep__Group__3__Impl7180);
			rule__ParallelStep__InvokedFlowsAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getParallelStepAccess().getInvokedFlowsAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__3__Impl"



	// $ANTLR start "rule__ParallelStep__Group__4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3582:1: rule__ParallelStep__Group__4 : rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5 ;
	public final void rule__ParallelStep__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3586:2: ( rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3587:2: rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__4__Impl_in_rule__ParallelStep__Group__47210);
			rule__ParallelStep__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__5_in_rule__ParallelStep__Group__47213);
			rule__ParallelStep__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__4"



	// $ANTLR start "rule__ParallelStep__Group__4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3594:1: rule__ParallelStep__Group__4__Impl : ( ( rule__ParallelStep__Group_4__0 )* ) ;
	public final void rule__ParallelStep__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3598:1: ( ( ( rule__ParallelStep__Group_4__0 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3599:1: ( ( rule__ParallelStep__Group_4__0 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3599:1: ( ( rule__ParallelStep__Group_4__0 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3600:1: ( rule__ParallelStep__Group_4__0 )*
			{
			 before(grammarAccess.getParallelStepAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3601:2: ( rule__ParallelStep__Group_4__0 )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==11) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3601:2: rule__ParallelStep__Group_4__0
					{
					pushFollow(FOLLOW_rule__ParallelStep__Group_4__0_in_rule__ParallelStep__Group__4__Impl7240);
					rule__ParallelStep__Group_4__0();
					state._fsp--;

					}
					break;

				default :
					break loop33;
				}
			}

			 after(grammarAccess.getParallelStepAccess().getGroup_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__4__Impl"



	// $ANTLR start "rule__ParallelStep__Group__5"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3611:1: rule__ParallelStep__Group__5 : rule__ParallelStep__Group__5__Impl ;
	public final void rule__ParallelStep__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3615:2: ( rule__ParallelStep__Group__5__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3616:2: rule__ParallelStep__Group__5__Impl
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__5__Impl_in_rule__ParallelStep__Group__57271);
			rule__ParallelStep__Group__5__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__5"



	// $ANTLR start "rule__ParallelStep__Group__5__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3622:1: rule__ParallelStep__Group__5__Impl : ( ( rule__ParallelStep__Group_5__0 )? ) ;
	public final void rule__ParallelStep__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3626:1: ( ( ( rule__ParallelStep__Group_5__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3627:1: ( ( rule__ParallelStep__Group_5__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3627:1: ( ( rule__ParallelStep__Group_5__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3628:1: ( rule__ParallelStep__Group_5__0 )?
			{
			 before(grammarAccess.getParallelStepAccess().getGroup_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3629:2: ( rule__ParallelStep__Group_5__0 )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==30) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3629:2: rule__ParallelStep__Group_5__0
					{
					pushFollow(FOLLOW_rule__ParallelStep__Group_5__0_in_rule__ParallelStep__Group__5__Impl7298);
					rule__ParallelStep__Group_5__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getParallelStepAccess().getGroup_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group__5__Impl"



	// $ANTLR start "rule__ParallelStep__Group_4__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3651:1: rule__ParallelStep__Group_4__0 : rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1 ;
	public final void rule__ParallelStep__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3655:2: ( rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3656:2: rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_4__0__Impl_in_rule__ParallelStep__Group_4__07341);
			rule__ParallelStep__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group_4__1_in_rule__ParallelStep__Group_4__07344);
			rule__ParallelStep__Group_4__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group_4__0"



	// $ANTLR start "rule__ParallelStep__Group_4__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3663:1: rule__ParallelStep__Group_4__0__Impl : ( ',' ) ;
	public final void rule__ParallelStep__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3667:1: ( ( ',' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3668:1: ( ',' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3668:1: ( ',' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3669:1: ','
			{
			 before(grammarAccess.getParallelStepAccess().getCommaKeyword_4_0()); 
			match(input,11,FOLLOW_11_in_rule__ParallelStep__Group_4__0__Impl7372); 
			 after(grammarAccess.getParallelStepAccess().getCommaKeyword_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group_4__0__Impl"



	// $ANTLR start "rule__ParallelStep__Group_4__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3682:1: rule__ParallelStep__Group_4__1 : rule__ParallelStep__Group_4__1__Impl ;
	public final void rule__ParallelStep__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3686:2: ( rule__ParallelStep__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3687:2: rule__ParallelStep__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_4__1__Impl_in_rule__ParallelStep__Group_4__17403);
			rule__ParallelStep__Group_4__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group_4__1"



	// $ANTLR start "rule__ParallelStep__Group_4__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3693:1: rule__ParallelStep__Group_4__1__Impl : ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) ) ;
	public final void rule__ParallelStep__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3697:1: ( ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3698:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3698:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3699:1: ( rule__ParallelStep__InvokedFlowsAssignment_4_1 )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3700:2: ( rule__ParallelStep__InvokedFlowsAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3700:2: rule__ParallelStep__InvokedFlowsAssignment_4_1
			{
			pushFollow(FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_4_1_in_rule__ParallelStep__Group_4__1__Impl7430);
			rule__ParallelStep__InvokedFlowsAssignment_4_1();
			state._fsp--;

			}

			 after(grammarAccess.getParallelStepAccess().getInvokedFlowsAssignment_4_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group_4__1__Impl"



	// $ANTLR start "rule__ParallelStep__Group_5__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3714:1: rule__ParallelStep__Group_5__0 : rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1 ;
	public final void rule__ParallelStep__Group_5__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3718:2: ( rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3719:2: rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_5__0__Impl_in_rule__ParallelStep__Group_5__07464);
			rule__ParallelStep__Group_5__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group_5__1_in_rule__ParallelStep__Group_5__07467);
			rule__ParallelStep__Group_5__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group_5__0"



	// $ANTLR start "rule__ParallelStep__Group_5__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3726:1: rule__ParallelStep__Group_5__0__Impl : ( 'next' ) ;
	public final void rule__ParallelStep__Group_5__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3730:1: ( ( 'next' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3731:1: ( 'next' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3731:1: ( 'next' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3732:1: 'next'
			{
			 before(grammarAccess.getParallelStepAccess().getNextKeyword_5_0()); 
			match(input,30,FOLLOW_30_in_rule__ParallelStep__Group_5__0__Impl7495); 
			 after(grammarAccess.getParallelStepAccess().getNextKeyword_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group_5__0__Impl"



	// $ANTLR start "rule__ParallelStep__Group_5__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3745:1: rule__ParallelStep__Group_5__1 : rule__ParallelStep__Group_5__1__Impl ;
	public final void rule__ParallelStep__Group_5__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3749:2: ( rule__ParallelStep__Group_5__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3750:2: rule__ParallelStep__Group_5__1__Impl
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_5__1__Impl_in_rule__ParallelStep__Group_5__17526);
			rule__ParallelStep__Group_5__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group_5__1"



	// $ANTLR start "rule__ParallelStep__Group_5__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3756:1: rule__ParallelStep__Group_5__1__Impl : ( ( rule__ParallelStep__NextAssignment_5_1 ) ) ;
	public final void rule__ParallelStep__Group_5__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3760:1: ( ( ( rule__ParallelStep__NextAssignment_5_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3761:1: ( ( rule__ParallelStep__NextAssignment_5_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3761:1: ( ( rule__ParallelStep__NextAssignment_5_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3762:1: ( rule__ParallelStep__NextAssignment_5_1 )
			{
			 before(grammarAccess.getParallelStepAccess().getNextAssignment_5_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3763:2: ( rule__ParallelStep__NextAssignment_5_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3763:2: rule__ParallelStep__NextAssignment_5_1
			{
			pushFollow(FOLLOW_rule__ParallelStep__NextAssignment_5_1_in_rule__ParallelStep__Group_5__1__Impl7553);
			rule__ParallelStep__NextAssignment_5_1();
			state._fsp--;

			}

			 after(grammarAccess.getParallelStepAccess().getNextAssignment_5_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__Group_5__1__Impl"



	// $ANTLR start "rule__NormalStep__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3777:1: rule__NormalStep__Group__0 : rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1 ;
	public final void rule__NormalStep__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3781:2: ( rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3782:2: rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__0__Impl_in_rule__NormalStep__Group__07587);
			rule__NormalStep__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__1_in_rule__NormalStep__Group__07590);
			rule__NormalStep__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__0"



	// $ANTLR start "rule__NormalStep__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3789:1: rule__NormalStep__Group__0__Impl : ( 'step' ) ;
	public final void rule__NormalStep__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3793:1: ( ( 'step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3794:1: ( 'step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3794:1: ( 'step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3795:1: 'step'
			{
			 before(grammarAccess.getNormalStepAccess().getStepKeyword_0()); 
			match(input,40,FOLLOW_40_in_rule__NormalStep__Group__0__Impl7618); 
			 after(grammarAccess.getNormalStepAccess().getStepKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__0__Impl"



	// $ANTLR start "rule__NormalStep__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3808:1: rule__NormalStep__Group__1 : rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2 ;
	public final void rule__NormalStep__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3812:2: ( rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3813:2: rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__1__Impl_in_rule__NormalStep__Group__17649);
			rule__NormalStep__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__2_in_rule__NormalStep__Group__17652);
			rule__NormalStep__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__1"



	// $ANTLR start "rule__NormalStep__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3820:1: rule__NormalStep__Group__1__Impl : ( ( rule__NormalStep__NameAssignment_1 ) ) ;
	public final void rule__NormalStep__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3824:1: ( ( ( rule__NormalStep__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3825:1: ( ( rule__NormalStep__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3825:1: ( ( rule__NormalStep__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3826:1: ( rule__NormalStep__NameAssignment_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3827:2: ( rule__NormalStep__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3827:2: rule__NormalStep__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__NormalStep__NameAssignment_1_in_rule__NormalStep__Group__1__Impl7679);
			rule__NormalStep__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getNormalStepAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__1__Impl"



	// $ANTLR start "rule__NormalStep__Group__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3837:1: rule__NormalStep__Group__2 : rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3 ;
	public final void rule__NormalStep__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3841:2: ( rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3842:2: rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__2__Impl_in_rule__NormalStep__Group__27709);
			rule__NormalStep__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__3_in_rule__NormalStep__Group__27712);
			rule__NormalStep__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__2"



	// $ANTLR start "rule__NormalStep__Group__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3849:1: rule__NormalStep__Group__2__Impl : ( ( rule__NormalStep__LabelAssignment_2 )? ) ;
	public final void rule__NormalStep__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3853:1: ( ( ( rule__NormalStep__LabelAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3854:1: ( ( rule__NormalStep__LabelAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3854:1: ( ( rule__NormalStep__LabelAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3855:1: ( rule__NormalStep__LabelAssignment_2 )?
			{
			 before(grammarAccess.getNormalStepAccess().getLabelAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3856:2: ( rule__NormalStep__LabelAssignment_2 )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==RULE_STRING) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3856:2: rule__NormalStep__LabelAssignment_2
					{
					pushFollow(FOLLOW_rule__NormalStep__LabelAssignment_2_in_rule__NormalStep__Group__2__Impl7739);
					rule__NormalStep__LabelAssignment_2();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getNormalStepAccess().getLabelAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__2__Impl"



	// $ANTLR start "rule__NormalStep__Group__3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3866:1: rule__NormalStep__Group__3 : rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4 ;
	public final void rule__NormalStep__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3870:2: ( rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3871:2: rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__3__Impl_in_rule__NormalStep__Group__37770);
			rule__NormalStep__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__4_in_rule__NormalStep__Group__37773);
			rule__NormalStep__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__3"



	// $ANTLR start "rule__NormalStep__Group__3__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3878:1: rule__NormalStep__Group__3__Impl : ( ( rule__NormalStep__TypeAssignment_3 ) ) ;
	public final void rule__NormalStep__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3882:1: ( ( ( rule__NormalStep__TypeAssignment_3 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3883:1: ( ( rule__NormalStep__TypeAssignment_3 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3883:1: ( ( rule__NormalStep__TypeAssignment_3 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3884:1: ( rule__NormalStep__TypeAssignment_3 )
			{
			 before(grammarAccess.getNormalStepAccess().getTypeAssignment_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3885:2: ( rule__NormalStep__TypeAssignment_3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3885:2: rule__NormalStep__TypeAssignment_3
			{
			pushFollow(FOLLOW_rule__NormalStep__TypeAssignment_3_in_rule__NormalStep__Group__3__Impl7800);
			rule__NormalStep__TypeAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getNormalStepAccess().getTypeAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__3__Impl"



	// $ANTLR start "rule__NormalStep__Group__4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3895:1: rule__NormalStep__Group__4 : rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5 ;
	public final void rule__NormalStep__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3899:2: ( rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3900:2: rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__4__Impl_in_rule__NormalStep__Group__47830);
			rule__NormalStep__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__5_in_rule__NormalStep__Group__47833);
			rule__NormalStep__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__4"



	// $ANTLR start "rule__NormalStep__Group__4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3907:1: rule__NormalStep__Group__4__Impl : ( 'by' ) ;
	public final void rule__NormalStep__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3911:1: ( ( 'by' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3912:1: ( 'by' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3912:1: ( 'by' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3913:1: 'by'
			{
			 before(grammarAccess.getNormalStepAccess().getByKeyword_4()); 
			match(input,19,FOLLOW_19_in_rule__NormalStep__Group__4__Impl7861); 
			 after(grammarAccess.getNormalStepAccess().getByKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__4__Impl"



	// $ANTLR start "rule__NormalStep__Group__5"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3926:1: rule__NormalStep__Group__5 : rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6 ;
	public final void rule__NormalStep__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3930:2: ( rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3931:2: rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__5__Impl_in_rule__NormalStep__Group__57892);
			rule__NormalStep__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__6_in_rule__NormalStep__Group__57895);
			rule__NormalStep__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__5"



	// $ANTLR start "rule__NormalStep__Group__5__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3938:1: rule__NormalStep__Group__5__Impl : ( ( rule__NormalStep__ActorAssignment_5 ) ) ;
	public final void rule__NormalStep__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3942:1: ( ( ( rule__NormalStep__ActorAssignment_5 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3943:1: ( ( rule__NormalStep__ActorAssignment_5 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3943:1: ( ( rule__NormalStep__ActorAssignment_5 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3944:1: ( rule__NormalStep__ActorAssignment_5 )
			{
			 before(grammarAccess.getNormalStepAccess().getActorAssignment_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3945:2: ( rule__NormalStep__ActorAssignment_5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3945:2: rule__NormalStep__ActorAssignment_5
			{
			pushFollow(FOLLOW_rule__NormalStep__ActorAssignment_5_in_rule__NormalStep__Group__5__Impl7922);
			rule__NormalStep__ActorAssignment_5();
			state._fsp--;

			}

			 after(grammarAccess.getNormalStepAccess().getActorAssignment_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__5__Impl"



	// $ANTLR start "rule__NormalStep__Group__6"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3955:1: rule__NormalStep__Group__6 : rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7 ;
	public final void rule__NormalStep__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3959:2: ( rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3960:2: rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__6__Impl_in_rule__NormalStep__Group__67952);
			rule__NormalStep__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__7_in_rule__NormalStep__Group__67955);
			rule__NormalStep__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__6"



	// $ANTLR start "rule__NormalStep__Group__6__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3967:1: rule__NormalStep__Group__6__Impl : ( ( rule__NormalStep__Alternatives_6 )? ) ;
	public final void rule__NormalStep__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3971:1: ( ( ( rule__NormalStep__Alternatives_6 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3972:1: ( ( rule__NormalStep__Alternatives_6 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3972:1: ( ( rule__NormalStep__Alternatives_6 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3973:1: ( rule__NormalStep__Alternatives_6 )?
			{
			 before(grammarAccess.getNormalStepAccess().getAlternatives_6()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3974:2: ( rule__NormalStep__Alternatives_6 )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==16||LA36_0==29) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3974:2: rule__NormalStep__Alternatives_6
					{
					pushFollow(FOLLOW_rule__NormalStep__Alternatives_6_in_rule__NormalStep__Group__6__Impl7982);
					rule__NormalStep__Alternatives_6();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getNormalStepAccess().getAlternatives_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__6__Impl"



	// $ANTLR start "rule__NormalStep__Group__7"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3984:1: rule__NormalStep__Group__7 : rule__NormalStep__Group__7__Impl ;
	public final void rule__NormalStep__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3988:2: ( rule__NormalStep__Group__7__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3989:2: rule__NormalStep__Group__7__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__7__Impl_in_rule__NormalStep__Group__78013);
			rule__NormalStep__Group__7__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__7"



	// $ANTLR start "rule__NormalStep__Group__7__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3995:1: rule__NormalStep__Group__7__Impl : ( ( rule__NormalStep__Group_7__0 )? ) ;
	public final void rule__NormalStep__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3999:1: ( ( ( rule__NormalStep__Group_7__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4000:1: ( ( rule__NormalStep__Group_7__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4000:1: ( ( rule__NormalStep__Group_7__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4001:1: ( rule__NormalStep__Group_7__0 )?
			{
			 before(grammarAccess.getNormalStepAccess().getGroup_7()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4002:2: ( rule__NormalStep__Group_7__0 )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==30) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4002:2: rule__NormalStep__Group_7__0
					{
					pushFollow(FOLLOW_rule__NormalStep__Group_7__0_in_rule__NormalStep__Group__7__Impl8040);
					rule__NormalStep__Group_7__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getNormalStepAccess().getGroup_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group__7__Impl"



	// $ANTLR start "rule__NormalStep__Group_6_0__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4028:1: rule__NormalStep__Group_6_0__0 : rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1 ;
	public final void rule__NormalStep__Group_6_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4032:2: ( rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4033:2: rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__0__Impl_in_rule__NormalStep__Group_6_0__08087);
			rule__NormalStep__Group_6_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__1_in_rule__NormalStep__Group_6_0__08090);
			rule__NormalStep__Group_6_0__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_6_0__0"



	// $ANTLR start "rule__NormalStep__Group_6_0__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4040:1: rule__NormalStep__Group_6_0__0__Impl : ( 'alternatives' ) ;
	public final void rule__NormalStep__Group_6_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4044:1: ( ( 'alternatives' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4045:1: ( 'alternatives' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4045:1: ( 'alternatives' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4046:1: 'alternatives'
			{
			 before(grammarAccess.getNormalStepAccess().getAlternativesKeyword_6_0_0()); 
			match(input,16,FOLLOW_16_in_rule__NormalStep__Group_6_0__0__Impl8118); 
			 after(grammarAccess.getNormalStepAccess().getAlternativesKeyword_6_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_6_0__0__Impl"



	// $ANTLR start "rule__NormalStep__Group_6_0__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4059:1: rule__NormalStep__Group_6_0__1 : rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2 ;
	public final void rule__NormalStep__Group_6_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4063:2: ( rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4064:2: rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__1__Impl_in_rule__NormalStep__Group_6_0__18149);
			rule__NormalStep__Group_6_0__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__2_in_rule__NormalStep__Group_6_0__18152);
			rule__NormalStep__Group_6_0__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_6_0__1"



	// $ANTLR start "rule__NormalStep__Group_6_0__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4071:1: rule__NormalStep__Group_6_0__1__Impl : ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) ) ;
	public final void rule__NormalStep__Group_6_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4075:1: ( ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4076:1: ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4076:1: ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4077:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4077:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4078:1: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4079:2: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4079:2: rule__NormalStep__StepAlternativeAssignment_6_0_1
			{
			pushFollow(FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8181);
			rule__NormalStep__StepAlternativeAssignment_6_0_1();
			state._fsp--;

			}

			 after(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
			}

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4082:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4083:1: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )*
			{
			 before(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4084:2: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==28) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4084:2: rule__NormalStep__StepAlternativeAssignment_6_0_1
					{
					pushFollow(FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8193);
					rule__NormalStep__StepAlternativeAssignment_6_0_1();
					state._fsp--;

					}
					break;

				default :
					break loop38;
				}
			}

			 after(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_6_0__1__Impl"



	// $ANTLR start "rule__NormalStep__Group_6_0__2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4095:1: rule__NormalStep__Group_6_0__2 : rule__NormalStep__Group_6_0__2__Impl ;
	public final void rule__NormalStep__Group_6_0__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4099:2: ( rule__NormalStep__Group_6_0__2__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4100:2: rule__NormalStep__Group_6_0__2__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__2__Impl_in_rule__NormalStep__Group_6_0__28226);
			rule__NormalStep__Group_6_0__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_6_0__2"



	// $ANTLR start "rule__NormalStep__Group_6_0__2__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4106:1: rule__NormalStep__Group_6_0__2__Impl : ( 'else' ) ;
	public final void rule__NormalStep__Group_6_0__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4110:1: ( ( 'else' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4111:1: ( 'else' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4111:1: ( 'else' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4112:1: 'else'
			{
			 before(grammarAccess.getNormalStepAccess().getElseKeyword_6_0_2()); 
			match(input,22,FOLLOW_22_in_rule__NormalStep__Group_6_0__2__Impl8254); 
			 after(grammarAccess.getNormalStepAccess().getElseKeyword_6_0_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_6_0__2__Impl"



	// $ANTLR start "rule__NormalStep__Group_6_1__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4131:1: rule__NormalStep__Group_6_1__0 : rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1 ;
	public final void rule__NormalStep__Group_6_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4135:2: ( rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4136:2: rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_1__0__Impl_in_rule__NormalStep__Group_6_1__08291);
			rule__NormalStep__Group_6_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_6_1__1_in_rule__NormalStep__Group_6_1__08294);
			rule__NormalStep__Group_6_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_6_1__0"



	// $ANTLR start "rule__NormalStep__Group_6_1__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4143:1: rule__NormalStep__Group_6_1__0__Impl : ( 'invoke usecase' ) ;
	public final void rule__NormalStep__Group_6_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4147:1: ( ( 'invoke usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4148:1: ( 'invoke usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4148:1: ( 'invoke usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4149:1: 'invoke usecase'
			{
			 before(grammarAccess.getNormalStepAccess().getInvokeUsecaseKeyword_6_1_0()); 
			match(input,29,FOLLOW_29_in_rule__NormalStep__Group_6_1__0__Impl8322); 
			 after(grammarAccess.getNormalStepAccess().getInvokeUsecaseKeyword_6_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_6_1__0__Impl"



	// $ANTLR start "rule__NormalStep__Group_6_1__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4162:1: rule__NormalStep__Group_6_1__1 : rule__NormalStep__Group_6_1__1__Impl ;
	public final void rule__NormalStep__Group_6_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4166:2: ( rule__NormalStep__Group_6_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4167:2: rule__NormalStep__Group_6_1__1__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_1__1__Impl_in_rule__NormalStep__Group_6_1__18353);
			rule__NormalStep__Group_6_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_6_1__1"



	// $ANTLR start "rule__NormalStep__Group_6_1__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4173:1: rule__NormalStep__Group_6_1__1__Impl : ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) ) ;
	public final void rule__NormalStep__Group_6_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4177:1: ( ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4178:1: ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4178:1: ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4179:1: ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getInvokedUseCaseAssignment_6_1_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4180:2: ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4180:2: rule__NormalStep__InvokedUseCaseAssignment_6_1_1
			{
			pushFollow(FOLLOW_rule__NormalStep__InvokedUseCaseAssignment_6_1_1_in_rule__NormalStep__Group_6_1__1__Impl8380);
			rule__NormalStep__InvokedUseCaseAssignment_6_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getNormalStepAccess().getInvokedUseCaseAssignment_6_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_6_1__1__Impl"



	// $ANTLR start "rule__NormalStep__Group_7__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4194:1: rule__NormalStep__Group_7__0 : rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1 ;
	public final void rule__NormalStep__Group_7__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4198:2: ( rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4199:2: rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_7__0__Impl_in_rule__NormalStep__Group_7__08414);
			rule__NormalStep__Group_7__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_7__1_in_rule__NormalStep__Group_7__08417);
			rule__NormalStep__Group_7__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_7__0"



	// $ANTLR start "rule__NormalStep__Group_7__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4206:1: rule__NormalStep__Group_7__0__Impl : ( 'next' ) ;
	public final void rule__NormalStep__Group_7__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4210:1: ( ( 'next' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4211:1: ( 'next' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4211:1: ( 'next' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4212:1: 'next'
			{
			 before(grammarAccess.getNormalStepAccess().getNextKeyword_7_0()); 
			match(input,30,FOLLOW_30_in_rule__NormalStep__Group_7__0__Impl8445); 
			 after(grammarAccess.getNormalStepAccess().getNextKeyword_7_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_7__0__Impl"



	// $ANTLR start "rule__NormalStep__Group_7__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4225:1: rule__NormalStep__Group_7__1 : rule__NormalStep__Group_7__1__Impl ;
	public final void rule__NormalStep__Group_7__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4229:2: ( rule__NormalStep__Group_7__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4230:2: rule__NormalStep__Group_7__1__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_7__1__Impl_in_rule__NormalStep__Group_7__18476);
			rule__NormalStep__Group_7__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_7__1"



	// $ANTLR start "rule__NormalStep__Group_7__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4236:1: rule__NormalStep__Group_7__1__Impl : ( ( rule__NormalStep__NextAssignment_7_1 ) ) ;
	public final void rule__NormalStep__Group_7__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4240:1: ( ( ( rule__NormalStep__NextAssignment_7_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4241:1: ( ( rule__NormalStep__NextAssignment_7_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4241:1: ( ( rule__NormalStep__NextAssignment_7_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4242:1: ( rule__NormalStep__NextAssignment_7_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getNextAssignment_7_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4243:2: ( rule__NormalStep__NextAssignment_7_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4243:2: rule__NormalStep__NextAssignment_7_1
			{
			pushFollow(FOLLOW_rule__NormalStep__NextAssignment_7_1_in_rule__NormalStep__Group_7__1__Impl8503);
			rule__NormalStep__NextAssignment_7_1();
			state._fsp--;

			}

			 after(grammarAccess.getNormalStepAccess().getNextAssignment_7_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__Group_7__1__Impl"



	// $ANTLR start "rule__QualifiedName__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4257:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
	public final void rule__QualifiedName__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4261:2: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4262:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08537);
			rule__QualifiedName__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08540);
			rule__QualifiedName__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__QualifiedName__Group__0"



	// $ANTLR start "rule__QualifiedName__Group__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4269:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
	public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4273:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4274:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4274:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4275:1: RULE_ID
			{
			 before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8567); 
			 after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__QualifiedName__Group__0__Impl"



	// $ANTLR start "rule__QualifiedName__Group__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4286:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
	public final void rule__QualifiedName__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4290:2: ( rule__QualifiedName__Group__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4291:2: rule__QualifiedName__Group__1__Impl
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18596);
			rule__QualifiedName__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__QualifiedName__Group__1"



	// $ANTLR start "rule__QualifiedName__Group__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4297:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
	public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4301:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4302:1: ( ( rule__QualifiedName__Group_1__0 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4302:1: ( ( rule__QualifiedName__Group_1__0 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4303:1: ( rule__QualifiedName__Group_1__0 )*
			{
			 before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4304:2: ( rule__QualifiedName__Group_1__0 )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==12) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4304:2: rule__QualifiedName__Group_1__0
					{
					pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8623);
					rule__QualifiedName__Group_1__0();
					state._fsp--;

					}
					break;

				default :
					break loop39;
				}
			}

			 after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__QualifiedName__Group__1__Impl"



	// $ANTLR start "rule__QualifiedName__Group_1__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4318:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
	public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4322:2: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4323:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08658);
			rule__QualifiedName__Group_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08661);
			rule__QualifiedName__Group_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__QualifiedName__Group_1__0"



	// $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4330:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
	public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4334:1: ( ( '.' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4335:1: ( '.' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4335:1: ( '.' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4336:1: '.'
			{
			 before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
			match(input,12,FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl8689); 
			 after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__QualifiedName__Group_1__0__Impl"



	// $ANTLR start "rule__QualifiedName__Group_1__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4349:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
	public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4353:2: ( rule__QualifiedName__Group_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4354:2: rule__QualifiedName__Group_1__1__Impl
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18720);
			rule__QualifiedName__Group_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__QualifiedName__Group_1__1"



	// $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4360:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
	public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4364:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4365:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4365:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4366:1: RULE_ID
			{
			 before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8747); 
			 after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__QualifiedName__Group_1__1__Impl"



	// $ANTLR start "rule__UseCase__UnorderedGroup_4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4382:1: rule__UseCase__UnorderedGroup_4 : ( rule__UseCase__UnorderedGroup_4__0 )? ;
	public final void rule__UseCase__UnorderedGroup_4() throws RecognitionException {

		    	int stackSize = keepStackSize();
				getUnorderedGroupHelper().enter(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4387:2: ( ( rule__UseCase__UnorderedGroup_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4388:2: ( rule__UseCase__UnorderedGroup_4__0 )?
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4388:2: ( rule__UseCase__UnorderedGroup_4__0 )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( LA40_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
				alt40=1;
			}
			else if ( LA40_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4388:2: rule__UseCase__UnorderedGroup_4__0
					{
					pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__0_in_rule__UseCase__UnorderedGroup_48781);
					rule__UseCase__UnorderedGroup_4__0();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				getUnorderedGroupHelper().leave(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__UnorderedGroup_4"



	// $ANTLR start "rule__UseCase__UnorderedGroup_4__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4398:1: rule__UseCase__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) ) ;
	public final void rule__UseCase__UnorderedGroup_4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
				boolean selected = false;
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4403:3: ( ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4404:3: ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4404:3: ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( LA41_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
				alt41=1;
			}
			else if ( LA41_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
				alt41=2;
			}

			switch (alt41) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4406:4: ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4406:4: ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4407:5: {...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) )
					{
					if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
						throw new FailedPredicateException(input, "rule__UseCase__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0)");
					}
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4407:104: ( ( ( rule__UseCase__Group_4_0__0 ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4408:6: ( ( rule__UseCase__Group_4_0__0 ) )
					{
					 
						 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0);
						 				

						 				  selected = true;
						 				
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4414:6: ( ( rule__UseCase__Group_4_0__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4416:7: ( rule__UseCase__Group_4_0__0 )
					{
					 before(grammarAccess.getUseCaseAccess().getGroup_4_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4417:7: ( rule__UseCase__Group_4_0__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4417:8: rule__UseCase__Group_4_0__0
					{
					pushFollow(FOLLOW_rule__UseCase__Group_4_0__0_in_rule__UseCase__UnorderedGroup_4__Impl8868);
					rule__UseCase__Group_4_0__0();
					state._fsp--;

					}

					 after(grammarAccess.getUseCaseAccess().getGroup_4_0()); 
					}

					}

					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4423:4: ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4423:4: ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4424:5: {...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) )
					{
					if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
						throw new FailedPredicateException(input, "rule__UseCase__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1)");
					}
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4424:104: ( ( ( rule__UseCase__Group_4_1__0 ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4425:6: ( ( rule__UseCase__Group_4_1__0 ) )
					{
					 
						 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1);
						 				

						 				  selected = true;
						 				
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4431:6: ( ( rule__UseCase__Group_4_1__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4433:7: ( rule__UseCase__Group_4_1__0 )
					{
					 before(grammarAccess.getUseCaseAccess().getGroup_4_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4434:7: ( rule__UseCase__Group_4_1__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4434:8: rule__UseCase__Group_4_1__0
					{
					pushFollow(FOLLOW_rule__UseCase__Group_4_1__0_in_rule__UseCase__UnorderedGroup_4__Impl8959);
					rule__UseCase__Group_4_1__0();
					state._fsp--;

					}

					 after(grammarAccess.getUseCaseAccess().getGroup_4_1()); 
					}

					}

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				if (selected)
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__UnorderedGroup_4__Impl"



	// $ANTLR start "rule__UseCase__UnorderedGroup_4__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4449:1: rule__UseCase__UnorderedGroup_4__0 : rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )? ;
	public final void rule__UseCase__UnorderedGroup_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4453:2: ( rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4454:2: rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )?
			{
			pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__09018);
			rule__UseCase__UnorderedGroup_4__Impl();
			state._fsp--;

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4455:2: ( rule__UseCase__UnorderedGroup_4__1 )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( LA42_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
				alt42=1;
			}
			else if ( LA42_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4455:2: rule__UseCase__UnorderedGroup_4__1
					{
					pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__1_in_rule__UseCase__UnorderedGroup_4__09021);
					rule__UseCase__UnorderedGroup_4__1();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__UnorderedGroup_4__0"



	// $ANTLR start "rule__UseCase__UnorderedGroup_4__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4462:1: rule__UseCase__UnorderedGroup_4__1 : rule__UseCase__UnorderedGroup_4__Impl ;
	public final void rule__UseCase__UnorderedGroup_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4466:2: ( rule__UseCase__UnorderedGroup_4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4467:2: rule__UseCase__UnorderedGroup_4__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__19046);
			rule__UseCase__UnorderedGroup_4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__UnorderedGroup_4__1"



	// $ANTLR start "rule__UseCasesModel__PackagesAssignment"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4478:1: rule__UseCasesModel__PackagesAssignment : ( rulePackageDeclaration ) ;
	public final void rule__UseCasesModel__PackagesAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4482:1: ( ( rulePackageDeclaration ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4483:1: ( rulePackageDeclaration )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4483:1: ( rulePackageDeclaration )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4484:1: rulePackageDeclaration
			{
			 before(grammarAccess.getUseCasesModelAccess().getPackagesPackageDeclarationParserRuleCall_0()); 
			pushFollow(FOLLOW_rulePackageDeclaration_in_rule__UseCasesModel__PackagesAssignment9078);
			rulePackageDeclaration();
			state._fsp--;

			 after(grammarAccess.getUseCasesModelAccess().getPackagesPackageDeclarationParserRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCasesModel__PackagesAssignment"



	// $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4493:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
	public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4497:1: ( ( ruleQualifiedName ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4498:1: ( ruleQualifiedName )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4498:1: ( ruleQualifiedName )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4499:1: ruleQualifiedName
			{
			 before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19109);
			ruleQualifiedName();
			state._fsp--;

			 after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__NameAssignment_1"



	// $ANTLR start "rule__PackageDeclaration__DescriptionAssignment_2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4508:1: rule__PackageDeclaration__DescriptionAssignment_2 : ( RULE_STRING ) ;
	public final void rule__PackageDeclaration__DescriptionAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4512:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4513:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4513:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4514:1: RULE_STRING
			{
			 before(grammarAccess.getPackageDeclarationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DescriptionAssignment_29140); 
			 after(grammarAccess.getPackageDeclarationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__DescriptionAssignment_2"



	// $ANTLR start "rule__PackageDeclaration__ActorsAssignment_3_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4523:1: rule__PackageDeclaration__ActorsAssignment_3_1 : ( ruleActor ) ;
	public final void rule__PackageDeclaration__ActorsAssignment_3_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4527:1: ( ( ruleActor ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4528:1: ( ruleActor )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4528:1: ( ruleActor )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4529:1: ruleActor
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsActorParserRuleCall_3_1_0()); 
			pushFollow(FOLLOW_ruleActor_in_rule__PackageDeclaration__ActorsAssignment_3_19171);
			ruleActor();
			state._fsp--;

			 after(grammarAccess.getPackageDeclarationAccess().getActorsActorParserRuleCall_3_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__ActorsAssignment_3_1"



	// $ANTLR start "rule__PackageDeclaration__UseCasesAssignment_4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4538:1: rule__PackageDeclaration__UseCasesAssignment_4 : ( ruleUseCase ) ;
	public final void rule__PackageDeclaration__UseCasesAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4542:1: ( ( ruleUseCase ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4543:1: ( ruleUseCase )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4543:1: ( ruleUseCase )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4544:1: ruleUseCase
			{
			 before(grammarAccess.getPackageDeclarationAccess().getUseCasesUseCaseParserRuleCall_4_0()); 
			pushFollow(FOLLOW_ruleUseCase_in_rule__PackageDeclaration__UseCasesAssignment_49202);
			ruleUseCase();
			state._fsp--;

			 after(grammarAccess.getPackageDeclarationAccess().getUseCasesUseCaseParserRuleCall_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageDeclaration__UseCasesAssignment_4"



	// $ANTLR start "rule__UseCase__NameAssignment_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4553:1: rule__UseCase__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4557:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4558:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4558:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4559:1: RULE_ID
			{
			 before(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseCase__NameAssignment_19233); 
			 after(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__NameAssignment_1"



	// $ANTLR start "rule__UseCase__DescriptionAssignment_2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4568:1: rule__UseCase__DescriptionAssignment_2 : ( RULE_STRING ) ;
	public final void rule__UseCase__DescriptionAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4572:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4573:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4573:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4574:1: RULE_STRING
			{
			 before(grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UseCase__DescriptionAssignment_29264); 
			 after(grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__DescriptionAssignment_2"



	// $ANTLR start "rule__UseCase__SuperCaseAssignment_3_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4583:1: rule__UseCase__SuperCaseAssignment_3_1 : ( ( RULE_ID ) ) ;
	public final void rule__UseCase__SuperCaseAssignment_3_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4587:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4588:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4588:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4589:1: ( RULE_ID )
			{
			 before(grammarAccess.getUseCaseAccess().getSuperCaseUseCaseCrossReference_3_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4590:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4591:1: RULE_ID
			{
			 before(grammarAccess.getUseCaseAccess().getSuperCaseUseCaseIDTerminalRuleCall_3_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseCase__SuperCaseAssignment_3_19299); 
			 after(grammarAccess.getUseCaseAccess().getSuperCaseUseCaseIDTerminalRuleCall_3_1_0_1()); 
			}

			 after(grammarAccess.getUseCaseAccess().getSuperCaseUseCaseCrossReference_3_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__SuperCaseAssignment_3_1"



	// $ANTLR start "rule__UseCase__PreconditionsAssignment_4_0_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4602:1: rule__UseCase__PreconditionsAssignment_4_0_1 : ( ruleUCCondition ) ;
	public final void rule__UseCase__PreconditionsAssignment_4_0_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4606:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4607:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4607:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4608:1: ruleUCCondition
			{
			 before(grammarAccess.getUseCaseAccess().getPreconditionsUCConditionParserRuleCall_4_0_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__UseCase__PreconditionsAssignment_4_0_19334);
			ruleUCCondition();
			state._fsp--;

			 after(grammarAccess.getUseCaseAccess().getPreconditionsUCConditionParserRuleCall_4_0_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__PreconditionsAssignment_4_0_1"



	// $ANTLR start "rule__UseCase__PostconditionsAssignment_4_1_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4617:1: rule__UseCase__PostconditionsAssignment_4_1_1 : ( ruleUCCondition ) ;
	public final void rule__UseCase__PostconditionsAssignment_4_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4621:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4622:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4622:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4623:1: ruleUCCondition
			{
			 before(grammarAccess.getUseCaseAccess().getPostconditionsUCConditionParserRuleCall_4_1_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__UseCase__PostconditionsAssignment_4_1_19365);
			ruleUCCondition();
			state._fsp--;

			 after(grammarAccess.getUseCaseAccess().getPostconditionsUCConditionParserRuleCall_4_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__PostconditionsAssignment_4_1_1"



	// $ANTLR start "rule__UseCase__FlowsAssignment_5"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4632:1: rule__UseCase__FlowsAssignment_5 : ( ruleFlow ) ;
	public final void rule__UseCase__FlowsAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4636:1: ( ( ruleFlow ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4637:1: ( ruleFlow )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4637:1: ( ruleFlow )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4638:1: ruleFlow
			{
			 before(grammarAccess.getUseCaseAccess().getFlowsFlowParserRuleCall_5_0()); 
			pushFollow(FOLLOW_ruleFlow_in_rule__UseCase__FlowsAssignment_59396);
			ruleFlow();
			state._fsp--;

			 after(grammarAccess.getUseCaseAccess().getFlowsFlowParserRuleCall_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__FlowsAssignment_5"



	// $ANTLR start "rule__UCCondition__NameAssignment"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4647:1: rule__UCCondition__NameAssignment : ( RULE_STRING ) ;
	public final void rule__UCCondition__NameAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4651:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4652:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4652:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4653:1: RULE_STRING
			{
			 before(grammarAccess.getUCConditionAccess().getNameSTRINGTerminalRuleCall_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UCCondition__NameAssignment9427); 
			 after(grammarAccess.getUCConditionAccess().getNameSTRINGTerminalRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UCCondition__NameAssignment"



	// $ANTLR start "rule__Actor__NameAssignment_0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4662:1: rule__Actor__NameAssignment_0 : ( RULE_ID ) ;
	public final void rule__Actor__NameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4666:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4667:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4667:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4668:1: RULE_ID
			{
			 before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_09458); 
			 after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__NameAssignment_0"



	// $ANTLR start "rule__Actor__TypeAssignment_2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4677:1: rule__Actor__TypeAssignment_2 : ( ruleActorType ) ;
	public final void rule__Actor__TypeAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4681:1: ( ( ruleActorType ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4682:1: ( ruleActorType )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4682:1: ( ruleActorType )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4683:1: ruleActorType
			{
			 before(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleActorType_in_rule__Actor__TypeAssignment_29489);
			ruleActorType();
			state._fsp--;

			 after(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__TypeAssignment_2"



	// $ANTLR start "rule__Actor__DescriptionAssignment_3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4692:1: rule__Actor__DescriptionAssignment_3 : ( RULE_STRING ) ;
	public final void rule__Actor__DescriptionAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4696:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4697:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4697:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4698:1: RULE_STRING
			{
			 before(grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Actor__DescriptionAssignment_39520); 
			 after(grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__DescriptionAssignment_3"



	// $ANTLR start "rule__Actor__ExtendsAssignment_4_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4707:1: rule__Actor__ExtendsAssignment_4_1 : ( ( RULE_ID ) ) ;
	public final void rule__Actor__ExtendsAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4711:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4712:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4712:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4713:1: ( RULE_ID )
			{
			 before(grammarAccess.getActorAccess().getExtendsActorCrossReference_4_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4714:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4715:1: RULE_ID
			{
			 before(grammarAccess.getActorAccess().getExtendsActorIDTerminalRuleCall_4_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__ExtendsAssignment_4_19555); 
			 after(grammarAccess.getActorAccess().getExtendsActorIDTerminalRuleCall_4_1_0_1()); 
			}

			 after(grammarAccess.getActorAccess().getExtendsActorCrossReference_4_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Actor__ExtendsAssignment_4_1"



	// $ANTLR start "rule__BasicFlow__StepsAssignment_2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4726:1: rule__BasicFlow__StepsAssignment_2 : ( ruleStep ) ;
	public final void rule__BasicFlow__StepsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4730:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4731:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4731:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4732:1: ruleStep
			{
			 before(grammarAccess.getBasicFlowAccess().getStepsStepParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__BasicFlow__StepsAssignment_29590);
			ruleStep();
			state._fsp--;

			 after(grammarAccess.getBasicFlowAccess().getStepsStepParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__StepsAssignment_2"



	// $ANTLR start "rule__BasicFlow__FinalStateAssignment_4_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4741:1: rule__BasicFlow__FinalStateAssignment_4_1 : ( ruleUCCondition ) ;
	public final void rule__BasicFlow__FinalStateAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4745:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4746:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4746:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4747:1: ruleUCCondition
			{
			 before(grammarAccess.getBasicFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__BasicFlow__FinalStateAssignment_4_19621);
			ruleUCCondition();
			state._fsp--;

			 after(grammarAccess.getBasicFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__BasicFlow__FinalStateAssignment_4_1"



	// $ANTLR start "rule__ExceptionFlow__NameAssignment_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4756:1: rule__ExceptionFlow__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__ExceptionFlow__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4760:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4761:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4761:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4762:1: RULE_ID
			{
			 before(grammarAccess.getExceptionFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExceptionFlow__NameAssignment_19652); 
			 after(grammarAccess.getExceptionFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__NameAssignment_1"



	// $ANTLR start "rule__ExceptionFlow__ConditionAssignment_3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4771:1: rule__ExceptionFlow__ConditionAssignment_3 : ( RULE_STRING ) ;
	public final void rule__ExceptionFlow__ConditionAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4775:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4776:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4776:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4777:1: RULE_STRING
			{
			 before(grammarAccess.getExceptionFlowAccess().getConditionSTRINGTerminalRuleCall_3_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExceptionFlow__ConditionAssignment_39683); 
			 after(grammarAccess.getExceptionFlowAccess().getConditionSTRINGTerminalRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__ConditionAssignment_3"



	// $ANTLR start "rule__ExceptionFlow__StepsAssignment_5"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4786:1: rule__ExceptionFlow__StepsAssignment_5 : ( ruleStep ) ;
	public final void rule__ExceptionFlow__StepsAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4790:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4791:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4791:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4792:1: ruleStep
			{
			 before(grammarAccess.getExceptionFlowAccess().getStepsStepParserRuleCall_5_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__ExceptionFlow__StepsAssignment_59714);
			ruleStep();
			state._fsp--;

			 after(grammarAccess.getExceptionFlowAccess().getStepsStepParserRuleCall_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__StepsAssignment_5"



	// $ANTLR start "rule__ExceptionFlow__FinalStateAssignment_7_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4801:1: rule__ExceptionFlow__FinalStateAssignment_7_1 : ( ruleUCCondition ) ;
	public final void rule__ExceptionFlow__FinalStateAssignment_7_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4805:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4806:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4806:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4807:1: ruleUCCondition
			{
			 before(grammarAccess.getExceptionFlowAccess().getFinalStateUCConditionParserRuleCall_7_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__ExceptionFlow__FinalStateAssignment_7_19745);
			ruleUCCondition();
			state._fsp--;

			 after(grammarAccess.getExceptionFlowAccess().getFinalStateUCConditionParserRuleCall_7_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ExceptionFlow__FinalStateAssignment_7_1"



	// $ANTLR start "rule__AlternativeFlow__NameAssignment_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4816:1: rule__AlternativeFlow__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__AlternativeFlow__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4820:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4821:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4821:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4822:1: RULE_ID
			{
			 before(grammarAccess.getAlternativeFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlow__NameAssignment_19776); 
			 after(grammarAccess.getAlternativeFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__NameAssignment_1"



	// $ANTLR start "rule__AlternativeFlow__StepsAssignment_2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4831:1: rule__AlternativeFlow__StepsAssignment_2 : ( ruleStep ) ;
	public final void rule__AlternativeFlow__StepsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4835:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4836:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4836:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4837:1: ruleStep
			{
			 before(grammarAccess.getAlternativeFlowAccess().getStepsStepParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__AlternativeFlow__StepsAssignment_29807);
			ruleStep();
			state._fsp--;

			 after(grammarAccess.getAlternativeFlowAccess().getStepsStepParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__StepsAssignment_2"



	// $ANTLR start "rule__AlternativeFlow__FinalStateAssignment_4_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4846:1: rule__AlternativeFlow__FinalStateAssignment_4_1 : ( ruleUCCondition ) ;
	public final void rule__AlternativeFlow__FinalStateAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4850:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4851:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4851:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4852:1: ruleUCCondition
			{
			 before(grammarAccess.getAlternativeFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__AlternativeFlow__FinalStateAssignment_4_19838);
			ruleUCCondition();
			state._fsp--;

			 after(grammarAccess.getAlternativeFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlow__FinalStateAssignment_4_1"



	// $ANTLR start "rule__ParallelFlow__NameAssignment_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4861:1: rule__ParallelFlow__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__ParallelFlow__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4865:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4866:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4866:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4867:1: RULE_ID
			{
			 before(grammarAccess.getParallelFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelFlow__NameAssignment_19869); 
			 after(grammarAccess.getParallelFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__NameAssignment_1"



	// $ANTLR start "rule__ParallelFlow__StepsAssignment_2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4876:1: rule__ParallelFlow__StepsAssignment_2 : ( ruleStep ) ;
	public final void rule__ParallelFlow__StepsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4880:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4881:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4881:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4882:1: ruleStep
			{
			 before(grammarAccess.getParallelFlowAccess().getStepsStepParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__ParallelFlow__StepsAssignment_29900);
			ruleStep();
			state._fsp--;

			 after(grammarAccess.getParallelFlowAccess().getStepsStepParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__StepsAssignment_2"



	// $ANTLR start "rule__ParallelFlow__FinalStateAssignment_4_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4891:1: rule__ParallelFlow__FinalStateAssignment_4_1 : ( ruleUCCondition ) ;
	public final void rule__ParallelFlow__FinalStateAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4895:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4896:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4896:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4897:1: ruleUCCondition
			{
			 before(grammarAccess.getParallelFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__ParallelFlow__FinalStateAssignment_4_19931);
			ruleUCCondition();
			state._fsp--;

			 after(grammarAccess.getParallelFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelFlow__FinalStateAssignment_4_1"



	// $ANTLR start "rule__Condition__ConditionAssignment_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4906:1: rule__Condition__ConditionAssignment_1 : ( RULE_STRING ) ;
	public final void rule__Condition__ConditionAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4910:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4911:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4911:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4912:1: RULE_STRING
			{
			 before(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Condition__ConditionAssignment_19962); 
			 after(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__ConditionAssignment_1"



	// $ANTLR start "rule__Condition__ContinuationAssignment_3_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4921:1: rule__Condition__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
	public final void rule__Condition__ContinuationAssignment_3_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4925:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4926:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4926:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4927:1: ( RULE_ID )
			{
			 before(grammarAccess.getConditionAccess().getContinuationStepCrossReference_3_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4928:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4929:1: RULE_ID
			{
			 before(grammarAccess.getConditionAccess().getContinuationStepIDTerminalRuleCall_3_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Condition__ContinuationAssignment_3_19997); 
			 after(grammarAccess.getConditionAccess().getContinuationStepIDTerminalRuleCall_3_1_0_1()); 
			}

			 after(grammarAccess.getConditionAccess().getContinuationStepCrossReference_3_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Condition__ContinuationAssignment_3_1"



	// $ANTLR start "rule__LocalAlternative__ConditionAssignment_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4940:1: rule__LocalAlternative__ConditionAssignment_1 : ( RULE_STRING ) ;
	public final void rule__LocalAlternative__ConditionAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4944:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4945:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4945:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4946:1: RULE_STRING
			{
			 before(grammarAccess.getLocalAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LocalAlternative__ConditionAssignment_110032); 
			 after(grammarAccess.getLocalAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__ConditionAssignment_1"



	// $ANTLR start "rule__LocalAlternative__DescriptionAssignment_3_0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4955:1: rule__LocalAlternative__DescriptionAssignment_3_0 : ( RULE_STRING ) ;
	public final void rule__LocalAlternative__DescriptionAssignment_3_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4959:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4960:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4960:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4961:1: RULE_STRING
			{
			 before(grammarAccess.getLocalAlternativeAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LocalAlternative__DescriptionAssignment_3_010063); 
			 after(grammarAccess.getLocalAlternativeAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__DescriptionAssignment_3_0"



	// $ANTLR start "rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4970:1: rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 : ( ( RULE_ID ) ) ;
	public final void rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4974:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4975:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4975:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4976:1: ( RULE_ID )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseCrossReference_3_1_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4977:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4978:1: RULE_ID
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseIDTerminalRuleCall_3_1_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_110098); 
			 after(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseIDTerminalRuleCall_3_1_1_0_1()); 
			}

			 after(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseCrossReference_3_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1"



	// $ANTLR start "rule__LocalAlternative__ContinuationAssignment_4_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4989:1: rule__LocalAlternative__ContinuationAssignment_4_1 : ( ( RULE_ID ) ) ;
	public final void rule__LocalAlternative__ContinuationAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4993:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4994:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4994:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4995:1: ( RULE_ID )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinuationStepCrossReference_4_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4996:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4997:1: RULE_ID
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinuationStepIDTerminalRuleCall_4_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalAlternative__ContinuationAssignment_4_110137); 
			 after(grammarAccess.getLocalAlternativeAccess().getContinuationStepIDTerminalRuleCall_4_1_0_1()); 
			}

			 after(grammarAccess.getLocalAlternativeAccess().getContinuationStepCrossReference_4_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__LocalAlternative__ContinuationAssignment_4_1"



	// $ANTLR start "rule__AlternativeFlowAlternative__ConditionAssignment_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5008:1: rule__AlternativeFlowAlternative__ConditionAssignment_1 : ( RULE_STRING ) ;
	public final void rule__AlternativeFlowAlternative__ConditionAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5012:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5013:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5013:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5014:1: RULE_STRING
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AlternativeFlowAlternative__ConditionAssignment_110172); 
			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__ConditionAssignment_1"



	// $ANTLR start "rule__AlternativeFlowAlternative__RefAssignment_4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5023:1: rule__AlternativeFlowAlternative__RefAssignment_4 : ( ( RULE_ID ) ) ;
	public final void rule__AlternativeFlowAlternative__RefAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5027:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5028:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5028:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5029:1: ( RULE_ID )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowCrossReference_4_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5030:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5031:1: RULE_ID
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowIDTerminalRuleCall_4_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__RefAssignment_410207); 
			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowIDTerminalRuleCall_4_0_1()); 
			}

			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowCrossReference_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__RefAssignment_4"



	// $ANTLR start "rule__AlternativeFlowAlternative__ContinuationAssignment_5_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5042:1: rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 : ( ( RULE_ID ) ) ;
	public final void rule__AlternativeFlowAlternative__ContinuationAssignment_5_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5046:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5047:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5047:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5048:1: ( RULE_ID )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepCrossReference_5_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5049:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5050:1: RULE_ID
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepIDTerminalRuleCall_5_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__ContinuationAssignment_5_110246); 
			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepIDTerminalRuleCall_5_1_0_1()); 
			}

			 after(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepCrossReference_5_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__AlternativeFlowAlternative__ContinuationAssignment_5_1"



	// $ANTLR start "rule__ParallelStep__NameAssignment_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5061:1: rule__ParallelStep__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__ParallelStep__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5065:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5066:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5066:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5067:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__NameAssignment_110281); 
			 after(grammarAccess.getParallelStepAccess().getNameIDTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__NameAssignment_1"



	// $ANTLR start "rule__ParallelStep__LabelAssignment_2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5076:1: rule__ParallelStep__LabelAssignment_2 : ( RULE_STRING ) ;
	public final void rule__ParallelStep__LabelAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5080:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5081:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5081:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5082:1: RULE_STRING
			{
			 before(grammarAccess.getParallelStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ParallelStep__LabelAssignment_210312); 
			 after(grammarAccess.getParallelStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__LabelAssignment_2"



	// $ANTLR start "rule__ParallelStep__InvokedFlowsAssignment_3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5091:1: rule__ParallelStep__InvokedFlowsAssignment_3 : ( ( RULE_ID ) ) ;
	public final void rule__ParallelStep__InvokedFlowsAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5095:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5096:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5096:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5097:1: ( RULE_ID )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_3_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5098:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5099:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowIDTerminalRuleCall_3_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_310347); 
			 after(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowIDTerminalRuleCall_3_0_1()); 
			}

			 after(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__InvokedFlowsAssignment_3"



	// $ANTLR start "rule__ParallelStep__InvokedFlowsAssignment_4_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5110:1: rule__ParallelStep__InvokedFlowsAssignment_4_1 : ( ( RULE_ID ) ) ;
	public final void rule__ParallelStep__InvokedFlowsAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5114:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5115:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5115:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5116:1: ( RULE_ID )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_4_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5117:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5118:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowIDTerminalRuleCall_4_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_4_110386); 
			 after(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowIDTerminalRuleCall_4_1_0_1()); 
			}

			 after(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_4_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__InvokedFlowsAssignment_4_1"



	// $ANTLR start "rule__ParallelStep__NextAssignment_5_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5129:1: rule__ParallelStep__NextAssignment_5_1 : ( ( RULE_ID ) ) ;
	public final void rule__ParallelStep__NextAssignment_5_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5133:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5134:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5134:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5135:1: ( RULE_ID )
			{
			 before(grammarAccess.getParallelStepAccess().getNextStepCrossReference_5_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5136:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5137:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getNextStepIDTerminalRuleCall_5_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__NextAssignment_5_110425); 
			 after(grammarAccess.getParallelStepAccess().getNextStepIDTerminalRuleCall_5_1_0_1()); 
			}

			 after(grammarAccess.getParallelStepAccess().getNextStepCrossReference_5_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ParallelStep__NextAssignment_5_1"



	// $ANTLR start "rule__NormalStep__NameAssignment_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5148:1: rule__NormalStep__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__NormalStep__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5152:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5153:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5153:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5154:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__NameAssignment_110460); 
			 after(grammarAccess.getNormalStepAccess().getNameIDTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__NameAssignment_1"



	// $ANTLR start "rule__NormalStep__LabelAssignment_2"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5163:1: rule__NormalStep__LabelAssignment_2 : ( RULE_STRING ) ;
	public final void rule__NormalStep__LabelAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5167:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5168:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5168:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5169:1: RULE_STRING
			{
			 before(grammarAccess.getNormalStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NormalStep__LabelAssignment_210491); 
			 after(grammarAccess.getNormalStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__LabelAssignment_2"



	// $ANTLR start "rule__NormalStep__TypeAssignment_3"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5178:1: rule__NormalStep__TypeAssignment_3 : ( ruleStepType ) ;
	public final void rule__NormalStep__TypeAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5182:1: ( ( ruleStepType ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5183:1: ( ruleStepType )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5183:1: ( ruleStepType )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5184:1: ruleStepType
			{
			 before(grammarAccess.getNormalStepAccess().getTypeStepTypeEnumRuleCall_3_0()); 
			pushFollow(FOLLOW_ruleStepType_in_rule__NormalStep__TypeAssignment_310522);
			ruleStepType();
			state._fsp--;

			 after(grammarAccess.getNormalStepAccess().getTypeStepTypeEnumRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__TypeAssignment_3"



	// $ANTLR start "rule__NormalStep__ActorAssignment_5"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5193:1: rule__NormalStep__ActorAssignment_5 : ( ( RULE_ID ) ) ;
	public final void rule__NormalStep__ActorAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5197:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5198:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5198:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5199:1: ( RULE_ID )
			{
			 before(grammarAccess.getNormalStepAccess().getActorActorCrossReference_5_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5200:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5201:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getActorActorIDTerminalRuleCall_5_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__ActorAssignment_510557); 
			 after(grammarAccess.getNormalStepAccess().getActorActorIDTerminalRuleCall_5_0_1()); 
			}

			 after(grammarAccess.getNormalStepAccess().getActorActorCrossReference_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__ActorAssignment_5"



	// $ANTLR start "rule__NormalStep__StepAlternativeAssignment_6_0_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5212:1: rule__NormalStep__StepAlternativeAssignment_6_0_1 : ( ruleStepAlternative ) ;
	public final void rule__NormalStep__StepAlternativeAssignment_6_0_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5216:1: ( ( ruleStepAlternative ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5217:1: ( ruleStepAlternative )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5217:1: ( ruleStepAlternative )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5218:1: ruleStepAlternative
			{
			 before(grammarAccess.getNormalStepAccess().getStepAlternativeStepAlternativeParserRuleCall_6_0_1_0()); 
			pushFollow(FOLLOW_ruleStepAlternative_in_rule__NormalStep__StepAlternativeAssignment_6_0_110592);
			ruleStepAlternative();
			state._fsp--;

			 after(grammarAccess.getNormalStepAccess().getStepAlternativeStepAlternativeParserRuleCall_6_0_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__StepAlternativeAssignment_6_0_1"



	// $ANTLR start "rule__NormalStep__InvokedUseCaseAssignment_6_1_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5227:1: rule__NormalStep__InvokedUseCaseAssignment_6_1_1 : ( ( RULE_ID ) ) ;
	public final void rule__NormalStep__InvokedUseCaseAssignment_6_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5231:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5232:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5232:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5233:1: ( RULE_ID )
			{
			 before(grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseCrossReference_6_1_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5234:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5235:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseIDTerminalRuleCall_6_1_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__InvokedUseCaseAssignment_6_1_110627); 
			 after(grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseIDTerminalRuleCall_6_1_1_0_1()); 
			}

			 after(grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseCrossReference_6_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__InvokedUseCaseAssignment_6_1_1"



	// $ANTLR start "rule__NormalStep__NextAssignment_7_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5246:1: rule__NormalStep__NextAssignment_7_1 : ( ( RULE_ID ) ) ;
	public final void rule__NormalStep__NextAssignment_7_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5250:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5251:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5251:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5252:1: ( RULE_ID )
			{
			 before(grammarAccess.getNormalStepAccess().getNextStepCrossReference_7_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5253:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5254:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getNextStepIDTerminalRuleCall_7_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__NextAssignment_7_110666); 
			 after(grammarAccess.getNormalStepAccess().getNextStepIDTerminalRuleCall_7_1_0_1()); 
			}

			 after(grammarAccess.getNormalStepAccess().getNextStepCrossReference_7_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__NormalStep__NextAssignment_7_1"

	// Delegated rules



	public static final BitSet FOLLOW_ruleUseCasesModel_in_entryRuleUseCasesModel61 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleUseCasesModel68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCasesModel__PackagesAssignment_in_ruleUseCasesModel94 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration122 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase182 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleUseCase189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__0_in_ruleUseCase215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_entryRuleUCCondition242 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleUCCondition249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UCCondition__NameAssignment_in_ruleUCCondition275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActor_in_entryRuleActor302 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleActor309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__0_in_ruleActor335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_entryRuleStep362 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStep369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Step__Alternatives_in_ruleStep395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow422 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleFlow429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Flow__Alternatives_in_ruleFlow455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow482 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleBasicFlow489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__0_in_ruleBasicFlow515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNamedFlow_in_entryRuleNamedFlow542 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleNamedFlow549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NamedFlow__Alternatives_in_ruleNamedFlow575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExceptionFlow_in_entryRuleExceptionFlow602 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleExceptionFlow609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__0_in_ruleExceptionFlow635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow662 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlow669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__0_in_ruleAlternativeFlow695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelFlow_in_entryRuleParallelFlow722 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParallelFlow729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__0_in_ruleParallelFlow755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStepAlternative_in_entryRuleStepAlternative782 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStepAlternative789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__StepAlternative__Alternatives_in_ruleStepAlternative815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition842 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleCondition849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLocalAlternative_in_entryRuleLocalAlternative902 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleLocalAlternative909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__0_in_ruleLocalAlternative935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlowAlternative_in_entryRuleAlternativeFlowAlternative962 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlowAlternative969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__0_in_ruleAlternativeFlowAlternative995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelStep_in_entryRuleParallelStep1022 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParallelStep1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__0_in_ruleParallelStep1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNormalStep_in_entryRuleNormalStep1082 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleNormalStep1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__0_in_ruleNormalStep1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1142 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ActorType__Alternatives_in_ruleActorType1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__StepType__Alternatives_in_ruleStepType1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNormalStep_in_rule__Step__Alternatives1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelStep_in_rule__Step__Alternatives1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBasicFlow_in_rule__Flow__Alternatives1332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNamedFlow_in_rule__Flow__Alternatives1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExceptionFlow_in_rule__NamedFlow__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlow_in_rule__NamedFlow__Alternatives1398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelFlow_in_rule__NamedFlow__Alternatives1415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCondition_in_rule__StepAlternative__Alternatives1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLocalAlternative_in_rule__StepAlternative__Alternatives1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlowAlternative_in_rule__StepAlternative__Alternatives1481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__DescriptionAssignment_3_0_in_rule__LocalAlternative__Alternatives_31513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__0_in_rule__LocalAlternative__Alternatives_31531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__0_in_rule__NormalStep__Alternatives_61564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__0_in_rule__NormalStep__Alternatives_61582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_rule__ActorType__Alternatives1616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_rule__ActorType__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_rule__ActorType__Alternatives1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_rule__StepType__Alternatives1694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_rule__StepType__Alternatives1715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_rule__StepType__Alternatives1736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_rule__StepType__Alternatives1757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__StepType__Alternatives1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01811 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_rule__PackageDeclaration__Group__0__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11873 = new BitSet(new long[]{0x0000080001002200L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21933 = new BitSet(new long[]{0x0000080001002000L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__DescriptionAssignment_2_in_rule__PackageDeclaration__Group__2__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31994 = new BitSet(new long[]{0x0000080001000000L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42055 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__UseCasesAssignment_4_in_rule__PackageDeclaration__Group__4__Impl2085 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_rule__PackageDeclaration__Group__5__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02187 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_rule__PackageDeclaration__Group_3__0__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__12249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2278 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2290 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__02327 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__02330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_rule__UseCase__Group__0__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__12389 = new BitSet(new long[]{0x0000006008000200L});
	public static final BitSet FOLLOW_rule__UseCase__Group__2_in_rule__UseCase__Group__12392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__NameAssignment_1_in_rule__UseCase__Group__1__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__2__Impl_in_rule__UseCase__Group__22449 = new BitSet(new long[]{0x0000006008000000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__3_in_rule__UseCase__Group__22452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__DescriptionAssignment_2_in_rule__UseCase__Group__2__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__3__Impl_in_rule__UseCase__Group__32510 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__4_in_rule__UseCase__Group__32513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__0_in_rule__UseCase__Group__3__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__4__Impl_in_rule__UseCase__Group__42571 = new BitSet(new long[]{0x0000000206048000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__5_in_rule__UseCase__Group__42574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4_in_rule__UseCase__Group__4__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__5__Impl_in_rule__UseCase__Group__52631 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__6_in_rule__UseCase__Group__52634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__FlowsAssignment_5_in_rule__UseCase__Group__5__Impl2661 = new BitSet(new long[]{0x0000000204048002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__6__Impl_in_rule__UseCase__Group__62692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_rule__UseCase__Group__6__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__0__Impl_in_rule__UseCase__Group_3__02765 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__1_in_rule__UseCase__Group_3__02768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_rule__UseCase__Group_3__0__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__1__Impl_in_rule__UseCase__Group_3__12827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__SuperCaseAssignment_3_1_in_rule__UseCase__Group_3__1__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__0__Impl_in_rule__UseCase__Group_4_0__02888 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__1_in_rule__UseCase__Group_4_0__02891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_rule__UseCase__Group_4_0__0__Impl2919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__1__Impl_in_rule__UseCase__Group_4_0__12950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl2979 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl2991 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__0__Impl_in_rule__UseCase__Group_4_1__03028 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__1_in_rule__UseCase__Group_4_1__03031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_rule__UseCase__Group_4_1__0__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__1__Impl_in_rule__UseCase__Group_4_1__13090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3119 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3131 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03168 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13228 = new BitSet(new long[]{0x0000021080000000L});
	public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_rule__Actor__Group__1__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23290 = new BitSet(new long[]{0x0000000008000200L});
	public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__TypeAssignment_2_in_rule__Actor__Group__2__Impl3320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__33350 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_rule__Actor__Group__4_in_rule__Actor__Group__33353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__DescriptionAssignment_3_in_rule__Actor__Group__3__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__4__Impl_in_rule__Actor__Group__43411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__0_in_rule__Actor__Group__4__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__0__Impl_in_rule__Actor__Group_4__03479 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__1_in_rule__Actor__Group_4__03482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_rule__Actor__Group_4__0__Impl3510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__1__Impl_in_rule__Actor__Group_4__13541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__ExtendsAssignment_4_1_in_rule__Actor__Group_4__1__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__0__Impl_in_rule__BasicFlow__Group__03602 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__1_in_rule__BasicFlow__Group__03605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_rule__BasicFlow__Group__0__Impl3633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__1__Impl_in_rule__BasicFlow__Group__13664 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__2_in_rule__BasicFlow__Group__13667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__2__Impl_in_rule__BasicFlow__Group__23725 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__3_in_rule__BasicFlow__Group__23728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__StepsAssignment_2_in_rule__BasicFlow__Group__2__Impl3755 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__3__Impl_in_rule__BasicFlow__Group__33786 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__4_in_rule__BasicFlow__Group__33789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rule__BasicFlow__Group__3__Impl3817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__4__Impl_in_rule__BasicFlow__Group__43848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__0_in_rule__BasicFlow__Group__4__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__0__Impl_in_rule__BasicFlow__Group_4__03916 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__1_in_rule__BasicFlow__Group_4__03919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__BasicFlow__Group_4__0__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__1__Impl_in_rule__BasicFlow__Group_4__13978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__FinalStateAssignment_4_1_in_rule__BasicFlow__Group_4__1__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__0__Impl_in_rule__ExceptionFlow__Group__04039 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__1_in_rule__ExceptionFlow__Group__04042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_rule__ExceptionFlow__Group__0__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__1__Impl_in_rule__ExceptionFlow__Group__14101 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__2_in_rule__ExceptionFlow__Group__14104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__NameAssignment_1_in_rule__ExceptionFlow__Group__1__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__2__Impl_in_rule__ExceptionFlow__Group__24161 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__3_in_rule__ExceptionFlow__Group__24164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_rule__ExceptionFlow__Group__2__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__3__Impl_in_rule__ExceptionFlow__Group__34223 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__4_in_rule__ExceptionFlow__Group__34226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__ConditionAssignment_3_in_rule__ExceptionFlow__Group__3__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__4__Impl_in_rule__ExceptionFlow__Group__44283 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__5_in_rule__ExceptionFlow__Group__44286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__ExceptionFlow__Group__4__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__5__Impl_in_rule__ExceptionFlow__Group__54345 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__6_in_rule__ExceptionFlow__Group__54348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__StepsAssignment_5_in_rule__ExceptionFlow__Group__5__Impl4375 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__6__Impl_in_rule__ExceptionFlow__Group__64406 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__7_in_rule__ExceptionFlow__Group__64409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rule__ExceptionFlow__Group__6__Impl4437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__7__Impl_in_rule__ExceptionFlow__Group__74468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__0_in_rule__ExceptionFlow__Group__7__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__0__Impl_in_rule__ExceptionFlow__Group_7__04542 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__1_in_rule__ExceptionFlow__Group_7__04545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__ExceptionFlow__Group_7__0__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__1__Impl_in_rule__ExceptionFlow__Group_7__14604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__FinalStateAssignment_7_1_in_rule__ExceptionFlow__Group_7__1__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__0__Impl_in_rule__AlternativeFlow__Group__04665 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__1_in_rule__AlternativeFlow__Group__04668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__AlternativeFlow__Group__0__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__1__Impl_in_rule__AlternativeFlow__Group__14727 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__2_in_rule__AlternativeFlow__Group__14730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__NameAssignment_1_in_rule__AlternativeFlow__Group__1__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__2__Impl_in_rule__AlternativeFlow__Group__24787 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__3_in_rule__AlternativeFlow__Group__24790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__StepsAssignment_2_in_rule__AlternativeFlow__Group__2__Impl4817 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__3__Impl_in_rule__AlternativeFlow__Group__34848 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__4_in_rule__AlternativeFlow__Group__34851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rule__AlternativeFlow__Group__3__Impl4879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__4__Impl_in_rule__AlternativeFlow__Group__44910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__0_in_rule__AlternativeFlow__Group__4__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__0__Impl_in_rule__AlternativeFlow__Group_4__04978 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__1_in_rule__AlternativeFlow__Group_4__04981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__AlternativeFlow__Group_4__0__Impl5009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__1__Impl_in_rule__AlternativeFlow__Group_4__15040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__FinalStateAssignment_4_1_in_rule__AlternativeFlow__Group_4__1__Impl5067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__0__Impl_in_rule__ParallelFlow__Group__05101 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__1_in_rule__ParallelFlow__Group__05104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_rule__ParallelFlow__Group__0__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__1__Impl_in_rule__ParallelFlow__Group__15163 = new BitSet(new long[]{0x0000010400800000L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__2_in_rule__ParallelFlow__Group__15166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__NameAssignment_1_in_rule__ParallelFlow__Group__1__Impl5193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__2__Impl_in_rule__ParallelFlow__Group__25223 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__3_in_rule__ParallelFlow__Group__25226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__StepsAssignment_2_in_rule__ParallelFlow__Group__2__Impl5253 = new BitSet(new long[]{0x0000010400000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__3__Impl_in_rule__ParallelFlow__Group__35284 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__4_in_rule__ParallelFlow__Group__35287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rule__ParallelFlow__Group__3__Impl5315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__4__Impl_in_rule__ParallelFlow__Group__45346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__0_in_rule__ParallelFlow__Group__4__Impl5373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__0__Impl_in_rule__ParallelFlow__Group_4__05414 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__1_in_rule__ParallelFlow__Group_4__05417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__ParallelFlow__Group_4__0__Impl5445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__1__Impl_in_rule__ParallelFlow__Group_4__15476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__FinalStateAssignment_4_1_in_rule__ParallelFlow__Group_4__1__Impl5503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05537 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_rule__Condition__Group__0__Impl5568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15599 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__15602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__ConditionAssignment_1_in_rule__Condition__Group__1__Impl5629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__25659 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__25662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__Condition__Group__2__Impl5690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__35721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__0_in_rule__Condition__Group__3__Impl5748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__0__Impl_in_rule__Condition__Group_3__05787 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__1_in_rule__Condition__Group_3__05790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__Condition__Group_3__0__Impl5818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__1__Impl_in_rule__Condition__Group_3__15849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__ContinuationAssignment_3_1_in_rule__Condition__Group_3__1__Impl5876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__0__Impl_in_rule__LocalAlternative__Group__05910 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__1_in_rule__LocalAlternative__Group__05913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_rule__LocalAlternative__Group__0__Impl5941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__1__Impl_in_rule__LocalAlternative__Group__15972 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__2_in_rule__LocalAlternative__Group__15975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__ConditionAssignment_1_in_rule__LocalAlternative__Group__1__Impl6002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__2__Impl_in_rule__LocalAlternative__Group__26032 = new BitSet(new long[]{0x0000000020000200L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__3_in_rule__LocalAlternative__Group__26035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__LocalAlternative__Group__2__Impl6063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__3__Impl_in_rule__LocalAlternative__Group__36094 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__4_in_rule__LocalAlternative__Group__36097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Alternatives_3_in_rule__LocalAlternative__Group__3__Impl6124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__4__Impl_in_rule__LocalAlternative__Group__46154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__0_in_rule__LocalAlternative__Group__4__Impl6181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__0__Impl_in_rule__LocalAlternative__Group_3_1__06222 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__1_in_rule__LocalAlternative__Group_3_1__06225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_rule__LocalAlternative__Group_3_1__0__Impl6253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__1__Impl_in_rule__LocalAlternative__Group_3_1__16284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1_in_rule__LocalAlternative__Group_3_1__1__Impl6311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__0__Impl_in_rule__LocalAlternative__Group_4__06345 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__1_in_rule__LocalAlternative__Group_4__06348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__LocalAlternative__Group_4__0__Impl6376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__1__Impl_in_rule__LocalAlternative__Group_4__16407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__ContinuationAssignment_4_1_in_rule__LocalAlternative__Group_4__1__Impl6434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__0__Impl_in_rule__AlternativeFlowAlternative__Group__06468 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__1_in_rule__AlternativeFlowAlternative__Group__06471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_rule__AlternativeFlowAlternative__Group__0__Impl6499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__1__Impl_in_rule__AlternativeFlowAlternative__Group__16530 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__2_in_rule__AlternativeFlowAlternative__Group__16533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__ConditionAssignment_1_in_rule__AlternativeFlowAlternative__Group__1__Impl6560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__2__Impl_in_rule__AlternativeFlowAlternative__Group__26590 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__3_in_rule__AlternativeFlowAlternative__Group__26593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__AlternativeFlowAlternative__Group__2__Impl6621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__3__Impl_in_rule__AlternativeFlowAlternative__Group__36652 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__4_in_rule__AlternativeFlowAlternative__Group__36655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__AlternativeFlowAlternative__Group__3__Impl6683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__4__Impl_in_rule__AlternativeFlowAlternative__Group__46714 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__5_in_rule__AlternativeFlowAlternative__Group__46717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__RefAssignment_4_in_rule__AlternativeFlowAlternative__Group__4__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__5__Impl_in_rule__AlternativeFlowAlternative__Group__56774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__0_in_rule__AlternativeFlowAlternative__Group__5__Impl6801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__0__Impl_in_rule__AlternativeFlowAlternative__Group_5__06844 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__1_in_rule__AlternativeFlowAlternative__Group_5__06847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__AlternativeFlowAlternative__Group_5__0__Impl6875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__1__Impl_in_rule__AlternativeFlowAlternative__Group_5__16906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__ContinuationAssignment_5_1_in_rule__AlternativeFlowAlternative__Group_5__1__Impl6933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__0__Impl_in_rule__ParallelStep__Group__06967 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__1_in_rule__ParallelStep__Group__06970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_rule__ParallelStep__Group__0__Impl6998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__1__Impl_in_rule__ParallelStep__Group__17029 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__2_in_rule__ParallelStep__Group__17032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__NameAssignment_1_in_rule__ParallelStep__Group__1__Impl7059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__2__Impl_in_rule__ParallelStep__Group__27089 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__3_in_rule__ParallelStep__Group__27092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__LabelAssignment_2_in_rule__ParallelStep__Group__2__Impl7119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__3__Impl_in_rule__ParallelStep__Group__37150 = new BitSet(new long[]{0x0000000040000800L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__4_in_rule__ParallelStep__Group__37153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_3_in_rule__ParallelStep__Group__3__Impl7180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__4__Impl_in_rule__ParallelStep__Group__47210 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__5_in_rule__ParallelStep__Group__47213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__0_in_rule__ParallelStep__Group__4__Impl7240 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__5__Impl_in_rule__ParallelStep__Group__57271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__0_in_rule__ParallelStep__Group__5__Impl7298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__0__Impl_in_rule__ParallelStep__Group_4__07341 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__1_in_rule__ParallelStep__Group_4__07344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_rule__ParallelStep__Group_4__0__Impl7372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__1__Impl_in_rule__ParallelStep__Group_4__17403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_4_1_in_rule__ParallelStep__Group_4__1__Impl7430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__0__Impl_in_rule__ParallelStep__Group_5__07464 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__1_in_rule__ParallelStep__Group_5__07467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_rule__ParallelStep__Group_5__0__Impl7495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__1__Impl_in_rule__ParallelStep__Group_5__17526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__NextAssignment_5_1_in_rule__ParallelStep__Group_5__1__Impl7553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__0__Impl_in_rule__NormalStep__Group__07587 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__1_in_rule__NormalStep__Group__07590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_rule__NormalStep__Group__0__Impl7618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__1__Impl_in_rule__NormalStep__Group__17649 = new BitSet(new long[]{0x0000108800104200L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__2_in_rule__NormalStep__Group__17652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__NameAssignment_1_in_rule__NormalStep__Group__1__Impl7679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__2__Impl_in_rule__NormalStep__Group__27709 = new BitSet(new long[]{0x0000108800104000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__3_in_rule__NormalStep__Group__27712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__LabelAssignment_2_in_rule__NormalStep__Group__2__Impl7739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__3__Impl_in_rule__NormalStep__Group__37770 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__4_in_rule__NormalStep__Group__37773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__TypeAssignment_3_in_rule__NormalStep__Group__3__Impl7800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__4__Impl_in_rule__NormalStep__Group__47830 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__5_in_rule__NormalStep__Group__47833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rule__NormalStep__Group__4__Impl7861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__5__Impl_in_rule__NormalStep__Group__57892 = new BitSet(new long[]{0x0000000060010000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__6_in_rule__NormalStep__Group__57895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__ActorAssignment_5_in_rule__NormalStep__Group__5__Impl7922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__6__Impl_in_rule__NormalStep__Group__67952 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__7_in_rule__NormalStep__Group__67955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Alternatives_6_in_rule__NormalStep__Group__6__Impl7982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__7__Impl_in_rule__NormalStep__Group__78013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__0_in_rule__NormalStep__Group__7__Impl8040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__0__Impl_in_rule__NormalStep__Group_6_0__08087 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__1_in_rule__NormalStep__Group_6_0__08090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_rule__NormalStep__Group_6_0__0__Impl8118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__1__Impl_in_rule__NormalStep__Group_6_0__18149 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__2_in_rule__NormalStep__Group_6_0__18152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8181 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8193 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__2__Impl_in_rule__NormalStep__Group_6_0__28226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_rule__NormalStep__Group_6_0__2__Impl8254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__0__Impl_in_rule__NormalStep__Group_6_1__08291 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__1_in_rule__NormalStep__Group_6_1__08294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_rule__NormalStep__Group_6_1__0__Impl8322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__1__Impl_in_rule__NormalStep__Group_6_1__18353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__InvokedUseCaseAssignment_6_1_1_in_rule__NormalStep__Group_6_1__1__Impl8380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__0__Impl_in_rule__NormalStep__Group_7__08414 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__1_in_rule__NormalStep__Group_7__08417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_rule__NormalStep__Group_7__0__Impl8445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__1__Impl_in_rule__NormalStep__Group_7__18476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__NextAssignment_7_1_in_rule__NormalStep__Group_7__1__Impl8503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08537 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8623 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08658 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl8689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__0_in_rule__UseCase__UnorderedGroup_48781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__0_in_rule__UseCase__UnorderedGroup_4__Impl8868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__0_in_rule__UseCase__UnorderedGroup_4__Impl8959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__09018 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__1_in_rule__UseCase__UnorderedGroup_4__09021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__19046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__UseCasesModel__PackagesAssignment9078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DescriptionAssignment_29140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActor_in_rule__PackageDeclaration__ActorsAssignment_3_19171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUseCase_in_rule__PackageDeclaration__UseCasesAssignment_49202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__UseCase__NameAssignment_19233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__UseCase__DescriptionAssignment_29264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__UseCase__SuperCaseAssignment_3_19299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__UseCase__PreconditionsAssignment_4_0_19334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__UseCase__PostconditionsAssignment_4_1_19365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFlow_in_rule__UseCase__FlowsAssignment_59396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__UCCondition__NameAssignment9427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_09458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActorType_in_rule__Actor__TypeAssignment_29489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__Actor__DescriptionAssignment_39520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__ExtendsAssignment_4_19555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__BasicFlow__StepsAssignment_29590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__BasicFlow__FinalStateAssignment_4_19621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ExceptionFlow__NameAssignment_19652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__ExceptionFlow__ConditionAssignment_39683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__ExceptionFlow__StepsAssignment_59714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__ExceptionFlow__FinalStateAssignment_7_19745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlow__NameAssignment_19776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__AlternativeFlow__StepsAssignment_29807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__AlternativeFlow__FinalStateAssignment_4_19838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelFlow__NameAssignment_19869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__ParallelFlow__StepsAssignment_29900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__ParallelFlow__FinalStateAssignment_4_19931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__Condition__ConditionAssignment_19962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Condition__ContinuationAssignment_3_19997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__LocalAlternative__ConditionAssignment_110032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__LocalAlternative__DescriptionAssignment_3_010063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_110098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__LocalAlternative__ContinuationAssignment_4_110137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__AlternativeFlowAlternative__ConditionAssignment_110172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__RefAssignment_410207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__ContinuationAssignment_5_110246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__NameAssignment_110281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__ParallelStep__LabelAssignment_210312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_310347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_4_110386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__NextAssignment_5_110425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__NameAssignment_110460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__NormalStep__LabelAssignment_210491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStepType_in_rule__NormalStep__TypeAssignment_310522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__ActorAssignment_510557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStepAlternative_in_rule__NormalStep__StepAlternativeAssignment_6_0_110592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__InvokedUseCaseAssignment_6_1_110627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__NextAssignment_7_110666 = new BitSet(new long[]{0x0000000000000002L});
}
