package org.eclipse.xtext.peweb.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.peweb.services.EditorLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEditorLanguageParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(EditorLanguageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEditorDefinitionFile"
    // InternalEditorLanguage.g:53:1: entryRuleEditorDefinitionFile : ruleEditorDefinitionFile EOF ;
    public final void entryRuleEditorDefinitionFile() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:54:1: ( ruleEditorDefinitionFile EOF )
            // InternalEditorLanguage.g:55:1: ruleEditorDefinitionFile EOF
            {
             before(grammarAccess.getEditorDefinitionFileRule()); 
            pushFollow(FOLLOW_1);
            ruleEditorDefinitionFile();

            state._fsp--;

             after(grammarAccess.getEditorDefinitionFileRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEditorDefinitionFile"


    // $ANTLR start "ruleEditorDefinitionFile"
    // InternalEditorLanguage.g:62:1: ruleEditorDefinitionFile : ( ( rule__EditorDefinitionFile__Group__0 ) ) ;
    public final void ruleEditorDefinitionFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:66:2: ( ( ( rule__EditorDefinitionFile__Group__0 ) ) )
            // InternalEditorLanguage.g:67:2: ( ( rule__EditorDefinitionFile__Group__0 ) )
            {
            // InternalEditorLanguage.g:67:2: ( ( rule__EditorDefinitionFile__Group__0 ) )
            // InternalEditorLanguage.g:68:3: ( rule__EditorDefinitionFile__Group__0 )
            {
             before(grammarAccess.getEditorDefinitionFileAccess().getGroup()); 
            // InternalEditorLanguage.g:69:3: ( rule__EditorDefinitionFile__Group__0 )
            // InternalEditorLanguage.g:69:4: rule__EditorDefinitionFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EditorDefinitionFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEditorDefinitionFileAccess().getGroup()); 

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
    // $ANTLR end "ruleEditorDefinitionFile"


    // $ANTLR start "entryRuleImportSection"
    // InternalEditorLanguage.g:78:1: entryRuleImportSection : ruleImportSection EOF ;
    public final void entryRuleImportSection() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:79:1: ( ruleImportSection EOF )
            // InternalEditorLanguage.g:80:1: ruleImportSection EOF
            {
             before(grammarAccess.getImportSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleImportSection();

            state._fsp--;

             after(grammarAccess.getImportSectionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportSection"


    // $ANTLR start "ruleImportSection"
    // InternalEditorLanguage.g:87:1: ruleImportSection : ( ( rule__ImportSection__Group__0 ) ) ;
    public final void ruleImportSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:91:2: ( ( ( rule__ImportSection__Group__0 ) ) )
            // InternalEditorLanguage.g:92:2: ( ( rule__ImportSection__Group__0 ) )
            {
            // InternalEditorLanguage.g:92:2: ( ( rule__ImportSection__Group__0 ) )
            // InternalEditorLanguage.g:93:3: ( rule__ImportSection__Group__0 )
            {
             before(grammarAccess.getImportSectionAccess().getGroup()); 
            // InternalEditorLanguage.g:94:3: ( rule__ImportSection__Group__0 )
            // InternalEditorLanguage.g:94:4: rule__ImportSection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportSectionAccess().getGroup()); 

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
    // $ANTLR end "ruleImportSection"


    // $ANTLR start "entryRuleImport"
    // InternalEditorLanguage.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:104:1: ( ruleImport EOF )
            // InternalEditorLanguage.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEditorLanguage.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalEditorLanguage.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalEditorLanguage.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalEditorLanguage.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalEditorLanguage.g:119:3: ( rule__Import__Group__0 )
            // InternalEditorLanguage.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEditorLanguage.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:129:1: ( ruleQualifiedName EOF )
            // InternalEditorLanguage.g:130:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEditorLanguage.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalEditorLanguage.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalEditorLanguage.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalEditorLanguage.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalEditorLanguage.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalEditorLanguage.g:144:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleMainSection"
    // InternalEditorLanguage.g:153:1: entryRuleMainSection : ruleMainSection EOF ;
    public final void entryRuleMainSection() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:154:1: ( ruleMainSection EOF )
            // InternalEditorLanguage.g:155:1: ruleMainSection EOF
            {
             before(grammarAccess.getMainSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleMainSection();

            state._fsp--;

             after(grammarAccess.getMainSectionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMainSection"


    // $ANTLR start "ruleMainSection"
    // InternalEditorLanguage.g:162:1: ruleMainSection : ( ( rule__MainSection__Group__0 ) ) ;
    public final void ruleMainSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:166:2: ( ( ( rule__MainSection__Group__0 ) ) )
            // InternalEditorLanguage.g:167:2: ( ( rule__MainSection__Group__0 ) )
            {
            // InternalEditorLanguage.g:167:2: ( ( rule__MainSection__Group__0 ) )
            // InternalEditorLanguage.g:168:3: ( rule__MainSection__Group__0 )
            {
             before(grammarAccess.getMainSectionAccess().getGroup()); 
            // InternalEditorLanguage.g:169:3: ( rule__MainSection__Group__0 )
            // InternalEditorLanguage.g:169:4: rule__MainSection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainSectionAccess().getGroup()); 

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
    // $ANTLR end "ruleMainSection"


    // $ANTLR start "entryRuleNodeDeclaration"
    // InternalEditorLanguage.g:178:1: entryRuleNodeDeclaration : ruleNodeDeclaration EOF ;
    public final void entryRuleNodeDeclaration() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:179:1: ( ruleNodeDeclaration EOF )
            // InternalEditorLanguage.g:180:1: ruleNodeDeclaration EOF
            {
             before(grammarAccess.getNodeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeDeclaration();

            state._fsp--;

             after(grammarAccess.getNodeDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNodeDeclaration"


    // $ANTLR start "ruleNodeDeclaration"
    // InternalEditorLanguage.g:187:1: ruleNodeDeclaration : ( ( rule__NodeDeclaration__Group__0 ) ) ;
    public final void ruleNodeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:191:2: ( ( ( rule__NodeDeclaration__Group__0 ) ) )
            // InternalEditorLanguage.g:192:2: ( ( rule__NodeDeclaration__Group__0 ) )
            {
            // InternalEditorLanguage.g:192:2: ( ( rule__NodeDeclaration__Group__0 ) )
            // InternalEditorLanguage.g:193:3: ( rule__NodeDeclaration__Group__0 )
            {
             before(grammarAccess.getNodeDeclarationAccess().getGroup()); 
            // InternalEditorLanguage.g:194:3: ( rule__NodeDeclaration__Group__0 )
            // InternalEditorLanguage.g:194:4: rule__NodeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleNodeDeclaration"


    // $ANTLR start "entryRuleProjectionDeclaration"
    // InternalEditorLanguage.g:203:1: entryRuleProjectionDeclaration : ruleProjectionDeclaration EOF ;
    public final void entryRuleProjectionDeclaration() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:204:1: ( ruleProjectionDeclaration EOF )
            // InternalEditorLanguage.g:205:1: ruleProjectionDeclaration EOF
            {
             before(grammarAccess.getProjectionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleProjectionDeclaration();

            state._fsp--;

             after(grammarAccess.getProjectionDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProjectionDeclaration"


    // $ANTLR start "ruleProjectionDeclaration"
    // InternalEditorLanguage.g:212:1: ruleProjectionDeclaration : ( ( rule__ProjectionDeclaration__Group__0 ) ) ;
    public final void ruleProjectionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:216:2: ( ( ( rule__ProjectionDeclaration__Group__0 ) ) )
            // InternalEditorLanguage.g:217:2: ( ( rule__ProjectionDeclaration__Group__0 ) )
            {
            // InternalEditorLanguage.g:217:2: ( ( rule__ProjectionDeclaration__Group__0 ) )
            // InternalEditorLanguage.g:218:3: ( rule__ProjectionDeclaration__Group__0 )
            {
             before(grammarAccess.getProjectionDeclarationAccess().getGroup()); 
            // InternalEditorLanguage.g:219:3: ( rule__ProjectionDeclaration__Group__0 )
            // InternalEditorLanguage.g:219:4: rule__ProjectionDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectionDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleProjectionDeclaration"


    // $ANTLR start "entryRuleAttributeDeclaration"
    // InternalEditorLanguage.g:228:1: entryRuleAttributeDeclaration : ruleAttributeDeclaration EOF ;
    public final void entryRuleAttributeDeclaration() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:229:1: ( ruleAttributeDeclaration EOF )
            // InternalEditorLanguage.g:230:1: ruleAttributeDeclaration EOF
            {
             before(grammarAccess.getAttributeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeDeclaration();

            state._fsp--;

             after(grammarAccess.getAttributeDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeDeclaration"


    // $ANTLR start "ruleAttributeDeclaration"
    // InternalEditorLanguage.g:237:1: ruleAttributeDeclaration : ( ( rule__AttributeDeclaration__Group__0 ) ) ;
    public final void ruleAttributeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:241:2: ( ( ( rule__AttributeDeclaration__Group__0 ) ) )
            // InternalEditorLanguage.g:242:2: ( ( rule__AttributeDeclaration__Group__0 ) )
            {
            // InternalEditorLanguage.g:242:2: ( ( rule__AttributeDeclaration__Group__0 ) )
            // InternalEditorLanguage.g:243:3: ( rule__AttributeDeclaration__Group__0 )
            {
             before(grammarAccess.getAttributeDeclarationAccess().getGroup()); 
            // InternalEditorLanguage.g:244:3: ( rule__AttributeDeclaration__Group__0 )
            // InternalEditorLanguage.g:244:4: rule__AttributeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeDeclaration"


    // $ANTLR start "entryRuleComponentId"
    // InternalEditorLanguage.g:253:1: entryRuleComponentId : ruleComponentId EOF ;
    public final void entryRuleComponentId() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:254:1: ( ruleComponentId EOF )
            // InternalEditorLanguage.g:255:1: ruleComponentId EOF
            {
             before(grammarAccess.getComponentIdRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentId();

            state._fsp--;

             after(grammarAccess.getComponentIdRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentId"


    // $ANTLR start "ruleComponentId"
    // InternalEditorLanguage.g:262:1: ruleComponentId : ( ( rule__ComponentId__Group__0 ) ) ;
    public final void ruleComponentId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:266:2: ( ( ( rule__ComponentId__Group__0 ) ) )
            // InternalEditorLanguage.g:267:2: ( ( rule__ComponentId__Group__0 ) )
            {
            // InternalEditorLanguage.g:267:2: ( ( rule__ComponentId__Group__0 ) )
            // InternalEditorLanguage.g:268:3: ( rule__ComponentId__Group__0 )
            {
             before(grammarAccess.getComponentIdAccess().getGroup()); 
            // InternalEditorLanguage.g:269:3: ( rule__ComponentId__Group__0 )
            // InternalEditorLanguage.g:269:4: rule__ComponentId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentIdAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentId"


    // $ANTLR start "entryRuleAttributeController"
    // InternalEditorLanguage.g:278:1: entryRuleAttributeController : ruleAttributeController EOF ;
    public final void entryRuleAttributeController() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:279:1: ( ruleAttributeController EOF )
            // InternalEditorLanguage.g:280:1: ruleAttributeController EOF
            {
             before(grammarAccess.getAttributeControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeController();

            state._fsp--;

             after(grammarAccess.getAttributeControllerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeController"


    // $ANTLR start "ruleAttributeController"
    // InternalEditorLanguage.g:287:1: ruleAttributeController : ( ( rule__AttributeController__Group__0 ) ) ;
    public final void ruleAttributeController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:291:2: ( ( ( rule__AttributeController__Group__0 ) ) )
            // InternalEditorLanguage.g:292:2: ( ( rule__AttributeController__Group__0 ) )
            {
            // InternalEditorLanguage.g:292:2: ( ( rule__AttributeController__Group__0 ) )
            // InternalEditorLanguage.g:293:3: ( rule__AttributeController__Group__0 )
            {
             before(grammarAccess.getAttributeControllerAccess().getGroup()); 
            // InternalEditorLanguage.g:294:3: ( rule__AttributeController__Group__0 )
            // InternalEditorLanguage.g:294:4: rule__AttributeController__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeController__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeControllerAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeController"


    // $ANTLR start "entryRuleChildId"
    // InternalEditorLanguage.g:303:1: entryRuleChildId : ruleChildId EOF ;
    public final void entryRuleChildId() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:304:1: ( ruleChildId EOF )
            // InternalEditorLanguage.g:305:1: ruleChildId EOF
            {
             before(grammarAccess.getChildIdRule()); 
            pushFollow(FOLLOW_1);
            ruleChildId();

            state._fsp--;

             after(grammarAccess.getChildIdRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChildId"


    // $ANTLR start "ruleChildId"
    // InternalEditorLanguage.g:312:1: ruleChildId : ( ( rule__ChildId__Group__0 ) ) ;
    public final void ruleChildId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:316:2: ( ( ( rule__ChildId__Group__0 ) ) )
            // InternalEditorLanguage.g:317:2: ( ( rule__ChildId__Group__0 ) )
            {
            // InternalEditorLanguage.g:317:2: ( ( rule__ChildId__Group__0 ) )
            // InternalEditorLanguage.g:318:3: ( rule__ChildId__Group__0 )
            {
             before(grammarAccess.getChildIdAccess().getGroup()); 
            // InternalEditorLanguage.g:319:3: ( rule__ChildId__Group__0 )
            // InternalEditorLanguage.g:319:4: rule__ChildId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChildId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChildIdAccess().getGroup()); 

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
    // $ANTLR end "ruleChildId"


    // $ANTLR start "entryRuleTagId"
    // InternalEditorLanguage.g:328:1: entryRuleTagId : ruleTagId EOF ;
    public final void entryRuleTagId() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:329:1: ( ruleTagId EOF )
            // InternalEditorLanguage.g:330:1: ruleTagId EOF
            {
             before(grammarAccess.getTagIdRule()); 
            pushFollow(FOLLOW_1);
            ruleTagId();

            state._fsp--;

             after(grammarAccess.getTagIdRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTagId"


    // $ANTLR start "ruleTagId"
    // InternalEditorLanguage.g:337:1: ruleTagId : ( ( rule__TagId__Group__0 ) ) ;
    public final void ruleTagId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:341:2: ( ( ( rule__TagId__Group__0 ) ) )
            // InternalEditorLanguage.g:342:2: ( ( rule__TagId__Group__0 ) )
            {
            // InternalEditorLanguage.g:342:2: ( ( rule__TagId__Group__0 ) )
            // InternalEditorLanguage.g:343:3: ( rule__TagId__Group__0 )
            {
             before(grammarAccess.getTagIdAccess().getGroup()); 
            // InternalEditorLanguage.g:344:3: ( rule__TagId__Group__0 )
            // InternalEditorLanguage.g:344:4: rule__TagId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TagId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagIdAccess().getGroup()); 

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
    // $ANTLR end "ruleTagId"


    // $ANTLR start "entryRuleComponentDeclaration"
    // InternalEditorLanguage.g:353:1: entryRuleComponentDeclaration : ruleComponentDeclaration EOF ;
    public final void entryRuleComponentDeclaration() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:354:1: ( ruleComponentDeclaration EOF )
            // InternalEditorLanguage.g:355:1: ruleComponentDeclaration EOF
            {
             before(grammarAccess.getComponentDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentDeclaration();

            state._fsp--;

             after(grammarAccess.getComponentDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentDeclaration"


    // $ANTLR start "ruleComponentDeclaration"
    // InternalEditorLanguage.g:362:1: ruleComponentDeclaration : ( ( rule__ComponentDeclaration__Group__0 ) ) ;
    public final void ruleComponentDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:366:2: ( ( ( rule__ComponentDeclaration__Group__0 ) ) )
            // InternalEditorLanguage.g:367:2: ( ( rule__ComponentDeclaration__Group__0 ) )
            {
            // InternalEditorLanguage.g:367:2: ( ( rule__ComponentDeclaration__Group__0 ) )
            // InternalEditorLanguage.g:368:3: ( rule__ComponentDeclaration__Group__0 )
            {
             before(grammarAccess.getComponentDeclarationAccess().getGroup()); 
            // InternalEditorLanguage.g:369:3: ( rule__ComponentDeclaration__Group__0 )
            // InternalEditorLanguage.g:369:4: rule__ComponentDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentDeclaration"


    // $ANTLR start "entryRuleComponentController"
    // InternalEditorLanguage.g:378:1: entryRuleComponentController : ruleComponentController EOF ;
    public final void entryRuleComponentController() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:379:1: ( ruleComponentController EOF )
            // InternalEditorLanguage.g:380:1: ruleComponentController EOF
            {
             before(grammarAccess.getComponentControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentController();

            state._fsp--;

             after(grammarAccess.getComponentControllerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponentController"


    // $ANTLR start "ruleComponentController"
    // InternalEditorLanguage.g:387:1: ruleComponentController : ( ( rule__ComponentController__Group__0 ) ) ;
    public final void ruleComponentController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:391:2: ( ( ( rule__ComponentController__Group__0 ) ) )
            // InternalEditorLanguage.g:392:2: ( ( rule__ComponentController__Group__0 ) )
            {
            // InternalEditorLanguage.g:392:2: ( ( rule__ComponentController__Group__0 ) )
            // InternalEditorLanguage.g:393:3: ( rule__ComponentController__Group__0 )
            {
             before(grammarAccess.getComponentControllerAccess().getGroup()); 
            // InternalEditorLanguage.g:394:3: ( rule__ComponentController__Group__0 )
            // InternalEditorLanguage.g:394:4: rule__ComponentController__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentController__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentControllerAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentController"


    // $ANTLR start "entryRuleHtmlSnippet"
    // InternalEditorLanguage.g:403:1: entryRuleHtmlSnippet : ruleHtmlSnippet EOF ;
    public final void entryRuleHtmlSnippet() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:404:1: ( ruleHtmlSnippet EOF )
            // InternalEditorLanguage.g:405:1: ruleHtmlSnippet EOF
            {
             before(grammarAccess.getHtmlSnippetRule()); 
            pushFollow(FOLLOW_1);
            ruleHtmlSnippet();

            state._fsp--;

             after(grammarAccess.getHtmlSnippetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHtmlSnippet"


    // $ANTLR start "ruleHtmlSnippet"
    // InternalEditorLanguage.g:412:1: ruleHtmlSnippet : ( ( rule__HtmlSnippet__Alternatives ) ) ;
    public final void ruleHtmlSnippet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:416:2: ( ( ( rule__HtmlSnippet__Alternatives ) ) )
            // InternalEditorLanguage.g:417:2: ( ( rule__HtmlSnippet__Alternatives ) )
            {
            // InternalEditorLanguage.g:417:2: ( ( rule__HtmlSnippet__Alternatives ) )
            // InternalEditorLanguage.g:418:3: ( rule__HtmlSnippet__Alternatives )
            {
             before(grammarAccess.getHtmlSnippetAccess().getAlternatives()); 
            // InternalEditorLanguage.g:419:3: ( rule__HtmlSnippet__Alternatives )
            // InternalEditorLanguage.g:419:4: rule__HtmlSnippet__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHtmlSnippetAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHtmlSnippet"


    // $ANTLR start "entryRuleHtmlAnnotation"
    // InternalEditorLanguage.g:428:1: entryRuleHtmlAnnotation : ruleHtmlAnnotation EOF ;
    public final void entryRuleHtmlAnnotation() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:429:1: ( ruleHtmlAnnotation EOF )
            // InternalEditorLanguage.g:430:1: ruleHtmlAnnotation EOF
            {
             before(grammarAccess.getHtmlAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleHtmlAnnotation();

            state._fsp--;

             after(grammarAccess.getHtmlAnnotationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHtmlAnnotation"


    // $ANTLR start "ruleHtmlAnnotation"
    // InternalEditorLanguage.g:437:1: ruleHtmlAnnotation : ( ( rule__HtmlAnnotation__Alternatives ) ) ;
    public final void ruleHtmlAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:441:2: ( ( ( rule__HtmlAnnotation__Alternatives ) ) )
            // InternalEditorLanguage.g:442:2: ( ( rule__HtmlAnnotation__Alternatives ) )
            {
            // InternalEditorLanguage.g:442:2: ( ( rule__HtmlAnnotation__Alternatives ) )
            // InternalEditorLanguage.g:443:3: ( rule__HtmlAnnotation__Alternatives )
            {
             before(grammarAccess.getHtmlAnnotationAccess().getAlternatives()); 
            // InternalEditorLanguage.g:444:3: ( rule__HtmlAnnotation__Alternatives )
            // InternalEditorLanguage.g:444:4: rule__HtmlAnnotation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HtmlAnnotation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHtmlAnnotationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHtmlAnnotation"


    // $ANTLR start "entryRuleCodeLiteral"
    // InternalEditorLanguage.g:453:1: entryRuleCodeLiteral : ruleCodeLiteral EOF ;
    public final void entryRuleCodeLiteral() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:454:1: ( ruleCodeLiteral EOF )
            // InternalEditorLanguage.g:455:1: ruleCodeLiteral EOF
            {
             before(grammarAccess.getCodeLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleCodeLiteral();

            state._fsp--;

             after(grammarAccess.getCodeLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCodeLiteral"


    // $ANTLR start "ruleCodeLiteral"
    // InternalEditorLanguage.g:462:1: ruleCodeLiteral : ( ( rule__CodeLiteral__ValueAssignment ) ) ;
    public final void ruleCodeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:466:2: ( ( ( rule__CodeLiteral__ValueAssignment ) ) )
            // InternalEditorLanguage.g:467:2: ( ( rule__CodeLiteral__ValueAssignment ) )
            {
            // InternalEditorLanguage.g:467:2: ( ( rule__CodeLiteral__ValueAssignment ) )
            // InternalEditorLanguage.g:468:3: ( rule__CodeLiteral__ValueAssignment )
            {
             before(grammarAccess.getCodeLiteralAccess().getValueAssignment()); 
            // InternalEditorLanguage.g:469:3: ( rule__CodeLiteral__ValueAssignment )
            // InternalEditorLanguage.g:469:4: rule__CodeLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CodeLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCodeLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleCodeLiteral"


    // $ANTLR start "entryRuleCodeLiteralStart"
    // InternalEditorLanguage.g:478:1: entryRuleCodeLiteralStart : ruleCodeLiteralStart EOF ;
    public final void entryRuleCodeLiteralStart() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:479:1: ( ruleCodeLiteralStart EOF )
            // InternalEditorLanguage.g:480:1: ruleCodeLiteralStart EOF
            {
             before(grammarAccess.getCodeLiteralStartRule()); 
            pushFollow(FOLLOW_1);
            ruleCodeLiteralStart();

            state._fsp--;

             after(grammarAccess.getCodeLiteralStartRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCodeLiteralStart"


    // $ANTLR start "ruleCodeLiteralStart"
    // InternalEditorLanguage.g:487:1: ruleCodeLiteralStart : ( ( rule__CodeLiteralStart__ValueAssignment ) ) ;
    public final void ruleCodeLiteralStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:491:2: ( ( ( rule__CodeLiteralStart__ValueAssignment ) ) )
            // InternalEditorLanguage.g:492:2: ( ( rule__CodeLiteralStart__ValueAssignment ) )
            {
            // InternalEditorLanguage.g:492:2: ( ( rule__CodeLiteralStart__ValueAssignment ) )
            // InternalEditorLanguage.g:493:3: ( rule__CodeLiteralStart__ValueAssignment )
            {
             before(grammarAccess.getCodeLiteralStartAccess().getValueAssignment()); 
            // InternalEditorLanguage.g:494:3: ( rule__CodeLiteralStart__ValueAssignment )
            // InternalEditorLanguage.g:494:4: rule__CodeLiteralStart__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CodeLiteralStart__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCodeLiteralStartAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleCodeLiteralStart"


    // $ANTLR start "entryRuleCodeLiteralMid"
    // InternalEditorLanguage.g:503:1: entryRuleCodeLiteralMid : ruleCodeLiteralMid EOF ;
    public final void entryRuleCodeLiteralMid() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:504:1: ( ruleCodeLiteralMid EOF )
            // InternalEditorLanguage.g:505:1: ruleCodeLiteralMid EOF
            {
             before(grammarAccess.getCodeLiteralMidRule()); 
            pushFollow(FOLLOW_1);
            ruleCodeLiteralMid();

            state._fsp--;

             after(grammarAccess.getCodeLiteralMidRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCodeLiteralMid"


    // $ANTLR start "ruleCodeLiteralMid"
    // InternalEditorLanguage.g:512:1: ruleCodeLiteralMid : ( ( rule__CodeLiteralMid__ValueAssignment ) ) ;
    public final void ruleCodeLiteralMid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:516:2: ( ( ( rule__CodeLiteralMid__ValueAssignment ) ) )
            // InternalEditorLanguage.g:517:2: ( ( rule__CodeLiteralMid__ValueAssignment ) )
            {
            // InternalEditorLanguage.g:517:2: ( ( rule__CodeLiteralMid__ValueAssignment ) )
            // InternalEditorLanguage.g:518:3: ( rule__CodeLiteralMid__ValueAssignment )
            {
             before(grammarAccess.getCodeLiteralMidAccess().getValueAssignment()); 
            // InternalEditorLanguage.g:519:3: ( rule__CodeLiteralMid__ValueAssignment )
            // InternalEditorLanguage.g:519:4: rule__CodeLiteralMid__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CodeLiteralMid__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCodeLiteralMidAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleCodeLiteralMid"


    // $ANTLR start "entryRuleCodeLiteralEnd"
    // InternalEditorLanguage.g:528:1: entryRuleCodeLiteralEnd : ruleCodeLiteralEnd EOF ;
    public final void entryRuleCodeLiteralEnd() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:529:1: ( ruleCodeLiteralEnd EOF )
            // InternalEditorLanguage.g:530:1: ruleCodeLiteralEnd EOF
            {
             before(grammarAccess.getCodeLiteralEndRule()); 
            pushFollow(FOLLOW_1);
            ruleCodeLiteralEnd();

            state._fsp--;

             after(grammarAccess.getCodeLiteralEndRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCodeLiteralEnd"


    // $ANTLR start "ruleCodeLiteralEnd"
    // InternalEditorLanguage.g:537:1: ruleCodeLiteralEnd : ( ( rule__CodeLiteralEnd__ValueAssignment ) ) ;
    public final void ruleCodeLiteralEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:541:2: ( ( ( rule__CodeLiteralEnd__ValueAssignment ) ) )
            // InternalEditorLanguage.g:542:2: ( ( rule__CodeLiteralEnd__ValueAssignment ) )
            {
            // InternalEditorLanguage.g:542:2: ( ( rule__CodeLiteralEnd__ValueAssignment ) )
            // InternalEditorLanguage.g:543:3: ( rule__CodeLiteralEnd__ValueAssignment )
            {
             before(grammarAccess.getCodeLiteralEndAccess().getValueAssignment()); 
            // InternalEditorLanguage.g:544:3: ( rule__CodeLiteralEnd__ValueAssignment )
            // InternalEditorLanguage.g:544:4: rule__CodeLiteralEnd__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CodeLiteralEnd__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCodeLiteralEndAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleCodeLiteralEnd"


    // $ANTLR start "entryRuleJsSnippet"
    // InternalEditorLanguage.g:553:1: entryRuleJsSnippet : ruleJsSnippet EOF ;
    public final void entryRuleJsSnippet() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:554:1: ( ruleJsSnippet EOF )
            // InternalEditorLanguage.g:555:1: ruleJsSnippet EOF
            {
             before(grammarAccess.getJsSnippetRule()); 
            pushFollow(FOLLOW_1);
            ruleJsSnippet();

            state._fsp--;

             after(grammarAccess.getJsSnippetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJsSnippet"


    // $ANTLR start "ruleJsSnippet"
    // InternalEditorLanguage.g:562:1: ruleJsSnippet : ( ( rule__JsSnippet__Alternatives ) ) ;
    public final void ruleJsSnippet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:566:2: ( ( ( rule__JsSnippet__Alternatives ) ) )
            // InternalEditorLanguage.g:567:2: ( ( rule__JsSnippet__Alternatives ) )
            {
            // InternalEditorLanguage.g:567:2: ( ( rule__JsSnippet__Alternatives ) )
            // InternalEditorLanguage.g:568:3: ( rule__JsSnippet__Alternatives )
            {
             before(grammarAccess.getJsSnippetAccess().getAlternatives()); 
            // InternalEditorLanguage.g:569:3: ( rule__JsSnippet__Alternatives )
            // InternalEditorLanguage.g:569:4: rule__JsSnippet__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JsSnippet__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsSnippetAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJsSnippet"


    // $ANTLR start "entryRuleJsExtraTag"
    // InternalEditorLanguage.g:578:1: entryRuleJsExtraTag : ruleJsExtraTag EOF ;
    public final void entryRuleJsExtraTag() throws RecognitionException {
        try {
            // InternalEditorLanguage.g:579:1: ( ruleJsExtraTag EOF )
            // InternalEditorLanguage.g:580:1: ruleJsExtraTag EOF
            {
             before(grammarAccess.getJsExtraTagRule()); 
            pushFollow(FOLLOW_1);
            ruleJsExtraTag();

            state._fsp--;

             after(grammarAccess.getJsExtraTagRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJsExtraTag"


    // $ANTLR start "ruleJsExtraTag"
    // InternalEditorLanguage.g:587:1: ruleJsExtraTag : ( ruleTagId ) ;
    public final void ruleJsExtraTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:591:2: ( ( ruleTagId ) )
            // InternalEditorLanguage.g:592:2: ( ruleTagId )
            {
            // InternalEditorLanguage.g:592:2: ( ruleTagId )
            // InternalEditorLanguage.g:593:3: ruleTagId
            {
             before(grammarAccess.getJsExtraTagAccess().getTagIdParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTagId();

            state._fsp--;

             after(grammarAccess.getJsExtraTagAccess().getTagIdParserRuleCall()); 

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
    // $ANTLR end "ruleJsExtraTag"


    // $ANTLR start "rule__MainSection__Alternatives_1"
    // InternalEditorLanguage.g:602:1: rule__MainSection__Alternatives_1 : ( ( ( rule__MainSection__NodesAssignment_1_0 ) ) | ( ( rule__MainSection__ComponentsAssignment_1_1 ) ) );
    public final void rule__MainSection__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:606:1: ( ( ( rule__MainSection__NodesAssignment_1_0 ) ) | ( ( rule__MainSection__ComponentsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==29) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEditorLanguage.g:607:2: ( ( rule__MainSection__NodesAssignment_1_0 ) )
                    {
                    // InternalEditorLanguage.g:607:2: ( ( rule__MainSection__NodesAssignment_1_0 ) )
                    // InternalEditorLanguage.g:608:3: ( rule__MainSection__NodesAssignment_1_0 )
                    {
                     before(grammarAccess.getMainSectionAccess().getNodesAssignment_1_0()); 
                    // InternalEditorLanguage.g:609:3: ( rule__MainSection__NodesAssignment_1_0 )
                    // InternalEditorLanguage.g:609:4: rule__MainSection__NodesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainSection__NodesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainSectionAccess().getNodesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEditorLanguage.g:613:2: ( ( rule__MainSection__ComponentsAssignment_1_1 ) )
                    {
                    // InternalEditorLanguage.g:613:2: ( ( rule__MainSection__ComponentsAssignment_1_1 ) )
                    // InternalEditorLanguage.g:614:3: ( rule__MainSection__ComponentsAssignment_1_1 )
                    {
                     before(grammarAccess.getMainSectionAccess().getComponentsAssignment_1_1()); 
                    // InternalEditorLanguage.g:615:3: ( rule__MainSection__ComponentsAssignment_1_1 )
                    // InternalEditorLanguage.g:615:4: rule__MainSection__ComponentsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainSection__ComponentsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainSectionAccess().getComponentsAssignment_1_1()); 

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
    // $ANTLR end "rule__MainSection__Alternatives_1"


    // $ANTLR start "rule__NodeDeclaration__Alternatives_3"
    // InternalEditorLanguage.g:623:1: rule__NodeDeclaration__Alternatives_3 : ( ( ( rule__NodeDeclaration__ProjectionsAssignment_3_0 ) ) | ( ( rule__NodeDeclaration__ComponentsAssignment_3_1 ) ) );
    public final void rule__NodeDeclaration__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:627:1: ( ( ( rule__NodeDeclaration__ProjectionsAssignment_3_0 ) ) | ( ( rule__NodeDeclaration__ComponentsAssignment_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEditorLanguage.g:628:2: ( ( rule__NodeDeclaration__ProjectionsAssignment_3_0 ) )
                    {
                    // InternalEditorLanguage.g:628:2: ( ( rule__NodeDeclaration__ProjectionsAssignment_3_0 ) )
                    // InternalEditorLanguage.g:629:3: ( rule__NodeDeclaration__ProjectionsAssignment_3_0 )
                    {
                     before(grammarAccess.getNodeDeclarationAccess().getProjectionsAssignment_3_0()); 
                    // InternalEditorLanguage.g:630:3: ( rule__NodeDeclaration__ProjectionsAssignment_3_0 )
                    // InternalEditorLanguage.g:630:4: rule__NodeDeclaration__ProjectionsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeDeclaration__ProjectionsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDeclarationAccess().getProjectionsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEditorLanguage.g:634:2: ( ( rule__NodeDeclaration__ComponentsAssignment_3_1 ) )
                    {
                    // InternalEditorLanguage.g:634:2: ( ( rule__NodeDeclaration__ComponentsAssignment_3_1 ) )
                    // InternalEditorLanguage.g:635:3: ( rule__NodeDeclaration__ComponentsAssignment_3_1 )
                    {
                     before(grammarAccess.getNodeDeclarationAccess().getComponentsAssignment_3_1()); 
                    // InternalEditorLanguage.g:636:3: ( rule__NodeDeclaration__ComponentsAssignment_3_1 )
                    // InternalEditorLanguage.g:636:4: rule__NodeDeclaration__ComponentsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NodeDeclaration__ComponentsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDeclarationAccess().getComponentsAssignment_3_1()); 

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
    // $ANTLR end "rule__NodeDeclaration__Alternatives_3"


    // $ANTLR start "rule__ProjectionDeclaration__Alternatives_5"
    // InternalEditorLanguage.g:644:1: rule__ProjectionDeclaration__Alternatives_5 : ( ( ( rule__ProjectionDeclaration__AttributesAssignment_5_0 ) ) | ( ( rule__ProjectionDeclaration__ComponentsAssignment_5_1 ) ) );
    public final void rule__ProjectionDeclaration__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:648:1: ( ( ( rule__ProjectionDeclaration__AttributesAssignment_5_0 ) ) | ( ( rule__ProjectionDeclaration__ComponentsAssignment_5_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEditorLanguage.g:649:2: ( ( rule__ProjectionDeclaration__AttributesAssignment_5_0 ) )
                    {
                    // InternalEditorLanguage.g:649:2: ( ( rule__ProjectionDeclaration__AttributesAssignment_5_0 ) )
                    // InternalEditorLanguage.g:650:3: ( rule__ProjectionDeclaration__AttributesAssignment_5_0 )
                    {
                     before(grammarAccess.getProjectionDeclarationAccess().getAttributesAssignment_5_0()); 
                    // InternalEditorLanguage.g:651:3: ( rule__ProjectionDeclaration__AttributesAssignment_5_0 )
                    // InternalEditorLanguage.g:651:4: rule__ProjectionDeclaration__AttributesAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectionDeclaration__AttributesAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectionDeclarationAccess().getAttributesAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEditorLanguage.g:655:2: ( ( rule__ProjectionDeclaration__ComponentsAssignment_5_1 ) )
                    {
                    // InternalEditorLanguage.g:655:2: ( ( rule__ProjectionDeclaration__ComponentsAssignment_5_1 ) )
                    // InternalEditorLanguage.g:656:3: ( rule__ProjectionDeclaration__ComponentsAssignment_5_1 )
                    {
                     before(grammarAccess.getProjectionDeclarationAccess().getComponentsAssignment_5_1()); 
                    // InternalEditorLanguage.g:657:3: ( rule__ProjectionDeclaration__ComponentsAssignment_5_1 )
                    // InternalEditorLanguage.g:657:4: rule__ProjectionDeclaration__ComponentsAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProjectionDeclaration__ComponentsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectionDeclarationAccess().getComponentsAssignment_5_1()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__Alternatives_5"


    // $ANTLR start "rule__HtmlSnippet__Alternatives"
    // InternalEditorLanguage.g:665:1: rule__HtmlSnippet__Alternatives : ( ( ( rule__HtmlSnippet__Group_0__0 ) ) | ( ( rule__HtmlSnippet__Group_1__0 ) ) );
    public final void rule__HtmlSnippet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:669:1: ( ( ( rule__HtmlSnippet__Group_0__0 ) ) | ( ( rule__HtmlSnippet__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_CODENOTAG) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_CODESTART) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEditorLanguage.g:670:2: ( ( rule__HtmlSnippet__Group_0__0 ) )
                    {
                    // InternalEditorLanguage.g:670:2: ( ( rule__HtmlSnippet__Group_0__0 ) )
                    // InternalEditorLanguage.g:671:3: ( rule__HtmlSnippet__Group_0__0 )
                    {
                     before(grammarAccess.getHtmlSnippetAccess().getGroup_0()); 
                    // InternalEditorLanguage.g:672:3: ( rule__HtmlSnippet__Group_0__0 )
                    // InternalEditorLanguage.g:672:4: rule__HtmlSnippet__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HtmlSnippet__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHtmlSnippetAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEditorLanguage.g:676:2: ( ( rule__HtmlSnippet__Group_1__0 ) )
                    {
                    // InternalEditorLanguage.g:676:2: ( ( rule__HtmlSnippet__Group_1__0 ) )
                    // InternalEditorLanguage.g:677:3: ( rule__HtmlSnippet__Group_1__0 )
                    {
                     before(grammarAccess.getHtmlSnippetAccess().getGroup_1()); 
                    // InternalEditorLanguage.g:678:3: ( rule__HtmlSnippet__Group_1__0 )
                    // InternalEditorLanguage.g:678:4: rule__HtmlSnippet__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HtmlSnippet__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHtmlSnippetAccess().getGroup_1()); 

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
    // $ANTLR end "rule__HtmlSnippet__Alternatives"


    // $ANTLR start "rule__HtmlAnnotation__Alternatives"
    // InternalEditorLanguage.g:686:1: rule__HtmlAnnotation__Alternatives : ( ( ruleTagId ) | ( ruleChildId ) | ( ruleComponentId ) );
    public final void rule__HtmlAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:690:1: ( ( ruleTagId ) | ( ruleChildId ) | ( ruleComponentId ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEditorLanguage.g:691:2: ( ruleTagId )
                    {
                    // InternalEditorLanguage.g:691:2: ( ruleTagId )
                    // InternalEditorLanguage.g:692:3: ruleTagId
                    {
                     before(grammarAccess.getHtmlAnnotationAccess().getTagIdParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTagId();

                    state._fsp--;

                     after(grammarAccess.getHtmlAnnotationAccess().getTagIdParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEditorLanguage.g:697:2: ( ruleChildId )
                    {
                    // InternalEditorLanguage.g:697:2: ( ruleChildId )
                    // InternalEditorLanguage.g:698:3: ruleChildId
                    {
                     before(grammarAccess.getHtmlAnnotationAccess().getChildIdParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChildId();

                    state._fsp--;

                     after(grammarAccess.getHtmlAnnotationAccess().getChildIdParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEditorLanguage.g:703:2: ( ruleComponentId )
                    {
                    // InternalEditorLanguage.g:703:2: ( ruleComponentId )
                    // InternalEditorLanguage.g:704:3: ruleComponentId
                    {
                     before(grammarAccess.getHtmlAnnotationAccess().getComponentIdParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentId();

                    state._fsp--;

                     after(grammarAccess.getHtmlAnnotationAccess().getComponentIdParserRuleCall_2()); 

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
    // $ANTLR end "rule__HtmlAnnotation__Alternatives"


    // $ANTLR start "rule__JsSnippet__Alternatives"
    // InternalEditorLanguage.g:713:1: rule__JsSnippet__Alternatives : ( ( ( rule__JsSnippet__Group_0__0 ) ) | ( ( rule__JsSnippet__Group_1__0 ) ) );
    public final void rule__JsSnippet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:717:1: ( ( ( rule__JsSnippet__Group_0__0 ) ) | ( ( rule__JsSnippet__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CODENOTAG) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_CODESTART) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEditorLanguage.g:718:2: ( ( rule__JsSnippet__Group_0__0 ) )
                    {
                    // InternalEditorLanguage.g:718:2: ( ( rule__JsSnippet__Group_0__0 ) )
                    // InternalEditorLanguage.g:719:3: ( rule__JsSnippet__Group_0__0 )
                    {
                     before(grammarAccess.getJsSnippetAccess().getGroup_0()); 
                    // InternalEditorLanguage.g:720:3: ( rule__JsSnippet__Group_0__0 )
                    // InternalEditorLanguage.g:720:4: rule__JsSnippet__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsSnippet__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsSnippetAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEditorLanguage.g:724:2: ( ( rule__JsSnippet__Group_1__0 ) )
                    {
                    // InternalEditorLanguage.g:724:2: ( ( rule__JsSnippet__Group_1__0 ) )
                    // InternalEditorLanguage.g:725:3: ( rule__JsSnippet__Group_1__0 )
                    {
                     before(grammarAccess.getJsSnippetAccess().getGroup_1()); 
                    // InternalEditorLanguage.g:726:3: ( rule__JsSnippet__Group_1__0 )
                    // InternalEditorLanguage.g:726:4: rule__JsSnippet__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsSnippet__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsSnippetAccess().getGroup_1()); 

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
    // $ANTLR end "rule__JsSnippet__Alternatives"


    // $ANTLR start "rule__EditorDefinitionFile__Group__0"
    // InternalEditorLanguage.g:734:1: rule__EditorDefinitionFile__Group__0 : rule__EditorDefinitionFile__Group__0__Impl rule__EditorDefinitionFile__Group__1 ;
    public final void rule__EditorDefinitionFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:738:1: ( rule__EditorDefinitionFile__Group__0__Impl rule__EditorDefinitionFile__Group__1 )
            // InternalEditorLanguage.g:739:2: rule__EditorDefinitionFile__Group__0__Impl rule__EditorDefinitionFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EditorDefinitionFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditorDefinitionFile__Group__1();

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
    // $ANTLR end "rule__EditorDefinitionFile__Group__0"


    // $ANTLR start "rule__EditorDefinitionFile__Group__0__Impl"
    // InternalEditorLanguage.g:746:1: rule__EditorDefinitionFile__Group__0__Impl : ( ( rule__EditorDefinitionFile__ImportsAssignment_0 )? ) ;
    public final void rule__EditorDefinitionFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:750:1: ( ( ( rule__EditorDefinitionFile__ImportsAssignment_0 )? ) )
            // InternalEditorLanguage.g:751:1: ( ( rule__EditorDefinitionFile__ImportsAssignment_0 )? )
            {
            // InternalEditorLanguage.g:751:1: ( ( rule__EditorDefinitionFile__ImportsAssignment_0 )? )
            // InternalEditorLanguage.g:752:2: ( rule__EditorDefinitionFile__ImportsAssignment_0 )?
            {
             before(grammarAccess.getEditorDefinitionFileAccess().getImportsAssignment_0()); 
            // InternalEditorLanguage.g:753:2: ( rule__EditorDefinitionFile__ImportsAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEditorLanguage.g:753:3: rule__EditorDefinitionFile__ImportsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EditorDefinitionFile__ImportsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEditorDefinitionFileAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__EditorDefinitionFile__Group__0__Impl"


    // $ANTLR start "rule__EditorDefinitionFile__Group__1"
    // InternalEditorLanguage.g:761:1: rule__EditorDefinitionFile__Group__1 : rule__EditorDefinitionFile__Group__1__Impl ;
    public final void rule__EditorDefinitionFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:765:1: ( rule__EditorDefinitionFile__Group__1__Impl )
            // InternalEditorLanguage.g:766:2: rule__EditorDefinitionFile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EditorDefinitionFile__Group__1__Impl();

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
    // $ANTLR end "rule__EditorDefinitionFile__Group__1"


    // $ANTLR start "rule__EditorDefinitionFile__Group__1__Impl"
    // InternalEditorLanguage.g:772:1: rule__EditorDefinitionFile__Group__1__Impl : ( ( rule__EditorDefinitionFile__MainSectionAssignment_1 ) ) ;
    public final void rule__EditorDefinitionFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:776:1: ( ( ( rule__EditorDefinitionFile__MainSectionAssignment_1 ) ) )
            // InternalEditorLanguage.g:777:1: ( ( rule__EditorDefinitionFile__MainSectionAssignment_1 ) )
            {
            // InternalEditorLanguage.g:777:1: ( ( rule__EditorDefinitionFile__MainSectionAssignment_1 ) )
            // InternalEditorLanguage.g:778:2: ( rule__EditorDefinitionFile__MainSectionAssignment_1 )
            {
             before(grammarAccess.getEditorDefinitionFileAccess().getMainSectionAssignment_1()); 
            // InternalEditorLanguage.g:779:2: ( rule__EditorDefinitionFile__MainSectionAssignment_1 )
            // InternalEditorLanguage.g:779:3: rule__EditorDefinitionFile__MainSectionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EditorDefinitionFile__MainSectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEditorDefinitionFileAccess().getMainSectionAssignment_1()); 

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
    // $ANTLR end "rule__EditorDefinitionFile__Group__1__Impl"


    // $ANTLR start "rule__ImportSection__Group__0"
    // InternalEditorLanguage.g:788:1: rule__ImportSection__Group__0 : rule__ImportSection__Group__0__Impl rule__ImportSection__Group__1 ;
    public final void rule__ImportSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:792:1: ( rule__ImportSection__Group__0__Impl rule__ImportSection__Group__1 )
            // InternalEditorLanguage.g:793:2: rule__ImportSection__Group__0__Impl rule__ImportSection__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ImportSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportSection__Group__1();

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
    // $ANTLR end "rule__ImportSection__Group__0"


    // $ANTLR start "rule__ImportSection__Group__0__Impl"
    // InternalEditorLanguage.g:800:1: rule__ImportSection__Group__0__Impl : ( () ) ;
    public final void rule__ImportSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:804:1: ( ( () ) )
            // InternalEditorLanguage.g:805:1: ( () )
            {
            // InternalEditorLanguage.g:805:1: ( () )
            // InternalEditorLanguage.g:806:2: ()
            {
             before(grammarAccess.getImportSectionAccess().getImportSectionAction_0()); 
            // InternalEditorLanguage.g:807:2: ()
            // InternalEditorLanguage.g:807:3: 
            {
            }

             after(grammarAccess.getImportSectionAccess().getImportSectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportSection__Group__0__Impl"


    // $ANTLR start "rule__ImportSection__Group__1"
    // InternalEditorLanguage.g:815:1: rule__ImportSection__Group__1 : rule__ImportSection__Group__1__Impl ;
    public final void rule__ImportSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:819:1: ( rule__ImportSection__Group__1__Impl )
            // InternalEditorLanguage.g:820:2: rule__ImportSection__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportSection__Group__1__Impl();

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
    // $ANTLR end "rule__ImportSection__Group__1"


    // $ANTLR start "rule__ImportSection__Group__1__Impl"
    // InternalEditorLanguage.g:826:1: rule__ImportSection__Group__1__Impl : ( ( ( rule__ImportSection__ImportsAssignment_1 ) ) ( ( rule__ImportSection__ImportsAssignment_1 )* ) ) ;
    public final void rule__ImportSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:830:1: ( ( ( ( rule__ImportSection__ImportsAssignment_1 ) ) ( ( rule__ImportSection__ImportsAssignment_1 )* ) ) )
            // InternalEditorLanguage.g:831:1: ( ( ( rule__ImportSection__ImportsAssignment_1 ) ) ( ( rule__ImportSection__ImportsAssignment_1 )* ) )
            {
            // InternalEditorLanguage.g:831:1: ( ( ( rule__ImportSection__ImportsAssignment_1 ) ) ( ( rule__ImportSection__ImportsAssignment_1 )* ) )
            // InternalEditorLanguage.g:832:2: ( ( rule__ImportSection__ImportsAssignment_1 ) ) ( ( rule__ImportSection__ImportsAssignment_1 )* )
            {
            // InternalEditorLanguage.g:832:2: ( ( rule__ImportSection__ImportsAssignment_1 ) )
            // InternalEditorLanguage.g:833:3: ( rule__ImportSection__ImportsAssignment_1 )
            {
             before(grammarAccess.getImportSectionAccess().getImportsAssignment_1()); 
            // InternalEditorLanguage.g:834:3: ( rule__ImportSection__ImportsAssignment_1 )
            // InternalEditorLanguage.g:834:4: rule__ImportSection__ImportsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__ImportSection__ImportsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportSectionAccess().getImportsAssignment_1()); 

            }

            // InternalEditorLanguage.g:837:2: ( ( rule__ImportSection__ImportsAssignment_1 )* )
            // InternalEditorLanguage.g:838:3: ( rule__ImportSection__ImportsAssignment_1 )*
            {
             before(grammarAccess.getImportSectionAccess().getImportsAssignment_1()); 
            // InternalEditorLanguage.g:839:3: ( rule__ImportSection__ImportsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEditorLanguage.g:839:4: rule__ImportSection__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ImportSection__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getImportSectionAccess().getImportsAssignment_1()); 

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
    // $ANTLR end "rule__ImportSection__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalEditorLanguage.g:849:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:853:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalEditorLanguage.g:854:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalEditorLanguage.g:861:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:865:1: ( ( 'import' ) )
            // InternalEditorLanguage.g:866:1: ( 'import' )
            {
            // InternalEditorLanguage.g:866:1: ( 'import' )
            // InternalEditorLanguage.g:867:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalEditorLanguage.g:876:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:880:1: ( rule__Import__Group__1__Impl )
            // InternalEditorLanguage.g:881:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalEditorLanguage.g:887:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:891:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // InternalEditorLanguage.g:892:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // InternalEditorLanguage.g:892:1: ( ( rule__Import__NameAssignment_1 ) )
            // InternalEditorLanguage.g:893:2: ( rule__Import__NameAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            // InternalEditorLanguage.g:894:2: ( rule__Import__NameAssignment_1 )
            // InternalEditorLanguage.g:894:3: rule__Import__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalEditorLanguage.g:903:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:907:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalEditorLanguage.g:908:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEditorLanguage.g:915:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:919:1: ( ( RULE_ID ) )
            // InternalEditorLanguage.g:920:1: ( RULE_ID )
            {
            // InternalEditorLanguage.g:920:1: ( RULE_ID )
            // InternalEditorLanguage.g:921:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalEditorLanguage.g:930:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:934:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalEditorLanguage.g:935:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEditorLanguage.g:941:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:945:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalEditorLanguage.g:946:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalEditorLanguage.g:946:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalEditorLanguage.g:947:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalEditorLanguage.g:948:2: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEditorLanguage.g:948:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalEditorLanguage.g:957:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:961:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalEditorLanguage.g:962:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEditorLanguage.g:969:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:973:1: ( ( '.' ) )
            // InternalEditorLanguage.g:974:1: ( '.' )
            {
            // InternalEditorLanguage.g:974:1: ( '.' )
            // InternalEditorLanguage.g:975:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEditorLanguage.g:984:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:988:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalEditorLanguage.g:989:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEditorLanguage.g:995:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:999:1: ( ( RULE_ID ) )
            // InternalEditorLanguage.g:1000:1: ( RULE_ID )
            {
            // InternalEditorLanguage.g:1000:1: ( RULE_ID )
            // InternalEditorLanguage.g:1001:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__MainSection__Group__0"
    // InternalEditorLanguage.g:1011:1: rule__MainSection__Group__0 : rule__MainSection__Group__0__Impl rule__MainSection__Group__1 ;
    public final void rule__MainSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1015:1: ( rule__MainSection__Group__0__Impl rule__MainSection__Group__1 )
            // InternalEditorLanguage.g:1016:2: rule__MainSection__Group__0__Impl rule__MainSection__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MainSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainSection__Group__1();

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
    // $ANTLR end "rule__MainSection__Group__0"


    // $ANTLR start "rule__MainSection__Group__0__Impl"
    // InternalEditorLanguage.g:1023:1: rule__MainSection__Group__0__Impl : ( () ) ;
    public final void rule__MainSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1027:1: ( ( () ) )
            // InternalEditorLanguage.g:1028:1: ( () )
            {
            // InternalEditorLanguage.g:1028:1: ( () )
            // InternalEditorLanguage.g:1029:2: ()
            {
             before(grammarAccess.getMainSectionAccess().getMainSectionAction_0()); 
            // InternalEditorLanguage.g:1030:2: ()
            // InternalEditorLanguage.g:1030:3: 
            {
            }

             after(grammarAccess.getMainSectionAccess().getMainSectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainSection__Group__0__Impl"


    // $ANTLR start "rule__MainSection__Group__1"
    // InternalEditorLanguage.g:1038:1: rule__MainSection__Group__1 : rule__MainSection__Group__1__Impl ;
    public final void rule__MainSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1042:1: ( rule__MainSection__Group__1__Impl )
            // InternalEditorLanguage.g:1043:2: rule__MainSection__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainSection__Group__1__Impl();

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
    // $ANTLR end "rule__MainSection__Group__1"


    // $ANTLR start "rule__MainSection__Group__1__Impl"
    // InternalEditorLanguage.g:1049:1: rule__MainSection__Group__1__Impl : ( ( rule__MainSection__Alternatives_1 )* ) ;
    public final void rule__MainSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1053:1: ( ( ( rule__MainSection__Alternatives_1 )* ) )
            // InternalEditorLanguage.g:1054:1: ( ( rule__MainSection__Alternatives_1 )* )
            {
            // InternalEditorLanguage.g:1054:1: ( ( rule__MainSection__Alternatives_1 )* )
            // InternalEditorLanguage.g:1055:2: ( rule__MainSection__Alternatives_1 )*
            {
             before(grammarAccess.getMainSectionAccess().getAlternatives_1()); 
            // InternalEditorLanguage.g:1056:2: ( rule__MainSection__Alternatives_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16||LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEditorLanguage.g:1056:3: rule__MainSection__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MainSection__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMainSectionAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__MainSection__Group__1__Impl"


    // $ANTLR start "rule__NodeDeclaration__Group__0"
    // InternalEditorLanguage.g:1065:1: rule__NodeDeclaration__Group__0 : rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1 ;
    public final void rule__NodeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1069:1: ( rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1 )
            // InternalEditorLanguage.g:1070:2: rule__NodeDeclaration__Group__0__Impl rule__NodeDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__NodeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeDeclaration__Group__1();

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
    // $ANTLR end "rule__NodeDeclaration__Group__0"


    // $ANTLR start "rule__NodeDeclaration__Group__0__Impl"
    // InternalEditorLanguage.g:1077:1: rule__NodeDeclaration__Group__0__Impl : ( 'Node' ) ;
    public final void rule__NodeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1081:1: ( ( 'Node' ) )
            // InternalEditorLanguage.g:1082:1: ( 'Node' )
            {
            // InternalEditorLanguage.g:1082:1: ( 'Node' )
            // InternalEditorLanguage.g:1083:2: 'Node'
            {
             before(grammarAccess.getNodeDeclarationAccess().getNodeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNodeDeclarationAccess().getNodeKeyword_0()); 

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
    // $ANTLR end "rule__NodeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__NodeDeclaration__Group__1"
    // InternalEditorLanguage.g:1092:1: rule__NodeDeclaration__Group__1 : rule__NodeDeclaration__Group__1__Impl rule__NodeDeclaration__Group__2 ;
    public final void rule__NodeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1096:1: ( rule__NodeDeclaration__Group__1__Impl rule__NodeDeclaration__Group__2 )
            // InternalEditorLanguage.g:1097:2: rule__NodeDeclaration__Group__1__Impl rule__NodeDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__NodeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeDeclaration__Group__2();

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
    // $ANTLR end "rule__NodeDeclaration__Group__1"


    // $ANTLR start "rule__NodeDeclaration__Group__1__Impl"
    // InternalEditorLanguage.g:1104:1: rule__NodeDeclaration__Group__1__Impl : ( ( rule__NodeDeclaration__NodeNameAssignment_1 ) ) ;
    public final void rule__NodeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1108:1: ( ( ( rule__NodeDeclaration__NodeNameAssignment_1 ) ) )
            // InternalEditorLanguage.g:1109:1: ( ( rule__NodeDeclaration__NodeNameAssignment_1 ) )
            {
            // InternalEditorLanguage.g:1109:1: ( ( rule__NodeDeclaration__NodeNameAssignment_1 ) )
            // InternalEditorLanguage.g:1110:2: ( rule__NodeDeclaration__NodeNameAssignment_1 )
            {
             before(grammarAccess.getNodeDeclarationAccess().getNodeNameAssignment_1()); 
            // InternalEditorLanguage.g:1111:2: ( rule__NodeDeclaration__NodeNameAssignment_1 )
            // InternalEditorLanguage.g:1111:3: rule__NodeDeclaration__NodeNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeDeclaration__NodeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeDeclarationAccess().getNodeNameAssignment_1()); 

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
    // $ANTLR end "rule__NodeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__NodeDeclaration__Group__2"
    // InternalEditorLanguage.g:1119:1: rule__NodeDeclaration__Group__2 : rule__NodeDeclaration__Group__2__Impl rule__NodeDeclaration__Group__3 ;
    public final void rule__NodeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1123:1: ( rule__NodeDeclaration__Group__2__Impl rule__NodeDeclaration__Group__3 )
            // InternalEditorLanguage.g:1124:2: rule__NodeDeclaration__Group__2__Impl rule__NodeDeclaration__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__NodeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeDeclaration__Group__3();

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
    // $ANTLR end "rule__NodeDeclaration__Group__2"


    // $ANTLR start "rule__NodeDeclaration__Group__2__Impl"
    // InternalEditorLanguage.g:1131:1: rule__NodeDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__NodeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1135:1: ( ( '{' ) )
            // InternalEditorLanguage.g:1136:1: ( '{' )
            {
            // InternalEditorLanguage.g:1136:1: ( '{' )
            // InternalEditorLanguage.g:1137:2: '{'
            {
             before(grammarAccess.getNodeDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNodeDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__NodeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__NodeDeclaration__Group__3"
    // InternalEditorLanguage.g:1146:1: rule__NodeDeclaration__Group__3 : rule__NodeDeclaration__Group__3__Impl rule__NodeDeclaration__Group__4 ;
    public final void rule__NodeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1150:1: ( rule__NodeDeclaration__Group__3__Impl rule__NodeDeclaration__Group__4 )
            // InternalEditorLanguage.g:1151:2: rule__NodeDeclaration__Group__3__Impl rule__NodeDeclaration__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__NodeDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeDeclaration__Group__4();

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
    // $ANTLR end "rule__NodeDeclaration__Group__3"


    // $ANTLR start "rule__NodeDeclaration__Group__3__Impl"
    // InternalEditorLanguage.g:1158:1: rule__NodeDeclaration__Group__3__Impl : ( ( rule__NodeDeclaration__Alternatives_3 )* ) ;
    public final void rule__NodeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1162:1: ( ( ( rule__NodeDeclaration__Alternatives_3 )* ) )
            // InternalEditorLanguage.g:1163:1: ( ( rule__NodeDeclaration__Alternatives_3 )* )
            {
            // InternalEditorLanguage.g:1163:1: ( ( rule__NodeDeclaration__Alternatives_3 )* )
            // InternalEditorLanguage.g:1164:2: ( rule__NodeDeclaration__Alternatives_3 )*
            {
             before(grammarAccess.getNodeDeclarationAccess().getAlternatives_3()); 
            // InternalEditorLanguage.g:1165:2: ( rule__NodeDeclaration__Alternatives_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19||LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEditorLanguage.g:1165:3: rule__NodeDeclaration__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__NodeDeclaration__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getNodeDeclarationAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__NodeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__NodeDeclaration__Group__4"
    // InternalEditorLanguage.g:1173:1: rule__NodeDeclaration__Group__4 : rule__NodeDeclaration__Group__4__Impl ;
    public final void rule__NodeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1177:1: ( rule__NodeDeclaration__Group__4__Impl )
            // InternalEditorLanguage.g:1178:2: rule__NodeDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__NodeDeclaration__Group__4"


    // $ANTLR start "rule__NodeDeclaration__Group__4__Impl"
    // InternalEditorLanguage.g:1184:1: rule__NodeDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__NodeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1188:1: ( ( '}' ) )
            // InternalEditorLanguage.g:1189:1: ( '}' )
            {
            // InternalEditorLanguage.g:1189:1: ( '}' )
            // InternalEditorLanguage.g:1190:2: '}'
            {
             before(grammarAccess.getNodeDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNodeDeclarationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__NodeDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ProjectionDeclaration__Group__0"
    // InternalEditorLanguage.g:1200:1: rule__ProjectionDeclaration__Group__0 : rule__ProjectionDeclaration__Group__0__Impl rule__ProjectionDeclaration__Group__1 ;
    public final void rule__ProjectionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1204:1: ( rule__ProjectionDeclaration__Group__0__Impl rule__ProjectionDeclaration__Group__1 )
            // InternalEditorLanguage.g:1205:2: rule__ProjectionDeclaration__Group__0__Impl rule__ProjectionDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ProjectionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionDeclaration__Group__1();

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__0"


    // $ANTLR start "rule__ProjectionDeclaration__Group__0__Impl"
    // InternalEditorLanguage.g:1212:1: rule__ProjectionDeclaration__Group__0__Impl : ( 'Projection' ) ;
    public final void rule__ProjectionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1216:1: ( ( 'Projection' ) )
            // InternalEditorLanguage.g:1217:1: ( 'Projection' )
            {
            // InternalEditorLanguage.g:1217:1: ( 'Projection' )
            // InternalEditorLanguage.g:1218:2: 'Projection'
            {
             before(grammarAccess.getProjectionDeclarationAccess().getProjectionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProjectionDeclarationAccess().getProjectionKeyword_0()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ProjectionDeclaration__Group__1"
    // InternalEditorLanguage.g:1227:1: rule__ProjectionDeclaration__Group__1 : rule__ProjectionDeclaration__Group__1__Impl rule__ProjectionDeclaration__Group__2 ;
    public final void rule__ProjectionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1231:1: ( rule__ProjectionDeclaration__Group__1__Impl rule__ProjectionDeclaration__Group__2 )
            // InternalEditorLanguage.g:1232:2: rule__ProjectionDeclaration__Group__1__Impl rule__ProjectionDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ProjectionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionDeclaration__Group__2();

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__1"


    // $ANTLR start "rule__ProjectionDeclaration__Group__1__Impl"
    // InternalEditorLanguage.g:1239:1: rule__ProjectionDeclaration__Group__1__Impl : ( ( rule__ProjectionDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ProjectionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1243:1: ( ( ( rule__ProjectionDeclaration__NameAssignment_1 ) ) )
            // InternalEditorLanguage.g:1244:1: ( ( rule__ProjectionDeclaration__NameAssignment_1 ) )
            {
            // InternalEditorLanguage.g:1244:1: ( ( rule__ProjectionDeclaration__NameAssignment_1 ) )
            // InternalEditorLanguage.g:1245:2: ( rule__ProjectionDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getProjectionDeclarationAccess().getNameAssignment_1()); 
            // InternalEditorLanguage.g:1246:2: ( rule__ProjectionDeclaration__NameAssignment_1 )
            // InternalEditorLanguage.g:1246:3: rule__ProjectionDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectionDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ProjectionDeclaration__Group__2"
    // InternalEditorLanguage.g:1254:1: rule__ProjectionDeclaration__Group__2 : rule__ProjectionDeclaration__Group__2__Impl rule__ProjectionDeclaration__Group__3 ;
    public final void rule__ProjectionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1258:1: ( rule__ProjectionDeclaration__Group__2__Impl rule__ProjectionDeclaration__Group__3 )
            // InternalEditorLanguage.g:1259:2: rule__ProjectionDeclaration__Group__2__Impl rule__ProjectionDeclaration__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ProjectionDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionDeclaration__Group__3();

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__2"


    // $ANTLR start "rule__ProjectionDeclaration__Group__2__Impl"
    // InternalEditorLanguage.g:1266:1: rule__ProjectionDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__ProjectionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1270:1: ( ( '{' ) )
            // InternalEditorLanguage.g:1271:1: ( '{' )
            {
            // InternalEditorLanguage.g:1271:1: ( '{' )
            // InternalEditorLanguage.g:1272:2: '{'
            {
             before(grammarAccess.getProjectionDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProjectionDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ProjectionDeclaration__Group__3"
    // InternalEditorLanguage.g:1281:1: rule__ProjectionDeclaration__Group__3 : rule__ProjectionDeclaration__Group__3__Impl rule__ProjectionDeclaration__Group__4 ;
    public final void rule__ProjectionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1285:1: ( rule__ProjectionDeclaration__Group__3__Impl rule__ProjectionDeclaration__Group__4 )
            // InternalEditorLanguage.g:1286:2: rule__ProjectionDeclaration__Group__3__Impl rule__ProjectionDeclaration__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ProjectionDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionDeclaration__Group__4();

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__3"


    // $ANTLR start "rule__ProjectionDeclaration__Group__3__Impl"
    // InternalEditorLanguage.g:1293:1: rule__ProjectionDeclaration__Group__3__Impl : ( 'view:' ) ;
    public final void rule__ProjectionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1297:1: ( ( 'view:' ) )
            // InternalEditorLanguage.g:1298:1: ( 'view:' )
            {
            // InternalEditorLanguage.g:1298:1: ( 'view:' )
            // InternalEditorLanguage.g:1299:2: 'view:'
            {
             before(grammarAccess.getProjectionDeclarationAccess().getViewKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProjectionDeclarationAccess().getViewKeyword_3()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ProjectionDeclaration__Group__4"
    // InternalEditorLanguage.g:1308:1: rule__ProjectionDeclaration__Group__4 : rule__ProjectionDeclaration__Group__4__Impl rule__ProjectionDeclaration__Group__5 ;
    public final void rule__ProjectionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1312:1: ( rule__ProjectionDeclaration__Group__4__Impl rule__ProjectionDeclaration__Group__5 )
            // InternalEditorLanguage.g:1313:2: rule__ProjectionDeclaration__Group__4__Impl rule__ProjectionDeclaration__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ProjectionDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionDeclaration__Group__5();

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__4"


    // $ANTLR start "rule__ProjectionDeclaration__Group__4__Impl"
    // InternalEditorLanguage.g:1320:1: rule__ProjectionDeclaration__Group__4__Impl : ( ( rule__ProjectionDeclaration__ViewAssignment_4 ) ) ;
    public final void rule__ProjectionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1324:1: ( ( ( rule__ProjectionDeclaration__ViewAssignment_4 ) ) )
            // InternalEditorLanguage.g:1325:1: ( ( rule__ProjectionDeclaration__ViewAssignment_4 ) )
            {
            // InternalEditorLanguage.g:1325:1: ( ( rule__ProjectionDeclaration__ViewAssignment_4 ) )
            // InternalEditorLanguage.g:1326:2: ( rule__ProjectionDeclaration__ViewAssignment_4 )
            {
             before(grammarAccess.getProjectionDeclarationAccess().getViewAssignment_4()); 
            // InternalEditorLanguage.g:1327:2: ( rule__ProjectionDeclaration__ViewAssignment_4 )
            // InternalEditorLanguage.g:1327:3: rule__ProjectionDeclaration__ViewAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionDeclaration__ViewAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProjectionDeclarationAccess().getViewAssignment_4()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ProjectionDeclaration__Group__5"
    // InternalEditorLanguage.g:1335:1: rule__ProjectionDeclaration__Group__5 : rule__ProjectionDeclaration__Group__5__Impl rule__ProjectionDeclaration__Group__6 ;
    public final void rule__ProjectionDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1339:1: ( rule__ProjectionDeclaration__Group__5__Impl rule__ProjectionDeclaration__Group__6 )
            // InternalEditorLanguage.g:1340:2: rule__ProjectionDeclaration__Group__5__Impl rule__ProjectionDeclaration__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ProjectionDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProjectionDeclaration__Group__6();

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__5"


    // $ANTLR start "rule__ProjectionDeclaration__Group__5__Impl"
    // InternalEditorLanguage.g:1347:1: rule__ProjectionDeclaration__Group__5__Impl : ( ( rule__ProjectionDeclaration__Alternatives_5 )* ) ;
    public final void rule__ProjectionDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1351:1: ( ( ( rule__ProjectionDeclaration__Alternatives_5 )* ) )
            // InternalEditorLanguage.g:1352:1: ( ( rule__ProjectionDeclaration__Alternatives_5 )* )
            {
            // InternalEditorLanguage.g:1352:1: ( ( rule__ProjectionDeclaration__Alternatives_5 )* )
            // InternalEditorLanguage.g:1353:2: ( rule__ProjectionDeclaration__Alternatives_5 )*
            {
             before(grammarAccess.getProjectionDeclarationAccess().getAlternatives_5()); 
            // InternalEditorLanguage.g:1354:2: ( rule__ProjectionDeclaration__Alternatives_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21||LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEditorLanguage.g:1354:3: rule__ProjectionDeclaration__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ProjectionDeclaration__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProjectionDeclarationAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ProjectionDeclaration__Group__6"
    // InternalEditorLanguage.g:1362:1: rule__ProjectionDeclaration__Group__6 : rule__ProjectionDeclaration__Group__6__Impl ;
    public final void rule__ProjectionDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1366:1: ( rule__ProjectionDeclaration__Group__6__Impl )
            // InternalEditorLanguage.g:1367:2: rule__ProjectionDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProjectionDeclaration__Group__6__Impl();

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__6"


    // $ANTLR start "rule__ProjectionDeclaration__Group__6__Impl"
    // InternalEditorLanguage.g:1373:1: rule__ProjectionDeclaration__Group__6__Impl : ( '}' ) ;
    public final void rule__ProjectionDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1377:1: ( ( '}' ) )
            // InternalEditorLanguage.g:1378:1: ( '}' )
            {
            // InternalEditorLanguage.g:1378:1: ( '}' )
            // InternalEditorLanguage.g:1379:2: '}'
            {
             before(grammarAccess.getProjectionDeclarationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProjectionDeclarationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__Group__6__Impl"


    // $ANTLR start "rule__AttributeDeclaration__Group__0"
    // InternalEditorLanguage.g:1389:1: rule__AttributeDeclaration__Group__0 : rule__AttributeDeclaration__Group__0__Impl rule__AttributeDeclaration__Group__1 ;
    public final void rule__AttributeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1393:1: ( rule__AttributeDeclaration__Group__0__Impl rule__AttributeDeclaration__Group__1 )
            // InternalEditorLanguage.g:1394:2: rule__AttributeDeclaration__Group__0__Impl rule__AttributeDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AttributeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDeclaration__Group__1();

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
    // $ANTLR end "rule__AttributeDeclaration__Group__0"


    // $ANTLR start "rule__AttributeDeclaration__Group__0__Impl"
    // InternalEditorLanguage.g:1401:1: rule__AttributeDeclaration__Group__0__Impl : ( '@' ) ;
    public final void rule__AttributeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1405:1: ( ( '@' ) )
            // InternalEditorLanguage.g:1406:1: ( '@' )
            {
            // InternalEditorLanguage.g:1406:1: ( '@' )
            // InternalEditorLanguage.g:1407:2: '@'
            {
             before(grammarAccess.getAttributeDeclarationAccess().getCommercialAtKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeDeclarationAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__AttributeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__AttributeDeclaration__Group__1"
    // InternalEditorLanguage.g:1416:1: rule__AttributeDeclaration__Group__1 : rule__AttributeDeclaration__Group__1__Impl rule__AttributeDeclaration__Group__2 ;
    public final void rule__AttributeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1420:1: ( rule__AttributeDeclaration__Group__1__Impl rule__AttributeDeclaration__Group__2 )
            // InternalEditorLanguage.g:1421:2: rule__AttributeDeclaration__Group__1__Impl rule__AttributeDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AttributeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDeclaration__Group__2();

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
    // $ANTLR end "rule__AttributeDeclaration__Group__1"


    // $ANTLR start "rule__AttributeDeclaration__Group__1__Impl"
    // InternalEditorLanguage.g:1428:1: rule__AttributeDeclaration__Group__1__Impl : ( ( rule__AttributeDeclaration__AttributeNameAssignment_1 ) ) ;
    public final void rule__AttributeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1432:1: ( ( ( rule__AttributeDeclaration__AttributeNameAssignment_1 ) ) )
            // InternalEditorLanguage.g:1433:1: ( ( rule__AttributeDeclaration__AttributeNameAssignment_1 ) )
            {
            // InternalEditorLanguage.g:1433:1: ( ( rule__AttributeDeclaration__AttributeNameAssignment_1 ) )
            // InternalEditorLanguage.g:1434:2: ( rule__AttributeDeclaration__AttributeNameAssignment_1 )
            {
             before(grammarAccess.getAttributeDeclarationAccess().getAttributeNameAssignment_1()); 
            // InternalEditorLanguage.g:1435:2: ( rule__AttributeDeclaration__AttributeNameAssignment_1 )
            // InternalEditorLanguage.g:1435:3: rule__AttributeDeclaration__AttributeNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDeclaration__AttributeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDeclarationAccess().getAttributeNameAssignment_1()); 

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
    // $ANTLR end "rule__AttributeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__AttributeDeclaration__Group__2"
    // InternalEditorLanguage.g:1443:1: rule__AttributeDeclaration__Group__2 : rule__AttributeDeclaration__Group__2__Impl ;
    public final void rule__AttributeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1447:1: ( rule__AttributeDeclaration__Group__2__Impl )
            // InternalEditorLanguage.g:1448:2: rule__AttributeDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__AttributeDeclaration__Group__2"


    // $ANTLR start "rule__AttributeDeclaration__Group__2__Impl"
    // InternalEditorLanguage.g:1454:1: rule__AttributeDeclaration__Group__2__Impl : ( ( rule__AttributeDeclaration__ControllerAssignment_2 ) ) ;
    public final void rule__AttributeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1458:1: ( ( ( rule__AttributeDeclaration__ControllerAssignment_2 ) ) )
            // InternalEditorLanguage.g:1459:1: ( ( rule__AttributeDeclaration__ControllerAssignment_2 ) )
            {
            // InternalEditorLanguage.g:1459:1: ( ( rule__AttributeDeclaration__ControllerAssignment_2 ) )
            // InternalEditorLanguage.g:1460:2: ( rule__AttributeDeclaration__ControllerAssignment_2 )
            {
             before(grammarAccess.getAttributeDeclarationAccess().getControllerAssignment_2()); 
            // InternalEditorLanguage.g:1461:2: ( rule__AttributeDeclaration__ControllerAssignment_2 )
            // InternalEditorLanguage.g:1461:3: rule__AttributeDeclaration__ControllerAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDeclaration__ControllerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDeclarationAccess().getControllerAssignment_2()); 

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
    // $ANTLR end "rule__AttributeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ComponentId__Group__0"
    // InternalEditorLanguage.g:1470:1: rule__ComponentId__Group__0 : rule__ComponentId__Group__0__Impl rule__ComponentId__Group__1 ;
    public final void rule__ComponentId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1474:1: ( rule__ComponentId__Group__0__Impl rule__ComponentId__Group__1 )
            // InternalEditorLanguage.g:1475:2: rule__ComponentId__Group__0__Impl rule__ComponentId__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ComponentId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentId__Group__1();

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
    // $ANTLR end "rule__ComponentId__Group__0"


    // $ANTLR start "rule__ComponentId__Group__0__Impl"
    // InternalEditorLanguage.g:1482:1: rule__ComponentId__Group__0__Impl : ( '%' ) ;
    public final void rule__ComponentId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1486:1: ( ( '%' ) )
            // InternalEditorLanguage.g:1487:1: ( '%' )
            {
            // InternalEditorLanguage.g:1487:1: ( '%' )
            // InternalEditorLanguage.g:1488:2: '%'
            {
             before(grammarAccess.getComponentIdAccess().getPercentSignKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentIdAccess().getPercentSignKeyword_0()); 

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
    // $ANTLR end "rule__ComponentId__Group__0__Impl"


    // $ANTLR start "rule__ComponentId__Group__1"
    // InternalEditorLanguage.g:1497:1: rule__ComponentId__Group__1 : rule__ComponentId__Group__1__Impl rule__ComponentId__Group__2 ;
    public final void rule__ComponentId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1501:1: ( rule__ComponentId__Group__1__Impl rule__ComponentId__Group__2 )
            // InternalEditorLanguage.g:1502:2: rule__ComponentId__Group__1__Impl rule__ComponentId__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ComponentId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentId__Group__2();

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
    // $ANTLR end "rule__ComponentId__Group__1"


    // $ANTLR start "rule__ComponentId__Group__1__Impl"
    // InternalEditorLanguage.g:1509:1: rule__ComponentId__Group__1__Impl : ( ( rule__ComponentId__ComponentTypeAssignment_1 ) ) ;
    public final void rule__ComponentId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1513:1: ( ( ( rule__ComponentId__ComponentTypeAssignment_1 ) ) )
            // InternalEditorLanguage.g:1514:1: ( ( rule__ComponentId__ComponentTypeAssignment_1 ) )
            {
            // InternalEditorLanguage.g:1514:1: ( ( rule__ComponentId__ComponentTypeAssignment_1 ) )
            // InternalEditorLanguage.g:1515:2: ( rule__ComponentId__ComponentTypeAssignment_1 )
            {
             before(grammarAccess.getComponentIdAccess().getComponentTypeAssignment_1()); 
            // InternalEditorLanguage.g:1516:2: ( rule__ComponentId__ComponentTypeAssignment_1 )
            // InternalEditorLanguage.g:1516:3: rule__ComponentId__ComponentTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentId__ComponentTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentIdAccess().getComponentTypeAssignment_1()); 

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
    // $ANTLR end "rule__ComponentId__Group__1__Impl"


    // $ANTLR start "rule__ComponentId__Group__2"
    // InternalEditorLanguage.g:1524:1: rule__ComponentId__Group__2 : rule__ComponentId__Group__2__Impl rule__ComponentId__Group__3 ;
    public final void rule__ComponentId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1528:1: ( rule__ComponentId__Group__2__Impl rule__ComponentId__Group__3 )
            // InternalEditorLanguage.g:1529:2: rule__ComponentId__Group__2__Impl rule__ComponentId__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ComponentId__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentId__Group__3();

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
    // $ANTLR end "rule__ComponentId__Group__2"


    // $ANTLR start "rule__ComponentId__Group__2__Impl"
    // InternalEditorLanguage.g:1536:1: rule__ComponentId__Group__2__Impl : ( ( rule__ComponentId__Group_2__0 )? ) ;
    public final void rule__ComponentId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1540:1: ( ( ( rule__ComponentId__Group_2__0 )? ) )
            // InternalEditorLanguage.g:1541:1: ( ( rule__ComponentId__Group_2__0 )? )
            {
            // InternalEditorLanguage.g:1541:1: ( ( rule__ComponentId__Group_2__0 )? )
            // InternalEditorLanguage.g:1542:2: ( rule__ComponentId__Group_2__0 )?
            {
             before(grammarAccess.getComponentIdAccess().getGroup_2()); 
            // InternalEditorLanguage.g:1543:2: ( rule__ComponentId__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEditorLanguage.g:1543:3: rule__ComponentId__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentId__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentIdAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ComponentId__Group__2__Impl"


    // $ANTLR start "rule__ComponentId__Group__3"
    // InternalEditorLanguage.g:1551:1: rule__ComponentId__Group__3 : rule__ComponentId__Group__3__Impl ;
    public final void rule__ComponentId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1555:1: ( rule__ComponentId__Group__3__Impl )
            // InternalEditorLanguage.g:1556:2: rule__ComponentId__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentId__Group__3__Impl();

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
    // $ANTLR end "rule__ComponentId__Group__3"


    // $ANTLR start "rule__ComponentId__Group__3__Impl"
    // InternalEditorLanguage.g:1562:1: rule__ComponentId__Group__3__Impl : ( '%' ) ;
    public final void rule__ComponentId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1566:1: ( ( '%' ) )
            // InternalEditorLanguage.g:1567:1: ( '%' )
            {
            // InternalEditorLanguage.g:1567:1: ( '%' )
            // InternalEditorLanguage.g:1568:2: '%'
            {
             before(grammarAccess.getComponentIdAccess().getPercentSignKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentIdAccess().getPercentSignKeyword_3()); 

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
    // $ANTLR end "rule__ComponentId__Group__3__Impl"


    // $ANTLR start "rule__ComponentId__Group_2__0"
    // InternalEditorLanguage.g:1578:1: rule__ComponentId__Group_2__0 : rule__ComponentId__Group_2__0__Impl rule__ComponentId__Group_2__1 ;
    public final void rule__ComponentId__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1582:1: ( rule__ComponentId__Group_2__0__Impl rule__ComponentId__Group_2__1 )
            // InternalEditorLanguage.g:1583:2: rule__ComponentId__Group_2__0__Impl rule__ComponentId__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ComponentId__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentId__Group_2__1();

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
    // $ANTLR end "rule__ComponentId__Group_2__0"


    // $ANTLR start "rule__ComponentId__Group_2__0__Impl"
    // InternalEditorLanguage.g:1590:1: rule__ComponentId__Group_2__0__Impl : ( ':' ) ;
    public final void rule__ComponentId__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1594:1: ( ( ':' ) )
            // InternalEditorLanguage.g:1595:1: ( ':' )
            {
            // InternalEditorLanguage.g:1595:1: ( ':' )
            // InternalEditorLanguage.g:1596:2: ':'
            {
             before(grammarAccess.getComponentIdAccess().getColonKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentIdAccess().getColonKeyword_2_0()); 

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
    // $ANTLR end "rule__ComponentId__Group_2__0__Impl"


    // $ANTLR start "rule__ComponentId__Group_2__1"
    // InternalEditorLanguage.g:1605:1: rule__ComponentId__Group_2__1 : rule__ComponentId__Group_2__1__Impl ;
    public final void rule__ComponentId__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1609:1: ( rule__ComponentId__Group_2__1__Impl )
            // InternalEditorLanguage.g:1610:2: rule__ComponentId__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentId__Group_2__1__Impl();

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
    // $ANTLR end "rule__ComponentId__Group_2__1"


    // $ANTLR start "rule__ComponentId__Group_2__1__Impl"
    // InternalEditorLanguage.g:1616:1: rule__ComponentId__Group_2__1__Impl : ( ( rule__ComponentId__AttributeNameAssignment_2_1 ) ) ;
    public final void rule__ComponentId__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1620:1: ( ( ( rule__ComponentId__AttributeNameAssignment_2_1 ) ) )
            // InternalEditorLanguage.g:1621:1: ( ( rule__ComponentId__AttributeNameAssignment_2_1 ) )
            {
            // InternalEditorLanguage.g:1621:1: ( ( rule__ComponentId__AttributeNameAssignment_2_1 ) )
            // InternalEditorLanguage.g:1622:2: ( rule__ComponentId__AttributeNameAssignment_2_1 )
            {
             before(grammarAccess.getComponentIdAccess().getAttributeNameAssignment_2_1()); 
            // InternalEditorLanguage.g:1623:2: ( rule__ComponentId__AttributeNameAssignment_2_1 )
            // InternalEditorLanguage.g:1623:3: rule__ComponentId__AttributeNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentId__AttributeNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentIdAccess().getAttributeNameAssignment_2_1()); 

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
    // $ANTLR end "rule__ComponentId__Group_2__1__Impl"


    // $ANTLR start "rule__AttributeController__Group__0"
    // InternalEditorLanguage.g:1632:1: rule__AttributeController__Group__0 : rule__AttributeController__Group__0__Impl rule__AttributeController__Group__1 ;
    public final void rule__AttributeController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1636:1: ( rule__AttributeController__Group__0__Impl rule__AttributeController__Group__1 )
            // InternalEditorLanguage.g:1637:2: rule__AttributeController__Group__0__Impl rule__AttributeController__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__AttributeController__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeController__Group__1();

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
    // $ANTLR end "rule__AttributeController__Group__0"


    // $ANTLR start "rule__AttributeController__Group__0__Impl"
    // InternalEditorLanguage.g:1644:1: rule__AttributeController__Group__0__Impl : ( '{' ) ;
    public final void rule__AttributeController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1648:1: ( ( '{' ) )
            // InternalEditorLanguage.g:1649:1: ( '{' )
            {
            // InternalEditorLanguage.g:1649:1: ( '{' )
            // InternalEditorLanguage.g:1650:2: '{'
            {
             before(grammarAccess.getAttributeControllerAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAttributeControllerAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__AttributeController__Group__0__Impl"


    // $ANTLR start "rule__AttributeController__Group__1"
    // InternalEditorLanguage.g:1659:1: rule__AttributeController__Group__1 : rule__AttributeController__Group__1__Impl rule__AttributeController__Group__2 ;
    public final void rule__AttributeController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1663:1: ( rule__AttributeController__Group__1__Impl rule__AttributeController__Group__2 )
            // InternalEditorLanguage.g:1664:2: rule__AttributeController__Group__1__Impl rule__AttributeController__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AttributeController__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeController__Group__2();

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
    // $ANTLR end "rule__AttributeController__Group__1"


    // $ANTLR start "rule__AttributeController__Group__1__Impl"
    // InternalEditorLanguage.g:1671:1: rule__AttributeController__Group__1__Impl : ( 'get:' ) ;
    public final void rule__AttributeController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1675:1: ( ( 'get:' ) )
            // InternalEditorLanguage.g:1676:1: ( 'get:' )
            {
            // InternalEditorLanguage.g:1676:1: ( 'get:' )
            // InternalEditorLanguage.g:1677:2: 'get:'
            {
             before(grammarAccess.getAttributeControllerAccess().getGetKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeControllerAccess().getGetKeyword_1()); 

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
    // $ANTLR end "rule__AttributeController__Group__1__Impl"


    // $ANTLR start "rule__AttributeController__Group__2"
    // InternalEditorLanguage.g:1686:1: rule__AttributeController__Group__2 : rule__AttributeController__Group__2__Impl rule__AttributeController__Group__3 ;
    public final void rule__AttributeController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1690:1: ( rule__AttributeController__Group__2__Impl rule__AttributeController__Group__3 )
            // InternalEditorLanguage.g:1691:2: rule__AttributeController__Group__2__Impl rule__AttributeController__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__AttributeController__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeController__Group__3();

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
    // $ANTLR end "rule__AttributeController__Group__2"


    // $ANTLR start "rule__AttributeController__Group__2__Impl"
    // InternalEditorLanguage.g:1698:1: rule__AttributeController__Group__2__Impl : ( ( rule__AttributeController__GetterAssignment_2 ) ) ;
    public final void rule__AttributeController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1702:1: ( ( ( rule__AttributeController__GetterAssignment_2 ) ) )
            // InternalEditorLanguage.g:1703:1: ( ( rule__AttributeController__GetterAssignment_2 ) )
            {
            // InternalEditorLanguage.g:1703:1: ( ( rule__AttributeController__GetterAssignment_2 ) )
            // InternalEditorLanguage.g:1704:2: ( rule__AttributeController__GetterAssignment_2 )
            {
             before(grammarAccess.getAttributeControllerAccess().getGetterAssignment_2()); 
            // InternalEditorLanguage.g:1705:2: ( rule__AttributeController__GetterAssignment_2 )
            // InternalEditorLanguage.g:1705:3: rule__AttributeController__GetterAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeController__GetterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeControllerAccess().getGetterAssignment_2()); 

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
    // $ANTLR end "rule__AttributeController__Group__2__Impl"


    // $ANTLR start "rule__AttributeController__Group__3"
    // InternalEditorLanguage.g:1713:1: rule__AttributeController__Group__3 : rule__AttributeController__Group__3__Impl rule__AttributeController__Group__4 ;
    public final void rule__AttributeController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1717:1: ( rule__AttributeController__Group__3__Impl rule__AttributeController__Group__4 )
            // InternalEditorLanguage.g:1718:2: rule__AttributeController__Group__3__Impl rule__AttributeController__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__AttributeController__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeController__Group__4();

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
    // $ANTLR end "rule__AttributeController__Group__3"


    // $ANTLR start "rule__AttributeController__Group__3__Impl"
    // InternalEditorLanguage.g:1725:1: rule__AttributeController__Group__3__Impl : ( 'set:' ) ;
    public final void rule__AttributeController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1729:1: ( ( 'set:' ) )
            // InternalEditorLanguage.g:1730:1: ( 'set:' )
            {
            // InternalEditorLanguage.g:1730:1: ( 'set:' )
            // InternalEditorLanguage.g:1731:2: 'set:'
            {
             before(grammarAccess.getAttributeControllerAccess().getSetKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeControllerAccess().getSetKeyword_3()); 

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
    // $ANTLR end "rule__AttributeController__Group__3__Impl"


    // $ANTLR start "rule__AttributeController__Group__4"
    // InternalEditorLanguage.g:1740:1: rule__AttributeController__Group__4 : rule__AttributeController__Group__4__Impl rule__AttributeController__Group__5 ;
    public final void rule__AttributeController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1744:1: ( rule__AttributeController__Group__4__Impl rule__AttributeController__Group__5 )
            // InternalEditorLanguage.g:1745:2: rule__AttributeController__Group__4__Impl rule__AttributeController__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__AttributeController__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeController__Group__5();

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
    // $ANTLR end "rule__AttributeController__Group__4"


    // $ANTLR start "rule__AttributeController__Group__4__Impl"
    // InternalEditorLanguage.g:1752:1: rule__AttributeController__Group__4__Impl : ( ( rule__AttributeController__SetterAssignment_4 ) ) ;
    public final void rule__AttributeController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1756:1: ( ( ( rule__AttributeController__SetterAssignment_4 ) ) )
            // InternalEditorLanguage.g:1757:1: ( ( rule__AttributeController__SetterAssignment_4 ) )
            {
            // InternalEditorLanguage.g:1757:1: ( ( rule__AttributeController__SetterAssignment_4 ) )
            // InternalEditorLanguage.g:1758:2: ( rule__AttributeController__SetterAssignment_4 )
            {
             before(grammarAccess.getAttributeControllerAccess().getSetterAssignment_4()); 
            // InternalEditorLanguage.g:1759:2: ( rule__AttributeController__SetterAssignment_4 )
            // InternalEditorLanguage.g:1759:3: rule__AttributeController__SetterAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AttributeController__SetterAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeControllerAccess().getSetterAssignment_4()); 

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
    // $ANTLR end "rule__AttributeController__Group__4__Impl"


    // $ANTLR start "rule__AttributeController__Group__5"
    // InternalEditorLanguage.g:1767:1: rule__AttributeController__Group__5 : rule__AttributeController__Group__5__Impl rule__AttributeController__Group__6 ;
    public final void rule__AttributeController__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1771:1: ( rule__AttributeController__Group__5__Impl rule__AttributeController__Group__6 )
            // InternalEditorLanguage.g:1772:2: rule__AttributeController__Group__5__Impl rule__AttributeController__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__AttributeController__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeController__Group__6();

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
    // $ANTLR end "rule__AttributeController__Group__5"


    // $ANTLR start "rule__AttributeController__Group__5__Impl"
    // InternalEditorLanguage.g:1779:1: rule__AttributeController__Group__5__Impl : ( 'validate:' ) ;
    public final void rule__AttributeController__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1783:1: ( ( 'validate:' ) )
            // InternalEditorLanguage.g:1784:1: ( 'validate:' )
            {
            // InternalEditorLanguage.g:1784:1: ( 'validate:' )
            // InternalEditorLanguage.g:1785:2: 'validate:'
            {
             before(grammarAccess.getAttributeControllerAccess().getValidateKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeControllerAccess().getValidateKeyword_5()); 

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
    // $ANTLR end "rule__AttributeController__Group__5__Impl"


    // $ANTLR start "rule__AttributeController__Group__6"
    // InternalEditorLanguage.g:1794:1: rule__AttributeController__Group__6 : rule__AttributeController__Group__6__Impl rule__AttributeController__Group__7 ;
    public final void rule__AttributeController__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1798:1: ( rule__AttributeController__Group__6__Impl rule__AttributeController__Group__7 )
            // InternalEditorLanguage.g:1799:2: rule__AttributeController__Group__6__Impl rule__AttributeController__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__AttributeController__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeController__Group__7();

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
    // $ANTLR end "rule__AttributeController__Group__6"


    // $ANTLR start "rule__AttributeController__Group__6__Impl"
    // InternalEditorLanguage.g:1806:1: rule__AttributeController__Group__6__Impl : ( ( rule__AttributeController__ValidatorAssignment_6 ) ) ;
    public final void rule__AttributeController__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1810:1: ( ( ( rule__AttributeController__ValidatorAssignment_6 ) ) )
            // InternalEditorLanguage.g:1811:1: ( ( rule__AttributeController__ValidatorAssignment_6 ) )
            {
            // InternalEditorLanguage.g:1811:1: ( ( rule__AttributeController__ValidatorAssignment_6 ) )
            // InternalEditorLanguage.g:1812:2: ( rule__AttributeController__ValidatorAssignment_6 )
            {
             before(grammarAccess.getAttributeControllerAccess().getValidatorAssignment_6()); 
            // InternalEditorLanguage.g:1813:2: ( rule__AttributeController__ValidatorAssignment_6 )
            // InternalEditorLanguage.g:1813:3: rule__AttributeController__ValidatorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AttributeController__ValidatorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAttributeControllerAccess().getValidatorAssignment_6()); 

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
    // $ANTLR end "rule__AttributeController__Group__6__Impl"


    // $ANTLR start "rule__AttributeController__Group__7"
    // InternalEditorLanguage.g:1821:1: rule__AttributeController__Group__7 : rule__AttributeController__Group__7__Impl ;
    public final void rule__AttributeController__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1825:1: ( rule__AttributeController__Group__7__Impl )
            // InternalEditorLanguage.g:1826:2: rule__AttributeController__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeController__Group__7__Impl();

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
    // $ANTLR end "rule__AttributeController__Group__7"


    // $ANTLR start "rule__AttributeController__Group__7__Impl"
    // InternalEditorLanguage.g:1832:1: rule__AttributeController__Group__7__Impl : ( '}' ) ;
    public final void rule__AttributeController__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1836:1: ( ( '}' ) )
            // InternalEditorLanguage.g:1837:1: ( '}' )
            {
            // InternalEditorLanguage.g:1837:1: ( '}' )
            // InternalEditorLanguage.g:1838:2: '}'
            {
             before(grammarAccess.getAttributeControllerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeControllerAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__AttributeController__Group__7__Impl"


    // $ANTLR start "rule__ChildId__Group__0"
    // InternalEditorLanguage.g:1848:1: rule__ChildId__Group__0 : rule__ChildId__Group__0__Impl rule__ChildId__Group__1 ;
    public final void rule__ChildId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1852:1: ( rule__ChildId__Group__0__Impl rule__ChildId__Group__1 )
            // InternalEditorLanguage.g:1853:2: rule__ChildId__Group__0__Impl rule__ChildId__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ChildId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChildId__Group__1();

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
    // $ANTLR end "rule__ChildId__Group__0"


    // $ANTLR start "rule__ChildId__Group__0__Impl"
    // InternalEditorLanguage.g:1860:1: rule__ChildId__Group__0__Impl : ( '!' ) ;
    public final void rule__ChildId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1864:1: ( ( '!' ) )
            // InternalEditorLanguage.g:1865:1: ( '!' )
            {
            // InternalEditorLanguage.g:1865:1: ( '!' )
            // InternalEditorLanguage.g:1866:2: '!'
            {
             before(grammarAccess.getChildIdAccess().getExclamationMarkKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChildIdAccess().getExclamationMarkKeyword_0()); 

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
    // $ANTLR end "rule__ChildId__Group__0__Impl"


    // $ANTLR start "rule__ChildId__Group__1"
    // InternalEditorLanguage.g:1875:1: rule__ChildId__Group__1 : rule__ChildId__Group__1__Impl rule__ChildId__Group__2 ;
    public final void rule__ChildId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1879:1: ( rule__ChildId__Group__1__Impl rule__ChildId__Group__2 )
            // InternalEditorLanguage.g:1880:2: rule__ChildId__Group__1__Impl rule__ChildId__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ChildId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChildId__Group__2();

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
    // $ANTLR end "rule__ChildId__Group__1"


    // $ANTLR start "rule__ChildId__Group__1__Impl"
    // InternalEditorLanguage.g:1887:1: rule__ChildId__Group__1__Impl : ( ( rule__ChildId__ChildIdAssignment_1 ) ) ;
    public final void rule__ChildId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1891:1: ( ( ( rule__ChildId__ChildIdAssignment_1 ) ) )
            // InternalEditorLanguage.g:1892:1: ( ( rule__ChildId__ChildIdAssignment_1 ) )
            {
            // InternalEditorLanguage.g:1892:1: ( ( rule__ChildId__ChildIdAssignment_1 ) )
            // InternalEditorLanguage.g:1893:2: ( rule__ChildId__ChildIdAssignment_1 )
            {
             before(grammarAccess.getChildIdAccess().getChildIdAssignment_1()); 
            // InternalEditorLanguage.g:1894:2: ( rule__ChildId__ChildIdAssignment_1 )
            // InternalEditorLanguage.g:1894:3: rule__ChildId__ChildIdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChildId__ChildIdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChildIdAccess().getChildIdAssignment_1()); 

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
    // $ANTLR end "rule__ChildId__Group__1__Impl"


    // $ANTLR start "rule__ChildId__Group__2"
    // InternalEditorLanguage.g:1902:1: rule__ChildId__Group__2 : rule__ChildId__Group__2__Impl rule__ChildId__Group__3 ;
    public final void rule__ChildId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1906:1: ( rule__ChildId__Group__2__Impl rule__ChildId__Group__3 )
            // InternalEditorLanguage.g:1907:2: rule__ChildId__Group__2__Impl rule__ChildId__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ChildId__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChildId__Group__3();

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
    // $ANTLR end "rule__ChildId__Group__2"


    // $ANTLR start "rule__ChildId__Group__2__Impl"
    // InternalEditorLanguage.g:1914:1: rule__ChildId__Group__2__Impl : ( ':' ) ;
    public final void rule__ChildId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1918:1: ( ( ':' ) )
            // InternalEditorLanguage.g:1919:1: ( ':' )
            {
            // InternalEditorLanguage.g:1919:1: ( ':' )
            // InternalEditorLanguage.g:1920:2: ':'
            {
             before(grammarAccess.getChildIdAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChildIdAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__ChildId__Group__2__Impl"


    // $ANTLR start "rule__ChildId__Group__3"
    // InternalEditorLanguage.g:1929:1: rule__ChildId__Group__3 : rule__ChildId__Group__3__Impl rule__ChildId__Group__4 ;
    public final void rule__ChildId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1933:1: ( rule__ChildId__Group__3__Impl rule__ChildId__Group__4 )
            // InternalEditorLanguage.g:1934:2: rule__ChildId__Group__3__Impl rule__ChildId__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ChildId__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChildId__Group__4();

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
    // $ANTLR end "rule__ChildId__Group__3"


    // $ANTLR start "rule__ChildId__Group__3__Impl"
    // InternalEditorLanguage.g:1941:1: rule__ChildId__Group__3__Impl : ( ( rule__ChildId__ProjectionIdAssignment_3 ) ) ;
    public final void rule__ChildId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1945:1: ( ( ( rule__ChildId__ProjectionIdAssignment_3 ) ) )
            // InternalEditorLanguage.g:1946:1: ( ( rule__ChildId__ProjectionIdAssignment_3 ) )
            {
            // InternalEditorLanguage.g:1946:1: ( ( rule__ChildId__ProjectionIdAssignment_3 ) )
            // InternalEditorLanguage.g:1947:2: ( rule__ChildId__ProjectionIdAssignment_3 )
            {
             before(grammarAccess.getChildIdAccess().getProjectionIdAssignment_3()); 
            // InternalEditorLanguage.g:1948:2: ( rule__ChildId__ProjectionIdAssignment_3 )
            // InternalEditorLanguage.g:1948:3: rule__ChildId__ProjectionIdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChildId__ProjectionIdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChildIdAccess().getProjectionIdAssignment_3()); 

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
    // $ANTLR end "rule__ChildId__Group__3__Impl"


    // $ANTLR start "rule__ChildId__Group__4"
    // InternalEditorLanguage.g:1956:1: rule__ChildId__Group__4 : rule__ChildId__Group__4__Impl ;
    public final void rule__ChildId__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1960:1: ( rule__ChildId__Group__4__Impl )
            // InternalEditorLanguage.g:1961:2: rule__ChildId__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChildId__Group__4__Impl();

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
    // $ANTLR end "rule__ChildId__Group__4"


    // $ANTLR start "rule__ChildId__Group__4__Impl"
    // InternalEditorLanguage.g:1967:1: rule__ChildId__Group__4__Impl : ( '!' ) ;
    public final void rule__ChildId__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1971:1: ( ( '!' ) )
            // InternalEditorLanguage.g:1972:1: ( '!' )
            {
            // InternalEditorLanguage.g:1972:1: ( '!' )
            // InternalEditorLanguage.g:1973:2: '!'
            {
             before(grammarAccess.getChildIdAccess().getExclamationMarkKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChildIdAccess().getExclamationMarkKeyword_4()); 

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
    // $ANTLR end "rule__ChildId__Group__4__Impl"


    // $ANTLR start "rule__TagId__Group__0"
    // InternalEditorLanguage.g:1983:1: rule__TagId__Group__0 : rule__TagId__Group__0__Impl rule__TagId__Group__1 ;
    public final void rule__TagId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1987:1: ( rule__TagId__Group__0__Impl rule__TagId__Group__1 )
            // InternalEditorLanguage.g:1988:2: rule__TagId__Group__0__Impl rule__TagId__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TagId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TagId__Group__1();

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
    // $ANTLR end "rule__TagId__Group__0"


    // $ANTLR start "rule__TagId__Group__0__Impl"
    // InternalEditorLanguage.g:1995:1: rule__TagId__Group__0__Impl : ( '$' ) ;
    public final void rule__TagId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:1999:1: ( ( '$' ) )
            // InternalEditorLanguage.g:2000:1: ( '$' )
            {
            // InternalEditorLanguage.g:2000:1: ( '$' )
            // InternalEditorLanguage.g:2001:2: '$'
            {
             before(grammarAccess.getTagIdAccess().getDollarSignKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTagIdAccess().getDollarSignKeyword_0()); 

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
    // $ANTLR end "rule__TagId__Group__0__Impl"


    // $ANTLR start "rule__TagId__Group__1"
    // InternalEditorLanguage.g:2010:1: rule__TagId__Group__1 : rule__TagId__Group__1__Impl rule__TagId__Group__2 ;
    public final void rule__TagId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2014:1: ( rule__TagId__Group__1__Impl rule__TagId__Group__2 )
            // InternalEditorLanguage.g:2015:2: rule__TagId__Group__1__Impl rule__TagId__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__TagId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TagId__Group__2();

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
    // $ANTLR end "rule__TagId__Group__1"


    // $ANTLR start "rule__TagId__Group__1__Impl"
    // InternalEditorLanguage.g:2022:1: rule__TagId__Group__1__Impl : ( ( rule__TagId__TagNameAssignment_1 ) ) ;
    public final void rule__TagId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2026:1: ( ( ( rule__TagId__TagNameAssignment_1 ) ) )
            // InternalEditorLanguage.g:2027:1: ( ( rule__TagId__TagNameAssignment_1 ) )
            {
            // InternalEditorLanguage.g:2027:1: ( ( rule__TagId__TagNameAssignment_1 ) )
            // InternalEditorLanguage.g:2028:2: ( rule__TagId__TagNameAssignment_1 )
            {
             before(grammarAccess.getTagIdAccess().getTagNameAssignment_1()); 
            // InternalEditorLanguage.g:2029:2: ( rule__TagId__TagNameAssignment_1 )
            // InternalEditorLanguage.g:2029:3: rule__TagId__TagNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TagId__TagNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagIdAccess().getTagNameAssignment_1()); 

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
    // $ANTLR end "rule__TagId__Group__1__Impl"


    // $ANTLR start "rule__TagId__Group__2"
    // InternalEditorLanguage.g:2037:1: rule__TagId__Group__2 : rule__TagId__Group__2__Impl ;
    public final void rule__TagId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2041:1: ( rule__TagId__Group__2__Impl )
            // InternalEditorLanguage.g:2042:2: rule__TagId__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TagId__Group__2__Impl();

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
    // $ANTLR end "rule__TagId__Group__2"


    // $ANTLR start "rule__TagId__Group__2__Impl"
    // InternalEditorLanguage.g:2048:1: rule__TagId__Group__2__Impl : ( '$' ) ;
    public final void rule__TagId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2052:1: ( ( '$' ) )
            // InternalEditorLanguage.g:2053:1: ( '$' )
            {
            // InternalEditorLanguage.g:2053:1: ( '$' )
            // InternalEditorLanguage.g:2054:2: '$'
            {
             before(grammarAccess.getTagIdAccess().getDollarSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTagIdAccess().getDollarSignKeyword_2()); 

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
    // $ANTLR end "rule__TagId__Group__2__Impl"


    // $ANTLR start "rule__ComponentDeclaration__Group__0"
    // InternalEditorLanguage.g:2064:1: rule__ComponentDeclaration__Group__0 : rule__ComponentDeclaration__Group__0__Impl rule__ComponentDeclaration__Group__1 ;
    public final void rule__ComponentDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2068:1: ( rule__ComponentDeclaration__Group__0__Impl rule__ComponentDeclaration__Group__1 )
            // InternalEditorLanguage.g:2069:2: rule__ComponentDeclaration__Group__0__Impl rule__ComponentDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ComponentDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDeclaration__Group__1();

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
    // $ANTLR end "rule__ComponentDeclaration__Group__0"


    // $ANTLR start "rule__ComponentDeclaration__Group__0__Impl"
    // InternalEditorLanguage.g:2076:1: rule__ComponentDeclaration__Group__0__Impl : ( 'Component' ) ;
    public final void rule__ComponentDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2080:1: ( ( 'Component' ) )
            // InternalEditorLanguage.g:2081:1: ( 'Component' )
            {
            // InternalEditorLanguage.g:2081:1: ( 'Component' )
            // InternalEditorLanguage.g:2082:2: 'Component'
            {
             before(grammarAccess.getComponentDeclarationAccess().getComponentKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentDeclarationAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__ComponentDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ComponentDeclaration__Group__1"
    // InternalEditorLanguage.g:2091:1: rule__ComponentDeclaration__Group__1 : rule__ComponentDeclaration__Group__1__Impl rule__ComponentDeclaration__Group__2 ;
    public final void rule__ComponentDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2095:1: ( rule__ComponentDeclaration__Group__1__Impl rule__ComponentDeclaration__Group__2 )
            // InternalEditorLanguage.g:2096:2: rule__ComponentDeclaration__Group__1__Impl rule__ComponentDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ComponentDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDeclaration__Group__2();

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
    // $ANTLR end "rule__ComponentDeclaration__Group__1"


    // $ANTLR start "rule__ComponentDeclaration__Group__1__Impl"
    // InternalEditorLanguage.g:2103:1: rule__ComponentDeclaration__Group__1__Impl : ( ( rule__ComponentDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ComponentDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2107:1: ( ( ( rule__ComponentDeclaration__NameAssignment_1 ) ) )
            // InternalEditorLanguage.g:2108:1: ( ( rule__ComponentDeclaration__NameAssignment_1 ) )
            {
            // InternalEditorLanguage.g:2108:1: ( ( rule__ComponentDeclaration__NameAssignment_1 ) )
            // InternalEditorLanguage.g:2109:2: ( rule__ComponentDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getComponentDeclarationAccess().getNameAssignment_1()); 
            // InternalEditorLanguage.g:2110:2: ( rule__ComponentDeclaration__NameAssignment_1 )
            // InternalEditorLanguage.g:2110:3: rule__ComponentDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ComponentDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ComponentDeclaration__Group__2"
    // InternalEditorLanguage.g:2118:1: rule__ComponentDeclaration__Group__2 : rule__ComponentDeclaration__Group__2__Impl rule__ComponentDeclaration__Group__3 ;
    public final void rule__ComponentDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2122:1: ( rule__ComponentDeclaration__Group__2__Impl rule__ComponentDeclaration__Group__3 )
            // InternalEditorLanguage.g:2123:2: rule__ComponentDeclaration__Group__2__Impl rule__ComponentDeclaration__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ComponentDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDeclaration__Group__3();

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
    // $ANTLR end "rule__ComponentDeclaration__Group__2"


    // $ANTLR start "rule__ComponentDeclaration__Group__2__Impl"
    // InternalEditorLanguage.g:2130:1: rule__ComponentDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__ComponentDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2134:1: ( ( '{' ) )
            // InternalEditorLanguage.g:2135:1: ( '{' )
            {
            // InternalEditorLanguage.g:2135:1: ( '{' )
            // InternalEditorLanguage.g:2136:2: '{'
            {
             before(grammarAccess.getComponentDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ComponentDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ComponentDeclaration__Group__3"
    // InternalEditorLanguage.g:2145:1: rule__ComponentDeclaration__Group__3 : rule__ComponentDeclaration__Group__3__Impl rule__ComponentDeclaration__Group__4 ;
    public final void rule__ComponentDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2149:1: ( rule__ComponentDeclaration__Group__3__Impl rule__ComponentDeclaration__Group__4 )
            // InternalEditorLanguage.g:2150:2: rule__ComponentDeclaration__Group__3__Impl rule__ComponentDeclaration__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ComponentDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDeclaration__Group__4();

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
    // $ANTLR end "rule__ComponentDeclaration__Group__3"


    // $ANTLR start "rule__ComponentDeclaration__Group__3__Impl"
    // InternalEditorLanguage.g:2157:1: rule__ComponentDeclaration__Group__3__Impl : ( 'view:' ) ;
    public final void rule__ComponentDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2161:1: ( ( 'view:' ) )
            // InternalEditorLanguage.g:2162:1: ( 'view:' )
            {
            // InternalEditorLanguage.g:2162:1: ( 'view:' )
            // InternalEditorLanguage.g:2163:2: 'view:'
            {
             before(grammarAccess.getComponentDeclarationAccess().getViewKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentDeclarationAccess().getViewKeyword_3()); 

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
    // $ANTLR end "rule__ComponentDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ComponentDeclaration__Group__4"
    // InternalEditorLanguage.g:2172:1: rule__ComponentDeclaration__Group__4 : rule__ComponentDeclaration__Group__4__Impl rule__ComponentDeclaration__Group__5 ;
    public final void rule__ComponentDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2176:1: ( rule__ComponentDeclaration__Group__4__Impl rule__ComponentDeclaration__Group__5 )
            // InternalEditorLanguage.g:2177:2: rule__ComponentDeclaration__Group__4__Impl rule__ComponentDeclaration__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ComponentDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDeclaration__Group__5();

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
    // $ANTLR end "rule__ComponentDeclaration__Group__4"


    // $ANTLR start "rule__ComponentDeclaration__Group__4__Impl"
    // InternalEditorLanguage.g:2184:1: rule__ComponentDeclaration__Group__4__Impl : ( ( rule__ComponentDeclaration__ViewAssignment_4 ) ) ;
    public final void rule__ComponentDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2188:1: ( ( ( rule__ComponentDeclaration__ViewAssignment_4 ) ) )
            // InternalEditorLanguage.g:2189:1: ( ( rule__ComponentDeclaration__ViewAssignment_4 ) )
            {
            // InternalEditorLanguage.g:2189:1: ( ( rule__ComponentDeclaration__ViewAssignment_4 ) )
            // InternalEditorLanguage.g:2190:2: ( rule__ComponentDeclaration__ViewAssignment_4 )
            {
             before(grammarAccess.getComponentDeclarationAccess().getViewAssignment_4()); 
            // InternalEditorLanguage.g:2191:2: ( rule__ComponentDeclaration__ViewAssignment_4 )
            // InternalEditorLanguage.g:2191:3: rule__ComponentDeclaration__ViewAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDeclaration__ViewAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentDeclarationAccess().getViewAssignment_4()); 

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
    // $ANTLR end "rule__ComponentDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ComponentDeclaration__Group__5"
    // InternalEditorLanguage.g:2199:1: rule__ComponentDeclaration__Group__5 : rule__ComponentDeclaration__Group__5__Impl rule__ComponentDeclaration__Group__6 ;
    public final void rule__ComponentDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2203:1: ( rule__ComponentDeclaration__Group__5__Impl rule__ComponentDeclaration__Group__6 )
            // InternalEditorLanguage.g:2204:2: rule__ComponentDeclaration__Group__5__Impl rule__ComponentDeclaration__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__ComponentDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDeclaration__Group__6();

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
    // $ANTLR end "rule__ComponentDeclaration__Group__5"


    // $ANTLR start "rule__ComponentDeclaration__Group__5__Impl"
    // InternalEditorLanguage.g:2211:1: rule__ComponentDeclaration__Group__5__Impl : ( ( rule__ComponentDeclaration__ControlAssignment_5 )? ) ;
    public final void rule__ComponentDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2215:1: ( ( ( rule__ComponentDeclaration__ControlAssignment_5 )? ) )
            // InternalEditorLanguage.g:2216:1: ( ( rule__ComponentDeclaration__ControlAssignment_5 )? )
            {
            // InternalEditorLanguage.g:2216:1: ( ( rule__ComponentDeclaration__ControlAssignment_5 )? )
            // InternalEditorLanguage.g:2217:2: ( rule__ComponentDeclaration__ControlAssignment_5 )?
            {
             before(grammarAccess.getComponentDeclarationAccess().getControlAssignment_5()); 
            // InternalEditorLanguage.g:2218:2: ( rule__ComponentDeclaration__ControlAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEditorLanguage.g:2218:3: rule__ComponentDeclaration__ControlAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDeclaration__ControlAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentDeclarationAccess().getControlAssignment_5()); 

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
    // $ANTLR end "rule__ComponentDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ComponentDeclaration__Group__6"
    // InternalEditorLanguage.g:2226:1: rule__ComponentDeclaration__Group__6 : rule__ComponentDeclaration__Group__6__Impl ;
    public final void rule__ComponentDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2230:1: ( rule__ComponentDeclaration__Group__6__Impl )
            // InternalEditorLanguage.g:2231:2: rule__ComponentDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDeclaration__Group__6__Impl();

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
    // $ANTLR end "rule__ComponentDeclaration__Group__6"


    // $ANTLR start "rule__ComponentDeclaration__Group__6__Impl"
    // InternalEditorLanguage.g:2237:1: rule__ComponentDeclaration__Group__6__Impl : ( '}' ) ;
    public final void rule__ComponentDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2241:1: ( ( '}' ) )
            // InternalEditorLanguage.g:2242:1: ( '}' )
            {
            // InternalEditorLanguage.g:2242:1: ( '}' )
            // InternalEditorLanguage.g:2243:2: '}'
            {
             before(grammarAccess.getComponentDeclarationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentDeclarationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ComponentDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ComponentController__Group__0"
    // InternalEditorLanguage.g:2253:1: rule__ComponentController__Group__0 : rule__ComponentController__Group__0__Impl rule__ComponentController__Group__1 ;
    public final void rule__ComponentController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2257:1: ( rule__ComponentController__Group__0__Impl rule__ComponentController__Group__1 )
            // InternalEditorLanguage.g:2258:2: rule__ComponentController__Group__0__Impl rule__ComponentController__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ComponentController__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentController__Group__1();

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
    // $ANTLR end "rule__ComponentController__Group__0"


    // $ANTLR start "rule__ComponentController__Group__0__Impl"
    // InternalEditorLanguage.g:2265:1: rule__ComponentController__Group__0__Impl : ( 'get:' ) ;
    public final void rule__ComponentController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2269:1: ( ( 'get:' ) )
            // InternalEditorLanguage.g:2270:1: ( 'get:' )
            {
            // InternalEditorLanguage.g:2270:1: ( 'get:' )
            // InternalEditorLanguage.g:2271:2: 'get:'
            {
             before(grammarAccess.getComponentControllerAccess().getGetKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentControllerAccess().getGetKeyword_0()); 

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
    // $ANTLR end "rule__ComponentController__Group__0__Impl"


    // $ANTLR start "rule__ComponentController__Group__1"
    // InternalEditorLanguage.g:2280:1: rule__ComponentController__Group__1 : rule__ComponentController__Group__1__Impl rule__ComponentController__Group__2 ;
    public final void rule__ComponentController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2284:1: ( rule__ComponentController__Group__1__Impl rule__ComponentController__Group__2 )
            // InternalEditorLanguage.g:2285:2: rule__ComponentController__Group__1__Impl rule__ComponentController__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ComponentController__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentController__Group__2();

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
    // $ANTLR end "rule__ComponentController__Group__1"


    // $ANTLR start "rule__ComponentController__Group__1__Impl"
    // InternalEditorLanguage.g:2292:1: rule__ComponentController__Group__1__Impl : ( ( rule__ComponentController__GetterAssignment_1 ) ) ;
    public final void rule__ComponentController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2296:1: ( ( ( rule__ComponentController__GetterAssignment_1 ) ) )
            // InternalEditorLanguage.g:2297:1: ( ( rule__ComponentController__GetterAssignment_1 ) )
            {
            // InternalEditorLanguage.g:2297:1: ( ( rule__ComponentController__GetterAssignment_1 ) )
            // InternalEditorLanguage.g:2298:2: ( rule__ComponentController__GetterAssignment_1 )
            {
             before(grammarAccess.getComponentControllerAccess().getGetterAssignment_1()); 
            // InternalEditorLanguage.g:2299:2: ( rule__ComponentController__GetterAssignment_1 )
            // InternalEditorLanguage.g:2299:3: rule__ComponentController__GetterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentController__GetterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentControllerAccess().getGetterAssignment_1()); 

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
    // $ANTLR end "rule__ComponentController__Group__1__Impl"


    // $ANTLR start "rule__ComponentController__Group__2"
    // InternalEditorLanguage.g:2307:1: rule__ComponentController__Group__2 : rule__ComponentController__Group__2__Impl rule__ComponentController__Group__3 ;
    public final void rule__ComponentController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2311:1: ( rule__ComponentController__Group__2__Impl rule__ComponentController__Group__3 )
            // InternalEditorLanguage.g:2312:2: rule__ComponentController__Group__2__Impl rule__ComponentController__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ComponentController__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentController__Group__3();

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
    // $ANTLR end "rule__ComponentController__Group__2"


    // $ANTLR start "rule__ComponentController__Group__2__Impl"
    // InternalEditorLanguage.g:2319:1: rule__ComponentController__Group__2__Impl : ( 'set:' ) ;
    public final void rule__ComponentController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2323:1: ( ( 'set:' ) )
            // InternalEditorLanguage.g:2324:1: ( 'set:' )
            {
            // InternalEditorLanguage.g:2324:1: ( 'set:' )
            // InternalEditorLanguage.g:2325:2: 'set:'
            {
             before(grammarAccess.getComponentControllerAccess().getSetKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentControllerAccess().getSetKeyword_2()); 

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
    // $ANTLR end "rule__ComponentController__Group__2__Impl"


    // $ANTLR start "rule__ComponentController__Group__3"
    // InternalEditorLanguage.g:2334:1: rule__ComponentController__Group__3 : rule__ComponentController__Group__3__Impl rule__ComponentController__Group__4 ;
    public final void rule__ComponentController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2338:1: ( rule__ComponentController__Group__3__Impl rule__ComponentController__Group__4 )
            // InternalEditorLanguage.g:2339:2: rule__ComponentController__Group__3__Impl rule__ComponentController__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ComponentController__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentController__Group__4();

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
    // $ANTLR end "rule__ComponentController__Group__3"


    // $ANTLR start "rule__ComponentController__Group__3__Impl"
    // InternalEditorLanguage.g:2346:1: rule__ComponentController__Group__3__Impl : ( ( rule__ComponentController__SetterAssignment_3 ) ) ;
    public final void rule__ComponentController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2350:1: ( ( ( rule__ComponentController__SetterAssignment_3 ) ) )
            // InternalEditorLanguage.g:2351:1: ( ( rule__ComponentController__SetterAssignment_3 ) )
            {
            // InternalEditorLanguage.g:2351:1: ( ( rule__ComponentController__SetterAssignment_3 ) )
            // InternalEditorLanguage.g:2352:2: ( rule__ComponentController__SetterAssignment_3 )
            {
             before(grammarAccess.getComponentControllerAccess().getSetterAssignment_3()); 
            // InternalEditorLanguage.g:2353:2: ( rule__ComponentController__SetterAssignment_3 )
            // InternalEditorLanguage.g:2353:3: rule__ComponentController__SetterAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentController__SetterAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentControllerAccess().getSetterAssignment_3()); 

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
    // $ANTLR end "rule__ComponentController__Group__3__Impl"


    // $ANTLR start "rule__ComponentController__Group__4"
    // InternalEditorLanguage.g:2361:1: rule__ComponentController__Group__4 : rule__ComponentController__Group__4__Impl rule__ComponentController__Group__5 ;
    public final void rule__ComponentController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2365:1: ( rule__ComponentController__Group__4__Impl rule__ComponentController__Group__5 )
            // InternalEditorLanguage.g:2366:2: rule__ComponentController__Group__4__Impl rule__ComponentController__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ComponentController__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentController__Group__5();

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
    // $ANTLR end "rule__ComponentController__Group__4"


    // $ANTLR start "rule__ComponentController__Group__4__Impl"
    // InternalEditorLanguage.g:2373:1: rule__ComponentController__Group__4__Impl : ( 'validate:' ) ;
    public final void rule__ComponentController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2377:1: ( ( 'validate:' ) )
            // InternalEditorLanguage.g:2378:1: ( 'validate:' )
            {
            // InternalEditorLanguage.g:2378:1: ( 'validate:' )
            // InternalEditorLanguage.g:2379:2: 'validate:'
            {
             before(grammarAccess.getComponentControllerAccess().getValidateKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentControllerAccess().getValidateKeyword_4()); 

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
    // $ANTLR end "rule__ComponentController__Group__4__Impl"


    // $ANTLR start "rule__ComponentController__Group__5"
    // InternalEditorLanguage.g:2388:1: rule__ComponentController__Group__5 : rule__ComponentController__Group__5__Impl ;
    public final void rule__ComponentController__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2392:1: ( rule__ComponentController__Group__5__Impl )
            // InternalEditorLanguage.g:2393:2: rule__ComponentController__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentController__Group__5__Impl();

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
    // $ANTLR end "rule__ComponentController__Group__5"


    // $ANTLR start "rule__ComponentController__Group__5__Impl"
    // InternalEditorLanguage.g:2399:1: rule__ComponentController__Group__5__Impl : ( ( rule__ComponentController__ValidatorAssignment_5 ) ) ;
    public final void rule__ComponentController__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2403:1: ( ( ( rule__ComponentController__ValidatorAssignment_5 ) ) )
            // InternalEditorLanguage.g:2404:1: ( ( rule__ComponentController__ValidatorAssignment_5 ) )
            {
            // InternalEditorLanguage.g:2404:1: ( ( rule__ComponentController__ValidatorAssignment_5 ) )
            // InternalEditorLanguage.g:2405:2: ( rule__ComponentController__ValidatorAssignment_5 )
            {
             before(grammarAccess.getComponentControllerAccess().getValidatorAssignment_5()); 
            // InternalEditorLanguage.g:2406:2: ( rule__ComponentController__ValidatorAssignment_5 )
            // InternalEditorLanguage.g:2406:3: rule__ComponentController__ValidatorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ComponentController__ValidatorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComponentControllerAccess().getValidatorAssignment_5()); 

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
    // $ANTLR end "rule__ComponentController__Group__5__Impl"


    // $ANTLR start "rule__HtmlSnippet__Group_0__0"
    // InternalEditorLanguage.g:2415:1: rule__HtmlSnippet__Group_0__0 : rule__HtmlSnippet__Group_0__0__Impl rule__HtmlSnippet__Group_0__1 ;
    public final void rule__HtmlSnippet__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2419:1: ( rule__HtmlSnippet__Group_0__0__Impl rule__HtmlSnippet__Group_0__1 )
            // InternalEditorLanguage.g:2420:2: rule__HtmlSnippet__Group_0__0__Impl rule__HtmlSnippet__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__HtmlSnippet__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__Group_0__1();

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
    // $ANTLR end "rule__HtmlSnippet__Group_0__0"


    // $ANTLR start "rule__HtmlSnippet__Group_0__0__Impl"
    // InternalEditorLanguage.g:2427:1: rule__HtmlSnippet__Group_0__0__Impl : ( () ) ;
    public final void rule__HtmlSnippet__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2431:1: ( ( () ) )
            // InternalEditorLanguage.g:2432:1: ( () )
            {
            // InternalEditorLanguage.g:2432:1: ( () )
            // InternalEditorLanguage.g:2433:2: ()
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlSnippetAction_0_0()); 
            // InternalEditorLanguage.g:2434:2: ()
            // InternalEditorLanguage.g:2434:3: 
            {
            }

             after(grammarAccess.getHtmlSnippetAccess().getHtmlSnippetAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HtmlSnippet__Group_0__0__Impl"


    // $ANTLR start "rule__HtmlSnippet__Group_0__1"
    // InternalEditorLanguage.g:2442:1: rule__HtmlSnippet__Group_0__1 : rule__HtmlSnippet__Group_0__1__Impl ;
    public final void rule__HtmlSnippet__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2446:1: ( rule__HtmlSnippet__Group_0__1__Impl )
            // InternalEditorLanguage.g:2447:2: rule__HtmlSnippet__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__Group_0__1__Impl();

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
    // $ANTLR end "rule__HtmlSnippet__Group_0__1"


    // $ANTLR start "rule__HtmlSnippet__Group_0__1__Impl"
    // InternalEditorLanguage.g:2453:1: rule__HtmlSnippet__Group_0__1__Impl : ( ( rule__HtmlSnippet__HtmlAssignment_0_1 ) ) ;
    public final void rule__HtmlSnippet__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2457:1: ( ( ( rule__HtmlSnippet__HtmlAssignment_0_1 ) ) )
            // InternalEditorLanguage.g:2458:1: ( ( rule__HtmlSnippet__HtmlAssignment_0_1 ) )
            {
            // InternalEditorLanguage.g:2458:1: ( ( rule__HtmlSnippet__HtmlAssignment_0_1 ) )
            // InternalEditorLanguage.g:2459:2: ( rule__HtmlSnippet__HtmlAssignment_0_1 )
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_0_1()); 
            // InternalEditorLanguage.g:2460:2: ( rule__HtmlSnippet__HtmlAssignment_0_1 )
            // InternalEditorLanguage.g:2460:3: rule__HtmlSnippet__HtmlAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__HtmlAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_0_1()); 

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
    // $ANTLR end "rule__HtmlSnippet__Group_0__1__Impl"


    // $ANTLR start "rule__HtmlSnippet__Group_1__0"
    // InternalEditorLanguage.g:2469:1: rule__HtmlSnippet__Group_1__0 : rule__HtmlSnippet__Group_1__0__Impl rule__HtmlSnippet__Group_1__1 ;
    public final void rule__HtmlSnippet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2473:1: ( rule__HtmlSnippet__Group_1__0__Impl rule__HtmlSnippet__Group_1__1 )
            // InternalEditorLanguage.g:2474:2: rule__HtmlSnippet__Group_1__0__Impl rule__HtmlSnippet__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__HtmlSnippet__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__Group_1__1();

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
    // $ANTLR end "rule__HtmlSnippet__Group_1__0"


    // $ANTLR start "rule__HtmlSnippet__Group_1__0__Impl"
    // InternalEditorLanguage.g:2481:1: rule__HtmlSnippet__Group_1__0__Impl : ( ( rule__HtmlSnippet__HtmlAssignment_1_0 ) ) ;
    public final void rule__HtmlSnippet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2485:1: ( ( ( rule__HtmlSnippet__HtmlAssignment_1_0 ) ) )
            // InternalEditorLanguage.g:2486:1: ( ( rule__HtmlSnippet__HtmlAssignment_1_0 ) )
            {
            // InternalEditorLanguage.g:2486:1: ( ( rule__HtmlSnippet__HtmlAssignment_1_0 ) )
            // InternalEditorLanguage.g:2487:2: ( rule__HtmlSnippet__HtmlAssignment_1_0 )
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_1_0()); 
            // InternalEditorLanguage.g:2488:2: ( rule__HtmlSnippet__HtmlAssignment_1_0 )
            // InternalEditorLanguage.g:2488:3: rule__HtmlSnippet__HtmlAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__HtmlAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_1_0()); 

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
    // $ANTLR end "rule__HtmlSnippet__Group_1__0__Impl"


    // $ANTLR start "rule__HtmlSnippet__Group_1__1"
    // InternalEditorLanguage.g:2496:1: rule__HtmlSnippet__Group_1__1 : rule__HtmlSnippet__Group_1__1__Impl rule__HtmlSnippet__Group_1__2 ;
    public final void rule__HtmlSnippet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2500:1: ( rule__HtmlSnippet__Group_1__1__Impl rule__HtmlSnippet__Group_1__2 )
            // InternalEditorLanguage.g:2501:2: rule__HtmlSnippet__Group_1__1__Impl rule__HtmlSnippet__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__HtmlSnippet__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__Group_1__2();

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
    // $ANTLR end "rule__HtmlSnippet__Group_1__1"


    // $ANTLR start "rule__HtmlSnippet__Group_1__1__Impl"
    // InternalEditorLanguage.g:2508:1: rule__HtmlSnippet__Group_1__1__Impl : ( ( rule__HtmlSnippet__HtmlAssignment_1_1 ) ) ;
    public final void rule__HtmlSnippet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2512:1: ( ( ( rule__HtmlSnippet__HtmlAssignment_1_1 ) ) )
            // InternalEditorLanguage.g:2513:1: ( ( rule__HtmlSnippet__HtmlAssignment_1_1 ) )
            {
            // InternalEditorLanguage.g:2513:1: ( ( rule__HtmlSnippet__HtmlAssignment_1_1 ) )
            // InternalEditorLanguage.g:2514:2: ( rule__HtmlSnippet__HtmlAssignment_1_1 )
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_1_1()); 
            // InternalEditorLanguage.g:2515:2: ( rule__HtmlSnippet__HtmlAssignment_1_1 )
            // InternalEditorLanguage.g:2515:3: rule__HtmlSnippet__HtmlAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__HtmlAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_1_1()); 

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
    // $ANTLR end "rule__HtmlSnippet__Group_1__1__Impl"


    // $ANTLR start "rule__HtmlSnippet__Group_1__2"
    // InternalEditorLanguage.g:2523:1: rule__HtmlSnippet__Group_1__2 : rule__HtmlSnippet__Group_1__2__Impl rule__HtmlSnippet__Group_1__3 ;
    public final void rule__HtmlSnippet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2527:1: ( rule__HtmlSnippet__Group_1__2__Impl rule__HtmlSnippet__Group_1__3 )
            // InternalEditorLanguage.g:2528:2: rule__HtmlSnippet__Group_1__2__Impl rule__HtmlSnippet__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__HtmlSnippet__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__Group_1__3();

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
    // $ANTLR end "rule__HtmlSnippet__Group_1__2"


    // $ANTLR start "rule__HtmlSnippet__Group_1__2__Impl"
    // InternalEditorLanguage.g:2535:1: rule__HtmlSnippet__Group_1__2__Impl : ( ( rule__HtmlSnippet__Group_1_2__0 )* ) ;
    public final void rule__HtmlSnippet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2539:1: ( ( ( rule__HtmlSnippet__Group_1_2__0 )* ) )
            // InternalEditorLanguage.g:2540:1: ( ( rule__HtmlSnippet__Group_1_2__0 )* )
            {
            // InternalEditorLanguage.g:2540:1: ( ( rule__HtmlSnippet__Group_1_2__0 )* )
            // InternalEditorLanguage.g:2541:2: ( rule__HtmlSnippet__Group_1_2__0 )*
            {
             before(grammarAccess.getHtmlSnippetAccess().getGroup_1_2()); 
            // InternalEditorLanguage.g:2542:2: ( rule__HtmlSnippet__Group_1_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_CODEMID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEditorLanguage.g:2542:3: rule__HtmlSnippet__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__HtmlSnippet__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getHtmlSnippetAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__HtmlSnippet__Group_1__2__Impl"


    // $ANTLR start "rule__HtmlSnippet__Group_1__3"
    // InternalEditorLanguage.g:2550:1: rule__HtmlSnippet__Group_1__3 : rule__HtmlSnippet__Group_1__3__Impl ;
    public final void rule__HtmlSnippet__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2554:1: ( rule__HtmlSnippet__Group_1__3__Impl )
            // InternalEditorLanguage.g:2555:2: rule__HtmlSnippet__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__Group_1__3__Impl();

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
    // $ANTLR end "rule__HtmlSnippet__Group_1__3"


    // $ANTLR start "rule__HtmlSnippet__Group_1__3__Impl"
    // InternalEditorLanguage.g:2561:1: rule__HtmlSnippet__Group_1__3__Impl : ( ( rule__HtmlSnippet__HtmlAssignment_1_3 ) ) ;
    public final void rule__HtmlSnippet__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2565:1: ( ( ( rule__HtmlSnippet__HtmlAssignment_1_3 ) ) )
            // InternalEditorLanguage.g:2566:1: ( ( rule__HtmlSnippet__HtmlAssignment_1_3 ) )
            {
            // InternalEditorLanguage.g:2566:1: ( ( rule__HtmlSnippet__HtmlAssignment_1_3 ) )
            // InternalEditorLanguage.g:2567:2: ( rule__HtmlSnippet__HtmlAssignment_1_3 )
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_1_3()); 
            // InternalEditorLanguage.g:2568:2: ( rule__HtmlSnippet__HtmlAssignment_1_3 )
            // InternalEditorLanguage.g:2568:3: rule__HtmlSnippet__HtmlAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__HtmlAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_1_3()); 

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
    // $ANTLR end "rule__HtmlSnippet__Group_1__3__Impl"


    // $ANTLR start "rule__HtmlSnippet__Group_1_2__0"
    // InternalEditorLanguage.g:2577:1: rule__HtmlSnippet__Group_1_2__0 : rule__HtmlSnippet__Group_1_2__0__Impl rule__HtmlSnippet__Group_1_2__1 ;
    public final void rule__HtmlSnippet__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2581:1: ( rule__HtmlSnippet__Group_1_2__0__Impl rule__HtmlSnippet__Group_1_2__1 )
            // InternalEditorLanguage.g:2582:2: rule__HtmlSnippet__Group_1_2__0__Impl rule__HtmlSnippet__Group_1_2__1
            {
            pushFollow(FOLLOW_27);
            rule__HtmlSnippet__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__Group_1_2__1();

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
    // $ANTLR end "rule__HtmlSnippet__Group_1_2__0"


    // $ANTLR start "rule__HtmlSnippet__Group_1_2__0__Impl"
    // InternalEditorLanguage.g:2589:1: rule__HtmlSnippet__Group_1_2__0__Impl : ( ( rule__HtmlSnippet__HtmlAssignment_1_2_0 ) ) ;
    public final void rule__HtmlSnippet__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2593:1: ( ( ( rule__HtmlSnippet__HtmlAssignment_1_2_0 ) ) )
            // InternalEditorLanguage.g:2594:1: ( ( rule__HtmlSnippet__HtmlAssignment_1_2_0 ) )
            {
            // InternalEditorLanguage.g:2594:1: ( ( rule__HtmlSnippet__HtmlAssignment_1_2_0 ) )
            // InternalEditorLanguage.g:2595:2: ( rule__HtmlSnippet__HtmlAssignment_1_2_0 )
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_1_2_0()); 
            // InternalEditorLanguage.g:2596:2: ( rule__HtmlSnippet__HtmlAssignment_1_2_0 )
            // InternalEditorLanguage.g:2596:3: rule__HtmlSnippet__HtmlAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__HtmlAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_1_2_0()); 

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
    // $ANTLR end "rule__HtmlSnippet__Group_1_2__0__Impl"


    // $ANTLR start "rule__HtmlSnippet__Group_1_2__1"
    // InternalEditorLanguage.g:2604:1: rule__HtmlSnippet__Group_1_2__1 : rule__HtmlSnippet__Group_1_2__1__Impl ;
    public final void rule__HtmlSnippet__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2608:1: ( rule__HtmlSnippet__Group_1_2__1__Impl )
            // InternalEditorLanguage.g:2609:2: rule__HtmlSnippet__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__HtmlSnippet__Group_1_2__1"


    // $ANTLR start "rule__HtmlSnippet__Group_1_2__1__Impl"
    // InternalEditorLanguage.g:2615:1: rule__HtmlSnippet__Group_1_2__1__Impl : ( ( rule__HtmlSnippet__HtmlAssignment_1_2_1 ) ) ;
    public final void rule__HtmlSnippet__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2619:1: ( ( ( rule__HtmlSnippet__HtmlAssignment_1_2_1 ) ) )
            // InternalEditorLanguage.g:2620:1: ( ( rule__HtmlSnippet__HtmlAssignment_1_2_1 ) )
            {
            // InternalEditorLanguage.g:2620:1: ( ( rule__HtmlSnippet__HtmlAssignment_1_2_1 ) )
            // InternalEditorLanguage.g:2621:2: ( rule__HtmlSnippet__HtmlAssignment_1_2_1 )
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_1_2_1()); 
            // InternalEditorLanguage.g:2622:2: ( rule__HtmlSnippet__HtmlAssignment_1_2_1 )
            // InternalEditorLanguage.g:2622:3: rule__HtmlSnippet__HtmlAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HtmlSnippet__HtmlAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHtmlSnippetAccess().getHtmlAssignment_1_2_1()); 

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
    // $ANTLR end "rule__HtmlSnippet__Group_1_2__1__Impl"


    // $ANTLR start "rule__JsSnippet__Group_0__0"
    // InternalEditorLanguage.g:2631:1: rule__JsSnippet__Group_0__0 : rule__JsSnippet__Group_0__0__Impl rule__JsSnippet__Group_0__1 ;
    public final void rule__JsSnippet__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2635:1: ( rule__JsSnippet__Group_0__0__Impl rule__JsSnippet__Group_0__1 )
            // InternalEditorLanguage.g:2636:2: rule__JsSnippet__Group_0__0__Impl rule__JsSnippet__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__JsSnippet__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsSnippet__Group_0__1();

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
    // $ANTLR end "rule__JsSnippet__Group_0__0"


    // $ANTLR start "rule__JsSnippet__Group_0__0__Impl"
    // InternalEditorLanguage.g:2643:1: rule__JsSnippet__Group_0__0__Impl : ( () ) ;
    public final void rule__JsSnippet__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2647:1: ( ( () ) )
            // InternalEditorLanguage.g:2648:1: ( () )
            {
            // InternalEditorLanguage.g:2648:1: ( () )
            // InternalEditorLanguage.g:2649:2: ()
            {
             before(grammarAccess.getJsSnippetAccess().getJsSnippetAction_0_0()); 
            // InternalEditorLanguage.g:2650:2: ()
            // InternalEditorLanguage.g:2650:3: 
            {
            }

             after(grammarAccess.getJsSnippetAccess().getJsSnippetAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsSnippet__Group_0__0__Impl"


    // $ANTLR start "rule__JsSnippet__Group_0__1"
    // InternalEditorLanguage.g:2658:1: rule__JsSnippet__Group_0__1 : rule__JsSnippet__Group_0__1__Impl ;
    public final void rule__JsSnippet__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2662:1: ( rule__JsSnippet__Group_0__1__Impl )
            // InternalEditorLanguage.g:2663:2: rule__JsSnippet__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsSnippet__Group_0__1__Impl();

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
    // $ANTLR end "rule__JsSnippet__Group_0__1"


    // $ANTLR start "rule__JsSnippet__Group_0__1__Impl"
    // InternalEditorLanguage.g:2669:1: rule__JsSnippet__Group_0__1__Impl : ( ( rule__JsSnippet__JsAssignment_0_1 ) ) ;
    public final void rule__JsSnippet__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2673:1: ( ( ( rule__JsSnippet__JsAssignment_0_1 ) ) )
            // InternalEditorLanguage.g:2674:1: ( ( rule__JsSnippet__JsAssignment_0_1 ) )
            {
            // InternalEditorLanguage.g:2674:1: ( ( rule__JsSnippet__JsAssignment_0_1 ) )
            // InternalEditorLanguage.g:2675:2: ( rule__JsSnippet__JsAssignment_0_1 )
            {
             before(grammarAccess.getJsSnippetAccess().getJsAssignment_0_1()); 
            // InternalEditorLanguage.g:2676:2: ( rule__JsSnippet__JsAssignment_0_1 )
            // InternalEditorLanguage.g:2676:3: rule__JsSnippet__JsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__JsSnippet__JsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getJsSnippetAccess().getJsAssignment_0_1()); 

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
    // $ANTLR end "rule__JsSnippet__Group_0__1__Impl"


    // $ANTLR start "rule__JsSnippet__Group_1__0"
    // InternalEditorLanguage.g:2685:1: rule__JsSnippet__Group_1__0 : rule__JsSnippet__Group_1__0__Impl rule__JsSnippet__Group_1__1 ;
    public final void rule__JsSnippet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2689:1: ( rule__JsSnippet__Group_1__0__Impl rule__JsSnippet__Group_1__1 )
            // InternalEditorLanguage.g:2690:2: rule__JsSnippet__Group_1__0__Impl rule__JsSnippet__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__JsSnippet__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsSnippet__Group_1__1();

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
    // $ANTLR end "rule__JsSnippet__Group_1__0"


    // $ANTLR start "rule__JsSnippet__Group_1__0__Impl"
    // InternalEditorLanguage.g:2697:1: rule__JsSnippet__Group_1__0__Impl : ( ( rule__JsSnippet__JsAssignment_1_0 ) ) ;
    public final void rule__JsSnippet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2701:1: ( ( ( rule__JsSnippet__JsAssignment_1_0 ) ) )
            // InternalEditorLanguage.g:2702:1: ( ( rule__JsSnippet__JsAssignment_1_0 ) )
            {
            // InternalEditorLanguage.g:2702:1: ( ( rule__JsSnippet__JsAssignment_1_0 ) )
            // InternalEditorLanguage.g:2703:2: ( rule__JsSnippet__JsAssignment_1_0 )
            {
             before(grammarAccess.getJsSnippetAccess().getJsAssignment_1_0()); 
            // InternalEditorLanguage.g:2704:2: ( rule__JsSnippet__JsAssignment_1_0 )
            // InternalEditorLanguage.g:2704:3: rule__JsSnippet__JsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__JsSnippet__JsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getJsSnippetAccess().getJsAssignment_1_0()); 

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
    // $ANTLR end "rule__JsSnippet__Group_1__0__Impl"


    // $ANTLR start "rule__JsSnippet__Group_1__1"
    // InternalEditorLanguage.g:2712:1: rule__JsSnippet__Group_1__1 : rule__JsSnippet__Group_1__1__Impl rule__JsSnippet__Group_1__2 ;
    public final void rule__JsSnippet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2716:1: ( rule__JsSnippet__Group_1__1__Impl rule__JsSnippet__Group_1__2 )
            // InternalEditorLanguage.g:2717:2: rule__JsSnippet__Group_1__1__Impl rule__JsSnippet__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__JsSnippet__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsSnippet__Group_1__2();

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
    // $ANTLR end "rule__JsSnippet__Group_1__1"


    // $ANTLR start "rule__JsSnippet__Group_1__1__Impl"
    // InternalEditorLanguage.g:2724:1: rule__JsSnippet__Group_1__1__Impl : ( ( rule__JsSnippet__JsAssignment_1_1 ) ) ;
    public final void rule__JsSnippet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2728:1: ( ( ( rule__JsSnippet__JsAssignment_1_1 ) ) )
            // InternalEditorLanguage.g:2729:1: ( ( rule__JsSnippet__JsAssignment_1_1 ) )
            {
            // InternalEditorLanguage.g:2729:1: ( ( rule__JsSnippet__JsAssignment_1_1 ) )
            // InternalEditorLanguage.g:2730:2: ( rule__JsSnippet__JsAssignment_1_1 )
            {
             before(grammarAccess.getJsSnippetAccess().getJsAssignment_1_1()); 
            // InternalEditorLanguage.g:2731:2: ( rule__JsSnippet__JsAssignment_1_1 )
            // InternalEditorLanguage.g:2731:3: rule__JsSnippet__JsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JsSnippet__JsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJsSnippetAccess().getJsAssignment_1_1()); 

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
    // $ANTLR end "rule__JsSnippet__Group_1__1__Impl"


    // $ANTLR start "rule__JsSnippet__Group_1__2"
    // InternalEditorLanguage.g:2739:1: rule__JsSnippet__Group_1__2 : rule__JsSnippet__Group_1__2__Impl rule__JsSnippet__Group_1__3 ;
    public final void rule__JsSnippet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2743:1: ( rule__JsSnippet__Group_1__2__Impl rule__JsSnippet__Group_1__3 )
            // InternalEditorLanguage.g:2744:2: rule__JsSnippet__Group_1__2__Impl rule__JsSnippet__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__JsSnippet__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsSnippet__Group_1__3();

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
    // $ANTLR end "rule__JsSnippet__Group_1__2"


    // $ANTLR start "rule__JsSnippet__Group_1__2__Impl"
    // InternalEditorLanguage.g:2751:1: rule__JsSnippet__Group_1__2__Impl : ( ( rule__JsSnippet__Group_1_2__0 )* ) ;
    public final void rule__JsSnippet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2755:1: ( ( ( rule__JsSnippet__Group_1_2__0 )* ) )
            // InternalEditorLanguage.g:2756:1: ( ( rule__JsSnippet__Group_1_2__0 )* )
            {
            // InternalEditorLanguage.g:2756:1: ( ( rule__JsSnippet__Group_1_2__0 )* )
            // InternalEditorLanguage.g:2757:2: ( rule__JsSnippet__Group_1_2__0 )*
            {
             before(grammarAccess.getJsSnippetAccess().getGroup_1_2()); 
            // InternalEditorLanguage.g:2758:2: ( rule__JsSnippet__Group_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_CODEMID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEditorLanguage.g:2758:3: rule__JsSnippet__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__JsSnippet__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getJsSnippetAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__JsSnippet__Group_1__2__Impl"


    // $ANTLR start "rule__JsSnippet__Group_1__3"
    // InternalEditorLanguage.g:2766:1: rule__JsSnippet__Group_1__3 : rule__JsSnippet__Group_1__3__Impl ;
    public final void rule__JsSnippet__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2770:1: ( rule__JsSnippet__Group_1__3__Impl )
            // InternalEditorLanguage.g:2771:2: rule__JsSnippet__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsSnippet__Group_1__3__Impl();

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
    // $ANTLR end "rule__JsSnippet__Group_1__3"


    // $ANTLR start "rule__JsSnippet__Group_1__3__Impl"
    // InternalEditorLanguage.g:2777:1: rule__JsSnippet__Group_1__3__Impl : ( ( rule__JsSnippet__JsAssignment_1_3 ) ) ;
    public final void rule__JsSnippet__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2781:1: ( ( ( rule__JsSnippet__JsAssignment_1_3 ) ) )
            // InternalEditorLanguage.g:2782:1: ( ( rule__JsSnippet__JsAssignment_1_3 ) )
            {
            // InternalEditorLanguage.g:2782:1: ( ( rule__JsSnippet__JsAssignment_1_3 ) )
            // InternalEditorLanguage.g:2783:2: ( rule__JsSnippet__JsAssignment_1_3 )
            {
             before(grammarAccess.getJsSnippetAccess().getJsAssignment_1_3()); 
            // InternalEditorLanguage.g:2784:2: ( rule__JsSnippet__JsAssignment_1_3 )
            // InternalEditorLanguage.g:2784:3: rule__JsSnippet__JsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__JsSnippet__JsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getJsSnippetAccess().getJsAssignment_1_3()); 

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
    // $ANTLR end "rule__JsSnippet__Group_1__3__Impl"


    // $ANTLR start "rule__JsSnippet__Group_1_2__0"
    // InternalEditorLanguage.g:2793:1: rule__JsSnippet__Group_1_2__0 : rule__JsSnippet__Group_1_2__0__Impl rule__JsSnippet__Group_1_2__1 ;
    public final void rule__JsSnippet__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2797:1: ( rule__JsSnippet__Group_1_2__0__Impl rule__JsSnippet__Group_1_2__1 )
            // InternalEditorLanguage.g:2798:2: rule__JsSnippet__Group_1_2__0__Impl rule__JsSnippet__Group_1_2__1
            {
            pushFollow(FOLLOW_24);
            rule__JsSnippet__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsSnippet__Group_1_2__1();

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
    // $ANTLR end "rule__JsSnippet__Group_1_2__0"


    // $ANTLR start "rule__JsSnippet__Group_1_2__0__Impl"
    // InternalEditorLanguage.g:2805:1: rule__JsSnippet__Group_1_2__0__Impl : ( ( rule__JsSnippet__JsAssignment_1_2_0 ) ) ;
    public final void rule__JsSnippet__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2809:1: ( ( ( rule__JsSnippet__JsAssignment_1_2_0 ) ) )
            // InternalEditorLanguage.g:2810:1: ( ( rule__JsSnippet__JsAssignment_1_2_0 ) )
            {
            // InternalEditorLanguage.g:2810:1: ( ( rule__JsSnippet__JsAssignment_1_2_0 ) )
            // InternalEditorLanguage.g:2811:2: ( rule__JsSnippet__JsAssignment_1_2_0 )
            {
             before(grammarAccess.getJsSnippetAccess().getJsAssignment_1_2_0()); 
            // InternalEditorLanguage.g:2812:2: ( rule__JsSnippet__JsAssignment_1_2_0 )
            // InternalEditorLanguage.g:2812:3: rule__JsSnippet__JsAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__JsSnippet__JsAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getJsSnippetAccess().getJsAssignment_1_2_0()); 

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
    // $ANTLR end "rule__JsSnippet__Group_1_2__0__Impl"


    // $ANTLR start "rule__JsSnippet__Group_1_2__1"
    // InternalEditorLanguage.g:2820:1: rule__JsSnippet__Group_1_2__1 : rule__JsSnippet__Group_1_2__1__Impl ;
    public final void rule__JsSnippet__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2824:1: ( rule__JsSnippet__Group_1_2__1__Impl )
            // InternalEditorLanguage.g:2825:2: rule__JsSnippet__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsSnippet__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__JsSnippet__Group_1_2__1"


    // $ANTLR start "rule__JsSnippet__Group_1_2__1__Impl"
    // InternalEditorLanguage.g:2831:1: rule__JsSnippet__Group_1_2__1__Impl : ( ( rule__JsSnippet__JsAssignment_1_2_1 ) ) ;
    public final void rule__JsSnippet__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2835:1: ( ( ( rule__JsSnippet__JsAssignment_1_2_1 ) ) )
            // InternalEditorLanguage.g:2836:1: ( ( rule__JsSnippet__JsAssignment_1_2_1 ) )
            {
            // InternalEditorLanguage.g:2836:1: ( ( rule__JsSnippet__JsAssignment_1_2_1 ) )
            // InternalEditorLanguage.g:2837:2: ( rule__JsSnippet__JsAssignment_1_2_1 )
            {
             before(grammarAccess.getJsSnippetAccess().getJsAssignment_1_2_1()); 
            // InternalEditorLanguage.g:2838:2: ( rule__JsSnippet__JsAssignment_1_2_1 )
            // InternalEditorLanguage.g:2838:3: rule__JsSnippet__JsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JsSnippet__JsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJsSnippetAccess().getJsAssignment_1_2_1()); 

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
    // $ANTLR end "rule__JsSnippet__Group_1_2__1__Impl"


    // $ANTLR start "rule__EditorDefinitionFile__ImportsAssignment_0"
    // InternalEditorLanguage.g:2847:1: rule__EditorDefinitionFile__ImportsAssignment_0 : ( ruleImportSection ) ;
    public final void rule__EditorDefinitionFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2851:1: ( ( ruleImportSection ) )
            // InternalEditorLanguage.g:2852:2: ( ruleImportSection )
            {
            // InternalEditorLanguage.g:2852:2: ( ruleImportSection )
            // InternalEditorLanguage.g:2853:3: ruleImportSection
            {
             before(grammarAccess.getEditorDefinitionFileAccess().getImportsImportSectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImportSection();

            state._fsp--;

             after(grammarAccess.getEditorDefinitionFileAccess().getImportsImportSectionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EditorDefinitionFile__ImportsAssignment_0"


    // $ANTLR start "rule__EditorDefinitionFile__MainSectionAssignment_1"
    // InternalEditorLanguage.g:2862:1: rule__EditorDefinitionFile__MainSectionAssignment_1 : ( ruleMainSection ) ;
    public final void rule__EditorDefinitionFile__MainSectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2866:1: ( ( ruleMainSection ) )
            // InternalEditorLanguage.g:2867:2: ( ruleMainSection )
            {
            // InternalEditorLanguage.g:2867:2: ( ruleMainSection )
            // InternalEditorLanguage.g:2868:3: ruleMainSection
            {
             before(grammarAccess.getEditorDefinitionFileAccess().getMainSectionMainSectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMainSection();

            state._fsp--;

             after(grammarAccess.getEditorDefinitionFileAccess().getMainSectionMainSectionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EditorDefinitionFile__MainSectionAssignment_1"


    // $ANTLR start "rule__ImportSection__ImportsAssignment_1"
    // InternalEditorLanguage.g:2877:1: rule__ImportSection__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__ImportSection__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2881:1: ( ( ruleImport ) )
            // InternalEditorLanguage.g:2882:2: ( ruleImport )
            {
            // InternalEditorLanguage.g:2882:2: ( ruleImport )
            // InternalEditorLanguage.g:2883:3: ruleImport
            {
             before(grammarAccess.getImportSectionAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportSectionAccess().getImportsImportParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ImportSection__ImportsAssignment_1"


    // $ANTLR start "rule__Import__NameAssignment_1"
    // InternalEditorLanguage.g:2892:1: rule__Import__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2896:1: ( ( ruleQualifiedName ) )
            // InternalEditorLanguage.g:2897:2: ( ruleQualifiedName )
            {
            // InternalEditorLanguage.g:2897:2: ( ruleQualifiedName )
            // InternalEditorLanguage.g:2898:3: ruleQualifiedName
            {
             before(grammarAccess.getImportAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__NameAssignment_1"


    // $ANTLR start "rule__MainSection__NodesAssignment_1_0"
    // InternalEditorLanguage.g:2907:1: rule__MainSection__NodesAssignment_1_0 : ( ruleNodeDeclaration ) ;
    public final void rule__MainSection__NodesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2911:1: ( ( ruleNodeDeclaration ) )
            // InternalEditorLanguage.g:2912:2: ( ruleNodeDeclaration )
            {
            // InternalEditorLanguage.g:2912:2: ( ruleNodeDeclaration )
            // InternalEditorLanguage.g:2913:3: ruleNodeDeclaration
            {
             before(grammarAccess.getMainSectionAccess().getNodesNodeDeclarationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeDeclaration();

            state._fsp--;

             after(grammarAccess.getMainSectionAccess().getNodesNodeDeclarationParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__MainSection__NodesAssignment_1_0"


    // $ANTLR start "rule__MainSection__ComponentsAssignment_1_1"
    // InternalEditorLanguage.g:2922:1: rule__MainSection__ComponentsAssignment_1_1 : ( ruleComponentDeclaration ) ;
    public final void rule__MainSection__ComponentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2926:1: ( ( ruleComponentDeclaration ) )
            // InternalEditorLanguage.g:2927:2: ( ruleComponentDeclaration )
            {
            // InternalEditorLanguage.g:2927:2: ( ruleComponentDeclaration )
            // InternalEditorLanguage.g:2928:3: ruleComponentDeclaration
            {
             before(grammarAccess.getMainSectionAccess().getComponentsComponentDeclarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentDeclaration();

            state._fsp--;

             after(grammarAccess.getMainSectionAccess().getComponentsComponentDeclarationParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MainSection__ComponentsAssignment_1_1"


    // $ANTLR start "rule__NodeDeclaration__NodeNameAssignment_1"
    // InternalEditorLanguage.g:2937:1: rule__NodeDeclaration__NodeNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NodeDeclaration__NodeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2941:1: ( ( RULE_ID ) )
            // InternalEditorLanguage.g:2942:2: ( RULE_ID )
            {
            // InternalEditorLanguage.g:2942:2: ( RULE_ID )
            // InternalEditorLanguage.g:2943:3: RULE_ID
            {
             before(grammarAccess.getNodeDeclarationAccess().getNodeNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeDeclarationAccess().getNodeNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NodeDeclaration__NodeNameAssignment_1"


    // $ANTLR start "rule__NodeDeclaration__ProjectionsAssignment_3_0"
    // InternalEditorLanguage.g:2952:1: rule__NodeDeclaration__ProjectionsAssignment_3_0 : ( ruleProjectionDeclaration ) ;
    public final void rule__NodeDeclaration__ProjectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2956:1: ( ( ruleProjectionDeclaration ) )
            // InternalEditorLanguage.g:2957:2: ( ruleProjectionDeclaration )
            {
            // InternalEditorLanguage.g:2957:2: ( ruleProjectionDeclaration )
            // InternalEditorLanguage.g:2958:3: ruleProjectionDeclaration
            {
             before(grammarAccess.getNodeDeclarationAccess().getProjectionsProjectionDeclarationParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectionDeclaration();

            state._fsp--;

             after(grammarAccess.getNodeDeclarationAccess().getProjectionsProjectionDeclarationParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__NodeDeclaration__ProjectionsAssignment_3_0"


    // $ANTLR start "rule__NodeDeclaration__ComponentsAssignment_3_1"
    // InternalEditorLanguage.g:2967:1: rule__NodeDeclaration__ComponentsAssignment_3_1 : ( ruleComponentDeclaration ) ;
    public final void rule__NodeDeclaration__ComponentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2971:1: ( ( ruleComponentDeclaration ) )
            // InternalEditorLanguage.g:2972:2: ( ruleComponentDeclaration )
            {
            // InternalEditorLanguage.g:2972:2: ( ruleComponentDeclaration )
            // InternalEditorLanguage.g:2973:3: ruleComponentDeclaration
            {
             before(grammarAccess.getNodeDeclarationAccess().getComponentsComponentDeclarationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentDeclaration();

            state._fsp--;

             after(grammarAccess.getNodeDeclarationAccess().getComponentsComponentDeclarationParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__NodeDeclaration__ComponentsAssignment_3_1"


    // $ANTLR start "rule__ProjectionDeclaration__NameAssignment_1"
    // InternalEditorLanguage.g:2982:1: rule__ProjectionDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ProjectionDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:2986:1: ( ( RULE_ID ) )
            // InternalEditorLanguage.g:2987:2: ( RULE_ID )
            {
            // InternalEditorLanguage.g:2987:2: ( RULE_ID )
            // InternalEditorLanguage.g:2988:3: RULE_ID
            {
             before(grammarAccess.getProjectionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ProjectionDeclaration__ViewAssignment_4"
    // InternalEditorLanguage.g:2997:1: rule__ProjectionDeclaration__ViewAssignment_4 : ( ruleHtmlSnippet ) ;
    public final void rule__ProjectionDeclaration__ViewAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3001:1: ( ( ruleHtmlSnippet ) )
            // InternalEditorLanguage.g:3002:2: ( ruleHtmlSnippet )
            {
            // InternalEditorLanguage.g:3002:2: ( ruleHtmlSnippet )
            // InternalEditorLanguage.g:3003:3: ruleHtmlSnippet
            {
             before(grammarAccess.getProjectionDeclarationAccess().getViewHtmlSnippetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHtmlSnippet();

            state._fsp--;

             after(grammarAccess.getProjectionDeclarationAccess().getViewHtmlSnippetParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__ViewAssignment_4"


    // $ANTLR start "rule__ProjectionDeclaration__AttributesAssignment_5_0"
    // InternalEditorLanguage.g:3012:1: rule__ProjectionDeclaration__AttributesAssignment_5_0 : ( ruleAttributeDeclaration ) ;
    public final void rule__ProjectionDeclaration__AttributesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3016:1: ( ( ruleAttributeDeclaration ) )
            // InternalEditorLanguage.g:3017:2: ( ruleAttributeDeclaration )
            {
            // InternalEditorLanguage.g:3017:2: ( ruleAttributeDeclaration )
            // InternalEditorLanguage.g:3018:3: ruleAttributeDeclaration
            {
             before(grammarAccess.getProjectionDeclarationAccess().getAttributesAttributeDeclarationParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeDeclaration();

            state._fsp--;

             after(grammarAccess.getProjectionDeclarationAccess().getAttributesAttributeDeclarationParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__AttributesAssignment_5_0"


    // $ANTLR start "rule__ProjectionDeclaration__ComponentsAssignment_5_1"
    // InternalEditorLanguage.g:3027:1: rule__ProjectionDeclaration__ComponentsAssignment_5_1 : ( ruleComponentDeclaration ) ;
    public final void rule__ProjectionDeclaration__ComponentsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3031:1: ( ( ruleComponentDeclaration ) )
            // InternalEditorLanguage.g:3032:2: ( ruleComponentDeclaration )
            {
            // InternalEditorLanguage.g:3032:2: ( ruleComponentDeclaration )
            // InternalEditorLanguage.g:3033:3: ruleComponentDeclaration
            {
             before(grammarAccess.getProjectionDeclarationAccess().getComponentsComponentDeclarationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentDeclaration();

            state._fsp--;

             after(grammarAccess.getProjectionDeclarationAccess().getComponentsComponentDeclarationParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__ProjectionDeclaration__ComponentsAssignment_5_1"


    // $ANTLR start "rule__AttributeDeclaration__AttributeNameAssignment_1"
    // InternalEditorLanguage.g:3042:1: rule__AttributeDeclaration__AttributeNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeDeclaration__AttributeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3046:1: ( ( RULE_ID ) )
            // InternalEditorLanguage.g:3047:2: ( RULE_ID )
            {
            // InternalEditorLanguage.g:3047:2: ( RULE_ID )
            // InternalEditorLanguage.g:3048:3: RULE_ID
            {
             before(grammarAccess.getAttributeDeclarationAccess().getAttributeNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeDeclarationAccess().getAttributeNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttributeDeclaration__AttributeNameAssignment_1"


    // $ANTLR start "rule__AttributeDeclaration__ControllerAssignment_2"
    // InternalEditorLanguage.g:3057:1: rule__AttributeDeclaration__ControllerAssignment_2 : ( ruleAttributeController ) ;
    public final void rule__AttributeDeclaration__ControllerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3061:1: ( ( ruleAttributeController ) )
            // InternalEditorLanguage.g:3062:2: ( ruleAttributeController )
            {
            // InternalEditorLanguage.g:3062:2: ( ruleAttributeController )
            // InternalEditorLanguage.g:3063:3: ruleAttributeController
            {
             before(grammarAccess.getAttributeDeclarationAccess().getControllerAttributeControllerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeController();

            state._fsp--;

             after(grammarAccess.getAttributeDeclarationAccess().getControllerAttributeControllerParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AttributeDeclaration__ControllerAssignment_2"


    // $ANTLR start "rule__ComponentId__ComponentTypeAssignment_1"
    // InternalEditorLanguage.g:3072:1: rule__ComponentId__ComponentTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComponentId__ComponentTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3076:1: ( ( ( RULE_ID ) ) )
            // InternalEditorLanguage.g:3077:2: ( ( RULE_ID ) )
            {
            // InternalEditorLanguage.g:3077:2: ( ( RULE_ID ) )
            // InternalEditorLanguage.g:3078:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentIdAccess().getComponentTypeComponentDeclarationCrossReference_1_0()); 
            // InternalEditorLanguage.g:3079:3: ( RULE_ID )
            // InternalEditorLanguage.g:3080:4: RULE_ID
            {
             before(grammarAccess.getComponentIdAccess().getComponentTypeComponentDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentIdAccess().getComponentTypeComponentDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentIdAccess().getComponentTypeComponentDeclarationCrossReference_1_0()); 

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
    // $ANTLR end "rule__ComponentId__ComponentTypeAssignment_1"


    // $ANTLR start "rule__ComponentId__AttributeNameAssignment_2_1"
    // InternalEditorLanguage.g:3091:1: rule__ComponentId__AttributeNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__ComponentId__AttributeNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3095:1: ( ( RULE_ID ) )
            // InternalEditorLanguage.g:3096:2: ( RULE_ID )
            {
            // InternalEditorLanguage.g:3096:2: ( RULE_ID )
            // InternalEditorLanguage.g:3097:3: RULE_ID
            {
             before(grammarAccess.getComponentIdAccess().getAttributeNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentIdAccess().getAttributeNameIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ComponentId__AttributeNameAssignment_2_1"


    // $ANTLR start "rule__AttributeController__GetterAssignment_2"
    // InternalEditorLanguage.g:3106:1: rule__AttributeController__GetterAssignment_2 : ( ruleJsSnippet ) ;
    public final void rule__AttributeController__GetterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3110:1: ( ( ruleJsSnippet ) )
            // InternalEditorLanguage.g:3111:2: ( ruleJsSnippet )
            {
            // InternalEditorLanguage.g:3111:2: ( ruleJsSnippet )
            // InternalEditorLanguage.g:3112:3: ruleJsSnippet
            {
             before(grammarAccess.getAttributeControllerAccess().getGetterJsSnippetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJsSnippet();

            state._fsp--;

             after(grammarAccess.getAttributeControllerAccess().getGetterJsSnippetParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AttributeController__GetterAssignment_2"


    // $ANTLR start "rule__AttributeController__SetterAssignment_4"
    // InternalEditorLanguage.g:3121:1: rule__AttributeController__SetterAssignment_4 : ( ruleJsSnippet ) ;
    public final void rule__AttributeController__SetterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3125:1: ( ( ruleJsSnippet ) )
            // InternalEditorLanguage.g:3126:2: ( ruleJsSnippet )
            {
            // InternalEditorLanguage.g:3126:2: ( ruleJsSnippet )
            // InternalEditorLanguage.g:3127:3: ruleJsSnippet
            {
             before(grammarAccess.getAttributeControllerAccess().getSetterJsSnippetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleJsSnippet();

            state._fsp--;

             after(grammarAccess.getAttributeControllerAccess().getSetterJsSnippetParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AttributeController__SetterAssignment_4"


    // $ANTLR start "rule__AttributeController__ValidatorAssignment_6"
    // InternalEditorLanguage.g:3136:1: rule__AttributeController__ValidatorAssignment_6 : ( ruleJsSnippet ) ;
    public final void rule__AttributeController__ValidatorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3140:1: ( ( ruleJsSnippet ) )
            // InternalEditorLanguage.g:3141:2: ( ruleJsSnippet )
            {
            // InternalEditorLanguage.g:3141:2: ( ruleJsSnippet )
            // InternalEditorLanguage.g:3142:3: ruleJsSnippet
            {
             before(grammarAccess.getAttributeControllerAccess().getValidatorJsSnippetParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleJsSnippet();

            state._fsp--;

             after(grammarAccess.getAttributeControllerAccess().getValidatorJsSnippetParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__AttributeController__ValidatorAssignment_6"


    // $ANTLR start "rule__ChildId__ChildIdAssignment_1"
    // InternalEditorLanguage.g:3151:1: rule__ChildId__ChildIdAssignment_1 : ( RULE_ID ) ;
    public final void rule__ChildId__ChildIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3155:1: ( ( RULE_ID ) )
            // InternalEditorLanguage.g:3156:2: ( RULE_ID )
            {
            // InternalEditorLanguage.g:3156:2: ( RULE_ID )
            // InternalEditorLanguage.g:3157:3: RULE_ID
            {
             before(grammarAccess.getChildIdAccess().getChildIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChildIdAccess().getChildIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ChildId__ChildIdAssignment_1"


    // $ANTLR start "rule__ChildId__ProjectionIdAssignment_3"
    // InternalEditorLanguage.g:3166:1: rule__ChildId__ProjectionIdAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ChildId__ProjectionIdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3170:1: ( ( ( RULE_ID ) ) )
            // InternalEditorLanguage.g:3171:2: ( ( RULE_ID ) )
            {
            // InternalEditorLanguage.g:3171:2: ( ( RULE_ID ) )
            // InternalEditorLanguage.g:3172:3: ( RULE_ID )
            {
             before(grammarAccess.getChildIdAccess().getProjectionIdProjectionDeclarationCrossReference_3_0()); 
            // InternalEditorLanguage.g:3173:3: ( RULE_ID )
            // InternalEditorLanguage.g:3174:4: RULE_ID
            {
             before(grammarAccess.getChildIdAccess().getProjectionIdProjectionDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChildIdAccess().getProjectionIdProjectionDeclarationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getChildIdAccess().getProjectionIdProjectionDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__ChildId__ProjectionIdAssignment_3"


    // $ANTLR start "rule__TagId__TagNameAssignment_1"
    // InternalEditorLanguage.g:3185:1: rule__TagId__TagNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TagId__TagNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3189:1: ( ( RULE_ID ) )
            // InternalEditorLanguage.g:3190:2: ( RULE_ID )
            {
            // InternalEditorLanguage.g:3190:2: ( RULE_ID )
            // InternalEditorLanguage.g:3191:3: RULE_ID
            {
             before(grammarAccess.getTagIdAccess().getTagNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTagIdAccess().getTagNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TagId__TagNameAssignment_1"


    // $ANTLR start "rule__ComponentDeclaration__NameAssignment_1"
    // InternalEditorLanguage.g:3200:1: rule__ComponentDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3204:1: ( ( RULE_ID ) )
            // InternalEditorLanguage.g:3205:2: ( RULE_ID )
            {
            // InternalEditorLanguage.g:3205:2: ( RULE_ID )
            // InternalEditorLanguage.g:3206:3: RULE_ID
            {
             before(grammarAccess.getComponentDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComponentDeclaration__NameAssignment_1"


    // $ANTLR start "rule__ComponentDeclaration__ViewAssignment_4"
    // InternalEditorLanguage.g:3215:1: rule__ComponentDeclaration__ViewAssignment_4 : ( ruleHtmlSnippet ) ;
    public final void rule__ComponentDeclaration__ViewAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3219:1: ( ( ruleHtmlSnippet ) )
            // InternalEditorLanguage.g:3220:2: ( ruleHtmlSnippet )
            {
            // InternalEditorLanguage.g:3220:2: ( ruleHtmlSnippet )
            // InternalEditorLanguage.g:3221:3: ruleHtmlSnippet
            {
             before(grammarAccess.getComponentDeclarationAccess().getViewHtmlSnippetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHtmlSnippet();

            state._fsp--;

             after(grammarAccess.getComponentDeclarationAccess().getViewHtmlSnippetParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ComponentDeclaration__ViewAssignment_4"


    // $ANTLR start "rule__ComponentDeclaration__ControlAssignment_5"
    // InternalEditorLanguage.g:3230:1: rule__ComponentDeclaration__ControlAssignment_5 : ( ruleComponentController ) ;
    public final void rule__ComponentDeclaration__ControlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3234:1: ( ( ruleComponentController ) )
            // InternalEditorLanguage.g:3235:2: ( ruleComponentController )
            {
            // InternalEditorLanguage.g:3235:2: ( ruleComponentController )
            // InternalEditorLanguage.g:3236:3: ruleComponentController
            {
             before(grammarAccess.getComponentDeclarationAccess().getControlComponentControllerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentController();

            state._fsp--;

             after(grammarAccess.getComponentDeclarationAccess().getControlComponentControllerParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ComponentDeclaration__ControlAssignment_5"


    // $ANTLR start "rule__ComponentController__GetterAssignment_1"
    // InternalEditorLanguage.g:3245:1: rule__ComponentController__GetterAssignment_1 : ( ruleJsSnippet ) ;
    public final void rule__ComponentController__GetterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3249:1: ( ( ruleJsSnippet ) )
            // InternalEditorLanguage.g:3250:2: ( ruleJsSnippet )
            {
            // InternalEditorLanguage.g:3250:2: ( ruleJsSnippet )
            // InternalEditorLanguage.g:3251:3: ruleJsSnippet
            {
             before(grammarAccess.getComponentControllerAccess().getGetterJsSnippetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsSnippet();

            state._fsp--;

             after(grammarAccess.getComponentControllerAccess().getGetterJsSnippetParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComponentController__GetterAssignment_1"


    // $ANTLR start "rule__ComponentController__SetterAssignment_3"
    // InternalEditorLanguage.g:3260:1: rule__ComponentController__SetterAssignment_3 : ( ruleJsSnippet ) ;
    public final void rule__ComponentController__SetterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3264:1: ( ( ruleJsSnippet ) )
            // InternalEditorLanguage.g:3265:2: ( ruleJsSnippet )
            {
            // InternalEditorLanguage.g:3265:2: ( ruleJsSnippet )
            // InternalEditorLanguage.g:3266:3: ruleJsSnippet
            {
             before(grammarAccess.getComponentControllerAccess().getSetterJsSnippetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJsSnippet();

            state._fsp--;

             after(grammarAccess.getComponentControllerAccess().getSetterJsSnippetParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ComponentController__SetterAssignment_3"


    // $ANTLR start "rule__ComponentController__ValidatorAssignment_5"
    // InternalEditorLanguage.g:3275:1: rule__ComponentController__ValidatorAssignment_5 : ( ruleJsSnippet ) ;
    public final void rule__ComponentController__ValidatorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3279:1: ( ( ruleJsSnippet ) )
            // InternalEditorLanguage.g:3280:2: ( ruleJsSnippet )
            {
            // InternalEditorLanguage.g:3280:2: ( ruleJsSnippet )
            // InternalEditorLanguage.g:3281:3: ruleJsSnippet
            {
             before(grammarAccess.getComponentControllerAccess().getValidatorJsSnippetParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleJsSnippet();

            state._fsp--;

             after(grammarAccess.getComponentControllerAccess().getValidatorJsSnippetParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ComponentController__ValidatorAssignment_5"


    // $ANTLR start "rule__HtmlSnippet__HtmlAssignment_0_1"
    // InternalEditorLanguage.g:3290:1: rule__HtmlSnippet__HtmlAssignment_0_1 : ( ruleCodeLiteral ) ;
    public final void rule__HtmlSnippet__HtmlAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3294:1: ( ( ruleCodeLiteral ) )
            // InternalEditorLanguage.g:3295:2: ( ruleCodeLiteral )
            {
            // InternalEditorLanguage.g:3295:2: ( ruleCodeLiteral )
            // InternalEditorLanguage.g:3296:3: ruleCodeLiteral
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeLiteral();

            state._fsp--;

             after(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__HtmlSnippet__HtmlAssignment_0_1"


    // $ANTLR start "rule__HtmlSnippet__HtmlAssignment_1_0"
    // InternalEditorLanguage.g:3305:1: rule__HtmlSnippet__HtmlAssignment_1_0 : ( ruleCodeLiteralStart ) ;
    public final void rule__HtmlSnippet__HtmlAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3309:1: ( ( ruleCodeLiteralStart ) )
            // InternalEditorLanguage.g:3310:2: ( ruleCodeLiteralStart )
            {
            // InternalEditorLanguage.g:3310:2: ( ruleCodeLiteralStart )
            // InternalEditorLanguage.g:3311:3: ruleCodeLiteralStart
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralStartParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeLiteralStart();

            state._fsp--;

             after(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralStartParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__HtmlSnippet__HtmlAssignment_1_0"


    // $ANTLR start "rule__HtmlSnippet__HtmlAssignment_1_1"
    // InternalEditorLanguage.g:3320:1: rule__HtmlSnippet__HtmlAssignment_1_1 : ( ruleHtmlAnnotation ) ;
    public final void rule__HtmlSnippet__HtmlAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3324:1: ( ( ruleHtmlAnnotation ) )
            // InternalEditorLanguage.g:3325:2: ( ruleHtmlAnnotation )
            {
            // InternalEditorLanguage.g:3325:2: ( ruleHtmlAnnotation )
            // InternalEditorLanguage.g:3326:3: ruleHtmlAnnotation
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlHtmlAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHtmlAnnotation();

            state._fsp--;

             after(grammarAccess.getHtmlSnippetAccess().getHtmlHtmlAnnotationParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__HtmlSnippet__HtmlAssignment_1_1"


    // $ANTLR start "rule__HtmlSnippet__HtmlAssignment_1_2_0"
    // InternalEditorLanguage.g:3335:1: rule__HtmlSnippet__HtmlAssignment_1_2_0 : ( ruleCodeLiteralMid ) ;
    public final void rule__HtmlSnippet__HtmlAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3339:1: ( ( ruleCodeLiteralMid ) )
            // InternalEditorLanguage.g:3340:2: ( ruleCodeLiteralMid )
            {
            // InternalEditorLanguage.g:3340:2: ( ruleCodeLiteralMid )
            // InternalEditorLanguage.g:3341:3: ruleCodeLiteralMid
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralMidParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeLiteralMid();

            state._fsp--;

             after(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralMidParserRuleCall_1_2_0_0()); 

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
    // $ANTLR end "rule__HtmlSnippet__HtmlAssignment_1_2_0"


    // $ANTLR start "rule__HtmlSnippet__HtmlAssignment_1_2_1"
    // InternalEditorLanguage.g:3350:1: rule__HtmlSnippet__HtmlAssignment_1_2_1 : ( ruleHtmlAnnotation ) ;
    public final void rule__HtmlSnippet__HtmlAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3354:1: ( ( ruleHtmlAnnotation ) )
            // InternalEditorLanguage.g:3355:2: ( ruleHtmlAnnotation )
            {
            // InternalEditorLanguage.g:3355:2: ( ruleHtmlAnnotation )
            // InternalEditorLanguage.g:3356:3: ruleHtmlAnnotation
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlHtmlAnnotationParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHtmlAnnotation();

            state._fsp--;

             after(grammarAccess.getHtmlSnippetAccess().getHtmlHtmlAnnotationParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__HtmlSnippet__HtmlAssignment_1_2_1"


    // $ANTLR start "rule__HtmlSnippet__HtmlAssignment_1_3"
    // InternalEditorLanguage.g:3365:1: rule__HtmlSnippet__HtmlAssignment_1_3 : ( ruleCodeLiteralEnd ) ;
    public final void rule__HtmlSnippet__HtmlAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3369:1: ( ( ruleCodeLiteralEnd ) )
            // InternalEditorLanguage.g:3370:2: ( ruleCodeLiteralEnd )
            {
            // InternalEditorLanguage.g:3370:2: ( ruleCodeLiteralEnd )
            // InternalEditorLanguage.g:3371:3: ruleCodeLiteralEnd
            {
             before(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralEndParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeLiteralEnd();

            state._fsp--;

             after(grammarAccess.getHtmlSnippetAccess().getHtmlCodeLiteralEndParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__HtmlSnippet__HtmlAssignment_1_3"


    // $ANTLR start "rule__CodeLiteral__ValueAssignment"
    // InternalEditorLanguage.g:3380:1: rule__CodeLiteral__ValueAssignment : ( RULE_CODENOTAG ) ;
    public final void rule__CodeLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3384:1: ( ( RULE_CODENOTAG ) )
            // InternalEditorLanguage.g:3385:2: ( RULE_CODENOTAG )
            {
            // InternalEditorLanguage.g:3385:2: ( RULE_CODENOTAG )
            // InternalEditorLanguage.g:3386:3: RULE_CODENOTAG
            {
             before(grammarAccess.getCodeLiteralAccess().getValueCODENOTAGTerminalRuleCall_0()); 
            match(input,RULE_CODENOTAG,FOLLOW_2); 
             after(grammarAccess.getCodeLiteralAccess().getValueCODENOTAGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CodeLiteral__ValueAssignment"


    // $ANTLR start "rule__CodeLiteralStart__ValueAssignment"
    // InternalEditorLanguage.g:3395:1: rule__CodeLiteralStart__ValueAssignment : ( RULE_CODESTART ) ;
    public final void rule__CodeLiteralStart__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3399:1: ( ( RULE_CODESTART ) )
            // InternalEditorLanguage.g:3400:2: ( RULE_CODESTART )
            {
            // InternalEditorLanguage.g:3400:2: ( RULE_CODESTART )
            // InternalEditorLanguage.g:3401:3: RULE_CODESTART
            {
             before(grammarAccess.getCodeLiteralStartAccess().getValueCODESTARTTerminalRuleCall_0()); 
            match(input,RULE_CODESTART,FOLLOW_2); 
             after(grammarAccess.getCodeLiteralStartAccess().getValueCODESTARTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CodeLiteralStart__ValueAssignment"


    // $ANTLR start "rule__CodeLiteralMid__ValueAssignment"
    // InternalEditorLanguage.g:3410:1: rule__CodeLiteralMid__ValueAssignment : ( RULE_CODEMID ) ;
    public final void rule__CodeLiteralMid__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3414:1: ( ( RULE_CODEMID ) )
            // InternalEditorLanguage.g:3415:2: ( RULE_CODEMID )
            {
            // InternalEditorLanguage.g:3415:2: ( RULE_CODEMID )
            // InternalEditorLanguage.g:3416:3: RULE_CODEMID
            {
             before(grammarAccess.getCodeLiteralMidAccess().getValueCODEMIDTerminalRuleCall_0()); 
            match(input,RULE_CODEMID,FOLLOW_2); 
             after(grammarAccess.getCodeLiteralMidAccess().getValueCODEMIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CodeLiteralMid__ValueAssignment"


    // $ANTLR start "rule__CodeLiteralEnd__ValueAssignment"
    // InternalEditorLanguage.g:3425:1: rule__CodeLiteralEnd__ValueAssignment : ( RULE_CODEEND ) ;
    public final void rule__CodeLiteralEnd__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3429:1: ( ( RULE_CODEEND ) )
            // InternalEditorLanguage.g:3430:2: ( RULE_CODEEND )
            {
            // InternalEditorLanguage.g:3430:2: ( RULE_CODEEND )
            // InternalEditorLanguage.g:3431:3: RULE_CODEEND
            {
             before(grammarAccess.getCodeLiteralEndAccess().getValueCODEENDTerminalRuleCall_0()); 
            match(input,RULE_CODEEND,FOLLOW_2); 
             after(grammarAccess.getCodeLiteralEndAccess().getValueCODEENDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CodeLiteralEnd__ValueAssignment"


    // $ANTLR start "rule__JsSnippet__JsAssignment_0_1"
    // InternalEditorLanguage.g:3440:1: rule__JsSnippet__JsAssignment_0_1 : ( ruleCodeLiteral ) ;
    public final void rule__JsSnippet__JsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3444:1: ( ( ruleCodeLiteral ) )
            // InternalEditorLanguage.g:3445:2: ( ruleCodeLiteral )
            {
            // InternalEditorLanguage.g:3445:2: ( ruleCodeLiteral )
            // InternalEditorLanguage.g:3446:3: ruleCodeLiteral
            {
             before(grammarAccess.getJsSnippetAccess().getJsCodeLiteralParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeLiteral();

            state._fsp--;

             after(grammarAccess.getJsSnippetAccess().getJsCodeLiteralParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__JsSnippet__JsAssignment_0_1"


    // $ANTLR start "rule__JsSnippet__JsAssignment_1_0"
    // InternalEditorLanguage.g:3455:1: rule__JsSnippet__JsAssignment_1_0 : ( ruleCodeLiteralStart ) ;
    public final void rule__JsSnippet__JsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3459:1: ( ( ruleCodeLiteralStart ) )
            // InternalEditorLanguage.g:3460:2: ( ruleCodeLiteralStart )
            {
            // InternalEditorLanguage.g:3460:2: ( ruleCodeLiteralStart )
            // InternalEditorLanguage.g:3461:3: ruleCodeLiteralStart
            {
             before(grammarAccess.getJsSnippetAccess().getJsCodeLiteralStartParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeLiteralStart();

            state._fsp--;

             after(grammarAccess.getJsSnippetAccess().getJsCodeLiteralStartParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__JsSnippet__JsAssignment_1_0"


    // $ANTLR start "rule__JsSnippet__JsAssignment_1_1"
    // InternalEditorLanguage.g:3470:1: rule__JsSnippet__JsAssignment_1_1 : ( ruleJsExtraTag ) ;
    public final void rule__JsSnippet__JsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3474:1: ( ( ruleJsExtraTag ) )
            // InternalEditorLanguage.g:3475:2: ( ruleJsExtraTag )
            {
            // InternalEditorLanguage.g:3475:2: ( ruleJsExtraTag )
            // InternalEditorLanguage.g:3476:3: ruleJsExtraTag
            {
             before(grammarAccess.getJsSnippetAccess().getJsJsExtraTagParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsExtraTag();

            state._fsp--;

             after(grammarAccess.getJsSnippetAccess().getJsJsExtraTagParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__JsSnippet__JsAssignment_1_1"


    // $ANTLR start "rule__JsSnippet__JsAssignment_1_2_0"
    // InternalEditorLanguage.g:3485:1: rule__JsSnippet__JsAssignment_1_2_0 : ( ruleCodeLiteralMid ) ;
    public final void rule__JsSnippet__JsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3489:1: ( ( ruleCodeLiteralMid ) )
            // InternalEditorLanguage.g:3490:2: ( ruleCodeLiteralMid )
            {
            // InternalEditorLanguage.g:3490:2: ( ruleCodeLiteralMid )
            // InternalEditorLanguage.g:3491:3: ruleCodeLiteralMid
            {
             before(grammarAccess.getJsSnippetAccess().getJsCodeLiteralMidParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeLiteralMid();

            state._fsp--;

             after(grammarAccess.getJsSnippetAccess().getJsCodeLiteralMidParserRuleCall_1_2_0_0()); 

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
    // $ANTLR end "rule__JsSnippet__JsAssignment_1_2_0"


    // $ANTLR start "rule__JsSnippet__JsAssignment_1_2_1"
    // InternalEditorLanguage.g:3500:1: rule__JsSnippet__JsAssignment_1_2_1 : ( ruleJsExtraTag ) ;
    public final void rule__JsSnippet__JsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3504:1: ( ( ruleJsExtraTag ) )
            // InternalEditorLanguage.g:3505:2: ( ruleJsExtraTag )
            {
            // InternalEditorLanguage.g:3505:2: ( ruleJsExtraTag )
            // InternalEditorLanguage.g:3506:3: ruleJsExtraTag
            {
             before(grammarAccess.getJsSnippetAccess().getJsJsExtraTagParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsExtraTag();

            state._fsp--;

             after(grammarAccess.getJsSnippetAccess().getJsJsExtraTagParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__JsSnippet__JsAssignment_1_2_1"


    // $ANTLR start "rule__JsSnippet__JsAssignment_1_3"
    // InternalEditorLanguage.g:3515:1: rule__JsSnippet__JsAssignment_1_3 : ( ruleCodeLiteralEnd ) ;
    public final void rule__JsSnippet__JsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEditorLanguage.g:3519:1: ( ( ruleCodeLiteralEnd ) )
            // InternalEditorLanguage.g:3520:2: ( ruleCodeLiteralEnd )
            {
            // InternalEditorLanguage.g:3520:2: ( ruleCodeLiteralEnd )
            // InternalEditorLanguage.g:3521:3: ruleCodeLiteralEnd
            {
             before(grammarAccess.getJsSnippetAccess().getJsCodeLiteralEndParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeLiteralEnd();

            state._fsp--;

             after(grammarAccess.getJsSnippetAccess().getJsCodeLiteralEndParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__JsSnippet__JsAssignment_1_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000200D0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020090002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020250000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020210002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000018400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000082L});

}