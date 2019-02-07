package mgpl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mgpl.services.MGPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMGPLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDF", "RULE_NUMBER", "RULE_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'('", "','", "')'", "';'", "'int'", "'['", "']'", "'='", "'rectangle'", "'triangle'", "'circle'", "'animation'", "'on'", "'space'", "'leftarrow'", "'rightarrow'", "'uparrow'", "'downarrow'", "'{'", "'}'", "'if'", "'else'", "'for'", "'.'", "'||'", "'&&'", "'=='", "'<'", "'<='", "'+'", "'-'", "'/'", "'*'", "'!'", "'touches'"
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


        public InternalMGPLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMGPLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMGPLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMGPL.g"; }



     	private MGPLGrammarAccess grammarAccess;

        public InternalMGPLParser(TokenStream input, MGPLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Prog";
       	}

       	@Override
       	protected MGPLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProg"
    // InternalMGPL.g:64:1: entryRuleProg returns [EObject current=null] : iv_ruleProg= ruleProg EOF ;
    public final EObject entryRuleProg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProg = null;


        try {
            // InternalMGPL.g:64:45: (iv_ruleProg= ruleProg EOF )
            // InternalMGPL.g:65:2: iv_ruleProg= ruleProg EOF
            {
             newCompositeNode(grammarAccess.getProgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProg=ruleProg();

            state._fsp--;

             current =iv_ruleProg; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProg"


    // $ANTLR start "ruleProg"
    // InternalMGPL.g:71:1: ruleProg returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' ( (lv_declarations_7_0= ruleDecl ) )* ( (lv_init_8_0= ruleStmtBlock ) ) ( (lv_blocks_9_0= ruleBlock ) )* ) ;
    public final EObject ruleProg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attr_3_0 = null;

        EObject lv_attr_5_0 = null;

        EObject lv_declarations_7_0 = null;

        EObject lv_init_8_0 = null;

        EObject lv_blocks_9_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:77:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' ( (lv_declarations_7_0= ruleDecl ) )* ( (lv_init_8_0= ruleStmtBlock ) ) ( (lv_blocks_9_0= ruleBlock ) )* ) )
            // InternalMGPL.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' ( (lv_declarations_7_0= ruleDecl ) )* ( (lv_init_8_0= ruleStmtBlock ) ) ( (lv_blocks_9_0= ruleBlock ) )* )
            {
            // InternalMGPL.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' ( (lv_declarations_7_0= ruleDecl ) )* ( (lv_init_8_0= ruleStmtBlock ) ) ( (lv_blocks_9_0= ruleBlock ) )* )
            // InternalMGPL.g:79:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' ( (lv_declarations_7_0= ruleDecl ) )* ( (lv_init_8_0= ruleStmtBlock ) ) ( (lv_blocks_9_0= ruleBlock ) )*
            {
            otherlv_0=(Token)match(input,9,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgAccess().getGameKeyword_0());
            		
            // InternalMGPL.g:83:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:84:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:84:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:85:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgAccess().getNameIDFTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"mgpl.MGPL.IDF");
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProgAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMGPL.g:105:3: ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_IDF) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMGPL.g:106:4: ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )*
                    {
                    // InternalMGPL.g:106:4: ( (lv_attr_3_0= ruleAttrAss ) )
                    // InternalMGPL.g:107:5: (lv_attr_3_0= ruleAttrAss )
                    {
                    // InternalMGPL.g:107:5: (lv_attr_3_0= ruleAttrAss )
                    // InternalMGPL.g:108:6: lv_attr_3_0= ruleAttrAss
                    {

                    						newCompositeNode(grammarAccess.getProgAccess().getAttrAttrAssParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_attr_3_0=ruleAttrAss();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgRule());
                    						}
                    						add(
                    							current,
                    							"attr",
                    							lv_attr_3_0,
                    							"mgpl.MGPL.AttrAss");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMGPL.g:125:4: (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMGPL.g:126:5: otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) )
                    	    {
                    	    otherlv_4=(Token)match(input,11,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getProgAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMGPL.g:130:5: ( (lv_attr_5_0= ruleAttrAss ) )
                    	    // InternalMGPL.g:131:6: (lv_attr_5_0= ruleAttrAss )
                    	    {
                    	    // InternalMGPL.g:131:6: (lv_attr_5_0= ruleAttrAss )
                    	    // InternalMGPL.g:132:7: lv_attr_5_0= ruleAttrAss
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgAccess().getAttrAttrAssParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_attr_5_0=ruleAttrAss();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attr",
                    	    								lv_attr_5_0,
                    	    								"mgpl.MGPL.AttrAss");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getProgAccess().getRightParenthesisKeyword_4());
            		
            // InternalMGPL.g:155:3: ( (lv_declarations_7_0= ruleDecl ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||(LA3_0>=18 && LA3_0<=20)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMGPL.g:156:4: (lv_declarations_7_0= ruleDecl )
            	    {
            	    // InternalMGPL.g:156:4: (lv_declarations_7_0= ruleDecl )
            	    // InternalMGPL.g:157:5: lv_declarations_7_0= ruleDecl
            	    {

            	    					newCompositeNode(grammarAccess.getProgAccess().getDeclarationsDeclParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_declarations_7_0=ruleDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_7_0,
            	    						"mgpl.MGPL.Decl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMGPL.g:174:3: ( (lv_init_8_0= ruleStmtBlock ) )
            // InternalMGPL.g:175:4: (lv_init_8_0= ruleStmtBlock )
            {
            // InternalMGPL.g:175:4: (lv_init_8_0= ruleStmtBlock )
            // InternalMGPL.g:176:5: lv_init_8_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getProgAccess().getInitStmtBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_init_8_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgRule());
            					}
            					set(
            						current,
            						"init",
            						lv_init_8_0,
            						"mgpl.MGPL.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGPL.g:193:3: ( (lv_blocks_9_0= ruleBlock ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMGPL.g:194:4: (lv_blocks_9_0= ruleBlock )
            	    {
            	    // InternalMGPL.g:194:4: (lv_blocks_9_0= ruleBlock )
            	    // InternalMGPL.g:195:5: lv_blocks_9_0= ruleBlock
            	    {

            	    					newCompositeNode(grammarAccess.getProgAccess().getBlocksBlockParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_blocks_9_0=ruleBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgRule());
            	    					}
            	    					add(
            	    						current,
            	    						"blocks",
            	    						lv_blocks_9_0,
            	    						"mgpl.MGPL.Block");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProg"


    // $ANTLR start "entryRuleDecl"
    // InternalMGPL.g:216:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalMGPL.g:216:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalMGPL.g:217:2: iv_ruleDecl= ruleDecl EOF
            {
             newCompositeNode(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecl=ruleDecl();

            state._fsp--;

             current =iv_ruleDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalMGPL.g:223:1: ruleDecl returns [EObject current=null] : ( (this_VarDecl_0= ruleVarDecl | this_ObjDecl_1= ruleObjDecl ) otherlv_2= ';' ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_VarDecl_0 = null;

        EObject this_ObjDecl_1 = null;



        	enterRule();

        try {
            // InternalMGPL.g:229:2: ( ( (this_VarDecl_0= ruleVarDecl | this_ObjDecl_1= ruleObjDecl ) otherlv_2= ';' ) )
            // InternalMGPL.g:230:2: ( (this_VarDecl_0= ruleVarDecl | this_ObjDecl_1= ruleObjDecl ) otherlv_2= ';' )
            {
            // InternalMGPL.g:230:2: ( (this_VarDecl_0= ruleVarDecl | this_ObjDecl_1= ruleObjDecl ) otherlv_2= ';' )
            // InternalMGPL.g:231:3: (this_VarDecl_0= ruleVarDecl | this_ObjDecl_1= ruleObjDecl ) otherlv_2= ';'
            {
            // InternalMGPL.g:231:3: (this_VarDecl_0= ruleVarDecl | this_ObjDecl_1= ruleObjDecl )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=18 && LA5_0<=20)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMGPL.g:232:4: this_VarDecl_0= ruleVarDecl
                    {

                    				newCompositeNode(grammarAccess.getDeclAccess().getVarDeclParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_VarDecl_0=ruleVarDecl();

                    state._fsp--;


                    				current = this_VarDecl_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:241:4: this_ObjDecl_1= ruleObjDecl
                    {

                    				newCompositeNode(grammarAccess.getDeclAccess().getObjDeclParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_ObjDecl_1=ruleObjDecl();

                    state._fsp--;


                    				current = this_ObjDecl_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleVarDecl"
    // InternalMGPL.g:258:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalMGPL.g:258:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalMGPL.g:259:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalMGPL.g:265:1: ruleVarDecl returns [EObject current=null] : ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_IDF ) ) ( ( (lv_init_2_0= ruleInit ) )? | ( () otherlv_4= '[' ( (lv_length_5_0= RULE_NUMBER ) ) otherlv_6= ']' ) ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token lv_length_5_0=null;
        Token otherlv_6=null;
        EObject lv_init_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:271:2: ( ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_IDF ) ) ( ( (lv_init_2_0= ruleInit ) )? | ( () otherlv_4= '[' ( (lv_length_5_0= RULE_NUMBER ) ) otherlv_6= ']' ) ) ) )
            // InternalMGPL.g:272:2: ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_IDF ) ) ( ( (lv_init_2_0= ruleInit ) )? | ( () otherlv_4= '[' ( (lv_length_5_0= RULE_NUMBER ) ) otherlv_6= ']' ) ) )
            {
            // InternalMGPL.g:272:2: ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_IDF ) ) ( ( (lv_init_2_0= ruleInit ) )? | ( () otherlv_4= '[' ( (lv_length_5_0= RULE_NUMBER ) ) otherlv_6= ']' ) ) )
            // InternalMGPL.g:273:3: ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_IDF ) ) ( ( (lv_init_2_0= ruleInit ) )? | ( () otherlv_4= '[' ( (lv_length_5_0= RULE_NUMBER ) ) otherlv_6= ']' ) )
            {
            // InternalMGPL.g:273:3: ( (lv_type_0_0= 'int' ) )
            // InternalMGPL.g:274:4: (lv_type_0_0= 'int' )
            {
            // InternalMGPL.g:274:4: (lv_type_0_0= 'int' )
            // InternalMGPL.g:275:5: lv_type_0_0= 'int'
            {
            lv_type_0_0=(Token)match(input,14,FOLLOW_3); 

            					newLeafNode(lv_type_0_0, grammarAccess.getVarDeclAccess().getTypeIntKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDeclRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "int");
            				

            }


            }

            // InternalMGPL.g:287:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:288:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:288:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:289:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarDeclAccess().getNameIDFTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"mgpl.MGPL.IDF");
            				

            }


            }

            // InternalMGPL.g:305:3: ( ( (lv_init_2_0= ruleInit ) )? | ( () otherlv_4= '[' ( (lv_length_5_0= RULE_NUMBER ) ) otherlv_6= ']' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||LA7_0==13||LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMGPL.g:306:4: ( (lv_init_2_0= ruleInit ) )?
                    {
                    // InternalMGPL.g:306:4: ( (lv_init_2_0= ruleInit ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMGPL.g:307:5: (lv_init_2_0= ruleInit )
                            {
                            // InternalMGPL.g:307:5: (lv_init_2_0= ruleInit )
                            // InternalMGPL.g:308:6: lv_init_2_0= ruleInit
                            {

                            						newCompositeNode(grammarAccess.getVarDeclAccess().getInitInitParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_init_2_0=ruleInit();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                            						}
                            						set(
                            							current,
                            							"init",
                            							lv_init_2_0,
                            							"mgpl.MGPL.Init");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:326:4: ( () otherlv_4= '[' ( (lv_length_5_0= RULE_NUMBER ) ) otherlv_6= ']' )
                    {
                    // InternalMGPL.g:326:4: ( () otherlv_4= '[' ( (lv_length_5_0= RULE_NUMBER ) ) otherlv_6= ']' )
                    // InternalMGPL.g:327:5: () otherlv_4= '[' ( (lv_length_5_0= RULE_NUMBER ) ) otherlv_6= ']'
                    {
                    // InternalMGPL.g:327:5: ()
                    // InternalMGPL.g:328:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getVarDeclAccess().getArrayDeclVariableAction_2_1_0(),
                    							current);
                    					

                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_11); 

                    					newLeafNode(otherlv_4, grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_2_1_1());
                    				
                    // InternalMGPL.g:338:5: ( (lv_length_5_0= RULE_NUMBER ) )
                    // InternalMGPL.g:339:6: (lv_length_5_0= RULE_NUMBER )
                    {
                    // InternalMGPL.g:339:6: (lv_length_5_0= RULE_NUMBER )
                    // InternalMGPL.g:340:7: lv_length_5_0= RULE_NUMBER
                    {
                    lv_length_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_12); 

                    							newLeafNode(lv_length_5_0, grammarAccess.getVarDeclAccess().getLengthNUMBERTerminalRuleCall_2_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVarDeclRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"length",
                    								lv_length_5_0,
                    								"mgpl.MGPL.NUMBER");
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_2_1_3());
                    				

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
        }
        return current;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleInit"
    // InternalMGPL.g:366:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalMGPL.g:366:45: (iv_ruleInit= ruleInit EOF )
            // InternalMGPL.g:367:2: iv_ruleInit= ruleInit EOF
            {
             newCompositeNode(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;

             current =iv_ruleInit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalMGPL.g:373:1: ruleInit returns [EObject current=null] : (otherlv_0= '=' this_Expr_1= ruleExpr ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expr_1 = null;



        	enterRule();

        try {
            // InternalMGPL.g:379:2: ( (otherlv_0= '=' this_Expr_1= ruleExpr ) )
            // InternalMGPL.g:380:2: (otherlv_0= '=' this_Expr_1= ruleExpr )
            {
            // InternalMGPL.g:380:2: (otherlv_0= '=' this_Expr_1= ruleExpr )
            // InternalMGPL.g:381:3: otherlv_0= '=' this_Expr_1= ruleExpr
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getInitAccess().getEqualsSignKeyword_0());
            		

            			newCompositeNode(grammarAccess.getInitAccess().getExprParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Expr_1=ruleExpr();

            state._fsp--;


            			current = this_Expr_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleObjDecl"
    // InternalMGPL.g:397:1: entryRuleObjDecl returns [EObject current=null] : iv_ruleObjDecl= ruleObjDecl EOF ;
    public final EObject entryRuleObjDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjDecl = null;


        try {
            // InternalMGPL.g:397:48: (iv_ruleObjDecl= ruleObjDecl EOF )
            // InternalMGPL.g:398:2: iv_ruleObjDecl= ruleObjDecl EOF
            {
             newCompositeNode(grammarAccess.getObjDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjDecl=ruleObjDecl();

            state._fsp--;

             current =iv_ruleObjDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjDecl"


    // $ANTLR start "ruleObjDecl"
    // InternalMGPL.g:404:1: ruleObjDecl returns [EObject current=null] : ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) ( (otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' ) | ( () otherlv_8= '[' ( (lv_length_9_0= RULE_NUMBER ) ) otherlv_10= ']' ) ) ) ;
    public final EObject ruleObjDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_length_9_0=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_attr_3_0 = null;

        EObject lv_attr_5_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:410:2: ( ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) ( (otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' ) | ( () otherlv_8= '[' ( (lv_length_9_0= RULE_NUMBER ) ) otherlv_10= ']' ) ) ) )
            // InternalMGPL.g:411:2: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) ( (otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' ) | ( () otherlv_8= '[' ( (lv_length_9_0= RULE_NUMBER ) ) otherlv_10= ']' ) ) )
            {
            // InternalMGPL.g:411:2: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) ( (otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' ) | ( () otherlv_8= '[' ( (lv_length_9_0= RULE_NUMBER ) ) otherlv_10= ']' ) ) )
            // InternalMGPL.g:412:3: ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) ( (otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' ) | ( () otherlv_8= '[' ( (lv_length_9_0= RULE_NUMBER ) ) otherlv_10= ']' ) )
            {
            // InternalMGPL.g:412:3: ( (lv_type_0_0= ruleObjType ) )
            // InternalMGPL.g:413:4: (lv_type_0_0= ruleObjType )
            {
            // InternalMGPL.g:413:4: (lv_type_0_0= ruleObjType )
            // InternalMGPL.g:414:5: lv_type_0_0= ruleObjType
            {

            					newCompositeNode(grammarAccess.getObjDeclAccess().getTypeObjTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleObjType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjDeclRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"mgpl.MGPL.ObjType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGPL.g:431:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:432:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:432:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:433:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjDeclAccess().getNameIDFTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"mgpl.MGPL.IDF");
            				

            }


            }

            // InternalMGPL.g:449:3: ( (otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' ) | ( () otherlv_8= '[' ( (lv_length_9_0= RULE_NUMBER ) ) otherlv_10= ']' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==10) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMGPL.g:450:4: (otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' )
                    {
                    // InternalMGPL.g:450:4: (otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')' )
                    // InternalMGPL.g:451:5: otherlv_2= '(' ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,10,FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getObjDeclAccess().getLeftParenthesisKeyword_2_0_0());
                    				
                    // InternalMGPL.g:455:5: ( ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_IDF) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMGPL.g:456:6: ( (lv_attr_3_0= ruleAttrAss ) ) (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )*
                            {
                            // InternalMGPL.g:456:6: ( (lv_attr_3_0= ruleAttrAss ) )
                            // InternalMGPL.g:457:7: (lv_attr_3_0= ruleAttrAss )
                            {
                            // InternalMGPL.g:457:7: (lv_attr_3_0= ruleAttrAss )
                            // InternalMGPL.g:458:8: lv_attr_3_0= ruleAttrAss
                            {

                            								newCompositeNode(grammarAccess.getObjDeclAccess().getAttrAttrAssParserRuleCall_2_0_1_0_0());
                            							
                            pushFollow(FOLLOW_6);
                            lv_attr_3_0=ruleAttrAss();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getObjDeclRule());
                            								}
                            								add(
                            									current,
                            									"attr",
                            									lv_attr_3_0,
                            									"mgpl.MGPL.AttrAss");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalMGPL.g:475:6: (otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==11) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalMGPL.g:476:7: otherlv_4= ',' ( (lv_attr_5_0= ruleAttrAss ) )
                            	    {
                            	    otherlv_4=(Token)match(input,11,FOLLOW_3); 

                            	    							newLeafNode(otherlv_4, grammarAccess.getObjDeclAccess().getCommaKeyword_2_0_1_1_0());
                            	    						
                            	    // InternalMGPL.g:480:7: ( (lv_attr_5_0= ruleAttrAss ) )
                            	    // InternalMGPL.g:481:8: (lv_attr_5_0= ruleAttrAss )
                            	    {
                            	    // InternalMGPL.g:481:8: (lv_attr_5_0= ruleAttrAss )
                            	    // InternalMGPL.g:482:9: lv_attr_5_0= ruleAttrAss
                            	    {

                            	    									newCompositeNode(grammarAccess.getObjDeclAccess().getAttrAttrAssParserRuleCall_2_0_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_6);
                            	    lv_attr_5_0=ruleAttrAss();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getObjDeclRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"attr",
                            	    										lv_attr_5_0,
                            	    										"mgpl.MGPL.AttrAss");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,12,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getObjDeclAccess().getRightParenthesisKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:507:4: ( () otherlv_8= '[' ( (lv_length_9_0= RULE_NUMBER ) ) otherlv_10= ']' )
                    {
                    // InternalMGPL.g:507:4: ( () otherlv_8= '[' ( (lv_length_9_0= RULE_NUMBER ) ) otherlv_10= ']' )
                    // InternalMGPL.g:508:5: () otherlv_8= '[' ( (lv_length_9_0= RULE_NUMBER ) ) otherlv_10= ']'
                    {
                    // InternalMGPL.g:508:5: ()
                    // InternalMGPL.g:509:6: 
                    {

                    						current = forceCreateModelElementAndSet(
                    							grammarAccess.getObjDeclAccess().getArrayDeclVariableAction_2_1_0(),
                    							current);
                    					

                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_11); 

                    					newLeafNode(otherlv_8, grammarAccess.getObjDeclAccess().getLeftSquareBracketKeyword_2_1_1());
                    				
                    // InternalMGPL.g:519:5: ( (lv_length_9_0= RULE_NUMBER ) )
                    // InternalMGPL.g:520:6: (lv_length_9_0= RULE_NUMBER )
                    {
                    // InternalMGPL.g:520:6: (lv_length_9_0= RULE_NUMBER )
                    // InternalMGPL.g:521:7: lv_length_9_0= RULE_NUMBER
                    {
                    lv_length_9_0=(Token)match(input,RULE_NUMBER,FOLLOW_12); 

                    							newLeafNode(lv_length_9_0, grammarAccess.getObjDeclAccess().getLengthNUMBERTerminalRuleCall_2_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getObjDeclRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"length",
                    								lv_length_9_0,
                    								"mgpl.MGPL.NUMBER");
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getObjDeclAccess().getRightSquareBracketKeyword_2_1_3());
                    				

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
        }
        return current;
    }
    // $ANTLR end "ruleObjDecl"


    // $ANTLR start "entryRuleObjType"
    // InternalMGPL.g:547:1: entryRuleObjType returns [String current=null] : iv_ruleObjType= ruleObjType EOF ;
    public final String entryRuleObjType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObjType = null;


        try {
            // InternalMGPL.g:547:47: (iv_ruleObjType= ruleObjType EOF )
            // InternalMGPL.g:548:2: iv_ruleObjType= ruleObjType EOF
            {
             newCompositeNode(grammarAccess.getObjTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjType=ruleObjType();

            state._fsp--;

             current =iv_ruleObjType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjType"


    // $ANTLR start "ruleObjType"
    // InternalMGPL.g:554:1: ruleObjType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' ) ;
    public final AntlrDatatypeRuleToken ruleObjType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMGPL.g:560:2: ( (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' ) )
            // InternalMGPL.g:561:2: (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' )
            {
            // InternalMGPL.g:561:2: (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMGPL.g:562:3: kw= 'rectangle'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjTypeAccess().getRectangleKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:568:3: kw= 'triangle'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjTypeAccess().getTriangleKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMGPL.g:574:3: kw= 'circle'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjTypeAccess().getCircleKeyword_2());
                    		

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
        }
        return current;
    }
    // $ANTLR end "ruleObjType"


    // $ANTLR start "entryRuleAttrAss"
    // InternalMGPL.g:583:1: entryRuleAttrAss returns [EObject current=null] : iv_ruleAttrAss= ruleAttrAss EOF ;
    public final EObject entryRuleAttrAss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrAss = null;


        try {
            // InternalMGPL.g:583:48: (iv_ruleAttrAss= ruleAttrAss EOF )
            // InternalMGPL.g:584:2: iv_ruleAttrAss= ruleAttrAss EOF
            {
             newCompositeNode(grammarAccess.getAttrAssRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttrAss=ruleAttrAss();

            state._fsp--;

             current =iv_ruleAttrAss; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttrAss"


    // $ANTLR start "ruleAttrAss"
    // InternalMGPL.g:590:1: ruleAttrAss returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDF ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAttrAss() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:596:2: ( ( ( (lv_name_0_0= RULE_IDF ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) ) )
            // InternalMGPL.g:597:2: ( ( (lv_name_0_0= RULE_IDF ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )
            {
            // InternalMGPL.g:597:2: ( ( (lv_name_0_0= RULE_IDF ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )
            // InternalMGPL.g:598:3: ( (lv_name_0_0= RULE_IDF ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) )
            {
            // InternalMGPL.g:598:3: ( (lv_name_0_0= RULE_IDF ) )
            // InternalMGPL.g:599:4: (lv_name_0_0= RULE_IDF )
            {
            // InternalMGPL.g:599:4: (lv_name_0_0= RULE_IDF )
            // InternalMGPL.g:600:5: lv_name_0_0= RULE_IDF
            {
            lv_name_0_0=(Token)match(input,RULE_IDF,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttrAssAccess().getNameIDFTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttrAssRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"mgpl.MGPL.IDF");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAttrAssAccess().getEqualsSignKeyword_1());
            		
            // InternalMGPL.g:620:3: ( (lv_value_2_0= ruleExpr ) )
            // InternalMGPL.g:621:4: (lv_value_2_0= ruleExpr )
            {
            // InternalMGPL.g:621:4: (lv_value_2_0= ruleExpr )
            // InternalMGPL.g:622:5: lv_value_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getAttrAssAccess().getValueExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttrAssRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"mgpl.MGPL.Expr");
            					afterParserOrEnumRuleCall();
            				

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
        }
        return current;
    }
    // $ANTLR end "ruleAttrAss"


    // $ANTLR start "entryRuleBlock"
    // InternalMGPL.g:643:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMGPL.g:643:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMGPL.g:644:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMGPL.g:650:1: ruleBlock returns [EObject current=null] : (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_AnimBlock_0 = null;

        EObject this_EventBlock_1 = null;



        	enterRule();

        try {
            // InternalMGPL.g:656:2: ( (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) )
            // InternalMGPL.g:657:2: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
            {
            // InternalMGPL.g:657:2: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMGPL.g:658:3: this_AnimBlock_0= ruleAnimBlock
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnimBlock_0=ruleAnimBlock();

                    state._fsp--;


                    			current = this_AnimBlock_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:667:3: this_EventBlock_1= ruleEventBlock
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getEventBlockParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventBlock_1=ruleEventBlock();

                    state._fsp--;


                    			current = this_EventBlock_1;
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
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleAnimBlock"
    // InternalMGPL.g:679:1: entryRuleAnimBlock returns [EObject current=null] : iv_ruleAnimBlock= ruleAnimBlock EOF ;
    public final EObject entryRuleAnimBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimBlock = null;


        try {
            // InternalMGPL.g:679:50: (iv_ruleAnimBlock= ruleAnimBlock EOF )
            // InternalMGPL.g:680:2: iv_ruleAnimBlock= ruleAnimBlock EOF
            {
             newCompositeNode(grammarAccess.getAnimBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnimBlock=ruleAnimBlock();

            state._fsp--;

             current =iv_ruleAnimBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnimBlock"


    // $ANTLR start "ruleAnimBlock"
    // InternalMGPL.g:686:1: ruleAnimBlock returns [EObject current=null] : (otherlv_0= 'animation' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_param_3_0= ruleParamDecl ) ) otherlv_4= ')' ( (lv_stmtBlock_5_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleAnimBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_param_3_0 = null;

        EObject lv_stmtBlock_5_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:692:2: ( (otherlv_0= 'animation' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_param_3_0= ruleParamDecl ) ) otherlv_4= ')' ( (lv_stmtBlock_5_0= ruleStmtBlock ) ) ) )
            // InternalMGPL.g:693:2: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_param_3_0= ruleParamDecl ) ) otherlv_4= ')' ( (lv_stmtBlock_5_0= ruleStmtBlock ) ) )
            {
            // InternalMGPL.g:693:2: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_param_3_0= ruleParamDecl ) ) otherlv_4= ')' ( (lv_stmtBlock_5_0= ruleStmtBlock ) ) )
            // InternalMGPL.g:694:3: otherlv_0= 'animation' ( (lv_name_1_0= RULE_IDF ) ) otherlv_2= '(' ( (lv_param_3_0= ruleParamDecl ) ) otherlv_4= ')' ( (lv_stmtBlock_5_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnimBlockAccess().getAnimationKeyword_0());
            		
            // InternalMGPL.g:698:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:699:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:699:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:700:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnimBlockAccess().getNameIDFTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"mgpl.MGPL.IDF");
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAnimBlockAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMGPL.g:720:3: ( (lv_param_3_0= ruleParamDecl ) )
            // InternalMGPL.g:721:4: (lv_param_3_0= ruleParamDecl )
            {
            // InternalMGPL.g:721:4: (lv_param_3_0= ruleParamDecl )
            // InternalMGPL.g:722:5: lv_param_3_0= ruleParamDecl
            {

            					newCompositeNode(grammarAccess.getAnimBlockAccess().getParamParamDeclParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_param_3_0=ruleParamDecl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnimBlockRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_3_0,
            						"mgpl.MGPL.ParamDecl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getAnimBlockAccess().getRightParenthesisKeyword_4());
            		
            // InternalMGPL.g:743:3: ( (lv_stmtBlock_5_0= ruleStmtBlock ) )
            // InternalMGPL.g:744:4: (lv_stmtBlock_5_0= ruleStmtBlock )
            {
            // InternalMGPL.g:744:4: (lv_stmtBlock_5_0= ruleStmtBlock )
            // InternalMGPL.g:745:5: lv_stmtBlock_5_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getAnimBlockAccess().getStmtBlockStmtBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmtBlock_5_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnimBlockRule());
            					}
            					set(
            						current,
            						"stmtBlock",
            						lv_stmtBlock_5_0,
            						"mgpl.MGPL.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

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
        }
        return current;
    }
    // $ANTLR end "ruleAnimBlock"


    // $ANTLR start "entryRuleParamDecl"
    // InternalMGPL.g:766:1: entryRuleParamDecl returns [EObject current=null] : iv_ruleParamDecl= ruleParamDecl EOF ;
    public final EObject entryRuleParamDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDecl = null;


        try {
            // InternalMGPL.g:766:50: (iv_ruleParamDecl= ruleParamDecl EOF )
            // InternalMGPL.g:767:2: iv_ruleParamDecl= ruleParamDecl EOF
            {
             newCompositeNode(grammarAccess.getParamDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamDecl=ruleParamDecl();

            state._fsp--;

             current =iv_ruleParamDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamDecl"


    // $ANTLR start "ruleParamDecl"
    // InternalMGPL.g:773:1: ruleParamDecl returns [EObject current=null] : ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) ) ;
    public final EObject ruleParamDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:779:2: ( ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) ) )
            // InternalMGPL.g:780:2: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) )
            {
            // InternalMGPL.g:780:2: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) ) )
            // InternalMGPL.g:781:3: ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_IDF ) )
            {
            // InternalMGPL.g:781:3: ( (lv_type_0_0= ruleObjType ) )
            // InternalMGPL.g:782:4: (lv_type_0_0= ruleObjType )
            {
            // InternalMGPL.g:782:4: (lv_type_0_0= ruleObjType )
            // InternalMGPL.g:783:5: lv_type_0_0= ruleObjType
            {

            					newCompositeNode(grammarAccess.getParamDeclAccess().getTypeObjTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleObjType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamDeclRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"mgpl.MGPL.ObjType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGPL.g:800:3: ( (lv_name_1_0= RULE_IDF ) )
            // InternalMGPL.g:801:4: (lv_name_1_0= RULE_IDF )
            {
            // InternalMGPL.g:801:4: (lv_name_1_0= RULE_IDF )
            // InternalMGPL.g:802:5: lv_name_1_0= RULE_IDF
            {
            lv_name_1_0=(Token)match(input,RULE_IDF,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParamDeclAccess().getNameIDFTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"mgpl.MGPL.IDF");
            				

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
        }
        return current;
    }
    // $ANTLR end "ruleParamDecl"


    // $ANTLR start "entryRuleEventBlock"
    // InternalMGPL.g:822:1: entryRuleEventBlock returns [EObject current=null] : iv_ruleEventBlock= ruleEventBlock EOF ;
    public final EObject entryRuleEventBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventBlock = null;


        try {
            // InternalMGPL.g:822:51: (iv_ruleEventBlock= ruleEventBlock EOF )
            // InternalMGPL.g:823:2: iv_ruleEventBlock= ruleEventBlock EOF
            {
             newCompositeNode(grammarAccess.getEventBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventBlock=ruleEventBlock();

            state._fsp--;

             current =iv_ruleEventBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventBlock"


    // $ANTLR start "ruleEventBlock"
    // InternalMGPL.g:829:1: ruleEventBlock returns [EObject current=null] : (otherlv_0= 'on' ( (lv_keyStroke_1_0= ruleKeyStroke ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleEventBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_keyStroke_1_0 = null;

        EObject lv_stmtBlock_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:835:2: ( (otherlv_0= 'on' ( (lv_keyStroke_1_0= ruleKeyStroke ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) ) )
            // InternalMGPL.g:836:2: (otherlv_0= 'on' ( (lv_keyStroke_1_0= ruleKeyStroke ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) )
            {
            // InternalMGPL.g:836:2: (otherlv_0= 'on' ( (lv_keyStroke_1_0= ruleKeyStroke ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) )
            // InternalMGPL.g:837:3: otherlv_0= 'on' ( (lv_keyStroke_1_0= ruleKeyStroke ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getEventBlockAccess().getOnKeyword_0());
            		
            // InternalMGPL.g:841:3: ( (lv_keyStroke_1_0= ruleKeyStroke ) )
            // InternalMGPL.g:842:4: (lv_keyStroke_1_0= ruleKeyStroke )
            {
            // InternalMGPL.g:842:4: (lv_keyStroke_1_0= ruleKeyStroke )
            // InternalMGPL.g:843:5: lv_keyStroke_1_0= ruleKeyStroke
            {

            					newCompositeNode(grammarAccess.getEventBlockAccess().getKeyStrokeKeyStrokeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_keyStroke_1_0=ruleKeyStroke();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventBlockRule());
            					}
            					set(
            						current,
            						"keyStroke",
            						lv_keyStroke_1_0,
            						"mgpl.MGPL.KeyStroke");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGPL.g:860:3: ( (lv_stmtBlock_2_0= ruleStmtBlock ) )
            // InternalMGPL.g:861:4: (lv_stmtBlock_2_0= ruleStmtBlock )
            {
            // InternalMGPL.g:861:4: (lv_stmtBlock_2_0= ruleStmtBlock )
            // InternalMGPL.g:862:5: lv_stmtBlock_2_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getEventBlockAccess().getStmtBlockStmtBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmtBlock_2_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventBlockRule());
            					}
            					set(
            						current,
            						"stmtBlock",
            						lv_stmtBlock_2_0,
            						"mgpl.MGPL.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

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
        }
        return current;
    }
    // $ANTLR end "ruleEventBlock"


    // $ANTLR start "entryRuleKeyStroke"
    // InternalMGPL.g:883:1: entryRuleKeyStroke returns [String current=null] : iv_ruleKeyStroke= ruleKeyStroke EOF ;
    public final String entryRuleKeyStroke() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyStroke = null;


        try {
            // InternalMGPL.g:883:49: (iv_ruleKeyStroke= ruleKeyStroke EOF )
            // InternalMGPL.g:884:2: iv_ruleKeyStroke= ruleKeyStroke EOF
            {
             newCompositeNode(grammarAccess.getKeyStrokeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyStroke=ruleKeyStroke();

            state._fsp--;

             current =iv_ruleKeyStroke.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStroke"


    // $ANTLR start "ruleKeyStroke"
    // InternalMGPL.g:890:1: ruleKeyStroke returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' ) ;
    public final AntlrDatatypeRuleToken ruleKeyStroke() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMGPL.g:896:2: ( (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' ) )
            // InternalMGPL.g:897:2: (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' )
            {
            // InternalMGPL.g:897:2: (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt13=1;
                }
                break;
            case 24:
                {
                alt13=2;
                }
                break;
            case 25:
                {
                alt13=3;
                }
                break;
            case 26:
                {
                alt13=4;
                }
                break;
            case 27:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMGPL.g:898:3: kw= 'space'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyStrokeAccess().getSpaceKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:904:3: kw= 'leftarrow'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyStrokeAccess().getLeftarrowKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMGPL.g:910:3: kw= 'rightarrow'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyStrokeAccess().getRightarrowKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMGPL.g:916:3: kw= 'uparrow'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyStrokeAccess().getUparrowKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMGPL.g:922:3: kw= 'downarrow'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyStrokeAccess().getDownarrowKeyword_4());
                    		

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
        }
        return current;
    }
    // $ANTLR end "ruleKeyStroke"


    // $ANTLR start "entryRuleStmtBlock"
    // InternalMGPL.g:931:1: entryRuleStmtBlock returns [EObject current=null] : iv_ruleStmtBlock= ruleStmtBlock EOF ;
    public final EObject entryRuleStmtBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtBlock = null;


        try {
            // InternalMGPL.g:931:50: (iv_ruleStmtBlock= ruleStmtBlock EOF )
            // InternalMGPL.g:932:2: iv_ruleStmtBlock= ruleStmtBlock EOF
            {
             newCompositeNode(grammarAccess.getStmtBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmtBlock=ruleStmtBlock();

            state._fsp--;

             current =iv_ruleStmtBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmtBlock"


    // $ANTLR start "ruleStmtBlock"
    // InternalMGPL.g:938:1: ruleStmtBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleStmt ) )* otherlv_3= '}' ) ;
    public final EObject ruleStmtBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_stmts_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:944:2: ( ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleStmt ) )* otherlv_3= '}' ) )
            // InternalMGPL.g:945:2: ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleStmt ) )* otherlv_3= '}' )
            {
            // InternalMGPL.g:945:2: ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleStmt ) )* otherlv_3= '}' )
            // InternalMGPL.g:946:3: () otherlv_1= '{' ( (lv_stmts_2_0= ruleStmt ) )* otherlv_3= '}'
            {
            // InternalMGPL.g:946:3: ()
            // InternalMGPL.g:947:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStmtBlockAccess().getStmtBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getStmtBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMGPL.g:957:3: ( (lv_stmts_2_0= ruleStmt ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_IDF||LA14_0==30||LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMGPL.g:958:4: (lv_stmts_2_0= ruleStmt )
            	    {
            	    // InternalMGPL.g:958:4: (lv_stmts_2_0= ruleStmt )
            	    // InternalMGPL.g:959:5: lv_stmts_2_0= ruleStmt
            	    {

            	    					newCompositeNode(grammarAccess.getStmtBlockAccess().getStmtsStmtParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_stmts_2_0=ruleStmt();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStmtBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stmts",
            	    						lv_stmts_2_0,
            	    						"mgpl.MGPL.Stmt");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStmtBlockAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmtBlock"


    // $ANTLR start "entryRuleStmt"
    // InternalMGPL.g:984:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // InternalMGPL.g:984:45: (iv_ruleStmt= ruleStmt EOF )
            // InternalMGPL.g:985:2: iv_ruleStmt= ruleStmt EOF
            {
             newCompositeNode(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmt=ruleStmt();

            state._fsp--;

             current =iv_ruleStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalMGPL.g:991:1: ruleStmt returns [EObject current=null] : (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | (this_AssStmt_2= ruleAssStmt otherlv_3= ';' ) ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_IfStmt_0 = null;

        EObject this_ForStmt_1 = null;

        EObject this_AssStmt_2 = null;



        	enterRule();

        try {
            // InternalMGPL.g:997:2: ( (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | (this_AssStmt_2= ruleAssStmt otherlv_3= ';' ) ) )
            // InternalMGPL.g:998:2: (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | (this_AssStmt_2= ruleAssStmt otherlv_3= ';' ) )
            {
            // InternalMGPL.g:998:2: (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | (this_AssStmt_2= ruleAssStmt otherlv_3= ';' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case RULE_IDF:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMGPL.g:999:3: this_IfStmt_0= ruleIfStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStmt_0=ruleIfStmt();

                    state._fsp--;


                    			current = this_IfStmt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1008:3: this_ForStmt_1= ruleForStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getForStmtParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForStmt_1=ruleForStmt();

                    state._fsp--;


                    			current = this_ForStmt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMGPL.g:1017:3: (this_AssStmt_2= ruleAssStmt otherlv_3= ';' )
                    {
                    // InternalMGPL.g:1017:3: (this_AssStmt_2= ruleAssStmt otherlv_3= ';' )
                    // InternalMGPL.g:1018:4: this_AssStmt_2= ruleAssStmt otherlv_3= ';'
                    {

                    				newCompositeNode(grammarAccess.getStmtAccess().getAssStmtParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_AssStmt_2=ruleAssStmt();

                    state._fsp--;


                    				current = this_AssStmt_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStmtAccess().getSemicolonKeyword_2_1());
                    			

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
        }
        return current;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleIfStmt"
    // InternalMGPL.g:1035:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // InternalMGPL.g:1035:47: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalMGPL.g:1036:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
             newCompositeNode(grammarAccess.getIfStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;

             current =iv_ruleIfStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalMGPL.g:1042:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleStmtBlock ) ) )? ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1048:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleStmtBlock ) ) )? ) )
            // InternalMGPL.g:1049:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleStmtBlock ) ) )? )
            {
            // InternalMGPL.g:1049:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleStmtBlock ) ) )? )
            // InternalMGPL.g:1050:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleStmtBlock ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,10,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMGPL.g:1058:3: ( (lv_condition_2_0= ruleExpr ) )
            // InternalMGPL.g:1059:4: (lv_condition_2_0= ruleExpr )
            {
            // InternalMGPL.g:1059:4: (lv_condition_2_0= ruleExpr )
            // InternalMGPL.g:1060:5: lv_condition_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getIfStmtAccess().getConditionExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_condition_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"mgpl.MGPL.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3());
            		
            // InternalMGPL.g:1081:3: ( (lv_thenBlock_4_0= ruleStmtBlock ) )
            // InternalMGPL.g:1082:4: (lv_thenBlock_4_0= ruleStmtBlock )
            {
            // InternalMGPL.g:1082:4: (lv_thenBlock_4_0= ruleStmtBlock )
            // InternalMGPL.g:1083:5: lv_thenBlock_4_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getIfStmtAccess().getThenBlockStmtBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_thenBlock_4_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            					}
            					set(
            						current,
            						"thenBlock",
            						lv_thenBlock_4_0,
            						"mgpl.MGPL.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGPL.g:1100:3: (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleStmtBlock ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMGPL.g:1101:4: otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleStmtBlock ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfStmtAccess().getElseKeyword_5_0());
                    			
                    // InternalMGPL.g:1105:4: ( (lv_elseBlock_6_0= ruleStmtBlock ) )
                    // InternalMGPL.g:1106:5: (lv_elseBlock_6_0= ruleStmtBlock )
                    {
                    // InternalMGPL.g:1106:5: (lv_elseBlock_6_0= ruleStmtBlock )
                    // InternalMGPL.g:1107:6: lv_elseBlock_6_0= ruleStmtBlock
                    {

                    						newCompositeNode(grammarAccess.getIfStmtAccess().getElseBlockStmtBlockParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_6_0=ruleStmtBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfStmtRule());
                    						}
                    						set(
                    							current,
                    							"elseBlock",
                    							lv_elseBlock_6_0,
                    							"mgpl.MGPL.StmtBlock");
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
        }
        return current;
    }
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleForStmt"
    // InternalMGPL.g:1129:1: entryRuleForStmt returns [EObject current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final EObject entryRuleForStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStmt = null;


        try {
            // InternalMGPL.g:1129:48: (iv_ruleForStmt= ruleForStmt EOF )
            // InternalMGPL.g:1130:2: iv_ruleForStmt= ruleForStmt EOF
            {
             newCompositeNode(grammarAccess.getForStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForStmt=ruleForStmt();

            state._fsp--;

             current =iv_ruleForStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStmt"


    // $ANTLR start "ruleForStmt"
    // InternalMGPL.g:1136:1: ruleForStmt returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loop_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleForStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_init_2_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_loop_6_0 = null;

        EObject lv_stmtBlock_8_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1142:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loop_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) ) )
            // InternalMGPL.g:1143:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loop_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) )
            {
            // InternalMGPL.g:1143:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loop_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) )
            // InternalMGPL.g:1144:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_init_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_condition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loop_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getForStmtAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,10,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getForStmtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMGPL.g:1152:3: ( (lv_init_2_0= ruleAssStmt ) )
            // InternalMGPL.g:1153:4: (lv_init_2_0= ruleAssStmt )
            {
            // InternalMGPL.g:1153:4: (lv_init_2_0= ruleAssStmt )
            // InternalMGPL.g:1154:5: lv_init_2_0= ruleAssStmt
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getInitAssStmtParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_init_2_0=ruleAssStmt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"init",
            						lv_init_2_0,
            						"mgpl.MGPL.AssStmt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getForStmtAccess().getSemicolonKeyword_3());
            		
            // InternalMGPL.g:1175:3: ( (lv_condition_4_0= ruleExpr ) )
            // InternalMGPL.g:1176:4: (lv_condition_4_0= ruleExpr )
            {
            // InternalMGPL.g:1176:4: (lv_condition_4_0= ruleExpr )
            // InternalMGPL.g:1177:5: lv_condition_4_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getConditionExprParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_condition_4_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"mgpl.MGPL.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getForStmtAccess().getSemicolonKeyword_5());
            		
            // InternalMGPL.g:1198:3: ( (lv_loop_6_0= ruleAssStmt ) )
            // InternalMGPL.g:1199:4: (lv_loop_6_0= ruleAssStmt )
            {
            // InternalMGPL.g:1199:4: (lv_loop_6_0= ruleAssStmt )
            // InternalMGPL.g:1200:5: lv_loop_6_0= ruleAssStmt
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getLoopAssStmtParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_loop_6_0=ruleAssStmt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"loop",
            						lv_loop_6_0,
            						"mgpl.MGPL.AssStmt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getForStmtAccess().getRightParenthesisKeyword_7());
            		
            // InternalMGPL.g:1221:3: ( (lv_stmtBlock_8_0= ruleStmtBlock ) )
            // InternalMGPL.g:1222:4: (lv_stmtBlock_8_0= ruleStmtBlock )
            {
            // InternalMGPL.g:1222:4: (lv_stmtBlock_8_0= ruleStmtBlock )
            // InternalMGPL.g:1223:5: lv_stmtBlock_8_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getStmtBlockStmtBlockParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmtBlock_8_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"stmtBlock",
            						lv_stmtBlock_8_0,
            						"mgpl.MGPL.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

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
        }
        return current;
    }
    // $ANTLR end "ruleForStmt"


    // $ANTLR start "entryRuleAssStmt"
    // InternalMGPL.g:1244:1: entryRuleAssStmt returns [EObject current=null] : iv_ruleAssStmt= ruleAssStmt EOF ;
    public final EObject entryRuleAssStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssStmt = null;


        try {
            // InternalMGPL.g:1244:48: (iv_ruleAssStmt= ruleAssStmt EOF )
            // InternalMGPL.g:1245:2: iv_ruleAssStmt= ruleAssStmt EOF
            {
             newCompositeNode(grammarAccess.getAssStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssStmt=ruleAssStmt();

            state._fsp--;

             current =iv_ruleAssStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssStmt"


    // $ANTLR start "ruleAssStmt"
    // InternalMGPL.g:1251:1: ruleAssStmt returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAssStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1257:2: ( ( ( (lv_variable_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpr ) ) ) )
            // InternalMGPL.g:1258:2: ( ( (lv_variable_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpr ) ) )
            {
            // InternalMGPL.g:1258:2: ( ( (lv_variable_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpr ) ) )
            // InternalMGPL.g:1259:3: ( (lv_variable_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpr ) )
            {
            // InternalMGPL.g:1259:3: ( (lv_variable_0_0= ruleVar ) )
            // InternalMGPL.g:1260:4: (lv_variable_0_0= ruleVar )
            {
            // InternalMGPL.g:1260:4: (lv_variable_0_0= ruleVar )
            // InternalMGPL.g:1261:5: lv_variable_0_0= ruleVar
            {

            					newCompositeNode(grammarAccess.getAssStmtAccess().getVariableVarParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_variable_0_0=ruleVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssStmtRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"mgpl.MGPL.Var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAssStmtAccess().getEqualsSignKeyword_1());
            		
            // InternalMGPL.g:1282:3: ( (lv_expression_2_0= ruleExpr ) )
            // InternalMGPL.g:1283:4: (lv_expression_2_0= ruleExpr )
            {
            // InternalMGPL.g:1283:4: (lv_expression_2_0= ruleExpr )
            // InternalMGPL.g:1284:5: lv_expression_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getAssStmtAccess().getExpressionExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssStmtRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"mgpl.MGPL.Expr");
            					afterParserOrEnumRuleCall();
            				

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
        }
        return current;
    }
    // $ANTLR end "ruleAssStmt"


    // $ANTLR start "entryRuleVar"
    // InternalMGPL.g:1305:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMGPL.g:1305:44: (iv_ruleVar= ruleVar EOF )
            // InternalMGPL.g:1306:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMGPL.g:1312:1: ruleVar returns [EObject current=null] : ( ( (otherlv_0= RULE_IDF ) ) ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )? ( () otherlv_6= '.' ( (lv_memberName_7_0= RULE_IDF ) ) )? ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_memberName_7_0=null;
        EObject lv_index_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1318:2: ( ( ( (otherlv_0= RULE_IDF ) ) ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )? ( () otherlv_6= '.' ( (lv_memberName_7_0= RULE_IDF ) ) )? ) )
            // InternalMGPL.g:1319:2: ( ( (otherlv_0= RULE_IDF ) ) ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )? ( () otherlv_6= '.' ( (lv_memberName_7_0= RULE_IDF ) ) )? )
            {
            // InternalMGPL.g:1319:2: ( ( (otherlv_0= RULE_IDF ) ) ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )? ( () otherlv_6= '.' ( (lv_memberName_7_0= RULE_IDF ) ) )? )
            // InternalMGPL.g:1320:3: ( (otherlv_0= RULE_IDF ) ) ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )? ( () otherlv_6= '.' ( (lv_memberName_7_0= RULE_IDF ) ) )?
            {
            // InternalMGPL.g:1320:3: ( (otherlv_0= RULE_IDF ) )
            // InternalMGPL.g:1321:4: (otherlv_0= RULE_IDF )
            {
            // InternalMGPL.g:1321:4: (otherlv_0= RULE_IDF )
            // InternalMGPL.g:1322:5: otherlv_0= RULE_IDF
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_IDF,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getVarAccess().getIdAllDeclsCrossReference_0_0());
            				

            }


            }

            // InternalMGPL.g:1333:3: ( () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMGPL.g:1334:4: () otherlv_2= '[' ( (lv_index_3_0= ruleExpr ) ) otherlv_4= ']'
                    {
                    // InternalMGPL.g:1334:4: ()
                    // InternalMGPL.g:1335:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getVarAccess().getElementSelectVariableAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getVarAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalMGPL.g:1345:4: ( (lv_index_3_0= ruleExpr ) )
                    // InternalMGPL.g:1346:5: (lv_index_3_0= ruleExpr )
                    {
                    // InternalMGPL.g:1346:5: (lv_index_3_0= ruleExpr )
                    // InternalMGPL.g:1347:6: lv_index_3_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getVarAccess().getIndexExprParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_index_3_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarRule());
                    						}
                    						set(
                    							current,
                    							"index",
                    							lv_index_3_0,
                    							"mgpl.MGPL.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getVarAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalMGPL.g:1369:3: ( () otherlv_6= '.' ( (lv_memberName_7_0= RULE_IDF ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMGPL.g:1370:4: () otherlv_6= '.' ( (lv_memberName_7_0= RULE_IDF ) )
                    {
                    // InternalMGPL.g:1370:4: ()
                    // InternalMGPL.g:1371:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getVarAccess().getMemberSelectVariableAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getVarAccess().getFullStopKeyword_2_1());
                    			
                    // InternalMGPL.g:1381:4: ( (lv_memberName_7_0= RULE_IDF ) )
                    // InternalMGPL.g:1382:5: (lv_memberName_7_0= RULE_IDF )
                    {
                    // InternalMGPL.g:1382:5: (lv_memberName_7_0= RULE_IDF )
                    // InternalMGPL.g:1383:6: lv_memberName_7_0= RULE_IDF
                    {
                    lv_memberName_7_0=(Token)match(input,RULE_IDF,FOLLOW_2); 

                    						newLeafNode(lv_memberName_7_0, grammarAccess.getVarAccess().getMemberNameIDFTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"memberName",
                    							lv_memberName_7_0,
                    							"mgpl.MGPL.IDF");
                    					

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
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleExpr"
    // InternalMGPL.g:1404:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalMGPL.g:1404:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalMGPL.g:1405:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalMGPL.g:1411:1: ruleExpr returns [EObject current=null] : this_DisjExpr_0= ruleDisjExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_DisjExpr_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1417:2: (this_DisjExpr_0= ruleDisjExpr )
            // InternalMGPL.g:1418:2: this_DisjExpr_0= ruleDisjExpr
            {

            		newCompositeNode(grammarAccess.getExprAccess().getDisjExprParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_DisjExpr_0=ruleDisjExpr();

            state._fsp--;


            		current = this_DisjExpr_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleDisjExpr"
    // InternalMGPL.g:1429:1: entryRuleDisjExpr returns [EObject current=null] : iv_ruleDisjExpr= ruleDisjExpr EOF ;
    public final EObject entryRuleDisjExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjExpr = null;


        try {
            // InternalMGPL.g:1429:49: (iv_ruleDisjExpr= ruleDisjExpr EOF )
            // InternalMGPL.g:1430:2: iv_ruleDisjExpr= ruleDisjExpr EOF
            {
             newCompositeNode(grammarAccess.getDisjExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisjExpr=ruleDisjExpr();

            state._fsp--;

             current =iv_ruleDisjExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisjExpr"


    // $ANTLR start "ruleDisjExpr"
    // InternalMGPL.g:1436:1: ruleDisjExpr returns [EObject current=null] : (this_ConjExpr_0= ruleConjExpr ( () otherlv_2= '||' ( (lv_right_3_0= ruleConjExpr ) ) )* ) ;
    public final EObject ruleDisjExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConjExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1442:2: ( (this_ConjExpr_0= ruleConjExpr ( () otherlv_2= '||' ( (lv_right_3_0= ruleConjExpr ) ) )* ) )
            // InternalMGPL.g:1443:2: (this_ConjExpr_0= ruleConjExpr ( () otherlv_2= '||' ( (lv_right_3_0= ruleConjExpr ) ) )* )
            {
            // InternalMGPL.g:1443:2: (this_ConjExpr_0= ruleConjExpr ( () otherlv_2= '||' ( (lv_right_3_0= ruleConjExpr ) ) )* )
            // InternalMGPL.g:1444:3: this_ConjExpr_0= ruleConjExpr ( () otherlv_2= '||' ( (lv_right_3_0= ruleConjExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getDisjExprAccess().getConjExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_ConjExpr_0=ruleConjExpr();

            state._fsp--;


            			current = this_ConjExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGPL.g:1452:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleConjExpr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMGPL.g:1453:4: () otherlv_2= '||' ( (lv_right_3_0= ruleConjExpr ) )
            	    {
            	    // InternalMGPL.g:1453:4: ()
            	    // InternalMGPL.g:1454:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDisjExprAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDisjExprAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalMGPL.g:1464:4: ( (lv_right_3_0= ruleConjExpr ) )
            	    // InternalMGPL.g:1465:5: (lv_right_3_0= ruleConjExpr )
            	    {
            	    // InternalMGPL.g:1465:5: (lv_right_3_0= ruleConjExpr )
            	    // InternalMGPL.g:1466:6: lv_right_3_0= ruleConjExpr
            	    {

            	    						newCompositeNode(grammarAccess.getDisjExprAccess().getRightConjExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleConjExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDisjExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"mgpl.MGPL.ConjExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjExpr"


    // $ANTLR start "entryRuleConjExpr"
    // InternalMGPL.g:1488:1: entryRuleConjExpr returns [EObject current=null] : iv_ruleConjExpr= ruleConjExpr EOF ;
    public final EObject entryRuleConjExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjExpr = null;


        try {
            // InternalMGPL.g:1488:49: (iv_ruleConjExpr= ruleConjExpr EOF )
            // InternalMGPL.g:1489:2: iv_ruleConjExpr= ruleConjExpr EOF
            {
             newCompositeNode(grammarAccess.getConjExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjExpr=ruleConjExpr();

            state._fsp--;

             current =iv_ruleConjExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjExpr"


    // $ANTLR start "ruleConjExpr"
    // InternalMGPL.g:1495:1: ruleConjExpr returns [EObject current=null] : (this_RelExpr_0= ruleRelExpr ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRelExpr ) ) )* ) ;
    public final EObject ruleConjExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_RelExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1501:2: ( (this_RelExpr_0= ruleRelExpr ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRelExpr ) ) )* ) )
            // InternalMGPL.g:1502:2: (this_RelExpr_0= ruleRelExpr ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRelExpr ) ) )* )
            {
            // InternalMGPL.g:1502:2: (this_RelExpr_0= ruleRelExpr ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRelExpr ) ) )* )
            // InternalMGPL.g:1503:3: this_RelExpr_0= ruleRelExpr ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRelExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getConjExprAccess().getRelExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_RelExpr_0=ruleRelExpr();

            state._fsp--;


            			current = this_RelExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGPL.g:1511:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleRelExpr ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMGPL.g:1512:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleRelExpr ) )
            	    {
            	    // InternalMGPL.g:1512:4: ()
            	    // InternalMGPL.g:1513:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConjExprAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConjExprAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalMGPL.g:1523:4: ( (lv_right_3_0= ruleRelExpr ) )
            	    // InternalMGPL.g:1524:5: (lv_right_3_0= ruleRelExpr )
            	    {
            	    // InternalMGPL.g:1524:5: (lv_right_3_0= ruleRelExpr )
            	    // InternalMGPL.g:1525:6: lv_right_3_0= ruleRelExpr
            	    {

            	    						newCompositeNode(grammarAccess.getConjExprAccess().getRightRelExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleRelExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConjExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"mgpl.MGPL.RelExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjExpr"


    // $ANTLR start "entryRuleRelExpr"
    // InternalMGPL.g:1547:1: entryRuleRelExpr returns [EObject current=null] : iv_ruleRelExpr= ruleRelExpr EOF ;
    public final EObject entryRuleRelExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelExpr = null;


        try {
            // InternalMGPL.g:1547:48: (iv_ruleRelExpr= ruleRelExpr EOF )
            // InternalMGPL.g:1548:2: iv_ruleRelExpr= ruleRelExpr EOF
            {
             newCompositeNode(grammarAccess.getRelExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelExpr=ruleRelExpr();

            state._fsp--;

             current =iv_ruleRelExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelExpr"


    // $ANTLR start "ruleRelExpr"
    // InternalMGPL.g:1554:1: ruleRelExpr returns [EObject current=null] : (this_AddExpr_0= ruleAddExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '<=' ) ) ( (lv_right_7_0= ruleAddExpr ) ) )* ) ;
    public final EObject ruleRelExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_AddExpr_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1560:2: ( (this_AddExpr_0= ruleAddExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '<=' ) ) ( (lv_right_7_0= ruleAddExpr ) ) )* ) )
            // InternalMGPL.g:1561:2: (this_AddExpr_0= ruleAddExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '<=' ) ) ( (lv_right_7_0= ruleAddExpr ) ) )* )
            {
            // InternalMGPL.g:1561:2: (this_AddExpr_0= ruleAddExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '<=' ) ) ( (lv_right_7_0= ruleAddExpr ) ) )* )
            // InternalMGPL.g:1562:3: this_AddExpr_0= ruleAddExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '<=' ) ) ( (lv_right_7_0= ruleAddExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_AddExpr_0=ruleAddExpr();

            state._fsp--;


            			current = this_AddExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGPL.g:1570:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '<=' ) ) ( (lv_right_7_0= ruleAddExpr ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=36 && LA22_0<=38)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMGPL.g:1571:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '<=' ) ) ( (lv_right_7_0= ruleAddExpr ) )
            	    {
            	    // InternalMGPL.g:1571:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '<=' ) )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // InternalMGPL.g:1572:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalMGPL.g:1572:5: ( () otherlv_2= '==' )
            	            // InternalMGPL.g:1573:6: () otherlv_2= '=='
            	            {
            	            // InternalMGPL.g:1573:6: ()
            	            // InternalMGPL.g:1574:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getRelExprAccess().getEqualsLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,36,FOLLOW_13); 

            	            						newLeafNode(otherlv_2, grammarAccess.getRelExprAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMGPL.g:1586:5: ( () otherlv_4= '<' )
            	            {
            	            // InternalMGPL.g:1586:5: ( () otherlv_4= '<' )
            	            // InternalMGPL.g:1587:6: () otherlv_4= '<'
            	            {
            	            // InternalMGPL.g:1587:6: ()
            	            // InternalMGPL.g:1588:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getRelExprAccess().getLessLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,37,FOLLOW_13); 

            	            						newLeafNode(otherlv_4, grammarAccess.getRelExprAccess().getLessThanSignKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMGPL.g:1600:5: ( () otherlv_6= '<=' )
            	            {
            	            // InternalMGPL.g:1600:5: ( () otherlv_6= '<=' )
            	            // InternalMGPL.g:1601:6: () otherlv_6= '<='
            	            {
            	            // InternalMGPL.g:1601:6: ()
            	            // InternalMGPL.g:1602:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getRelExprAccess().getLessOrEqualsLeftAction_1_0_2_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_6=(Token)match(input,38,FOLLOW_13); 

            	            						newLeafNode(otherlv_6, grammarAccess.getRelExprAccess().getLessThanSignEqualsSignKeyword_1_0_2_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMGPL.g:1614:4: ( (lv_right_7_0= ruleAddExpr ) )
            	    // InternalMGPL.g:1615:5: (lv_right_7_0= ruleAddExpr )
            	    {
            	    // InternalMGPL.g:1615:5: (lv_right_7_0= ruleAddExpr )
            	    // InternalMGPL.g:1616:6: lv_right_7_0= ruleAddExpr
            	    {

            	    						newCompositeNode(grammarAccess.getRelExprAccess().getRightAddExprParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_7_0=ruleAddExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_7_0,
            	    							"mgpl.MGPL.AddExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelExpr"


    // $ANTLR start "entryRuleAddExpr"
    // InternalMGPL.g:1638:1: entryRuleAddExpr returns [EObject current=null] : iv_ruleAddExpr= ruleAddExpr EOF ;
    public final EObject entryRuleAddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpr = null;


        try {
            // InternalMGPL.g:1638:48: (iv_ruleAddExpr= ruleAddExpr EOF )
            // InternalMGPL.g:1639:2: iv_ruleAddExpr= ruleAddExpr EOF
            {
             newCompositeNode(grammarAccess.getAddExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddExpr=ruleAddExpr();

            state._fsp--;

             current =iv_ruleAddExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpr"


    // $ANTLR start "ruleAddExpr"
    // InternalMGPL.g:1645:1: ruleAddExpr returns [EObject current=null] : (this_MultExpr_0= ruleMultExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpr ) ) )* ) ;
    public final EObject ruleAddExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultExpr_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1651:2: ( (this_MultExpr_0= ruleMultExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpr ) ) )* ) )
            // InternalMGPL.g:1652:2: (this_MultExpr_0= ruleMultExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpr ) ) )* )
            {
            // InternalMGPL.g:1652:2: (this_MultExpr_0= ruleMultExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpr ) ) )* )
            // InternalMGPL.g:1653:3: this_MultExpr_0= ruleMultExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddExprAccess().getMultExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_MultExpr_0=ruleMultExpr();

            state._fsp--;


            			current = this_MultExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGPL.g:1661:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpr ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=39 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMGPL.g:1662:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpr ) )
            	    {
            	    // InternalMGPL.g:1662:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==39) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==40) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalMGPL.g:1663:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMGPL.g:1663:5: ( () otherlv_2= '+' )
            	            // InternalMGPL.g:1664:6: () otherlv_2= '+'
            	            {
            	            // InternalMGPL.g:1664:6: ()
            	            // InternalMGPL.g:1665:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAddExprAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,39,FOLLOW_13); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAddExprAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMGPL.g:1677:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMGPL.g:1677:5: ( () otherlv_4= '-' )
            	            // InternalMGPL.g:1678:6: () otherlv_4= '-'
            	            {
            	            // InternalMGPL.g:1678:6: ()
            	            // InternalMGPL.g:1679:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAddExprAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,40,FOLLOW_13); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAddExprAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMGPL.g:1691:4: ( (lv_right_5_0= ruleMultExpr ) )
            	    // InternalMGPL.g:1692:5: (lv_right_5_0= ruleMultExpr )
            	    {
            	    // InternalMGPL.g:1692:5: (lv_right_5_0= ruleMultExpr )
            	    // InternalMGPL.g:1693:6: lv_right_5_0= ruleMultExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAddExprAccess().getRightMultExprParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_5_0=ruleMultExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"mgpl.MGPL.MultExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpr"


    // $ANTLR start "entryRuleMultExpr"
    // InternalMGPL.g:1715:1: entryRuleMultExpr returns [EObject current=null] : iv_ruleMultExpr= ruleMultExpr EOF ;
    public final EObject entryRuleMultExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpr = null;


        try {
            // InternalMGPL.g:1715:49: (iv_ruleMultExpr= ruleMultExpr EOF )
            // InternalMGPL.g:1716:2: iv_ruleMultExpr= ruleMultExpr EOF
            {
             newCompositeNode(grammarAccess.getMultExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultExpr=ruleMultExpr();

            state._fsp--;

             current =iv_ruleMultExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpr"


    // $ANTLR start "ruleMultExpr"
    // InternalMGPL.g:1722:1: ruleMultExpr returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '/' ) | ( () otherlv_4= '*' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject ruleMultExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UnaryExpr_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1728:2: ( (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '/' ) | ( () otherlv_4= '*' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* ) )
            // InternalMGPL.g:1729:2: (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '/' ) | ( () otherlv_4= '*' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* )
            {
            // InternalMGPL.g:1729:2: (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '/' ) | ( () otherlv_4= '*' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* )
            // InternalMGPL.g:1730:3: this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '/' ) | ( () otherlv_4= '*' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultExprAccess().getUnaryExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;


            			current = this_UnaryExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGPL.g:1738:3: ( ( ( () otherlv_2= '/' ) | ( () otherlv_4= '*' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=41 && LA26_0<=42)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMGPL.g:1739:4: ( ( () otherlv_2= '/' ) | ( () otherlv_4= '*' ) ) ( (lv_right_5_0= ruleUnaryExpr ) )
            	    {
            	    // InternalMGPL.g:1739:4: ( ( () otherlv_2= '/' ) | ( () otherlv_4= '*' ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==41) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==42) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalMGPL.g:1740:5: ( () otherlv_2= '/' )
            	            {
            	            // InternalMGPL.g:1740:5: ( () otherlv_2= '/' )
            	            // InternalMGPL.g:1741:6: () otherlv_2= '/'
            	            {
            	            // InternalMGPL.g:1741:6: ()
            	            // InternalMGPL.g:1742:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultExprAccess().getDivideLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,41,FOLLOW_13); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMultExprAccess().getSolidusKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMGPL.g:1754:5: ( () otherlv_4= '*' )
            	            {
            	            // InternalMGPL.g:1754:5: ( () otherlv_4= '*' )
            	            // InternalMGPL.g:1755:6: () otherlv_4= '*'
            	            {
            	            // InternalMGPL.g:1755:6: ()
            	            // InternalMGPL.g:1756:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultExprAccess().getTimesLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,42,FOLLOW_13); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMultExprAccess().getAsteriskKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMGPL.g:1768:4: ( (lv_right_5_0= ruleUnaryExpr ) )
            	    // InternalMGPL.g:1769:5: (lv_right_5_0= ruleUnaryExpr )
            	    {
            	    // InternalMGPL.g:1769:5: (lv_right_5_0= ruleUnaryExpr )
            	    // InternalMGPL.g:1770:6: lv_right_5_0= ruleUnaryExpr
            	    {

            	    						newCompositeNode(grammarAccess.getMultExprAccess().getRightUnaryExprParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_5_0=ruleUnaryExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"mgpl.MGPL.UnaryExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalMGPL.g:1792:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // InternalMGPL.g:1792:50: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalMGPL.g:1793:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalMGPL.g:1799:1: ruleUnaryExpr returns [EObject current=null] : ( ( ( ( () otherlv_1= '-' ) | ( () otherlv_3= '!' ) ) ( (lv_expr_4_0= ruleUnaryExpr ) ) ) | this_PrimExpr_5= rulePrimExpr ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_4_0 = null;

        EObject this_PrimExpr_5 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1805:2: ( ( ( ( ( () otherlv_1= '-' ) | ( () otherlv_3= '!' ) ) ( (lv_expr_4_0= ruleUnaryExpr ) ) ) | this_PrimExpr_5= rulePrimExpr ) )
            // InternalMGPL.g:1806:2: ( ( ( ( () otherlv_1= '-' ) | ( () otherlv_3= '!' ) ) ( (lv_expr_4_0= ruleUnaryExpr ) ) ) | this_PrimExpr_5= rulePrimExpr )
            {
            // InternalMGPL.g:1806:2: ( ( ( ( () otherlv_1= '-' ) | ( () otherlv_3= '!' ) ) ( (lv_expr_4_0= ruleUnaryExpr ) ) ) | this_PrimExpr_5= rulePrimExpr )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40||LA28_0==43) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_IDF && LA28_0<=RULE_NUMBER)||LA28_0==10) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMGPL.g:1807:3: ( ( ( () otherlv_1= '-' ) | ( () otherlv_3= '!' ) ) ( (lv_expr_4_0= ruleUnaryExpr ) ) )
                    {
                    // InternalMGPL.g:1807:3: ( ( ( () otherlv_1= '-' ) | ( () otherlv_3= '!' ) ) ( (lv_expr_4_0= ruleUnaryExpr ) ) )
                    // InternalMGPL.g:1808:4: ( ( () otherlv_1= '-' ) | ( () otherlv_3= '!' ) ) ( (lv_expr_4_0= ruleUnaryExpr ) )
                    {
                    // InternalMGPL.g:1808:4: ( ( () otherlv_1= '-' ) | ( () otherlv_3= '!' ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==40) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==43) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalMGPL.g:1809:5: ( () otherlv_1= '-' )
                            {
                            // InternalMGPL.g:1809:5: ( () otherlv_1= '-' )
                            // InternalMGPL.g:1810:6: () otherlv_1= '-'
                            {
                            // InternalMGPL.g:1810:6: ()
                            // InternalMGPL.g:1811:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getUnaryExprAccess().getNegationAction_0_0_0_0(),
                            								current);
                            						

                            }

                            otherlv_1=(Token)match(input,40,FOLLOW_13); 

                            						newLeafNode(otherlv_1, grammarAccess.getUnaryExprAccess().getHyphenMinusKeyword_0_0_0_1());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalMGPL.g:1823:5: ( () otherlv_3= '!' )
                            {
                            // InternalMGPL.g:1823:5: ( () otherlv_3= '!' )
                            // InternalMGPL.g:1824:6: () otherlv_3= '!'
                            {
                            // InternalMGPL.g:1824:6: ()
                            // InternalMGPL.g:1825:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getUnaryExprAccess().getComplementAction_0_0_1_0(),
                            								current);
                            						

                            }

                            otherlv_3=(Token)match(input,43,FOLLOW_13); 

                            						newLeafNode(otherlv_3, grammarAccess.getUnaryExprAccess().getExclamationMarkKeyword_0_0_1_1());
                            					

                            }


                            }
                            break;

                    }

                    // InternalMGPL.g:1837:4: ( (lv_expr_4_0= ruleUnaryExpr ) )
                    // InternalMGPL.g:1838:5: (lv_expr_4_0= ruleUnaryExpr )
                    {
                    // InternalMGPL.g:1838:5: (lv_expr_4_0= ruleUnaryExpr )
                    // InternalMGPL.g:1839:6: lv_expr_4_0= ruleUnaryExpr
                    {

                    						newCompositeNode(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_4_0=ruleUnaryExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExprRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_4_0,
                    							"mgpl.MGPL.UnaryExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1858:3: this_PrimExpr_5= rulePrimExpr
                    {

                    			newCompositeNode(grammarAccess.getUnaryExprAccess().getPrimExprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimExpr_5=rulePrimExpr();

                    state._fsp--;


                    			current = this_PrimExpr_5;
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
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRulePrimExpr"
    // InternalMGPL.g:1870:1: entryRulePrimExpr returns [EObject current=null] : iv_rulePrimExpr= rulePrimExpr EOF ;
    public final EObject entryRulePrimExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimExpr = null;


        try {
            // InternalMGPL.g:1870:49: (iv_rulePrimExpr= rulePrimExpr EOF )
            // InternalMGPL.g:1871:2: iv_rulePrimExpr= rulePrimExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimExprRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimExpr=rulePrimExpr();

            state._fsp--;

             current =iv_rulePrimExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimExpr"


    // $ANTLR start "rulePrimExpr"
    // InternalMGPL.g:1877:1: rulePrimExpr returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | (this_Var_2= ruleVar ( () otherlv_4= 'touches' ( (lv_right_5_0= ruleVar ) ) )? ) | (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' ) ) ;
    public final EObject rulePrimExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_Var_2 = null;

        EObject lv_right_5_0 = null;

        EObject this_Expr_7 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1883:2: ( ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | (this_Var_2= ruleVar ( () otherlv_4= 'touches' ( (lv_right_5_0= ruleVar ) ) )? ) | (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' ) ) )
            // InternalMGPL.g:1884:2: ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | (this_Var_2= ruleVar ( () otherlv_4= 'touches' ( (lv_right_5_0= ruleVar ) ) )? ) | (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' ) )
            {
            // InternalMGPL.g:1884:2: ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | (this_Var_2= ruleVar ( () otherlv_4= 'touches' ( (lv_right_5_0= ruleVar ) ) )? ) | (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt30=1;
                }
                break;
            case RULE_IDF:
                {
                alt30=2;
                }
                break;
            case 10:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMGPL.g:1885:3: ( () ( (lv_value_1_0= RULE_NUMBER ) ) )
                    {
                    // InternalMGPL.g:1885:3: ( () ( (lv_value_1_0= RULE_NUMBER ) ) )
                    // InternalMGPL.g:1886:4: () ( (lv_value_1_0= RULE_NUMBER ) )
                    {
                    // InternalMGPL.g:1886:4: ()
                    // InternalMGPL.g:1887:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimExprAccess().getNumberLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMGPL.g:1893:4: ( (lv_value_1_0= RULE_NUMBER ) )
                    // InternalMGPL.g:1894:5: (lv_value_1_0= RULE_NUMBER )
                    {
                    // InternalMGPL.g:1894:5: (lv_value_1_0= RULE_NUMBER )
                    // InternalMGPL.g:1895:6: lv_value_1_0= RULE_NUMBER
                    {
                    lv_value_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimExprAccess().getValueNUMBERTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimExprRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"mgpl.MGPL.NUMBER");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1913:3: (this_Var_2= ruleVar ( () otherlv_4= 'touches' ( (lv_right_5_0= ruleVar ) ) )? )
                    {
                    // InternalMGPL.g:1913:3: (this_Var_2= ruleVar ( () otherlv_4= 'touches' ( (lv_right_5_0= ruleVar ) ) )? )
                    // InternalMGPL.g:1914:4: this_Var_2= ruleVar ( () otherlv_4= 'touches' ( (lv_right_5_0= ruleVar ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getPrimExprAccess().getVarParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_29);
                    this_Var_2=ruleVar();

                    state._fsp--;


                    				current = this_Var_2;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMGPL.g:1922:4: ( () otherlv_4= 'touches' ( (lv_right_5_0= ruleVar ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==44) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMGPL.g:1923:5: () otherlv_4= 'touches' ( (lv_right_5_0= ruleVar ) )
                            {
                            // InternalMGPL.g:1923:5: ()
                            // InternalMGPL.g:1924:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getPrimExprAccess().getTouchesLeftAction_1_1_0(),
                            							current);
                            					

                            }

                            otherlv_4=(Token)match(input,44,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getPrimExprAccess().getTouchesKeyword_1_1_1());
                            				
                            // InternalMGPL.g:1934:5: ( (lv_right_5_0= ruleVar ) )
                            // InternalMGPL.g:1935:6: (lv_right_5_0= ruleVar )
                            {
                            // InternalMGPL.g:1935:6: (lv_right_5_0= ruleVar )
                            // InternalMGPL.g:1936:7: lv_right_5_0= ruleVar
                            {

                            							newCompositeNode(grammarAccess.getPrimExprAccess().getRightVarParserRuleCall_1_1_2_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_right_5_0=ruleVar();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPrimExprRule());
                            							}
                            							set(
                            								current,
                            								"right",
                            								lv_right_5_0,
                            								"mgpl.MGPL.Var");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:1956:3: (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' )
                    {
                    // InternalMGPL.g:1956:3: (otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')' )
                    // InternalMGPL.g:1957:4: otherlv_6= '(' this_Expr_7= ruleExpr otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,10,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimExprAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimExprAccess().getExprParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_Expr_7=ruleExpr();

                    state._fsp--;


                    				current = this_Expr_7;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrimExprAccess().getRightParenthesisKeyword_2_2());
                    			

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
        }
        return current;
    }
    // $ANTLR end "rulePrimExpr"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000101C4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000090000000430L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000001C4000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000160000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000140000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200008002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000002L});

}