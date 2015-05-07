package UseCaseDSL.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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

    public InternalUseCaseLexer() {;} 
    public InternalUseCaseLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUseCaseLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:11:7: ( 'package' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:11:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:12:7: ( 'actors' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:12:9: 'actors'
            {
            match("actors"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:13:7: ( 'end package' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:13:9: 'end package'
            {
            match("end package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:14:7: ( 'usecase' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:14:9: 'usecase'
            {
            match("usecase"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:15:7: ( 'extends' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:15:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:16:7: ( 'preconditions' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:16:9: 'preconditions'
            {
            match("preconditions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:17:7: ( 'postcondition' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:17:9: 'postcondition'
            {
            match("postcondition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:18:7: ( 'end usecase' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:18:9: 'end usecase'
            {
            match("end usecase"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:19:7: ( 'as' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:19:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:20:7: ( 'basic flow' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:20:9: 'basic flow'
            {
            match("basic flow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:21:7: ( 'end flow' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:21:9: 'end flow'
            {
            match("end flow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:22:7: ( 'with postcondition' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:22:9: 'with postcondition'
            {
            match("with postcondition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:23:7: ( 'exception flow' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:23:9: 'exception flow'
            {
            match("exception flow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:24:7: ( 'if' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:24:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:25:7: ( 'then' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:25:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:26:7: ( 'alternative flow' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:26:9: 'alternative flow'
            {
            match("alternative flow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:27:7: ( 'parallel flow' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:27:9: 'parallel flow'
            {
            match("parallel flow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:28:7: ( 'continue with step' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:28:9: 'continue with step'
            {
            match("continue with step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:29:7: ( 'invoke usecase' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:29:9: 'invoke usecase'
            {
            match("invoke usecase"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:30:7: ( 'parallel step' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:30:9: 'parallel step'
            {
            match("parallel step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:31:7: ( ',' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:31:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:32:7: ( 'next' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:32:9: 'next'
            {
            match("next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:33:7: ( 'step' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:33:9: 'step'
            {
            match("step"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:34:7: ( 'by' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:34:9: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:35:7: ( 'alternatives' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:35:9: 'alternatives'
            {
            match("alternatives"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:36:7: ( 'else' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:36:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:37:7: ( '.' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:37:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:38:7: ( 'person' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:38:9: 'person'
            {
            match("person"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:39:7: ( 'system' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:39:9: 'system'
            {
            match("system"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:40:7: ( 'organization' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:40:9: 'organization'
            {
            match("organization"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:41:7: ( 'wait' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:41:9: 'wait'
            {
            match("wait"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:42:7: ( 'send' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:42:9: 'send'
            {
            match("send"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:43:7: ( 'perform' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:43:9: 'perform'
            {
            match("perform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:44:7: ( 'call' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:44:9: 'call'
            {
            match("call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:45:7: ( 'alt' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:45:9: 'alt'
            {
            match("alt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:46:7: ( 'wait-alt' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:46:9: 'wait-alt'
            {
            match("wait-alt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1691:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1691:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1691:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1691:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1691:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1693:10: ( ( '0' .. '9' )+ )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1693:12: ( '0' .. '9' )+
            {
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1693:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1693:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1695:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1695:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1695:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1695:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1695:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1695:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1695:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1695:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1695:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1695:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1695:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1697:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1697:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1697:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1697:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1699:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1699:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1699:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1699:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1699:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1699:41: ( '\\r' )? '\\n'
                    {
                    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1699:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1699:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1701:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1701:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1701:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1703:16: ( . )
            // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1703:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=43;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:226: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:234: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:243: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:255: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:271: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:287: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // ../UseCaseDSL/src-gen/UseCaseDSL/parser/antlr/internal/InternalUseCase.g:1:295: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\11\33\1\uffff\2\33\1\uffff\1\33\1\26\2\uffff\3\26\2\uffff"+
        "\4\33\1\uffff\1\33\1\76\6\33\1\106\2\33\1\111\4\33\1\uffff\4\33"+
        "\1\uffff\1\33\5\uffff\6\33\1\uffff\1\133\6\33\1\uffff\2\33\1\uffff"+
        "\21\33\2\uffff\2\33\1\172\3\33\1\177\1\33\1\u0081\1\33\1\u0083\1"+
        "\u0084\1\u0085\1\33\1\u0087\11\33\3\uffff\2\33\1\uffff\2\33\3\uffff"+
        "\1\33\1\uffff\1\33\3\uffff\1\33\1\uffff\5\33\1\u009d\1\33\1\u009f"+
        "\4\33\1\uffff\2\33\1\u00a6\1\33\1\u00a8\3\33\1\uffff\1\u00ac\1\uffff"+
        "\1\33\1\u00ae\1\33\1\u00b0\1\uffff\1\33\1\uffff\1\33\1\uffff\3\33"+
        "\1\uffff\1\33\1\uffff\1\33\1\uffff\2\33\1\uffff\4\33\1\uffff\1\33"+
        "\2\uffff\3\33\1\uffff\7\33\1\uffff\1\u00cc\1\u00cd\1\u00ce\1\u00cf"+
        "\4\uffff";
    static final String DFA12_eofS =
        "\u00d0\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\143\1\154\1\163\2\141\1\146\1\150\1\141\1\uffff\2"+
        "\145\1\uffff\1\162\1\101\2\uffff\2\0\1\52\2\uffff\1\143\1\145\1"+
        "\163\1\162\1\uffff\1\164\1\60\1\164\1\144\1\143\1\163\1\145\1\163"+
        "\1\60\1\164\1\151\1\60\1\166\1\145\1\156\1\154\1\uffff\1\170\1\145"+
        "\1\163\1\156\1\uffff\1\147\5\uffff\1\153\1\141\1\143\1\164\1\146"+
        "\1\157\1\uffff\1\60\1\40\3\145\1\143\1\151\1\uffff\1\150\1\164\1"+
        "\uffff\1\157\1\156\1\164\1\154\1\164\1\160\1\164\1\144\2\141\1\154"+
        "\1\157\1\143\2\157\2\162\1\uffff\1\146\1\156\1\160\1\60\1\141\1"+
        "\143\1\40\1\55\1\153\1\60\1\151\3\60\1\145\1\60\1\156\1\147\1\154"+
        "\1\156\1\157\1\156\1\162\1\163\1\156\3\uffff\1\144\1\164\1\uffff"+
        "\1\163\1\40\3\uffff\1\145\1\uffff\1\156\3\uffff\1\155\1\uffff\1"+
        "\151\2\145\1\144\1\156\1\60\1\155\1\60\1\141\1\163\1\151\1\145\1"+
        "\uffff\1\40\1\165\1\60\1\172\1\60\1\154\1\151\1\144\1\uffff\1\60"+
        "\1\uffff\1\164\1\60\1\157\1\60\1\uffff\1\145\1\uffff\1\141\1\uffff"+
        "\1\40\1\164\1\151\1\uffff\1\151\1\uffff\1\156\1\uffff\1\40\1\164"+
        "\1\146\1\151\1\164\1\166\1\40\1\uffff\1\151\2\uffff\1\157\1\151"+
        "\1\145\1\uffff\1\157\1\156\1\157\1\40\1\156\1\163\1\156\1\uffff"+
        "\4\60\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\1\163\1\170\1\163\1\171\1\151\1\156\1\150\1\157"+
        "\1\uffff\1\145\1\171\1\uffff\1\162\1\172\2\uffff\2\uffff\1\57\2"+
        "\uffff\1\162\1\145\1\163\1\162\1\uffff\1\164\1\172\1\164\1\144\1"+
        "\164\1\163\1\145\1\163\1\172\1\164\1\151\1\172\1\166\1\145\1\156"+
        "\1\154\1\uffff\1\170\1\145\1\163\1\156\1\uffff\1\147\5\uffff\1\153"+
        "\1\141\1\143\1\164\1\163\1\157\1\uffff\1\172\1\40\3\145\1\143\1"+
        "\151\1\uffff\1\150\1\164\1\uffff\1\157\1\156\1\164\1\154\1\164\1"+
        "\160\1\164\1\144\2\141\1\154\1\157\1\143\2\157\2\162\1\uffff\1\165"+
        "\1\156\1\160\1\172\1\141\1\143\1\40\1\172\1\153\1\172\1\151\3\172"+
        "\1\145\1\172\1\156\1\147\1\154\1\156\1\157\1\156\1\162\1\163\1\156"+
        "\3\uffff\1\144\1\164\1\uffff\1\163\1\40\3\uffff\1\145\1\uffff\1"+
        "\156\3\uffff\1\155\1\uffff\1\151\2\145\1\144\1\156\1\172\1\155\1"+
        "\172\1\141\1\163\1\151\1\145\1\uffff\1\40\1\165\3\172\1\154\1\151"+
        "\1\144\1\uffff\1\172\1\uffff\1\164\1\172\1\157\1\172\1\uffff\1\145"+
        "\1\uffff\1\141\1\uffff\1\40\1\164\1\151\1\uffff\1\151\1\uffff\1"+
        "\156\1\uffff\1\40\1\164\1\163\1\151\1\164\1\166\1\40\1\uffff\1\151"+
        "\2\uffff\1\157\1\151\1\145\1\uffff\1\157\1\156\1\157\1\163\1\156"+
        "\1\163\1\156\1\uffff\4\172\4\uffff";
    static final String DFA12_acceptS =
        "\12\uffff\1\25\2\uffff\1\33\2\uffff\1\45\1\46\3\uffff\1\52\1\53"+
        "\4\uffff\1\45\20\uffff\1\25\4\uffff\1\33\1\uffff\1\46\1\47\1\50"+
        "\1\51\1\52\6\uffff\1\11\7\uffff\1\30\2\uffff\1\16\21\uffff\1\43"+
        "\31\uffff\1\3\1\10\1\13\2\uffff\1\32\2\uffff\1\14\1\44\1\37\1\uffff"+
        "\1\17\1\uffff\1\42\1\26\1\27\1\uffff\1\40\14\uffff\1\12\10\uffff"+
        "\1\34\1\uffff\1\2\4\uffff\1\23\1\uffff\1\35\1\uffff\1\1\3\uffff"+
        "\1\41\1\uffff\1\5\1\uffff\1\4\7\uffff\1\22\1\uffff\1\21\1\24\3\uffff"+
        "\1\15\7\uffff\1\20\4\uffff\1\31\1\36\1\6\1\7";
    static final String DFA12_specialS =
        "\1\1\21\uffff\1\0\1\2\u00bc\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\4\26\1\23\4\26\1"+
            "\12\1\26\1\15\1\24\12\21\7\26\32\20\3\26\1\17\1\20\1\26\1\2"+
            "\1\5\1\11\1\20\1\3\3\20\1\7\4\20\1\13\1\16\1\1\2\20\1\14\1\10"+
            "\1\4\1\20\1\6\3\20\uff85\26",
            "\1\27\3\uffff\1\32\11\uffff\1\31\2\uffff\1\30",
            "\1\34\10\uffff\1\36\6\uffff\1\35",
            "\1\41\1\uffff\1\37\11\uffff\1\40",
            "\1\42",
            "\1\43\27\uffff\1\44",
            "\1\46\7\uffff\1\45",
            "\1\47\7\uffff\1\50",
            "\1\51",
            "\1\53\15\uffff\1\52",
            "",
            "\1\55",
            "\1\60\16\uffff\1\56\4\uffff\1\57",
            "",
            "\1\62",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\64",
            "\0\64",
            "\1\65\4\uffff\1\66",
            "",
            "",
            "\1\70\16\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "\1\75",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\77",
            "\1\100",
            "\1\102\20\uffff\1\101",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\107",
            "\1\110",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\130\14\uffff\1\127",
            "\1\131",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\4\33\1\132\25\33",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\167\11\uffff\1\165\4\uffff\1\166",
            "\1\170",
            "\1\171",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32"+
            "\33",
            "\1\u0080",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0082",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0086",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "",
            "\1\u0095",
            "",
            "\1\u0096",
            "",
            "",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u009e",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a7",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00ad",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00af",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba\14\uffff\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7\122\uffff\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 52;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='p') ) {s = 1;}

                        else if ( (LA12_0=='a') ) {s = 2;}

                        else if ( (LA12_0=='e') ) {s = 3;}

                        else if ( (LA12_0=='u') ) {s = 4;}

                        else if ( (LA12_0=='b') ) {s = 5;}

                        else if ( (LA12_0=='w') ) {s = 6;}

                        else if ( (LA12_0=='i') ) {s = 7;}

                        else if ( (LA12_0=='t') ) {s = 8;}

                        else if ( (LA12_0=='c') ) {s = 9;}

                        else if ( (LA12_0==',') ) {s = 10;}

                        else if ( (LA12_0=='n') ) {s = 11;}

                        else if ( (LA12_0=='s') ) {s = 12;}

                        else if ( (LA12_0=='.') ) {s = 13;}

                        else if ( (LA12_0=='o') ) {s = 14;}

                        else if ( (LA12_0=='^') ) {s = 15;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='d'||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||(LA12_0>='q' && LA12_0<='r')||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {s = 16;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 17;}

                        else if ( (LA12_0=='\"') ) {s = 18;}

                        else if ( (LA12_0=='\'') ) {s = 19;}

                        else if ( (LA12_0=='/') ) {s = 20;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 21;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0=='-'||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 52;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}