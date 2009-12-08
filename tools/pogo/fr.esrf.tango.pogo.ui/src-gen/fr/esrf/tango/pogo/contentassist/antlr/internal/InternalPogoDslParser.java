package fr.esrf.tango.pogo.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import fr.esrf.tango.pogo.services.PogoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalPogoDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cpp'", "'Java'", "'Python'", "'OPERATOR'", "'EXPERT'", "'Scalar'", "'Spectrum'", "'Image'", "'READ'", "'WRITE'", "'READ_WRITE'", "'READ_WITH_WRITE'", "'true'", "'false'", "'import'", "'deviceclass'", "'{'", "'description:'", "'classProperties:'", "'deviceProperties:'", "'commands:'", "'attributes:'", "'states:'", "'}'", "'extends'", "'inheritances:'", "'defaultPropValue:'", "'excludedStates:'", "'void'", "'boolean'", "'short'", "'ushort'", "'int'", "'uint'", "'float'", "'double'", "'string'", "'DevVarCharArray'", "'DevVarShortArray'", "'DevVarUShortArray'", "'DevVarLongArray'", "'DevVarULongArray'", "'DevVarFloatArray'", "'DevVarDoubleArray'", "'DevVarStringArray'", "'DevVarLongStringArray'", "'DevVarDoubleStringArray'", "'DevState'", "'ConstDevString'", "'DevVarBooleanArray'", "'DevUChar'", "'DevLong64'", "'DevULong64'", "'DevVarLong64Array'", "'DevVarULong64Array'", "'DevInt'", "'DevEncoded'", "'vector<short>'", "'vector<int>'", "'vector<float>'", "'vector<double>'", "'vector<string>'", "'abstract'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalPogoDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g"; }


     
     	private PogoDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PogoDslGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRulePogoSystem
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:60:1: entryRulePogoSystem : rulePogoSystem EOF ;
    public final void entryRulePogoSystem() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:60:21: ( rulePogoSystem EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:61:1: rulePogoSystem EOF
            {
             before(grammarAccess.getPogoSystemRule()); 
            pushFollow(FOLLOW_rulePogoSystem_in_entryRulePogoSystem60);
            rulePogoSystem();
            _fsp--;

             after(grammarAccess.getPogoSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoSystem67); 

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
    // $ANTLR end entryRulePogoSystem


    // $ANTLR start rulePogoSystem
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:68:1: rulePogoSystem : ( ( rule__PogoSystem__Group__0 ) ) ;
    public final void rulePogoSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:72:2: ( ( ( rule__PogoSystem__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:73:1: ( ( rule__PogoSystem__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:73:1: ( ( rule__PogoSystem__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:74:1: ( rule__PogoSystem__Group__0 )
            {
             before(grammarAccess.getPogoSystemAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:75:1: ( rule__PogoSystem__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:75:2: rule__PogoSystem__Group__0
            {
            pushFollow(FOLLOW_rule__PogoSystem__Group__0_in_rulePogoSystem94);
            rule__PogoSystem__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPogoSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePogoSystem


    // $ANTLR start entryRuleImport
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:87:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:87:17: ( ruleImport EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:88:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport120);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport127); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:95:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:99:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:100:1: ( ( rule__Import__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:100:1: ( ( rule__Import__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:101:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:102:1: ( rule__Import__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:102:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();
            _fsp--;


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
    // $ANTLR end ruleImport


    // $ANTLR start entryRulePogoDeviceClass
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:114:1: entryRulePogoDeviceClass : rulePogoDeviceClass EOF ;
    public final void entryRulePogoDeviceClass() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:114:26: ( rulePogoDeviceClass EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:115:1: rulePogoDeviceClass EOF
            {
             before(grammarAccess.getPogoDeviceClassRule()); 
            pushFollow(FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass180);
            rulePogoDeviceClass();
            _fsp--;

             after(grammarAccess.getPogoDeviceClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePogoDeviceClass187); 

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
    // $ANTLR end entryRulePogoDeviceClass


    // $ANTLR start rulePogoDeviceClass
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:122:1: rulePogoDeviceClass : ( ( rule__PogoDeviceClass__Group__0 ) ) ;
    public final void rulePogoDeviceClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:126:2: ( ( ( rule__PogoDeviceClass__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:127:1: ( ( rule__PogoDeviceClass__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:127:1: ( ( rule__PogoDeviceClass__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:128:1: ( rule__PogoDeviceClass__Group__0 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:129:1: ( rule__PogoDeviceClass__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:129:2: rule__PogoDeviceClass__Group__0
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__0_in_rulePogoDeviceClass214);
            rule__PogoDeviceClass__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePogoDeviceClass


    // $ANTLR start entryRuleLanguage
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:141:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:141:19: ( ruleLanguage EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:142:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage240);
            ruleLanguage();
            _fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage247); 

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
    // $ANTLR end entryRuleLanguage


    // $ANTLR start ruleLanguage
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:149:1: ruleLanguage : ( ( rule__Language__Alternatives ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:153:2: ( ( ( rule__Language__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:154:1: ( ( rule__Language__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:154:1: ( ( rule__Language__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:155:1: ( rule__Language__Alternatives )
            {
             before(grammarAccess.getLanguageAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:156:1: ( rule__Language__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:156:2: rule__Language__Alternatives
            {
            pushFollow(FOLLOW_rule__Language__Alternatives_in_ruleLanguage274);
            rule__Language__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLanguageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLanguage


    // $ANTLR start entryRuleDisplayLevel
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:168:1: entryRuleDisplayLevel : ruleDisplayLevel EOF ;
    public final void entryRuleDisplayLevel() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:168:23: ( ruleDisplayLevel EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:169:1: ruleDisplayLevel EOF
            {
             before(grammarAccess.getDisplayLevelRule()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel300);
            ruleDisplayLevel();
            _fsp--;

             after(grammarAccess.getDisplayLevelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayLevel307); 

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
    // $ANTLR end entryRuleDisplayLevel


    // $ANTLR start ruleDisplayLevel
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:176:1: ruleDisplayLevel : ( ( rule__DisplayLevel__Alternatives ) ) ;
    public final void ruleDisplayLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:180:2: ( ( ( rule__DisplayLevel__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:181:1: ( ( rule__DisplayLevel__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:181:1: ( ( rule__DisplayLevel__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:182:1: ( rule__DisplayLevel__Alternatives )
            {
             before(grammarAccess.getDisplayLevelAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:183:1: ( rule__DisplayLevel__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:183:2: rule__DisplayLevel__Alternatives
            {
            pushFollow(FOLLOW_rule__DisplayLevel__Alternatives_in_ruleDisplayLevel334);
            rule__DisplayLevel__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDisplayLevelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDisplayLevel


    // $ANTLR start entryRuleAttrType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:195:1: entryRuleAttrType : ruleAttrType EOF ;
    public final void entryRuleAttrType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:195:19: ( ruleAttrType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:196:1: ruleAttrType EOF
            {
             before(grammarAccess.getAttrTypeRule()); 
            pushFollow(FOLLOW_ruleAttrType_in_entryRuleAttrType360);
            ruleAttrType();
            _fsp--;

             after(grammarAccess.getAttrTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrType367); 

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
    // $ANTLR end entryRuleAttrType


    // $ANTLR start ruleAttrType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:203:1: ruleAttrType : ( ( rule__AttrType__Alternatives ) ) ;
    public final void ruleAttrType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:207:2: ( ( ( rule__AttrType__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:208:1: ( ( rule__AttrType__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:208:1: ( ( rule__AttrType__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:209:1: ( rule__AttrType__Alternatives )
            {
             before(grammarAccess.getAttrTypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:210:1: ( rule__AttrType__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:210:2: rule__AttrType__Alternatives
            {
            pushFollow(FOLLOW_rule__AttrType__Alternatives_in_ruleAttrType394);
            rule__AttrType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getAttrTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttrType


    // $ANTLR start entryRuleRW_Type
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:222:1: entryRuleRW_Type : ruleRW_Type EOF ;
    public final void entryRuleRW_Type() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:222:18: ( ruleRW_Type EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:223:1: ruleRW_Type EOF
            {
             before(grammarAccess.getRW_TypeRule()); 
            pushFollow(FOLLOW_ruleRW_Type_in_entryRuleRW_Type420);
            ruleRW_Type();
            _fsp--;

             after(grammarAccess.getRW_TypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRW_Type427); 

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
    // $ANTLR end entryRuleRW_Type


    // $ANTLR start ruleRW_Type
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:230:1: ruleRW_Type : ( ( rule__RW_Type__Alternatives ) ) ;
    public final void ruleRW_Type() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:234:2: ( ( ( rule__RW_Type__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:235:1: ( ( rule__RW_Type__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:235:1: ( ( rule__RW_Type__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:236:1: ( rule__RW_Type__Alternatives )
            {
             before(grammarAccess.getRW_TypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:237:1: ( rule__RW_Type__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:237:2: rule__RW_Type__Alternatives
            {
            pushFollow(FOLLOW_rule__RW_Type__Alternatives_in_ruleRW_Type454);
            rule__RW_Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getRW_TypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRW_Type


    // $ANTLR start entryRuleBoolean
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:249:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:249:18: ( ruleBoolean EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:250:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean480);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean487); 

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
    // $ANTLR end entryRuleBoolean


    // $ANTLR start ruleBoolean
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:257:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:261:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:262:1: ( ( rule__Boolean__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:262:1: ( ( rule__Boolean__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:263:1: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:264:1: ( rule__Boolean__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:264:2: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean514);
            rule__Boolean__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBoolean


    // $ANTLR start entryRuleClassDescription
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:276:1: entryRuleClassDescription : ruleClassDescription EOF ;
    public final void entryRuleClassDescription() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:276:27: ( ruleClassDescription EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:277:1: ruleClassDescription EOF
            {
             before(grammarAccess.getClassDescriptionRule()); 
            pushFollow(FOLLOW_ruleClassDescription_in_entryRuleClassDescription540);
            ruleClassDescription();
            _fsp--;

             after(grammarAccess.getClassDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDescription547); 

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
    // $ANTLR end entryRuleClassDescription


    // $ANTLR start ruleClassDescription
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:284:1: ruleClassDescription : ( ( rule__ClassDescription__Group__0 ) ) ;
    public final void ruleClassDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:288:2: ( ( ( rule__ClassDescription__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:289:1: ( ( rule__ClassDescription__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:289:1: ( ( rule__ClassDescription__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:290:1: ( rule__ClassDescription__Group__0 )
            {
             before(grammarAccess.getClassDescriptionAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:291:1: ( rule__ClassDescription__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:291:2: rule__ClassDescription__Group__0
            {
            pushFollow(FOLLOW_rule__ClassDescription__Group__0_in_ruleClassDescription574);
            rule__ClassDescription__Group__0();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleClassDescription


    // $ANTLR start entryRuleInheritance
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:303:1: entryRuleInheritance : ruleInheritance EOF ;
    public final void entryRuleInheritance() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:303:22: ( ruleInheritance EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:304:1: ruleInheritance EOF
            {
             before(grammarAccess.getInheritanceRule()); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance600);
            ruleInheritance();
            _fsp--;

             after(grammarAccess.getInheritanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance607); 

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
    // $ANTLR end entryRuleInheritance


    // $ANTLR start ruleInheritance
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:311:1: ruleInheritance : ( ( rule__Inheritance__Group__0 ) ) ;
    public final void ruleInheritance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:315:2: ( ( ( rule__Inheritance__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:316:1: ( ( rule__Inheritance__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:316:1: ( ( rule__Inheritance__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:317:1: ( rule__Inheritance__Group__0 )
            {
             before(grammarAccess.getInheritanceAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:318:1: ( rule__Inheritance__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:318:2: rule__Inheritance__Group__0
            {
            pushFollow(FOLLOW_rule__Inheritance__Group__0_in_ruleInheritance634);
            rule__Inheritance__Group__0();
            _fsp--;


            }

             after(grammarAccess.getInheritanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInheritance


    // $ANTLR start entryRuleClassIdentification
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:330:1: entryRuleClassIdentification : ruleClassIdentification EOF ;
    public final void entryRuleClassIdentification() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:330:30: ( ruleClassIdentification EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:331:1: ruleClassIdentification EOF
            {
             before(grammarAccess.getClassIdentificationRule()); 
            pushFollow(FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification660);
            ruleClassIdentification();
            _fsp--;

             after(grammarAccess.getClassIdentificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassIdentification667); 

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
    // $ANTLR end entryRuleClassIdentification


    // $ANTLR start ruleClassIdentification
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:338:1: ruleClassIdentification : ( ( rule__ClassIdentification__Group__0 ) ) ;
    public final void ruleClassIdentification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:342:2: ( ( ( rule__ClassIdentification__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:343:1: ( ( rule__ClassIdentification__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:343:1: ( ( rule__ClassIdentification__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:344:1: ( rule__ClassIdentification__Group__0 )
            {
             before(grammarAccess.getClassIdentificationAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:345:1: ( rule__ClassIdentification__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:345:2: rule__ClassIdentification__Group__0
            {
            pushFollow(FOLLOW_rule__ClassIdentification__Group__0_in_ruleClassIdentification694);
            rule__ClassIdentification__Group__0();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleClassIdentification


    // $ANTLR start entryRuleComments
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:357:1: entryRuleComments : ruleComments EOF ;
    public final void entryRuleComments() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:357:19: ( ruleComments EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:358:1: ruleComments EOF
            {
             before(grammarAccess.getCommentsRule()); 
            pushFollow(FOLLOW_ruleComments_in_entryRuleComments720);
            ruleComments();
            _fsp--;

             after(grammarAccess.getCommentsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComments727); 

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
    // $ANTLR end entryRuleComments


    // $ANTLR start ruleComments
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:365:1: ruleComments : ( ( rule__Comments__CommandsTableAssignment ) ) ;
    public final void ruleComments() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:369:2: ( ( ( rule__Comments__CommandsTableAssignment ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:370:1: ( ( rule__Comments__CommandsTableAssignment ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:370:1: ( ( rule__Comments__CommandsTableAssignment ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:371:1: ( rule__Comments__CommandsTableAssignment )
            {
             before(grammarAccess.getCommentsAccess().getCommandsTableAssignment()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:372:1: ( rule__Comments__CommandsTableAssignment )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:372:2: rule__Comments__CommandsTableAssignment
            {
            pushFollow(FOLLOW_rule__Comments__CommandsTableAssignment_in_ruleComments754);
            rule__Comments__CommandsTableAssignment();
            _fsp--;


            }

             after(grammarAccess.getCommentsAccess().getCommandsTableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleComments


    // $ANTLR start entryRuleState
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:384:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:384:16: ( ruleState EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:385:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState780);
            ruleState();
            _fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState787); 

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
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:392:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:396:2: ( ( ( rule__State__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:397:1: ( ( rule__State__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:397:1: ( ( rule__State__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:398:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:399:1: ( rule__State__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:399:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState814);
            rule__State__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleState


    // $ANTLR start entryRuleProperty
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:411:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:411:19: ( ruleProperty EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:412:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty840);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty847); 

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
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:419:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:423:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:424:1: ( ( rule__Property__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:424:1: ( ( rule__Property__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:425:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:426:1: ( rule__Property__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:426:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty874);
            rule__Property__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProperty


    // $ANTLR start entryRulePropType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:438:1: entryRulePropType : rulePropType EOF ;
    public final void entryRulePropType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:438:19: ( rulePropType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:439:1: rulePropType EOF
            {
             before(grammarAccess.getPropTypeRule()); 
            pushFollow(FOLLOW_rulePropType_in_entryRulePropType900);
            rulePropType();
            _fsp--;

             after(grammarAccess.getPropTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropType907); 

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
    // $ANTLR end entryRulePropType


    // $ANTLR start rulePropType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:446:1: rulePropType : ( ( rule__PropType__Alternatives ) ) ;
    public final void rulePropType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:450:2: ( ( ( rule__PropType__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:451:1: ( ( rule__PropType__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:451:1: ( ( rule__PropType__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:452:1: ( rule__PropType__Alternatives )
            {
             before(grammarAccess.getPropTypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:453:1: ( rule__PropType__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:453:2: rule__PropType__Alternatives
            {
            pushFollow(FOLLOW_rule__PropType__Alternatives_in_rulePropType934);
            rule__PropType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPropTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePropType


    // $ANTLR start entryRuleSimpleType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:465:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:465:21: ( ruleSimpleType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:466:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType960);
            ruleSimpleType();
            _fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType967); 

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
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:473:1: ruleSimpleType : ( ( rule__SimpleType__Alternatives ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:477:2: ( ( ( rule__SimpleType__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:478:1: ( ( rule__SimpleType__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:478:1: ( ( rule__SimpleType__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:479:1: ( rule__SimpleType__Alternatives )
            {
             before(grammarAccess.getSimpleTypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:480:1: ( rule__SimpleType__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:480:2: rule__SimpleType__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType994);
            rule__SimpleType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:492:1: entryRuleVectorType : ruleVectorType EOF ;
    public final void entryRuleVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:492:21: ( ruleVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:493:1: ruleVectorType EOF
            {
             before(grammarAccess.getVectorTypeRule()); 
            pushFollow(FOLLOW_ruleVectorType_in_entryRuleVectorType1020);
            ruleVectorType();
            _fsp--;

             after(grammarAccess.getVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorType1027); 

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
    // $ANTLR end entryRuleVectorType


    // $ANTLR start ruleVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:500:1: ruleVectorType : ( ( rule__VectorType__Alternatives ) ) ;
    public final void ruleVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:504:2: ( ( ( rule__VectorType__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:505:1: ( ( rule__VectorType__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:505:1: ( ( rule__VectorType__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:506:1: ( rule__VectorType__Alternatives )
            {
             before(grammarAccess.getVectorTypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:507:1: ( rule__VectorType__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:507:2: rule__VectorType__Alternatives
            {
            pushFollow(FOLLOW_rule__VectorType__Alternatives_in_ruleVectorType1054);
            rule__VectorType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getVectorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVectorType


    // $ANTLR start entryRuleCommand
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:519:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:519:18: ( ruleCommand EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:520:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1080);
            ruleCommand();
            _fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1087); 

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
    // $ANTLR end entryRuleCommand


    // $ANTLR start ruleCommand
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:527:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:531:2: ( ( ( rule__Command__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:532:1: ( ( rule__Command__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:532:1: ( ( rule__Command__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:533:1: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:534:1: ( rule__Command__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:534:2: rule__Command__Group__0
            {
            pushFollow(FOLLOW_rule__Command__Group__0_in_ruleCommand1114);
            rule__Command__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCommand


    // $ANTLR start entryRuleArgument
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:546:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:546:19: ( ruleArgument EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:547:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument1140);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument1147); 

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
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:554:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:558:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:559:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:559:1: ( ( rule__Argument__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:560:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:561:1: ( rule__Argument__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:561:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument1174);
            rule__Argument__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleAttribute
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:573:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:573:20: ( ruleAttribute EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:574:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1200);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1207); 

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
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:581:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:585:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:586:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:586:1: ( ( rule__Attribute__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:587:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:588:1: ( rule__Attribute__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:588:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1234);
            rule__Attribute__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleFireEvents
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:600:1: entryRuleFireEvents : ruleFireEvents EOF ;
    public final void entryRuleFireEvents() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:600:21: ( ruleFireEvents EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:601:1: ruleFireEvents EOF
            {
             before(grammarAccess.getFireEventsRule()); 
            pushFollow(FOLLOW_ruleFireEvents_in_entryRuleFireEvents1260);
            ruleFireEvents();
            _fsp--;

             after(grammarAccess.getFireEventsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFireEvents1267); 

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
    // $ANTLR end entryRuleFireEvents


    // $ANTLR start ruleFireEvents
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:608:1: ruleFireEvents : ( ( rule__FireEvents__Group__0 ) ) ;
    public final void ruleFireEvents() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:612:2: ( ( ( rule__FireEvents__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:613:1: ( ( rule__FireEvents__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:613:1: ( ( rule__FireEvents__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:614:1: ( rule__FireEvents__Group__0 )
            {
             before(grammarAccess.getFireEventsAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:615:1: ( rule__FireEvents__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:615:2: rule__FireEvents__Group__0
            {
            pushFollow(FOLLOW_rule__FireEvents__Group__0_in_ruleFireEvents1294);
            rule__FireEvents__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFireEventsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFireEvents


    // $ANTLR start entryRuleAttrProperties
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:627:1: entryRuleAttrProperties : ruleAttrProperties EOF ;
    public final void entryRuleAttrProperties() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:627:25: ( ruleAttrProperties EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:628:1: ruleAttrProperties EOF
            {
             before(grammarAccess.getAttrPropertiesRule()); 
            pushFollow(FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties1320);
            ruleAttrProperties();
            _fsp--;

             after(grammarAccess.getAttrPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrProperties1327); 

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
    // $ANTLR end entryRuleAttrProperties


    // $ANTLR start ruleAttrProperties
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:635:1: ruleAttrProperties : ( ( rule__AttrProperties__Group__0 ) ) ;
    public final void ruleAttrProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:639:2: ( ( ( rule__AttrProperties__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:640:1: ( ( rule__AttrProperties__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:640:1: ( ( rule__AttrProperties__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:641:1: ( rule__AttrProperties__Group__0 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:642:1: ( rule__AttrProperties__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:642:2: rule__AttrProperties__Group__0
            {
            pushFollow(FOLLOW_rule__AttrProperties__Group__0_in_ruleAttrProperties1354);
            rule__AttrProperties__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttrProperties


    // $ANTLR start entryRuleType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:654:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:654:15: ( ruleType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:655:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1380);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1387); 

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:662:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:666:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:667:1: ( ( rule__Type__Alternatives ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:667:1: ( ( rule__Type__Alternatives ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:668:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:669:1: ( rule__Type__Alternatives )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:669:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1414);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleVoidType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:681:1: entryRuleVoidType : ruleVoidType EOF ;
    public final void entryRuleVoidType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:681:19: ( ruleVoidType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:682:1: ruleVoidType EOF
            {
             before(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_ruleVoidType_in_entryRuleVoidType1440);
            ruleVoidType();
            _fsp--;

             after(grammarAccess.getVoidTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVoidType1447); 

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
    // $ANTLR end entryRuleVoidType


    // $ANTLR start ruleVoidType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:689:1: ruleVoidType : ( ( rule__VoidType__Group__0 ) ) ;
    public final void ruleVoidType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:693:2: ( ( ( rule__VoidType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:694:1: ( ( rule__VoidType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:694:1: ( ( rule__VoidType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:695:1: ( rule__VoidType__Group__0 )
            {
             before(grammarAccess.getVoidTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:696:1: ( rule__VoidType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:696:2: rule__VoidType__Group__0
            {
            pushFollow(FOLLOW_rule__VoidType__Group__0_in_ruleVoidType1474);
            rule__VoidType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getVoidTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVoidType


    // $ANTLR start entryRuleBooleanType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:708:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:708:22: ( ruleBooleanType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:709:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType1500);
            ruleBooleanType();
            _fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType1507); 

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
    // $ANTLR end entryRuleBooleanType


    // $ANTLR start ruleBooleanType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:716:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:720:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:721:1: ( ( rule__BooleanType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:721:1: ( ( rule__BooleanType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:722:1: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:723:1: ( rule__BooleanType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:723:2: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType1534);
            rule__BooleanType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBooleanType


    // $ANTLR start entryRuleShortType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:735:1: entryRuleShortType : ruleShortType EOF ;
    public final void entryRuleShortType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:735:20: ( ruleShortType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:736:1: ruleShortType EOF
            {
             before(grammarAccess.getShortTypeRule()); 
            pushFollow(FOLLOW_ruleShortType_in_entryRuleShortType1560);
            ruleShortType();
            _fsp--;

             after(grammarAccess.getShortTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortType1567); 

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
    // $ANTLR end entryRuleShortType


    // $ANTLR start ruleShortType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:743:1: ruleShortType : ( ( rule__ShortType__Group__0 ) ) ;
    public final void ruleShortType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:747:2: ( ( ( rule__ShortType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:748:1: ( ( rule__ShortType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:748:1: ( ( rule__ShortType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:749:1: ( rule__ShortType__Group__0 )
            {
             before(grammarAccess.getShortTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:750:1: ( rule__ShortType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:750:2: rule__ShortType__Group__0
            {
            pushFollow(FOLLOW_rule__ShortType__Group__0_in_ruleShortType1594);
            rule__ShortType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getShortTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleShortType


    // $ANTLR start entryRuleUShortType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:762:1: entryRuleUShortType : ruleUShortType EOF ;
    public final void entryRuleUShortType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:762:21: ( ruleUShortType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:763:1: ruleUShortType EOF
            {
             before(grammarAccess.getUShortTypeRule()); 
            pushFollow(FOLLOW_ruleUShortType_in_entryRuleUShortType1620);
            ruleUShortType();
            _fsp--;

             after(grammarAccess.getUShortTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortType1627); 

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
    // $ANTLR end entryRuleUShortType


    // $ANTLR start ruleUShortType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:770:1: ruleUShortType : ( ( rule__UShortType__Group__0 ) ) ;
    public final void ruleUShortType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:774:2: ( ( ( rule__UShortType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:775:1: ( ( rule__UShortType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:775:1: ( ( rule__UShortType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:776:1: ( rule__UShortType__Group__0 )
            {
             before(grammarAccess.getUShortTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:777:1: ( rule__UShortType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:777:2: rule__UShortType__Group__0
            {
            pushFollow(FOLLOW_rule__UShortType__Group__0_in_ruleUShortType1654);
            rule__UShortType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUShortTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUShortType


    // $ANTLR start entryRuleIntType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:789:1: entryRuleIntType : ruleIntType EOF ;
    public final void entryRuleIntType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:789:18: ( ruleIntType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:790:1: ruleIntType EOF
            {
             before(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType1680);
            ruleIntType();
            _fsp--;

             after(grammarAccess.getIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType1687); 

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
    // $ANTLR end entryRuleIntType


    // $ANTLR start ruleIntType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:797:1: ruleIntType : ( ( rule__IntType__Group__0 ) ) ;
    public final void ruleIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:801:2: ( ( ( rule__IntType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:802:1: ( ( rule__IntType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:802:1: ( ( rule__IntType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:803:1: ( rule__IntType__Group__0 )
            {
             before(grammarAccess.getIntTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:804:1: ( rule__IntType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:804:2: rule__IntType__Group__0
            {
            pushFollow(FOLLOW_rule__IntType__Group__0_in_ruleIntType1714);
            rule__IntType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIntTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntType


    // $ANTLR start entryRuleUIntType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:816:1: entryRuleUIntType : ruleUIntType EOF ;
    public final void entryRuleUIntType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:816:19: ( ruleUIntType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:817:1: ruleUIntType EOF
            {
             before(grammarAccess.getUIntTypeRule()); 
            pushFollow(FOLLOW_ruleUIntType_in_entryRuleUIntType1740);
            ruleUIntType();
            _fsp--;

             after(grammarAccess.getUIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntType1747); 

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
    // $ANTLR end entryRuleUIntType


    // $ANTLR start ruleUIntType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:824:1: ruleUIntType : ( ( rule__UIntType__Group__0 ) ) ;
    public final void ruleUIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:828:2: ( ( ( rule__UIntType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:829:1: ( ( rule__UIntType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:829:1: ( ( rule__UIntType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:830:1: ( rule__UIntType__Group__0 )
            {
             before(grammarAccess.getUIntTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:831:1: ( rule__UIntType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:831:2: rule__UIntType__Group__0
            {
            pushFollow(FOLLOW_rule__UIntType__Group__0_in_ruleUIntType1774);
            rule__UIntType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUIntTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUIntType


    // $ANTLR start entryRuleFloatType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:843:1: entryRuleFloatType : ruleFloatType EOF ;
    public final void entryRuleFloatType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:843:20: ( ruleFloatType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:844:1: ruleFloatType EOF
            {
             before(grammarAccess.getFloatTypeRule()); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType1800);
            ruleFloatType();
            _fsp--;

             after(grammarAccess.getFloatTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType1807); 

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
    // $ANTLR end entryRuleFloatType


    // $ANTLR start ruleFloatType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:851:1: ruleFloatType : ( ( rule__FloatType__Group__0 ) ) ;
    public final void ruleFloatType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:855:2: ( ( ( rule__FloatType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:856:1: ( ( rule__FloatType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:856:1: ( ( rule__FloatType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:857:1: ( rule__FloatType__Group__0 )
            {
             before(grammarAccess.getFloatTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:858:1: ( rule__FloatType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:858:2: rule__FloatType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatType__Group__0_in_ruleFloatType1834);
            rule__FloatType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFloatTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFloatType


    // $ANTLR start entryRuleDoubleType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:870:1: entryRuleDoubleType : ruleDoubleType EOF ;
    public final void entryRuleDoubleType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:870:21: ( ruleDoubleType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:871:1: ruleDoubleType EOF
            {
             before(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleType_in_entryRuleDoubleType1860);
            ruleDoubleType();
            _fsp--;

             after(grammarAccess.getDoubleTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleType1867); 

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
    // $ANTLR end entryRuleDoubleType


    // $ANTLR start ruleDoubleType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:878:1: ruleDoubleType : ( ( rule__DoubleType__Group__0 ) ) ;
    public final void ruleDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:882:2: ( ( ( rule__DoubleType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:883:1: ( ( rule__DoubleType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:883:1: ( ( rule__DoubleType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:884:1: ( rule__DoubleType__Group__0 )
            {
             before(grammarAccess.getDoubleTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:885:1: ( rule__DoubleType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:885:2: rule__DoubleType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleType__Group__0_in_ruleDoubleType1894);
            rule__DoubleType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDoubleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDoubleType


    // $ANTLR start entryRuleStringType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:897:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:897:21: ( ruleStringType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:898:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType1920);
            ruleStringType();
            _fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType1927); 

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
    // $ANTLR end entryRuleStringType


    // $ANTLR start ruleStringType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:905:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:909:2: ( ( ( rule__StringType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:910:1: ( ( rule__StringType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:910:1: ( ( rule__StringType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:911:1: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:912:1: ( rule__StringType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:912:2: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_rule__StringType__Group__0_in_ruleStringType1954);
            rule__StringType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringType


    // $ANTLR start entryRuleCharArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:924:1: entryRuleCharArrayType : ruleCharArrayType EOF ;
    public final void entryRuleCharArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:924:24: ( ruleCharArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:925:1: ruleCharArrayType EOF
            {
             before(grammarAccess.getCharArrayTypeRule()); 
            pushFollow(FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType1980);
            ruleCharArrayType();
            _fsp--;

             after(grammarAccess.getCharArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharArrayType1987); 

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
    // $ANTLR end entryRuleCharArrayType


    // $ANTLR start ruleCharArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:932:1: ruleCharArrayType : ( ( rule__CharArrayType__Group__0 ) ) ;
    public final void ruleCharArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:936:2: ( ( ( rule__CharArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:937:1: ( ( rule__CharArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:937:1: ( ( rule__CharArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:938:1: ( rule__CharArrayType__Group__0 )
            {
             before(grammarAccess.getCharArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:939:1: ( rule__CharArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:939:2: rule__CharArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__CharArrayType__Group__0_in_ruleCharArrayType2014);
            rule__CharArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCharArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCharArrayType


    // $ANTLR start entryRuleShortArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:951:1: entryRuleShortArrayType : ruleShortArrayType EOF ;
    public final void entryRuleShortArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:951:25: ( ruleShortArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:952:1: ruleShortArrayType EOF
            {
             before(grammarAccess.getShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType2040);
            ruleShortArrayType();
            _fsp--;

             after(grammarAccess.getShortArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortArrayType2047); 

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
    // $ANTLR end entryRuleShortArrayType


    // $ANTLR start ruleShortArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:959:1: ruleShortArrayType : ( ( rule__ShortArrayType__Group__0 ) ) ;
    public final void ruleShortArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:963:2: ( ( ( rule__ShortArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:964:1: ( ( rule__ShortArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:964:1: ( ( rule__ShortArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:965:1: ( rule__ShortArrayType__Group__0 )
            {
             before(grammarAccess.getShortArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:966:1: ( rule__ShortArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:966:2: rule__ShortArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ShortArrayType__Group__0_in_ruleShortArrayType2074);
            rule__ShortArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getShortArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleShortArrayType


    // $ANTLR start entryRuleUShortArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:978:1: entryRuleUShortArrayType : ruleUShortArrayType EOF ;
    public final void entryRuleUShortArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:978:26: ( ruleUShortArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:979:1: ruleUShortArrayType EOF
            {
             before(grammarAccess.getUShortArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType2100);
            ruleUShortArrayType();
            _fsp--;

             after(grammarAccess.getUShortArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUShortArrayType2107); 

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
    // $ANTLR end entryRuleUShortArrayType


    // $ANTLR start ruleUShortArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:986:1: ruleUShortArrayType : ( ( rule__UShortArrayType__Group__0 ) ) ;
    public final void ruleUShortArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:990:2: ( ( ( rule__UShortArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:991:1: ( ( rule__UShortArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:991:1: ( ( rule__UShortArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:992:1: ( rule__UShortArrayType__Group__0 )
            {
             before(grammarAccess.getUShortArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:993:1: ( rule__UShortArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:993:2: rule__UShortArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__UShortArrayType__Group__0_in_ruleUShortArrayType2134);
            rule__UShortArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUShortArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUShortArrayType


    // $ANTLR start entryRuleIntArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1005:1: entryRuleIntArrayType : ruleIntArrayType EOF ;
    public final void entryRuleIntArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1005:23: ( ruleIntArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1006:1: ruleIntArrayType EOF
            {
             before(grammarAccess.getIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType2160);
            ruleIntArrayType();
            _fsp--;

             after(grammarAccess.getIntArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntArrayType2167); 

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
    // $ANTLR end entryRuleIntArrayType


    // $ANTLR start ruleIntArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1013:1: ruleIntArrayType : ( ( rule__IntArrayType__Group__0 ) ) ;
    public final void ruleIntArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1017:2: ( ( ( rule__IntArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1018:1: ( ( rule__IntArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1018:1: ( ( rule__IntArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1019:1: ( rule__IntArrayType__Group__0 )
            {
             before(grammarAccess.getIntArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1020:1: ( rule__IntArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1020:2: rule__IntArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__IntArrayType__Group__0_in_ruleIntArrayType2194);
            rule__IntArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIntArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntArrayType


    // $ANTLR start entryRuleUIntArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1032:1: entryRuleUIntArrayType : ruleUIntArrayType EOF ;
    public final void entryRuleUIntArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1032:24: ( ruleUIntArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1033:1: ruleUIntArrayType EOF
            {
             before(grammarAccess.getUIntArrayTypeRule()); 
            pushFollow(FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType2220);
            ruleUIntArrayType();
            _fsp--;

             after(grammarAccess.getUIntArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIntArrayType2227); 

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
    // $ANTLR end entryRuleUIntArrayType


    // $ANTLR start ruleUIntArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1040:1: ruleUIntArrayType : ( ( rule__UIntArrayType__Group__0 ) ) ;
    public final void ruleUIntArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1044:2: ( ( ( rule__UIntArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1045:1: ( ( rule__UIntArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1045:1: ( ( rule__UIntArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1046:1: ( rule__UIntArrayType__Group__0 )
            {
             before(grammarAccess.getUIntArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1047:1: ( rule__UIntArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1047:2: rule__UIntArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__UIntArrayType__Group__0_in_ruleUIntArrayType2254);
            rule__UIntArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUIntArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUIntArrayType


    // $ANTLR start entryRuleFloatArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1059:1: entryRuleFloatArrayType : ruleFloatArrayType EOF ;
    public final void entryRuleFloatArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1059:25: ( ruleFloatArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1060:1: ruleFloatArrayType EOF
            {
             before(grammarAccess.getFloatArrayTypeRule()); 
            pushFollow(FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType2280);
            ruleFloatArrayType();
            _fsp--;

             after(grammarAccess.getFloatArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatArrayType2287); 

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
    // $ANTLR end entryRuleFloatArrayType


    // $ANTLR start ruleFloatArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1067:1: ruleFloatArrayType : ( ( rule__FloatArrayType__Group__0 ) ) ;
    public final void ruleFloatArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1071:2: ( ( ( rule__FloatArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1072:1: ( ( rule__FloatArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1072:1: ( ( rule__FloatArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1073:1: ( rule__FloatArrayType__Group__0 )
            {
             before(grammarAccess.getFloatArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1074:1: ( rule__FloatArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1074:2: rule__FloatArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatArrayType__Group__0_in_ruleFloatArrayType2314);
            rule__FloatArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFloatArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFloatArrayType


    // $ANTLR start entryRuleDoubleArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1086:1: entryRuleDoubleArrayType : ruleDoubleArrayType EOF ;
    public final void entryRuleDoubleArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1086:26: ( ruleDoubleArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1087:1: ruleDoubleArrayType EOF
            {
             before(grammarAccess.getDoubleArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType2340);
            ruleDoubleArrayType();
            _fsp--;

             after(grammarAccess.getDoubleArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleArrayType2347); 

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
    // $ANTLR end entryRuleDoubleArrayType


    // $ANTLR start ruleDoubleArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1094:1: ruleDoubleArrayType : ( ( rule__DoubleArrayType__Group__0 ) ) ;
    public final void ruleDoubleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1098:2: ( ( ( rule__DoubleArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1099:1: ( ( rule__DoubleArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1099:1: ( ( rule__DoubleArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1100:1: ( rule__DoubleArrayType__Group__0 )
            {
             before(grammarAccess.getDoubleArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1101:1: ( rule__DoubleArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1101:2: rule__DoubleArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleArrayType__Group__0_in_ruleDoubleArrayType2374);
            rule__DoubleArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDoubleArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDoubleArrayType


    // $ANTLR start entryRuleStringArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1113:1: entryRuleStringArrayType : ruleStringArrayType EOF ;
    public final void entryRuleStringArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1113:26: ( ruleStringArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1114:1: ruleStringArrayType EOF
            {
             before(grammarAccess.getStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType2400);
            ruleStringArrayType();
            _fsp--;

             after(grammarAccess.getStringArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringArrayType2407); 

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
    // $ANTLR end entryRuleStringArrayType


    // $ANTLR start ruleStringArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1121:1: ruleStringArrayType : ( ( rule__StringArrayType__Group__0 ) ) ;
    public final void ruleStringArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1125:2: ( ( ( rule__StringArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1126:1: ( ( rule__StringArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1126:1: ( ( rule__StringArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1127:1: ( rule__StringArrayType__Group__0 )
            {
             before(grammarAccess.getStringArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1128:1: ( rule__StringArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1128:2: rule__StringArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__StringArrayType__Group__0_in_ruleStringArrayType2434);
            rule__StringArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStringArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringArrayType


    // $ANTLR start entryRuleLongStringArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1140:1: entryRuleLongStringArrayType : ruleLongStringArrayType EOF ;
    public final void entryRuleLongStringArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1140:30: ( ruleLongStringArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1141:1: ruleLongStringArrayType EOF
            {
             before(grammarAccess.getLongStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType2460);
            ruleLongStringArrayType();
            _fsp--;

             after(grammarAccess.getLongStringArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongStringArrayType2467); 

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
    // $ANTLR end entryRuleLongStringArrayType


    // $ANTLR start ruleLongStringArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1148:1: ruleLongStringArrayType : ( ( rule__LongStringArrayType__Group__0 ) ) ;
    public final void ruleLongStringArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1152:2: ( ( ( rule__LongStringArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1153:1: ( ( rule__LongStringArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1153:1: ( ( rule__LongStringArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1154:1: ( rule__LongStringArrayType__Group__0 )
            {
             before(grammarAccess.getLongStringArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1155:1: ( rule__LongStringArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1155:2: rule__LongStringArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__LongStringArrayType__Group__0_in_ruleLongStringArrayType2494);
            rule__LongStringArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLongStringArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLongStringArrayType


    // $ANTLR start entryRuleDoubleStringArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1167:1: entryRuleDoubleStringArrayType : ruleDoubleStringArrayType EOF ;
    public final void entryRuleDoubleStringArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1167:32: ( ruleDoubleStringArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1168:1: ruleDoubleStringArrayType EOF
            {
             before(grammarAccess.getDoubleStringArrayTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType2520);
            ruleDoubleStringArrayType();
            _fsp--;

             after(grammarAccess.getDoubleStringArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleStringArrayType2527); 

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
    // $ANTLR end entryRuleDoubleStringArrayType


    // $ANTLR start ruleDoubleStringArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1175:1: ruleDoubleStringArrayType : ( ( rule__DoubleStringArrayType__Group__0 ) ) ;
    public final void ruleDoubleStringArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1179:2: ( ( ( rule__DoubleStringArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1180:1: ( ( rule__DoubleStringArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1180:1: ( ( rule__DoubleStringArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1181:1: ( rule__DoubleStringArrayType__Group__0 )
            {
             before(grammarAccess.getDoubleStringArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1182:1: ( rule__DoubleStringArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1182:2: rule__DoubleStringArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleStringArrayType__Group__0_in_ruleDoubleStringArrayType2554);
            rule__DoubleStringArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDoubleStringArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDoubleStringArrayType


    // $ANTLR start entryRuleStateType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1194:1: entryRuleStateType : ruleStateType EOF ;
    public final void entryRuleStateType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1194:20: ( ruleStateType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1195:1: ruleStateType EOF
            {
             before(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_ruleStateType_in_entryRuleStateType2580);
            ruleStateType();
            _fsp--;

             after(grammarAccess.getStateTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateType2587); 

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
    // $ANTLR end entryRuleStateType


    // $ANTLR start ruleStateType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1202:1: ruleStateType : ( ( rule__StateType__Group__0 ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1206:2: ( ( ( rule__StateType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1207:1: ( ( rule__StateType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1207:1: ( ( rule__StateType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1208:1: ( rule__StateType__Group__0 )
            {
             before(grammarAccess.getStateTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1209:1: ( rule__StateType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1209:2: rule__StateType__Group__0
            {
            pushFollow(FOLLOW_rule__StateType__Group__0_in_ruleStateType2614);
            rule__StateType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStateTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStateType


    // $ANTLR start entryRuleConstStringType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1221:1: entryRuleConstStringType : ruleConstStringType EOF ;
    public final void entryRuleConstStringType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1221:26: ( ruleConstStringType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1222:1: ruleConstStringType EOF
            {
             before(grammarAccess.getConstStringTypeRule()); 
            pushFollow(FOLLOW_ruleConstStringType_in_entryRuleConstStringType2640);
            ruleConstStringType();
            _fsp--;

             after(grammarAccess.getConstStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstStringType2647); 

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
    // $ANTLR end entryRuleConstStringType


    // $ANTLR start ruleConstStringType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1229:1: ruleConstStringType : ( ( rule__ConstStringType__Group__0 ) ) ;
    public final void ruleConstStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1233:2: ( ( ( rule__ConstStringType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1234:1: ( ( rule__ConstStringType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1234:1: ( ( rule__ConstStringType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1235:1: ( rule__ConstStringType__Group__0 )
            {
             before(grammarAccess.getConstStringTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1236:1: ( rule__ConstStringType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1236:2: rule__ConstStringType__Group__0
            {
            pushFollow(FOLLOW_rule__ConstStringType__Group__0_in_ruleConstStringType2674);
            rule__ConstStringType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConstStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConstStringType


    // $ANTLR start entryRuleBooleanArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1248:1: entryRuleBooleanArrayType : ruleBooleanArrayType EOF ;
    public final void entryRuleBooleanArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1248:27: ( ruleBooleanArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1249:1: ruleBooleanArrayType EOF
            {
             before(grammarAccess.getBooleanArrayTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType2700);
            ruleBooleanArrayType();
            _fsp--;

             after(grammarAccess.getBooleanArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanArrayType2707); 

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
    // $ANTLR end entryRuleBooleanArrayType


    // $ANTLR start ruleBooleanArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1256:1: ruleBooleanArrayType : ( ( rule__BooleanArrayType__Group__0 ) ) ;
    public final void ruleBooleanArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1260:2: ( ( ( rule__BooleanArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1261:1: ( ( rule__BooleanArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1261:1: ( ( rule__BooleanArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1262:1: ( rule__BooleanArrayType__Group__0 )
            {
             before(grammarAccess.getBooleanArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1263:1: ( rule__BooleanArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1263:2: rule__BooleanArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanArrayType__Group__0_in_ruleBooleanArrayType2734);
            rule__BooleanArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBooleanArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBooleanArrayType


    // $ANTLR start entryRuleUCharType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1275:1: entryRuleUCharType : ruleUCharType EOF ;
    public final void entryRuleUCharType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1275:20: ( ruleUCharType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1276:1: ruleUCharType EOF
            {
             before(grammarAccess.getUCharTypeRule()); 
            pushFollow(FOLLOW_ruleUCharType_in_entryRuleUCharType2760);
            ruleUCharType();
            _fsp--;

             after(grammarAccess.getUCharTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUCharType2767); 

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
    // $ANTLR end entryRuleUCharType


    // $ANTLR start ruleUCharType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1283:1: ruleUCharType : ( ( rule__UCharType__Group__0 ) ) ;
    public final void ruleUCharType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1287:2: ( ( ( rule__UCharType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1288:1: ( ( rule__UCharType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1288:1: ( ( rule__UCharType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1289:1: ( rule__UCharType__Group__0 )
            {
             before(grammarAccess.getUCharTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1290:1: ( rule__UCharType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1290:2: rule__UCharType__Group__0
            {
            pushFollow(FOLLOW_rule__UCharType__Group__0_in_ruleUCharType2794);
            rule__UCharType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUCharTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUCharType


    // $ANTLR start entryRuleLongType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1302:1: entryRuleLongType : ruleLongType EOF ;
    public final void entryRuleLongType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1302:19: ( ruleLongType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1303:1: ruleLongType EOF
            {
             before(grammarAccess.getLongTypeRule()); 
            pushFollow(FOLLOW_ruleLongType_in_entryRuleLongType2820);
            ruleLongType();
            _fsp--;

             after(grammarAccess.getLongTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongType2827); 

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
    // $ANTLR end entryRuleLongType


    // $ANTLR start ruleLongType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1310:1: ruleLongType : ( ( rule__LongType__Group__0 ) ) ;
    public final void ruleLongType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1314:2: ( ( ( rule__LongType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1315:1: ( ( rule__LongType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1315:1: ( ( rule__LongType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1316:1: ( rule__LongType__Group__0 )
            {
             before(grammarAccess.getLongTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1317:1: ( rule__LongType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1317:2: rule__LongType__Group__0
            {
            pushFollow(FOLLOW_rule__LongType__Group__0_in_ruleLongType2854);
            rule__LongType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLongTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLongType


    // $ANTLR start entryRuleULongType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1329:1: entryRuleULongType : ruleULongType EOF ;
    public final void entryRuleULongType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1329:20: ( ruleULongType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1330:1: ruleULongType EOF
            {
             before(grammarAccess.getULongTypeRule()); 
            pushFollow(FOLLOW_ruleULongType_in_entryRuleULongType2880);
            ruleULongType();
            _fsp--;

             after(grammarAccess.getULongTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongType2887); 

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
    // $ANTLR end entryRuleULongType


    // $ANTLR start ruleULongType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1337:1: ruleULongType : ( ( rule__ULongType__Group__0 ) ) ;
    public final void ruleULongType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1341:2: ( ( ( rule__ULongType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1342:1: ( ( rule__ULongType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1342:1: ( ( rule__ULongType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1343:1: ( rule__ULongType__Group__0 )
            {
             before(grammarAccess.getULongTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1344:1: ( rule__ULongType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1344:2: rule__ULongType__Group__0
            {
            pushFollow(FOLLOW_rule__ULongType__Group__0_in_ruleULongType2914);
            rule__ULongType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getULongTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleULongType


    // $ANTLR start entryRuleLongArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1356:1: entryRuleLongArrayType : ruleLongArrayType EOF ;
    public final void entryRuleLongArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1356:24: ( ruleLongArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1357:1: ruleLongArrayType EOF
            {
             before(grammarAccess.getLongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType2940);
            ruleLongArrayType();
            _fsp--;

             after(grammarAccess.getLongArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongArrayType2947); 

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
    // $ANTLR end entryRuleLongArrayType


    // $ANTLR start ruleLongArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1364:1: ruleLongArrayType : ( ( rule__LongArrayType__Group__0 ) ) ;
    public final void ruleLongArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1368:2: ( ( ( rule__LongArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1369:1: ( ( rule__LongArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1369:1: ( ( rule__LongArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1370:1: ( rule__LongArrayType__Group__0 )
            {
             before(grammarAccess.getLongArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1371:1: ( rule__LongArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1371:2: rule__LongArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__LongArrayType__Group__0_in_ruleLongArrayType2974);
            rule__LongArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLongArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLongArrayType


    // $ANTLR start entryRuleULongArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1383:1: entryRuleULongArrayType : ruleULongArrayType EOF ;
    public final void entryRuleULongArrayType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1383:25: ( ruleULongArrayType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1384:1: ruleULongArrayType EOF
            {
             before(grammarAccess.getULongArrayTypeRule()); 
            pushFollow(FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType3000);
            ruleULongArrayType();
            _fsp--;

             after(grammarAccess.getULongArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleULongArrayType3007); 

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
    // $ANTLR end entryRuleULongArrayType


    // $ANTLR start ruleULongArrayType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1391:1: ruleULongArrayType : ( ( rule__ULongArrayType__Group__0 ) ) ;
    public final void ruleULongArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1395:2: ( ( ( rule__ULongArrayType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1396:1: ( ( rule__ULongArrayType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1396:1: ( ( rule__ULongArrayType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1397:1: ( rule__ULongArrayType__Group__0 )
            {
             before(grammarAccess.getULongArrayTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1398:1: ( rule__ULongArrayType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1398:2: rule__ULongArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ULongArrayType__Group__0_in_ruleULongArrayType3034);
            rule__ULongArrayType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getULongArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleULongArrayType


    // $ANTLR start entryRuleDevIntType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1410:1: entryRuleDevIntType : ruleDevIntType EOF ;
    public final void entryRuleDevIntType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1410:21: ( ruleDevIntType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1411:1: ruleDevIntType EOF
            {
             before(grammarAccess.getDevIntTypeRule()); 
            pushFollow(FOLLOW_ruleDevIntType_in_entryRuleDevIntType3060);
            ruleDevIntType();
            _fsp--;

             after(grammarAccess.getDevIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDevIntType3067); 

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
    // $ANTLR end entryRuleDevIntType


    // $ANTLR start ruleDevIntType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1418:1: ruleDevIntType : ( ( rule__DevIntType__Group__0 ) ) ;
    public final void ruleDevIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1422:2: ( ( ( rule__DevIntType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1423:1: ( ( rule__DevIntType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1423:1: ( ( rule__DevIntType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1424:1: ( rule__DevIntType__Group__0 )
            {
             before(grammarAccess.getDevIntTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1425:1: ( rule__DevIntType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1425:2: rule__DevIntType__Group__0
            {
            pushFollow(FOLLOW_rule__DevIntType__Group__0_in_ruleDevIntType3094);
            rule__DevIntType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDevIntTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDevIntType


    // $ANTLR start entryRuleEncodedType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1437:1: entryRuleEncodedType : ruleEncodedType EOF ;
    public final void entryRuleEncodedType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1437:22: ( ruleEncodedType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1438:1: ruleEncodedType EOF
            {
             before(grammarAccess.getEncodedTypeRule()); 
            pushFollow(FOLLOW_ruleEncodedType_in_entryRuleEncodedType3120);
            ruleEncodedType();
            _fsp--;

             after(grammarAccess.getEncodedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEncodedType3127); 

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
    // $ANTLR end entryRuleEncodedType


    // $ANTLR start ruleEncodedType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1445:1: ruleEncodedType : ( ( rule__EncodedType__Group__0 ) ) ;
    public final void ruleEncodedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1449:2: ( ( ( rule__EncodedType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1450:1: ( ( rule__EncodedType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1450:1: ( ( rule__EncodedType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1451:1: ( rule__EncodedType__Group__0 )
            {
             before(grammarAccess.getEncodedTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1452:1: ( rule__EncodedType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1452:2: rule__EncodedType__Group__0
            {
            pushFollow(FOLLOW_rule__EncodedType__Group__0_in_ruleEncodedType3154);
            rule__EncodedType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEncodedTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEncodedType


    // $ANTLR start entryRuleShortVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1464:1: entryRuleShortVectorType : ruleShortVectorType EOF ;
    public final void entryRuleShortVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1464:26: ( ruleShortVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1465:1: ruleShortVectorType EOF
            {
             before(grammarAccess.getShortVectorTypeRule()); 
            pushFollow(FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType3180);
            ruleShortVectorType();
            _fsp--;

             after(grammarAccess.getShortVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShortVectorType3187); 

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
    // $ANTLR end entryRuleShortVectorType


    // $ANTLR start ruleShortVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1472:1: ruleShortVectorType : ( ( rule__ShortVectorType__Group__0 ) ) ;
    public final void ruleShortVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1476:2: ( ( ( rule__ShortVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1477:1: ( ( rule__ShortVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1477:1: ( ( rule__ShortVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1478:1: ( rule__ShortVectorType__Group__0 )
            {
             before(grammarAccess.getShortVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1479:1: ( rule__ShortVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1479:2: rule__ShortVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__ShortVectorType__Group__0_in_ruleShortVectorType3214);
            rule__ShortVectorType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getShortVectorTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleShortVectorType


    // $ANTLR start entryRuleIntVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1491:1: entryRuleIntVectorType : ruleIntVectorType EOF ;
    public final void entryRuleIntVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1491:24: ( ruleIntVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1492:1: ruleIntVectorType EOF
            {
             before(grammarAccess.getIntVectorTypeRule()); 
            pushFollow(FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType3240);
            ruleIntVectorType();
            _fsp--;

             after(grammarAccess.getIntVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntVectorType3247); 

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
    // $ANTLR end entryRuleIntVectorType


    // $ANTLR start ruleIntVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1499:1: ruleIntVectorType : ( ( rule__IntVectorType__Group__0 ) ) ;
    public final void ruleIntVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1503:2: ( ( ( rule__IntVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1504:1: ( ( rule__IntVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1504:1: ( ( rule__IntVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1505:1: ( rule__IntVectorType__Group__0 )
            {
             before(grammarAccess.getIntVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1506:1: ( rule__IntVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1506:2: rule__IntVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__IntVectorType__Group__0_in_ruleIntVectorType3274);
            rule__IntVectorType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIntVectorTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntVectorType


    // $ANTLR start entryRuleFloatVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1518:1: entryRuleFloatVectorType : ruleFloatVectorType EOF ;
    public final void entryRuleFloatVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1518:26: ( ruleFloatVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1519:1: ruleFloatVectorType EOF
            {
             before(grammarAccess.getFloatVectorTypeRule()); 
            pushFollow(FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType3300);
            ruleFloatVectorType();
            _fsp--;

             after(grammarAccess.getFloatVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatVectorType3307); 

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
    // $ANTLR end entryRuleFloatVectorType


    // $ANTLR start ruleFloatVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1526:1: ruleFloatVectorType : ( ( rule__FloatVectorType__Group__0 ) ) ;
    public final void ruleFloatVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1530:2: ( ( ( rule__FloatVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1531:1: ( ( rule__FloatVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1531:1: ( ( rule__FloatVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1532:1: ( rule__FloatVectorType__Group__0 )
            {
             before(grammarAccess.getFloatVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1533:1: ( rule__FloatVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1533:2: rule__FloatVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__FloatVectorType__Group__0_in_ruleFloatVectorType3334);
            rule__FloatVectorType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFloatVectorTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFloatVectorType


    // $ANTLR start entryRuleDoubleVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1545:1: entryRuleDoubleVectorType : ruleDoubleVectorType EOF ;
    public final void entryRuleDoubleVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1545:27: ( ruleDoubleVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1546:1: ruleDoubleVectorType EOF
            {
             before(grammarAccess.getDoubleVectorTypeRule()); 
            pushFollow(FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType3360);
            ruleDoubleVectorType();
            _fsp--;

             after(grammarAccess.getDoubleVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleVectorType3367); 

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
    // $ANTLR end entryRuleDoubleVectorType


    // $ANTLR start ruleDoubleVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1553:1: ruleDoubleVectorType : ( ( rule__DoubleVectorType__Group__0 ) ) ;
    public final void ruleDoubleVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1557:2: ( ( ( rule__DoubleVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1558:1: ( ( rule__DoubleVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1558:1: ( ( rule__DoubleVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1559:1: ( rule__DoubleVectorType__Group__0 )
            {
             before(grammarAccess.getDoubleVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1560:1: ( rule__DoubleVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1560:2: rule__DoubleVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleVectorType__Group__0_in_ruleDoubleVectorType3394);
            rule__DoubleVectorType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDoubleVectorTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDoubleVectorType


    // $ANTLR start entryRuleStringVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1572:1: entryRuleStringVectorType : ruleStringVectorType EOF ;
    public final void entryRuleStringVectorType() throws RecognitionException {
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1572:27: ( ruleStringVectorType EOF )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1573:1: ruleStringVectorType EOF
            {
             before(grammarAccess.getStringVectorTypeRule()); 
            pushFollow(FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType3420);
            ruleStringVectorType();
            _fsp--;

             after(grammarAccess.getStringVectorTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVectorType3427); 

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
    // $ANTLR end entryRuleStringVectorType


    // $ANTLR start ruleStringVectorType
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1580:1: ruleStringVectorType : ( ( rule__StringVectorType__Group__0 ) ) ;
    public final void ruleStringVectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1584:2: ( ( ( rule__StringVectorType__Group__0 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1585:1: ( ( rule__StringVectorType__Group__0 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1585:1: ( ( rule__StringVectorType__Group__0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1586:1: ( rule__StringVectorType__Group__0 )
            {
             before(grammarAccess.getStringVectorTypeAccess().getGroup()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1587:1: ( rule__StringVectorType__Group__0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1587:2: rule__StringVectorType__Group__0
            {
            pushFollow(FOLLOW_rule__StringVectorType__Group__0_in_ruleStringVectorType3454);
            rule__StringVectorType__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStringVectorTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringVectorType


    // $ANTLR start rule__Language__Alternatives
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1599:1: rule__Language__Alternatives : ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) );
    public final void rule__Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1603:1: ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1599:1: rule__Language__Alternatives : ( ( 'Cpp' ) | ( 'Java' ) | ( 'Python' ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1604:1: ( 'Cpp' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1604:1: ( 'Cpp' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1605:1: 'Cpp'
                    {
                     before(grammarAccess.getLanguageAccess().getCppKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Language__Alternatives3491); 
                     after(grammarAccess.getLanguageAccess().getCppKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1612:6: ( 'Java' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1612:6: ( 'Java' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1613:1: 'Java'
                    {
                     before(grammarAccess.getLanguageAccess().getJavaKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Language__Alternatives3511); 
                     after(grammarAccess.getLanguageAccess().getJavaKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1620:6: ( 'Python' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1620:6: ( 'Python' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1621:1: 'Python'
                    {
                     before(grammarAccess.getLanguageAccess().getPythonKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Language__Alternatives3531); 
                     after(grammarAccess.getLanguageAccess().getPythonKeyword_2()); 

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
    // $ANTLR end rule__Language__Alternatives


    // $ANTLR start rule__DisplayLevel__Alternatives
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1633:1: rule__DisplayLevel__Alternatives : ( ( 'OPERATOR' ) | ( 'EXPERT' ) );
    public final void rule__DisplayLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1637:1: ( ( 'OPERATOR' ) | ( 'EXPERT' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1633:1: rule__DisplayLevel__Alternatives : ( ( 'OPERATOR' ) | ( 'EXPERT' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1638:1: ( 'OPERATOR' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1638:1: ( 'OPERATOR' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1639:1: 'OPERATOR'
                    {
                     before(grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__DisplayLevel__Alternatives3566); 
                     after(grammarAccess.getDisplayLevelAccess().getOPERATORKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1646:6: ( 'EXPERT' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1646:6: ( 'EXPERT' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1647:1: 'EXPERT'
                    {
                     before(grammarAccess.getDisplayLevelAccess().getEXPERTKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__DisplayLevel__Alternatives3586); 
                     after(grammarAccess.getDisplayLevelAccess().getEXPERTKeyword_1()); 

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
    // $ANTLR end rule__DisplayLevel__Alternatives


    // $ANTLR start rule__AttrType__Alternatives
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1659:1: rule__AttrType__Alternatives : ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) );
    public final void rule__AttrType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1663:1: ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1659:1: rule__AttrType__Alternatives : ( ( 'Scalar' ) | ( 'Spectrum' ) | ( 'Image' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1664:1: ( 'Scalar' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1664:1: ( 'Scalar' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1665:1: 'Scalar'
                    {
                     before(grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__AttrType__Alternatives3621); 
                     after(grammarAccess.getAttrTypeAccess().getScalarKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1672:6: ( 'Spectrum' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1672:6: ( 'Spectrum' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1673:1: 'Spectrum'
                    {
                     before(grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__AttrType__Alternatives3641); 
                     after(grammarAccess.getAttrTypeAccess().getSpectrumKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1680:6: ( 'Image' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1680:6: ( 'Image' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1681:1: 'Image'
                    {
                     before(grammarAccess.getAttrTypeAccess().getImageKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__AttrType__Alternatives3661); 
                     after(grammarAccess.getAttrTypeAccess().getImageKeyword_2()); 

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
    // $ANTLR end rule__AttrType__Alternatives


    // $ANTLR start rule__RW_Type__Alternatives
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1693:1: rule__RW_Type__Alternatives : ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) );
    public final void rule__RW_Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1697:1: ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1693:1: rule__RW_Type__Alternatives : ( ( 'READ' ) | ( 'WRITE' ) | ( 'READ_WRITE' ) | ( 'READ_WITH_WRITE' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1698:1: ( 'READ' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1698:1: ( 'READ' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1699:1: 'READ'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__RW_Type__Alternatives3696); 
                     after(grammarAccess.getRW_TypeAccess().getREADKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1706:6: ( 'WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1706:6: ( 'WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1707:1: 'WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__RW_Type__Alternatives3716); 
                     after(grammarAccess.getRW_TypeAccess().getWRITEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1714:6: ( 'READ_WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1714:6: ( 'READ_WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1715:1: 'READ_WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 
                    match(input,21,FOLLOW_21_in_rule__RW_Type__Alternatives3736); 
                     after(grammarAccess.getRW_TypeAccess().getREAD_WRITEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1722:6: ( 'READ_WITH_WRITE' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1722:6: ( 'READ_WITH_WRITE' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1723:1: 'READ_WITH_WRITE'
                    {
                     before(grammarAccess.getRW_TypeAccess().getREAD_WITH_WRITEKeyword_3()); 
                    match(input,22,FOLLOW_22_in_rule__RW_Type__Alternatives3756); 
                     after(grammarAccess.getRW_TypeAccess().getREAD_WITH_WRITEKeyword_3()); 

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
    // $ANTLR end rule__RW_Type__Alternatives


    // $ANTLR start rule__Boolean__Alternatives
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1735:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1739:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1735:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1740:1: ( 'true' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1740:1: ( 'true' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1741:1: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,23,FOLLOW_23_in_rule__Boolean__Alternatives3791); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1748:6: ( 'false' )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1748:6: ( 'false' )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1749:1: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,24,FOLLOW_24_in_rule__Boolean__Alternatives3811); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end rule__Boolean__Alternatives


    // $ANTLR start rule__PropType__Alternatives
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1761:1: rule__PropType__Alternatives : ( ( ruleSimpleType ) | ( ruleVectorType ) );
    public final void rule__PropType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1765:1: ( ( ruleSimpleType ) | ( ruleVectorType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=40 && LA6_0<=47)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=68 && LA6_0<=72)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1761:1: rule__PropType__Alternatives : ( ( ruleSimpleType ) | ( ruleVectorType ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1766:1: ( ruleSimpleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1766:1: ( ruleSimpleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1767:1: ruleSimpleType
                    {
                     before(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleType_in_rule__PropType__Alternatives3845);
                    ruleSimpleType();
                    _fsp--;

                     after(grammarAccess.getPropTypeAccess().getSimpleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1772:6: ( ruleVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1772:6: ( ruleVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1773:1: ruleVectorType
                    {
                     before(grammarAccess.getPropTypeAccess().getVectorTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVectorType_in_rule__PropType__Alternatives3862);
                    ruleVectorType();
                    _fsp--;

                     after(grammarAccess.getPropTypeAccess().getVectorTypeParserRuleCall_1()); 

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
    // $ANTLR end rule__PropType__Alternatives


    // $ANTLR start rule__SimpleType__Alternatives
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1783:1: rule__SimpleType__Alternatives : ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1787:1: ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 42:
                {
                alt7=3;
                }
                break;
            case 43:
                {
                alt7=4;
                }
                break;
            case 44:
                {
                alt7=5;
                }
                break;
            case 45:
                {
                alt7=6;
                }
                break;
            case 46:
                {
                alt7=7;
                }
                break;
            case 47:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1783:1: rule__SimpleType__Alternatives : ( ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1788:1: ( ruleBooleanType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1788:1: ( ruleBooleanType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1789:1: ruleBooleanType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__SimpleType__Alternatives3894);
                    ruleBooleanType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1794:6: ( ruleShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1794:6: ( ruleShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1795:1: ruleShortType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleShortType_in_rule__SimpleType__Alternatives3911);
                    ruleShortType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getShortTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1800:6: ( ruleUShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1800:6: ( ruleUShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1801:1: ruleUShortType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUShortType_in_rule__SimpleType__Alternatives3928);
                    ruleUShortType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getUShortTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1806:6: ( ruleIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1806:6: ( ruleIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1807:1: ruleIntType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__SimpleType__Alternatives3945);
                    ruleIntType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getIntTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1812:6: ( ruleUIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1812:6: ( ruleUIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1813:1: ruleUIntType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleUIntType_in_rule__SimpleType__Alternatives3962);
                    ruleUIntType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getUIntTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1818:6: ( ruleFloatType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1818:6: ( ruleFloatType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1819:1: ruleFloatType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__SimpleType__Alternatives3979);
                    ruleFloatType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getFloatTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1824:6: ( ruleDoubleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1824:6: ( ruleDoubleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1825:1: ruleDoubleType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__SimpleType__Alternatives3996);
                    ruleDoubleType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1830:6: ( ruleStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1830:6: ( ruleStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1831:1: ruleStringType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__SimpleType__Alternatives4013);
                    ruleStringType();
                    _fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_7()); 

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
    // $ANTLR end rule__SimpleType__Alternatives


    // $ANTLR start rule__VectorType__Alternatives
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1841:1: rule__VectorType__Alternatives : ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) );
    public final void rule__VectorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1845:1: ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt8=1;
                }
                break;
            case 69:
                {
                alt8=2;
                }
                break;
            case 70:
                {
                alt8=3;
                }
                break;
            case 71:
                {
                alt8=4;
                }
                break;
            case 72:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1841:1: rule__VectorType__Alternatives : ( ( ruleShortVectorType ) | ( ruleIntVectorType ) | ( ruleFloatVectorType ) | ( ruleDoubleVectorType ) | ( ruleStringVectorType ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1846:1: ( ruleShortVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1846:1: ( ruleShortVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1847:1: ruleShortVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleShortVectorType_in_rule__VectorType__Alternatives4045);
                    ruleShortVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getShortVectorTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1852:6: ( ruleIntVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1852:6: ( ruleIntVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1853:1: ruleIntVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntVectorType_in_rule__VectorType__Alternatives4062);
                    ruleIntVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getIntVectorTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1858:6: ( ruleFloatVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1858:6: ( ruleFloatVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1859:1: ruleFloatVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFloatVectorType_in_rule__VectorType__Alternatives4079);
                    ruleFloatVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getFloatVectorTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1864:6: ( ruleDoubleVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1864:6: ( ruleDoubleVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1865:1: ruleDoubleVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDoubleVectorType_in_rule__VectorType__Alternatives4096);
                    ruleDoubleVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getDoubleVectorTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1870:6: ( ruleStringVectorType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1870:6: ( ruleStringVectorType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1871:1: ruleStringVectorType
                    {
                     before(grammarAccess.getVectorTypeAccess().getStringVectorTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleStringVectorType_in_rule__VectorType__Alternatives4113);
                    ruleStringVectorType();
                    _fsp--;

                     after(grammarAccess.getVectorTypeAccess().getStringVectorTypeParserRuleCall_4()); 

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
    // $ANTLR end rule__VectorType__Alternatives


    // $ANTLR start rule__Type__Alternatives
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1881:1: rule__Type__Alternatives : ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1885:1: ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) )
            int alt9=29;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            case 42:
                {
                alt9=4;
                }
                break;
            case 43:
                {
                alt9=5;
                }
                break;
            case 44:
                {
                alt9=6;
                }
                break;
            case 45:
                {
                alt9=7;
                }
                break;
            case 46:
                {
                alt9=8;
                }
                break;
            case 47:
                {
                alt9=9;
                }
                break;
            case 48:
                {
                alt9=10;
                }
                break;
            case 49:
                {
                alt9=11;
                }
                break;
            case 50:
                {
                alt9=12;
                }
                break;
            case 51:
                {
                alt9=13;
                }
                break;
            case 52:
                {
                alt9=14;
                }
                break;
            case 53:
                {
                alt9=15;
                }
                break;
            case 54:
                {
                alt9=16;
                }
                break;
            case 55:
                {
                alt9=17;
                }
                break;
            case 56:
                {
                alt9=18;
                }
                break;
            case 57:
                {
                alt9=19;
                }
                break;
            case 58:
                {
                alt9=20;
                }
                break;
            case 59:
                {
                alt9=21;
                }
                break;
            case 60:
                {
                alt9=22;
                }
                break;
            case 62:
                {
                alt9=23;
                }
                break;
            case 63:
                {
                alt9=24;
                }
                break;
            case 61:
                {
                alt9=25;
                }
                break;
            case 64:
                {
                alt9=26;
                }
                break;
            case 65:
                {
                alt9=27;
                }
                break;
            case 66:
                {
                alt9=28;
                }
                break;
            case 67:
                {
                alt9=29;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1881:1: rule__Type__Alternatives : ( ( ruleVoidType ) | ( ruleBooleanType ) | ( ruleShortType ) | ( ruleUShortType ) | ( ruleIntType ) | ( ruleUIntType ) | ( ruleFloatType ) | ( ruleDoubleType ) | ( ruleStringType ) | ( ruleCharArrayType ) | ( ruleShortArrayType ) | ( ruleUShortArrayType ) | ( ruleIntArrayType ) | ( ruleUIntArrayType ) | ( ruleFloatArrayType ) | ( ruleDoubleArrayType ) | ( ruleStringArrayType ) | ( ruleLongStringArrayType ) | ( ruleDoubleStringArrayType ) | ( ruleStateType ) | ( ruleConstStringType ) | ( ruleBooleanArrayType ) | ( ruleLongType ) | ( ruleULongType ) | ( ruleUCharType ) | ( ruleLongArrayType ) | ( ruleULongArrayType ) | ( ruleDevIntType ) | ( ruleEncodedType ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1886:1: ( ruleVoidType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1886:1: ( ruleVoidType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1887:1: ruleVoidType
                    {
                     before(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVoidType_in_rule__Type__Alternatives4145);
                    ruleVoidType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getVoidTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1892:6: ( ruleBooleanType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1892:6: ( ruleBooleanType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1893:1: ruleBooleanType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__Type__Alternatives4162);
                    ruleBooleanType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1898:6: ( ruleShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1898:6: ( ruleShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1899:1: ruleShortType
                    {
                     before(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleShortType_in_rule__Type__Alternatives4179);
                    ruleShortType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getShortTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1904:6: ( ruleUShortType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1904:6: ( ruleUShortType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1905:1: ruleUShortType
                    {
                     before(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleUShortType_in_rule__Type__Alternatives4196);
                    ruleUShortType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUShortTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1910:6: ( ruleIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1910:6: ( ruleIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1911:1: ruleIntType
                    {
                     before(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__Type__Alternatives4213);
                    ruleIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1916:6: ( ruleUIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1916:6: ( ruleUIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1917:1: ruleUIntType
                    {
                     before(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleUIntType_in_rule__Type__Alternatives4230);
                    ruleUIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUIntTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1922:6: ( ruleFloatType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1922:6: ( ruleFloatType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1923:1: ruleFloatType
                    {
                     before(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFloatType_in_rule__Type__Alternatives4247);
                    ruleFloatType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getFloatTypeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1928:6: ( ruleDoubleType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1928:6: ( ruleDoubleType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1929:1: ruleDoubleType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleDoubleType_in_rule__Type__Alternatives4264);
                    ruleDoubleType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1934:6: ( ruleStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1934:6: ( ruleStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1935:1: ruleStringType
                    {
                     before(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__Type__Alternatives4281);
                    ruleStringType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1940:6: ( ruleCharArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1940:6: ( ruleCharArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1941:1: ruleCharArrayType
                    {
                     before(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleCharArrayType_in_rule__Type__Alternatives4298);
                    ruleCharArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getCharArrayTypeParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1946:6: ( ruleShortArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1946:6: ( ruleShortArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1947:1: ruleShortArrayType
                    {
                     before(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleShortArrayType_in_rule__Type__Alternatives4315);
                    ruleShortArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getShortArrayTypeParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1952:6: ( ruleUShortArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1952:6: ( ruleUShortArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1953:1: ruleUShortArrayType
                    {
                     before(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleUShortArrayType_in_rule__Type__Alternatives4332);
                    ruleUShortArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUShortArrayTypeParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1958:6: ( ruleIntArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1958:6: ( ruleIntArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1959:1: ruleIntArrayType
                    {
                     before(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleIntArrayType_in_rule__Type__Alternatives4349);
                    ruleIntArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getIntArrayTypeParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1964:6: ( ruleUIntArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1964:6: ( ruleUIntArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1965:1: ruleUIntArrayType
                    {
                     before(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 
                    pushFollow(FOLLOW_ruleUIntArrayType_in_rule__Type__Alternatives4366);
                    ruleUIntArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUIntArrayTypeParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1970:6: ( ruleFloatArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1970:6: ( ruleFloatArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1971:1: ruleFloatArrayType
                    {
                     before(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 
                    pushFollow(FOLLOW_ruleFloatArrayType_in_rule__Type__Alternatives4383);
                    ruleFloatArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getFloatArrayTypeParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1976:6: ( ruleDoubleArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1976:6: ( ruleDoubleArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1977:1: ruleDoubleArrayType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 
                    pushFollow(FOLLOW_ruleDoubleArrayType_in_rule__Type__Alternatives4400);
                    ruleDoubleArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleArrayTypeParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1982:6: ( ruleStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1982:6: ( ruleStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1983:1: ruleStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 
                    pushFollow(FOLLOW_ruleStringArrayType_in_rule__Type__Alternatives4417);
                    ruleStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStringArrayTypeParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1988:6: ( ruleLongStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1988:6: ( ruleLongStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1989:1: ruleLongStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 
                    pushFollow(FOLLOW_ruleLongStringArrayType_in_rule__Type__Alternatives4434);
                    ruleLongStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongStringArrayTypeParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1994:6: ( ruleDoubleStringArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1994:6: ( ruleDoubleStringArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:1995:1: ruleDoubleStringArrayType
                    {
                     before(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 
                    pushFollow(FOLLOW_ruleDoubleStringArrayType_in_rule__Type__Alternatives4451);
                    ruleDoubleStringArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleStringArrayTypeParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2000:6: ( ruleStateType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2000:6: ( ruleStateType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2001:1: ruleStateType
                    {
                     before(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 
                    pushFollow(FOLLOW_ruleStateType_in_rule__Type__Alternatives4468);
                    ruleStateType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getStateTypeParserRuleCall_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2006:6: ( ruleConstStringType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2006:6: ( ruleConstStringType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2007:1: ruleConstStringType
                    {
                     before(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 
                    pushFollow(FOLLOW_ruleConstStringType_in_rule__Type__Alternatives4485);
                    ruleConstStringType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getConstStringTypeParserRuleCall_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2012:6: ( ruleBooleanArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2012:6: ( ruleBooleanArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2013:1: ruleBooleanArrayType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 
                    pushFollow(FOLLOW_ruleBooleanArrayType_in_rule__Type__Alternatives4502);
                    ruleBooleanArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanArrayTypeParserRuleCall_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2018:6: ( ruleLongType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2018:6: ( ruleLongType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2019:1: ruleLongType
                    {
                     before(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 
                    pushFollow(FOLLOW_ruleLongType_in_rule__Type__Alternatives4519);
                    ruleLongType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongTypeParserRuleCall_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2024:6: ( ruleULongType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2024:6: ( ruleULongType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2025:1: ruleULongType
                    {
                     before(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 
                    pushFollow(FOLLOW_ruleULongType_in_rule__Type__Alternatives4536);
                    ruleULongType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getULongTypeParserRuleCall_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2030:6: ( ruleUCharType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2030:6: ( ruleUCharType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2031:1: ruleUCharType
                    {
                     before(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 
                    pushFollow(FOLLOW_ruleUCharType_in_rule__Type__Alternatives4553);
                    ruleUCharType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getUCharTypeParserRuleCall_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2036:6: ( ruleLongArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2036:6: ( ruleLongArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2037:1: ruleLongArrayType
                    {
                     before(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 
                    pushFollow(FOLLOW_ruleLongArrayType_in_rule__Type__Alternatives4570);
                    ruleLongArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getLongArrayTypeParserRuleCall_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2042:6: ( ruleULongArrayType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2042:6: ( ruleULongArrayType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2043:1: ruleULongArrayType
                    {
                     before(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 
                    pushFollow(FOLLOW_ruleULongArrayType_in_rule__Type__Alternatives4587);
                    ruleULongArrayType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getULongArrayTypeParserRuleCall_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2048:6: ( ruleDevIntType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2048:6: ( ruleDevIntType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2049:1: ruleDevIntType
                    {
                     before(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 
                    pushFollow(FOLLOW_ruleDevIntType_in_rule__Type__Alternatives4604);
                    ruleDevIntType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDevIntTypeParserRuleCall_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2054:6: ( ruleEncodedType )
                    {
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2054:6: ( ruleEncodedType )
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2055:1: ruleEncodedType
                    {
                     before(grammarAccess.getTypeAccess().getEncodedTypeParserRuleCall_28()); 
                    pushFollow(FOLLOW_ruleEncodedType_in_rule__Type__Alternatives4621);
                    ruleEncodedType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEncodedTypeParserRuleCall_28()); 

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
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__PogoSystem__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2067:1: rule__PogoSystem__Group__0 : ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1 ;
    public final void rule__PogoSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2071:1: ( ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2072:1: ( ( rule__PogoSystem__ImportsAssignment_0 )* ) rule__PogoSystem__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2072:1: ( ( rule__PogoSystem__ImportsAssignment_0 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2073:1: ( rule__PogoSystem__ImportsAssignment_0 )*
            {
             before(grammarAccess.getPogoSystemAccess().getImportsAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2074:1: ( rule__PogoSystem__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2074:2: rule__PogoSystem__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__PogoSystem__ImportsAssignment_0_in_rule__PogoSystem__Group__04655);
            	    rule__PogoSystem__ImportsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPogoSystemAccess().getImportsAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__PogoSystem__Group__1_in_rule__PogoSystem__Group__04665);
            rule__PogoSystem__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoSystem__Group__0


    // $ANTLR start rule__PogoSystem__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2085:1: rule__PogoSystem__Group__1 : ( ( rule__PogoSystem__ClassesAssignment_1 )* ) ;
    public final void rule__PogoSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2089:1: ( ( ( rule__PogoSystem__ClassesAssignment_1 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2090:1: ( ( rule__PogoSystem__ClassesAssignment_1 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2090:1: ( ( rule__PogoSystem__ClassesAssignment_1 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2091:1: ( rule__PogoSystem__ClassesAssignment_1 )*
            {
             before(grammarAccess.getPogoSystemAccess().getClassesAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2092:1: ( rule__PogoSystem__ClassesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2092:2: rule__PogoSystem__ClassesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__PogoSystem__ClassesAssignment_1_in_rule__PogoSystem__Group__14693);
            	    rule__PogoSystem__ClassesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPogoSystemAccess().getClassesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoSystem__Group__1


    // $ANTLR start rule__Import__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2106:1: rule__Import__Group__0 : ( 'import' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2110:1: ( ( 'import' ) rule__Import__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2111:1: ( 'import' ) rule__Import__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2111:1: ( 'import' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2112:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__04733); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04743);
            rule__Import__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__0


    // $ANTLR start rule__Import__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2126:1: rule__Import__Group__1 : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2130:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2131:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2131:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2132:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2133:1: ( rule__Import__ImportURIAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2133:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__14771);
            rule__Import__ImportURIAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__1


    // $ANTLR start rule__PogoDeviceClass__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2147:1: rule__PogoDeviceClass__Group__0 : ( 'deviceclass' ) rule__PogoDeviceClass__Group__1 ;
    public final void rule__PogoDeviceClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2151:1: ( ( 'deviceclass' ) rule__PogoDeviceClass__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2152:1: ( 'deviceclass' ) rule__PogoDeviceClass__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2152:1: ( 'deviceclass' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2153:1: 'deviceclass'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__PogoDeviceClass__Group__04810); 
             after(grammarAccess.getPogoDeviceClassAccess().getDeviceclassKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__1_in_rule__PogoDeviceClass__Group__04820);
            rule__PogoDeviceClass__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__0


    // $ANTLR start rule__PogoDeviceClass__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2167:1: rule__PogoDeviceClass__Group__1 : ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2 ;
    public final void rule__PogoDeviceClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2171:1: ( ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2172:1: ( ( rule__PogoDeviceClass__NameAssignment_1 ) ) rule__PogoDeviceClass__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2172:1: ( ( rule__PogoDeviceClass__NameAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2173:1: ( rule__PogoDeviceClass__NameAssignment_1 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getNameAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2174:1: ( rule__PogoDeviceClass__NameAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2174:2: rule__PogoDeviceClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__NameAssignment_1_in_rule__PogoDeviceClass__Group__14848);
            rule__PogoDeviceClass__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__2_in_rule__PogoDeviceClass__Group__14857);
            rule__PogoDeviceClass__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__1


    // $ANTLR start rule__PogoDeviceClass__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2185:1: rule__PogoDeviceClass__Group__2 : ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3 ;
    public final void rule__PogoDeviceClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2189:1: ( ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2190:1: ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? ) rule__PogoDeviceClass__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2190:1: ( ( rule__PogoDeviceClass__IsAbstractAssignment_2 )? )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2191:1: ( rule__PogoDeviceClass__IsAbstractAssignment_2 )?
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2192:1: ( rule__PogoDeviceClass__IsAbstractAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==73) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2192:2: rule__PogoDeviceClass__IsAbstractAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PogoDeviceClass__IsAbstractAssignment_2_in_rule__PogoDeviceClass__Group__24885);
                    rule__PogoDeviceClass__IsAbstractAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__3_in_rule__PogoDeviceClass__Group__24895);
            rule__PogoDeviceClass__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__2


    // $ANTLR start rule__PogoDeviceClass__Group__3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2203:1: rule__PogoDeviceClass__Group__3 : ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4 ;
    public final void rule__PogoDeviceClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2207:1: ( ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2208:1: ( ( rule__PogoDeviceClass__Group_3__0 )? ) rule__PogoDeviceClass__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2208:1: ( ( rule__PogoDeviceClass__Group_3__0 )? )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2209:1: ( rule__PogoDeviceClass__Group_3__0 )?
            {
             before(grammarAccess.getPogoDeviceClassAccess().getGroup_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2210:1: ( rule__PogoDeviceClass__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2210:2: rule__PogoDeviceClass__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PogoDeviceClass__Group_3__0_in_rule__PogoDeviceClass__Group__34923);
                    rule__PogoDeviceClass__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPogoDeviceClassAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__4_in_rule__PogoDeviceClass__Group__34933);
            rule__PogoDeviceClass__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__3


    // $ANTLR start rule__PogoDeviceClass__Group__4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2221:1: rule__PogoDeviceClass__Group__4 : ( '{' ) rule__PogoDeviceClass__Group__5 ;
    public final void rule__PogoDeviceClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2225:1: ( ( '{' ) rule__PogoDeviceClass__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2226:1: ( '{' ) rule__PogoDeviceClass__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2226:1: ( '{' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2227:1: '{'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__PogoDeviceClass__Group__44962); 
             after(grammarAccess.getPogoDeviceClassAccess().getLeftCurlyBracketKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__5_in_rule__PogoDeviceClass__Group__44972);
            rule__PogoDeviceClass__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__4


    // $ANTLR start rule__PogoDeviceClass__Group__5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2241:1: rule__PogoDeviceClass__Group__5 : ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6 ;
    public final void rule__PogoDeviceClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2245:1: ( ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2246:1: ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) ) rule__PogoDeviceClass__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2246:1: ( ( rule__PogoDeviceClass__InstituteAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2247:1: ( rule__PogoDeviceClass__InstituteAssignment_5 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getInstituteAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2248:1: ( rule__PogoDeviceClass__InstituteAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2248:2: rule__PogoDeviceClass__InstituteAssignment_5
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__InstituteAssignment_5_in_rule__PogoDeviceClass__Group__55000);
            rule__PogoDeviceClass__InstituteAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getInstituteAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__6_in_rule__PogoDeviceClass__Group__55009);
            rule__PogoDeviceClass__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__5


    // $ANTLR start rule__PogoDeviceClass__Group__6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2259:1: rule__PogoDeviceClass__Group__6 : ( 'description:' ) rule__PogoDeviceClass__Group__7 ;
    public final void rule__PogoDeviceClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2263:1: ( ( 'description:' ) rule__PogoDeviceClass__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2264:1: ( 'description:' ) rule__PogoDeviceClass__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2264:1: ( 'description:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2265:1: 'description:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_6()); 
            match(input,28,FOLLOW_28_in_rule__PogoDeviceClass__Group__65038); 
             after(grammarAccess.getPogoDeviceClassAccess().getDescriptionKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__7_in_rule__PogoDeviceClass__Group__65048);
            rule__PogoDeviceClass__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__6


    // $ANTLR start rule__PogoDeviceClass__Group__7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2279:1: rule__PogoDeviceClass__Group__7 : ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8 ;
    public final void rule__PogoDeviceClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2283:1: ( ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2284:1: ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) ) rule__PogoDeviceClass__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2284:1: ( ( rule__PogoDeviceClass__DescriptionAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2285:1: ( rule__PogoDeviceClass__DescriptionAssignment_7 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2286:1: ( rule__PogoDeviceClass__DescriptionAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2286:2: rule__PogoDeviceClass__DescriptionAssignment_7
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__DescriptionAssignment_7_in_rule__PogoDeviceClass__Group__75076);
            rule__PogoDeviceClass__DescriptionAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getDescriptionAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__8_in_rule__PogoDeviceClass__Group__75085);
            rule__PogoDeviceClass__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__7


    // $ANTLR start rule__PogoDeviceClass__Group__8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2297:1: rule__PogoDeviceClass__Group__8 : ( 'classProperties:' ) rule__PogoDeviceClass__Group__9 ;
    public final void rule__PogoDeviceClass__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2301:1: ( ( 'classProperties:' ) rule__PogoDeviceClass__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2302:1: ( 'classProperties:' ) rule__PogoDeviceClass__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2302:1: ( 'classProperties:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2303:1: 'classProperties:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_8()); 
            match(input,29,FOLLOW_29_in_rule__PogoDeviceClass__Group__85114); 
             after(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__9_in_rule__PogoDeviceClass__Group__85124);
            rule__PogoDeviceClass__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__8


    // $ANTLR start rule__PogoDeviceClass__Group__9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2317:1: rule__PogoDeviceClass__Group__9 : ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10 ;
    public final void rule__PogoDeviceClass__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2321:1: ( ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2322:1: ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* ) rule__PogoDeviceClass__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2322:1: ( ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2323:1: ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2324:1: ( rule__PogoDeviceClass__ClassPropertiesAssignment_9 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2324:2: rule__PogoDeviceClass__ClassPropertiesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__ClassPropertiesAssignment_9_in_rule__PogoDeviceClass__Group__95152);
            	    rule__PogoDeviceClass__ClassPropertiesAssignment_9();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__10_in_rule__PogoDeviceClass__Group__95162);
            rule__PogoDeviceClass__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__9


    // $ANTLR start rule__PogoDeviceClass__Group__10
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2335:1: rule__PogoDeviceClass__Group__10 : ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11 ;
    public final void rule__PogoDeviceClass__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2339:1: ( ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2340:1: ( 'deviceProperties:' ) rule__PogoDeviceClass__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2340:1: ( 'deviceProperties:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2341:1: 'deviceProperties:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_10()); 
            match(input,30,FOLLOW_30_in_rule__PogoDeviceClass__Group__105191); 
             after(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesKeyword_10()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__11_in_rule__PogoDeviceClass__Group__105201);
            rule__PogoDeviceClass__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__10


    // $ANTLR start rule__PogoDeviceClass__Group__11
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2355:1: rule__PogoDeviceClass__Group__11 : ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12 ;
    public final void rule__PogoDeviceClass__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2359:1: ( ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2360:1: ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* ) rule__PogoDeviceClass__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2360:1: ( ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2361:1: ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2362:1: ( rule__PogoDeviceClass__DevicePropertiesAssignment_11 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2362:2: rule__PogoDeviceClass__DevicePropertiesAssignment_11
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__DevicePropertiesAssignment_11_in_rule__PogoDeviceClass__Group__115229);
            	    rule__PogoDeviceClass__DevicePropertiesAssignment_11();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesAssignment_11()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__12_in_rule__PogoDeviceClass__Group__115239);
            rule__PogoDeviceClass__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__11


    // $ANTLR start rule__PogoDeviceClass__Group__12
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2373:1: rule__PogoDeviceClass__Group__12 : ( 'commands:' ) rule__PogoDeviceClass__Group__13 ;
    public final void rule__PogoDeviceClass__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2377:1: ( ( 'commands:' ) rule__PogoDeviceClass__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2378:1: ( 'commands:' ) rule__PogoDeviceClass__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2378:1: ( 'commands:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2379:1: 'commands:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_12()); 
            match(input,31,FOLLOW_31_in_rule__PogoDeviceClass__Group__125268); 
             after(grammarAccess.getPogoDeviceClassAccess().getCommandsKeyword_12()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__13_in_rule__PogoDeviceClass__Group__125278);
            rule__PogoDeviceClass__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__12


    // $ANTLR start rule__PogoDeviceClass__Group__13
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2393:1: rule__PogoDeviceClass__Group__13 : ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14 ;
    public final void rule__PogoDeviceClass__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2397:1: ( ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2398:1: ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* ) rule__PogoDeviceClass__Group__14
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2398:1: ( ( rule__PogoDeviceClass__CommandsAssignment_13 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2399:1: ( rule__PogoDeviceClass__CommandsAssignment_13 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsAssignment_13()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2400:1: ( rule__PogoDeviceClass__CommandsAssignment_13 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2400:2: rule__PogoDeviceClass__CommandsAssignment_13
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__CommandsAssignment_13_in_rule__PogoDeviceClass__Group__135306);
            	    rule__PogoDeviceClass__CommandsAssignment_13();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPogoDeviceClassAccess().getCommandsAssignment_13()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__14_in_rule__PogoDeviceClass__Group__135316);
            rule__PogoDeviceClass__Group__14();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__13


    // $ANTLR start rule__PogoDeviceClass__Group__14
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2411:1: rule__PogoDeviceClass__Group__14 : ( 'attributes:' ) rule__PogoDeviceClass__Group__15 ;
    public final void rule__PogoDeviceClass__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2415:1: ( ( 'attributes:' ) rule__PogoDeviceClass__Group__15 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2416:1: ( 'attributes:' ) rule__PogoDeviceClass__Group__15
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2416:1: ( 'attributes:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2417:1: 'attributes:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_14()); 
            match(input,32,FOLLOW_32_in_rule__PogoDeviceClass__Group__145345); 
             after(grammarAccess.getPogoDeviceClassAccess().getAttributesKeyword_14()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__15_in_rule__PogoDeviceClass__Group__145355);
            rule__PogoDeviceClass__Group__15();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__14


    // $ANTLR start rule__PogoDeviceClass__Group__15
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2431:1: rule__PogoDeviceClass__Group__15 : ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16 ;
    public final void rule__PogoDeviceClass__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2435:1: ( ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2436:1: ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* ) rule__PogoDeviceClass__Group__16
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2436:1: ( ( rule__PogoDeviceClass__AttributesAssignment_15 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2437:1: ( rule__PogoDeviceClass__AttributesAssignment_15 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesAssignment_15()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2438:1: ( rule__PogoDeviceClass__AttributesAssignment_15 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2438:2: rule__PogoDeviceClass__AttributesAssignment_15
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__AttributesAssignment_15_in_rule__PogoDeviceClass__Group__155383);
            	    rule__PogoDeviceClass__AttributesAssignment_15();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPogoDeviceClassAccess().getAttributesAssignment_15()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__16_in_rule__PogoDeviceClass__Group__155393);
            rule__PogoDeviceClass__Group__16();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__15


    // $ANTLR start rule__PogoDeviceClass__Group__16
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2449:1: rule__PogoDeviceClass__Group__16 : ( 'states:' ) rule__PogoDeviceClass__Group__17 ;
    public final void rule__PogoDeviceClass__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2453:1: ( ( 'states:' ) rule__PogoDeviceClass__Group__17 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2454:1: ( 'states:' ) rule__PogoDeviceClass__Group__17
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2454:1: ( 'states:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2455:1: 'states:'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_16()); 
            match(input,33,FOLLOW_33_in_rule__PogoDeviceClass__Group__165422); 
             after(grammarAccess.getPogoDeviceClassAccess().getStatesKeyword_16()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__17_in_rule__PogoDeviceClass__Group__165432);
            rule__PogoDeviceClass__Group__17();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__16


    // $ANTLR start rule__PogoDeviceClass__Group__17
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2469:1: rule__PogoDeviceClass__Group__17 : ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18 ;
    public final void rule__PogoDeviceClass__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2473:1: ( ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2474:1: ( ( rule__PogoDeviceClass__StatesAssignment_17 )* ) rule__PogoDeviceClass__Group__18
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2474:1: ( ( rule__PogoDeviceClass__StatesAssignment_17 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2475:1: ( rule__PogoDeviceClass__StatesAssignment_17 )*
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesAssignment_17()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2476:1: ( rule__PogoDeviceClass__StatesAssignment_17 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2476:2: rule__PogoDeviceClass__StatesAssignment_17
            	    {
            	    pushFollow(FOLLOW_rule__PogoDeviceClass__StatesAssignment_17_in_rule__PogoDeviceClass__Group__175460);
            	    rule__PogoDeviceClass__StatesAssignment_17();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPogoDeviceClassAccess().getStatesAssignment_17()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group__18_in_rule__PogoDeviceClass__Group__175470);
            rule__PogoDeviceClass__Group__18();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__17


    // $ANTLR start rule__PogoDeviceClass__Group__18
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2487:1: rule__PogoDeviceClass__Group__18 : ( '}' ) ;
    public final void rule__PogoDeviceClass__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2491:1: ( ( '}' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2492:1: ( '}' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2492:1: ( '}' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2493:1: '}'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_18()); 
            match(input,34,FOLLOW_34_in_rule__PogoDeviceClass__Group__185499); 
             after(grammarAccess.getPogoDeviceClassAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group__18


    // $ANTLR start rule__PogoDeviceClass__Group_3__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2544:1: rule__PogoDeviceClass__Group_3__0 : ( 'extends' ) rule__PogoDeviceClass__Group_3__1 ;
    public final void rule__PogoDeviceClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2548:1: ( ( 'extends' ) rule__PogoDeviceClass__Group_3__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2549:1: ( 'extends' ) rule__PogoDeviceClass__Group_3__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2549:1: ( 'extends' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2550:1: 'extends'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__PogoDeviceClass__Group_3__05573); 
             after(grammarAccess.getPogoDeviceClassAccess().getExtendsKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__PogoDeviceClass__Group_3__1_in_rule__PogoDeviceClass__Group_3__05583);
            rule__PogoDeviceClass__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group_3__0


    // $ANTLR start rule__PogoDeviceClass__Group_3__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2564:1: rule__PogoDeviceClass__Group_3__1 : ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) ) ;
    public final void rule__PogoDeviceClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2568:1: ( ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2569:1: ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2569:1: ( ( rule__PogoDeviceClass__BaseClassAssignment_3_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2570:1: ( rule__PogoDeviceClass__BaseClassAssignment_3_1 )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassAssignment_3_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2571:1: ( rule__PogoDeviceClass__BaseClassAssignment_3_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2571:2: rule__PogoDeviceClass__BaseClassAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PogoDeviceClass__BaseClassAssignment_3_1_in_rule__PogoDeviceClass__Group_3__15611);
            rule__PogoDeviceClass__BaseClassAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getPogoDeviceClassAccess().getBaseClassAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__Group_3__1


    // $ANTLR start rule__ClassDescription__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2585:1: rule__ClassDescription__Group__0 : ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1 ;
    public final void rule__ClassDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2589:1: ( ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2590:1: ( ( rule__ClassDescription__DescriptionAssignment_0 ) ) rule__ClassDescription__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2590:1: ( ( rule__ClassDescription__DescriptionAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2591:1: ( rule__ClassDescription__DescriptionAssignment_0 )
            {
             before(grammarAccess.getClassDescriptionAccess().getDescriptionAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2592:1: ( rule__ClassDescription__DescriptionAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2592:2: rule__ClassDescription__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassDescription__DescriptionAssignment_0_in_rule__ClassDescription__Group__05649);
            rule__ClassDescription__DescriptionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__1_in_rule__ClassDescription__Group__05658);
            rule__ClassDescription__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__Group__0


    // $ANTLR start rule__ClassDescription__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2603:1: rule__ClassDescription__Group__1 : ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2 ;
    public final void rule__ClassDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2607:1: ( ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2608:1: ( ( rule__ClassDescription__TitleAssignment_1 ) ) rule__ClassDescription__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2608:1: ( ( rule__ClassDescription__TitleAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2609:1: ( rule__ClassDescription__TitleAssignment_1 )
            {
             before(grammarAccess.getClassDescriptionAccess().getTitleAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2610:1: ( rule__ClassDescription__TitleAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2610:2: rule__ClassDescription__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassDescription__TitleAssignment_1_in_rule__ClassDescription__Group__15686);
            rule__ClassDescription__TitleAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getTitleAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__2_in_rule__ClassDescription__Group__15695);
            rule__ClassDescription__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__Group__1


    // $ANTLR start rule__ClassDescription__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2621:1: rule__ClassDescription__Group__2 : ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3 ;
    public final void rule__ClassDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2625:1: ( ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2626:1: ( ( rule__ClassDescription__SourcePathAssignment_2 ) ) rule__ClassDescription__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2626:1: ( ( rule__ClassDescription__SourcePathAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2627:1: ( rule__ClassDescription__SourcePathAssignment_2 )
            {
             before(grammarAccess.getClassDescriptionAccess().getSourcePathAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2628:1: ( rule__ClassDescription__SourcePathAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2628:2: rule__ClassDescription__SourcePathAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassDescription__SourcePathAssignment_2_in_rule__ClassDescription__Group__25723);
            rule__ClassDescription__SourcePathAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getSourcePathAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__3_in_rule__ClassDescription__Group__25732);
            rule__ClassDescription__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__Group__2


    // $ANTLR start rule__ClassDescription__Group__3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2639:1: rule__ClassDescription__Group__3 : ( 'inheritances:' ) rule__ClassDescription__Group__4 ;
    public final void rule__ClassDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2643:1: ( ( 'inheritances:' ) rule__ClassDescription__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2644:1: ( 'inheritances:' ) rule__ClassDescription__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2644:1: ( 'inheritances:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2645:1: 'inheritances:'
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__ClassDescription__Group__35761); 
             after(grammarAccess.getClassDescriptionAccess().getInheritancesKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__4_in_rule__ClassDescription__Group__35771);
            rule__ClassDescription__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__Group__3


    // $ANTLR start rule__ClassDescription__Group__4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2659:1: rule__ClassDescription__Group__4 : ( ( rule__ClassDescription__InheritancesAssignment_4 )* ) rule__ClassDescription__Group__5 ;
    public final void rule__ClassDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2663:1: ( ( ( rule__ClassDescription__InheritancesAssignment_4 )* ) rule__ClassDescription__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2664:1: ( ( rule__ClassDescription__InheritancesAssignment_4 )* ) rule__ClassDescription__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2664:1: ( ( rule__ClassDescription__InheritancesAssignment_4 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2665:1: ( rule__ClassDescription__InheritancesAssignment_4 )*
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2666:1: ( rule__ClassDescription__InheritancesAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2666:2: rule__ClassDescription__InheritancesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ClassDescription__InheritancesAssignment_4_in_rule__ClassDescription__Group__45799);
            	    rule__ClassDescription__InheritancesAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getClassDescriptionAccess().getInheritancesAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__5_in_rule__ClassDescription__Group__45809);
            rule__ClassDescription__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__Group__4


    // $ANTLR start rule__ClassDescription__Group__5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2677:1: rule__ClassDescription__Group__5 : ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6 ;
    public final void rule__ClassDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2681:1: ( ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2682:1: ( ( rule__ClassDescription__LanguageAssignment_5 ) ) rule__ClassDescription__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2682:1: ( ( rule__ClassDescription__LanguageAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2683:1: ( rule__ClassDescription__LanguageAssignment_5 )
            {
             before(grammarAccess.getClassDescriptionAccess().getLanguageAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2684:1: ( rule__ClassDescription__LanguageAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2684:2: rule__ClassDescription__LanguageAssignment_5
            {
            pushFollow(FOLLOW_rule__ClassDescription__LanguageAssignment_5_in_rule__ClassDescription__Group__55837);
            rule__ClassDescription__LanguageAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getLanguageAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__6_in_rule__ClassDescription__Group__55846);
            rule__ClassDescription__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__Group__5


    // $ANTLR start rule__ClassDescription__Group__6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2695:1: rule__ClassDescription__Group__6 : ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7 ;
    public final void rule__ClassDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2699:1: ( ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2700:1: ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) ) rule__ClassDescription__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2700:1: ( ( rule__ClassDescription__FilestogenerateAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2701:1: ( rule__ClassDescription__FilestogenerateAssignment_6 )
            {
             before(grammarAccess.getClassDescriptionAccess().getFilestogenerateAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2702:1: ( rule__ClassDescription__FilestogenerateAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2702:2: rule__ClassDescription__FilestogenerateAssignment_6
            {
            pushFollow(FOLLOW_rule__ClassDescription__FilestogenerateAssignment_6_in_rule__ClassDescription__Group__65874);
            rule__ClassDescription__FilestogenerateAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getFilestogenerateAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__7_in_rule__ClassDescription__Group__65883);
            rule__ClassDescription__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__Group__6


    // $ANTLR start rule__ClassDescription__Group__7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2713:1: rule__ClassDescription__Group__7 : ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8 ;
    public final void rule__ClassDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2717:1: ( ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2718:1: ( ( rule__ClassDescription__IdentificationAssignment_7 ) ) rule__ClassDescription__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2718:1: ( ( rule__ClassDescription__IdentificationAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2719:1: ( rule__ClassDescription__IdentificationAssignment_7 )
            {
             before(grammarAccess.getClassDescriptionAccess().getIdentificationAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2720:1: ( rule__ClassDescription__IdentificationAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2720:2: rule__ClassDescription__IdentificationAssignment_7
            {
            pushFollow(FOLLOW_rule__ClassDescription__IdentificationAssignment_7_in_rule__ClassDescription__Group__75911);
            rule__ClassDescription__IdentificationAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getIdentificationAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__ClassDescription__Group__8_in_rule__ClassDescription__Group__75920);
            rule__ClassDescription__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__Group__7


    // $ANTLR start rule__ClassDescription__Group__8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2731:1: rule__ClassDescription__Group__8 : ( ( rule__ClassDescription__CommentsAssignment_8 ) ) ;
    public final void rule__ClassDescription__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2735:1: ( ( ( rule__ClassDescription__CommentsAssignment_8 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2736:1: ( ( rule__ClassDescription__CommentsAssignment_8 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2736:1: ( ( rule__ClassDescription__CommentsAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2737:1: ( rule__ClassDescription__CommentsAssignment_8 )
            {
             before(grammarAccess.getClassDescriptionAccess().getCommentsAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2738:1: ( rule__ClassDescription__CommentsAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2738:2: rule__ClassDescription__CommentsAssignment_8
            {
            pushFollow(FOLLOW_rule__ClassDescription__CommentsAssignment_8_in_rule__ClassDescription__Group__85948);
            rule__ClassDescription__CommentsAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getClassDescriptionAccess().getCommentsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__Group__8


    // $ANTLR start rule__Inheritance__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2766:1: rule__Inheritance__Group__0 : ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1 ;
    public final void rule__Inheritance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2770:1: ( ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2771:1: ( ( rule__Inheritance__ClassnameAssignment_0 ) ) rule__Inheritance__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2771:1: ( ( rule__Inheritance__ClassnameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2772:1: ( rule__Inheritance__ClassnameAssignment_0 )
            {
             before(grammarAccess.getInheritanceAccess().getClassnameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2773:1: ( rule__Inheritance__ClassnameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2773:2: rule__Inheritance__ClassnameAssignment_0
            {
            pushFollow(FOLLOW_rule__Inheritance__ClassnameAssignment_0_in_rule__Inheritance__Group__06000);
            rule__Inheritance__ClassnameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getInheritanceAccess().getClassnameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Inheritance__Group__1_in_rule__Inheritance__Group__06009);
            rule__Inheritance__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Inheritance__Group__0


    // $ANTLR start rule__Inheritance__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2784:1: rule__Inheritance__Group__1 : ( ( rule__Inheritance__SourcePathAssignment_1 ) ) ;
    public final void rule__Inheritance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2788:1: ( ( ( rule__Inheritance__SourcePathAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2789:1: ( ( rule__Inheritance__SourcePathAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2789:1: ( ( rule__Inheritance__SourcePathAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2790:1: ( rule__Inheritance__SourcePathAssignment_1 )
            {
             before(grammarAccess.getInheritanceAccess().getSourcePathAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2791:1: ( rule__Inheritance__SourcePathAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2791:2: rule__Inheritance__SourcePathAssignment_1
            {
            pushFollow(FOLLOW_rule__Inheritance__SourcePathAssignment_1_in_rule__Inheritance__Group__16037);
            rule__Inheritance__SourcePathAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getInheritanceAccess().getSourcePathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Inheritance__Group__1


    // $ANTLR start rule__ClassIdentification__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2805:1: rule__ClassIdentification__Group__0 : ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1 ;
    public final void rule__ClassIdentification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2809:1: ( ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2810:1: ( ( rule__ClassIdentification__ContactAssignment_0 ) ) rule__ClassIdentification__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2810:1: ( ( rule__ClassIdentification__ContactAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2811:1: ( rule__ClassIdentification__ContactAssignment_0 )
            {
             before(grammarAccess.getClassIdentificationAccess().getContactAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2812:1: ( rule__ClassIdentification__ContactAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2812:2: rule__ClassIdentification__ContactAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ContactAssignment_0_in_rule__ClassIdentification__Group__06075);
            rule__ClassIdentification__ContactAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getContactAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__1_in_rule__ClassIdentification__Group__06084);
            rule__ClassIdentification__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__Group__0


    // $ANTLR start rule__ClassIdentification__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2823:1: rule__ClassIdentification__Group__1 : ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) ) rule__ClassIdentification__Group__2 ;
    public final void rule__ClassIdentification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2827:1: ( ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) ) rule__ClassIdentification__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2828:1: ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) ) rule__ClassIdentification__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2828:1: ( ( rule__ClassIdentification__ClassFamilyAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2829:1: ( rule__ClassIdentification__ClassFamilyAssignment_1 )
            {
             before(grammarAccess.getClassIdentificationAccess().getClassFamilyAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2830:1: ( rule__ClassIdentification__ClassFamilyAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2830:2: rule__ClassIdentification__ClassFamilyAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ClassFamilyAssignment_1_in_rule__ClassIdentification__Group__16112);
            rule__ClassIdentification__ClassFamilyAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getClassFamilyAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__2_in_rule__ClassIdentification__Group__16121);
            rule__ClassIdentification__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__Group__1


    // $ANTLR start rule__ClassIdentification__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2841:1: rule__ClassIdentification__Group__2 : ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) ) rule__ClassIdentification__Group__3 ;
    public final void rule__ClassIdentification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2845:1: ( ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) ) rule__ClassIdentification__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2846:1: ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) ) rule__ClassIdentification__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2846:1: ( ( rule__ClassIdentification__SiteSpecificAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2847:1: ( rule__ClassIdentification__SiteSpecificAssignment_2 )
            {
             before(grammarAccess.getClassIdentificationAccess().getSiteSpecificAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2848:1: ( rule__ClassIdentification__SiteSpecificAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2848:2: rule__ClassIdentification__SiteSpecificAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassIdentification__SiteSpecificAssignment_2_in_rule__ClassIdentification__Group__26149);
            rule__ClassIdentification__SiteSpecificAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getSiteSpecificAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__3_in_rule__ClassIdentification__Group__26158);
            rule__ClassIdentification__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__Group__2


    // $ANTLR start rule__ClassIdentification__Group__3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2859:1: rule__ClassIdentification__Group__3 : ( ( rule__ClassIdentification__PlatformAssignment_3 ) ) rule__ClassIdentification__Group__4 ;
    public final void rule__ClassIdentification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2863:1: ( ( ( rule__ClassIdentification__PlatformAssignment_3 ) ) rule__ClassIdentification__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2864:1: ( ( rule__ClassIdentification__PlatformAssignment_3 ) ) rule__ClassIdentification__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2864:1: ( ( rule__ClassIdentification__PlatformAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2865:1: ( rule__ClassIdentification__PlatformAssignment_3 )
            {
             before(grammarAccess.getClassIdentificationAccess().getPlatformAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2866:1: ( rule__ClassIdentification__PlatformAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2866:2: rule__ClassIdentification__PlatformAssignment_3
            {
            pushFollow(FOLLOW_rule__ClassIdentification__PlatformAssignment_3_in_rule__ClassIdentification__Group__36186);
            rule__ClassIdentification__PlatformAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getPlatformAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__4_in_rule__ClassIdentification__Group__36195);
            rule__ClassIdentification__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__Group__3


    // $ANTLR start rule__ClassIdentification__Group__4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2877:1: rule__ClassIdentification__Group__4 : ( ( rule__ClassIdentification__BusAssignment_4 ) ) rule__ClassIdentification__Group__5 ;
    public final void rule__ClassIdentification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2881:1: ( ( ( rule__ClassIdentification__BusAssignment_4 ) ) rule__ClassIdentification__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2882:1: ( ( rule__ClassIdentification__BusAssignment_4 ) ) rule__ClassIdentification__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2882:1: ( ( rule__ClassIdentification__BusAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2883:1: ( rule__ClassIdentification__BusAssignment_4 )
            {
             before(grammarAccess.getClassIdentificationAccess().getBusAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2884:1: ( rule__ClassIdentification__BusAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2884:2: rule__ClassIdentification__BusAssignment_4
            {
            pushFollow(FOLLOW_rule__ClassIdentification__BusAssignment_4_in_rule__ClassIdentification__Group__46223);
            rule__ClassIdentification__BusAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getBusAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__5_in_rule__ClassIdentification__Group__46232);
            rule__ClassIdentification__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__Group__4


    // $ANTLR start rule__ClassIdentification__Group__5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2895:1: rule__ClassIdentification__Group__5 : ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) ) rule__ClassIdentification__Group__6 ;
    public final void rule__ClassIdentification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2899:1: ( ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) ) rule__ClassIdentification__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2900:1: ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) ) rule__ClassIdentification__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2900:1: ( ( rule__ClassIdentification__ManufacturerAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2901:1: ( rule__ClassIdentification__ManufacturerAssignment_5 )
            {
             before(grammarAccess.getClassIdentificationAccess().getManufacturerAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2902:1: ( rule__ClassIdentification__ManufacturerAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2902:2: rule__ClassIdentification__ManufacturerAssignment_5
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ManufacturerAssignment_5_in_rule__ClassIdentification__Group__56260);
            rule__ClassIdentification__ManufacturerAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getManufacturerAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__ClassIdentification__Group__6_in_rule__ClassIdentification__Group__56269);
            rule__ClassIdentification__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__Group__5


    // $ANTLR start rule__ClassIdentification__Group__6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2913:1: rule__ClassIdentification__Group__6 : ( ( rule__ClassIdentification__ReferenceAssignment_6 ) ) ;
    public final void rule__ClassIdentification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2917:1: ( ( ( rule__ClassIdentification__ReferenceAssignment_6 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2918:1: ( ( rule__ClassIdentification__ReferenceAssignment_6 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2918:1: ( ( rule__ClassIdentification__ReferenceAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2919:1: ( rule__ClassIdentification__ReferenceAssignment_6 )
            {
             before(grammarAccess.getClassIdentificationAccess().getReferenceAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2920:1: ( rule__ClassIdentification__ReferenceAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2920:2: rule__ClassIdentification__ReferenceAssignment_6
            {
            pushFollow(FOLLOW_rule__ClassIdentification__ReferenceAssignment_6_in_rule__ClassIdentification__Group__66297);
            rule__ClassIdentification__ReferenceAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getClassIdentificationAccess().getReferenceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__Group__6


    // $ANTLR start rule__State__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2944:1: rule__State__Group__0 : ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2948:1: ( ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2949:1: ( ( rule__State__NameAssignment_0 ) ) rule__State__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2949:1: ( ( rule__State__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2950:1: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2951:1: ( rule__State__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2951:2: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__06345);
            rule__State__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__06354);
            rule__State__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__0


    // $ANTLR start rule__State__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2962:1: rule__State__Group__1 : ( ( rule__State__DescriptionAssignment_1 ) ) ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2966:1: ( ( ( rule__State__DescriptionAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2967:1: ( ( rule__State__DescriptionAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2967:1: ( ( rule__State__DescriptionAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2968:1: ( rule__State__DescriptionAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getDescriptionAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2969:1: ( rule__State__DescriptionAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2969:2: rule__State__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__State__DescriptionAssignment_1_in_rule__State__Group__16382);
            rule__State__DescriptionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStateAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__Group__1


    // $ANTLR start rule__Property__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2983:1: rule__Property__Group__0 : ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2987:1: ( ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2988:1: ( ( rule__Property__NameAssignment_0 ) ) rule__Property__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2988:1: ( ( rule__Property__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2989:1: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2990:1: ( rule__Property__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:2990:2: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__06420);
            rule__Property__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06429);
            rule__Property__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__0


    // $ANTLR start rule__Property__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3001:1: rule__Property__Group__1 : ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3005:1: ( ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3006:1: ( ( rule__Property__TypeAssignment_1 ) ) rule__Property__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3006:1: ( ( rule__Property__TypeAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3007:1: ( rule__Property__TypeAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3008:1: ( rule__Property__TypeAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3008:2: rule__Property__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__16457);
            rule__Property__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16466);
            rule__Property__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__1


    // $ANTLR start rule__Property__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3019:1: rule__Property__Group__2 : ( ( rule__Property__DescriptionAssignment_2 ) ) rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3023:1: ( ( ( rule__Property__DescriptionAssignment_2 ) ) rule__Property__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3024:1: ( ( rule__Property__DescriptionAssignment_2 ) ) rule__Property__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3024:1: ( ( rule__Property__DescriptionAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3025:1: ( rule__Property__DescriptionAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3026:1: ( rule__Property__DescriptionAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3026:2: rule__Property__DescriptionAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__DescriptionAssignment_2_in_rule__Property__Group__26494);
            rule__Property__DescriptionAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPropertyAccess().getDescriptionAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__26503);
            rule__Property__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__2


    // $ANTLR start rule__Property__Group__3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3037:1: rule__Property__Group__3 : ( 'defaultPropValue:' ) rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3041:1: ( ( 'defaultPropValue:' ) rule__Property__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3042:1: ( 'defaultPropValue:' ) rule__Property__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3042:1: ( 'defaultPropValue:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3043:1: 'defaultPropValue:'
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__Property__Group__36532); 
             after(grammarAccess.getPropertyAccess().getDefaultPropValueKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__36542);
            rule__Property__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__3


    // $ANTLR start rule__Property__Group__4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3057:1: rule__Property__Group__4 : ( ( rule__Property__DefaultPropValueAssignment_4 )* ) ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3061:1: ( ( ( rule__Property__DefaultPropValueAssignment_4 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3062:1: ( ( rule__Property__DefaultPropValueAssignment_4 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3062:1: ( ( rule__Property__DefaultPropValueAssignment_4 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3063:1: ( rule__Property__DefaultPropValueAssignment_4 )*
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3064:1: ( rule__Property__DefaultPropValueAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3064:2: rule__Property__DefaultPropValueAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Property__DefaultPropValueAssignment_4_in_rule__Property__Group__46570);
            	    rule__Property__DefaultPropValueAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getDefaultPropValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__Group__4


    // $ANTLR start rule__Command__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3084:1: rule__Command__Group__0 : ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3088:1: ( ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3089:1: ( ( rule__Command__NameAssignment_0 ) ) rule__Command__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3089:1: ( ( rule__Command__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3090:1: ( rule__Command__NameAssignment_0 )
            {
             before(grammarAccess.getCommandAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3091:1: ( rule__Command__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3091:2: rule__Command__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__06615);
            rule__Command__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__1_in_rule__Command__Group__06624);
            rule__Command__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__Group__0


    // $ANTLR start rule__Command__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3102:1: rule__Command__Group__1 : ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3106:1: ( ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3107:1: ( ( rule__Command__ArginAssignment_1 ) ) rule__Command__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3107:1: ( ( rule__Command__ArginAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3108:1: ( rule__Command__ArginAssignment_1 )
            {
             before(grammarAccess.getCommandAccess().getArginAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3109:1: ( rule__Command__ArginAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3109:2: rule__Command__ArginAssignment_1
            {
            pushFollow(FOLLOW_rule__Command__ArginAssignment_1_in_rule__Command__Group__16652);
            rule__Command__ArginAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getArginAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__2_in_rule__Command__Group__16661);
            rule__Command__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__Group__1


    // $ANTLR start rule__Command__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3120:1: rule__Command__Group__2 : ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3 ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3124:1: ( ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3125:1: ( ( rule__Command__ArgoutAssignment_2 ) ) rule__Command__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3125:1: ( ( rule__Command__ArgoutAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3126:1: ( rule__Command__ArgoutAssignment_2 )
            {
             before(grammarAccess.getCommandAccess().getArgoutAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3127:1: ( rule__Command__ArgoutAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3127:2: rule__Command__ArgoutAssignment_2
            {
            pushFollow(FOLLOW_rule__Command__ArgoutAssignment_2_in_rule__Command__Group__26689);
            rule__Command__ArgoutAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getArgoutAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__3_in_rule__Command__Group__26698);
            rule__Command__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__Group__2


    // $ANTLR start rule__Command__Group__3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3138:1: rule__Command__Group__3 : ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4 ;
    public final void rule__Command__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3142:1: ( ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3143:1: ( ( rule__Command__DescriptionAssignment_3 ) ) rule__Command__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3143:1: ( ( rule__Command__DescriptionAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3144:1: ( rule__Command__DescriptionAssignment_3 )
            {
             before(grammarAccess.getCommandAccess().getDescriptionAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3145:1: ( rule__Command__DescriptionAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3145:2: rule__Command__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__Command__DescriptionAssignment_3_in_rule__Command__Group__36726);
            rule__Command__DescriptionAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getDescriptionAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__4_in_rule__Command__Group__36735);
            rule__Command__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__Group__3


    // $ANTLR start rule__Command__Group__4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3156:1: rule__Command__Group__4 : ( ( rule__Command__AbstractAssignment_4 ) ) rule__Command__Group__5 ;
    public final void rule__Command__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3160:1: ( ( ( rule__Command__AbstractAssignment_4 ) ) rule__Command__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3161:1: ( ( rule__Command__AbstractAssignment_4 ) ) rule__Command__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3161:1: ( ( rule__Command__AbstractAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3162:1: ( rule__Command__AbstractAssignment_4 )
            {
             before(grammarAccess.getCommandAccess().getAbstractAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3163:1: ( rule__Command__AbstractAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3163:2: rule__Command__AbstractAssignment_4
            {
            pushFollow(FOLLOW_rule__Command__AbstractAssignment_4_in_rule__Command__Group__46763);
            rule__Command__AbstractAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getAbstractAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__5_in_rule__Command__Group__46772);
            rule__Command__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__Group__4


    // $ANTLR start rule__Command__Group__5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3174:1: rule__Command__Group__5 : ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6 ;
    public final void rule__Command__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3178:1: ( ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3179:1: ( ( rule__Command__ExecMethodAssignment_5 ) ) rule__Command__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3179:1: ( ( rule__Command__ExecMethodAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3180:1: ( rule__Command__ExecMethodAssignment_5 )
            {
             before(grammarAccess.getCommandAccess().getExecMethodAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3181:1: ( rule__Command__ExecMethodAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3181:2: rule__Command__ExecMethodAssignment_5
            {
            pushFollow(FOLLOW_rule__Command__ExecMethodAssignment_5_in_rule__Command__Group__56800);
            rule__Command__ExecMethodAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getExecMethodAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__6_in_rule__Command__Group__56809);
            rule__Command__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__Group__5


    // $ANTLR start rule__Command__Group__6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3192:1: rule__Command__Group__6 : ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7 ;
    public final void rule__Command__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3196:1: ( ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3197:1: ( ( rule__Command__DisplayLevelAssignment_6 ) ) rule__Command__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3197:1: ( ( rule__Command__DisplayLevelAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3198:1: ( rule__Command__DisplayLevelAssignment_6 )
            {
             before(grammarAccess.getCommandAccess().getDisplayLevelAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3199:1: ( rule__Command__DisplayLevelAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3199:2: rule__Command__DisplayLevelAssignment_6
            {
            pushFollow(FOLLOW_rule__Command__DisplayLevelAssignment_6_in_rule__Command__Group__66837);
            rule__Command__DisplayLevelAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getDisplayLevelAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__7_in_rule__Command__Group__66846);
            rule__Command__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__Group__6


    // $ANTLR start rule__Command__Group__7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3210:1: rule__Command__Group__7 : ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8 ;
    public final void rule__Command__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3214:1: ( ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3215:1: ( ( rule__Command__PolledPeriodAssignment_7 ) ) rule__Command__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3215:1: ( ( rule__Command__PolledPeriodAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3216:1: ( rule__Command__PolledPeriodAssignment_7 )
            {
             before(grammarAccess.getCommandAccess().getPolledPeriodAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3217:1: ( rule__Command__PolledPeriodAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3217:2: rule__Command__PolledPeriodAssignment_7
            {
            pushFollow(FOLLOW_rule__Command__PolledPeriodAssignment_7_in_rule__Command__Group__76874);
            rule__Command__PolledPeriodAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getCommandAccess().getPolledPeriodAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__8_in_rule__Command__Group__76883);
            rule__Command__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__Group__7


    // $ANTLR start rule__Command__Group__8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3228:1: rule__Command__Group__8 : ( 'excludedStates:' ) rule__Command__Group__9 ;
    public final void rule__Command__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3232:1: ( ( 'excludedStates:' ) rule__Command__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3233:1: ( 'excludedStates:' ) rule__Command__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3233:1: ( 'excludedStates:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3234:1: 'excludedStates:'
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesKeyword_8()); 
            match(input,38,FOLLOW_38_in_rule__Command__Group__86912); 
             after(grammarAccess.getCommandAccess().getExcludedStatesKeyword_8()); 

            }

            pushFollow(FOLLOW_rule__Command__Group__9_in_rule__Command__Group__86922);
            rule__Command__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__Group__8


    // $ANTLR start rule__Command__Group__9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3248:1: rule__Command__Group__9 : ( ( rule__Command__ExcludedStatesAssignment_9 )* ) ;
    public final void rule__Command__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3252:1: ( ( ( rule__Command__ExcludedStatesAssignment_9 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3253:1: ( ( rule__Command__ExcludedStatesAssignment_9 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3253:1: ( ( rule__Command__ExcludedStatesAssignment_9 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3254:1: ( rule__Command__ExcludedStatesAssignment_9 )*
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3255:1: ( rule__Command__ExcludedStatesAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3255:2: rule__Command__ExcludedStatesAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Command__ExcludedStatesAssignment_9_in_rule__Command__Group__96950);
            	    rule__Command__ExcludedStatesAssignment_9();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCommandAccess().getExcludedStatesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__Group__9


    // $ANTLR start rule__Argument__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3285:1: rule__Argument__Group__0 : ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3289:1: ( ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3290:1: ( ( rule__Argument__TypeAssignment_0 ) ) rule__Argument__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3290:1: ( ( rule__Argument__TypeAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3291:1: ( rule__Argument__TypeAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3292:1: ( rule__Argument__TypeAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3292:2: rule__Argument__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__07005);
            rule__Argument__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__07014);
            rule__Argument__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__0


    // $ANTLR start rule__Argument__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3303:1: rule__Argument__Group__1 : ( ( rule__Argument__DescriptionAssignment_1 ) ) ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3307:1: ( ( ( rule__Argument__DescriptionAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3308:1: ( ( rule__Argument__DescriptionAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3308:1: ( ( rule__Argument__DescriptionAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3309:1: ( rule__Argument__DescriptionAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getDescriptionAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3310:1: ( rule__Argument__DescriptionAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3310:2: rule__Argument__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__DescriptionAssignment_1_in_rule__Argument__Group__17042);
            rule__Argument__DescriptionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__Group__1


    // $ANTLR start rule__Attribute__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3324:1: rule__Attribute__Group__0 : ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3328:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3329:1: ( ( rule__Attribute__NameAssignment_0 ) ) rule__Attribute__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3329:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3330:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3331:1: ( rule__Attribute__NameAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3331:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__07080);
            rule__Attribute__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07089);
            rule__Attribute__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__0


    // $ANTLR start rule__Attribute__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3342:1: rule__Attribute__Group__1 : ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3346:1: ( ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3347:1: ( ( rule__Attribute__AttTypeAssignment_1 ) ) rule__Attribute__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3347:1: ( ( rule__Attribute__AttTypeAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3348:1: ( rule__Attribute__AttTypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3349:1: ( rule__Attribute__AttTypeAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3349:2: rule__Attribute__AttTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__AttTypeAssignment_1_in_rule__Attribute__Group__17117);
            rule__Attribute__AttTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__17126);
            rule__Attribute__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__1


    // $ANTLR start rule__Attribute__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3360:1: rule__Attribute__Group__2 : ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3364:1: ( ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3365:1: ( ( rule__Attribute__DataTypeAssignment_2 ) ) rule__Attribute__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3365:1: ( ( rule__Attribute__DataTypeAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3366:1: ( rule__Attribute__DataTypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getDataTypeAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3367:1: ( rule__Attribute__DataTypeAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3367:2: rule__Attribute__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__DataTypeAssignment_2_in_rule__Attribute__Group__27154);
            rule__Attribute__DataTypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDataTypeAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__27163);
            rule__Attribute__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__2


    // $ANTLR start rule__Attribute__Group__3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3378:1: rule__Attribute__Group__3 : ( ( rule__Attribute__RwTtypeAssignment_3 ) ) rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3382:1: ( ( ( rule__Attribute__RwTtypeAssignment_3 ) ) rule__Attribute__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3383:1: ( ( rule__Attribute__RwTtypeAssignment_3 ) ) rule__Attribute__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3383:1: ( ( rule__Attribute__RwTtypeAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3384:1: ( rule__Attribute__RwTtypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getRwTtypeAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3385:1: ( rule__Attribute__RwTtypeAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3385:2: rule__Attribute__RwTtypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__RwTtypeAssignment_3_in_rule__Attribute__Group__37191);
            rule__Attribute__RwTtypeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getRwTtypeAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__37200);
            rule__Attribute__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__3


    // $ANTLR start rule__Attribute__Group__4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3396:1: rule__Attribute__Group__4 : ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3400:1: ( ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3401:1: ( ( rule__Attribute__DisplayLevelAssignment_4 ) ) rule__Attribute__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3401:1: ( ( rule__Attribute__DisplayLevelAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3402:1: ( rule__Attribute__DisplayLevelAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getDisplayLevelAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3403:1: ( rule__Attribute__DisplayLevelAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3403:2: rule__Attribute__DisplayLevelAssignment_4
            {
            pushFollow(FOLLOW_rule__Attribute__DisplayLevelAssignment_4_in_rule__Attribute__Group__47228);
            rule__Attribute__DisplayLevelAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDisplayLevelAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__47237);
            rule__Attribute__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__4


    // $ANTLR start rule__Attribute__Group__5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3414:1: rule__Attribute__Group__5 : ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3418:1: ( ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3419:1: ( ( rule__Attribute__PolledPeriodAssignment_5 ) ) rule__Attribute__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3419:1: ( ( rule__Attribute__PolledPeriodAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3420:1: ( rule__Attribute__PolledPeriodAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getPolledPeriodAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3421:1: ( rule__Attribute__PolledPeriodAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3421:2: rule__Attribute__PolledPeriodAssignment_5
            {
            pushFollow(FOLLOW_rule__Attribute__PolledPeriodAssignment_5_in_rule__Attribute__Group__57265);
            rule__Attribute__PolledPeriodAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getPolledPeriodAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__57274);
            rule__Attribute__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__5


    // $ANTLR start rule__Attribute__Group__6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3432:1: rule__Attribute__Group__6 : ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3436:1: ( ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3437:1: ( ( rule__Attribute__MaxXAssignment_6 ) ) rule__Attribute__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3437:1: ( ( rule__Attribute__MaxXAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3438:1: ( rule__Attribute__MaxXAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getMaxXAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3439:1: ( rule__Attribute__MaxXAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3439:2: rule__Attribute__MaxXAssignment_6
            {
            pushFollow(FOLLOW_rule__Attribute__MaxXAssignment_6_in_rule__Attribute__Group__67302);
            rule__Attribute__MaxXAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMaxXAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__7_in_rule__Attribute__Group__67311);
            rule__Attribute__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__6


    // $ANTLR start rule__Attribute__Group__7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3450:1: rule__Attribute__Group__7 : ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3454:1: ( ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3455:1: ( ( rule__Attribute__MaxYAssignment_7 ) ) rule__Attribute__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3455:1: ( ( rule__Attribute__MaxYAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3456:1: ( rule__Attribute__MaxYAssignment_7 )
            {
             before(grammarAccess.getAttributeAccess().getMaxYAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3457:1: ( rule__Attribute__MaxYAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3457:2: rule__Attribute__MaxYAssignment_7
            {
            pushFollow(FOLLOW_rule__Attribute__MaxYAssignment_7_in_rule__Attribute__Group__77339);
            rule__Attribute__MaxYAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMaxYAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__8_in_rule__Attribute__Group__77348);
            rule__Attribute__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__7


    // $ANTLR start rule__Attribute__Group__8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3468:1: rule__Attribute__Group__8 : ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3472:1: ( ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3473:1: ( ( rule__Attribute__MemorizedAssignment_8 ) ) rule__Attribute__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3473:1: ( ( rule__Attribute__MemorizedAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3474:1: ( rule__Attribute__MemorizedAssignment_8 )
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3475:1: ( rule__Attribute__MemorizedAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3475:2: rule__Attribute__MemorizedAssignment_8
            {
            pushFollow(FOLLOW_rule__Attribute__MemorizedAssignment_8_in_rule__Attribute__Group__87376);
            rule__Attribute__MemorizedAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMemorizedAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__9_in_rule__Attribute__Group__87385);
            rule__Attribute__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__8


    // $ANTLR start rule__Attribute__Group__9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3486:1: rule__Attribute__Group__9 : ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10 ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3490:1: ( ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3491:1: ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) ) rule__Attribute__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3491:1: ( ( rule__Attribute__MemorizedAtInitAssignment_9 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3492:1: ( rule__Attribute__MemorizedAtInitAssignment_9 )
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAtInitAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3493:1: ( rule__Attribute__MemorizedAtInitAssignment_9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3493:2: rule__Attribute__MemorizedAtInitAssignment_9
            {
            pushFollow(FOLLOW_rule__Attribute__MemorizedAtInitAssignment_9_in_rule__Attribute__Group__97413);
            rule__Attribute__MemorizedAtInitAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMemorizedAtInitAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__10_in_rule__Attribute__Group__97422);
            rule__Attribute__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__9


    // $ANTLR start rule__Attribute__Group__10
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3504:1: rule__Attribute__Group__10 : ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11 ;
    public final void rule__Attribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3508:1: ( ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3509:1: ( ( rule__Attribute__ChangeEventAssignment_10 ) ) rule__Attribute__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3509:1: ( ( rule__Attribute__ChangeEventAssignment_10 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3510:1: ( rule__Attribute__ChangeEventAssignment_10 )
            {
             before(grammarAccess.getAttributeAccess().getChangeEventAssignment_10()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3511:1: ( rule__Attribute__ChangeEventAssignment_10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3511:2: rule__Attribute__ChangeEventAssignment_10
            {
            pushFollow(FOLLOW_rule__Attribute__ChangeEventAssignment_10_in_rule__Attribute__Group__107450);
            rule__Attribute__ChangeEventAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getChangeEventAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__11_in_rule__Attribute__Group__107459);
            rule__Attribute__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__10


    // $ANTLR start rule__Attribute__Group__11
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3522:1: rule__Attribute__Group__11 : ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12 ;
    public final void rule__Attribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3526:1: ( ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3527:1: ( ( rule__Attribute__ArchiveEventAssignment_11 ) ) rule__Attribute__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3527:1: ( ( rule__Attribute__ArchiveEventAssignment_11 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3528:1: ( rule__Attribute__ArchiveEventAssignment_11 )
            {
             before(grammarAccess.getAttributeAccess().getArchiveEventAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3529:1: ( rule__Attribute__ArchiveEventAssignment_11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3529:2: rule__Attribute__ArchiveEventAssignment_11
            {
            pushFollow(FOLLOW_rule__Attribute__ArchiveEventAssignment_11_in_rule__Attribute__Group__117487);
            rule__Attribute__ArchiveEventAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getArchiveEventAssignment_11()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__12_in_rule__Attribute__Group__117496);
            rule__Attribute__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__11


    // $ANTLR start rule__Attribute__Group__12
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3540:1: rule__Attribute__Group__12 : ( ( rule__Attribute__PropertiesAssignment_12 ) ) rule__Attribute__Group__13 ;
    public final void rule__Attribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3544:1: ( ( ( rule__Attribute__PropertiesAssignment_12 ) ) rule__Attribute__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3545:1: ( ( rule__Attribute__PropertiesAssignment_12 ) ) rule__Attribute__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3545:1: ( ( rule__Attribute__PropertiesAssignment_12 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3546:1: ( rule__Attribute__PropertiesAssignment_12 )
            {
             before(grammarAccess.getAttributeAccess().getPropertiesAssignment_12()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3547:1: ( rule__Attribute__PropertiesAssignment_12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3547:2: rule__Attribute__PropertiesAssignment_12
            {
            pushFollow(FOLLOW_rule__Attribute__PropertiesAssignment_12_in_rule__Attribute__Group__127524);
            rule__Attribute__PropertiesAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getAttributeAccess().getPropertiesAssignment_12()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__13_in_rule__Attribute__Group__127533);
            rule__Attribute__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__12


    // $ANTLR start rule__Attribute__Group__13
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3558:1: rule__Attribute__Group__13 : ( 'excludedStates:' ) rule__Attribute__Group__14 ;
    public final void rule__Attribute__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3562:1: ( ( 'excludedStates:' ) rule__Attribute__Group__14 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3563:1: ( 'excludedStates:' ) rule__Attribute__Group__14
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3563:1: ( 'excludedStates:' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3564:1: 'excludedStates:'
            {
             before(grammarAccess.getAttributeAccess().getExcludedStatesKeyword_13()); 
            match(input,38,FOLLOW_38_in_rule__Attribute__Group__137562); 
             after(grammarAccess.getAttributeAccess().getExcludedStatesKeyword_13()); 

            }

            pushFollow(FOLLOW_rule__Attribute__Group__14_in_rule__Attribute__Group__137572);
            rule__Attribute__Group__14();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__13


    // $ANTLR start rule__Attribute__Group__14
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3578:1: rule__Attribute__Group__14 : ( ( rule__Attribute__ExcludedStatesAssignment_14 )* ) ;
    public final void rule__Attribute__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3582:1: ( ( ( rule__Attribute__ExcludedStatesAssignment_14 )* ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3583:1: ( ( rule__Attribute__ExcludedStatesAssignment_14 )* )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3583:1: ( ( rule__Attribute__ExcludedStatesAssignment_14 )* )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3584:1: ( rule__Attribute__ExcludedStatesAssignment_14 )*
            {
             before(grammarAccess.getAttributeAccess().getExcludedStatesAssignment_14()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3585:1: ( rule__Attribute__ExcludedStatesAssignment_14 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3585:2: rule__Attribute__ExcludedStatesAssignment_14
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__ExcludedStatesAssignment_14_in_rule__Attribute__Group__147600);
            	    rule__Attribute__ExcludedStatesAssignment_14();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getExcludedStatesAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__Group__14


    // $ANTLR start rule__FireEvents__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3625:1: rule__FireEvents__Group__0 : ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1 ;
    public final void rule__FireEvents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3629:1: ( ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3630:1: ( ( rule__FireEvents__FireAssignment_0 ) ) rule__FireEvents__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3630:1: ( ( rule__FireEvents__FireAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3631:1: ( rule__FireEvents__FireAssignment_0 )
            {
             before(grammarAccess.getFireEventsAccess().getFireAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3632:1: ( rule__FireEvents__FireAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3632:2: rule__FireEvents__FireAssignment_0
            {
            pushFollow(FOLLOW_rule__FireEvents__FireAssignment_0_in_rule__FireEvents__Group__07665);
            rule__FireEvents__FireAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFireEventsAccess().getFireAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__FireEvents__Group__1_in_rule__FireEvents__Group__07674);
            rule__FireEvents__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FireEvents__Group__0


    // $ANTLR start rule__FireEvents__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3643:1: rule__FireEvents__Group__1 : ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) ) ;
    public final void rule__FireEvents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3647:1: ( ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3648:1: ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3648:1: ( ( rule__FireEvents__LibCheckCriteriaAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3649:1: ( rule__FireEvents__LibCheckCriteriaAssignment_1 )
            {
             before(grammarAccess.getFireEventsAccess().getLibCheckCriteriaAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3650:1: ( rule__FireEvents__LibCheckCriteriaAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3650:2: rule__FireEvents__LibCheckCriteriaAssignment_1
            {
            pushFollow(FOLLOW_rule__FireEvents__LibCheckCriteriaAssignment_1_in_rule__FireEvents__Group__17702);
            rule__FireEvents__LibCheckCriteriaAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFireEventsAccess().getLibCheckCriteriaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FireEvents__Group__1


    // $ANTLR start rule__AttrProperties__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3664:1: rule__AttrProperties__Group__0 : ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1 ;
    public final void rule__AttrProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3668:1: ( ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3669:1: ( ( rule__AttrProperties__DescriptionAssignment_0 ) ) rule__AttrProperties__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3669:1: ( ( rule__AttrProperties__DescriptionAssignment_0 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3670:1: ( rule__AttrProperties__DescriptionAssignment_0 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDescriptionAssignment_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3671:1: ( rule__AttrProperties__DescriptionAssignment_0 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3671:2: rule__AttrProperties__DescriptionAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrProperties__DescriptionAssignment_0_in_rule__AttrProperties__Group__07740);
            rule__AttrProperties__DescriptionAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDescriptionAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__1_in_rule__AttrProperties__Group__07749);
            rule__AttrProperties__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__0


    // $ANTLR start rule__AttrProperties__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3682:1: rule__AttrProperties__Group__1 : ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2 ;
    public final void rule__AttrProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3686:1: ( ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3687:1: ( ( rule__AttrProperties__LabelAssignment_1 ) ) rule__AttrProperties__Group__2
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3687:1: ( ( rule__AttrProperties__LabelAssignment_1 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3688:1: ( rule__AttrProperties__LabelAssignment_1 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getLabelAssignment_1()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3689:1: ( rule__AttrProperties__LabelAssignment_1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3689:2: rule__AttrProperties__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__AttrProperties__LabelAssignment_1_in_rule__AttrProperties__Group__17777);
            rule__AttrProperties__LabelAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getLabelAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__2_in_rule__AttrProperties__Group__17786);
            rule__AttrProperties__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__1


    // $ANTLR start rule__AttrProperties__Group__2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3700:1: rule__AttrProperties__Group__2 : ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3 ;
    public final void rule__AttrProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3704:1: ( ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3705:1: ( ( rule__AttrProperties__UnitAssignment_2 ) ) rule__AttrProperties__Group__3
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3705:1: ( ( rule__AttrProperties__UnitAssignment_2 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3706:1: ( rule__AttrProperties__UnitAssignment_2 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getUnitAssignment_2()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3707:1: ( rule__AttrProperties__UnitAssignment_2 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3707:2: rule__AttrProperties__UnitAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrProperties__UnitAssignment_2_in_rule__AttrProperties__Group__27814);
            rule__AttrProperties__UnitAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getUnitAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__3_in_rule__AttrProperties__Group__27823);
            rule__AttrProperties__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__2


    // $ANTLR start rule__AttrProperties__Group__3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3718:1: rule__AttrProperties__Group__3 : ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4 ;
    public final void rule__AttrProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3722:1: ( ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3723:1: ( ( rule__AttrProperties__StandardUnitAssignment_3 ) ) rule__AttrProperties__Group__4
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3723:1: ( ( rule__AttrProperties__StandardUnitAssignment_3 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3724:1: ( rule__AttrProperties__StandardUnitAssignment_3 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getStandardUnitAssignment_3()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3725:1: ( rule__AttrProperties__StandardUnitAssignment_3 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3725:2: rule__AttrProperties__StandardUnitAssignment_3
            {
            pushFollow(FOLLOW_rule__AttrProperties__StandardUnitAssignment_3_in_rule__AttrProperties__Group__37851);
            rule__AttrProperties__StandardUnitAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getStandardUnitAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__4_in_rule__AttrProperties__Group__37860);
            rule__AttrProperties__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__3


    // $ANTLR start rule__AttrProperties__Group__4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3736:1: rule__AttrProperties__Group__4 : ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5 ;
    public final void rule__AttrProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3740:1: ( ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3741:1: ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) ) rule__AttrProperties__Group__5
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3741:1: ( ( rule__AttrProperties__DisplayUnitAssignment_4 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3742:1: ( rule__AttrProperties__DisplayUnitAssignment_4 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDisplayUnitAssignment_4()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3743:1: ( rule__AttrProperties__DisplayUnitAssignment_4 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3743:2: rule__AttrProperties__DisplayUnitAssignment_4
            {
            pushFollow(FOLLOW_rule__AttrProperties__DisplayUnitAssignment_4_in_rule__AttrProperties__Group__47888);
            rule__AttrProperties__DisplayUnitAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDisplayUnitAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__5_in_rule__AttrProperties__Group__47897);
            rule__AttrProperties__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__4


    // $ANTLR start rule__AttrProperties__Group__5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3754:1: rule__AttrProperties__Group__5 : ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6 ;
    public final void rule__AttrProperties__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3758:1: ( ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3759:1: ( ( rule__AttrProperties__FormatAssignment_5 ) ) rule__AttrProperties__Group__6
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3759:1: ( ( rule__AttrProperties__FormatAssignment_5 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3760:1: ( rule__AttrProperties__FormatAssignment_5 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getFormatAssignment_5()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3761:1: ( rule__AttrProperties__FormatAssignment_5 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3761:2: rule__AttrProperties__FormatAssignment_5
            {
            pushFollow(FOLLOW_rule__AttrProperties__FormatAssignment_5_in_rule__AttrProperties__Group__57925);
            rule__AttrProperties__FormatAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getFormatAssignment_5()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__6_in_rule__AttrProperties__Group__57934);
            rule__AttrProperties__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__5


    // $ANTLR start rule__AttrProperties__Group__6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3772:1: rule__AttrProperties__Group__6 : ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7 ;
    public final void rule__AttrProperties__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3776:1: ( ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3777:1: ( ( rule__AttrProperties__MaxValueAssignment_6 ) ) rule__AttrProperties__Group__7
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3777:1: ( ( rule__AttrProperties__MaxValueAssignment_6 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3778:1: ( rule__AttrProperties__MaxValueAssignment_6 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxValueAssignment_6()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3779:1: ( rule__AttrProperties__MaxValueAssignment_6 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3779:2: rule__AttrProperties__MaxValueAssignment_6
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxValueAssignment_6_in_rule__AttrProperties__Group__67962);
            rule__AttrProperties__MaxValueAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxValueAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__7_in_rule__AttrProperties__Group__67971);
            rule__AttrProperties__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__6


    // $ANTLR start rule__AttrProperties__Group__7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3790:1: rule__AttrProperties__Group__7 : ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8 ;
    public final void rule__AttrProperties__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3794:1: ( ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3795:1: ( ( rule__AttrProperties__MinValueAssignment_7 ) ) rule__AttrProperties__Group__8
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3795:1: ( ( rule__AttrProperties__MinValueAssignment_7 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3796:1: ( rule__AttrProperties__MinValueAssignment_7 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinValueAssignment_7()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3797:1: ( rule__AttrProperties__MinValueAssignment_7 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3797:2: rule__AttrProperties__MinValueAssignment_7
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinValueAssignment_7_in_rule__AttrProperties__Group__77999);
            rule__AttrProperties__MinValueAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinValueAssignment_7()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__8_in_rule__AttrProperties__Group__78008);
            rule__AttrProperties__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__7


    // $ANTLR start rule__AttrProperties__Group__8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3808:1: rule__AttrProperties__Group__8 : ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9 ;
    public final void rule__AttrProperties__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3812:1: ( ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3813:1: ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) ) rule__AttrProperties__Group__9
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3813:1: ( ( rule__AttrProperties__MaxAlarmAssignment_8 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3814:1: ( rule__AttrProperties__MaxAlarmAssignment_8 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxAlarmAssignment_8()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3815:1: ( rule__AttrProperties__MaxAlarmAssignment_8 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3815:2: rule__AttrProperties__MaxAlarmAssignment_8
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxAlarmAssignment_8_in_rule__AttrProperties__Group__88036);
            rule__AttrProperties__MaxAlarmAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxAlarmAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__9_in_rule__AttrProperties__Group__88045);
            rule__AttrProperties__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__8


    // $ANTLR start rule__AttrProperties__Group__9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3826:1: rule__AttrProperties__Group__9 : ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10 ;
    public final void rule__AttrProperties__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3830:1: ( ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3831:1: ( ( rule__AttrProperties__MinAlarmAssignment_9 ) ) rule__AttrProperties__Group__10
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3831:1: ( ( rule__AttrProperties__MinAlarmAssignment_9 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3832:1: ( rule__AttrProperties__MinAlarmAssignment_9 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinAlarmAssignment_9()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3833:1: ( rule__AttrProperties__MinAlarmAssignment_9 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3833:2: rule__AttrProperties__MinAlarmAssignment_9
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinAlarmAssignment_9_in_rule__AttrProperties__Group__98073);
            rule__AttrProperties__MinAlarmAssignment_9();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinAlarmAssignment_9()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__10_in_rule__AttrProperties__Group__98082);
            rule__AttrProperties__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__9


    // $ANTLR start rule__AttrProperties__Group__10
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3844:1: rule__AttrProperties__Group__10 : ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11 ;
    public final void rule__AttrProperties__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3848:1: ( ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3849:1: ( ( rule__AttrProperties__MaxWarningAssignment_10 ) ) rule__AttrProperties__Group__11
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3849:1: ( ( rule__AttrProperties__MaxWarningAssignment_10 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3850:1: ( rule__AttrProperties__MaxWarningAssignment_10 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxWarningAssignment_10()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3851:1: ( rule__AttrProperties__MaxWarningAssignment_10 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3851:2: rule__AttrProperties__MaxWarningAssignment_10
            {
            pushFollow(FOLLOW_rule__AttrProperties__MaxWarningAssignment_10_in_rule__AttrProperties__Group__108110);
            rule__AttrProperties__MaxWarningAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMaxWarningAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__11_in_rule__AttrProperties__Group__108119);
            rule__AttrProperties__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__10


    // $ANTLR start rule__AttrProperties__Group__11
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3862:1: rule__AttrProperties__Group__11 : ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12 ;
    public final void rule__AttrProperties__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3866:1: ( ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3867:1: ( ( rule__AttrProperties__MinWarningAssignment_11 ) ) rule__AttrProperties__Group__12
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3867:1: ( ( rule__AttrProperties__MinWarningAssignment_11 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3868:1: ( rule__AttrProperties__MinWarningAssignment_11 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinWarningAssignment_11()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3869:1: ( rule__AttrProperties__MinWarningAssignment_11 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3869:2: rule__AttrProperties__MinWarningAssignment_11
            {
            pushFollow(FOLLOW_rule__AttrProperties__MinWarningAssignment_11_in_rule__AttrProperties__Group__118147);
            rule__AttrProperties__MinWarningAssignment_11();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getMinWarningAssignment_11()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__12_in_rule__AttrProperties__Group__118156);
            rule__AttrProperties__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__11


    // $ANTLR start rule__AttrProperties__Group__12
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3880:1: rule__AttrProperties__Group__12 : ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13 ;
    public final void rule__AttrProperties__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3884:1: ( ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3885:1: ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) ) rule__AttrProperties__Group__13
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3885:1: ( ( rule__AttrProperties__DeltaTimeAssignment_12 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3886:1: ( rule__AttrProperties__DeltaTimeAssignment_12 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaTimeAssignment_12()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3887:1: ( rule__AttrProperties__DeltaTimeAssignment_12 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3887:2: rule__AttrProperties__DeltaTimeAssignment_12
            {
            pushFollow(FOLLOW_rule__AttrProperties__DeltaTimeAssignment_12_in_rule__AttrProperties__Group__128184);
            rule__AttrProperties__DeltaTimeAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDeltaTimeAssignment_12()); 

            }

            pushFollow(FOLLOW_rule__AttrProperties__Group__13_in_rule__AttrProperties__Group__128193);
            rule__AttrProperties__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__12


    // $ANTLR start rule__AttrProperties__Group__13
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3898:1: rule__AttrProperties__Group__13 : ( ( rule__AttrProperties__DeltaValueAssignment_13 ) ) ;
    public final void rule__AttrProperties__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3902:1: ( ( ( rule__AttrProperties__DeltaValueAssignment_13 ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3903:1: ( ( rule__AttrProperties__DeltaValueAssignment_13 ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3903:1: ( ( rule__AttrProperties__DeltaValueAssignment_13 ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3904:1: ( rule__AttrProperties__DeltaValueAssignment_13 )
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaValueAssignment_13()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3905:1: ( rule__AttrProperties__DeltaValueAssignment_13 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3905:2: rule__AttrProperties__DeltaValueAssignment_13
            {
            pushFollow(FOLLOW_rule__AttrProperties__DeltaValueAssignment_13_in_rule__AttrProperties__Group__138221);
            rule__AttrProperties__DeltaValueAssignment_13();
            _fsp--;


            }

             after(grammarAccess.getAttrPropertiesAccess().getDeltaValueAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__Group__13


    // $ANTLR start rule__VoidType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3943:1: rule__VoidType__Group__0 : ( () ) rule__VoidType__Group__1 ;
    public final void rule__VoidType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3947:1: ( ( () ) rule__VoidType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3948:1: ( () ) rule__VoidType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3948:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3949:1: ()
            {
             before(grammarAccess.getVoidTypeAccess().getVoidTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3950:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3952:1: 
            {
            }

             after(grammarAccess.getVoidTypeAccess().getVoidTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__VoidType__Group__1_in_rule__VoidType__Group__08293);
            rule__VoidType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VoidType__Group__0


    // $ANTLR start rule__VoidType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3963:1: rule__VoidType__Group__1 : ( 'void' ) ;
    public final void rule__VoidType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3967:1: ( ( 'void' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3968:1: ( 'void' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3968:1: ( 'void' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3969:1: 'void'
            {
             before(grammarAccess.getVoidTypeAccess().getVoidKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__VoidType__Group__18322); 
             after(grammarAccess.getVoidTypeAccess().getVoidKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VoidType__Group__1


    // $ANTLR start rule__BooleanType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3986:1: rule__BooleanType__Group__0 : ( () ) rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3990:1: ( ( () ) rule__BooleanType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3991:1: ( () ) rule__BooleanType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3991:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3992:1: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3993:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:3995:1: 
            {
            }

             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__08371);
            rule__BooleanType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BooleanType__Group__0


    // $ANTLR start rule__BooleanType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4006:1: rule__BooleanType__Group__1 : ( 'boolean' ) ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4010:1: ( ( 'boolean' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4011:1: ( 'boolean' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4011:1: ( 'boolean' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4012:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__BooleanType__Group__18400); 
             after(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BooleanType__Group__1


    // $ANTLR start rule__ShortType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4029:1: rule__ShortType__Group__0 : ( () ) rule__ShortType__Group__1 ;
    public final void rule__ShortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4033:1: ( ( () ) rule__ShortType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4034:1: ( () ) rule__ShortType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4034:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4035:1: ()
            {
             before(grammarAccess.getShortTypeAccess().getShortTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4036:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4038:1: 
            {
            }

             after(grammarAccess.getShortTypeAccess().getShortTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortType__Group__1_in_rule__ShortType__Group__08449);
            rule__ShortType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ShortType__Group__0


    // $ANTLR start rule__ShortType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4049:1: rule__ShortType__Group__1 : ( 'short' ) ;
    public final void rule__ShortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4053:1: ( ( 'short' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4054:1: ( 'short' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4054:1: ( 'short' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4055:1: 'short'
            {
             before(grammarAccess.getShortTypeAccess().getShortKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__ShortType__Group__18478); 
             after(grammarAccess.getShortTypeAccess().getShortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ShortType__Group__1


    // $ANTLR start rule__UShortType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4072:1: rule__UShortType__Group__0 : ( () ) rule__UShortType__Group__1 ;
    public final void rule__UShortType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4076:1: ( ( () ) rule__UShortType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4077:1: ( () ) rule__UShortType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4077:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4078:1: ()
            {
             before(grammarAccess.getUShortTypeAccess().getUShortTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4079:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4081:1: 
            {
            }

             after(grammarAccess.getUShortTypeAccess().getUShortTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UShortType__Group__1_in_rule__UShortType__Group__08527);
            rule__UShortType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UShortType__Group__0


    // $ANTLR start rule__UShortType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4092:1: rule__UShortType__Group__1 : ( 'ushort' ) ;
    public final void rule__UShortType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4096:1: ( ( 'ushort' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4097:1: ( 'ushort' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4097:1: ( 'ushort' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4098:1: 'ushort'
            {
             before(grammarAccess.getUShortTypeAccess().getUshortKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__UShortType__Group__18556); 
             after(grammarAccess.getUShortTypeAccess().getUshortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UShortType__Group__1


    // $ANTLR start rule__IntType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4115:1: rule__IntType__Group__0 : ( () ) rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4119:1: ( ( () ) rule__IntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4120:1: ( () ) rule__IntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4120:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4121:1: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4122:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4124:1: 
            {
            }

             after(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__08605);
            rule__IntType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntType__Group__0


    // $ANTLR start rule__IntType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4135:1: rule__IntType__Group__1 : ( 'int' ) ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4139:1: ( ( 'int' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4140:1: ( 'int' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4140:1: ( 'int' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4141:1: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__IntType__Group__18634); 
             after(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntType__Group__1


    // $ANTLR start rule__UIntType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4158:1: rule__UIntType__Group__0 : ( () ) rule__UIntType__Group__1 ;
    public final void rule__UIntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4162:1: ( ( () ) rule__UIntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4163:1: ( () ) rule__UIntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4163:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4164:1: ()
            {
             before(grammarAccess.getUIntTypeAccess().getUIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4165:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4167:1: 
            {
            }

             after(grammarAccess.getUIntTypeAccess().getUIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UIntType__Group__1_in_rule__UIntType__Group__08683);
            rule__UIntType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UIntType__Group__0


    // $ANTLR start rule__UIntType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4178:1: rule__UIntType__Group__1 : ( 'uint' ) ;
    public final void rule__UIntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4182:1: ( ( 'uint' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4183:1: ( 'uint' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4183:1: ( 'uint' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4184:1: 'uint'
            {
             before(grammarAccess.getUIntTypeAccess().getUintKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__UIntType__Group__18712); 
             after(grammarAccess.getUIntTypeAccess().getUintKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UIntType__Group__1


    // $ANTLR start rule__FloatType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4201:1: rule__FloatType__Group__0 : ( () ) rule__FloatType__Group__1 ;
    public final void rule__FloatType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4205:1: ( ( () ) rule__FloatType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4206:1: ( () ) rule__FloatType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4206:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4207:1: ()
            {
             before(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4208:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4210:1: 
            {
            }

             after(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__08761);
            rule__FloatType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatType__Group__0


    // $ANTLR start rule__FloatType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4221:1: rule__FloatType__Group__1 : ( 'float' ) ;
    public final void rule__FloatType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4225:1: ( ( 'float' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4226:1: ( 'float' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4226:1: ( 'float' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4227:1: 'float'
            {
             before(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__FloatType__Group__18790); 
             after(grammarAccess.getFloatTypeAccess().getFloatKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatType__Group__1


    // $ANTLR start rule__DoubleType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4244:1: rule__DoubleType__Group__0 : ( () ) rule__DoubleType__Group__1 ;
    public final void rule__DoubleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4248:1: ( ( () ) rule__DoubleType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4249:1: ( () ) rule__DoubleType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4249:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4250:1: ()
            {
             before(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4251:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4253:1: 
            {
            }

             after(grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleType__Group__1_in_rule__DoubleType__Group__08839);
            rule__DoubleType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoubleType__Group__0


    // $ANTLR start rule__DoubleType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4264:1: rule__DoubleType__Group__1 : ( 'double' ) ;
    public final void rule__DoubleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4268:1: ( ( 'double' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4269:1: ( 'double' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4269:1: ( 'double' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4270:1: 'double'
            {
             before(grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__DoubleType__Group__18868); 
             after(grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoubleType__Group__1


    // $ANTLR start rule__StringType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4287:1: rule__StringType__Group__0 : ( () ) rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4291:1: ( ( () ) rule__StringType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4292:1: ( () ) rule__StringType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4292:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4293:1: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4294:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4296:1: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__08917);
            rule__StringType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringType__Group__0


    // $ANTLR start rule__StringType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4307:1: rule__StringType__Group__1 : ( 'string' ) ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4311:1: ( ( 'string' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4312:1: ( 'string' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4312:1: ( 'string' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4313:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__StringType__Group__18946); 
             after(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringType__Group__1


    // $ANTLR start rule__CharArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4330:1: rule__CharArrayType__Group__0 : ( () ) rule__CharArrayType__Group__1 ;
    public final void rule__CharArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4334:1: ( ( () ) rule__CharArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4335:1: ( () ) rule__CharArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4335:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4336:1: ()
            {
             before(grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4337:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4339:1: 
            {
            }

             after(grammarAccess.getCharArrayTypeAccess().getCharArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__CharArrayType__Group__1_in_rule__CharArrayType__Group__08995);
            rule__CharArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CharArrayType__Group__0


    // $ANTLR start rule__CharArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4350:1: rule__CharArrayType__Group__1 : ( 'DevVarCharArray' ) ;
    public final void rule__CharArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4354:1: ( ( 'DevVarCharArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4355:1: ( 'DevVarCharArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4355:1: ( 'DevVarCharArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4356:1: 'DevVarCharArray'
            {
             before(grammarAccess.getCharArrayTypeAccess().getDevVarCharArrayKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__CharArrayType__Group__19024); 
             after(grammarAccess.getCharArrayTypeAccess().getDevVarCharArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CharArrayType__Group__1


    // $ANTLR start rule__ShortArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4373:1: rule__ShortArrayType__Group__0 : ( () ) rule__ShortArrayType__Group__1 ;
    public final void rule__ShortArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4377:1: ( ( () ) rule__ShortArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4378:1: ( () ) rule__ShortArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4378:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4379:1: ()
            {
             before(grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4380:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4382:1: 
            {
            }

             after(grammarAccess.getShortArrayTypeAccess().getShortArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortArrayType__Group__1_in_rule__ShortArrayType__Group__09073);
            rule__ShortArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ShortArrayType__Group__0


    // $ANTLR start rule__ShortArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4393:1: rule__ShortArrayType__Group__1 : ( 'DevVarShortArray' ) ;
    public final void rule__ShortArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4397:1: ( ( 'DevVarShortArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4398:1: ( 'DevVarShortArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4398:1: ( 'DevVarShortArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4399:1: 'DevVarShortArray'
            {
             before(grammarAccess.getShortArrayTypeAccess().getDevVarShortArrayKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__ShortArrayType__Group__19102); 
             after(grammarAccess.getShortArrayTypeAccess().getDevVarShortArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ShortArrayType__Group__1


    // $ANTLR start rule__UShortArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4416:1: rule__UShortArrayType__Group__0 : ( () ) rule__UShortArrayType__Group__1 ;
    public final void rule__UShortArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4420:1: ( ( () ) rule__UShortArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4421:1: ( () ) rule__UShortArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4421:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4422:1: ()
            {
             before(grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4423:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4425:1: 
            {
            }

             after(grammarAccess.getUShortArrayTypeAccess().getUShortArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UShortArrayType__Group__1_in_rule__UShortArrayType__Group__09151);
            rule__UShortArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UShortArrayType__Group__0


    // $ANTLR start rule__UShortArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4436:1: rule__UShortArrayType__Group__1 : ( 'DevVarUShortArray' ) ;
    public final void rule__UShortArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4440:1: ( ( 'DevVarUShortArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4441:1: ( 'DevVarUShortArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4441:1: ( 'DevVarUShortArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4442:1: 'DevVarUShortArray'
            {
             before(grammarAccess.getUShortArrayTypeAccess().getDevVarUShortArrayKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__UShortArrayType__Group__19180); 
             after(grammarAccess.getUShortArrayTypeAccess().getDevVarUShortArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UShortArrayType__Group__1


    // $ANTLR start rule__IntArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4459:1: rule__IntArrayType__Group__0 : ( () ) rule__IntArrayType__Group__1 ;
    public final void rule__IntArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4463:1: ( ( () ) rule__IntArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4464:1: ( () ) rule__IntArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4464:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4465:1: ()
            {
             before(grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4466:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4468:1: 
            {
            }

             after(grammarAccess.getIntArrayTypeAccess().getIntArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntArrayType__Group__1_in_rule__IntArrayType__Group__09229);
            rule__IntArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntArrayType__Group__0


    // $ANTLR start rule__IntArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4479:1: rule__IntArrayType__Group__1 : ( 'DevVarLongArray' ) ;
    public final void rule__IntArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4483:1: ( ( 'DevVarLongArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4484:1: ( 'DevVarLongArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4484:1: ( 'DevVarLongArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4485:1: 'DevVarLongArray'
            {
             before(grammarAccess.getIntArrayTypeAccess().getDevVarLongArrayKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__IntArrayType__Group__19258); 
             after(grammarAccess.getIntArrayTypeAccess().getDevVarLongArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntArrayType__Group__1


    // $ANTLR start rule__UIntArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4502:1: rule__UIntArrayType__Group__0 : ( () ) rule__UIntArrayType__Group__1 ;
    public final void rule__UIntArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4506:1: ( ( () ) rule__UIntArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4507:1: ( () ) rule__UIntArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4507:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4508:1: ()
            {
             before(grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4509:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4511:1: 
            {
            }

             after(grammarAccess.getUIntArrayTypeAccess().getUIntArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UIntArrayType__Group__1_in_rule__UIntArrayType__Group__09307);
            rule__UIntArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UIntArrayType__Group__0


    // $ANTLR start rule__UIntArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4522:1: rule__UIntArrayType__Group__1 : ( 'DevVarULongArray' ) ;
    public final void rule__UIntArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4526:1: ( ( 'DevVarULongArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4527:1: ( 'DevVarULongArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4527:1: ( 'DevVarULongArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4528:1: 'DevVarULongArray'
            {
             before(grammarAccess.getUIntArrayTypeAccess().getDevVarULongArrayKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__UIntArrayType__Group__19336); 
             after(grammarAccess.getUIntArrayTypeAccess().getDevVarULongArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UIntArrayType__Group__1


    // $ANTLR start rule__FloatArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4545:1: rule__FloatArrayType__Group__0 : ( () ) rule__FloatArrayType__Group__1 ;
    public final void rule__FloatArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4549:1: ( ( () ) rule__FloatArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4550:1: ( () ) rule__FloatArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4550:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4551:1: ()
            {
             before(grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4552:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4554:1: 
            {
            }

             after(grammarAccess.getFloatArrayTypeAccess().getFloatArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatArrayType__Group__1_in_rule__FloatArrayType__Group__09385);
            rule__FloatArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatArrayType__Group__0


    // $ANTLR start rule__FloatArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4565:1: rule__FloatArrayType__Group__1 : ( 'DevVarFloatArray' ) ;
    public final void rule__FloatArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4569:1: ( ( 'DevVarFloatArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4570:1: ( 'DevVarFloatArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4570:1: ( 'DevVarFloatArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4571:1: 'DevVarFloatArray'
            {
             before(grammarAccess.getFloatArrayTypeAccess().getDevVarFloatArrayKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__FloatArrayType__Group__19414); 
             after(grammarAccess.getFloatArrayTypeAccess().getDevVarFloatArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatArrayType__Group__1


    // $ANTLR start rule__DoubleArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4588:1: rule__DoubleArrayType__Group__0 : ( () ) rule__DoubleArrayType__Group__1 ;
    public final void rule__DoubleArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4592:1: ( ( () ) rule__DoubleArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4593:1: ( () ) rule__DoubleArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4593:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4594:1: ()
            {
             before(grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4595:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4597:1: 
            {
            }

             after(grammarAccess.getDoubleArrayTypeAccess().getDoubleArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleArrayType__Group__1_in_rule__DoubleArrayType__Group__09463);
            rule__DoubleArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoubleArrayType__Group__0


    // $ANTLR start rule__DoubleArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4608:1: rule__DoubleArrayType__Group__1 : ( 'DevVarDoubleArray' ) ;
    public final void rule__DoubleArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4612:1: ( ( 'DevVarDoubleArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4613:1: ( 'DevVarDoubleArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4613:1: ( 'DevVarDoubleArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4614:1: 'DevVarDoubleArray'
            {
             before(grammarAccess.getDoubleArrayTypeAccess().getDevVarDoubleArrayKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__DoubleArrayType__Group__19492); 
             after(grammarAccess.getDoubleArrayTypeAccess().getDevVarDoubleArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoubleArrayType__Group__1


    // $ANTLR start rule__StringArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4631:1: rule__StringArrayType__Group__0 : ( () ) rule__StringArrayType__Group__1 ;
    public final void rule__StringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4635:1: ( ( () ) rule__StringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4636:1: ( () ) rule__StringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4636:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4637:1: ()
            {
             before(grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4638:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4640:1: 
            {
            }

             after(grammarAccess.getStringArrayTypeAccess().getStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringArrayType__Group__1_in_rule__StringArrayType__Group__09541);
            rule__StringArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringArrayType__Group__0


    // $ANTLR start rule__StringArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4651:1: rule__StringArrayType__Group__1 : ( 'DevVarStringArray' ) ;
    public final void rule__StringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4655:1: ( ( 'DevVarStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4656:1: ( 'DevVarStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4656:1: ( 'DevVarStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4657:1: 'DevVarStringArray'
            {
             before(grammarAccess.getStringArrayTypeAccess().getDevVarStringArrayKeyword_1()); 
            match(input,55,FOLLOW_55_in_rule__StringArrayType__Group__19570); 
             after(grammarAccess.getStringArrayTypeAccess().getDevVarStringArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringArrayType__Group__1


    // $ANTLR start rule__LongStringArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4674:1: rule__LongStringArrayType__Group__0 : ( () ) rule__LongStringArrayType__Group__1 ;
    public final void rule__LongStringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4678:1: ( ( () ) rule__LongStringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4679:1: ( () ) rule__LongStringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4679:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4680:1: ()
            {
             before(grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4681:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4683:1: 
            {
            }

             after(grammarAccess.getLongStringArrayTypeAccess().getLongStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongStringArrayType__Group__1_in_rule__LongStringArrayType__Group__09619);
            rule__LongStringArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LongStringArrayType__Group__0


    // $ANTLR start rule__LongStringArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4694:1: rule__LongStringArrayType__Group__1 : ( 'DevVarLongStringArray' ) ;
    public final void rule__LongStringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4698:1: ( ( 'DevVarLongStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4699:1: ( 'DevVarLongStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4699:1: ( 'DevVarLongStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4700:1: 'DevVarLongStringArray'
            {
             before(grammarAccess.getLongStringArrayTypeAccess().getDevVarLongStringArrayKeyword_1()); 
            match(input,56,FOLLOW_56_in_rule__LongStringArrayType__Group__19648); 
             after(grammarAccess.getLongStringArrayTypeAccess().getDevVarLongStringArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LongStringArrayType__Group__1


    // $ANTLR start rule__DoubleStringArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4717:1: rule__DoubleStringArrayType__Group__0 : ( () ) rule__DoubleStringArrayType__Group__1 ;
    public final void rule__DoubleStringArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4721:1: ( ( () ) rule__DoubleStringArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4722:1: ( () ) rule__DoubleStringArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4722:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4723:1: ()
            {
             before(grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4724:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4726:1: 
            {
            }

             after(grammarAccess.getDoubleStringArrayTypeAccess().getDoubleStringArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleStringArrayType__Group__1_in_rule__DoubleStringArrayType__Group__09697);
            rule__DoubleStringArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoubleStringArrayType__Group__0


    // $ANTLR start rule__DoubleStringArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4737:1: rule__DoubleStringArrayType__Group__1 : ( 'DevVarDoubleStringArray' ) ;
    public final void rule__DoubleStringArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4741:1: ( ( 'DevVarDoubleStringArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4742:1: ( 'DevVarDoubleStringArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4742:1: ( 'DevVarDoubleStringArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4743:1: 'DevVarDoubleStringArray'
            {
             before(grammarAccess.getDoubleStringArrayTypeAccess().getDevVarDoubleStringArrayKeyword_1()); 
            match(input,57,FOLLOW_57_in_rule__DoubleStringArrayType__Group__19726); 
             after(grammarAccess.getDoubleStringArrayTypeAccess().getDevVarDoubleStringArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoubleStringArrayType__Group__1


    // $ANTLR start rule__StateType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4760:1: rule__StateType__Group__0 : ( () ) rule__StateType__Group__1 ;
    public final void rule__StateType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4764:1: ( ( () ) rule__StateType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4765:1: ( () ) rule__StateType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4765:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4766:1: ()
            {
             before(grammarAccess.getStateTypeAccess().getStateTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4767:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4769:1: 
            {
            }

             after(grammarAccess.getStateTypeAccess().getStateTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StateType__Group__1_in_rule__StateType__Group__09775);
            rule__StateType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateType__Group__0


    // $ANTLR start rule__StateType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4780:1: rule__StateType__Group__1 : ( 'DevState' ) ;
    public final void rule__StateType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4784:1: ( ( 'DevState' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4785:1: ( 'DevState' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4785:1: ( 'DevState' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4786:1: 'DevState'
            {
             before(grammarAccess.getStateTypeAccess().getDevStateKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__StateType__Group__19804); 
             after(grammarAccess.getStateTypeAccess().getDevStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StateType__Group__1


    // $ANTLR start rule__ConstStringType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4803:1: rule__ConstStringType__Group__0 : ( () ) rule__ConstStringType__Group__1 ;
    public final void rule__ConstStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4807:1: ( ( () ) rule__ConstStringType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4808:1: ( () ) rule__ConstStringType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4808:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4809:1: ()
            {
             before(grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4810:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4812:1: 
            {
            }

             after(grammarAccess.getConstStringTypeAccess().getConstStringTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ConstStringType__Group__1_in_rule__ConstStringType__Group__09853);
            rule__ConstStringType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConstStringType__Group__0


    // $ANTLR start rule__ConstStringType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4823:1: rule__ConstStringType__Group__1 : ( 'ConstDevString' ) ;
    public final void rule__ConstStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4827:1: ( ( 'ConstDevString' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4828:1: ( 'ConstDevString' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4828:1: ( 'ConstDevString' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4829:1: 'ConstDevString'
            {
             before(grammarAccess.getConstStringTypeAccess().getConstDevStringKeyword_1()); 
            match(input,59,FOLLOW_59_in_rule__ConstStringType__Group__19882); 
             after(grammarAccess.getConstStringTypeAccess().getConstDevStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConstStringType__Group__1


    // $ANTLR start rule__BooleanArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4846:1: rule__BooleanArrayType__Group__0 : ( () ) rule__BooleanArrayType__Group__1 ;
    public final void rule__BooleanArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4850:1: ( ( () ) rule__BooleanArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4851:1: ( () ) rule__BooleanArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4851:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4852:1: ()
            {
             before(grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4853:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4855:1: 
            {
            }

             after(grammarAccess.getBooleanArrayTypeAccess().getBooleanArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__BooleanArrayType__Group__1_in_rule__BooleanArrayType__Group__09931);
            rule__BooleanArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BooleanArrayType__Group__0


    // $ANTLR start rule__BooleanArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4866:1: rule__BooleanArrayType__Group__1 : ( 'DevVarBooleanArray' ) ;
    public final void rule__BooleanArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4870:1: ( ( 'DevVarBooleanArray' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4871:1: ( 'DevVarBooleanArray' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4871:1: ( 'DevVarBooleanArray' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4872:1: 'DevVarBooleanArray'
            {
             before(grammarAccess.getBooleanArrayTypeAccess().getDevVarBooleanArrayKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__BooleanArrayType__Group__19960); 
             after(grammarAccess.getBooleanArrayTypeAccess().getDevVarBooleanArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BooleanArrayType__Group__1


    // $ANTLR start rule__UCharType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4889:1: rule__UCharType__Group__0 : ( () ) rule__UCharType__Group__1 ;
    public final void rule__UCharType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4893:1: ( ( () ) rule__UCharType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4894:1: ( () ) rule__UCharType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4894:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4895:1: ()
            {
             before(grammarAccess.getUCharTypeAccess().getUCharTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4896:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4898:1: 
            {
            }

             after(grammarAccess.getUCharTypeAccess().getUCharTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__UCharType__Group__1_in_rule__UCharType__Group__010009);
            rule__UCharType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UCharType__Group__0


    // $ANTLR start rule__UCharType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4909:1: rule__UCharType__Group__1 : ( 'DevUChar' ) ;
    public final void rule__UCharType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4913:1: ( ( 'DevUChar' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4914:1: ( 'DevUChar' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4914:1: ( 'DevUChar' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4915:1: 'DevUChar'
            {
             before(grammarAccess.getUCharTypeAccess().getDevUCharKeyword_1()); 
            match(input,61,FOLLOW_61_in_rule__UCharType__Group__110038); 
             after(grammarAccess.getUCharTypeAccess().getDevUCharKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UCharType__Group__1


    // $ANTLR start rule__LongType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4932:1: rule__LongType__Group__0 : ( () ) rule__LongType__Group__1 ;
    public final void rule__LongType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4936:1: ( ( () ) rule__LongType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4937:1: ( () ) rule__LongType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4937:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4938:1: ()
            {
             before(grammarAccess.getLongTypeAccess().getLongTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4939:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4941:1: 
            {
            }

             after(grammarAccess.getLongTypeAccess().getLongTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongType__Group__1_in_rule__LongType__Group__010087);
            rule__LongType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LongType__Group__0


    // $ANTLR start rule__LongType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4952:1: rule__LongType__Group__1 : ( 'DevLong64' ) ;
    public final void rule__LongType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4956:1: ( ( 'DevLong64' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4957:1: ( 'DevLong64' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4957:1: ( 'DevLong64' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4958:1: 'DevLong64'
            {
             before(grammarAccess.getLongTypeAccess().getDevLong64Keyword_1()); 
            match(input,62,FOLLOW_62_in_rule__LongType__Group__110116); 
             after(grammarAccess.getLongTypeAccess().getDevLong64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LongType__Group__1


    // $ANTLR start rule__ULongType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4975:1: rule__ULongType__Group__0 : ( () ) rule__ULongType__Group__1 ;
    public final void rule__ULongType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4979:1: ( ( () ) rule__ULongType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4980:1: ( () ) rule__ULongType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4980:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4981:1: ()
            {
             before(grammarAccess.getULongTypeAccess().getULongTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4982:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4984:1: 
            {
            }

             after(grammarAccess.getULongTypeAccess().getULongTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ULongType__Group__1_in_rule__ULongType__Group__010165);
            rule__ULongType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ULongType__Group__0


    // $ANTLR start rule__ULongType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4995:1: rule__ULongType__Group__1 : ( 'DevULong64' ) ;
    public final void rule__ULongType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:4999:1: ( ( 'DevULong64' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5000:1: ( 'DevULong64' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5000:1: ( 'DevULong64' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5001:1: 'DevULong64'
            {
             before(grammarAccess.getULongTypeAccess().getDevULong64Keyword_1()); 
            match(input,63,FOLLOW_63_in_rule__ULongType__Group__110194); 
             after(grammarAccess.getULongTypeAccess().getDevULong64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ULongType__Group__1


    // $ANTLR start rule__LongArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5018:1: rule__LongArrayType__Group__0 : ( () ) rule__LongArrayType__Group__1 ;
    public final void rule__LongArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5022:1: ( ( () ) rule__LongArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5023:1: ( () ) rule__LongArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5023:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5024:1: ()
            {
             before(grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5025:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5027:1: 
            {
            }

             after(grammarAccess.getLongArrayTypeAccess().getLongArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__LongArrayType__Group__1_in_rule__LongArrayType__Group__010243);
            rule__LongArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LongArrayType__Group__0


    // $ANTLR start rule__LongArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5038:1: rule__LongArrayType__Group__1 : ( 'DevVarLong64Array' ) ;
    public final void rule__LongArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5042:1: ( ( 'DevVarLong64Array' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5043:1: ( 'DevVarLong64Array' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5043:1: ( 'DevVarLong64Array' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5044:1: 'DevVarLong64Array'
            {
             before(grammarAccess.getLongArrayTypeAccess().getDevVarLong64ArrayKeyword_1()); 
            match(input,64,FOLLOW_64_in_rule__LongArrayType__Group__110272); 
             after(grammarAccess.getLongArrayTypeAccess().getDevVarLong64ArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LongArrayType__Group__1


    // $ANTLR start rule__ULongArrayType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5061:1: rule__ULongArrayType__Group__0 : ( () ) rule__ULongArrayType__Group__1 ;
    public final void rule__ULongArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5065:1: ( ( () ) rule__ULongArrayType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5066:1: ( () ) rule__ULongArrayType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5066:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5067:1: ()
            {
             before(grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5068:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5070:1: 
            {
            }

             after(grammarAccess.getULongArrayTypeAccess().getULongArrayTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ULongArrayType__Group__1_in_rule__ULongArrayType__Group__010321);
            rule__ULongArrayType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ULongArrayType__Group__0


    // $ANTLR start rule__ULongArrayType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5081:1: rule__ULongArrayType__Group__1 : ( 'DevVarULong64Array' ) ;
    public final void rule__ULongArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5085:1: ( ( 'DevVarULong64Array' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5086:1: ( 'DevVarULong64Array' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5086:1: ( 'DevVarULong64Array' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5087:1: 'DevVarULong64Array'
            {
             before(grammarAccess.getULongArrayTypeAccess().getDevVarULong64ArrayKeyword_1()); 
            match(input,65,FOLLOW_65_in_rule__ULongArrayType__Group__110350); 
             after(grammarAccess.getULongArrayTypeAccess().getDevVarULong64ArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ULongArrayType__Group__1


    // $ANTLR start rule__DevIntType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5104:1: rule__DevIntType__Group__0 : ( () ) rule__DevIntType__Group__1 ;
    public final void rule__DevIntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5108:1: ( ( () ) rule__DevIntType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5109:1: ( () ) rule__DevIntType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5109:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5110:1: ()
            {
             before(grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5111:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5113:1: 
            {
            }

             after(grammarAccess.getDevIntTypeAccess().getDevIntTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DevIntType__Group__1_in_rule__DevIntType__Group__010399);
            rule__DevIntType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DevIntType__Group__0


    // $ANTLR start rule__DevIntType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5124:1: rule__DevIntType__Group__1 : ( 'DevInt' ) ;
    public final void rule__DevIntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5128:1: ( ( 'DevInt' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5129:1: ( 'DevInt' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5129:1: ( 'DevInt' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5130:1: 'DevInt'
            {
             before(grammarAccess.getDevIntTypeAccess().getDevIntKeyword_1()); 
            match(input,66,FOLLOW_66_in_rule__DevIntType__Group__110428); 
             after(grammarAccess.getDevIntTypeAccess().getDevIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DevIntType__Group__1


    // $ANTLR start rule__EncodedType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5147:1: rule__EncodedType__Group__0 : ( () ) rule__EncodedType__Group__1 ;
    public final void rule__EncodedType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5151:1: ( ( () ) rule__EncodedType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5152:1: ( () ) rule__EncodedType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5152:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5153:1: ()
            {
             before(grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5154:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5156:1: 
            {
            }

             after(grammarAccess.getEncodedTypeAccess().getEncodedTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__EncodedType__Group__1_in_rule__EncodedType__Group__010477);
            rule__EncodedType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EncodedType__Group__0


    // $ANTLR start rule__EncodedType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5167:1: rule__EncodedType__Group__1 : ( 'DevEncoded' ) ;
    public final void rule__EncodedType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5171:1: ( ( 'DevEncoded' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5172:1: ( 'DevEncoded' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5172:1: ( 'DevEncoded' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5173:1: 'DevEncoded'
            {
             before(grammarAccess.getEncodedTypeAccess().getDevEncodedKeyword_1()); 
            match(input,67,FOLLOW_67_in_rule__EncodedType__Group__110506); 
             after(grammarAccess.getEncodedTypeAccess().getDevEncodedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EncodedType__Group__1


    // $ANTLR start rule__ShortVectorType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5190:1: rule__ShortVectorType__Group__0 : ( () ) rule__ShortVectorType__Group__1 ;
    public final void rule__ShortVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5194:1: ( ( () ) rule__ShortVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5195:1: ( () ) rule__ShortVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5195:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5196:1: ()
            {
             before(grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5197:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5199:1: 
            {
            }

             after(grammarAccess.getShortVectorTypeAccess().getShortVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__ShortVectorType__Group__1_in_rule__ShortVectorType__Group__010555);
            rule__ShortVectorType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ShortVectorType__Group__0


    // $ANTLR start rule__ShortVectorType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5210:1: rule__ShortVectorType__Group__1 : ( 'vector<short>' ) ;
    public final void rule__ShortVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5214:1: ( ( 'vector<short>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5215:1: ( 'vector<short>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5215:1: ( 'vector<short>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5216:1: 'vector<short>'
            {
             before(grammarAccess.getShortVectorTypeAccess().getVectorShortKeyword_1()); 
            match(input,68,FOLLOW_68_in_rule__ShortVectorType__Group__110584); 
             after(grammarAccess.getShortVectorTypeAccess().getVectorShortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ShortVectorType__Group__1


    // $ANTLR start rule__IntVectorType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5233:1: rule__IntVectorType__Group__0 : ( () ) rule__IntVectorType__Group__1 ;
    public final void rule__IntVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5237:1: ( ( () ) rule__IntVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5238:1: ( () ) rule__IntVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5238:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5239:1: ()
            {
             before(grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5240:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5242:1: 
            {
            }

             after(grammarAccess.getIntVectorTypeAccess().getIntVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__IntVectorType__Group__1_in_rule__IntVectorType__Group__010633);
            rule__IntVectorType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntVectorType__Group__0


    // $ANTLR start rule__IntVectorType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5253:1: rule__IntVectorType__Group__1 : ( 'vector<int>' ) ;
    public final void rule__IntVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5257:1: ( ( 'vector<int>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5258:1: ( 'vector<int>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5258:1: ( 'vector<int>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5259:1: 'vector<int>'
            {
             before(grammarAccess.getIntVectorTypeAccess().getVectorIntKeyword_1()); 
            match(input,69,FOLLOW_69_in_rule__IntVectorType__Group__110662); 
             after(grammarAccess.getIntVectorTypeAccess().getVectorIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntVectorType__Group__1


    // $ANTLR start rule__FloatVectorType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5276:1: rule__FloatVectorType__Group__0 : ( () ) rule__FloatVectorType__Group__1 ;
    public final void rule__FloatVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5280:1: ( ( () ) rule__FloatVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5281:1: ( () ) rule__FloatVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5281:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5282:1: ()
            {
             before(grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5283:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5285:1: 
            {
            }

             after(grammarAccess.getFloatVectorTypeAccess().getFloatVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__FloatVectorType__Group__1_in_rule__FloatVectorType__Group__010711);
            rule__FloatVectorType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatVectorType__Group__0


    // $ANTLR start rule__FloatVectorType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5296:1: rule__FloatVectorType__Group__1 : ( 'vector<float>' ) ;
    public final void rule__FloatVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5300:1: ( ( 'vector<float>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5301:1: ( 'vector<float>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5301:1: ( 'vector<float>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5302:1: 'vector<float>'
            {
             before(grammarAccess.getFloatVectorTypeAccess().getVectorFloatKeyword_1()); 
            match(input,70,FOLLOW_70_in_rule__FloatVectorType__Group__110740); 
             after(grammarAccess.getFloatVectorTypeAccess().getVectorFloatKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatVectorType__Group__1


    // $ANTLR start rule__DoubleVectorType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5319:1: rule__DoubleVectorType__Group__0 : ( () ) rule__DoubleVectorType__Group__1 ;
    public final void rule__DoubleVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5323:1: ( ( () ) rule__DoubleVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5324:1: ( () ) rule__DoubleVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5324:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5325:1: ()
            {
             before(grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5326:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5328:1: 
            {
            }

             after(grammarAccess.getDoubleVectorTypeAccess().getDoubleVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__DoubleVectorType__Group__1_in_rule__DoubleVectorType__Group__010789);
            rule__DoubleVectorType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoubleVectorType__Group__0


    // $ANTLR start rule__DoubleVectorType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5339:1: rule__DoubleVectorType__Group__1 : ( 'vector<double>' ) ;
    public final void rule__DoubleVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5343:1: ( ( 'vector<double>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5344:1: ( 'vector<double>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5344:1: ( 'vector<double>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5345:1: 'vector<double>'
            {
             before(grammarAccess.getDoubleVectorTypeAccess().getVectorDoubleKeyword_1()); 
            match(input,71,FOLLOW_71_in_rule__DoubleVectorType__Group__110818); 
             after(grammarAccess.getDoubleVectorTypeAccess().getVectorDoubleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DoubleVectorType__Group__1


    // $ANTLR start rule__StringVectorType__Group__0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5362:1: rule__StringVectorType__Group__0 : ( () ) rule__StringVectorType__Group__1 ;
    public final void rule__StringVectorType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5366:1: ( ( () ) rule__StringVectorType__Group__1 )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5367:1: ( () ) rule__StringVectorType__Group__1
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5367:1: ( () )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5368:1: ()
            {
             before(grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5369:1: ()
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5371:1: 
            {
            }

             after(grammarAccess.getStringVectorTypeAccess().getStringVectorTypeAction_0()); 

            }

            pushFollow(FOLLOW_rule__StringVectorType__Group__1_in_rule__StringVectorType__Group__010867);
            rule__StringVectorType__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringVectorType__Group__0


    // $ANTLR start rule__StringVectorType__Group__1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5382:1: rule__StringVectorType__Group__1 : ( 'vector<string>' ) ;
    public final void rule__StringVectorType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5386:1: ( ( 'vector<string>' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5387:1: ( 'vector<string>' )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5387:1: ( 'vector<string>' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5388:1: 'vector<string>'
            {
             before(grammarAccess.getStringVectorTypeAccess().getVectorStringKeyword_1()); 
            match(input,72,FOLLOW_72_in_rule__StringVectorType__Group__110896); 
             after(grammarAccess.getStringVectorTypeAccess().getVectorStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringVectorType__Group__1


    // $ANTLR start rule__PogoSystem__ImportsAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5405:1: rule__PogoSystem__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__PogoSystem__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5409:1: ( ( ruleImport ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5410:1: ( ruleImport )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5410:1: ( ruleImport )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5411:1: ruleImport
            {
             before(grammarAccess.getPogoSystemAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__PogoSystem__ImportsAssignment_010935);
            ruleImport();
            _fsp--;

             after(grammarAccess.getPogoSystemAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoSystem__ImportsAssignment_0


    // $ANTLR start rule__PogoSystem__ClassesAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5420:1: rule__PogoSystem__ClassesAssignment_1 : ( rulePogoDeviceClass ) ;
    public final void rule__PogoSystem__ClassesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5424:1: ( ( rulePogoDeviceClass ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5425:1: ( rulePogoDeviceClass )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5425:1: ( rulePogoDeviceClass )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5426:1: rulePogoDeviceClass
            {
             before(grammarAccess.getPogoSystemAccess().getClassesPogoDeviceClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePogoDeviceClass_in_rule__PogoSystem__ClassesAssignment_110966);
            rulePogoDeviceClass();
            _fsp--;

             after(grammarAccess.getPogoSystemAccess().getClassesPogoDeviceClassParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoSystem__ClassesAssignment_1


    // $ANTLR start rule__Import__ImportURIAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5435:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5439:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5440:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5440:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5441:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_110997); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__ImportURIAssignment_1


    // $ANTLR start rule__PogoDeviceClass__NameAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5450:1: rule__PogoDeviceClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PogoDeviceClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5454:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5455:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5455:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5456:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__NameAssignment_111028); 
             after(grammarAccess.getPogoDeviceClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__NameAssignment_1


    // $ANTLR start rule__PogoDeviceClass__IsAbstractAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5465:1: rule__PogoDeviceClass__IsAbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__PogoDeviceClass__IsAbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5469:1: ( ( ( 'abstract' ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5470:1: ( ( 'abstract' ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5470:1: ( ( 'abstract' ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5471:1: ( 'abstract' )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5472:1: ( 'abstract' )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5473:1: 'abstract'
            {
             before(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0()); 
            match(input,73,FOLLOW_73_in_rule__PogoDeviceClass__IsAbstractAssignment_211064); 
             after(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0()); 

            }

             after(grammarAccess.getPogoDeviceClassAccess().getIsAbstractAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__IsAbstractAssignment_2


    // $ANTLR start rule__PogoDeviceClass__BaseClassAssignment_3_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5488:1: rule__PogoDeviceClass__BaseClassAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PogoDeviceClass__BaseClassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5492:1: ( ( ( RULE_ID ) ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5493:1: ( ( RULE_ID ) )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5493:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5494:1: ( RULE_ID )
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassCrossReference_3_1_0()); 
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5495:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5496:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__BaseClassAssignment_3_111107); 
             after(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPogoDeviceClassAccess().getBaseClassPogoDeviceClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__BaseClassAssignment_3_1


    // $ANTLR start rule__PogoDeviceClass__InstituteAssignment_5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5507:1: rule__PogoDeviceClass__InstituteAssignment_5 : ( RULE_ID ) ;
    public final void rule__PogoDeviceClass__InstituteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5511:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5512:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5512:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5513:1: RULE_ID
            {
             before(grammarAccess.getPogoDeviceClassAccess().getInstituteIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PogoDeviceClass__InstituteAssignment_511142); 
             after(grammarAccess.getPogoDeviceClassAccess().getInstituteIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__InstituteAssignment_5


    // $ANTLR start rule__PogoDeviceClass__DescriptionAssignment_7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5522:1: rule__PogoDeviceClass__DescriptionAssignment_7 : ( ruleClassDescription ) ;
    public final void rule__PogoDeviceClass__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5526:1: ( ( ruleClassDescription ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5527:1: ( ruleClassDescription )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5527:1: ( ruleClassDescription )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5528:1: ruleClassDescription
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDescriptionClassDescriptionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleClassDescription_in_rule__PogoDeviceClass__DescriptionAssignment_711173);
            ruleClassDescription();
            _fsp--;

             after(grammarAccess.getPogoDeviceClassAccess().getDescriptionClassDescriptionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__DescriptionAssignment_7


    // $ANTLR start rule__PogoDeviceClass__ClassPropertiesAssignment_9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5537:1: rule__PogoDeviceClass__ClassPropertiesAssignment_9 : ( ruleProperty ) ;
    public final void rule__PogoDeviceClass__ClassPropertiesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5541:1: ( ( ruleProperty ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5542:1: ( ruleProperty )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5542:1: ( ruleProperty )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5543:1: ruleProperty
            {
             before(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesPropertyParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__PogoDeviceClass__ClassPropertiesAssignment_911204);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPogoDeviceClassAccess().getClassPropertiesPropertyParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__ClassPropertiesAssignment_9


    // $ANTLR start rule__PogoDeviceClass__DevicePropertiesAssignment_11
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5552:1: rule__PogoDeviceClass__DevicePropertiesAssignment_11 : ( ruleProperty ) ;
    public final void rule__PogoDeviceClass__DevicePropertiesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5556:1: ( ( ruleProperty ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5557:1: ( ruleProperty )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5557:1: ( ruleProperty )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5558:1: ruleProperty
            {
             before(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesPropertyParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__PogoDeviceClass__DevicePropertiesAssignment_1111235);
            ruleProperty();
            _fsp--;

             after(grammarAccess.getPogoDeviceClassAccess().getDevicePropertiesPropertyParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__DevicePropertiesAssignment_11


    // $ANTLR start rule__PogoDeviceClass__CommandsAssignment_13
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5567:1: rule__PogoDeviceClass__CommandsAssignment_13 : ( ruleCommand ) ;
    public final void rule__PogoDeviceClass__CommandsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5571:1: ( ( ruleCommand ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5572:1: ( ruleCommand )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5572:1: ( ruleCommand )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5573:1: ruleCommand
            {
             before(grammarAccess.getPogoDeviceClassAccess().getCommandsCommandParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleCommand_in_rule__PogoDeviceClass__CommandsAssignment_1311266);
            ruleCommand();
            _fsp--;

             after(grammarAccess.getPogoDeviceClassAccess().getCommandsCommandParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__CommandsAssignment_13


    // $ANTLR start rule__PogoDeviceClass__AttributesAssignment_15
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5582:1: rule__PogoDeviceClass__AttributesAssignment_15 : ( ruleAttribute ) ;
    public final void rule__PogoDeviceClass__AttributesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5586:1: ( ( ruleAttribute ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5587:1: ( ruleAttribute )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5587:1: ( ruleAttribute )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5588:1: ruleAttribute
            {
             before(grammarAccess.getPogoDeviceClassAccess().getAttributesAttributeParserRuleCall_15_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__PogoDeviceClass__AttributesAssignment_1511297);
            ruleAttribute();
            _fsp--;

             after(grammarAccess.getPogoDeviceClassAccess().getAttributesAttributeParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__AttributesAssignment_15


    // $ANTLR start rule__PogoDeviceClass__StatesAssignment_17
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5597:1: rule__PogoDeviceClass__StatesAssignment_17 : ( ruleState ) ;
    public final void rule__PogoDeviceClass__StatesAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5601:1: ( ( ruleState ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5602:1: ( ruleState )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5602:1: ( ruleState )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5603:1: ruleState
            {
             before(grammarAccess.getPogoDeviceClassAccess().getStatesStateParserRuleCall_17_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__PogoDeviceClass__StatesAssignment_1711328);
            ruleState();
            _fsp--;

             after(grammarAccess.getPogoDeviceClassAccess().getStatesStateParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PogoDeviceClass__StatesAssignment_17


    // $ANTLR start rule__ClassDescription__DescriptionAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5612:1: rule__ClassDescription__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5616:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5617:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5617:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5618:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__DescriptionAssignment_011359); 
             after(grammarAccess.getClassDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__DescriptionAssignment_0


    // $ANTLR start rule__ClassDescription__TitleAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5627:1: rule__ClassDescription__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5631:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5632:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5632:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5633:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__TitleAssignment_111390); 
             after(grammarAccess.getClassDescriptionAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__TitleAssignment_1


    // $ANTLR start rule__ClassDescription__SourcePathAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5642:1: rule__ClassDescription__SourcePathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__SourcePathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5646:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5647:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5647:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5648:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getSourcePathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__SourcePathAssignment_211421); 
             after(grammarAccess.getClassDescriptionAccess().getSourcePathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__SourcePathAssignment_2


    // $ANTLR start rule__ClassDescription__InheritancesAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5657:1: rule__ClassDescription__InheritancesAssignment_4 : ( ruleInheritance ) ;
    public final void rule__ClassDescription__InheritancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5661:1: ( ( ruleInheritance ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5662:1: ( ruleInheritance )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5662:1: ( ruleInheritance )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5663:1: ruleInheritance
            {
             before(grammarAccess.getClassDescriptionAccess().getInheritancesInheritanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInheritance_in_rule__ClassDescription__InheritancesAssignment_411452);
            ruleInheritance();
            _fsp--;

             after(grammarAccess.getClassDescriptionAccess().getInheritancesInheritanceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__InheritancesAssignment_4


    // $ANTLR start rule__ClassDescription__LanguageAssignment_5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5672:1: rule__ClassDescription__LanguageAssignment_5 : ( ruleLanguage ) ;
    public final void rule__ClassDescription__LanguageAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5676:1: ( ( ruleLanguage ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5677:1: ( ruleLanguage )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5677:1: ( ruleLanguage )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5678:1: ruleLanguage
            {
             before(grammarAccess.getClassDescriptionAccess().getLanguageLanguageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleLanguage_in_rule__ClassDescription__LanguageAssignment_511483);
            ruleLanguage();
            _fsp--;

             after(grammarAccess.getClassDescriptionAccess().getLanguageLanguageParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__LanguageAssignment_5


    // $ANTLR start rule__ClassDescription__FilestogenerateAssignment_6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5687:1: rule__ClassDescription__FilestogenerateAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ClassDescription__FilestogenerateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5691:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5692:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5692:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5693:1: RULE_STRING
            {
             before(grammarAccess.getClassDescriptionAccess().getFilestogenerateSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassDescription__FilestogenerateAssignment_611514); 
             after(grammarAccess.getClassDescriptionAccess().getFilestogenerateSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__FilestogenerateAssignment_6


    // $ANTLR start rule__ClassDescription__IdentificationAssignment_7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5702:1: rule__ClassDescription__IdentificationAssignment_7 : ( ruleClassIdentification ) ;
    public final void rule__ClassDescription__IdentificationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5706:1: ( ( ruleClassIdentification ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5707:1: ( ruleClassIdentification )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5707:1: ( ruleClassIdentification )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5708:1: ruleClassIdentification
            {
             before(grammarAccess.getClassDescriptionAccess().getIdentificationClassIdentificationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleClassIdentification_in_rule__ClassDescription__IdentificationAssignment_711545);
            ruleClassIdentification();
            _fsp--;

             after(grammarAccess.getClassDescriptionAccess().getIdentificationClassIdentificationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__IdentificationAssignment_7


    // $ANTLR start rule__ClassDescription__CommentsAssignment_8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5717:1: rule__ClassDescription__CommentsAssignment_8 : ( ruleComments ) ;
    public final void rule__ClassDescription__CommentsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5721:1: ( ( ruleComments ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5722:1: ( ruleComments )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5722:1: ( ruleComments )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5723:1: ruleComments
            {
             before(grammarAccess.getClassDescriptionAccess().getCommentsCommentsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleComments_in_rule__ClassDescription__CommentsAssignment_811576);
            ruleComments();
            _fsp--;

             after(grammarAccess.getClassDescriptionAccess().getCommentsCommentsParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassDescription__CommentsAssignment_8


    // $ANTLR start rule__Inheritance__ClassnameAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5732:1: rule__Inheritance__ClassnameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Inheritance__ClassnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5736:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5737:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5737:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5738:1: RULE_STRING
            {
             before(grammarAccess.getInheritanceAccess().getClassnameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Inheritance__ClassnameAssignment_011607); 
             after(grammarAccess.getInheritanceAccess().getClassnameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Inheritance__ClassnameAssignment_0


    // $ANTLR start rule__Inheritance__SourcePathAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5747:1: rule__Inheritance__SourcePathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Inheritance__SourcePathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5751:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5752:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5752:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5753:1: RULE_STRING
            {
             before(grammarAccess.getInheritanceAccess().getSourcePathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Inheritance__SourcePathAssignment_111638); 
             after(grammarAccess.getInheritanceAccess().getSourcePathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Inheritance__SourcePathAssignment_1


    // $ANTLR start rule__ClassIdentification__ContactAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5762:1: rule__ClassIdentification__ContactAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ContactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5766:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5767:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5767:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5768:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getContactSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ContactAssignment_011669); 
             after(grammarAccess.getClassIdentificationAccess().getContactSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__ContactAssignment_0


    // $ANTLR start rule__ClassIdentification__ClassFamilyAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5777:1: rule__ClassIdentification__ClassFamilyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ClassFamilyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5781:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5782:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5782:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5783:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getClassFamilySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ClassFamilyAssignment_111700); 
             after(grammarAccess.getClassIdentificationAccess().getClassFamilySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__ClassFamilyAssignment_1


    // $ANTLR start rule__ClassIdentification__SiteSpecificAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5792:1: rule__ClassIdentification__SiteSpecificAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__SiteSpecificAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5796:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5797:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5797:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5798:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getSiteSpecificSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__SiteSpecificAssignment_211731); 
             after(grammarAccess.getClassIdentificationAccess().getSiteSpecificSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__SiteSpecificAssignment_2


    // $ANTLR start rule__ClassIdentification__PlatformAssignment_3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5807:1: rule__ClassIdentification__PlatformAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__PlatformAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5811:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5812:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5812:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5813:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getPlatformSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__PlatformAssignment_311762); 
             after(grammarAccess.getClassIdentificationAccess().getPlatformSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__PlatformAssignment_3


    // $ANTLR start rule__ClassIdentification__BusAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5822:1: rule__ClassIdentification__BusAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__BusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5826:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5827:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5827:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5828:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getBusSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__BusAssignment_411793); 
             after(grammarAccess.getClassIdentificationAccess().getBusSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__BusAssignment_4


    // $ANTLR start rule__ClassIdentification__ManufacturerAssignment_5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5837:1: rule__ClassIdentification__ManufacturerAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ManufacturerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5841:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5842:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5842:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5843:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getManufacturerSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ManufacturerAssignment_511824); 
             after(grammarAccess.getClassIdentificationAccess().getManufacturerSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__ManufacturerAssignment_5


    // $ANTLR start rule__ClassIdentification__ReferenceAssignment_6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5852:1: rule__ClassIdentification__ReferenceAssignment_6 : ( RULE_STRING ) ;
    public final void rule__ClassIdentification__ReferenceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5856:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5857:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5857:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5858:1: RULE_STRING
            {
             before(grammarAccess.getClassIdentificationAccess().getReferenceSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClassIdentification__ReferenceAssignment_611855); 
             after(grammarAccess.getClassIdentificationAccess().getReferenceSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ClassIdentification__ReferenceAssignment_6


    // $ANTLR start rule__Comments__CommandsTableAssignment
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5867:1: rule__Comments__CommandsTableAssignment : ( RULE_STRING ) ;
    public final void rule__Comments__CommandsTableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5871:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5872:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5872:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5873:1: RULE_STRING
            {
             before(grammarAccess.getCommentsAccess().getCommandsTableSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Comments__CommandsTableAssignment11886); 
             after(grammarAccess.getCommentsAccess().getCommandsTableSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Comments__CommandsTableAssignment


    // $ANTLR start rule__State__NameAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5882:1: rule__State__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5886:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5887:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5887:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5888:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_011917); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__NameAssignment_0


    // $ANTLR start rule__State__DescriptionAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5897:1: rule__State__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__State__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5901:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5902:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5902:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5903:1: RULE_STRING
            {
             before(grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__DescriptionAssignment_111948); 
             after(grammarAccess.getStateAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__State__DescriptionAssignment_1


    // $ANTLR start rule__Property__NameAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5912:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5916:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5917:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5917:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5918:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_011979); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__NameAssignment_0


    // $ANTLR start rule__Property__TypeAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5927:1: rule__Property__TypeAssignment_1 : ( rulePropType ) ;
    public final void rule__Property__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5931:1: ( ( rulePropType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5932:1: ( rulePropType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5932:1: ( rulePropType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5933:1: rulePropType
            {
             before(grammarAccess.getPropertyAccess().getTypePropTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePropType_in_rule__Property__TypeAssignment_112010);
            rulePropType();
            _fsp--;

             after(grammarAccess.getPropertyAccess().getTypePropTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__TypeAssignment_1


    // $ANTLR start rule__Property__DescriptionAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5942:1: rule__Property__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Property__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5946:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5947:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5947:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5948:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__DescriptionAssignment_212041); 
             after(grammarAccess.getPropertyAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__DescriptionAssignment_2


    // $ANTLR start rule__Property__DefaultPropValueAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5957:1: rule__Property__DefaultPropValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Property__DefaultPropValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5961:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5962:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5962:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5963:1: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getDefaultPropValueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Property__DefaultPropValueAssignment_412072); 
             after(grammarAccess.getPropertyAccess().getDefaultPropValueSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Property__DefaultPropValueAssignment_4


    // $ANTLR start rule__Command__NameAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5972:1: rule__Command__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Command__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5976:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5977:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5977:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5978:1: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__NameAssignment_012103); 
             after(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__NameAssignment_0


    // $ANTLR start rule__Command__ArginAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5987:1: rule__Command__ArginAssignment_1 : ( ruleArgument ) ;
    public final void rule__Command__ArginAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5991:1: ( ( ruleArgument ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5992:1: ( ruleArgument )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5992:1: ( ruleArgument )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:5993:1: ruleArgument
            {
             before(grammarAccess.getCommandAccess().getArginArgumentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Command__ArginAssignment_112134);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getCommandAccess().getArginArgumentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__ArginAssignment_1


    // $ANTLR start rule__Command__ArgoutAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6002:1: rule__Command__ArgoutAssignment_2 : ( ruleArgument ) ;
    public final void rule__Command__ArgoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6006:1: ( ( ruleArgument ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6007:1: ( ruleArgument )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6007:1: ( ruleArgument )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6008:1: ruleArgument
            {
             before(grammarAccess.getCommandAccess().getArgoutArgumentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Command__ArgoutAssignment_212165);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getCommandAccess().getArgoutArgumentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__ArgoutAssignment_2


    // $ANTLR start rule__Command__DescriptionAssignment_3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6017:1: rule__Command__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Command__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6021:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6022:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6022:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6023:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__DescriptionAssignment_312196); 
             after(grammarAccess.getCommandAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__DescriptionAssignment_3


    // $ANTLR start rule__Command__AbstractAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6032:1: rule__Command__AbstractAssignment_4 : ( ruleBoolean ) ;
    public final void rule__Command__AbstractAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6036:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6037:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6037:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6038:1: ruleBoolean
            {
             before(grammarAccess.getCommandAccess().getAbstractBooleanParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Command__AbstractAssignment_412227);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getCommandAccess().getAbstractBooleanParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__AbstractAssignment_4


    // $ANTLR start rule__Command__ExecMethodAssignment_5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6047:1: rule__Command__ExecMethodAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Command__ExecMethodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6051:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6052:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6052:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6053:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getExecMethodSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__ExecMethodAssignment_512258); 
             after(grammarAccess.getCommandAccess().getExecMethodSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__ExecMethodAssignment_5


    // $ANTLR start rule__Command__DisplayLevelAssignment_6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6062:1: rule__Command__DisplayLevelAssignment_6 : ( ruleDisplayLevel ) ;
    public final void rule__Command__DisplayLevelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6066:1: ( ( ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6067:1: ( ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6067:1: ( ruleDisplayLevel )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6068:1: ruleDisplayLevel
            {
             before(grammarAccess.getCommandAccess().getDisplayLevelDisplayLevelParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_rule__Command__DisplayLevelAssignment_612289);
            ruleDisplayLevel();
            _fsp--;

             after(grammarAccess.getCommandAccess().getDisplayLevelDisplayLevelParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__DisplayLevelAssignment_6


    // $ANTLR start rule__Command__PolledPeriodAssignment_7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6077:1: rule__Command__PolledPeriodAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Command__PolledPeriodAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6081:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6082:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6082:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6083:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getPolledPeriodSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__PolledPeriodAssignment_712320); 
             after(grammarAccess.getCommandAccess().getPolledPeriodSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__PolledPeriodAssignment_7


    // $ANTLR start rule__Command__ExcludedStatesAssignment_9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6092:1: rule__Command__ExcludedStatesAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Command__ExcludedStatesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6096:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6097:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6097:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6098:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getExcludedStatesSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__ExcludedStatesAssignment_912351); 
             after(grammarAccess.getCommandAccess().getExcludedStatesSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Command__ExcludedStatesAssignment_9


    // $ANTLR start rule__Argument__TypeAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6107:1: rule__Argument__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Argument__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6111:1: ( ( ruleType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6112:1: ( ruleType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6112:1: ( ruleType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6113:1: ruleType
            {
             before(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Argument__TypeAssignment_012382);
            ruleType();
            _fsp--;

             after(grammarAccess.getArgumentAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__TypeAssignment_0


    // $ANTLR start rule__Argument__DescriptionAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6122:1: rule__Argument__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Argument__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6126:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6127:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6127:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6128:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_112413); 
             after(grammarAccess.getArgumentAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__DescriptionAssignment_1


    // $ANTLR start rule__Attribute__NameAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6137:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6141:1: ( ( RULE_ID ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6142:1: ( RULE_ID )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6142:1: ( RULE_ID )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6143:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_012444); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__NameAssignment_0


    // $ANTLR start rule__Attribute__AttTypeAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6152:1: rule__Attribute__AttTypeAssignment_1 : ( ruleAttrType ) ;
    public final void rule__Attribute__AttTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6156:1: ( ( ruleAttrType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6157:1: ( ruleAttrType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6157:1: ( ruleAttrType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6158:1: ruleAttrType
            {
             before(grammarAccess.getAttributeAccess().getAttTypeAttrTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttrType_in_rule__Attribute__AttTypeAssignment_112475);
            ruleAttrType();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getAttTypeAttrTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__AttTypeAssignment_1


    // $ANTLR start rule__Attribute__DataTypeAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6167:1: rule__Attribute__DataTypeAssignment_2 : ( ruleType ) ;
    public final void rule__Attribute__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6171:1: ( ( ruleType ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6172:1: ( ruleType )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6172:1: ( ruleType )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6173:1: ruleType
            {
             before(grammarAccess.getAttributeAccess().getDataTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Attribute__DataTypeAssignment_212506);
            ruleType();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getDataTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__DataTypeAssignment_2


    // $ANTLR start rule__Attribute__RwTtypeAssignment_3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6182:1: rule__Attribute__RwTtypeAssignment_3 : ( ruleRW_Type ) ;
    public final void rule__Attribute__RwTtypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6186:1: ( ( ruleRW_Type ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6187:1: ( ruleRW_Type )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6187:1: ( ruleRW_Type )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6188:1: ruleRW_Type
            {
             before(grammarAccess.getAttributeAccess().getRwTtypeRW_TypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRW_Type_in_rule__Attribute__RwTtypeAssignment_312537);
            ruleRW_Type();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getRwTtypeRW_TypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__RwTtypeAssignment_3


    // $ANTLR start rule__Attribute__DisplayLevelAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6197:1: rule__Attribute__DisplayLevelAssignment_4 : ( ruleDisplayLevel ) ;
    public final void rule__Attribute__DisplayLevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6201:1: ( ( ruleDisplayLevel ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6202:1: ( ruleDisplayLevel )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6202:1: ( ruleDisplayLevel )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6203:1: ruleDisplayLevel
            {
             before(grammarAccess.getAttributeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDisplayLevel_in_rule__Attribute__DisplayLevelAssignment_412568);
            ruleDisplayLevel();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getDisplayLevelDisplayLevelParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__DisplayLevelAssignment_4


    // $ANTLR start rule__Attribute__PolledPeriodAssignment_5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6212:1: rule__Attribute__PolledPeriodAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Attribute__PolledPeriodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6216:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6217:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6217:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6218:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getPolledPeriodSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__PolledPeriodAssignment_512599); 
             after(grammarAccess.getAttributeAccess().getPolledPeriodSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__PolledPeriodAssignment_5


    // $ANTLR start rule__Attribute__MaxXAssignment_6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6227:1: rule__Attribute__MaxXAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Attribute__MaxXAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6231:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6232:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6232:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6233:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getMaxXSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__MaxXAssignment_612630); 
             after(grammarAccess.getAttributeAccess().getMaxXSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__MaxXAssignment_6


    // $ANTLR start rule__Attribute__MaxYAssignment_7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6242:1: rule__Attribute__MaxYAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Attribute__MaxYAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6246:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6247:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6247:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6248:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getMaxYSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__MaxYAssignment_712661); 
             after(grammarAccess.getAttributeAccess().getMaxYSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__MaxYAssignment_7


    // $ANTLR start rule__Attribute__MemorizedAssignment_8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6257:1: rule__Attribute__MemorizedAssignment_8 : ( ruleBoolean ) ;
    public final void rule__Attribute__MemorizedAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6261:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6262:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6262:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6263:1: ruleBoolean
            {
             before(grammarAccess.getAttributeAccess().getMemorizedBooleanParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAssignment_812692);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getMemorizedBooleanParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__MemorizedAssignment_8


    // $ANTLR start rule__Attribute__MemorizedAtInitAssignment_9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6272:1: rule__Attribute__MemorizedAtInitAssignment_9 : ( ruleBoolean ) ;
    public final void rule__Attribute__MemorizedAtInitAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6276:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6277:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6277:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6278:1: ruleBoolean
            {
             before(grammarAccess.getAttributeAccess().getMemorizedAtInitBooleanParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAtInitAssignment_912723);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getMemorizedAtInitBooleanParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__MemorizedAtInitAssignment_9


    // $ANTLR start rule__Attribute__ChangeEventAssignment_10
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6287:1: rule__Attribute__ChangeEventAssignment_10 : ( ruleFireEvents ) ;
    public final void rule__Attribute__ChangeEventAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6291:1: ( ( ruleFireEvents ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6292:1: ( ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6292:1: ( ruleFireEvents )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6293:1: ruleFireEvents
            {
             before(grammarAccess.getAttributeAccess().getChangeEventFireEventsParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleFireEvents_in_rule__Attribute__ChangeEventAssignment_1012754);
            ruleFireEvents();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getChangeEventFireEventsParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__ChangeEventAssignment_10


    // $ANTLR start rule__Attribute__ArchiveEventAssignment_11
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6302:1: rule__Attribute__ArchiveEventAssignment_11 : ( ruleFireEvents ) ;
    public final void rule__Attribute__ArchiveEventAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6306:1: ( ( ruleFireEvents ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6307:1: ( ruleFireEvents )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6307:1: ( ruleFireEvents )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6308:1: ruleFireEvents
            {
             before(grammarAccess.getAttributeAccess().getArchiveEventFireEventsParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleFireEvents_in_rule__Attribute__ArchiveEventAssignment_1112785);
            ruleFireEvents();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getArchiveEventFireEventsParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__ArchiveEventAssignment_11


    // $ANTLR start rule__Attribute__PropertiesAssignment_12
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6317:1: rule__Attribute__PropertiesAssignment_12 : ( ruleAttrProperties ) ;
    public final void rule__Attribute__PropertiesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6321:1: ( ( ruleAttrProperties ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6322:1: ( ruleAttrProperties )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6322:1: ( ruleAttrProperties )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6323:1: ruleAttrProperties
            {
             before(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleAttrProperties_in_rule__Attribute__PropertiesAssignment_1212816);
            ruleAttrProperties();
            _fsp--;

             after(grammarAccess.getAttributeAccess().getPropertiesAttrPropertiesParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__PropertiesAssignment_12


    // $ANTLR start rule__Attribute__ExcludedStatesAssignment_14
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6332:1: rule__Attribute__ExcludedStatesAssignment_14 : ( RULE_STRING ) ;
    public final void rule__Attribute__ExcludedStatesAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6336:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6337:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6337:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6338:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getExcludedStatesSTRINGTerminalRuleCall_14_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ExcludedStatesAssignment_1412847); 
             after(grammarAccess.getAttributeAccess().getExcludedStatesSTRINGTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attribute__ExcludedStatesAssignment_14


    // $ANTLR start rule__FireEvents__FireAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6347:1: rule__FireEvents__FireAssignment_0 : ( ruleBoolean ) ;
    public final void rule__FireEvents__FireAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6351:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6352:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6352:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6353:1: ruleBoolean
            {
             before(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__FireEvents__FireAssignment_012878);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getFireEventsAccess().getFireBooleanParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FireEvents__FireAssignment_0


    // $ANTLR start rule__FireEvents__LibCheckCriteriaAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6362:1: rule__FireEvents__LibCheckCriteriaAssignment_1 : ( ruleBoolean ) ;
    public final void rule__FireEvents__LibCheckCriteriaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6366:1: ( ( ruleBoolean ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6367:1: ( ruleBoolean )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6367:1: ( ruleBoolean )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6368:1: ruleBoolean
            {
             before(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolean_in_rule__FireEvents__LibCheckCriteriaAssignment_112909);
            ruleBoolean();
            _fsp--;

             after(grammarAccess.getFireEventsAccess().getLibCheckCriteriaBooleanParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FireEvents__LibCheckCriteriaAssignment_1


    // $ANTLR start rule__AttrProperties__DescriptionAssignment_0
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6377:1: rule__AttrProperties__DescriptionAssignment_0 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6381:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6382:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6382:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6383:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DescriptionAssignment_012940); 
             after(grammarAccess.getAttrPropertiesAccess().getDescriptionSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__DescriptionAssignment_0


    // $ANTLR start rule__AttrProperties__LabelAssignment_1
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6392:1: rule__AttrProperties__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6396:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6397:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6397:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6398:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__LabelAssignment_112971); 
             after(grammarAccess.getAttrPropertiesAccess().getLabelSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__LabelAssignment_1


    // $ANTLR start rule__AttrProperties__UnitAssignment_2
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6407:1: rule__AttrProperties__UnitAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6411:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6412:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6412:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6413:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getUnitSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__UnitAssignment_213002); 
             after(grammarAccess.getAttrPropertiesAccess().getUnitSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__UnitAssignment_2


    // $ANTLR start rule__AttrProperties__StandardUnitAssignment_3
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6422:1: rule__AttrProperties__StandardUnitAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__StandardUnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6426:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6427:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6427:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6428:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getStandardUnitSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__StandardUnitAssignment_313033); 
             after(grammarAccess.getAttrPropertiesAccess().getStandardUnitSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__StandardUnitAssignment_3


    // $ANTLR start rule__AttrProperties__DisplayUnitAssignment_4
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6437:1: rule__AttrProperties__DisplayUnitAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DisplayUnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6441:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6442:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6442:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6443:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDisplayUnitSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DisplayUnitAssignment_413064); 
             after(grammarAccess.getAttrPropertiesAccess().getDisplayUnitSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__DisplayUnitAssignment_4


    // $ANTLR start rule__AttrProperties__FormatAssignment_5
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6452:1: rule__AttrProperties__FormatAssignment_5 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__FormatAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6456:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6457:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6457:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6458:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getFormatSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__FormatAssignment_513095); 
             after(grammarAccess.getAttrPropertiesAccess().getFormatSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__FormatAssignment_5


    // $ANTLR start rule__AttrProperties__MaxValueAssignment_6
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6467:1: rule__AttrProperties__MaxValueAssignment_6 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6471:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6472:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6472:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6473:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxValueSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxValueAssignment_613126); 
             after(grammarAccess.getAttrPropertiesAccess().getMaxValueSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__MaxValueAssignment_6


    // $ANTLR start rule__AttrProperties__MinValueAssignment_7
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6482:1: rule__AttrProperties__MinValueAssignment_7 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6486:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6487:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6487:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6488:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinValueSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinValueAssignment_713157); 
             after(grammarAccess.getAttrPropertiesAccess().getMinValueSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__MinValueAssignment_7


    // $ANTLR start rule__AttrProperties__MaxAlarmAssignment_8
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6497:1: rule__AttrProperties__MaxAlarmAssignment_8 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxAlarmAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6501:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6502:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6502:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6503:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxAlarmSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxAlarmAssignment_813188); 
             after(grammarAccess.getAttrPropertiesAccess().getMaxAlarmSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__MaxAlarmAssignment_8


    // $ANTLR start rule__AttrProperties__MinAlarmAssignment_9
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6512:1: rule__AttrProperties__MinAlarmAssignment_9 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinAlarmAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6516:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6517:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6517:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6518:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinAlarmSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinAlarmAssignment_913219); 
             after(grammarAccess.getAttrPropertiesAccess().getMinAlarmSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__MinAlarmAssignment_9


    // $ANTLR start rule__AttrProperties__MaxWarningAssignment_10
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6527:1: rule__AttrProperties__MaxWarningAssignment_10 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MaxWarningAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6531:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6532:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6532:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6533:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMaxWarningSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxWarningAssignment_1013250); 
             after(grammarAccess.getAttrPropertiesAccess().getMaxWarningSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__MaxWarningAssignment_10


    // $ANTLR start rule__AttrProperties__MinWarningAssignment_11
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6542:1: rule__AttrProperties__MinWarningAssignment_11 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__MinWarningAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6546:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6547:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6547:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6548:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getMinWarningSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__MinWarningAssignment_1113281); 
             after(grammarAccess.getAttrPropertiesAccess().getMinWarningSTRINGTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__MinWarningAssignment_11


    // $ANTLR start rule__AttrProperties__DeltaTimeAssignment_12
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6557:1: rule__AttrProperties__DeltaTimeAssignment_12 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DeltaTimeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6561:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6562:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6562:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6563:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaTimeSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaTimeAssignment_1213312); 
             after(grammarAccess.getAttrPropertiesAccess().getDeltaTimeSTRINGTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__DeltaTimeAssignment_12


    // $ANTLR start rule__AttrProperties__DeltaValueAssignment_13
    // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6572:1: rule__AttrProperties__DeltaValueAssignment_13 : ( RULE_STRING ) ;
    public final void rule__AttrProperties__DeltaValueAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6576:1: ( ( RULE_STRING ) )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6577:1: ( RULE_STRING )
            {
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6577:1: ( RULE_STRING )
            // ../fr.esrf.tango.pogo.ui/src-gen/fr/esrf/tango/pogo/contentassist/antlr/internal/InternalPogoDsl.g:6578:1: RULE_STRING
            {
             before(grammarAccess.getAttrPropertiesAccess().getDeltaValueSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaValueAssignment_1313343); 
             after(grammarAccess.getAttrPropertiesAccess().getDeltaValueSTRINGTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AttrProperties__DeltaValueAssignment_13


 

    public static final BitSet FOLLOW_rulePogoSystem_in_entryRulePogoSystem60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoSystem67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__Group__0_in_rulePogoSystem94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_entryRulePogoDeviceClass180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePogoDeviceClass187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__0_in_rulePogoDeviceClass214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Alternatives_in_ruleLanguage274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_entryRuleDisplayLevel300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayLevel307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayLevel__Alternatives_in_ruleDisplayLevel334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_entryRuleAttrType360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrType367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrType__Alternatives_in_ruleAttrType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_entryRuleRW_Type420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRW_Type427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RW_Type__Alternatives_in_ruleRW_Type454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_entryRuleClassDescription540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDescription547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__0_in_ruleClassDescription574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group__0_in_ruleInheritance634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_entryRuleClassIdentification660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassIdentification667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__0_in_ruleClassIdentification694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComments_in_entryRuleComments720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComments727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comments__CommandsTableAssignment_in_ruleComments754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropType_in_entryRulePropType900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropType907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropType__Alternatives_in_rulePropType934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_entryRuleVectorType1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorType1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VectorType__Alternatives_in_ruleVectorType1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0_in_ruleCommand1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_entryRuleFireEvents1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFireEvents1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FireEvents__Group__0_in_ruleFireEvents1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_entryRuleAttrProperties1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrProperties1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__0_in_ruleAttrProperties1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_entryRuleVoidType1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVoidType1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VoidType__Group__0_in_ruleVoidType1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_entryRuleShortType1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortType1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortType__Group__0_in_ruleShortType1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_entryRuleUShortType1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortType1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortType__Group__0_in_ruleUShortType1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0_in_ruleIntType1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_entryRuleUIntType1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntType1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntType__Group__0_in_ruleUIntType1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType1800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__0_in_ruleFloatType1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__Group__0_in_ruleDoubleType1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0_in_ruleStringType1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_entryRuleCharArrayType1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharArrayType1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharArrayType__Group__0_in_ruleCharArrayType2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_entryRuleShortArrayType2040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortArrayType2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortArrayType__Group__0_in_ruleShortArrayType2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_entryRuleUShortArrayType2100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUShortArrayType2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortArrayType__Group__0_in_ruleUShortArrayType2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_entryRuleIntArrayType2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntArrayType2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntArrayType__Group__0_in_ruleIntArrayType2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_entryRuleUIntArrayType2220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIntArrayType2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntArrayType__Group__0_in_ruleUIntArrayType2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_entryRuleFloatArrayType2280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatArrayType2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatArrayType__Group__0_in_ruleFloatArrayType2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_entryRuleDoubleArrayType2340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleArrayType2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayType__Group__0_in_ruleDoubleArrayType2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_entryRuleStringArrayType2400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringArrayType2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayType__Group__0_in_ruleStringArrayType2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_entryRuleLongStringArrayType2460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongStringArrayType2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongStringArrayType__Group__0_in_ruleLongStringArrayType2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_entryRuleDoubleStringArrayType2520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleStringArrayType2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleStringArrayType__Group__0_in_ruleDoubleStringArrayType2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_entryRuleStateType2580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateType2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Group__0_in_ruleStateType2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_entryRuleConstStringType2640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstStringType2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstStringType__Group__0_in_ruleConstStringType2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_entryRuleBooleanArrayType2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanArrayType2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayType__Group__0_in_ruleBooleanArrayType2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_entryRuleUCharType2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUCharType2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UCharType__Group__0_in_ruleUCharType2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_entryRuleLongType2820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongType2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__Group__0_in_ruleLongType2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_entryRuleULongType2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongType2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongType__Group__0_in_ruleULongType2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_entryRuleLongArrayType2940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongArrayType2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayType__Group__0_in_ruleLongArrayType2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_entryRuleULongArrayType3000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleULongArrayType3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongArrayType__Group__0_in_ruleULongArrayType3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_entryRuleDevIntType3060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDevIntType3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DevIntType__Group__0_in_ruleDevIntType3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_entryRuleEncodedType3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEncodedType3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodedType__Group__0_in_ruleEncodedType3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_entryRuleShortVectorType3180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShortVectorType3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortVectorType__Group__0_in_ruleShortVectorType3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_entryRuleIntVectorType3240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntVectorType3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntVectorType__Group__0_in_ruleIntVectorType3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_entryRuleFloatVectorType3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatVectorType3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatVectorType__Group__0_in_ruleFloatVectorType3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_entryRuleDoubleVectorType3360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleVectorType3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleVectorType__Group__0_in_ruleDoubleVectorType3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_entryRuleStringVectorType3420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVectorType3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVectorType__Group__0_in_ruleStringVectorType3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Language__Alternatives3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Language__Alternatives3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Language__Alternatives3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DisplayLevel__Alternatives3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DisplayLevel__Alternatives3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AttrType__Alternatives3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AttrType__Alternatives3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AttrType__Alternatives3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RW_Type__Alternatives3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RW_Type__Alternatives3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RW_Type__Alternatives3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RW_Type__Alternatives3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Boolean__Alternatives3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Boolean__Alternatives3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_rule__PropType__Alternatives3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorType_in_rule__PropType__Alternatives3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__SimpleType__Alternatives3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_rule__SimpleType__Alternatives3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_rule__SimpleType__Alternatives3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__SimpleType__Alternatives3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_rule__SimpleType__Alternatives3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__SimpleType__Alternatives3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__SimpleType__Alternatives3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__SimpleType__Alternatives4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortVectorType_in_rule__VectorType__Alternatives4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVectorType_in_rule__VectorType__Alternatives4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatVectorType_in_rule__VectorType__Alternatives4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleVectorType_in_rule__VectorType__Alternatives4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVectorType_in_rule__VectorType__Alternatives4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVoidType_in_rule__Type__Alternatives4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__Type__Alternatives4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortType_in_rule__Type__Alternatives4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortType_in_rule__Type__Alternatives4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__Type__Alternatives4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntType_in_rule__Type__Alternatives4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rule__Type__Alternatives4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleType_in_rule__Type__Alternatives4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__Type__Alternatives4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharArrayType_in_rule__Type__Alternatives4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShortArrayType_in_rule__Type__Alternatives4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUShortArrayType_in_rule__Type__Alternatives4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntArrayType_in_rule__Type__Alternatives4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIntArrayType_in_rule__Type__Alternatives4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatArrayType_in_rule__Type__Alternatives4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleArrayType_in_rule__Type__Alternatives4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringArrayType_in_rule__Type__Alternatives4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongStringArrayType_in_rule__Type__Alternatives4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleStringArrayType_in_rule__Type__Alternatives4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__Type__Alternatives4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstStringType_in_rule__Type__Alternatives4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanArrayType_in_rule__Type__Alternatives4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongType_in_rule__Type__Alternatives4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongType_in_rule__Type__Alternatives4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCharType_in_rule__Type__Alternatives4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongArrayType_in_rule__Type__Alternatives4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleULongArrayType_in_rule__Type__Alternatives4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDevIntType_in_rule__Type__Alternatives4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEncodedType_in_rule__Type__Alternatives4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__ImportsAssignment_0_in_rule__PogoSystem__Group__04655 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__Group__1_in_rule__PogoSystem__Group__04665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoSystem__ClassesAssignment_1_in_rule__PogoSystem__Group__14693 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__04733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__14771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PogoDeviceClass__Group__04810 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__1_in_rule__PogoDeviceClass__Group__04820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__NameAssignment_1_in_rule__PogoDeviceClass__Group__14848 = new BitSet(new long[]{0x0000000808000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__2_in_rule__PogoDeviceClass__Group__14857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__IsAbstractAssignment_2_in_rule__PogoDeviceClass__Group__24885 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__3_in_rule__PogoDeviceClass__Group__24895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group_3__0_in_rule__PogoDeviceClass__Group__34923 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__4_in_rule__PogoDeviceClass__Group__34933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PogoDeviceClass__Group__44962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__5_in_rule__PogoDeviceClass__Group__44972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__InstituteAssignment_5_in_rule__PogoDeviceClass__Group__55000 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__6_in_rule__PogoDeviceClass__Group__55009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PogoDeviceClass__Group__65038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__7_in_rule__PogoDeviceClass__Group__65048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__DescriptionAssignment_7_in_rule__PogoDeviceClass__Group__75076 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__8_in_rule__PogoDeviceClass__Group__75085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PogoDeviceClass__Group__85114 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__9_in_rule__PogoDeviceClass__Group__85124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__ClassPropertiesAssignment_9_in_rule__PogoDeviceClass__Group__95152 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__10_in_rule__PogoDeviceClass__Group__95162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PogoDeviceClass__Group__105191 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__11_in_rule__PogoDeviceClass__Group__105201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__DevicePropertiesAssignment_11_in_rule__PogoDeviceClass__Group__115229 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__12_in_rule__PogoDeviceClass__Group__115239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PogoDeviceClass__Group__125268 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__13_in_rule__PogoDeviceClass__Group__125278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__CommandsAssignment_13_in_rule__PogoDeviceClass__Group__135306 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__14_in_rule__PogoDeviceClass__Group__135316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PogoDeviceClass__Group__145345 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__15_in_rule__PogoDeviceClass__Group__145355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__AttributesAssignment_15_in_rule__PogoDeviceClass__Group__155383 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__16_in_rule__PogoDeviceClass__Group__155393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PogoDeviceClass__Group__165422 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__17_in_rule__PogoDeviceClass__Group__165432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__StatesAssignment_17_in_rule__PogoDeviceClass__Group__175460 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group__18_in_rule__PogoDeviceClass__Group__175470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PogoDeviceClass__Group__185499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PogoDeviceClass__Group_3__05573 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__Group_3__1_in_rule__PogoDeviceClass__Group_3__05583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PogoDeviceClass__BaseClassAssignment_3_1_in_rule__PogoDeviceClass__Group_3__15611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__DescriptionAssignment_0_in_rule__ClassDescription__Group__05649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__1_in_rule__ClassDescription__Group__05658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__TitleAssignment_1_in_rule__ClassDescription__Group__15686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__2_in_rule__ClassDescription__Group__15695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__SourcePathAssignment_2_in_rule__ClassDescription__Group__25723 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__3_in_rule__ClassDescription__Group__25732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ClassDescription__Group__35761 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__4_in_rule__ClassDescription__Group__35771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__InheritancesAssignment_4_in_rule__ClassDescription__Group__45799 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__5_in_rule__ClassDescription__Group__45809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__LanguageAssignment_5_in_rule__ClassDescription__Group__55837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__6_in_rule__ClassDescription__Group__55846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__FilestogenerateAssignment_6_in_rule__ClassDescription__Group__65874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__7_in_rule__ClassDescription__Group__65883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__IdentificationAssignment_7_in_rule__ClassDescription__Group__75911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassDescription__Group__8_in_rule__ClassDescription__Group__75920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassDescription__CommentsAssignment_8_in_rule__ClassDescription__Group__85948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__ClassnameAssignment_0_in_rule__Inheritance__Group__06000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Inheritance__Group__1_in_rule__Inheritance__Group__06009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__SourcePathAssignment_1_in_rule__Inheritance__Group__16037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ContactAssignment_0_in_rule__ClassIdentification__Group__06075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__1_in_rule__ClassIdentification__Group__06084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ClassFamilyAssignment_1_in_rule__ClassIdentification__Group__16112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__2_in_rule__ClassIdentification__Group__16121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__SiteSpecificAssignment_2_in_rule__ClassIdentification__Group__26149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__3_in_rule__ClassIdentification__Group__26158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__PlatformAssignment_3_in_rule__ClassIdentification__Group__36186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__4_in_rule__ClassIdentification__Group__36195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__BusAssignment_4_in_rule__ClassIdentification__Group__46223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__5_in_rule__ClassIdentification__Group__46232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ManufacturerAssignment_5_in_rule__ClassIdentification__Group__56260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassIdentification__Group__6_in_rule__ClassIdentification__Group__56269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassIdentification__ReferenceAssignment_6_in_rule__ClassIdentification__Group__66297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__06345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__06354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__DescriptionAssignment_1_in_rule__State__Group__16382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_0_in_rule__Property__Group__06420 = new BitSet(new long[]{0x0000FF0000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_1_in_rule__Property__Group__16457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DescriptionAssignment_2_in_rule__Property__Group__26494 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__26503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Property__Group__36532 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__36542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DefaultPropValueAssignment_4_in_rule__Property__Group__46570 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Command__NameAssignment_0_in_rule__Command__Group__06615 = new BitSet(new long[]{0xFFFFFF8000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_rule__Command__Group__1_in_rule__Command__Group__06624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ArginAssignment_1_in_rule__Command__Group__16652 = new BitSet(new long[]{0xFFFFFF8000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_rule__Command__Group__2_in_rule__Command__Group__16661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ArgoutAssignment_2_in_rule__Command__Group__26689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__3_in_rule__Command__Group__26698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__DescriptionAssignment_3_in_rule__Command__Group__36726 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Command__Group__4_in_rule__Command__Group__36735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__AbstractAssignment_4_in_rule__Command__Group__46763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__5_in_rule__Command__Group__46772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExecMethodAssignment_5_in_rule__Command__Group__56800 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Command__Group__6_in_rule__Command__Group__56809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__DisplayLevelAssignment_6_in_rule__Command__Group__66837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group__7_in_rule__Command__Group__66846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__PolledPeriodAssignment_7_in_rule__Command__Group__76874 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Command__Group__8_in_rule__Command__Group__76883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Command__Group__86912 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Command__Group__9_in_rule__Command__Group__86922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExcludedStatesAssignment_9_in_rule__Command__Group__96950 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Argument__TypeAssignment_0_in_rule__Argument__Group__07005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__07014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__DescriptionAssignment_1_in_rule__Argument__Group__17042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__07080 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttTypeAssignment_1_in_rule__Attribute__Group__17117 = new BitSet(new long[]{0xFFFFFF8000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__17126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DataTypeAssignment_2_in_rule__Attribute__Group__27154 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__27163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__RwTtypeAssignment_3_in_rule__Attribute__Group__37191 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__37200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DisplayLevelAssignment_4_in_rule__Attribute__Group__47228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__47237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__PolledPeriodAssignment_5_in_rule__Attribute__Group__57265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__57274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MaxXAssignment_6_in_rule__Attribute__Group__67302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__7_in_rule__Attribute__Group__67311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MaxYAssignment_7_in_rule__Attribute__Group__77339 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__8_in_rule__Attribute__Group__77348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MemorizedAssignment_8_in_rule__Attribute__Group__87376 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__9_in_rule__Attribute__Group__87385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MemorizedAtInitAssignment_9_in_rule__Attribute__Group__97413 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__10_in_rule__Attribute__Group__97422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ChangeEventAssignment_10_in_rule__Attribute__Group__107450 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__11_in_rule__Attribute__Group__107459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ArchiveEventAssignment_11_in_rule__Attribute__Group__117487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__12_in_rule__Attribute__Group__117496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__PropertiesAssignment_12_in_rule__Attribute__Group__127524 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__13_in_rule__Attribute__Group__127533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Attribute__Group__137562 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Attribute__Group__14_in_rule__Attribute__Group__137572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ExcludedStatesAssignment_14_in_rule__Attribute__Group__147600 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__FireEvents__FireAssignment_0_in_rule__FireEvents__Group__07665 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__FireEvents__Group__1_in_rule__FireEvents__Group__07674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FireEvents__LibCheckCriteriaAssignment_1_in_rule__FireEvents__Group__17702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DescriptionAssignment_0_in_rule__AttrProperties__Group__07740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__1_in_rule__AttrProperties__Group__07749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__LabelAssignment_1_in_rule__AttrProperties__Group__17777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__2_in_rule__AttrProperties__Group__17786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__UnitAssignment_2_in_rule__AttrProperties__Group__27814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__3_in_rule__AttrProperties__Group__27823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__StandardUnitAssignment_3_in_rule__AttrProperties__Group__37851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__4_in_rule__AttrProperties__Group__37860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DisplayUnitAssignment_4_in_rule__AttrProperties__Group__47888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__5_in_rule__AttrProperties__Group__47897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__FormatAssignment_5_in_rule__AttrProperties__Group__57925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__6_in_rule__AttrProperties__Group__57934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxValueAssignment_6_in_rule__AttrProperties__Group__67962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__7_in_rule__AttrProperties__Group__67971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinValueAssignment_7_in_rule__AttrProperties__Group__77999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__8_in_rule__AttrProperties__Group__78008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxAlarmAssignment_8_in_rule__AttrProperties__Group__88036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__9_in_rule__AttrProperties__Group__88045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinAlarmAssignment_9_in_rule__AttrProperties__Group__98073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__10_in_rule__AttrProperties__Group__98082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MaxWarningAssignment_10_in_rule__AttrProperties__Group__108110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__11_in_rule__AttrProperties__Group__108119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__MinWarningAssignment_11_in_rule__AttrProperties__Group__118147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__12_in_rule__AttrProperties__Group__118156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DeltaTimeAssignment_12_in_rule__AttrProperties__Group__128184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrProperties__Group__13_in_rule__AttrProperties__Group__128193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrProperties__DeltaValueAssignment_13_in_rule__AttrProperties__Group__138221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VoidType__Group__1_in_rule__VoidType__Group__08293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VoidType__Group__18322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__08371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__BooleanType__Group__18400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortType__Group__1_in_rule__ShortType__Group__08449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ShortType__Group__18478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortType__Group__1_in_rule__UShortType__Group__08527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__UShortType__Group__18556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__08605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__IntType__Group__18634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntType__Group__1_in_rule__UIntType__Group__08683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__UIntType__Group__18712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatType__Group__1_in_rule__FloatType__Group__08761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FloatType__Group__18790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleType__Group__1_in_rule__DoubleType__Group__08839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DoubleType__Group__18868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__08917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__StringType__Group__18946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharArrayType__Group__1_in_rule__CharArrayType__Group__08995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__CharArrayType__Group__19024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortArrayType__Group__1_in_rule__ShortArrayType__Group__09073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ShortArrayType__Group__19102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UShortArrayType__Group__1_in_rule__UShortArrayType__Group__09151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__UShortArrayType__Group__19180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntArrayType__Group__1_in_rule__IntArrayType__Group__09229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__IntArrayType__Group__19258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIntArrayType__Group__1_in_rule__UIntArrayType__Group__09307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__UIntArrayType__Group__19336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatArrayType__Group__1_in_rule__FloatArrayType__Group__09385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__FloatArrayType__Group__19414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleArrayType__Group__1_in_rule__DoubleArrayType__Group__09463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DoubleArrayType__Group__19492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringArrayType__Group__1_in_rule__StringArrayType__Group__09541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__StringArrayType__Group__19570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongStringArrayType__Group__1_in_rule__LongStringArrayType__Group__09619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__LongStringArrayType__Group__19648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleStringArrayType__Group__1_in_rule__DoubleStringArrayType__Group__09697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__DoubleStringArrayType__Group__19726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Group__1_in_rule__StateType__Group__09775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__StateType__Group__19804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstStringType__Group__1_in_rule__ConstStringType__Group__09853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ConstStringType__Group__19882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanArrayType__Group__1_in_rule__BooleanArrayType__Group__09931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__BooleanArrayType__Group__19960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UCharType__Group__1_in_rule__UCharType__Group__010009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__UCharType__Group__110038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongType__Group__1_in_rule__LongType__Group__010087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__LongType__Group__110116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongType__Group__1_in_rule__ULongType__Group__010165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__ULongType__Group__110194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongArrayType__Group__1_in_rule__LongArrayType__Group__010243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__LongArrayType__Group__110272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ULongArrayType__Group__1_in_rule__ULongArrayType__Group__010321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__ULongArrayType__Group__110350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DevIntType__Group__1_in_rule__DevIntType__Group__010399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__DevIntType__Group__110428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EncodedType__Group__1_in_rule__EncodedType__Group__010477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__EncodedType__Group__110506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ShortVectorType__Group__1_in_rule__ShortVectorType__Group__010555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__ShortVectorType__Group__110584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntVectorType__Group__1_in_rule__IntVectorType__Group__010633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__IntVectorType__Group__110662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatVectorType__Group__1_in_rule__FloatVectorType__Group__010711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__FloatVectorType__Group__110740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleVectorType__Group__1_in_rule__DoubleVectorType__Group__010789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__DoubleVectorType__Group__110818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVectorType__Group__1_in_rule__StringVectorType__Group__010867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__StringVectorType__Group__110896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__PogoSystem__ImportsAssignment_010935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePogoDeviceClass_in_rule__PogoSystem__ClassesAssignment_110966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_110997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__NameAssignment_111028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__PogoDeviceClass__IsAbstractAssignment_211064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__BaseClassAssignment_3_111107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PogoDeviceClass__InstituteAssignment_511142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDescription_in_rule__PogoDeviceClass__DescriptionAssignment_711173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PogoDeviceClass__ClassPropertiesAssignment_911204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PogoDeviceClass__DevicePropertiesAssignment_1111235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__PogoDeviceClass__CommandsAssignment_1311266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__PogoDeviceClass__AttributesAssignment_1511297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__PogoDeviceClass__StatesAssignment_1711328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__DescriptionAssignment_011359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__TitleAssignment_111390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__SourcePathAssignment_211421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_rule__ClassDescription__InheritancesAssignment_411452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_rule__ClassDescription__LanguageAssignment_511483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassDescription__FilestogenerateAssignment_611514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassIdentification_in_rule__ClassDescription__IdentificationAssignment_711545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComments_in_rule__ClassDescription__CommentsAssignment_811576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Inheritance__ClassnameAssignment_011607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Inheritance__SourcePathAssignment_111638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ContactAssignment_011669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ClassFamilyAssignment_111700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__SiteSpecificAssignment_211731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__PlatformAssignment_311762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__BusAssignment_411793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ManufacturerAssignment_511824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClassIdentification__ReferenceAssignment_611855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Comments__CommandsTableAssignment11886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_011917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__DescriptionAssignment_111948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_011979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropType_in_rule__Property__TypeAssignment_112010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__DescriptionAssignment_212041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Property__DefaultPropValueAssignment_412072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Command__NameAssignment_012103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Command__ArginAssignment_112134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Command__ArgoutAssignment_212165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__DescriptionAssignment_312196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Command__AbstractAssignment_412227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__ExecMethodAssignment_512258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_rule__Command__DisplayLevelAssignment_612289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__PolledPeriodAssignment_712320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__ExcludedStatesAssignment_912351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Argument__TypeAssignment_012382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__DescriptionAssignment_112413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_012444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrType_in_rule__Attribute__AttTypeAssignment_112475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Attribute__DataTypeAssignment_212506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRW_Type_in_rule__Attribute__RwTtypeAssignment_312537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayLevel_in_rule__Attribute__DisplayLevelAssignment_412568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__PolledPeriodAssignment_512599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__MaxXAssignment_612630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__MaxYAssignment_712661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAssignment_812692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Attribute__MemorizedAtInitAssignment_912723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_rule__Attribute__ChangeEventAssignment_1012754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFireEvents_in_rule__Attribute__ArchiveEventAssignment_1112785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrProperties_in_rule__Attribute__PropertiesAssignment_1212816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ExcludedStatesAssignment_1412847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__FireEvents__FireAssignment_012878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__FireEvents__LibCheckCriteriaAssignment_112909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DescriptionAssignment_012940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__LabelAssignment_112971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__UnitAssignment_213002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__StandardUnitAssignment_313033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DisplayUnitAssignment_413064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__FormatAssignment_513095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxValueAssignment_613126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinValueAssignment_713157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxAlarmAssignment_813188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinAlarmAssignment_913219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MaxWarningAssignment_1013250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__MinWarningAssignment_1113281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaTimeAssignment_1213312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttrProperties__DeltaValueAssignment_1313343 = new BitSet(new long[]{0x0000000000000002L});

}