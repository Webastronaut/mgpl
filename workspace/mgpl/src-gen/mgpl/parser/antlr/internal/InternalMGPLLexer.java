package mgpl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMGPLLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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
    public static final int RULE_WS=7;
    public static final int RULE_COMMENT=6;
    public static final int RULE_ANY_OTHER=8;
    public static final int RULE_NUMBER=5;
    public static final int RULE_IDF=4;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMGPLLexer() {;} 
    public InternalMGPLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMGPLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMGPL.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:11:6: ( 'game' )
            // InternalMGPL.g:11:8: 'game'
            {
            match("game"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:12:7: ( '(' )
            // InternalMGPL.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:13:7: ( ',' )
            // InternalMGPL.g:13:9: ','
            {
            match(','); 

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
            // InternalMGPL.g:14:7: ( ')' )
            // InternalMGPL.g:14:9: ')'
            {
            match(')'); 

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
            // InternalMGPL.g:15:7: ( ';' )
            // InternalMGPL.g:15:9: ';'
            {
            match(';'); 

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
            // InternalMGPL.g:16:7: ( 'int' )
            // InternalMGPL.g:16:9: 'int'
            {
            match("int"); 


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
            // InternalMGPL.g:17:7: ( '[' )
            // InternalMGPL.g:17:9: '['
            {
            match('['); 

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
            // InternalMGPL.g:18:7: ( ']' )
            // InternalMGPL.g:18:9: ']'
            {
            match(']'); 

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
            // InternalMGPL.g:19:7: ( '=' )
            // InternalMGPL.g:19:9: '='
            {
            match('='); 

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
            // InternalMGPL.g:20:7: ( 'rectangle' )
            // InternalMGPL.g:20:9: 'rectangle'
            {
            match("rectangle"); 


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
            // InternalMGPL.g:21:7: ( 'triangle' )
            // InternalMGPL.g:21:9: 'triangle'
            {
            match("triangle"); 


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
            // InternalMGPL.g:22:7: ( 'circle' )
            // InternalMGPL.g:22:9: 'circle'
            {
            match("circle"); 


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
            // InternalMGPL.g:23:7: ( 'animation' )
            // InternalMGPL.g:23:9: 'animation'
            {
            match("animation"); 


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
            // InternalMGPL.g:24:7: ( 'on' )
            // InternalMGPL.g:24:9: 'on'
            {
            match("on"); 


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
            // InternalMGPL.g:25:7: ( 'space' )
            // InternalMGPL.g:25:9: 'space'
            {
            match("space"); 


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
            // InternalMGPL.g:26:7: ( 'leftarrow' )
            // InternalMGPL.g:26:9: 'leftarrow'
            {
            match("leftarrow"); 


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
            // InternalMGPL.g:27:7: ( 'rightarrow' )
            // InternalMGPL.g:27:9: 'rightarrow'
            {
            match("rightarrow"); 


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
            // InternalMGPL.g:28:7: ( 'uparrow' )
            // InternalMGPL.g:28:9: 'uparrow'
            {
            match("uparrow"); 


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
            // InternalMGPL.g:29:7: ( 'downarrow' )
            // InternalMGPL.g:29:9: 'downarrow'
            {
            match("downarrow"); 


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
            // InternalMGPL.g:30:7: ( '{' )
            // InternalMGPL.g:30:9: '{'
            {
            match('{'); 

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
            // InternalMGPL.g:31:7: ( '}' )
            // InternalMGPL.g:31:9: '}'
            {
            match('}'); 

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
            // InternalMGPL.g:32:7: ( 'if' )
            // InternalMGPL.g:32:9: 'if'
            {
            match("if"); 


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
            // InternalMGPL.g:33:7: ( 'else' )
            // InternalMGPL.g:33:9: 'else'
            {
            match("else"); 


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
            // InternalMGPL.g:34:7: ( 'for' )
            // InternalMGPL.g:34:9: 'for'
            {
            match("for"); 


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
            // InternalMGPL.g:35:7: ( '.' )
            // InternalMGPL.g:35:9: '.'
            {
            match('.'); 

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
            // InternalMGPL.g:36:7: ( '||' )
            // InternalMGPL.g:36:9: '||'
            {
            match("||"); 


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
            // InternalMGPL.g:37:7: ( '&&' )
            // InternalMGPL.g:37:9: '&&'
            {
            match("&&"); 


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
            // InternalMGPL.g:38:7: ( '==' )
            // InternalMGPL.g:38:9: '=='
            {
            match("=="); 


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
            // InternalMGPL.g:39:7: ( '<' )
            // InternalMGPL.g:39:9: '<'
            {
            match('<'); 

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
            // InternalMGPL.g:40:7: ( '<=' )
            // InternalMGPL.g:40:9: '<='
            {
            match("<="); 


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
            // InternalMGPL.g:41:7: ( '+' )
            // InternalMGPL.g:41:9: '+'
            {
            match('+'); 

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
            // InternalMGPL.g:42:7: ( '-' )
            // InternalMGPL.g:42:9: '-'
            {
            match('-'); 

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
            // InternalMGPL.g:43:7: ( '/' )
            // InternalMGPL.g:43:9: '/'
            {
            match('/'); 

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
            // InternalMGPL.g:44:7: ( '*' )
            // InternalMGPL.g:44:9: '*'
            {
            match('*'); 

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
            // InternalMGPL.g:45:7: ( '!' )
            // InternalMGPL.g:45:9: '!'
            {
            match('!'); 

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
            // InternalMGPL.g:46:7: ( 'touches' )
            // InternalMGPL.g:46:9: 'touches'
            {
            match("touches"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_IDF"
    public final void mRULE_IDF() throws RecognitionException {
        try {
            int _type = RULE_IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:1977:10: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // InternalMGPL.g:1977:12: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMGPL.g:1977:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMGPL.g:
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
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDF"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:1979:13: ( ( '0' .. '9' )+ )
            // InternalMGPL.g:1979:15: ( '0' .. '9' )+
            {
            // InternalMGPL.g:1979:15: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMGPL.g:1979:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:1981:14: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalMGPL.g:1981:16: '//' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match("//"); 

            // InternalMGPL.g:1981:21: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMGPL.g:1981:21: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:1983:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMGPL.g:1983:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMGPL.g:1983:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMGPL.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalMGPL.g:1985:16: ( . )
            // InternalMGPL.g:1985:18: .
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
        // InternalMGPL.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_IDF | RULE_NUMBER | RULE_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt5=41;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // InternalMGPL.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // InternalMGPL.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // InternalMGPL.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // InternalMGPL.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // InternalMGPL.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // InternalMGPL.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // InternalMGPL.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // InternalMGPL.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // InternalMGPL.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // InternalMGPL.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // InternalMGPL.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // InternalMGPL.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // InternalMGPL.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // InternalMGPL.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // InternalMGPL.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // InternalMGPL.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // InternalMGPL.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // InternalMGPL.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // InternalMGPL.g:1:117: T__27
                {
                mT__27(); 

                }
                break;
            case 20 :
                // InternalMGPL.g:1:123: T__28
                {
                mT__28(); 

                }
                break;
            case 21 :
                // InternalMGPL.g:1:129: T__29
                {
                mT__29(); 

                }
                break;
            case 22 :
                // InternalMGPL.g:1:135: T__30
                {
                mT__30(); 

                }
                break;
            case 23 :
                // InternalMGPL.g:1:141: T__31
                {
                mT__31(); 

                }
                break;
            case 24 :
                // InternalMGPL.g:1:147: T__32
                {
                mT__32(); 

                }
                break;
            case 25 :
                // InternalMGPL.g:1:153: T__33
                {
                mT__33(); 

                }
                break;
            case 26 :
                // InternalMGPL.g:1:159: T__34
                {
                mT__34(); 

                }
                break;
            case 27 :
                // InternalMGPL.g:1:165: T__35
                {
                mT__35(); 

                }
                break;
            case 28 :
                // InternalMGPL.g:1:171: T__36
                {
                mT__36(); 

                }
                break;
            case 29 :
                // InternalMGPL.g:1:177: T__37
                {
                mT__37(); 

                }
                break;
            case 30 :
                // InternalMGPL.g:1:183: T__38
                {
                mT__38(); 

                }
                break;
            case 31 :
                // InternalMGPL.g:1:189: T__39
                {
                mT__39(); 

                }
                break;
            case 32 :
                // InternalMGPL.g:1:195: T__40
                {
                mT__40(); 

                }
                break;
            case 33 :
                // InternalMGPL.g:1:201: T__41
                {
                mT__41(); 

                }
                break;
            case 34 :
                // InternalMGPL.g:1:207: T__42
                {
                mT__42(); 

                }
                break;
            case 35 :
                // InternalMGPL.g:1:213: T__43
                {
                mT__43(); 

                }
                break;
            case 36 :
                // InternalMGPL.g:1:219: T__44
                {
                mT__44(); 

                }
                break;
            case 37 :
                // InternalMGPL.g:1:225: RULE_IDF
                {
                mRULE_IDF(); 

                }
                break;
            case 38 :
                // InternalMGPL.g:1:234: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 39 :
                // InternalMGPL.g:1:246: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 40 :
                // InternalMGPL.g:1:259: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalMGPL.g:1:267: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\45\4\uffff\1\45\2\uffff\1\57\11\45\2\uffff\2\45\1\uffff\2\43\1\103\2\uffff\1\107\6\uffff\1\45\5\uffff\1\45\1\116\4\uffff\6\45\1\125\4\45\2\uffff\2\45\15\uffff\1\45\1\135\1\uffff\6\45\1\uffff\5\45\1\151\1\152\1\uffff\12\45\1\165\2\uffff\6\45\1\174\3\45\1\uffff\4\45\1\u0084\1\45\1\uffff\6\45\1\u008c\1\uffff\2\45\1\u008f\3\45\1\u0093\1\uffff\2\45\1\uffff\1\45\1\u0097\1\45\1\uffff\1\u0099\1\u009a\1\u009b\1\uffff\1\u009c\4\uffff";
    static final String DFA5_eofS =
        "\u009d\uffff";
    static final String DFA5_minS =
        "\1\0\1\141\4\uffff\1\146\2\uffff\1\75\1\145\1\157\1\151\2\156\1\160\1\145\1\160\1\157\2\uffff\1\154\1\157\1\uffff\1\174\1\46\1\75\2\uffff\1\57\6\uffff\1\155\5\uffff\1\164\1\60\4\uffff\1\143\1\147\1\151\1\165\1\162\1\151\1\60\1\141\1\146\1\141\1\167\2\uffff\1\163\1\162\15\uffff\1\145\1\60\1\uffff\1\164\1\150\1\141\2\143\1\155\1\uffff\1\143\1\164\1\162\1\156\1\145\2\60\1\uffff\1\141\1\164\1\156\1\150\1\154\1\141\1\145\1\141\1\162\1\141\1\60\2\uffff\1\156\1\141\1\147\2\145\1\164\1\60\1\162\1\157\1\162\1\uffff\1\147\1\162\1\154\1\163\1\60\1\151\1\uffff\1\162\1\167\1\162\1\154\1\162\1\145\1\60\1\uffff\2\157\1\60\1\157\1\145\1\157\1\60\1\uffff\1\156\1\167\1\uffff\1\167\1\60\1\167\1\uffff\3\60\1\uffff\1\60\4\uffff";
    static final String DFA5_maxS =
        "\1\uffff\1\141\4\uffff\1\156\2\uffff\1\75\1\151\1\162\1\151\2\156\1\160\1\145\1\160\1\157\2\uffff\1\154\1\157\1\uffff\1\174\1\46\1\75\2\uffff\1\57\6\uffff\1\155\5\uffff\1\164\1\172\4\uffff\1\143\1\147\1\151\1\165\1\162\1\151\1\172\1\141\1\146\1\141\1\167\2\uffff\1\163\1\162\15\uffff\1\145\1\172\1\uffff\1\164\1\150\1\141\2\143\1\155\1\uffff\1\143\1\164\1\162\1\156\1\145\2\172\1\uffff\1\141\1\164\1\156\1\150\1\154\1\141\1\145\1\141\1\162\1\141\1\172\2\uffff\1\156\1\141\1\147\2\145\1\164\1\172\1\162\1\157\1\162\1\uffff\1\147\1\162\1\154\1\163\1\172\1\151\1\uffff\1\162\1\167\1\162\1\154\1\162\1\145\1\172\1\uffff\2\157\1\172\1\157\1\145\1\157\1\172\1\uffff\1\156\1\167\1\uffff\1\167\1\172\1\167\1\uffff\3\172\1\uffff\1\172\4\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\12\uffff\1\24\1\25\2\uffff\1\31\3\uffff\1\37\1\40\1\uffff\1\42\1\43\1\45\1\46\1\50\1\51\1\uffff\1\45\1\2\1\3\1\4\1\5\2\uffff\1\7\1\10\1\34\1\11\13\uffff\1\24\1\25\2\uffff\1\31\1\32\1\33\1\36\1\35\1\37\1\40\1\47\1\41\1\42\1\43\1\46\1\50\2\uffff\1\26\6\uffff\1\16\7\uffff\1\6\13\uffff\1\30\1\1\12\uffff\1\27\6\uffff\1\17\7\uffff\1\14\7\uffff\1\44\2\uffff\1\22\3\uffff\1\13\3\uffff\1\12\1\uffff\1\15\1\20\1\23\1\21";
    static final String DFA5_specialS =
        "\1\0\u009c\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\37\4\43\1\31\1\43\1\2\1\4\1\36\1\33\1\3\1\34\1\27\1\35\12\41\1\43\1\5\1\32\1\11\3\43\32\40\1\7\1\43\1\10\3\43\1\15\1\40\1\14\1\22\1\25\1\26\1\1\1\40\1\6\2\40\1\20\2\40\1\16\2\40\1\12\1\17\1\13\1\21\5\40\1\23\1\30\1\24\uff82\43",
            "\1\44",
            "",
            "",
            "",
            "",
            "\1\53\7\uffff\1\52",
            "",
            "",
            "\1\56",
            "\1\60\3\uffff\1\61",
            "\1\63\2\uffff\1\62",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "\1\75",
            "\1\76",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\114",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\134",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
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
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u008d",
            "\1\u008e",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0098",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
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

    class DFA5 extends DFA {

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
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_IDF | RULE_NUMBER | RULE_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='g') ) {s = 1;}

                        else if ( (LA5_0=='(') ) {s = 2;}

                        else if ( (LA5_0==',') ) {s = 3;}

                        else if ( (LA5_0==')') ) {s = 4;}

                        else if ( (LA5_0==';') ) {s = 5;}

                        else if ( (LA5_0=='i') ) {s = 6;}

                        else if ( (LA5_0=='[') ) {s = 7;}

                        else if ( (LA5_0==']') ) {s = 8;}

                        else if ( (LA5_0=='=') ) {s = 9;}

                        else if ( (LA5_0=='r') ) {s = 10;}

                        else if ( (LA5_0=='t') ) {s = 11;}

                        else if ( (LA5_0=='c') ) {s = 12;}

                        else if ( (LA5_0=='a') ) {s = 13;}

                        else if ( (LA5_0=='o') ) {s = 14;}

                        else if ( (LA5_0=='s') ) {s = 15;}

                        else if ( (LA5_0=='l') ) {s = 16;}

                        else if ( (LA5_0=='u') ) {s = 17;}

                        else if ( (LA5_0=='d') ) {s = 18;}

                        else if ( (LA5_0=='{') ) {s = 19;}

                        else if ( (LA5_0=='}') ) {s = 20;}

                        else if ( (LA5_0=='e') ) {s = 21;}

                        else if ( (LA5_0=='f') ) {s = 22;}

                        else if ( (LA5_0=='.') ) {s = 23;}

                        else if ( (LA5_0=='|') ) {s = 24;}

                        else if ( (LA5_0=='&') ) {s = 25;}

                        else if ( (LA5_0=='<') ) {s = 26;}

                        else if ( (LA5_0=='+') ) {s = 27;}

                        else if ( (LA5_0=='-') ) {s = 28;}

                        else if ( (LA5_0=='/') ) {s = 29;}

                        else if ( (LA5_0=='*') ) {s = 30;}

                        else if ( (LA5_0=='!') ) {s = 31;}

                        else if ( ((LA5_0>='A' && LA5_0<='Z')||LA5_0=='b'||LA5_0=='h'||(LA5_0>='j' && LA5_0<='k')||(LA5_0>='m' && LA5_0<='n')||(LA5_0>='p' && LA5_0<='q')||(LA5_0>='v' && LA5_0<='z')) ) {s = 32;}

                        else if ( ((LA5_0>='0' && LA5_0<='9')) ) {s = 33;}

                        else if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {s = 34;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||(LA5_0>='\"' && LA5_0<='%')||LA5_0=='\''||LA5_0==':'||(LA5_0>='>' && LA5_0<='@')||LA5_0=='\\'||(LA5_0>='^' && LA5_0<='`')||(LA5_0>='~' && LA5_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}