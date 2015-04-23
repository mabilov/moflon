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



	// $ANTLR start "entryRuleActor"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:144:1: entryRuleActor : ruleActor EOF ;
	public final void entryRuleActor() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:145:1: ( ruleActor EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:146:1: ruleActor EOF
			{
			 before(grammarAccess.getActorRule()); 
			pushFollow(FOLLOW_ruleActor_in_entryRuleActor242);
			ruleActor();
			state._fsp--;

			 after(grammarAccess.getActorRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleActor249); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:153:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
	public final void ruleActor() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:157:2: ( ( ( rule__Actor__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:158:1: ( ( rule__Actor__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:158:1: ( ( rule__Actor__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:159:1: ( rule__Actor__Group__0 )
			{
			 before(grammarAccess.getActorAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:160:2: ( rule__Actor__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:160:2: rule__Actor__Group__0
			{
			pushFollow(FOLLOW_rule__Actor__Group__0_in_ruleActor275);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:172:1: entryRuleStep : ruleStep EOF ;
	public final void entryRuleStep() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:173:1: ( ruleStep EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:174:1: ruleStep EOF
			{
			 before(grammarAccess.getStepRule()); 
			pushFollow(FOLLOW_ruleStep_in_entryRuleStep302);
			ruleStep();
			state._fsp--;

			 after(grammarAccess.getStepRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStep309); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:181:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
	public final void ruleStep() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:185:2: ( ( ( rule__Step__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:186:1: ( ( rule__Step__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:186:1: ( ( rule__Step__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:187:1: ( rule__Step__Alternatives )
			{
			 before(grammarAccess.getStepAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:188:2: ( rule__Step__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:188:2: rule__Step__Alternatives
			{
			pushFollow(FOLLOW_rule__Step__Alternatives_in_ruleStep335);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:200:1: entryRuleFlow : ruleFlow EOF ;
	public final void entryRuleFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:201:1: ( ruleFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:202:1: ruleFlow EOF
			{
			 before(grammarAccess.getFlowRule()); 
			pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow362);
			ruleFlow();
			state._fsp--;

			 after(grammarAccess.getFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleFlow369); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:209:1: ruleFlow : ( ( rule__Flow__Alternatives ) ) ;
	public final void ruleFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:213:2: ( ( ( rule__Flow__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:214:1: ( ( rule__Flow__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:214:1: ( ( rule__Flow__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:215:1: ( rule__Flow__Alternatives )
			{
			 before(grammarAccess.getFlowAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:216:2: ( rule__Flow__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:216:2: rule__Flow__Alternatives
			{
			pushFollow(FOLLOW_rule__Flow__Alternatives_in_ruleFlow395);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:228:1: entryRuleBasicFlow : ruleBasicFlow EOF ;
	public final void entryRuleBasicFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:229:1: ( ruleBasicFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:230:1: ruleBasicFlow EOF
			{
			 before(grammarAccess.getBasicFlowRule()); 
			pushFollow(FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow422);
			ruleBasicFlow();
			state._fsp--;

			 after(grammarAccess.getBasicFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleBasicFlow429); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:237:1: ruleBasicFlow : ( ( rule__BasicFlow__Group__0 ) ) ;
	public final void ruleBasicFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:241:2: ( ( ( rule__BasicFlow__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:242:1: ( ( rule__BasicFlow__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:242:1: ( ( rule__BasicFlow__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:243:1: ( rule__BasicFlow__Group__0 )
			{
			 before(grammarAccess.getBasicFlowAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:244:2: ( rule__BasicFlow__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:244:2: rule__BasicFlow__Group__0
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__0_in_ruleBasicFlow455);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:256:1: entryRuleNamedFlow : ruleNamedFlow EOF ;
	public final void entryRuleNamedFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:257:1: ( ruleNamedFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:258:1: ruleNamedFlow EOF
			{
			 before(grammarAccess.getNamedFlowRule()); 
			pushFollow(FOLLOW_ruleNamedFlow_in_entryRuleNamedFlow482);
			ruleNamedFlow();
			state._fsp--;

			 after(grammarAccess.getNamedFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleNamedFlow489); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:265:1: ruleNamedFlow : ( ( rule__NamedFlow__Alternatives ) ) ;
	public final void ruleNamedFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:269:2: ( ( ( rule__NamedFlow__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:270:1: ( ( rule__NamedFlow__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:270:1: ( ( rule__NamedFlow__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:271:1: ( rule__NamedFlow__Alternatives )
			{
			 before(grammarAccess.getNamedFlowAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:272:2: ( rule__NamedFlow__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:272:2: rule__NamedFlow__Alternatives
			{
			pushFollow(FOLLOW_rule__NamedFlow__Alternatives_in_ruleNamedFlow515);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:284:1: entryRuleExceptionFlow : ruleExceptionFlow EOF ;
	public final void entryRuleExceptionFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:285:1: ( ruleExceptionFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:286:1: ruleExceptionFlow EOF
			{
			 before(grammarAccess.getExceptionFlowRule()); 
			pushFollow(FOLLOW_ruleExceptionFlow_in_entryRuleExceptionFlow542);
			ruleExceptionFlow();
			state._fsp--;

			 after(grammarAccess.getExceptionFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionFlow549); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:293:1: ruleExceptionFlow : ( ( rule__ExceptionFlow__Group__0 ) ) ;
	public final void ruleExceptionFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:297:2: ( ( ( rule__ExceptionFlow__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:298:1: ( ( rule__ExceptionFlow__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:298:1: ( ( rule__ExceptionFlow__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:299:1: ( rule__ExceptionFlow__Group__0 )
			{
			 before(grammarAccess.getExceptionFlowAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:300:2: ( rule__ExceptionFlow__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:300:2: rule__ExceptionFlow__Group__0
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__0_in_ruleExceptionFlow575);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:312:1: entryRuleAlternativeFlow : ruleAlternativeFlow EOF ;
	public final void entryRuleAlternativeFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:313:1: ( ruleAlternativeFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:314:1: ruleAlternativeFlow EOF
			{
			 before(grammarAccess.getAlternativeFlowRule()); 
			pushFollow(FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow602);
			ruleAlternativeFlow();
			state._fsp--;

			 after(grammarAccess.getAlternativeFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlow609); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:321:1: ruleAlternativeFlow : ( ( rule__AlternativeFlow__Group__0 ) ) ;
	public final void ruleAlternativeFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:325:2: ( ( ( rule__AlternativeFlow__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:326:1: ( ( rule__AlternativeFlow__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:326:1: ( ( rule__AlternativeFlow__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:327:1: ( rule__AlternativeFlow__Group__0 )
			{
			 before(grammarAccess.getAlternativeFlowAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:328:2: ( rule__AlternativeFlow__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:328:2: rule__AlternativeFlow__Group__0
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__0_in_ruleAlternativeFlow635);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:340:1: entryRuleParallelFlow : ruleParallelFlow EOF ;
	public final void entryRuleParallelFlow() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:341:1: ( ruleParallelFlow EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:342:1: ruleParallelFlow EOF
			{
			 before(grammarAccess.getParallelFlowRule()); 
			pushFollow(FOLLOW_ruleParallelFlow_in_entryRuleParallelFlow662);
			ruleParallelFlow();
			state._fsp--;

			 after(grammarAccess.getParallelFlowRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParallelFlow669); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:349:1: ruleParallelFlow : ( ( rule__ParallelFlow__Group__0 ) ) ;
	public final void ruleParallelFlow() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:353:2: ( ( ( rule__ParallelFlow__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:354:1: ( ( rule__ParallelFlow__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:354:1: ( ( rule__ParallelFlow__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:355:1: ( rule__ParallelFlow__Group__0 )
			{
			 before(grammarAccess.getParallelFlowAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:356:2: ( rule__ParallelFlow__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:356:2: rule__ParallelFlow__Group__0
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__0_in_ruleParallelFlow695);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:368:1: entryRuleStepAlternative : ruleStepAlternative EOF ;
	public final void entryRuleStepAlternative() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:369:1: ( ruleStepAlternative EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:370:1: ruleStepAlternative EOF
			{
			 before(grammarAccess.getStepAlternativeRule()); 
			pushFollow(FOLLOW_ruleStepAlternative_in_entryRuleStepAlternative722);
			ruleStepAlternative();
			state._fsp--;

			 after(grammarAccess.getStepAlternativeRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleStepAlternative729); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:377:1: ruleStepAlternative : ( ( rule__StepAlternative__Alternatives ) ) ;
	public final void ruleStepAlternative() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:381:2: ( ( ( rule__StepAlternative__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:382:1: ( ( rule__StepAlternative__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:382:1: ( ( rule__StepAlternative__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:383:1: ( rule__StepAlternative__Alternatives )
			{
			 before(grammarAccess.getStepAlternativeAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:384:2: ( rule__StepAlternative__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:384:2: rule__StepAlternative__Alternatives
			{
			pushFollow(FOLLOW_rule__StepAlternative__Alternatives_in_ruleStepAlternative755);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:396:1: entryRuleCondition : ruleCondition EOF ;
	public final void entryRuleCondition() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:397:1: ( ruleCondition EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:398:1: ruleCondition EOF
			{
			 before(grammarAccess.getConditionRule()); 
			pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition782);
			ruleCondition();
			state._fsp--;

			 after(grammarAccess.getConditionRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleCondition789); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:405:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
	public final void ruleCondition() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:409:2: ( ( ( rule__Condition__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:410:1: ( ( rule__Condition__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:410:1: ( ( rule__Condition__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:411:1: ( rule__Condition__Group__0 )
			{
			 before(grammarAccess.getConditionAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:412:2: ( rule__Condition__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:412:2: rule__Condition__Group__0
			{
			pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition815);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:424:1: entryRuleLocalAlternative : ruleLocalAlternative EOF ;
	public final void entryRuleLocalAlternative() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:425:1: ( ruleLocalAlternative EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:426:1: ruleLocalAlternative EOF
			{
			 before(grammarAccess.getLocalAlternativeRule()); 
			pushFollow(FOLLOW_ruleLocalAlternative_in_entryRuleLocalAlternative842);
			ruleLocalAlternative();
			state._fsp--;

			 after(grammarAccess.getLocalAlternativeRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAlternative849); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:433:1: ruleLocalAlternative : ( ( rule__LocalAlternative__Group__0 ) ) ;
	public final void ruleLocalAlternative() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:437:2: ( ( ( rule__LocalAlternative__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:438:1: ( ( rule__LocalAlternative__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:438:1: ( ( rule__LocalAlternative__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:439:1: ( rule__LocalAlternative__Group__0 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:440:2: ( rule__LocalAlternative__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:440:2: rule__LocalAlternative__Group__0
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__0_in_ruleLocalAlternative875);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:452:1: entryRuleAlternativeFlowAlternative : ruleAlternativeFlowAlternative EOF ;
	public final void entryRuleAlternativeFlowAlternative() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:453:1: ( ruleAlternativeFlowAlternative EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:454:1: ruleAlternativeFlowAlternative EOF
			{
			 before(grammarAccess.getAlternativeFlowAlternativeRule()); 
			pushFollow(FOLLOW_ruleAlternativeFlowAlternative_in_entryRuleAlternativeFlowAlternative902);
			ruleAlternativeFlowAlternative();
			state._fsp--;

			 after(grammarAccess.getAlternativeFlowAlternativeRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleAlternativeFlowAlternative909); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:461:1: ruleAlternativeFlowAlternative : ( ( rule__AlternativeFlowAlternative__Group__0 ) ) ;
	public final void ruleAlternativeFlowAlternative() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:465:2: ( ( ( rule__AlternativeFlowAlternative__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:466:1: ( ( rule__AlternativeFlowAlternative__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:466:1: ( ( rule__AlternativeFlowAlternative__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:467:1: ( rule__AlternativeFlowAlternative__Group__0 )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:468:2: ( rule__AlternativeFlowAlternative__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:468:2: rule__AlternativeFlowAlternative__Group__0
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__0_in_ruleAlternativeFlowAlternative935);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:480:1: entryRuleParallelStep : ruleParallelStep EOF ;
	public final void entryRuleParallelStep() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:481:1: ( ruleParallelStep EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:482:1: ruleParallelStep EOF
			{
			 before(grammarAccess.getParallelStepRule()); 
			pushFollow(FOLLOW_ruleParallelStep_in_entryRuleParallelStep962);
			ruleParallelStep();
			state._fsp--;

			 after(grammarAccess.getParallelStepRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleParallelStep969); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:489:1: ruleParallelStep : ( ( rule__ParallelStep__Group__0 ) ) ;
	public final void ruleParallelStep() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:493:2: ( ( ( rule__ParallelStep__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:494:1: ( ( rule__ParallelStep__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:494:1: ( ( rule__ParallelStep__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:495:1: ( rule__ParallelStep__Group__0 )
			{
			 before(grammarAccess.getParallelStepAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:496:2: ( rule__ParallelStep__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:496:2: rule__ParallelStep__Group__0
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__0_in_ruleParallelStep995);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:508:1: entryRuleNormalStep : ruleNormalStep EOF ;
	public final void entryRuleNormalStep() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:509:1: ( ruleNormalStep EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:510:1: ruleNormalStep EOF
			{
			 before(grammarAccess.getNormalStepRule()); 
			pushFollow(FOLLOW_ruleNormalStep_in_entryRuleNormalStep1022);
			ruleNormalStep();
			state._fsp--;

			 after(grammarAccess.getNormalStepRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleNormalStep1029); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:517:1: ruleNormalStep : ( ( rule__NormalStep__Group__0 ) ) ;
	public final void ruleNormalStep() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:521:2: ( ( ( rule__NormalStep__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:522:1: ( ( rule__NormalStep__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:522:1: ( ( rule__NormalStep__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:523:1: ( rule__NormalStep__Group__0 )
			{
			 before(grammarAccess.getNormalStepAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:524:2: ( rule__NormalStep__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:524:2: rule__NormalStep__Group__0
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__0_in_ruleNormalStep1055);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:536:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
	public final void entryRuleQualifiedName() throws RecognitionException {
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:537:1: ( ruleQualifiedName EOF )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:538:1: ruleQualifiedName EOF
			{
			 before(grammarAccess.getQualifiedNameRule()); 
			pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1082);
			ruleQualifiedName();
			state._fsp--;

			 after(grammarAccess.getQualifiedNameRule()); 
			match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1089); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:545:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
	public final void ruleQualifiedName() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:549:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:550:1: ( ( rule__QualifiedName__Group__0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:550:1: ( ( rule__QualifiedName__Group__0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:551:1: ( rule__QualifiedName__Group__0 )
			{
			 before(grammarAccess.getQualifiedNameAccess().getGroup()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:552:2: ( rule__QualifiedName__Group__0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:552:2: rule__QualifiedName__Group__0
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1115);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:565:1: ruleActorType : ( ( rule__ActorType__Alternatives ) ) ;
	public final void ruleActorType() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:569:1: ( ( ( rule__ActorType__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:570:1: ( ( rule__ActorType__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:570:1: ( ( rule__ActorType__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:571:1: ( rule__ActorType__Alternatives )
			{
			 before(grammarAccess.getActorTypeAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:572:2: ( rule__ActorType__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:572:2: rule__ActorType__Alternatives
			{
			pushFollow(FOLLOW_rule__ActorType__Alternatives_in_ruleActorType1152);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:584:1: ruleCustomStepType : ( ( rule__CustomStepType__Alternatives ) ) ;
	public final void ruleCustomStepType() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:588:1: ( ( ( rule__CustomStepType__Alternatives ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:589:1: ( ( rule__CustomStepType__Alternatives ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:589:1: ( ( rule__CustomStepType__Alternatives ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:590:1: ( rule__CustomStepType__Alternatives )
			{
			 before(grammarAccess.getCustomStepTypeAccess().getAlternatives()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:591:2: ( rule__CustomStepType__Alternatives )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:591:2: rule__CustomStepType__Alternatives
			{
			pushFollow(FOLLOW_rule__CustomStepType__Alternatives_in_ruleCustomStepType1188);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:602:1: rule__Step__Alternatives : ( ( ruleNormalStep ) | ( ruleParallelStep ) );
	public final void rule__Step__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:606:1: ( ( ruleNormalStep ) | ( ruleParallelStep ) )
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
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:607:1: ( ruleNormalStep )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:607:1: ( ruleNormalStep )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:608:1: ruleNormalStep
					{
					 before(grammarAccess.getStepAccess().getNormalStepParserRuleCall_0()); 
					pushFollow(FOLLOW_ruleNormalStep_in_rule__Step__Alternatives1223);
					ruleNormalStep();
					state._fsp--;

					 after(grammarAccess.getStepAccess().getNormalStepParserRuleCall_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:613:6: ( ruleParallelStep )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:613:6: ( ruleParallelStep )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:614:1: ruleParallelStep
					{
					 before(grammarAccess.getStepAccess().getParallelStepParserRuleCall_1()); 
					pushFollow(FOLLOW_ruleParallelStep_in_rule__Step__Alternatives1240);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:624:1: rule__Flow__Alternatives : ( ( ruleBasicFlow ) | ( ruleNamedFlow ) );
	public final void rule__Flow__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:628:1: ( ( ruleBasicFlow ) | ( ruleNamedFlow ) )
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
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:629:1: ( ruleBasicFlow )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:629:1: ( ruleBasicFlow )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:630:1: ruleBasicFlow
					{
					 before(grammarAccess.getFlowAccess().getBasicFlowParserRuleCall_0()); 
					pushFollow(FOLLOW_ruleBasicFlow_in_rule__Flow__Alternatives1272);
					ruleBasicFlow();
					state._fsp--;

					 after(grammarAccess.getFlowAccess().getBasicFlowParserRuleCall_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:635:6: ( ruleNamedFlow )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:635:6: ( ruleNamedFlow )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:636:1: ruleNamedFlow
					{
					 before(grammarAccess.getFlowAccess().getNamedFlowParserRuleCall_1()); 
					pushFollow(FOLLOW_ruleNamedFlow_in_rule__Flow__Alternatives1289);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:646:1: rule__NamedFlow__Alternatives : ( ( ruleExceptionFlow ) | ( ruleAlternativeFlow ) | ( ruleParallelFlow ) );
	public final void rule__NamedFlow__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:650:1: ( ( ruleExceptionFlow ) | ( ruleAlternativeFlow ) | ( ruleParallelFlow ) )
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
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:651:1: ( ruleExceptionFlow )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:651:1: ( ruleExceptionFlow )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:652:1: ruleExceptionFlow
					{
					 before(grammarAccess.getNamedFlowAccess().getExceptionFlowParserRuleCall_0()); 
					pushFollow(FOLLOW_ruleExceptionFlow_in_rule__NamedFlow__Alternatives1321);
					ruleExceptionFlow();
					state._fsp--;

					 after(grammarAccess.getNamedFlowAccess().getExceptionFlowParserRuleCall_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:657:6: ( ruleAlternativeFlow )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:657:6: ( ruleAlternativeFlow )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:658:1: ruleAlternativeFlow
					{
					 before(grammarAccess.getNamedFlowAccess().getAlternativeFlowParserRuleCall_1()); 
					pushFollow(FOLLOW_ruleAlternativeFlow_in_rule__NamedFlow__Alternatives1338);
					ruleAlternativeFlow();
					state._fsp--;

					 after(grammarAccess.getNamedFlowAccess().getAlternativeFlowParserRuleCall_1()); 
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:663:6: ( ruleParallelFlow )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:663:6: ( ruleParallelFlow )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:664:1: ruleParallelFlow
					{
					 before(grammarAccess.getNamedFlowAccess().getParallelFlowParserRuleCall_2()); 
					pushFollow(FOLLOW_ruleParallelFlow_in_rule__NamedFlow__Alternatives1355);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:674:1: rule__StepAlternative__Alternatives : ( ( ruleCondition ) | ( ruleLocalAlternative ) | ( ruleAlternativeFlowAlternative ) );
	public final void rule__StepAlternative__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:678:1: ( ( ruleCondition ) | ( ruleLocalAlternative ) | ( ruleAlternativeFlowAlternative ) )
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
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:679:1: ( ruleCondition )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:679:1: ( ruleCondition )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:680:1: ruleCondition
					{
					 before(grammarAccess.getStepAlternativeAccess().getConditionParserRuleCall_0()); 
					pushFollow(FOLLOW_ruleCondition_in_rule__StepAlternative__Alternatives1387);
					ruleCondition();
					state._fsp--;

					 after(grammarAccess.getStepAlternativeAccess().getConditionParserRuleCall_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:685:6: ( ruleLocalAlternative )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:685:6: ( ruleLocalAlternative )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:686:1: ruleLocalAlternative
					{
					 before(grammarAccess.getStepAlternativeAccess().getLocalAlternativeParserRuleCall_1()); 
					pushFollow(FOLLOW_ruleLocalAlternative_in_rule__StepAlternative__Alternatives1404);
					ruleLocalAlternative();
					state._fsp--;

					 after(grammarAccess.getStepAlternativeAccess().getLocalAlternativeParserRuleCall_1()); 
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:691:6: ( ruleAlternativeFlowAlternative )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:691:6: ( ruleAlternativeFlowAlternative )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:692:1: ruleAlternativeFlowAlternative
					{
					 before(grammarAccess.getStepAlternativeAccess().getAlternativeFlowAlternativeParserRuleCall_2()); 
					pushFollow(FOLLOW_ruleAlternativeFlowAlternative_in_rule__StepAlternative__Alternatives1421);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:702:1: rule__LocalAlternative__Alternatives_3 : ( ( ( rule__LocalAlternative__DescriptionAssignment_3_0 ) ) | ( ( rule__LocalAlternative__Group_3_1__0 ) ) );
	public final void rule__LocalAlternative__Alternatives_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:706:1: ( ( ( rule__LocalAlternative__DescriptionAssignment_3_0 ) ) | ( ( rule__LocalAlternative__Group_3_1__0 ) ) )
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
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:707:1: ( ( rule__LocalAlternative__DescriptionAssignment_3_0 ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:707:1: ( ( rule__LocalAlternative__DescriptionAssignment_3_0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:708:1: ( rule__LocalAlternative__DescriptionAssignment_3_0 )
					{
					 before(grammarAccess.getLocalAlternativeAccess().getDescriptionAssignment_3_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:709:2: ( rule__LocalAlternative__DescriptionAssignment_3_0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:709:2: rule__LocalAlternative__DescriptionAssignment_3_0
					{
					pushFollow(FOLLOW_rule__LocalAlternative__DescriptionAssignment_3_0_in_rule__LocalAlternative__Alternatives_31453);
					rule__LocalAlternative__DescriptionAssignment_3_0();
					state._fsp--;

					}

					 after(grammarAccess.getLocalAlternativeAccess().getDescriptionAssignment_3_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:713:6: ( ( rule__LocalAlternative__Group_3_1__0 ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:713:6: ( ( rule__LocalAlternative__Group_3_1__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:714:1: ( rule__LocalAlternative__Group_3_1__0 )
					{
					 before(grammarAccess.getLocalAlternativeAccess().getGroup_3_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:715:2: ( rule__LocalAlternative__Group_3_1__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:715:2: rule__LocalAlternative__Group_3_1__0
					{
					pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__0_in_rule__LocalAlternative__Alternatives_31471);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:724:1: rule__NormalStep__Alternatives_6 : ( ( ( rule__NormalStep__Group_6_0__0 ) ) | ( ( rule__NormalStep__Group_6_1__0 ) ) );
	public final void rule__NormalStep__Alternatives_6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:728:1: ( ( ( rule__NormalStep__Group_6_0__0 ) ) | ( ( rule__NormalStep__Group_6_1__0 ) ) )
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
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:729:1: ( ( rule__NormalStep__Group_6_0__0 ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:729:1: ( ( rule__NormalStep__Group_6_0__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:730:1: ( rule__NormalStep__Group_6_0__0 )
					{
					 before(grammarAccess.getNormalStepAccess().getGroup_6_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:731:2: ( rule__NormalStep__Group_6_0__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:731:2: rule__NormalStep__Group_6_0__0
					{
					pushFollow(FOLLOW_rule__NormalStep__Group_6_0__0_in_rule__NormalStep__Alternatives_61504);
					rule__NormalStep__Group_6_0__0();
					state._fsp--;

					}

					 after(grammarAccess.getNormalStepAccess().getGroup_6_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:735:6: ( ( rule__NormalStep__Group_6_1__0 ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:735:6: ( ( rule__NormalStep__Group_6_1__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:736:1: ( rule__NormalStep__Group_6_1__0 )
					{
					 before(grammarAccess.getNormalStepAccess().getGroup_6_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:737:2: ( rule__NormalStep__Group_6_1__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:737:2: rule__NormalStep__Group_6_1__0
					{
					pushFollow(FOLLOW_rule__NormalStep__Group_6_1__0_in_rule__NormalStep__Alternatives_61522);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:746:1: rule__ActorType__Alternatives : ( ( ( 'person' ) ) | ( ( 'system' ) ) | ( ( 'organization' ) ) );
	public final void rule__ActorType__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:750:1: ( ( ( 'person' ) ) | ( ( 'system' ) ) | ( ( 'organization' ) ) )
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
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:751:1: ( ( 'person' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:751:1: ( ( 'person' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:752:1: ( 'person' )
					{
					 before(grammarAccess.getActorTypeAccess().getPERSONEnumLiteralDeclaration_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:753:3: ( 'person' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:753:3: 'person'
					{
					match(input,36,FOLLOW_36_in_rule__ActorType__Alternatives1556); 
					}

					 after(grammarAccess.getActorTypeAccess().getPERSONEnumLiteralDeclaration_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:758:6: ( ( 'system' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:758:6: ( ( 'system' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:759:1: ( 'system' )
					{
					 before(grammarAccess.getActorTypeAccess().getSYSTEMEnumLiteralDeclaration_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:760:3: ( 'system' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:760:3: 'system'
					{
					match(input,41,FOLLOW_41_in_rule__ActorType__Alternatives1577); 
					}

					 after(grammarAccess.getActorTypeAccess().getSYSTEMEnumLiteralDeclaration_1()); 
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:765:6: ( ( 'organization' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:765:6: ( ( 'organization' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:766:1: ( 'organization' )
					{
					 before(grammarAccess.getActorTypeAccess().getORGANIZATIONEnumLiteralDeclaration_2()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:767:3: ( 'organization' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:767:3: 'organization'
					{
					match(input,31,FOLLOW_31_in_rule__ActorType__Alternatives1598); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:777:1: rule__CustomStepType__Alternatives : ( ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'process' ) ) | ( ( 'mix' ) ) );
	public final void rule__CustomStepType__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:781:1: ( ( ( 'input' ) ) | ( ( 'output' ) ) | ( ( 'process' ) ) | ( ( 'mix' ) ) )
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
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:782:1: ( ( 'input' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:782:1: ( ( 'input' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:783:1: ( 'input' )
					{
					 before(grammarAccess.getCustomStepTypeAccess().getINPUTEnumLiteralDeclaration_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:784:3: ( 'input' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:784:3: 'input'
					{
					match(input,27,FOLLOW_27_in_rule__CustomStepType__Alternatives1634); 
					}

					 after(grammarAccess.getCustomStepTypeAccess().getINPUTEnumLiteralDeclaration_0()); 
					}

					}
					break;
				case 2 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:789:6: ( ( 'output' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:789:6: ( ( 'output' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:790:1: ( 'output' )
					{
					 before(grammarAccess.getCustomStepTypeAccess().getOUTPUTEnumLiteralDeclaration_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:791:3: ( 'output' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:791:3: 'output'
					{
					match(input,32,FOLLOW_32_in_rule__CustomStepType__Alternatives1655); 
					}

					 after(grammarAccess.getCustomStepTypeAccess().getOUTPUTEnumLiteralDeclaration_1()); 
					}

					}
					break;
				case 3 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:796:6: ( ( 'process' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:796:6: ( ( 'process' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:797:1: ( 'process' )
					{
					 before(grammarAccess.getCustomStepTypeAccess().getPROCESSEnumLiteralDeclaration_2()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:798:3: ( 'process' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:798:3: 'process'
					{
					match(input,39,FOLLOW_39_in_rule__CustomStepType__Alternatives1676); 
					}

					 after(grammarAccess.getCustomStepTypeAccess().getPROCESSEnumLiteralDeclaration_2()); 
					}

					}
					break;
				case 4 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:803:6: ( ( 'mix' ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:803:6: ( ( 'mix' ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:804:1: ( 'mix' )
					{
					 before(grammarAccess.getCustomStepTypeAccess().getMIXEnumLiteralDeclaration_3()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:805:3: ( 'mix' )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:805:3: 'mix'
					{
					match(input,29,FOLLOW_29_in_rule__CustomStepType__Alternatives1697); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:817:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
	public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:821:2: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:822:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01730);
			rule__PackageDeclaration__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01733);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:829:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
	public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:833:1: ( ( 'package' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:834:1: ( 'package' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:834:1: ( 'package' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:835:1: 'package'
			{
			 before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
			match(input,33,FOLLOW_33_in_rule__PackageDeclaration__Group__0__Impl1761); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:848:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
	public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:852:2: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:853:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11792);
			rule__PackageDeclaration__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11795);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:860:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
	public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:864:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:865:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:865:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:866:1: ( rule__PackageDeclaration__NameAssignment_1 )
			{
			 before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:867:2: ( rule__PackageDeclaration__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:867:2: rule__PackageDeclaration__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1822);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:877:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
	public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:881:2: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:882:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21852);
			rule__PackageDeclaration__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21855);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:889:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? ) ;
	public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:893:1: ( ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:894:1: ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:894:1: ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:895:1: ( rule__PackageDeclaration__DescriptionAssignment_2 )?
			{
			 before(grammarAccess.getPackageDeclarationAccess().getDescriptionAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:896:2: ( rule__PackageDeclaration__DescriptionAssignment_2 )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==RULE_STRING) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:896:2: rule__PackageDeclaration__DescriptionAssignment_2
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__DescriptionAssignment_2_in_rule__PackageDeclaration__Group__2__Impl1882);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:906:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
	public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:910:2: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:911:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31913);
			rule__PackageDeclaration__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31916);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:918:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__Group_3__0 )? ) ;
	public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:922:1: ( ( ( rule__PackageDeclaration__Group_3__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:923:1: ( ( rule__PackageDeclaration__Group_3__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:923:1: ( ( rule__PackageDeclaration__Group_3__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:924:1: ( rule__PackageDeclaration__Group_3__0 )?
			{
			 before(grammarAccess.getPackageDeclarationAccess().getGroup_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:925:2: ( rule__PackageDeclaration__Group_3__0 )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==13) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:925:2: rule__PackageDeclaration__Group_3__0
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl1943);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:935:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
	public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:939:2: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:940:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41974);
			rule__PackageDeclaration__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__41977);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:947:1: rule__PackageDeclaration__Group__4__Impl : ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* ) ;
	public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:951:1: ( ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:952:1: ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:952:1: ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:953:1: ( rule__PackageDeclaration__UseCasesAssignment_4 )*
			{
			 before(grammarAccess.getPackageDeclarationAccess().getUseCasesAssignment_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:954:2: ( rule__PackageDeclaration__UseCasesAssignment_4 )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==44) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:954:2: rule__PackageDeclaration__UseCasesAssignment_4
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__UseCasesAssignment_4_in_rule__PackageDeclaration__Group__4__Impl2004);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:964:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl ;
	public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:968:2: ( rule__PackageDeclaration__Group__5__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:969:2: rule__PackageDeclaration__Group__5__Impl
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52035);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:975:1: rule__PackageDeclaration__Group__5__Impl : ( 'end package' ) ;
	public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:979:1: ( ( 'end package' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:980:1: ( 'end package' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:980:1: ( 'end package' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:981:1: 'end package'
			{
			 before(grammarAccess.getPackageDeclarationAccess().getEndPackageKeyword_5()); 
			match(input,22,FOLLOW_22_in_rule__PackageDeclaration__Group__5__Impl2063); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1006:1: rule__PackageDeclaration__Group_3__0 : rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 ;
	public final void rule__PackageDeclaration__Group_3__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1010:2: ( rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1011:2: rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02106);
			rule__PackageDeclaration__Group_3__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02109);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1018:1: rule__PackageDeclaration__Group_3__0__Impl : ( 'actors' ) ;
	public final void rule__PackageDeclaration__Group_3__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1022:1: ( ( 'actors' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1023:1: ( 'actors' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1023:1: ( 'actors' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1024:1: 'actors'
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsKeyword_3_0()); 
			match(input,13,FOLLOW_13_in_rule__PackageDeclaration__Group_3__0__Impl2137); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1037:1: rule__PackageDeclaration__Group_3__1 : rule__PackageDeclaration__Group_3__1__Impl ;
	public final void rule__PackageDeclaration__Group_3__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1041:2: ( rule__PackageDeclaration__Group_3__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1042:2: rule__PackageDeclaration__Group_3__1__Impl
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__12168);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1048:1: rule__PackageDeclaration__Group_3__1__Impl : ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) ) ;
	public final void rule__PackageDeclaration__Group_3__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1052:1: ( ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1053:1: ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1053:1: ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1054:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1054:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1055:1: ( rule__PackageDeclaration__ActorsAssignment_3_1 )
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1056:2: ( rule__PackageDeclaration__ActorsAssignment_3_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1056:2: rule__PackageDeclaration__ActorsAssignment_3_1
			{
			pushFollow(FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2197);
			rule__PackageDeclaration__ActorsAssignment_3_1();
			state._fsp--;

			}

			 after(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
			}

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1059:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1060:1: ( rule__PackageDeclaration__ActorsAssignment_3_1 )*
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1061:2: ( rule__PackageDeclaration__ActorsAssignment_3_1 )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==RULE_ID) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1061:2: rule__PackageDeclaration__ActorsAssignment_3_1
					{
					pushFollow(FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2209);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1076:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
	public final void rule__UseCase__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1080:2: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1081:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__02246);
			rule__UseCase__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__02249);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1088:1: rule__UseCase__Group__0__Impl : ( 'usecase' ) ;
	public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1092:1: ( ( 'usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1093:1: ( 'usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1093:1: ( 'usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1094:1: 'usecase'
			{
			 before(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 
			match(input,44,FOLLOW_44_in_rule__UseCase__Group__0__Impl2277); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1107:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
	public final void rule__UseCase__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1111:2: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1112:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
			{
			pushFollow(FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__12308);
			rule__UseCase__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__2_in_rule__UseCase__Group__12311);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1119:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
	public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1123:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1124:1: ( ( rule__UseCase__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1124:1: ( ( rule__UseCase__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1125:1: ( rule__UseCase__NameAssignment_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1126:2: ( rule__UseCase__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1126:2: rule__UseCase__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__UseCase__NameAssignment_1_in_rule__UseCase__Group__1__Impl2338);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1136:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
	public final void rule__UseCase__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1140:2: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1141:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
			{
			pushFollow(FOLLOW_rule__UseCase__Group__2__Impl_in_rule__UseCase__Group__22368);
			rule__UseCase__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__3_in_rule__UseCase__Group__22371);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1148:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionAssignment_2 )? ) ;
	public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1152:1: ( ( ( rule__UseCase__DescriptionAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1153:1: ( ( rule__UseCase__DescriptionAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1153:1: ( ( rule__UseCase__DescriptionAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1154:1: ( rule__UseCase__DescriptionAssignment_2 )?
			{
			 before(grammarAccess.getUseCaseAccess().getDescriptionAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1155:2: ( rule__UseCase__DescriptionAssignment_2 )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==RULE_STRING) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1155:2: rule__UseCase__DescriptionAssignment_2
					{
					pushFollow(FOLLOW_rule__UseCase__DescriptionAssignment_2_in_rule__UseCase__Group__2__Impl2398);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1165:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
	public final void rule__UseCase__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1169:2: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1170:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
			{
			pushFollow(FOLLOW_rule__UseCase__Group__3__Impl_in_rule__UseCase__Group__32429);
			rule__UseCase__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__4_in_rule__UseCase__Group__32432);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1177:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__Group_3__0 )? ) ;
	public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1181:1: ( ( ( rule__UseCase__Group_3__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1182:1: ( ( rule__UseCase__Group_3__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1182:1: ( ( rule__UseCase__Group_3__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1183:1: ( rule__UseCase__Group_3__0 )?
			{
			 before(grammarAccess.getUseCaseAccess().getGroup_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1184:2: ( rule__UseCase__Group_3__0 )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==25) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1184:2: rule__UseCase__Group_3__0
					{
					pushFollow(FOLLOW_rule__UseCase__Group_3__0_in_rule__UseCase__Group__3__Impl2459);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1194:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
	public final void rule__UseCase__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1198:2: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1199:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
			{
			pushFollow(FOLLOW_rule__UseCase__Group__4__Impl_in_rule__UseCase__Group__42490);
			rule__UseCase__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__5_in_rule__UseCase__Group__42493);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1206:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__UnorderedGroup_4 ) ) ;
	public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1210:1: ( ( ( rule__UseCase__UnorderedGroup_4 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1211:1: ( ( rule__UseCase__UnorderedGroup_4 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1211:1: ( ( rule__UseCase__UnorderedGroup_4 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1212:1: ( rule__UseCase__UnorderedGroup_4 )
			{
			 before(grammarAccess.getUseCaseAccess().getUnorderedGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1213:2: ( rule__UseCase__UnorderedGroup_4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1213:2: rule__UseCase__UnorderedGroup_4
			{
			pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4_in_rule__UseCase__Group__4__Impl2520);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1223:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
	public final void rule__UseCase__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1227:2: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1228:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
			{
			pushFollow(FOLLOW_rule__UseCase__Group__5__Impl_in_rule__UseCase__Group__52550);
			rule__UseCase__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group__6_in_rule__UseCase__Group__52553);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1235:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__FlowsAssignment_5 )* ) ;
	public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1239:1: ( ( ( rule__UseCase__FlowsAssignment_5 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1240:1: ( ( rule__UseCase__FlowsAssignment_5 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1240:1: ( ( rule__UseCase__FlowsAssignment_5 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1241:1: ( rule__UseCase__FlowsAssignment_5 )*
			{
			 before(grammarAccess.getUseCaseAccess().getFlowsAssignment_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1242:2: ( rule__UseCase__FlowsAssignment_5 )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==14||LA16_0==17||LA16_0==24||LA16_0==34) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1242:2: rule__UseCase__FlowsAssignment_5
					{
					pushFollow(FOLLOW_rule__UseCase__FlowsAssignment_5_in_rule__UseCase__Group__5__Impl2580);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1252:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl ;
	public final void rule__UseCase__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1256:2: ( rule__UseCase__Group__6__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1257:2: rule__UseCase__Group__6__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group__6__Impl_in_rule__UseCase__Group__62611);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1263:1: rule__UseCase__Group__6__Impl : ( 'end usecase' ) ;
	public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1267:1: ( ( 'end usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1268:1: ( 'end usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1268:1: ( 'end usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1269:1: 'end usecase'
			{
			 before(grammarAccess.getUseCaseAccess().getEndUsecaseKeyword_6()); 
			match(input,23,FOLLOW_23_in_rule__UseCase__Group__6__Impl2639); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1296:1: rule__UseCase__Group_3__0 : rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 ;
	public final void rule__UseCase__Group_3__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1300:2: ( rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1301:2: rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group_3__0__Impl_in_rule__UseCase__Group_3__02684);
			rule__UseCase__Group_3__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group_3__1_in_rule__UseCase__Group_3__02687);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1308:1: rule__UseCase__Group_3__0__Impl : ( 'extends' ) ;
	public final void rule__UseCase__Group_3__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1312:1: ( ( 'extends' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1313:1: ( 'extends' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1313:1: ( 'extends' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1314:1: 'extends'
			{
			 before(grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0()); 
			match(input,25,FOLLOW_25_in_rule__UseCase__Group_3__0__Impl2715); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1327:1: rule__UseCase__Group_3__1 : rule__UseCase__Group_3__1__Impl ;
	public final void rule__UseCase__Group_3__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1331:2: ( rule__UseCase__Group_3__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1332:2: rule__UseCase__Group_3__1__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group_3__1__Impl_in_rule__UseCase__Group_3__12746);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1338:1: rule__UseCase__Group_3__1__Impl : ( ( rule__UseCase__SuperCaseAssignment_3_1 ) ) ;
	public final void rule__UseCase__Group_3__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1342:1: ( ( ( rule__UseCase__SuperCaseAssignment_3_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1343:1: ( ( rule__UseCase__SuperCaseAssignment_3_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1343:1: ( ( rule__UseCase__SuperCaseAssignment_3_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1344:1: ( rule__UseCase__SuperCaseAssignment_3_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getSuperCaseAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1345:2: ( rule__UseCase__SuperCaseAssignment_3_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1345:2: rule__UseCase__SuperCaseAssignment_3_1
			{
			pushFollow(FOLLOW_rule__UseCase__SuperCaseAssignment_3_1_in_rule__UseCase__Group_3__1__Impl2773);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1359:1: rule__UseCase__Group_4_0__0 : rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1 ;
	public final void rule__UseCase__Group_4_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1363:2: ( rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1364:2: rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_0__0__Impl_in_rule__UseCase__Group_4_0__02807);
			rule__UseCase__Group_4_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group_4_0__1_in_rule__UseCase__Group_4_0__02810);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1371:1: rule__UseCase__Group_4_0__0__Impl : ( 'preconditions' ) ;
	public final void rule__UseCase__Group_4_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1375:1: ( ( 'preconditions' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1376:1: ( 'preconditions' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1376:1: ( 'preconditions' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1377:1: 'preconditions'
			{
			 before(grammarAccess.getUseCaseAccess().getPreconditionsKeyword_4_0_0()); 
			match(input,38,FOLLOW_38_in_rule__UseCase__Group_4_0__0__Impl2838); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1390:1: rule__UseCase__Group_4_0__1 : rule__UseCase__Group_4_0__1__Impl ;
	public final void rule__UseCase__Group_4_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1394:2: ( rule__UseCase__Group_4_0__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1395:2: rule__UseCase__Group_4_0__1__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_0__1__Impl_in_rule__UseCase__Group_4_0__12869);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1401:1: rule__UseCase__Group_4_0__1__Impl : ( ( rule__UseCase__PreConditionsAssignment_4_0_1 ) ) ;
	public final void rule__UseCase__Group_4_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1405:1: ( ( ( rule__UseCase__PreConditionsAssignment_4_0_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1406:1: ( ( rule__UseCase__PreConditionsAssignment_4_0_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1406:1: ( ( rule__UseCase__PreConditionsAssignment_4_0_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1407:1: ( rule__UseCase__PreConditionsAssignment_4_0_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getPreConditionsAssignment_4_0_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1408:2: ( rule__UseCase__PreConditionsAssignment_4_0_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1408:2: rule__UseCase__PreConditionsAssignment_4_0_1
			{
			pushFollow(FOLLOW_rule__UseCase__PreConditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl2896);
			rule__UseCase__PreConditionsAssignment_4_0_1();
			state._fsp--;

			}

			 after(grammarAccess.getUseCaseAccess().getPreConditionsAssignment_4_0_1()); 
			}

			}

		}
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1422:1: rule__UseCase__Group_4_1__0 : rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1 ;
	public final void rule__UseCase__Group_4_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1426:2: ( rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1427:2: rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_1__0__Impl_in_rule__UseCase__Group_4_1__02930);
			rule__UseCase__Group_4_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__UseCase__Group_4_1__1_in_rule__UseCase__Group_4_1__02933);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1434:1: rule__UseCase__Group_4_1__0__Impl : ( 'postcondition' ) ;
	public final void rule__UseCase__Group_4_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1438:1: ( ( 'postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1439:1: ( 'postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1439:1: ( 'postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1440:1: 'postcondition'
			{
			 before(grammarAccess.getUseCaseAccess().getPostconditionKeyword_4_1_0()); 
			match(input,37,FOLLOW_37_in_rule__UseCase__Group_4_1__0__Impl2961); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1453:1: rule__UseCase__Group_4_1__1 : rule__UseCase__Group_4_1__1__Impl ;
	public final void rule__UseCase__Group_4_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1457:2: ( rule__UseCase__Group_4_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1458:2: rule__UseCase__Group_4_1__1__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__Group_4_1__1__Impl_in_rule__UseCase__Group_4_1__12992);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1464:1: rule__UseCase__Group_4_1__1__Impl : ( ( rule__UseCase__PostconditionAssignment_4_1_1 ) ) ;
	public final void rule__UseCase__Group_4_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1468:1: ( ( ( rule__UseCase__PostconditionAssignment_4_1_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1469:1: ( ( rule__UseCase__PostconditionAssignment_4_1_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1469:1: ( ( rule__UseCase__PostconditionAssignment_4_1_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1470:1: ( rule__UseCase__PostconditionAssignment_4_1_1 )
			{
			 before(grammarAccess.getUseCaseAccess().getPostconditionAssignment_4_1_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1471:2: ( rule__UseCase__PostconditionAssignment_4_1_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1471:2: rule__UseCase__PostconditionAssignment_4_1_1
			{
			pushFollow(FOLLOW_rule__UseCase__PostconditionAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3019);
			rule__UseCase__PostconditionAssignment_4_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getUseCaseAccess().getPostconditionAssignment_4_1_1()); 
			}

			}

		}
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1485:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
	public final void rule__Actor__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1489:2: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1490:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
			{
			pushFollow(FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03053);
			rule__Actor__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03056);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1497:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__NameAssignment_0 ) ) ;
	public final void rule__Actor__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1501:1: ( ( ( rule__Actor__NameAssignment_0 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1502:1: ( ( rule__Actor__NameAssignment_0 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1502:1: ( ( rule__Actor__NameAssignment_0 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1503:1: ( rule__Actor__NameAssignment_0 )
			{
			 before(grammarAccess.getActorAccess().getNameAssignment_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1504:2: ( rule__Actor__NameAssignment_0 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1504:2: rule__Actor__NameAssignment_0
			{
			pushFollow(FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3083);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1514:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
	public final void rule__Actor__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1518:2: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1519:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
			{
			pushFollow(FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13113);
			rule__Actor__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13116);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1526:1: rule__Actor__Group__1__Impl : ( 'as' ) ;
	public final void rule__Actor__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1530:1: ( ( 'as' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1531:1: ( 'as' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1531:1: ( 'as' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1532:1: 'as'
			{
			 before(grammarAccess.getActorAccess().getAsKeyword_1()); 
			match(input,16,FOLLOW_16_in_rule__Actor__Group__1__Impl3144); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1545:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
	public final void rule__Actor__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1549:2: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1550:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
			{
			pushFollow(FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23175);
			rule__Actor__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23178);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1557:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__TypeAssignment_2 ) ) ;
	public final void rule__Actor__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1561:1: ( ( ( rule__Actor__TypeAssignment_2 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1562:1: ( ( rule__Actor__TypeAssignment_2 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1562:1: ( ( rule__Actor__TypeAssignment_2 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1563:1: ( rule__Actor__TypeAssignment_2 )
			{
			 before(grammarAccess.getActorAccess().getTypeAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1564:2: ( rule__Actor__TypeAssignment_2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1564:2: rule__Actor__TypeAssignment_2
			{
			pushFollow(FOLLOW_rule__Actor__TypeAssignment_2_in_rule__Actor__Group__2__Impl3205);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1574:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
	public final void rule__Actor__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1578:2: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1579:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
			{
			pushFollow(FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__33235);
			rule__Actor__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group__4_in_rule__Actor__Group__33238);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1586:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__DescriptionAssignment_3 )? ) ;
	public final void rule__Actor__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1590:1: ( ( ( rule__Actor__DescriptionAssignment_3 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1591:1: ( ( rule__Actor__DescriptionAssignment_3 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1591:1: ( ( rule__Actor__DescriptionAssignment_3 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1592:1: ( rule__Actor__DescriptionAssignment_3 )?
			{
			 before(grammarAccess.getActorAccess().getDescriptionAssignment_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1593:2: ( rule__Actor__DescriptionAssignment_3 )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==RULE_STRING) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1593:2: rule__Actor__DescriptionAssignment_3
					{
					pushFollow(FOLLOW_rule__Actor__DescriptionAssignment_3_in_rule__Actor__Group__3__Impl3265);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1603:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl ;
	public final void rule__Actor__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1607:2: ( rule__Actor__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1608:2: rule__Actor__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__Actor__Group__4__Impl_in_rule__Actor__Group__43296);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1614:1: rule__Actor__Group__4__Impl : ( ( rule__Actor__Group_4__0 )? ) ;
	public final void rule__Actor__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1618:1: ( ( ( rule__Actor__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1619:1: ( ( rule__Actor__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1619:1: ( ( rule__Actor__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1620:1: ( rule__Actor__Group_4__0 )?
			{
			 before(grammarAccess.getActorAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1621:2: ( rule__Actor__Group_4__0 )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==25) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1621:2: rule__Actor__Group_4__0
					{
					pushFollow(FOLLOW_rule__Actor__Group_4__0_in_rule__Actor__Group__4__Impl3323);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1641:1: rule__Actor__Group_4__0 : rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1 ;
	public final void rule__Actor__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1645:2: ( rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1646:2: rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1
			{
			pushFollow(FOLLOW_rule__Actor__Group_4__0__Impl_in_rule__Actor__Group_4__03364);
			rule__Actor__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Actor__Group_4__1_in_rule__Actor__Group_4__03367);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1653:1: rule__Actor__Group_4__0__Impl : ( 'extends' ) ;
	public final void rule__Actor__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1657:1: ( ( 'extends' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1658:1: ( 'extends' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1658:1: ( 'extends' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1659:1: 'extends'
			{
			 before(grammarAccess.getActorAccess().getExtendsKeyword_4_0()); 
			match(input,25,FOLLOW_25_in_rule__Actor__Group_4__0__Impl3395); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1672:1: rule__Actor__Group_4__1 : rule__Actor__Group_4__1__Impl ;
	public final void rule__Actor__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1676:2: ( rule__Actor__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1677:2: rule__Actor__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__Actor__Group_4__1__Impl_in_rule__Actor__Group_4__13426);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1683:1: rule__Actor__Group_4__1__Impl : ( ( rule__Actor__ExtendsAssignment_4_1 ) ) ;
	public final void rule__Actor__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1687:1: ( ( ( rule__Actor__ExtendsAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1688:1: ( ( rule__Actor__ExtendsAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1688:1: ( ( rule__Actor__ExtendsAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1689:1: ( rule__Actor__ExtendsAssignment_4_1 )
			{
			 before(grammarAccess.getActorAccess().getExtendsAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1690:2: ( rule__Actor__ExtendsAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1690:2: rule__Actor__ExtendsAssignment_4_1
			{
			pushFollow(FOLLOW_rule__Actor__ExtendsAssignment_4_1_in_rule__Actor__Group_4__1__Impl3453);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1704:1: rule__BasicFlow__Group__0 : rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1 ;
	public final void rule__BasicFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1708:2: ( rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1709:2: rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__0__Impl_in_rule__BasicFlow__Group__03487);
			rule__BasicFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__1_in_rule__BasicFlow__Group__03490);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1716:1: rule__BasicFlow__Group__0__Impl : ( 'basic flow' ) ;
	public final void rule__BasicFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1720:1: ( ( 'basic flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1721:1: ( 'basic flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1721:1: ( 'basic flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1722:1: 'basic flow'
			{
			 before(grammarAccess.getBasicFlowAccess().getBasicFlowKeyword_0()); 
			match(input,17,FOLLOW_17_in_rule__BasicFlow__Group__0__Impl3518); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1735:1: rule__BasicFlow__Group__1 : rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2 ;
	public final void rule__BasicFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1739:2: ( rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1740:2: rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__1__Impl_in_rule__BasicFlow__Group__13549);
			rule__BasicFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__2_in_rule__BasicFlow__Group__13552);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1747:1: rule__BasicFlow__Group__1__Impl : ( () ) ;
	public final void rule__BasicFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1751:1: ( ( () ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1752:1: ( () )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1752:1: ( () )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1753:1: ()
			{
			 before(grammarAccess.getBasicFlowAccess().getBasicFlowAction_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1754:1: ()
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1756:1: 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1766:1: rule__BasicFlow__Group__2 : rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3 ;
	public final void rule__BasicFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1770:2: ( rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1771:2: rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__2__Impl_in_rule__BasicFlow__Group__23610);
			rule__BasicFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__3_in_rule__BasicFlow__Group__23613);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1778:1: rule__BasicFlow__Group__2__Impl : ( ( rule__BasicFlow__StepsAssignment_2 )* ) ;
	public final void rule__BasicFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1782:1: ( ( ( rule__BasicFlow__StepsAssignment_2 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1783:1: ( ( rule__BasicFlow__StepsAssignment_2 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1783:1: ( ( rule__BasicFlow__StepsAssignment_2 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1784:1: ( rule__BasicFlow__StepsAssignment_2 )*
			{
			 before(grammarAccess.getBasicFlowAccess().getStepsAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1785:2: ( rule__BasicFlow__StepsAssignment_2 )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==35||LA19_0==40) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1785:2: rule__BasicFlow__StepsAssignment_2
					{
					pushFollow(FOLLOW_rule__BasicFlow__StepsAssignment_2_in_rule__BasicFlow__Group__2__Impl3640);
					rule__BasicFlow__StepsAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop19;
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1795:1: rule__BasicFlow__Group__3 : rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4 ;
	public final void rule__BasicFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1799:2: ( rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1800:2: rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__3__Impl_in_rule__BasicFlow__Group__33671);
			rule__BasicFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group__4_in_rule__BasicFlow__Group__33674);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1807:1: rule__BasicFlow__Group__3__Impl : ( 'end flow' ) ;
	public final void rule__BasicFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1811:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1812:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1812:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1813:1: 'end flow'
			{
			 before(grammarAccess.getBasicFlowAccess().getEndFlowKeyword_3()); 
			match(input,21,FOLLOW_21_in_rule__BasicFlow__Group__3__Impl3702); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1826:1: rule__BasicFlow__Group__4 : rule__BasicFlow__Group__4__Impl ;
	public final void rule__BasicFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1830:2: ( rule__BasicFlow__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1831:2: rule__BasicFlow__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group__4__Impl_in_rule__BasicFlow__Group__43733);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1837:1: rule__BasicFlow__Group__4__Impl : ( ( rule__BasicFlow__Group_4__0 )? ) ;
	public final void rule__BasicFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1841:1: ( ( ( rule__BasicFlow__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1842:1: ( ( rule__BasicFlow__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1842:1: ( ( rule__BasicFlow__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1843:1: ( rule__BasicFlow__Group_4__0 )?
			{
			 before(grammarAccess.getBasicFlowAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1844:2: ( rule__BasicFlow__Group_4__0 )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==45) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1844:2: rule__BasicFlow__Group_4__0
					{
					pushFollow(FOLLOW_rule__BasicFlow__Group_4__0_in_rule__BasicFlow__Group__4__Impl3760);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1864:1: rule__BasicFlow__Group_4__0 : rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1 ;
	public final void rule__BasicFlow__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1868:2: ( rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1869:2: rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group_4__0__Impl_in_rule__BasicFlow__Group_4__03801);
			rule__BasicFlow__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__BasicFlow__Group_4__1_in_rule__BasicFlow__Group_4__03804);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1876:1: rule__BasicFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
	public final void rule__BasicFlow__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1880:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1881:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1881:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1882:1: 'with postcondition'
			{
			 before(grammarAccess.getBasicFlowAccess().getWithPostconditionKeyword_4_0()); 
			match(input,45,FOLLOW_45_in_rule__BasicFlow__Group_4__0__Impl3832); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1895:1: rule__BasicFlow__Group_4__1 : rule__BasicFlow__Group_4__1__Impl ;
	public final void rule__BasicFlow__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1899:2: ( rule__BasicFlow__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1900:2: rule__BasicFlow__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__BasicFlow__Group_4__1__Impl_in_rule__BasicFlow__Group_4__13863);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1906:1: rule__BasicFlow__Group_4__1__Impl : ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) ) ;
	public final void rule__BasicFlow__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1910:1: ( ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1911:1: ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1911:1: ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1912:1: ( rule__BasicFlow__FinalStateAssignment_4_1 )
			{
			 before(grammarAccess.getBasicFlowAccess().getFinalStateAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1913:2: ( rule__BasicFlow__FinalStateAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1913:2: rule__BasicFlow__FinalStateAssignment_4_1
			{
			pushFollow(FOLLOW_rule__BasicFlow__FinalStateAssignment_4_1_in_rule__BasicFlow__Group_4__1__Impl3890);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1927:1: rule__ExceptionFlow__Group__0 : rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1 ;
	public final void rule__ExceptionFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1931:2: ( rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1932:2: rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__0__Impl_in_rule__ExceptionFlow__Group__03924);
			rule__ExceptionFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__1_in_rule__ExceptionFlow__Group__03927);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1939:1: rule__ExceptionFlow__Group__0__Impl : ( 'exception flow' ) ;
	public final void rule__ExceptionFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1943:1: ( ( 'exception flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1944:1: ( 'exception flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1944:1: ( 'exception flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1945:1: 'exception flow'
			{
			 before(grammarAccess.getExceptionFlowAccess().getExceptionFlowKeyword_0()); 
			match(input,24,FOLLOW_24_in_rule__ExceptionFlow__Group__0__Impl3955); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1958:1: rule__ExceptionFlow__Group__1 : rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2 ;
	public final void rule__ExceptionFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1962:2: ( rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1963:2: rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__1__Impl_in_rule__ExceptionFlow__Group__13986);
			rule__ExceptionFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__2_in_rule__ExceptionFlow__Group__13989);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1970:1: rule__ExceptionFlow__Group__1__Impl : ( ( rule__ExceptionFlow__NameAssignment_1 ) ) ;
	public final void rule__ExceptionFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1974:1: ( ( ( rule__ExceptionFlow__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1975:1: ( ( rule__ExceptionFlow__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1975:1: ( ( rule__ExceptionFlow__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1976:1: ( rule__ExceptionFlow__NameAssignment_1 )
			{
			 before(grammarAccess.getExceptionFlowAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1977:2: ( rule__ExceptionFlow__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1977:2: rule__ExceptionFlow__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__NameAssignment_1_in_rule__ExceptionFlow__Group__1__Impl4016);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1987:1: rule__ExceptionFlow__Group__2 : rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3 ;
	public final void rule__ExceptionFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1991:2: ( rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1992:2: rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__2__Impl_in_rule__ExceptionFlow__Group__24046);
			rule__ExceptionFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__3_in_rule__ExceptionFlow__Group__24049);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1999:1: rule__ExceptionFlow__Group__2__Impl : ( 'if' ) ;
	public final void rule__ExceptionFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2003:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2004:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2004:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2005:1: 'if'
			{
			 before(grammarAccess.getExceptionFlowAccess().getIfKeyword_2()); 
			match(input,26,FOLLOW_26_in_rule__ExceptionFlow__Group__2__Impl4077); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2018:1: rule__ExceptionFlow__Group__3 : rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4 ;
	public final void rule__ExceptionFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2022:2: ( rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2023:2: rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__3__Impl_in_rule__ExceptionFlow__Group__34108);
			rule__ExceptionFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__4_in_rule__ExceptionFlow__Group__34111);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2030:1: rule__ExceptionFlow__Group__3__Impl : ( ( rule__ExceptionFlow__ConditionAssignment_3 ) ) ;
	public final void rule__ExceptionFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2034:1: ( ( ( rule__ExceptionFlow__ConditionAssignment_3 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2035:1: ( ( rule__ExceptionFlow__ConditionAssignment_3 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2035:1: ( ( rule__ExceptionFlow__ConditionAssignment_3 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2036:1: ( rule__ExceptionFlow__ConditionAssignment_3 )
			{
			 before(grammarAccess.getExceptionFlowAccess().getConditionAssignment_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2037:2: ( rule__ExceptionFlow__ConditionAssignment_3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2037:2: rule__ExceptionFlow__ConditionAssignment_3
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__ConditionAssignment_3_in_rule__ExceptionFlow__Group__3__Impl4138);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2047:1: rule__ExceptionFlow__Group__4 : rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5 ;
	public final void rule__ExceptionFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2051:2: ( rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2052:2: rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__4__Impl_in_rule__ExceptionFlow__Group__44168);
			rule__ExceptionFlow__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__5_in_rule__ExceptionFlow__Group__44171);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2059:1: rule__ExceptionFlow__Group__4__Impl : ( 'then' ) ;
	public final void rule__ExceptionFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2063:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2064:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2064:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2065:1: 'then'
			{
			 before(grammarAccess.getExceptionFlowAccess().getThenKeyword_4()); 
			match(input,42,FOLLOW_42_in_rule__ExceptionFlow__Group__4__Impl4199); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2078:1: rule__ExceptionFlow__Group__5 : rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6 ;
	public final void rule__ExceptionFlow__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2082:2: ( rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2083:2: rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__5__Impl_in_rule__ExceptionFlow__Group__54230);
			rule__ExceptionFlow__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__6_in_rule__ExceptionFlow__Group__54233);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2090:1: rule__ExceptionFlow__Group__5__Impl : ( ( rule__ExceptionFlow__StepsAssignment_5 )* ) ;
	public final void rule__ExceptionFlow__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2094:1: ( ( ( rule__ExceptionFlow__StepsAssignment_5 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2095:1: ( ( rule__ExceptionFlow__StepsAssignment_5 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2095:1: ( ( rule__ExceptionFlow__StepsAssignment_5 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2096:1: ( rule__ExceptionFlow__StepsAssignment_5 )*
			{
			 before(grammarAccess.getExceptionFlowAccess().getStepsAssignment_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2097:2: ( rule__ExceptionFlow__StepsAssignment_5 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==35||LA21_0==40) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2097:2: rule__ExceptionFlow__StepsAssignment_5
					{
					pushFollow(FOLLOW_rule__ExceptionFlow__StepsAssignment_5_in_rule__ExceptionFlow__Group__5__Impl4260);
					rule__ExceptionFlow__StepsAssignment_5();
					state._fsp--;

					}
					break;

				default :
					break loop21;
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2107:1: rule__ExceptionFlow__Group__6 : rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7 ;
	public final void rule__ExceptionFlow__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2111:2: ( rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2112:2: rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__6__Impl_in_rule__ExceptionFlow__Group__64291);
			rule__ExceptionFlow__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group__7_in_rule__ExceptionFlow__Group__64294);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2119:1: rule__ExceptionFlow__Group__6__Impl : ( 'end flow' ) ;
	public final void rule__ExceptionFlow__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2123:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2124:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2124:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2125:1: 'end flow'
			{
			 before(grammarAccess.getExceptionFlowAccess().getEndFlowKeyword_6()); 
			match(input,21,FOLLOW_21_in_rule__ExceptionFlow__Group__6__Impl4322); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2138:1: rule__ExceptionFlow__Group__7 : rule__ExceptionFlow__Group__7__Impl ;
	public final void rule__ExceptionFlow__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2142:2: ( rule__ExceptionFlow__Group__7__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2143:2: rule__ExceptionFlow__Group__7__Impl
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group__7__Impl_in_rule__ExceptionFlow__Group__74353);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2149:1: rule__ExceptionFlow__Group__7__Impl : ( ( rule__ExceptionFlow__Group_7__0 )? ) ;
	public final void rule__ExceptionFlow__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2153:1: ( ( ( rule__ExceptionFlow__Group_7__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2154:1: ( ( rule__ExceptionFlow__Group_7__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2154:1: ( ( rule__ExceptionFlow__Group_7__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2155:1: ( rule__ExceptionFlow__Group_7__0 )?
			{
			 before(grammarAccess.getExceptionFlowAccess().getGroup_7()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2156:2: ( rule__ExceptionFlow__Group_7__0 )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==45) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2156:2: rule__ExceptionFlow__Group_7__0
					{
					pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__0_in_rule__ExceptionFlow__Group__7__Impl4380);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2182:1: rule__ExceptionFlow__Group_7__0 : rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1 ;
	public final void rule__ExceptionFlow__Group_7__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2186:2: ( rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2187:2: rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__0__Impl_in_rule__ExceptionFlow__Group_7__04427);
			rule__ExceptionFlow__Group_7__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__1_in_rule__ExceptionFlow__Group_7__04430);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2194:1: rule__ExceptionFlow__Group_7__0__Impl : ( 'with postcondition' ) ;
	public final void rule__ExceptionFlow__Group_7__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2198:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2199:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2199:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2200:1: 'with postcondition'
			{
			 before(grammarAccess.getExceptionFlowAccess().getWithPostconditionKeyword_7_0()); 
			match(input,45,FOLLOW_45_in_rule__ExceptionFlow__Group_7__0__Impl4458); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2213:1: rule__ExceptionFlow__Group_7__1 : rule__ExceptionFlow__Group_7__1__Impl ;
	public final void rule__ExceptionFlow__Group_7__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2217:2: ( rule__ExceptionFlow__Group_7__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2218:2: rule__ExceptionFlow__Group_7__1__Impl
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__1__Impl_in_rule__ExceptionFlow__Group_7__14489);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2224:1: rule__ExceptionFlow__Group_7__1__Impl : ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) ) ;
	public final void rule__ExceptionFlow__Group_7__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2228:1: ( ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2229:1: ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2229:1: ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2230:1: ( rule__ExceptionFlow__FinalStateAssignment_7_1 )
			{
			 before(grammarAccess.getExceptionFlowAccess().getFinalStateAssignment_7_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2231:2: ( rule__ExceptionFlow__FinalStateAssignment_7_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2231:2: rule__ExceptionFlow__FinalStateAssignment_7_1
			{
			pushFollow(FOLLOW_rule__ExceptionFlow__FinalStateAssignment_7_1_in_rule__ExceptionFlow__Group_7__1__Impl4516);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2245:1: rule__AlternativeFlow__Group__0 : rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1 ;
	public final void rule__AlternativeFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2249:2: ( rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2250:2: rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__0__Impl_in_rule__AlternativeFlow__Group__04550);
			rule__AlternativeFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__1_in_rule__AlternativeFlow__Group__04553);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2257:1: rule__AlternativeFlow__Group__0__Impl : ( 'alternative flow' ) ;
	public final void rule__AlternativeFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2261:1: ( ( 'alternative flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2262:1: ( 'alternative flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2262:1: ( 'alternative flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2263:1: 'alternative flow'
			{
			 before(grammarAccess.getAlternativeFlowAccess().getAlternativeFlowKeyword_0()); 
			match(input,14,FOLLOW_14_in_rule__AlternativeFlow__Group__0__Impl4581); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2276:1: rule__AlternativeFlow__Group__1 : rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2 ;
	public final void rule__AlternativeFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2280:2: ( rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2281:2: rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__1__Impl_in_rule__AlternativeFlow__Group__14612);
			rule__AlternativeFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__2_in_rule__AlternativeFlow__Group__14615);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2288:1: rule__AlternativeFlow__Group__1__Impl : ( ( rule__AlternativeFlow__NameAssignment_1 ) ) ;
	public final void rule__AlternativeFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2292:1: ( ( ( rule__AlternativeFlow__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2293:1: ( ( rule__AlternativeFlow__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2293:1: ( ( rule__AlternativeFlow__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2294:1: ( rule__AlternativeFlow__NameAssignment_1 )
			{
			 before(grammarAccess.getAlternativeFlowAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2295:2: ( rule__AlternativeFlow__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2295:2: rule__AlternativeFlow__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__NameAssignment_1_in_rule__AlternativeFlow__Group__1__Impl4642);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2305:1: rule__AlternativeFlow__Group__2 : rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3 ;
	public final void rule__AlternativeFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2309:2: ( rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2310:2: rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__2__Impl_in_rule__AlternativeFlow__Group__24672);
			rule__AlternativeFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__3_in_rule__AlternativeFlow__Group__24675);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2317:1: rule__AlternativeFlow__Group__2__Impl : ( ( rule__AlternativeFlow__StepsAssignment_2 )* ) ;
	public final void rule__AlternativeFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2321:1: ( ( ( rule__AlternativeFlow__StepsAssignment_2 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2322:1: ( ( rule__AlternativeFlow__StepsAssignment_2 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2322:1: ( ( rule__AlternativeFlow__StepsAssignment_2 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2323:1: ( rule__AlternativeFlow__StepsAssignment_2 )*
			{
			 before(grammarAccess.getAlternativeFlowAccess().getStepsAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2324:2: ( rule__AlternativeFlow__StepsAssignment_2 )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==35||LA23_0==40) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2324:2: rule__AlternativeFlow__StepsAssignment_2
					{
					pushFollow(FOLLOW_rule__AlternativeFlow__StepsAssignment_2_in_rule__AlternativeFlow__Group__2__Impl4702);
					rule__AlternativeFlow__StepsAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop23;
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2334:1: rule__AlternativeFlow__Group__3 : rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4 ;
	public final void rule__AlternativeFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2338:2: ( rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2339:2: rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__3__Impl_in_rule__AlternativeFlow__Group__34733);
			rule__AlternativeFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group__4_in_rule__AlternativeFlow__Group__34736);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2346:1: rule__AlternativeFlow__Group__3__Impl : ( 'end flow' ) ;
	public final void rule__AlternativeFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2350:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2351:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2351:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2352:1: 'end flow'
			{
			 before(grammarAccess.getAlternativeFlowAccess().getEndFlowKeyword_3()); 
			match(input,21,FOLLOW_21_in_rule__AlternativeFlow__Group__3__Impl4764); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2365:1: rule__AlternativeFlow__Group__4 : rule__AlternativeFlow__Group__4__Impl ;
	public final void rule__AlternativeFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2369:2: ( rule__AlternativeFlow__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2370:2: rule__AlternativeFlow__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group__4__Impl_in_rule__AlternativeFlow__Group__44795);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2376:1: rule__AlternativeFlow__Group__4__Impl : ( ( rule__AlternativeFlow__Group_4__0 )? ) ;
	public final void rule__AlternativeFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2380:1: ( ( ( rule__AlternativeFlow__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2381:1: ( ( rule__AlternativeFlow__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2381:1: ( ( rule__AlternativeFlow__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2382:1: ( rule__AlternativeFlow__Group_4__0 )?
			{
			 before(grammarAccess.getAlternativeFlowAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2383:2: ( rule__AlternativeFlow__Group_4__0 )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==45) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2383:2: rule__AlternativeFlow__Group_4__0
					{
					pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__0_in_rule__AlternativeFlow__Group__4__Impl4822);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2403:1: rule__AlternativeFlow__Group_4__0 : rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1 ;
	public final void rule__AlternativeFlow__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2407:2: ( rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2408:2: rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__0__Impl_in_rule__AlternativeFlow__Group_4__04863);
			rule__AlternativeFlow__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__1_in_rule__AlternativeFlow__Group_4__04866);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2415:1: rule__AlternativeFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
	public final void rule__AlternativeFlow__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2419:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2420:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2420:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2421:1: 'with postcondition'
			{
			 before(grammarAccess.getAlternativeFlowAccess().getWithPostconditionKeyword_4_0()); 
			match(input,45,FOLLOW_45_in_rule__AlternativeFlow__Group_4__0__Impl4894); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2434:1: rule__AlternativeFlow__Group_4__1 : rule__AlternativeFlow__Group_4__1__Impl ;
	public final void rule__AlternativeFlow__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2438:2: ( rule__AlternativeFlow__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2439:2: rule__AlternativeFlow__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__1__Impl_in_rule__AlternativeFlow__Group_4__14925);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2445:1: rule__AlternativeFlow__Group_4__1__Impl : ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) ) ;
	public final void rule__AlternativeFlow__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2449:1: ( ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2450:1: ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2450:1: ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2451:1: ( rule__AlternativeFlow__FinalStateAssignment_4_1 )
			{
			 before(grammarAccess.getAlternativeFlowAccess().getFinalStateAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2452:2: ( rule__AlternativeFlow__FinalStateAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2452:2: rule__AlternativeFlow__FinalStateAssignment_4_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlow__FinalStateAssignment_4_1_in_rule__AlternativeFlow__Group_4__1__Impl4952);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2466:1: rule__ParallelFlow__Group__0 : rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1 ;
	public final void rule__ParallelFlow__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2470:2: ( rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2471:2: rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__0__Impl_in_rule__ParallelFlow__Group__04986);
			rule__ParallelFlow__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__1_in_rule__ParallelFlow__Group__04989);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2478:1: rule__ParallelFlow__Group__0__Impl : ( 'parallel flow' ) ;
	public final void rule__ParallelFlow__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2482:1: ( ( 'parallel flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2483:1: ( 'parallel flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2483:1: ( 'parallel flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2484:1: 'parallel flow'
			{
			 before(grammarAccess.getParallelFlowAccess().getParallelFlowKeyword_0()); 
			match(input,34,FOLLOW_34_in_rule__ParallelFlow__Group__0__Impl5017); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2497:1: rule__ParallelFlow__Group__1 : rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2 ;
	public final void rule__ParallelFlow__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2501:2: ( rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2502:2: rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__1__Impl_in_rule__ParallelFlow__Group__15048);
			rule__ParallelFlow__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__2_in_rule__ParallelFlow__Group__15051);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2509:1: rule__ParallelFlow__Group__1__Impl : ( ( rule__ParallelFlow__NameAssignment_1 ) ) ;
	public final void rule__ParallelFlow__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2513:1: ( ( ( rule__ParallelFlow__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2514:1: ( ( rule__ParallelFlow__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2514:1: ( ( rule__ParallelFlow__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2515:1: ( rule__ParallelFlow__NameAssignment_1 )
			{
			 before(grammarAccess.getParallelFlowAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2516:2: ( rule__ParallelFlow__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2516:2: rule__ParallelFlow__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__NameAssignment_1_in_rule__ParallelFlow__Group__1__Impl5078);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2526:1: rule__ParallelFlow__Group__2 : rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3 ;
	public final void rule__ParallelFlow__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2530:2: ( rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2531:2: rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__2__Impl_in_rule__ParallelFlow__Group__25108);
			rule__ParallelFlow__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__3_in_rule__ParallelFlow__Group__25111);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2538:1: rule__ParallelFlow__Group__2__Impl : ( ( rule__ParallelFlow__StepsAssignment_2 )* ) ;
	public final void rule__ParallelFlow__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2542:1: ( ( ( rule__ParallelFlow__StepsAssignment_2 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2543:1: ( ( rule__ParallelFlow__StepsAssignment_2 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2543:1: ( ( rule__ParallelFlow__StepsAssignment_2 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2544:1: ( rule__ParallelFlow__StepsAssignment_2 )*
			{
			 before(grammarAccess.getParallelFlowAccess().getStepsAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2545:2: ( rule__ParallelFlow__StepsAssignment_2 )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==35||LA25_0==40) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2545:2: rule__ParallelFlow__StepsAssignment_2
					{
					pushFollow(FOLLOW_rule__ParallelFlow__StepsAssignment_2_in_rule__ParallelFlow__Group__2__Impl5138);
					rule__ParallelFlow__StepsAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop25;
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2555:1: rule__ParallelFlow__Group__3 : rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4 ;
	public final void rule__ParallelFlow__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2559:2: ( rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2560:2: rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__3__Impl_in_rule__ParallelFlow__Group__35169);
			rule__ParallelFlow__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group__4_in_rule__ParallelFlow__Group__35172);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2567:1: rule__ParallelFlow__Group__3__Impl : ( 'end flow' ) ;
	public final void rule__ParallelFlow__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2571:1: ( ( 'end flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2572:1: ( 'end flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2572:1: ( 'end flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2573:1: 'end flow'
			{
			 before(grammarAccess.getParallelFlowAccess().getEndFlowKeyword_3()); 
			match(input,21,FOLLOW_21_in_rule__ParallelFlow__Group__3__Impl5200); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2586:1: rule__ParallelFlow__Group__4 : rule__ParallelFlow__Group__4__Impl ;
	public final void rule__ParallelFlow__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2590:2: ( rule__ParallelFlow__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2591:2: rule__ParallelFlow__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group__4__Impl_in_rule__ParallelFlow__Group__45231);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2597:1: rule__ParallelFlow__Group__4__Impl : ( ( rule__ParallelFlow__Group_4__0 )? ) ;
	public final void rule__ParallelFlow__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2601:1: ( ( ( rule__ParallelFlow__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2602:1: ( ( rule__ParallelFlow__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2602:1: ( ( rule__ParallelFlow__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2603:1: ( rule__ParallelFlow__Group_4__0 )?
			{
			 before(grammarAccess.getParallelFlowAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2604:2: ( rule__ParallelFlow__Group_4__0 )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==45) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2604:2: rule__ParallelFlow__Group_4__0
					{
					pushFollow(FOLLOW_rule__ParallelFlow__Group_4__0_in_rule__ParallelFlow__Group__4__Impl5258);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2624:1: rule__ParallelFlow__Group_4__0 : rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1 ;
	public final void rule__ParallelFlow__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2628:2: ( rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2629:2: rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group_4__0__Impl_in_rule__ParallelFlow__Group_4__05299);
			rule__ParallelFlow__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelFlow__Group_4__1_in_rule__ParallelFlow__Group_4__05302);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2636:1: rule__ParallelFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
	public final void rule__ParallelFlow__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2640:1: ( ( 'with postcondition' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2641:1: ( 'with postcondition' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2641:1: ( 'with postcondition' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2642:1: 'with postcondition'
			{
			 before(grammarAccess.getParallelFlowAccess().getWithPostconditionKeyword_4_0()); 
			match(input,45,FOLLOW_45_in_rule__ParallelFlow__Group_4__0__Impl5330); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2655:1: rule__ParallelFlow__Group_4__1 : rule__ParallelFlow__Group_4__1__Impl ;
	public final void rule__ParallelFlow__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2659:2: ( rule__ParallelFlow__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2660:2: rule__ParallelFlow__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__ParallelFlow__Group_4__1__Impl_in_rule__ParallelFlow__Group_4__15361);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2666:1: rule__ParallelFlow__Group_4__1__Impl : ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) ) ;
	public final void rule__ParallelFlow__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2670:1: ( ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2671:1: ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2671:1: ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2672:1: ( rule__ParallelFlow__FinalStateAssignment_4_1 )
			{
			 before(grammarAccess.getParallelFlowAccess().getFinalStateAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2673:2: ( rule__ParallelFlow__FinalStateAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2673:2: rule__ParallelFlow__FinalStateAssignment_4_1
			{
			pushFollow(FOLLOW_rule__ParallelFlow__FinalStateAssignment_4_1_in_rule__ParallelFlow__Group_4__1__Impl5388);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2687:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
	public final void rule__Condition__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2691:2: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2692:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
			{
			pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05422);
			rule__Condition__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05425);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2699:1: rule__Condition__Group__0__Impl : ( 'if' ) ;
	public final void rule__Condition__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2703:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2704:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2704:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2705:1: 'if'
			{
			 before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
			match(input,26,FOLLOW_26_in_rule__Condition__Group__0__Impl5453); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2718:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
	public final void rule__Condition__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2722:2: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2723:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
			{
			pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15484);
			rule__Condition__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__15487);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2730:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ConditionAssignment_1 ) ) ;
	public final void rule__Condition__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2734:1: ( ( ( rule__Condition__ConditionAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2735:1: ( ( rule__Condition__ConditionAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2735:1: ( ( rule__Condition__ConditionAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2736:1: ( rule__Condition__ConditionAssignment_1 )
			{
			 before(grammarAccess.getConditionAccess().getConditionAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2737:2: ( rule__Condition__ConditionAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2737:2: rule__Condition__ConditionAssignment_1
			{
			pushFollow(FOLLOW_rule__Condition__ConditionAssignment_1_in_rule__Condition__Group__1__Impl5514);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2747:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
	public final void rule__Condition__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2751:2: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2752:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
			{
			pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__25544);
			rule__Condition__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__25547);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2759:1: rule__Condition__Group__2__Impl : ( 'then' ) ;
	public final void rule__Condition__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2763:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2764:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2764:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2765:1: 'then'
			{
			 before(grammarAccess.getConditionAccess().getThenKeyword_2()); 
			match(input,42,FOLLOW_42_in_rule__Condition__Group__2__Impl5575); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2778:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
	public final void rule__Condition__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2782:2: ( rule__Condition__Group__3__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2783:2: rule__Condition__Group__3__Impl
			{
			pushFollow(FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__35606);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2789:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__Group_3__0 )? ) ;
	public final void rule__Condition__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2793:1: ( ( ( rule__Condition__Group_3__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2794:1: ( ( rule__Condition__Group_3__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2794:1: ( ( rule__Condition__Group_3__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2795:1: ( rule__Condition__Group_3__0 )?
			{
			 before(grammarAccess.getConditionAccess().getGroup_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2796:2: ( rule__Condition__Group_3__0 )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==19) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2796:2: rule__Condition__Group_3__0
					{
					pushFollow(FOLLOW_rule__Condition__Group_3__0_in_rule__Condition__Group__3__Impl5633);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2814:1: rule__Condition__Group_3__0 : rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 ;
	public final void rule__Condition__Group_3__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2818:2: ( rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2819:2: rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1
			{
			pushFollow(FOLLOW_rule__Condition__Group_3__0__Impl_in_rule__Condition__Group_3__05672);
			rule__Condition__Group_3__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__Condition__Group_3__1_in_rule__Condition__Group_3__05675);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2826:1: rule__Condition__Group_3__0__Impl : ( 'continue with step' ) ;
	public final void rule__Condition__Group_3__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2830:1: ( ( 'continue with step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2831:1: ( 'continue with step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2831:1: ( 'continue with step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2832:1: 'continue with step'
			{
			 before(grammarAccess.getConditionAccess().getContinueWithStepKeyword_3_0()); 
			match(input,19,FOLLOW_19_in_rule__Condition__Group_3__0__Impl5703); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2845:1: rule__Condition__Group_3__1 : rule__Condition__Group_3__1__Impl ;
	public final void rule__Condition__Group_3__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2849:2: ( rule__Condition__Group_3__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2850:2: rule__Condition__Group_3__1__Impl
			{
			pushFollow(FOLLOW_rule__Condition__Group_3__1__Impl_in_rule__Condition__Group_3__15734);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2856:1: rule__Condition__Group_3__1__Impl : ( ( rule__Condition__ContinuationAssignment_3_1 ) ) ;
	public final void rule__Condition__Group_3__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2860:1: ( ( ( rule__Condition__ContinuationAssignment_3_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2861:1: ( ( rule__Condition__ContinuationAssignment_3_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2861:1: ( ( rule__Condition__ContinuationAssignment_3_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2862:1: ( rule__Condition__ContinuationAssignment_3_1 )
			{
			 before(grammarAccess.getConditionAccess().getContinuationAssignment_3_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2863:2: ( rule__Condition__ContinuationAssignment_3_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2863:2: rule__Condition__ContinuationAssignment_3_1
			{
			pushFollow(FOLLOW_rule__Condition__ContinuationAssignment_3_1_in_rule__Condition__Group_3__1__Impl5761);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2877:1: rule__LocalAlternative__Group__0 : rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1 ;
	public final void rule__LocalAlternative__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2881:2: ( rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2882:2: rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__0__Impl_in_rule__LocalAlternative__Group__05795);
			rule__LocalAlternative__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__1_in_rule__LocalAlternative__Group__05798);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2889:1: rule__LocalAlternative__Group__0__Impl : ( 'if' ) ;
	public final void rule__LocalAlternative__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2893:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2894:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2894:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2895:1: 'if'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getIfKeyword_0()); 
			match(input,26,FOLLOW_26_in_rule__LocalAlternative__Group__0__Impl5826); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2908:1: rule__LocalAlternative__Group__1 : rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2 ;
	public final void rule__LocalAlternative__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2912:2: ( rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2913:2: rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__1__Impl_in_rule__LocalAlternative__Group__15857);
			rule__LocalAlternative__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__2_in_rule__LocalAlternative__Group__15860);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2920:1: rule__LocalAlternative__Group__1__Impl : ( ( rule__LocalAlternative__ConditionAssignment_1 ) ) ;
	public final void rule__LocalAlternative__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2924:1: ( ( ( rule__LocalAlternative__ConditionAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2925:1: ( ( rule__LocalAlternative__ConditionAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2925:1: ( ( rule__LocalAlternative__ConditionAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2926:1: ( rule__LocalAlternative__ConditionAssignment_1 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getConditionAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2927:2: ( rule__LocalAlternative__ConditionAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2927:2: rule__LocalAlternative__ConditionAssignment_1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__ConditionAssignment_1_in_rule__LocalAlternative__Group__1__Impl5887);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2937:1: rule__LocalAlternative__Group__2 : rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3 ;
	public final void rule__LocalAlternative__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2941:2: ( rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2942:2: rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__2__Impl_in_rule__LocalAlternative__Group__25917);
			rule__LocalAlternative__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__3_in_rule__LocalAlternative__Group__25920);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2949:1: rule__LocalAlternative__Group__2__Impl : ( 'then' ) ;
	public final void rule__LocalAlternative__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2953:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2954:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2954:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2955:1: 'then'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getThenKeyword_2()); 
			match(input,42,FOLLOW_42_in_rule__LocalAlternative__Group__2__Impl5948); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2968:1: rule__LocalAlternative__Group__3 : rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4 ;
	public final void rule__LocalAlternative__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2972:2: ( rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2973:2: rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__3__Impl_in_rule__LocalAlternative__Group__35979);
			rule__LocalAlternative__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group__4_in_rule__LocalAlternative__Group__35982);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2980:1: rule__LocalAlternative__Group__3__Impl : ( ( rule__LocalAlternative__Alternatives_3 ) ) ;
	public final void rule__LocalAlternative__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2984:1: ( ( ( rule__LocalAlternative__Alternatives_3 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2985:1: ( ( rule__LocalAlternative__Alternatives_3 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2985:1: ( ( rule__LocalAlternative__Alternatives_3 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2986:1: ( rule__LocalAlternative__Alternatives_3 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getAlternatives_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2987:2: ( rule__LocalAlternative__Alternatives_3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2987:2: rule__LocalAlternative__Alternatives_3
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Alternatives_3_in_rule__LocalAlternative__Group__3__Impl6009);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2997:1: rule__LocalAlternative__Group__4 : rule__LocalAlternative__Group__4__Impl ;
	public final void rule__LocalAlternative__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3001:2: ( rule__LocalAlternative__Group__4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3002:2: rule__LocalAlternative__Group__4__Impl
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group__4__Impl_in_rule__LocalAlternative__Group__46039);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3008:1: rule__LocalAlternative__Group__4__Impl : ( ( rule__LocalAlternative__Group_4__0 )? ) ;
	public final void rule__LocalAlternative__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3012:1: ( ( ( rule__LocalAlternative__Group_4__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3013:1: ( ( rule__LocalAlternative__Group_4__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3013:1: ( ( rule__LocalAlternative__Group_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3014:1: ( rule__LocalAlternative__Group_4__0 )?
			{
			 before(grammarAccess.getLocalAlternativeAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3015:2: ( rule__LocalAlternative__Group_4__0 )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==19) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3015:2: rule__LocalAlternative__Group_4__0
					{
					pushFollow(FOLLOW_rule__LocalAlternative__Group_4__0_in_rule__LocalAlternative__Group__4__Impl6066);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3035:1: rule__LocalAlternative__Group_3_1__0 : rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1 ;
	public final void rule__LocalAlternative__Group_3_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3039:2: ( rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3040:2: rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__0__Impl_in_rule__LocalAlternative__Group_3_1__06107);
			rule__LocalAlternative__Group_3_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__1_in_rule__LocalAlternative__Group_3_1__06110);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3047:1: rule__LocalAlternative__Group_3_1__0__Impl : ( 'invoke usecase' ) ;
	public final void rule__LocalAlternative__Group_3_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3051:1: ( ( 'invoke usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3052:1: ( 'invoke usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3052:1: ( 'invoke usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3053:1: 'invoke usecase'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokeUsecaseKeyword_3_1_0()); 
			match(input,28,FOLLOW_28_in_rule__LocalAlternative__Group_3_1__0__Impl6138); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3066:1: rule__LocalAlternative__Group_3_1__1 : rule__LocalAlternative__Group_3_1__1__Impl ;
	public final void rule__LocalAlternative__Group_3_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3070:2: ( rule__LocalAlternative__Group_3_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3071:2: rule__LocalAlternative__Group_3_1__1__Impl
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__1__Impl_in_rule__LocalAlternative__Group_3_1__16169);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3077:1: rule__LocalAlternative__Group_3_1__1__Impl : ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) ) ;
	public final void rule__LocalAlternative__Group_3_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3081:1: ( ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3082:1: ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3082:1: ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3083:1: ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseAssignment_3_1_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3084:2: ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3084:2: rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1_in_rule__LocalAlternative__Group_3_1__1__Impl6196);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3098:1: rule__LocalAlternative__Group_4__0 : rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1 ;
	public final void rule__LocalAlternative__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3102:2: ( rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3103:2: rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_4__0__Impl_in_rule__LocalAlternative__Group_4__06230);
			rule__LocalAlternative__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__LocalAlternative__Group_4__1_in_rule__LocalAlternative__Group_4__06233);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3110:1: rule__LocalAlternative__Group_4__0__Impl : ( 'continue with step' ) ;
	public final void rule__LocalAlternative__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3114:1: ( ( 'continue with step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3115:1: ( 'continue with step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3115:1: ( 'continue with step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3116:1: 'continue with step'
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinueWithStepKeyword_4_0()); 
			match(input,19,FOLLOW_19_in_rule__LocalAlternative__Group_4__0__Impl6261); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3129:1: rule__LocalAlternative__Group_4__1 : rule__LocalAlternative__Group_4__1__Impl ;
	public final void rule__LocalAlternative__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3133:2: ( rule__LocalAlternative__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3134:2: rule__LocalAlternative__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__LocalAlternative__Group_4__1__Impl_in_rule__LocalAlternative__Group_4__16292);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3140:1: rule__LocalAlternative__Group_4__1__Impl : ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) ) ;
	public final void rule__LocalAlternative__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3144:1: ( ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3145:1: ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3145:1: ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3146:1: ( rule__LocalAlternative__ContinuationAssignment_4_1 )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinuationAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3147:2: ( rule__LocalAlternative__ContinuationAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3147:2: rule__LocalAlternative__ContinuationAssignment_4_1
			{
			pushFollow(FOLLOW_rule__LocalAlternative__ContinuationAssignment_4_1_in_rule__LocalAlternative__Group_4__1__Impl6319);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3161:1: rule__AlternativeFlowAlternative__Group__0 : rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1 ;
	public final void rule__AlternativeFlowAlternative__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3165:2: ( rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3166:2: rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__0__Impl_in_rule__AlternativeFlowAlternative__Group__06353);
			rule__AlternativeFlowAlternative__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__1_in_rule__AlternativeFlowAlternative__Group__06356);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3173:1: rule__AlternativeFlowAlternative__Group__0__Impl : ( 'if' ) ;
	public final void rule__AlternativeFlowAlternative__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3177:1: ( ( 'if' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3178:1: ( 'if' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3178:1: ( 'if' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3179:1: 'if'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getIfKeyword_0()); 
			match(input,26,FOLLOW_26_in_rule__AlternativeFlowAlternative__Group__0__Impl6384); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3192:1: rule__AlternativeFlowAlternative__Group__1 : rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2 ;
	public final void rule__AlternativeFlowAlternative__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3196:2: ( rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3197:2: rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__1__Impl_in_rule__AlternativeFlowAlternative__Group__16415);
			rule__AlternativeFlowAlternative__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__2_in_rule__AlternativeFlowAlternative__Group__16418);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3204:1: rule__AlternativeFlowAlternative__Group__1__Impl : ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) ) ;
	public final void rule__AlternativeFlowAlternative__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3208:1: ( ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3209:1: ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3209:1: ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3210:1: ( rule__AlternativeFlowAlternative__ConditionAssignment_1 )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getConditionAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3211:2: ( rule__AlternativeFlowAlternative__ConditionAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3211:2: rule__AlternativeFlowAlternative__ConditionAssignment_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__ConditionAssignment_1_in_rule__AlternativeFlowAlternative__Group__1__Impl6445);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3221:1: rule__AlternativeFlowAlternative__Group__2 : rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3 ;
	public final void rule__AlternativeFlowAlternative__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3225:2: ( rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3226:2: rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__2__Impl_in_rule__AlternativeFlowAlternative__Group__26475);
			rule__AlternativeFlowAlternative__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__3_in_rule__AlternativeFlowAlternative__Group__26478);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3233:1: rule__AlternativeFlowAlternative__Group__2__Impl : ( 'then' ) ;
	public final void rule__AlternativeFlowAlternative__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3237:1: ( ( 'then' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3238:1: ( 'then' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3238:1: ( 'then' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3239:1: 'then'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getThenKeyword_2()); 
			match(input,42,FOLLOW_42_in_rule__AlternativeFlowAlternative__Group__2__Impl6506); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3252:1: rule__AlternativeFlowAlternative__Group__3 : rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4 ;
	public final void rule__AlternativeFlowAlternative__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3256:2: ( rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3257:2: rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__3__Impl_in_rule__AlternativeFlowAlternative__Group__36537);
			rule__AlternativeFlowAlternative__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__4_in_rule__AlternativeFlowAlternative__Group__36540);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3264:1: rule__AlternativeFlowAlternative__Group__3__Impl : ( 'alternative flow' ) ;
	public final void rule__AlternativeFlowAlternative__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3268:1: ( ( 'alternative flow' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3269:1: ( 'alternative flow' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3269:1: ( 'alternative flow' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3270:1: 'alternative flow'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getAlternativeFlowKeyword_3()); 
			match(input,14,FOLLOW_14_in_rule__AlternativeFlowAlternative__Group__3__Impl6568); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3283:1: rule__AlternativeFlowAlternative__Group__4 : rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5 ;
	public final void rule__AlternativeFlowAlternative__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3287:2: ( rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3288:2: rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__4__Impl_in_rule__AlternativeFlowAlternative__Group__46599);
			rule__AlternativeFlowAlternative__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__5_in_rule__AlternativeFlowAlternative__Group__46602);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3295:1: rule__AlternativeFlowAlternative__Group__4__Impl : ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) ) ;
	public final void rule__AlternativeFlowAlternative__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3299:1: ( ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3300:1: ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3300:1: ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3301:1: ( rule__AlternativeFlowAlternative__RefAssignment_4 )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefAssignment_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3302:2: ( rule__AlternativeFlowAlternative__RefAssignment_4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3302:2: rule__AlternativeFlowAlternative__RefAssignment_4
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__RefAssignment_4_in_rule__AlternativeFlowAlternative__Group__4__Impl6629);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3312:1: rule__AlternativeFlowAlternative__Group__5 : rule__AlternativeFlowAlternative__Group__5__Impl ;
	public final void rule__AlternativeFlowAlternative__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3316:2: ( rule__AlternativeFlowAlternative__Group__5__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3317:2: rule__AlternativeFlowAlternative__Group__5__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__5__Impl_in_rule__AlternativeFlowAlternative__Group__56659);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3323:1: rule__AlternativeFlowAlternative__Group__5__Impl : ( ( rule__AlternativeFlowAlternative__Group_5__0 )? ) ;
	public final void rule__AlternativeFlowAlternative__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3327:1: ( ( ( rule__AlternativeFlowAlternative__Group_5__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3328:1: ( ( rule__AlternativeFlowAlternative__Group_5__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3328:1: ( ( rule__AlternativeFlowAlternative__Group_5__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3329:1: ( rule__AlternativeFlowAlternative__Group_5__0 )?
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getGroup_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3330:2: ( rule__AlternativeFlowAlternative__Group_5__0 )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==19) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3330:2: rule__AlternativeFlowAlternative__Group_5__0
					{
					pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__0_in_rule__AlternativeFlowAlternative__Group__5__Impl6686);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3352:1: rule__AlternativeFlowAlternative__Group_5__0 : rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1 ;
	public final void rule__AlternativeFlowAlternative__Group_5__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3356:2: ( rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3357:2: rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__0__Impl_in_rule__AlternativeFlowAlternative__Group_5__06729);
			rule__AlternativeFlowAlternative__Group_5__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__1_in_rule__AlternativeFlowAlternative__Group_5__06732);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3364:1: rule__AlternativeFlowAlternative__Group_5__0__Impl : ( 'continue with step' ) ;
	public final void rule__AlternativeFlowAlternative__Group_5__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3368:1: ( ( 'continue with step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3369:1: ( 'continue with step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3369:1: ( 'continue with step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3370:1: 'continue with step'
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinueWithStepKeyword_5_0()); 
			match(input,19,FOLLOW_19_in_rule__AlternativeFlowAlternative__Group_5__0__Impl6760); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3383:1: rule__AlternativeFlowAlternative__Group_5__1 : rule__AlternativeFlowAlternative__Group_5__1__Impl ;
	public final void rule__AlternativeFlowAlternative__Group_5__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3387:2: ( rule__AlternativeFlowAlternative__Group_5__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3388:2: rule__AlternativeFlowAlternative__Group_5__1__Impl
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__1__Impl_in_rule__AlternativeFlowAlternative__Group_5__16791);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3394:1: rule__AlternativeFlowAlternative__Group_5__1__Impl : ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) ) ;
	public final void rule__AlternativeFlowAlternative__Group_5__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3398:1: ( ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3399:1: ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3399:1: ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3400:1: ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationAssignment_5_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3401:2: ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3401:2: rule__AlternativeFlowAlternative__ContinuationAssignment_5_1
			{
			pushFollow(FOLLOW_rule__AlternativeFlowAlternative__ContinuationAssignment_5_1_in_rule__AlternativeFlowAlternative__Group_5__1__Impl6818);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3415:1: rule__ParallelStep__Group__0 : rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1 ;
	public final void rule__ParallelStep__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3419:2: ( rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3420:2: rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__0__Impl_in_rule__ParallelStep__Group__06852);
			rule__ParallelStep__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__1_in_rule__ParallelStep__Group__06855);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3427:1: rule__ParallelStep__Group__0__Impl : ( 'parallel step' ) ;
	public final void rule__ParallelStep__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3431:1: ( ( 'parallel step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3432:1: ( 'parallel step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3432:1: ( 'parallel step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3433:1: 'parallel step'
			{
			 before(grammarAccess.getParallelStepAccess().getParallelStepKeyword_0()); 
			match(input,35,FOLLOW_35_in_rule__ParallelStep__Group__0__Impl6883); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3446:1: rule__ParallelStep__Group__1 : rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2 ;
	public final void rule__ParallelStep__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3450:2: ( rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3451:2: rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__1__Impl_in_rule__ParallelStep__Group__16914);
			rule__ParallelStep__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__2_in_rule__ParallelStep__Group__16917);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3458:1: rule__ParallelStep__Group__1__Impl : ( ( rule__ParallelStep__NameAssignment_1 ) ) ;
	public final void rule__ParallelStep__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3462:1: ( ( ( rule__ParallelStep__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3463:1: ( ( rule__ParallelStep__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3463:1: ( ( rule__ParallelStep__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3464:1: ( rule__ParallelStep__NameAssignment_1 )
			{
			 before(grammarAccess.getParallelStepAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3465:2: ( rule__ParallelStep__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3465:2: rule__ParallelStep__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__ParallelStep__NameAssignment_1_in_rule__ParallelStep__Group__1__Impl6944);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3475:1: rule__ParallelStep__Group__2 : rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3 ;
	public final void rule__ParallelStep__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3479:2: ( rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3480:2: rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__2__Impl_in_rule__ParallelStep__Group__26974);
			rule__ParallelStep__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__3_in_rule__ParallelStep__Group__26977);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3487:1: rule__ParallelStep__Group__2__Impl : ( ( rule__ParallelStep__LabelAssignment_2 )? ) ;
	public final void rule__ParallelStep__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3491:1: ( ( ( rule__ParallelStep__LabelAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3492:1: ( ( rule__ParallelStep__LabelAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3492:1: ( ( rule__ParallelStep__LabelAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3493:1: ( rule__ParallelStep__LabelAssignment_2 )?
			{
			 before(grammarAccess.getParallelStepAccess().getLabelAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3494:2: ( rule__ParallelStep__LabelAssignment_2 )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==RULE_STRING) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3494:2: rule__ParallelStep__LabelAssignment_2
					{
					pushFollow(FOLLOW_rule__ParallelStep__LabelAssignment_2_in_rule__ParallelStep__Group__2__Impl7004);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3504:1: rule__ParallelStep__Group__3 : rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4 ;
	public final void rule__ParallelStep__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3508:2: ( rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3509:2: rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__3__Impl_in_rule__ParallelStep__Group__37035);
			rule__ParallelStep__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__4_in_rule__ParallelStep__Group__37038);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3516:1: rule__ParallelStep__Group__3__Impl : ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) ) ;
	public final void rule__ParallelStep__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3520:1: ( ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3521:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3521:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3522:1: ( rule__ParallelStep__InvokedFlowsAssignment_3 )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsAssignment_3()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3523:2: ( rule__ParallelStep__InvokedFlowsAssignment_3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3523:2: rule__ParallelStep__InvokedFlowsAssignment_3
			{
			pushFollow(FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_3_in_rule__ParallelStep__Group__3__Impl7065);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3533:1: rule__ParallelStep__Group__4 : rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5 ;
	public final void rule__ParallelStep__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3537:2: ( rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3538:2: rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__4__Impl_in_rule__ParallelStep__Group__47095);
			rule__ParallelStep__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group__5_in_rule__ParallelStep__Group__47098);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3545:1: rule__ParallelStep__Group__4__Impl : ( ( rule__ParallelStep__Group_4__0 )* ) ;
	public final void rule__ParallelStep__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3549:1: ( ( ( rule__ParallelStep__Group_4__0 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3550:1: ( ( rule__ParallelStep__Group_4__0 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3550:1: ( ( rule__ParallelStep__Group_4__0 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3551:1: ( rule__ParallelStep__Group_4__0 )*
			{
			 before(grammarAccess.getParallelStepAccess().getGroup_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3552:2: ( rule__ParallelStep__Group_4__0 )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==11) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3552:2: rule__ParallelStep__Group_4__0
					{
					pushFollow(FOLLOW_rule__ParallelStep__Group_4__0_in_rule__ParallelStep__Group__4__Impl7125);
					rule__ParallelStep__Group_4__0();
					state._fsp--;

					}
					break;

				default :
					break loop31;
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3562:1: rule__ParallelStep__Group__5 : rule__ParallelStep__Group__5__Impl ;
	public final void rule__ParallelStep__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3566:2: ( rule__ParallelStep__Group__5__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3567:2: rule__ParallelStep__Group__5__Impl
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group__5__Impl_in_rule__ParallelStep__Group__57156);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3573:1: rule__ParallelStep__Group__5__Impl : ( ( rule__ParallelStep__Group_5__0 )? ) ;
	public final void rule__ParallelStep__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3577:1: ( ( ( rule__ParallelStep__Group_5__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3578:1: ( ( rule__ParallelStep__Group_5__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3578:1: ( ( rule__ParallelStep__Group_5__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3579:1: ( rule__ParallelStep__Group_5__0 )?
			{
			 before(grammarAccess.getParallelStepAccess().getGroup_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3580:2: ( rule__ParallelStep__Group_5__0 )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==30) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3580:2: rule__ParallelStep__Group_5__0
					{
					pushFollow(FOLLOW_rule__ParallelStep__Group_5__0_in_rule__ParallelStep__Group__5__Impl7183);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3602:1: rule__ParallelStep__Group_4__0 : rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1 ;
	public final void rule__ParallelStep__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3606:2: ( rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3607:2: rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_4__0__Impl_in_rule__ParallelStep__Group_4__07226);
			rule__ParallelStep__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group_4__1_in_rule__ParallelStep__Group_4__07229);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3614:1: rule__ParallelStep__Group_4__0__Impl : ( ',' ) ;
	public final void rule__ParallelStep__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3618:1: ( ( ',' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3619:1: ( ',' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3619:1: ( ',' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3620:1: ','
			{
			 before(grammarAccess.getParallelStepAccess().getCommaKeyword_4_0()); 
			match(input,11,FOLLOW_11_in_rule__ParallelStep__Group_4__0__Impl7257); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3633:1: rule__ParallelStep__Group_4__1 : rule__ParallelStep__Group_4__1__Impl ;
	public final void rule__ParallelStep__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3637:2: ( rule__ParallelStep__Group_4__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3638:2: rule__ParallelStep__Group_4__1__Impl
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_4__1__Impl_in_rule__ParallelStep__Group_4__17288);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3644:1: rule__ParallelStep__Group_4__1__Impl : ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) ) ;
	public final void rule__ParallelStep__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3648:1: ( ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3649:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3649:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3650:1: ( rule__ParallelStep__InvokedFlowsAssignment_4_1 )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsAssignment_4_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3651:2: ( rule__ParallelStep__InvokedFlowsAssignment_4_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3651:2: rule__ParallelStep__InvokedFlowsAssignment_4_1
			{
			pushFollow(FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_4_1_in_rule__ParallelStep__Group_4__1__Impl7315);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3665:1: rule__ParallelStep__Group_5__0 : rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1 ;
	public final void rule__ParallelStep__Group_5__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3669:2: ( rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3670:2: rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_5__0__Impl_in_rule__ParallelStep__Group_5__07349);
			rule__ParallelStep__Group_5__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__ParallelStep__Group_5__1_in_rule__ParallelStep__Group_5__07352);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3677:1: rule__ParallelStep__Group_5__0__Impl : ( 'next' ) ;
	public final void rule__ParallelStep__Group_5__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3681:1: ( ( 'next' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3682:1: ( 'next' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3682:1: ( 'next' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3683:1: 'next'
			{
			 before(grammarAccess.getParallelStepAccess().getNextKeyword_5_0()); 
			match(input,30,FOLLOW_30_in_rule__ParallelStep__Group_5__0__Impl7380); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3696:1: rule__ParallelStep__Group_5__1 : rule__ParallelStep__Group_5__1__Impl ;
	public final void rule__ParallelStep__Group_5__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3700:2: ( rule__ParallelStep__Group_5__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3701:2: rule__ParallelStep__Group_5__1__Impl
			{
			pushFollow(FOLLOW_rule__ParallelStep__Group_5__1__Impl_in_rule__ParallelStep__Group_5__17411);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3707:1: rule__ParallelStep__Group_5__1__Impl : ( ( rule__ParallelStep__NextAssignment_5_1 ) ) ;
	public final void rule__ParallelStep__Group_5__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3711:1: ( ( ( rule__ParallelStep__NextAssignment_5_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3712:1: ( ( rule__ParallelStep__NextAssignment_5_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3712:1: ( ( rule__ParallelStep__NextAssignment_5_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3713:1: ( rule__ParallelStep__NextAssignment_5_1 )
			{
			 before(grammarAccess.getParallelStepAccess().getNextAssignment_5_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3714:2: ( rule__ParallelStep__NextAssignment_5_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3714:2: rule__ParallelStep__NextAssignment_5_1
			{
			pushFollow(FOLLOW_rule__ParallelStep__NextAssignment_5_1_in_rule__ParallelStep__Group_5__1__Impl7438);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3728:1: rule__NormalStep__Group__0 : rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1 ;
	public final void rule__NormalStep__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3732:2: ( rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3733:2: rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__0__Impl_in_rule__NormalStep__Group__07472);
			rule__NormalStep__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__1_in_rule__NormalStep__Group__07475);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3740:1: rule__NormalStep__Group__0__Impl : ( 'step' ) ;
	public final void rule__NormalStep__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3744:1: ( ( 'step' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3745:1: ( 'step' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3745:1: ( 'step' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3746:1: 'step'
			{
			 before(grammarAccess.getNormalStepAccess().getStepKeyword_0()); 
			match(input,40,FOLLOW_40_in_rule__NormalStep__Group__0__Impl7503); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3759:1: rule__NormalStep__Group__1 : rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2 ;
	public final void rule__NormalStep__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3763:2: ( rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3764:2: rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__1__Impl_in_rule__NormalStep__Group__17534);
			rule__NormalStep__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__2_in_rule__NormalStep__Group__17537);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3771:1: rule__NormalStep__Group__1__Impl : ( ( rule__NormalStep__NameAssignment_1 ) ) ;
	public final void rule__NormalStep__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3775:1: ( ( ( rule__NormalStep__NameAssignment_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3776:1: ( ( rule__NormalStep__NameAssignment_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3776:1: ( ( rule__NormalStep__NameAssignment_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3777:1: ( rule__NormalStep__NameAssignment_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getNameAssignment_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3778:2: ( rule__NormalStep__NameAssignment_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3778:2: rule__NormalStep__NameAssignment_1
			{
			pushFollow(FOLLOW_rule__NormalStep__NameAssignment_1_in_rule__NormalStep__Group__1__Impl7564);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3788:1: rule__NormalStep__Group__2 : rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3 ;
	public final void rule__NormalStep__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3792:2: ( rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3793:2: rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__2__Impl_in_rule__NormalStep__Group__27594);
			rule__NormalStep__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__3_in_rule__NormalStep__Group__27597);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3800:1: rule__NormalStep__Group__2__Impl : ( ( rule__NormalStep__LabelAssignment_2 )? ) ;
	public final void rule__NormalStep__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3804:1: ( ( ( rule__NormalStep__LabelAssignment_2 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3805:1: ( ( rule__NormalStep__LabelAssignment_2 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3805:1: ( ( rule__NormalStep__LabelAssignment_2 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3806:1: ( rule__NormalStep__LabelAssignment_2 )?
			{
			 before(grammarAccess.getNormalStepAccess().getLabelAssignment_2()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3807:2: ( rule__NormalStep__LabelAssignment_2 )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==RULE_STRING) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3807:2: rule__NormalStep__LabelAssignment_2
					{
					pushFollow(FOLLOW_rule__NormalStep__LabelAssignment_2_in_rule__NormalStep__Group__2__Impl7624);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3817:1: rule__NormalStep__Group__3 : rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4 ;
	public final void rule__NormalStep__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3821:2: ( rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3822:2: rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__3__Impl_in_rule__NormalStep__Group__37655);
			rule__NormalStep__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__4_in_rule__NormalStep__Group__37658);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3829:1: rule__NormalStep__Group__3__Impl : ( 'by' ) ;
	public final void rule__NormalStep__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3833:1: ( ( 'by' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3834:1: ( 'by' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3834:1: ( 'by' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3835:1: 'by'
			{
			 before(grammarAccess.getNormalStepAccess().getByKeyword_3()); 
			match(input,18,FOLLOW_18_in_rule__NormalStep__Group__3__Impl7686); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3848:1: rule__NormalStep__Group__4 : rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5 ;
	public final void rule__NormalStep__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3852:2: ( rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3853:2: rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__4__Impl_in_rule__NormalStep__Group__47717);
			rule__NormalStep__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__5_in_rule__NormalStep__Group__47720);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3860:1: rule__NormalStep__Group__4__Impl : ( ( rule__NormalStep__ActorAssignment_4 ) ) ;
	public final void rule__NormalStep__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3864:1: ( ( ( rule__NormalStep__ActorAssignment_4 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3865:1: ( ( rule__NormalStep__ActorAssignment_4 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3865:1: ( ( rule__NormalStep__ActorAssignment_4 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3866:1: ( rule__NormalStep__ActorAssignment_4 )
			{
			 before(grammarAccess.getNormalStepAccess().getActorAssignment_4()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3867:2: ( rule__NormalStep__ActorAssignment_4 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3867:2: rule__NormalStep__ActorAssignment_4
			{
			pushFollow(FOLLOW_rule__NormalStep__ActorAssignment_4_in_rule__NormalStep__Group__4__Impl7747);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3877:1: rule__NormalStep__Group__5 : rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6 ;
	public final void rule__NormalStep__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3881:2: ( rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3882:2: rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__5__Impl_in_rule__NormalStep__Group__57777);
			rule__NormalStep__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__6_in_rule__NormalStep__Group__57780);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3889:1: rule__NormalStep__Group__5__Impl : ( ( rule__NormalStep__Group_5__0 )? ) ;
	public final void rule__NormalStep__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3893:1: ( ( ( rule__NormalStep__Group_5__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3894:1: ( ( rule__NormalStep__Group_5__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3894:1: ( ( rule__NormalStep__Group_5__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3895:1: ( rule__NormalStep__Group_5__0 )?
			{
			 before(grammarAccess.getNormalStepAccess().getGroup_5()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3896:2: ( rule__NormalStep__Group_5__0 )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==43) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3896:2: rule__NormalStep__Group_5__0
					{
					pushFollow(FOLLOW_rule__NormalStep__Group_5__0_in_rule__NormalStep__Group__5__Impl7807);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3906:1: rule__NormalStep__Group__6 : rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7 ;
	public final void rule__NormalStep__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3910:2: ( rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3911:2: rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__6__Impl_in_rule__NormalStep__Group__67838);
			rule__NormalStep__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group__7_in_rule__NormalStep__Group__67841);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3918:1: rule__NormalStep__Group__6__Impl : ( ( rule__NormalStep__Alternatives_6 )? ) ;
	public final void rule__NormalStep__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3922:1: ( ( ( rule__NormalStep__Alternatives_6 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3923:1: ( ( rule__NormalStep__Alternatives_6 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3923:1: ( ( rule__NormalStep__Alternatives_6 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3924:1: ( rule__NormalStep__Alternatives_6 )?
			{
			 before(grammarAccess.getNormalStepAccess().getAlternatives_6()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3925:2: ( rule__NormalStep__Alternatives_6 )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==15||LA35_0==28) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3925:2: rule__NormalStep__Alternatives_6
					{
					pushFollow(FOLLOW_rule__NormalStep__Alternatives_6_in_rule__NormalStep__Group__6__Impl7868);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3935:1: rule__NormalStep__Group__7 : rule__NormalStep__Group__7__Impl ;
	public final void rule__NormalStep__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3939:2: ( rule__NormalStep__Group__7__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3940:2: rule__NormalStep__Group__7__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group__7__Impl_in_rule__NormalStep__Group__77899);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3946:1: rule__NormalStep__Group__7__Impl : ( ( rule__NormalStep__Group_7__0 )? ) ;
	public final void rule__NormalStep__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3950:1: ( ( ( rule__NormalStep__Group_7__0 )? ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3951:1: ( ( rule__NormalStep__Group_7__0 )? )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3951:1: ( ( rule__NormalStep__Group_7__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3952:1: ( rule__NormalStep__Group_7__0 )?
			{
			 before(grammarAccess.getNormalStepAccess().getGroup_7()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3953:2: ( rule__NormalStep__Group_7__0 )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==30) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3953:2: rule__NormalStep__Group_7__0
					{
					pushFollow(FOLLOW_rule__NormalStep__Group_7__0_in_rule__NormalStep__Group__7__Impl7926);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3979:1: rule__NormalStep__Group_5__0 : rule__NormalStep__Group_5__0__Impl rule__NormalStep__Group_5__1 ;
	public final void rule__NormalStep__Group_5__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3983:2: ( rule__NormalStep__Group_5__0__Impl rule__NormalStep__Group_5__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3984:2: rule__NormalStep__Group_5__0__Impl rule__NormalStep__Group_5__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_5__0__Impl_in_rule__NormalStep__Group_5__07973);
			rule__NormalStep__Group_5__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_5__1_in_rule__NormalStep__Group_5__07976);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3991:1: rule__NormalStep__Group_5__0__Impl : ( 'type' ) ;
	public final void rule__NormalStep__Group_5__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3995:1: ( ( 'type' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3996:1: ( 'type' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3996:1: ( 'type' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3997:1: 'type'
			{
			 before(grammarAccess.getNormalStepAccess().getTypeKeyword_5_0()); 
			match(input,43,FOLLOW_43_in_rule__NormalStep__Group_5__0__Impl8004); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4010:1: rule__NormalStep__Group_5__1 : rule__NormalStep__Group_5__1__Impl ;
	public final void rule__NormalStep__Group_5__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4014:2: ( rule__NormalStep__Group_5__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4015:2: rule__NormalStep__Group_5__1__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_5__1__Impl_in_rule__NormalStep__Group_5__18035);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4021:1: rule__NormalStep__Group_5__1__Impl : ( ( rule__NormalStep__CustomStepTypeAssignment_5_1 ) ) ;
	public final void rule__NormalStep__Group_5__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4025:1: ( ( ( rule__NormalStep__CustomStepTypeAssignment_5_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4026:1: ( ( rule__NormalStep__CustomStepTypeAssignment_5_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4026:1: ( ( rule__NormalStep__CustomStepTypeAssignment_5_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4027:1: ( rule__NormalStep__CustomStepTypeAssignment_5_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getCustomStepTypeAssignment_5_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4028:2: ( rule__NormalStep__CustomStepTypeAssignment_5_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4028:2: rule__NormalStep__CustomStepTypeAssignment_5_1
			{
			pushFollow(FOLLOW_rule__NormalStep__CustomStepTypeAssignment_5_1_in_rule__NormalStep__Group_5__1__Impl8062);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4042:1: rule__NormalStep__Group_6_0__0 : rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1 ;
	public final void rule__NormalStep__Group_6_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4046:2: ( rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4047:2: rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__0__Impl_in_rule__NormalStep__Group_6_0__08096);
			rule__NormalStep__Group_6_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__1_in_rule__NormalStep__Group_6_0__08099);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4054:1: rule__NormalStep__Group_6_0__0__Impl : ( 'alternatives' ) ;
	public final void rule__NormalStep__Group_6_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4058:1: ( ( 'alternatives' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4059:1: ( 'alternatives' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4059:1: ( 'alternatives' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4060:1: 'alternatives'
			{
			 before(grammarAccess.getNormalStepAccess().getAlternativesKeyword_6_0_0()); 
			match(input,15,FOLLOW_15_in_rule__NormalStep__Group_6_0__0__Impl8127); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4073:1: rule__NormalStep__Group_6_0__1 : rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2 ;
	public final void rule__NormalStep__Group_6_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4077:2: ( rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4078:2: rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__1__Impl_in_rule__NormalStep__Group_6_0__18158);
			rule__NormalStep__Group_6_0__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__2_in_rule__NormalStep__Group_6_0__18161);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4085:1: rule__NormalStep__Group_6_0__1__Impl : ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) ) ;
	public final void rule__NormalStep__Group_6_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4089:1: ( ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4090:1: ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4090:1: ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4091:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4091:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4092:1: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4093:2: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4093:2: rule__NormalStep__StepAlternativeAssignment_6_0_1
			{
			pushFollow(FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8190);
			rule__NormalStep__StepAlternativeAssignment_6_0_1();
			state._fsp--;

			}

			 after(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
			}

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4096:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4097:1: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )*
			{
			 before(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4098:2: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==26) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4098:2: rule__NormalStep__StepAlternativeAssignment_6_0_1
					{
					pushFollow(FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8202);
					rule__NormalStep__StepAlternativeAssignment_6_0_1();
					state._fsp--;

					}
					break;

				default :
					break loop37;
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4109:1: rule__NormalStep__Group_6_0__2 : rule__NormalStep__Group_6_0__2__Impl ;
	public final void rule__NormalStep__Group_6_0__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4113:2: ( rule__NormalStep__Group_6_0__2__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4114:2: rule__NormalStep__Group_6_0__2__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_0__2__Impl_in_rule__NormalStep__Group_6_0__28235);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4120:1: rule__NormalStep__Group_6_0__2__Impl : ( 'else' ) ;
	public final void rule__NormalStep__Group_6_0__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4124:1: ( ( 'else' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4125:1: ( 'else' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4125:1: ( 'else' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4126:1: 'else'
			{
			 before(grammarAccess.getNormalStepAccess().getElseKeyword_6_0_2()); 
			match(input,20,FOLLOW_20_in_rule__NormalStep__Group_6_0__2__Impl8263); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4145:1: rule__NormalStep__Group_6_1__0 : rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1 ;
	public final void rule__NormalStep__Group_6_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4149:2: ( rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4150:2: rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_1__0__Impl_in_rule__NormalStep__Group_6_1__08300);
			rule__NormalStep__Group_6_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_6_1__1_in_rule__NormalStep__Group_6_1__08303);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4157:1: rule__NormalStep__Group_6_1__0__Impl : ( 'invoke usecase' ) ;
	public final void rule__NormalStep__Group_6_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4161:1: ( ( 'invoke usecase' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4162:1: ( 'invoke usecase' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4162:1: ( 'invoke usecase' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4163:1: 'invoke usecase'
			{
			 before(grammarAccess.getNormalStepAccess().getInvokeUsecaseKeyword_6_1_0()); 
			match(input,28,FOLLOW_28_in_rule__NormalStep__Group_6_1__0__Impl8331); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4176:1: rule__NormalStep__Group_6_1__1 : rule__NormalStep__Group_6_1__1__Impl ;
	public final void rule__NormalStep__Group_6_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4180:2: ( rule__NormalStep__Group_6_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4181:2: rule__NormalStep__Group_6_1__1__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_6_1__1__Impl_in_rule__NormalStep__Group_6_1__18362);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4187:1: rule__NormalStep__Group_6_1__1__Impl : ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) ) ;
	public final void rule__NormalStep__Group_6_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4191:1: ( ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4192:1: ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4192:1: ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4193:1: ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getInvokedUseCaseAssignment_6_1_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4194:2: ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4194:2: rule__NormalStep__InvokedUseCaseAssignment_6_1_1
			{
			pushFollow(FOLLOW_rule__NormalStep__InvokedUseCaseAssignment_6_1_1_in_rule__NormalStep__Group_6_1__1__Impl8389);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4208:1: rule__NormalStep__Group_7__0 : rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1 ;
	public final void rule__NormalStep__Group_7__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4212:2: ( rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4213:2: rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_7__0__Impl_in_rule__NormalStep__Group_7__08423);
			rule__NormalStep__Group_7__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__NormalStep__Group_7__1_in_rule__NormalStep__Group_7__08426);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4220:1: rule__NormalStep__Group_7__0__Impl : ( 'next' ) ;
	public final void rule__NormalStep__Group_7__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4224:1: ( ( 'next' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4225:1: ( 'next' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4225:1: ( 'next' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4226:1: 'next'
			{
			 before(grammarAccess.getNormalStepAccess().getNextKeyword_7_0()); 
			match(input,30,FOLLOW_30_in_rule__NormalStep__Group_7__0__Impl8454); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4239:1: rule__NormalStep__Group_7__1 : rule__NormalStep__Group_7__1__Impl ;
	public final void rule__NormalStep__Group_7__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4243:2: ( rule__NormalStep__Group_7__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4244:2: rule__NormalStep__Group_7__1__Impl
			{
			pushFollow(FOLLOW_rule__NormalStep__Group_7__1__Impl_in_rule__NormalStep__Group_7__18485);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4250:1: rule__NormalStep__Group_7__1__Impl : ( ( rule__NormalStep__NextAssignment_7_1 ) ) ;
	public final void rule__NormalStep__Group_7__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4254:1: ( ( ( rule__NormalStep__NextAssignment_7_1 ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4255:1: ( ( rule__NormalStep__NextAssignment_7_1 ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4255:1: ( ( rule__NormalStep__NextAssignment_7_1 ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4256:1: ( rule__NormalStep__NextAssignment_7_1 )
			{
			 before(grammarAccess.getNormalStepAccess().getNextAssignment_7_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4257:2: ( rule__NormalStep__NextAssignment_7_1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4257:2: rule__NormalStep__NextAssignment_7_1
			{
			pushFollow(FOLLOW_rule__NormalStep__NextAssignment_7_1_in_rule__NormalStep__Group_7__1__Impl8512);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4271:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
	public final void rule__QualifiedName__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4275:2: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4276:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08546);
			rule__QualifiedName__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08549);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4283:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
	public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4287:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4288:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4288:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4289:1: RULE_ID
			{
			 before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8576); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4300:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
	public final void rule__QualifiedName__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4304:2: ( rule__QualifiedName__Group__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4305:2: rule__QualifiedName__Group__1__Impl
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18605);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4311:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
	public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4315:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4316:1: ( ( rule__QualifiedName__Group_1__0 )* )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4316:1: ( ( rule__QualifiedName__Group_1__0 )* )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4317:1: ( rule__QualifiedName__Group_1__0 )*
			{
			 before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4318:2: ( rule__QualifiedName__Group_1__0 )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==12) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4318:2: rule__QualifiedName__Group_1__0
					{
					pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8632);
					rule__QualifiedName__Group_1__0();
					state._fsp--;

					}
					break;

				default :
					break loop38;
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4332:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
	public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4336:2: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4337:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08667);
			rule__QualifiedName__Group_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08670);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4344:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
	public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4348:1: ( ( '.' ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4349:1: ( '.' )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4349:1: ( '.' )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4350:1: '.'
			{
			 before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
			match(input,12,FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl8698); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4363:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
	public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4367:2: ( rule__QualifiedName__Group_1__1__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4368:2: rule__QualifiedName__Group_1__1__Impl
			{
			pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18729);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4374:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
	public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4378:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4379:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4379:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4380:1: RULE_ID
			{
			 before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8756); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4396:1: rule__UseCase__UnorderedGroup_4 : ( rule__UseCase__UnorderedGroup_4__0 )? ;
	public final void rule__UseCase__UnorderedGroup_4() throws RecognitionException {

		    	int stackSize = keepStackSize();
				getUnorderedGroupHelper().enter(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4401:2: ( ( rule__UseCase__UnorderedGroup_4__0 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4402:2: ( rule__UseCase__UnorderedGroup_4__0 )?
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4402:2: ( rule__UseCase__UnorderedGroup_4__0 )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( LA39_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
				alt39=1;
			}
			else if ( LA39_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4402:2: rule__UseCase__UnorderedGroup_4__0
					{
					pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__0_in_rule__UseCase__UnorderedGroup_48790);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4412:1: rule__UseCase__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) ) ;
	public final void rule__UseCase__UnorderedGroup_4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
				boolean selected = false;
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4417:3: ( ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4418:3: ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4418:3: ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( LA40_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
				alt40=1;
			}
			else if ( LA40_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
				alt40=2;
			}

			switch (alt40) {
				case 1 :
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4420:4: ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4420:4: ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4421:5: {...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) )
					{
					if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
						throw new FailedPredicateException(input, "rule__UseCase__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0)");
					}
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4421:104: ( ( ( rule__UseCase__Group_4_0__0 ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4422:6: ( ( rule__UseCase__Group_4_0__0 ) )
					{
					 
						 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0);
						 				

						 				  selected = true;
						 				
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4428:6: ( ( rule__UseCase__Group_4_0__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4430:7: ( rule__UseCase__Group_4_0__0 )
					{
					 before(grammarAccess.getUseCaseAccess().getGroup_4_0()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4431:7: ( rule__UseCase__Group_4_0__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4431:8: rule__UseCase__Group_4_0__0
					{
					pushFollow(FOLLOW_rule__UseCase__Group_4_0__0_in_rule__UseCase__UnorderedGroup_4__Impl8877);
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
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4437:4: ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) )
					{
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4437:4: ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4438:5: {...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) )
					{
					if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
						throw new FailedPredicateException(input, "rule__UseCase__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1)");
					}
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4438:104: ( ( ( rule__UseCase__Group_4_1__0 ) ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4439:6: ( ( rule__UseCase__Group_4_1__0 ) )
					{
					 
						 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1);
						 				

						 				  selected = true;
						 				
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4445:6: ( ( rule__UseCase__Group_4_1__0 ) )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4447:7: ( rule__UseCase__Group_4_1__0 )
					{
					 before(grammarAccess.getUseCaseAccess().getGroup_4_1()); 
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4448:7: ( rule__UseCase__Group_4_1__0 )
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4448:8: rule__UseCase__Group_4_1__0
					{
					pushFollow(FOLLOW_rule__UseCase__Group_4_1__0_in_rule__UseCase__UnorderedGroup_4__Impl8968);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4463:1: rule__UseCase__UnorderedGroup_4__0 : rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )? ;
	public final void rule__UseCase__UnorderedGroup_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4467:2: ( rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )? )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4468:2: rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )?
			{
			pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__09027);
			rule__UseCase__UnorderedGroup_4__Impl();
			state._fsp--;

			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4469:2: ( rule__UseCase__UnorderedGroup_4__1 )?
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
					// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4469:2: rule__UseCase__UnorderedGroup_4__1
					{
					pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__1_in_rule__UseCase__UnorderedGroup_4__09030);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4476:1: rule__UseCase__UnorderedGroup_4__1 : rule__UseCase__UnorderedGroup_4__Impl ;
	public final void rule__UseCase__UnorderedGroup_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4480:2: ( rule__UseCase__UnorderedGroup_4__Impl )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4481:2: rule__UseCase__UnorderedGroup_4__Impl
			{
			pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__19055);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4492:1: rule__UseCasesModel__PackagesAssignment : ( rulePackageDeclaration ) ;
	public final void rule__UseCasesModel__PackagesAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4496:1: ( ( rulePackageDeclaration ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4497:1: ( rulePackageDeclaration )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4497:1: ( rulePackageDeclaration )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4498:1: rulePackageDeclaration
			{
			 before(grammarAccess.getUseCasesModelAccess().getPackagesPackageDeclarationParserRuleCall_0()); 
			pushFollow(FOLLOW_rulePackageDeclaration_in_rule__UseCasesModel__PackagesAssignment9087);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4507:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
	public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4511:1: ( ( ruleQualifiedName ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4512:1: ( ruleQualifiedName )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4512:1: ( ruleQualifiedName )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4513:1: ruleQualifiedName
			{
			 before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
			pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19118);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4522:1: rule__PackageDeclaration__DescriptionAssignment_2 : ( RULE_STRING ) ;
	public final void rule__PackageDeclaration__DescriptionAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4526:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4527:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4527:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4528:1: RULE_STRING
			{
			 before(grammarAccess.getPackageDeclarationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DescriptionAssignment_29149); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4537:1: rule__PackageDeclaration__ActorsAssignment_3_1 : ( ruleActor ) ;
	public final void rule__PackageDeclaration__ActorsAssignment_3_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4541:1: ( ( ruleActor ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4542:1: ( ruleActor )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4542:1: ( ruleActor )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4543:1: ruleActor
			{
			 before(grammarAccess.getPackageDeclarationAccess().getActorsActorParserRuleCall_3_1_0()); 
			pushFollow(FOLLOW_ruleActor_in_rule__PackageDeclaration__ActorsAssignment_3_19180);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4552:1: rule__PackageDeclaration__UseCasesAssignment_4 : ( ruleUseCase ) ;
	public final void rule__PackageDeclaration__UseCasesAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4556:1: ( ( ruleUseCase ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4557:1: ( ruleUseCase )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4557:1: ( ruleUseCase )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4558:1: ruleUseCase
			{
			 before(grammarAccess.getPackageDeclarationAccess().getUseCasesUseCaseParserRuleCall_4_0()); 
			pushFollow(FOLLOW_ruleUseCase_in_rule__PackageDeclaration__UseCasesAssignment_49211);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4567:1: rule__UseCase__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4571:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4572:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4572:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4573:1: RULE_ID
			{
			 before(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseCase__NameAssignment_19242); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4582:1: rule__UseCase__DescriptionAssignment_2 : ( RULE_STRING ) ;
	public final void rule__UseCase__DescriptionAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4586:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4587:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4587:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4588:1: RULE_STRING
			{
			 before(grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UseCase__DescriptionAssignment_29273); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4597:1: rule__UseCase__SuperCaseAssignment_3_1 : ( ( RULE_ID ) ) ;
	public final void rule__UseCase__SuperCaseAssignment_3_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4601:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4602:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4602:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4603:1: ( RULE_ID )
			{
			 before(grammarAccess.getUseCaseAccess().getSuperCaseUseCaseCrossReference_3_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4604:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4605:1: RULE_ID
			{
			 before(grammarAccess.getUseCaseAccess().getSuperCaseUseCaseIDTerminalRuleCall_3_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseCase__SuperCaseAssignment_3_19308); 
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



	// $ANTLR start "rule__UseCase__PreConditionsAssignment_4_0_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4616:1: rule__UseCase__PreConditionsAssignment_4_0_1 : ( RULE_STRING ) ;
	public final void rule__UseCase__PreConditionsAssignment_4_0_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4620:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4621:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4621:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4622:1: RULE_STRING
			{
			 before(grammarAccess.getUseCaseAccess().getPreConditionsSTRINGTerminalRuleCall_4_0_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UseCase__PreConditionsAssignment_4_0_19343); 
			 after(grammarAccess.getUseCaseAccess().getPreConditionsSTRINGTerminalRuleCall_4_0_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__PreConditionsAssignment_4_0_1"



	// $ANTLR start "rule__UseCase__PostconditionAssignment_4_1_1"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4631:1: rule__UseCase__PostconditionAssignment_4_1_1 : ( RULE_STRING ) ;
	public final void rule__UseCase__PostconditionAssignment_4_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4635:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4636:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4636:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4637:1: RULE_STRING
			{
			 before(grammarAccess.getUseCaseAccess().getPostconditionSTRINGTerminalRuleCall_4_1_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UseCase__PostconditionAssignment_4_1_19374); 
			 after(grammarAccess.getUseCaseAccess().getPostconditionSTRINGTerminalRuleCall_4_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__UseCase__PostconditionAssignment_4_1_1"



	// $ANTLR start "rule__UseCase__FlowsAssignment_5"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4646:1: rule__UseCase__FlowsAssignment_5 : ( ruleFlow ) ;
	public final void rule__UseCase__FlowsAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4650:1: ( ( ruleFlow ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4651:1: ( ruleFlow )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4651:1: ( ruleFlow )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4652:1: ruleFlow
			{
			 before(grammarAccess.getUseCaseAccess().getFlowsFlowParserRuleCall_5_0()); 
			pushFollow(FOLLOW_ruleFlow_in_rule__UseCase__FlowsAssignment_59405);
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



	// $ANTLR start "rule__Actor__NameAssignment_0"
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4661:1: rule__Actor__NameAssignment_0 : ( RULE_ID ) ;
	public final void rule__Actor__NameAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4665:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4666:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4666:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4667:1: RULE_ID
			{
			 before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_09436); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4676:1: rule__Actor__TypeAssignment_2 : ( ruleActorType ) ;
	public final void rule__Actor__TypeAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4680:1: ( ( ruleActorType ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4681:1: ( ruleActorType )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4681:1: ( ruleActorType )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4682:1: ruleActorType
			{
			 before(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleActorType_in_rule__Actor__TypeAssignment_29467);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4691:1: rule__Actor__DescriptionAssignment_3 : ( RULE_STRING ) ;
	public final void rule__Actor__DescriptionAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4695:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4696:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4696:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4697:1: RULE_STRING
			{
			 before(grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Actor__DescriptionAssignment_39498); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4706:1: rule__Actor__ExtendsAssignment_4_1 : ( ( RULE_ID ) ) ;
	public final void rule__Actor__ExtendsAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4710:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4711:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4711:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4712:1: ( RULE_ID )
			{
			 before(grammarAccess.getActorAccess().getExtendsActorCrossReference_4_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4713:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4714:1: RULE_ID
			{
			 before(grammarAccess.getActorAccess().getExtendsActorIDTerminalRuleCall_4_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__ExtendsAssignment_4_19533); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4725:1: rule__BasicFlow__StepsAssignment_2 : ( ruleStep ) ;
	public final void rule__BasicFlow__StepsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4729:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4730:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4730:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4731:1: ruleStep
			{
			 before(grammarAccess.getBasicFlowAccess().getStepsStepParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__BasicFlow__StepsAssignment_29568);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4740:1: rule__BasicFlow__FinalStateAssignment_4_1 : ( RULE_STRING ) ;
	public final void rule__BasicFlow__FinalStateAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4744:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4745:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4745:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4746:1: RULE_STRING
			{
			 before(grammarAccess.getBasicFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BasicFlow__FinalStateAssignment_4_19599); 
			 after(grammarAccess.getBasicFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
			}

			}

		}
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4755:1: rule__ExceptionFlow__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__ExceptionFlow__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4759:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4760:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4760:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4761:1: RULE_ID
			{
			 before(grammarAccess.getExceptionFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExceptionFlow__NameAssignment_19630); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4770:1: rule__ExceptionFlow__ConditionAssignment_3 : ( RULE_STRING ) ;
	public final void rule__ExceptionFlow__ConditionAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4774:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4775:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4775:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4776:1: RULE_STRING
			{
			 before(grammarAccess.getExceptionFlowAccess().getConditionSTRINGTerminalRuleCall_3_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExceptionFlow__ConditionAssignment_39661); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4785:1: rule__ExceptionFlow__StepsAssignment_5 : ( ruleStep ) ;
	public final void rule__ExceptionFlow__StepsAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4789:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4790:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4790:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4791:1: ruleStep
			{
			 before(grammarAccess.getExceptionFlowAccess().getStepsStepParserRuleCall_5_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__ExceptionFlow__StepsAssignment_59692);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4800:1: rule__ExceptionFlow__FinalStateAssignment_7_1 : ( RULE_STRING ) ;
	public final void rule__ExceptionFlow__FinalStateAssignment_7_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4804:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4805:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4805:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4806:1: RULE_STRING
			{
			 before(grammarAccess.getExceptionFlowAccess().getFinalStateSTRINGTerminalRuleCall_7_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExceptionFlow__FinalStateAssignment_7_19723); 
			 after(grammarAccess.getExceptionFlowAccess().getFinalStateSTRINGTerminalRuleCall_7_1_0()); 
			}

			}

		}
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4815:1: rule__AlternativeFlow__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__AlternativeFlow__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4819:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4820:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4820:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4821:1: RULE_ID
			{
			 before(grammarAccess.getAlternativeFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlow__NameAssignment_19754); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4830:1: rule__AlternativeFlow__StepsAssignment_2 : ( ruleStep ) ;
	public final void rule__AlternativeFlow__StepsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4834:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4835:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4835:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4836:1: ruleStep
			{
			 before(grammarAccess.getAlternativeFlowAccess().getStepsStepParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__AlternativeFlow__StepsAssignment_29785);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4845:1: rule__AlternativeFlow__FinalStateAssignment_4_1 : ( RULE_STRING ) ;
	public final void rule__AlternativeFlow__FinalStateAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4849:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4850:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4850:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4851:1: RULE_STRING
			{
			 before(grammarAccess.getAlternativeFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AlternativeFlow__FinalStateAssignment_4_19816); 
			 after(grammarAccess.getAlternativeFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
			}

			}

		}
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4860:1: rule__ParallelFlow__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__ParallelFlow__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4864:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4865:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4865:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4866:1: RULE_ID
			{
			 before(grammarAccess.getParallelFlowAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelFlow__NameAssignment_19847); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4875:1: rule__ParallelFlow__StepsAssignment_2 : ( ruleStep ) ;
	public final void rule__ParallelFlow__StepsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4879:1: ( ( ruleStep ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4880:1: ( ruleStep )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4880:1: ( ruleStep )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4881:1: ruleStep
			{
			 before(grammarAccess.getParallelFlowAccess().getStepsStepParserRuleCall_2_0()); 
			pushFollow(FOLLOW_ruleStep_in_rule__ParallelFlow__StepsAssignment_29878);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4890:1: rule__ParallelFlow__FinalStateAssignment_4_1 : ( RULE_STRING ) ;
	public final void rule__ParallelFlow__FinalStateAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4894:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4895:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4895:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4896:1: RULE_STRING
			{
			 before(grammarAccess.getParallelFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ParallelFlow__FinalStateAssignment_4_19909); 
			 after(grammarAccess.getParallelFlowAccess().getFinalStateSTRINGTerminalRuleCall_4_1_0()); 
			}

			}

		}
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4905:1: rule__Condition__ConditionAssignment_1 : ( RULE_STRING ) ;
	public final void rule__Condition__ConditionAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4909:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4910:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4910:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4911:1: RULE_STRING
			{
			 before(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Condition__ConditionAssignment_19940); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4920:1: rule__Condition__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
	public final void rule__Condition__ContinuationAssignment_3_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4924:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4925:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4925:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4926:1: ( RULE_ID )
			{
			 before(grammarAccess.getConditionAccess().getContinuationStepCrossReference_3_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4927:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4928:1: RULE_ID
			{
			 before(grammarAccess.getConditionAccess().getContinuationStepIDTerminalRuleCall_3_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Condition__ContinuationAssignment_3_19975); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4939:1: rule__LocalAlternative__ConditionAssignment_1 : ( RULE_STRING ) ;
	public final void rule__LocalAlternative__ConditionAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4943:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4944:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4944:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4945:1: RULE_STRING
			{
			 before(grammarAccess.getLocalAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LocalAlternative__ConditionAssignment_110010); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4954:1: rule__LocalAlternative__DescriptionAssignment_3_0 : ( RULE_STRING ) ;
	public final void rule__LocalAlternative__DescriptionAssignment_3_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4958:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4959:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4959:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4960:1: RULE_STRING
			{
			 before(grammarAccess.getLocalAlternativeAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LocalAlternative__DescriptionAssignment_3_010041); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4969:1: rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 : ( ( RULE_ID ) ) ;
	public final void rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4973:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4974:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4974:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4975:1: ( RULE_ID )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseCrossReference_3_1_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4976:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4977:1: RULE_ID
			{
			 before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseIDTerminalRuleCall_3_1_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_110076); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4988:1: rule__LocalAlternative__ContinuationAssignment_4_1 : ( ( RULE_ID ) ) ;
	public final void rule__LocalAlternative__ContinuationAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4992:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4993:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4993:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4994:1: ( RULE_ID )
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinuationStepCrossReference_4_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4995:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4996:1: RULE_ID
			{
			 before(grammarAccess.getLocalAlternativeAccess().getContinuationStepIDTerminalRuleCall_4_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalAlternative__ContinuationAssignment_4_110115); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5007:1: rule__AlternativeFlowAlternative__ConditionAssignment_1 : ( RULE_STRING ) ;
	public final void rule__AlternativeFlowAlternative__ConditionAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5011:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5012:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5012:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5013:1: RULE_STRING
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AlternativeFlowAlternative__ConditionAssignment_110150); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5022:1: rule__AlternativeFlowAlternative__RefAssignment_4 : ( ( RULE_ID ) ) ;
	public final void rule__AlternativeFlowAlternative__RefAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5026:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5027:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5027:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5028:1: ( RULE_ID )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowCrossReference_4_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5029:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5030:1: RULE_ID
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowIDTerminalRuleCall_4_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__RefAssignment_410185); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5041:1: rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 : ( ( RULE_ID ) ) ;
	public final void rule__AlternativeFlowAlternative__ContinuationAssignment_5_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5045:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5046:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5046:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5047:1: ( RULE_ID )
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepCrossReference_5_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5048:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5049:1: RULE_ID
			{
			 before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepIDTerminalRuleCall_5_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__ContinuationAssignment_5_110224); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5060:1: rule__ParallelStep__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__ParallelStep__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5064:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5065:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5065:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5066:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__NameAssignment_110259); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5075:1: rule__ParallelStep__LabelAssignment_2 : ( RULE_STRING ) ;
	public final void rule__ParallelStep__LabelAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5079:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5080:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5080:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5081:1: RULE_STRING
			{
			 before(grammarAccess.getParallelStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ParallelStep__LabelAssignment_210290); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5090:1: rule__ParallelStep__InvokedFlowsAssignment_3 : ( ( RULE_ID ) ) ;
	public final void rule__ParallelStep__InvokedFlowsAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5094:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5095:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5095:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5096:1: ( RULE_ID )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_3_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5097:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5098:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowIDTerminalRuleCall_3_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_310325); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5109:1: rule__ParallelStep__InvokedFlowsAssignment_4_1 : ( ( RULE_ID ) ) ;
	public final void rule__ParallelStep__InvokedFlowsAssignment_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5113:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5114:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5114:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5115:1: ( RULE_ID )
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_4_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5116:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5117:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowIDTerminalRuleCall_4_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_4_110364); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5128:1: rule__ParallelStep__NextAssignment_5_1 : ( ( RULE_ID ) ) ;
	public final void rule__ParallelStep__NextAssignment_5_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5132:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5133:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5133:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5134:1: ( RULE_ID )
			{
			 before(grammarAccess.getParallelStepAccess().getNextStepCrossReference_5_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5135:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5136:1: RULE_ID
			{
			 before(grammarAccess.getParallelStepAccess().getNextStepIDTerminalRuleCall_5_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__NextAssignment_5_110403); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5147:1: rule__NormalStep__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__NormalStep__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5151:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5152:1: ( RULE_ID )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5152:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5153:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__NameAssignment_110438); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5162:1: rule__NormalStep__LabelAssignment_2 : ( RULE_STRING ) ;
	public final void rule__NormalStep__LabelAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5166:1: ( ( RULE_STRING ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5167:1: ( RULE_STRING )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5167:1: ( RULE_STRING )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5168:1: RULE_STRING
			{
			 before(grammarAccess.getNormalStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NormalStep__LabelAssignment_210469); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5177:1: rule__NormalStep__ActorAssignment_4 : ( ( RULE_ID ) ) ;
	public final void rule__NormalStep__ActorAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5181:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5182:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5182:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5183:1: ( RULE_ID )
			{
			 before(grammarAccess.getNormalStepAccess().getActorActorCrossReference_4_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5184:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5185:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getActorActorIDTerminalRuleCall_4_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__ActorAssignment_410504); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5196:1: rule__NormalStep__CustomStepTypeAssignment_5_1 : ( ruleCustomStepType ) ;
	public final void rule__NormalStep__CustomStepTypeAssignment_5_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5200:1: ( ( ruleCustomStepType ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5201:1: ( ruleCustomStepType )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5201:1: ( ruleCustomStepType )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5202:1: ruleCustomStepType
			{
			 before(grammarAccess.getNormalStepAccess().getCustomStepTypeCustomStepTypeEnumRuleCall_5_1_0()); 
			pushFollow(FOLLOW_ruleCustomStepType_in_rule__NormalStep__CustomStepTypeAssignment_5_110539);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5211:1: rule__NormalStep__StepAlternativeAssignment_6_0_1 : ( ruleStepAlternative ) ;
	public final void rule__NormalStep__StepAlternativeAssignment_6_0_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5215:1: ( ( ruleStepAlternative ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5216:1: ( ruleStepAlternative )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5216:1: ( ruleStepAlternative )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5217:1: ruleStepAlternative
			{
			 before(grammarAccess.getNormalStepAccess().getStepAlternativeStepAlternativeParserRuleCall_6_0_1_0()); 
			pushFollow(FOLLOW_ruleStepAlternative_in_rule__NormalStep__StepAlternativeAssignment_6_0_110570);
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5226:1: rule__NormalStep__InvokedUseCaseAssignment_6_1_1 : ( ( RULE_ID ) ) ;
	public final void rule__NormalStep__InvokedUseCaseAssignment_6_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5230:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5231:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5231:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5232:1: ( RULE_ID )
			{
			 before(grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseCrossReference_6_1_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5233:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5234:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseIDTerminalRuleCall_6_1_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__InvokedUseCaseAssignment_6_1_110605); 
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
	// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5245:1: rule__NormalStep__NextAssignment_7_1 : ( ( RULE_ID ) ) ;
	public final void rule__NormalStep__NextAssignment_7_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5249:1: ( ( ( RULE_ID ) ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5250:1: ( ( RULE_ID ) )
			{
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5250:1: ( ( RULE_ID ) )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5251:1: ( RULE_ID )
			{
			 before(grammarAccess.getNormalStepAccess().getNextStepCrossReference_7_1_0()); 
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5252:1: ( RULE_ID )
			// ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5253:1: RULE_ID
			{
			 before(grammarAccess.getNormalStepAccess().getNextStepIDTerminalRuleCall_7_1_0_1()); 
			match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__NextAssignment_7_110644); 
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
	public static final BitSet FOLLOW_ruleActor_in_entryRuleActor242 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleActor249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__0_in_ruleActor275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_entryRuleStep302 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStep309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Step__Alternatives_in_ruleStep335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow362 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleFlow369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Flow__Alternatives_in_ruleFlow395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBasicFlow_in_entryRuleBasicFlow422 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleBasicFlow429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__0_in_ruleBasicFlow455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNamedFlow_in_entryRuleNamedFlow482 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleNamedFlow489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NamedFlow__Alternatives_in_ruleNamedFlow515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExceptionFlow_in_entryRuleExceptionFlow542 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleExceptionFlow549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__0_in_ruleExceptionFlow575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlow_in_entryRuleAlternativeFlow602 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlow609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__0_in_ruleAlternativeFlow635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelFlow_in_entryRuleParallelFlow662 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParallelFlow669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__0_in_ruleParallelFlow695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStepAlternative_in_entryRuleStepAlternative722 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleStepAlternative729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__StepAlternative__Alternatives_in_ruleStepAlternative755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition782 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleCondition789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLocalAlternative_in_entryRuleLocalAlternative842 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleLocalAlternative849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__0_in_ruleLocalAlternative875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlowAlternative_in_entryRuleAlternativeFlowAlternative902 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeFlowAlternative909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__0_in_ruleAlternativeFlowAlternative935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelStep_in_entryRuleParallelStep962 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleParallelStep969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__0_in_ruleParallelStep995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNormalStep_in_entryRuleNormalStep1022 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleNormalStep1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__0_in_ruleNormalStep1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1082 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ActorType__Alternatives_in_ruleActorType1152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__CustomStepType__Alternatives_in_ruleCustomStepType1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNormalStep_in_rule__Step__Alternatives1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelStep_in_rule__Step__Alternatives1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleBasicFlow_in_rule__Flow__Alternatives1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNamedFlow_in_rule__Flow__Alternatives1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleExceptionFlow_in_rule__NamedFlow__Alternatives1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlow_in_rule__NamedFlow__Alternatives1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleParallelFlow_in_rule__NamedFlow__Alternatives1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCondition_in_rule__StepAlternative__Alternatives1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleLocalAlternative_in_rule__StepAlternative__Alternatives1404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleAlternativeFlowAlternative_in_rule__StepAlternative__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__DescriptionAssignment_3_0_in_rule__LocalAlternative__Alternatives_31453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__0_in_rule__LocalAlternative__Alternatives_31471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__0_in_rule__NormalStep__Alternatives_61504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__0_in_rule__NormalStep__Alternatives_61522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_rule__ActorType__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_rule__ActorType__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_rule__ActorType__Alternatives1598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_rule__CustomStepType__Alternatives1634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_rule__CustomStepType__Alternatives1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_rule__CustomStepType__Alternatives1676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_rule__CustomStepType__Alternatives1697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01730 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_rule__PackageDeclaration__Group__0__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11792 = new BitSet(new long[]{0x0000100000402200L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21852 = new BitSet(new long[]{0x0000100000402000L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__DescriptionAssignment_2_in_rule__PackageDeclaration__Group__2__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31913 = new BitSet(new long[]{0x0000100000400000L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41974 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__41977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__UseCasesAssignment_4_in_rule__PackageDeclaration__Group__4__Impl2004 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_rule__PackageDeclaration__Group__5__Impl2063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02106 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_rule__PackageDeclaration__Group_3__0__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__12168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2197 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2209 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__02246 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__02249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_rule__UseCase__Group__0__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__12308 = new BitSet(new long[]{0x0000006002000200L});
	public static final BitSet FOLLOW_rule__UseCase__Group__2_in_rule__UseCase__Group__12311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__NameAssignment_1_in_rule__UseCase__Group__1__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__2__Impl_in_rule__UseCase__Group__22368 = new BitSet(new long[]{0x0000006002000000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__3_in_rule__UseCase__Group__22371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__DescriptionAssignment_2_in_rule__UseCase__Group__2__Impl2398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__3__Impl_in_rule__UseCase__Group__32429 = new BitSet(new long[]{0x0000006000000000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__4_in_rule__UseCase__Group__32432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__0_in_rule__UseCase__Group__3__Impl2459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__4__Impl_in_rule__UseCase__Group__42490 = new BitSet(new long[]{0x0000000401824000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__5_in_rule__UseCase__Group__42493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4_in_rule__UseCase__Group__4__Impl2520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__5__Impl_in_rule__UseCase__Group__52550 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_rule__UseCase__Group__6_in_rule__UseCase__Group__52553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__FlowsAssignment_5_in_rule__UseCase__Group__5__Impl2580 = new BitSet(new long[]{0x0000000401024002L});
	public static final BitSet FOLLOW_rule__UseCase__Group__6__Impl_in_rule__UseCase__Group__62611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_rule__UseCase__Group__6__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__0__Impl_in_rule__UseCase__Group_3__02684 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__1_in_rule__UseCase__Group_3__02687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_rule__UseCase__Group_3__0__Impl2715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_3__1__Impl_in_rule__UseCase__Group_3__12746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__SuperCaseAssignment_3_1_in_rule__UseCase__Group_3__1__Impl2773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__0__Impl_in_rule__UseCase__Group_4_0__02807 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__1_in_rule__UseCase__Group_4_0__02810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_rule__UseCase__Group_4_0__0__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__1__Impl_in_rule__UseCase__Group_4_0__12869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__PreConditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl2896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__0__Impl_in_rule__UseCase__Group_4_1__02930 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__1_in_rule__UseCase__Group_4_1__02933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_rule__UseCase__Group_4_1__0__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__1__Impl_in_rule__UseCase__Group_4_1__12992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__PostconditionAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03053 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13113 = new BitSet(new long[]{0x0000021080000000L});
	public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_rule__Actor__Group__1__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23175 = new BitSet(new long[]{0x0000000002000200L});
	public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__TypeAssignment_2_in_rule__Actor__Group__2__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__33235 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_rule__Actor__Group__4_in_rule__Actor__Group__33238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__DescriptionAssignment_3_in_rule__Actor__Group__3__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group__4__Impl_in_rule__Actor__Group__43296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__0_in_rule__Actor__Group__4__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__0__Impl_in_rule__Actor__Group_4__03364 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__1_in_rule__Actor__Group_4__03367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_rule__Actor__Group_4__0__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__Group_4__1__Impl_in_rule__Actor__Group_4__13426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Actor__ExtendsAssignment_4_1_in_rule__Actor__Group_4__1__Impl3453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__0__Impl_in_rule__BasicFlow__Group__03487 = new BitSet(new long[]{0x0000010800200000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__1_in_rule__BasicFlow__Group__03490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_rule__BasicFlow__Group__0__Impl3518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__1__Impl_in_rule__BasicFlow__Group__13549 = new BitSet(new long[]{0x0000010800200000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__2_in_rule__BasicFlow__Group__13552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__2__Impl_in_rule__BasicFlow__Group__23610 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__3_in_rule__BasicFlow__Group__23613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__StepsAssignment_2_in_rule__BasicFlow__Group__2__Impl3640 = new BitSet(new long[]{0x0000010800000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__3__Impl_in_rule__BasicFlow__Group__33671 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__4_in_rule__BasicFlow__Group__33674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__BasicFlow__Group__3__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group__4__Impl_in_rule__BasicFlow__Group__43733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__0_in_rule__BasicFlow__Group__4__Impl3760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__0__Impl_in_rule__BasicFlow__Group_4__03801 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__1_in_rule__BasicFlow__Group_4__03804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__BasicFlow__Group_4__0__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__Group_4__1__Impl_in_rule__BasicFlow__Group_4__13863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__BasicFlow__FinalStateAssignment_4_1_in_rule__BasicFlow__Group_4__1__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__0__Impl_in_rule__ExceptionFlow__Group__03924 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__1_in_rule__ExceptionFlow__Group__03927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_rule__ExceptionFlow__Group__0__Impl3955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__1__Impl_in_rule__ExceptionFlow__Group__13986 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__2_in_rule__ExceptionFlow__Group__13989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__NameAssignment_1_in_rule__ExceptionFlow__Group__1__Impl4016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__2__Impl_in_rule__ExceptionFlow__Group__24046 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__3_in_rule__ExceptionFlow__Group__24049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_rule__ExceptionFlow__Group__2__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__3__Impl_in_rule__ExceptionFlow__Group__34108 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__4_in_rule__ExceptionFlow__Group__34111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__ConditionAssignment_3_in_rule__ExceptionFlow__Group__3__Impl4138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__4__Impl_in_rule__ExceptionFlow__Group__44168 = new BitSet(new long[]{0x0000010800200000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__5_in_rule__ExceptionFlow__Group__44171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__ExceptionFlow__Group__4__Impl4199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__5__Impl_in_rule__ExceptionFlow__Group__54230 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__6_in_rule__ExceptionFlow__Group__54233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__StepsAssignment_5_in_rule__ExceptionFlow__Group__5__Impl4260 = new BitSet(new long[]{0x0000010800000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__6__Impl_in_rule__ExceptionFlow__Group__64291 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__7_in_rule__ExceptionFlow__Group__64294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__ExceptionFlow__Group__6__Impl4322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group__7__Impl_in_rule__ExceptionFlow__Group__74353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__0_in_rule__ExceptionFlow__Group__7__Impl4380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__0__Impl_in_rule__ExceptionFlow__Group_7__04427 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__1_in_rule__ExceptionFlow__Group_7__04430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__ExceptionFlow__Group_7__0__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__1__Impl_in_rule__ExceptionFlow__Group_7__14489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ExceptionFlow__FinalStateAssignment_7_1_in_rule__ExceptionFlow__Group_7__1__Impl4516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__0__Impl_in_rule__AlternativeFlow__Group__04550 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__1_in_rule__AlternativeFlow__Group__04553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__AlternativeFlow__Group__0__Impl4581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__1__Impl_in_rule__AlternativeFlow__Group__14612 = new BitSet(new long[]{0x0000010800200000L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__2_in_rule__AlternativeFlow__Group__14615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__NameAssignment_1_in_rule__AlternativeFlow__Group__1__Impl4642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__2__Impl_in_rule__AlternativeFlow__Group__24672 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__3_in_rule__AlternativeFlow__Group__24675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__StepsAssignment_2_in_rule__AlternativeFlow__Group__2__Impl4702 = new BitSet(new long[]{0x0000010800000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__3__Impl_in_rule__AlternativeFlow__Group__34733 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__4_in_rule__AlternativeFlow__Group__34736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__AlternativeFlow__Group__3__Impl4764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group__4__Impl_in_rule__AlternativeFlow__Group__44795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__0_in_rule__AlternativeFlow__Group__4__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__0__Impl_in_rule__AlternativeFlow__Group_4__04863 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__1_in_rule__AlternativeFlow__Group_4__04866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__AlternativeFlow__Group_4__0__Impl4894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__1__Impl_in_rule__AlternativeFlow__Group_4__14925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlow__FinalStateAssignment_4_1_in_rule__AlternativeFlow__Group_4__1__Impl4952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__0__Impl_in_rule__ParallelFlow__Group__04986 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__1_in_rule__ParallelFlow__Group__04989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_rule__ParallelFlow__Group__0__Impl5017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__1__Impl_in_rule__ParallelFlow__Group__15048 = new BitSet(new long[]{0x0000010800200000L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__2_in_rule__ParallelFlow__Group__15051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__NameAssignment_1_in_rule__ParallelFlow__Group__1__Impl5078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__2__Impl_in_rule__ParallelFlow__Group__25108 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__3_in_rule__ParallelFlow__Group__25111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__StepsAssignment_2_in_rule__ParallelFlow__Group__2__Impl5138 = new BitSet(new long[]{0x0000010800000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__3__Impl_in_rule__ParallelFlow__Group__35169 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__4_in_rule__ParallelFlow__Group__35172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_rule__ParallelFlow__Group__3__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group__4__Impl_in_rule__ParallelFlow__Group__45231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__0_in_rule__ParallelFlow__Group__4__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__0__Impl_in_rule__ParallelFlow__Group_4__05299 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__1_in_rule__ParallelFlow__Group_4__05302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_rule__ParallelFlow__Group_4__0__Impl5330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__1__Impl_in_rule__ParallelFlow__Group_4__15361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelFlow__FinalStateAssignment_4_1_in_rule__ParallelFlow__Group_4__1__Impl5388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05422 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_rule__Condition__Group__0__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15484 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__15487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__ConditionAssignment_1_in_rule__Condition__Group__1__Impl5514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__25544 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__25547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__Condition__Group__2__Impl5575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__35606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__0_in_rule__Condition__Group__3__Impl5633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__0__Impl_in_rule__Condition__Group_3__05672 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__1_in_rule__Condition__Group_3__05675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rule__Condition__Group_3__0__Impl5703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__Group_3__1__Impl_in_rule__Condition__Group_3__15734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__Condition__ContinuationAssignment_3_1_in_rule__Condition__Group_3__1__Impl5761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__0__Impl_in_rule__LocalAlternative__Group__05795 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__1_in_rule__LocalAlternative__Group__05798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_rule__LocalAlternative__Group__0__Impl5826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__1__Impl_in_rule__LocalAlternative__Group__15857 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__2_in_rule__LocalAlternative__Group__15860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__ConditionAssignment_1_in_rule__LocalAlternative__Group__1__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__2__Impl_in_rule__LocalAlternative__Group__25917 = new BitSet(new long[]{0x0000000010000200L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__3_in_rule__LocalAlternative__Group__25920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__LocalAlternative__Group__2__Impl5948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__3__Impl_in_rule__LocalAlternative__Group__35979 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__4_in_rule__LocalAlternative__Group__35982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Alternatives_3_in_rule__LocalAlternative__Group__3__Impl6009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group__4__Impl_in_rule__LocalAlternative__Group__46039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__0_in_rule__LocalAlternative__Group__4__Impl6066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__0__Impl_in_rule__LocalAlternative__Group_3_1__06107 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__1_in_rule__LocalAlternative__Group_3_1__06110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_rule__LocalAlternative__Group_3_1__0__Impl6138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__1__Impl_in_rule__LocalAlternative__Group_3_1__16169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1_in_rule__LocalAlternative__Group_3_1__1__Impl6196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__0__Impl_in_rule__LocalAlternative__Group_4__06230 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__1_in_rule__LocalAlternative__Group_4__06233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rule__LocalAlternative__Group_4__0__Impl6261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__1__Impl_in_rule__LocalAlternative__Group_4__16292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__LocalAlternative__ContinuationAssignment_4_1_in_rule__LocalAlternative__Group_4__1__Impl6319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__0__Impl_in_rule__AlternativeFlowAlternative__Group__06353 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__1_in_rule__AlternativeFlowAlternative__Group__06356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_rule__AlternativeFlowAlternative__Group__0__Impl6384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__1__Impl_in_rule__AlternativeFlowAlternative__Group__16415 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__2_in_rule__AlternativeFlowAlternative__Group__16418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__ConditionAssignment_1_in_rule__AlternativeFlowAlternative__Group__1__Impl6445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__2__Impl_in_rule__AlternativeFlowAlternative__Group__26475 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__3_in_rule__AlternativeFlowAlternative__Group__26478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_rule__AlternativeFlowAlternative__Group__2__Impl6506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__3__Impl_in_rule__AlternativeFlowAlternative__Group__36537 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__4_in_rule__AlternativeFlowAlternative__Group__36540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_rule__AlternativeFlowAlternative__Group__3__Impl6568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__4__Impl_in_rule__AlternativeFlowAlternative__Group__46599 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__5_in_rule__AlternativeFlowAlternative__Group__46602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__RefAssignment_4_in_rule__AlternativeFlowAlternative__Group__4__Impl6629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__5__Impl_in_rule__AlternativeFlowAlternative__Group__56659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__0_in_rule__AlternativeFlowAlternative__Group__5__Impl6686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__0__Impl_in_rule__AlternativeFlowAlternative__Group_5__06729 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__1_in_rule__AlternativeFlowAlternative__Group_5__06732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_rule__AlternativeFlowAlternative__Group_5__0__Impl6760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__1__Impl_in_rule__AlternativeFlowAlternative__Group_5__16791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__ContinuationAssignment_5_1_in_rule__AlternativeFlowAlternative__Group_5__1__Impl6818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__0__Impl_in_rule__ParallelStep__Group__06852 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__1_in_rule__ParallelStep__Group__06855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_rule__ParallelStep__Group__0__Impl6883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__1__Impl_in_rule__ParallelStep__Group__16914 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__2_in_rule__ParallelStep__Group__16917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__NameAssignment_1_in_rule__ParallelStep__Group__1__Impl6944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__2__Impl_in_rule__ParallelStep__Group__26974 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__3_in_rule__ParallelStep__Group__26977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__LabelAssignment_2_in_rule__ParallelStep__Group__2__Impl7004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__3__Impl_in_rule__ParallelStep__Group__37035 = new BitSet(new long[]{0x0000000040000800L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__4_in_rule__ParallelStep__Group__37038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_3_in_rule__ParallelStep__Group__3__Impl7065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__4__Impl_in_rule__ParallelStep__Group__47095 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__5_in_rule__ParallelStep__Group__47098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__0_in_rule__ParallelStep__Group__4__Impl7125 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group__5__Impl_in_rule__ParallelStep__Group__57156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__0_in_rule__ParallelStep__Group__5__Impl7183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__0__Impl_in_rule__ParallelStep__Group_4__07226 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__1_in_rule__ParallelStep__Group_4__07229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_rule__ParallelStep__Group_4__0__Impl7257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_4__1__Impl_in_rule__ParallelStep__Group_4__17288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_4_1_in_rule__ParallelStep__Group_4__1__Impl7315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__0__Impl_in_rule__ParallelStep__Group_5__07349 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__1_in_rule__ParallelStep__Group_5__07352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_rule__ParallelStep__Group_5__0__Impl7380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__Group_5__1__Impl_in_rule__ParallelStep__Group_5__17411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__ParallelStep__NextAssignment_5_1_in_rule__ParallelStep__Group_5__1__Impl7438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__0__Impl_in_rule__NormalStep__Group__07472 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__1_in_rule__NormalStep__Group__07475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_rule__NormalStep__Group__0__Impl7503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__1__Impl_in_rule__NormalStep__Group__17534 = new BitSet(new long[]{0x0000000000040200L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__2_in_rule__NormalStep__Group__17537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__NameAssignment_1_in_rule__NormalStep__Group__1__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__2__Impl_in_rule__NormalStep__Group__27594 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__3_in_rule__NormalStep__Group__27597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__LabelAssignment_2_in_rule__NormalStep__Group__2__Impl7624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__3__Impl_in_rule__NormalStep__Group__37655 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__4_in_rule__NormalStep__Group__37658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_rule__NormalStep__Group__3__Impl7686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__4__Impl_in_rule__NormalStep__Group__47717 = new BitSet(new long[]{0x0000080050008000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__5_in_rule__NormalStep__Group__47720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__ActorAssignment_4_in_rule__NormalStep__Group__4__Impl7747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__5__Impl_in_rule__NormalStep__Group__57777 = new BitSet(new long[]{0x0000000050008000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__6_in_rule__NormalStep__Group__57780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_5__0_in_rule__NormalStep__Group__5__Impl7807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__6__Impl_in_rule__NormalStep__Group__67838 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__7_in_rule__NormalStep__Group__67841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Alternatives_6_in_rule__NormalStep__Group__6__Impl7868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group__7__Impl_in_rule__NormalStep__Group__77899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__0_in_rule__NormalStep__Group__7__Impl7926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_5__0__Impl_in_rule__NormalStep__Group_5__07973 = new BitSet(new long[]{0x0000008128000000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_5__1_in_rule__NormalStep__Group_5__07976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_rule__NormalStep__Group_5__0__Impl8004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_5__1__Impl_in_rule__NormalStep__Group_5__18035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__CustomStepTypeAssignment_5_1_in_rule__NormalStep__Group_5__1__Impl8062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__0__Impl_in_rule__NormalStep__Group_6_0__08096 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__1_in_rule__NormalStep__Group_6_0__08099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_rule__NormalStep__Group_6_0__0__Impl8127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__1__Impl_in_rule__NormalStep__Group_6_0__18158 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__2_in_rule__NormalStep__Group_6_0__18161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8190 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8202 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__2__Impl_in_rule__NormalStep__Group_6_0__28235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_rule__NormalStep__Group_6_0__2__Impl8263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__0__Impl_in_rule__NormalStep__Group_6_1__08300 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__1_in_rule__NormalStep__Group_6_1__08303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_rule__NormalStep__Group_6_1__0__Impl8331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__1__Impl_in_rule__NormalStep__Group_6_1__18362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__InvokedUseCaseAssignment_6_1_1_in_rule__NormalStep__Group_6_1__1__Impl8389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__0__Impl_in_rule__NormalStep__Group_7__08423 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__1_in_rule__NormalStep__Group_7__08426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_rule__NormalStep__Group_7__0__Impl8454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__Group_7__1__Impl_in_rule__NormalStep__Group_7__18485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__NormalStep__NextAssignment_7_1_in_rule__NormalStep__Group_7__1__Impl8512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08546 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8632 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08667 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl8698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__0_in_rule__UseCase__UnorderedGroup_48790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_0__0_in_rule__UseCase__UnorderedGroup_4__Impl8877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__Group_4_1__0_in_rule__UseCase__UnorderedGroup_4__Impl8968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__09027 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__1_in_rule__UseCase__UnorderedGroup_4__09030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__19055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__UseCasesModel__PackagesAssignment9087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DescriptionAssignment_29149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActor_in_rule__PackageDeclaration__ActorsAssignment_3_19180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleUseCase_in_rule__PackageDeclaration__UseCasesAssignment_49211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__UseCase__NameAssignment_19242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__UseCase__DescriptionAssignment_29273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__UseCase__SuperCaseAssignment_3_19308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__UseCase__PreConditionsAssignment_4_0_19343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__UseCase__PostconditionAssignment_4_1_19374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFlow_in_rule__UseCase__FlowsAssignment_59405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_09436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleActorType_in_rule__Actor__TypeAssignment_29467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__Actor__DescriptionAssignment_39498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__ExtendsAssignment_4_19533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__BasicFlow__StepsAssignment_29568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__BasicFlow__FinalStateAssignment_4_19599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ExceptionFlow__NameAssignment_19630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__ExceptionFlow__ConditionAssignment_39661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__ExceptionFlow__StepsAssignment_59692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__ExceptionFlow__FinalStateAssignment_7_19723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlow__NameAssignment_19754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__AlternativeFlow__StepsAssignment_29785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__AlternativeFlow__FinalStateAssignment_4_19816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelFlow__NameAssignment_19847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStep_in_rule__ParallelFlow__StepsAssignment_29878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__ParallelFlow__FinalStateAssignment_4_19909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__Condition__ConditionAssignment_19940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__Condition__ContinuationAssignment_3_19975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__LocalAlternative__ConditionAssignment_110010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__LocalAlternative__DescriptionAssignment_3_010041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_110076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__LocalAlternative__ContinuationAssignment_4_110115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__AlternativeFlowAlternative__ConditionAssignment_110150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__RefAssignment_410185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__ContinuationAssignment_5_110224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__NameAssignment_110259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__ParallelStep__LabelAssignment_210290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_310325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_4_110364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__NextAssignment_5_110403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__NameAssignment_110438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_STRING_in_rule__NormalStep__LabelAssignment_210469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__ActorAssignment_410504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleCustomStepType_in_rule__NormalStep__CustomStepTypeAssignment_5_110539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleStepAlternative_in_rule__NormalStep__StepAlternativeAssignment_6_0_110570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__InvokedUseCaseAssignment_6_1_110605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__NextAssignment_7_110644 = new BitSet(new long[]{0x0000000000000002L});
}
