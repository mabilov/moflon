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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'person'", "'system'", "'organization'", "'wait'", "'send'", "'perform'", "'call'", "'alt'", "'wait-alt'", "'package'", "'end package'", "'actors'", "'usecase'", "'end usecase'", "'extends'", "'preconditions'", "'postcondition'", "'as'", "'basic flow'", "'end flow'", "'with postcondition'", "'exception flow'", "'if'", "'then'", "'alternative flow'", "'parallel flow'", "'continue with step'", "'invoke usecase'", "'parallel step'", "','", "'next'", "'step'", "'by'", "'alternatives'", "'else'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUseCaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUseCaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUseCaseParser.tokenNames; }
    public String getGrammarFileName() { return "../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g"; }


     
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:76:1: ( rule__UseCasesModel__PackagesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
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
            } while (true);

             after(grammarAccess.getUseCasesModelAccess().getPackagesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:104:1: ( rule__PackageDeclaration__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:132:1: ( rule__UseCase__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:160:1: ( rule__UCCondition__NameAssignment )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:188:1: ( rule__Actor__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:216:1: ( rule__Step__Alternatives )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:244:1: ( rule__Flow__Alternatives )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:272:1: ( rule__BasicFlow__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:300:1: ( rule__NamedFlow__Alternatives )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:328:1: ( rule__ExceptionFlow__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:356:1: ( rule__AlternativeFlow__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:384:1: ( rule__ParallelFlow__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:412:1: ( rule__StepAlternative__Alternatives )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:440:1: ( rule__Condition__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:468:1: ( rule__LocalAlternative__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:496:1: ( rule__AlternativeFlowAlternative__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:524:1: ( rule__ParallelStep__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:552:1: ( rule__NormalStep__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:580:1: ( rule__QualifiedName__Group__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:600:1: ( rule__ActorType__Alternatives )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:619:1: ( rule__StepType__Alternatives )
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

            	restoreStackSize(stackSize);

        }
        return ;
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

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            else if ( (LA2_0==39) ) {
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

            	restoreStackSize(stackSize);

        }
        return ;
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

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==32||(LA3_0>=35 && LA3_0<=36)) ) {
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

            	restoreStackSize(stackSize);

        }
        return ;
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
            case 32:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 36:
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

            	restoreStackSize(stackSize);

        }
        return ;
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

            if ( (LA5_0==33) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_STRING) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==34) ) {
                        switch ( input.LA(4) ) {
                        case RULE_STRING:
                        case 38:
                            {
                            alt5=2;
                            }
                            break;
                        case 35:
                            {
                            alt5=3;
                            }
                            break;
                        case EOF:
                        case 33:
                        case 37:
                        case 45:
                            {
                            alt5=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
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

            	restoreStackSize(stackSize);

        }
        return ;
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
            else if ( (LA6_0==38) ) {
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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:737:1: ( rule__LocalAlternative__DescriptionAssignment_3_0 )
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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:743:1: ( rule__LocalAlternative__Group_3_1__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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

            if ( (LA7_0==44) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:759:1: ( rule__NormalStep__Group_6_0__0 )
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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:765:1: ( rule__NormalStep__Group_6_1__0 )
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

            	restoreStackSize(stackSize);

        }
        return ;
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
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:781:1: ( 'person' )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:781:3: 'person'
                    {
                    match(input,11,FOLLOW_11_in_rule__ActorType__Alternatives1616); 

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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:788:1: ( 'system' )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:788:3: 'system'
                    {
                    match(input,12,FOLLOW_12_in_rule__ActorType__Alternatives1637); 

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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:795:1: ( 'organization' )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:795:3: 'organization'
                    {
                    match(input,13,FOLLOW_13_in_rule__ActorType__Alternatives1658); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorType__Alternatives"


    // $ANTLR start "rule__StepType__Alternatives"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:805:1: rule__StepType__Alternatives : ( ( ( 'wait' ) ) | ( ( 'send' ) ) | ( ( 'perform' ) ) | ( ( 'call' ) ) | ( ( 'alt' ) ) | ( ( 'wait-alt' ) ) );
    public final void rule__StepType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:809:1: ( ( ( 'wait' ) ) | ( ( 'send' ) ) | ( ( 'perform' ) ) | ( ( 'call' ) ) | ( ( 'alt' ) ) | ( ( 'wait-alt' ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            case 17:
                {
                alt9=4;
                }
                break;
            case 18:
                {
                alt9=5;
                }
                break;
            case 19:
                {
                alt9=6;
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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:812:1: ( 'wait' )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:812:3: 'wait'
                    {
                    match(input,14,FOLLOW_14_in_rule__StepType__Alternatives1694); 

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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:819:1: ( 'send' )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:819:3: 'send'
                    {
                    match(input,15,FOLLOW_15_in_rule__StepType__Alternatives1715); 

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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:826:1: ( 'perform' )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:826:3: 'perform'
                    {
                    match(input,16,FOLLOW_16_in_rule__StepType__Alternatives1736); 

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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:833:1: ( 'call' )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:833:3: 'call'
                    {
                    match(input,17,FOLLOW_17_in_rule__StepType__Alternatives1757); 

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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:840:1: ( 'alt' )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:840:3: 'alt'
                    {
                    match(input,18,FOLLOW_18_in_rule__StepType__Alternatives1778); 

                    }

                     after(grammarAccess.getStepTypeAccess().getALTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:845:6: ( ( 'wait-alt' ) )
                    {
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:845:6: ( ( 'wait-alt' ) )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:846:1: ( 'wait-alt' )
                    {
                     before(grammarAccess.getStepTypeAccess().getWAIT_ALTEnumLiteralDeclaration_5()); 
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:847:1: ( 'wait-alt' )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:847:3: 'wait-alt'
                    {
                    match(input,19,FOLLOW_19_in_rule__StepType__Alternatives1799); 

                    }

                     after(grammarAccess.getStepTypeAccess().getWAIT_ALTEnumLiteralDeclaration_5()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepType__Alternatives"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:859:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:863:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:864:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01832);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01835);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:871:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:875:1: ( ( 'package' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:876:1: ( 'package' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:876:1: ( 'package' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:877:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__PackageDeclaration__Group__0__Impl1863); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:890:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:894:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:895:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11894);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11897);
            rule__PackageDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:902:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:906:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:907:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:907:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:908:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:909:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:909:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1924);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:919:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:923:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:924:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21954);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21957);
            rule__PackageDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:931:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:935:1: ( ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:936:1: ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:936:1: ( ( rule__PackageDeclaration__DescriptionAssignment_2 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:937:1: ( rule__PackageDeclaration__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getPackageDeclarationAccess().getDescriptionAssignment_2()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:938:1: ( rule__PackageDeclaration__DescriptionAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:938:2: rule__PackageDeclaration__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__DescriptionAssignment_2_in_rule__PackageDeclaration__Group__2__Impl1984);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:948:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:952:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:953:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32015);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32018);
            rule__PackageDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:960:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__Group_3__0 )? ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:964:1: ( ( ( rule__PackageDeclaration__Group_3__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:965:1: ( ( rule__PackageDeclaration__Group_3__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:965:1: ( ( rule__PackageDeclaration__Group_3__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:966:1: ( rule__PackageDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_3()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:967:1: ( rule__PackageDeclaration__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:967:2: rule__PackageDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2045);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:977:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:981:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:982:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42076);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42079);
            rule__PackageDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:989:1: rule__PackageDeclaration__Group__4__Impl : ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:993:1: ( ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:994:1: ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:994:1: ( ( rule__PackageDeclaration__UseCasesAssignment_4 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:995:1: ( rule__PackageDeclaration__UseCasesAssignment_4 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getUseCasesAssignment_4()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:996:1: ( rule__PackageDeclaration__UseCasesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:996:2: rule__PackageDeclaration__UseCasesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__UseCasesAssignment_4_in_rule__PackageDeclaration__Group__4__Impl2106);
            	    rule__PackageDeclaration__UseCasesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getUseCasesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__5"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1006:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1010:1: ( rule__PackageDeclaration__Group__5__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1011:2: rule__PackageDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52137);
            rule__PackageDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5"


    // $ANTLR start "rule__PackageDeclaration__Group__5__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1017:1: rule__PackageDeclaration__Group__5__Impl : ( 'end package' ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1021:1: ( ( 'end package' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1022:1: ( 'end package' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1022:1: ( 'end package' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1023:1: 'end package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getEndPackageKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__PackageDeclaration__Group__5__Impl2165); 
             after(grammarAccess.getPackageDeclarationAccess().getEndPackageKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_3__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1048:1: rule__PackageDeclaration__Group_3__0 : rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 ;
    public final void rule__PackageDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1052:1: ( rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1053:2: rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02208);
            rule__PackageDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02211);
            rule__PackageDeclaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_3__0"


    // $ANTLR start "rule__PackageDeclaration__Group_3__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1060:1: rule__PackageDeclaration__Group_3__0__Impl : ( 'actors' ) ;
    public final void rule__PackageDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1064:1: ( ( 'actors' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1065:1: ( 'actors' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1065:1: ( 'actors' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1066:1: 'actors'
            {
             before(grammarAccess.getPackageDeclarationAccess().getActorsKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__PackageDeclaration__Group_3__0__Impl2239); 
             after(grammarAccess.getPackageDeclarationAccess().getActorsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_3__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1079:1: rule__PackageDeclaration__Group_3__1 : rule__PackageDeclaration__Group_3__1__Impl ;
    public final void rule__PackageDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1083:1: ( rule__PackageDeclaration__Group_3__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1084:2: rule__PackageDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__12270);
            rule__PackageDeclaration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_3__1"


    // $ANTLR start "rule__PackageDeclaration__Group_3__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1090:1: rule__PackageDeclaration__Group_3__1__Impl : ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) ) ;
    public final void rule__PackageDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1094:1: ( ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1095:1: ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1095:1: ( ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1096:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) ) ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1096:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1097:1: ( rule__PackageDeclaration__ActorsAssignment_3_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1098:1: ( rule__PackageDeclaration__ActorsAssignment_3_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1098:2: rule__PackageDeclaration__ActorsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2299);
            rule__PackageDeclaration__ActorsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 

            }

            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1101:1: ( ( rule__PackageDeclaration__ActorsAssignment_3_1 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1102:1: ( rule__PackageDeclaration__ActorsAssignment_3_1 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getActorsAssignment_3_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1103:1: ( rule__PackageDeclaration__ActorsAssignment_3_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1103:2: rule__PackageDeclaration__ActorsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2311);
            	    rule__PackageDeclaration__ActorsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__UseCase__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1118:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1122:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1123:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__02348);
            rule__UseCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__02351);
            rule__UseCase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0"


    // $ANTLR start "rule__UseCase__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1130:1: rule__UseCase__Group__0__Impl : ( 'usecase' ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1134:1: ( ( 'usecase' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1135:1: ( 'usecase' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1135:1: ( 'usecase' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1136:1: 'usecase'
            {
             before(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__UseCase__Group__0__Impl2379); 
             after(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0__Impl"


    // $ANTLR start "rule__UseCase__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1149:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1153:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1154:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__12410);
            rule__UseCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__2_in_rule__UseCase__Group__12413);
            rule__UseCase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1"


    // $ANTLR start "rule__UseCase__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1161:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1165:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1166:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1166:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1167:1: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1168:1: ( rule__UseCase__NameAssignment_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1168:2: rule__UseCase__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UseCase__NameAssignment_1_in_rule__UseCase__Group__1__Impl2440);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1__Impl"


    // $ANTLR start "rule__UseCase__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1178:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1182:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1183:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_rule__UseCase__Group__2__Impl_in_rule__UseCase__Group__22470);
            rule__UseCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__3_in_rule__UseCase__Group__22473);
            rule__UseCase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__2"


    // $ANTLR start "rule__UseCase__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1190:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionAssignment_2 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1194:1: ( ( ( rule__UseCase__DescriptionAssignment_2 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1195:1: ( ( rule__UseCase__DescriptionAssignment_2 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1195:1: ( ( rule__UseCase__DescriptionAssignment_2 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1196:1: ( rule__UseCase__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionAssignment_2()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1197:1: ( rule__UseCase__DescriptionAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1197:2: rule__UseCase__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__UseCase__DescriptionAssignment_2_in_rule__UseCase__Group__2__Impl2500);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__2__Impl"


    // $ANTLR start "rule__UseCase__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1207:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1211:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1212:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_rule__UseCase__Group__3__Impl_in_rule__UseCase__Group__32531);
            rule__UseCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__4_in_rule__UseCase__Group__32534);
            rule__UseCase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__3"


    // $ANTLR start "rule__UseCase__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1219:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__Group_3__0 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1223:1: ( ( ( rule__UseCase__Group_3__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1224:1: ( ( rule__UseCase__Group_3__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1224:1: ( ( rule__UseCase__Group_3__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1225:1: ( rule__UseCase__Group_3__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_3()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1226:1: ( rule__UseCase__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1226:2: rule__UseCase__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__UseCase__Group_3__0_in_rule__UseCase__Group__3__Impl2561);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__3__Impl"


    // $ANTLR start "rule__UseCase__Group__4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1236:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1240:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1241:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_rule__UseCase__Group__4__Impl_in_rule__UseCase__Group__42592);
            rule__UseCase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__5_in_rule__UseCase__Group__42595);
            rule__UseCase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__4"


    // $ANTLR start "rule__UseCase__Group__4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1248:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__UnorderedGroup_4 ) ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1252:1: ( ( ( rule__UseCase__UnorderedGroup_4 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1253:1: ( ( rule__UseCase__UnorderedGroup_4 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1253:1: ( ( rule__UseCase__UnorderedGroup_4 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1254:1: ( rule__UseCase__UnorderedGroup_4 )
            {
             before(grammarAccess.getUseCaseAccess().getUnorderedGroup_4()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1255:1: ( rule__UseCase__UnorderedGroup_4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1255:2: rule__UseCase__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4_in_rule__UseCase__Group__4__Impl2622);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__4__Impl"


    // $ANTLR start "rule__UseCase__Group__5"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1265:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1269:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1270:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_rule__UseCase__Group__5__Impl_in_rule__UseCase__Group__52652);
            rule__UseCase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__6_in_rule__UseCase__Group__52655);
            rule__UseCase__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__5"


    // $ANTLR start "rule__UseCase__Group__5__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1277:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__FlowsAssignment_5 )* ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1281:1: ( ( ( rule__UseCase__FlowsAssignment_5 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1282:1: ( ( rule__UseCase__FlowsAssignment_5 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1282:1: ( ( rule__UseCase__FlowsAssignment_5 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1283:1: ( rule__UseCase__FlowsAssignment_5 )*
            {
             before(grammarAccess.getUseCaseAccess().getFlowsAssignment_5()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1284:1: ( rule__UseCase__FlowsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29||LA16_0==32||(LA16_0>=35 && LA16_0<=36)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1284:2: rule__UseCase__FlowsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__UseCase__FlowsAssignment_5_in_rule__UseCase__Group__5__Impl2682);
            	    rule__UseCase__FlowsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getFlowsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__5__Impl"


    // $ANTLR start "rule__UseCase__Group__6"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1294:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1298:1: ( rule__UseCase__Group__6__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1299:2: rule__UseCase__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__UseCase__Group__6__Impl_in_rule__UseCase__Group__62713);
            rule__UseCase__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__6"


    // $ANTLR start "rule__UseCase__Group__6__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1305:1: rule__UseCase__Group__6__Impl : ( 'end usecase' ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1309:1: ( ( 'end usecase' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1310:1: ( 'end usecase' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1310:1: ( 'end usecase' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1311:1: 'end usecase'
            {
             before(grammarAccess.getUseCaseAccess().getEndUsecaseKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__UseCase__Group__6__Impl2741); 
             after(grammarAccess.getUseCaseAccess().getEndUsecaseKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__6__Impl"


    // $ANTLR start "rule__UseCase__Group_3__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1338:1: rule__UseCase__Group_3__0 : rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 ;
    public final void rule__UseCase__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1342:1: ( rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1343:2: rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1
            {
            pushFollow(FOLLOW_rule__UseCase__Group_3__0__Impl_in_rule__UseCase__Group_3__02786);
            rule__UseCase__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group_3__1_in_rule__UseCase__Group_3__02789);
            rule__UseCase__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_3__0"


    // $ANTLR start "rule__UseCase__Group_3__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1350:1: rule__UseCase__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__UseCase__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1354:1: ( ( 'extends' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1355:1: ( 'extends' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1355:1: ( 'extends' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1356:1: 'extends'
            {
             before(grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__UseCase__Group_3__0__Impl2817); 
             after(grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_3__0__Impl"


    // $ANTLR start "rule__UseCase__Group_3__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1369:1: rule__UseCase__Group_3__1 : rule__UseCase__Group_3__1__Impl ;
    public final void rule__UseCase__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1373:1: ( rule__UseCase__Group_3__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1374:2: rule__UseCase__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UseCase__Group_3__1__Impl_in_rule__UseCase__Group_3__12848);
            rule__UseCase__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_3__1"


    // $ANTLR start "rule__UseCase__Group_3__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1380:1: rule__UseCase__Group_3__1__Impl : ( ( rule__UseCase__SuperCaseAssignment_3_1 ) ) ;
    public final void rule__UseCase__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1384:1: ( ( ( rule__UseCase__SuperCaseAssignment_3_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1385:1: ( ( rule__UseCase__SuperCaseAssignment_3_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1385:1: ( ( rule__UseCase__SuperCaseAssignment_3_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1386:1: ( rule__UseCase__SuperCaseAssignment_3_1 )
            {
             before(grammarAccess.getUseCaseAccess().getSuperCaseAssignment_3_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1387:1: ( rule__UseCase__SuperCaseAssignment_3_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1387:2: rule__UseCase__SuperCaseAssignment_3_1
            {
            pushFollow(FOLLOW_rule__UseCase__SuperCaseAssignment_3_1_in_rule__UseCase__Group_3__1__Impl2875);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_3__1__Impl"


    // $ANTLR start "rule__UseCase__Group_4_0__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1401:1: rule__UseCase__Group_4_0__0 : rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1 ;
    public final void rule__UseCase__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1405:1: ( rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1406:2: rule__UseCase__Group_4_0__0__Impl rule__UseCase__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__UseCase__Group_4_0__0__Impl_in_rule__UseCase__Group_4_0__02909);
            rule__UseCase__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group_4_0__1_in_rule__UseCase__Group_4_0__02912);
            rule__UseCase__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_4_0__0"


    // $ANTLR start "rule__UseCase__Group_4_0__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1413:1: rule__UseCase__Group_4_0__0__Impl : ( 'preconditions' ) ;
    public final void rule__UseCase__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1417:1: ( ( 'preconditions' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1418:1: ( 'preconditions' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1418:1: ( 'preconditions' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1419:1: 'preconditions'
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsKeyword_4_0_0()); 
            match(input,26,FOLLOW_26_in_rule__UseCase__Group_4_0__0__Impl2940); 
             after(grammarAccess.getUseCaseAccess().getPreconditionsKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_4_0__0__Impl"


    // $ANTLR start "rule__UseCase__Group_4_0__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1432:1: rule__UseCase__Group_4_0__1 : rule__UseCase__Group_4_0__1__Impl ;
    public final void rule__UseCase__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1436:1: ( rule__UseCase__Group_4_0__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1437:2: rule__UseCase__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__UseCase__Group_4_0__1__Impl_in_rule__UseCase__Group_4_0__12971);
            rule__UseCase__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_4_0__1"


    // $ANTLR start "rule__UseCase__Group_4_0__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1443:1: rule__UseCase__Group_4_0__1__Impl : ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) ) ;
    public final void rule__UseCase__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1447:1: ( ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1448:1: ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1448:1: ( ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1449:1: ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) ) ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1449:1: ( ( rule__UseCase__PreconditionsAssignment_4_0_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1450:1: ( rule__UseCase__PreconditionsAssignment_4_0_1 )
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_4_0_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1451:1: ( rule__UseCase__PreconditionsAssignment_4_0_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1451:2: rule__UseCase__PreconditionsAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl3000);
            rule__UseCase__PreconditionsAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_4_0_1()); 

            }

            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1454:1: ( ( rule__UseCase__PreconditionsAssignment_4_0_1 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1455:1: ( rule__UseCase__PreconditionsAssignment_4_0_1 )*
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_4_0_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1456:1: ( rule__UseCase__PreconditionsAssignment_4_0_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1456:2: rule__UseCase__PreconditionsAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl3012);
            	    rule__UseCase__PreconditionsAssignment_4_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_4_0__1__Impl"


    // $ANTLR start "rule__UseCase__Group_4_1__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1471:1: rule__UseCase__Group_4_1__0 : rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1 ;
    public final void rule__UseCase__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1475:1: ( rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1476:2: rule__UseCase__Group_4_1__0__Impl rule__UseCase__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__UseCase__Group_4_1__0__Impl_in_rule__UseCase__Group_4_1__03049);
            rule__UseCase__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group_4_1__1_in_rule__UseCase__Group_4_1__03052);
            rule__UseCase__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_4_1__0"


    // $ANTLR start "rule__UseCase__Group_4_1__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1483:1: rule__UseCase__Group_4_1__0__Impl : ( 'postcondition' ) ;
    public final void rule__UseCase__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1487:1: ( ( 'postcondition' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1488:1: ( 'postcondition' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1488:1: ( 'postcondition' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1489:1: 'postcondition'
            {
             before(grammarAccess.getUseCaseAccess().getPostconditionKeyword_4_1_0()); 
            match(input,27,FOLLOW_27_in_rule__UseCase__Group_4_1__0__Impl3080); 
             after(grammarAccess.getUseCaseAccess().getPostconditionKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_4_1__0__Impl"


    // $ANTLR start "rule__UseCase__Group_4_1__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1502:1: rule__UseCase__Group_4_1__1 : rule__UseCase__Group_4_1__1__Impl ;
    public final void rule__UseCase__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1506:1: ( rule__UseCase__Group_4_1__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1507:2: rule__UseCase__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UseCase__Group_4_1__1__Impl_in_rule__UseCase__Group_4_1__13111);
            rule__UseCase__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_4_1__1"


    // $ANTLR start "rule__UseCase__Group_4_1__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1513:1: rule__UseCase__Group_4_1__1__Impl : ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) ) ;
    public final void rule__UseCase__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1517:1: ( ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1518:1: ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1518:1: ( ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1519:1: ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) ) ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1519:1: ( ( rule__UseCase__PostconditionsAssignment_4_1_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1520:1: ( rule__UseCase__PostconditionsAssignment_4_1_1 )
            {
             before(grammarAccess.getUseCaseAccess().getPostconditionsAssignment_4_1_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1521:1: ( rule__UseCase__PostconditionsAssignment_4_1_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1521:2: rule__UseCase__PostconditionsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3140);
            rule__UseCase__PostconditionsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getPostconditionsAssignment_4_1_1()); 

            }

            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1524:1: ( ( rule__UseCase__PostconditionsAssignment_4_1_1 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1525:1: ( rule__UseCase__PostconditionsAssignment_4_1_1 )*
            {
             before(grammarAccess.getUseCaseAccess().getPostconditionsAssignment_4_1_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1526:1: ( rule__UseCase__PostconditionsAssignment_4_1_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1526:2: rule__UseCase__PostconditionsAssignment_4_1_1
            	    {
            	    pushFollow(FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3152);
            	    rule__UseCase__PostconditionsAssignment_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_4_1__1__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1541:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1545:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1546:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03189);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03192);
            rule__Actor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1553:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__NameAssignment_0 ) ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1557:1: ( ( ( rule__Actor__NameAssignment_0 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1558:1: ( ( rule__Actor__NameAssignment_0 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1558:1: ( ( rule__Actor__NameAssignment_0 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1559:1: ( rule__Actor__NameAssignment_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1560:1: ( rule__Actor__NameAssignment_0 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1560:2: rule__Actor__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3219);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1570:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1574:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1575:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13249);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13252);
            rule__Actor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1582:1: rule__Actor__Group__1__Impl : ( 'as' ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1586:1: ( ( 'as' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1587:1: ( 'as' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1587:1: ( 'as' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1588:1: 'as'
            {
             before(grammarAccess.getActorAccess().getAsKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Actor__Group__1__Impl3280); 
             after(grammarAccess.getActorAccess().getAsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1601:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1605:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1606:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23311);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23314);
            rule__Actor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1613:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__TypeAssignment_2 ) ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1617:1: ( ( ( rule__Actor__TypeAssignment_2 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1618:1: ( ( rule__Actor__TypeAssignment_2 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1618:1: ( ( rule__Actor__TypeAssignment_2 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1619:1: ( rule__Actor__TypeAssignment_2 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_2()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1620:1: ( rule__Actor__TypeAssignment_2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1620:2: rule__Actor__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Actor__TypeAssignment_2_in_rule__Actor__Group__2__Impl3341);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1630:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1634:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1635:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
            {
            pushFollow(FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__33371);
            rule__Actor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__4_in_rule__Actor__Group__33374);
            rule__Actor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1642:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__DescriptionAssignment_3 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1646:1: ( ( ( rule__Actor__DescriptionAssignment_3 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1647:1: ( ( rule__Actor__DescriptionAssignment_3 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1647:1: ( ( rule__Actor__DescriptionAssignment_3 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1648:1: ( rule__Actor__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getActorAccess().getDescriptionAssignment_3()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1649:1: ( rule__Actor__DescriptionAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1649:2: rule__Actor__DescriptionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Actor__DescriptionAssignment_3_in_rule__Actor__Group__3__Impl3401);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Actor__Group__4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1659:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1663:1: ( rule__Actor__Group__4__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1664:2: rule__Actor__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Actor__Group__4__Impl_in_rule__Actor__Group__43432);
            rule__Actor__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4"


    // $ANTLR start "rule__Actor__Group__4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1670:1: rule__Actor__Group__4__Impl : ( ( rule__Actor__Group_4__0 )? ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1674:1: ( ( ( rule__Actor__Group_4__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1675:1: ( ( rule__Actor__Group_4__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1675:1: ( ( rule__Actor__Group_4__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1676:1: ( rule__Actor__Group_4__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_4()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1677:1: ( rule__Actor__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1677:2: rule__Actor__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Actor__Group_4__0_in_rule__Actor__Group__4__Impl3459);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group_4__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1697:1: rule__Actor__Group_4__0 : rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1 ;
    public final void rule__Actor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1701:1: ( rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1702:2: rule__Actor__Group_4__0__Impl rule__Actor__Group_4__1
            {
            pushFollow(FOLLOW_rule__Actor__Group_4__0__Impl_in_rule__Actor__Group_4__03500);
            rule__Actor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actor__Group_4__1_in_rule__Actor__Group_4__03503);
            rule__Actor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_4__0"


    // $ANTLR start "rule__Actor__Group_4__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1709:1: rule__Actor__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Actor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1713:1: ( ( 'extends' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1714:1: ( 'extends' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1714:1: ( 'extends' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1715:1: 'extends'
            {
             before(grammarAccess.getActorAccess().getExtendsKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Actor__Group_4__0__Impl3531); 
             after(grammarAccess.getActorAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_4__0__Impl"


    // $ANTLR start "rule__Actor__Group_4__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1728:1: rule__Actor__Group_4__1 : rule__Actor__Group_4__1__Impl ;
    public final void rule__Actor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1732:1: ( rule__Actor__Group_4__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1733:2: rule__Actor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Actor__Group_4__1__Impl_in_rule__Actor__Group_4__13562);
            rule__Actor__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_4__1"


    // $ANTLR start "rule__Actor__Group_4__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1739:1: rule__Actor__Group_4__1__Impl : ( ( rule__Actor__ExtendsAssignment_4_1 ) ) ;
    public final void rule__Actor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1743:1: ( ( ( rule__Actor__ExtendsAssignment_4_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1744:1: ( ( rule__Actor__ExtendsAssignment_4_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1744:1: ( ( rule__Actor__ExtendsAssignment_4_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1745:1: ( rule__Actor__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getActorAccess().getExtendsAssignment_4_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1746:1: ( rule__Actor__ExtendsAssignment_4_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1746:2: rule__Actor__ExtendsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Actor__ExtendsAssignment_4_1_in_rule__Actor__Group_4__1__Impl3589);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_4__1__Impl"


    // $ANTLR start "rule__BasicFlow__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1760:1: rule__BasicFlow__Group__0 : rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1 ;
    public final void rule__BasicFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1764:1: ( rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1765:2: rule__BasicFlow__Group__0__Impl rule__BasicFlow__Group__1
            {
            pushFollow(FOLLOW_rule__BasicFlow__Group__0__Impl_in_rule__BasicFlow__Group__03623);
            rule__BasicFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicFlow__Group__1_in_rule__BasicFlow__Group__03626);
            rule__BasicFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__0"


    // $ANTLR start "rule__BasicFlow__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1772:1: rule__BasicFlow__Group__0__Impl : ( 'basic flow' ) ;
    public final void rule__BasicFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1776:1: ( ( 'basic flow' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1777:1: ( 'basic flow' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1777:1: ( 'basic flow' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1778:1: 'basic flow'
            {
             before(grammarAccess.getBasicFlowAccess().getBasicFlowKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__BasicFlow__Group__0__Impl3654); 
             after(grammarAccess.getBasicFlowAccess().getBasicFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__0__Impl"


    // $ANTLR start "rule__BasicFlow__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1791:1: rule__BasicFlow__Group__1 : rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2 ;
    public final void rule__BasicFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1795:1: ( rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1796:2: rule__BasicFlow__Group__1__Impl rule__BasicFlow__Group__2
            {
            pushFollow(FOLLOW_rule__BasicFlow__Group__1__Impl_in_rule__BasicFlow__Group__13685);
            rule__BasicFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicFlow__Group__2_in_rule__BasicFlow__Group__13688);
            rule__BasicFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__1"


    // $ANTLR start "rule__BasicFlow__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1803:1: rule__BasicFlow__Group__1__Impl : ( () ) ;
    public final void rule__BasicFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1807:1: ( ( () ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1808:1: ( () )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1808:1: ( () )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1809:1: ()
            {
             before(grammarAccess.getBasicFlowAccess().getBasicFlowAction_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1810:1: ()
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1812:1: 
            {
            }

             after(grammarAccess.getBasicFlowAccess().getBasicFlowAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__1__Impl"


    // $ANTLR start "rule__BasicFlow__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1822:1: rule__BasicFlow__Group__2 : rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3 ;
    public final void rule__BasicFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1826:1: ( rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1827:2: rule__BasicFlow__Group__2__Impl rule__BasicFlow__Group__3
            {
            pushFollow(FOLLOW_rule__BasicFlow__Group__2__Impl_in_rule__BasicFlow__Group__23746);
            rule__BasicFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicFlow__Group__3_in_rule__BasicFlow__Group__23749);
            rule__BasicFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__2"


    // $ANTLR start "rule__BasicFlow__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1834:1: rule__BasicFlow__Group__2__Impl : ( ( rule__BasicFlow__StepsAssignment_2 )* ) ;
    public final void rule__BasicFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1838:1: ( ( ( rule__BasicFlow__StepsAssignment_2 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1839:1: ( ( rule__BasicFlow__StepsAssignment_2 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1839:1: ( ( rule__BasicFlow__StepsAssignment_2 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1840:1: ( rule__BasicFlow__StepsAssignment_2 )*
            {
             before(grammarAccess.getBasicFlowAccess().getStepsAssignment_2()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1841:1: ( rule__BasicFlow__StepsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39||LA21_0==42) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1841:2: rule__BasicFlow__StepsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BasicFlow__StepsAssignment_2_in_rule__BasicFlow__Group__2__Impl3776);
            	    rule__BasicFlow__StepsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBasicFlowAccess().getStepsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__2__Impl"


    // $ANTLR start "rule__BasicFlow__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1851:1: rule__BasicFlow__Group__3 : rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4 ;
    public final void rule__BasicFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1855:1: ( rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1856:2: rule__BasicFlow__Group__3__Impl rule__BasicFlow__Group__4
            {
            pushFollow(FOLLOW_rule__BasicFlow__Group__3__Impl_in_rule__BasicFlow__Group__33807);
            rule__BasicFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicFlow__Group__4_in_rule__BasicFlow__Group__33810);
            rule__BasicFlow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__3"


    // $ANTLR start "rule__BasicFlow__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1863:1: rule__BasicFlow__Group__3__Impl : ( 'end flow' ) ;
    public final void rule__BasicFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1867:1: ( ( 'end flow' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1868:1: ( 'end flow' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1868:1: ( 'end flow' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1869:1: 'end flow'
            {
             before(grammarAccess.getBasicFlowAccess().getEndFlowKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__BasicFlow__Group__3__Impl3838); 
             after(grammarAccess.getBasicFlowAccess().getEndFlowKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__3__Impl"


    // $ANTLR start "rule__BasicFlow__Group__4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1882:1: rule__BasicFlow__Group__4 : rule__BasicFlow__Group__4__Impl ;
    public final void rule__BasicFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1886:1: ( rule__BasicFlow__Group__4__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1887:2: rule__BasicFlow__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BasicFlow__Group__4__Impl_in_rule__BasicFlow__Group__43869);
            rule__BasicFlow__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__4"


    // $ANTLR start "rule__BasicFlow__Group__4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1893:1: rule__BasicFlow__Group__4__Impl : ( ( rule__BasicFlow__Group_4__0 )? ) ;
    public final void rule__BasicFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1897:1: ( ( ( rule__BasicFlow__Group_4__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1898:1: ( ( rule__BasicFlow__Group_4__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1898:1: ( ( rule__BasicFlow__Group_4__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1899:1: ( rule__BasicFlow__Group_4__0 )?
            {
             before(grammarAccess.getBasicFlowAccess().getGroup_4()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1900:1: ( rule__BasicFlow__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1900:2: rule__BasicFlow__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__BasicFlow__Group_4__0_in_rule__BasicFlow__Group__4__Impl3896);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group__4__Impl"


    // $ANTLR start "rule__BasicFlow__Group_4__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1920:1: rule__BasicFlow__Group_4__0 : rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1 ;
    public final void rule__BasicFlow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1924:1: ( rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1925:2: rule__BasicFlow__Group_4__0__Impl rule__BasicFlow__Group_4__1
            {
            pushFollow(FOLLOW_rule__BasicFlow__Group_4__0__Impl_in_rule__BasicFlow__Group_4__03937);
            rule__BasicFlow__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BasicFlow__Group_4__1_in_rule__BasicFlow__Group_4__03940);
            rule__BasicFlow__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group_4__0"


    // $ANTLR start "rule__BasicFlow__Group_4__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1932:1: rule__BasicFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
    public final void rule__BasicFlow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1936:1: ( ( 'with postcondition' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1937:1: ( 'with postcondition' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1937:1: ( 'with postcondition' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1938:1: 'with postcondition'
            {
             before(grammarAccess.getBasicFlowAccess().getWithPostconditionKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__BasicFlow__Group_4__0__Impl3968); 
             after(grammarAccess.getBasicFlowAccess().getWithPostconditionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group_4__0__Impl"


    // $ANTLR start "rule__BasicFlow__Group_4__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1951:1: rule__BasicFlow__Group_4__1 : rule__BasicFlow__Group_4__1__Impl ;
    public final void rule__BasicFlow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1955:1: ( rule__BasicFlow__Group_4__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1956:2: rule__BasicFlow__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__BasicFlow__Group_4__1__Impl_in_rule__BasicFlow__Group_4__13999);
            rule__BasicFlow__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group_4__1"


    // $ANTLR start "rule__BasicFlow__Group_4__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1962:1: rule__BasicFlow__Group_4__1__Impl : ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) ) ;
    public final void rule__BasicFlow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1966:1: ( ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1967:1: ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1967:1: ( ( rule__BasicFlow__FinalStateAssignment_4_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1968:1: ( rule__BasicFlow__FinalStateAssignment_4_1 )
            {
             before(grammarAccess.getBasicFlowAccess().getFinalStateAssignment_4_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1969:1: ( rule__BasicFlow__FinalStateAssignment_4_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1969:2: rule__BasicFlow__FinalStateAssignment_4_1
            {
            pushFollow(FOLLOW_rule__BasicFlow__FinalStateAssignment_4_1_in_rule__BasicFlow__Group_4__1__Impl4026);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__Group_4__1__Impl"


    // $ANTLR start "rule__ExceptionFlow__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1983:1: rule__ExceptionFlow__Group__0 : rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1 ;
    public final void rule__ExceptionFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1987:1: ( rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1988:2: rule__ExceptionFlow__Group__0__Impl rule__ExceptionFlow__Group__1
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__Group__0__Impl_in_rule__ExceptionFlow__Group__04060);
            rule__ExceptionFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionFlow__Group__1_in_rule__ExceptionFlow__Group__04063);
            rule__ExceptionFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__0"


    // $ANTLR start "rule__ExceptionFlow__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1995:1: rule__ExceptionFlow__Group__0__Impl : ( 'exception flow' ) ;
    public final void rule__ExceptionFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:1999:1: ( ( 'exception flow' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2000:1: ( 'exception flow' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2000:1: ( 'exception flow' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2001:1: 'exception flow'
            {
             before(grammarAccess.getExceptionFlowAccess().getExceptionFlowKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ExceptionFlow__Group__0__Impl4091); 
             after(grammarAccess.getExceptionFlowAccess().getExceptionFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__0__Impl"


    // $ANTLR start "rule__ExceptionFlow__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2014:1: rule__ExceptionFlow__Group__1 : rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2 ;
    public final void rule__ExceptionFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2018:1: ( rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2019:2: rule__ExceptionFlow__Group__1__Impl rule__ExceptionFlow__Group__2
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__Group__1__Impl_in_rule__ExceptionFlow__Group__14122);
            rule__ExceptionFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionFlow__Group__2_in_rule__ExceptionFlow__Group__14125);
            rule__ExceptionFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__1"


    // $ANTLR start "rule__ExceptionFlow__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2026:1: rule__ExceptionFlow__Group__1__Impl : ( ( rule__ExceptionFlow__NameAssignment_1 ) ) ;
    public final void rule__ExceptionFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2030:1: ( ( ( rule__ExceptionFlow__NameAssignment_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2031:1: ( ( rule__ExceptionFlow__NameAssignment_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2031:1: ( ( rule__ExceptionFlow__NameAssignment_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2032:1: ( rule__ExceptionFlow__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionFlowAccess().getNameAssignment_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2033:1: ( rule__ExceptionFlow__NameAssignment_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2033:2: rule__ExceptionFlow__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__NameAssignment_1_in_rule__ExceptionFlow__Group__1__Impl4152);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__1__Impl"


    // $ANTLR start "rule__ExceptionFlow__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2043:1: rule__ExceptionFlow__Group__2 : rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3 ;
    public final void rule__ExceptionFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2047:1: ( rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2048:2: rule__ExceptionFlow__Group__2__Impl rule__ExceptionFlow__Group__3
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__Group__2__Impl_in_rule__ExceptionFlow__Group__24182);
            rule__ExceptionFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionFlow__Group__3_in_rule__ExceptionFlow__Group__24185);
            rule__ExceptionFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__2"


    // $ANTLR start "rule__ExceptionFlow__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2055:1: rule__ExceptionFlow__Group__2__Impl : ( 'if' ) ;
    public final void rule__ExceptionFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2059:1: ( ( 'if' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2060:1: ( 'if' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2060:1: ( 'if' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2061:1: 'if'
            {
             before(grammarAccess.getExceptionFlowAccess().getIfKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__ExceptionFlow__Group__2__Impl4213); 
             after(grammarAccess.getExceptionFlowAccess().getIfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__2__Impl"


    // $ANTLR start "rule__ExceptionFlow__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2074:1: rule__ExceptionFlow__Group__3 : rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4 ;
    public final void rule__ExceptionFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2078:1: ( rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2079:2: rule__ExceptionFlow__Group__3__Impl rule__ExceptionFlow__Group__4
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__Group__3__Impl_in_rule__ExceptionFlow__Group__34244);
            rule__ExceptionFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionFlow__Group__4_in_rule__ExceptionFlow__Group__34247);
            rule__ExceptionFlow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__3"


    // $ANTLR start "rule__ExceptionFlow__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2086:1: rule__ExceptionFlow__Group__3__Impl : ( ( rule__ExceptionFlow__ConditionAssignment_3 ) ) ;
    public final void rule__ExceptionFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2090:1: ( ( ( rule__ExceptionFlow__ConditionAssignment_3 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2091:1: ( ( rule__ExceptionFlow__ConditionAssignment_3 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2091:1: ( ( rule__ExceptionFlow__ConditionAssignment_3 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2092:1: ( rule__ExceptionFlow__ConditionAssignment_3 )
            {
             before(grammarAccess.getExceptionFlowAccess().getConditionAssignment_3()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2093:1: ( rule__ExceptionFlow__ConditionAssignment_3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2093:2: rule__ExceptionFlow__ConditionAssignment_3
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__ConditionAssignment_3_in_rule__ExceptionFlow__Group__3__Impl4274);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__3__Impl"


    // $ANTLR start "rule__ExceptionFlow__Group__4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2103:1: rule__ExceptionFlow__Group__4 : rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5 ;
    public final void rule__ExceptionFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2107:1: ( rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2108:2: rule__ExceptionFlow__Group__4__Impl rule__ExceptionFlow__Group__5
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__Group__4__Impl_in_rule__ExceptionFlow__Group__44304);
            rule__ExceptionFlow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionFlow__Group__5_in_rule__ExceptionFlow__Group__44307);
            rule__ExceptionFlow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__4"


    // $ANTLR start "rule__ExceptionFlow__Group__4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2115:1: rule__ExceptionFlow__Group__4__Impl : ( 'then' ) ;
    public final void rule__ExceptionFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2119:1: ( ( 'then' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2120:1: ( 'then' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2120:1: ( 'then' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2121:1: 'then'
            {
             before(grammarAccess.getExceptionFlowAccess().getThenKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__ExceptionFlow__Group__4__Impl4335); 
             after(grammarAccess.getExceptionFlowAccess().getThenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__4__Impl"


    // $ANTLR start "rule__ExceptionFlow__Group__5"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2134:1: rule__ExceptionFlow__Group__5 : rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6 ;
    public final void rule__ExceptionFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2138:1: ( rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2139:2: rule__ExceptionFlow__Group__5__Impl rule__ExceptionFlow__Group__6
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__Group__5__Impl_in_rule__ExceptionFlow__Group__54366);
            rule__ExceptionFlow__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionFlow__Group__6_in_rule__ExceptionFlow__Group__54369);
            rule__ExceptionFlow__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__5"


    // $ANTLR start "rule__ExceptionFlow__Group__5__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2146:1: rule__ExceptionFlow__Group__5__Impl : ( ( rule__ExceptionFlow__StepsAssignment_5 )* ) ;
    public final void rule__ExceptionFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2150:1: ( ( ( rule__ExceptionFlow__StepsAssignment_5 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2151:1: ( ( rule__ExceptionFlow__StepsAssignment_5 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2151:1: ( ( rule__ExceptionFlow__StepsAssignment_5 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2152:1: ( rule__ExceptionFlow__StepsAssignment_5 )*
            {
             before(grammarAccess.getExceptionFlowAccess().getStepsAssignment_5()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2153:1: ( rule__ExceptionFlow__StepsAssignment_5 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==39||LA23_0==42) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2153:2: rule__ExceptionFlow__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ExceptionFlow__StepsAssignment_5_in_rule__ExceptionFlow__Group__5__Impl4396);
            	    rule__ExceptionFlow__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getExceptionFlowAccess().getStepsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__5__Impl"


    // $ANTLR start "rule__ExceptionFlow__Group__6"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2163:1: rule__ExceptionFlow__Group__6 : rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7 ;
    public final void rule__ExceptionFlow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2167:1: ( rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2168:2: rule__ExceptionFlow__Group__6__Impl rule__ExceptionFlow__Group__7
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__Group__6__Impl_in_rule__ExceptionFlow__Group__64427);
            rule__ExceptionFlow__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionFlow__Group__7_in_rule__ExceptionFlow__Group__64430);
            rule__ExceptionFlow__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__6"


    // $ANTLR start "rule__ExceptionFlow__Group__6__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2175:1: rule__ExceptionFlow__Group__6__Impl : ( 'end flow' ) ;
    public final void rule__ExceptionFlow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2179:1: ( ( 'end flow' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2180:1: ( 'end flow' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2180:1: ( 'end flow' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2181:1: 'end flow'
            {
             before(grammarAccess.getExceptionFlowAccess().getEndFlowKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__ExceptionFlow__Group__6__Impl4458); 
             after(grammarAccess.getExceptionFlowAccess().getEndFlowKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__6__Impl"


    // $ANTLR start "rule__ExceptionFlow__Group__7"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2194:1: rule__ExceptionFlow__Group__7 : rule__ExceptionFlow__Group__7__Impl ;
    public final void rule__ExceptionFlow__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2198:1: ( rule__ExceptionFlow__Group__7__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2199:2: rule__ExceptionFlow__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__Group__7__Impl_in_rule__ExceptionFlow__Group__74489);
            rule__ExceptionFlow__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__7"


    // $ANTLR start "rule__ExceptionFlow__Group__7__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2205:1: rule__ExceptionFlow__Group__7__Impl : ( ( rule__ExceptionFlow__Group_7__0 )? ) ;
    public final void rule__ExceptionFlow__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2209:1: ( ( ( rule__ExceptionFlow__Group_7__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2210:1: ( ( rule__ExceptionFlow__Group_7__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2210:1: ( ( rule__ExceptionFlow__Group_7__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2211:1: ( rule__ExceptionFlow__Group_7__0 )?
            {
             before(grammarAccess.getExceptionFlowAccess().getGroup_7()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2212:1: ( rule__ExceptionFlow__Group_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2212:2: rule__ExceptionFlow__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__0_in_rule__ExceptionFlow__Group__7__Impl4516);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group__7__Impl"


    // $ANTLR start "rule__ExceptionFlow__Group_7__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2238:1: rule__ExceptionFlow__Group_7__0 : rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1 ;
    public final void rule__ExceptionFlow__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2242:1: ( rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2243:2: rule__ExceptionFlow__Group_7__0__Impl rule__ExceptionFlow__Group_7__1
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__0__Impl_in_rule__ExceptionFlow__Group_7__04563);
            rule__ExceptionFlow__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__1_in_rule__ExceptionFlow__Group_7__04566);
            rule__ExceptionFlow__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group_7__0"


    // $ANTLR start "rule__ExceptionFlow__Group_7__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2250:1: rule__ExceptionFlow__Group_7__0__Impl : ( 'with postcondition' ) ;
    public final void rule__ExceptionFlow__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2254:1: ( ( 'with postcondition' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2255:1: ( 'with postcondition' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2255:1: ( 'with postcondition' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2256:1: 'with postcondition'
            {
             before(grammarAccess.getExceptionFlowAccess().getWithPostconditionKeyword_7_0()); 
            match(input,31,FOLLOW_31_in_rule__ExceptionFlow__Group_7__0__Impl4594); 
             after(grammarAccess.getExceptionFlowAccess().getWithPostconditionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group_7__0__Impl"


    // $ANTLR start "rule__ExceptionFlow__Group_7__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2269:1: rule__ExceptionFlow__Group_7__1 : rule__ExceptionFlow__Group_7__1__Impl ;
    public final void rule__ExceptionFlow__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2273:1: ( rule__ExceptionFlow__Group_7__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2274:2: rule__ExceptionFlow__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__Group_7__1__Impl_in_rule__ExceptionFlow__Group_7__14625);
            rule__ExceptionFlow__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group_7__1"


    // $ANTLR start "rule__ExceptionFlow__Group_7__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2280:1: rule__ExceptionFlow__Group_7__1__Impl : ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) ) ;
    public final void rule__ExceptionFlow__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2284:1: ( ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2285:1: ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2285:1: ( ( rule__ExceptionFlow__FinalStateAssignment_7_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2286:1: ( rule__ExceptionFlow__FinalStateAssignment_7_1 )
            {
             before(grammarAccess.getExceptionFlowAccess().getFinalStateAssignment_7_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2287:1: ( rule__ExceptionFlow__FinalStateAssignment_7_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2287:2: rule__ExceptionFlow__FinalStateAssignment_7_1
            {
            pushFollow(FOLLOW_rule__ExceptionFlow__FinalStateAssignment_7_1_in_rule__ExceptionFlow__Group_7__1__Impl4652);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__Group_7__1__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2301:1: rule__AlternativeFlow__Group__0 : rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1 ;
    public final void rule__AlternativeFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2305:1: ( rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2306:2: rule__AlternativeFlow__Group__0__Impl rule__AlternativeFlow__Group__1
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__0__Impl_in_rule__AlternativeFlow__Group__04686);
            rule__AlternativeFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__1_in_rule__AlternativeFlow__Group__04689);
            rule__AlternativeFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__0"


    // $ANTLR start "rule__AlternativeFlow__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2313:1: rule__AlternativeFlow__Group__0__Impl : ( 'alternative flow' ) ;
    public final void rule__AlternativeFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2317:1: ( ( 'alternative flow' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2318:1: ( 'alternative flow' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2318:1: ( 'alternative flow' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2319:1: 'alternative flow'
            {
             before(grammarAccess.getAlternativeFlowAccess().getAlternativeFlowKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__AlternativeFlow__Group__0__Impl4717); 
             after(grammarAccess.getAlternativeFlowAccess().getAlternativeFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__0__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2332:1: rule__AlternativeFlow__Group__1 : rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2 ;
    public final void rule__AlternativeFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2336:1: ( rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2337:2: rule__AlternativeFlow__Group__1__Impl rule__AlternativeFlow__Group__2
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__1__Impl_in_rule__AlternativeFlow__Group__14748);
            rule__AlternativeFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__2_in_rule__AlternativeFlow__Group__14751);
            rule__AlternativeFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__1"


    // $ANTLR start "rule__AlternativeFlow__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2344:1: rule__AlternativeFlow__Group__1__Impl : ( ( rule__AlternativeFlow__NameAssignment_1 ) ) ;
    public final void rule__AlternativeFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2348:1: ( ( ( rule__AlternativeFlow__NameAssignment_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2349:1: ( ( rule__AlternativeFlow__NameAssignment_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2349:1: ( ( rule__AlternativeFlow__NameAssignment_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2350:1: ( rule__AlternativeFlow__NameAssignment_1 )
            {
             before(grammarAccess.getAlternativeFlowAccess().getNameAssignment_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2351:1: ( rule__AlternativeFlow__NameAssignment_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2351:2: rule__AlternativeFlow__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__NameAssignment_1_in_rule__AlternativeFlow__Group__1__Impl4778);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__1__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2361:1: rule__AlternativeFlow__Group__2 : rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3 ;
    public final void rule__AlternativeFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2365:1: ( rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2366:2: rule__AlternativeFlow__Group__2__Impl rule__AlternativeFlow__Group__3
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__2__Impl_in_rule__AlternativeFlow__Group__24808);
            rule__AlternativeFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__3_in_rule__AlternativeFlow__Group__24811);
            rule__AlternativeFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__2"


    // $ANTLR start "rule__AlternativeFlow__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2373:1: rule__AlternativeFlow__Group__2__Impl : ( ( rule__AlternativeFlow__StepsAssignment_2 )* ) ;
    public final void rule__AlternativeFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2377:1: ( ( ( rule__AlternativeFlow__StepsAssignment_2 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2378:1: ( ( rule__AlternativeFlow__StepsAssignment_2 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2378:1: ( ( rule__AlternativeFlow__StepsAssignment_2 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2379:1: ( rule__AlternativeFlow__StepsAssignment_2 )*
            {
             before(grammarAccess.getAlternativeFlowAccess().getStepsAssignment_2()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2380:1: ( rule__AlternativeFlow__StepsAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==39||LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2380:2: rule__AlternativeFlow__StepsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AlternativeFlow__StepsAssignment_2_in_rule__AlternativeFlow__Group__2__Impl4838);
            	    rule__AlternativeFlow__StepsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAlternativeFlowAccess().getStepsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__2__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2390:1: rule__AlternativeFlow__Group__3 : rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4 ;
    public final void rule__AlternativeFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2394:1: ( rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2395:2: rule__AlternativeFlow__Group__3__Impl rule__AlternativeFlow__Group__4
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__3__Impl_in_rule__AlternativeFlow__Group__34869);
            rule__AlternativeFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group__4_in_rule__AlternativeFlow__Group__34872);
            rule__AlternativeFlow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__3"


    // $ANTLR start "rule__AlternativeFlow__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2402:1: rule__AlternativeFlow__Group__3__Impl : ( 'end flow' ) ;
    public final void rule__AlternativeFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2406:1: ( ( 'end flow' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2407:1: ( 'end flow' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2407:1: ( 'end flow' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2408:1: 'end flow'
            {
             before(grammarAccess.getAlternativeFlowAccess().getEndFlowKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__AlternativeFlow__Group__3__Impl4900); 
             after(grammarAccess.getAlternativeFlowAccess().getEndFlowKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__3__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group__4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2421:1: rule__AlternativeFlow__Group__4 : rule__AlternativeFlow__Group__4__Impl ;
    public final void rule__AlternativeFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2425:1: ( rule__AlternativeFlow__Group__4__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2426:2: rule__AlternativeFlow__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group__4__Impl_in_rule__AlternativeFlow__Group__44931);
            rule__AlternativeFlow__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__4"


    // $ANTLR start "rule__AlternativeFlow__Group__4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2432:1: rule__AlternativeFlow__Group__4__Impl : ( ( rule__AlternativeFlow__Group_4__0 )? ) ;
    public final void rule__AlternativeFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2436:1: ( ( ( rule__AlternativeFlow__Group_4__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2437:1: ( ( rule__AlternativeFlow__Group_4__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2437:1: ( ( rule__AlternativeFlow__Group_4__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2438:1: ( rule__AlternativeFlow__Group_4__0 )?
            {
             before(grammarAccess.getAlternativeFlowAccess().getGroup_4()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2439:1: ( rule__AlternativeFlow__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2439:2: rule__AlternativeFlow__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__0_in_rule__AlternativeFlow__Group__4__Impl4958);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group__4__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group_4__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2459:1: rule__AlternativeFlow__Group_4__0 : rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1 ;
    public final void rule__AlternativeFlow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2463:1: ( rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2464:2: rule__AlternativeFlow__Group_4__0__Impl rule__AlternativeFlow__Group_4__1
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__0__Impl_in_rule__AlternativeFlow__Group_4__04999);
            rule__AlternativeFlow__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__1_in_rule__AlternativeFlow__Group_4__05002);
            rule__AlternativeFlow__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group_4__0"


    // $ANTLR start "rule__AlternativeFlow__Group_4__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2471:1: rule__AlternativeFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
    public final void rule__AlternativeFlow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2475:1: ( ( 'with postcondition' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2476:1: ( 'with postcondition' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2476:1: ( 'with postcondition' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2477:1: 'with postcondition'
            {
             before(grammarAccess.getAlternativeFlowAccess().getWithPostconditionKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__AlternativeFlow__Group_4__0__Impl5030); 
             after(grammarAccess.getAlternativeFlowAccess().getWithPostconditionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group_4__0__Impl"


    // $ANTLR start "rule__AlternativeFlow__Group_4__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2490:1: rule__AlternativeFlow__Group_4__1 : rule__AlternativeFlow__Group_4__1__Impl ;
    public final void rule__AlternativeFlow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2494:1: ( rule__AlternativeFlow__Group_4__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2495:2: rule__AlternativeFlow__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__Group_4__1__Impl_in_rule__AlternativeFlow__Group_4__15061);
            rule__AlternativeFlow__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group_4__1"


    // $ANTLR start "rule__AlternativeFlow__Group_4__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2501:1: rule__AlternativeFlow__Group_4__1__Impl : ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) ) ;
    public final void rule__AlternativeFlow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2505:1: ( ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2506:1: ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2506:1: ( ( rule__AlternativeFlow__FinalStateAssignment_4_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2507:1: ( rule__AlternativeFlow__FinalStateAssignment_4_1 )
            {
             before(grammarAccess.getAlternativeFlowAccess().getFinalStateAssignment_4_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2508:1: ( rule__AlternativeFlow__FinalStateAssignment_4_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2508:2: rule__AlternativeFlow__FinalStateAssignment_4_1
            {
            pushFollow(FOLLOW_rule__AlternativeFlow__FinalStateAssignment_4_1_in_rule__AlternativeFlow__Group_4__1__Impl5088);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__Group_4__1__Impl"


    // $ANTLR start "rule__ParallelFlow__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2522:1: rule__ParallelFlow__Group__0 : rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1 ;
    public final void rule__ParallelFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2526:1: ( rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2527:2: rule__ParallelFlow__Group__0__Impl rule__ParallelFlow__Group__1
            {
            pushFollow(FOLLOW_rule__ParallelFlow__Group__0__Impl_in_rule__ParallelFlow__Group__05122);
            rule__ParallelFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelFlow__Group__1_in_rule__ParallelFlow__Group__05125);
            rule__ParallelFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group__0"


    // $ANTLR start "rule__ParallelFlow__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2534:1: rule__ParallelFlow__Group__0__Impl : ( 'parallel flow' ) ;
    public final void rule__ParallelFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2538:1: ( ( 'parallel flow' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2539:1: ( 'parallel flow' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2539:1: ( 'parallel flow' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2540:1: 'parallel flow'
            {
             before(grammarAccess.getParallelFlowAccess().getParallelFlowKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__ParallelFlow__Group__0__Impl5153); 
             after(grammarAccess.getParallelFlowAccess().getParallelFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group__0__Impl"


    // $ANTLR start "rule__ParallelFlow__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2553:1: rule__ParallelFlow__Group__1 : rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2 ;
    public final void rule__ParallelFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2557:1: ( rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2558:2: rule__ParallelFlow__Group__1__Impl rule__ParallelFlow__Group__2
            {
            pushFollow(FOLLOW_rule__ParallelFlow__Group__1__Impl_in_rule__ParallelFlow__Group__15184);
            rule__ParallelFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelFlow__Group__2_in_rule__ParallelFlow__Group__15187);
            rule__ParallelFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group__1"


    // $ANTLR start "rule__ParallelFlow__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2565:1: rule__ParallelFlow__Group__1__Impl : ( ( rule__ParallelFlow__NameAssignment_1 ) ) ;
    public final void rule__ParallelFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2569:1: ( ( ( rule__ParallelFlow__NameAssignment_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2570:1: ( ( rule__ParallelFlow__NameAssignment_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2570:1: ( ( rule__ParallelFlow__NameAssignment_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2571:1: ( rule__ParallelFlow__NameAssignment_1 )
            {
             before(grammarAccess.getParallelFlowAccess().getNameAssignment_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2572:1: ( rule__ParallelFlow__NameAssignment_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2572:2: rule__ParallelFlow__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ParallelFlow__NameAssignment_1_in_rule__ParallelFlow__Group__1__Impl5214);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group__1__Impl"


    // $ANTLR start "rule__ParallelFlow__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2582:1: rule__ParallelFlow__Group__2 : rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3 ;
    public final void rule__ParallelFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2586:1: ( rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2587:2: rule__ParallelFlow__Group__2__Impl rule__ParallelFlow__Group__3
            {
            pushFollow(FOLLOW_rule__ParallelFlow__Group__2__Impl_in_rule__ParallelFlow__Group__25244);
            rule__ParallelFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelFlow__Group__3_in_rule__ParallelFlow__Group__25247);
            rule__ParallelFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group__2"


    // $ANTLR start "rule__ParallelFlow__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2594:1: rule__ParallelFlow__Group__2__Impl : ( ( rule__ParallelFlow__StepsAssignment_2 )* ) ;
    public final void rule__ParallelFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2598:1: ( ( ( rule__ParallelFlow__StepsAssignment_2 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2599:1: ( ( rule__ParallelFlow__StepsAssignment_2 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2599:1: ( ( rule__ParallelFlow__StepsAssignment_2 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2600:1: ( rule__ParallelFlow__StepsAssignment_2 )*
            {
             before(grammarAccess.getParallelFlowAccess().getStepsAssignment_2()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2601:1: ( rule__ParallelFlow__StepsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==39||LA27_0==42) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2601:2: rule__ParallelFlow__StepsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ParallelFlow__StepsAssignment_2_in_rule__ParallelFlow__Group__2__Impl5274);
            	    rule__ParallelFlow__StepsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getParallelFlowAccess().getStepsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group__2__Impl"


    // $ANTLR start "rule__ParallelFlow__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2611:1: rule__ParallelFlow__Group__3 : rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4 ;
    public final void rule__ParallelFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2615:1: ( rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2616:2: rule__ParallelFlow__Group__3__Impl rule__ParallelFlow__Group__4
            {
            pushFollow(FOLLOW_rule__ParallelFlow__Group__3__Impl_in_rule__ParallelFlow__Group__35305);
            rule__ParallelFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelFlow__Group__4_in_rule__ParallelFlow__Group__35308);
            rule__ParallelFlow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group__3"


    // $ANTLR start "rule__ParallelFlow__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2623:1: rule__ParallelFlow__Group__3__Impl : ( 'end flow' ) ;
    public final void rule__ParallelFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2627:1: ( ( 'end flow' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2628:1: ( 'end flow' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2628:1: ( 'end flow' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2629:1: 'end flow'
            {
             before(grammarAccess.getParallelFlowAccess().getEndFlowKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__ParallelFlow__Group__3__Impl5336); 
             after(grammarAccess.getParallelFlowAccess().getEndFlowKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group__3__Impl"


    // $ANTLR start "rule__ParallelFlow__Group__4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2642:1: rule__ParallelFlow__Group__4 : rule__ParallelFlow__Group__4__Impl ;
    public final void rule__ParallelFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2646:1: ( rule__ParallelFlow__Group__4__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2647:2: rule__ParallelFlow__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ParallelFlow__Group__4__Impl_in_rule__ParallelFlow__Group__45367);
            rule__ParallelFlow__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group__4"


    // $ANTLR start "rule__ParallelFlow__Group__4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2653:1: rule__ParallelFlow__Group__4__Impl : ( ( rule__ParallelFlow__Group_4__0 )? ) ;
    public final void rule__ParallelFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2657:1: ( ( ( rule__ParallelFlow__Group_4__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2658:1: ( ( rule__ParallelFlow__Group_4__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2658:1: ( ( rule__ParallelFlow__Group_4__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2659:1: ( rule__ParallelFlow__Group_4__0 )?
            {
             before(grammarAccess.getParallelFlowAccess().getGroup_4()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2660:1: ( rule__ParallelFlow__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2660:2: rule__ParallelFlow__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ParallelFlow__Group_4__0_in_rule__ParallelFlow__Group__4__Impl5394);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group__4__Impl"


    // $ANTLR start "rule__ParallelFlow__Group_4__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2680:1: rule__ParallelFlow__Group_4__0 : rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1 ;
    public final void rule__ParallelFlow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2684:1: ( rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2685:2: rule__ParallelFlow__Group_4__0__Impl rule__ParallelFlow__Group_4__1
            {
            pushFollow(FOLLOW_rule__ParallelFlow__Group_4__0__Impl_in_rule__ParallelFlow__Group_4__05435);
            rule__ParallelFlow__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelFlow__Group_4__1_in_rule__ParallelFlow__Group_4__05438);
            rule__ParallelFlow__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group_4__0"


    // $ANTLR start "rule__ParallelFlow__Group_4__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2692:1: rule__ParallelFlow__Group_4__0__Impl : ( 'with postcondition' ) ;
    public final void rule__ParallelFlow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2696:1: ( ( 'with postcondition' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2697:1: ( 'with postcondition' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2697:1: ( 'with postcondition' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2698:1: 'with postcondition'
            {
             before(grammarAccess.getParallelFlowAccess().getWithPostconditionKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__ParallelFlow__Group_4__0__Impl5466); 
             after(grammarAccess.getParallelFlowAccess().getWithPostconditionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group_4__0__Impl"


    // $ANTLR start "rule__ParallelFlow__Group_4__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2711:1: rule__ParallelFlow__Group_4__1 : rule__ParallelFlow__Group_4__1__Impl ;
    public final void rule__ParallelFlow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2715:1: ( rule__ParallelFlow__Group_4__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2716:2: rule__ParallelFlow__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelFlow__Group_4__1__Impl_in_rule__ParallelFlow__Group_4__15497);
            rule__ParallelFlow__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group_4__1"


    // $ANTLR start "rule__ParallelFlow__Group_4__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2722:1: rule__ParallelFlow__Group_4__1__Impl : ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) ) ;
    public final void rule__ParallelFlow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2726:1: ( ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2727:1: ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2727:1: ( ( rule__ParallelFlow__FinalStateAssignment_4_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2728:1: ( rule__ParallelFlow__FinalStateAssignment_4_1 )
            {
             before(grammarAccess.getParallelFlowAccess().getFinalStateAssignment_4_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2729:1: ( rule__ParallelFlow__FinalStateAssignment_4_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2729:2: rule__ParallelFlow__FinalStateAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ParallelFlow__FinalStateAssignment_4_1_in_rule__ParallelFlow__Group_4__1__Impl5524);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__Group_4__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2743:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2747:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2748:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05558);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05561);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2755:1: rule__Condition__Group__0__Impl : ( 'if' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2759:1: ( ( 'if' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2760:1: ( 'if' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2760:1: ( 'if' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2761:1: 'if'
            {
             before(grammarAccess.getConditionAccess().getIfKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Condition__Group__0__Impl5589); 
             after(grammarAccess.getConditionAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2774:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2778:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2779:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15620);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__15623);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2786:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ConditionAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2790:1: ( ( ( rule__Condition__ConditionAssignment_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2791:1: ( ( rule__Condition__ConditionAssignment_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2791:1: ( ( rule__Condition__ConditionAssignment_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2792:1: ( rule__Condition__ConditionAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2793:1: ( rule__Condition__ConditionAssignment_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2793:2: rule__Condition__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__Condition__ConditionAssignment_1_in_rule__Condition__Group__1__Impl5650);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2803:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2807:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2808:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__25680);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__25683);
            rule__Condition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2815:1: rule__Condition__Group__2__Impl : ( 'then' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2819:1: ( ( 'then' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2820:1: ( 'then' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2820:1: ( 'then' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2821:1: 'then'
            {
             before(grammarAccess.getConditionAccess().getThenKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__Condition__Group__2__Impl5711); 
             after(grammarAccess.getConditionAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2834:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2838:1: ( rule__Condition__Group__3__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2839:2: rule__Condition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__35742);
            rule__Condition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2845:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__Group_3__0 )? ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2849:1: ( ( ( rule__Condition__Group_3__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2850:1: ( ( rule__Condition__Group_3__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2850:1: ( ( rule__Condition__Group_3__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2851:1: ( rule__Condition__Group_3__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_3()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2852:1: ( rule__Condition__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2852:2: rule__Condition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Condition__Group_3__0_in_rule__Condition__Group__3__Impl5769);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group_3__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2870:1: rule__Condition__Group_3__0 : rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 ;
    public final void rule__Condition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2874:1: ( rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2875:2: rule__Condition__Group_3__0__Impl rule__Condition__Group_3__1
            {
            pushFollow(FOLLOW_rule__Condition__Group_3__0__Impl_in_rule__Condition__Group_3__05808);
            rule__Condition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group_3__1_in_rule__Condition__Group_3__05811);
            rule__Condition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_3__0"


    // $ANTLR start "rule__Condition__Group_3__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2882:1: rule__Condition__Group_3__0__Impl : ( 'continue with step' ) ;
    public final void rule__Condition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2886:1: ( ( 'continue with step' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2887:1: ( 'continue with step' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2887:1: ( 'continue with step' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2888:1: 'continue with step'
            {
             before(grammarAccess.getConditionAccess().getContinueWithStepKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__Condition__Group_3__0__Impl5839); 
             after(grammarAccess.getConditionAccess().getContinueWithStepKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_3__0__Impl"


    // $ANTLR start "rule__Condition__Group_3__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2901:1: rule__Condition__Group_3__1 : rule__Condition__Group_3__1__Impl ;
    public final void rule__Condition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2905:1: ( rule__Condition__Group_3__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2906:2: rule__Condition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group_3__1__Impl_in_rule__Condition__Group_3__15870);
            rule__Condition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_3__1"


    // $ANTLR start "rule__Condition__Group_3__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2912:1: rule__Condition__Group_3__1__Impl : ( ( rule__Condition__ContinuationAssignment_3_1 ) ) ;
    public final void rule__Condition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2916:1: ( ( ( rule__Condition__ContinuationAssignment_3_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2917:1: ( ( rule__Condition__ContinuationAssignment_3_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2917:1: ( ( rule__Condition__ContinuationAssignment_3_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2918:1: ( rule__Condition__ContinuationAssignment_3_1 )
            {
             before(grammarAccess.getConditionAccess().getContinuationAssignment_3_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2919:1: ( rule__Condition__ContinuationAssignment_3_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2919:2: rule__Condition__ContinuationAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Condition__ContinuationAssignment_3_1_in_rule__Condition__Group_3__1__Impl5897);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_3__1__Impl"


    // $ANTLR start "rule__LocalAlternative__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2933:1: rule__LocalAlternative__Group__0 : rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1 ;
    public final void rule__LocalAlternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2937:1: ( rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2938:2: rule__LocalAlternative__Group__0__Impl rule__LocalAlternative__Group__1
            {
            pushFollow(FOLLOW_rule__LocalAlternative__Group__0__Impl_in_rule__LocalAlternative__Group__05931);
            rule__LocalAlternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalAlternative__Group__1_in_rule__LocalAlternative__Group__05934);
            rule__LocalAlternative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group__0"


    // $ANTLR start "rule__LocalAlternative__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2945:1: rule__LocalAlternative__Group__0__Impl : ( 'if' ) ;
    public final void rule__LocalAlternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2949:1: ( ( 'if' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2950:1: ( 'if' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2950:1: ( 'if' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2951:1: 'if'
            {
             before(grammarAccess.getLocalAlternativeAccess().getIfKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__LocalAlternative__Group__0__Impl5962); 
             after(grammarAccess.getLocalAlternativeAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group__0__Impl"


    // $ANTLR start "rule__LocalAlternative__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2964:1: rule__LocalAlternative__Group__1 : rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2 ;
    public final void rule__LocalAlternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2968:1: ( rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2969:2: rule__LocalAlternative__Group__1__Impl rule__LocalAlternative__Group__2
            {
            pushFollow(FOLLOW_rule__LocalAlternative__Group__1__Impl_in_rule__LocalAlternative__Group__15993);
            rule__LocalAlternative__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalAlternative__Group__2_in_rule__LocalAlternative__Group__15996);
            rule__LocalAlternative__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group__1"


    // $ANTLR start "rule__LocalAlternative__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2976:1: rule__LocalAlternative__Group__1__Impl : ( ( rule__LocalAlternative__ConditionAssignment_1 ) ) ;
    public final void rule__LocalAlternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2980:1: ( ( ( rule__LocalAlternative__ConditionAssignment_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2981:1: ( ( rule__LocalAlternative__ConditionAssignment_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2981:1: ( ( rule__LocalAlternative__ConditionAssignment_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2982:1: ( rule__LocalAlternative__ConditionAssignment_1 )
            {
             before(grammarAccess.getLocalAlternativeAccess().getConditionAssignment_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2983:1: ( rule__LocalAlternative__ConditionAssignment_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2983:2: rule__LocalAlternative__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__LocalAlternative__ConditionAssignment_1_in_rule__LocalAlternative__Group__1__Impl6023);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group__1__Impl"


    // $ANTLR start "rule__LocalAlternative__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2993:1: rule__LocalAlternative__Group__2 : rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3 ;
    public final void rule__LocalAlternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2997:1: ( rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:2998:2: rule__LocalAlternative__Group__2__Impl rule__LocalAlternative__Group__3
            {
            pushFollow(FOLLOW_rule__LocalAlternative__Group__2__Impl_in_rule__LocalAlternative__Group__26053);
            rule__LocalAlternative__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalAlternative__Group__3_in_rule__LocalAlternative__Group__26056);
            rule__LocalAlternative__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group__2"


    // $ANTLR start "rule__LocalAlternative__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3005:1: rule__LocalAlternative__Group__2__Impl : ( 'then' ) ;
    public final void rule__LocalAlternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3009:1: ( ( 'then' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3010:1: ( 'then' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3010:1: ( 'then' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3011:1: 'then'
            {
             before(grammarAccess.getLocalAlternativeAccess().getThenKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__LocalAlternative__Group__2__Impl6084); 
             after(grammarAccess.getLocalAlternativeAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group__2__Impl"


    // $ANTLR start "rule__LocalAlternative__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3024:1: rule__LocalAlternative__Group__3 : rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4 ;
    public final void rule__LocalAlternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3028:1: ( rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3029:2: rule__LocalAlternative__Group__3__Impl rule__LocalAlternative__Group__4
            {
            pushFollow(FOLLOW_rule__LocalAlternative__Group__3__Impl_in_rule__LocalAlternative__Group__36115);
            rule__LocalAlternative__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalAlternative__Group__4_in_rule__LocalAlternative__Group__36118);
            rule__LocalAlternative__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group__3"


    // $ANTLR start "rule__LocalAlternative__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3036:1: rule__LocalAlternative__Group__3__Impl : ( ( rule__LocalAlternative__Alternatives_3 ) ) ;
    public final void rule__LocalAlternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3040:1: ( ( ( rule__LocalAlternative__Alternatives_3 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3041:1: ( ( rule__LocalAlternative__Alternatives_3 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3041:1: ( ( rule__LocalAlternative__Alternatives_3 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3042:1: ( rule__LocalAlternative__Alternatives_3 )
            {
             before(grammarAccess.getLocalAlternativeAccess().getAlternatives_3()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3043:1: ( rule__LocalAlternative__Alternatives_3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3043:2: rule__LocalAlternative__Alternatives_3
            {
            pushFollow(FOLLOW_rule__LocalAlternative__Alternatives_3_in_rule__LocalAlternative__Group__3__Impl6145);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group__3__Impl"


    // $ANTLR start "rule__LocalAlternative__Group__4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3053:1: rule__LocalAlternative__Group__4 : rule__LocalAlternative__Group__4__Impl ;
    public final void rule__LocalAlternative__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3057:1: ( rule__LocalAlternative__Group__4__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3058:2: rule__LocalAlternative__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LocalAlternative__Group__4__Impl_in_rule__LocalAlternative__Group__46175);
            rule__LocalAlternative__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group__4"


    // $ANTLR start "rule__LocalAlternative__Group__4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3064:1: rule__LocalAlternative__Group__4__Impl : ( ( rule__LocalAlternative__Group_4__0 )? ) ;
    public final void rule__LocalAlternative__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3068:1: ( ( ( rule__LocalAlternative__Group_4__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3069:1: ( ( rule__LocalAlternative__Group_4__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3069:1: ( ( rule__LocalAlternative__Group_4__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3070:1: ( rule__LocalAlternative__Group_4__0 )?
            {
             before(grammarAccess.getLocalAlternativeAccess().getGroup_4()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3071:1: ( rule__LocalAlternative__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3071:2: rule__LocalAlternative__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__LocalAlternative__Group_4__0_in_rule__LocalAlternative__Group__4__Impl6202);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group__4__Impl"


    // $ANTLR start "rule__LocalAlternative__Group_3_1__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3091:1: rule__LocalAlternative__Group_3_1__0 : rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1 ;
    public final void rule__LocalAlternative__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3095:1: ( rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3096:2: rule__LocalAlternative__Group_3_1__0__Impl rule__LocalAlternative__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__0__Impl_in_rule__LocalAlternative__Group_3_1__06243);
            rule__LocalAlternative__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__1_in_rule__LocalAlternative__Group_3_1__06246);
            rule__LocalAlternative__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group_3_1__0"


    // $ANTLR start "rule__LocalAlternative__Group_3_1__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3103:1: rule__LocalAlternative__Group_3_1__0__Impl : ( 'invoke usecase' ) ;
    public final void rule__LocalAlternative__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3107:1: ( ( 'invoke usecase' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3108:1: ( 'invoke usecase' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3108:1: ( 'invoke usecase' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3109:1: 'invoke usecase'
            {
             before(grammarAccess.getLocalAlternativeAccess().getInvokeUsecaseKeyword_3_1_0()); 
            match(input,38,FOLLOW_38_in_rule__LocalAlternative__Group_3_1__0__Impl6274); 
             after(grammarAccess.getLocalAlternativeAccess().getInvokeUsecaseKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group_3_1__0__Impl"


    // $ANTLR start "rule__LocalAlternative__Group_3_1__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3122:1: rule__LocalAlternative__Group_3_1__1 : rule__LocalAlternative__Group_3_1__1__Impl ;
    public final void rule__LocalAlternative__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3126:1: ( rule__LocalAlternative__Group_3_1__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3127:2: rule__LocalAlternative__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LocalAlternative__Group_3_1__1__Impl_in_rule__LocalAlternative__Group_3_1__16305);
            rule__LocalAlternative__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group_3_1__1"


    // $ANTLR start "rule__LocalAlternative__Group_3_1__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3133:1: rule__LocalAlternative__Group_3_1__1__Impl : ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) ) ;
    public final void rule__LocalAlternative__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3137:1: ( ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3138:1: ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3138:1: ( ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3139:1: ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 )
            {
             before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseAssignment_3_1_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3140:1: ( rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3140:2: rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1_in_rule__LocalAlternative__Group_3_1__1__Impl6332);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group_3_1__1__Impl"


    // $ANTLR start "rule__LocalAlternative__Group_4__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3154:1: rule__LocalAlternative__Group_4__0 : rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1 ;
    public final void rule__LocalAlternative__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3158:1: ( rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3159:2: rule__LocalAlternative__Group_4__0__Impl rule__LocalAlternative__Group_4__1
            {
            pushFollow(FOLLOW_rule__LocalAlternative__Group_4__0__Impl_in_rule__LocalAlternative__Group_4__06366);
            rule__LocalAlternative__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocalAlternative__Group_4__1_in_rule__LocalAlternative__Group_4__06369);
            rule__LocalAlternative__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group_4__0"


    // $ANTLR start "rule__LocalAlternative__Group_4__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3166:1: rule__LocalAlternative__Group_4__0__Impl : ( 'continue with step' ) ;
    public final void rule__LocalAlternative__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3170:1: ( ( 'continue with step' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3171:1: ( 'continue with step' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3171:1: ( 'continue with step' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3172:1: 'continue with step'
            {
             before(grammarAccess.getLocalAlternativeAccess().getContinueWithStepKeyword_4_0()); 
            match(input,37,FOLLOW_37_in_rule__LocalAlternative__Group_4__0__Impl6397); 
             after(grammarAccess.getLocalAlternativeAccess().getContinueWithStepKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group_4__0__Impl"


    // $ANTLR start "rule__LocalAlternative__Group_4__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3185:1: rule__LocalAlternative__Group_4__1 : rule__LocalAlternative__Group_4__1__Impl ;
    public final void rule__LocalAlternative__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3189:1: ( rule__LocalAlternative__Group_4__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3190:2: rule__LocalAlternative__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__LocalAlternative__Group_4__1__Impl_in_rule__LocalAlternative__Group_4__16428);
            rule__LocalAlternative__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group_4__1"


    // $ANTLR start "rule__LocalAlternative__Group_4__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3196:1: rule__LocalAlternative__Group_4__1__Impl : ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) ) ;
    public final void rule__LocalAlternative__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3200:1: ( ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3201:1: ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3201:1: ( ( rule__LocalAlternative__ContinuationAssignment_4_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3202:1: ( rule__LocalAlternative__ContinuationAssignment_4_1 )
            {
             before(grammarAccess.getLocalAlternativeAccess().getContinuationAssignment_4_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3203:1: ( rule__LocalAlternative__ContinuationAssignment_4_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3203:2: rule__LocalAlternative__ContinuationAssignment_4_1
            {
            pushFollow(FOLLOW_rule__LocalAlternative__ContinuationAssignment_4_1_in_rule__LocalAlternative__Group_4__1__Impl6455);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__Group_4__1__Impl"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3217:1: rule__AlternativeFlowAlternative__Group__0 : rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1 ;
    public final void rule__AlternativeFlowAlternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3221:1: ( rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3222:2: rule__AlternativeFlowAlternative__Group__0__Impl rule__AlternativeFlowAlternative__Group__1
            {
            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__0__Impl_in_rule__AlternativeFlowAlternative__Group__06489);
            rule__AlternativeFlowAlternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__1_in_rule__AlternativeFlowAlternative__Group__06492);
            rule__AlternativeFlowAlternative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__0"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3229:1: rule__AlternativeFlowAlternative__Group__0__Impl : ( 'if' ) ;
    public final void rule__AlternativeFlowAlternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3233:1: ( ( 'if' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3234:1: ( 'if' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3234:1: ( 'if' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3235:1: 'if'
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getIfKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__AlternativeFlowAlternative__Group__0__Impl6520); 
             after(grammarAccess.getAlternativeFlowAlternativeAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__0__Impl"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3248:1: rule__AlternativeFlowAlternative__Group__1 : rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2 ;
    public final void rule__AlternativeFlowAlternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3252:1: ( rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3253:2: rule__AlternativeFlowAlternative__Group__1__Impl rule__AlternativeFlowAlternative__Group__2
            {
            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__1__Impl_in_rule__AlternativeFlowAlternative__Group__16551);
            rule__AlternativeFlowAlternative__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__2_in_rule__AlternativeFlowAlternative__Group__16554);
            rule__AlternativeFlowAlternative__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__1"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3260:1: rule__AlternativeFlowAlternative__Group__1__Impl : ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) ) ;
    public final void rule__AlternativeFlowAlternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3264:1: ( ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3265:1: ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3265:1: ( ( rule__AlternativeFlowAlternative__ConditionAssignment_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3266:1: ( rule__AlternativeFlowAlternative__ConditionAssignment_1 )
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getConditionAssignment_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3267:1: ( rule__AlternativeFlowAlternative__ConditionAssignment_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3267:2: rule__AlternativeFlowAlternative__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__ConditionAssignment_1_in_rule__AlternativeFlowAlternative__Group__1__Impl6581);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__1__Impl"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3277:1: rule__AlternativeFlowAlternative__Group__2 : rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3 ;
    public final void rule__AlternativeFlowAlternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3281:1: ( rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3282:2: rule__AlternativeFlowAlternative__Group__2__Impl rule__AlternativeFlowAlternative__Group__3
            {
            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__2__Impl_in_rule__AlternativeFlowAlternative__Group__26611);
            rule__AlternativeFlowAlternative__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__3_in_rule__AlternativeFlowAlternative__Group__26614);
            rule__AlternativeFlowAlternative__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__2"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3289:1: rule__AlternativeFlowAlternative__Group__2__Impl : ( 'then' ) ;
    public final void rule__AlternativeFlowAlternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3293:1: ( ( 'then' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3294:1: ( 'then' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3294:1: ( 'then' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3295:1: 'then'
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getThenKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__AlternativeFlowAlternative__Group__2__Impl6642); 
             after(grammarAccess.getAlternativeFlowAlternativeAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__2__Impl"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3308:1: rule__AlternativeFlowAlternative__Group__3 : rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4 ;
    public final void rule__AlternativeFlowAlternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3312:1: ( rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3313:2: rule__AlternativeFlowAlternative__Group__3__Impl rule__AlternativeFlowAlternative__Group__4
            {
            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__3__Impl_in_rule__AlternativeFlowAlternative__Group__36673);
            rule__AlternativeFlowAlternative__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__4_in_rule__AlternativeFlowAlternative__Group__36676);
            rule__AlternativeFlowAlternative__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__3"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3320:1: rule__AlternativeFlowAlternative__Group__3__Impl : ( 'alternative flow' ) ;
    public final void rule__AlternativeFlowAlternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3324:1: ( ( 'alternative flow' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3325:1: ( 'alternative flow' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3325:1: ( 'alternative flow' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3326:1: 'alternative flow'
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getAlternativeFlowKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__AlternativeFlowAlternative__Group__3__Impl6704); 
             after(grammarAccess.getAlternativeFlowAlternativeAccess().getAlternativeFlowKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__3__Impl"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3339:1: rule__AlternativeFlowAlternative__Group__4 : rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5 ;
    public final void rule__AlternativeFlowAlternative__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3343:1: ( rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3344:2: rule__AlternativeFlowAlternative__Group__4__Impl rule__AlternativeFlowAlternative__Group__5
            {
            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__4__Impl_in_rule__AlternativeFlowAlternative__Group__46735);
            rule__AlternativeFlowAlternative__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__5_in_rule__AlternativeFlowAlternative__Group__46738);
            rule__AlternativeFlowAlternative__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__4"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3351:1: rule__AlternativeFlowAlternative__Group__4__Impl : ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) ) ;
    public final void rule__AlternativeFlowAlternative__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3355:1: ( ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3356:1: ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3356:1: ( ( rule__AlternativeFlowAlternative__RefAssignment_4 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3357:1: ( rule__AlternativeFlowAlternative__RefAssignment_4 )
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefAssignment_4()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3358:1: ( rule__AlternativeFlowAlternative__RefAssignment_4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3358:2: rule__AlternativeFlowAlternative__RefAssignment_4
            {
            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__RefAssignment_4_in_rule__AlternativeFlowAlternative__Group__4__Impl6765);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__4__Impl"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__5"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3368:1: rule__AlternativeFlowAlternative__Group__5 : rule__AlternativeFlowAlternative__Group__5__Impl ;
    public final void rule__AlternativeFlowAlternative__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3372:1: ( rule__AlternativeFlowAlternative__Group__5__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3373:2: rule__AlternativeFlowAlternative__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group__5__Impl_in_rule__AlternativeFlowAlternative__Group__56795);
            rule__AlternativeFlowAlternative__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__5"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group__5__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3379:1: rule__AlternativeFlowAlternative__Group__5__Impl : ( ( rule__AlternativeFlowAlternative__Group_5__0 )? ) ;
    public final void rule__AlternativeFlowAlternative__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3383:1: ( ( ( rule__AlternativeFlowAlternative__Group_5__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3384:1: ( ( rule__AlternativeFlowAlternative__Group_5__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3384:1: ( ( rule__AlternativeFlowAlternative__Group_5__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3385:1: ( rule__AlternativeFlowAlternative__Group_5__0 )?
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getGroup_5()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3386:1: ( rule__AlternativeFlowAlternative__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3386:2: rule__AlternativeFlowAlternative__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__0_in_rule__AlternativeFlowAlternative__Group__5__Impl6822);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group__5__Impl"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group_5__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3408:1: rule__AlternativeFlowAlternative__Group_5__0 : rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1 ;
    public final void rule__AlternativeFlowAlternative__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3412:1: ( rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3413:2: rule__AlternativeFlowAlternative__Group_5__0__Impl rule__AlternativeFlowAlternative__Group_5__1
            {
            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__0__Impl_in_rule__AlternativeFlowAlternative__Group_5__06865);
            rule__AlternativeFlowAlternative__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__1_in_rule__AlternativeFlowAlternative__Group_5__06868);
            rule__AlternativeFlowAlternative__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group_5__0"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group_5__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3420:1: rule__AlternativeFlowAlternative__Group_5__0__Impl : ( 'continue with step' ) ;
    public final void rule__AlternativeFlowAlternative__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3424:1: ( ( 'continue with step' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3425:1: ( 'continue with step' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3425:1: ( 'continue with step' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3426:1: 'continue with step'
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinueWithStepKeyword_5_0()); 
            match(input,37,FOLLOW_37_in_rule__AlternativeFlowAlternative__Group_5__0__Impl6896); 
             after(grammarAccess.getAlternativeFlowAlternativeAccess().getContinueWithStepKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group_5__0__Impl"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group_5__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3439:1: rule__AlternativeFlowAlternative__Group_5__1 : rule__AlternativeFlowAlternative__Group_5__1__Impl ;
    public final void rule__AlternativeFlowAlternative__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3443:1: ( rule__AlternativeFlowAlternative__Group_5__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3444:2: rule__AlternativeFlowAlternative__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__Group_5__1__Impl_in_rule__AlternativeFlowAlternative__Group_5__16927);
            rule__AlternativeFlowAlternative__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group_5__1"


    // $ANTLR start "rule__AlternativeFlowAlternative__Group_5__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3450:1: rule__AlternativeFlowAlternative__Group_5__1__Impl : ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) ) ;
    public final void rule__AlternativeFlowAlternative__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3454:1: ( ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3455:1: ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3455:1: ( ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3456:1: ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 )
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationAssignment_5_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3457:1: ( rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3457:2: rule__AlternativeFlowAlternative__ContinuationAssignment_5_1
            {
            pushFollow(FOLLOW_rule__AlternativeFlowAlternative__ContinuationAssignment_5_1_in_rule__AlternativeFlowAlternative__Group_5__1__Impl6954);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__Group_5__1__Impl"


    // $ANTLR start "rule__ParallelStep__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3471:1: rule__ParallelStep__Group__0 : rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1 ;
    public final void rule__ParallelStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3475:1: ( rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3476:2: rule__ParallelStep__Group__0__Impl rule__ParallelStep__Group__1
            {
            pushFollow(FOLLOW_rule__ParallelStep__Group__0__Impl_in_rule__ParallelStep__Group__06988);
            rule__ParallelStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelStep__Group__1_in_rule__ParallelStep__Group__06991);
            rule__ParallelStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__0"


    // $ANTLR start "rule__ParallelStep__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3483:1: rule__ParallelStep__Group__0__Impl : ( 'parallel step' ) ;
    public final void rule__ParallelStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3487:1: ( ( 'parallel step' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3488:1: ( 'parallel step' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3488:1: ( 'parallel step' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3489:1: 'parallel step'
            {
             before(grammarAccess.getParallelStepAccess().getParallelStepKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ParallelStep__Group__0__Impl7019); 
             after(grammarAccess.getParallelStepAccess().getParallelStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__0__Impl"


    // $ANTLR start "rule__ParallelStep__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3502:1: rule__ParallelStep__Group__1 : rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2 ;
    public final void rule__ParallelStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3506:1: ( rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3507:2: rule__ParallelStep__Group__1__Impl rule__ParallelStep__Group__2
            {
            pushFollow(FOLLOW_rule__ParallelStep__Group__1__Impl_in_rule__ParallelStep__Group__17050);
            rule__ParallelStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelStep__Group__2_in_rule__ParallelStep__Group__17053);
            rule__ParallelStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__1"


    // $ANTLR start "rule__ParallelStep__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3514:1: rule__ParallelStep__Group__1__Impl : ( ( rule__ParallelStep__NameAssignment_1 ) ) ;
    public final void rule__ParallelStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3518:1: ( ( ( rule__ParallelStep__NameAssignment_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3519:1: ( ( rule__ParallelStep__NameAssignment_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3519:1: ( ( rule__ParallelStep__NameAssignment_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3520:1: ( rule__ParallelStep__NameAssignment_1 )
            {
             before(grammarAccess.getParallelStepAccess().getNameAssignment_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3521:1: ( rule__ParallelStep__NameAssignment_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3521:2: rule__ParallelStep__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ParallelStep__NameAssignment_1_in_rule__ParallelStep__Group__1__Impl7080);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__1__Impl"


    // $ANTLR start "rule__ParallelStep__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3531:1: rule__ParallelStep__Group__2 : rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3 ;
    public final void rule__ParallelStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3535:1: ( rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3536:2: rule__ParallelStep__Group__2__Impl rule__ParallelStep__Group__3
            {
            pushFollow(FOLLOW_rule__ParallelStep__Group__2__Impl_in_rule__ParallelStep__Group__27110);
            rule__ParallelStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelStep__Group__3_in_rule__ParallelStep__Group__27113);
            rule__ParallelStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__2"


    // $ANTLR start "rule__ParallelStep__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3543:1: rule__ParallelStep__Group__2__Impl : ( ( rule__ParallelStep__LabelAssignment_2 )? ) ;
    public final void rule__ParallelStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3547:1: ( ( ( rule__ParallelStep__LabelAssignment_2 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3548:1: ( ( rule__ParallelStep__LabelAssignment_2 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3548:1: ( ( rule__ParallelStep__LabelAssignment_2 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3549:1: ( rule__ParallelStep__LabelAssignment_2 )?
            {
             before(grammarAccess.getParallelStepAccess().getLabelAssignment_2()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3550:1: ( rule__ParallelStep__LabelAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3550:2: rule__ParallelStep__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ParallelStep__LabelAssignment_2_in_rule__ParallelStep__Group__2__Impl7140);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__2__Impl"


    // $ANTLR start "rule__ParallelStep__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3560:1: rule__ParallelStep__Group__3 : rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4 ;
    public final void rule__ParallelStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3564:1: ( rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3565:2: rule__ParallelStep__Group__3__Impl rule__ParallelStep__Group__4
            {
            pushFollow(FOLLOW_rule__ParallelStep__Group__3__Impl_in_rule__ParallelStep__Group__37171);
            rule__ParallelStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelStep__Group__4_in_rule__ParallelStep__Group__37174);
            rule__ParallelStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__3"


    // $ANTLR start "rule__ParallelStep__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3572:1: rule__ParallelStep__Group__3__Impl : ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) ) ;
    public final void rule__ParallelStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3576:1: ( ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3577:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3577:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_3 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3578:1: ( rule__ParallelStep__InvokedFlowsAssignment_3 )
            {
             before(grammarAccess.getParallelStepAccess().getInvokedFlowsAssignment_3()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3579:1: ( rule__ParallelStep__InvokedFlowsAssignment_3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3579:2: rule__ParallelStep__InvokedFlowsAssignment_3
            {
            pushFollow(FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_3_in_rule__ParallelStep__Group__3__Impl7201);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__3__Impl"


    // $ANTLR start "rule__ParallelStep__Group__4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3589:1: rule__ParallelStep__Group__4 : rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5 ;
    public final void rule__ParallelStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3593:1: ( rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3594:2: rule__ParallelStep__Group__4__Impl rule__ParallelStep__Group__5
            {
            pushFollow(FOLLOW_rule__ParallelStep__Group__4__Impl_in_rule__ParallelStep__Group__47231);
            rule__ParallelStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelStep__Group__5_in_rule__ParallelStep__Group__47234);
            rule__ParallelStep__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__4"


    // $ANTLR start "rule__ParallelStep__Group__4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3601:1: rule__ParallelStep__Group__4__Impl : ( ( rule__ParallelStep__Group_4__0 )* ) ;
    public final void rule__ParallelStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3605:1: ( ( ( rule__ParallelStep__Group_4__0 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3606:1: ( ( rule__ParallelStep__Group_4__0 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3606:1: ( ( rule__ParallelStep__Group_4__0 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3607:1: ( rule__ParallelStep__Group_4__0 )*
            {
             before(grammarAccess.getParallelStepAccess().getGroup_4()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3608:1: ( rule__ParallelStep__Group_4__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==40) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3608:2: rule__ParallelStep__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__ParallelStep__Group_4__0_in_rule__ParallelStep__Group__4__Impl7261);
            	    rule__ParallelStep__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getParallelStepAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__4__Impl"


    // $ANTLR start "rule__ParallelStep__Group__5"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3618:1: rule__ParallelStep__Group__5 : rule__ParallelStep__Group__5__Impl ;
    public final void rule__ParallelStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3622:1: ( rule__ParallelStep__Group__5__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3623:2: rule__ParallelStep__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStep__Group__5__Impl_in_rule__ParallelStep__Group__57292);
            rule__ParallelStep__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__5"


    // $ANTLR start "rule__ParallelStep__Group__5__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3629:1: rule__ParallelStep__Group__5__Impl : ( ( rule__ParallelStep__Group_5__0 )? ) ;
    public final void rule__ParallelStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3633:1: ( ( ( rule__ParallelStep__Group_5__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3634:1: ( ( rule__ParallelStep__Group_5__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3634:1: ( ( rule__ParallelStep__Group_5__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3635:1: ( rule__ParallelStep__Group_5__0 )?
            {
             before(grammarAccess.getParallelStepAccess().getGroup_5()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3636:1: ( rule__ParallelStep__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3636:2: rule__ParallelStep__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ParallelStep__Group_5__0_in_rule__ParallelStep__Group__5__Impl7319);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group__5__Impl"


    // $ANTLR start "rule__ParallelStep__Group_4__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3658:1: rule__ParallelStep__Group_4__0 : rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1 ;
    public final void rule__ParallelStep__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3662:1: ( rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3663:2: rule__ParallelStep__Group_4__0__Impl rule__ParallelStep__Group_4__1
            {
            pushFollow(FOLLOW_rule__ParallelStep__Group_4__0__Impl_in_rule__ParallelStep__Group_4__07362);
            rule__ParallelStep__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelStep__Group_4__1_in_rule__ParallelStep__Group_4__07365);
            rule__ParallelStep__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group_4__0"


    // $ANTLR start "rule__ParallelStep__Group_4__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3670:1: rule__ParallelStep__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ParallelStep__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3674:1: ( ( ',' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3675:1: ( ',' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3675:1: ( ',' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3676:1: ','
            {
             before(grammarAccess.getParallelStepAccess().getCommaKeyword_4_0()); 
            match(input,40,FOLLOW_40_in_rule__ParallelStep__Group_4__0__Impl7393); 
             after(grammarAccess.getParallelStepAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group_4__0__Impl"


    // $ANTLR start "rule__ParallelStep__Group_4__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3689:1: rule__ParallelStep__Group_4__1 : rule__ParallelStep__Group_4__1__Impl ;
    public final void rule__ParallelStep__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3693:1: ( rule__ParallelStep__Group_4__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3694:2: rule__ParallelStep__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStep__Group_4__1__Impl_in_rule__ParallelStep__Group_4__17424);
            rule__ParallelStep__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group_4__1"


    // $ANTLR start "rule__ParallelStep__Group_4__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3700:1: rule__ParallelStep__Group_4__1__Impl : ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) ) ;
    public final void rule__ParallelStep__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3704:1: ( ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3705:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3705:1: ( ( rule__ParallelStep__InvokedFlowsAssignment_4_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3706:1: ( rule__ParallelStep__InvokedFlowsAssignment_4_1 )
            {
             before(grammarAccess.getParallelStepAccess().getInvokedFlowsAssignment_4_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3707:1: ( rule__ParallelStep__InvokedFlowsAssignment_4_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3707:2: rule__ParallelStep__InvokedFlowsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_4_1_in_rule__ParallelStep__Group_4__1__Impl7451);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group_4__1__Impl"


    // $ANTLR start "rule__ParallelStep__Group_5__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3721:1: rule__ParallelStep__Group_5__0 : rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1 ;
    public final void rule__ParallelStep__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3725:1: ( rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3726:2: rule__ParallelStep__Group_5__0__Impl rule__ParallelStep__Group_5__1
            {
            pushFollow(FOLLOW_rule__ParallelStep__Group_5__0__Impl_in_rule__ParallelStep__Group_5__07485);
            rule__ParallelStep__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParallelStep__Group_5__1_in_rule__ParallelStep__Group_5__07488);
            rule__ParallelStep__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group_5__0"


    // $ANTLR start "rule__ParallelStep__Group_5__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3733:1: rule__ParallelStep__Group_5__0__Impl : ( 'next' ) ;
    public final void rule__ParallelStep__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3737:1: ( ( 'next' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3738:1: ( 'next' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3738:1: ( 'next' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3739:1: 'next'
            {
             before(grammarAccess.getParallelStepAccess().getNextKeyword_5_0()); 
            match(input,41,FOLLOW_41_in_rule__ParallelStep__Group_5__0__Impl7516); 
             after(grammarAccess.getParallelStepAccess().getNextKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group_5__0__Impl"


    // $ANTLR start "rule__ParallelStep__Group_5__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3752:1: rule__ParallelStep__Group_5__1 : rule__ParallelStep__Group_5__1__Impl ;
    public final void rule__ParallelStep__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3756:1: ( rule__ParallelStep__Group_5__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3757:2: rule__ParallelStep__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ParallelStep__Group_5__1__Impl_in_rule__ParallelStep__Group_5__17547);
            rule__ParallelStep__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group_5__1"


    // $ANTLR start "rule__ParallelStep__Group_5__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3763:1: rule__ParallelStep__Group_5__1__Impl : ( ( rule__ParallelStep__NextAssignment_5_1 ) ) ;
    public final void rule__ParallelStep__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3767:1: ( ( ( rule__ParallelStep__NextAssignment_5_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3768:1: ( ( rule__ParallelStep__NextAssignment_5_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3768:1: ( ( rule__ParallelStep__NextAssignment_5_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3769:1: ( rule__ParallelStep__NextAssignment_5_1 )
            {
             before(grammarAccess.getParallelStepAccess().getNextAssignment_5_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3770:1: ( rule__ParallelStep__NextAssignment_5_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3770:2: rule__ParallelStep__NextAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ParallelStep__NextAssignment_5_1_in_rule__ParallelStep__Group_5__1__Impl7574);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__Group_5__1__Impl"


    // $ANTLR start "rule__NormalStep__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3784:1: rule__NormalStep__Group__0 : rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1 ;
    public final void rule__NormalStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3788:1: ( rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3789:2: rule__NormalStep__Group__0__Impl rule__NormalStep__Group__1
            {
            pushFollow(FOLLOW_rule__NormalStep__Group__0__Impl_in_rule__NormalStep__Group__07608);
            rule__NormalStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalStep__Group__1_in_rule__NormalStep__Group__07611);
            rule__NormalStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__0"


    // $ANTLR start "rule__NormalStep__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3796:1: rule__NormalStep__Group__0__Impl : ( 'step' ) ;
    public final void rule__NormalStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3800:1: ( ( 'step' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3801:1: ( 'step' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3801:1: ( 'step' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3802:1: 'step'
            {
             before(grammarAccess.getNormalStepAccess().getStepKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__NormalStep__Group__0__Impl7639); 
             after(grammarAccess.getNormalStepAccess().getStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__0__Impl"


    // $ANTLR start "rule__NormalStep__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3815:1: rule__NormalStep__Group__1 : rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2 ;
    public final void rule__NormalStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3819:1: ( rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3820:2: rule__NormalStep__Group__1__Impl rule__NormalStep__Group__2
            {
            pushFollow(FOLLOW_rule__NormalStep__Group__1__Impl_in_rule__NormalStep__Group__17670);
            rule__NormalStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalStep__Group__2_in_rule__NormalStep__Group__17673);
            rule__NormalStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__1"


    // $ANTLR start "rule__NormalStep__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3827:1: rule__NormalStep__Group__1__Impl : ( ( rule__NormalStep__NameAssignment_1 ) ) ;
    public final void rule__NormalStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3831:1: ( ( ( rule__NormalStep__NameAssignment_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3832:1: ( ( rule__NormalStep__NameAssignment_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3832:1: ( ( rule__NormalStep__NameAssignment_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3833:1: ( rule__NormalStep__NameAssignment_1 )
            {
             before(grammarAccess.getNormalStepAccess().getNameAssignment_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3834:1: ( rule__NormalStep__NameAssignment_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3834:2: rule__NormalStep__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NormalStep__NameAssignment_1_in_rule__NormalStep__Group__1__Impl7700);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__1__Impl"


    // $ANTLR start "rule__NormalStep__Group__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3844:1: rule__NormalStep__Group__2 : rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3 ;
    public final void rule__NormalStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3848:1: ( rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3849:2: rule__NormalStep__Group__2__Impl rule__NormalStep__Group__3
            {
            pushFollow(FOLLOW_rule__NormalStep__Group__2__Impl_in_rule__NormalStep__Group__27730);
            rule__NormalStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalStep__Group__3_in_rule__NormalStep__Group__27733);
            rule__NormalStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__2"


    // $ANTLR start "rule__NormalStep__Group__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3856:1: rule__NormalStep__Group__2__Impl : ( ( rule__NormalStep__LabelAssignment_2 )? ) ;
    public final void rule__NormalStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3860:1: ( ( ( rule__NormalStep__LabelAssignment_2 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3861:1: ( ( rule__NormalStep__LabelAssignment_2 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3861:1: ( ( rule__NormalStep__LabelAssignment_2 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3862:1: ( rule__NormalStep__LabelAssignment_2 )?
            {
             before(grammarAccess.getNormalStepAccess().getLabelAssignment_2()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3863:1: ( rule__NormalStep__LabelAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3863:2: rule__NormalStep__LabelAssignment_2
                    {
                    pushFollow(FOLLOW_rule__NormalStep__LabelAssignment_2_in_rule__NormalStep__Group__2__Impl7760);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__2__Impl"


    // $ANTLR start "rule__NormalStep__Group__3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3873:1: rule__NormalStep__Group__3 : rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4 ;
    public final void rule__NormalStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3877:1: ( rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3878:2: rule__NormalStep__Group__3__Impl rule__NormalStep__Group__4
            {
            pushFollow(FOLLOW_rule__NormalStep__Group__3__Impl_in_rule__NormalStep__Group__37791);
            rule__NormalStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalStep__Group__4_in_rule__NormalStep__Group__37794);
            rule__NormalStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__3"


    // $ANTLR start "rule__NormalStep__Group__3__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3885:1: rule__NormalStep__Group__3__Impl : ( ( rule__NormalStep__TypeAssignment_3 ) ) ;
    public final void rule__NormalStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3889:1: ( ( ( rule__NormalStep__TypeAssignment_3 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3890:1: ( ( rule__NormalStep__TypeAssignment_3 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3890:1: ( ( rule__NormalStep__TypeAssignment_3 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3891:1: ( rule__NormalStep__TypeAssignment_3 )
            {
             before(grammarAccess.getNormalStepAccess().getTypeAssignment_3()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3892:1: ( rule__NormalStep__TypeAssignment_3 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3892:2: rule__NormalStep__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__NormalStep__TypeAssignment_3_in_rule__NormalStep__Group__3__Impl7821);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__3__Impl"


    // $ANTLR start "rule__NormalStep__Group__4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3902:1: rule__NormalStep__Group__4 : rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5 ;
    public final void rule__NormalStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3906:1: ( rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3907:2: rule__NormalStep__Group__4__Impl rule__NormalStep__Group__5
            {
            pushFollow(FOLLOW_rule__NormalStep__Group__4__Impl_in_rule__NormalStep__Group__47851);
            rule__NormalStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalStep__Group__5_in_rule__NormalStep__Group__47854);
            rule__NormalStep__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__4"


    // $ANTLR start "rule__NormalStep__Group__4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3914:1: rule__NormalStep__Group__4__Impl : ( 'by' ) ;
    public final void rule__NormalStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3918:1: ( ( 'by' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3919:1: ( 'by' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3919:1: ( 'by' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3920:1: 'by'
            {
             before(grammarAccess.getNormalStepAccess().getByKeyword_4()); 
            match(input,43,FOLLOW_43_in_rule__NormalStep__Group__4__Impl7882); 
             after(grammarAccess.getNormalStepAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__4__Impl"


    // $ANTLR start "rule__NormalStep__Group__5"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3933:1: rule__NormalStep__Group__5 : rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6 ;
    public final void rule__NormalStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3937:1: ( rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3938:2: rule__NormalStep__Group__5__Impl rule__NormalStep__Group__6
            {
            pushFollow(FOLLOW_rule__NormalStep__Group__5__Impl_in_rule__NormalStep__Group__57913);
            rule__NormalStep__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalStep__Group__6_in_rule__NormalStep__Group__57916);
            rule__NormalStep__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__5"


    // $ANTLR start "rule__NormalStep__Group__5__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3945:1: rule__NormalStep__Group__5__Impl : ( ( rule__NormalStep__ActorAssignment_5 ) ) ;
    public final void rule__NormalStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3949:1: ( ( ( rule__NormalStep__ActorAssignment_5 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3950:1: ( ( rule__NormalStep__ActorAssignment_5 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3950:1: ( ( rule__NormalStep__ActorAssignment_5 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3951:1: ( rule__NormalStep__ActorAssignment_5 )
            {
             before(grammarAccess.getNormalStepAccess().getActorAssignment_5()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3952:1: ( rule__NormalStep__ActorAssignment_5 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3952:2: rule__NormalStep__ActorAssignment_5
            {
            pushFollow(FOLLOW_rule__NormalStep__ActorAssignment_5_in_rule__NormalStep__Group__5__Impl7943);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__5__Impl"


    // $ANTLR start "rule__NormalStep__Group__6"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3962:1: rule__NormalStep__Group__6 : rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7 ;
    public final void rule__NormalStep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3966:1: ( rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3967:2: rule__NormalStep__Group__6__Impl rule__NormalStep__Group__7
            {
            pushFollow(FOLLOW_rule__NormalStep__Group__6__Impl_in_rule__NormalStep__Group__67973);
            rule__NormalStep__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalStep__Group__7_in_rule__NormalStep__Group__67976);
            rule__NormalStep__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__6"


    // $ANTLR start "rule__NormalStep__Group__6__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3974:1: rule__NormalStep__Group__6__Impl : ( ( rule__NormalStep__Alternatives_6 )? ) ;
    public final void rule__NormalStep__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3978:1: ( ( ( rule__NormalStep__Alternatives_6 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3979:1: ( ( rule__NormalStep__Alternatives_6 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3979:1: ( ( rule__NormalStep__Alternatives_6 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3980:1: ( rule__NormalStep__Alternatives_6 )?
            {
             before(grammarAccess.getNormalStepAccess().getAlternatives_6()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3981:1: ( rule__NormalStep__Alternatives_6 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38||LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3981:2: rule__NormalStep__Alternatives_6
                    {
                    pushFollow(FOLLOW_rule__NormalStep__Alternatives_6_in_rule__NormalStep__Group__6__Impl8003);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__6__Impl"


    // $ANTLR start "rule__NormalStep__Group__7"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3991:1: rule__NormalStep__Group__7 : rule__NormalStep__Group__7__Impl ;
    public final void rule__NormalStep__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3995:1: ( rule__NormalStep__Group__7__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:3996:2: rule__NormalStep__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__NormalStep__Group__7__Impl_in_rule__NormalStep__Group__78034);
            rule__NormalStep__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__7"


    // $ANTLR start "rule__NormalStep__Group__7__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4002:1: rule__NormalStep__Group__7__Impl : ( ( rule__NormalStep__Group_7__0 )? ) ;
    public final void rule__NormalStep__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4006:1: ( ( ( rule__NormalStep__Group_7__0 )? ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4007:1: ( ( rule__NormalStep__Group_7__0 )? )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4007:1: ( ( rule__NormalStep__Group_7__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4008:1: ( rule__NormalStep__Group_7__0 )?
            {
             before(grammarAccess.getNormalStepAccess().getGroup_7()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4009:1: ( rule__NormalStep__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4009:2: rule__NormalStep__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__NormalStep__Group_7__0_in_rule__NormalStep__Group__7__Impl8061);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group__7__Impl"


    // $ANTLR start "rule__NormalStep__Group_6_0__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4035:1: rule__NormalStep__Group_6_0__0 : rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1 ;
    public final void rule__NormalStep__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4039:1: ( rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4040:2: rule__NormalStep__Group_6_0__0__Impl rule__NormalStep__Group_6_0__1
            {
            pushFollow(FOLLOW_rule__NormalStep__Group_6_0__0__Impl_in_rule__NormalStep__Group_6_0__08108);
            rule__NormalStep__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalStep__Group_6_0__1_in_rule__NormalStep__Group_6_0__08111);
            rule__NormalStep__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_6_0__0"


    // $ANTLR start "rule__NormalStep__Group_6_0__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4047:1: rule__NormalStep__Group_6_0__0__Impl : ( 'alternatives' ) ;
    public final void rule__NormalStep__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4051:1: ( ( 'alternatives' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4052:1: ( 'alternatives' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4052:1: ( 'alternatives' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4053:1: 'alternatives'
            {
             before(grammarAccess.getNormalStepAccess().getAlternativesKeyword_6_0_0()); 
            match(input,44,FOLLOW_44_in_rule__NormalStep__Group_6_0__0__Impl8139); 
             after(grammarAccess.getNormalStepAccess().getAlternativesKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_6_0__0__Impl"


    // $ANTLR start "rule__NormalStep__Group_6_0__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4066:1: rule__NormalStep__Group_6_0__1 : rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2 ;
    public final void rule__NormalStep__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4070:1: ( rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4071:2: rule__NormalStep__Group_6_0__1__Impl rule__NormalStep__Group_6_0__2
            {
            pushFollow(FOLLOW_rule__NormalStep__Group_6_0__1__Impl_in_rule__NormalStep__Group_6_0__18170);
            rule__NormalStep__Group_6_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalStep__Group_6_0__2_in_rule__NormalStep__Group_6_0__18173);
            rule__NormalStep__Group_6_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_6_0__1"


    // $ANTLR start "rule__NormalStep__Group_6_0__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4078:1: rule__NormalStep__Group_6_0__1__Impl : ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) ) ;
    public final void rule__NormalStep__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4082:1: ( ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4083:1: ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4083:1: ( ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4084:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) ) ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4084:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4085:1: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )
            {
             before(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4086:1: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4086:2: rule__NormalStep__StepAlternativeAssignment_6_0_1
            {
            pushFollow(FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8202);
            rule__NormalStep__StepAlternativeAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 

            }

            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4089:1: ( ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4090:1: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )*
            {
             before(grammarAccess.getNormalStepAccess().getStepAlternativeAssignment_6_0_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4091:1: ( rule__NormalStep__StepAlternativeAssignment_6_0_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==33) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4091:2: rule__NormalStep__StepAlternativeAssignment_6_0_1
            	    {
            	    pushFollow(FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8214);
            	    rule__NormalStep__StepAlternativeAssignment_6_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_6_0__1__Impl"


    // $ANTLR start "rule__NormalStep__Group_6_0__2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4102:1: rule__NormalStep__Group_6_0__2 : rule__NormalStep__Group_6_0__2__Impl ;
    public final void rule__NormalStep__Group_6_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4106:1: ( rule__NormalStep__Group_6_0__2__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4107:2: rule__NormalStep__Group_6_0__2__Impl
            {
            pushFollow(FOLLOW_rule__NormalStep__Group_6_0__2__Impl_in_rule__NormalStep__Group_6_0__28247);
            rule__NormalStep__Group_6_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_6_0__2"


    // $ANTLR start "rule__NormalStep__Group_6_0__2__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4113:1: rule__NormalStep__Group_6_0__2__Impl : ( 'else' ) ;
    public final void rule__NormalStep__Group_6_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4117:1: ( ( 'else' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4118:1: ( 'else' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4118:1: ( 'else' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4119:1: 'else'
            {
             before(grammarAccess.getNormalStepAccess().getElseKeyword_6_0_2()); 
            match(input,45,FOLLOW_45_in_rule__NormalStep__Group_6_0__2__Impl8275); 
             after(grammarAccess.getNormalStepAccess().getElseKeyword_6_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_6_0__2__Impl"


    // $ANTLR start "rule__NormalStep__Group_6_1__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4138:1: rule__NormalStep__Group_6_1__0 : rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1 ;
    public final void rule__NormalStep__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4142:1: ( rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4143:2: rule__NormalStep__Group_6_1__0__Impl rule__NormalStep__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__NormalStep__Group_6_1__0__Impl_in_rule__NormalStep__Group_6_1__08312);
            rule__NormalStep__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalStep__Group_6_1__1_in_rule__NormalStep__Group_6_1__08315);
            rule__NormalStep__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_6_1__0"


    // $ANTLR start "rule__NormalStep__Group_6_1__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4150:1: rule__NormalStep__Group_6_1__0__Impl : ( 'invoke usecase' ) ;
    public final void rule__NormalStep__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4154:1: ( ( 'invoke usecase' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4155:1: ( 'invoke usecase' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4155:1: ( 'invoke usecase' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4156:1: 'invoke usecase'
            {
             before(grammarAccess.getNormalStepAccess().getInvokeUsecaseKeyword_6_1_0()); 
            match(input,38,FOLLOW_38_in_rule__NormalStep__Group_6_1__0__Impl8343); 
             after(grammarAccess.getNormalStepAccess().getInvokeUsecaseKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_6_1__0__Impl"


    // $ANTLR start "rule__NormalStep__Group_6_1__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4169:1: rule__NormalStep__Group_6_1__1 : rule__NormalStep__Group_6_1__1__Impl ;
    public final void rule__NormalStep__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4173:1: ( rule__NormalStep__Group_6_1__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4174:2: rule__NormalStep__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NormalStep__Group_6_1__1__Impl_in_rule__NormalStep__Group_6_1__18374);
            rule__NormalStep__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_6_1__1"


    // $ANTLR start "rule__NormalStep__Group_6_1__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4180:1: rule__NormalStep__Group_6_1__1__Impl : ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) ) ;
    public final void rule__NormalStep__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4184:1: ( ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4185:1: ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4185:1: ( ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4186:1: ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 )
            {
             before(grammarAccess.getNormalStepAccess().getInvokedUseCaseAssignment_6_1_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4187:1: ( rule__NormalStep__InvokedUseCaseAssignment_6_1_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4187:2: rule__NormalStep__InvokedUseCaseAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__NormalStep__InvokedUseCaseAssignment_6_1_1_in_rule__NormalStep__Group_6_1__1__Impl8401);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_6_1__1__Impl"


    // $ANTLR start "rule__NormalStep__Group_7__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4201:1: rule__NormalStep__Group_7__0 : rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1 ;
    public final void rule__NormalStep__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4205:1: ( rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4206:2: rule__NormalStep__Group_7__0__Impl rule__NormalStep__Group_7__1
            {
            pushFollow(FOLLOW_rule__NormalStep__Group_7__0__Impl_in_rule__NormalStep__Group_7__08435);
            rule__NormalStep__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NormalStep__Group_7__1_in_rule__NormalStep__Group_7__08438);
            rule__NormalStep__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_7__0"


    // $ANTLR start "rule__NormalStep__Group_7__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4213:1: rule__NormalStep__Group_7__0__Impl : ( 'next' ) ;
    public final void rule__NormalStep__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4217:1: ( ( 'next' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4218:1: ( 'next' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4218:1: ( 'next' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4219:1: 'next'
            {
             before(grammarAccess.getNormalStepAccess().getNextKeyword_7_0()); 
            match(input,41,FOLLOW_41_in_rule__NormalStep__Group_7__0__Impl8466); 
             after(grammarAccess.getNormalStepAccess().getNextKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_7__0__Impl"


    // $ANTLR start "rule__NormalStep__Group_7__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4232:1: rule__NormalStep__Group_7__1 : rule__NormalStep__Group_7__1__Impl ;
    public final void rule__NormalStep__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4236:1: ( rule__NormalStep__Group_7__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4237:2: rule__NormalStep__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__NormalStep__Group_7__1__Impl_in_rule__NormalStep__Group_7__18497);
            rule__NormalStep__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_7__1"


    // $ANTLR start "rule__NormalStep__Group_7__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4243:1: rule__NormalStep__Group_7__1__Impl : ( ( rule__NormalStep__NextAssignment_7_1 ) ) ;
    public final void rule__NormalStep__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4247:1: ( ( ( rule__NormalStep__NextAssignment_7_1 ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4248:1: ( ( rule__NormalStep__NextAssignment_7_1 ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4248:1: ( ( rule__NormalStep__NextAssignment_7_1 ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4249:1: ( rule__NormalStep__NextAssignment_7_1 )
            {
             before(grammarAccess.getNormalStepAccess().getNextAssignment_7_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4250:1: ( rule__NormalStep__NextAssignment_7_1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4250:2: rule__NormalStep__NextAssignment_7_1
            {
            pushFollow(FOLLOW_rule__NormalStep__NextAssignment_7_1_in_rule__NormalStep__Group_7__1__Impl8524);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__Group_7__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4264:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4268:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4269:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08558);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08561);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4276:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4280:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4281:1: ( RULE_ID )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4281:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4282:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8588); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4293:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4297:1: ( rule__QualifiedName__Group__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4298:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18617);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4304:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4308:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4309:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4309:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4310:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4311:1: ( rule__QualifiedName__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==46) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4311:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8644);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4325:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4329:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4330:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08679);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08682);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4337:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4341:1: ( ( '.' ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4342:1: ( '.' )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4342:1: ( '.' )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4343:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__QualifiedName__Group_1__0__Impl8710); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4356:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4360:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4361:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18741);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4367:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4371:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4372:1: ( RULE_ID )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4372:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4373:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8768); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__UseCase__UnorderedGroup_4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4389:1: rule__UseCase__UnorderedGroup_4 : ( rule__UseCase__UnorderedGroup_4__0 )? ;
    public final void rule__UseCase__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4394:1: ( ( rule__UseCase__UnorderedGroup_4__0 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4395:2: ( rule__UseCase__UnorderedGroup_4__0 )?
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4395:2: ( rule__UseCase__UnorderedGroup_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4395:2: rule__UseCase__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__0_in_rule__UseCase__UnorderedGroup_48802);
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

            	getUnorderedGroupHelper().leave(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__UnorderedGroup_4"


    // $ANTLR start "rule__UseCase__UnorderedGroup_4__Impl"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4405:1: rule__UseCase__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) ) ;
    public final void rule__UseCase__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4410:1: ( ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4411:3: ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4411:3: ( ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4413:4: ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) )
                    {
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4413:4: ({...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) ) )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4414:5: {...}? => ( ( ( rule__UseCase__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__UseCase__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4414:104: ( ( ( rule__UseCase__Group_4_0__0 ) ) )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4415:6: ( ( rule__UseCase__Group_4_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4421:6: ( ( rule__UseCase__Group_4_0__0 ) )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4423:7: ( rule__UseCase__Group_4_0__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_4_0()); 
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4424:7: ( rule__UseCase__Group_4_0__0 )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4424:8: rule__UseCase__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__UseCase__Group_4_0__0_in_rule__UseCase__UnorderedGroup_4__Impl8889);
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
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4430:4: ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) )
                    {
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4430:4: ({...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) ) )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4431:5: {...}? => ( ( ( rule__UseCase__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__UseCase__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4431:104: ( ( ( rule__UseCase__Group_4_1__0 ) ) )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4432:6: ( ( rule__UseCase__Group_4_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4438:6: ( ( rule__UseCase__Group_4_1__0 ) )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4440:7: ( rule__UseCase__Group_4_1__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_4_1()); 
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4441:7: ( rule__UseCase__Group_4_1__0 )
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4441:8: rule__UseCase__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__UseCase__Group_4_1__0_in_rule__UseCase__UnorderedGroup_4__Impl8980);
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

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUseCaseAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__UseCase__UnorderedGroup_4__0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4456:1: rule__UseCase__UnorderedGroup_4__0 : rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )? ;
    public final void rule__UseCase__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4460:1: ( rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )? )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4461:2: rule__UseCase__UnorderedGroup_4__Impl ( rule__UseCase__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__09039);
            rule__UseCase__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4462:2: ( rule__UseCase__UnorderedGroup_4__1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getUseCaseAccess().getUnorderedGroup_4(), 1) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4462:2: rule__UseCase__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__1_in_rule__UseCase__UnorderedGroup_4__09042);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__UnorderedGroup_4__0"


    // $ANTLR start "rule__UseCase__UnorderedGroup_4__1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4469:1: rule__UseCase__UnorderedGroup_4__1 : rule__UseCase__UnorderedGroup_4__Impl ;
    public final void rule__UseCase__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4473:1: ( rule__UseCase__UnorderedGroup_4__Impl )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4474:2: rule__UseCase__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__19067);
            rule__UseCase__UnorderedGroup_4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__UnorderedGroup_4__1"


    // $ANTLR start "rule__UseCasesModel__PackagesAssignment"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4485:1: rule__UseCasesModel__PackagesAssignment : ( rulePackageDeclaration ) ;
    public final void rule__UseCasesModel__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4489:1: ( ( rulePackageDeclaration ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4490:1: ( rulePackageDeclaration )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4490:1: ( rulePackageDeclaration )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4491:1: rulePackageDeclaration
            {
             before(grammarAccess.getUseCasesModelAccess().getPackagesPackageDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_rule__UseCasesModel__PackagesAssignment9099);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCasesModel__PackagesAssignment"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4500:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4504:1: ( ( ruleQualifiedName ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4505:1: ( ruleQualifiedName )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4505:1: ( ruleQualifiedName )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4506:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19130);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__DescriptionAssignment_2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4515:1: rule__PackageDeclaration__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PackageDeclaration__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4519:1: ( ( RULE_STRING ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4520:1: ( RULE_STRING )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4520:1: ( RULE_STRING )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4521:1: RULE_STRING
            {
             before(grammarAccess.getPackageDeclarationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DescriptionAssignment_29161); 
             after(grammarAccess.getPackageDeclarationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__DescriptionAssignment_2"


    // $ANTLR start "rule__PackageDeclaration__ActorsAssignment_3_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4530:1: rule__PackageDeclaration__ActorsAssignment_3_1 : ( ruleActor ) ;
    public final void rule__PackageDeclaration__ActorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4534:1: ( ( ruleActor ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4535:1: ( ruleActor )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4535:1: ( ruleActor )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4536:1: ruleActor
            {
             before(grammarAccess.getPackageDeclarationAccess().getActorsActorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleActor_in_rule__PackageDeclaration__ActorsAssignment_3_19192);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ActorsAssignment_3_1"


    // $ANTLR start "rule__PackageDeclaration__UseCasesAssignment_4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4545:1: rule__PackageDeclaration__UseCasesAssignment_4 : ( ruleUseCase ) ;
    public final void rule__PackageDeclaration__UseCasesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4549:1: ( ( ruleUseCase ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4550:1: ( ruleUseCase )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4550:1: ( ruleUseCase )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4551:1: ruleUseCase
            {
             before(grammarAccess.getPackageDeclarationAccess().getUseCasesUseCaseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleUseCase_in_rule__PackageDeclaration__UseCasesAssignment_49223);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__UseCasesAssignment_4"


    // $ANTLR start "rule__UseCase__NameAssignment_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4560:1: rule__UseCase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4564:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4565:1: ( RULE_ID )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4565:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4566:1: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseCase__NameAssignment_19254); 
             after(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__NameAssignment_1"


    // $ANTLR start "rule__UseCase__DescriptionAssignment_2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4575:1: rule__UseCase__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UseCase__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4579:1: ( ( RULE_STRING ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4580:1: ( RULE_STRING )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4580:1: ( RULE_STRING )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4581:1: RULE_STRING
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UseCase__DescriptionAssignment_29285); 
             after(grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__DescriptionAssignment_2"


    // $ANTLR start "rule__UseCase__SuperCaseAssignment_3_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4590:1: rule__UseCase__SuperCaseAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__SuperCaseAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4594:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4595:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4595:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4596:1: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getSuperCaseUseCaseCrossReference_3_1_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4597:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4598:1: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getSuperCaseUseCaseIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseCase__SuperCaseAssignment_3_19320); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__SuperCaseAssignment_3_1"


    // $ANTLR start "rule__UseCase__PreconditionsAssignment_4_0_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4609:1: rule__UseCase__PreconditionsAssignment_4_0_1 : ( ruleUCCondition ) ;
    public final void rule__UseCase__PreconditionsAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4613:1: ( ( ruleUCCondition ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4614:1: ( ruleUCCondition )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4614:1: ( ruleUCCondition )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4615:1: ruleUCCondition
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsUCConditionParserRuleCall_4_0_1_0()); 
            pushFollow(FOLLOW_ruleUCCondition_in_rule__UseCase__PreconditionsAssignment_4_0_19355);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__PreconditionsAssignment_4_0_1"


    // $ANTLR start "rule__UseCase__PostconditionsAssignment_4_1_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4624:1: rule__UseCase__PostconditionsAssignment_4_1_1 : ( ruleUCCondition ) ;
    public final void rule__UseCase__PostconditionsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4628:1: ( ( ruleUCCondition ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4629:1: ( ruleUCCondition )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4629:1: ( ruleUCCondition )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4630:1: ruleUCCondition
            {
             before(grammarAccess.getUseCaseAccess().getPostconditionsUCConditionParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleUCCondition_in_rule__UseCase__PostconditionsAssignment_4_1_19386);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__PostconditionsAssignment_4_1_1"


    // $ANTLR start "rule__UseCase__FlowsAssignment_5"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4639:1: rule__UseCase__FlowsAssignment_5 : ( ruleFlow ) ;
    public final void rule__UseCase__FlowsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4643:1: ( ( ruleFlow ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4644:1: ( ruleFlow )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4644:1: ( ruleFlow )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4645:1: ruleFlow
            {
             before(grammarAccess.getUseCaseAccess().getFlowsFlowParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFlow_in_rule__UseCase__FlowsAssignment_59417);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__FlowsAssignment_5"


    // $ANTLR start "rule__UCCondition__NameAssignment"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4654:1: rule__UCCondition__NameAssignment : ( RULE_STRING ) ;
    public final void rule__UCCondition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4658:1: ( ( RULE_STRING ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4659:1: ( RULE_STRING )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4659:1: ( RULE_STRING )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4660:1: RULE_STRING
            {
             before(grammarAccess.getUCConditionAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UCCondition__NameAssignment9448); 
             after(grammarAccess.getUCConditionAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UCCondition__NameAssignment"


    // $ANTLR start "rule__Actor__NameAssignment_0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4669:1: rule__Actor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4673:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4674:1: ( RULE_ID )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4674:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4675:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_09479); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_0"


    // $ANTLR start "rule__Actor__TypeAssignment_2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4684:1: rule__Actor__TypeAssignment_2 : ( ruleActorType ) ;
    public final void rule__Actor__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4688:1: ( ( ruleActorType ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4689:1: ( ruleActorType )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4689:1: ( ruleActorType )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4690:1: ruleActorType
            {
             before(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleActorType_in_rule__Actor__TypeAssignment_29510);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__TypeAssignment_2"


    // $ANTLR start "rule__Actor__DescriptionAssignment_3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4699:1: rule__Actor__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Actor__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4703:1: ( ( RULE_STRING ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4704:1: ( RULE_STRING )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4704:1: ( RULE_STRING )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4705:1: RULE_STRING
            {
             before(grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Actor__DescriptionAssignment_39541); 
             after(grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__DescriptionAssignment_3"


    // $ANTLR start "rule__Actor__ExtendsAssignment_4_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4714:1: rule__Actor__ExtendsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4718:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4719:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4719:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4720:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getExtendsActorCrossReference_4_1_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4721:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4722:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getExtendsActorIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__ExtendsAssignment_4_19576); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__ExtendsAssignment_4_1"


    // $ANTLR start "rule__BasicFlow__StepsAssignment_2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4733:1: rule__BasicFlow__StepsAssignment_2 : ( ruleStep ) ;
    public final void rule__BasicFlow__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4737:1: ( ( ruleStep ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4738:1: ( ruleStep )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4738:1: ( ruleStep )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4739:1: ruleStep
            {
             before(grammarAccess.getBasicFlowAccess().getStepsStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__BasicFlow__StepsAssignment_29611);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__StepsAssignment_2"


    // $ANTLR start "rule__BasicFlow__FinalStateAssignment_4_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4748:1: rule__BasicFlow__FinalStateAssignment_4_1 : ( ruleUCCondition ) ;
    public final void rule__BasicFlow__FinalStateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4752:1: ( ( ruleUCCondition ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4753:1: ( ruleUCCondition )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4753:1: ( ruleUCCondition )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4754:1: ruleUCCondition
            {
             before(grammarAccess.getBasicFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleUCCondition_in_rule__BasicFlow__FinalStateAssignment_4_19642);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicFlow__FinalStateAssignment_4_1"


    // $ANTLR start "rule__ExceptionFlow__NameAssignment_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4763:1: rule__ExceptionFlow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExceptionFlow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4767:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4768:1: ( RULE_ID )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4768:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4769:1: RULE_ID
            {
             before(grammarAccess.getExceptionFlowAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExceptionFlow__NameAssignment_19673); 
             after(grammarAccess.getExceptionFlowAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__NameAssignment_1"


    // $ANTLR start "rule__ExceptionFlow__ConditionAssignment_3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4778:1: rule__ExceptionFlow__ConditionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ExceptionFlow__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4782:1: ( ( RULE_STRING ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4783:1: ( RULE_STRING )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4783:1: ( RULE_STRING )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4784:1: RULE_STRING
            {
             before(grammarAccess.getExceptionFlowAccess().getConditionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExceptionFlow__ConditionAssignment_39704); 
             after(grammarAccess.getExceptionFlowAccess().getConditionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__ConditionAssignment_3"


    // $ANTLR start "rule__ExceptionFlow__StepsAssignment_5"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4793:1: rule__ExceptionFlow__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__ExceptionFlow__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4797:1: ( ( ruleStep ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4798:1: ( ruleStep )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4798:1: ( ruleStep )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4799:1: ruleStep
            {
             before(grammarAccess.getExceptionFlowAccess().getStepsStepParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__ExceptionFlow__StepsAssignment_59735);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__StepsAssignment_5"


    // $ANTLR start "rule__ExceptionFlow__FinalStateAssignment_7_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4808:1: rule__ExceptionFlow__FinalStateAssignment_7_1 : ( ruleUCCondition ) ;
    public final void rule__ExceptionFlow__FinalStateAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4812:1: ( ( ruleUCCondition ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4813:1: ( ruleUCCondition )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4813:1: ( ruleUCCondition )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4814:1: ruleUCCondition
            {
             before(grammarAccess.getExceptionFlowAccess().getFinalStateUCConditionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleUCCondition_in_rule__ExceptionFlow__FinalStateAssignment_7_19766);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionFlow__FinalStateAssignment_7_1"


    // $ANTLR start "rule__AlternativeFlow__NameAssignment_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4823:1: rule__AlternativeFlow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AlternativeFlow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4827:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4828:1: ( RULE_ID )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4828:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4829:1: RULE_ID
            {
             before(grammarAccess.getAlternativeFlowAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlow__NameAssignment_19797); 
             after(grammarAccess.getAlternativeFlowAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__NameAssignment_1"


    // $ANTLR start "rule__AlternativeFlow__StepsAssignment_2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4838:1: rule__AlternativeFlow__StepsAssignment_2 : ( ruleStep ) ;
    public final void rule__AlternativeFlow__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4842:1: ( ( ruleStep ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4843:1: ( ruleStep )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4843:1: ( ruleStep )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4844:1: ruleStep
            {
             before(grammarAccess.getAlternativeFlowAccess().getStepsStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__AlternativeFlow__StepsAssignment_29828);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__StepsAssignment_2"


    // $ANTLR start "rule__AlternativeFlow__FinalStateAssignment_4_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4853:1: rule__AlternativeFlow__FinalStateAssignment_4_1 : ( ruleUCCondition ) ;
    public final void rule__AlternativeFlow__FinalStateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4857:1: ( ( ruleUCCondition ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4858:1: ( ruleUCCondition )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4858:1: ( ruleUCCondition )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4859:1: ruleUCCondition
            {
             before(grammarAccess.getAlternativeFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleUCCondition_in_rule__AlternativeFlow__FinalStateAssignment_4_19859);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlow__FinalStateAssignment_4_1"


    // $ANTLR start "rule__ParallelFlow__NameAssignment_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4868:1: rule__ParallelFlow__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParallelFlow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4872:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4873:1: ( RULE_ID )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4873:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4874:1: RULE_ID
            {
             before(grammarAccess.getParallelFlowAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelFlow__NameAssignment_19890); 
             after(grammarAccess.getParallelFlowAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__NameAssignment_1"


    // $ANTLR start "rule__ParallelFlow__StepsAssignment_2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4883:1: rule__ParallelFlow__StepsAssignment_2 : ( ruleStep ) ;
    public final void rule__ParallelFlow__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4887:1: ( ( ruleStep ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4888:1: ( ruleStep )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4888:1: ( ruleStep )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4889:1: ruleStep
            {
             before(grammarAccess.getParallelFlowAccess().getStepsStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStep_in_rule__ParallelFlow__StepsAssignment_29921);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__StepsAssignment_2"


    // $ANTLR start "rule__ParallelFlow__FinalStateAssignment_4_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4898:1: rule__ParallelFlow__FinalStateAssignment_4_1 : ( ruleUCCondition ) ;
    public final void rule__ParallelFlow__FinalStateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4902:1: ( ( ruleUCCondition ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4903:1: ( ruleUCCondition )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4903:1: ( ruleUCCondition )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4904:1: ruleUCCondition
            {
             before(grammarAccess.getParallelFlowAccess().getFinalStateUCConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleUCCondition_in_rule__ParallelFlow__FinalStateAssignment_4_19952);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelFlow__FinalStateAssignment_4_1"


    // $ANTLR start "rule__Condition__ConditionAssignment_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4913:1: rule__Condition__ConditionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Condition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4917:1: ( ( RULE_STRING ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4918:1: ( RULE_STRING )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4918:1: ( RULE_STRING )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4919:1: RULE_STRING
            {
             before(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Condition__ConditionAssignment_19983); 
             after(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConditionAssignment_1"


    // $ANTLR start "rule__Condition__ContinuationAssignment_3_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4928:1: rule__Condition__ContinuationAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ContinuationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4932:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4933:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4933:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4934:1: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getContinuationStepCrossReference_3_1_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4935:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4936:1: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getContinuationStepIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Condition__ContinuationAssignment_3_110018); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ContinuationAssignment_3_1"


    // $ANTLR start "rule__LocalAlternative__ConditionAssignment_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4947:1: rule__LocalAlternative__ConditionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LocalAlternative__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4951:1: ( ( RULE_STRING ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4952:1: ( RULE_STRING )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4952:1: ( RULE_STRING )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4953:1: RULE_STRING
            {
             before(grammarAccess.getLocalAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LocalAlternative__ConditionAssignment_110053); 
             after(grammarAccess.getLocalAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__ConditionAssignment_1"


    // $ANTLR start "rule__LocalAlternative__DescriptionAssignment_3_0"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4962:1: rule__LocalAlternative__DescriptionAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__LocalAlternative__DescriptionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4966:1: ( ( RULE_STRING ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4967:1: ( RULE_STRING )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4967:1: ( RULE_STRING )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4968:1: RULE_STRING
            {
             before(grammarAccess.getLocalAlternativeAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LocalAlternative__DescriptionAssignment_3_010084); 
             after(grammarAccess.getLocalAlternativeAccess().getDescriptionSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__DescriptionAssignment_3_0"


    // $ANTLR start "rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4977:1: rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4981:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4982:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4982:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4983:1: ( RULE_ID )
            {
             before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseCrossReference_3_1_1_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4984:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4985:1: RULE_ID
            {
             before(grammarAccess.getLocalAlternativeAccess().getInvokedUseCaseUseCaseIDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_110119); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1"


    // $ANTLR start "rule__LocalAlternative__ContinuationAssignment_4_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:4996:1: rule__LocalAlternative__ContinuationAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__LocalAlternative__ContinuationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5000:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5001:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5001:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5002:1: ( RULE_ID )
            {
             before(grammarAccess.getLocalAlternativeAccess().getContinuationStepCrossReference_4_1_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5003:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5004:1: RULE_ID
            {
             before(grammarAccess.getLocalAlternativeAccess().getContinuationStepIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalAlternative__ContinuationAssignment_4_110158); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAlternative__ContinuationAssignment_4_1"


    // $ANTLR start "rule__AlternativeFlowAlternative__ConditionAssignment_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5015:1: rule__AlternativeFlowAlternative__ConditionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AlternativeFlowAlternative__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5019:1: ( ( RULE_STRING ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5020:1: ( RULE_STRING )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5020:1: ( RULE_STRING )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5021:1: RULE_STRING
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AlternativeFlowAlternative__ConditionAssignment_110193); 
             after(grammarAccess.getAlternativeFlowAlternativeAccess().getConditionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__ConditionAssignment_1"


    // $ANTLR start "rule__AlternativeFlowAlternative__RefAssignment_4"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5030:1: rule__AlternativeFlowAlternative__RefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AlternativeFlowAlternative__RefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5034:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5035:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5035:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5036:1: ( RULE_ID )
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowCrossReference_4_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5037:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5038:1: RULE_ID
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getRefNamedFlowIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__RefAssignment_410228); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__RefAssignment_4"


    // $ANTLR start "rule__AlternativeFlowAlternative__ContinuationAssignment_5_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5049:1: rule__AlternativeFlowAlternative__ContinuationAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__AlternativeFlowAlternative__ContinuationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5053:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5054:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5054:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5055:1: ( RULE_ID )
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepCrossReference_5_1_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5056:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5057:1: RULE_ID
            {
             before(grammarAccess.getAlternativeFlowAlternativeAccess().getContinuationStepIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__ContinuationAssignment_5_110267); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeFlowAlternative__ContinuationAssignment_5_1"


    // $ANTLR start "rule__ParallelStep__NameAssignment_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5068:1: rule__ParallelStep__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParallelStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5072:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5073:1: ( RULE_ID )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5073:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5074:1: RULE_ID
            {
             before(grammarAccess.getParallelStepAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__NameAssignment_110302); 
             after(grammarAccess.getParallelStepAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__NameAssignment_1"


    // $ANTLR start "rule__ParallelStep__LabelAssignment_2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5083:1: rule__ParallelStep__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ParallelStep__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5087:1: ( ( RULE_STRING ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5088:1: ( RULE_STRING )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5088:1: ( RULE_STRING )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5089:1: RULE_STRING
            {
             before(grammarAccess.getParallelStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ParallelStep__LabelAssignment_210333); 
             after(grammarAccess.getParallelStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__LabelAssignment_2"


    // $ANTLR start "rule__ParallelStep__InvokedFlowsAssignment_3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5098:1: rule__ParallelStep__InvokedFlowsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ParallelStep__InvokedFlowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5102:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5103:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5103:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5104:1: ( RULE_ID )
            {
             before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_3_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5105:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5106:1: RULE_ID
            {
             before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_310368); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__InvokedFlowsAssignment_3"


    // $ANTLR start "rule__ParallelStep__InvokedFlowsAssignment_4_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5117:1: rule__ParallelStep__InvokedFlowsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParallelStep__InvokedFlowsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5121:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5122:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5122:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5123:1: ( RULE_ID )
            {
             before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowCrossReference_4_1_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5124:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5125:1: RULE_ID
            {
             before(grammarAccess.getParallelStepAccess().getInvokedFlowsParallelFlowIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_4_110407); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__InvokedFlowsAssignment_4_1"


    // $ANTLR start "rule__ParallelStep__NextAssignment_5_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5136:1: rule__ParallelStep__NextAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParallelStep__NextAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5140:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5141:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5141:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5142:1: ( RULE_ID )
            {
             before(grammarAccess.getParallelStepAccess().getNextStepCrossReference_5_1_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5143:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5144:1: RULE_ID
            {
             before(grammarAccess.getParallelStepAccess().getNextStepIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParallelStep__NextAssignment_5_110446); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelStep__NextAssignment_5_1"


    // $ANTLR start "rule__NormalStep__NameAssignment_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5155:1: rule__NormalStep__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NormalStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5159:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5160:1: ( RULE_ID )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5160:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5161:1: RULE_ID
            {
             before(grammarAccess.getNormalStepAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__NameAssignment_110481); 
             after(grammarAccess.getNormalStepAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__NameAssignment_1"


    // $ANTLR start "rule__NormalStep__LabelAssignment_2"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5170:1: rule__NormalStep__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__NormalStep__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5174:1: ( ( RULE_STRING ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5175:1: ( RULE_STRING )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5175:1: ( RULE_STRING )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5176:1: RULE_STRING
            {
             before(grammarAccess.getNormalStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NormalStep__LabelAssignment_210512); 
             after(grammarAccess.getNormalStepAccess().getLabelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__LabelAssignment_2"


    // $ANTLR start "rule__NormalStep__TypeAssignment_3"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5185:1: rule__NormalStep__TypeAssignment_3 : ( ruleStepType ) ;
    public final void rule__NormalStep__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5189:1: ( ( ruleStepType ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5190:1: ( ruleStepType )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5190:1: ( ruleStepType )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5191:1: ruleStepType
            {
             before(grammarAccess.getNormalStepAccess().getTypeStepTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStepType_in_rule__NormalStep__TypeAssignment_310543);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__TypeAssignment_3"


    // $ANTLR start "rule__NormalStep__ActorAssignment_5"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5200:1: rule__NormalStep__ActorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__NormalStep__ActorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5204:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5205:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5205:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5206:1: ( RULE_ID )
            {
             before(grammarAccess.getNormalStepAccess().getActorActorCrossReference_5_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5207:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5208:1: RULE_ID
            {
             before(grammarAccess.getNormalStepAccess().getActorActorIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__ActorAssignment_510578); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__ActorAssignment_5"


    // $ANTLR start "rule__NormalStep__StepAlternativeAssignment_6_0_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5219:1: rule__NormalStep__StepAlternativeAssignment_6_0_1 : ( ruleStepAlternative ) ;
    public final void rule__NormalStep__StepAlternativeAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5223:1: ( ( ruleStepAlternative ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5224:1: ( ruleStepAlternative )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5224:1: ( ruleStepAlternative )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5225:1: ruleStepAlternative
            {
             before(grammarAccess.getNormalStepAccess().getStepAlternativeStepAlternativeParserRuleCall_6_0_1_0()); 
            pushFollow(FOLLOW_ruleStepAlternative_in_rule__NormalStep__StepAlternativeAssignment_6_0_110613);
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__StepAlternativeAssignment_6_0_1"


    // $ANTLR start "rule__NormalStep__InvokedUseCaseAssignment_6_1_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5234:1: rule__NormalStep__InvokedUseCaseAssignment_6_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__NormalStep__InvokedUseCaseAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5238:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5239:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5239:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5240:1: ( RULE_ID )
            {
             before(grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseCrossReference_6_1_1_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5241:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5242:1: RULE_ID
            {
             before(grammarAccess.getNormalStepAccess().getInvokedUseCaseUseCaseIDTerminalRuleCall_6_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__InvokedUseCaseAssignment_6_1_110648); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__InvokedUseCaseAssignment_6_1_1"


    // $ANTLR start "rule__NormalStep__NextAssignment_7_1"
    // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5253:1: rule__NormalStep__NextAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__NormalStep__NextAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5257:1: ( ( ( RULE_ID ) ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5258:1: ( ( RULE_ID ) )
            {
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5258:1: ( ( RULE_ID ) )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5259:1: ( RULE_ID )
            {
             before(grammarAccess.getNormalStepAccess().getNextStepCrossReference_7_1_0()); 
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5260:1: ( RULE_ID )
            // ../UseCaseDSL.ui/src-gen/UseCaseDSL/ui/contentassist/antlr/internal/InternalUseCase.g:5261:1: RULE_ID
            {
             before(grammarAccess.getNormalStepAccess().getNextStepIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NormalStep__NextAssignment_7_110687); 
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalStep__NextAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleUseCasesModel_in_entryRuleUseCasesModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCasesModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCasesModel__PackagesAssignment_in_ruleUseCasesModel94 = new BitSet(new long[]{0x0000000000100002L});
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
    public static final BitSet FOLLOW_11_in_rule__ActorType__Alternatives1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ActorType__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ActorType__Alternatives1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StepType__Alternatives1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StepType__Alternatives1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StepType__Alternatives1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StepType__Alternatives1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StepType__Alternatives1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StepType__Alternatives1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PackageDeclaration__Group__0__Impl1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11894 = new BitSet(new long[]{0x0000000000E00020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21954 = new BitSet(new long[]{0x0000000000E00020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__DescriptionAssignment_2_in_rule__PackageDeclaration__Group__2__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32015 = new BitSet(new long[]{0x0000000000E00020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42076 = new BitSet(new long[]{0x0000000000E00020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__UseCasesAssignment_4_in_rule__PackageDeclaration__Group__4__Impl2106 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PackageDeclaration__Group__5__Impl2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDeclaration__Group_3__0__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__12270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2299 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ActorsAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2311 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__02348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__02351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UseCase__Group__0__Impl2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__12410 = new BitSet(new long[]{0x000000000E000020L});
    public static final BitSet FOLLOW_rule__UseCase__Group__2_in_rule__UseCase__Group__12413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__NameAssignment_1_in_rule__UseCase__Group__1__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__2__Impl_in_rule__UseCase__Group__22470 = new BitSet(new long[]{0x000000000E000020L});
    public static final BitSet FOLLOW_rule__UseCase__Group__3_in_rule__UseCase__Group__22473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__DescriptionAssignment_2_in_rule__UseCase__Group__2__Impl2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__3__Impl_in_rule__UseCase__Group__32531 = new BitSet(new long[]{0x000000000E000020L});
    public static final BitSet FOLLOW_rule__UseCase__Group__4_in_rule__UseCase__Group__32534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_3__0_in_rule__UseCase__Group__3__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__4__Impl_in_rule__UseCase__Group__42592 = new BitSet(new long[]{0x0000001921000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__5_in_rule__UseCase__Group__42595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4_in_rule__UseCase__Group__4__Impl2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__5__Impl_in_rule__UseCase__Group__52652 = new BitSet(new long[]{0x0000001921000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__6_in_rule__UseCase__Group__52655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__FlowsAssignment_5_in_rule__UseCase__Group__5__Impl2682 = new BitSet(new long[]{0x0000001920000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__6__Impl_in_rule__UseCase__Group__62713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UseCase__Group__6__Impl2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_3__0__Impl_in_rule__UseCase__Group_3__02786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseCase__Group_3__1_in_rule__UseCase__Group_3__02789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UseCase__Group_3__0__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_3__1__Impl_in_rule__UseCase__Group_3__12848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__SuperCaseAssignment_3_1_in_rule__UseCase__Group_3__1__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_4_0__0__Impl_in_rule__UseCase__Group_4_0__02909 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UseCase__Group_4_0__1_in_rule__UseCase__Group_4_0__02912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UseCase__Group_4_0__0__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_4_0__1__Impl_in_rule__UseCase__Group_4_0__12971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl3000 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__UseCase__PreconditionsAssignment_4_0_1_in_rule__UseCase__Group_4_0__1__Impl3012 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__UseCase__Group_4_1__0__Impl_in_rule__UseCase__Group_4_1__03049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UseCase__Group_4_1__1_in_rule__UseCase__Group_4_1__03052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UseCase__Group_4_1__0__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_4_1__1__Impl_in_rule__UseCase__Group_4_1__13111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3140 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__UseCase__PostconditionsAssignment_4_1_1_in_rule__UseCase__Group_4_1__1__Impl3152 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03189 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13249 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Actor__Group__1__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23311 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__TypeAssignment_2_in_rule__Actor__Group__2__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__33371 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__Actor__Group__4_in_rule__Actor__Group__33374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__DescriptionAssignment_3_in_rule__Actor__Group__3__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__4__Impl_in_rule__Actor__Group__43432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_4__0_in_rule__Actor__Group__4__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_4__0__Impl_in_rule__Actor__Group_4__03500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Actor__Group_4__1_in_rule__Actor__Group_4__03503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Actor__Group_4__0__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_4__1__Impl_in_rule__Actor__Group_4__13562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__ExtendsAssignment_4_1_in_rule__Actor__Group_4__1__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__0__Impl_in_rule__BasicFlow__Group__03623 = new BitSet(new long[]{0x0000048040000000L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__1_in_rule__BasicFlow__Group__03626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BasicFlow__Group__0__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__1__Impl_in_rule__BasicFlow__Group__13685 = new BitSet(new long[]{0x0000048040000000L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__2_in_rule__BasicFlow__Group__13688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__2__Impl_in_rule__BasicFlow__Group__23746 = new BitSet(new long[]{0x0000048040000000L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__3_in_rule__BasicFlow__Group__23749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__StepsAssignment_2_in_rule__BasicFlow__Group__2__Impl3776 = new BitSet(new long[]{0x0000048000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__3__Impl_in_rule__BasicFlow__Group__33807 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__4_in_rule__BasicFlow__Group__33810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BasicFlow__Group__3__Impl3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group__4__Impl_in_rule__BasicFlow__Group__43869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group_4__0_in_rule__BasicFlow__Group__4__Impl3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group_4__0__Impl_in_rule__BasicFlow__Group_4__03937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group_4__1_in_rule__BasicFlow__Group_4__03940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BasicFlow__Group_4__0__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__Group_4__1__Impl_in_rule__BasicFlow__Group_4__13999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicFlow__FinalStateAssignment_4_1_in_rule__BasicFlow__Group_4__1__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__0__Impl_in_rule__ExceptionFlow__Group__04060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__1_in_rule__ExceptionFlow__Group__04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExceptionFlow__Group__0__Impl4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__1__Impl_in_rule__ExceptionFlow__Group__14122 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__2_in_rule__ExceptionFlow__Group__14125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__NameAssignment_1_in_rule__ExceptionFlow__Group__1__Impl4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__2__Impl_in_rule__ExceptionFlow__Group__24182 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__3_in_rule__ExceptionFlow__Group__24185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ExceptionFlow__Group__2__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__3__Impl_in_rule__ExceptionFlow__Group__34244 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__4_in_rule__ExceptionFlow__Group__34247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__ConditionAssignment_3_in_rule__ExceptionFlow__Group__3__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__4__Impl_in_rule__ExceptionFlow__Group__44304 = new BitSet(new long[]{0x0000048040000000L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__5_in_rule__ExceptionFlow__Group__44307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ExceptionFlow__Group__4__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__5__Impl_in_rule__ExceptionFlow__Group__54366 = new BitSet(new long[]{0x0000048040000000L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__6_in_rule__ExceptionFlow__Group__54369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__StepsAssignment_5_in_rule__ExceptionFlow__Group__5__Impl4396 = new BitSet(new long[]{0x0000048000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__6__Impl_in_rule__ExceptionFlow__Group__64427 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__7_in_rule__ExceptionFlow__Group__64430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ExceptionFlow__Group__6__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group__7__Impl_in_rule__ExceptionFlow__Group__74489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__0_in_rule__ExceptionFlow__Group__7__Impl4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__0__Impl_in_rule__ExceptionFlow__Group_7__04563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__1_in_rule__ExceptionFlow__Group_7__04566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExceptionFlow__Group_7__0__Impl4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__Group_7__1__Impl_in_rule__ExceptionFlow__Group_7__14625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionFlow__FinalStateAssignment_7_1_in_rule__ExceptionFlow__Group_7__1__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__0__Impl_in_rule__AlternativeFlow__Group__04686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__1_in_rule__AlternativeFlow__Group__04689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AlternativeFlow__Group__0__Impl4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__1__Impl_in_rule__AlternativeFlow__Group__14748 = new BitSet(new long[]{0x0000048040000000L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__2_in_rule__AlternativeFlow__Group__14751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__NameAssignment_1_in_rule__AlternativeFlow__Group__1__Impl4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__2__Impl_in_rule__AlternativeFlow__Group__24808 = new BitSet(new long[]{0x0000048040000000L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__3_in_rule__AlternativeFlow__Group__24811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__StepsAssignment_2_in_rule__AlternativeFlow__Group__2__Impl4838 = new BitSet(new long[]{0x0000048000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__3__Impl_in_rule__AlternativeFlow__Group__34869 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__4_in_rule__AlternativeFlow__Group__34872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AlternativeFlow__Group__3__Impl4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group__4__Impl_in_rule__AlternativeFlow__Group__44931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__0_in_rule__AlternativeFlow__Group__4__Impl4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__0__Impl_in_rule__AlternativeFlow__Group_4__04999 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__1_in_rule__AlternativeFlow__Group_4__05002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AlternativeFlow__Group_4__0__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__Group_4__1__Impl_in_rule__AlternativeFlow__Group_4__15061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlow__FinalStateAssignment_4_1_in_rule__AlternativeFlow__Group_4__1__Impl5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group__0__Impl_in_rule__ParallelFlow__Group__05122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group__1_in_rule__ParallelFlow__Group__05125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ParallelFlow__Group__0__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group__1__Impl_in_rule__ParallelFlow__Group__15184 = new BitSet(new long[]{0x0000048040000000L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group__2_in_rule__ParallelFlow__Group__15187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelFlow__NameAssignment_1_in_rule__ParallelFlow__Group__1__Impl5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group__2__Impl_in_rule__ParallelFlow__Group__25244 = new BitSet(new long[]{0x0000048040000000L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group__3_in_rule__ParallelFlow__Group__25247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelFlow__StepsAssignment_2_in_rule__ParallelFlow__Group__2__Impl5274 = new BitSet(new long[]{0x0000048000000002L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group__3__Impl_in_rule__ParallelFlow__Group__35305 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group__4_in_rule__ParallelFlow__Group__35308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParallelFlow__Group__3__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group__4__Impl_in_rule__ParallelFlow__Group__45367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__0_in_rule__ParallelFlow__Group__4__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__0__Impl_in_rule__ParallelFlow__Group_4__05435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__1_in_rule__ParallelFlow__Group_4__05438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParallelFlow__Group_4__0__Impl5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelFlow__Group_4__1__Impl_in_rule__ParallelFlow__Group_4__15497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelFlow__FinalStateAssignment_4_1_in_rule__ParallelFlow__Group_4__1__Impl5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__05558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__05561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Condition__Group__0__Impl5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__15620 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Condition__Group__2_in_rule__Condition__Group__15623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ConditionAssignment_1_in_rule__Condition__Group__1__Impl5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__2__Impl_in_rule__Condition__Group__25680 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Condition__Group__3_in_rule__Condition__Group__25683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Condition__Group__2__Impl5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__3__Impl_in_rule__Condition__Group__35742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__0_in_rule__Condition__Group__3__Impl5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__0__Impl_in_rule__Condition__Group_3__05808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__1_in_rule__Condition__Group_3__05811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Condition__Group_3__0__Impl5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group_3__1__Impl_in_rule__Condition__Group_3__15870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__ContinuationAssignment_3_1_in_rule__Condition__Group_3__1__Impl5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group__0__Impl_in_rule__LocalAlternative__Group__05931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group__1_in_rule__LocalAlternative__Group__05934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__LocalAlternative__Group__0__Impl5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group__1__Impl_in_rule__LocalAlternative__Group__15993 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group__2_in_rule__LocalAlternative__Group__15996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__ConditionAssignment_1_in_rule__LocalAlternative__Group__1__Impl6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group__2__Impl_in_rule__LocalAlternative__Group__26053 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group__3_in_rule__LocalAlternative__Group__26056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__LocalAlternative__Group__2__Impl6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group__3__Impl_in_rule__LocalAlternative__Group__36115 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group__4_in_rule__LocalAlternative__Group__36118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Alternatives_3_in_rule__LocalAlternative__Group__3__Impl6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group__4__Impl_in_rule__LocalAlternative__Group__46175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__0_in_rule__LocalAlternative__Group__4__Impl6202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__0__Impl_in_rule__LocalAlternative__Group_3_1__06243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__1_in_rule__LocalAlternative__Group_3_1__06246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__LocalAlternative__Group_3_1__0__Impl6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group_3_1__1__Impl_in_rule__LocalAlternative__Group_3_1__16305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_1_in_rule__LocalAlternative__Group_3_1__1__Impl6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__0__Impl_in_rule__LocalAlternative__Group_4__06366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__1_in_rule__LocalAlternative__Group_4__06369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__LocalAlternative__Group_4__0__Impl6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__Group_4__1__Impl_in_rule__LocalAlternative__Group_4__16428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAlternative__ContinuationAssignment_4_1_in_rule__LocalAlternative__Group_4__1__Impl6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__0__Impl_in_rule__AlternativeFlowAlternative__Group__06489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__1_in_rule__AlternativeFlowAlternative__Group__06492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AlternativeFlowAlternative__Group__0__Impl6520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__1__Impl_in_rule__AlternativeFlowAlternative__Group__16551 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__2_in_rule__AlternativeFlowAlternative__Group__16554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__ConditionAssignment_1_in_rule__AlternativeFlowAlternative__Group__1__Impl6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__2__Impl_in_rule__AlternativeFlowAlternative__Group__26611 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__3_in_rule__AlternativeFlowAlternative__Group__26614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AlternativeFlowAlternative__Group__2__Impl6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__3__Impl_in_rule__AlternativeFlowAlternative__Group__36673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__4_in_rule__AlternativeFlowAlternative__Group__36676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AlternativeFlowAlternative__Group__3__Impl6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__4__Impl_in_rule__AlternativeFlowAlternative__Group__46735 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__5_in_rule__AlternativeFlowAlternative__Group__46738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__RefAssignment_4_in_rule__AlternativeFlowAlternative__Group__4__Impl6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group__5__Impl_in_rule__AlternativeFlowAlternative__Group__56795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__0_in_rule__AlternativeFlowAlternative__Group__5__Impl6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__0__Impl_in_rule__AlternativeFlowAlternative__Group_5__06865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__1_in_rule__AlternativeFlowAlternative__Group_5__06868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__AlternativeFlowAlternative__Group_5__0__Impl6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__Group_5__1__Impl_in_rule__AlternativeFlowAlternative__Group_5__16927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlternativeFlowAlternative__ContinuationAssignment_5_1_in_rule__AlternativeFlowAlternative__Group_5__1__Impl6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group__0__Impl_in_rule__ParallelStep__Group__06988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group__1_in_rule__ParallelStep__Group__06991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ParallelStep__Group__0__Impl7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group__1__Impl_in_rule__ParallelStep__Group__17050 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group__2_in_rule__ParallelStep__Group__17053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__NameAssignment_1_in_rule__ParallelStep__Group__1__Impl7080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group__2__Impl_in_rule__ParallelStep__Group__27110 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group__3_in_rule__ParallelStep__Group__27113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__LabelAssignment_2_in_rule__ParallelStep__Group__2__Impl7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group__3__Impl_in_rule__ParallelStep__Group__37171 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group__4_in_rule__ParallelStep__Group__37174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_3_in_rule__ParallelStep__Group__3__Impl7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group__4__Impl_in_rule__ParallelStep__Group__47231 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group__5_in_rule__ParallelStep__Group__47234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group_4__0_in_rule__ParallelStep__Group__4__Impl7261 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group__5__Impl_in_rule__ParallelStep__Group__57292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group_5__0_in_rule__ParallelStep__Group__5__Impl7319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group_4__0__Impl_in_rule__ParallelStep__Group_4__07362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group_4__1_in_rule__ParallelStep__Group_4__07365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ParallelStep__Group_4__0__Impl7393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group_4__1__Impl_in_rule__ParallelStep__Group_4__17424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__InvokedFlowsAssignment_4_1_in_rule__ParallelStep__Group_4__1__Impl7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group_5__0__Impl_in_rule__ParallelStep__Group_5__07485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group_5__1_in_rule__ParallelStep__Group_5__07488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ParallelStep__Group_5__0__Impl7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__Group_5__1__Impl_in_rule__ParallelStep__Group_5__17547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParallelStep__NextAssignment_5_1_in_rule__ParallelStep__Group_5__1__Impl7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__0__Impl_in_rule__NormalStep__Group__07608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__1_in_rule__NormalStep__Group__07611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__NormalStep__Group__0__Impl7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__1__Impl_in_rule__NormalStep__Group__17670 = new BitSet(new long[]{0x00000000000FC020L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__2_in_rule__NormalStep__Group__17673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__NameAssignment_1_in_rule__NormalStep__Group__1__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__2__Impl_in_rule__NormalStep__Group__27730 = new BitSet(new long[]{0x00000000000FC020L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__3_in_rule__NormalStep__Group__27733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__LabelAssignment_2_in_rule__NormalStep__Group__2__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__3__Impl_in_rule__NormalStep__Group__37791 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__4_in_rule__NormalStep__Group__37794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__TypeAssignment_3_in_rule__NormalStep__Group__3__Impl7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__4__Impl_in_rule__NormalStep__Group__47851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__5_in_rule__NormalStep__Group__47854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__NormalStep__Group__4__Impl7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__5__Impl_in_rule__NormalStep__Group__57913 = new BitSet(new long[]{0x0000124000000000L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__6_in_rule__NormalStep__Group__57916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__ActorAssignment_5_in_rule__NormalStep__Group__5__Impl7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__6__Impl_in_rule__NormalStep__Group__67973 = new BitSet(new long[]{0x0000124000000000L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__7_in_rule__NormalStep__Group__67976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Alternatives_6_in_rule__NormalStep__Group__6__Impl8003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group__7__Impl_in_rule__NormalStep__Group__78034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_7__0_in_rule__NormalStep__Group__7__Impl8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__0__Impl_in_rule__NormalStep__Group_6_0__08108 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__1_in_rule__NormalStep__Group_6_0__08111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__NormalStep__Group_6_0__0__Impl8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__1__Impl_in_rule__NormalStep__Group_6_0__18170 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__2_in_rule__NormalStep__Group_6_0__18173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8202 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__NormalStep__StepAlternativeAssignment_6_0_1_in_rule__NormalStep__Group_6_0__1__Impl8214 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_6_0__2__Impl_in_rule__NormalStep__Group_6_0__28247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__NormalStep__Group_6_0__2__Impl8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__0__Impl_in_rule__NormalStep__Group_6_1__08312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__1_in_rule__NormalStep__Group_6_1__08315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__NormalStep__Group_6_1__0__Impl8343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_6_1__1__Impl_in_rule__NormalStep__Group_6_1__18374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__InvokedUseCaseAssignment_6_1_1_in_rule__NormalStep__Group_6_1__1__Impl8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_7__0__Impl_in_rule__NormalStep__Group_7__08435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_7__1_in_rule__NormalStep__Group_7__08438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NormalStep__Group_7__0__Impl8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__Group_7__1__Impl_in_rule__NormalStep__Group_7__18497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalStep__NextAssignment_7_1_in_rule__NormalStep__Group_7__1__Impl8524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08558 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8644 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__QualifiedName__Group_1__0__Impl8710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__0_in_rule__UseCase__UnorderedGroup_48802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_4_0__0_in_rule__UseCase__UnorderedGroup_4__Impl8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group_4_1__0_in_rule__UseCase__UnorderedGroup_4__Impl8980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__09039 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__1_in_rule__UseCase__UnorderedGroup_4__09042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__UnorderedGroup_4__Impl_in_rule__UseCase__UnorderedGroup_4__19067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__UseCasesModel__PackagesAssignment9099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DescriptionAssignment_29161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__PackageDeclaration__ActorsAssignment_3_19192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseCase_in_rule__PackageDeclaration__UseCasesAssignment_49223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseCase__NameAssignment_19254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UseCase__DescriptionAssignment_29285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseCase__SuperCaseAssignment_3_19320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCCondition_in_rule__UseCase__PreconditionsAssignment_4_0_19355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCCondition_in_rule__UseCase__PostconditionsAssignment_4_1_19386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__UseCase__FlowsAssignment_59417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UCCondition__NameAssignment9448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_09479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActorType_in_rule__Actor__TypeAssignment_29510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Actor__DescriptionAssignment_39541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__ExtendsAssignment_4_19576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__BasicFlow__StepsAssignment_29611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCCondition_in_rule__BasicFlow__FinalStateAssignment_4_19642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExceptionFlow__NameAssignment_19673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExceptionFlow__ConditionAssignment_39704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__ExceptionFlow__StepsAssignment_59735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCCondition_in_rule__ExceptionFlow__FinalStateAssignment_7_19766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlow__NameAssignment_19797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__AlternativeFlow__StepsAssignment_29828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCCondition_in_rule__AlternativeFlow__FinalStateAssignment_4_19859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelFlow__NameAssignment_19890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStep_in_rule__ParallelFlow__StepsAssignment_29921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCCondition_in_rule__ParallelFlow__FinalStateAssignment_4_19952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Condition__ConditionAssignment_19983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Condition__ContinuationAssignment_3_110018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LocalAlternative__ConditionAssignment_110053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LocalAlternative__DescriptionAssignment_3_010084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocalAlternative__InvokedUseCaseAssignment_3_1_110119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocalAlternative__ContinuationAssignment_4_110158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AlternativeFlowAlternative__ConditionAssignment_110193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__RefAssignment_410228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AlternativeFlowAlternative__ContinuationAssignment_5_110267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__NameAssignment_110302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ParallelStep__LabelAssignment_210333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_310368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__InvokedFlowsAssignment_4_110407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParallelStep__NextAssignment_5_110446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__NameAssignment_110481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NormalStep__LabelAssignment_210512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepType_in_rule__NormalStep__TypeAssignment_310543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__ActorAssignment_510578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepAlternative_in_rule__NormalStep__StepAlternativeAssignment_6_0_110613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__InvokedUseCaseAssignment_6_1_110648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NormalStep__NextAssignment_7_110687 = new BitSet(new long[]{0x0000000000000002L});

}
