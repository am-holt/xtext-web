package org.eclipse.xtext.peweb.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.peweb.services.EditorLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEditorLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CODENOTAG", "RULE_CODESTART", "RULE_CODEMID", "RULE_CODEEND", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'Node'", "'{'", "'}'", "'Projection'", "'view:'", "'@'", "'%'", "':'", "'get:'", "'set:'", "'validate:'", "'!'", "'$'", "'Component'"
    };
    public static final int RULE_CODESTART=6;
    public static final int RULE_CODEMID=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_CODENOTAG=5;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_CODEEND=8;

    // delegates
    // delegators


        public InternalEditorLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEditorLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEditorLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEditorLanguage.g"; }



     	private EditorLanguageGrammarAccess grammarAccess;

        public InternalEditorLanguageParser(TokenStream input, EditorLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EditorDefinitionFile";
       	}

       	@Override
       	protected EditorLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEditorDefinitionFile"
    // InternalEditorLanguage.g:64:1: entryRuleEditorDefinitionFile returns [EObject current=null] : iv_ruleEditorDefinitionFile= ruleEditorDefinitionFile EOF ;
    public final EObject entryRuleEditorDefinitionFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditorDefinitionFile = null;


        try {
            // InternalEditorLanguage.g:64:61: (iv_ruleEditorDefinitionFile= ruleEditorDefinitionFile EOF )
            // InternalEditorLanguage.g:65:2: iv_ruleEditorDefinitionFile= ruleEditorDefinitionFile EOF
            {
             newCompositeNode(grammarAccess.getEditorDefinitionFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEditorDefinitionFile=ruleEditorDefinitionFile();

            state._fsp--;

             current =iv_ruleEditorDefinitionFile; 
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
    // $ANTLR end "entryRuleEditorDefinitionFile"


    // $ANTLR start "ruleEditorDefinitionFile"
    // InternalEditorLanguage.g:71:1: ruleEditorDefinitionFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportSection ) )? ( (lv_mainSection_1_0= ruleMainSection ) ) ) ;
    public final EObject ruleEditorDefinitionFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_mainSection_1_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:77:2: ( ( ( (lv_imports_0_0= ruleImportSection ) )? ( (lv_mainSection_1_0= ruleMainSection ) ) ) )
            // InternalEditorLanguage.g:78:2: ( ( (lv_imports_0_0= ruleImportSection ) )? ( (lv_mainSection_1_0= ruleMainSection ) ) )
            {
            // InternalEditorLanguage.g:78:2: ( ( (lv_imports_0_0= ruleImportSection ) )? ( (lv_mainSection_1_0= ruleMainSection ) ) )
            // InternalEditorLanguage.g:79:3: ( (lv_imports_0_0= ruleImportSection ) )? ( (lv_mainSection_1_0= ruleMainSection ) )
            {
            // InternalEditorLanguage.g:79:3: ( (lv_imports_0_0= ruleImportSection ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEditorLanguage.g:80:4: (lv_imports_0_0= ruleImportSection )
                    {
                    // InternalEditorLanguage.g:80:4: (lv_imports_0_0= ruleImportSection )
                    // InternalEditorLanguage.g:81:5: lv_imports_0_0= ruleImportSection
                    {

                    					newCompositeNode(grammarAccess.getEditorDefinitionFileAccess().getImportsImportSectionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_imports_0_0=ruleImportSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEditorDefinitionFileRule());
                    					}
                    					set(
                    						current,
                    						"imports",
                    						lv_imports_0_0,
                    						"org.eclipse.xtext.peweb.EditorLanguage.ImportSection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEditorLanguage.g:98:3: ( (lv_mainSection_1_0= ruleMainSection ) )
            // InternalEditorLanguage.g:99:4: (lv_mainSection_1_0= ruleMainSection )
            {
            // InternalEditorLanguage.g:99:4: (lv_mainSection_1_0= ruleMainSection )
            // InternalEditorLanguage.g:100:5: lv_mainSection_1_0= ruleMainSection
            {

            					newCompositeNode(grammarAccess.getEditorDefinitionFileAccess().getMainSectionMainSectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_mainSection_1_0=ruleMainSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEditorDefinitionFileRule());
            					}
            					set(
            						current,
            						"mainSection",
            						lv_mainSection_1_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.MainSection");
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
    // $ANTLR end "ruleEditorDefinitionFile"


    // $ANTLR start "entryRuleImportSection"
    // InternalEditorLanguage.g:121:1: entryRuleImportSection returns [EObject current=null] : iv_ruleImportSection= ruleImportSection EOF ;
    public final EObject entryRuleImportSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportSection = null;


        try {
            // InternalEditorLanguage.g:121:54: (iv_ruleImportSection= ruleImportSection EOF )
            // InternalEditorLanguage.g:122:2: iv_ruleImportSection= ruleImportSection EOF
            {
             newCompositeNode(grammarAccess.getImportSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportSection=ruleImportSection();

            state._fsp--;

             current =iv_ruleImportSection; 
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
    // $ANTLR end "entryRuleImportSection"


    // $ANTLR start "ruleImportSection"
    // InternalEditorLanguage.g:128:1: ruleImportSection returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )+ ) ;
    public final EObject ruleImportSection() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:134:2: ( ( () ( (lv_imports_1_0= ruleImport ) )+ ) )
            // InternalEditorLanguage.g:135:2: ( () ( (lv_imports_1_0= ruleImport ) )+ )
            {
            // InternalEditorLanguage.g:135:2: ( () ( (lv_imports_1_0= ruleImport ) )+ )
            // InternalEditorLanguage.g:136:3: () ( (lv_imports_1_0= ruleImport ) )+
            {
            // InternalEditorLanguage.g:136:3: ()
            // InternalEditorLanguage.g:137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportSectionAccess().getImportSectionAction_0(),
            					current);
            			

            }

            // InternalEditorLanguage.g:143:3: ( (lv_imports_1_0= ruleImport ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEditorLanguage.g:144:4: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalEditorLanguage.g:144:4: (lv_imports_1_0= ruleImport )
            	    // InternalEditorLanguage.g:145:5: lv_imports_1_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getImportSectionAccess().getImportsImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImportSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"org.eclipse.xtext.peweb.EditorLanguage.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleImportSection"


    // $ANTLR start "entryRuleImport"
    // InternalEditorLanguage.g:166:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEditorLanguage.g:166:47: (iv_ruleImport= ruleImport EOF )
            // InternalEditorLanguage.g:167:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEditorLanguage.g:173:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:179:2: ( (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalEditorLanguage.g:180:2: (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalEditorLanguage.g:180:2: (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalEditorLanguage.g:181:3: otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalEditorLanguage.g:185:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalEditorLanguage.g:186:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalEditorLanguage.g:186:4: (lv_name_1_0= ruleQualifiedName )
            // InternalEditorLanguage.g:187:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getImportAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.QualifiedName");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEditorLanguage.g:208:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEditorLanguage.g:208:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEditorLanguage.g:209:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalEditorLanguage.g:215:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEditorLanguage.g:221:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEditorLanguage.g:222:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEditorLanguage.g:222:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEditorLanguage.g:223:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalEditorLanguage.g:230:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEditorLanguage.g:231:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleMainSection"
    // InternalEditorLanguage.g:248:1: entryRuleMainSection returns [EObject current=null] : iv_ruleMainSection= ruleMainSection EOF ;
    public final EObject entryRuleMainSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainSection = null;


        try {
            // InternalEditorLanguage.g:248:52: (iv_ruleMainSection= ruleMainSection EOF )
            // InternalEditorLanguage.g:249:2: iv_ruleMainSection= ruleMainSection EOF
            {
             newCompositeNode(grammarAccess.getMainSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainSection=ruleMainSection();

            state._fsp--;

             current =iv_ruleMainSection; 
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
    // $ANTLR end "entryRuleMainSection"


    // $ANTLR start "ruleMainSection"
    // InternalEditorLanguage.g:255:1: ruleMainSection returns [EObject current=null] : ( () ( ( (lv_nodes_1_0= ruleNodeDeclaration ) ) | ( (lv_components_2_0= ruleComponentDeclaration ) ) )* ) ;
    public final EObject ruleMainSection() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_1_0 = null;

        EObject lv_components_2_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:261:2: ( ( () ( ( (lv_nodes_1_0= ruleNodeDeclaration ) ) | ( (lv_components_2_0= ruleComponentDeclaration ) ) )* ) )
            // InternalEditorLanguage.g:262:2: ( () ( ( (lv_nodes_1_0= ruleNodeDeclaration ) ) | ( (lv_components_2_0= ruleComponentDeclaration ) ) )* )
            {
            // InternalEditorLanguage.g:262:2: ( () ( ( (lv_nodes_1_0= ruleNodeDeclaration ) ) | ( (lv_components_2_0= ruleComponentDeclaration ) ) )* )
            // InternalEditorLanguage.g:263:3: () ( ( (lv_nodes_1_0= ruleNodeDeclaration ) ) | ( (lv_components_2_0= ruleComponentDeclaration ) ) )*
            {
            // InternalEditorLanguage.g:263:3: ()
            // InternalEditorLanguage.g:264:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainSectionAccess().getMainSectionAction_0(),
            					current);
            			

            }

            // InternalEditorLanguage.g:270:3: ( ( (lv_nodes_1_0= ruleNodeDeclaration ) ) | ( (lv_components_2_0= ruleComponentDeclaration ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }
                else if ( (LA4_0==29) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEditorLanguage.g:271:4: ( (lv_nodes_1_0= ruleNodeDeclaration ) )
            	    {
            	    // InternalEditorLanguage.g:271:4: ( (lv_nodes_1_0= ruleNodeDeclaration ) )
            	    // InternalEditorLanguage.g:272:5: (lv_nodes_1_0= ruleNodeDeclaration )
            	    {
            	    // InternalEditorLanguage.g:272:5: (lv_nodes_1_0= ruleNodeDeclaration )
            	    // InternalEditorLanguage.g:273:6: lv_nodes_1_0= ruleNodeDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getMainSectionAccess().getNodesNodeDeclarationParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_nodes_1_0=ruleNodeDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nodes",
            	    							lv_nodes_1_0,
            	    							"org.eclipse.xtext.peweb.EditorLanguage.NodeDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEditorLanguage.g:291:4: ( (lv_components_2_0= ruleComponentDeclaration ) )
            	    {
            	    // InternalEditorLanguage.g:291:4: ( (lv_components_2_0= ruleComponentDeclaration ) )
            	    // InternalEditorLanguage.g:292:5: (lv_components_2_0= ruleComponentDeclaration )
            	    {
            	    // InternalEditorLanguage.g:292:5: (lv_components_2_0= ruleComponentDeclaration )
            	    // InternalEditorLanguage.g:293:6: lv_components_2_0= ruleComponentDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getMainSectionAccess().getComponentsComponentDeclarationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_components_2_0=ruleComponentDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_2_0,
            	    							"org.eclipse.xtext.peweb.EditorLanguage.ComponentDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleMainSection"


    // $ANTLR start "entryRuleNodeDeclaration"
    // InternalEditorLanguage.g:315:1: entryRuleNodeDeclaration returns [EObject current=null] : iv_ruleNodeDeclaration= ruleNodeDeclaration EOF ;
    public final EObject entryRuleNodeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDeclaration = null;


        try {
            // InternalEditorLanguage.g:315:56: (iv_ruleNodeDeclaration= ruleNodeDeclaration EOF )
            // InternalEditorLanguage.g:316:2: iv_ruleNodeDeclaration= ruleNodeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNodeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeDeclaration=ruleNodeDeclaration();

            state._fsp--;

             current =iv_ruleNodeDeclaration; 
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
    // $ANTLR end "entryRuleNodeDeclaration"


    // $ANTLR start "ruleNodeDeclaration"
    // InternalEditorLanguage.g:322:1: ruleNodeDeclaration returns [EObject current=null] : (otherlv_0= 'Node' ( (lv_nodeName_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_projections_3_0= ruleProjectionDeclaration ) ) | ( (lv_components_4_0= ruleComponentDeclaration ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleNodeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nodeName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_projections_3_0 = null;

        EObject lv_components_4_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:328:2: ( (otherlv_0= 'Node' ( (lv_nodeName_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_projections_3_0= ruleProjectionDeclaration ) ) | ( (lv_components_4_0= ruleComponentDeclaration ) ) )* otherlv_5= '}' ) )
            // InternalEditorLanguage.g:329:2: (otherlv_0= 'Node' ( (lv_nodeName_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_projections_3_0= ruleProjectionDeclaration ) ) | ( (lv_components_4_0= ruleComponentDeclaration ) ) )* otherlv_5= '}' )
            {
            // InternalEditorLanguage.g:329:2: (otherlv_0= 'Node' ( (lv_nodeName_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_projections_3_0= ruleProjectionDeclaration ) ) | ( (lv_components_4_0= ruleComponentDeclaration ) ) )* otherlv_5= '}' )
            // InternalEditorLanguage.g:330:3: otherlv_0= 'Node' ( (lv_nodeName_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_projections_3_0= ruleProjectionDeclaration ) ) | ( (lv_components_4_0= ruleComponentDeclaration ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeDeclarationAccess().getNodeKeyword_0());
            		
            // InternalEditorLanguage.g:334:3: ( (lv_nodeName_1_0= RULE_ID ) )
            // InternalEditorLanguage.g:335:4: (lv_nodeName_1_0= RULE_ID )
            {
            // InternalEditorLanguage.g:335:4: (lv_nodeName_1_0= RULE_ID )
            // InternalEditorLanguage.g:336:5: lv_nodeName_1_0= RULE_ID
            {
            lv_nodeName_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_nodeName_1_0, grammarAccess.getNodeDeclarationAccess().getNodeNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nodeName",
            						lv_nodeName_1_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEditorLanguage.g:356:3: ( ( (lv_projections_3_0= ruleProjectionDeclaration ) ) | ( (lv_components_4_0= ruleComponentDeclaration ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }
                else if ( (LA5_0==29) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEditorLanguage.g:357:4: ( (lv_projections_3_0= ruleProjectionDeclaration ) )
            	    {
            	    // InternalEditorLanguage.g:357:4: ( (lv_projections_3_0= ruleProjectionDeclaration ) )
            	    // InternalEditorLanguage.g:358:5: (lv_projections_3_0= ruleProjectionDeclaration )
            	    {
            	    // InternalEditorLanguage.g:358:5: (lv_projections_3_0= ruleProjectionDeclaration )
            	    // InternalEditorLanguage.g:359:6: lv_projections_3_0= ruleProjectionDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getNodeDeclarationAccess().getProjectionsProjectionDeclarationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_projections_3_0=ruleProjectionDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"projections",
            	    							lv_projections_3_0,
            	    							"org.eclipse.xtext.peweb.EditorLanguage.ProjectionDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEditorLanguage.g:377:4: ( (lv_components_4_0= ruleComponentDeclaration ) )
            	    {
            	    // InternalEditorLanguage.g:377:4: ( (lv_components_4_0= ruleComponentDeclaration ) )
            	    // InternalEditorLanguage.g:378:5: (lv_components_4_0= ruleComponentDeclaration )
            	    {
            	    // InternalEditorLanguage.g:378:5: (lv_components_4_0= ruleComponentDeclaration )
            	    // InternalEditorLanguage.g:379:6: lv_components_4_0= ruleComponentDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getNodeDeclarationAccess().getComponentsComponentDeclarationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_components_4_0=ruleComponentDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNodeDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_4_0,
            	    							"org.eclipse.xtext.peweb.EditorLanguage.ComponentDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNodeDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNodeDeclaration"


    // $ANTLR start "entryRuleProjectionDeclaration"
    // InternalEditorLanguage.g:405:1: entryRuleProjectionDeclaration returns [EObject current=null] : iv_ruleProjectionDeclaration= ruleProjectionDeclaration EOF ;
    public final EObject entryRuleProjectionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectionDeclaration = null;


        try {
            // InternalEditorLanguage.g:405:62: (iv_ruleProjectionDeclaration= ruleProjectionDeclaration EOF )
            // InternalEditorLanguage.g:406:2: iv_ruleProjectionDeclaration= ruleProjectionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProjectionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectionDeclaration=ruleProjectionDeclaration();

            state._fsp--;

             current =iv_ruleProjectionDeclaration; 
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
    // $ANTLR end "entryRuleProjectionDeclaration"


    // $ANTLR start "ruleProjectionDeclaration"
    // InternalEditorLanguage.g:412:1: ruleProjectionDeclaration returns [EObject current=null] : (otherlv_0= 'Projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'view:' ( (lv_view_4_0= ruleHtmlSnippet ) ) ( ( (lv_attributes_5_0= ruleAttributeDeclaration ) ) | ( (lv_components_6_0= ruleComponentDeclaration ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleProjectionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_view_4_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_components_6_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:418:2: ( (otherlv_0= 'Projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'view:' ( (lv_view_4_0= ruleHtmlSnippet ) ) ( ( (lv_attributes_5_0= ruleAttributeDeclaration ) ) | ( (lv_components_6_0= ruleComponentDeclaration ) ) )* otherlv_7= '}' ) )
            // InternalEditorLanguage.g:419:2: (otherlv_0= 'Projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'view:' ( (lv_view_4_0= ruleHtmlSnippet ) ) ( ( (lv_attributes_5_0= ruleAttributeDeclaration ) ) | ( (lv_components_6_0= ruleComponentDeclaration ) ) )* otherlv_7= '}' )
            {
            // InternalEditorLanguage.g:419:2: (otherlv_0= 'Projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'view:' ( (lv_view_4_0= ruleHtmlSnippet ) ) ( ( (lv_attributes_5_0= ruleAttributeDeclaration ) ) | ( (lv_components_6_0= ruleComponentDeclaration ) ) )* otherlv_7= '}' )
            // InternalEditorLanguage.g:420:3: otherlv_0= 'Projection' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'view:' ( (lv_view_4_0= ruleHtmlSnippet ) ) ( ( (lv_attributes_5_0= ruleAttributeDeclaration ) ) | ( (lv_components_6_0= ruleComponentDeclaration ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectionDeclarationAccess().getProjectionKeyword_0());
            		
            // InternalEditorLanguage.g:424:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEditorLanguage.g:425:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEditorLanguage.g:425:4: (lv_name_1_0= RULE_ID )
            // InternalEditorLanguage.g:426:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProjectionDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectionDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectionDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectionDeclarationAccess().getViewKeyword_3());
            		
            // InternalEditorLanguage.g:450:3: ( (lv_view_4_0= ruleHtmlSnippet ) )
            // InternalEditorLanguage.g:451:4: (lv_view_4_0= ruleHtmlSnippet )
            {
            // InternalEditorLanguage.g:451:4: (lv_view_4_0= ruleHtmlSnippet )
            // InternalEditorLanguage.g:452:5: lv_view_4_0= ruleHtmlSnippet
            {

            					newCompositeNode(grammarAccess.getProjectionDeclarationAccess().getViewHtmlSnippetParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_view_4_0=ruleHtmlSnippet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectionDeclarationRule());
            					}
            					set(
            						current,
            						"view",
            						lv_view_4_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.HtmlSnippet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEditorLanguage.g:469:3: ( ( (lv_attributes_5_0= ruleAttributeDeclaration ) ) | ( (lv_components_6_0= ruleComponentDeclaration ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }
                else if ( (LA6_0==29) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEditorLanguage.g:470:4: ( (lv_attributes_5_0= ruleAttributeDeclaration ) )
            	    {
            	    // InternalEditorLanguage.g:470:4: ( (lv_attributes_5_0= ruleAttributeDeclaration ) )
            	    // InternalEditorLanguage.g:471:5: (lv_attributes_5_0= ruleAttributeDeclaration )
            	    {
            	    // InternalEditorLanguage.g:471:5: (lv_attributes_5_0= ruleAttributeDeclaration )
            	    // InternalEditorLanguage.g:472:6: lv_attributes_5_0= ruleAttributeDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getProjectionDeclarationAccess().getAttributesAttributeDeclarationParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_attributes_5_0=ruleAttributeDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectionDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_5_0,
            	    							"org.eclipse.xtext.peweb.EditorLanguage.AttributeDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEditorLanguage.g:490:4: ( (lv_components_6_0= ruleComponentDeclaration ) )
            	    {
            	    // InternalEditorLanguage.g:490:4: ( (lv_components_6_0= ruleComponentDeclaration ) )
            	    // InternalEditorLanguage.g:491:5: (lv_components_6_0= ruleComponentDeclaration )
            	    {
            	    // InternalEditorLanguage.g:491:5: (lv_components_6_0= ruleComponentDeclaration )
            	    // InternalEditorLanguage.g:492:6: lv_components_6_0= ruleComponentDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getProjectionDeclarationAccess().getComponentsComponentDeclarationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_components_6_0=ruleComponentDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectionDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"components",
            	    							lv_components_6_0,
            	    							"org.eclipse.xtext.peweb.EditorLanguage.ComponentDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProjectionDeclarationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleProjectionDeclaration"


    // $ANTLR start "entryRuleAttributeDeclaration"
    // InternalEditorLanguage.g:518:1: entryRuleAttributeDeclaration returns [EObject current=null] : iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF ;
    public final EObject entryRuleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDeclaration = null;


        try {
            // InternalEditorLanguage.g:518:61: (iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF )
            // InternalEditorLanguage.g:519:2: iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAttributeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeDeclaration=ruleAttributeDeclaration();

            state._fsp--;

             current =iv_ruleAttributeDeclaration; 
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
    // $ANTLR end "entryRuleAttributeDeclaration"


    // $ANTLR start "ruleAttributeDeclaration"
    // InternalEditorLanguage.g:525:1: ruleAttributeDeclaration returns [EObject current=null] : (otherlv_0= '@' ( (lv_attributeName_1_0= RULE_ID ) ) ( (lv_controller_2_0= ruleAttributeController ) ) ) ;
    public final EObject ruleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributeName_1_0=null;
        EObject lv_controller_2_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:531:2: ( (otherlv_0= '@' ( (lv_attributeName_1_0= RULE_ID ) ) ( (lv_controller_2_0= ruleAttributeController ) ) ) )
            // InternalEditorLanguage.g:532:2: (otherlv_0= '@' ( (lv_attributeName_1_0= RULE_ID ) ) ( (lv_controller_2_0= ruleAttributeController ) ) )
            {
            // InternalEditorLanguage.g:532:2: (otherlv_0= '@' ( (lv_attributeName_1_0= RULE_ID ) ) ( (lv_controller_2_0= ruleAttributeController ) ) )
            // InternalEditorLanguage.g:533:3: otherlv_0= '@' ( (lv_attributeName_1_0= RULE_ID ) ) ( (lv_controller_2_0= ruleAttributeController ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeDeclarationAccess().getCommercialAtKeyword_0());
            		
            // InternalEditorLanguage.g:537:3: ( (lv_attributeName_1_0= RULE_ID ) )
            // InternalEditorLanguage.g:538:4: (lv_attributeName_1_0= RULE_ID )
            {
            // InternalEditorLanguage.g:538:4: (lv_attributeName_1_0= RULE_ID )
            // InternalEditorLanguage.g:539:5: lv_attributeName_1_0= RULE_ID
            {
            lv_attributeName_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_attributeName_1_0, grammarAccess.getAttributeDeclarationAccess().getAttributeNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attributeName",
            						lv_attributeName_1_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.ID");
            				

            }


            }

            // InternalEditorLanguage.g:555:3: ( (lv_controller_2_0= ruleAttributeController ) )
            // InternalEditorLanguage.g:556:4: (lv_controller_2_0= ruleAttributeController )
            {
            // InternalEditorLanguage.g:556:4: (lv_controller_2_0= ruleAttributeController )
            // InternalEditorLanguage.g:557:5: lv_controller_2_0= ruleAttributeController
            {

            					newCompositeNode(grammarAccess.getAttributeDeclarationAccess().getControllerAttributeControllerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_controller_2_0=ruleAttributeController();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeDeclarationRule());
            					}
            					set(
            						current,
            						"controller",
            						lv_controller_2_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.AttributeController");
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
    // $ANTLR end "ruleAttributeDeclaration"


    // $ANTLR start "entryRuleComponentId"
    // InternalEditorLanguage.g:578:1: entryRuleComponentId returns [EObject current=null] : iv_ruleComponentId= ruleComponentId EOF ;
    public final EObject entryRuleComponentId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentId = null;


        try {
            // InternalEditorLanguage.g:578:52: (iv_ruleComponentId= ruleComponentId EOF )
            // InternalEditorLanguage.g:579:2: iv_ruleComponentId= ruleComponentId EOF
            {
             newCompositeNode(grammarAccess.getComponentIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentId=ruleComponentId();

            state._fsp--;

             current =iv_ruleComponentId; 
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
    // $ANTLR end "entryRuleComponentId"


    // $ANTLR start "ruleComponentId"
    // InternalEditorLanguage.g:585:1: ruleComponentId returns [EObject current=null] : (otherlv_0= '%' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ':' ( (lv_componentId_3_0= RULE_ID ) ) )? otherlv_4= '%' ) ;
    public final EObject ruleComponentId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_componentId_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalEditorLanguage.g:591:2: ( (otherlv_0= '%' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ':' ( (lv_componentId_3_0= RULE_ID ) ) )? otherlv_4= '%' ) )
            // InternalEditorLanguage.g:592:2: (otherlv_0= '%' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ':' ( (lv_componentId_3_0= RULE_ID ) ) )? otherlv_4= '%' )
            {
            // InternalEditorLanguage.g:592:2: (otherlv_0= '%' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ':' ( (lv_componentId_3_0= RULE_ID ) ) )? otherlv_4= '%' )
            // InternalEditorLanguage.g:593:3: otherlv_0= '%' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ':' ( (lv_componentId_3_0= RULE_ID ) ) )? otherlv_4= '%'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentIdAccess().getPercentSignKeyword_0());
            		
            // InternalEditorLanguage.g:597:3: ( (otherlv_1= RULE_ID ) )
            // InternalEditorLanguage.g:598:4: (otherlv_1= RULE_ID )
            {
            // InternalEditorLanguage.g:598:4: (otherlv_1= RULE_ID )
            // InternalEditorLanguage.g:599:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentIdRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getComponentIdAccess().getComponentTypeComponentDeclarationCrossReference_1_0());
            				

            }


            }

            // InternalEditorLanguage.g:610:3: (otherlv_2= ':' ( (lv_componentId_3_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEditorLanguage.g:611:4: otherlv_2= ':' ( (lv_componentId_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentIdAccess().getColonKeyword_2_0());
                    			
                    // InternalEditorLanguage.g:615:4: ( (lv_componentId_3_0= RULE_ID ) )
                    // InternalEditorLanguage.g:616:5: (lv_componentId_3_0= RULE_ID )
                    {
                    // InternalEditorLanguage.g:616:5: (lv_componentId_3_0= RULE_ID )
                    // InternalEditorLanguage.g:617:6: lv_componentId_3_0= RULE_ID
                    {
                    lv_componentId_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_componentId_3_0, grammarAccess.getComponentIdAccess().getComponentIdIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentIdRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"componentId",
                    							lv_componentId_3_0,
                    							"org.eclipse.xtext.peweb.EditorLanguage.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentIdAccess().getPercentSignKeyword_3());
            		

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
    // $ANTLR end "ruleComponentId"


    // $ANTLR start "entryRuleAttributeController"
    // InternalEditorLanguage.g:642:1: entryRuleAttributeController returns [EObject current=null] : iv_ruleAttributeController= ruleAttributeController EOF ;
    public final EObject entryRuleAttributeController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeController = null;


        try {
            // InternalEditorLanguage.g:642:60: (iv_ruleAttributeController= ruleAttributeController EOF )
            // InternalEditorLanguage.g:643:2: iv_ruleAttributeController= ruleAttributeController EOF
            {
             newCompositeNode(grammarAccess.getAttributeControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeController=ruleAttributeController();

            state._fsp--;

             current =iv_ruleAttributeController; 
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
    // $ANTLR end "entryRuleAttributeController"


    // $ANTLR start "ruleAttributeController"
    // InternalEditorLanguage.g:649:1: ruleAttributeController returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'get:' ( (lv_getter_2_0= ruleJsSnippet ) ) otherlv_3= 'set:' ( (lv_setter_4_0= ruleJsSnippet ) ) otherlv_5= 'validate:' ( (lv_validater_6_0= ruleJsSnippet ) ) otherlv_7= '}' ) ;
    public final EObject ruleAttributeController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_getter_2_0 = null;

        EObject lv_setter_4_0 = null;

        EObject lv_validater_6_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:655:2: ( (otherlv_0= '{' otherlv_1= 'get:' ( (lv_getter_2_0= ruleJsSnippet ) ) otherlv_3= 'set:' ( (lv_setter_4_0= ruleJsSnippet ) ) otherlv_5= 'validate:' ( (lv_validater_6_0= ruleJsSnippet ) ) otherlv_7= '}' ) )
            // InternalEditorLanguage.g:656:2: (otherlv_0= '{' otherlv_1= 'get:' ( (lv_getter_2_0= ruleJsSnippet ) ) otherlv_3= 'set:' ( (lv_setter_4_0= ruleJsSnippet ) ) otherlv_5= 'validate:' ( (lv_validater_6_0= ruleJsSnippet ) ) otherlv_7= '}' )
            {
            // InternalEditorLanguage.g:656:2: (otherlv_0= '{' otherlv_1= 'get:' ( (lv_getter_2_0= ruleJsSnippet ) ) otherlv_3= 'set:' ( (lv_setter_4_0= ruleJsSnippet ) ) otherlv_5= 'validate:' ( (lv_validater_6_0= ruleJsSnippet ) ) otherlv_7= '}' )
            // InternalEditorLanguage.g:657:3: otherlv_0= '{' otherlv_1= 'get:' ( (lv_getter_2_0= ruleJsSnippet ) ) otherlv_3= 'set:' ( (lv_setter_4_0= ruleJsSnippet ) ) otherlv_5= 'validate:' ( (lv_validater_6_0= ruleJsSnippet ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeControllerAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeControllerAccess().getGetKeyword_1());
            		
            // InternalEditorLanguage.g:665:3: ( (lv_getter_2_0= ruleJsSnippet ) )
            // InternalEditorLanguage.g:666:4: (lv_getter_2_0= ruleJsSnippet )
            {
            // InternalEditorLanguage.g:666:4: (lv_getter_2_0= ruleJsSnippet )
            // InternalEditorLanguage.g:667:5: lv_getter_2_0= ruleJsSnippet
            {

            					newCompositeNode(grammarAccess.getAttributeControllerAccess().getGetterJsSnippetParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_getter_2_0=ruleJsSnippet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeControllerRule());
            					}
            					set(
            						current,
            						"getter",
            						lv_getter_2_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeControllerAccess().getSetKeyword_3());
            		
            // InternalEditorLanguage.g:688:3: ( (lv_setter_4_0= ruleJsSnippet ) )
            // InternalEditorLanguage.g:689:4: (lv_setter_4_0= ruleJsSnippet )
            {
            // InternalEditorLanguage.g:689:4: (lv_setter_4_0= ruleJsSnippet )
            // InternalEditorLanguage.g:690:5: lv_setter_4_0= ruleJsSnippet
            {

            					newCompositeNode(grammarAccess.getAttributeControllerAccess().getSetterJsSnippetParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_setter_4_0=ruleJsSnippet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeControllerRule());
            					}
            					set(
            						current,
            						"setter",
            						lv_setter_4_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeControllerAccess().getValidateKeyword_5());
            		
            // InternalEditorLanguage.g:711:3: ( (lv_validater_6_0= ruleJsSnippet ) )
            // InternalEditorLanguage.g:712:4: (lv_validater_6_0= ruleJsSnippet )
            {
            // InternalEditorLanguage.g:712:4: (lv_validater_6_0= ruleJsSnippet )
            // InternalEditorLanguage.g:713:5: lv_validater_6_0= ruleJsSnippet
            {

            					newCompositeNode(grammarAccess.getAttributeControllerAccess().getValidaterJsSnippetParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_validater_6_0=ruleJsSnippet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeControllerRule());
            					}
            					set(
            						current,
            						"validater",
            						lv_validater_6_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeControllerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAttributeController"


    // $ANTLR start "entryRuleChildId"
    // InternalEditorLanguage.g:738:1: entryRuleChildId returns [EObject current=null] : iv_ruleChildId= ruleChildId EOF ;
    public final EObject entryRuleChildId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildId = null;


        try {
            // InternalEditorLanguage.g:738:48: (iv_ruleChildId= ruleChildId EOF )
            // InternalEditorLanguage.g:739:2: iv_ruleChildId= ruleChildId EOF
            {
             newCompositeNode(grammarAccess.getChildIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChildId=ruleChildId();

            state._fsp--;

             current =iv_ruleChildId; 
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
    // $ANTLR end "entryRuleChildId"


    // $ANTLR start "ruleChildId"
    // InternalEditorLanguage.g:745:1: ruleChildId returns [EObject current=null] : (otherlv_0= '!' ( (lv_childId_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '!' ) ;
    public final EObject ruleChildId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_childId_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalEditorLanguage.g:751:2: ( (otherlv_0= '!' ( (lv_childId_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '!' ) )
            // InternalEditorLanguage.g:752:2: (otherlv_0= '!' ( (lv_childId_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '!' )
            {
            // InternalEditorLanguage.g:752:2: (otherlv_0= '!' ( (lv_childId_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '!' )
            // InternalEditorLanguage.g:753:3: otherlv_0= '!' ( (lv_childId_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '!'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getChildIdAccess().getExclamationMarkKeyword_0());
            		
            // InternalEditorLanguage.g:757:3: ( (lv_childId_1_0= RULE_ID ) )
            // InternalEditorLanguage.g:758:4: (lv_childId_1_0= RULE_ID )
            {
            // InternalEditorLanguage.g:758:4: (lv_childId_1_0= RULE_ID )
            // InternalEditorLanguage.g:759:5: lv_childId_1_0= RULE_ID
            {
            lv_childId_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_childId_1_0, grammarAccess.getChildIdAccess().getChildIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChildIdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"childId",
            						lv_childId_1_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getChildIdAccess().getColonKeyword_2());
            		
            // InternalEditorLanguage.g:779:3: ( (otherlv_3= RULE_ID ) )
            // InternalEditorLanguage.g:780:4: (otherlv_3= RULE_ID )
            {
            // InternalEditorLanguage.g:780:4: (otherlv_3= RULE_ID )
            // InternalEditorLanguage.g:781:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChildIdRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_3, grammarAccess.getChildIdAccess().getProjectionIdProjectionDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getChildIdAccess().getExclamationMarkKeyword_4());
            		

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
    // $ANTLR end "ruleChildId"


    // $ANTLR start "entryRuleTagId"
    // InternalEditorLanguage.g:800:1: entryRuleTagId returns [EObject current=null] : iv_ruleTagId= ruleTagId EOF ;
    public final EObject entryRuleTagId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagId = null;


        try {
            // InternalEditorLanguage.g:800:46: (iv_ruleTagId= ruleTagId EOF )
            // InternalEditorLanguage.g:801:2: iv_ruleTagId= ruleTagId EOF
            {
             newCompositeNode(grammarAccess.getTagIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTagId=ruleTagId();

            state._fsp--;

             current =iv_ruleTagId; 
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
    // $ANTLR end "entryRuleTagId"


    // $ANTLR start "ruleTagId"
    // InternalEditorLanguage.g:807:1: ruleTagId returns [EObject current=null] : (otherlv_0= '$' ( (lv_tagName_1_0= RULE_ID ) ) otherlv_2= '$' ) ;
    public final EObject ruleTagId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tagName_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEditorLanguage.g:813:2: ( (otherlv_0= '$' ( (lv_tagName_1_0= RULE_ID ) ) otherlv_2= '$' ) )
            // InternalEditorLanguage.g:814:2: (otherlv_0= '$' ( (lv_tagName_1_0= RULE_ID ) ) otherlv_2= '$' )
            {
            // InternalEditorLanguage.g:814:2: (otherlv_0= '$' ( (lv_tagName_1_0= RULE_ID ) ) otherlv_2= '$' )
            // InternalEditorLanguage.g:815:3: otherlv_0= '$' ( (lv_tagName_1_0= RULE_ID ) ) otherlv_2= '$'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTagIdAccess().getDollarSignKeyword_0());
            		
            // InternalEditorLanguage.g:819:3: ( (lv_tagName_1_0= RULE_ID ) )
            // InternalEditorLanguage.g:820:4: (lv_tagName_1_0= RULE_ID )
            {
            // InternalEditorLanguage.g:820:4: (lv_tagName_1_0= RULE_ID )
            // InternalEditorLanguage.g:821:5: lv_tagName_1_0= RULE_ID
            {
            lv_tagName_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_tagName_1_0, grammarAccess.getTagIdAccess().getTagNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagIdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tagName",
            						lv_tagName_1_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTagIdAccess().getDollarSignKeyword_2());
            		

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
    // $ANTLR end "ruleTagId"


    // $ANTLR start "entryRuleComponentDeclaration"
    // InternalEditorLanguage.g:845:1: entryRuleComponentDeclaration returns [EObject current=null] : iv_ruleComponentDeclaration= ruleComponentDeclaration EOF ;
    public final EObject entryRuleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDeclaration = null;


        try {
            // InternalEditorLanguage.g:845:61: (iv_ruleComponentDeclaration= ruleComponentDeclaration EOF )
            // InternalEditorLanguage.g:846:2: iv_ruleComponentDeclaration= ruleComponentDeclaration EOF
            {
             newCompositeNode(grammarAccess.getComponentDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDeclaration=ruleComponentDeclaration();

            state._fsp--;

             current =iv_ruleComponentDeclaration; 
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
    // $ANTLR end "entryRuleComponentDeclaration"


    // $ANTLR start "ruleComponentDeclaration"
    // InternalEditorLanguage.g:852:1: ruleComponentDeclaration returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'view:' ( (lv_view_4_0= ruleHtmlSnippet ) ) ( (lv_control_5_0= ruleComponentController ) )? otherlv_6= '}' ) ;
    public final EObject ruleComponentDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_view_4_0 = null;

        EObject lv_control_5_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:858:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'view:' ( (lv_view_4_0= ruleHtmlSnippet ) ) ( (lv_control_5_0= ruleComponentController ) )? otherlv_6= '}' ) )
            // InternalEditorLanguage.g:859:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'view:' ( (lv_view_4_0= ruleHtmlSnippet ) ) ( (lv_control_5_0= ruleComponentController ) )? otherlv_6= '}' )
            {
            // InternalEditorLanguage.g:859:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'view:' ( (lv_view_4_0= ruleHtmlSnippet ) ) ( (lv_control_5_0= ruleComponentController ) )? otherlv_6= '}' )
            // InternalEditorLanguage.g:860:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'view:' ( (lv_view_4_0= ruleHtmlSnippet ) ) ( (lv_control_5_0= ruleComponentController ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDeclarationAccess().getComponentKeyword_0());
            		
            // InternalEditorLanguage.g:864:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEditorLanguage.g:865:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEditorLanguage.g:865:4: (lv_name_1_0= RULE_ID )
            // InternalEditorLanguage.g:866:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentDeclarationAccess().getViewKeyword_3());
            		
            // InternalEditorLanguage.g:890:3: ( (lv_view_4_0= ruleHtmlSnippet ) )
            // InternalEditorLanguage.g:891:4: (lv_view_4_0= ruleHtmlSnippet )
            {
            // InternalEditorLanguage.g:891:4: (lv_view_4_0= ruleHtmlSnippet )
            // InternalEditorLanguage.g:892:5: lv_view_4_0= ruleHtmlSnippet
            {

            					newCompositeNode(grammarAccess.getComponentDeclarationAccess().getViewHtmlSnippetParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_view_4_0=ruleHtmlSnippet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
            					}
            					set(
            						current,
            						"view",
            						lv_view_4_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.HtmlSnippet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEditorLanguage.g:909:3: ( (lv_control_5_0= ruleComponentController ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEditorLanguage.g:910:4: (lv_control_5_0= ruleComponentController )
                    {
                    // InternalEditorLanguage.g:910:4: (lv_control_5_0= ruleComponentController )
                    // InternalEditorLanguage.g:911:5: lv_control_5_0= ruleComponentController
                    {

                    					newCompositeNode(grammarAccess.getComponentDeclarationAccess().getControlComponentControllerParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_control_5_0=ruleComponentController();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"control",
                    						lv_control_5_0,
                    						"org.eclipse.xtext.peweb.EditorLanguage.ComponentController");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentDeclarationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleComponentDeclaration"


    // $ANTLR start "entryRuleComponentController"
    // InternalEditorLanguage.g:936:1: entryRuleComponentController returns [EObject current=null] : iv_ruleComponentController= ruleComponentController EOF ;
    public final EObject entryRuleComponentController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentController = null;


        try {
            // InternalEditorLanguage.g:936:60: (iv_ruleComponentController= ruleComponentController EOF )
            // InternalEditorLanguage.g:937:2: iv_ruleComponentController= ruleComponentController EOF
            {
             newCompositeNode(grammarAccess.getComponentControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentController=ruleComponentController();

            state._fsp--;

             current =iv_ruleComponentController; 
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
    // $ANTLR end "entryRuleComponentController"


    // $ANTLR start "ruleComponentController"
    // InternalEditorLanguage.g:943:1: ruleComponentController returns [EObject current=null] : (otherlv_0= 'get:' ( (lv_getter_1_0= ruleJsSnippet ) ) otherlv_2= 'set:' ( (lv_setter_3_0= ruleJsSnippet ) ) otherlv_4= 'validate:' ( (lv_validater_5_0= ruleJsSnippet ) ) ) ;
    public final EObject ruleComponentController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_getter_1_0 = null;

        EObject lv_setter_3_0 = null;

        EObject lv_validater_5_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:949:2: ( (otherlv_0= 'get:' ( (lv_getter_1_0= ruleJsSnippet ) ) otherlv_2= 'set:' ( (lv_setter_3_0= ruleJsSnippet ) ) otherlv_4= 'validate:' ( (lv_validater_5_0= ruleJsSnippet ) ) ) )
            // InternalEditorLanguage.g:950:2: (otherlv_0= 'get:' ( (lv_getter_1_0= ruleJsSnippet ) ) otherlv_2= 'set:' ( (lv_setter_3_0= ruleJsSnippet ) ) otherlv_4= 'validate:' ( (lv_validater_5_0= ruleJsSnippet ) ) )
            {
            // InternalEditorLanguage.g:950:2: (otherlv_0= 'get:' ( (lv_getter_1_0= ruleJsSnippet ) ) otherlv_2= 'set:' ( (lv_setter_3_0= ruleJsSnippet ) ) otherlv_4= 'validate:' ( (lv_validater_5_0= ruleJsSnippet ) ) )
            // InternalEditorLanguage.g:951:3: otherlv_0= 'get:' ( (lv_getter_1_0= ruleJsSnippet ) ) otherlv_2= 'set:' ( (lv_setter_3_0= ruleJsSnippet ) ) otherlv_4= 'validate:' ( (lv_validater_5_0= ruleJsSnippet ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentControllerAccess().getGetKeyword_0());
            		
            // InternalEditorLanguage.g:955:3: ( (lv_getter_1_0= ruleJsSnippet ) )
            // InternalEditorLanguage.g:956:4: (lv_getter_1_0= ruleJsSnippet )
            {
            // InternalEditorLanguage.g:956:4: (lv_getter_1_0= ruleJsSnippet )
            // InternalEditorLanguage.g:957:5: lv_getter_1_0= ruleJsSnippet
            {

            					newCompositeNode(grammarAccess.getComponentControllerAccess().getGetterJsSnippetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_getter_1_0=ruleJsSnippet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentControllerRule());
            					}
            					set(
            						current,
            						"getter",
            						lv_getter_1_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentControllerAccess().getSetKeyword_2());
            		
            // InternalEditorLanguage.g:978:3: ( (lv_setter_3_0= ruleJsSnippet ) )
            // InternalEditorLanguage.g:979:4: (lv_setter_3_0= ruleJsSnippet )
            {
            // InternalEditorLanguage.g:979:4: (lv_setter_3_0= ruleJsSnippet )
            // InternalEditorLanguage.g:980:5: lv_setter_3_0= ruleJsSnippet
            {

            					newCompositeNode(grammarAccess.getComponentControllerAccess().getSetterJsSnippetParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_setter_3_0=ruleJsSnippet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentControllerRule());
            					}
            					set(
            						current,
            						"setter",
            						lv_setter_3_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentControllerAccess().getValidateKeyword_4());
            		
            // InternalEditorLanguage.g:1001:3: ( (lv_validater_5_0= ruleJsSnippet ) )
            // InternalEditorLanguage.g:1002:4: (lv_validater_5_0= ruleJsSnippet )
            {
            // InternalEditorLanguage.g:1002:4: (lv_validater_5_0= ruleJsSnippet )
            // InternalEditorLanguage.g:1003:5: lv_validater_5_0= ruleJsSnippet
            {

            					newCompositeNode(grammarAccess.getComponentControllerAccess().getValidaterJsSnippetParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_validater_5_0=ruleJsSnippet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentControllerRule());
            					}
            					set(
            						current,
            						"validater",
            						lv_validater_5_0,
            						"org.eclipse.xtext.peweb.EditorLanguage.JsSnippet");
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
    // $ANTLR end "ruleComponentController"


    // $ANTLR start "entryRuleHtmlSnippet"
    // InternalEditorLanguage.g:1024:1: entryRuleHtmlSnippet returns [EObject current=null] : iv_ruleHtmlSnippet= ruleHtmlSnippet EOF ;
    public final EObject entryRuleHtmlSnippet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHtmlSnippet = null;


        try {
            // InternalEditorLanguage.g:1024:52: (iv_ruleHtmlSnippet= ruleHtmlSnippet EOF )
            // InternalEditorLanguage.g:1025:2: iv_ruleHtmlSnippet= ruleHtmlSnippet EOF
            {
             newCompositeNode(grammarAccess.getHtmlSnippetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHtmlSnippet=ruleHtmlSnippet();

            state._fsp--;

             current =iv_ruleHtmlSnippet; 
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
    // $ANTLR end "entryRuleHtmlSnippet"


    // $ANTLR start "ruleHtmlSnippet"
    // InternalEditorLanguage.g:1031:1: ruleHtmlSnippet returns [EObject current=null] : ( ( () ( (lv_html_1_0= ruleCodeLiteral ) ) ) | ( ( (lv_html_2_0= ruleCodeLiteralStart ) ) ( (lv_html_3_0= ruleHtmlAnnotation ) ) ( ( (lv_html_4_0= ruleCodeLiteralMid ) ) ( (lv_html_5_0= ruleHtmlAnnotation ) ) )* ( (lv_html_6_0= ruleCodeLiteralEnd ) ) ) ) ;
    public final EObject ruleHtmlSnippet() throws RecognitionException {
        EObject current = null;

        EObject lv_html_1_0 = null;

        EObject lv_html_2_0 = null;

        EObject lv_html_3_0 = null;

        EObject lv_html_4_0 = null;

        EObject lv_html_5_0 = null;

        EObject lv_html_6_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:1037:2: ( ( ( () ( (lv_html_1_0= ruleCodeLiteral ) ) ) | ( ( (lv_html_2_0= ruleCodeLiteralStart ) ) ( (lv_html_3_0= ruleHtmlAnnotation ) ) ( ( (lv_html_4_0= ruleCodeLiteralMid ) ) ( (lv_html_5_0= ruleHtmlAnnotation ) ) )* ( (lv_html_6_0= ruleCodeLiteralEnd ) ) ) ) )
            // InternalEditorLanguage.g:1038:2: ( ( () ( (lv_html_1_0= ruleCodeLiteral ) ) ) | ( ( (lv_html_2_0= ruleCodeLiteralStart ) ) ( (lv_html_3_0= ruleHtmlAnnotation ) ) ( ( (lv_html_4_0= ruleCodeLiteralMid ) ) ( (lv_html_5_0= ruleHtmlAnnotation ) ) )* ( (lv_html_6_0= ruleCodeLiteralEnd ) ) ) )
            {
            // InternalEditorLanguage.g:1038:2: ( ( () ( (lv_html_1_0= ruleCodeLiteral ) ) ) | ( ( (lv_html_2_0= ruleCodeLiteralStart ) ) ( (lv_html_3_0= ruleHtmlAnnotation ) ) ( ( (lv_html_4_0= ruleCodeLiteralMid ) ) ( (lv_html_5_0= ruleHtmlAnnotation ) ) )* ( (lv_html_6_0= ruleCodeLiteralEnd ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_CODENOTAG) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_CODESTART) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEditorLanguage.g:1039:3: ( () ( (lv_html_1_0= ruleCodeLiteral ) ) )
                    {
                    // InternalEditorLanguage.g:1039:3: ( () ( (lv_html_1_0= ruleCodeLiteral ) ) )
                    // InternalEditorLanguage.g:1040:4: () ( (lv_html_1_0= ruleCodeLiteral ) )
                    {
                    // InternalEditorLanguage.g:1040:4: ()
                    // InternalEditorLanguage.g:1041:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getHtmlSnippetAccess().getHtmlSnippetAction_0_0(),
                    						current);
                    				

                    }

                    // InternalEditorLanguage.g:1047:4: ( (lv_html_1_0= ruleCodeLiteral ) )
                    // InternalEditorLanguage.g:1048:5: (lv_html_1_0= ruleCodeLiteral )
                    {
                    // InternalEditorLanguage.g:1048:5: (lv_html_1_0= ruleCodeLiteral )
                    // InternalEditorLanguage.g:1049:6: lv_html_1_0= ruleCodeLiteral
                    {

                    						newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_html_1_0=ruleCodeLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
                    						}
                    						add(
                    							current,
                    							"html",
                    							lv_html_1_0,
                    							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEditorLanguage.g:1068:3: ( ( (lv_html_2_0= ruleCodeLiteralStart ) ) ( (lv_html_3_0= ruleHtmlAnnotation ) ) ( ( (lv_html_4_0= ruleCodeLiteralMid ) ) ( (lv_html_5_0= ruleHtmlAnnotation ) ) )* ( (lv_html_6_0= ruleCodeLiteralEnd ) ) )
                    {
                    // InternalEditorLanguage.g:1068:3: ( ( (lv_html_2_0= ruleCodeLiteralStart ) ) ( (lv_html_3_0= ruleHtmlAnnotation ) ) ( ( (lv_html_4_0= ruleCodeLiteralMid ) ) ( (lv_html_5_0= ruleHtmlAnnotation ) ) )* ( (lv_html_6_0= ruleCodeLiteralEnd ) ) )
                    // InternalEditorLanguage.g:1069:4: ( (lv_html_2_0= ruleCodeLiteralStart ) ) ( (lv_html_3_0= ruleHtmlAnnotation ) ) ( ( (lv_html_4_0= ruleCodeLiteralMid ) ) ( (lv_html_5_0= ruleHtmlAnnotation ) ) )* ( (lv_html_6_0= ruleCodeLiteralEnd ) )
                    {
                    // InternalEditorLanguage.g:1069:4: ( (lv_html_2_0= ruleCodeLiteralStart ) )
                    // InternalEditorLanguage.g:1070:5: (lv_html_2_0= ruleCodeLiteralStart )
                    {
                    // InternalEditorLanguage.g:1070:5: (lv_html_2_0= ruleCodeLiteralStart )
                    // InternalEditorLanguage.g:1071:6: lv_html_2_0= ruleCodeLiteralStart
                    {

                    						newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralStartParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_html_2_0=ruleCodeLiteralStart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
                    						}
                    						add(
                    							current,
                    							"html",
                    							lv_html_2_0,
                    							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralStart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEditorLanguage.g:1088:4: ( (lv_html_3_0= ruleHtmlAnnotation ) )
                    // InternalEditorLanguage.g:1089:5: (lv_html_3_0= ruleHtmlAnnotation )
                    {
                    // InternalEditorLanguage.g:1089:5: (lv_html_3_0= ruleHtmlAnnotation )
                    // InternalEditorLanguage.g:1090:6: lv_html_3_0= ruleHtmlAnnotation
                    {

                    						newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlHtmlAnnotationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_html_3_0=ruleHtmlAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
                    						}
                    						add(
                    							current,
                    							"html",
                    							lv_html_3_0,
                    							"org.eclipse.xtext.peweb.EditorLanguage.HtmlAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEditorLanguage.g:1107:4: ( ( (lv_html_4_0= ruleCodeLiteralMid ) ) ( (lv_html_5_0= ruleHtmlAnnotation ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_CODEMID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalEditorLanguage.g:1108:5: ( (lv_html_4_0= ruleCodeLiteralMid ) ) ( (lv_html_5_0= ruleHtmlAnnotation ) )
                    	    {
                    	    // InternalEditorLanguage.g:1108:5: ( (lv_html_4_0= ruleCodeLiteralMid ) )
                    	    // InternalEditorLanguage.g:1109:6: (lv_html_4_0= ruleCodeLiteralMid )
                    	    {
                    	    // InternalEditorLanguage.g:1109:6: (lv_html_4_0= ruleCodeLiteralMid )
                    	    // InternalEditorLanguage.g:1110:7: lv_html_4_0= ruleCodeLiteralMid
                    	    {

                    	    							newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralMidParserRuleCall_1_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_html_4_0=ruleCodeLiteralMid();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"html",
                    	    								lv_html_4_0,
                    	    								"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralMid");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalEditorLanguage.g:1127:5: ( (lv_html_5_0= ruleHtmlAnnotation ) )
                    	    // InternalEditorLanguage.g:1128:6: (lv_html_5_0= ruleHtmlAnnotation )
                    	    {
                    	    // InternalEditorLanguage.g:1128:6: (lv_html_5_0= ruleHtmlAnnotation )
                    	    // InternalEditorLanguage.g:1129:7: lv_html_5_0= ruleHtmlAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlHtmlAnnotationParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_html_5_0=ruleHtmlAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"html",
                    	    								lv_html_5_0,
                    	    								"org.eclipse.xtext.peweb.EditorLanguage.HtmlAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // InternalEditorLanguage.g:1147:4: ( (lv_html_6_0= ruleCodeLiteralEnd ) )
                    // InternalEditorLanguage.g:1148:5: (lv_html_6_0= ruleCodeLiteralEnd )
                    {
                    // InternalEditorLanguage.g:1148:5: (lv_html_6_0= ruleCodeLiteralEnd )
                    // InternalEditorLanguage.g:1149:6: lv_html_6_0= ruleCodeLiteralEnd
                    {

                    						newCompositeNode(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralEndParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_html_6_0=ruleCodeLiteralEnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHtmlSnippetRule());
                    						}
                    						add(
                    							current,
                    							"html",
                    							lv_html_6_0,
                    							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralEnd");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleHtmlSnippet"


    // $ANTLR start "entryRuleHtmlAnnotation"
    // InternalEditorLanguage.g:1171:1: entryRuleHtmlAnnotation returns [EObject current=null] : iv_ruleHtmlAnnotation= ruleHtmlAnnotation EOF ;
    public final EObject entryRuleHtmlAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHtmlAnnotation = null;


        try {
            // InternalEditorLanguage.g:1171:55: (iv_ruleHtmlAnnotation= ruleHtmlAnnotation EOF )
            // InternalEditorLanguage.g:1172:2: iv_ruleHtmlAnnotation= ruleHtmlAnnotation EOF
            {
             newCompositeNode(grammarAccess.getHtmlAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHtmlAnnotation=ruleHtmlAnnotation();

            state._fsp--;

             current =iv_ruleHtmlAnnotation; 
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
    // $ANTLR end "entryRuleHtmlAnnotation"


    // $ANTLR start "ruleHtmlAnnotation"
    // InternalEditorLanguage.g:1178:1: ruleHtmlAnnotation returns [EObject current=null] : (this_TagId_0= ruleTagId | this_ChildId_1= ruleChildId | this_ComponentId_2= ruleComponentId ) ;
    public final EObject ruleHtmlAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_TagId_0 = null;

        EObject this_ChildId_1 = null;

        EObject this_ComponentId_2 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:1184:2: ( (this_TagId_0= ruleTagId | this_ChildId_1= ruleChildId | this_ComponentId_2= ruleComponentId ) )
            // InternalEditorLanguage.g:1185:2: (this_TagId_0= ruleTagId | this_ChildId_1= ruleChildId | this_ComponentId_2= ruleComponentId )
            {
            // InternalEditorLanguage.g:1185:2: (this_TagId_0= ruleTagId | this_ChildId_1= ruleChildId | this_ComponentId_2= ruleComponentId )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 22:
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
                    // InternalEditorLanguage.g:1186:3: this_TagId_0= ruleTagId
                    {

                    			newCompositeNode(grammarAccess.getHtmlAnnotationAccess().getTagIdParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TagId_0=ruleTagId();

                    state._fsp--;


                    			current = this_TagId_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEditorLanguage.g:1195:3: this_ChildId_1= ruleChildId
                    {

                    			newCompositeNode(grammarAccess.getHtmlAnnotationAccess().getChildIdParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChildId_1=ruleChildId();

                    state._fsp--;


                    			current = this_ChildId_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEditorLanguage.g:1204:3: this_ComponentId_2= ruleComponentId
                    {

                    			newCompositeNode(grammarAccess.getHtmlAnnotationAccess().getComponentIdParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentId_2=ruleComponentId();

                    state._fsp--;


                    			current = this_ComponentId_2;
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
    // $ANTLR end "ruleHtmlAnnotation"


    // $ANTLR start "entryRuleCodeLiteral"
    // InternalEditorLanguage.g:1216:1: entryRuleCodeLiteral returns [EObject current=null] : iv_ruleCodeLiteral= ruleCodeLiteral EOF ;
    public final EObject entryRuleCodeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeLiteral = null;


        try {
            // InternalEditorLanguage.g:1216:52: (iv_ruleCodeLiteral= ruleCodeLiteral EOF )
            // InternalEditorLanguage.g:1217:2: iv_ruleCodeLiteral= ruleCodeLiteral EOF
            {
             newCompositeNode(grammarAccess.getCodeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeLiteral=ruleCodeLiteral();

            state._fsp--;

             current =iv_ruleCodeLiteral; 
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
    // $ANTLR end "entryRuleCodeLiteral"


    // $ANTLR start "ruleCodeLiteral"
    // InternalEditorLanguage.g:1223:1: ruleCodeLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_CODENOTAG ) ) ;
    public final EObject ruleCodeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEditorLanguage.g:1229:2: ( ( (lv_value_0_0= RULE_CODENOTAG ) ) )
            // InternalEditorLanguage.g:1230:2: ( (lv_value_0_0= RULE_CODENOTAG ) )
            {
            // InternalEditorLanguage.g:1230:2: ( (lv_value_0_0= RULE_CODENOTAG ) )
            // InternalEditorLanguage.g:1231:3: (lv_value_0_0= RULE_CODENOTAG )
            {
            // InternalEditorLanguage.g:1231:3: (lv_value_0_0= RULE_CODENOTAG )
            // InternalEditorLanguage.g:1232:4: lv_value_0_0= RULE_CODENOTAG
            {
            lv_value_0_0=(Token)match(input,RULE_CODENOTAG,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getCodeLiteralAccess().getValueCODENOTAGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCodeLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.peweb.EditorLanguage.CODENOTAG");
            			

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
    // $ANTLR end "ruleCodeLiteral"


    // $ANTLR start "entryRuleCodeLiteralStart"
    // InternalEditorLanguage.g:1251:1: entryRuleCodeLiteralStart returns [EObject current=null] : iv_ruleCodeLiteralStart= ruleCodeLiteralStart EOF ;
    public final EObject entryRuleCodeLiteralStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeLiteralStart = null;


        try {
            // InternalEditorLanguage.g:1251:57: (iv_ruleCodeLiteralStart= ruleCodeLiteralStart EOF )
            // InternalEditorLanguage.g:1252:2: iv_ruleCodeLiteralStart= ruleCodeLiteralStart EOF
            {
             newCompositeNode(grammarAccess.getCodeLiteralStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeLiteralStart=ruleCodeLiteralStart();

            state._fsp--;

             current =iv_ruleCodeLiteralStart; 
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
    // $ANTLR end "entryRuleCodeLiteralStart"


    // $ANTLR start "ruleCodeLiteralStart"
    // InternalEditorLanguage.g:1258:1: ruleCodeLiteralStart returns [EObject current=null] : ( (lv_value_0_0= RULE_CODESTART ) ) ;
    public final EObject ruleCodeLiteralStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEditorLanguage.g:1264:2: ( ( (lv_value_0_0= RULE_CODESTART ) ) )
            // InternalEditorLanguage.g:1265:2: ( (lv_value_0_0= RULE_CODESTART ) )
            {
            // InternalEditorLanguage.g:1265:2: ( (lv_value_0_0= RULE_CODESTART ) )
            // InternalEditorLanguage.g:1266:3: (lv_value_0_0= RULE_CODESTART )
            {
            // InternalEditorLanguage.g:1266:3: (lv_value_0_0= RULE_CODESTART )
            // InternalEditorLanguage.g:1267:4: lv_value_0_0= RULE_CODESTART
            {
            lv_value_0_0=(Token)match(input,RULE_CODESTART,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getCodeLiteralStartAccess().getValueCODESTARTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCodeLiteralStartRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.peweb.EditorLanguage.CODESTART");
            			

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
    // $ANTLR end "ruleCodeLiteralStart"


    // $ANTLR start "entryRuleCodeLiteralMid"
    // InternalEditorLanguage.g:1286:1: entryRuleCodeLiteralMid returns [EObject current=null] : iv_ruleCodeLiteralMid= ruleCodeLiteralMid EOF ;
    public final EObject entryRuleCodeLiteralMid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeLiteralMid = null;


        try {
            // InternalEditorLanguage.g:1286:55: (iv_ruleCodeLiteralMid= ruleCodeLiteralMid EOF )
            // InternalEditorLanguage.g:1287:2: iv_ruleCodeLiteralMid= ruleCodeLiteralMid EOF
            {
             newCompositeNode(grammarAccess.getCodeLiteralMidRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeLiteralMid=ruleCodeLiteralMid();

            state._fsp--;

             current =iv_ruleCodeLiteralMid; 
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
    // $ANTLR end "entryRuleCodeLiteralMid"


    // $ANTLR start "ruleCodeLiteralMid"
    // InternalEditorLanguage.g:1293:1: ruleCodeLiteralMid returns [EObject current=null] : ( (lv_value_0_0= RULE_CODEMID ) ) ;
    public final EObject ruleCodeLiteralMid() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEditorLanguage.g:1299:2: ( ( (lv_value_0_0= RULE_CODEMID ) ) )
            // InternalEditorLanguage.g:1300:2: ( (lv_value_0_0= RULE_CODEMID ) )
            {
            // InternalEditorLanguage.g:1300:2: ( (lv_value_0_0= RULE_CODEMID ) )
            // InternalEditorLanguage.g:1301:3: (lv_value_0_0= RULE_CODEMID )
            {
            // InternalEditorLanguage.g:1301:3: (lv_value_0_0= RULE_CODEMID )
            // InternalEditorLanguage.g:1302:4: lv_value_0_0= RULE_CODEMID
            {
            lv_value_0_0=(Token)match(input,RULE_CODEMID,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getCodeLiteralMidAccess().getValueCODEMIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCodeLiteralMidRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.peweb.EditorLanguage.CODEMID");
            			

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
    // $ANTLR end "ruleCodeLiteralMid"


    // $ANTLR start "entryRuleCodeLiteralEnd"
    // InternalEditorLanguage.g:1321:1: entryRuleCodeLiteralEnd returns [EObject current=null] : iv_ruleCodeLiteralEnd= ruleCodeLiteralEnd EOF ;
    public final EObject entryRuleCodeLiteralEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeLiteralEnd = null;


        try {
            // InternalEditorLanguage.g:1321:55: (iv_ruleCodeLiteralEnd= ruleCodeLiteralEnd EOF )
            // InternalEditorLanguage.g:1322:2: iv_ruleCodeLiteralEnd= ruleCodeLiteralEnd EOF
            {
             newCompositeNode(grammarAccess.getCodeLiteralEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeLiteralEnd=ruleCodeLiteralEnd();

            state._fsp--;

             current =iv_ruleCodeLiteralEnd; 
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
    // $ANTLR end "entryRuleCodeLiteralEnd"


    // $ANTLR start "ruleCodeLiteralEnd"
    // InternalEditorLanguage.g:1328:1: ruleCodeLiteralEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_CODEEND ) ) ;
    public final EObject ruleCodeLiteralEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalEditorLanguage.g:1334:2: ( ( (lv_value_0_0= RULE_CODEEND ) ) )
            // InternalEditorLanguage.g:1335:2: ( (lv_value_0_0= RULE_CODEEND ) )
            {
            // InternalEditorLanguage.g:1335:2: ( (lv_value_0_0= RULE_CODEEND ) )
            // InternalEditorLanguage.g:1336:3: (lv_value_0_0= RULE_CODEEND )
            {
            // InternalEditorLanguage.g:1336:3: (lv_value_0_0= RULE_CODEEND )
            // InternalEditorLanguage.g:1337:4: lv_value_0_0= RULE_CODEEND
            {
            lv_value_0_0=(Token)match(input,RULE_CODEEND,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getCodeLiteralEndAccess().getValueCODEENDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCodeLiteralEndRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.peweb.EditorLanguage.CODEEND");
            			

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
    // $ANTLR end "ruleCodeLiteralEnd"


    // $ANTLR start "entryRuleJsSnippet"
    // InternalEditorLanguage.g:1356:1: entryRuleJsSnippet returns [EObject current=null] : iv_ruleJsSnippet= ruleJsSnippet EOF ;
    public final EObject entryRuleJsSnippet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsSnippet = null;


        try {
            // InternalEditorLanguage.g:1356:50: (iv_ruleJsSnippet= ruleJsSnippet EOF )
            // InternalEditorLanguage.g:1357:2: iv_ruleJsSnippet= ruleJsSnippet EOF
            {
             newCompositeNode(grammarAccess.getJsSnippetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsSnippet=ruleJsSnippet();

            state._fsp--;

             current =iv_ruleJsSnippet; 
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
    // $ANTLR end "entryRuleJsSnippet"


    // $ANTLR start "ruleJsSnippet"
    // InternalEditorLanguage.g:1363:1: ruleJsSnippet returns [EObject current=null] : ( ( () ( (lv_js_1_0= ruleCodeLiteral ) ) ) | ( ( (lv_js_2_0= ruleCodeLiteralStart ) ) ( (lv_js_3_0= ruleJsExtraTag ) ) ( ( (lv_js_4_0= ruleCodeLiteralMid ) ) ( (lv_js_5_0= ruleJsExtraTag ) ) )* ( (lv_js_6_0= ruleCodeLiteralEnd ) ) ) ) ;
    public final EObject ruleJsSnippet() throws RecognitionException {
        EObject current = null;

        EObject lv_js_1_0 = null;

        EObject lv_js_2_0 = null;

        EObject lv_js_3_0 = null;

        EObject lv_js_4_0 = null;

        EObject lv_js_5_0 = null;

        EObject lv_js_6_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:1369:2: ( ( ( () ( (lv_js_1_0= ruleCodeLiteral ) ) ) | ( ( (lv_js_2_0= ruleCodeLiteralStart ) ) ( (lv_js_3_0= ruleJsExtraTag ) ) ( ( (lv_js_4_0= ruleCodeLiteralMid ) ) ( (lv_js_5_0= ruleJsExtraTag ) ) )* ( (lv_js_6_0= ruleCodeLiteralEnd ) ) ) ) )
            // InternalEditorLanguage.g:1370:2: ( ( () ( (lv_js_1_0= ruleCodeLiteral ) ) ) | ( ( (lv_js_2_0= ruleCodeLiteralStart ) ) ( (lv_js_3_0= ruleJsExtraTag ) ) ( ( (lv_js_4_0= ruleCodeLiteralMid ) ) ( (lv_js_5_0= ruleJsExtraTag ) ) )* ( (lv_js_6_0= ruleCodeLiteralEnd ) ) ) )
            {
            // InternalEditorLanguage.g:1370:2: ( ( () ( (lv_js_1_0= ruleCodeLiteral ) ) ) | ( ( (lv_js_2_0= ruleCodeLiteralStart ) ) ( (lv_js_3_0= ruleJsExtraTag ) ) ( ( (lv_js_4_0= ruleCodeLiteralMid ) ) ( (lv_js_5_0= ruleJsExtraTag ) ) )* ( (lv_js_6_0= ruleCodeLiteralEnd ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_CODENOTAG) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_CODESTART) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEditorLanguage.g:1371:3: ( () ( (lv_js_1_0= ruleCodeLiteral ) ) )
                    {
                    // InternalEditorLanguage.g:1371:3: ( () ( (lv_js_1_0= ruleCodeLiteral ) ) )
                    // InternalEditorLanguage.g:1372:4: () ( (lv_js_1_0= ruleCodeLiteral ) )
                    {
                    // InternalEditorLanguage.g:1372:4: ()
                    // InternalEditorLanguage.g:1373:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getJsSnippetAccess().getJsSnippetAction_0_0(),
                    						current);
                    				

                    }

                    // InternalEditorLanguage.g:1379:4: ( (lv_js_1_0= ruleCodeLiteral ) )
                    // InternalEditorLanguage.g:1380:5: (lv_js_1_0= ruleCodeLiteral )
                    {
                    // InternalEditorLanguage.g:1380:5: (lv_js_1_0= ruleCodeLiteral )
                    // InternalEditorLanguage.g:1381:6: lv_js_1_0= ruleCodeLiteral
                    {

                    						newCompositeNode(grammarAccess.getJsSnippetAccess().getJsCodeLiteralParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_js_1_0=ruleCodeLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJsSnippetRule());
                    						}
                    						add(
                    							current,
                    							"js",
                    							lv_js_1_0,
                    							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEditorLanguage.g:1400:3: ( ( (lv_js_2_0= ruleCodeLiteralStart ) ) ( (lv_js_3_0= ruleJsExtraTag ) ) ( ( (lv_js_4_0= ruleCodeLiteralMid ) ) ( (lv_js_5_0= ruleJsExtraTag ) ) )* ( (lv_js_6_0= ruleCodeLiteralEnd ) ) )
                    {
                    // InternalEditorLanguage.g:1400:3: ( ( (lv_js_2_0= ruleCodeLiteralStart ) ) ( (lv_js_3_0= ruleJsExtraTag ) ) ( ( (lv_js_4_0= ruleCodeLiteralMid ) ) ( (lv_js_5_0= ruleJsExtraTag ) ) )* ( (lv_js_6_0= ruleCodeLiteralEnd ) ) )
                    // InternalEditorLanguage.g:1401:4: ( (lv_js_2_0= ruleCodeLiteralStart ) ) ( (lv_js_3_0= ruleJsExtraTag ) ) ( ( (lv_js_4_0= ruleCodeLiteralMid ) ) ( (lv_js_5_0= ruleJsExtraTag ) ) )* ( (lv_js_6_0= ruleCodeLiteralEnd ) )
                    {
                    // InternalEditorLanguage.g:1401:4: ( (lv_js_2_0= ruleCodeLiteralStart ) )
                    // InternalEditorLanguage.g:1402:5: (lv_js_2_0= ruleCodeLiteralStart )
                    {
                    // InternalEditorLanguage.g:1402:5: (lv_js_2_0= ruleCodeLiteralStart )
                    // InternalEditorLanguage.g:1403:6: lv_js_2_0= ruleCodeLiteralStart
                    {

                    						newCompositeNode(grammarAccess.getJsSnippetAccess().getJsCodeLiteralStartParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_js_2_0=ruleCodeLiteralStart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJsSnippetRule());
                    						}
                    						add(
                    							current,
                    							"js",
                    							lv_js_2_0,
                    							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralStart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEditorLanguage.g:1420:4: ( (lv_js_3_0= ruleJsExtraTag ) )
                    // InternalEditorLanguage.g:1421:5: (lv_js_3_0= ruleJsExtraTag )
                    {
                    // InternalEditorLanguage.g:1421:5: (lv_js_3_0= ruleJsExtraTag )
                    // InternalEditorLanguage.g:1422:6: lv_js_3_0= ruleJsExtraTag
                    {

                    						newCompositeNode(grammarAccess.getJsSnippetAccess().getJsJsExtraTagParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_js_3_0=ruleJsExtraTag();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJsSnippetRule());
                    						}
                    						add(
                    							current,
                    							"js",
                    							lv_js_3_0,
                    							"org.eclipse.xtext.peweb.EditorLanguage.JsExtraTag");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEditorLanguage.g:1439:4: ( ( (lv_js_4_0= ruleCodeLiteralMid ) ) ( (lv_js_5_0= ruleJsExtraTag ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_CODEMID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalEditorLanguage.g:1440:5: ( (lv_js_4_0= ruleCodeLiteralMid ) ) ( (lv_js_5_0= ruleJsExtraTag ) )
                    	    {
                    	    // InternalEditorLanguage.g:1440:5: ( (lv_js_4_0= ruleCodeLiteralMid ) )
                    	    // InternalEditorLanguage.g:1441:6: (lv_js_4_0= ruleCodeLiteralMid )
                    	    {
                    	    // InternalEditorLanguage.g:1441:6: (lv_js_4_0= ruleCodeLiteralMid )
                    	    // InternalEditorLanguage.g:1442:7: lv_js_4_0= ruleCodeLiteralMid
                    	    {

                    	    							newCompositeNode(grammarAccess.getJsSnippetAccess().getJsCodeLiteralMidParserRuleCall_1_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_js_4_0=ruleCodeLiteralMid();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJsSnippetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"js",
                    	    								lv_js_4_0,
                    	    								"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralMid");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalEditorLanguage.g:1459:5: ( (lv_js_5_0= ruleJsExtraTag ) )
                    	    // InternalEditorLanguage.g:1460:6: (lv_js_5_0= ruleJsExtraTag )
                    	    {
                    	    // InternalEditorLanguage.g:1460:6: (lv_js_5_0= ruleJsExtraTag )
                    	    // InternalEditorLanguage.g:1461:7: lv_js_5_0= ruleJsExtraTag
                    	    {

                    	    							newCompositeNode(grammarAccess.getJsSnippetAccess().getJsJsExtraTagParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_js_5_0=ruleJsExtraTag();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJsSnippetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"js",
                    	    								lv_js_5_0,
                    	    								"org.eclipse.xtext.peweb.EditorLanguage.JsExtraTag");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalEditorLanguage.g:1479:4: ( (lv_js_6_0= ruleCodeLiteralEnd ) )
                    // InternalEditorLanguage.g:1480:5: (lv_js_6_0= ruleCodeLiteralEnd )
                    {
                    // InternalEditorLanguage.g:1480:5: (lv_js_6_0= ruleCodeLiteralEnd )
                    // InternalEditorLanguage.g:1481:6: lv_js_6_0= ruleCodeLiteralEnd
                    {

                    						newCompositeNode(grammarAccess.getJsSnippetAccess().getJsCodeLiteralEndParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_js_6_0=ruleCodeLiteralEnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJsSnippetRule());
                    						}
                    						add(
                    							current,
                    							"js",
                    							lv_js_6_0,
                    							"org.eclipse.xtext.peweb.EditorLanguage.CodeLiteralEnd");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleJsSnippet"


    // $ANTLR start "entryRuleJsExtraTag"
    // InternalEditorLanguage.g:1503:1: entryRuleJsExtraTag returns [EObject current=null] : iv_ruleJsExtraTag= ruleJsExtraTag EOF ;
    public final EObject entryRuleJsExtraTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsExtraTag = null;


        try {
            // InternalEditorLanguage.g:1503:51: (iv_ruleJsExtraTag= ruleJsExtraTag EOF )
            // InternalEditorLanguage.g:1504:2: iv_ruleJsExtraTag= ruleJsExtraTag EOF
            {
             newCompositeNode(grammarAccess.getJsExtraTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsExtraTag=ruleJsExtraTag();

            state._fsp--;

             current =iv_ruleJsExtraTag; 
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
    // $ANTLR end "entryRuleJsExtraTag"


    // $ANTLR start "ruleJsExtraTag"
    // InternalEditorLanguage.g:1510:1: ruleJsExtraTag returns [EObject current=null] : this_TagId_0= ruleTagId ;
    public final EObject ruleJsExtraTag() throws RecognitionException {
        EObject current = null;

        EObject this_TagId_0 = null;



        	enterRule();

        try {
            // InternalEditorLanguage.g:1516:2: (this_TagId_0= ruleTagId )
            // InternalEditorLanguage.g:1517:2: this_TagId_0= ruleTagId
            {

            		newCompositeNode(grammarAccess.getJsExtraTagAccess().getTagIdParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TagId_0=ruleTagId();

            state._fsp--;


            		current = this_TagId_0;
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
    // $ANTLR end "ruleJsExtraTag"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000200D0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020250000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000180L});

}