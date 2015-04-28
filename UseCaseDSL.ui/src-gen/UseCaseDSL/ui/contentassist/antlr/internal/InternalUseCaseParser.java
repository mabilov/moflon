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
		"'.'", "'actors'", "'alternative flow'", "'alternatives'", "'as'", "'basic flow'", 
		"'by'", "'continue with step'", "'else'", "'end flow'", "'end package'", 
		"'end usecase'", "'exception flow'", "'extends'", "'if'", "'input'", "'invoke usecase'", 
		"'mix'", "'next'", "'organization'", "'output'", "'package'", "'parallel flow'", 
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
				if ( (LA1_0==33) ) {
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



	// $ANTLR start "ruleCustomStepType"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:612:1: ruleCustomStepType : ( ( rule__CustomStepType__Alternatives ) ) ;
	public final void ruleCustomStepType() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:616:1: ( ( ( rule__CustomStepType__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:617:1: ( ( rule__CustomStepType__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:617:1: ( ( rule__CustomStepType__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:618:1: ( rule__CustomStepType__Alternatives )
			{
			 before(grammarAccess.getCustomStepTypeAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:619:2: ( rule__CustomStepType__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:619:2: rule__CustomStepType__Alternatives
			{
			pushFollow(FOLLOW_rule__CustomStepType__Alternatives_in_ruleCustomStepType1248);
			rule__CustomStepType__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getCustomStepTypeAccess().getAlternatives()); 
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
	// $ANTLR end "ruleCustomStepType"



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
			else if ( (LA2_0==35) ) {
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
			if ( (LA3_0==17) ) {
				alt3=1;
			}
			else if ( (LA3_0==14||LA3_0==24||LA3_0==34) ) {
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
			case 24:
				{
				alt4=1;
				}
				break;
			case 14:
				{
				alt4=2;
				}
				break;
			case 34:
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
			if ( (LA5_0==26) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==RULE_STRING) ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2==42) ) {
						switch ( input.LA(4) ) {
						case EOF:
						case 19:
						case 20:
						case 26:
							{
							alt5=1;
							}
							break;
						case RULE_STRING:
						case 28:
							{
							alt5=2;
							}
							break;
						case 14:
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
			else if ( (LA6_0==28) ) {
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
			if ( (LA7_0==15) ) {
				alt7=1;
			}
			else if ( (LA7_0==28) ) {
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



	// $ANTLR start "rule__CustomStepType__Alternatives"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:805:1: rule__CustomStepType__Alternatives : ( ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'process' ) ) | ( ( 'mix' ) ) );
	public final void rule__CustomStepType__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:809:1: ( ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'process' ) ) | ( ( 'mix' ) ) )
			int alt9=4;
			switch ( input.LA(1) ) {
			case 27:
				{
				alt9=1;
				}
				break;
			case 32:
				{
				alt9=2;
				}
				break;
			case 39:
				{
				alt9=3;
				}
				break;
			case 29:
				{
				alt9=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:810:1: ( ( 'input' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:810:1: ( ( 'input' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:811:1: ( 'input' )
					{
					 before(grammarAccess.getCustomStepTypeAccess().getINPUTEnumLiteralDeclaration_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:812:3: ( 'input' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:812:3: 'input'
					{
					match(input,27,FOLLOW_27_in_rule__CustomStepType__Alternatives1694); 
					}

					 after(grammarAccess.getCustomStepTypeAccess().getINPUTEnumLiteralDeclaration_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:817:6: ( ( 'output' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:817:6: ( ( 'output' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:818:1: ( 'output' )
					{
					 before(grammarAccess.getCustomStepTypeAccess().getOUTPUTEnumLiteralDeclaration_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:819:3: ( 'output' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:819:3: 'output'
					{
					match(input,32,FOLLOW_32_in_rule__CustomStepType__Alternatives1715); 
					}

					 after(grammarAccess.getCustomStepTypeAccess().getOUTPUTEnumLiteralDeclaration_1()); 
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:824:6: ( ( 'process' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:824:6: ( ( 'process' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:825:1: ( 'process' )
					{
					 before(grammarAccess.getCustomStepTypeAccess().getPROCESSEnumLiteralDeclaration_2()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:826:3: ( 'process' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:826:3: 'process'
					{
					match(input,39,FOLLOW_39_in_rule__CustomStepType__Alternatives1736); 
					}

					 after(grammarAccess.getCustomStepTypeAccess().getPROCESSEnumLiteralDeclaration_2()); 
					}

					}
					break;
				case 4 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:831:6: ( ( 'mix' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:831:6: ( ( 'mix' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:832:1: ( 'mix' )
					{
					 before(grammarAccess.getCustomStepTypeAccess().getMIXEnumLiteralDeclaration_3()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:833:3: ( 'mix' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:833:3: 'mix'
					{
					match(input,29,FOLLOW_29_in_rule__CustomStepType__Alternatives1757); 
					}

					 after(grammarAccess.getCustomStepTypeAccess().getMIXEnumLiteralDeclaration_3()); 
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
	// $ANTLR end "rule__CustomStepType__Alternatives"



	// $ANTLR start "rule__PackageDeclaration__Group__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:845:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
	public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:849:2: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:850:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01790);
			rule__PackageDeclaration__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01793);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:857:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
	public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:861:1: ( ( 'package' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:862:1: ( 'package' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:862:1: ( 'package' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:863:1: 'package'
			{
			 before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
			match(input,33,FOLLOW_33_in_rule__PackageDeclaration__Group__0__Impl1821); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:876:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
	public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:880:2: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:881:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11852);
			rule__PackageDeclaration__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11855);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:888:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
	public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:892:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:893:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:893:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:894:1: ( rule__PackageDeclaration__NameAssignment_1 )
			{
			 before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:895:2: ( rule__PackageDeclaration__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:895:2: rule__PackageDeclaration__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1882);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:905:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
	public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:909:2: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:910:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21912);
			rule__PackageDeclaration__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21915);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:917:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? ) ;
	public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:921:1: ( ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:922:1: ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:922:1: ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:923:1: ( rule__PackageDeclaration__DescriptionAssignment_2 )?
			{
			 before(grammarAccess.getPackageDeclarationAccess().getDescriptionAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:924:2: ( rule__PackageDeclaration__DescriptionAssignment_2 )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==RULE_STRING) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:924:2: rule__PackageDeclaration__DescriptionAssignment_2
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__DescriptionAssignment_2_in_rule__PackageDeclaration__Group__2__Impl1942);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:934:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
	public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:938:2: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:939:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31973);
			rule__PackageDeclaration__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31976);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:946:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__Group_3__0 )? ) ;
	public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:950:1: ( ( ( rule__PackageDeclaration__Group_3__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:951:1: ( ( rule__PackageDeclaration__Group_3__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:951:1: ( ( rule__PackageDeclaration__Group_3__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:952:1: ( rule__PackageDeclaration__Group_3__0 )?
			{
			 before(grammarAccess.getPackageDeclarationAccess().getGroup_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:953:2: ( rule__PackageDeclaration__Group_3__0 )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==13) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:953:2: rule__PackageDeclaration__Group_3__0
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2003);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:963:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
	public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:967:2: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:968:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42034);
			rule__PackageDeclaration__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42037);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:975:1: rule__PackageDeclaration__Group__4__Impl : ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* ) ;
	public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:979:1: ( ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:980:1: ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:980:1: ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:981:1: ( rule__PackageDeclaration__UseCasesAssignment_4 )*
			{
			 before(grammarAccess.getPackageDeclarationAccess().getUseCasesAssignment_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:982:2: ( rule__PackageDeclaration__UseCasesAssignment_4 )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==44) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:982:2: rule__PackageDeclaration__UseCasesAssignment_4
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__UseCasesAssignment_4_in_rule__PackageDeclaration__Group__4__Impl2064);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:992:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl ;
	public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:996:2: ( rule__PackageDeclaration__Group__5__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:997:2: rule__PackageDeclaration__Group__5__Impl
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52095);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1003:1: rule__PackageDeclaration__Group__5__Impl : ( 'end package' ) ;
	public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1007:1: ( ( 'end package' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1008:1: ( 'end package' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1008:1: ( 'end package' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1009:1: 'end package'
			{
			 before(grammarAccess.getPackageDeclarationAccess().getEndPackageKeyword_5()); 
			match(input,22,FOLLOW_22_in_rule__PackageDeclaration__Group__5__Impl2123); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1034:1: rule__PackageDeclaration__Group_3__0 : rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 ;
	public final void rule__PackageDeclaration__Group_3__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1038:2: ( rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1039:2: rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02166);
			rule__PackageDeclaration__Group_3__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02169);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1046:1: rule__PackageDeclaration__Group_3__0__Impl : ( 'actors' ) ;
	public final void rule__PackageDeclaration__Group_3__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1050:1: ( ( 'actors' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1051:1: ( 'actors' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1051:1: ( 'actors' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1052:1: 'actors'
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsKeyword_3_0()); 
			match(input,13,FOLLOW_13_in_rule__PackageDeclaration__Group_3__0__Impl2197); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1065:1: rule__PackageDeclaration__Group_3__1 : rule__PackageDeclaration__Group_3__1__Impl ;
	public final void rule__PackageDeclaration__Group_3__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1069:2: ( rule__PackageDeclaration__Group_3__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1070:2: rule__PackageDeclaration__Group_3__1__Impl
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__12228);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1076:1: rule__PackageDeclaration__Group_3__1__Impl : ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) ) ;
	public final void rule__PackageDeclaration__Group_3__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1080:1: ( ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1081:1: ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1081:1: ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1082:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1082:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1083:1: ( rule__PackageDeclaration__ActorsAssignment_3_1 )
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1084:2: ( rule__PackageDeclaration__ActorsAssignment_3_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1084:2: rule__PackageDeclaration__ActorsAssignment_3_1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2257);
			rule__PackageDeclaration__ActorsAssignment_3_1();
			state._fsp--;

			}

			 after(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
			}

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1087:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1088:1: ( rule__PackageDeclaration__ActorsAssignment_3_1 )*
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1089:2: ( rule__PackageDeclaration__ActorsAssignment_3_1 )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==RULE_ID) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1089:2: rule__PackageDeclaration__ActorsAssignment_3_1
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2269);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1104:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
	public final void rule__UseCase__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1108:2: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1109:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__02306);
			rule__UseCase__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__02309);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1116:1: rule__UseCase__Group__0__Impl : ( 'usecase' ) ;
	public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1120:1: ( ( 'usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1121:1: ( 'usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1121:1: ( 'usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1122:1: 'usecase'
			{
			 before(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 
			match(input,44,FOLLOW_44_in_rule__UseCase__Group__0__Impl2337); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1135:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
	public final void rule__UseCase__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1139:2: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1140:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
			{
			pushFollow(FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__12368);
			rule__UseCase__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__2_in_rule__UseCase__Group__12371);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1147:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
	public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1151:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1152:1: ( ( rule__UseCase__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1152:1: ( ( rule__UseCase__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1153:1: ( rule__UseCase__NameAssignment_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1154:2: ( rule__UseCase__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1154:2: rule__UseCase__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__UseCase__NameAssignment_1_in_rule__UseCase__Group__1__Impl2398);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1164:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
	public final void rule__UseCase__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1168:2: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1169:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
			{
			pushFollow(FOLLOW_rule__UseCase__Group__2__Impl_in_rule__UseCase__Group__22428);
			rule__UseCase__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__3_in_rule__UseCase__Group__22431);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1176:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionAssignment_2 )? ) ;
	public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1180:1: ( ( ( rule__UseCase__DescriptionAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1181:1: ( ( rule__UseCase__DescriptionAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1181:1: ( ( rule__UseCase__DescriptionAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1182:1: ( rule__UseCase__DescriptionAssignment_2 )?
			{
			 before(grammarAccess.getUseCaseAccess().getDescriptionAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1183:2: ( rule__UseCase__DescriptionAssignment_2 )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==RULE_STRING) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1183:2: rule__UseCase__DescriptionAssignment_2
					{
					pushFollow(FOLLOW_rule__UseCase__DescriptionAssignment_2_in_rule__UseCase__Group__2__Impl2458);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1193:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
	public final void rule__UseCase__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1197:2: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1198:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
			{
			pushFollow(FOLLOW_rule__UseCase__Group__3__Impl_in_rule__UseCase__Group__32489);
			rule__UseCase__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__4_in_rule__UseCase__Group__32492);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1205:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__Group_3__0 )? ) ;
	public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1209:1: ( ( ( rule__UseCase__Group_3__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1210:1: ( ( rule__UseCase__Group_3__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1210:1: ( ( rule__UseCase__Group_3__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1211:1: ( rule__UseCase__Group_3__0 )?
			{
			 before(grammarAccess.getUseCaseAccess().getGroup_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1212:2: ( rule__UseCase__Group_3__0 )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==25) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1212:2: rule__UseCase__Group_3__0
					{
					pushFollow(FOLLOW_rule__UseCase__Group_3__0_in_rule__UseCase__Group__3__Impl2519);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1222:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
	public final void rule__UseCase__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1226:2: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1227:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
			{
			pushFollow(FOLLOW_rule__UseCase__Group__4__Impl_in_rule__UseCase__Group__42550);
			rule__UseCase__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__5_in_rule__UseCase__Group__42553);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1234:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__UnorderedGroup_4 ) ) ;
	public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1238:1: ( ( ( rule__UseCase__UnorderedGroup_4 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1239:1: ( ( rule__UseCase__UnorderedGroup_4 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1239:1: ( ( rule__UseCase__UnorderedGroup_4 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1240:1: ( rule__UseCase__UnorderedGroup_4 )
			{
			 before(grammarAccess.getUseCaseAccess().getUnorderedGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1241:2: ( rule__UseCase__UnorderedGroup_4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1241:2: rule__UseCase__UnorderedGroup_4
			{
			pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4_in_rule__UseCase__Group__4__Impl2580);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1251:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
	public final void rule__UseCase__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1255:2: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1256:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
			{
			pushFollow(FOLLOW_rule__UseCase__Group__5__Impl_in_rule__UseCase__Group__52610);
			rule__UseCase__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__6_in_rule__UseCase__Group__52613);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1263:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__FlowsAssignment_5 )* ) ;
	public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1267:1: ( ( ( rule__UseCase__FlowsAssignment_5 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1268:1: ( ( rule__UseCase__FlowsAssignment_5 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1268:1: ( ( rule__UseCase__FlowsAssignment_5 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1269:1: ( rule__UseCase__FlowsAssignment_5 )*
			{
			 before(grammarAccess.getUseCaseAccess().getFlowsAssignment_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1270:2: ( rule__UseCase__FlowsAssignment_5 )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==14||LA16_0==17||LA16_0==24||LA16_0==34) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1270:2: rule__UseCase__FlowsAssignment_5
					{
					pushFollow(FOLLOW_rule__UseCase__FlowsAssignment_5_in_rule__UseCase__Group__5__Impl2640);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1280:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl ;
	public final void rule__UseCase__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1284:2: ( rule__UseCase__Group__6__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1285:2: rule__UseCase__Group__6__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group__6__Impl_in_rule__UseCase__Group__62671);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1291:1: rule__UseCase__Group__6__Impl : ( 'end usecase' ) ;
	public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1295:1: ( ( 'end usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1296:1: ( 'end usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1296:1: ( 'end usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1297:1: 'end usecase'
			{
			 before(grammarAccess.getUseCaseAccess().getEndUsecaseKeyword_6()); 
			match(input,23,FOLLOW_23_in_rule__UseCase__Group__6__Impl2699); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1324:1: rule__UseCase__Group_3__0 : rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 ;
	public final void rule__UseCase__Group_3__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1328:2: ( rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1329:2: rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group_3__0__Impl_in_rule__UseCase__Group_3__02744);
			rule__UseCase__Group_3__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group_3__1_in_rule__UseCase__Group_3__02747);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1336:1: rule__UseCase__Group_3__0__Impl : ( 'extends' ) ;
	public final void rule__UseCase__Group_3__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1340:1: ( ( 'extends' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1341:1: ( 'extends' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1341:1: ( 'extends' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1342:1: 'extends'
			{
			 before(grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0()); 
			match(input,25,FOLLOW_25_in_rule__UseCase__Group_3__0__Impl2775); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1355:1: rule__UseCase__Group_3__1 : rule__UseCase__Group_3__1__Impl ;
	public final void rule__UseCase__Group_3__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1359:2: ( rule__UseCase__Group_3__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1360:2: rule__UseCase__Group_3__1__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group_3__1__Impl_in_rule__UseCase__Group_3__12806);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1366:1: rule__UseCase__Group_3__1__Impl : ( ( rule__UseCase__SuperCaseAssignment_3_1 ) ) ;
	public final void rule__UseCase__Group_3__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1370:1: ( ( ( rule__UseCase__SuperCaseAssignment_3_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1371:1: ( ( rule__UseCase__SuperCaseAssignment_3_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1371:1: ( ( rule__UseCase__SuperCaseAssignment_3_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1372:1: ( rule__UseCase__SuperCaseAssignment_3_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getSuperCaseAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1373:2: ( rule__UseCase__SuperCaseAssignment_3_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1373:2: rule__UseCase__SuperCaseAssignment_3_1
			{
			pushFollow(FOLLOW_rule__UseCase__SuperCaseAssignment_3_1_in_rule__UseCase__Group_3__1__Impl2833);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1387:1: rule__UseCase__Group_4_0__0 : rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1 ;
	public final void rule__UseCase__Group_4_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1391:2: ( rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1392:2: rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_0__0__Impl_in_rule__UseCase__Group_4_0__02867);
			rule__UseCase__Group_4_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group_4_0__1_in_rule__UseCase__Group_4_0__02870);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1399:1: rule__UseCase__Group_4_0__0__Impl : ( 'preconditions' ) ;
	public final void rule__UseCase__Group_4_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1403:1: ( ( 'preconditions' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1404:1: ( 'preconditions' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1404:1: ( 'preconditions' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1405:1: 'preconditions'
			{
			 before(grammarAccess.getUseCaseAccess().getPreconditionsKeyword_4_0_0()); 
			match(input,38,FOLLOW_38_in_rule__UseCase__Group_4_0__0__Impl2898); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1418:1: rule__UseCase__Group_4_0__1 : rule__UseCase__Group_4_0__1__Impl ;
	public final void rule__UseCase__Group_4_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1422:2: ( rule__UseCase__Group_4_0__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1423:2: rule__UseCase__Group_4_0__1__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_0__1__Impl_in_rule__UseCase__Group_4_0__12929);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1429:1: rule__UseCase__Group_4_0__1__Impl : ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) ) ;
	public final void rule__UseCase__Group_4_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1433:1: ( ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1434:1: ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1434:1: ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1435:1: ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1435:1: ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1436:1: ( rule__UseCase__PreconditionsAssignment_4_0_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_4_0_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1437:2: ( rule__UseCase__PreconditionsAssignment_4_0_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1437:2: rule__UseCase__PreconditionsAssignment_4_0_1
			{
			pushFollow(FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl2958);
			rule__UseCase__PreconditionsAssignment_4_0_1();
			state._fsp--;

			}

			 after(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_4_0_1()); 
			}

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1440:1: ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1441:1: ( rule__UseCase__PreconditionsAssignment_4_0_1 )*
			{
			 before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_4_0_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1442:2: ( rule__UseCase__PreconditionsAssignment_4_0_1 )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==RULE_STRING) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1442:2: rule__UseCase__PreconditionsAssignment_4_0_1
					{
					pushFollow(FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl2970);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1457:1: rule__UseCase__Group_4_1__0 : rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1 ;
	public final void rule__UseCase__Group_4_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1461:2: ( rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1462:2: rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_1__0__Impl_in_rule__UseCase__Group_4_1__03007);
			rule__UseCase__Group_4_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group_4_1__1_in_rule__UseCase__Group_4_1__03010);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1469:1: rule__UseCase__Group_4_1__0__Impl : ( 'postcondition' ) ;
	public final void rule__UseCase__Group_4_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1473:1: ( ( 'postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1474:1: ( 'postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1474:1: ( 'postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1475:1: 'postcondition'
			{
			 before(grammarAccess.getUseCaseAccess().getPostconditionKeyword_4_1_0()); 
			match(input,37,FOLLOW_37_in_rule__UseCase__Group_4_1__0__Impl3038); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1488:1: rule__UseCase__Group_4_1__1 : rule__UseCase__Group_4_1__1__Impl ;
	public final void rule__UseCase__Group_4_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1492:2: ( rule__UseCase__Group_4_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1493:2: rule__UseCase__Group_4_1__1__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_1__1__Impl_in_rule__UseCase__Group_4_1__13069);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1499:1: rule__UseCase__Group_4_1__1__Impl : ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) ) ;
	public final void rule__UseCase__Group_4_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1503:1: ( ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1504:1: ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1504:1: ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1505:1: ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1505:1: ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1506:1: ( rule__UseCase__PostconditionsAssignment_4_1_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getPostconditionsAssignment_4_1_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1507:2: ( rule__UseCase__PostconditionsAssignment_4_1_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1507:2: rule__UseCase__PostconditionsAssignment_4_1_1
			{
			pushFollow(FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3098);
			rule__UseCase__PostconditionsAssignment_4_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getUseCaseAccess().getPostconditionsAssignment_4_1_1()); 
			}

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1510:1: ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1511:1: ( rule__UseCase__PostconditionsAssignment_4_1_1 )*
			{
			 before(grammarAccess.getUseCaseAccess().getPostconditionsAssignment_4_1_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1512:2: ( rule__UseCase__PostconditionsAssignment_4_1_1 )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==RULE_STRING) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1512:2: rule__UseCase__PostconditionsAssignment_4_1_1
					{
					pushFollow(FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3110);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1527:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
	public final void rule__Actor__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1531:2: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1532:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
			{
			pushFollow(FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03147);
			rule__Actor__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03150);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1539:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__NameAssignment_0 ) ) ;
	public final void rule__Actor__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1543:1: ( ( ( rule__Actor__NameAssignment_0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1544:1: ( ( rule__Actor__NameAssignment_0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1544:1: ( ( rule__Actor__NameAssignment_0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1545:1: ( rule__Actor__NameAssignment_0 )
			{
			 before(grammarAccess.getActorAccess().getNameAssignment_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1546:2: ( rule__Actor__NameAssignment_0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1546:2: rule__Actor__NameAssignment_0
			{
			pushFollow(FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3177);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1556:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
	public final void rule__Actor__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1560:2: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1561:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
			{
			pushFollow(FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13207);
			rule__Actor__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13210);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1568:1: rule__Actor__Group__1__Impl : ( 'as' ) ;
	public final void rule__Actor__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1572:1: ( ( 'as' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1573:1: ( 'as' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1573:1: ( 'as' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1574:1: 'as'
			{
			 before(grammarAccess.getActorAccess().getAsKeyword_1()); 
			match(input,16,FOLLOW_16_in_rule__Actor__Group__1__Impl3238); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1587:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
	public final void rule__Actor__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1591:2: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1592:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
			{
			pushFollow(FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23269);
			rule__Actor__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23272);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1599:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__TypeAssignment_2 ) ) ;
	public final void rule__Actor__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1603:1: ( ( ( rule__Actor__TypeAssignment_2 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1604:1: ( ( rule__Actor__TypeAssignment_2 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1604:1: ( ( rule__Actor__TypeAssignment_2 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1605:1: ( rule__Actor__TypeAssignment_2 )
			{
			 before(grammarAccess.getActorAccess().getTypeAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1606:2: ( rule__Actor__TypeAssignment_2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1606:2: rule__Actor__TypeAssignment_2
			{
			pushFollow(FOLLOW_rule__Actor__TypeAssignment_2_in_rule__Actor__Group__2__Impl3299);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1616:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
	public final void rule__Actor__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1620:2: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1621:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
			{
			pushFollow(FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__33329);
			rule__Actor__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__4_in_rule__Actor__Group__33332);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1628:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__DescriptionAssignment_3 )? ) ;
	public final void rule__Actor__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1632:1: ( ( ( rule__Actor__DescriptionAssignment_3 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1633:1: ( ( rule__Actor__DescriptionAssignment_3 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1633:1: ( ( rule__Actor__DescriptionAssignment_3 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1634:1: ( rule__Actor__DescriptionAssignment_3 )?
			{
			 before(grammarAccess.getActorAccess().getDescriptionAssignment_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1635:2: ( rule__Actor__DescriptionAssignment_3 )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==RULE_STRING) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1635:2: rule__Actor__DescriptionAssignment_3
					{
					pushFollow(FOLLOW_rule__Actor__DescriptionAssignment_3_in_rule__Actor__Group__3__Impl3359);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1645:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl ;
	public final void rule__Actor__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1649:2: ( rule__Actor__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1650:2: rule__Actor__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__Actor__Group__4__Impl_in_rule__Actor__Group__43390);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1656:1: rule__Actor__Group__4__Impl : ( ( rule__Actor__Group_4__0 )? ) ;
	public final void rule__Actor__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1660:1: ( ( ( rule__Actor__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1661:1: ( ( rule__Actor__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1661:1: ( ( rule__Actor__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1662:1: ( rule__Actor__Group_4__0 )?
			{
			 before(grammarAccess.getActorAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1663:2: ( rule__Actor__Group_4__0 )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==25) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1663:2: rule__Actor__Group_4__0
					{
					pushFollow(FOLLOW_rule__Actor__Group_4__0_in_rule__Actor__Group__4__Impl3417);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1683:1: rule__Actor__Group_4__0 : rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1 ;
	public final void rule__Actor__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1687:2: ( rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1688:2: rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1
			{
			pushFollow(FOLLOW_rule__Actor__Group_4__0__Impl_in_rule__Actor__Group_4__03458);
			rule__Actor__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group_4__1_in_rule__Actor__Group_4__03461);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1695:1: rule__Actor__Group_4__0__Impl : ( 'extends' ) ;
	public final void rule__Actor__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1699:1: ( ( 'extends' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1700:1: ( 'extends' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1700:1: ( 'extends' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1701:1: 'extends'
			{
			 before(grammarAccess.getActorAccess().getExtendsKeyword_4_0()); 
			match(input,25,FOLLOW_25_in_rule__Actor__Group_4__0__Impl3489); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1714:1: rule__Actor__Group_4__1 : rule__Actor__Group_4__1__Impl ;
	public final void rule__Actor__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1718:2: ( rule__Actor__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1719:2: rule__Actor__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__Actor__Group_4__1__Impl_in_rule__Actor__Group_4__13520);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1725:1: rule__Actor__Group_4__1__Impl : ( ( rule__Actor__ExtendsAssignment_4_1 ) ) ;
	public final void rule__Actor__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1729:1: ( ( ( rule__Actor__ExtendsAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1730:1: ( ( rule__Actor__ExtendsAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1730:1: ( ( rule__Actor__ExtendsAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1731:1: ( rule__Actor__ExtendsAssignment_4_1 )
			{
			 before(grammarAccess.getActorAccess().getExtendsAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1732:2: ( rule__Actor__ExtendsAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1732:2: rule__Actor__ExtendsAssignment_4_1
			{
			pushFollow(FOLLOW_rule__Actor__ExtendsAssignment_4_1_in_rule__Actor__Group_4__1__Impl3547);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1746:1: rule__BasicFlow__Group__0 : rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1 ;
	public final void rule__BasicFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1750:2: ( rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1751:2: rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__0__Impl_in_rule__BasicFlow__Group__03581);
			rule__BasicFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__1_in_rule__BasicFlow__Group__03584);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1758:1: rule__BasicFlow__Group__0__Impl : ( 'basic flow' ) ;
	public final void rule__BasicFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1762:1: ( ( 'basic flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1763:1: ( 'basic flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1763:1: ( 'basic flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1764:1: 'basic flow'
			{
			 before(grammarAccess.getBasicFlowAccess().getBasicFlowKeyword_0()); 
			match(input,17,FOLLOW_17_in_rule__BasicFlow__Group__0__Impl3612); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1777:1: rule__BasicFlow__Group__1 : rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2 ;
	public final void rule__BasicFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1781:2: ( rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1782:2: rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__1__Impl_in_rule__BasicFlow__Group__13643);
			rule__BasicFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__2_in_rule__BasicFlow__Group__13646);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1789:1: rule__BasicFlow__Group__1__Impl : ( () ) ;
	public final void rule__BasicFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1793:1: ( ( () ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1794:1: ( () )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1794:1: ( () )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1795:1: ()
			{
			 before(grammarAccess.getBasicFlowAccess().getBasicFlowAction_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1796:1: ()
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1798:1: 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1808:1: rule__BasicFlow__Group__2 : rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3 ;
	public final void rule__BasicFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1812:2: ( rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1813:2: rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__2__Impl_in_rule__BasicFlow__Group__23704);
			rule__BasicFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__3_in_rule__BasicFlow__Group__23707);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1820:1: rule__BasicFlow__Group__2__Impl : ( ( rule__BasicFlow__StepsAssignment_2 )* ) ;
	public final void rule__BasicFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1824:1: ( ( ( rule__BasicFlow__StepsAssignment_2 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1825:1: ( ( rule__BasicFlow__StepsAssignment_2 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1825:1: ( ( rule__BasicFlow__StepsAssignment_2 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1826:1: ( rule__BasicFlow__StepsAssignment_2 )*
			{
			 before(grammarAccess.getBasicFlowAccess().getStepsAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1827:2: ( rule__BasicFlow__StepsAssignment_2 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==35||LA21_0==40) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1827:2: rule__BasicFlow__StepsAssignment_2
					{
					pushFollow(FOLLOW_rule__BasicFlow__StepsAssignment_2_in_rule__BasicFlow__Group__2__Impl3734);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1837:1: rule__BasicFlow__Group__3 : rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4 ;
	public final void rule__BasicFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1841:2: ( rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1842:2: rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__3__Impl_in_rule__BasicFlow__Group__33765);
			rule__BasicFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__4_in_rule__BasicFlow__Group__33768);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1849:1: rule__BasicFlow__Group__3__Impl : ( 'end flow' ) ;
	public final void rule__BasicFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1853:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1854:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1854:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1855:1: 'end flow'
			{
			 before(grammarAccess.getBasicFlowAccess().getEndFlowKeyword_3()); 
			match(input,21,FOLLOW_21_in_rule__BasicFlow__Group__3__Impl3796); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1868:1: rule__BasicFlow__Group__4 : rule__BasicFlow__Group__4__Impl ;
	public final void rule__BasicFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1872:2: ( rule__BasicFlow__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1873:2: rule__BasicFlow__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__4__Impl_in_rule__BasicFlow__Group__43827);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1879:1: rule__BasicFlow__Group__4__Impl : ( ( rule__BasicFlow__Group_4__0 )? ) ;
	public final void rule__BasicFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1883:1: ( ( ( rule__BasicFlow__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1884:1: ( ( rule__BasicFlow__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1884:1: ( ( rule__BasicFlow__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1885:1: ( rule__BasicFlow__Group_4__0 )?
			{
			 before(grammarAccess.getBasicFlowAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1886:2: ( rule__BasicFlow__Group_4__0 )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==45) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1886:2: rule__BasicFlow__Group_4__0
					{
					pushFollow(FOLLOW_rule__BasicFlow__Group_4__0_in_rule__BasicFlow__Group__4__Impl3854);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1906:1: rule__BasicFlow__Group_4__0 : rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1 ;
	public final void rule__BasicFlow__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1910:2: ( rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1911:2: rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group_4__0__Impl_in_rule__BasicFlow__Group_4__03895);
			rule__BasicFlow__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group_4__1_in_rule__BasicFlow__Group_4__03898);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1918:1: rule__BasicFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
	public final void rule__BasicFlow__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1922:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1923:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1923:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1924:1: 'with postcondition'
			{
			 before(grammarAccess.getBasicFlowAccess().getWithPostconditionKeyword_4_0()); 
			match(input,45,FOLLOW_45_in_rule__BasicFlow__Group_4__0__Impl3926); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1937:1: rule__BasicFlow__Group_4__1 : rule__BasicFlow__Group_4__1__Impl ;
	public final void rule__BasicFlow__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1941:2: ( rule__BasicFlow__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1942:2: rule__BasicFlow__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group_4__1__Impl_in_rule__BasicFlow__Group_4__13957);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1948:1: rule__BasicFlow__Group_4__1__Impl : ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) ) ;
	public final void rule__BasicFlow__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1952:1: ( ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1953:1: ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1953:1: ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1954:1: ( rule__BasicFlow__FinalStateAssignment_4_1 )
			{
			 before(grammarAccess.getBasicFlowAccess().getFinalStateAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1955:2: ( rule__BasicFlow__FinalStateAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1955:2: rule__BasicFlow__FinalStateAssignment_4_1
			{
			pushFollow(FOLLOW_rule__BasicFlow__FinalStateAssignment_4_1_in_rule__BasicFlow__Group_4__1__Impl3984);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1969:1: rule__ExceptionFlow__Group__0 : rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1 ;
	public final void rule__ExceptionFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1973:2: ( rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1974:2: rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__0__Impl_in_rule__ExceptionFlow__Group__04018);
			rule__ExceptionFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__1_in_rule__ExceptionFlow__Group__04021);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1981:1: rule__ExceptionFlow__Group__0__Impl : ( 'exception flow' ) ;
	public final void rule__ExceptionFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1985:1: ( ( 'exception flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1986:1: ( 'exception flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1986:1: ( 'exception flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1987:1: 'exception flow'
			{
			 before(grammarAccess.getExceptionFlowAccess().getExceptionFlowKeyword_0()); 
			match(input,24,FOLLOW_24_in_rule__ExceptionFlow__Group__0__Impl4049); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2000:1: rule__ExceptionFlow__Group__1 : rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2 ;
	public final void rule__ExceptionFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2004:2: ( rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2005:2: rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__1__Impl_in_rule__ExceptionFlow__Group__14080);
			rule__ExceptionFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__2_in_rule__ExceptionFlow__Group__14083);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2012:1: rule__ExceptionFlow__Group__1__Impl : ( ( rule__ExceptionFlow__NameAssignment_1 ) ) ;
	public final void rule__ExceptionFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2016:1: ( ( ( rule__ExceptionFlow__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2017:1: ( ( rule__ExceptionFlow__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2017:1: ( ( rule__ExceptionFlow__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2018:1: ( rule__ExceptionFlow__NameAssignment_1 )
			{
			 before(grammarAccess.getExceptionFlowAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2019:2: ( rule__ExceptionFlow__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2019:2: rule__ExceptionFlow__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__NameAssignment_1_in_rule__ExceptionFlow__Group__1__Impl4110);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2029:1: rule__ExceptionFlow__Group__2 : rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3 ;
	public final void rule__ExceptionFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2033:2: ( rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2034:2: rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__2__Impl_in_rule__ExceptionFlow__Group__24140);
			rule__ExceptionFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__3_in_rule__ExceptionFlow__Group__24143);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2041:1: rule__ExceptionFlow__Group__2__Impl : ( 'if' ) ;
	public final void rule__ExceptionFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2045:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2046:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2046:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2047:1: 'if'
			{
			 before(grammarAccess.getExceptionFlowAccess().getIfKeyword_2()); 
			match(input,26,FOLLOW_26_in_rule__ExceptionFlow__Group__2__Impl4171); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2060:1: rule__ExceptionFlow__Group__3 : rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4 ;
	public final void rule__ExceptionFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2064:2: ( rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2065:2: rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__3__Impl_in_rule__ExceptionFlow__Group__34202);
			rule__ExceptionFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__4_in_rule__ExceptionFlow__Group__34205);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2072:1: rule__ExceptionFlow__Group__3__Impl : ( ( rule__ExceptionFlow__ConditionAssignment_3 ) ) ;
	public final void rule__ExceptionFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2076:1: ( ( ( rule__ExceptionFlow__ConditionAssignment_3 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2077:1: ( ( rule__ExceptionFlow__ConditionAssignment_3 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2077:1: ( ( rule__ExceptionFlow__ConditionAssignment_3 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2078:1: ( rule__ExceptionFlow__ConditionAssignment_3 )
			{
			 before(grammarAccess.getExceptionFlowAccess().getConditionAssignment_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2079:2: ( rule__ExceptionFlow__ConditionAssignment_3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2079:2: rule__ExceptionFlow__ConditionAssignment_3
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__ConditionAssignment_3_in_rule__ExceptionFlow__Group__3__Impl4232);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2089:1: rule__ExceptionFlow__Group__4 : rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5 ;
	public final void rule__ExceptionFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2093:2: ( rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2094:2: rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__4__Impl_in_rule__ExceptionFlow__Group__44262);
			rule__ExceptionFlow__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__5_in_rule__ExceptionFlow__Group__44265);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2101:1: rule__ExceptionFlow__Group__4__Impl : ( 'then' ) ;
	public final void rule__ExceptionFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2105:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2106:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2106:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2107:1: 'then'
			{
			 before(grammarAccess.getExceptionFlowAccess().getThenKeyword_4()); 
			match(input,42,FOLLOW_42_in_rule__ExceptionFlow__Group__4__Impl4293); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2120:1: rule__ExceptionFlow__Group__5 : rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6 ;
	public final void rule__ExceptionFlow__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2124:2: ( rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2125:2: rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__5__Impl_in_rule__ExceptionFlow__Group__54324);
			rule__ExceptionFlow__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__6_in_rule__ExceptionFlow__Group__54327);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2132:1: rule__ExceptionFlow__Group__5__Impl : ( ( rule__ExceptionFlow__StepsAssignment_5 )* ) ;
	public final void rule__ExceptionFlow__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2136:1: ( ( ( rule__ExceptionFlow__StepsAssignment_5 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2137:1: ( ( rule__ExceptionFlow__StepsAssignment_5 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2137:1: ( ( rule__ExceptionFlow__StepsAssignment_5 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2138:1: ( rule__ExceptionFlow__StepsAssignment_5 )*
			{
			 before(grammarAccess.getExceptionFlowAccess().getStepsAssignment_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2139:2: ( rule__ExceptionFlow__StepsAssignment_5 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==35||LA23_0==40) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2139:2: rule__ExceptionFlow__StepsAssignment_5
					{
					pushFollow(FOLLOW_rule__ExceptionFlow__StepsAssignment_5_in_rule__ExceptionFlow__Group__5__Impl4354);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2149:1: rule__ExceptionFlow__Group__6 : rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7 ;
	public final void rule__ExceptionFlow__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2153:2: ( rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2154:2: rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__6__Impl_in_rule__ExceptionFlow__Group__64385);
			rule__ExceptionFlow__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__7_in_rule__ExceptionFlow__Group__64388);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2161:1: rule__ExceptionFlow__Group__6__Impl : ( 'end flow' ) ;
	public final void rule__ExceptionFlow__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2165:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2166:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2166:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2167:1: 'end flow'
			{
			 before(grammarAccess.getExceptionFlowAccess().getEndFlowKeyword_6()); 
			match(input,21,FOLLOW_21_in_rule__ExceptionFlow__Group__6__Impl4416); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2180:1: rule__ExceptionFlow__Group__7 : rule__ExceptionFlow__Group__7__Impl ;
	public final void rule__ExceptionFlow__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2184:2: ( rule__ExceptionFlow__Group__7__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2185:2: rule__ExceptionFlow__Group__7__Impl
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__7__Impl_in_rule__ExceptionFlow__Group__74447);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2191:1: rule__ExceptionFlow__Group__7__Impl : ( ( rule__ExceptionFlow__Group_7__0 )? ) ;
	public final void rule__ExceptionFlow__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2195:1: ( ( ( rule__ExceptionFlow__Group_7__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2196:1: ( ( rule__ExceptionFlow__Group_7__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2196:1: ( ( rule__ExceptionFlow__Group_7__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2197:1: ( rule__ExceptionFlow__Group_7__0 )?
			{
			 before(grammarAccess.getExceptionFlowAccess().getGroup_7()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2198:2: ( rule__ExceptionFlow__Group_7__0 )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==45) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2198:2: rule__ExceptionFlow__Group_7__0
					{
					pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__0_in_rule__ExceptionFlow__Group__7__Impl4474);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2224:1: rule__ExceptionFlow__Group_7__0 : rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1 ;
	public final void rule__ExceptionFlow__Group_7__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2228:2: ( rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2229:2: rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__0__Impl_in_rule__ExceptionFlow__Group_7__04521);
			rule__ExceptionFlow__Group_7__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__1_in_rule__ExceptionFlow__Group_7__04524);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2236:1: rule__ExceptionFlow__Group_7__0__Impl : ( 'with postcondition' ) ;
	public final void rule__ExceptionFlow__Group_7__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2240:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2241:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2241:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2242:1: 'with postcondition'
			{
			 before(grammarAccess.getExceptionFlowAccess().getWithPostconditionKeyword_7_0()); 
			match(input,45,FOLLOW_45_in_rule__ExceptionFlow__Group_7__0__Impl4552); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2255:1: rule__ExceptionFlow__Group_7__1 : rule__ExceptionFlow__Group_7__1__Impl ;
	public final void rule__ExceptionFlow__Group_7__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2259:2: ( rule__ExceptionFlow__Group_7__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2260:2: rule__ExceptionFlow__Group_7__1__Impl
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__1__Impl_in_rule__ExceptionFlow__Group_7__14583);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2266:1: rule__ExceptionFlow__Group_7__1__Impl : ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) ) ;
	public final void rule__ExceptionFlow__Group_7__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2270:1: ( ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2271:1: ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2271:1: ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2272:1: ( rule__ExceptionFlow__FinalStateAssignment_7_1 )
			{
			 before(grammarAccess.getExceptionFlowAccess().getFinalStateAssignment_7_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2273:2: ( rule__ExceptionFlow__FinalStateAssignment_7_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2273:2: rule__ExceptionFlow__FinalStateAssignment_7_1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__FinalStateAssignment_7_1_in_rule__ExceptionFlow__Group_7__1__Impl4610);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2287:1: rule__AlternativeFlow__Group__0 : rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1 ;
	public final void rule__AlternativeFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2291:2: ( rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2292:2: rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__0__Impl_in_rule__AlternativeFlow__Group__04644);
			rule__AlternativeFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__1_in_rule__AlternativeFlow__Group__04647);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2299:1: rule__AlternativeFlow__Group__0__Impl : ( 'alternative flow' ) ;
	public final void rule__AlternativeFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2303:1: ( ( 'alternative flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2304:1: ( 'alternative flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2304:1: ( 'alternative flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2305:1: 'alternative flow'
			{
			 before(grammarAccess.getAlternativeFlowAccess().getAlternativeFlowKeyword_0()); 
			match(input,14,FOLLOW_14_in_rule__AlternativeFlow__Group__0__Impl4675); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2318:1: rule__AlternativeFlow__Group__1 : rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2 ;
	public final void rule__AlternativeFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2322:2: ( rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2323:2: rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__1__Impl_in_rule__AlternativeFlow__Group__14706);
			rule__AlternativeFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__2_in_rule__AlternativeFlow__Group__14709);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2330:1: rule__AlternativeFlow__Group__1__Impl : ( ( rule__AlternativeFlow__NameAssignment_1 ) ) ;
	public final void rule__AlternativeFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2334:1: ( ( ( rule__AlternativeFlow__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2335:1: ( ( rule__AlternativeFlow__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2335:1: ( ( rule__AlternativeFlow__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2336:1: ( rule__AlternativeFlow__NameAssignment_1 )
			{
			 before(grammarAccess.getAlternativeFlowAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2337:2: ( rule__AlternativeFlow__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2337:2: rule__AlternativeFlow__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__NameAssignment_1_in_rule__AlternativeFlow__Group__1__Impl4736);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2347:1: rule__AlternativeFlow__Group__2 : rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3 ;
	public final void rule__AlternativeFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2351:2: ( rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2352:2: rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__2__Impl_in_rule__AlternativeFlow__Group__24766);
			rule__AlternativeFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__3_in_rule__AlternativeFlow__Group__24769);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2359:1: rule__AlternativeFlow__Group__2__Impl : ( ( rule__AlternativeFlow__StepsAssignment_2 )* ) ;
	public final void rule__AlternativeFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2363:1: ( ( ( rule__AlternativeFlow__StepsAssignment_2 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2364:1: ( ( rule__AlternativeFlow__StepsAssignment_2 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2364:1: ( ( rule__AlternativeFlow__StepsAssignment_2 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2365:1: ( rule__AlternativeFlow__StepsAssignment_2 )*
			{
			 before(grammarAccess.getAlternativeFlowAccess().getStepsAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2366:2: ( rule__AlternativeFlow__StepsAssignment_2 )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==35||LA25_0==40) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2366:2: rule__AlternativeFlow__StepsAssignment_2
					{
					pushFollow(FOLLOW_rule__AlternativeFlow__StepsAssignment_2_in_rule__AlternativeFlow__Group__2__Impl4796);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2376:1: rule__AlternativeFlow__Group__3 : rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4 ;
	public final void rule__AlternativeFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2380:2: ( rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2381:2: rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__3__Impl_in_rule__AlternativeFlow__Group__34827);
			rule__AlternativeFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__4_in_rule__AlternativeFlow__Group__34830);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2388:1: rule__AlternativeFlow__Group__3__Impl : ( 'end flow' ) ;
	public final void rule__AlternativeFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2392:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2393:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2393:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2394:1: 'end flow'
			{
			 before(grammarAccess.getAlternativeFlowAccess().getEndFlowKeyword_3()); 
			match(input,21,FOLLOW_21_in_rule__AlternativeFlow__Group__3__Impl4858); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2407:1: rule__AlternativeFlow__Group__4 : rule__AlternativeFlow__Group__4__Impl ;
	public final void rule__AlternativeFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2411:2: ( rule__AlternativeFlow__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2412:2: rule__AlternativeFlow__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__4__Impl_in_rule__AlternativeFlow__Group__44889);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2418:1: rule__AlternativeFlow__Group__4__Impl : ( ( rule__AlternativeFlow__Group_4__0 )? ) ;
	public final void rule__AlternativeFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2422:1: ( ( ( rule__AlternativeFlow__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2423:1: ( ( rule__AlternativeFlow__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2423:1: ( ( rule__AlternativeFlow__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2424:1: ( rule__AlternativeFlow__Group_4__0 )?
			{
			 before(grammarAccess.getAlternativeFlowAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2425:2: ( rule__AlternativeFlow__Group_4__0 )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==45) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2425:2: rule__AlternativeFlow__Group_4__0
					{
					pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__0_in_rule__AlternativeFlow__Group__4__Impl4916);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2445:1: rule__AlternativeFlow__Group_4__0 : rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1 ;
	public final void rule__AlternativeFlow__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2449:2: ( rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2450:2: rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__0__Impl_in_rule__AlternativeFlow__Group_4__04957);
			rule__AlternativeFlow__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__1_in_rule__AlternativeFlow__Group_4__04960);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2457:1: rule__AlternativeFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
	public final void rule__AlternativeFlow__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2461:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2462:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2462:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2463:1: 'with postcondition'
			{
			 before(grammarAccess.getAlternativeFlowAccess().getWithPostconditionKeyword_4_0()); 
			match(input,45,FOLLOW_45_in_rule__AlternativeFlow__Group_4__0__Impl4988); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2476:1: rule__AlternativeFlow__Group_4__1 : rule__AlternativeFlow__Group_4__1__Impl ;
	public final void rule__AlternativeFlow__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2480:2: ( rule__AlternativeFlow__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2481:2: rule__AlternativeFlow__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__1__Impl_in_rule__AlternativeFlow__Group_4__15019);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2487:1: rule__AlternativeFlow__Group_4__1__Impl : ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) ) ;
	public final void rule__AlternativeFlow__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2491:1: ( ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2492:1: ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2492:1: ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2493:1: ( rule__AlternativeFlow__FinalStateAssignment_4_1 )
			{
			 before(grammarAccess.getAlternativeFlowAccess().getFinalStateAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2494:2: ( rule__AlternativeFlow__FinalStateAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2494:2: rule__AlternativeFlow__FinalStateAssignment_4_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__FinalStateAssignment_4_1_in_rule__AlternativeFlow__Group_4__1__Impl5046);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2508:1: rule__ParallelFlow__Group__0 : rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1 ;
	public final void rule__ParallelFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2512:2: ( rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2513:2: rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__0__Impl_in_rule__ParallelFlow__Group__05080);
			rule__ParallelFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__1_in_rule__ParallelFlow__Group__05083);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2520:1: rule__ParallelFlow__Group__0__Impl : ( 'parallel flow' ) ;
	public final void rule__ParallelFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2524:1: ( ( 'parallel flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2525:1: ( 'parallel flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2525:1: ( 'parallel flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2526:1: 'parallel flow'
			{
			 before(grammarAccess.getParallelFlowAccess().getParallelFlowKeyword_0()); 
			match(input,34,FOLLOW_34_in_rule__ParallelFlow__Group__0__Impl5111); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2539:1: rule__ParallelFlow__Group__1 : rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2 ;
	public final void rule__ParallelFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2543:2: ( rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2544:2: rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__1__Impl_in_rule__ParallelFlow__Group__15142);
			rule__ParallelFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__2_in_rule__ParallelFlow__Group__15145);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2551:1: rule__ParallelFlow__Group__1__Impl : ( ( rule__ParallelFlow__NameAssignment_1 ) ) ;
	public final void rule__ParallelFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2555:1: ( ( ( rule__ParallelFlow__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2556:1: ( ( rule__ParallelFlow__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2556:1: ( ( rule__ParallelFlow__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2557:1: ( rule__ParallelFlow__NameAssignment_1 )
			{
			 before(grammarAccess.getParallelFlowAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2558:2: ( rule__ParallelFlow__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2558:2: rule__ParallelFlow__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__NameAssignment_1_in_rule__ParallelFlow__Group__1__Impl5172);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2568:1: rule__ParallelFlow__Group__2 : rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3 ;
	public final void rule__ParallelFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2572:2: ( rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2573:2: rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__2__Impl_in_rule__ParallelFlow__Group__25202);
			rule__ParallelFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__3_in_rule__ParallelFlow__Group__25205);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2580:1: rule__ParallelFlow__Group__2__Impl : ( ( rule__ParallelFlow__StepsAssignment_2 )* ) ;
	public final void rule__ParallelFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2584:1: ( ( ( rule__ParallelFlow__StepsAssignment_2 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2585:1: ( ( rule__ParallelFlow__StepsAssignment_2 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2585:1: ( ( rule__ParallelFlow__StepsAssignment_2 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2586:1: ( rule__ParallelFlow__StepsAssignment_2 )*
			{
			 before(grammarAccess.getParallelFlowAccess().getStepsAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2587:2: ( rule__ParallelFlow__StepsAssignment_2 )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==35||LA27_0==40) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2587:2: rule__ParallelFlow__StepsAssignment_2
					{
					pushFollow(FOLLOW_rule__ParallelFlow__StepsAssignment_2_in_rule__ParallelFlow__Group__2__Impl5232);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2597:1: rule__ParallelFlow__Group__3 : rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4 ;
	public final void rule__ParallelFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2601:2: ( rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2602:2: rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__3__Impl_in_rule__ParallelFlow__Group__35263);
			rule__ParallelFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__4_in_rule__ParallelFlow__Group__35266);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2609:1: rule__ParallelFlow__Group__3__Impl : ( 'end flow' ) ;
	public final void rule__ParallelFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2613:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2614:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2614:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2615:1: 'end flow'
			{
			 before(grammarAccess.getParallelFlowAccess().getEndFlowKeyword_3()); 
			match(input,21,FOLLOW_21_in_rule__ParallelFlow__Group__3__Impl5294); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2628:1: rule__ParallelFlow__Group__4 : rule__ParallelFlow__Group__4__Impl ;
	public final void rule__ParallelFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2632:2: ( rule__ParallelFlow__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2633:2: rule__ParallelFlow__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__4__Impl_in_rule__ParallelFlow__Group__45325);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2639:1: rule__ParallelFlow__Group__4__Impl : ( ( rule__ParallelFlow__Group_4__0 )? ) ;
	public final void rule__ParallelFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2643:1: ( ( ( rule__ParallelFlow__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2644:1: ( ( rule__ParallelFlow__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2644:1: ( ( rule__ParallelFlow__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2645:1: ( rule__ParallelFlow__Group_4__0 )?
			{
			 before(grammarAccess.getParallelFlowAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2646:2: ( rule__ParallelFlow__Group_4__0 )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==45) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2646:2: rule__ParallelFlow__Group_4__0
					{
					pushFollow(FOLLOW_rule__ParallelFlow__Group_4__0_in_rule__ParallelFlow__Group__4__Impl5352);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2666:1: rule__ParallelFlow__Group_4__0 : rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1 ;
	public final void rule__ParallelFlow__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2670:2: ( rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2671:2: rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group_4__0__Impl_in_rule__ParallelFlow__Group_4__05393);
			rule__ParallelFlow__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group_4__1_in_rule__ParallelFlow__Group_4__05396);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2678:1: rule__ParallelFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
	public final void rule__ParallelFlow__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2682:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2683:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2683:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2684:1: 'with postcondition'
			{
			 before(grammarAccess.getParallelFlowAccess().getWithPostconditionKeyword_4_0()); 
			match(input,45,FOLLOW_45_in_rule__ParallelFlow__Group_4__0__Impl5424); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2697:1: rule__ParallelFlow__Group_4__1 : rule__ParallelFlow__Group_4__1__Impl ;
	public final void rule__ParallelFlow__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2701:2: ( rule__ParallelFlow__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2702:2: rule__ParallelFlow__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group_4__1__Impl_in_rule__ParallelFlow__Group_4__15455);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2708:1: rule__ParallelFlow__Group_4__1__Impl : ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) ) ;
	public final void rule__ParallelFlow__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2712:1: ( ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2713:1: ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2713:1: ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2714:1: ( rule__ParallelFlow__FinalStateAssignment_4_1 )
			{
			 before(grammarAccess.getParallelFlowAccess().getFinalStateAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2715:2: ( rule__ParallelFlow__FinalStateAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2715:2: rule__ParallelFlow__FinalStateAssignment_4_1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__FinalStateAssignment_4_1_in_rule__ParallelFlow__Group_4__1__Impl5482);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2729:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
	public final void rule__Condition__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2733:2: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2734:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
			{
			pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05516);
			rule__Condition__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05519);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2741:1: rule__Condition__Group__0__Impl : ( 'if' ) ;
	public final void rule__Condition__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2745:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2746:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2746:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2747:1: 'if'
			{
			 before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
			match(input,26,FOLLOW_26_in_rule__Condition__Group__0__Impl5547); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2760:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
	public final void rule__Condition__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2764:2: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2765:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
			{
			pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15578);
			rule__Condition__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__15581);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2772:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ConditionAssignment_1 ) ) ;
	public final void rule__Condition__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2776:1: ( ( ( rule__Condition__ConditionAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2777:1: ( ( rule__Condition__ConditionAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2777:1: ( ( rule__Condition__ConditionAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2778:1: ( rule__Condition__ConditionAssignment_1 )
			{
			 before(grammarAccess.getConditionAccess().getConditionAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2779:2: ( rule__Condition__ConditionAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2779:2: rule__Condition__ConditionAssignment_1
			{
			pushFollow(FOLLOW_rule__Condition__ConditionAssignment_1_in_rule__Condition__Group__1__Impl5608);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2789:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
	public final void rule__Condition__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2793:2: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2794:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
			{
			pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__25638);
			rule__Condition__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__25641);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2801:1: rule__Condition__Group__2__Impl : ( 'then' ) ;
	public final void rule__Condition__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2805:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2806:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2806:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2807:1: 'then'
			{
			 before(grammarAccess.getConditionAccess().getThenKeyword_2()); 
			match(input,42,FOLLOW_42_in_rule__Condition__Group__2__Impl5669); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2820:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
	public final void rule__Condition__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2824:2: ( rule__Condition__Group__3__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2825:2: rule__Condition__Group__3__Impl
			{
			pushFollow(FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__35700);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2831:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__Group_3__0 )? ) ;
	public final void rule__Condition__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2835:1: ( ( ( rule__Condition__Group_3__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2836:1: ( ( rule__Condition__Group_3__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2836:1: ( ( rule__Condition__Group_3__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2837:1: ( rule__Condition__Group_3__0 )?
			{
			 before(grammarAccess.getConditionAccess().getGroup_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2838:2: ( rule__Condition__Group_3__0 )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==19) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2838:2: rule__Condition__Group_3__0
					{
					pushFollow(FOLLOW_rule__Condition__Group_3__0_in_rule__Condition__Group__3__Impl5727);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2856:1: rule__Condition__Group_3__0 : rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 ;
	public final void rule__Condition__Group_3__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2860:2: ( rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2861:2: rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1
			{
			pushFollow(FOLLOW_rule__Condition__Group_3__0__Impl_in_rule__Condition__Group_3__05766);
			rule__Condition__Group_3__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group_3__1_in_rule__Condition__Group_3__05769);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2868:1: rule__Condition__Group_3__0__Impl : ( 'continue with step' ) ;
	public final void rule__Condition__Group_3__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2872:1: ( ( 'continue with step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2873:1: ( 'continue with step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2873:1: ( 'continue with step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2874:1: 'continue with step'
			{
			 before(grammarAccess.getConditionAccess().getContinueWithStepKeyword_3_0()); 
			match(input,19,FOLLOW_19_in_rule__Condition__Group_3__0__Impl5797); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2887:1: rule__Condition__Group_3__1 : rule__Condition__Group_3__1__Impl ;
	public final void rule__Condition__Group_3__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2891:2: ( rule__Condition__Group_3__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2892:2: rule__Condition__Group_3__1__Impl
			{
			pushFollow(FOLLOW_rule__Condition__Group_3__1__Impl_in_rule__Condition__Group_3__15828);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2898:1: rule__Condition__Group_3__1__Impl : ( ( rule__Condition__ContinuationAssignment_3_1 ) ) ;
	public final void rule__Condition__Group_3__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2902:1: ( ( ( rule__Condition__ContinuationAssignment_3_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2903:1: ( ( rule__Condition__ContinuationAssignment_3_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2903:1: ( ( rule__Condition__ContinuationAssignment_3_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2904:1: ( rule__Condition__ContinuationAssignment_3_1 )
			{
			 before(grammarAccess.getConditionAccess().getContinuationAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2905:2: ( rule__Condition__ContinuationAssignment_3_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2905:2: rule__Condition__ContinuationAssignment_3_1
			{
			pushFollow(FOLLOW_rule__Condition__ContinuationAssignment_3_1_in_rule__Condition__Group_3__1__Impl5855);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2919:1: rule__LocalAlternative__Group__0 : rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1 ;
	public final void rule__LocalAlternative__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2923:2: ( rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2924:2: rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__0__Impl_in_rule__LocalAlternative__Group__05889);
			rule__LocalAlternative__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__1_in_rule__LocalAlternative__Group__05892);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2931:1: rule__LocalAlternative__Group__0__Impl : ( 'if' ) ;
	public final void rule__LocalAlternative__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2935:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2936:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2936:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2937:1: 'if'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getIfKeyword_0()); 
			match(input,26,FOLLOW_26_in_rule__LocalAlternative__Group__0__Impl5920); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2950:1: rule__LocalAlternative__Group__1 : rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2 ;
	public final void rule__LocalAlternative__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2954:2: ( rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2955:2: rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__1__Impl_in_rule__LocalAlternative__Group__15951);
			rule__LocalAlternative__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__2_in_rule__LocalAlternative__Group__15954);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2962:1: rule__LocalAlternative__Group__1__Impl : ( ( rule__LocalAlternative__ConditionAssignment_1 ) ) ;
	public final void rule__LocalAlternative__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2966:1: ( ( ( rule__LocalAlternative__ConditionAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2967:1: ( ( rule__LocalAlternative__ConditionAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2967:1: ( ( rule__LocalAlternative__ConditionAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2968:1: ( rule__LocalAlternative__ConditionAssignment_1 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getConditionAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2969:2: ( rule__LocalAlternative__ConditionAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2969:2: rule__LocalAlternative__ConditionAssignment_1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__ConditionAssignment_1_in_rule__LocalAlternative__Group__1__Impl5981);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2979:1: rule__LocalAlternative__Group__2 : rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3 ;
	public final void rule__LocalAlternative__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2983:2: ( rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2984:2: rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__2__Impl_in_rule__LocalAlternative__Group__26011);
			rule__LocalAlternative__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__3_in_rule__LocalAlternative__Group__26014);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2991:1: rule__LocalAlternative__Group__2__Impl : ( 'then' ) ;
	public final void rule__LocalAlternative__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2995:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2996:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2996:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2997:1: 'then'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getThenKeyword_2()); 
			match(input,42,FOLLOW_42_in_rule__LocalAlternative__Group__2__Impl6042); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3010:1: rule__LocalAlternative__Group__3 : rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4 ;
	public final void rule__LocalAlternative__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3014:2: ( rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3015:2: rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__3__Impl_in_rule__LocalAlternative__Group__36073);
			rule__LocalAlternative__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__4_in_rule__LocalAlternative__Group__36076);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3022:1: rule__LocalAlternative__Group__3__Impl : ( ( rule__LocalAlternative__Alternatives_3 ) ) ;
	public final void rule__LocalAlternative__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3026:1: ( ( ( rule__LocalAlternative__Alternatives_3 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3027:1: ( ( rule__LocalAlternative__Alternatives_3 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3027:1: ( ( rule__LocalAlternative__Alternatives_3 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3028:1: ( rule__LocalAlternative__Alternatives_3 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getAlternatives_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3029:2: ( rule__LocalAlternative__Alternatives_3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3029:2: rule__LocalAlternative__Alternatives_3
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Alternatives_3_in_rule__LocalAlternative__Group__3__Impl6103);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3039:1: rule__LocalAlternative__Group__4 : rule__LocalAlternative__Group__4__Impl ;
	public final void rule__LocalAlternative__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3043:2: ( rule__LocalAlternative__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3044:2: rule__LocalAlternative__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__4__Impl_in_rule__LocalAlternative__Group__46133);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3050:1: rule__LocalAlternative__Group__4__Impl : ( ( rule__LocalAlternative__Group_4__0 )? ) ;
	public final void rule__LocalAlternative__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3054:1: ( ( ( rule__LocalAlternative__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3055:1: ( ( rule__LocalAlternative__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3055:1: ( ( rule__LocalAlternative__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3056:1: ( rule__LocalAlternative__Group_4__0 )?
			{
			 before(grammarAccess.getLocalAlternativeAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3057:2: ( rule__LocalAlternative__Group_4__0 )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==19) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3057:2: rule__LocalAlternative__Group_4__0
					{
					pushFollow(FOLLOW_rule__LocalAlternative__Group_4__0_in_rule__LocalAlternative__Group__4__Impl6160);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3077:1: rule__LocalAlternative__Group_3_1__0 : rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1 ;
	public final void rule__LocalAlternative__Group_3_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3081:2: ( rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3082:2: rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__0__Impl_in_rule__LocalAlternative__Group_3_1__06201);
			rule__LocalAlternative__Group_3_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__1_in_rule__LocalAlternative__Group_3_1__06204);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3089:1: rule__LocalAlternative__Group_3_1__0__Impl : ( 'invoke usecase' ) ;
	public final void rule__LocalAlternative__Group_3_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3093:1: ( ( 'invoke usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3094:1: ( 'invoke usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3094:1: ( 'invoke usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3095:1: 'invoke usecase'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokeUsecaseKeyword_3_1_0()); 
			match(input,28,FOLLOW_28_in_rule__LocalAlternative__Group_3_1__0__Impl6232); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3108:1: rule__LocalAlternative__Group_3_1__1 : rule__LocalAlternative__Group_3_1__1__Impl ;
	public final void rule__LocalAlternative__Group_3_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3112:2: ( rule__LocalAlternative__Group_3_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3113:2: rule__LocalAlternative__Group_3_1__1__Impl
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__1__Impl_in_rule__LocalAlternative__Group_3_1__16263);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3119:1: rule__LocalAlternative__Group_3_1__1__Impl : ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) ) ;
	public final void rule__LocalAlternative__Group_3_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3123:1: ( ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3124:1: ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3124:1: ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3125:1: ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseAssignment_3_1_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3126:2: ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3126:2: rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1_in_rule__LocalAlternative__Group_3_1__1__Impl6290);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3140:1: rule__LocalAlternative__Group_4__0 : rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1 ;
	public final void rule__LocalAlternative__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3144:2: ( rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3145:2: rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_4__0__Impl_in_rule__LocalAlternative__Group_4__06324);
			rule__LocalAlternative__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group_4__1_in_rule__LocalAlternative__Group_4__06327);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3152:1: rule__LocalAlternative__Group_4__0__Impl : ( 'continue with step' ) ;
	public final void rule__LocalAlternative__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3156:1: ( ( 'continue with step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3157:1: ( 'continue with step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3157:1: ( 'continue with step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3158:1: 'continue with step'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinueWithStepKeyword_4_0()); 
			match(input,19,FOLLOW_19_in_rule__LocalAlternative__Group_4__0__Impl6355); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3171:1: rule__LocalAlternative__Group_4__1 : rule__LocalAlternative__Group_4__1__Impl ;
	public final void rule__LocalAlternative__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3175:2: ( rule__LocalAlternative__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3176:2: rule__LocalAlternative__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_4__1__Impl_in_rule__LocalAlternative__Group_4__16386);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3182:1: rule__LocalAlternative__Group_4__1__Impl : ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) ) ;
	public final void rule__LocalAlternative__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3186:1: ( ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3187:1: ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3187:1: ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3188:1: ( rule__LocalAlternative__ContinuationAssignment_4_1 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinuationAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3189:2: ( rule__LocalAlternative__ContinuationAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3189:2: rule__LocalAlternative__ContinuationAssignment_4_1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__ContinuationAssignment_4_1_in_rule__LocalAlternative__Group_4__1__Impl6413);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3203:1: rule__AlternativeFlowAlternative__Group__0 : rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1 ;
	public final void rule__AlternativeFlowAlternative__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3207:2: ( rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3208:2: rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__0__Impl_in_rule__AlternativeFlowAlternative__Group__06447);
			rule__AlternativeFlowAlternative__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__1_in_rule__AlternativeFlowAlternative__Group__06450);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3215:1: rule__AlternativeFlowAlternative__Group__0__Impl : ( 'if' ) ;
	public final void rule__AlternativeFlowAlternative__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3219:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3220:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3220:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3221:1: 'if'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getIfKeyword_0()); 
			match(input,26,FOLLOW_26_in_rule__AlternativeFlowAlternative__Group__0__Impl6478); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3234:1: rule__AlternativeFlowAlternative__Group__1 : rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2 ;
	public final void rule__AlternativeFlowAlternative__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3238:2: ( rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3239:2: rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__1__Impl_in_rule__AlternativeFlowAlternative__Group__16509);
			rule__AlternativeFlowAlternative__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__2_in_rule__AlternativeFlowAlternative__Group__16512);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3246:1: rule__AlternativeFlowAlternative__Group__1__Impl : ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) ) ;
	public final void rule__AlternativeFlowAlternative__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3250:1: ( ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3251:1: ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3251:1: ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3252:1: ( rule__AlternativeFlowAlternative__ConditionAssignment_1 )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getConditionAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3253:2: ( rule__AlternativeFlowAlternative__ConditionAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3253:2: rule__AlternativeFlowAlternative__ConditionAssignment_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__ConditionAssignment_1_in_rule__AlternativeFlowAlternative__Group__1__Impl6539);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3263:1: rule__AlternativeFlowAlternative__Group__2 : rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3 ;
	public final void rule__AlternativeFlowAlternative__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3267:2: ( rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3268:2: rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__2__Impl_in_rule__AlternativeFlowAlternative__Group__26569);
			rule__AlternativeFlowAlternative__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__3_in_rule__AlternativeFlowAlternative__Group__26572);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3275:1: rule__AlternativeFlowAlternative__Group__2__Impl : ( 'then' ) ;
	public final void rule__AlternativeFlowAlternative__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3279:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3280:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3280:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3281:1: 'then'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getThenKeyword_2()); 
			match(input,42,FOLLOW_42_in_rule__AlternativeFlowAlternative__Group__2__Impl6600); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3294:1: rule__AlternativeFlowAlternative__Group__3 : rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4 ;
	public final void rule__AlternativeFlowAlternative__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3298:2: ( rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3299:2: rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__3__Impl_in_rule__AlternativeFlowAlternative__Group__36631);
			rule__AlternativeFlowAlternative__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__4_in_rule__AlternativeFlowAlternative__Group__36634);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3306:1: rule__AlternativeFlowAlternative__Group__3__Impl : ( 'alternative flow' ) ;
	public final void rule__AlternativeFlowAlternative__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3310:1: ( ( 'alternative flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3311:1: ( 'alternative flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3311:1: ( 'alternative flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3312:1: 'alternative flow'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getAlternativeFlowKeyword_3()); 
			match(input,14,FOLLOW_14_in_rule__AlternativeFlowAlternative__Group__3__Impl6662); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3325:1: rule__AlternativeFlowAlternative__Group__4 : rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5 ;
	public final void rule__AlternativeFlowAlternative__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3329:2: ( rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3330:2: rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__4__Impl_in_rule__AlternativeFlowAlternative__Group__46693);
			rule__AlternativeFlowAlternative__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__5_in_rule__AlternativeFlowAlternative__Group__46696);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3337:1: rule__AlternativeFlowAlternative__Group__4__Impl : ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) ) ;
	public final void rule__AlternativeFlowAlternative__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3341:1: ( ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3342:1: ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3342:1: ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3343:1: ( rule__AlternativeFlowAlternative__RefAssignment_4 )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefAssignment_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3344:2: ( rule__AlternativeFlowAlternative__RefAssignment_4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3344:2: rule__AlternativeFlowAlternative__RefAssignment_4
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__RefAssignment_4_in_rule__AlternativeFlowAlternative__Group__4__Impl6723);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3354:1: rule__AlternativeFlowAlternative__Group__5 : rule__AlternativeFlowAlternative__Group__5__Impl ;
	public final void rule__AlternativeFlowAlternative__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3358:2: ( rule__AlternativeFlowAlternative__Group__5__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3359:2: rule__AlternativeFlowAlternative__Group__5__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__5__Impl_in_rule__AlternativeFlowAlternative__Group__56753);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3365:1: rule__AlternativeFlowAlternative__Group__5__Impl : ( ( rule__AlternativeFlowAlternative__Group_5__0 )? ) ;
	public final void rule__AlternativeFlowAlternative__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3369:1: ( ( ( rule__AlternativeFlowAlternative__Group_5__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3370:1: ( ( rule__AlternativeFlowAlternative__Group_5__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3370:1: ( ( rule__AlternativeFlowAlternative__Group_5__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3371:1: ( rule__AlternativeFlowAlternative__Group_5__0 )?
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getGroup_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3372:2: ( rule__AlternativeFlowAlternative__Group_5__0 )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==19) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3372:2: rule__AlternativeFlowAlternative__Group_5__0
					{
					pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__0_in_rule__AlternativeFlowAlternative__Group__5__Impl6780);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3394:1: rule__AlternativeFlowAlternative__Group_5__0 : rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1 ;
	public final void rule__AlternativeFlowAlternative__Group_5__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3398:2: ( rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3399:2: rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__0__Impl_in_rule__AlternativeFlowAlternative__Group_5__06823);
			rule__AlternativeFlowAlternative__Group_5__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__1_in_rule__AlternativeFlowAlternative__Group_5__06826);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3406:1: rule__AlternativeFlowAlternative__Group_5__0__Impl : ( 'continue with step' ) ;
	public final void rule__AlternativeFlowAlternative__Group_5__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3410:1: ( ( 'continue with step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3411:1: ( 'continue with step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3411:1: ( 'continue with step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3412:1: 'continue with step'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinueWithStepKeyword_5_0()); 
			match(input,19,FOLLOW_19_in_rule__AlternativeFlowAlternative__Group_5__0__Impl6854); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3425:1: rule__AlternativeFlowAlternative__Group_5__1 : rule__AlternativeFlowAlternative__Group_5__1__Impl ;
	public final void rule__AlternativeFlowAlternative__Group_5__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3429:2: ( rule__AlternativeFlowAlternative__Group_5__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3430:2: rule__AlternativeFlowAlternative__Group_5__1__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__1__Impl_in_rule__AlternativeFlowAlternative__Group_5__16885);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3436:1: rule__AlternativeFlowAlternative__Group_5__1__Impl : ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) ) ;
	public final void rule__AlternativeFlowAlternative__Group_5__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3440:1: ( ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3441:1: ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3441:1: ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3442:1: ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationAssignment_5_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3443:2: ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3443:2: rule__AlternativeFlowAlternative__ContinuationAssignment_5_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__ContinuationAssignment_5_1_in_rule__AlternativeFlowAlternative__Group_5__1__Impl6912);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3457:1: rule__ParallelStep__Group__0 : rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1 ;
	public final void rule__ParallelStep__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3461:2: ( rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3462:2: rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__0__Impl_in_rule__ParallelStep__Group__06946);
			rule__ParallelStep__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__1_in_rule__ParallelStep__Group__06949);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3469:1: rule__ParallelStep__Group__0__Impl : ( 'parallel step' ) ;
	public final void rule__ParallelStep__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3473:1: ( ( 'parallel step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3474:1: ( 'parallel step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3474:1: ( 'parallel step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3475:1: 'parallel step'
			{
			 before(grammarAccess.getParallelStepAccess().getParallelStepKeyword_0()); 
			match(input,35,FOLLOW_35_in_rule__ParallelStep__Group__0__Impl6977); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3488:1: rule__ParallelStep__Group__1 : rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2 ;
	public final void rule__ParallelStep__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3492:2: ( rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3493:2: rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__1__Impl_in_rule__ParallelStep__Group__17008);
			rule__ParallelStep__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__2_in_rule__ParallelStep__Group__17011);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3500:1: rule__ParallelStep__Group__1__Impl : ( ( rule__ParallelStep__NameAssignment_1 ) ) ;
	public final void rule__ParallelStep__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3504:1: ( ( ( rule__ParallelStep__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3505:1: ( ( rule__ParallelStep__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3505:1: ( ( rule__ParallelStep__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3506:1: ( rule__ParallelStep__NameAssignment_1 )
			{
			 before(grammarAccess.getParallelStepAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3507:2: ( rule__ParallelStep__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3507:2: rule__ParallelStep__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__ParallelStep__NameAssignment_1_in_rule__ParallelStep__Group__1__Impl7038);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3517:1: rule__ParallelStep__Group__2 : rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3 ;
	public final void rule__ParallelStep__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3521:2: ( rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3522:2: rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__2__Impl_in_rule__ParallelStep__Group__27068);
			rule__ParallelStep__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__3_in_rule__ParallelStep__Group__27071);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3529:1: rule__ParallelStep__Group__2__Impl : ( ( rule__ParallelStep__LabelAssignment_2 )? ) ;
	public final void rule__ParallelStep__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3533:1: ( ( ( rule__ParallelStep__LabelAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3534:1: ( ( rule__ParallelStep__LabelAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3534:1: ( ( rule__ParallelStep__LabelAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3535:1: ( rule__ParallelStep__LabelAssignment_2 )?
			{
			 before(grammarAccess.getParallelStepAccess().getLabelAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3536:2: ( rule__ParallelStep__LabelAssignment_2 )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==RULE_STRING) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3536:2: rule__ParallelStep__LabelAssignment_2
					{
					pushFollow(FOLLOW_rule__ParallelStep__LabelAssignment_2_in_rule__ParallelStep__Group__2__Impl7098);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3546:1: rule__ParallelStep__Group__3 : rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4 ;
	public final void rule__ParallelStep__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3550:2: ( rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3551:2: rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__3__Impl_in_rule__ParallelStep__Group__37129);
			rule__ParallelStep__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__4_in_rule__ParallelStep__Group__37132);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3558:1: rule__ParallelStep__Group__3__Impl : ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) ) ;
	public final void rule__ParallelStep__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3562:1: ( ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3563:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3563:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3564:1: ( rule__ParallelStep__InvokedFlowsAssignment_3 )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsAssignment_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3565:2: ( rule__ParallelStep__InvokedFlowsAssignment_3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3565:2: rule__ParallelStep__InvokedFlowsAssignment_3
			{
			pushFollow(FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_3_in_rule__ParallelStep__Group__3__Impl7159);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3575:1: rule__ParallelStep__Group__4 : rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5 ;
	public final void rule__ParallelStep__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3579:2: ( rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3580:2: rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__4__Impl_in_rule__ParallelStep__Group__47189);
			rule__ParallelStep__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__5_in_rule__ParallelStep__Group__47192);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3587:1: rule__ParallelStep__Group__4__Impl : ( ( rule__ParallelStep__Group_4__0 )* ) ;
	public final void rule__ParallelStep__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3591:1: ( ( ( rule__ParallelStep__Group_4__0 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3592:1: ( ( rule__ParallelStep__Group_4__0 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3592:1: ( ( rule__ParallelStep__Group_4__0 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3593:1: ( rule__ParallelStep__Group_4__0 )*
			{
			 before(grammarAccess.getParallelStepAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3594:2: ( rule__ParallelStep__Group_4__0 )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==11) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3594:2: rule__ParallelStep__Group_4__0
					{
					pushFollow(FOLLOW_rule__ParallelStep__Group_4__0_in_rule__ParallelStep__Group__4__Impl7219);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3604:1: rule__ParallelStep__Group__5 : rule__ParallelStep__Group__5__Impl ;
	public final void rule__ParallelStep__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3608:2: ( rule__ParallelStep__Group__5__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3609:2: rule__ParallelStep__Group__5__Impl
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__5__Impl_in_rule__ParallelStep__Group__57250);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3615:1: rule__ParallelStep__Group__5__Impl : ( ( rule__ParallelStep__Group_5__0 )? ) ;
	public final void rule__ParallelStep__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3619:1: ( ( ( rule__ParallelStep__Group_5__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3620:1: ( ( rule__ParallelStep__Group_5__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3620:1: ( ( rule__ParallelStep__Group_5__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3621:1: ( rule__ParallelStep__Group_5__0 )?
			{
			 before(grammarAccess.getParallelStepAccess().getGroup_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3622:2: ( rule__ParallelStep__Group_5__0 )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==30) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3622:2: rule__ParallelStep__Group_5__0
					{
					pushFollow(FOLLOW_rule__ParallelStep__Group_5__0_in_rule__ParallelStep__Group__5__Impl7277);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3644:1: rule__ParallelStep__Group_4__0 : rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1 ;
	public final void rule__ParallelStep__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3648:2: ( rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3649:2: rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_4__0__Impl_in_rule__ParallelStep__Group_4__07320);
			rule__ParallelStep__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group_4__1_in_rule__ParallelStep__Group_4__07323);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3656:1: rule__ParallelStep__Group_4__0__Impl : ( ',' ) ;
	public final void rule__ParallelStep__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3660:1: ( ( ',' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3661:1: ( ',' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3661:1: ( ',' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3662:1: ','
			{
			 before(grammarAccess.getParallelStepAccess().getCommaKeyword_4_0()); 
			match(input,11,FOLLOW_11_in_rule__ParallelStep__Group_4__0__Impl7351); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3675:1: rule__ParallelStep__Group_4__1 : rule__ParallelStep__Group_4__1__Impl ;
	public final void rule__ParallelStep__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3679:2: ( rule__ParallelStep__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3680:2: rule__ParallelStep__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_4__1__Impl_in_rule__ParallelStep__Group_4__17382);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3686:1: rule__ParallelStep__Group_4__1__Impl : ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) ) ;
	public final void rule__ParallelStep__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3690:1: ( ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3691:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3691:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3692:1: ( rule__ParallelStep__InvokedFlowsAssignment_4_1 )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3693:2: ( rule__ParallelStep__InvokedFlowsAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3693:2: rule__ParallelStep__InvokedFlowsAssignment_4_1
			{
			pushFollow(FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_4_1_in_rule__ParallelStep__Group_4__1__Impl7409);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3707:1: rule__ParallelStep__Group_5__0 : rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1 ;
	public final void rule__ParallelStep__Group_5__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3711:2: ( rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3712:2: rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_5__0__Impl_in_rule__ParallelStep__Group_5__07443);
			rule__ParallelStep__Group_5__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group_5__1_in_rule__ParallelStep__Group_5__07446);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3719:1: rule__ParallelStep__Group_5__0__Impl : ( 'next' ) ;
	public final void rule__ParallelStep__Group_5__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3723:1: ( ( 'next' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3724:1: ( 'next' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3724:1: ( 'next' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3725:1: 'next'
			{
			 before(grammarAccess.getParallelStepAccess().getNextKeyword_5_0()); 
			match(input,30,FOLLOW_30_in_rule__ParallelStep__Group_5__0__Impl7474); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3738:1: rule__ParallelStep__Group_5__1 : rule__ParallelStep__Group_5__1__Impl ;
	public final void rule__ParallelStep__Group_5__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3742:2: ( rule__ParallelStep__Group_5__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3743:2: rule__ParallelStep__Group_5__1__Impl
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_5__1__Impl_in_rule__ParallelStep__Group_5__17505);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3749:1: rule__ParallelStep__Group_5__1__Impl : ( ( rule__ParallelStep__NextAssignment_5_1 ) ) ;
	public final void rule__ParallelStep__Group_5__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3753:1: ( ( ( rule__ParallelStep__NextAssignment_5_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3754:1: ( ( rule__ParallelStep__NextAssignment_5_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3754:1: ( ( rule__ParallelStep__NextAssignment_5_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3755:1: ( rule__ParallelStep__NextAssignment_5_1 )
			{
			 before(grammarAccess.getParallelStepAccess().getNextAssignment_5_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3756:2: ( rule__ParallelStep__NextAssignment_5_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3756:2: rule__ParallelStep__NextAssignment_5_1
			{
			pushFollow(FOLLOW_rule__ParallelStep__NextAssignment_5_1_in_rule__ParallelStep__Group_5__1__Impl7532);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3770:1: rule__NormalStep__Group__0 : rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1 ;
	public final void rule__NormalStep__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3774:2: ( rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3775:2: rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__0__Impl_in_rule__NormalStep__Group__07566);
			rule__NormalStep__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__1_in_rule__NormalStep__Group__07569);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3782:1: rule__NormalStep__Group__0__Impl : ( 'step' ) ;
	public final void rule__NormalStep__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3786:1: ( ( 'step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3787:1: ( 'step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3787:1: ( 'step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3788:1: 'step'
			{
			 before(grammarAccess.getNormalStepAccess().getStepKeyword_0()); 
			match(input,40,FOLLOW_40_in_rule__NormalStep__Group__0__Impl7597); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3801:1: rule__NormalStep__Group__1 : rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2 ;
	public final void rule__NormalStep__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3805:2: ( rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3806:2: rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__1__Impl_in_rule__NormalStep__Group__17628);
			rule__NormalStep__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__2_in_rule__NormalStep__Group__17631);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3813:1: rule__NormalStep__Group__1__Impl : ( ( rule__NormalStep__NameAssignment_1 ) ) ;
	public final void rule__NormalStep__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3817:1: ( ( ( rule__NormalStep__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3818:1: ( ( rule__NormalStep__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3818:1: ( ( rule__NormalStep__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3819:1: ( rule__NormalStep__NameAssignment_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3820:2: ( rule__NormalStep__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3820:2: rule__NormalStep__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__NormalStep__NameAssignment_1_in_rule__NormalStep__Group__1__Impl7658);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3830:1: rule__NormalStep__Group__2 : rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3 ;
	public final void rule__NormalStep__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3834:2: ( rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3835:2: rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__2__Impl_in_rule__NormalStep__Group__27688);
			rule__NormalStep__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__3_in_rule__NormalStep__Group__27691);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3842:1: rule__NormalStep__Group__2__Impl : ( ( rule__NormalStep__LabelAssignment_2 )? ) ;
	public final void rule__NormalStep__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3846:1: ( ( ( rule__NormalStep__LabelAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3847:1: ( ( rule__NormalStep__LabelAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3847:1: ( ( rule__NormalStep__LabelAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3848:1: ( rule__NormalStep__LabelAssignment_2 )?
			{
			 before(grammarAccess.getNormalStepAccess().getLabelAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3849:2: ( rule__NormalStep__LabelAssignment_2 )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==RULE_STRING) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3849:2: rule__NormalStep__LabelAssignment_2
					{
					pushFollow(FOLLOW_rule__NormalStep__LabelAssignment_2_in_rule__NormalStep__Group__2__Impl7718);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3859:1: rule__NormalStep__Group__3 : rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4 ;
	public final void rule__NormalStep__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3863:2: ( rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3864:2: rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__3__Impl_in_rule__NormalStep__Group__37749);
			rule__NormalStep__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__4_in_rule__NormalStep__Group__37752);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3871:1: rule__NormalStep__Group__3__Impl : ( 'by' ) ;
	public final void rule__NormalStep__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3875:1: ( ( 'by' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3876:1: ( 'by' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3876:1: ( 'by' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3877:1: 'by'
			{
			 before(grammarAccess.getNormalStepAccess().getByKeyword_3()); 
			match(input,18,FOLLOW_18_in_rule__NormalStep__Group__3__Impl7780); 
			 after(grammarAccess.getNormalStepAccess().getByKeyword_3()); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3890:1: rule__NormalStep__Group__4 : rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5 ;
	public final void rule__NormalStep__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3894:2: ( rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3895:2: rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__4__Impl_in_rule__NormalStep__Group__47811);
			rule__NormalStep__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__5_in_rule__NormalStep__Group__47814);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3902:1: rule__NormalStep__Group__4__Impl : ( ( rule__NormalStep__ActorAssignment_4 ) ) ;
	public final void rule__NormalStep__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3906:1: ( ( ( rule__NormalStep__ActorAssignment_4 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3907:1: ( ( rule__NormalStep__ActorAssignment_4 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3907:1: ( ( rule__NormalStep__ActorAssignment_4 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3908:1: ( rule__NormalStep__ActorAssignment_4 )
			{
			 before(grammarAccess.getNormalStepAccess().getActorAssignment_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3909:2: ( rule__NormalStep__ActorAssignment_4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3909:2: rule__NormalStep__ActorAssignment_4
			{
			pushFollow(FOLLOW_rule__NormalStep__ActorAssignment_4_in_rule__NormalStep__Group__4__Impl7841);
			rule__NormalStep__ActorAssignment_4();
			state._fsp--;

			}

			 after(grammarAccess.getNormalStepAccess().getActorAssignment_4()); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3919:1: rule__NormalStep__Group__5 : rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6 ;
	public final void rule__NormalStep__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3923:2: ( rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3924:2: rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__5__Impl_in_rule__NormalStep__Group__57871);
			rule__NormalStep__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__6_in_rule__NormalStep__Group__57874);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3931:1: rule__NormalStep__Group__5__Impl : ( ( rule__NormalStep__Group_5__0 )? ) ;
	public final void rule__NormalStep__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3935:1: ( ( ( rule__NormalStep__Group_5__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3936:1: ( ( rule__NormalStep__Group_5__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3936:1: ( ( rule__NormalStep__Group_5__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3937:1: ( rule__NormalStep__Group_5__0 )?
			{
			 before(grammarAccess.getNormalStepAccess().getGroup_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3938:2: ( rule__NormalStep__Group_5__0 )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==43) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3938:2: rule__NormalStep__Group_5__0
					{
					pushFollow(FOLLOW_rule__NormalStep__Group_5__0_in_rule__NormalStep__Group__5__Impl7901);
					rule__NormalStep__Group_5__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getNormalStepAccess().getGroup_5()); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3948:1: rule__NormalStep__Group__6 : rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7 ;
	public final void rule__NormalStep__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3952:2: ( rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3953:2: rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__6__Impl_in_rule__NormalStep__Group__67932);
			rule__NormalStep__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__7_in_rule__NormalStep__Group__67935);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3960:1: rule__NormalStep__Group__6__Impl : ( ( rule__NormalStep__Alternatives_6 )? ) ;
	public final void rule__NormalStep__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3964:1: ( ( ( rule__NormalStep__Alternatives_6 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3965:1: ( ( rule__NormalStep__Alternatives_6 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3965:1: ( ( rule__NormalStep__Alternatives_6 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3966:1: ( rule__NormalStep__Alternatives_6 )?
			{
			 before(grammarAccess.getNormalStepAccess().getAlternatives_6()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3967:2: ( rule__NormalStep__Alternatives_6 )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==15||LA37_0==28) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3967:2: rule__NormalStep__Alternatives_6
					{
					pushFollow(FOLLOW_rule__NormalStep__Alternatives_6_in_rule__NormalStep__Group__6__Impl7962);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3977:1: rule__NormalStep__Group__7 : rule__NormalStep__Group__7__Impl ;
	public final void rule__NormalStep__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3981:2: ( rule__NormalStep__Group__7__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3982:2: rule__NormalStep__Group__7__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__7__Impl_in_rule__NormalStep__Group__77993);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3988:1: rule__NormalStep__Group__7__Impl : ( ( rule__NormalStep__Group_7__0 )? ) ;
	public final void rule__NormalStep__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3992:1: ( ( ( rule__NormalStep__Group_7__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3993:1: ( ( rule__NormalStep__Group_7__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3993:1: ( ( rule__NormalStep__Group_7__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3994:1: ( rule__NormalStep__Group_7__0 )?
			{
			 before(grammarAccess.getNormalStepAccess().getGroup_7()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3995:2: ( rule__NormalStep__Group_7__0 )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==30) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3995:2: rule__NormalStep__Group_7__0
					{
					pushFollow(FOLLOW_rule__NormalStep__Group_7__0_in_rule__NormalStep__Group__7__Impl8020);
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



	// $ANTLR start "rule__NormalStep__Group_5__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4021:1: rule__NormalStep__Group_5__0 : rule__NormalStep__Group_5__0__Impl rule__NormalStep__Group_5__1 ;
	public final void rule__NormalStep__Group_5__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4025:2: ( rule__NormalStep__Group_5__0__Impl rule__NormalStep__Group_5__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4026:2: rule__NormalStep__Group_5__0__Impl rule__NormalStep__Group_5__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_5__0__Impl_in_rule__NormalStep__Group_5__08067);
			rule__NormalStep__Group_5__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_5__1_in_rule__NormalStep__Group_5__08070);
			rule__NormalStep__Group_5__1();
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
	// $ANTLR end "rule__NormalStep__Group_5__0"



	// $ANTLR start "rule__NormalStep__Group_5__0__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4033:1: rule__NormalStep__Group_5__0__Impl : ( 'type' ) ;
	public final void rule__NormalStep__Group_5__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4037:1: ( ( 'type' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4038:1: ( 'type' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4038:1: ( 'type' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4039:1: 'type'
			{
			 before(grammarAccess.getNormalStepAccess().getTypeKeyword_5_0()); 
			match(input,43,FOLLOW_43_in_rule__NormalStep__Group_5__0__Impl8098); 
			 after(grammarAccess.getNormalStepAccess().getTypeKeyword_5_0()); 
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
	// $ANTLR end "rule__NormalStep__Group_5__0__Impl"



	// $ANTLR start "rule__NormalStep__Group_5__1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4052:1: rule__NormalStep__Group_5__1 : rule__NormalStep__Group_5__1__Impl ;
	public final void rule__NormalStep__Group_5__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4056:2: ( rule__NormalStep__Group_5__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4057:2: rule__NormalStep__Group_5__1__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_5__1__Impl_in_rule__NormalStep__Group_5__18129);
			rule__NormalStep__Group_5__1__Impl();
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
	// $ANTLR end "rule__NormalStep__Group_5__1"



	// $ANTLR start "rule__NormalStep__Group_5__1__Impl"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4063:1: rule__NormalStep__Group_5__1__Impl : ( ( rule__NormalStep__CustomStepTypeAssignment_5_1 ) ) ;
	public final void rule__NormalStep__Group_5__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4067:1: ( ( ( rule__NormalStep__CustomStepTypeAssignment_5_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4068:1: ( ( rule__NormalStep__CustomStepTypeAssignment_5_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4068:1: ( ( rule__NormalStep__CustomStepTypeAssignment_5_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4069:1: ( rule__NormalStep__CustomStepTypeAssignment_5_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getCustomStepTypeAssignment_5_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4070:2: ( rule__NormalStep__CustomStepTypeAssignment_5_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4070:2: rule__NormalStep__CustomStepTypeAssignment_5_1
			{
			pushFollow(FOLLOW_rule__NormalStep__CustomStepTypeAssignment_5_1_in_rule__NormalStep__Group_5__1__Impl8156);
			rule__NormalStep__CustomStepTypeAssignment_5_1();
			state._fsp--;

			}

			 after(grammarAccess.getNormalStepAccess().getCustomStepTypeAssignment_5_1()); 
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
	// $ANTLR end "rule__NormalStep__Group_5__1__Impl"



	// $ANTLR start "rule__NormalStep__Group_6_0__0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4084:1: rule__NormalStep__Group_6_0__0 : rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1 ;
	public final void rule__NormalStep__Group_6_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4088:2: ( rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4089:2: rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__0__Impl_in_rule__NormalStep__Group_6_0__08190);
			rule__NormalStep__Group_6_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__1_in_rule__NormalStep__Group_6_0__08193);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4096:1: rule__NormalStep__Group_6_0__0__Impl : ( 'alternatives' ) ;
	public final void rule__NormalStep__Group_6_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4100:1: ( ( 'alternatives' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4101:1: ( 'alternatives' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4101:1: ( 'alternatives' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4102:1: 'alternatives'
			{
			 before(grammarAccess.getNormalStepAccess().getAlternativesKeyword_6_0_0()); 
			match(input,15,FOLLOW_15_in_rule__NormalStep__Group_6_0__0__Impl8221); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4115:1: rule__NormalStep__Group_6_0__1 : rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2 ;
	public final void rule__NormalStep__Group_6_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4119:2: ( rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4120:2: rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__1__Impl_in_rule__NormalStep__Group_6_0__18252);
			rule__NormalStep__Group_6_0__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__2_in_rule__NormalStep__Group_6_0__18255);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4127:1: rule__NormalStep__Group_6_0__1__Impl : ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) ) ;
	public final void rule__NormalStep__Group_6_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4131:1: ( ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4132:1: ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4132:1: ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4133:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4133:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4134:1: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4135:2: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4135:2: rule__NormalStep__StepAlternativeAssignment_6_0_1
			{
			pushFollow(FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8284);
			rule__NormalStep__StepAlternativeAssignment_6_0_1();
			state._fsp--;

			}

			 after(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
			}

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4138:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4139:1: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )*
			{
			 before(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4140:2: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==26) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4140:2: rule__NormalStep__StepAlternativeAssignment_6_0_1
					{
					pushFollow(FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8296);
					rule__NormalStep__StepAlternativeAssignment_6_0_1();
					state._fsp--;

					}
					break;

				default :
					break loop39;
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4151:1: rule__NormalStep__Group_6_0__2 : rule__NormalStep__Group_6_0__2__Impl ;
	public final void rule__NormalStep__Group_6_0__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4155:2: ( rule__NormalStep__Group_6_0__2__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4156:2: rule__NormalStep__Group_6_0__2__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__2__Impl_in_rule__NormalStep__Group_6_0__28329);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4162:1: rule__NormalStep__Group_6_0__2__Impl : ( 'else' ) ;
	public final void rule__NormalStep__Group_6_0__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4166:1: ( ( 'else' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4167:1: ( 'else' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4167:1: ( 'else' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4168:1: 'else'
			{
			 before(grammarAccess.getNormalStepAccess().getElseKeyword_6_0_2()); 
			match(input,20,FOLLOW_20_in_rule__NormalStep__Group_6_0__2__Impl8357); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4187:1: rule__NormalStep__Group_6_1__0 : rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1 ;
	public final void rule__NormalStep__Group_6_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4191:2: ( rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4192:2: rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_1__0__Impl_in_rule__NormalStep__Group_6_1__08394);
			rule__NormalStep__Group_6_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_6_1__1_in_rule__NormalStep__Group_6_1__08397);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4199:1: rule__NormalStep__Group_6_1__0__Impl : ( 'invoke usecase' ) ;
	public final void rule__NormalStep__Group_6_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4203:1: ( ( 'invoke usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4204:1: ( 'invoke usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4204:1: ( 'invoke usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4205:1: 'invoke usecase'
			{
			 before(grammarAccess.getNormalStepAccess().getInvokeUsecaseKeyword_6_1_0()); 
			match(input,28,FOLLOW_28_in_rule__NormalStep__Group_6_1__0__Impl8425); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4218:1: rule__NormalStep__Group_6_1__1 : rule__NormalStep__Group_6_1__1__Impl ;
	public final void rule__NormalStep__Group_6_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4222:2: ( rule__NormalStep__Group_6_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4223:2: rule__NormalStep__Group_6_1__1__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_1__1__Impl_in_rule__NormalStep__Group_6_1__18456);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4229:1: rule__NormalStep__Group_6_1__1__Impl : ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) ) ;
	public final void rule__NormalStep__Group_6_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4233:1: ( ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4234:1: ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4234:1: ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4235:1: ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getInvokedUseCaseAssignment_6_1_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4236:2: ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4236:2: rule__NormalStep__InvokedUseCaseAssignment_6_1_1
			{
			pushFollow(FOLLOW_rule__NormalStep__InvokedUseCaseAssignment_6_1_1_in_rule__NormalStep__Group_6_1__1__Impl8483);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4250:1: rule__NormalStep__Group_7__0 : rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1 ;
	public final void rule__NormalStep__Group_7__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4254:2: ( rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4255:2: rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_7__0__Impl_in_rule__NormalStep__Group_7__08517);
			rule__NormalStep__Group_7__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_7__1_in_rule__NormalStep__Group_7__08520);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4262:1: rule__NormalStep__Group_7__0__Impl : ( 'next' ) ;
	public final void rule__NormalStep__Group_7__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4266:1: ( ( 'next' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4267:1: ( 'next' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4267:1: ( 'next' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4268:1: 'next'
			{
			 before(grammarAccess.getNormalStepAccess().getNextKeyword_7_0()); 
			match(input,30,FOLLOW_30_in_rule__NormalStep__Group_7__0__Impl8548); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4281:1: rule__NormalStep__Group_7__1 : rule__NormalStep__Group_7__1__Impl ;
	public final void rule__NormalStep__Group_7__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4285:2: ( rule__NormalStep__Group_7__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4286:2: rule__NormalStep__Group_7__1__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_7__1__Impl_in_rule__NormalStep__Group_7__18579);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4292:1: rule__NormalStep__Group_7__1__Impl : ( ( rule__NormalStep__NextAssignment_7_1 ) ) ;
	public final void rule__NormalStep__Group_7__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4296:1: ( ( ( rule__NormalStep__NextAssignment_7_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4297:1: ( ( rule__NormalStep__NextAssignment_7_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4297:1: ( ( rule__NormalStep__NextAssignment_7_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4298:1: ( rule__NormalStep__NextAssignment_7_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getNextAssignment_7_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4299:2: ( rule__NormalStep__NextAssignment_7_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4299:2: rule__NormalStep__NextAssignment_7_1
			{
			pushFollow(FOLLOW_rule__NormalStep__NextAssignment_7_1_in_rule__NormalStep__Group_7__1__Impl8606);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4313:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
	public final void rule__QualifiedName__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4317:2: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4318:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08640);
			rule__QualifiedName__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08643);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4325:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
	public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4329:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4330:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4330:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4331:1: RULE_ID
			{
			 before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8670); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4342:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
	public final void rule__QualifiedName__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4346:2: ( rule__QualifiedName__Group__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4347:2: rule__QualifiedName__Group__1__Impl
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18699);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4353:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
	public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4357:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4358:1: ( ( rule__QualifiedName__Group_1__0 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4358:1: ( ( rule__QualifiedName__Group_1__0 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4359:1: ( rule__QualifiedName__Group_1__0 )*
			{
			 before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4360:2: ( rule__QualifiedName__Group_1__0 )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==12) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4360:2: rule__QualifiedName__Group_1__0
					{
					pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8726);
					rule__QualifiedName__Group_1__0();
					state._fsp--;

					}
					break;

				default :
					break loop40;
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4374:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
	public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4378:2: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4379:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08761);
			rule__QualifiedName__Group_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08764);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4386:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
	public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4390:1: ( ( '.' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4391:1: ( '.' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4391:1: ( '.' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4392:1: '.'
			{
			 before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
			match(input,12,FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl8792); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4405:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
	public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4409:2: ( rule__QualifiedName__Group_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4410:2: rule__QualifiedName__Group_1__1__Impl
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18823);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4416:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
	public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4420:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4421:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4421:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4422:1: RULE_ID
			{
			 before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8850); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4438:1: rule__UseCase__UnorderedGroup_4 : ( rule__UseCase__UnorderedGroup_4__0 )? ;
	public final void rule__UseCase__UnorderedGroup_4() throws RecognitionException {

		    	int stackSize = keepStackSize();
				getUnorderedGroupHelper().enter(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4443:2: ( ( rule__UseCase__UnorderedGroup_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4444:2: ( rule__UseCase__UnorderedGroup_4__0 )?
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4444:2: ( rule__UseCase__UnorderedGroup_4__0 )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( LA41_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
				alt41=1;
			}
			else if ( LA41_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4444:2: rule__UseCase__UnorderedGroup_4__0
					{
					pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__0_in_rule__UseCase__UnorderedGroup_48884);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4454:1: rule__UseCase__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) ) ;
	public final void rule__UseCase__UnorderedGroup_4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
				boolean selected = false;
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4459:3: ( ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4460:3: ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4460:3: ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( LA42_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
				alt42=1;
			}
			else if ( LA42_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
				alt42=2;
			}

			switch (alt42) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4462:4: ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4462:4: ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4463:5: {...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) )
					{
					if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
						throw new FailedPredicateException(input, "rule__UseCase__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0)");
					}
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4463:104: ( ( ( rule__UseCase__Group_4_0__0 ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4464:6: ( ( rule__UseCase__Group_4_0__0 ) )
					{
					 
						 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0);
						 				

						 				  selected = true;
						 				
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4470:6: ( ( rule__UseCase__Group_4_0__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4472:7: ( rule__UseCase__Group_4_0__0 )
					{
					 before(grammarAccess.getUseCaseAccess().getGroup_4_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4473:7: ( rule__UseCase__Group_4_0__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4473:8: rule__UseCase__Group_4_0__0
					{
					pushFollow(FOLLOW_rule__UseCase__Group_4_0__0_in_rule__UseCase__UnorderedGroup_4__Impl8971);
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
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4479:4: ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4479:4: ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4480:5: {...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) )
					{
					if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
						throw new FailedPredicateException(input, "rule__UseCase__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1)");
					}
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4480:104: ( ( ( rule__UseCase__Group_4_1__0 ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4481:6: ( ( rule__UseCase__Group_4_1__0 ) )
					{
					 
						 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1);
						 				

						 				  selected = true;
						 				
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4487:6: ( ( rule__UseCase__Group_4_1__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4489:7: ( rule__UseCase__Group_4_1__0 )
					{
					 before(grammarAccess.getUseCaseAccess().getGroup_4_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4490:7: ( rule__UseCase__Group_4_1__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4490:8: rule__UseCase__Group_4_1__0
					{
					pushFollow(FOLLOW_rule__UseCase__Group_4_1__0_in_rule__UseCase__UnorderedGroup_4__Impl9062);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4505:1: rule__UseCase__UnorderedGroup_4__0 : rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )? ;
	public final void rule__UseCase__UnorderedGroup_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4509:2: ( rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4510:2: rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )?
			{
			pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__09121);
			rule__UseCase__UnorderedGroup_4__Impl();
			state._fsp--;

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4511:2: ( rule__UseCase__UnorderedGroup_4__1 )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( LA43_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
				alt43=1;
			}
			else if ( LA43_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4511:2: rule__UseCase__UnorderedGroup_4__1
					{
					pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__1_in_rule__UseCase__UnorderedGroup_4__09124);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4518:1: rule__UseCase__UnorderedGroup_4__1 : rule__UseCase__UnorderedGroup_4__Impl ;
	public final void rule__UseCase__UnorderedGroup_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4522:2: ( rule__UseCase__UnorderedGroup_4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4523:2: rule__UseCase__UnorderedGroup_4__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__19149);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4534:1: rule__UseCasesModel__PackagesAssignment : ( rulePackageDeclaration ) ;
	public final void rule__UseCasesModel__PackagesAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4538:1: ( ( rulePackageDeclaration ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4539:1: ( rulePackageDeclaration )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4539:1: ( rulePackageDeclaration )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4540:1: rulePackageDeclaration
			{
			 before(grammarAccess.getUseCasesModelAccess().getPackagesPackageDeclarationParserRuleCall_0()); 
			pushFollow(FOLLOW_rulePackageDeclaration_in_rule__UseCasesModel__PackagesAssignment9181);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4549:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
	public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4553:1: ( ( ruleQualifiedName ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4554:1: ( ruleQualifiedName )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4554:1: ( ruleQualifiedName )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4555:1: ruleQualifiedName
			{
			 before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19212);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4564:1: rule__PackageDeclaration__DescriptionAssignment_2 : ( RULE_STRING ) ;
	public final void rule__PackageDeclaration__DescriptionAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4568:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4569:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4569:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4570:1: RULE_STRING
			{
			 before(grammarAccess.getPackageDeclarationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DescriptionAssignment_29243); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4579:1: rule__PackageDeclaration__ActorsAssignment_3_1 : ( ruleActor ) ;
	public final void rule__PackageDeclaration__ActorsAssignment_3_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4583:1: ( ( ruleActor ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4584:1: ( ruleActor )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4584:1: ( ruleActor )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4585:1: ruleActor
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsActorParserRuleCall_3_1_0()); 
			pushFollow(FOLLOW_ruleActor_in_rule__PackageDeclaration__ActorsAssignment_3_19274);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4594:1: rule__PackageDeclaration__UseCasesAssignment_4 : ( ruleUseCase ) ;
	public final void rule__PackageDeclaration__UseCasesAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4598:1: ( ( ruleUseCase ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4599:1: ( ruleUseCase )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4599:1: ( ruleUseCase )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4600:1: ruleUseCase
			{
			 before(grammarAccess.getPackageDeclarationAccess().getUseCasesUseCaseParserRuleCall_4_0()); 
			pushFollow(FOLLOW_ruleUseCase_in_rule__PackageDeclaration__UseCasesAssignment_49305);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4609:1: rule__UseCase__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4613:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4614:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4614:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4615:1: RULE_ID
			{
			 before(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseCase__NameAssignment_19336); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4624:1: rule__UseCase__DescriptionAssignment_2 : ( RULE_STRING ) ;
	public final void rule__UseCase__DescriptionAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4628:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4629:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4629:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4630:1: RULE_STRING
			{
			 before(grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UseCase__DescriptionAssignment_29367); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4639:1: rule__UseCase__SuperCaseAssignment_3_1 : ( ( RULE_ID ) ) ;
	public final void rule__UseCase__SuperCaseAssignment_3_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4643:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4644:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4644:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4645:1: ( RULE_ID )
			{
			 before(grammarAccess.getUseCaseAccess().getSuperCaseUseCaseCrossReference_3_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4646:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4647:1: RULE_ID
			{
			 before(grammarAccess.getUseCaseAccess().getSuperCaseUseCaseIDTerminalRuleCall_3_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseCase__SuperCaseAssignment_3_19402); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4658:1: rule__UseCase__PreconditionsAssignment_4_0_1 : ( ruleUCCondition ) ;
	public final void rule__UseCase__PreconditionsAssignment_4_0_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4662:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4663:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4663:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4664:1: ruleUCCondition
			{
			 before(grammarAccess.getUseCaseAccess().getPreconditionsUCConditionParserRuleCall_4_0_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__UseCase__PreconditionsAssignment_4_0_19437);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4673:1: rule__UseCase__PostconditionsAssignment_4_1_1 : ( ruleUCCondition ) ;
	public final void rule__UseCase__PostconditionsAssignment_4_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4677:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4678:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4678:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4679:1: ruleUCCondition
			{
			 before(grammarAccess.getUseCaseAccess().getPostconditionsUCConditionParserRuleCall_4_1_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__UseCase__PostconditionsAssignment_4_1_19468);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4688:1: rule__UseCase__FlowsAssignment_5 : ( ruleFlow ) ;
	public final void rule__UseCase__FlowsAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4692:1: ( ( ruleFlow ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4693:1: ( ruleFlow )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4693:1: ( ruleFlow )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4694:1: ruleFlow
			{
			 before(grammarAccess.getUseCaseAccess().getFlowsFlowParserRuleCall_5_0()); 
			pushFollow(FOLLOW_ruleFlow_in_rule__UseCase__FlowsAssignment_59499);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4703:1: rule__UCCondition__NameAssignment : ( RULE_STRING ) ;
	public final void rule__UCCondition__NameAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4707:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4708:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4708:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4709:1: RULE_STRING
			{
			 before(grammarAccess.getUCConditionAccess().getNameSTRINGTerminalRuleCall_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UCCondition__NameAssignment9530); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4718:1: rule__Actor__NameAssignment_0 : ( RULE_ID ) ;
	public final void rule__Actor__NameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4722:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4723:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4723:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4724:1: RULE_ID
			{
			 before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_09561); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4733:1: rule__Actor__TypeAssignment_2 : ( ruleActorType ) ;
	public final void rule__Actor__TypeAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4737:1: ( ( ruleActorType ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4738:1: ( ruleActorType )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4738:1: ( ruleActorType )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4739:1: ruleActorType
			{
			 before(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleActorType_in_rule__Actor__TypeAssignment_29592);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4748:1: rule__Actor__DescriptionAssignment_3 : ( RULE_STRING ) ;
	public final void rule__Actor__DescriptionAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4752:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4753:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4753:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4754:1: RULE_STRING
			{
			 before(grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Actor__DescriptionAssignment_39623); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4763:1: rule__Actor__ExtendsAssignment_4_1 : ( ( RULE_ID ) ) ;
	public final void rule__Actor__ExtendsAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4767:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4768:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4768:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4769:1: ( RULE_ID )
			{
			 before(grammarAccess.getActorAccess().getExtendsActorCrossReference_4_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4770:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4771:1: RULE_ID
			{
			 before(grammarAccess.getActorAccess().getExtendsActorIDTerminalRuleCall_4_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__ExtendsAssignment_4_19658); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4782:1: rule__BasicFlow__StepsAssignment_2 : ( ruleStep ) ;
	public final void rule__BasicFlow__StepsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4786:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4787:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4787:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4788:1: ruleStep
			{
			 before(grammarAccess.getBasicFlowAccess().getStepsStepParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__BasicFlow__StepsAssignment_29693);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4797:1: rule__BasicFlow__FinalStateAssignment_4_1 : ( ruleUCCondition ) ;
	public final void rule__BasicFlow__FinalStateAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4801:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4802:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4802:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4803:1: ruleUCCondition
			{
			 before(grammarAccess.getBasicFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__BasicFlow__FinalStateAssignment_4_19724);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4812:1: rule__ExceptionFlow__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__ExceptionFlow__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4816:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4817:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4817:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4818:1: RULE_ID
			{
			 before(grammarAccess.getExceptionFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExceptionFlow__NameAssignment_19755); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4827:1: rule__ExceptionFlow__ConditionAssignment_3 : ( RULE_STRING ) ;
	public final void rule__ExceptionFlow__ConditionAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4831:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4832:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4832:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4833:1: RULE_STRING
			{
			 before(grammarAccess.getExceptionFlowAccess().getConditionSTRINGTerminalRuleCall_3_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExceptionFlow__ConditionAssignment_39786); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4842:1: rule__ExceptionFlow__StepsAssignment_5 : ( ruleStep ) ;
	public final void rule__ExceptionFlow__StepsAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4846:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4847:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4847:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4848:1: ruleStep
			{
			 before(grammarAccess.getExceptionFlowAccess().getStepsStepParserRuleCall_5_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__ExceptionFlow__StepsAssignment_59817);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4857:1: rule__ExceptionFlow__FinalStateAssignment_7_1 : ( ruleUCCondition ) ;
	public final void rule__ExceptionFlow__FinalStateAssignment_7_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4861:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4862:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4862:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4863:1: ruleUCCondition
			{
			 before(grammarAccess.getExceptionFlowAccess().getFinalStateUCConditionParserRuleCall_7_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__ExceptionFlow__FinalStateAssignment_7_19848);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4872:1: rule__AlternativeFlow__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__AlternativeFlow__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4876:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4877:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4877:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4878:1: RULE_ID
			{
			 before(grammarAccess.getAlternativeFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlow__NameAssignment_19879); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4887:1: rule__AlternativeFlow__StepsAssignment_2 : ( ruleStep ) ;
	public final void rule__AlternativeFlow__StepsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4891:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4892:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4892:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4893:1: ruleStep
			{
			 before(grammarAccess.getAlternativeFlowAccess().getStepsStepParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__AlternativeFlow__StepsAssignment_29910);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4902:1: rule__AlternativeFlow__FinalStateAssignment_4_1 : ( ruleUCCondition ) ;
	public final void rule__AlternativeFlow__FinalStateAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4906:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4907:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4907:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4908:1: ruleUCCondition
			{
			 before(grammarAccess.getAlternativeFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__AlternativeFlow__FinalStateAssignment_4_19941);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4917:1: rule__ParallelFlow__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__ParallelFlow__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4921:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4922:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4922:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4923:1: RULE_ID
			{
			 before(grammarAccess.getParallelFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelFlow__NameAssignment_19972); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4932:1: rule__ParallelFlow__StepsAssignment_2 : ( ruleStep ) ;
	public final void rule__ParallelFlow__StepsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4936:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4937:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4937:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4938:1: ruleStep
			{
			 before(grammarAccess.getParallelFlowAccess().getStepsStepParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__ParallelFlow__StepsAssignment_210003);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4947:1: rule__ParallelFlow__FinalStateAssignment_4_1 : ( ruleUCCondition ) ;
	public final void rule__ParallelFlow__FinalStateAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4951:1: ( ( ruleUCCondition ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4952:1: ( ruleUCCondition )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4952:1: ( ruleUCCondition )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4953:1: ruleUCCondition
			{
			 before(grammarAccess.getParallelFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
			pushFollow(FOLLOW_ruleUCCondition_in_rule__ParallelFlow__FinalStateAssignment_4_110034);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4962:1: rule__Condition__ConditionAssignment_1 : ( RULE_STRING ) ;
	public final void rule__Condition__ConditionAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4966:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4967:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4967:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4968:1: RULE_STRING
			{
			 before(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Condition__ConditionAssignment_110065); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4977:1: rule__Condition__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
	public final void rule__Condition__ContinuationAssignment_3_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4981:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4982:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4982:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4983:1: ( RULE_ID )
			{
			 before(grammarAccess.getConditionAccess().getContinuationStepCrossReference_3_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4984:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4985:1: RULE_ID
			{
			 before(grammarAccess.getConditionAccess().getContinuationStepIDTerminalRuleCall_3_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Condition__ContinuationAssignment_3_110100); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4996:1: rule__LocalAlternative__ConditionAssignment_1 : ( RULE_STRING ) ;
	public final void rule__LocalAlternative__ConditionAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5000:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5001:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5001:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5002:1: RULE_STRING
			{
			 before(grammarAccess.getLocalAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LocalAlternative__ConditionAssignment_110135); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5011:1: rule__LocalAlternative__DescriptionAssignment_3_0 : ( RULE_STRING ) ;
	public final void rule__LocalAlternative__DescriptionAssignment_3_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5015:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5016:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5016:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5017:1: RULE_STRING
			{
			 before(grammarAccess.getLocalAlternativeAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LocalAlternative__DescriptionAssignment_3_010166); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5026:1: rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 : ( ( RULE_ID ) ) ;
	public final void rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5030:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5031:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5031:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5032:1: ( RULE_ID )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseCrossReference_3_1_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5033:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5034:1: RULE_ID
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseIDTerminalRuleCall_3_1_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_110201); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5045:1: rule__LocalAlternative__ContinuationAssignment_4_1 : ( ( RULE_ID ) ) ;
	public final void rule__LocalAlternative__ContinuationAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5049:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5050:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5050:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5051:1: ( RULE_ID )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinuationStepCrossReference_4_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5052:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5053:1: RULE_ID
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinuationStepIDTerminalRuleCall_4_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalAlternative__ContinuationAssignment_4_110240); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5064:1: rule__AlternativeFlowAlternative__ConditionAssignment_1 : ( RULE_STRING ) ;
	public final void rule__AlternativeFlowAlternative__ConditionAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5068:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5069:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5069:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5070:1: RULE_STRING
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AlternativeFlowAlternative__ConditionAssignment_110275); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5079:1: rule__AlternativeFlowAlternative__RefAssignment_4 : ( ( RULE_ID ) ) ;
	public final void rule__AlternativeFlowAlternative__RefAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5083:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5084:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5084:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5085:1: ( RULE_ID )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowCrossReference_4_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5086:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5087:1: RULE_ID
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowIDTerminalRuleCall_4_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__RefAssignment_410310); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5098:1: rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 : ( ( RULE_ID ) ) ;
	public final void rule__AlternativeFlowAlternative__ContinuationAssignment_5_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5102:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5103:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5103:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5104:1: ( RULE_ID )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepCrossReference_5_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5105:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5106:1: RULE_ID
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepIDTerminalRuleCall_5_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__ContinuationAssignment_5_110349); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5117:1: rule__ParallelStep__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__ParallelStep__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5121:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5122:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5122:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5123:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__NameAssignment_110384); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5132:1: rule__ParallelStep__LabelAssignment_2 : ( RULE_STRING ) ;
	public final void rule__ParallelStep__LabelAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5136:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5137:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5137:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5138:1: RULE_STRING
			{
			 before(grammarAccess.getParallelStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ParallelStep__LabelAssignment_210415); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5147:1: rule__ParallelStep__InvokedFlowsAssignment_3 : ( ( RULE_ID ) ) ;
	public final void rule__ParallelStep__InvokedFlowsAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5151:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5152:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5152:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5153:1: ( RULE_ID )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_3_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5154:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5155:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowIDTerminalRuleCall_3_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_310450); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5166:1: rule__ParallelStep__InvokedFlowsAssignment_4_1 : ( ( RULE_ID ) ) ;
	public final void rule__ParallelStep__InvokedFlowsAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5170:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5171:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5171:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5172:1: ( RULE_ID )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_4_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5173:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5174:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowIDTerminalRuleCall_4_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_4_110489); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5185:1: rule__ParallelStep__NextAssignment_5_1 : ( ( RULE_ID ) ) ;
	public final void rule__ParallelStep__NextAssignment_5_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5189:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5190:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5190:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5191:1: ( RULE_ID )
			{
			 before(grammarAccess.getParallelStepAccess().getNextStepCrossReference_5_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5192:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5193:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getNextStepIDTerminalRuleCall_5_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__NextAssignment_5_110528); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5204:1: rule__NormalStep__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__NormalStep__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5208:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5209:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5209:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5210:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__NameAssignment_110563); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5219:1: rule__NormalStep__LabelAssignment_2 : ( RULE_STRING ) ;
	public final void rule__NormalStep__LabelAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5223:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5224:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5224:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5225:1: RULE_STRING
			{
			 before(grammarAccess.getNormalStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NormalStep__LabelAssignment_210594); 
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



	// $ANTLR start "rule__NormalStep__ActorAssignment_4"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5234:1: rule__NormalStep__ActorAssignment_4 : ( ( RULE_ID ) ) ;
	public final void rule__NormalStep__ActorAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5238:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5239:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5239:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5240:1: ( RULE_ID )
			{
			 before(grammarAccess.getNormalStepAccess().getActorActorCrossReference_4_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5241:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5242:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getActorActorIDTerminalRuleCall_4_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__ActorAssignment_410629); 
			 after(grammarAccess.getNormalStepAccess().getActorActorIDTerminalRuleCall_4_0_1()); 
			}

			 after(grammarAccess.getNormalStepAccess().getActorActorCrossReference_4_0()); 
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
	// $ANTLR end "rule__NormalStep__ActorAssignment_4"



	// $ANTLR start "rule__NormalStep__CustomStepTypeAssignment_5_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5253:1: rule__NormalStep__CustomStepTypeAssignment_5_1 : ( ruleCustomStepType ) ;
	public final void rule__NormalStep__CustomStepTypeAssignment_5_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5257:1: ( ( ruleCustomStepType ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5258:1: ( ruleCustomStepType )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5258:1: ( ruleCustomStepType )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5259:1: ruleCustomStepType
			{
			 before(grammarAccess.getNormalStepAccess().getCustomStepTypeCustomStepTypeEnumRuleCall_5_1_0()); 
			pushFollow(FOLLOW_ruleCustomStepType_in_rule__NormalStep__CustomStepTypeAssignment_5_110664);
			ruleCustomStepType();
			state._fsp--;

			 after(grammarAccess.getNormalStepAccess().getCustomStepTypeCustomStepTypeEnumRuleCall_5_1_0()); 
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
	// $ANTLR end "rule__NormalStep__CustomStepTypeAssignment_5_1"



	// $ANTLR start "rule__NormalStep__StepAlternativeAssignment_6_0_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5268:1: rule__NormalStep__StepAlternativeAssignment_6_0_1 : ( ruleStepAlternative ) ;
	public final void rule__NormalStep__StepAlternativeAssignment_6_0_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5272:1: ( ( ruleStepAlternative ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5273:1: ( ruleStepAlternative )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5273:1: ( ruleStepAlternative )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5274:1: ruleStepAlternative
			{
			 before(grammarAccess.getNormalStepAccess().getStepAlternativeStepAlternativeParserRuleCall_6_0_1_0()); 
			pushFollow(FOLLOW_ruleStepAlternative_in_rule__NormalStep__StepAlternativeAssignment_6_0_110695);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5283:1: rule__NormalStep__InvokedUseCaseAssignment_6_1_1 : ( ( RULE_ID ) ) ;
	public final void rule__NormalStep__InvokedUseCaseAssignment_6_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5287:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5288:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5288:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5289:1: ( RULE_ID )
			{
			 before(grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseCrossReference_6_1_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5290:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5291:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseIDTerminalRuleCall_6_1_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__InvokedUseCaseAssignment_6_1_110730); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5302:1: rule__NormalStep__NextAssignment_7_1 : ( ( RULE_ID ) ) ;
	public final void rule__NormalStep__NextAssignment_7_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5306:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5307:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5307:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5308:1: ( RULE_ID )
			{
			 before(grammarAccess.getNormalStepAccess().getNextStepCrossReference_7_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5309:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5310:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getNextStepIDTerminalRuleCall_7_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__NextAssignment_7_110769); 
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
	public static final BitSet FOLLOW_rule__UseCasesModel__PackagesAssignment_in_ruleUseCasesModel94 = new BitSet(new long[]{0x0000000200000002L});
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
	public static final BitSet FOLLOW_rule__CustomStepType__Alternatives_in_ruleCustomStepType1248 = new BitSet(new long[]{0x0000000000000002L});
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
	public static final BitSet FOLLOW_27_in_rule__CustomStepType__Alternatives1694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_rule__CustomStepType__Alternatives1715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_rule__CustomStepType__Alternatives1736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_rule__CustomStepType__Alternatives1757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01790 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_rule__PackageDeclaration__Group__0__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11852 = new BitSet(new long[]{0x0000100000402200L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21912 = new BitSet(new long[]{0x0000100000402000L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__DescriptionAssignment_2_in_rule__PackageDeclaration__Group__2__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31973 = new BitSet(new long[]{0x0000100000400000L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42034 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__UseCasesAssignment_4_in_rule__PackageDeclaration__Group__4__Impl2064 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_rule__PackageDeclaration__Group__5__Impl2123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02166 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_rule__PackageDeclaration__Group_3__0__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__12228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2257 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2269 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__02306 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__02309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_rule__UseCase__Group__0__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__12368 = new BitSet(new long[]{0x0000006002000200L});
	public static final BitSet FOLLOW_rule__UseCase__Group__2_in_rule__UseCase__Group__12371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__NameAssignment_1_in_rule__UseCase__Group__1__Impl2398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__2__Impl_in_rule__UseCase__Group__22428 = new BitSet(new long[]{0x0000006002000000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__3_in_rule__UseCase__Group__22431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__DescriptionAssignment_2_in_rule__UseCase__Group__2__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__3__Impl_in_rule__UseCase__Group__32489 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__4_in_rule__UseCase__Group__32492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__0_in_rule__UseCase__Group__3__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__4__Impl_in_rule__UseCase__Group__42550 = new BitSet(new long[]{0x0000000401824000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__5_in_rule__UseCase__Group__42553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4_in_rule__UseCase__Group__4__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__5__Impl_in_rule__UseCase__Group__52610 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__6_in_rule__UseCase__Group__52613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__FlowsAssignment_5_in_rule__UseCase__Group__5__Impl2640 = new BitSet(new long[]{0x0000000401024002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__6__Impl_in_rule__UseCase__Group__62671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rule__UseCase__Group__6__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__0__Impl_in_rule__UseCase__Group_3__02744 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__1_in_rule__UseCase__Group_3__02747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_rule__UseCase__Group_3__0__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__1__Impl_in_rule__UseCase__Group_3__12806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__SuperCaseAssignment_3_1_in_rule__UseCase__Group_3__1__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__0__Impl_in_rule__UseCase__Group_4_0__02867 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__1_in_rule__UseCase__Group_4_0__02870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_rule__UseCase__Group_4_0__0__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__1__Impl_in_rule__UseCase__Group_4_0__12929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl2958 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl2970 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__0__Impl_in_rule__UseCase__Group_4_1__03007 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__1_in_rule__UseCase__Group_4_1__03010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_rule__UseCase__Group_4_1__0__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__1__Impl_in_rule__UseCase__Group_4_1__13069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3098 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3110 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03147 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13207 = new BitSet(new long[]{0x0000021080000000L});
	public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_rule__Actor__Group__1__Impl3238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23269 = new BitSet(new long[]{0x0000000002000200L});
	public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__TypeAssignment_2_in_rule__Actor__Group__2__Impl3299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__33329 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_rule__Actor__Group__4_in_rule__Actor__Group__33332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__DescriptionAssignment_3_in_rule__Actor__Group__3__Impl3359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__4__Impl_in_rule__Actor__Group__43390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__0_in_rule__Actor__Group__4__Impl3417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__0__Impl_in_rule__Actor__Group_4__03458 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__1_in_rule__Actor__Group_4__03461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_rule__Actor__Group_4__0__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__1__Impl_in_rule__Actor__Group_4__13520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__ExtendsAssignment_4_1_in_rule__Actor__Group_4__1__Impl3547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__0__Impl_in_rule__BasicFlow__Group__03581 = new BitSet(new long[]{0x0000010800200000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__1_in_rule__BasicFlow__Group__03584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_rule__BasicFlow__Group__0__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__1__Impl_in_rule__BasicFlow__Group__13643 = new BitSet(new long[]{0x0000010800200000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__2_in_rule__BasicFlow__Group__13646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__2__Impl_in_rule__BasicFlow__Group__23704 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__3_in_rule__BasicFlow__Group__23707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__StepsAssignment_2_in_rule__BasicFlow__Group__2__Impl3734 = new BitSet(new long[]{0x0000010800000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__3__Impl_in_rule__BasicFlow__Group__33765 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__4_in_rule__BasicFlow__Group__33768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__BasicFlow__Group__3__Impl3796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__4__Impl_in_rule__BasicFlow__Group__43827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__0_in_rule__BasicFlow__Group__4__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__0__Impl_in_rule__BasicFlow__Group_4__03895 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__1_in_rule__BasicFlow__Group_4__03898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__BasicFlow__Group_4__0__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__1__Impl_in_rule__BasicFlow__Group_4__13957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__FinalStateAssignment_4_1_in_rule__BasicFlow__Group_4__1__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__0__Impl_in_rule__ExceptionFlow__Group__04018 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__1_in_rule__ExceptionFlow__Group__04021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_rule__ExceptionFlow__Group__0__Impl4049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__1__Impl_in_rule__ExceptionFlow__Group__14080 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__2_in_rule__ExceptionFlow__Group__14083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__NameAssignment_1_in_rule__ExceptionFlow__Group__1__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__2__Impl_in_rule__ExceptionFlow__Group__24140 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__3_in_rule__ExceptionFlow__Group__24143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_rule__ExceptionFlow__Group__2__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__3__Impl_in_rule__ExceptionFlow__Group__34202 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__4_in_rule__ExceptionFlow__Group__34205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__ConditionAssignment_3_in_rule__ExceptionFlow__Group__3__Impl4232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__4__Impl_in_rule__ExceptionFlow__Group__44262 = new BitSet(new long[]{0x0000010800200000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__5_in_rule__ExceptionFlow__Group__44265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__ExceptionFlow__Group__4__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__5__Impl_in_rule__ExceptionFlow__Group__54324 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__6_in_rule__ExceptionFlow__Group__54327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__StepsAssignment_5_in_rule__ExceptionFlow__Group__5__Impl4354 = new BitSet(new long[]{0x0000010800000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__6__Impl_in_rule__ExceptionFlow__Group__64385 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__7_in_rule__ExceptionFlow__Group__64388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__ExceptionFlow__Group__6__Impl4416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__7__Impl_in_rule__ExceptionFlow__Group__74447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__0_in_rule__ExceptionFlow__Group__7__Impl4474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__0__Impl_in_rule__ExceptionFlow__Group_7__04521 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__1_in_rule__ExceptionFlow__Group_7__04524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__ExceptionFlow__Group_7__0__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__1__Impl_in_rule__ExceptionFlow__Group_7__14583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__FinalStateAssignment_7_1_in_rule__ExceptionFlow__Group_7__1__Impl4610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__0__Impl_in_rule__AlternativeFlow__Group__04644 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__1_in_rule__AlternativeFlow__Group__04647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__AlternativeFlow__Group__0__Impl4675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__1__Impl_in_rule__AlternativeFlow__Group__14706 = new BitSet(new long[]{0x0000010800200000L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__2_in_rule__AlternativeFlow__Group__14709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__NameAssignment_1_in_rule__AlternativeFlow__Group__1__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__2__Impl_in_rule__AlternativeFlow__Group__24766 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__3_in_rule__AlternativeFlow__Group__24769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__StepsAssignment_2_in_rule__AlternativeFlow__Group__2__Impl4796 = new BitSet(new long[]{0x0000010800000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__3__Impl_in_rule__AlternativeFlow__Group__34827 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__4_in_rule__AlternativeFlow__Group__34830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__AlternativeFlow__Group__3__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__4__Impl_in_rule__AlternativeFlow__Group__44889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__0_in_rule__AlternativeFlow__Group__4__Impl4916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__0__Impl_in_rule__AlternativeFlow__Group_4__04957 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__1_in_rule__AlternativeFlow__Group_4__04960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__AlternativeFlow__Group_4__0__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__1__Impl_in_rule__AlternativeFlow__Group_4__15019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__FinalStateAssignment_4_1_in_rule__AlternativeFlow__Group_4__1__Impl5046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__0__Impl_in_rule__ParallelFlow__Group__05080 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__1_in_rule__ParallelFlow__Group__05083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_rule__ParallelFlow__Group__0__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__1__Impl_in_rule__ParallelFlow__Group__15142 = new BitSet(new long[]{0x0000010800200000L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__2_in_rule__ParallelFlow__Group__15145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__NameAssignment_1_in_rule__ParallelFlow__Group__1__Impl5172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__2__Impl_in_rule__ParallelFlow__Group__25202 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__3_in_rule__ParallelFlow__Group__25205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__StepsAssignment_2_in_rule__ParallelFlow__Group__2__Impl5232 = new BitSet(new long[]{0x0000010800000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__3__Impl_in_rule__ParallelFlow__Group__35263 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__4_in_rule__ParallelFlow__Group__35266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__ParallelFlow__Group__3__Impl5294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__4__Impl_in_rule__ParallelFlow__Group__45325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__0_in_rule__ParallelFlow__Group__4__Impl5352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__0__Impl_in_rule__ParallelFlow__Group_4__05393 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__1_in_rule__ParallelFlow__Group_4__05396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__ParallelFlow__Group_4__0__Impl5424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__1__Impl_in_rule__ParallelFlow__Group_4__15455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__FinalStateAssignment_4_1_in_rule__ParallelFlow__Group_4__1__Impl5482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05516 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_rule__Condition__Group__0__Impl5547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15578 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__15581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__ConditionAssignment_1_in_rule__Condition__Group__1__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__25638 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__25641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__Condition__Group__2__Impl5669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__35700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__0_in_rule__Condition__Group__3__Impl5727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__0__Impl_in_rule__Condition__Group_3__05766 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__1_in_rule__Condition__Group_3__05769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rule__Condition__Group_3__0__Impl5797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__1__Impl_in_rule__Condition__Group_3__15828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__ContinuationAssignment_3_1_in_rule__Condition__Group_3__1__Impl5855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__0__Impl_in_rule__LocalAlternative__Group__05889 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__1_in_rule__LocalAlternative__Group__05892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_rule__LocalAlternative__Group__0__Impl5920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__1__Impl_in_rule__LocalAlternative__Group__15951 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__2_in_rule__LocalAlternative__Group__15954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__ConditionAssignment_1_in_rule__LocalAlternative__Group__1__Impl5981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__2__Impl_in_rule__LocalAlternative__Group__26011 = new BitSet(new long[]{0x0000000010000200L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__3_in_rule__LocalAlternative__Group__26014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__LocalAlternative__Group__2__Impl6042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__3__Impl_in_rule__LocalAlternative__Group__36073 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__4_in_rule__LocalAlternative__Group__36076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Alternatives_3_in_rule__LocalAlternative__Group__3__Impl6103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__4__Impl_in_rule__LocalAlternative__Group__46133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__0_in_rule__LocalAlternative__Group__4__Impl6160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__0__Impl_in_rule__LocalAlternative__Group_3_1__06201 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__1_in_rule__LocalAlternative__Group_3_1__06204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_rule__LocalAlternative__Group_3_1__0__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__1__Impl_in_rule__LocalAlternative__Group_3_1__16263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1_in_rule__LocalAlternative__Group_3_1__1__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__0__Impl_in_rule__LocalAlternative__Group_4__06324 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__1_in_rule__LocalAlternative__Group_4__06327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rule__LocalAlternative__Group_4__0__Impl6355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__1__Impl_in_rule__LocalAlternative__Group_4__16386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__ContinuationAssignment_4_1_in_rule__LocalAlternative__Group_4__1__Impl6413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__0__Impl_in_rule__AlternativeFlowAlternative__Group__06447 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__1_in_rule__AlternativeFlowAlternative__Group__06450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_rule__AlternativeFlowAlternative__Group__0__Impl6478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__1__Impl_in_rule__AlternativeFlowAlternative__Group__16509 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__2_in_rule__AlternativeFlowAlternative__Group__16512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__ConditionAssignment_1_in_rule__AlternativeFlowAlternative__Group__1__Impl6539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__2__Impl_in_rule__AlternativeFlowAlternative__Group__26569 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__3_in_rule__AlternativeFlowAlternative__Group__26572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__AlternativeFlowAlternative__Group__2__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__3__Impl_in_rule__AlternativeFlowAlternative__Group__36631 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__4_in_rule__AlternativeFlowAlternative__Group__36634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__AlternativeFlowAlternative__Group__3__Impl6662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__4__Impl_in_rule__AlternativeFlowAlternative__Group__46693 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__5_in_rule__AlternativeFlowAlternative__Group__46696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__RefAssignment_4_in_rule__AlternativeFlowAlternative__Group__4__Impl6723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__5__Impl_in_rule__AlternativeFlowAlternative__Group__56753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__0_in_rule__AlternativeFlowAlternative__Group__5__Impl6780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__0__Impl_in_rule__AlternativeFlowAlternative__Group_5__06823 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__1_in_rule__AlternativeFlowAlternative__Group_5__06826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rule__AlternativeFlowAlternative__Group_5__0__Impl6854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__1__Impl_in_rule__AlternativeFlowAlternative__Group_5__16885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__ContinuationAssignment_5_1_in_rule__AlternativeFlowAlternative__Group_5__1__Impl6912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__0__Impl_in_rule__ParallelStep__Group__06946 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__1_in_rule__ParallelStep__Group__06949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_rule__ParallelStep__Group__0__Impl6977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__1__Impl_in_rule__ParallelStep__Group__17008 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__2_in_rule__ParallelStep__Group__17011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__NameAssignment_1_in_rule__ParallelStep__Group__1__Impl7038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__2__Impl_in_rule__ParallelStep__Group__27068 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__3_in_rule__ParallelStep__Group__27071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__LabelAssignment_2_in_rule__ParallelStep__Group__2__Impl7098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__3__Impl_in_rule__ParallelStep__Group__37129 = new BitSet(new long[]{0x0000000040000800L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__4_in_rule__ParallelStep__Group__37132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_3_in_rule__ParallelStep__Group__3__Impl7159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__4__Impl_in_rule__ParallelStep__Group__47189 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__5_in_rule__ParallelStep__Group__47192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__0_in_rule__ParallelStep__Group__4__Impl7219 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__5__Impl_in_rule__ParallelStep__Group__57250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__0_in_rule__ParallelStep__Group__5__Impl7277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__0__Impl_in_rule__ParallelStep__Group_4__07320 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__1_in_rule__ParallelStep__Group_4__07323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_rule__ParallelStep__Group_4__0__Impl7351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__1__Impl_in_rule__ParallelStep__Group_4__17382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_4_1_in_rule__ParallelStep__Group_4__1__Impl7409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__0__Impl_in_rule__ParallelStep__Group_5__07443 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__1_in_rule__ParallelStep__Group_5__07446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_rule__ParallelStep__Group_5__0__Impl7474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__1__Impl_in_rule__ParallelStep__Group_5__17505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__NextAssignment_5_1_in_rule__ParallelStep__Group_5__1__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__0__Impl_in_rule__NormalStep__Group__07566 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__1_in_rule__NormalStep__Group__07569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_rule__NormalStep__Group__0__Impl7597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__1__Impl_in_rule__NormalStep__Group__17628 = new BitSet(new long[]{0x0000000000040200L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__2_in_rule__NormalStep__Group__17631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__NameAssignment_1_in_rule__NormalStep__Group__1__Impl7658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__2__Impl_in_rule__NormalStep__Group__27688 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__3_in_rule__NormalStep__Group__27691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__LabelAssignment_2_in_rule__NormalStep__Group__2__Impl7718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__3__Impl_in_rule__NormalStep__Group__37749 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__4_in_rule__NormalStep__Group__37752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_rule__NormalStep__Group__3__Impl7780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__4__Impl_in_rule__NormalStep__Group__47811 = new BitSet(new long[]{0x0000080050008000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__5_in_rule__NormalStep__Group__47814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__ActorAssignment_4_in_rule__NormalStep__Group__4__Impl7841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__5__Impl_in_rule__NormalStep__Group__57871 = new BitSet(new long[]{0x0000000050008000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__6_in_rule__NormalStep__Group__57874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_5__0_in_rule__NormalStep__Group__5__Impl7901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__6__Impl_in_rule__NormalStep__Group__67932 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__7_in_rule__NormalStep__Group__67935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Alternatives_6_in_rule__NormalStep__Group__6__Impl7962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__7__Impl_in_rule__NormalStep__Group__77993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__0_in_rule__NormalStep__Group__7__Impl8020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_5__0__Impl_in_rule__NormalStep__Group_5__08067 = new BitSet(new long[]{0x0000008128000000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_5__1_in_rule__NormalStep__Group_5__08070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_rule__NormalStep__Group_5__0__Impl8098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_5__1__Impl_in_rule__NormalStep__Group_5__18129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__CustomStepTypeAssignment_5_1_in_rule__NormalStep__Group_5__1__Impl8156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__0__Impl_in_rule__NormalStep__Group_6_0__08190 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__1_in_rule__NormalStep__Group_6_0__08193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__NormalStep__Group_6_0__0__Impl8221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__1__Impl_in_rule__NormalStep__Group_6_0__18252 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__2_in_rule__NormalStep__Group_6_0__18255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8284 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8296 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__2__Impl_in_rule__NormalStep__Group_6_0__28329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_rule__NormalStep__Group_6_0__2__Impl8357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__0__Impl_in_rule__NormalStep__Group_6_1__08394 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__1_in_rule__NormalStep__Group_6_1__08397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_rule__NormalStep__Group_6_1__0__Impl8425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__1__Impl_in_rule__NormalStep__Group_6_1__18456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__InvokedUseCaseAssignment_6_1_1_in_rule__NormalStep__Group_6_1__1__Impl8483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__0__Impl_in_rule__NormalStep__Group_7__08517 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__1_in_rule__NormalStep__Group_7__08520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_rule__NormalStep__Group_7__0__Impl8548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__1__Impl_in_rule__NormalStep__Group_7__18579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__NextAssignment_7_1_in_rule__NormalStep__Group_7__1__Impl8606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08640 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8726 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08761 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl8792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__0_in_rule__UseCase__UnorderedGroup_48884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__0_in_rule__UseCase__UnorderedGroup_4__Impl8971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__0_in_rule__UseCase__UnorderedGroup_4__Impl9062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__09121 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__1_in_rule__UseCase__UnorderedGroup_4__09124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__19149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__UseCasesModel__PackagesAssignment9181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DescriptionAssignment_29243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActor_in_rule__PackageDeclaration__ActorsAssignment_3_19274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUseCase_in_rule__PackageDeclaration__UseCasesAssignment_49305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__UseCase__NameAssignment_19336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__UseCase__DescriptionAssignment_29367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__UseCase__SuperCaseAssignment_3_19402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__UseCase__PreconditionsAssignment_4_0_19437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__UseCase__PostconditionsAssignment_4_1_19468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFlow_in_rule__UseCase__FlowsAssignment_59499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__UCCondition__NameAssignment9530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_09561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActorType_in_rule__Actor__TypeAssignment_29592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__Actor__DescriptionAssignment_39623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__ExtendsAssignment_4_19658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__BasicFlow__StepsAssignment_29693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__BasicFlow__FinalStateAssignment_4_19724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ExceptionFlow__NameAssignment_19755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__ExceptionFlow__ConditionAssignment_39786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__ExceptionFlow__StepsAssignment_59817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__ExceptionFlow__FinalStateAssignment_7_19848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlow__NameAssignment_19879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__AlternativeFlow__StepsAssignment_29910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__AlternativeFlow__FinalStateAssignment_4_19941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelFlow__NameAssignment_19972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__ParallelFlow__StepsAssignment_210003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUCCondition_in_rule__ParallelFlow__FinalStateAssignment_4_110034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__Condition__ConditionAssignment_110065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Condition__ContinuationAssignment_3_110100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__LocalAlternative__ConditionAssignment_110135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__LocalAlternative__DescriptionAssignment_3_010166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_110201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__LocalAlternative__ContinuationAssignment_4_110240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__AlternativeFlowAlternative__ConditionAssignment_110275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__RefAssignment_410310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__ContinuationAssignment_5_110349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__NameAssignment_110384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__ParallelStep__LabelAssignment_210415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_310450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_4_110489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__NextAssignment_5_110528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__NameAssignment_110563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__NormalStep__LabelAssignment_210594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__ActorAssignment_410629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCustomStepType_in_rule__NormalStep__CustomStepTypeAssignment_5_110664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStepAlternative_in_rule__NormalStep__StepAlternativeAssignment_6_0_110695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__InvokedUseCaseAssignment_6_1_110730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__NextAssignment_7_110769 = new BitSet(new long[]{0x0000000000000002L});
}
